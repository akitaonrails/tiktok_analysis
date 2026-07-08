package com.ss.android.ugc.aweme.feed.infra.riskapi.api;

import X.C01GW;
import X.C09CT;
import X.C0S46;
import X.C1AV2;
import X.C2188811AlT;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PFVisibleInfo implements Serializable {

    @C09CT("alpha")
    public final Float alpha;
    public final C01GW errorType$delegate;

    @C09CT("height")
    public final Integer height;

    @C09CT("parentInfo")
    public final PFVisibleInfo parentInfo;

    @C09CT("realVisble")
    public final C0S46 realVisble;

    @C09CT("token")
    public final Map<String, C1AV2> token;

    @C09CT("view_id")
    public final String viewId;
    public final C01GW viewLink$delegate;

    @C09CT("visibility")
    public final String visibility;

    @C09CT("width")
    public final Integer width;

    public PFVisibleInfo() {
        this("", "", null, null, null, null, null, null);
    }

    public final String getErrorType() {
        return (String) this.errorType$delegate.getValue();
    }

    public final String getViewLink() {
        return (String) this.viewLink$delegate.getValue();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.viewId);
        sbLIZ.append('/');
        sbLIZ.append(this.realVisble);
        sbLIZ.append('/');
        sbLIZ.append(this.visibility);
        sbLIZ.append('/');
        Integer num = this.width;
        int i = -999;
        sbLIZ.append(num == null ? -999 : num.intValue() > 0 ? 1 : 0);
        sbLIZ.append('/');
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.intValue() <= 0 ? 0 : 1;
        }
        sbLIZ.append(i);
        sbLIZ.append('/');
        Float f = this.alpha;
        sbLIZ.append(f == null ? "-1" : f.floatValue() <= 0.0f ? CardStruct.IStatusCode.DEFAULT : f.floatValue() > 0.5f ? "1" : "0.5");
        sbLIZ.append('/');
        sbLIZ.append(this.token);
        sbLIZ.append('/');
        sbLIZ.append(this.parentInfo);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PFVisibleInfo(String str, String str2, Integer num, Integer num2, Float f, Map<String, C1AV2> map, C0S46 c0s46, PFVisibleInfo pFVisibleInfo) {
        this.viewId = str;
        this.visibility = str2;
        this.width = num;
        this.height = num2;
        this.alpha = f;
        this.token = map;
        this.realVisble = c0s46;
        this.parentInfo = pFVisibleInfo;
        this.viewLink$delegate = C452501pT.LIZIZ(new AwS555S0100000_11(this, 375));
        this.errorType$delegate = C452501pT.LIZIZ(new AwS555S0100000_11(this, 374));
    }
}
