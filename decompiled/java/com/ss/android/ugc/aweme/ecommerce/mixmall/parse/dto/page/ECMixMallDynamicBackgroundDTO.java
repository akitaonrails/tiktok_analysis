package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page;

import X.C09CT;
import com.google.gson.k;
import com.google.gson.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class ECMixMallDynamicBackgroundDTO {

    @C09CT("default_bar_styles")
    public List<ECMixMallDynamicBarStyleDTO> defaultBarStyles;

    @C09CT("default_colors")
    public List<ECMixMallDynamicColorDTO> defaultColors;

    @C09CT("enable")
    public k enable;

    public final boolean LIZ() {
        k kVar = this.enable;
        if (kVar == null || !(kVar instanceof q)) {
            return false;
        }
        q qVarLJIILJJIL = kVar.LJIILJJIL();
        Object obj = qVarLJIILJJIL.LL;
        if (obj instanceof Boolean) {
            return qVarLJIILJJIL.LJ();
        }
        if (obj instanceof Number) {
            return qVarLJIILJJIL.LJIIJJI() == 1;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        String strLJIL = qVarLJIILJJIL.LJIL();
        return Intrinsics.LJFF(strLJIL, "1") || u.LJIJI(strLJIL, "true", true);
    }
}
