package com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview;

import X.AbstractC1950107kR;
import X.C1428460nHA;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class TemplateUseAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//startUseTemplate", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        C1428460nHA c1428460nHA = C1428460nHA.LIZ;
        if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
