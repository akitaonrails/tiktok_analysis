package com.bytedance.live.render.engine.alphaplayer.player;

import X.C1149270g0r;
import X.C1697810uHb;
import X.C176600m4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2246651CwZ;
import X.C2246671Cwb;
import X.C2246711Cwf;
import X.C2246721Cwg;
import X.C2246981Cx6;
import X.C2247221CxU;
import X.C500260Jjc;
import X.C520010KaN;
import X.C786410Ut5;
import X.InterfaceC2246731Cwh;
import Y.ARunnableS35S1100000_31;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService;
import com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttvideoengine.TTVideoEngine;

/* JADX INFO: loaded from: classes35.dex */
public class LiveGiftPlayerService implements ILiveGiftAlphaPlayerService {
    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final Object buildDelegateGiftPlayListener(InterfaceC2246731Cwh interfaceC2246731Cwh) {
        return new C2246711Cwf(interfaceC2246731Cwh);
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void clearMasks(Object obj) {
        C2246651CwZ c2246651CwZ;
        LocalPlayerControllerKotlin localPlayerControllerKotlin;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null && (localPlayerControllerKotlin = c2246651CwZ.LJII) != null) {
            localPlayerControllerKotlin.LIZ();
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final View getAlphaView(Object obj) {
        C2246651CwZ c2246651CwZ;
        LocalPlayerControllerKotlin localPlayerControllerKotlin;
        if (!(obj instanceof C2246651CwZ) || (c2246651CwZ = (C2246651CwZ) obj) == null || (localPlayerControllerKotlin = c2246651CwZ.LJII) == null) {
            return null;
        }
        return localPlayerControllerKotlin.getView();
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void stop(Object obj) {
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.stop();
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void tryCancel(Object obj) {
        C2246651CwZ c2246651CwZ;
        LocalPlayerControllerKotlin localPlayerControllerKotlin;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null && (localPlayerControllerKotlin = c2246651CwZ.LJII) != null) {
            localPlayerControllerKotlin.cancel();
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setAutoReleaseParam(Object obj, boolean z) {
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.LJIIIZ = z;
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setKeepLastFrame(Object obj, boolean z) {
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.LJIIJJI = z;
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setLoopParam(Object obj, boolean z) {
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.LJIIJ = z;
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setMute(Object obj, boolean z) {
        C2246651CwZ c2246651CwZ;
        AbsPlayer absPlayer;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null && (absPlayer = c2246651CwZ.LJIIIIZZ) != null) {
            if (absPlayer instanceof C2247221CxU) {
                C2247221CxU c2247221CxU = (C2247221CxU) absPlayer;
                c2247221CxU.LJ = z;
                MediaPlayer mediaPlayer = c2247221CxU.LIZ;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                        return;
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                        return;
                    }
                }
                return;
            }
            if (absPlayer instanceof C2246981Cx6) {
                C2246981Cx6 c2246981Cx6 = (C2246981Cx6) absPlayer;
                c2246981Cx6.LJIIJ = z;
                TTVideoEngine tTVideoEngine = c2246981Cx6.LIZLLL;
                if (tTVideoEngine == null) {
                    return;
                }
                tTVideoEngine.LJ(z);
                return;
            }
            if (!(absPlayer instanceof TTMultiplePlayerImpl) && !(absPlayer instanceof TTMultiplePlayerImplV2)) {
            }
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setTransparentType(Object obj, int i) {
        C2246651CwZ c2246651CwZ;
        LocalPlayerControllerKotlin localPlayerControllerKotlin;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null && (localPlayerControllerKotlin = c2246651CwZ.LJII) != null) {
            localPlayerControllerKotlin.LJIIIZ(i);
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void tryPreloadFromExternal(Context context, String str) {
        C2246671Cwb.LIZ.getClass();
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnablePreloadConfig()) {
            C1149270g0r.LIZIZ("LiveGiftVideoCacheManager_gift_video_engine", "tryPreloadFromExternal");
            if (C176600m4.LIZIZ(Boolean.valueOf(C500260Jjc.LJJIIZI(str)))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryPreloadFromExternal, lastFirstFrameDuration=");
                sbLIZ.append(C2246671Cwb.LJIIJ);
                sbLIZ.append(", preloadPath=");
                sbLIZ.append(str);
                C20441214yg.LJIIIZ("LiveGiftVideoCacheManager_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJJZZIII((Handler) C2246671Cwb.LIZIZ.getValue(), new ARunnableS35S1100000_31(context, str, 4));
            }
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup) {
        C2246711Cwf c2246711Cwf;
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.LJIIL();
            c2246651CwZ.LJ = null;
            c2246651CwZ.LJIILIIL();
            c2246651CwZ.detachAlphaView(viewGroup);
            c2246651CwZ.release();
        }
        if ((obj2 instanceof C2246711Cwf) && (c2246711Cwf = (C2246711Cwf) obj2) != null) {
            c2246711Cwf.LIZ = null;
        }
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final Object start(Object obj, String str, long j) {
        C2246651CwZ c2246651CwZ;
        if (!(obj instanceof C2246651CwZ) || (c2246651CwZ = (C2246651CwZ) obj) == null) {
            return null;
        }
        return c2246651CwZ.LIZJ(j, C1697810uHb.LJIILJJIL(str));
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup) {
        C2246711Cwf c2246711Cwf;
        C2246721Cwg c2246721Cwg = null;
        if (obj instanceof C2246711Cwf) {
            c2246711Cwf = (C2246711Cwf) obj;
        } else {
            c2246711Cwf = null;
        }
        if (context == null) {
            return null;
        }
        C2246651CwZ c2246651CwZ = new C2246651CwZ(context, null, false);
        c2246651CwZ.LJIJJLI(C520010KaN.LJJIFFI(context, false), null);
        if (c2246711Cwf != null) {
            c2246721Cwg = c2246711Cwf.LIZ;
        }
        c2246651CwZ.LJ = c2246721Cwg;
        c2246651CwZ.attachAlphaView(viewGroup);
        return c2246651CwZ;
    }

    @Override // com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService
    public final void setImageMask(Object obj, String str, Bitmap bitmap, float f) {
        C2246651CwZ c2246651CwZ;
        if ((obj instanceof C2246651CwZ) && (c2246651CwZ = (C2246651CwZ) obj) != null) {
            c2246651CwZ.LJIIJJI(str, bitmap, f);
        }
    }
}
