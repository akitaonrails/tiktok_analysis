package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class BaseTrackTimeStamp implements Serializable {

    @C09CT("p")
    public int pts;

    public boolean isFullTrack() {
        return -1 == this.pts;
    }

    public BaseTrackTimeStamp() {
        this.pts = -1;
    }

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }

    public void setPts(int i) {
        this.pts = i;
    }
}
