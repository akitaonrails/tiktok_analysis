package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButtonExtraInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PropButtonExtraInfo implements Parcelable {

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("size_guide")
    public final SizeGuide sizeGuide;
    public static final Parcelable.Creator<PropButtonExtraInfo> CREATOR = new Parcelable.Creator<PropButtonExtraInfo>() { // from class: X.02s8
        @Override // android.os.Parcelable.Creator
        public final PropButtonExtraInfo createFromParcel(Parcel parcel) {
            SizeGuide sizeGuideCreateFromParcel;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                sizeGuideCreateFromParcel = null;
            } else {
                sizeGuideCreateFromParcel = SizeGuide.CREATOR.createFromParcel(parcel);
            }
            SizeGuide sizeGuide = sizeGuideCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PropButtonExtraInfo(sizeGuide, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PropButtonExtraInfo[] newArray(int i) {
            return new PropButtonExtraInfo[i];
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
        if (!(obj instanceof PropButtonExtraInfo)) {
            return false;
        }
        PropButtonExtraInfo propButtonExtraInfo = (PropButtonExtraInfo) obj;
        return Intrinsics.LJFF(this.sizeGuide, propButtonExtraInfo.sizeGuide) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, propButtonExtraInfo.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        SizeGuide sizeGuide = this.sizeGuide;
        int iHashCode = (sizeGuide == null ? 0 : sizeGuide.hashCode()) * 31;
        Map<String, String> map = this.eventTrackingTriggerKeys;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropButtonExtraInfo(sizeGuide=");
        sbLIZ.append(this.sizeGuide);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SizeGuide sizeGuide = this.sizeGuide;
        if (sizeGuide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeGuide.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.eventTrackingTriggerKeys;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public PropButtonExtraInfo(SizeGuide sizeGuide, Map<String, String> map) {
        this.sizeGuide = sizeGuide;
        this.eventTrackingTriggerKeys = map;
    }
}
