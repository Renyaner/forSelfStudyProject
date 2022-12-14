package com.example.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CnnvdEntryDto {

    private String name;

    private String vulnId;

    private Date published;

    private Date modified;

    private String source;

    private String serverity;

    private String vulnType;

    private String vulnDescript;

    private OtherIdDto otherIdDto;

    private String vulnSolution;

}
