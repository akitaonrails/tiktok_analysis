package com.ss.android.ugc.aweme.im.chatlist.impl.feature.groupchat.recommend.data;

import X.C098200Yq;
import X.C0PEM;
import X.C1226980i2C;
import X.C1227130i2R;
import X.C1227904rF;
import X.C1229240i5q;
import X.C1229420i68;
import X.C1309605Ao;
import X.C13BV;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC913760Zt0;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feature.newselector.config.newconversation.RecomReasonData;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS9S1001000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class OpenCreateGroupPanelRoute implements IRouteAction {
    public static final int $stable = 0;
    public static final C1229240i5q Companion = new Object() { // from class: X.0i5q
    };

    private final void reportInboxEntranceClick() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1309605Ao(2, 1, null), 3);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        List listLJJLIIIJILLIZJL;
        String string;
        String string2;
        int iIntValue;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        EnumC913760Zt0 enumC913760Zt0LIZJ;
        String string8;
        String string9;
        String string10;
        String string11;
        Object c098200Yq;
        String string12;
        String string13;
        Integer numLJIIJJI;
        String string14;
        if (context == null) {
            return Boolean.FALSE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open recommend new group panel, url: ");
        sbLIZ.append(str);
        sbLIZ.append(", extra: ");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bundle == null || (string14 = bundle.getString("uids")) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string14, new String[]{","}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        if (bundle == null || (string = bundle.getString("recom_type")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("panel_name")) == null) {
            string2 = "";
        }
        if (bundle != null && (string13 = bundle.getString("entrance_id")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string13)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else if (bundle != null) {
            iIntValue = bundle.getInt("entrance_id");
        } else {
            iIntValue = 0;
        }
        if (bundle == null || (string3 = bundle.getString("recom_reason_copy")) == null) {
            string3 = "";
        }
        if (bundle == null || (string4 = bundle.getString("data_source")) == null) {
            string4 = "";
        }
        if (bundle == null || (string5 = bundle.getString("rec_id")) == null) {
            string5 = "";
        }
        if (bundle == null || (string6 = bundle.getString("cluster_id")) == null) {
            string6 = "";
        }
        if (bundle == null || (string7 = bundle.getString("cluster_score")) == null) {
            string7 = "";
        }
        if (bundle == null || (string12 = bundle.getString("group_type", "")) == null || (enumC913760Zt0LIZJ = C1229420i68.LIZJ(string12)) == null) {
            enumC913760Zt0LIZJ = EnumC913760Zt0.NORMAL_GROUP_CHAT;
        }
        String string15 = null;
        if (bundle != null) {
            string8 = bundle.getString("recom_show_scene", "");
        } else {
            string8 = null;
        }
        if (bundle != null) {
            string9 = bundle.getString("is_full_screen", "");
        } else {
            string9 = null;
        }
        Intrinsics.LJFF(string9, "1");
        if (bundle != null) {
            string10 = bundle.getString("should_reduce_recom", "");
        } else {
            string10 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string10, "1");
        if (bundle != null) {
            string11 = bundle.getString("recom_reason_data", "");
        } else {
            string11 = null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (RecomReasonData) C1227904rF.LIZIZ(string11, RecomReasonData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        RecomReasonData recomReasonData = (RecomReasonData) c098200Yq;
        if (bundle != null) {
            string15 = bundle.getString("send_invite_after_created_success", "");
        }
        C1227130i2R.LIZLLL(context, new C1226980i2C(context, C2097608Jq.LJIIIIZZ(new Pair("data_source", string4), new Pair("rec_id", string5), new Pair("cluster_id", string6), new Pair("cluster_score", string7), new Pair("rec_type", string), new Pair("create_channel", "recommendation_cell")), null, "notification_page", string2, true, listLJJLIIIJILLIZJL, null, enumC913760Zt0LIZJ, false, null, new AwS9S1001000_19(string8, iIntValue, 0), null, false, listLJJLIIIJILLIZJL, string3, null, string5, recomReasonData, zLJFF, Intrinsics.LJFF(string15, "1"), true, null, 2015722788), "im", "inbox_recommend", "native");
        if (iIntValue > 0) {
            reportInboxEntranceClick();
        }
        return Boolean.TRUE;
    }
}
