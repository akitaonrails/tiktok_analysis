package com.ss.android.ugc.aweme.poi.detail.amenities;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmenitiesComponentData extends BaseComponentData implements Serializable {

    @C09CT("amenities")
    public final PoiAmenitiesModel data;

    @C09CT("title")
    public final String title;

    @C09CT("view_all_text")
    public final String viewAllText;

    public PoiAmenitiesComponentData() {
        this(null, null, null);
    }

    public final PoiAmenitiesComponentData copy(PoiAmenitiesModel poiAmenitiesModel, String str, String str2) {
        return new PoiAmenitiesComponentData(poiAmenitiesModel, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAmenitiesComponentData)) {
            return false;
        }
        PoiAmenitiesComponentData poiAmenitiesComponentData = (PoiAmenitiesComponentData) obj;
        return Intrinsics.LJFF(this.data, poiAmenitiesComponentData.data) && Intrinsics.LJFF(this.title, poiAmenitiesComponentData.title) && Intrinsics.LJFF(this.viewAllText, poiAmenitiesComponentData.viewAllText);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        PoiAmenitiesModel poiAmenitiesModel = this.data;
        int iHashCode = (poiAmenitiesModel == null ? 0 : poiAmenitiesModel.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewAllText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmenitiesComponentData(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", viewAllText=");
        sbLIZ.append(this.viewAllText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiAmenitiesModel getData() {
        return this.data;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewAllText() {
        return this.viewAllText;
    }

    public PoiAmenitiesComponentData(PoiAmenitiesModel poiAmenitiesModel, String str, String str2) {
        this.data = poiAmenitiesModel;
        this.title = str;
        this.viewAllText = str2;
    }
}
