package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModelExtraValue;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MobileEffectsModel2 implements Parcelable {
    public static final Parcelable.Creator<MobileEffectsModel2> CREATOR = new Parcelable.Creator<MobileEffectsModel2>() { // from class: X.0nJ5
        @Override // android.os.Parcelable.Creator
        public final MobileEffectsModel2 createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UploadableMobileEffect2.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), MobileEffectsModelExtraValue.CREATOR.createFromParcel(parcel));
            }
            return new MobileEffectsModel2(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffectsModel2[] newArray(int i) {
            return new MobileEffectsModel2[i];
        }
    };

    @C09CT("exported_effects")
    public List<UploadableMobileEffect2> exportedEffects;

    @C040H
    public Map<String, MobileEffectsModelExtraValue> id2ExtraMap;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectsModel2)) {
            return false;
        }
        MobileEffectsModel2 mobileEffectsModel2 = (MobileEffectsModel2) obj;
        return Intrinsics.LJFF(this.exportedEffects, mobileEffectsModel2.exportedEffects) && Intrinsics.LJFF(this.id2ExtraMap, mobileEffectsModel2.id2ExtraMap);
    }

    public final int hashCode() {
        return (this.exportedEffects.hashCode() * 31) + this.id2ExtraMap.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectsModel2(exportedEffects=");
        sbLIZ.append(this.exportedEffects);
        sbLIZ.append(", id2ExtraMap=");
        sbLIZ.append(this.id2ExtraMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UploadableMobileEffect2> list = this.exportedEffects;
        parcel.writeInt(list.size());
        Iterator<UploadableMobileEffect2> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        Map<String, MobileEffectsModelExtraValue> map = this.id2ExtraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, MobileEffectsModelExtraValue> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public MobileEffectsModel2() {
        this(new ArrayList(), new LinkedHashMap());
    }

    public MobileEffectsModel2(List<UploadableMobileEffect2> list, Map<String, MobileEffectsModelExtraValue> map) {
        this.exportedEffects = list;
        this.id2ExtraMap = map;
    }
}
