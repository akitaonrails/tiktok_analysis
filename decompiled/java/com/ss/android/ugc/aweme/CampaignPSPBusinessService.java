package com.ss.android.ugc.aweme;

import X.AbstractC830880Wic;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XK4;
import X.C0XQ7;
import X.C1404290meB;
import X.C1886920zCc;
import X.C1886940zCe;
import X.C19334210kW;
import X.C2188811AlT;
import X.C452501pT;
import X.C830930Wih;
import X.InterfaceC1886910zCb;
import X.InterfaceC830890Wid;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.psp.ICampaignPSPTaskCompleteApi;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CampaignPSPBusinessService implements ICampaignPSPBusinessService, InterfaceC1886910zCb {
    public boolean LIZ;
    public String LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(69));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 48));

    @Override // X.InterfaceC1886910zCb
    public final void LIZ(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
    }

    @Override // com.ss.android.ugc.aweme.ICampaignPSPBusinessService
    public final void LIZJ(String str, AwS429S0200000_28 awS429S0200000_28) {
        InterfaceC830890Wid interfaceC830890WidLJII;
        InterfaceC1886910zCb interfaceC1886910zCb;
        synchronized (C1886920zCc.LIZIZ) {
            try {
                interfaceC830890WidLJII = C1886920zCc.LJII(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("campaignSize=");
                sbLIZ.append(((HashMap) C1886920zCc.LIZJ).size());
                sbLIZ.append(", sceneSize=");
                sbLIZ.append(((HashMap) C1886920zCc.LIZLLL).size());
                sbLIZ.append(", taskKeys=");
                sbLIZ.append(((HashMap) C1886920zCc.LJ).size());
                sbLIZ.append(", gameplayKeys=");
                sbLIZ.append(((HashMap) C1886920zCc.LJFF).size());
                sbLIZ.append(", ttmSize=");
                sbLIZ.append(((HashMap) C1886920zCc.LJI).size());
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC830890WidLJII != null && (interfaceC1886910zCb = C1886920zCc.LIZ) != null) {
            interfaceC1886910zCb.LIZ(interfaceC830890WidLJII);
        }
        awS429S0200000_28.invoke();
    }

    @Override // com.ss.android.ugc.aweme.ICampaignPSPBusinessService
    public final void LIZIZ(final C1886940zCe c1886940zCe, AwS394S0200000_28 awS394S0200000_28, AwS572S0100000_28 awS572S0100000_28) {
        boolean zContainsKey;
        C1404290meB c1404290meB = c1886940zCe.LIZIZ;
        if (c1404290meB.LIZ.length() == 0 || c1404290meB.LIZIZ < C0XK4.LIZ() || (c1886940zCe.LIZJ.isEmpty() && c1886940zCe.LIZLLL.isEmpty())) {
            awS572S0100000_28.invoke();
            return;
        }
        if (!this.LIZ) {
            this.LIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C1886920zCc.LIZ = this;
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL((C19334210kW) this.LIZLLL.getValue());
            this.LIZ = true;
        }
        String str = c1886940zCe.LIZ;
        if (C1886920zCc.LIZ(c1886940zCe.LIZIZ.LIZ)) {
            awS394S0200000_28.invoke("campaign_duplicate");
            return;
        }
        synchronized (C1886920zCc.LIZIZ) {
            try {
                zContainsKey = ((HashMap) C1886920zCc.LJI).containsKey(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zContainsKey) {
            C1886920zCc.LIZIZ(c1886940zCe);
            awS394S0200000_28.invoke(null);
        } else {
            final String str2 = c1886940zCe.LIZ;
            final AtomicReference atomicReference = new AtomicReference(awS394S0200000_28);
            final AtomicReference atomicReference2 = new AtomicReference(awS572S0100000_28);
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str2, new ArrayList(), (C830930Wih) this.LIZIZ.getValue(), new AbstractC830880Wic() { // from class: X.0zCd
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    List<C1869300ykC> listLLIIII;
                    List<C1869290ykB> listLLIIII2;
                    InterfaceC830890Wid interfaceC830890WidLJII;
                    InterfaceC830890Wid interfaceC830890WidLJII2;
                    int i = C1886950zCf.LIZ[interfaceC805220ViK.LIZIZ().ordinal()];
                    if ((i != 1 && i != 2) || !Intrinsics.LJFF(interfaceC805220ViK.LIZJ(), Boolean.TRUE)) {
                        return;
                    }
                    InterfaceC1886910zCb interfaceC1886910zCb = C1886920zCc.LIZ;
                    String str3 = interfaceC805220ViK.LIZLLL().LIZIZ;
                    ICampaignPSPTaskCompleteApi.LIZ.getClass();
                    ICampaignPSPTaskCompleteApi value = C1886900zCa.LIZIZ.getValue();
                    if (value == null) {
                        return;
                    }
                    ArrayList<C1869300ykC> arrayList = new ArrayList();
                    ArrayList<C1869290ykB> arrayList2 = new ArrayList();
                    ArrayList<InterfaceC830890Wid> arrayList3 = new ArrayList();
                    synchronized (C1886920zCc.LIZIZ) {
                        try {
                            int iLIZ = C0XK4.LIZ();
                            List list = (List) ((HashMap) C1886920zCc.LJ).get(str3);
                            if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                                listLLIIII = C13BV.INSTANCE;
                            }
                            List list2 = (List) ((HashMap) C1886920zCc.LJFF).get(str3);
                            if (list2 == null || (listLLIIII2 = C13LP.LLIIII(list2)) == null) {
                                listLLIIII2 = C13BV.INSTANCE;
                            }
                            if (!listLLIIII.isEmpty() || !listLLIIII2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                for (C1869300ykC c1869300ykC : listLLIIII) {
                                    C1886940zCe c1886940zCe2 = (C1886940zCe) ((HashMap) C1886920zCc.LIZJ).get(c1869300ykC.LIZLLL);
                                    if (c1886940zCe2 == null) {
                                        InterfaceC830890Wid interfaceC830890WidLJI = C1886920zCc.LJI(c1869300ykC);
                                        if (interfaceC830890WidLJI != null) {
                                            arrayList3.add(interfaceC830890WidLJI);
                                        }
                                    } else if (c1886940zCe2.LIZIZ.LIZIZ < iLIZ) {
                                        if (hashSet.add(c1869300ykC.LIZLLL) && (interfaceC830890WidLJII2 = C1886920zCc.LJII(c1869300ykC.LIZLLL)) != null) {
                                            arrayList3.add(interfaceC830890WidLJII2);
                                        }
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(c1869300ykC.LIZLLL);
                                        sbLIZ.append(':');
                                        sbLIZ.append(c1869300ykC.LIZ);
                                        if (C1886920zCc.LJII.add(C2188811AlT.LIZIZ(sbLIZ))) {
                                            arrayList.add(c1869300ykC);
                                        }
                                    }
                                }
                                for (C1869290ykB c1869290ykB : listLLIIII2) {
                                    C1886940zCe c1886940zCe3 = (C1886940zCe) ((HashMap) C1886920zCc.LIZJ).get(c1869290ykB.LIZLLL);
                                    if (c1886940zCe3 == null) {
                                        InterfaceC830890Wid interfaceC830890WidLJFF = C1886920zCc.LJFF(c1869290ykB);
                                        if (interfaceC830890WidLJFF != null) {
                                            arrayList3.add(interfaceC830890WidLJFF);
                                        }
                                    } else if (c1886940zCe3.LIZIZ.LIZIZ < iLIZ) {
                                        if (hashSet.add(c1869290ykB.LIZLLL) && (interfaceC830890WidLJII = C1886920zCc.LJII(c1869290ykB.LIZLLL)) != null) {
                                            arrayList3.add(interfaceC830890WidLJII);
                                        }
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(c1869290ykB.LIZLLL);
                                        sbLIZ2.append(':');
                                        sbLIZ2.append(c1869290ykB.LIZ);
                                        if (C1886920zCc.LJIIIIZZ.add(C2188811AlT.LIZIZ(sbLIZ2))) {
                                            arrayList2.add(c1869290ykB);
                                        }
                                    }
                                }
                                for (InterfaceC830890Wid interfaceC830890Wid2 : arrayList3) {
                                    InterfaceC1886910zCb interfaceC1886910zCb2 = C1886920zCc.LIZ;
                                    if (interfaceC1886910zCb2 != null) {
                                        interfaceC1886910zCb2.LIZ(interfaceC830890Wid2);
                                    }
                                }
                                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                                    return;
                                }
                                for (C1869300ykC c1869300ykC2 : arrayList) {
                                    InterfaceC1886910zCb interfaceC1886910zCb3 = C1886920zCc.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(c1869300ykC2.LIZLLL);
                                    sbLIZ3.append(':');
                                    sbLIZ3.append(c1869300ykC2.LIZ);
                                    C23250099c.LIZLLL(C1886920zCc.LJIIIZ, null, null, new C1886880zCY(c1869300ykC2, value, C2188811AlT.LIZIZ(sbLIZ3), null), 3);
                                }
                                for (C1869290ykB c1869290ykB2 : arrayList2) {
                                    InterfaceC1886910zCb interfaceC1886910zCb4 = C1886920zCc.LIZ;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(c1869290ykB2.LIZLLL);
                                    sbLIZ4.append(':');
                                    sbLIZ4.append(c1869290ykB2.LIZ);
                                    C23250099c.LIZLLL(C1886920zCc.LJIIIZ, null, null, new C1886890zCZ(value, c1869290ykB2, C2188811AlT.LIZIZ(sbLIZ4), null), 3);
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    Function1<String, Unit> andSet = atomicReference.getAndSet(null);
                    Function0<Unit> andSet2 = atomicReference2.getAndSet(null);
                    if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess && interfaceC830890Wid != null) {
                        InterfaceC1886910zCb interfaceC1886910zCb = C1886920zCc.LIZ;
                        String str3 = str2;
                        synchronized (C1886920zCc.LIZIZ) {
                            try {
                                Map<String, InterfaceC830890Wid> map = C1886920zCc.LJI;
                                if (!((HashMap) map).containsKey(str3)) {
                                    ((HashMap) map).put(str3, interfaceC830890Wid);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        C1886920zCc.LIZIZ(c1886940zCe);
                        if (andSet != null) {
                            andSet.invoke(null);
                        }
                        Iterator<InterfaceC830900Wie> it2 = interfaceC830890Wid.LIZJ().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        return;
                    }
                    if (andSet2 != null) {
                        andSet2.invoke();
                    }
                }
            });
        }
    }
}
