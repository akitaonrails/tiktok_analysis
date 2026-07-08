package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtraFeeStatement {

    @C09CT("arguments")
    public Map<String, ExtraFeeRichText> arguments;

    @C09CT("template")
    public String template;

    public ExtraFeeStatement() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraFeeStatement)) {
            return false;
        }
        ExtraFeeStatement extraFeeStatement = (ExtraFeeStatement) obj;
        return Intrinsics.LJFF(this.template, extraFeeStatement.template) && Intrinsics.LJFF(this.arguments, extraFeeStatement.arguments);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, ExtraFeeRichText> map = this.arguments;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraFeeStatement(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtraFeeStatement(String str, Map<String, ExtraFeeRichText> map) {
        this.template = str;
        this.arguments = map;
    }
}
