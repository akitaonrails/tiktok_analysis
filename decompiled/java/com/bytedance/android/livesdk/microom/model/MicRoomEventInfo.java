package com.bytedance.android.livesdk.microom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MicRoomEventInfo implements Serializable {

    @C09CT("avatar_list")
    public List<? extends ImageModel> avatarList;

    @C09CT("event_name")
    public String eventName;

    @C09CT("show_list_url")
    public String showListUrl;

    public MicRoomEventInfo() {
        this("", "", null);
    }

    public final void setAvatarList(List<? extends ImageModel> list) {
        this.avatarList = list;
    }

    public final void setEventName(String str) {
        this.eventName = str;
    }

    public final void setShowListUrl(String str) {
        this.showListUrl = str;
    }

    public MicRoomEventInfo(String str, String str2, List<? extends ImageModel> list) {
        this.showListUrl = str;
        this.eventName = str2;
        this.avatarList = list;
    }
}
