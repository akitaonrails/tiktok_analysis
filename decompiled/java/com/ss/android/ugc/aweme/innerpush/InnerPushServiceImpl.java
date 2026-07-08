package com.ss.android.ugc.aweme.innerpush;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C123100dR;
import X.C13IQ;
import X.C13LE;
import X.C1865370ydr;
import X.C189200o6;
import X.C18JY;
import X.C18JZ;
import X.C1906330zhv;
import X.C1906580ziK;
import X.C1908400zlG;
import X.C1909710znN;
import X.C19290510dT;
import X.C19323510in;
import X.C19329910jp;
import X.C19331210k2;
import X.C19331310k3;
import X.C1954807lC;
import X.C20641815pw;
import X.C20642815q6;
import X.C20643115q9;
import X.C20644115qJ;
import X.C20663515tR;
import X.C20663715tT;
import X.C20684815ws;
import X.C2188811AlT;
import X.C539110LCj;
import X.C584250Mvn;
import X.EnumC19331110k1;
import X.InterfaceC1209290hZf;
import X.InterfaceC19330810jy;
import X.InterfaceC20643015q8;
import X.InterfaceC20663615tS;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.IInnerPushAppDiffProtocol;
import com.ss.android.ugc.aweme.innerpush.api.IInnerPushService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushFeedListUIComponent;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushManager;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushServiceImpl implements IInnerPushService {
    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
        return C13LE.LIZ(InnerPushFeedListUIComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIJJI() {
        return C20663715tT.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void init() {
        InnerPushManager.INSTANCE.triggerInit();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC1209290hZf LJIIJ() {
        return C1908400zlG.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZ(String str) {
        C20663715tT.LIZ.LIZIZ(str, null, false);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZIZ(C1906330zhv c1906330zhv) {
        C1909710znN.LIZ.getClass();
        C19331310k3.LJIIJ(new AwS572S0100000_28(c1906330zhv, 271));
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZLLL(C19323510in c19323510in) {
        InterfaceC20663615tS interfaceC20663615tS;
        IInnerPushAppDiffProtocol.LIZ.getClass();
        C1865370ydr.LIZIZ.getValue().LIZ();
        if (c19323510in.LIZJ == 21) {
            InnerPushMessage innerPushMessageLIZ = c19323510in.LIZ();
            innerPushMessageLIZ.markReceiveFrom(EnumC19331110k1.FROM_DM);
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIIJJI(innerPushMessageLIZ);
            if (C20663715tT.LIZ.LJ()) {
                C539110LCj.LIZIZ(C20663715tT.LIZ, innerPushMessageLIZ, new int[]{1, 2, 3}, true, 4);
                C20663515tR c20663515tR = C20663715tT.LIZ;
                c20663515tR.getClass();
                C20663515tR.LJII(c20663515tR, innerPushMessageLIZ, false, null, 4);
                WeakReference<InterfaceC20663615tS> weakReference = c20663515tR.LL;
                if (weakReference != null && (interfaceC20663615tS = weakReference.get()) != null) {
                    interfaceC20663615tS.LJII(innerPushMessageLIZ);
                }
            } else {
                C20663515tR c20663515tR2 = C20663715tT.LIZ;
                c20663515tR2.getClass();
                boolean zLJI = MethodIDManager.LJI(71703);
                C19331310k3.LJII(new AwS432S0200000_31(c20663515tR2, innerPushMessageLIZ, 108));
                if (zLJI) {
                    MethodIDManager.LJ();
                    return true;
                }
            }
            return true;
        }
        if (C1906580ziK.LJI()) {
            return false;
        }
        InnerPushMessage innerPushMessageLIZ2 = c19323510in.LIZ();
        innerPushMessageLIZ2.markReceiveFrom(EnumC19331110k1.FROM_LOCAL);
        C19331210k2.LIZ.getClass();
        C19331210k2.LJIIJJI(innerPushMessageLIZ2);
        InnerPushQueueLooper.LJFF(InnerPushQueueLooper.LL, innerPushMessageLIZ2, 6);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJ(InterfaceC19330810jy interfaceC19330810jy) {
        C20641815pw.LIZIZ(interfaceC19330810jy);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJFF(long j) {
        C20643115q9.LIZ.getClass();
        C20643115q9.LIZIZ = j;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJI(InterfaceC19330810jy interfaceC19330810jy) {
        for (int i : interfaceC19330810jy.LIZJ()) {
            ((ConcurrentHashMap) C20641815pw.LIZ.getValue()).remove(Integer.valueOf(i), interfaceC19330810jy);
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIIIZZ(InterfaceC20643015q8 interfaceC20643015q8) {
        C20642815q6.LJI(interfaceC20643015q8, null);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIIZ(boolean z) {
        return C20663715tT.LIZ.LIZLLL(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(org.json.JSONObject r10) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.InnerPushServiceImpl.LJIILJJIL(org.json.JSONObject):boolean");
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIILLIIL(String str) {
        C20644115qJ.LIZ.getClass();
        try {
            InnerPushMessage innerPushMessageLJIIIZ = C19331310k3.LJIIIZ(str, false);
            if (innerPushMessageLJIIIZ != null) {
                if (innerPushMessageLJIIIZ.getProtocol() == 2) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIZILJ(InterfaceC20643015q8 interfaceC20643015q8) {
        CopyOnWriteArrayList<InterfaceC20643015q8> copyOnWriteArrayList = C20642815q6.LIZIZ;
        if (!copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.remove(interfaceC20643015q8);
        }
        if (!C20642815q6.LIZ().isEmpty()) {
            Iterator it2 = C20642815q6.LIZ().entrySet().iterator();
            while (it2.hasNext()) {
                ((List) ((Map.Entry) it2.next()).getValue()).remove(interfaceC20643015q8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC19330810jy LJIJ(int i) {
        return C20641815pw.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final HashMap<String, String> LJIJI(InnerPushMessage innerPushMessage) {
        return C19331310k3.LJFF(innerPushMessage);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIL(boolean z, boolean z2) {
        C19329910jp.LIZ.getClass();
        C19329910jp.LIZIZ = z;
        if (z) {
            C20642815q6.LJFF(23, null);
        } else {
            C20642815q6.LIZJ(23, null, z2, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILIIL(JSONObject jSONObject, long j) throws JSONException {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean zContainsKey;
        C1909710znN.LIZ.getClass();
        PushBody pushBody = new PushBody(jSONObject);
        Uri uri = UriProtector.parse(pushBody.open_url);
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        Map<String, String> map = InnerPushDedupExp.LJIIIIZZ;
        if (map.containsKey(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            String strLIZJ = C1909710znN.LIZJ(pushBody.open_url);
            String str = map.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (C123100dR.LIZ(str) && C123100dR.LIZ(strLIZJ)) {
                ConcurrentHashMap<String, CopyOnWriteArraySet<String>> concurrentHashMap = C1909710znN.LIZJ;
                CopyOnWriteArraySet<String> copyOnWriteArraySet = concurrentHashMap.get(str);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                }
                copyOnWriteArraySet.add(strLIZJ);
                concurrentHashMap.put(str, copyOnWriteArraySet);
            }
            Keva keva = C584250Mvn.LIZ;
            if (strLIZJ != null && strLIZJ.length() != 0 && (zContainsKey = C584250Mvn.LIZJ.containsKey(strLIZJ))) {
                JSONObject jSONObject2 = new JSONObject();
                String str2 = map.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                jSONObject2.put("dedup_type", str2);
                jSONObject2.put("gd_label", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                jSONObject2.put("rid", j);
                jSONObject2.put("item_id", strLIZJ);
                jSONObject2.put("module", "outapp_push");
                jSONObject2.put("by_module", "player");
                C20684815ws.LJIJ("msg_deduplicated", jSONObject2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordOutPushId dedupKey:");
                sbLIZ.append(str2);
                sbLIZ.append(" open_url:");
                sbLIZ.append(pushBody.open_url);
                sbLIZ.append(" label:");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ.append(", aid:");
                sbLIZ.append(strLIZJ);
                sbLIZ.append(" played:");
                sbLIZ.append(zContainsKey);
                sbLIZ.append(" pushBodyJObj:");
                sbLIZ.append(jSONObject);
                C19290510dT.LIZLLL("inner_push_dedup", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILL(InterfaceC20643015q8 interfaceC20643015q8, int[] iArr) {
        C20642815q6.LJI(interfaceC20643015q8, iArr);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJII(C18JY c18jy, InnerPushMessage innerPushMessage, String str, int i) {
        int i2 = C18JZ.LIZ[c18jy.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        C19331210k2 c19331210k2 = C19331210k2.LIZ;
                        boolean zLJFF = Intrinsics.LJFF(str, "slide_up");
                        c19331210k2.getClass();
                        C19331210k2.LJII(innerPushMessage, zLJFF);
                        return;
                    }
                    throw new C1954807lC();
                }
                C19331210k2.LIZ.getClass();
                C19331210k2.LJIIJJI(innerPushMessage);
                return;
            }
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIIL(innerPushMessage);
            return;
        }
        C19331210k2.LIZ.getClass();
        C19331210k2.LJIILJJIL(i, innerPushMessage, str);
    }
}
