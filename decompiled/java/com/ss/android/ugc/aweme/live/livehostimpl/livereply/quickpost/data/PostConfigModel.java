package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class PostConfigModel implements Serializable {
    public static final int $stable = 8;
    public final String backSchema;
    public EditParams ediParams;
    public final boolean forceDarkMode;
    public final String fragmentId;
    public final String milestoneId;
    public final Integer postByScene;
    public Integer privacyStatue;
    public final String publishImage;
    public String publishImageByteArrayContent;
    public final PublishParams publishParams;
    public Map<String, String> reportParams;
    public String roomId;
    public final boolean showBackPress;
    public final String successToastStr;
    public String userIdentity;

    public final void setEdiParams(EditParams editParams) {
        this.ediParams = editParams;
    }

    public final void setPrivacyStatue(Integer num) {
        this.privacyStatue = num;
    }

    public final void setPublishImageByteArrayContent(String str) {
        this.publishImageByteArrayContent = str;
    }

    public final void setReportParams(Map<String, String> map) {
        this.reportParams = map;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setUserIdentity(String str) {
        this.userIdentity = str;
    }

    public PostConfigModel(String str, String str2, PublishParams publishParams, Integer num, Map<String, String> map, String str3, String str4, EditParams editParams, String str5, String str6, String str7, Integer num2, String str8, boolean z, boolean z2) {
        this.fragmentId = str;
        this.publishImage = str2;
        this.publishParams = publishParams;
        this.privacyStatue = num;
        this.reportParams = map;
        this.userIdentity = str3;
        this.roomId = str4;
        this.ediParams = editParams;
        this.backSchema = str5;
        this.milestoneId = str6;
        this.publishImageByteArrayContent = str7;
        this.postByScene = num2;
        this.successToastStr = str8;
        this.forceDarkMode = z;
        this.showBackPress = z2;
    }
}
