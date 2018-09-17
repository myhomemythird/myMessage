package org.richardliao.mq.domain;

import java.io.Serializable;
import java.util.Date;

public class Spittle implements Serializable {
    private static final long serialVersionUID = 1L;
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(Long id, String message, Date time) {
	this(id, message, time, null, null);
    }

    public Spittle(Long id, String message, Date time, Double longitude, Double latitude) {
	this.id = id;
	this.message = message;
	this.time = time;
	this.longitude = longitude;
	this.latitude = latitude;
    }

    public long getId() {
	return this.id;
    }

    public String getMessage() {
	return this.message;
    }

    public Date getTime() {
	return this.time;
    }
    
    public Double getLongitude() {
	return this.longitude;
    }

    public Double getLatitude() {
	return this.latitude;
    }
}
