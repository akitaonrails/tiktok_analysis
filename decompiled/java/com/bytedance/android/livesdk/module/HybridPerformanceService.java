package com.bytedance.android.livesdk.module;

import X.C1097680efe;
import X.C1105650esV;
import X.C13LQ;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1537070q6L;
import X.C1546500qLY;
import X.C1546510qLZ;
import X.C1546560qLe;
import X.C1CC2;
import X.C2097608Jq;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridReuseConfigAndroidABSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridReuseConfigAndroidSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkReuseConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOptSetting;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AFwS340S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class HybridPerformanceService implements IHybridPerformanceService {
    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void fT() {
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void preload() {
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void Ha2() {
        if (LiveQuizContainerOptSetting.INSTANCE.getValue().downgrade) {
            return;
        }
        C1546560qLe.LIZ.getClass();
        C1546500qLY.LJIIIIZZ("live_act_quiz");
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIILL("live_act_quiz");
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void TP2() {
        LiveQuizContainerOptSetting liveQuizContainerOptSetting = LiveQuizContainerOptSetting.INSTANCE;
        if (liveQuizContainerOptSetting.getValue().downgrade) {
            return;
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LJIJ = 1;
        c1097680efe.LIZ = "live_act_quiz";
        c1097680efe.LJIJJ = AFwS340S0000000_17.get$arr$(0);
        c1097680efe.LJIJJLI = liveQuizContainerOptSetting.getValue().preloadAllowList;
        c1097680efe.LJIIIIZZ = AFwS301S0000000_17.get$arr$(11);
        c1097680efe.LJJ = liveQuizContainerOptSetting.getValue().ignoreFailedPreload;
        Boolean bool = Boolean.FALSE;
        C1537060q6K.LJIIL(c1097680efe, bool);
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        C1546510qLZ c1546510qLZ = new C1546510qLZ();
        c1546510qLZ.LIZ = true;
        c1546510qLZ.LIZLLL = 1;
        c1546510qLZ.LJFF = "live_act_quiz";
        c1546510qLZ.LJIIL = liveQuizContainerOptSetting.getValue().reuseAllowList;
        c1546510qLZ.LJIIJ = null;
        c1546510qLZ.LJIIIZ = AFwS301S0000000_17.get$arr$(12);
        c1546500qLY.getClass();
        C1546500qLY.LJI(c1546510qLZ, bool);
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void WP1() {
        LIZ(LiveHybridReuseConfigAndroidSetting.INSTANCE.getValue());
        LIZ(LiveHybridReuseConfigAndroidABSetting.INSTANCE.getValue());
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void nY1() {
        LIZIZ(LiveHybridReuseConfigAndroidSetting.INSTANCE.getValue());
        LIZIZ(LiveHybridReuseConfigAndroidABSetting.INSTANCE.getValue());
    }

    public static void LIZ(SparkReuseConfig[] sparkReuseConfigArr) {
        List<String> listLJJLL;
        List<String> listLJJLL2;
        if (sparkReuseConfigArr != null) {
            for (SparkReuseConfig sparkReuseConfig : sparkReuseConfigArr) {
                if (sparkReuseConfig.biz.length() > 0) {
                    int i = sparkReuseConfig.matchRule;
                    C1546510qLZ c1546510qLZ = new C1546510qLZ();
                    c1546510qLZ.LIZ = sparkReuseConfig.enable;
                    c1546510qLZ.LIZLLL = sparkReuseConfig.volume;
                    c1546510qLZ.LJFF = sparkReuseConfig.biz;
                    String[] strArr = sparkReuseConfig.allowSchemaList;
                    if (strArr != null) {
                        listLJJLL = C13LQ.LJJLL(strArr);
                    } else {
                        listLJJLL = null;
                    }
                    c1546510qLZ.LJIIL = listLJJLL;
                    String[] strArr2 = sparkReuseConfig.denySchemaList;
                    if (strArr2 != null) {
                        listLJJLL2 = C13LQ.LJJLL(strArr2);
                    } else {
                        listLJJLL2 = null;
                    }
                    c1546510qLZ.LJIILIIL = listLJJLL2;
                    c1546510qLZ.LJIIJ = null;
                    c1546510qLZ.LJIIIZ = new C1105650esV(i);
                    C1546500qLY c1546500qLY = C1546560qLe.LIZ;
                    Boolean bool = Boolean.FALSE;
                    c1546500qLY.getClass();
                    C1546500qLY.LJI(c1546510qLZ, bool);
                }
            }
        }
    }

    public static void LIZIZ(SparkReuseConfig[] sparkReuseConfigArr) {
        if (sparkReuseConfigArr != null) {
            for (SparkReuseConfig sparkReuseConfig : sparkReuseConfigArr) {
                if (sparkReuseConfig.biz.length() > 0) {
                    C1546500qLY c1546500qLY = C1546560qLe.LIZ;
                    String str = sparkReuseConfig.biz;
                    c1546500qLY.getClass();
                    C1546500qLY.LJIIIIZZ(str);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.browser.IHybridPerformanceService
    public final void Tp0(final AwS596S0100000_17 awS596S0100000_17) {
        LiveQuizContainerOptSetting liveQuizContainerOptSetting = LiveQuizContainerOptSetting.INSTANCE;
        if (!liveQuizContainerOptSetting.getValue().downgrade) {
            C1CC2.LJII(0, "ttlive_eoy_quiz_opt_monitor", C2097608Jq.LJIIZILJ(new LinkedHashMap()));
            String str = liveQuizContainerOptSetting.getValue().preloadSchema;
            if (str != null) {
                C1537060q6K.LJIIJJI(C1529590puH.LIZ, str, "live_act_quiz", null, new C1537070q6L() { // from class: X.0ehs
                    public boolean LIZ;

                    @Override // X.C1537070q6L
                    public final void LIZJ(String str2, String str3, C1537080q6M c1537080q6M) {
                        this.LIZ = true;
                        C20441214yg.LJIIIZ("HybridPerf", "eoy quiz card preload fail");
                        C1CC2.LJII(2, "ttlive_eoy_quiz_opt_monitor", C2097608Jq.LJIIZILJ(new LinkedHashMap()));
                    }

                    @Override // X.C1537070q6L
                    public final void LIZLLL(String str2, String str3, InterfaceC1105930esx interfaceC1105930esx) {
                        Function1<InterfaceC1105930esx, Unit> function1;
                        if (this.LIZ) {
                            return;
                        }
                        C20441214yg.LJIIIZ("HybridPerf", "eoy quiz card preload success");
                        if (interfaceC1105930esx != null && (function1 = awS596S0100000_17) != null) {
                            function1.invoke(interfaceC1105930esx);
                        }
                        C1CC2.LJII(1, "ttlive_eoy_quiz_opt_monitor", C2097608Jq.LJIIZILJ(new LinkedHashMap()));
                    }
                }, false, null, 32);
            }
        }
    }
}
