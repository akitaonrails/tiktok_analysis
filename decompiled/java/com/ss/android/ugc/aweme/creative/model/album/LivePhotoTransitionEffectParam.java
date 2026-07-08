package com.ss.android.ugc.aweme.creative.model.album;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoTransitionEffectParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LivePhotoTransitionEffectParam implements Parcelable {
    public static final Parcelable.Creator<LivePhotoTransitionEffectParam> CREATOR = new Parcelable.Creator<LivePhotoTransitionEffectParam>() { // from class: X.0EZu
        @Override // android.os.Parcelable.Creator
        public final LivePhotoTransitionEffectParam createFromParcel(Parcel parcel) {
            return new LivePhotoTransitionEffectParam(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LivePhotoTransitionEffectParam[] newArray(int i) {
            return new LivePhotoTransitionEffectParam[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    @InterfaceC2270908v5
    @C09CT("effect_path")
    public String effectPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoTransitionEffectParam)) {
            return false;
        }
        LivePhotoTransitionEffectParam livePhotoTransitionEffectParam = (LivePhotoTransitionEffectParam) obj;
        return Intrinsics.LJFF(this.effectId, livePhotoTransitionEffectParam.effectId) && Intrinsics.LJFF(this.effectPath, livePhotoTransitionEffectParam.effectPath);
    }

    public final int hashCode() {
        String str = this.effectId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectPath;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoTransitionEffectParam(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", effectPath=");
        sbLIZ.append(this.effectPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeString(this.effectPath);
    }

    public LivePhotoTransitionEffectParam() {
        this("", "");
    }

    public LivePhotoTransitionEffectParam(String str, String str2) {
        this.effectId = str;
        this.effectPath = str2;
    }
}
