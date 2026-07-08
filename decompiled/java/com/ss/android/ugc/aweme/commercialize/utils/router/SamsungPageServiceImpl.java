package com.ss.android.ugc.aweme.commercialize.utils.router;

import X.C01GW;
import X.C0WZX;
import X.C1017180cZo;
import X.C123100dR;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C2204961BRm;
import X.C259800zU;
import X.C452501pT;
import X.C783060Ung;
import Y.AfS152S0200000_16;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MiniCardDeeplinkModel;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes17.dex */
public final class SamsungPageServiceImpl implements ISamsungPageService {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 402));

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final boolean LJI(int i) {
        return i == 53 || i == 54 || i == 35 || i == 62 || i == 63 || i == 4 || i == 36 || i == 6 || i == 5;
    }

    public static boolean LJIIJ(AwemeRawAd awemeRawAd) {
        String fullScreenDL;
        MiniCardDeeplinkModel deeplink;
        if (awemeRawAd == null || C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return false;
        }
        MiniCardModel miniCardModel = awemeRawAd.getMiniCardModel();
        if (miniCardModel != null && (deeplink = miniCardModel.getDeeplink()) != null) {
            fullScreenDL = deeplink.getFullScreenDL();
        } else {
            fullScreenDL = null;
        }
        return C123100dR.LIZ(fullScreenDL);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.01kM] */
    public static void LJIIJJI(AwemeRawAd awemeRawAd) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C783060Ung.LIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJLJI(1200L, TimeUnit.MILLISECONDS).LJJLL(new AfS152S0200000_16(c259800zU, awemeRawAd, 3), new AfS181S0100000_12(c259800zU, 120));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final Map<String, Object> LIZIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appstore_type", "samsung");
        linkedHashMap.put("download_type", 2);
        linkedHashMap.put("minicard_type", LJFF(awemeRawAd));
        linkedHashMap.put("package_name", awemeRawAd.getPackageName());
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final boolean LIZJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return false;
        }
        if (LJIIIZ(awemeRawAd)) {
            return true;
        }
        return LJIIJ(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final boolean LJ(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel;
        if (awemeRawAd != null && (miniCardModel = awemeRawAd.getMiniCardModel()) != null && miniCardModel.getLeftSlideGuideOptimize() == 1 && LIZJ(awemeRawAd)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final Integer LJFF(AwemeRawAd awemeRawAd) {
        if (C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return null;
        }
        if (LJIIIZ(awemeRawAd)) {
            return 2;
        }
        if (!LJIIJ(awemeRawAd)) {
            return null;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final boolean LJII(AwemeRawAd awemeRawAd) {
        return LJIIIZ(awemeRawAd);
    }

    public final boolean LJIIIZ(AwemeRawAd awemeRawAd) {
        String halfScreenDL;
        MiniCardDeeplinkModel deeplink;
        if (awemeRawAd == null || C1017180cZo.LJIIIIZZ(awemeRawAd) != 3) {
            return false;
        }
        MiniCardModel miniCardModel = awemeRawAd.getMiniCardModel();
        if (miniCardModel != null && (deeplink = miniCardModel.getDeeplink()) != null) {
            halfScreenDL = deeplink.getHalfScreenDL();
        } else {
            halfScreenDL = null;
        }
        if (((Boolean) ((Pair) this.LIZ.getValue()).getFirst()).booleanValue() && C123100dR.LIZ(halfScreenDL)) {
            return true;
        }
        return false;
    }

    public static void LJIIIIZZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+KcGIhKpSgXHaG/xH619W7LKYRMi48M=", null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    public final boolean LIZ(Context context, Aweme aweme, int i) {
        return LIZLLL(context, aweme, i, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(android.content.Context r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.router.SamsungPageServiceImpl.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean, boolean):boolean");
    }
}
