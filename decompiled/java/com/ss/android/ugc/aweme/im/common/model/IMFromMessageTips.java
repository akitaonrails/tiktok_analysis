package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMFromMessageTips {

    @C09CT("extra")
    public Map<String, String> extras;

    @C09CT("template")
    public List<IMActionTemplate> template;

    @C09CT("tips")
    public String tips;

    public IMFromMessageTips() {
        this(null, null, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMFromMessageTips)) {
            return false;
        }
        IMFromMessageTips iMFromMessageTips = (IMFromMessageTips) obj;
        return Intrinsics.LJFF(this.tips, iMFromMessageTips.tips) && Intrinsics.LJFF(this.template, iMFromMessageTips.template) && Intrinsics.LJFF(this.extras, iMFromMessageTips.extras);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMFromMessageTips(tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.extras);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMFromMessageTips(String str, List<IMActionTemplate> list, Map<String, String> map) {
        this.tips = str;
        this.template = list;
        this.extras = map;
    }
}
