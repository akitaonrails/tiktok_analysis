package com.ss.solution.interact;

import X.C2188811AlT;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.video.ILyraxVideoRendererFactory;

/* JADX INFO: loaded from: classes21.dex */
public class InteractCoreOption {
    public IInteractNativeListener listener;
    public ILyraxVideoRendererFactory renderFactory;
    public int role;
    public String rtcExtInfo = "";
    public LyraxLiveType liveType = LyraxLiveType.VIDEO;
    public String pushUrls = "";
    public String streamOrientation = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractCoreOption{rtcExtInfo='");
        sbLIZ.append(this.rtcExtInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", role=");
        sbLIZ.append(this.role);
        sbLIZ.append(", liveType=");
        sbLIZ.append(this.liveType);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.listener);
        sbLIZ.append(", pushUrls='");
        sbLIZ.append(this.pushUrls);
        sbLIZ.append('\'');
        sbLIZ.append(", streamOrientation='");
        sbLIZ.append(this.streamOrientation);
        sbLIZ.append('\'');
        sbLIZ.append(", renderFactory=");
        sbLIZ.append(this.renderFactory);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IInteractNativeListener getListener() {
        return this.listener;
    }

    public LyraxLiveType getLiveType() {
        return this.liveType;
    }

    public String getPushUrls() {
        return this.pushUrls;
    }

    public ILyraxVideoRendererFactory getRenderFactory() {
        return this.renderFactory;
    }

    public int getRole() {
        return this.role;
    }

    public String getRtcExtInfo() {
        return this.rtcExtInfo;
    }

    public String getStreamOrientation() {
        return this.streamOrientation;
    }
}
