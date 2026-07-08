package com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C2188811AlT;
import X.C960203pA;
import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommonColor implements Serializable {

    @C09CT("dark")
    public String dark;

    @C09CT("light")
    public String light;

    @C09CT("name")
    public final String name;

    public CommonColor() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonColor)) {
            return false;
        }
        CommonColor commonColor = (CommonColor) obj;
        return Intrinsics.LJFF(this.name, commonColor.name) && Intrinsics.LJFF(this.light, commonColor.light) && Intrinsics.LJFF(this.dark, commonColor.dark);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.light;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dark;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonColor(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer parseColor() {
        return LIZ(this.light);
    }

    public static Integer LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public final void setDark(String str) {
        this.dark = str;
    }

    public final void setLight(String str) {
        this.light = str;
    }

    public final Integer parseColor(Context context, boolean z) {
        if (z && C960203pA.LIZIZ(context)) {
            Integer numLIZ = LIZ(this.dark);
            if (numLIZ == null) {
                return LIZ(this.light);
            }
            return numLIZ;
        }
        return LIZ(this.light);
    }

    public CommonColor(String str, String str2, String str3) {
        this.name = str;
        this.light = str2;
        this.dark = str3;
    }
}
