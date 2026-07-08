package com.ss.android.ugc.aweme.poi.thirdparty.exp;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PoiThirdPartyRecordingClickRule {

    @C09CT("event")
    public final String event;

    @C09CT("select_rule")
    public final List<String> selectRule;

    public PoiThirdPartyRecordingClickRule() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiThirdPartyRecordingClickRule)) {
            return false;
        }
        PoiThirdPartyRecordingClickRule poiThirdPartyRecordingClickRule = (PoiThirdPartyRecordingClickRule) obj;
        return Intrinsics.LJFF(this.event, poiThirdPartyRecordingClickRule.event) && Intrinsics.LJFF(this.selectRule, poiThirdPartyRecordingClickRule.selectRule);
    }

    public final int hashCode() {
        String str = this.event;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.selectRule;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiThirdPartyRecordingClickRule(event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", selectRule=");
        sbLIZ.append(this.selectRule);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiThirdPartyRecordingClickRule(String str, List<String> list) {
        this.event = str;
        this.selectRule = list;
    }
}
