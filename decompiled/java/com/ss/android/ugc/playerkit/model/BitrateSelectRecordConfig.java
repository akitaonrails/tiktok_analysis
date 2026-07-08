package com.ss.android.ugc.playerkit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class BitrateSelectRecordConfig {

    @C09CT("enable_bitrate_select_records")
    public final int enableRecord;

    @C09CT("bitrate_select_record_playlist_checking_len")
    public final int recordCheckLength;

    public BitrateSelectRecordConfig() {
        this(5, 0);
    }

    public BitrateSelectRecordConfig(int i, int i2) {
        this.recordCheckLength = i;
        this.enableRecord = i2;
    }
}
