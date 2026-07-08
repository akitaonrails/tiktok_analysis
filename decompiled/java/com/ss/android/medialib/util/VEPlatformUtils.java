package com.ss.android.medialib.util;

import X.C08FF;
import X.C1339250kxH;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public final class VEPlatformUtils {
    public static VEPlatform LIZ() {
        VEPlatform vEPlatform = VEPlatform.PLATFORM_UNKNOWN;
        String str = Build.HARDWARE;
        return str.matches("qcom") ? VEPlatform.PLATFORM_QCOM : str.matches("mt[0-9]*") ? VEPlatform.PLATFORM_MTK : str.matches("kirin[0-9]*") ? VEPlatform.PLATFORM_HISI : vEPlatform;
    }

    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;

        public static final Parcelable.Creator<VEPlatform> CREATOR = new C1339250kxH(3);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEPlatform valueOf(String str) {
            return (VEPlatform) C08FF.LIZ(VEPlatform.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}
