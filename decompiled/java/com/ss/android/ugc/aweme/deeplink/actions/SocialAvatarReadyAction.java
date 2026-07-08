package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialAvatarReadyAction extends AbstractC1950107kR<Unit> {
    public final String LIZLLL = "from_user_id";

    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "social_avatar_ready";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>(str, map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        String uid;
        Object obj = map.get(this.LIZLLL);
        String str2 = "";
        if (obj == null) {
            obj = "";
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null && (uid = curUser.getUid()) != null) {
            str2 = uid;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && Intrinsics.LJFF(obj, str2)) {
            super.LIZ(context, str, map, arrayList);
            return true;
        }
        try {
            SmartRouter.buildRoute(context, "//main").open();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }
}
