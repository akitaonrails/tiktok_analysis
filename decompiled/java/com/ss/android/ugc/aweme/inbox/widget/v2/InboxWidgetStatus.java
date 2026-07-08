package com.ss.android.ugc.aweme.inbox.widget.v2;

import X.C13LE;
import X.C1889330zGV;
import X.C1889340zGW;
import X.C1889350zGX;
import X.C1889360zGY;
import X.C1889370zGZ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class InboxWidgetStatus {
    public final boolean isCompleted() {
        return Intrinsics.LJFF(this, C1889360zGY.LIZ) || Intrinsics.LJFF(this, C1889340zGW.LIZ) || Intrinsics.LJFF(this, C1889330zGV.LIZ);
    }

    public final boolean isEnable() {
        return (Intrinsics.LJFF(this, C1889330zGV.LIZ) || Intrinsics.LJFF(this, C1889370zGZ.LIZ)) ? false : true;
    }

    public final boolean isHide() {
        return Intrinsics.LJFF(this, C1889340zGW.LIZ);
    }

    public final boolean isInit() {
        return Intrinsics.LJFF(this, C1889350zGX.LIZ);
    }

    public final boolean isShow() {
        return Intrinsics.LJFF(this, C1889360zGY.LIZ);
    }

    public String toString() {
        String strLJI = C13LE.LIZ(getClass()).LJI();
        return strLJI == null ? super.toString() : strLJI;
    }
}
