package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.preload;

import X.C04TD;
import X.C0LE8;
import X.C1429050nI7;
import X.C531760KtK;
import android.app.Activity;
import com.ss.android.ugc.aweme.services.IUgcPreloadTemplateService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS185S1100000_2;
import kotlin.jvm.internal.AwS7S1301000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UgcPreloadTemplateServiceImpl implements IUgcPreloadTemplateService {
    public static IUgcPreloadTemplateService LIZ() {
        Object objLIZ = C04TD.LIZ(IUgcPreloadTemplateService.class, false);
        if (objLIZ != null) {
            return (IUgcPreloadTemplateService) objLIZ;
        }
        if (C04TD.J5 == null) {
            synchronized (IUgcPreloadTemplateService.class) {
                if (C04TD.J5 == null) {
                    C04TD.J5 = new UgcPreloadTemplateServiceImpl();
                }
            }
        }
        return C04TD.J5;
    }

    @Override // com.ss.android.ugc.aweme.services.IUgcPreloadTemplateService
    public final void preloadTemplate(Activity activity, String str, int i, String str2, Function2<? super String, ? super String, Unit> function2, Function0<Unit> function0) {
        Pair pair;
        C0LE8.LIZIZ(null);
        if (Intrinsics.LJFF(str2, "mdp_square")) {
            pair = new Pair("item", "mdp");
        } else if (i != 36 && i != 24) {
            if (i == 40) {
                pair = new Pair("item", "tt_template");
            } else {
                pair = new Pair("item", "tt_template");
            }
        } else {
            pair = new Pair("anchor", null);
        }
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        C1429050nI7.LIZ.getClass();
        C531760KtK.LIZ(str, C1429050nI7.LIZ(), 2, str3, str4, new AwS7S1301000_8(str, (String) function2, (Function2<? super String, ? super String, Unit>) this, (UgcPreloadTemplateServiceImpl) activity, (Activity) i, 0), new AwS185S1100000_2(str, (String) function0, (Function0<Unit>) 1));
    }
}
