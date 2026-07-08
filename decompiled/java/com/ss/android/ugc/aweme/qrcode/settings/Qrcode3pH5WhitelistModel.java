package com.ss.android.ugc.aweme.qrcode.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class Qrcode3pH5WhitelistModel {

    @C09CT("allowList")
    public final List<String> allowList;

    @C09CT("enable")
    public final boolean enable;

    public Qrcode3pH5WhitelistModel() {
        this(false, null, 3, null);
    }

    public Qrcode3pH5WhitelistModel(boolean z, List<String> list) {
        this.enable = z;
        this.allowList = list;
    }

    public Qrcode3pH5WhitelistModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
