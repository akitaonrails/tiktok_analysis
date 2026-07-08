package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ExtAppLogConfig {

    @C09CT("play_end_attr_num")
    public final int playEndAttrNum;

    @C09CT("play_end_num")
    public final int playEndNum;

    @C09CT("playing_attr_num")
    public final int playingAttrNum;

    @C09CT("playing_num")
    public final int playingNum;

    @C09CT("pre_play_attr_num")
    public final int prePlayAttrNum;

    @C09CT("pre_play_num")
    public final int prePlayNum;

    public ExtAppLogConfig() {
        this(0, 0, 0, 1, 1, 1);
    }

    public ExtAppLogConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.prePlayNum = i;
        this.playingNum = i2;
        this.playEndNum = i3;
        this.prePlayAttrNum = i4;
        this.playingAttrNum = i5;
        this.playEndAttrNum = i6;
    }
}
