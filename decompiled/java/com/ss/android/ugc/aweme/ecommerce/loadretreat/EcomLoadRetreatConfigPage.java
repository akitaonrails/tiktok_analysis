package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import X.C13LP;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigPage {

    @C09CT("btm")
    public final String btm;

    @C09CT("btm_list")
    public final List<String> btmList;

    @C09CT("enter")
    public final EcomLoadRetreatConfigPageLife enter;

    @C09CT("exit_points")
    public final List<EcomLoadRetreatConfigEventParams> exitPoints;

    @C09CT("preload_cancel")
    public final boolean preloadCancel;

    public EcomLoadRetreatConfigPage() {
        this(null, null, false, null, null, 31, null);
    }

    public final boolean LIZ(String str) {
        List<String> list;
        if (Intrinsics.LJFF(this.btm, str) || ((list = this.btmList) != null && C13LP.LJJJJ(str, list))) {
            return true;
        }
        return false;
    }

    public EcomLoadRetreatConfigPage(String str, List<String> list, boolean z, EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife, List<EcomLoadRetreatConfigEventParams> list2) {
        this.btm = str;
        this.btmList = list;
        this.preloadCancel = z;
        this.enter = ecomLoadRetreatConfigPageLife;
        this.exitPoints = list2;
    }

    public EcomLoadRetreatConfigPage(String str, List list, boolean z, EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? true : z, (i & 8) != 0 ? EcomLoadRetreatConfigPageLife.LIZ : ecomLoadRetreatConfigPageLife, (i & 16) == 0 ? list2 : null);
    }
}
