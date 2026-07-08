package kotlin.jvm.internal;

import X.AbstractC1273900jFs;
import X.C09AY;
import X.C1142270fpZ;
import X.C1269340j8W;
import X.EnumC1324400kZK;
import X.SurfaceHolderCallbackC1324410kZL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.ShortVideoAudioPushManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class AwS31S0100001_20 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS31S0100001_20 awS31S0100001_20) {
        ((SurfaceHolderCallbackC1324410kZL) awS31S0100001_20.l0).LLILLJJLI = Float.valueOf(awS31S0100001_20.f1);
        if (((SurfaceHolderCallbackC1324410kZL) awS31S0100001_20.l0).LLILLL != EnumC1324400kZK.INIT || ((SurfaceHolderCallbackC1324410kZL) awS31S0100001_20.l0).LLILLL != EnumC1324400kZK.DESTROYED) {
            ((SurfaceHolderCallbackC1324410kZL) awS31S0100001_20.l0).LIZ(awS31S0100001_20.f1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0100001_20 awS31S0100001_20) {
        final AudioDeviceModule.AudioRenderSink audioRenderSinkCreateRenderSink;
        int iLJIIJ;
        long audioLongAddress;
        C1269340j8W c1269340j8WLLD;
        AudioDeviceModule audioDeviceModuleLJLLI;
        AudioDeviceModule audioDeviceModuleLJLLI2;
        ((C1142270fpZ) awS31S0100001_20.l0).getClass();
        long j = 0;
        if (C1142270fpZ.LIZLLL() == null) {
            ((C1142270fpZ) awS31S0100001_20.l0).LIZ();
            return 0L;
        }
        C1142270fpZ c1142270fpZ = (C1142270fpZ) awS31S0100001_20.l0;
        final AudioDeviceModule.AudioRenderSink audioRenderSink = c1142270fpZ.LIZIZ;
        if (audioRenderSink != null && c1142270fpZ.LIZ != 0) {
            final float fLJ = C1142270fpZ.LJ(awS31S0100001_20.f1);
            Runnable runnable = new Runnable() { // from class: X.0jFm
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.AudioRenderSink audioRenderSink2 = audioRenderSink;
                    float f = fLJ;
                    audioRenderSink2.getClass();
                    C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setPlayerVolume$1L");
                    AudioDeviceModule.nativeRenderSinkSetPlayerVolume(audioRenderSink2.mNativeObj, f);
                    C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setPlayerVolume$1L");
                }
            };
            if (audioRenderSink.LLILZ) {
                audioRenderSink.LLIZLLLIL(audioRenderSink.LL, runnable);
            } else {
                runnable.run();
            }
            return Long.valueOf(((C1142270fpZ) awS31S0100001_20.l0).LIZ);
        }
        if (C1142270fpZ.LIZLLL() != null) {
            ((C1142270fpZ) awS31S0100001_20.l0).getClass();
            AbstractC1273900jFs abstractC1273900jFsLIZLLL = C1142270fpZ.LIZLLL();
            if (abstractC1273900jFsLIZLLL != null && (audioDeviceModuleLJLLI2 = abstractC1273900jFsLIZLLL.LJLLI()) != null) {
                audioDeviceModuleLJLLI2.startPlayer();
            }
            ((C1142270fpZ) awS31S0100001_20.l0).getClass();
            AbstractC1273900jFs abstractC1273900jFsLIZLLL2 = C1142270fpZ.LIZLLL();
            if (abstractC1273900jFsLIZLLL2 != null && (audioDeviceModuleLJLLI = abstractC1273900jFsLIZLLL2.LJLLI()) != null) {
                audioRenderSinkCreateRenderSink = audioDeviceModuleLJLLI.createRenderSink();
            } else {
                audioRenderSinkCreateRenderSink = null;
            }
            if (audioRenderSinkCreateRenderSink != null) {
                audioRenderSinkCreateRenderSink.LLJILJIL(0L);
            }
            if (audioRenderSinkCreateRenderSink != null) {
                C1142270fpZ c1142270fpZ2 = (C1142270fpZ) awS31S0100001_20.l0;
                float f = awS31S0100001_20.f1;
                c1142270fpZ2.getClass();
                final float fLJ2 = C1142270fpZ.LJ(f);
                Runnable runnable2 = new Runnable() { // from class: X.0jFm
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink2 = audioRenderSinkCreateRenderSink;
                        float f2 = fLJ2;
                        audioRenderSink2.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setPlayerVolume$1L");
                        AudioDeviceModule.nativeRenderSinkSetPlayerVolume(audioRenderSink2.mNativeObj, f2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setPlayerVolume$1L");
                    }
                };
                if (audioRenderSinkCreateRenderSink.LLILZ) {
                    audioRenderSinkCreateRenderSink.LLIZLLLIL(audioRenderSinkCreateRenderSink.LL, runnable2);
                } else {
                    runnable2.run();
                }
            }
            ((C1142270fpZ) awS31S0100001_20.l0).LIZIZ = audioRenderSinkCreateRenderSink;
            AbstractC1273900jFs abstractC1273900jFsLIZLLL3 = C1142270fpZ.LIZLLL();
            int i = 0;
            if (abstractC1273900jFsLIZLLL3 != null && (c1269340j8WLLD = abstractC1273900jFsLIZLLL3.LLD()) != null) {
                iLJIIJ = c1269340j8WLLD.LJIIJ();
            } else {
                iLJIIJ = 0;
            }
            ((C1142270fpZ) awS31S0100001_20.l0).getClass();
            AbstractC1273900jFs abstractC1273900jFsLIZLLL4 = C1142270fpZ.LIZLLL();
            if (abstractC1273900jFsLIZLLL4 != null && abstractC1273900jFsLIZLLL4.LLD() != null) {
                i = 2;
            }
            if (iLJIIJ > 0 && i > 0) {
                try {
                    audioLongAddress = ShortVideoAudioPushManager.getAudioLongAddress(audioRenderSinkCreateRenderSink, iLJIIJ, i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((C1142270fpZ) awS31S0100001_20.l0).LIZ();
                    audioLongAddress = 0;
                }
                if (audioLongAddress < 0) {
                    j = 4294967295L & audioLongAddress;
                } else {
                    j = audioLongAddress;
                }
                ((C1142270fpZ) awS31S0100001_20.l0).LIZ = j;
            } else {
                ((C1142270fpZ) awS31S0100001_20.l0).LIZ();
                return 0L;
            }
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0100001_20(C1142270fpZ c1142270fpZ, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1142270fpZ;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0100001_20(SurfaceHolderCallbackC1324410kZL surfaceHolderCallbackC1324410kZL, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = surfaceHolderCallbackC1324410kZL;
        this.f1 = f;
    }
}
