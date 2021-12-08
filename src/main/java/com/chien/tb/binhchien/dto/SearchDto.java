package com.chien.tb.binhchien.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchDto {

    private String text;
    private Date fromDate;
    private Date toDate;
    private Date startDate;
    private Date endDate;
    private Date type;
    private int pageIndex;
    private int pageSize;
    private String searchText;
    private Integer month;
    private Integer year;
    private String keyword;
}
