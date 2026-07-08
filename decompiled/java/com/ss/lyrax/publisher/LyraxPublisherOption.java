package com.ss.lyrax.publisher;

import com.ss.lyrax.stream.LyraxStreamIndex;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherOption {
    public String streamId = new String();
    public LyraxStreamIndex streamIndex = LyraxStreamIndex.kMain;
    public boolean enableMixing = false;

    public boolean getEnableMixing() {
        return this.enableMixing;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public LyraxStreamIndex getStreamIndex() {
        return this.streamIndex;
    }
}
