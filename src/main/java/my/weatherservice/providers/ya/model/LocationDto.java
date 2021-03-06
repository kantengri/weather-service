/*
 * Copyright (c) 2002-2022 meteo@m4j.ru
 */
package my.weatherservice.providers.ya.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer geonameId;
    private String geoname;
    private Double lat;
    private Double lon;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
