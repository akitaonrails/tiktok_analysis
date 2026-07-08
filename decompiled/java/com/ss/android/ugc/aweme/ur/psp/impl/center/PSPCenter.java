package com.ss.android.ugc.aweme.ur.psp.impl.center;

import X.AbstractC21185217vO;
import X.AbstractC830880Wic;
import X.C21185017vM;
import X.C21185317vP;
import X.C21185617vS;
import X.C2188811AlT;
import X.InterfaceC805220ViK;
import X.InterfaceC829930Wh5;
import X.InterfaceC830890Wid;
import com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter;
import com.ss.android.ugc.aweme.ur.psp.impl.center.PSPCenter;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class PSPCenter implements IPSPCenter {
    public static final PSPCenter LIZ = new PSPCenter();
    public static final Map<String, InterfaceC830890Wid> LIZIZ = new LinkedHashMap();
    public static final Map<String, AbstractC21185217vO> LIZJ = new LinkedHashMap();

    public static final class Service implements IPSPCenter {
        public final /* synthetic */ PSPCenter LIZ = PSPCenter.LIZ;

        @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
        public final void LIZ() {
            this.LIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
        public final InterfaceC830890Wid LIZIZ(String str) {
            return this.LIZ.LIZIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
        public final AbstractC21185217vO LIZJ() {
            return this.LIZ.LIZJ();
        }

        @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
        public final void LIZLLL(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
            this.LIZ.LIZLLL(interfaceC805220ViK, interfaceC830890Wid);
        }
    }

    static {
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.17vJ
            /* JADX WARN: Type inference failed for: r1v0, types: [X.17vI, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v2, types: [X.17vK, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v3, types: [X.17vI, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [X.17vK, java.lang.Object] */
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                    PSPCenter pSPCenter = PSPCenter.LIZ;
                    ?? r1 = new AbstractC21185217vO() { // from class: X.17vI
                        public final String LIZ = "next_psp_native_strategy";

                        public final String LIZJ() {
                            return this.LIZ;
                        }

                        @Override // X.AbstractC21185217vO
                        public final void LIZIZ(C21185017vM c21185017vM) {
                            AbstractC21185217vO.LIZ(c21185017vM);
                        }
                    };
                    Map<String, AbstractC21185217vO> map = PSPCenter.LIZJ;
                    map.put(r1.LIZJ(), (AbstractC21185217vO) r1);
                    C21184517vH c21184517vH = new C21184517vH();
                    map.put(c21184517vH.LIZJ(), c21184517vH);
                    ?? r12 = new AbstractC21185217vO() { // from class: X.17vK
                        public final String LIZ = "custom_app_log_native_strategy";

                        public final String LIZJ() {
                            return this.LIZ;
                        }

                        @Override // X.AbstractC21185217vO
                        public final void LIZIZ(C21185017vM c21185017vM) {
                            String str;
                            Map map2;
                            Object obj = c21185017vM.LIZIZ.get("event_name");
                            if ((obj instanceof String) && (str = (String) obj) != null) {
                                Object obj2 = c21185017vM.LIZIZ.get("append_params");
                                if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                                    C20684815ws.LJIILLIIL(str, map2);
                                    AbstractC21185217vO.LIZ(c21185017vM);
                                    return;
                                } else {
                                    AbstractC21185217vO.LIZ(c21185017vM);
                                    return;
                                }
                            }
                            AbstractC21185217vO.LIZ(c21185017vM);
                        }
                    };
                    map.put(r12.LIZJ(), (AbstractC21185217vO) r12);
                    return;
                }
                if (enumC829940Wh6 != EnumC829940Wh6.TTMStateAccountChanging) {
                    return;
                }
                PSPCenter pSPCenter2 = PSPCenter.LIZ;
                Map<String, AbstractC21185217vO> map2 = PSPCenter.LIZJ;
                ((LinkedHashMap) map2).clear();
                ?? r13 = new AbstractC21185217vO() { // from class: X.17vI
                    public final String LIZ = "next_psp_native_strategy";

                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC21185217vO
                    public final void LIZIZ(C21185017vM c21185017vM) {
                        AbstractC21185217vO.LIZ(c21185017vM);
                    }
                };
                map2.put(r13.LIZJ(), (AbstractC21185217vO) r13);
                C21184517vH c21184517vH2 = new C21184517vH();
                map2.put(c21184517vH2.LIZJ(), c21184517vH2);
                ?? r14 = new AbstractC21185217vO() { // from class: X.17vK
                    public final String LIZ = "custom_app_log_native_strategy";

                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC21185217vO
                    public final void LIZIZ(C21185017vM c21185017vM) {
                        String str;
                        Map map22;
                        Object obj = c21185017vM.LIZIZ.get("event_name");
                        if ((obj instanceof String) && (str = (String) obj) != null) {
                            Object obj2 = c21185017vM.LIZIZ.get("append_params");
                            if ((obj2 instanceof Map) && (map22 = (Map) obj2) != null) {
                                C20684815ws.LJIILLIIL(str, map22);
                                AbstractC21185217vO.LIZ(c21185017vM);
                                return;
                            } else {
                                AbstractC21185217vO.LIZ(c21185017vM);
                                return;
                            }
                        }
                        AbstractC21185217vO.LIZ(c21185017vM);
                    }
                };
                map2.put(r14.LIZJ(), (AbstractC21185217vO) r14);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
    public final void LIZ() {
        if (Intrinsics.LJFF("social_avatar_monitor", "social_avatar_monitor")) {
            C21185317vP c21185317vP = new C21185317vP();
            final String str = c21185317vP.LIZ;
            final C21185617vS c21185617vS = new C21185617vS(c21185317vP);
            if (LIZIZ.containsKey(str)) {
                return;
            }
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, null, null, new AbstractC830880Wic() { // from class: X.17vQ
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    PSPCenter.LIZ.LIZLLL(interfaceC805220ViK, interfaceC830890Wid);
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess && interfaceC830890Wid != null) {
                        PSPCenter.LIZIZ.put(str, interfaceC830890Wid);
                    }
                }

                @Override // X.AbstractC830880Wic
                public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str2, AnonymousClass1696 anonymousClass1696) {
                    InterfaceC1631620sYq<InterfaceC830890Wid, String, AnonymousClass1696, TTMParamData> interfaceC1631620sYq = c21185617vS;
                    if (interfaceC1631620sYq != null) {
                        return interfaceC1631620sYq.invoke(c830870Wib, str2, anonymousClass1696);
                    }
                    return null;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
    public final AbstractC21185217vO LIZJ() {
        return (AbstractC21185217vO) ((LinkedHashMap) LIZJ).get("store_event_data_native_strategy");
    }

    @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
    public final InterfaceC830890Wid LIZIZ(String str) {
        return (InterfaceC830890Wid) ((LinkedHashMap) LIZIZ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter
    public final void LIZLLL(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
        String sceneKey;
        List list;
        String str;
        Map map;
        String str2;
        String str3;
        Map map2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("actionResult: scene=");
        if (interfaceC830890Wid != null) {
            sceneKey = interfaceC830890Wid.getSceneKey();
        } else {
            sceneKey = null;
        }
        sbLIZ.append(sceneKey);
        sbLIZ.append(" strategy=");
        sbLIZ.append(interfaceC805220ViK.LIZLLL().LIZIZ);
        sbLIZ.append(" stateCode=");
        sbLIZ.append(interfaceC805220ViK.LIZIZ().name());
        sbLIZ.append(" errorMsg=");
        sbLIZ.append(interfaceC805220ViK.getErrorMessage());
        sbLIZ.append(" resultValue=");
        sbLIZ.append(interfaceC805220ViK.LIZJ());
        C2188811AlT.LIZIZ(sbLIZ);
        Object objLIZJ = interfaceC805220ViK.LIZJ();
        if ((objLIZJ instanceof List) && (list = (List) objLIZJ) != null) {
            ArrayList<C21185017vM> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Map) {
                    Map map3 = (Map) obj;
                    Object obj2 = map3.get("native_strategy_name");
                    if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                        Object obj3 = map3.get("native_strategy_params");
                        if ((obj3 instanceof Map) && (map = (Map) obj3) != null) {
                            Object obj4 = map3.get("next_psp_scene_name");
                            if (obj4 instanceof String) {
                                str2 = (String) obj4;
                            } else {
                                str2 = null;
                            }
                            Object obj5 = map3.get("next_psp_strategy_name");
                            if (obj5 instanceof String) {
                                str3 = (String) obj5;
                            } else {
                                str3 = null;
                            }
                            Object obj6 = map3.get("next_psp_strategy_params");
                            if (obj6 instanceof Map) {
                                map2 = (Map) obj6;
                            } else {
                                map2 = null;
                            }
                            arrayList.add(new C21185017vM(str, str2, str3, map, map2));
                        }
                    }
                }
            }
            for (C21185017vM c21185017vM : arrayList) {
                AbstractC21185217vO abstractC21185217vO = (AbstractC21185217vO) ((LinkedHashMap) LIZJ).get(c21185017vM.LIZ);
                if (abstractC21185217vO != null) {
                    abstractC21185217vO.LIZIZ(c21185017vM);
                }
            }
        }
    }
}
