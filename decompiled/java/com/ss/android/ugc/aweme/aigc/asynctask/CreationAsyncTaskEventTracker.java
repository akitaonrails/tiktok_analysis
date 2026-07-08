package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C01GW;
import X.C04TD;
import X.C09JB;
import X.C0C64;
import X.C123100dR;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2341909Fp;
import X.C452501pT;
import X.C556890Lsl;
import X.C556900Lsm;
import X.C556910Lsn;
import X.C556920Lso;
import X.C556930Lsp;
import X.InterfaceC2342209Fs;
import X.InterfaceC543440LTa;
import com.ss.android.ugc.aweme.aigc.asynctask.utils.IAIGCDebugToolLogger;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.trace.api.TraceLogApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationAsyncTaskEventTracker implements ICreationAsyncTaskEventTracker {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(48));

    public static ICreationAsyncTaskEventTracker LIZIZ() {
        Object objLIZ = C04TD.LIZ(ICreationAsyncTaskEventTracker.class, false);
        if (objLIZ != null) {
            return (ICreationAsyncTaskEventTracker) objLIZ;
        }
        if (C04TD.LL == null) {
            synchronized (ICreationAsyncTaskEventTracker.class) {
                if (C04TD.LL == null) {
                    C04TD.LL = new CreationAsyncTaskEventTracker();
                }
            }
        }
        return C04TD.LL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskEventTracker
    public final void LIZ(InterfaceC543440LTa interfaceC543440LTa, Map<String, String> map) {
        Pair pair;
        String str;
        if (interfaceC543440LTa instanceof C556930Lsp) {
            C556930Lsp c556930Lsp = (C556930Lsp) interfaceC543440LTa;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("client_task_id", c556930Lsp.LIZ), new Pair("task_type", c556930Lsp.LIZIZ), new Pair("business", c556930Lsp.LIZJ));
            String str2 = c556930Lsp.LJFF;
            if (str2 != null) {
                mapLJIIJ.put("trigger_type", str2);
            }
            String str3 = c556930Lsp.LJI;
            if (str3 != null) {
                mapLJIIJ.put("resource_id", str3);
            }
            String str4 = c556930Lsp.LJII;
            if (str4 != null) {
                mapLJIIJ.put("device_id", str4);
            }
            String str5 = c556930Lsp.LJIIIIZZ;
            if (str5 != null) {
                mapLJIIJ.put("user_id", str5);
            }
            String str6 = c556930Lsp.LJ;
            if (str6 != null) {
                mapLJIIJ.put("creation_id", str6);
            }
            String str7 = c556930Lsp.LIZLLL;
            if (C123100dR.LIZ(str7) && str7 != null) {
                mapLJIIJ.put("business_task_type", str7);
            }
            pair = new Pair("ai_task_start", mapLJIIJ);
        } else if (interfaceC543440LTa instanceof C556920Lso) {
            C556920Lso c556920Lso = (C556920Lso) interfaceC543440LTa;
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("client_task_id", c556920Lso.LIZ), new Pair("task_type", c556920Lso.LIZIZ), new Pair("business", c556920Lso.LIZJ), new Pair("is_retry", String.valueOf(c556920Lso.LJ)));
            String str8 = c556920Lso.LJIIIZ;
            if (str8 != null) {
                mapLJIIJ2.put("trigger_type", str8);
            }
            String str9 = c556920Lso.LJI;
            if (str9 != null) {
                mapLJIIJ2.put("resource_id", str9);
            }
            String str10 = c556920Lso.LJII;
            if (str10 != null) {
                mapLJIIJ2.put("device_id", str10);
            }
            String str11 = c556920Lso.LJIIIIZZ;
            if (str11 != null) {
                mapLJIIJ2.put("user_id", str11);
            }
            String str12 = c556920Lso.LJFF;
            if (str12 != null) {
                mapLJIIJ2.put("creation_id", str12);
            }
            String str13 = c556920Lso.LIZLLL;
            if (C123100dR.LIZ(str13) && str13 != null) {
                mapLJIIJ2.put("business_task_type", str13);
            }
            pair = new Pair("ai_subtask_start", mapLJIIJ2);
        } else if (interfaceC543440LTa instanceof C556910Lsn) {
            C556910Lsn c556910Lsn = (C556910Lsn) interfaceC543440LTa;
            Map mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("client_task_id", c556910Lsn.LIZ), new Pair("task_type", c556910Lsn.LJFF), new Pair("business", c556910Lsn.LIZIZ), new Pair("server_task_id", c556910Lsn.LIZJ));
            Integer num = c556910Lsn.LJI;
            if (num != null) {
                mapLJIIJ3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(num.intValue()));
            }
            String str14 = c556910Lsn.LJII;
            if (str14 != null) {
                mapLJIIJ3.put("trigger_type", str14);
            }
            String str15 = c556910Lsn.LJIIIIZZ;
            if (str15 != null) {
                mapLJIIJ3.put("resource_id", str15);
            }
            String str16 = c556910Lsn.LJIIIZ;
            if (str16 != null) {
                mapLJIIJ3.put("device_id", str16);
            }
            String str17 = c556910Lsn.LJIIJ;
            if (str17 != null) {
                mapLJIIJ3.put("user_id", str17);
            }
            Integer num2 = c556910Lsn.LJIIJJI;
            if (num2 != null) {
                mapLJIIJ3.put("error_code", String.valueOf(num2.intValue()));
            }
            String str18 = c556910Lsn.LJIIL;
            if (str18 != null) {
                mapLJIIJ3.put("error_msg", str18);
            }
            Long l = c556910Lsn.LJIILIIL;
            if (l != null) {
                mapLJIIJ3.put("duration_ms", String.valueOf(l.longValue()));
            }
            String str19 = c556910Lsn.LJ;
            if (str19 != null) {
                mapLJIIJ3.put("creation_id", str19);
            }
            String str20 = c556910Lsn.LIZLLL;
            if (C123100dR.LIZ(str20) && str20 != null) {
                mapLJIIJ3.put("business_task_type", str20);
            }
            String str21 = c556910Lsn.LJIILJJIL;
            if (str21 != null) {
                mapLJIIJ3.put("is_offline_loading", str21);
            }
            pair = new Pair("ai_task_cancel", mapLJIIJ3);
        } else if (interfaceC543440LTa instanceof C556900Lsm) {
            C556900Lsm c556900Lsm = (C556900Lsm) interfaceC543440LTa;
            Map mapLJIIJ4 = C2097608Jq.LJIIJ(new Pair("client_task_id", c556900Lsm.LIZ), new Pair("business", c556900Lsm.LIZJ), new Pair("task_type", c556900Lsm.LIZIZ), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(c556900Lsm.LJ)), new Pair("server_task_id", c556900Lsm.LJFF));
            String str22 = c556900Lsm.LJII;
            if (str22 != null) {
                mapLJIIJ4.put("trigger_type", str22);
            }
            String str23 = c556900Lsm.LJIIIIZZ;
            if (str23 != null) {
                mapLJIIJ4.put("resource_id", str23);
            }
            String str24 = c556900Lsm.LJIIIZ;
            if (str24 != null) {
                mapLJIIJ4.put("device_id", str24);
            }
            String str25 = c556900Lsm.LJIIJ;
            if (str25 != null) {
                mapLJIIJ4.put("user_id", str25);
            }
            Integer num3 = c556900Lsm.LJIIJJI;
            if (num3 != null) {
                mapLJIIJ4.put("error_code", String.valueOf(num3.intValue()));
            }
            String str26 = c556900Lsm.LJIIL;
            if (str26 != null) {
                mapLJIIJ4.put("error_msg", str26);
            }
            Long l2 = c556900Lsm.LJIILIIL;
            if (l2 != null) {
                mapLJIIJ4.put("duration_ms", String.valueOf(l2.longValue()));
            }
            String str27 = c556900Lsm.LJIILJJIL;
            if (str27 != null) {
                mapLJIIJ4.put("enter_from", str27);
            }
            String str28 = c556900Lsm.LJIILL;
            if (str28 != null) {
                mapLJIIJ4.put("log_id", str28);
            }
            String str29 = c556900Lsm.LJI;
            if (str29 != null) {
                mapLJIIJ4.put("creation_id", str29);
            }
            String str30 = c556900Lsm.LIZLLL;
            if (C123100dR.LIZ(str30) && str30 != null) {
                mapLJIIJ4.put("business_task_type", str30);
            }
            String str31 = c556900Lsm.LJIILLIIL;
            if (str31 != null) {
                mapLJIIJ4.put("is_offline_loading", str31);
            }
            pair = new Pair("ai_task_end", mapLJIIJ4);
        } else if (interfaceC543440LTa instanceof C556890Lsl) {
            C556890Lsl c556890Lsl = (C556890Lsl) interfaceC543440LTa;
            Map mapLJIIJ5 = C2097608Jq.LJIIJ(new Pair("client_task_id", c556890Lsl.LIZ), new Pair("task_type", c556890Lsl.LIZIZ), new Pair("business", c556890Lsl.LIZJ), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(c556890Lsl.LJ)), new Pair("server_task_id", c556890Lsl.LJFF), new Pair("is_retry", String.valueOf(c556890Lsl.LJI)));
            String str32 = c556890Lsl.LJIILLIIL;
            if (str32 != null) {
                mapLJIIJ5.put("trigger_type", str32);
            }
            String str33 = c556890Lsl.LJIIIIZZ;
            if (str33 != null) {
                mapLJIIJ5.put("resource_id", str33);
            }
            String str34 = c556890Lsl.LJIIIZ;
            if (str34 != null) {
                mapLJIIJ5.put("device_id", str34);
            }
            String str35 = c556890Lsl.LJIIJ;
            if (str35 != null) {
                mapLJIIJ5.put("user_id", str35);
            }
            Integer num4 = c556890Lsl.LJIIJJI;
            if (num4 != null) {
                mapLJIIJ5.put("error_code", String.valueOf(num4.intValue()));
            }
            String str36 = c556890Lsl.LJIIL;
            if (str36 != null) {
                mapLJIIJ5.put("error_msg", str36);
            }
            Long l3 = c556890Lsl.LJIILIIL;
            if (l3 != null) {
                mapLJIIJ5.put("duration_ms", String.valueOf(l3.longValue()));
            }
            String str37 = c556890Lsl.LJIILJJIL;
            if (str37 != null) {
                mapLJIIJ5.put("enter_from", str37);
            }
            String str38 = c556890Lsl.LJIILL;
            if (str38 != null) {
                mapLJIIJ5.put("log_id", str38);
            }
            String str39 = c556890Lsl.LJII;
            if (str39 != null) {
                mapLJIIJ5.put("creation_id", str39);
            }
            String str40 = c556890Lsl.LIZLLL;
            if (C123100dR.LIZ(str40) && str40 != null) {
                mapLJIIJ5.put("business_task_type", str40);
            }
            pair = new Pair("ai_subtask_end", mapLJIIJ5);
        } else {
            throw new C1954807lC();
        }
        String str41 = (String) pair.getFirst();
        Map map2 = (Map) pair.getSecond();
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.putAll(map);
            map2 = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        linkedHashMap2.put("from_new_arch_refactor", CardStruct.IStatusCode.DEFAULT);
        IAIGCDebugToolLogger iAIGCDebugToolLoggerLIZ = C09JB.LIZ();
        if (iAIGCDebugToolLoggerLIZ != null) {
            iAIGCDebugToolLoggerLIZ.LIZ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_effect_log_collection", true, false)) {
            String str42 = (String) linkedHashMap2.get("business");
            if (str42 == null || str42.length() <= 0) {
                str42 = "tofix";
            }
            if (Intrinsics.LJFF(str42, Source.EFFECT_AIGC.getSource()) && (str = (String) linkedHashMap2.get("client_task_id")) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                TraceLogApi traceLogApi = (TraceLogApi) this.LIZ.getValue();
                if (traceLogApi != null) {
                    String str43 = (String) linkedHashMap2.get("task_type");
                    if (str43 == null || str43.length() <= 0) {
                        str43 = "tofix";
                    }
                    traceLogApi.LIZIZ(str, str42, str43, "aigc", str41, jCurrentTimeMillis, "debug", linkedHashMap2);
                }
            }
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ(str41, new LinkedHashMap(linkedHashMap2));
    }
}
