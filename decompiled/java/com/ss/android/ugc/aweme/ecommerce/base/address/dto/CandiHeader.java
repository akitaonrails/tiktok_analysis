package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CandiHeader {

    @C09CT("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CandiHeader) && Intrinsics.LJFF(this.text, ((CandiHeader) obj).text);
    }

    public CandiHeader(String str) {
        this.text = str;
    }
}
