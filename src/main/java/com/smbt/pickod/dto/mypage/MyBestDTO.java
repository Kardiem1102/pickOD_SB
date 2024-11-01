package com.smbt.pickod.dto.mypage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@ToString
public class MyBestDTO {
    private Long memberNum;
    private String jnlTitle;
    private Long cmtId;
    private Long pickId;
    private Long jnlNum;
    private Long cmtPostId;
    private String cmtPostType;
    private Long jnlViews;
}