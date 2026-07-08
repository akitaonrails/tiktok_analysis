package com.ss.android.ugc.aweme.component.nativelivebanner;

import X.C09CT;
import X.C1003150cDB;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleOfficialLiveRoomModel implements Serializable {
    public static final int $stable = 0;
    public static final C1003150cDB Companion = new Object() { // from class: X.0cDB
    };

    @C09CT("bottom_banner_type")
    public final Integer bottomBannerType;

    @C09CT("recommend_text")
    public final String recommendText;

    public AnoleOfficialLiveRoomModel(String str, Integer num) {
        this.recommendText = str;
        this.bottomBannerType = num;
    }
}
