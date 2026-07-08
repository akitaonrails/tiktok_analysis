package com.ss.lyrax.pushersession;

import X.C2188811AlT;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.publisher.LyraxPublisherState;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPusherState {
    public int currentHeight;
    public int currentWidth;
    public boolean isAnchorNet;
    public String pushSessionId;
    public String rtcRoomId;
    public String rtcTaskId;
    public LyraxScene scene;
    public LyraxPublisherState status;

    public LyraxPusherState() {
        this.pushSessionId = "";
        this.status = LyraxPublisherState.UNKONWN;
        this.rtcRoomId = "";
        this.rtcTaskId = "";
        this.scene = LyraxScene.LIVE;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPusherState{pushSessionId='");
        sbLIZ.append(this.pushSessionId);
        sbLIZ.append('\'');
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", isAnchorNet=");
        sbLIZ.append(this.isAnchorNet);
        sbLIZ.append(", rtcRoomId='");
        sbLIZ.append(this.rtcRoomId);
        sbLIZ.append('\'');
        sbLIZ.append(", rtcTaskId='");
        sbLIZ.append(this.rtcTaskId);
        sbLIZ.append('\'');
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", currentWidth=");
        sbLIZ.append(this.currentWidth);
        sbLIZ.append(", currentHeight=");
        sbLIZ.append(this.currentHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxPusherState(String str, int i, boolean z, String str2, String str3, int i2, int i3, int i4) {
        this.pushSessionId = str == null ? "" : str;
        this.status = LyraxPublisherState.fromId(i);
        this.isAnchorNet = z;
        this.rtcRoomId = str2;
        this.rtcTaskId = str3;
        this.scene = LyraxScene.fromId(i2);
        this.currentWidth = i3;
        this.currentHeight = i4;
    }
}
