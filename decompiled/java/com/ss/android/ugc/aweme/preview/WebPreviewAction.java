package com.ss.android.ugc.aweme.preview;

import X.AbstractC1950107kR;
import X.C1950707kX;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class WebPreviewAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "web_preview";
    }

    @Override // X.AbstractC1951007ka, com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//previewDraftVideo", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService == null || !iMainService.isAppHot()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
