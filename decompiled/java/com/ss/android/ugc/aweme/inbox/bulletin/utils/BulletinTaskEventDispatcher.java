package com.ss.android.ugc.aweme.inbox.bulletin.utils;

import X.C098200Yq;
import X.C0OJB;
import X.C0OPX;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C397901gf;
import X.C620070OTt;
import X.C620120OTy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTaskEventDispatcher implements BulletinTaskEventAbility {
    public final Function0<C620070OTt> LL;

    public BulletinTaskEventDispatcher(C0OJB c0ojb) {
        this.LL = c0ojb;
    }

    public final void LIZ(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Object c098200Yq;
        C620070OTt c620070OTtInvoke = this.LL.invoke();
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("bulletin_board_id", c620070OTtInvoke.LIZ), new Pair("bulletin_channel_status", c620070OTtInvoke.LIZIZ), new Pair("bulletin_identity", c620070OTtInvoke.LIZJ), new Pair("bulletin_subscribe_status", c620070OTtInvoke.LIZLLL), new Pair("bulletin_creator_id", c620070OTtInvoke.LJ), new Pair("bulletin_user_id", c620070OTtInvoke.LJFF), new Pair("bulletin_quota", c620070OTtInvoke.LJI));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", str);
        jSONObject.put("basic_params", new JSONObject(mapLJIIIIZZ));
        jSONObject.put("event_params", new JSONObject(map));
        if (map2 != null) {
            jSONObject.put("extra_params", new JSONObject(map2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTaskEventDispatcher enqueueStandardEvent eventName=");
        sbLIZ.append(str);
        sbLIZ.append(", payload=");
        sbLIZ.append(jSONObject);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "bb_standard_event"));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinTaskEventDispatcher enqueue ");
            sbLIZ2.append(str);
            sbLIZ2.append(" failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility
    public final void G02(String str, Map map, Map map2, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTaskEventDispatcher dispatchChannelModifyComplete success=");
        sbLIZ.append(z);
        sbLIZ.append(", modifyType=");
        sbLIZ.append(str);
        sbLIZ.append(", interactionParams=");
        sbLIZ.append(map);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        BulletinTaskEventAbility.LJJIJ.getClass();
        if (!C620120OTy.LIZJ.contains(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinTaskEventDispatcher unknown modify_type=");
            sbLIZ2.append(str);
            sbLIZ2.append(", skip");
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", str2);
        pairArr[1] = new Pair("modify_type", str);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (map != null) {
            mapLJIIJ.put("interaction_params", new JSONObject(map));
        }
        LIZ("channel_modify_complete_event", mapLJIIJ, map2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility
    public final void gQ1(String str, Map map, Map map2, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTaskEventDispatcher dispatchInteractionComplete success=");
        sbLIZ.append(z);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(str);
        sbLIZ.append(", interactionParams=");
        sbLIZ.append(map);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        BulletinTaskEventAbility.LJJIJ.getClass();
        if (!C620120OTy.LIZIZ.contains(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinTaskEventDispatcher unknown interaction_type=");
            sbLIZ2.append(str);
            sbLIZ2.append(", skip");
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", str2);
        pairArr[1] = new Pair("interaction_type", str);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (map != null) {
            mapLJIIJ.put("interaction_params", new JSONObject(map));
        }
        LIZ("interaction_complete_event", mapLJIIJ, map2);
    }
}
