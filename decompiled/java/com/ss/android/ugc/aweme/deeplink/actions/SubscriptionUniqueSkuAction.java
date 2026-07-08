package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C10Y9;
import X.C1950707kX;
import X.C2188811AlT;
import X.InterfaceC20673515v3;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SubscriptionUniqueSkuAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String strLJLJI;
        String uid;
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        User currentUser;
        Object obj = "";
        if (C10Y9.LIZJ()) {
            Object obj2 = map.get("user_id");
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                uid = null;
            }
            if (!Intrinsics.LJFF(obj2, uid) || (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (strLJLJI = interfaceC20673515v3K4.LJLJI()) == null) {
                strLJLJI = "";
            }
        } else {
            strLJLJI = "sslocal://main?from_sub_sku_email=1";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJLJI);
        Object obj3 = map.get("from_id");
        if (obj3 == null) {
            obj3 = "";
        }
        Object obj4 = map.get("display_id");
        if (obj4 == null) {
            obj4 = "";
        }
        Object obj5 = map.get("sec_anchor_id");
        if (obj5 == null) {
            obj5 = "";
        }
        map.get("anchor_id");
        Object obj6 = map.get("user_id");
        if (obj6 == null) {
            obj6 = "";
        }
        Object obj7 = map.get("sec_user_id");
        if (obj7 != null) {
            obj = obj7;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&from_id=");
        sbLIZ2.append(obj3);
        sbLIZ2.append("&display_id=");
        sbLIZ2.append(obj4);
        sbLIZ2.append("&sec_anchor_id=");
        sbLIZ2.append(obj5);
        sbLIZ2.append("&anchor_id=");
        sbLIZ2.append(obj5);
        sbLIZ2.append("&user_id=");
        sbLIZ2.append(obj6);
        sbLIZ2.append("&sec_user_id=");
        sbLIZ2.append(obj);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), map);
    }
}
