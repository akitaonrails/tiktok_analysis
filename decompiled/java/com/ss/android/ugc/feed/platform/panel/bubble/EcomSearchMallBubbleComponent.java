package com.ss.android.ugc.feed.platform.panel.bubble;

import X.C0CN5;
import X.C0RD6;
import X.C20684815ws;
import Y.ARunnableS79S0200000_10;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ab.ECSearchMallBubbleConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchMallBubbleComponent extends BasePanelComponent {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final ConcurrentHashMap<String, Runnable> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        long jLIZ;
        if (!ECSearchMallBubbleConfig.LIZ().enableAfterFeedVideoBubble) {
            return;
        }
        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
        if (iEcUgColdBootDowngradeService != null && iEcUgColdBootDowngradeService.LIZJ()) {
            IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService2 = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
            if (iEcUgColdBootDowngradeService2 != null) {
                jLIZ = iEcUgColdBootDowngradeService2.LIZ();
            } else {
                jLIZ = 0;
            }
            C0CN5.LIZIZ(Long.valueOf(jLIZ), new ARunnableS79S0200000_10(c0rd6, this, 43));
            return;
        }
        c0rd6.LIZIZ("event_on_playing", new AwS589S0100000_10(this, 451));
        c0rd6.LIZIZ("event_on_play_pause", new AwS589S0100000_10(this, 452));
    }

    public static void bo(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", str);
        jSONObject.put(Scene.SCENE_SERVICE, "feed");
        jSONObject.put("awemeId", str2);
        jSONObject.put("reason", str3);
        C20684815ws.LJIJ("rd_tiktokec_shop_tab_search_bubble", jSONObject);
    }
}
