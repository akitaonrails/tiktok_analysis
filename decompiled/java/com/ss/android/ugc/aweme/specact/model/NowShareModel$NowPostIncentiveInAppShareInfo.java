package com.ss.android.ugc.aweme.specact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class NowShareModel$NowPostIncentiveInAppShareInfo {

    @C09CT("card_desc")
    public final NowShareModel$TextItem cardDesc;

    @C09CT("card_title")
    public final NowShareModel$TextItem cardTitle;

    @C09CT("image")
    public final String image;

    @C09CT("link")
    public final String link;

    @C09CT("link_type")
    public final Integer linkType;

    @C09CT("send_message_scene")
    public final Integer messageScene;

    @C09CT("quote_text")
    public final NowShareModel$TextItem quotoText;

    @C09CT("receiver_text")
    public final NowShareModel$TextItem receiverText;

    @C09CT("send_scene")
    public final String sendScene;

    @C09CT("sender_text")
    public final NowShareModel$TextItem senderText;

    public NowShareModel$NowPostIncentiveInAppShareInfo(Integer num, String str, String str2, Integer num2, String str3, NowShareModel$TextItem nowShareModel$TextItem, NowShareModel$TextItem nowShareModel$TextItem2, NowShareModel$TextItem nowShareModel$TextItem3, NowShareModel$TextItem nowShareModel$TextItem4, NowShareModel$TextItem nowShareModel$TextItem5) {
        this.messageScene = num;
        this.sendScene = str;
        this.link = str2;
        this.linkType = num2;
        this.image = str3;
        this.cardTitle = nowShareModel$TextItem;
        this.cardDesc = nowShareModel$TextItem2;
        this.senderText = nowShareModel$TextItem3;
        this.receiverText = nowShareModel$TextItem4;
        this.quotoText = nowShareModel$TextItem5;
    }
}
