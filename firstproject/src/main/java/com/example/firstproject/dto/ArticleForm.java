
//얘는 사용자가 입력한 데이터를 DB로 전달할때 주로 쓰는 클래스(update, create 등 DB에 데이터가 전달되어 저장되어야 할 때 쓰음)
package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private  Long id;
    private String title;
    private String content;


    public Article toEntity() {

        return new Article(id, title, content);
    }
}
