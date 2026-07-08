package com.ss.android.ugc.aweme.live;

import X.AbstractC827890Wdn;
import X.AnonymousClass0810;
import X.C0BT9;
import X.C0N7U;
import X.C0VSJ;
import X.C0WZX;
import X.C1483410ohn;
import X.C1553670qX7;
import X.C1701330uNH;
import X.C1702430uP3;
import X.C19GS;
import X.C1BN8;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2354709Kn;
import X.C309620CBs;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.IAnchorAutoSelectionService;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class LiveHostOuterService implements ILiveHostOuterService {
    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void LIZ() {
        if (C1702430uP3.LIZ) {
            C2187451AjH.LJFF(C1702430uP3.LJIIIIZZ * LSPassThroughRecordSizeConfig.DEFAULT);
        }
        int i = AnonymousClass0810.LIZ.LIZJ;
        if (i == 2) {
            if (C0N7U.LIZJ) {
                C2187451AjH.LJIILLIIL(5000);
            }
        } else if (i == 3 && C309620CBs.LIZJ) {
            C2187451AjH.LJIILLIIL(5000);
        }
        C2187451AjH.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String LIZIZ() {
        AbstractC827890Wdn.LIZIZ().getClass();
        C1553670qX7.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C1553670qX7.LIZLLL().getPath(), C1553670qX7.LIZ());
        C2354709Kn.LJI(c0vsj);
        return c0vsj.getPath();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean isPartnershipNewAttrPointEnable() {
        return C0BT9.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean tryChangeShortVideoPlayingStatus(Boolean bool) {
        boolean zIsPlaying = C1483410ohn.LJLJJI().isPlaying();
        if (bool.booleanValue() && !zIsPlaying) {
            C1483410ohn.LJLJJI().LJIILLIIL();
            C1483410ohn.LJLJJI().LJIJJ();
            return true;
        }
        if (!bool.booleanValue() && zIsPlaying) {
            C1483410ohn.LJLJJI().LIZ();
            C1483410ohn.LJLJJI().LJFF();
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void anchorAutoSelection(Context context, JSONObject jSONObject) {
        IAnchorAutoSelectionService iAnchorAutoSelectionService = (IAnchorAutoSelectionService) PluggableExtentionKt.pluggableSpi(IAnchorAutoSelectionService.class);
        if (iAnchorAutoSelectionService != null) {
            iAnchorAutoSelectionService.anchorAutoSelection(context, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void LIZJ(C19GS c19gs, boolean z, boolean z2) {
        IMainService iMainService;
        if (z && z2 && !C1BN8.LIZ().LIZIZ() && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class)) != null) {
            Intent intent = new Intent(c19gs, iMainService.getMainActivityClass());
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19gs, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, c19gs);
            C2204961BRm.LJIILLIIL(c19gs, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqY2WPuyvttYGlUT2L1H41s=", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void tryOpenFeedWithExtra(Context context, String str, Bundle bundle, Map<String, String> map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
            smartRouteBuildRoute.withParam("feed_param_extra", new HashMap(c2344009Gk.LIZ));
        }
        if (bundle != null) {
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
    }
}
