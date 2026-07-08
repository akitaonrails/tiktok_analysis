package com.bytedance.goda.model.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaCardDataFeature {

    @C09CT("native_card_identifier")
    public final String nativeCardIdentifier;

    public GodaCardDataFeature() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GodaCardDataFeature) && Intrinsics.LJFF(this.nativeCardIdentifier, ((GodaCardDataFeature) obj).nativeCardIdentifier);
    }

    public GodaCardDataFeature(String str) {
        this.nativeCardIdentifier = str;
    }
}
