package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.C03H5;
import X.C098200Yq;
import X.C0C18;
import X.C1055580dZk;
import X.C1055590dZl;
import X.C1202904nD;
import X.C13IQ;
import X.C13LE;
import X.C189200o6;
import X.C20684815ws;
import X.C300590BqL;
import X.InterfaceC20685415wy;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideComponent;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.experiments.ContentLiveSpecificCheckSettings;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class EcVideoGuideComponent extends BaseCellTriggerComponent<EcVideoGuideComponent> {
    public static volatile boolean LLJL;
    public static final C1055580dZk LLJJLIIIJLLLLLLLZ = new C1055580dZk();
    public static final ConcurrentHashMap<String, String> LLJLIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Double> LLJLILLLLZIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Double> LLJLL = new ConcurrentHashMap<>();
    public static final C1055590dZl LLJLLIL = new InterfaceC20685415wy() { // from class: X.0dZl
        @Override // X.InterfaceC20685415wy
        public void onEvent(String str) {
        }

        @Override // X.InterfaceC20685415wy
        public final void LIZ(String str, Map<String, String> map) {
            try {
                ContentLiveSpecificCheckSettings.Config config = (ContentLiveSpecificCheckSettings.Config) ContentLiveSpecificCheckSettings.LIZIZ.getValue();
                if (config.enable && Intrinsics.LJFF(str, config.androidEvent)) {
                    C1055580dZk c1055580dZk = EcVideoGuideComponent.LLJJLIIIJLLLLLLLZ;
                    String str2 = config.eventParams;
                    c1055580dZk.getClass();
                    JSONObject jSONObjectLIZIZ = C1055580dZk.LIZIZ(null, str2, map);
                    if (jSONObjectLIZIZ == null) {
                        return;
                    }
                    C1055580dZk.LIZJ(C13LP.LLIIII(config.targets.keySet()), jSONObjectLIZIZ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }

        @Override // X.InterfaceC20685415wy
        public final void onEvent(String str, JSONObject jSONObject) {
            try {
                ContentLiveSpecificCheckSettings.Config config = (ContentLiveSpecificCheckSettings.Config) ContentLiveSpecificCheckSettings.LIZIZ.getValue();
                if (config.enable && Intrinsics.LJFF(str, config.androidEvent)) {
                    C1055580dZk c1055580dZk = EcVideoGuideComponent.LLJJLIIIJLLLLLLLZ;
                    String str2 = config.eventParams;
                    c1055580dZk.getClass();
                    JSONObject jSONObjectLIZIZ = C1055580dZk.LIZIZ(jSONObject, str2, null);
                    if (jSONObjectLIZIZ == null) {
                        return;
                    }
                    C1055580dZk.LIZJ(C13LP.LLIIII(config.targets.keySet()), jSONObjectLIZIZ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    };

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C1202904nD.LIZ() ? C13LE.LIZ(EcVideoGuideSlotComponent.class) : C13LE.LIZ(EcVideoGuideAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        boolean zLJJJJZ;
        C1055580dZk c1055580dZk = LLJJLIIIJLLLLLLLZ;
        Aweme aweme = videoItemParams.getAweme();
        c1055580dZk.getClass();
        try {
            if (((ContentLiveSpecificCheckSettings.Config) ContentLiveSpecificCheckSettings.LIZIZ.getValue()).enable) {
                synchronized (c1055580dZk) {
                    if (!LLJL) {
                        C20684815ws.LIZ(LLJLLIL);
                        LLJL = true;
                    }
                }
                C1055580dZk.LIZLLL(aweme);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null) {
            zLJJJJZ = iECommerceAnchorService.LJJJJZ(aweme);
        } else {
            zLJJJJZ = false;
        }
        if (C0C18.LIZ()) {
            if (aweme.isAd() || AwemeExtKt.isSelfSee(aweme) || aweme.getProductRecallType() <= 0 || zLJJJJZ) {
                return false;
            }
        } else if (!aweme.isAd() && !AwemeExtKt.isSelfSee(aweme)) {
            if (aweme.getProductRecallType() <= 0) {
                if (zLJJJJZ && C300590BqL.LIZ()) {
                    return true;
                }
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
