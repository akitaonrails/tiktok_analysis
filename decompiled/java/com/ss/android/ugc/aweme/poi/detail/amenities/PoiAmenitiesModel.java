package com.ss.android.ugc.aweme.poi.detail.amenities;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiAmenitiesModel implements Serializable, InterfaceC1891350zJl {

    @C09CT("count")
    public final Integer count;

    @C09CT("section_info")
    public final List<PoiAmenity> sectionInfo;

    public PoiAmenitiesModel() {
        this(null, null);
    }

    public final PoiAmenitiesModel copy(Integer num, List<PoiAmenity> list) {
        return new PoiAmenitiesModel(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAmenitiesModel)) {
            return false;
        }
        PoiAmenitiesModel poiAmenitiesModel = (PoiAmenitiesModel) obj;
        return Intrinsics.LJFF(this.count, poiAmenitiesModel.count) && Intrinsics.LJFF(this.sectionInfo, poiAmenitiesModel.sectionInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PoiAmenity> list = this.sectionInfo;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmenitiesModel(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", sectionInfo=");
        sbLIZ.append(this.sectionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<PoiAmenity> getSectionInfo() {
        return this.sectionInfo;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public PoiAmenitiesModel(Integer num, List<PoiAmenity> list) {
        this.count = num;
        this.sectionInfo = list;
    }
}
