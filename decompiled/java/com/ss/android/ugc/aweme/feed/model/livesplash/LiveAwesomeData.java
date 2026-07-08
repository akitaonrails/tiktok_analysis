package com.ss.android.ugc.aweme.feed.model.livesplash;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveAwesomeData {

    @C09CT("gbc")
    public String gbc;

    @C09CT("psm_pi")
    public List<LiveShowMessage> psmPi;

    @C09CT("data")
    @C09CS(JsonToStringAdapter.class)
    public String roomData;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("uid")
    public long uid;

    @C09CT("use_room_info")
    public boolean useRoomInfo = true;

    @C09CT("hidden_psm_pi")
    public boolean hideView = true;

    public final String getGbc() {
        return this.gbc;
    }

    public final boolean getHideView() {
        return this.hideView;
    }

    public final List<LiveShowMessage> getPsmPi() {
        return this.psmPi;
    }

    public final String getRoomData() {
        return this.roomData;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final boolean getUseRoomInfo() {
        return this.useRoomInfo;
    }

    public final void setGbc(String str) {
        this.gbc = str;
    }

    public final void setHideView(boolean z) {
        this.hideView = z;
    }

    public final void setPsmPi(List<LiveShowMessage> list) {
        this.psmPi = list;
    }

    public final void setRoomData(String str) {
        this.roomData = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setUseRoomInfo(boolean z) {
        this.useRoomInfo = z;
    }
}
