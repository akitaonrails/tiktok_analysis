package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.AIChatFeatureGating;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatPageConfig implements Parcelable {
    public static final Parcelable.Creator<AIChatPageConfig> CREATOR = new Parcelable.Creator<AIChatPageConfig>() { // from class: X.18Wh
        @Override // android.os.Parcelable.Creator
        public final AIChatPageConfig createFromParcel(Parcel parcel) {
            return new AIChatPageConfig(AIChatAppearance.CREATOR.createFromParcel(parcel), AIChatPayload.CREATOR.createFromParcel(parcel), AIChatTrackingConfig.CREATOR.createFromParcel(parcel), AIChatFeatureGating.CREATOR.createFromParcel(parcel), AIChatCallbacks.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatPageConfig[] newArray(int i) {
            return new AIChatPageConfig[i];
        }
    };
    public final AIChatAppearance appearance;
    public final AIChatCallbacks callbacks;
    public final AIChatFeatureGating features;
    public final AIChatPayload payload;
    public final AIChatTrackingConfig tracking;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatPageConfig)) {
            return false;
        }
        AIChatPageConfig aIChatPageConfig = (AIChatPageConfig) obj;
        return Intrinsics.LJFF(this.appearance, aIChatPageConfig.appearance) && Intrinsics.LJFF(this.payload, aIChatPageConfig.payload) && Intrinsics.LJFF(this.tracking, aIChatPageConfig.tracking) && Intrinsics.LJFF(this.features, aIChatPageConfig.features) && Intrinsics.LJFF(this.callbacks, aIChatPageConfig.callbacks);
    }

    public final int hashCode() {
        return (((((((this.appearance.hashCode() * 31) + this.payload.hashCode()) * 31) + this.tracking.hashCode()) * 31) + this.features.hashCode()) * 31) + this.callbacks.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatPageConfig(appearance=");
        sbLIZ.append(this.appearance);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(", tracking=");
        sbLIZ.append(this.tracking);
        sbLIZ.append(", features=");
        sbLIZ.append(this.features);
        sbLIZ.append(", callbacks=");
        sbLIZ.append(this.callbacks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.appearance.writeToParcel(parcel, i);
        this.payload.writeToParcel(parcel, i);
        this.tracking.writeToParcel(parcel, i);
        this.features.writeToParcel(parcel, i);
        this.callbacks.writeToParcel(parcel, i);
    }

    public AIChatPageConfig(AIChatAppearance aIChatAppearance, AIChatPayload aIChatPayload, AIChatTrackingConfig aIChatTrackingConfig, AIChatFeatureGating aIChatFeatureGating, AIChatCallbacks aIChatCallbacks) {
        this.appearance = aIChatAppearance;
        this.payload = aIChatPayload;
        this.tracking = aIChatTrackingConfig;
        this.features = aIChatFeatureGating;
        this.callbacks = aIChatCallbacks;
    }
}
