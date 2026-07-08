package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C09R4;
import X.C0LAB;
import X.C0LOG;
import X.C0LOV;
import X.C0LP2;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1619110sEf;
import X.C1908480zlO;
import X.C19719612Di;
import X.C20684815ws;
import X.C20714089o;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C542230LOj;
import X.C542260LOm;
import X.C542280LOo;
import X.C542350LOv;
import X.C542390LOz;
import X.C546820LcW;
import X.C547140Ld2;
import X.InterfaceC19330810jy;
import X.InterfaceC542330LOt;
import X.InterfaceC542340LOu;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class NoticeServiceImpl implements NoticeService {
    public final List<InterfaceC542340LOu<?>> LIZ = new ArrayList();
    public final C542350LOv LIZIZ = new C542350LOv();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(175));

    public final List<String> LIZJ() {
        List<InterfaceC542340LOu<?>> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC542340LOu interfaceC542340LOu : (ArrayList) list) {
            List<String> listLIZ = interfaceC542340LOu.LIZ();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            for (String str : listLIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC542340LOu.getBusinessType());
                sbLIZ.append('/');
                sbLIZ.append(str);
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aigc.NoticeService
    public final void LIZIZ(Function1<? super C542260LOm, Unit> function1) {
        C542260LOm c542260LOm = new C542260LOm();
        function1.invoke(c542260LOm);
        List<? extends InterfaceC542340LOu<?>> list = c542260LOm.LIZ;
        List<InterfaceC542340LOu<?>> list2 = this.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getClass());
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC542340LOu<?> interfaceC542340LOu : list) {
            if (!setLLIIJI.contains(interfaceC542340LOu.getClass())) {
                arrayList2.add(interfaceC542340LOu);
            }
        }
        List<? extends C0LP2<?>> list3 = c542260LOm.LIZIZ;
        Set<Class<?>> set = this.LIZIZ.LIZ;
        ArrayList<C0LP2> arrayList3 = new ArrayList();
        for (C0LP2<?> c0lp2 : list3) {
            if (!set.contains(c0lp2.getClass())) {
                arrayList3.add(c0lp2);
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ((ArrayList) this.LIZ).addAll(arrayList2);
        C542350LOv c542350LOv = this.LIZIZ;
        c542350LOv.getClass();
        if (!arrayList3.isEmpty()) {
            for (final C0LP2 c0lp22 : arrayList3) {
                c542350LOv.LIZ.add(c0lp22.getClass());
                final C542390LOz c542390LOz = new C542390LOz(c0lp22.LJ(), c0lp22.LIZ());
                C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
                c1908480zlO.LJ(new InterfaceC19330810jy(c0lp22, c542390LOz) { // from class: X.0LP0
                    public final C0LP2<PARAMS> LL;
                    public final C542390LOz<PARAMS> LLILLJJLI;
                    public final int[] LLILLL;

                    @Override // X.InterfaceC19330810jy
                    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                        return false;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LJFF(InnerPushMessage innerPushMessage) {
                        return true;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                        return null;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final int[] LIZJ() {
                        return this.LLILLL;
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                        PARAMS paramsLIZ = this.LLILLJJLI.LIZ(innerPushMessage);
                        if (paramsLIZ == null) {
                            return true;
                        }
                        return this.LL.LIZJ(new C0LP1(this.LLILLJJLI.LJ), innerPushMessage, paramsLIZ);
                    }

                    @Override // X.InterfaceC19330810jy
                    public final boolean LJI(InnerPushMessage innerPushMessage) {
                        if (C1906580ziK.LJI()) {
                            C542380LOy.LIZJ(innerPushMessage, false, "in_background");
                            return false;
                        }
                        PARAMS paramsLIZ = this.LLILLJJLI.LIZ(innerPushMessage);
                        if (paramsLIZ == null) {
                            C542380LOy.LIZJ(innerPushMessage, false, "deserialize_failed");
                            return false;
                        }
                        C0LP4 c0lp4LIZLLL = this.LL.LIZLLL(new C0LP1(this.LLILLJJLI.LJ), innerPushMessage, paramsLIZ);
                        C542380LOy.LIZJ(innerPushMessage, c0lp4LIZLLL.LIZ, c0lp4LIZLLL.LIZIZ);
                        return c0lp4LIZLLL.LIZ;
                    }

                    {
                        this.LL = c0lp22;
                        this.LLILLJJLI = c542390LOz;
                        this.LLILLL = c0lp22.LIZ();
                    }
                });
                c1908480zlO.LJIILL(new C1619110sEf(c0lp22, c542390LOz) { // from class: X.0LP3
                    public final C0LP2<PARAMS> LL;
                    public final C542390LOz<PARAMS> LLILLJJLI;

                    @Override // X.C1619110sEf, X.InterfaceC20643015q8
                    public final void LIZIZ(InnerPushMessage innerPushMessage) {
                        PARAMS paramsLIZ;
                        if (innerPushMessage == null || (paramsLIZ = this.LLILLJJLI.LIZ(innerPushMessage)) == null) {
                            return;
                        }
                        this.LL.we(paramsLIZ);
                    }

                    {
                        this.LL = c0lp22;
                        this.LLILLJJLI = c542390LOz;
                    }

                    @Override // X.C1619110sEf, X.InterfaceC20643015q8
                    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
                        PARAMS paramsLIZ;
                        if (innerPushMessage == null || (paramsLIZ = this.LLILLJJLI.LIZ(innerPushMessage)) == null) {
                            return;
                        }
                        this.LL.LIZIZ(paramsLIZ, z);
                    }
                }, c0lp22.LIZ());
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registered processor: paramsClass=");
                sbLIZ.append(c0lp22.LJ().getSimpleName());
                sbLIZ.append(", pushTypes=");
                sbLIZ.append(C13LQ.LJJLJ(c0lp22.LIZ()));
                c547140Ld2.LIZ("AIGCInnerPushDelegate", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init: added ");
        sbLIZ2.append(arrayList2.size());
        sbLIZ2.append(" route processors, ");
        sbLIZ2.append(arrayList3.size());
        sbLIZ2.append(" innerPush processors, total registered routes: ");
        sbLIZ2.append(LIZJ());
        c547140Ld22.LIZ("NoticeServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.aigc.NoticeService
    public final void onEventV3(String str, Map<String, String> map) {
        C20684815ws.LJIILLIIL(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // com.ss.android.ugc.aweme.aigc.NoticeService
    public final void LIZ(C542230LOj c542230LOj, String str, String str2, String str3) {
        ?? LJ;
        Object next;
        InterfaceC542330LOt interfaceC542330LOtLIZIZ = c542230LOj.LIZIZ("NoticeServiceImpl");
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
            LJ = new LinkedHashMap();
            for (Object obj : sequenceLIZIZ) {
                LJ.put(obj, jSONObject.opt((String) obj));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ = C2097608Jq.LJ();
        }
        LIZLLL(str, str2, "started", "dispatch_begin", LJ);
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC542340LOu interfaceC542340LOu = (InterfaceC542340LOu) next;
                if (Intrinsics.LJFF(interfaceC542340LOu.getBusinessType(), str) && interfaceC542340LOu.LIZ().contains(str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC542340LOu interfaceC542340LOu2 = (InterfaceC542340LOu) next;
        if (interfaceC542340LOu2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatch failed: no processor for ");
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(str2);
            sbLIZ.append(", registered=");
            sbLIZ.append(LIZJ());
            interfaceC542330LOtLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL(str, str2, "failed", "no_processor", LJ);
            CreativeToolsBizPluginService.LIZ.getClass();
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ != null) {
                if (creativeToolsBizPluginServiceLIZ.LIZ()) {
                    IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                    if (iToolsDebugGpService != null) {
                        iToolsDebugGpService.isOpen();
                    }
                    C0LOG.LIZ(c542230LOj.LIZ);
                    return;
                }
                creativeToolsBizPluginServiceLIZ.LIZIZ(c542230LOj.LIZ, AIGC.AICreationSceneName.INBOX_SUCCESS_NO_DRAFT.INSTANCE.getValue(), true);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dispatch: matched ");
        sbLIZ2.append(interfaceC542340LOu2.getClass().getSimpleName());
        interfaceC542330LOtLIZIZ.d(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            Object objLJII = ((Gson) this.LIZJ.getValue()).LJII(str3, interfaceC542340LOu2.LIZJ());
            if (objLJII == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("dispatch failed: deserialization returned null, json=");
                sbLIZ3.append(str3);
                interfaceC542330LOtLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                LIZLLL(str, str2, "failed", "deserialize_null", LJ);
                IToolsDebugGpService iToolsDebugGpService2 = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                if (iToolsDebugGpService2 != null) {
                    iToolsDebugGpService2.isOpen();
                    return;
                }
                return;
            }
            List listLIZ = C20714089o.LIZ(objLJII);
            if (true ^ ((ArrayList) listLIZ).isEmpty()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("dispatch failed: required fields missing: ");
                sbLIZ4.append(listLIZ);
                sbLIZ4.append(", json=");
                sbLIZ4.append(str3);
                interfaceC542330LOtLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("missing_fields:");
                sbLIZ5.append(listLIZ);
                LIZLLL(str, str2, "failed", C2188811AlT.LIZIZ(sbLIZ5), LJ);
                IToolsDebugGpService iToolsDebugGpService3 = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                if (iToolsDebugGpService3 != null) {
                    iToolsDebugGpService3.isOpen();
                    return;
                }
                return;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("dispatch: deserialized ");
            sbLIZ6.append(interfaceC542340LOu2.LIZJ().getSimpleName());
            sbLIZ6.append(", calling process()");
            interfaceC542330LOtLIZIZ.d(C2188811AlT.LIZIZ(sbLIZ6));
            C542280LOo c542280LOoLIZIZ = interfaceC542340LOu2.LIZIZ(c542230LOj, objLJII);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("dispatch: process() ");
            sbLIZ7.append(c542280LOoLIZIZ.LIZ);
            sbLIZ7.append(", msg=");
            sbLIZ7.append(c542280LOoLIZIZ.LIZIZ);
            interfaceC542330LOtLIZIZ.d(C2188811AlT.LIZIZ(sbLIZ7));
            LIZLLL(str, str2, c542280LOoLIZIZ.LIZ, c542280LOoLIZIZ.LIZIZ, LJ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("dispatch failed: error, payload=");
            sbLIZ8.append(str3);
            interfaceC542330LOtLIZIZ.e(C2188811AlT.LIZIZ(sbLIZ8), e2);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("exception:");
            sbLIZ9.append(e2.getClass().getSimpleName());
            LIZLLL(str, str2, "failed", C2188811AlT.LIZIZ(sbLIZ9), LJ);
            IToolsDebugGpService iToolsDebugGpService4 = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService4 != null) {
                iToolsDebugGpService4.isOpen();
            }
        }
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, Map map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("business_type", str);
        c0lab.LJ("task_type", str2);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c0lab.LJ("msg", str4);
        for (Map.Entry entry : map.entrySet()) {
            c0lab.LIZLLL(entry.getValue(), (String) entry.getKey());
        }
        C20684815ws.LJIILLIIL("aikit_notice_route_dispatch", c0lab.LIZ);
    }
}
