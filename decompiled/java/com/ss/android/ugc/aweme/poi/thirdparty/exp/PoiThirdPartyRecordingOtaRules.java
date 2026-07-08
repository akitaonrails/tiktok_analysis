package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PoiThirdPartyRecordingOtaRules {

    @C09CT("click")
    public final List<PoiThirdPartyRecordingClickRule> click;

    @C09CT("view")
    public final List<PoiThirdPartyRecordingViewRule> view;

    public PoiThirdPartyRecordingOtaRules() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiThirdPartyRecordingOtaRules)) {
            return false;
        }
        PoiThirdPartyRecordingOtaRules poiThirdPartyRecordingOtaRules = (PoiThirdPartyRecordingOtaRules) obj;
        return Intrinsics.LJFF(this.view, poiThirdPartyRecordingOtaRules.view) && Intrinsics.LJFF(this.click, poiThirdPartyRecordingOtaRules.click);
    }

    public final int hashCode() {
        List<PoiThirdPartyRecordingViewRule> list = this.view;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PoiThirdPartyRecordingClickRule> list2 = this.click;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiThirdPartyRecordingOtaRules(view=");
        sbLIZ.append(this.view);
        sbLIZ.append(", click=");
        sbLIZ.append(this.click);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiThirdPartyRecordingOtaRules(List<PoiThirdPartyRecordingViewRule> list, List<PoiThirdPartyRecordingClickRule> list2) {
        this.view = list;
        this.click = list2;
    }
}
