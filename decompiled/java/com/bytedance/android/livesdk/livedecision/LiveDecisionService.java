package com.bytedance.android.livesdk.livedecision;

import X.AbstractC1093440eYo;
import X.C01GW;
import X.C0J0P;
import X.C0J0Q;
import X.C1089500eSS;
import X.C1090000eTG;
import X.C1092780eXk;
import X.C1092840eXq;
import X.C1092920eXy;
import X.C1092940eY0;
import X.C1092960eY2;
import X.C1092970eY3;
import X.C1093050eYB;
import X.C1093060eYC;
import X.C1093080eYE;
import X.C1093140eYK;
import X.C1093150eYL;
import X.C1093420eYm;
import X.C1093460eYq;
import X.C1094570ead;
import X.C1094620eai;
import X.C19748512Ol;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C227400uG;
import X.C443120HZe;
import X.C452501pT;
import X.C473440IhS;
import X.C796430VMb;
import X.EnumC1093190eYP;
import X.EnumC1093260eYW;
import X.EnumC1093370eYh;
import X.EnumC1094630eaj;
import X.InterfaceC1089970eTD;
import X.InterfaceC1092770eXj;
import X.InterfaceC1092860eXs;
import X.InterfaceC1092870eXt;
import X.InterfaceC1093100eYG;
import X.InterfaceC1093320eYc;
import X.InterfaceC1936307iD;
import X.InterfaceC485200J1a;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.roomfunction.EPIStrategyConfigs;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.StrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class LiveDecisionService implements ILiveDecisionService {
    public long LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(67));
    public InterfaceC1089970eTD LLILLL;

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void d22() {
        this.LLILLL = null;
    }

    public final void onInit() {
        Iterator<T> it2 = LiveStrategyPlatformAllConfigMapSetting.INSTANCE.getValue().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Gson gson = C19748512Ol.LIZJ;
            C1093080eYE.LIZ.put((String) key, (StrategyConfig) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, entry.getValue()), StrategyConfig.class));
        }
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void leaveLive() {
        Iterator it2 = C1092960eY2.LIZ().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            C0J0P c0j0p = ((C1092970eY3) ((C443120HZe) entry.getValue()).getFirst()).LIZ;
            if (c0j0p == C0J0P.LIVE || c0j0p == C0J0P.ROOM || c0j0p == C0J0P.ANCHOR) {
                InterfaceC1092860eXs interfaceC1092860eXs = (InterfaceC1092860eXs) ((C443120HZe) entry.getValue()).getSecond();
                if (interfaceC1092860eXs != null) {
                    interfaceC1092860eXs.LIZJ();
                }
                it2.remove();
                ((C1093050eYB) C1092960eY2.LIZJ.getValue()).LIZIZ((String) entry.getKey());
            }
        }
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void CW(String str) {
        C1092960eY2.LIZ().remove(str);
        ((C1093050eYB) C1092960eY2.LIZJ.getValue()).LIZIZ(str);
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void DU(long j) {
        if (LiveUnregisterDecisionOptSetting.INSTANCE.getValue()) {
            if (this.LL == j) {
                C1092960eY2.LIZIZ();
                return;
            }
            return;
        }
        C1092960eY2.LIZIZ();
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void OH2(long j) {
        this.LL = j;
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void gR(C1089500eSS c1089500eSS) {
        this.LLILLL = c1089500eSS;
    }

    @Override // X.C0KY6
    public final Object LIZ(String str, String str2, String str3) {
        EnumC1094630eaj.Companion.getClass();
        C1090000eTG c1090000eTGO3 = O3(C1094620eai.LIZ(str3), str2, str);
        if (c1090000eTGO3 != null) {
            return c1090000eTGO3.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final InterfaceC1093100eYG Ll(String str, String str2, final InterfaceC1093100eYG interfaceC1093100eYG) {
        C1093060eYC c1093060eYC = (C1093060eYC) this.LLILLJJLI.getValue();
        InterfaceC1093100eYG interfaceC1093100eYG2 = new InterfaceC1093100eYG() { // from class: X.0eYF
            @Override // X.InterfaceC1093100eYG
            public final void LIZJ(Object obj, Object obj2, String str3, String str4) {
                interfaceC1093100eYG.LIZJ(obj, obj2, str3, str4);
            }
        };
        ((ILiveFeatureCenterService) c1093060eYC.LIZ.getValue()).Ll(str, str2, interfaceC1093100eYG2);
        return interfaceC1093100eYG2;
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final C1090000eTG O3(EnumC1094630eaj enumC1094630eaj, String str, String str2) {
        C1090000eTG c1090000eTGO3;
        InterfaceC1089970eTD interfaceC1089970eTD = this.LLILLL;
        if (interfaceC1089970eTD != null && (c1090000eTGO3 = interfaceC1089970eTD.O3(enumC1094630eaj, str, str2)) != null) {
            return c1090000eTGO3;
        }
        return ((C1093060eYC) this.LLILLJJLI.getValue()).O3(enumC1094630eaj, str, str2);
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void hc2(String str, C796430VMb c796430VMb, C1093150eYL c1093150eYL) {
        String str2;
        Map linkedHashMap;
        C1093140eYK c1093140eYK;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeStrategy name=");
        sbLIZ.append(str);
        sbLIZ.append(", scene=");
        sbLIZ.append(c796430VMb.LIZIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(c796430VMb.LIZ);
        C227400uG.LIZ("LiveTTMStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<Map.Entry<AbstractC1093440eYo, List<InterfaceC1093320eYc>>> it2 = C1093420eYm.LIZIZ.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC1093440eYo key = it2.next().getKey();
            if (key.LJ(c796430VMb.LIZIZ)) {
                C796430VMb c796430VMb2 = key.LIZ.LIZJ;
                if (c796430VMb2 != null) {
                    str2 = c796430VMb2.LIZJ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    ((ArrayList) key.LIZJ).add(new C1093460eYq(null));
                    EnumC1093260eYW enumC1093260eYW = EnumC1093260eYW.CLIENT_FINALACTION;
                    if (c1093150eYL != null && (c1093140eYK = c1093150eYL.LIZIZ) != null) {
                        linkedHashMap = C2097608Jq.LJIIJ(new Pair("bizName", c1093140eYK.LIZ), new Pair("ruleName", c1093140eYK.LIZIZ), new Pair("result", c1093140eYK.LIZJ));
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    key.LIZJ(c796430VMb, new C473440IhS(str, enumC1093260eYW, linkedHashMap));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void sl(String str, String str2, InterfaceC1093100eYG interfaceC1093100eYG) {
        ((ILiveFeatureCenterService) ((C1093060eYC) this.LLILLJJLI.getValue()).LIZ.getValue()).sl(str, str2, interfaceC1093100eYG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0eXr] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0eY9] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0eY8] */
    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void fR1(final InterfaceC1092860eXs interfaceC1092860eXs, C1092970eY3 c1092970eY3, C1094570ead c1094570ead, final String str) {
        FinalStrategyConfig finalStrategyConfig;
        TriggerStrategyConfig triggerStrategyConfig;
        Map<String, Object> map;
        Map<String, Object> map2;
        C1092940eY0 c1092940eY0 = (C1092940eY0) C1092960eY2.LIZIZ.getValue();
        C1092840eXq c1092840eXq = new C1092840eXq(c1092970eY3.LIZJ, interfaceC1092860eXs);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c1092840eXq.LIZJ.getValue();
        if (c1092970eY3.LIZIZ) {
            copyOnWriteArrayList.add(new InterfaceC1092870eXt() { // from class: X.0eXu
                @Override // X.InterfaceC1092870eXt
                public final void LIZ() {
                }
            });
        }
        copyOnWriteArrayList.addAll(c1092970eY3.LIZLLL);
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) c1092840eXq.LIZLLL.getValue();
        InterfaceC1936307iD<?> interfaceC1936307iD = c1092970eY3.LJFF;
        if (interfaceC1936307iD != null) {
            copyOnWriteArrayList2.add(new C1092780eXk(interfaceC1936307iD));
        }
        copyOnWriteArrayList2.addAll(c1092970eY3.LJ);
        copyOnWriteArrayList2.add(new InterfaceC485200J1a() { // from class: X.0J0N
            @Override // X.InterfaceC485200J1a
            public final C1092890eXv LIZ(C1092890eXv c1092890eXv) {
                Object obj;
                C0J0Q c0j0q;
                int i;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                if (c0j0m != null && (obj = c0j0m.LIZIZ) != null) {
                    ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                    C0J0P c0j0p = c0j0m.LIZJ;
                    if (c0j0p != null && (i = C0J0O.LIZ[c0j0p.ordinal()]) != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        c0j0q = C0J0Q.ANCHOR;
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    c0j0q = C0J0Q.ROOM;
                                }
                            } else {
                                c0j0q = C0J0Q.LIVE;
                            }
                        } else {
                            c0j0q = C0J0Q.APP;
                        }
                    } else {
                        c0j0q = C0J0Q.ROOM;
                    }
                    iLiveDecisionService.bg(c0j0q, c1092890eXv.LIZ, obj, EnumC467180ITs.DECISION_GROUP.getGroupName(), false);
                }
                return c1092890eXv;
            }
        });
        final C1092920eXy c1092920eXy = c1092940eY0.LIZ;
        if (c1092920eXy != null) {
            copyOnWriteArrayList2.add(new InterfaceC485200J1a(c1092920eXy) { // from class: X.0eXw
                public final InterfaceC1092910eXx LIZ;

                {
                    this.LIZ = c1092920eXy;
                }

                @Override // X.InterfaceC485200J1a
                public final C1092890eXv LIZ(C1092890eXv c1092890eXv) {
                    String string;
                    String string2;
                    Object obj;
                    Object obj2;
                    String str2 = c1092890eXv.LIZ;
                    C0J0M c0j0m = c1092890eXv.LIZIZ;
                    if (c0j0m != null && (obj2 = c0j0m.LIZIZ) != null) {
                        string = obj2.toString();
                    } else {
                        string = null;
                    }
                    C20441214yg.LJIIIZ(str2, string);
                    InterfaceC1092910eXx interfaceC1092910eXx = this.LIZ;
                    String str3 = c1092890eXv.LIZ;
                    C0J0M c0j0m2 = c1092890eXv.LIZIZ;
                    if (c0j0m2 == null || (obj = c0j0m2.LIZIZ) == null || (string2 = obj.toString()) == null) {
                        string2 = "";
                    }
                    interfaceC1092910eXx.LIZ(str3, string2, new Throwable());
                    return c1092890eXv;
                }
            });
        }
        C1092960eY2.LIZ().put(str, new C443120HZe(c1092970eY3, interfaceC1092860eXs, c1092840eXq));
        C1093050eYB c1093050eYB = (C1093050eYB) C1092960eY2.LIZJ.getValue();
        final C0J0P c0j0p = c1092970eY3.LIZ;
        final ?? r0 = new InterfaceC1092860eXs() { // from class: X.0eXr
            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
                interfaceC1092860eXs.LIZ();
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                C1092840eXq c1092840eXq2;
                C443120HZe c443120HZe = (C443120HZe) C1092960eY2.LIZ().get(c1092890eXv.LIZ);
                if (c443120HZe != null && (c1092840eXq2 = (C1092840eXq) c443120HZe.getThird()) != null) {
                    C1092890eXv c1092890eXv2 = new C1092890eXv(c1092890eXv.LIZ, c1092890eXv.LIZIZ);
                    Iterator it2 = ((CopyOnWriteArrayList) c1092840eXq2.LIZJ.getValue()).iterator();
                    if (it2.hasNext()) {
                        ((InterfaceC1092870eXt) it2.next()).LIZ();
                        C2094508Il.LIZ(c1092840eXq2.LIZ, new AwS418S0200000_17(c1092890eXv2, c1092840eXq2, 76));
                    } else {
                        Iterator it3 = ((CopyOnWriteArrayList) c1092840eXq2.LIZLLL.getValue()).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC485200J1a) it3.next()).LIZ(c1092890eXv2);
                        }
                        C2094508Il.LIZ(c1092840eXq2.LIZ, new AwS418S0200000_17(c1092890eXv2, c1092840eXq2, 75));
                    }
                }
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                InterfaceC1092860eXs interfaceC1092860eXs2;
                C443120HZe c443120HZe = (C443120HZe) C1092960eY2.LIZ().get(str);
                if (c443120HZe != null && (interfaceC1092860eXs2 = (InterfaceC1092860eXs) c443120HZe.getSecond()) != null) {
                    interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                }
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str2, C477840IoY c477840IoY) {
                InterfaceC1092860eXs interfaceC1092860eXs2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("strategy run failed = ");
                sbLIZ.append(str2);
                C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C443120HZe c443120HZe = (C443120HZe) C1092960eY2.LIZ().get(str2);
                if (c443120HZe != null && (interfaceC1092860eXs2 = (InterfaceC1092860eXs) c443120HZe.getSecond()) != null) {
                    interfaceC1092860eXs2.LIZLLL(str2, c477840IoY);
                }
            }
        };
        c1093050eYB.getClass();
        StrategyConfig strategyConfig = C1093080eYE.LIZ.get(str);
        if (strategyConfig != null) {
            finalStrategyConfig = strategyConfig.getFinalStrategyConfig();
            triggerStrategyConfig = strategyConfig.getTriggerStrategyConfig();
        } else {
            finalStrategyConfig = null;
            triggerStrategyConfig = null;
        }
        if (finalStrategyConfig != null) {
            if (c1094570ead != null) {
                map2 = c1094570ead.LIZ;
            } else {
                map2 = null;
            }
            finalStrategyConfig.setCustomParams(map2);
            finalStrategyConfig.setTtmScene(null);
        }
        if (triggerStrategyConfig != null) {
            triggerStrategyConfig.setPitaya(null);
            triggerStrategyConfig.setTtmScene(null);
        }
        if (finalStrategyConfig == null && triggerStrategyConfig == null && EPIStrategyConfigs.INSTANCE.isEPI(str)) {
            triggerStrategyConfig = new TriggerStrategyConfig(str, "", 1L, EnumC1093190eYP.FEATURE_MODIFY.getType(), null, null, null, null, null, null, null, null, null);
            finalStrategyConfig = new FinalStrategyConfig(str, "", null, null, null, null, null, 1L, 30L, EnumC1093370eYh.EPI.getType(), null, null);
            if (c1094570ead == null || (map = c1094570ead.LIZ) == null || map.get("skip_final_when_register") == null) {
                c1093050eYB.LIZ().Mf0(new InterfaceC1092770eXj() { // from class: X.0eY5
                    @Override // X.InterfaceC1092770eXj
                    public final void LIZ() {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZJ(C477840IoY c477840IoY) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZLLL(str, c477840IoY);
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZLLL(C1093040eYA c1093040eYA) {
                        Object obj;
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            String str2 = str;
                            Object obj2 = c1093040eYA.LIZIZ;
                            C0J0P c0j0p2 = c0j0p;
                            Map<String, Object> map3 = c1093040eYA.LIZJ;
                            Map map4 = null;
                            if (map3 != null) {
                                obj = map3.get("extra");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Map) {
                                map4 = (Map) obj;
                            }
                            interfaceC1092860eXs2.LJ(new C1092890eXv(str2, new C0J0M(obj2, c0j0p2, map4)));
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                        }
                    }
                }, finalStrategyConfig);
            }
        } else {
            if (finalStrategyConfig != null) {
                if (triggerStrategyConfig == null) {
                    c1093050eYB.LIZ().Mf0(new InterfaceC1092770eXj() { // from class: X.0eY6
                        @Override // X.InterfaceC1092770eXj
                        public final void LIZ() {
                            InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                            if (interfaceC1092860eXs2 != null) {
                                interfaceC1092860eXs2.LIZ();
                            }
                        }

                        @Override // X.InterfaceC1092770eXj
                        public final void LIZJ(C477840IoY c477840IoY) {
                            InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                            if (interfaceC1092860eXs2 != null) {
                                interfaceC1092860eXs2.LIZLLL(str, c477840IoY);
                            }
                        }

                        @Override // X.InterfaceC1092770eXj
                        public final void LIZLLL(C1093040eYA c1093040eYA) {
                            Object obj;
                            InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                            if (interfaceC1092860eXs2 != null) {
                                String str2 = str;
                                Object obj2 = c1093040eYA.LIZIZ;
                                C0J0P c0j0p2 = c0j0p;
                                Map<String, Object> map3 = c1093040eYA.LIZJ;
                                Map map4 = null;
                                if (map3 != null) {
                                    obj = map3.get("extra");
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof Map) {
                                    map4 = (Map) obj;
                                }
                                interfaceC1092860eXs2.LJ(new C1092890eXv(str2, new C0J0M(obj2, c0j0p2, map4)));
                            }
                        }

                        @Override // X.InterfaceC1092770eXj
                        public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                            InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                            if (interfaceC1092860eXs2 != null) {
                                interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                            }
                        }
                    }, finalStrategyConfig);
                }
            } else if (triggerStrategyConfig != null) {
                c1093050eYB.LIZ().G2(new InterfaceC1092770eXj() { // from class: X.0eY7
                    @Override // X.InterfaceC1092770eXj
                    public final void LIZ() {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZJ(C477840IoY c477840IoY) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZLLL(str, c477840IoY);
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZLLL(C1093040eYA c1093040eYA) {
                        Object obj;
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            String str2 = str;
                            Object obj2 = c1093040eYA.LIZIZ;
                            C0J0P c0j0p2 = c0j0p;
                            Map<String, Object> map3 = c1093040eYA.LIZJ;
                            Map map4 = null;
                            if (map3 != null) {
                                obj = map3.get("extra");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Map) {
                                map4 = (Map) obj;
                            }
                            interfaceC1092860eXs2.LJ(new C1092890eXv(str2, new C0J0M(obj2, c0j0p2, map4)));
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                        }
                    }
                }, triggerStrategyConfig);
            }
            if (strategyConfig != null && !EPIStrategyConfigs.INSTANCE.isEPI(str)) {
                c1093050eYB.LIZ().uY0(str, new InterfaceC1092770eXj() { // from class: X.0eY9
                    @Override // X.InterfaceC1092770eXj
                    public final void LIZ() {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZJ(C477840IoY c477840IoY) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZLLL(str, c477840IoY);
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZLLL(C1093040eYA c1093040eYA) {
                        Object obj;
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            String str2 = str;
                            Object obj2 = c1093040eYA.LIZIZ;
                            C0J0P c0j0p2 = c0j0p;
                            Map<String, Object> map3 = c1093040eYA.LIZJ;
                            Map map4 = null;
                            if (map3 != null) {
                                obj = map3.get("extra");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Map) {
                                map4 = (Map) obj;
                            }
                            interfaceC1092860eXs2.LJ(new C1092890eXv(str2, new C0J0M(obj2, c0j0p2, map4)));
                        }
                    }

                    @Override // X.InterfaceC1092770eXj
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                        if (interfaceC1092860eXs2 != null) {
                            interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                        }
                    }
                });
                return;
            }
        }
        c1093050eYB.LIZ().nU0(triggerStrategyConfig, finalStrategyConfig, new InterfaceC1092770eXj() { // from class: X.0eY8
            @Override // X.InterfaceC1092770eXj
            public final void LIZ() {
                InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                if (interfaceC1092860eXs2 != null) {
                    interfaceC1092860eXs2.LIZ();
                }
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZJ(C477840IoY c477840IoY) {
                InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                if (interfaceC1092860eXs2 != null) {
                    interfaceC1092860eXs2.LIZLLL(str, c477840IoY);
                }
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZLLL(C1093040eYA c1093040eYA) {
                Object obj;
                InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                if (interfaceC1092860eXs2 != null) {
                    String str2 = str;
                    Object obj2 = c1093040eYA.LIZIZ;
                    C0J0P c0j0p2 = c0j0p;
                    Map<String, Object> map3 = c1093040eYA.LIZJ;
                    Map map4 = null;
                    if (map3 != null) {
                        obj = map3.get("extra");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Map) {
                        map4 = (Map) obj;
                    }
                    interfaceC1092860eXs2.LJ(new C1092890eXv(str2, new C0J0M(obj2, c0j0p2, map4)));
                }
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                InterfaceC1092860eXs interfaceC1092860eXs2 = r0;
                if (interfaceC1092860eXs2 != null) {
                    interfaceC1092860eXs2.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                }
            }
        });
        if (strategyConfig != null) {
        }
    }

    @Override // com.bytedance.android.live.livedecision.ILiveDecisionService
    public final void bg(C0J0Q c0j0q, String str, Object obj, String str2, boolean z) {
        ((ILiveFeatureCenterService) ((C1093060eYC) this.LLILLJJLI.getValue()).LIZ.getValue()).bg(c0j0q, str, obj, str2, z);
    }
}
