package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C076F;
import X.C09CT;
import X.C0N0Y;
import X.C452501pT;
import com.ss.android.ugc.aweme.components.video.playbox.IVideoPlayService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomLynxVideoPlayerSettings {
    public static final EcomLynxVideoPlayerSettings LIZ = new EcomLynxVideoPlayerSettings();
    public static final EcomLynxVideoPlayer LIZIZ = new EcomLynxVideoPlayer();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(98));

    public static final class EcomLynxVideoPlayer {

        @C09CT("enable_media_box")
        public int enableMediaBox;

        @C09CT("enable_preload")
        public int enablePreload;
    }

    public static boolean LIZ() {
        EcomLynxVideoPlayer ecomLynxVideoPlayer = (EcomLynxVideoPlayer) LIZJ.getValue();
        return ecomLynxVideoPlayer != null && ecomLynxVideoPlayer.enablePreload == 1;
    }

    public static C0N0Y LIZIZ() {
        if (((Boolean) C076F.LIZ.getValue()).booleanValue()) {
            IVideoPlayService iVideoPlayService = (IVideoPlayService) PluggableExtentionKt.pluggableSpi$default(IVideoPlayService.class, false, false, false, 14, null);
            if (iVideoPlayService != null) {
                return iVideoPlayService.LIZJ();
            }
            return null;
        }
        IVideoPlayService iVideoPlayService2 = (IVideoPlayService) PluggableExtentionKt.pluggableSpi$default(IVideoPlayService.class, false, false, false, 14, null);
        if (iVideoPlayService2 != null) {
            return iVideoPlayService2.LIZ();
        }
        return null;
    }
}
