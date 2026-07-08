package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ForwardStreamInfo;

/* JADX INFO: loaded from: classes21.dex */
public class InternalForwardStreamInfo {
    public String roomId;
    public String token;

    public String getRoomId() {
        String str = this.roomId;
        return str == null ? "" : str;
    }

    public String getToken() {
        String str = this.token;
        return str == null ? "" : str;
    }

    public InternalForwardStreamInfo(ForwardStreamInfo forwardStreamInfo) {
        this.roomId = forwardStreamInfo.roomId;
        this.token = forwardStreamInfo.token;
    }

    public InternalForwardStreamInfo(String str, String str2) {
        this.roomId = str;
        this.token = str2;
    }
}
