package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.CameraPageConfig;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMRecordPageEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraPageConfig implements Parcelable {
    public static final Parcelable.Creator<CameraPageConfig> CREATOR = new Parcelable.Creator<CameraPageConfig>() { // from class: X.0nhz
        @Override // android.os.Parcelable.Creator
        public final CameraPageConfig createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IMRecordPageEnum.CREATOR.createFromParcel(parcel));
            }
            return new CameraPageConfig(arrayList, IMRecordPageEnum.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPageConfig[] newArray(int i) {
            return new CameraPageConfig[i];
        }
    };
    public final IMRecordPageEnum defaultPage;
    public final List<IMRecordPageEnum> pageConfig;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPageConfig)) {
            return false;
        }
        CameraPageConfig cameraPageConfig = (CameraPageConfig) obj;
        return Intrinsics.LJFF(this.pageConfig, cameraPageConfig.pageConfig) && this.defaultPage == cameraPageConfig.defaultPage;
    }

    public final int hashCode() {
        return (this.pageConfig.hashCode() * 31) + this.defaultPage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraPageConfig(pageConfig=");
        sbLIZ.append(this.pageConfig);
        sbLIZ.append(", defaultPage=");
        sbLIZ.append(this.defaultPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<IMRecordPageEnum> list = this.pageConfig;
        parcel.writeInt(list.size());
        Iterator<IMRecordPageEnum> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.defaultPage.writeToParcel(parcel, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraPageConfig(List<? extends IMRecordPageEnum> list, IMRecordPageEnum iMRecordPageEnum) {
        this.pageConfig = list;
        this.defaultPage = iMRecordPageEnum;
    }
}
