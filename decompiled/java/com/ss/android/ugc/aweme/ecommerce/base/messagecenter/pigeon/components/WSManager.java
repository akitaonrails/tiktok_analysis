package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components;

import X.C034S;
import X.C0OFE;
import X.C0WKM;
import X.C0WKN;
import X.C0XE0;
import X.C0XE1;
import X.C0YWT;
import X.C0YXD;
import X.C0YXP;
import X.C0YXQ;
import X.C0YXR;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1954807lC;
import X.C1AQS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2254508sR;
import X.C806890Vl1;
import X.C821300WJs;
import X.C821310WJt;
import X.C821320WJu;
import X.C872060YIy;
import X.C875480YWc;
import X.C875500YWe;
import X.EnumC806900Vl2;
import X.InterfaceC810750VrF;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.WSManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS28S0001000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class WSManager extends AbsPigeonGlobalProtocol implements WSManagerComponentApi {
    public final GECPigeon LL;
    public C821300WJs LLILLJJLI;
    public String LLILZ;
    public final int LLILLL = 77431;
    public final C875500YWe LLILZIL = new InterfaceC810750VrF() { // from class: X.0YWe
        @Override // X.InterfaceC810750VrF
        public final void LIZ(WsChannelMsg wsChannelMsg) {
            if (wsChannelMsg == null) {
                return;
            }
            WSManager wSManager = this.LIZ;
            C0YXD.LIZJ(wSManager.LJJJJLL(), new AwS593S0100000_14(wsChannelMsg, 17));
        }

        @Override // X.InterfaceC810750VrF
        public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
            String strOptString;
            C0YXD.LIZJ(this.LIZ.LJJJJLL(), new AwS380S0200000_14(c821280WJq, jSONObject, 19));
            if (c821280WJq != null) {
                WSManager wSManager = this.LIZ;
                C0XE1 c0xe1 = c821280WJq.LIZIZ;
                wSManager.getClass();
                int iLJJLIIIJJIZ = WSManager.LJJLIIIJJIZ(c0xe1);
                if (C875480YWc.LIZ == iLJJLIIIJJIZ) {
                    C875480YWc.LIZIZ = System.currentTimeMillis();
                } else {
                    GECPigeon.Companion.getClass();
                    C872060YIy.LIZ().LIZ().LIZ("rd_ws_connection_state_change", new AwS28S0001000_14(iLJJLIIIJJIZ, 6));
                }
                C0XE1 c0xe12 = c821280WJq.LIZIZ;
                if (c0xe12 != null) {
                    int i = C0XES.LIZ[c0xe12.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            String strOptString2 = "";
                            if (jSONObject == null || (strOptString = jSONObject.optString("error")) == null) {
                                strOptString = "";
                            }
                            if (!TextUtils.isEmpty(strOptString)) {
                                try {
                                    strOptString2 = new JSONObject(strOptString).optString("message");
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                            this.LIZ.getClass();
                            int iLJJLIIIJJIZ2 = WSManager.LJJLIIIJJIZ(c0xe12);
                            GECPigeon.Companion.getClass();
                            C872060YIy.LIZ().LIZ().LIZ("rd_ws_connection_error", new C006Q(iLJJLIIIJJIZ2, strOptString, strOptString2));
                            return;
                        }
                        return;
                    }
                    if (C875480YWc.LIZJ > 0) {
                        GECPigeon.Companion.getClass();
                        C872060YIy.LIZ().LIZ().LIZ("rd_ws_connection_state_success", AFwS248S0000000_14.get$arr$(532));
                        C875480YWc.LIZJ = -1L;
                    }
                }
            }
        }
    };

    @Override // com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi
    public final boolean isWsConnected() {
        C821300WJs c821300WJs = this.LLILLJJLI;
        return c821300WJs != null && c821300WJs.LJFF == C0XE1.CONNECTED;
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi
    public final void LJJ() {
        if (isWsConnected()) {
            C0YXD.LIZJ(this.LL, AFwS248S0000000_14.get$arr$(45));
            GECPigeon.Companion.getClass();
            C872060YIy.LIZ().LIZ().LIZ("rd_ws_connection_stop", null);
        }
        C821300WJs c821300WJs = this.LLILLJJLI;
        if (c821300WJs != null) {
            c821300WJs.LIZJ();
        }
        this.LLILLJJLI = null;
        this.LLILZ = null;
    }

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YWe] */
    public WSManager(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
    }

    public static int LJJLIIIJJIZ(C0XE1 c0xe1) {
        int i = C0XE0.LIZ[c0xe1.ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new C1954807lC();
                        }
                    }
                }
                return i3;
            }
            return i2;
        }
        return 0;
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi
    public final void LJJII(C0YWT c0ywt) {
        String str;
        if (c0ywt.LIZ != 0 || c0ywt.LIZIZ.length() == 0) {
            return;
        }
        String str2 = "";
        if (this.LLILLJJLI != null) {
            if (!Intrinsics.LJFF(this.LLILZ, c0ywt.LJ)) {
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("im_id", c0ywt.LIZJ);
                pairArr[1] = new Pair(Scene.SCENE_SERVICE, "active");
                pairArr[2] = new Pair("target_idc", c0ywt.LJ);
                String str3 = this.LLILZ;
                if (str3 != null) {
                    str2 = str3;
                }
                pairArr[3] = new Pair("current_idc", str2);
                pairArr[4] = new Pair("client", "cs");
                C1018703yb.LIZIZ("pigeon_switch_idc", C2097608Jq.LJIIIIZZ(pairArr));
                C821300WJs c821300WJs = this.LLILLJJLI;
                if (c821300WJs != null) {
                    c821300WJs.LIZ(LJJLIIIJILLIZJL(LJJLIIIJJI(c0ywt)));
                    return;
                }
                return;
            }
            return;
        }
        this.LL.getPigeonIMClient().LJIIIZ().LJI = c0ywt.LJI;
        this.LLILZ = c0ywt.LJ;
        GECPigeon.Companion.getClass();
        this.LLILLJJLI = C821310WJt.LIZJ(C872060YIy.LIZ().getApplicationContext(), LJJLIIIJILLIZJL(LJJLIIIJJI(c0ywt)), this.LLILZIL);
        C0YXD.LIZJ(this.LL, new AwS593S0100000_14(c0ywt, 16));
        String str4 = c0ywt.LJI;
        List<String> list = c0ywt.LJFF;
        String str5 = c0ywt.LJ;
        Map<String, String> map = c0ywt.LJIIL;
        if (map != null && (str = map.get("websocket_switch_region")) != null) {
            str2 = str;
        }
        String str6 = c0ywt.LIZJ;
        C875480YWc.LIZJ = System.currentTimeMillis();
        C872060YIy.LIZ().LIZ().LIZ("rd_ws_connection_start", new C0YXR(str4, list, str5, str2, str6));
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi
    public final void LJJJLZIJ(C0YXQ c0yxq) {
        C0WKM c0wkm = new C0WKM(this.LLILLL);
        c0wkm.LIZJ = 0L;
        c0wkm.LIZLLL = c0yxq.LIZIZ;
        c0wkm.LJ = 1;
        c0wkm.LJFF = c0yxq.LJ;
        c0wkm.LJI = c0yxq.LIZJ;
        c0wkm.LJII = c0yxq.LIZLLL;
        c0wkm.LJIIIIZZ = c0yxq.LIZ;
        c0wkm.LIZ("cmd", String.valueOf(c0yxq.LJFF));
        c0wkm.LIZ("seq_id", String.valueOf(c0yxq.LIZ));
        c0wkm.LIZ("X-Biz-Id", String.valueOf(c0yxq.LJI));
        WsChannelMsg wsChannelMsgLIZIZ = c0wkm.LIZIZ();
        C821300WJs c821300WJs = this.LLILLJJLI;
        if (c821300WJs != null) {
            c821300WJs.LIZIZ(wsChannelMsgLIZIZ, null);
        }
        C0YXD.LIZJ(this.LL, new AwS593S0100000_14(c0yxq, 18));
    }

    public final C821320WJu LJJLIIIJILLIZJL(C0YXP c0yxp) {
        int i;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GECPigeon.Companion.getClass();
        EnumC806900Vl2 enumC806900Vl2LIZIZ = C806890Vl1.LIZIZ(C872060YIy.LIZ().getApplicationContext());
        if (enumC806900Vl2LIZIZ == EnumC806900Vl2.WIFI) {
            i = 1;
        } else if (enumC806900Vl2LIZIZ == EnumC806900Vl2.MOBILE_2G) {
            i = 2;
        } else if (enumC806900Vl2LIZIZ == EnumC806900Vl2.MOBILE_3G) {
            i = 3;
        } else if (enumC806900Vl2LIZIZ == EnumC806900Vl2.MOBILE_4G) {
            i = 4;
        } else {
            i = 0;
        }
        linkedHashMap.put("ne", String.valueOf(i));
        if (!TextUtils.isEmpty(c0yxp.LJI)) {
            linkedHashMap.put("token", c0yxp.LJI);
        }
        if (!TextUtils.isEmpty(c0yxp.LJII)) {
            linkedHashMap.put("sid", c0yxp.LJII);
        }
        linkedHashMap.put("device_platform", "android");
        String strValueOf = String.valueOf(c0yxp.LIZIZ);
        String str = c0yxp.LIZLLL;
        String str2 = c0yxp.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append("f8a69f1719916z");
        linkedHashMap.put("access_key", C2254508sR.LIZ(C2188811AlT.LIZIZ(sbLIZ)));
        Map<String, String> map = c0yxp.LJIIIIZZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C0WKN c0wkn = new C0WKN(this.LLILLL);
        c0wkn.LJIIIIZZ = c0yxp.LJFF;
        c0wkn.LJ = c0yxp.LIZJ;
        c0wkn.LJFF = c0yxp.LIZIZ;
        c0wkn.LJII = c0yxp.LIZLLL;
        c0wkn.LJIIIZ = c0yxp.LIZ;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c0wkn.LJI = (int) ((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZIZ;
        List<String> list = c0yxp.LJ;
        if (list != null) {
            ((ArrayList) c0wkn.LIZLLL).addAll(list);
        }
        ((HashMap) c0wkn.LIZIZ).putAll(linkedHashMap);
        Map<String, String> map2 = c0yxp.LJIIIZ;
        if (map2 != null) {
            ((HashMap) c0wkn.LIZJ).putAll(map2);
        }
        return c0wkn.LIZ();
    }

    public final C0YXP LJJLIIIJJI(C0YWT c0ywt) {
        C0YXP c0yxp = new C0YXP();
        c0yxp.LIZ = this.LL.getPigeonDepend().getInstallId();
        c0yxp.LJFF = this.LL.getPigeonDepend().getDeviceId();
        c0yxp.LJI = c0ywt.LIZIZ;
        c0yxp.LIZIZ = c0ywt.LJII;
        c0yxp.LIZJ = c0ywt.LJIIIIZZ;
        c0yxp.LIZLLL = c0ywt.LJIIIZ;
        c0yxp.LJ = c0ywt.LJFF;
        c0yxp.LJII = "";
        Map<String, String> map = c0ywt.LJIIJJI;
        if (map != null) {
            c0yxp.LJIIIZ = map;
        }
        Map<String, String> map2 = c0ywt.LJIIL;
        if (map2 != null) {
            c0yxp.LJIIIIZZ = map2;
        }
        if (c0yxp.LJIIIIZZ != null) {
            C0OFE.LIZ("client_app_id", Integer.valueOf(this.LL.getPigeonDepend().getAppId()));
            this.LL.getPigeonDepend().LJFF().LIZJ();
            C0OFE.LIZ("im_role", 1);
        }
        return c0yxp;
    }
}
