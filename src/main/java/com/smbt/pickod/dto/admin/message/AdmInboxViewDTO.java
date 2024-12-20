package com.smbt.pickod.dto.admin.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString @NoArgsConstructor
public class AdmInboxViewDTO {
    private Long msgId;
    private Long memberNum;
    private String memberNickname;
    private String msgContent;
    private String msgBox;
    private Long msgSender;
    private Long msgRecipient;
}
