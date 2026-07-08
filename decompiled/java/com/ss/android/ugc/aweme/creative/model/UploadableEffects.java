package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadableEffects implements Parcelable {

    @C09CT("uploadable_draft_effects")
    public List<UploadableDraftEffect> draft_effects;

    @C09CT("uploadable_mobile_effects")
    public List<UploadableMobileEffect> mobile_effects;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadableEffects)) {
            return false;
        }
        UploadableEffects uploadableEffects = (UploadableEffects) obj;
        return Intrinsics.LJFF(this.draft_effects, uploadableEffects.draft_effects) && Intrinsics.LJFF(this.mobile_effects, uploadableEffects.mobile_effects);
    }

    public final int hashCode() {
        return (this.draft_effects.hashCode() * 31) + this.mobile_effects.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadableEffects(draft_effects=");
        sbLIZ.append(this.draft_effects);
        sbLIZ.append(", mobile_effects=");
        sbLIZ.append(this.mobile_effects);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public UploadableEffects() {
        this(new ArrayList(), new ArrayList());
    }

    public UploadableEffects(List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2) {
        this.draft_effects = list;
        this.mobile_effects = list2;
    }
}
