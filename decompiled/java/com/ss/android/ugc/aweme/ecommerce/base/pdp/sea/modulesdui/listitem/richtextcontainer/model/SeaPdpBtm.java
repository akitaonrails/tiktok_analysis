package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model;

import X.C09CT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBtm {

    @C09CT("c")
    public final String c;

    @C09CT("d")
    public final Map<String, String> d;

    public SeaPdpBtm() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBtm)) {
            return false;
        }
        SeaPdpBtm seaPdpBtm = (SeaPdpBtm) obj;
        return Intrinsics.LJFF(this.c, seaPdpBtm.c) && Intrinsics.LJFF(this.d, seaPdpBtm.d);
    }

    public SeaPdpBtm(String str, Map<String, String> map) {
        this.c = str;
        this.d = map;
    }
}
