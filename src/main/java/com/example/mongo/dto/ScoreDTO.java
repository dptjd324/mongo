package com.example.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//document와 매피오딜객체를 정의 - 도메인클래스
@Document(collection = "score")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO {
    @Id
    String _id;
    String id;
    String name;
    String dept;
    String addr;
    int java;
    int servlet;
}
