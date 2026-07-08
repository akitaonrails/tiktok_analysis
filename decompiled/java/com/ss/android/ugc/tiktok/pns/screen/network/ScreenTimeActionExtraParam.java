package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ScreenTimeActionExtraParam implements Serializable {

    @C09CT("count")
    public final Integer count;

    @C09CT("type_id")
    public final Integer typeID;

    public ScreenTimeActionExtraParam(Integer num, Integer num2) {
        this.typeID = num;
        this.count = num2;
    }
}
