package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessActionBarResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("action_bar")
    public final List<ActionBarButtonConfBusiness> actionBarConf;

    public BusinessActionBarResponse() {
        this(null);
    }

    public final BusinessActionBarResponse copy(List<ActionBarButtonConfBusiness> list) {
        return new BusinessActionBarResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessActionBarResponse) && Intrinsics.LJFF(this.actionBarConf, ((BusinessActionBarResponse) obj).actionBarConf);
    }

    public int hashCode() {
        List<ActionBarButtonConfBusiness> list = this.actionBarConf;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessActionBarResponse(actionBarConf=");
        sbLIZ.append(this.actionBarConf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ActionBarButtonConfBusiness> getActionBarConf() {
        return this.actionBarConf;
    }

    public BusinessActionBarResponse(List<ActionBarButtonConfBusiness> list) {
        this.actionBarConf = list;
    }
}
