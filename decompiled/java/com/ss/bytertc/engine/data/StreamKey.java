package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class StreamKey {
    public String roomId;
    public StreamIndex streamIndex;
    public String userId;

    public boolean hasNullProperty() {
        return this.roomId == null || this.userId == null || this.streamIndex == null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamKey{roomId='");
        sbLIZ.append(this.roomId);
        sbLIZ.append('\'');
        sbLIZ.append(", userId='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", streamIndex=");
        sbLIZ.append(this.streamIndex);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getRoomId() {
        return this.roomId;
    }

    public StreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setStreamIndex(StreamIndex streamIndex) {
        this.streamIndex = streamIndex;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public StreamKey(String str, String str2, StreamIndex streamIndex) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex;
    }

    public static StreamKey create(String str, String str2, StreamIndex streamIndex) {
        return new StreamKey(str, str2, streamIndex);
    }
}
