package com.ss.lyrax.room;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxForwardStreamStateInfo {
    public String roomId = "";
    public LyraxForwardStreamState state = LyraxForwardStreamState.IDLE;
    public LyraxForwardStreamError error = LyraxForwardStreamError.OK;

    public LyraxForwardStreamError getError() {
        return this.error;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public LyraxForwardStreamState getState() {
        return this.state;
    }

    public static LyraxForwardStreamStateInfo create(String str, LyraxForwardStreamState lyraxForwardStreamState, LyraxForwardStreamError lyraxForwardStreamError) {
        LyraxForwardStreamStateInfo lyraxForwardStreamStateInfo = new LyraxForwardStreamStateInfo();
        lyraxForwardStreamStateInfo.roomId = str;
        lyraxForwardStreamStateInfo.state = lyraxForwardStreamState;
        lyraxForwardStreamStateInfo.error = lyraxForwardStreamError;
        return lyraxForwardStreamStateInfo;
    }
}
