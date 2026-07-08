package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileInfo implements Serializable {

    @C09CT("avatar")
    public Avatar avatar;

    @C09CT("bold_fields")
    public List<String> boldFields;

    @C09CT("nickname")
    public String nickname;

    @C09CT("profile_reverse_exp_group")
    public Integer profileReverseExpGroup;

    @C09CT("register_time")
    public Long registerTime;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("uid")
    public String uid;

    @C09CT("username")
    public String username;

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final List<String> getBoldFields() {
        return this.boldFields;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Integer getProfileReverseExpGroup() {
        return this.profileReverseExpGroup;
    }

    public final Long getRegisterTime() {
        return this.registerTime;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public final void setBoldFields(List<String> list) {
        this.boldFields = list;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setProfileReverseExpGroup(Integer num) {
        this.profileReverseExpGroup = num;
    }

    public final void setRegisterTime(Long l) {
        this.registerTime = l;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }
}
