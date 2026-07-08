package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1720106oR;
import X.C1950707kX;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Intent;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileFollowerListAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "profile_follower_list";
    }

    @Override // X.AbstractC1951007ka, com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileFollowerListAction", "onSuccess");
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before build inner url = ");
        sbLIZ.append(str);
        sbLIZ.append(" , ");
        sbLIZ.append(map);
        C1720106oR.LJI("ProfileFollowerListAction", C2188811AlT.LIZIZ(sbLIZ));
        Object obj = map.get("push_uids");
        if (obj == null) {
            obj = "";
        }
        map.put("notice_uids", obj);
        map.put("enter_from", "push");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("after build inner url = ");
        sbLIZ2.append(str);
        sbLIZ2.append(" , ");
        sbLIZ2.append(map);
        C1720106oR.LJI("ProfileFollowerListAction", C2188811AlT.LIZIZ(sbLIZ2));
        return new Pair<>("//profile/followerlist", map);
    }
}
