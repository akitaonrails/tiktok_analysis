package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPageFunctionTracking;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPageFunctionTracking implements Parcelable {
    public static final Parcelable.Creator<EditPageFunctionTracking> CREATOR = new Parcelable.Creator<EditPageFunctionTracking>() { // from class: X.0mbd
        @Override // android.os.Parcelable.Creator
        public final EditPageFunctionTracking createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new EditPageFunctionTracking(z, z2, z3, z4, z5, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final EditPageFunctionTracking[] newArray(int i) {
            return new EditPageFunctionTracking[i];
        }
    };

    @C09CT("is_edit_page_captions")
    public boolean isCaptionFuncUsed;

    @C09CT("is_edit_page_effect")
    public boolean isEffectFuncUsed;

    @C09CT("is_edit_page_filter")
    public boolean isFilterFuncUsed;

    @C09CT("is_edit_page_text")
    public boolean isTextFuncUsed;

    @C09CT("is_edit_page_voice_effect")
    public boolean isVoiceEffectFuncUsed;

    @C09CT("is_edit_page_voiceover")
    public boolean isVoiceoverFuncUsed;

    public EditPageFunctionTracking() {
        this(false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPageFunctionTracking)) {
            return false;
        }
        EditPageFunctionTracking editPageFunctionTracking = (EditPageFunctionTracking) obj;
        return this.isTextFuncUsed == editPageFunctionTracking.isTextFuncUsed && this.isEffectFuncUsed == editPageFunctionTracking.isEffectFuncUsed && this.isVoiceEffectFuncUsed == editPageFunctionTracking.isVoiceEffectFuncUsed && this.isVoiceoverFuncUsed == editPageFunctionTracking.isVoiceoverFuncUsed && this.isCaptionFuncUsed == editPageFunctionTracking.isCaptionFuncUsed && this.isFilterFuncUsed == editPageFunctionTracking.isFilterFuncUsed;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.isTextFuncUsed) * 31) + C786410Ut5.Z2(this.isEffectFuncUsed)) * 31) + C786410Ut5.Z2(this.isVoiceEffectFuncUsed)) * 31) + C786410Ut5.Z2(this.isVoiceoverFuncUsed)) * 31) + C786410Ut5.Z2(this.isCaptionFuncUsed)) * 31) + C786410Ut5.Z2(this.isFilterFuncUsed);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPageFunctionTracking(isTextFuncUsed=");
        sbLIZ.append(this.isTextFuncUsed);
        sbLIZ.append(", isEffectFuncUsed=");
        sbLIZ.append(this.isEffectFuncUsed);
        sbLIZ.append(", isVoiceEffectFuncUsed=");
        sbLIZ.append(this.isVoiceEffectFuncUsed);
        sbLIZ.append(", isVoiceoverFuncUsed=");
        sbLIZ.append(this.isVoiceoverFuncUsed);
        sbLIZ.append(", isCaptionFuncUsed=");
        sbLIZ.append(this.isCaptionFuncUsed);
        sbLIZ.append(", isFilterFuncUsed=");
        sbLIZ.append(this.isFilterFuncUsed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isTextFuncUsed ? 1 : 0);
        parcel.writeInt(this.isEffectFuncUsed ? 1 : 0);
        parcel.writeInt(this.isVoiceEffectFuncUsed ? 1 : 0);
        parcel.writeInt(this.isVoiceoverFuncUsed ? 1 : 0);
        parcel.writeInt(this.isCaptionFuncUsed ? 1 : 0);
        parcel.writeInt(this.isFilterFuncUsed ? 1 : 0);
    }

    public EditPageFunctionTracking(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.isTextFuncUsed = z;
        this.isEffectFuncUsed = z2;
        this.isVoiceEffectFuncUsed = z3;
        this.isVoiceoverFuncUsed = z4;
        this.isCaptionFuncUsed = z5;
        this.isFilterFuncUsed = z6;
    }
}
