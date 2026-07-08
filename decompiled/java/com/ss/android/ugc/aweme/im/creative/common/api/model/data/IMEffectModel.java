package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMEffectModel implements Parcelable {
    public static final Parcelable.Creator<IMEffectModel> CREATOR = new Parcelable.Creator<IMEffectModel>() { // from class: X.0ni0
        @Override // android.os.Parcelable.Creator
        public final IMEffectModel createFromParcel(Parcel parcel) {
            return new IMEffectModel((Effect) parcel.readParcelable(IMEffectModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IMEffectModel[] newArray(int i) {
            return new IMEffectModel[i];
        }
    };
    public final Effect effect;
    public final String stickerID;

    public IMEffectModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMEffectModel) && Intrinsics.LJFF(this.effect, ((IMEffectModel) obj).effect);
    }

    public final int hashCode() {
        Effect effect = this.effect;
        if (effect == null) {
            return 0;
        }
        return effect.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMEffectModel(effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.effect, i);
    }

    public IMEffectModel(Effect effect) {
        String effect_id;
        this.effect = effect;
        if (effect != null) {
            effect_id = effect.getEffect_id();
            if (effect_id == null) {
                effect_id = effect.getId();
            }
        } else {
            effect_id = null;
        }
        this.stickerID = effect_id;
    }
}
