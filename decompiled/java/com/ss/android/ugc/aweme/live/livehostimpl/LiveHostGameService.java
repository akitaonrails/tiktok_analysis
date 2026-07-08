package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1511510pR7;
import X.AnonymousClass1522;
import X.AnonymousClass1523;
import X.AnonymousClass1525;
import X.AnonymousClass1526;
import X.AnonymousClass1527;
import X.AnonymousClass1528;
import X.C1065380dpY;
import X.C1338270kvh;
import X.C1510050pOl;
import X.C151B;
import X.C151D;
import X.C151R;
import X.C152M;
import X.C1844830y6j;
import X.C19266210Yy;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C497740JfY;
import X.InterfaceC204548152c;
import X.InterfaceC331230Cyf;
import X.InterfaceC805220ViK;
import X.InterfaceC829930Wh5;
import X.InterfaceC830890Wid;
import Y.AfS140S0200000_4;
import Y.AfS173S0100000_4;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.LiveGameAiFeatureCenterSwitchSetting;
import com.bytedance.android.livesdk.livesetting.game.GameAiMockModelOffloadSetting;
import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.SmartPreviewGameMomentAiConfigSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelOffloadOptSetting;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.mix.game.api.GameFeedMixApi;
import com.ss.android.ugc.aweme.ml.ab.GameKeytimeRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartGameMLBBHeroRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartGameRestRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPreviewGameMomentAIStrategyExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartSexualRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AwS83S0210000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.game.FeedRequestParams;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveHostGameService implements ILiveGameService {
    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final Object HS0() {
        InterfaceC830890Wid interfaceC830890Wid = C1844830y6j.LIZ.get("pip_resolution_strategy_android");
        if (interfaceC830890Wid == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runSceneStrategy scene : ");
            sbLIZ.append(interfaceC830890Wid);
            sbLIZ.append(' ');
            sbLIZ.append("pip_resolution_strategy_package_android");
            sbLIZ.append("  scene is null value");
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("runSceneStrategy scene : ");
        sbLIZ2.append(interfaceC830890Wid);
        sbLIZ2.append(" strategyName:");
        sbLIZ2.append("pip_resolution_strategy_package_android");
        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, "pip_resolution_strategy_package_android", new TTMParamData((Map<String, Object>) C2097608Jq.LJ()));
            if (interfaceC805220ViKRunScene != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("runSceneStrategy result:");
                sbLIZ3.append(interfaceC805220ViKRunScene.LIZJ());
                sbLIZ3.append(",state code:");
                sbLIZ3.append(interfaceC805220ViKRunScene.LIZIZ());
                sbLIZ3.append(" ,error:");
                sbLIZ3.append(interfaceC805220ViKRunScene.getErrorMessage());
                sbLIZ3.append(" }");
                C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                return interfaceC805220ViKRunScene.LIZJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("runSceneStrategy scene : ");
            sbLIZ4.append(interfaceC830890Wid);
            sbLIZ4.append(' ');
            sbLIZ4.append("pip_resolution_strategy_package_android");
            sbLIZ4.append("  e: ");
            sbLIZ4.append(e.getMessage());
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("runSceneStrategy scene : ");
        sbLIZ5.append(interfaceC830890Wid);
        sbLIZ5.append(' ');
        sbLIZ5.append("pip_resolution_strategy_package_android");
        sbLIZ5.append("  result is null value");
        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ5));
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final InterfaceC331230Cyf K31() {
        return new InterfaceC331230Cyf() { // from class: X.0Cyb
            @Override // X.InterfaceC331230Cyf
            public final void LIZ(Lifecycle lifecycle, Context context, InterfaceC21374418ko interfaceC21374418ko, C331200Cyc c331200Cyc) {
                Aweme aweme = interfaceC21374418ko.getAweme();
                if ((aweme instanceof Aweme) && aweme != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<InterfaceC21374418ko> it2 = c331200Cyc.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme2 = it2.next().getAweme();
                        if ((aweme2 instanceof Aweme) && aweme2 != null) {
                            arrayList.add(aweme2);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(interfaceC21374418ko.getLogExtra());
                    linkedHashMap.put("target_aweme_id", aweme.getAid());
                    C331220Cye c331220Cye = new C331220Cye(arrayList, linkedHashMap);
                    C331240Cyg.LIZ.getClass();
                    C331240Cyg.LIZ(lifecycle, context, c331220Cye);
                }
            }

            @Override // X.InterfaceC331230Cyf
            public final void LIZIZ(Map map, String str, String str2, boolean z, AwS83S0210000_32 awS83S0210000_32) {
                long jLongValue;
                String str3;
                Long lLJIILIIL;
                Long lLJIILIIL2;
                if (map == null) {
                    return;
                }
                FeedRequestParams feedRequestParams = new FeedRequestParams();
                String str4 = (String) map.get("draw_video_id");
                long jLongValue2 = 0;
                if (str4 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str4)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                feedRequestParams.drawVideoId = jLongValue;
                String str5 = (String) map.get("draw_author_id");
                if (str5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str5)) != null) {
                    jLongValue2 = lLJIILIIL.longValue();
                }
                feedRequestParams.drawAuthorId = jLongValue2;
                String str6 = (String) map.get("related_live_tag");
                if (str6 == null) {
                    str6 = "";
                }
                feedRequestParams.relatedLiveTag = str6;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('-');
                sbLIZ.append(str2);
                feedRequestParams.enterSource = C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    str3 = "related_live_refresh";
                } else {
                    str3 = "related_live_loadmore";
                }
                feedRequestParams.reqFrom = str3;
                GameFeedMixApi.LIZ.getClass();
                C331180Cya.LIZ(feedRequestParams).LJJLL(new AfS140S0200000_4(awS83S0210000_32, map, 6), new AfS173S0100000_4(awS83S0210000_32, 15));
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void d8() {
        C19266210Yy.LIZIZ.d8();
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void tM2() {
        C19266210Yy.LIZIZ.LIZLLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void uO2() {
        C19266210Yy.LIZIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final String mM1() {
        return C497740JfY.LJIJI(2131835641);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final InterfaceC204548152c VI1() {
        return new InterfaceC204548152c() { // from class: X.1529
            public static long LIZIZ;
            public static AbstractC1511510pR7 LIZLLL;
            public static final LinkedList<Long> LIZJ = new LinkedList<>();

            static {
                LJI();
            }

            @Override // X.InterfaceC204548152c
            public final boolean LIZJ() {
                return SmartPreviewGameMomentAiConfigSetting.INSTANCE.getValue().f30switch;
            }

            @Override // X.InterfaceC204548152c
            public final boolean LIZLLL() {
                return SmartPreviewGameMomentAiConfigSetting.INSTANCE.getValue().featureCollectSwitch;
            }

            public static void LJI() {
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 86400000);
                Long lLIZIZ = InterfaceC772390URp.f135o0.LIZIZ();
                LIZIZ = (lLIZIZ == null || jCurrentTimeMillis != lLIZIZ.longValue()) ? 0L : InterfaceC772390URp.n0.LIZIZ().longValue();
            }

            public static boolean LJ(Map map) {
                Number number;
                Number number2;
                Number number3;
                Number number4;
                Object obj = map.get("highlight_show");
                if ((obj instanceof Number) && (number = (Number) obj) != null) {
                    int iIntValue = number.intValue();
                    Object obj2 = map.get("highlight_click");
                    if ((obj2 instanceof Number) && (number2 = (Number) obj2) != null) {
                        int iIntValue2 = number2.intValue();
                        Object obj3 = map.get("no_highlight_show");
                        if ((obj3 instanceof Number) && (number3 = (Number) obj3) != null) {
                            int iIntValue3 = number3.intValue();
                            Object obj4 = map.get("no_highlight_click");
                            if ((obj4 instanceof Number) && (number4 = (Number) obj4) != null && ((((double) iIntValue2) + 0.01d) / (((double) iIntValue) + 0.01d)) - ((((double) number4.intValue()) + 0.01d) / (((double) iIntValue3) + 0.01d)) >= 0.0d) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            public static boolean LJFF(Map map) {
                Number number;
                Number number2;
                SmartPreviewGameMomentAiConfigSetting smartPreviewGameMomentAiConfigSetting = SmartPreviewGameMomentAiConfigSetting.INSTANCE;
                boolean z = smartPreviewGameMomentAiConfigSetting.getValue().dataCollectSwitch;
                int i = smartPreviewGameMomentAiConfigSetting.getValue().historyDataShowNumThreshold;
                Object obj = map.get("highlight_show");
                if ((obj instanceof Number) && (number = (Number) obj) != null) {
                    int iIntValue = number.intValue();
                    Object obj2 = map.get("no_highlight_show");
                    if ((obj2 instanceof Number) && (number2 = (Number) obj2) != null) {
                        int iIntValue2 = number2.intValue();
                        if (!z && iIntValue >= i && iIntValue2 >= i) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC204548152c
            public final void LIZ(long j) {
                LinkedList<Long> linkedList = LIZJ;
                if (!linkedList.contains(Long.valueOf(j))) {
                    LJI();
                    LIZIZ++;
                    InterfaceC772390URp.n0.LJFF(Long.valueOf(LIZIZ));
                    InterfaceC772390URp.f135o0.LJFF(Long.valueOf(System.currentTimeMillis() / ((long) 86400000)));
                    linkedList.add(Long.valueOf(j));
                    if (linkedList.size() > 3) {
                        linkedList.remove(C13LP.LJJJJZI(linkedList));
                    }
                }
            }

            @Override // X.InterfaceC204548152c
            public final boolean LIZIZ(long j) {
                Map map;
                Float f;
                boolean z;
                boolean z2;
                Object objZS = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).ZS(2, "ttm_game_live", "preview_live_game_moment_info_graph", "preview_game_moment_ai_strategy");
                if (objZS instanceof Map) {
                    map = (Map) objZS;
                } else {
                    map = null;
                }
                boolean z3 = false;
                if (map == null) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("infer, gameMomentInfoGraph: ");
                sbLIZ.append(map);
                sbLIZ.append("isUseHistoryData: ");
                sbLIZ.append(LJFF(map));
                sbLIZ.append(",historyDataCanShow: ");
                sbLIZ.append(LJ(map));
                sbLIZ.append(",todayShowTimes: ");
                sbLIZ.append(LIZIZ);
                C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ));
                if (LJFF(map)) {
                    if (!LJ(map)) {
                        if (LIZIZ < SmartPreviewGameMomentAiConfigSetting.INSTANCE.getValue().showFreq) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LIZJ.contains(Long.valueOf(j)) && j != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z && !z2) {
                            return false;
                        }
                    }
                    return true;
                }
                C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
                C1510230pP3 c1510230pP3 = new C1510230pP3("preview_game_moment_ai_strategy");
                c1510230pP3.LIZIZ = SmartPreviewGameMomentAIStrategyExperiment.INSTANCE.getConfig();
                AbstractC1511510pR7 abstractC1511510pR7LIZ = c1511390pQvLIZ.LIZ("preview_game_moment_ai_strategy", c1510230pP3);
                if (abstractC1511510pR7LIZ == null) {
                    return false;
                }
                LIZLLL = abstractC1511510pR7LIZ;
                C1512100pS4 c1512100pS4RunSync = abstractC1511510pR7LIZ.runSync(new C1509310pNZ(0));
                if (c1512100pS4RunSync == null) {
                    return false;
                }
                SmartPreviewGameMomentAiConfigSetting smartPreviewGameMomentAiConfigSetting = SmartPreviewGameMomentAiConfigSetting.INSTANCE;
                if (smartPreviewGameMomentAiConfigSetting.getValue().dataCollectSwitch) {
                    return true;
                }
                Map<String, Float> map2 = c1512100pS4RunSync.LIZJ;
                if (map2 != null && (f = map2.get("1")) != null) {
                    if (f.floatValue() >= smartPreviewGameMomentAiConfigSetting.getValue().scoreThreshold) {
                        z3 = true;
                    }
                    AbstractC1511510pR7 abstractC1511510pR7 = LIZLLL;
                    if (abstractC1511510pR7 != null) {
                        abstractC1511510pR7.releaseModel();
                    }
                }
                return z3;
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void OV(C151B c151b) {
        AnonymousClass1522.LIZ.getClass();
        AbstractC1511510pR7 abstractC1511510pR7LJI = AnonymousClass1522.LJI(c151b);
        if (abstractC1511510pR7LJI != null) {
            abstractC1511510pR7LJI.releaseModel();
        }
        AnonymousClass1522.LIZJ = null;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final Object QM(String str) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_performance", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        return producer$default.getFeature(str, (JSONObject) null, "livesdk_client_intelligent_offload", (ReturnCode) null);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void WC0(final String str) {
        if (str != null) {
            if (TTMStrategyCenterManager.isInit()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registerStrategy sceneKey:");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ));
                C1844830y6j.LIZ(str);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("registerStrategy sceneKey:");
            sbLIZ2.append(str);
            sbLIZ2.append(" after init");
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.1524
                @Override // X.InterfaceC829930Wh5
                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                        C1844830y6j.LIZ(str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final boolean Wk2(C151B c151b) {
        AnonymousClass1522.LIZ.getClass();
        GameAiMockModelOffloadSetting gameAiMockModelOffloadSetting = GameAiMockModelOffloadSetting.INSTANCE;
        if (gameAiMockModelOffloadSetting.enableSetting()) {
            return gameAiMockModelOffloadSetting.isOffload();
        }
        AbstractC1511510pR7 abstractC1511510pR7LJI = AnonymousClass1522.LJI(c151b);
        if (abstractC1511510pR7LJI != null) {
            return abstractC1511510pR7LJI.checkIfOffload();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final int cq2(int i) {
        InterfaceC830890Wid interfaceC830890Wid = C1844830y6j.LIZ.get("gp_anchor_restriction_android");
        if (interfaceC830890Wid != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runSceneWithParams scene : ");
            sbLIZ.append(interfaceC830890Wid);
            sbLIZ.append(" strategyName:");
            sbLIZ.append("gp_anchor_restriction_android");
            sbLIZ.append(" value:");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ));
            try {
                HashMap map = new HashMap();
                map.put("partnership_anchor_impression_time", Integer.valueOf(i));
                InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, "gp_anchor_restriction_android", new TTMParamData((Map<String, Object>) map));
                if (interfaceC805220ViKRunScene != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("runSceneWithParams value:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" result : ");
                    sbLIZ2.append(interfaceC805220ViKRunScene.LIZJ());
                    C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                    Object objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                    if (objLIZJ instanceof Boolean) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("runSceneWithParams scene : ");
                        sbLIZ3.append(interfaceC830890Wid);
                        sbLIZ3.append(' ');
                        sbLIZ3.append("gp_anchor_restriction_android");
                        sbLIZ3.append("  ret ");
                        sbLIZ3.append(((Boolean) objLIZJ).booleanValue());
                        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                        return ((Boolean) objLIZJ).booleanValue() ? 1 : 0;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("runSceneWithParams scene : ");
                    sbLIZ4.append(interfaceC830890Wid);
                    sbLIZ4.append(' ');
                    sbLIZ4.append("gp_anchor_restriction_android");
                    sbLIZ4.append("  ret ");
                    sbLIZ4.append(objLIZJ);
                    sbLIZ4.append(" is not boolean return -1");
                    C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ4));
                    return -1;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("runSceneWithParams scene : ");
                sbLIZ5.append(interfaceC830890Wid);
                sbLIZ5.append(' ');
                sbLIZ5.append("gp_anchor_restriction_android");
                sbLIZ5.append("  e: ");
                sbLIZ5.append(e.getMessage());
                C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ5));
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("runSceneWithParams scene : ");
            sbLIZ6.append(interfaceC830890Wid);
            sbLIZ6.append(' ');
            sbLIZ6.append("gp_anchor_restriction_android");
            sbLIZ6.append("  result is null value:-1");
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ6));
            return -1;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("runSceneWithParams scene : ");
        sbLIZ7.append(interfaceC830890Wid);
        sbLIZ7.append(' ');
        sbLIZ7.append("gp_anchor_restriction_android");
        sbLIZ7.append("  scene is null value:-1");
        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ7));
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final boolean e92(String str) {
        if (C1844830y6j.LIZ.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final Object getFeature(String str) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live_game", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        return FeatureProducer.getFeature$default(producer$default, str, (JSONObject) null, "live_game_self", (ReturnCode) null, 10, (Object) null);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void w82(C151B c151b) {
        AnonymousClass1522.LIZ.getClass();
        AbstractC1511510pR7 abstractC1511510pR7LJI = AnonymousClass1522.LJI(c151b);
        if (abstractC1511510pR7LJI != null && abstractC1511510pR7LJI.enable()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            abstractC1511510pR7LJI.preloadEnv();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final String yh2(C151B c151b) {
        SmartSdkConfig sdkConfig;
        PitayaMLConfig pitayaMLConfig;
        String businessName;
        SmartSdkConfig sdkConfig2;
        PitayaMLConfig pitayaMLConfig2;
        String businessName2;
        SmartSdkConfig sdkConfig3;
        PitayaMLConfig pitayaMLConfig3;
        String businessName3;
        SmartSdkConfig sdkConfig4;
        PitayaMLConfig pitayaMLConfig4;
        String businessName4;
        AnonymousClass1522.LIZ.getClass();
        if (c151b == C151B.SEXUAL) {
            AnonymousClass1525 config = SmartSexualRecognitionExperiment.INSTANCE.getConfig();
            if (config == null || (sdkConfig4 = config.getSdkConfig()) == null || (pitayaMLConfig4 = sdkConfig4.getPitayaMLConfig()) == null || (businessName4 = pitayaMLConfig4.getBusinessName()) == null) {
                return "game_sexual";
            }
            return businessName4;
        }
        if (c151b == C151B.KEY_TIME) {
            AnonymousClass1528 config2 = GameKeytimeRecognitionExperiment.INSTANCE.getConfig();
            if (config2 != null && (sdkConfig3 = config2.getSdkConfig()) != null && (pitayaMLConfig3 = sdkConfig3.getPitayaMLConfig()) != null && (businessName3 = pitayaMLConfig3.getBusinessName()) != null) {
                return businessName3;
            }
            return "game_time";
        }
        if (c151b == C151B.KEY_GAP) {
            AnonymousClass1527 config3 = SmartGameRestRecognitionExperiment.INSTANCE.getConfig();
            if (config3 != null && (sdkConfig2 = config3.getSdkConfig()) != null && (pitayaMLConfig2 = sdkConfig2.getPitayaMLConfig()) != null && (businessName2 = pitayaMLConfig2.getBusinessName()) != null) {
                return businessName2;
            }
            return SmartGameRestRecognitionExperiment.SCENE;
        }
        if (c151b == C151B.MLBB_HERO) {
            AnonymousClass1526 config4 = SmartGameMLBBHeroRecognitionExperiment.INSTANCE.getConfig();
            if (config4 != null && (sdkConfig = config4.getSdkConfig()) != null && (pitayaMLConfig = sdkConfig.getPitayaMLConfig()) != null && (businessName = pitayaMLConfig.getBusinessName()) != null) {
                return businessName;
            }
            return "game_live_mlbb_hero";
        }
        return "unKnow";
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final boolean XL0(Object obj, String str) {
        if (!LiveGameAiFeatureCenterSwitchSetting.INSTANCE.getValue() || Intrinsics.LJFF(getFeature(str), obj)) {
            return false;
        }
        C1065380dpY c1065380dpYLIZ = C152M.LIZ(str);
        if (c1065380dpYLIZ != null) {
            c1065380dpYLIZ.setFeature(str, obj);
            return true;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final Object Cz(String str, String str2, HashMap<String, Object> map) {
        InterfaceC830890Wid interfaceC830890Wid = C1844830y6j.LIZ.get(str);
        Object objLIZJ = null;
        if (interfaceC830890Wid != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runSceneWithParams scene : ");
            sbLIZ.append(interfaceC830890Wid);
            sbLIZ.append(" strategyName:");
            sbLIZ.append(str2);
            sbLIZ.append(" params:");
            sbLIZ.append(map);
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ));
            try {
                InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, str2, new TTMParamData((Map<String, Object>) map));
                if (interfaceC805220ViKRunScene != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("runSceneWithParams params:");
                    sbLIZ2.append(map);
                    sbLIZ2.append("  }");
                    C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("runSceneWithParams result:");
                    sbLIZ3.append(interfaceC805220ViKRunScene.LIZJ());
                    sbLIZ3.append(",state code:");
                    sbLIZ3.append(interfaceC805220ViKRunScene.LIZIZ());
                    sbLIZ3.append(" ,error:");
                    sbLIZ3.append(interfaceC805220ViKRunScene.getErrorMessage());
                    sbLIZ3.append(" }");
                    C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                    objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                    return objLIZJ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("runSceneWithParams scene : ");
                sbLIZ4.append(interfaceC830890Wid);
                sbLIZ4.append(' ');
                sbLIZ4.append(str2);
                sbLIZ4.append("  e: ");
                sbLIZ4.append(e.getMessage());
                C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ4));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("runSceneWithParams scene : ");
            sbLIZ5.append(interfaceC830890Wid);
            sbLIZ5.append(' ');
            sbLIZ5.append(str2);
            sbLIZ5.append("  result is null value");
            C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ5));
            return objLIZJ;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("runSceneWithParams scene : ");
        sbLIZ6.append(interfaceC830890Wid);
        sbLIZ6.append(' ');
        sbLIZ6.append(str2);
        sbLIZ6.append("  scene is null value");
        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ6));
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final boolean vT0(int i, String str, Map<String, String> map) {
        AnonymousClass1523 anonymousClass1523 = AnonymousClass1523.LJFF;
        anonymousClass1523.getClass();
        String str2 = AnonymousClass1523.LJIIIIZZ.get(Integer.valueOf(i));
        if (str2 == null) {
            return false;
        }
        if (Intrinsics.LJFF(str2, "g_interaction_fusion_tag_id")) {
            if (Intrinsics.LJFF(getFeature(str2), str)) {
                return false;
            }
            anonymousClass1523.setFeature(str2, str);
            String str3 = map.get(str);
            if (str3 == null) {
                str3 = "";
            }
            anonymousClass1523.setFeature("g_interaction_fusion_tag_name", str3);
            return true;
        }
        if (Intrinsics.LJFF(getFeature(str2), str)) {
            return false;
        }
        anonymousClass1523.setFeature(str2, str);
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final Object ZS(int i, String str, String str2, String str3) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer = C1510050pOl.LIZ().getProducer(str, i);
        if (producer == null) {
            return null;
        }
        return producer.getFeature(str2, (JSONObject) null, str3, (ReturnCode) null);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveGameService
    public final void Zg2(ByteBuffer byteBuffer, C151R c151r, C151B c151b, boolean z, long j, String str) {
        int i = C151D.LIZ[c151b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AnonymousClass1522.LIZ.getClass();
                        AnonymousClass1522.LIZLLL(byteBuffer, c151r, c151b, z, j, str);
                        return;
                    }
                    return;
                }
                if (VirtualSexualModelOffloadOptSetting.INSTANCE.getValue()) {
                    AnonymousClass1522.LIZ.getClass();
                    AnonymousClass1522.LIZLLL(byteBuffer, c151r, c151b, z, j, str);
                    return;
                } else {
                    AnonymousClass1522.LIZ.getClass();
                    AnonymousClass1522.LIZJ(byteBuffer, c151r, c151b);
                    return;
                }
            }
            if (GameRestRecognitionLiveSetting.INSTANCE.getValue().enableFunction) {
                AnonymousClass1522.LIZ.getClass();
                AnonymousClass1522.LIZLLL(byteBuffer, c151r, c151b, z, j, str);
                return;
            } else {
                AnonymousClass1522.LIZ.getClass();
                AnonymousClass1522.LIZJ(byteBuffer, c151r, c151b);
                return;
            }
        }
        if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOffloadOpt) {
            AnonymousClass1522.LIZ.getClass();
            AnonymousClass1522.LIZLLL(byteBuffer, c151r, c151b, z, j, str);
        } else {
            AnonymousClass1522.LIZ.getClass();
            AnonymousClass1522.LIZJ(byteBuffer, c151r, c151b);
        }
    }
}
