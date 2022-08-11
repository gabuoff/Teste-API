package com.rest.hotel.service.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.hotel.domain.Hotel;

@Service
public class ResponseService {
	@Autowired
    private RestTemplate restTemplate;

    @Value("${urlAvail}")
    private String urlAvail;

    @Value("${urlHotel}")
    private String urlHotel;

    public List<Hotel> tripAvails(Integer codeCity) {
        
        final String uri = urlAvail.concat(codeCity.toString());
        ResponseEntity<ArrayList<Hotel>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
                        new ParameterizedTypeReference<ArrayList<Hotel>>() {});

        return responseEntity.getBody();

    }

    public Hotel avgHotelDetails(Integer hotelId) {
        final String uri = urlHotel.concat(hotelId.toString());
        ResponseEntity<ArrayList<Hotel>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
                        new ParameterizedTypeReference<ArrayList<Hotel>>() {});

        return responseEntity.getBody().get(0);
    }


}