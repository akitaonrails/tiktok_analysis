package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class IBEContext implements Serializable, Parcelable {
    public static final Parcelable.Creator<IBEContext> CREATOR = new Parcelable.Creator<IBEContext>() { // from class: X.0nkH
        @Override // android.os.Parcelable.Creator
        public final IBEContext createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new IBEContext();
        }

        @Override // android.os.Parcelable.Creator
        public final IBEContext[] newArray(int i) {
            return new IBEContext[i];
        }
    };

    @C09CT("ibe_infos")
    public List<IBEInfo> ibeInfos = C13BV.INSTANCE;

    @C09CT("ibe_metadata")
    public InteractiveBrandedEffectInfo metadata;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final List<IBEInfo> getIbeInfos() {
        return this.ibeInfos;
    }

    public final InteractiveBrandedEffectInfo getMetadata() {
        return this.metadata;
    }

    public final void setIbeInfos(List<IBEInfo> list) {
        this.ibeInfos = list;
    }

    public final void setMetadata(InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        this.metadata = interactiveBrandedEffectInfo;
    }
}
