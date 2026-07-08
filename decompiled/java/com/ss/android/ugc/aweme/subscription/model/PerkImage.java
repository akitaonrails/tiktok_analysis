package com.ss.android.ugc.aweme.subscription.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PerkImage {

    @C09CT("perk_url")
    public final List<String> perkURL;

    @C09CT("perk_uri")
    public final String perkUri;

    public PerkImage() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerkImage)) {
            return false;
        }
        PerkImage perkImage = (PerkImage) obj;
        return Intrinsics.LJFF(this.perkUri, perkImage.perkUri) && Intrinsics.LJFF(this.perkURL, perkImage.perkURL);
    }

    public PerkImage(String str, List<String> list) {
        this.perkUri = str;
        this.perkURL = list;
    }

    public PerkImage(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
