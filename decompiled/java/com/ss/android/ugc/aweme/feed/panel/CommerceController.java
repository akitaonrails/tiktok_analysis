package com.ss.android.ugc.aweme.feed.panel;

import X.C0SUC;
import X.C1AF0;
import X.C2188811AlT;
import X.C2189821An6;
import X.C737030Svd;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.BaseController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class CommerceController extends BaseController {
    public final void LLFII(C737030Svd c737030Svd) {
        Context context;
        Aweme aweme = (Aweme) c737030Svd.LIZIZ;
        if (!TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getAuthor() == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ECCommerce , author is null and awemeid is ");
                sbLIZ.append(aweme.getAid());
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (!AwemeExtKt.hasPromotion(aweme) || (context = getContext()) == null) {
                return;
            }
            C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
            if (!TextUtils.isEmpty(c2189821An6LIZ.getEntranceInfo())) {
                c2189821An6LIZ.getEntranceInfo();
                return;
            }
            try {
                new JSONObject(c2189821An6LIZ.getTracker()).optString("entrance_info");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public CommerceController(String str, int i) {
        super(str, i);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final void onAttach(Activity activity, Fragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }
}
