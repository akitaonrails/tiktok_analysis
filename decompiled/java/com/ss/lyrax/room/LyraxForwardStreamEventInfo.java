package com.ss.lyrax.room;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxForwardStreamEventInfo {
    public LyraxForwardStreamEvent event;
    public String roomId = "";

    public LyraxForwardStreamEvent getEvent() {
        return this.event;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public static LyraxForwardStreamEventInfo create(String str, LyraxForwardStreamEvent lyraxForwardStreamEvent) {
        LyraxForwardStreamEventInfo lyraxForwardStreamEventInfo = new LyraxForwardStreamEventInfo();
        lyraxForwardStreamEventInfo.roomId = str;
        lyraxForwardStreamEventInfo.event = lyraxForwardStreamEvent;
        return lyraxForwardStreamEventInfo;
    }
}
