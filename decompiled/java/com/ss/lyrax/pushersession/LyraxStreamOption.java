package com.ss.lyrax.pushersession;

import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxStreamOption {
    public ILyraxPusherSessionListener listener;
    public List<String> urls;
    public String userId = "";
    public String streamId = "";
    public String ip = "";
    public String displayName = "";
    public String userRegion = "";
    public String carrierRegion = "";
    public String idcName = "";
    public String streamOrientation = "";
    public String liveAuthString = "";
    public String mccMnc = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxStreamOption{userId='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", streamId='");
        sbLIZ.append(this.streamId);
        sbLIZ.append('\'');
        sbLIZ.append(", urls.size=");
        List<String> list = this.urls;
        sbLIZ.append(list != null ? list.size() : 0);
        sbLIZ.append(", userRegion='");
        sbLIZ.append(this.userRegion);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getCarrierRegion() {
        return this.carrierRegion;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIdcName() {
        return this.idcName;
    }

    public String getIp() {
        return this.ip;
    }

    public ILyraxPusherSessionListener getListener() {
        return this.listener;
    }

    public String getLiveAuthString() {
        return this.liveAuthString;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public String getStreamOrientation() {
        return this.streamOrientation;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserRegion() {
        return this.userRegion;
    }
}
