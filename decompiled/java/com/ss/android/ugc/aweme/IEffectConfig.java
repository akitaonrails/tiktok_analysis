package com.ss.android.ugc.aweme;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.IEffectConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public interface IEffectConfig extends Parcelable {

    public static final class Draft implements IEffectConfig {
        public static final Parcelable.Creator<Draft> CREATOR = new Parcelable.Creator<Draft>() { // from class: X.0vJi
            @Override // android.os.Parcelable.Creator
            public final IEffectConfig.Draft createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new IEffectConfig.Draft();
            }

            @Override // android.os.Parcelable.Creator
            public final IEffectConfig.Draft[] newArray(int i) {
                return new IEffectConfig.Draft[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class RemoteEffect implements IEffectConfig {
        public static final Parcelable.Creator<RemoteEffect> CREATOR = new Parcelable.Creator<RemoteEffect>() { // from class: X.0vJh
            @Override // android.os.Parcelable.Creator
            public final IEffectConfig.RemoteEffect createFromParcel(Parcel parcel) {
                return new IEffectConfig.RemoteEffect(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IEffectConfig.RemoteEffect[] newArray(int i) {
                return new IEffectConfig.RemoteEffect[i];
            }
        };
        public final String effectId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteEffect) && Intrinsics.LJFF(this.effectId, ((RemoteEffect) obj).effectId);
        }

        public final int hashCode() {
            return this.effectId.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RemoteEffect(effectId=");
            sbLIZ.append(this.effectId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.effectId);
        }

        public RemoteEffect(String str) {
            this.effectId = str;
        }
    }
}
