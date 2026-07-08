package com.ss.android.ugc.aweme.poi.detail.worldcup.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiWorldCupScheduleModule extends BaseComponentData implements Serializable {

    @C09CT("date_display_index")
    public final Integer dateDisplayIndex;

    @C09CT("match_list")
    public final List<WorldCupDateMatchGroup> matchList;

    @C09CT("viewall_schema")
    public final String viewAllSchema;

    public PoiWorldCupScheduleModule() {
        this(null, null, null);
    }

    public final PoiWorldCupScheduleModule copy(List<WorldCupDateMatchGroup> list, Integer num, String str) {
        return new PoiWorldCupScheduleModule(list, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiWorldCupScheduleModule)) {
            return false;
        }
        PoiWorldCupScheduleModule poiWorldCupScheduleModule = (PoiWorldCupScheduleModule) obj;
        return Intrinsics.LJFF(this.matchList, poiWorldCupScheduleModule.matchList) && Intrinsics.LJFF(this.dateDisplayIndex, poiWorldCupScheduleModule.dateDisplayIndex) && Intrinsics.LJFF(this.viewAllSchema, poiWorldCupScheduleModule.viewAllSchema);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<WorldCupDateMatchGroup> list = this.matchList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.dateDisplayIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.viewAllSchema;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiWorldCupScheduleModule(matchList=");
        sbLIZ.append(this.matchList);
        sbLIZ.append(", dateDisplayIndex=");
        sbLIZ.append(this.dateDisplayIndex);
        sbLIZ.append(", viewAllSchema=");
        sbLIZ.append(this.viewAllSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getDateDisplayIndex() {
        return this.dateDisplayIndex;
    }

    public final List<WorldCupDateMatchGroup> getMatchList() {
        return this.matchList;
    }

    public final String getViewAllSchema() {
        return this.viewAllSchema;
    }

    public PoiWorldCupScheduleModule(List<WorldCupDateMatchGroup> list, Integer num, String str) {
        this.matchList = list;
        this.dateDisplayIndex = num;
        this.viewAllSchema = str;
    }
}
