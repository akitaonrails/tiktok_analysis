package com.ss.android.ugc.aweme.prop.draft;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssemData;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectDraftDetailAssemData implements InterfaceC111300bX, Parcelable {
    public final int spanSize;
    public static final Parcelable.Creator<EffectDraftDetailAssemData> CREATOR = new Parcelable.Creator<EffectDraftDetailAssemData>() { // from class: X.06VT
        @Override // android.os.Parcelable.Creator
        public final EffectDraftDetailAssemData createFromParcel(Parcel parcel) {
            return new EffectDraftDetailAssemData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectDraftDetailAssemData[] newArray(int i) {
            return new EffectDraftDetailAssemData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EffectDraftDetailAssemData) && this.spanSize == ((EffectDraftDetailAssemData) obj).spanSize;
    }

    public final int hashCode() {
        return this.spanSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectDraftDetailAssemData(spanSize=");
        sbLIZ.append(this.spanSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.spanSize);
    }

    public EffectDraftDetailAssemData(int i) {
        this.spanSize = i;
    }
}
