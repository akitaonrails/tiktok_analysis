package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC1028360crq;
import X.C098200Yq;
import X.C1014110cUr;
import X.C1014130cUt;
import X.C1014150cUv;
import X.C1014180cUy;
import X.C1014190cUz;
import X.C1014220cV2;
import X.C1018890ccZ;
import X.C1018900cca;
import X.C1018910ccb;
import X.C1023960ckk;
import X.C1028370crr;
import X.C1028380crs;
import X.C1029710cu1;
import X.C1029740cu4;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C1043540dGK;
import X.C1051290dSp;
import X.C1077500e96;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1440005kM;
import X.C1552050qUV;
import X.C189200o6;
import X.C19719512Dh;
import X.C1AF0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C811103Ev;
import X.C988570bpf;
import X.EnumC1016560cYo;
import X.EnumC714850S2h;
import X.InterfaceC1008690cM7;
import X.InterfaceC1018920ccc;
import X.InterfaceC1028390crt;
import X.InterfaceC1043620dGS;
import Y.ARunnableS102S0100000_2;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatConfigExp;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridContainerManager implements IAdHybridContainerManager {
    public final Map<String, AbstractC1028360crq> LIZ = new LinkedHashMap();
    public final String LIZIZ = "AdHybridContainerManager";

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final void initialize() {
        Object c098200Yq;
        String name;
        C1018900cca.LIZ.getClass();
        Object c098200Yq2 = null;
        try {
            Field declaredField = Class.forName("com.ss.android.ugc.aweme.commercialize.hybrid.api.Type_CommerceHybridCollector").getDeclaredField("TYPE_COLLECTOR");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj != null) {
                C1018900cca.LIZJ = C19719512Dh.LIZJ(obj);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initAdHybridAnnotation: exception with container type = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(C1018900cca.LIZIZ);
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (EnumC1016560cYo enumC1016560cYo : EnumC1016560cYo.values()) {
                arrayList.add(enumC1016560cYo.name());
            }
            Field[] declaredFields = Class.forName("com.ss.android.ugc.aweme.commercialize.hybrid.api.Gecko_CommerceHybridCollector").getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (field != null && (name = field.getName()) != null && arrayList.contains(name)) {
                        field.setAccessible(true);
                        C1018900cca.LIZLLL.put(name, C19719512Dh.LIZIZ(field.get(null)));
                    }
                }
                c098200Yq2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initAdHybridAnnotation: exception with gecko config = ");
            sbLIZ2.append(thM5exceptionOrNullimpl2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C811103Ev.LIZ(C1018900cca.LIZIZ);
            C1AF0.LJ(thM5exceptionOrNullimpl2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final boolean LIZJ(String str, String str2) {
        C1043540dGK.LIZ.getClass();
        return C1552050qUV.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final AbstractC1028360crq LIZLLL(C1028380crs c1028380crs, C1051290dSp c1051290dSp) {
        AbstractC1028360crq abstractC1028360crqRemove;
        if (this.LIZ.containsKey(c1051290dSp.LIZIZ) && (abstractC1028360crqRemove = this.LIZ.remove(c1051290dSp.LIZIZ)) != null) {
            C811103Ev.LIZ(this.LIZIZ);
            return abstractC1028360crqRemove;
        }
        C811103Ev.LIZ(this.LIZIZ);
        return new C1028370crr(new C1029710cu1(c1028380crs));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final AbstractC1028360crq LIZIZ(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1028390crt interfaceC1028390crt) {
        if (this.LIZ.containsKey(c1051290dSp.LIZIZ)) {
            AbstractC1028360crq abstractC1028360crq = (AbstractC1028360crq) ((LinkedHashMap) this.LIZ).get(c1051290dSp.LIZIZ);
            if (abstractC1028360crq != null) {
                C811103Ev.LIZ(this.LIZIZ);
                abstractC1028360crq.LJIILL(c1051290dSp, null);
                return abstractC1028360crq;
            }
        }
        C1028370crr c1028370crr = new C1028370crr(new C1029710cu1(c1028380crs));
        this.LIZ.put(c1051290dSp.LIZIZ, c1028370crr);
        AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(c1028380crs, c1028370crr, this, 3);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS260S0300000_16.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(awS260S0300000_16, 16));
        }
        c1028370crr.LJIILL(c1051290dSp, interfaceC1028390crt);
        System.currentTimeMillis();
        C811103Ev.LIZ(this.LIZIZ);
        return c1028370crr;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager
    public final <GeckoSource> void LIZ(EnumC1016560cYo enumC1016560cYo, GeckoSource geckosource, C1029740cu4 c1029740cu4, InterfaceC1043620dGS interfaceC1043620dGS) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C1043540dGK.LIZ.getClass();
        try {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            C1018890ccZ.LIZ.getClass();
            List listLIZ = C1018890ccZ.LIZ(enumC1016560cYo);
            if (listLIZ != null) {
                Iterator it2 = ((ArrayList) listLIZ).iterator();
                while (it2.hasNext()) {
                    C1014150cUv c1014150cUvObtainGeckoConfig = ((InterfaceC1018920ccc) it2.next()).obtainGeckoConfig(geckosource);
                    if (c1014150cUvObtainGeckoConfig instanceof C1014220cV2) {
                        Boolean bool = ((C1014220cV2) c1014150cUvObtainGeckoConfig).LIZLLL;
                        String str = ((C1014220cV2) c1014150cUvObtainGeckoConfig).LIZ;
                        String str2 = ((C1014220cV2) c1014150cUvObtainGeckoConfig).LIZJ;
                        List<String> list = ((C1014220cV2) c1014150cUvObtainGeckoConfig).LIZIZ;
                        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            linkedHashMap = linkedHashMap6;
                        } else {
                            linkedHashMap = linkedHashMap4;
                        }
                        C1043540dGK.LIZIZ(str, str2, list, linkedHashMap3, c1029740cu4, linkedHashMap, linkedHashMap5, linkedHashMap7);
                    } else if (c1014150cUvObtainGeckoConfig instanceof C1014180cUy) {
                        Iterator<T> it3 = ((C1014180cUy) c1014150cUvObtainGeckoConfig).LIZ.entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            String str3 = ((C1014190cUz) entry.getKey()).LIZ;
                            String str4 = ((C1014190cUz) entry.getKey()).LIZIZ;
                            Boolean bool2 = ((C1014190cUz) entry.getKey()).LIZJ;
                            List list2 = (List) entry.getValue();
                            if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                                linkedHashMap2 = linkedHashMap6;
                            } else {
                                linkedHashMap2 = linkedHashMap4;
                            }
                            C1043540dGK.LIZIZ(str3, str4, list2, linkedHashMap3, c1029740cu4, linkedHashMap2, linkedHashMap5, linkedHashMap7);
                            final ArrayList arrayList = new ArrayList(list2);
                            C1440005kM.LIZ(new IEvent(arrayList) { // from class: X.02z7
                                public final List<String> LIZ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C767102z7) && Intrinsics.LJFF(this.LIZ, ((C767102z7) obj).LIZ);
                                }

                                public final int hashCode() {
                                    List<String> list3 = this.LIZ;
                                    if (list3 == null) {
                                        return 0;
                                    }
                                    return list3.hashCode();
                                }

                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent post() {
                                    C1440005kM.LIZ(this);
                                    return this;
                                }

                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent postSticky() {
                                    C1440005kM.LIZIZ(this);
                                    return this;
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("AdPreloadGeckoStartEvent(channelList=");
                                    sbLIZ.append(this.LIZ);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                {
                                    this.LIZ = arrayList;
                                }
                            });
                        }
                    } else if (c1014150cUvObtainGeckoConfig instanceof C1014130cUt) {
                        Iterator<T> it4 = ((C1014130cUt) c1014150cUvObtainGeckoConfig).LIZ.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            C1018910ccb c1018910ccb = new C1018910ccb();
                            C1023960ckk c1023960ckk = C1014110cUr.LIZ;
                            String str5 = c1029740cu4.LIZ;
                            if (str5 == null) {
                                str5 = "";
                            }
                            c1018910ccb.logAd(c1023960ckk, str5, c1029740cu4.LIZIZ, null, new AwS595S0100000_16(entry2, (Map.Entry<String, String>) 74));
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ((String) entry2.getValue());
                            c1331670kl3LJIIIZ.LJJJJZ = true;
                            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                            c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                            String str6 = IABLoadingFormatConfigExp.LIZLLL;
                            if (str6 == null) {
                                str6 = "iab_loading_format";
                            }
                            c1331670kl3LJIIIZ.LJJJJJ = str6;
                            c1331670kl3LJIIIZ.LJJII(new C1077500e96(entry2, c1029740cu4, 0));
                        }
                    } else {
                        C811103Ev.LIZ(C1043540dGK.LIZIZ);
                    }
                }
            }
            Iterator it5 = linkedHashMap4.entrySet().iterator();
            while (it5.hasNext()) {
                C1043540dGK.LIZ((String) ((Map.Entry) it5.next()).getKey(), linkedHashMap3, c1029740cu4, enumC1016560cYo, linkedHashMap4, linkedHashMap5, linkedHashMap7, interfaceC1043620dGS);
            }
            for (Map.Entry entry3 : linkedHashMap6.entrySet()) {
                String str7 = (String) entry3.getKey();
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setLazyUpdate(true);
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = ((List) entry3.getValue()).iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((CheckRequestBodyModel.TargetChannel) it6.next()).channelName);
                }
                C988570bpf.LIZ.getClass();
                InterfaceC1008690cM7 interfaceC1008690cM7LIZIZ = C1041070dCL.LIZIZ();
                if (interfaceC1008690cM7LIZIZ != null) {
                    C1041280dCg.LJFF(arrayList2, str7, optionCheckUpdateParams, null);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadGecko: Exception = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(C1043540dGK.LIZIZ);
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }
}
