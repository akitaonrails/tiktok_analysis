package com.lynx.animax.ability;

import X.C1285630jYn;
import X.C1285670jYr;
import X.C1285680jYs;
import X.C1285750jYz;
import X.C1285770jZ1;
import X.C1285850jZ9;
import X.C1288070jcj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787470Uun;
import X.EnumC994190byj;
import X.InterfaceC1288110jcn;
import X.InterfaceC1288130jcp;
import Y.ARunnableS26S0201000_20;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.audio.AudioAsset;
import com.lynx.animax.audio.AudioPlayer;
import com.lynx.animax.base.bridge.ReadableMap;
import com.lynx.animax.player.IVideoPlayer;
import com.lynx.animax.service.IAnimaXVideoService;
import com.lynx.animax.util.AnimaXLog;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class BaseAbility {
    public final List<InterfaceC1288110jcn> LIZ = new CopyOnWriteArrayList();
    public WeakReference<InterfaceC1288130jcp> LIZIZ;
    public final C1285750jYz LIZJ;
    public final C1285670jYr LIZLLL;
    public final C1285770jZ1 LJ;
    public boolean LJFF;
    public C1288070jcj LJI;

    public String LJIILIIL(String str) {
        return str;
    }

    public boolean disableByteVC1Decoder() {
        return C1285850jZ9.LIZJ(C1285850jZ9.LIZ(this, "ANIMAX_DISABLE_BYTEVC1_DECODER"));
    }

    public BaseAbility() {
        C1285750jYz c1285750jYz = new C1285750jYz(LJIIL());
        this.LIZJ = c1285750jYz;
        this.LIZLLL = new C1285670jYr(c1285750jYz);
        this.LJ = new C1285770jZ1(c1285750jYz);
        this.LJFF = false;
    }

    public C1285680jYs LJIIL() {
        return C1285680jYs.LIZIZ;
    }

    public AudioPlayer createAudioPlayer(AudioAsset audioAsset) {
        ByteBuffer byteBuffer;
        if (audioAsset.LIZ() && (byteBuffer = audioAsset.LIZJ) != null) {
            try {
                return new AudioPlayer(audioAsset.LIZIZ, byteBuffer);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to create AudioPlayer: ");
                sbLIZ.append(e.getMessage());
                AnimaXLog.LIZ("AudioPlayer", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        AnimaXLog.LIZ("AudioPlayer", "Failed to create AudioPlayer: asset is not ready");
        return null;
    }

    public IVideoPlayer createVideoPlayer(long j) {
        C1285670jYr c1285670jYr = this.LIZLLL;
        String strLIZ = C1285850jZ9.LIZ(this, "ANIMAX_VIDEO_SURFACE_DESTROY_TIMEOUT");
        long j2 = 0;
        try {
            if (!TextUtils.isEmpty(strLIZ)) {
                j2 = CastLongProtector.parseLong(strLIZ);
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVideoSurfaceDestroyTimeout fail, message");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("DeviceUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
        c1285670jYr.LIZLLL = j2;
        C1285670jYr c1285670jYr2 = this.LIZLLL;
        if (c1285670jYr2.LIZIZ == EnumC994190byj.CUSTOM) {
            IAnimaXVideoService iAnimaXVideoService = (IAnimaXVideoService) c1285670jYr2.LIZ.LIZ(IAnimaXVideoService.class);
            if (iAnimaXVideoService != null) {
                return iAnimaXVideoService.createVideoPlayer(j, c1285670jYr2);
            }
            AnimaXLog.LIZ("VideoPlayerFactory", "IAnimaXVideoService not found, use default player");
        }
        return new C1285630jYn(j, c1285670jYr2);
    }

    public void sendEvent(int i, ReadableMap readableMap) {
        ARunnableS26S0201000_20 aRunnableS26S0201000_20 = new ARunnableS26S0201000_20(this, i, readableMap.asHashMap(), 11);
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            aRunnableS26S0201000_20.run();
        } else {
            C786410Ut5.LJJZZIII(C787470Uun.LIZ(), aRunnableS26S0201000_20);
        }
    }
}
