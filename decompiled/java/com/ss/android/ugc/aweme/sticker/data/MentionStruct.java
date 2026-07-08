package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.EnumC19597511lt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class MentionStruct implements Serializable {

    @C09CT("user_avatar_url")
    public UrlModel avatarUrl;

    @C09CT("nickname")
    public String nickname;

    @C09CT("scenario")
    public int scenario;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_name")
    public String username;

    public MentionStruct() {
        this.userId = "";
        this.secUid = "";
        this.username = "";
        this.nickname = "";
        this.scenario = EnumC19597511lt.STICKER.getValue();
    }

    public UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getScenario() {
        return this.scenario;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public MentionStruct(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.userId = "";
        this.secUid = "";
        this.username = "";
        this.nickname = "";
        this.scenario = EnumC19597511lt.STICKER.getValue();
        this.userId = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarUrl = urlModel;
    }
}
