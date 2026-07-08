package com.ss.android.ugc.aweme.subscription.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PerkData {

    @C09CT("perk_desc")
    public final String perkDescription;

    @C09CT("perk_image")
    public final PerkImage perkImage;

    @C09CT("perk_title")
    public final String perkTitle;

    public PerkData() {
        this("", "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerkData)) {
            return false;
        }
        PerkData perkData = (PerkData) obj;
        return Intrinsics.LJFF(this.perkTitle, perkData.perkTitle) && Intrinsics.LJFF(this.perkDescription, perkData.perkDescription) && Intrinsics.LJFF(this.perkImage, perkData.perkImage);
    }

    public PerkData(String str, String str2, PerkImage perkImage) {
        this.perkTitle = str;
        this.perkDescription = str2;
        this.perkImage = perkImage;
    }
}
