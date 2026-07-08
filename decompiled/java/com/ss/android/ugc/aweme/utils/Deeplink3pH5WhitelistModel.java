package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Deeplink3pH5WhitelistModel {

    @C09CT("allowList")
    public final List<String> allowList;

    @C09CT("block_enable")
    public final boolean blockEnable;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("hint_enable")
    public final boolean hintEnable;

    @C09CT("report_enable")
    public final boolean reportEnable;

    public Deeplink3pH5WhitelistModel() {
        this(false, false, false, false, null, 31, null);
    }

    public Deeplink3pH5WhitelistModel(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.enable = z;
        this.blockEnable = z2;
        this.reportEnable = z3;
        this.hintEnable = z4;
        this.allowList = list;
    }

    public Deeplink3pH5WhitelistModel(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
