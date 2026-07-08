package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedLynxInsertCardSettingsModel {

    @C09CT("early_num")
    public final Integer earlyNum;

    @C09CT("enable")
    public final Boolean enable;

    public FeedLynxInsertCardSettingsModel() {
        this(3, Boolean.TRUE);
    }

    public FeedLynxInsertCardSettingsModel(Integer num, Boolean bool) {
        this.earlyNum = num;
        this.enable = bool;
    }
}
