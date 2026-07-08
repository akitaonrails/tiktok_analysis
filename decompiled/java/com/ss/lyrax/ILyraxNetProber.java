package com.ss.lyrax;

import com.ss.lyrax.net.ILyraxNetProberListener;
import com.ss.lyrax.net.LyraxNetProberBandwidthResult;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxNetProber extends ILyraxObject {
    void dispose();

    LyraxNetProberBandwidthResult getBandwidthResult();

    LyraxErrorCode setListener(ILyraxNetProberListener iLyraxNetProberListener);

    LyraxErrorCode startProbe();

    LyraxErrorCode stopProbe();
}
