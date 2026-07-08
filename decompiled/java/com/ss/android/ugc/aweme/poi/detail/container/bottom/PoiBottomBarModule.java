package com.ss.android.ugc.aweme.poi.detail.container.bottom;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBottomBarModule extends BaseComponentData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("is_collected")
    public final boolean isCollect;

    @C09CT("real_time_fav_cnt")
    public final Long realFavoriteCnt;

    @C09CT("type_level")
    public final String typeLevel;

    public PoiBottomBarModule() {
        this(null, false, null, null);
    }

    public final PoiBottomBarModule copy(String str, boolean z, Long l, String str2) {
        return new PoiBottomBarModule(str, z, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiBottomBarModule)) {
            return false;
        }
        PoiBottomBarModule poiBottomBarModule = (PoiBottomBarModule) obj;
        return Intrinsics.LJFF(this.collectInfo, poiBottomBarModule.collectInfo) && this.isCollect == poiBottomBarModule.isCollect && Intrinsics.LJFF(this.realFavoriteCnt, poiBottomBarModule.realFavoriteCnt) && Intrinsics.LJFF(this.typeLevel, poiBottomBarModule.typeLevel);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.collectInfo;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isCollect)) * 31;
        Long l = this.realFavoriteCnt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.typeLevel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiBottomBarModule(collectInfo=");
        sbLIZ.append(this.collectInfo);
        sbLIZ.append(", isCollect=");
        sbLIZ.append(this.isCollect);
        sbLIZ.append(", realFavoriteCnt=");
        sbLIZ.append(this.realFavoriteCnt);
        sbLIZ.append(", typeLevel=");
        sbLIZ.append(this.typeLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final Long getRealFavoriteCnt() {
        return this.realFavoriteCnt;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public PoiBottomBarModule(String str, boolean z, Long l, String str2) {
        this.collectInfo = str;
        this.isCollect = z;
        this.realFavoriteCnt = l;
        this.typeLevel = str2;
    }
}
