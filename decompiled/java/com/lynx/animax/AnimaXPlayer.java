package com.lynx.animax;

import X.C1285770jZ1;
import X.C1285850jZ9;
import X.EnumC1288440jdK;
import X.EnumC1288660jdg;
import X.EnumC1288880je2;
import X.EnumC1297350jrh;
import X.EnumC1311910kFB;
import X.InterfaceC1288110jcn;
import X.InterfaceC1288650jdf;
import X.RunnableC1288430jdJ;
import com.lynx.animax.ability.BaseAbility;
import com.lynx.animax.base.CleanupReference;
import com.lynx.animax.base.bridge.JavaOnlyMap;
import com.lynx.animax.base.bridge.ReadableMap;
import com.lynx.animax.composition.AnimaXComposition;
import com.lynx.animax.drawable.AnimaXSurfaceDrawable;
import com.lynx.animax.loader.AnimaXResourceLoaderHolder;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXKeyPathListCallback;
import com.lynx.animax.property.AnimaXPropertyCallback;
import com.lynx.animax.property.AnimaXValueCallback;
import com.lynx.animax.property.AnimaXValueParam;
import com.lynx.animax.service.IAnimaXMonitorService;
import com.lynx.animax.ui.AnimaXContext;
import com.lynx.animax.util.AnimaXLog;
import com.lynx.animax.util.AnimaXMetricsCallback;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXPlayer implements InterfaceC1288650jdf {
    public volatile long LL;
    public final BaseAbility LLILLJJLI;
    public final AnimaXContext LLILLL;
    public AnimaXResourceLoaderHolder LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public RunnableC1288430jdJ LLJ;
    public AnimaXComposition LLJI;
    public int LLJIJIL;

    private native void nativeAddLayerPropertyCallback(long j, int i, AnimaXKeyPath animaXKeyPath, AnimaXValueCallback animaXValueCallback, AnimaXPropertyCallback animaXPropertyCallback);

    private native void nativeCancel(long j);

    private native long nativeCreate(long j, AnimaXContext animaXContext);

    private native void nativeCreateAnimaXSurface(long j, AnimaXSurfaceDrawable animaXSurfaceDrawable);

    public static native void nativeDeletePtr(long j);

    public static native void nativeDestroy(long j);

    private native double nativeGetCurrentFrame(long j);

    private native double nativeGetDurationMs(long j);

    private native ReadableMap nativeGetEventTrackingMap(long j);

    private native void nativeGetKeysForKeyPath(long j, AnimaXKeyPath animaXKeyPath, AnimaXKeyPathListCallback animaXKeyPathListCallback);

    private native long nativeGetMemoryUsageBytes(long j);

    private native void nativeGetMetricsAsync(long j, AnimaXMetricsCallback animaXMetricsCallback);

    private native boolean nativeIsAnimating(long j);

    private native void nativeOnHide(long j, long j2);

    private native void nativeOnShow(long j, long j2);

    private native void nativeOnTap(long j, float f, float f2);

    private native void nativePause(long j);

    private native void nativePlay(long j);

    private native void nativePlaySegment(long j, int i, int i2);

    private native void nativeReload(long j);

    private native void nativeResume(long j);

    private native void nativeSeek(long j, int i);

    private native void nativeSetAutoPlay(long j, boolean z);

    private native void nativeSetAutoReverse(long j, boolean z);

    private native void nativeSetComposition(long j, long j2);

    private native void nativeSetDynamicResource(long j, boolean z);

    private native void nativeSetEnableAudio(long j, boolean z);

    private native void nativeSetEndFrame(long j, int i);

    private native void nativeSetFpsEventInterval(long j, long j2);

    private native void nativeSetImageFolder(long j, String str);

    private native void nativeSetJson(long j, String str);

    private native void nativeSetKeepLastFrame(long j, boolean z);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetLoopCount(long j, int i);

    private native void nativeSetMaxFrameRate(long j, double d);

    private native void nativeSetMuted(long j, boolean z);

    private native void nativeSetObjectFit(long j, int i);

    private native void nativeSetObjectPosition(long j, int i);

    private native void nativeSetProgress(long j, float f);

    private native void nativeSetResourceProperty(long j, int i, String str, AnimaXValueParam animaXValueParam, AnimaXPropertyCallback animaXPropertyCallback);

    private native void nativeSetSpeed(long j, float f);

    private native void nativeSetSrc(long j, String str);

    private native void nativeSetSrcPolyfill(long j, JavaOnlyMap javaOnlyMap);

    private native void nativeSetStartFrame(long j, int i);

    private native void nativeStop(long j);

    private native void nativeSubscribeUpdateEvent(long j, int i);

    private native void nativeSubscribeUpdateEvents(long j, int[] iArr, boolean z);

    private native void nativeUnsubscribeUpdateEvent(long j, int i);

    private native void nativeUpdateAnimaXSurface(long j, AnimaXSurfaceDrawable animaXSurfaceDrawable);

    private native void nativeUpdateLayerProperty(long j, int i, AnimaXKeyPath animaXKeyPath, AnimaXValueParam animaXValueParam, AnimaXPropertyCallback animaXPropertyCallback);

    public final boolean LIZ() {
        if (this.LLILZIL) {
            return false;
        }
        if (this.LL != 0) {
            return true;
        }
        AnimaXLog.LIZ("AnimaXPlayer", "checkNativeReady failed, ptr is 0");
        return false;
    }

    public final long LJIIJJI() {
        if (LIZ()) {
            return nativeGetMemoryUsageBytes(this.LL);
        }
        return 0L;
    }

    public final void LJIIL() {
        if (LIZ()) {
            BaseAbility baseAbility = this.LLILLJJLI;
            C1285770jZ1 c1285770jZ1 = baseAbility.LJ;
            ((ConcurrentHashMap) c1285770jZ1.LIZLLL).put("stay_duration", Long.valueOf(System.currentTimeMillis() - c1285770jZ1.LJII));
            c1285770jZ1.LJIILIIL("onRelease");
            ((ConcurrentHashMap) baseAbility.LIZJ.LIZ).clear();
            ((CopyOnWriteArrayList) baseAbility.LIZ).clear();
            RunnableC1288430jdJ runnableC1288430jdJ = this.LLJ;
            if (runnableC1288430jdJ != null) {
                runnableC1288430jdJ.LIZ();
                this.LLJ = null;
            }
            AnimaXResourceLoaderHolder animaXResourceLoaderHolder = this.LLILZ;
            if (animaXResourceLoaderHolder != null) {
                ((ArrayList) animaXResourceLoaderHolder.LIZIZ).clear();
                CleanupReference cleanupReference = animaXResourceLoaderHolder.LIZJ;
                if (cleanupReference.LIZ) {
                    cleanupReference.LIZ(2);
                } else {
                    cleanupReference.LIZIZ(CleanupReference.LJFF);
                }
                animaXResourceLoaderHolder.LIZ = 0L;
                this.LLILZ = null;
            }
            this.LLILZIL = true;
            this.LL = 0L;
            AnimaXLog.LIZIZ("AnimaXPlayer", "AnimaXPlayer destroyed");
        }
    }

    public final void LJIILIIL() {
        if (LIZ()) {
            nativeReload(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void cancel() {
        if (LIZ()) {
            nativeCancel(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final double getCurrentFrame() {
        if (LIZ()) {
            return nativeGetCurrentFrame(this.LL);
        }
        return 0.0d;
    }

    @Override // X.InterfaceC1288650jdf
    public final double getDurationMs() {
        if (LIZ()) {
            return nativeGetDurationMs(this.LL);
        }
        return 0.0d;
    }

    @Override // X.InterfaceC1288650jdf
    public final boolean oi() {
        if (LIZ()) {
            return nativeIsAnimating(this.LL);
        }
        return false;
    }

    @Override // X.InterfaceC1288650jdf
    public final void pause() {
        if (LIZ()) {
            nativePause(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void play() {
        if (LIZ()) {
            this.LLILLJJLI.LJ.LJIIL(true);
            nativePlay(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void resume() {
        if (LIZ()) {
            this.LLILLJJLI.LJ.LJIIL(true);
            nativeResume(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void stop() {
        if (LIZ()) {
            nativeStop(this.LL);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final AnimaXContext getAnimaXContext() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1288650jdf
    public final AnimaXComposition getComposition() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnimaXPlayer(com.lynx.animax.ui.AnimaXContext r9) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.AnimaXPlayer.<init>(com.lynx.animax.ui.AnimaXContext):void");
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZLLL(InterfaceC1288110jcn interfaceC1288110jcn) {
        ((CopyOnWriteArrayList) this.LLILLJJLI.LIZ).remove(interfaceC1288110jcn);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJ(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSeek(this.LL, i);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJFF(AnimaXMetricsCallback animaXMetricsCallback) {
        if (!LIZ()) {
            return;
        }
        nativeGetMetricsAsync(this.LL, animaXMetricsCallback);
    }

    public final void LJI(AnimaXSurfaceDrawable animaXSurfaceDrawable) {
        if (!LIZ()) {
            return;
        }
        animaXSurfaceDrawable.LJI = this.LLILZLL;
        animaXSurfaceDrawable.LJII = this.LLIZ;
        String str = C1285850jZ9.LIZ;
        animaXSurfaceDrawable.LJIIIIZZ = this.LLIZLLLIL;
        nativeCreateAnimaXSurface(this.LL, animaXSurfaceDrawable);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIIIZZ(InterfaceC1288110jcn interfaceC1288110jcn) {
        ((CopyOnWriteArrayList) this.LLILLJJLI.LIZ).add(interfaceC1288110jcn);
    }

    public final void LJIILJJIL(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSubscribeUpdateEvent(this.LL, i);
    }

    public final void LJIILL(int i) {
        if (!LIZ()) {
            return;
        }
        nativeUnsubscribeUpdateEvent(this.LL, i);
    }

    public final void LJIILLIIL(AnimaXSurfaceDrawable animaXSurfaceDrawable) {
        if (!LIZ()) {
            return;
        }
        if (animaXSurfaceDrawable != null) {
            animaXSurfaceDrawable.LJI = this.LLILZLL;
            animaXSurfaceDrawable.LJII = this.LLIZ;
            String str = C1285850jZ9.LIZ;
            animaXSurfaceDrawable.LJIIIIZZ = this.LLIZLLLIL;
        }
        nativeUpdateAnimaXSurface(this.LL, animaXSurfaceDrawable);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setAntiAliasing(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1288650jdf
    public final void setAutoPlay(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetAutoPlay(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setAutoReverse(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetAutoReverse(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setComposition(AnimaXComposition animaXComposition) {
        this.LLJI = animaXComposition;
        if (!LIZ()) {
            return;
        }
        long j = this.LL;
        long j2 = 0;
        if (animaXComposition.LIZ == 0) {
            AnimaXLog.LIZ("AnimaXComposition", "checkNativeReady failed, nativePtr is 0");
        } else {
            j2 = animaXComposition.LIZ;
        }
        nativeSetComposition(j, j2);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setDynamicResource(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetDynamicResource(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setEnableAudio(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetEnableAudio(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setEndFrame(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetEndFrame(this.LL, i);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setFpsEventInterval(long j) {
        if (!LIZ()) {
            return;
        }
        nativeSetFpsEventInterval(this.LL, j);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setImageFolder(String str) {
        if (str == null || str.isEmpty() || !LIZ()) {
            return;
        }
        nativeSetImageFolder(this.LL, str);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setJson(String str) {
        if (!LIZ()) {
            return;
        }
        nativeSetJson(this.LL, str);
        IAnimaXMonitorService iAnimaXMonitorService = (IAnimaXMonitorService) this.LLILLJJLI.LJ.LIZ.LIZ(IAnimaXMonitorService.class);
        if (iAnimaXMonitorService != null) {
            iAnimaXMonitorService.setCurrentUrl("json");
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void setKeepLastFrame(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetKeepLastFrame(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setLoop(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetLoop(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setLoopCount(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetLoopCount(this.LL, i);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setMaxFrameRate(double d) {
        if (!LIZ()) {
            return;
        }
        nativeSetMaxFrameRate(this.LL, d);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setMuted(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetMuted(this.LL, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setObjectFit(EnumC1311910kFB enumC1311910kFB) {
        if (!LIZ()) {
            return;
        }
        nativeSetObjectFit(this.LL, enumC1311910kFB.ordinal());
    }

    @Override // X.InterfaceC1288650jdf
    public final void setObjectPosition(EnumC1297350jrh enumC1297350jrh) {
        if (!LIZ()) {
            return;
        }
        nativeSetObjectPosition(this.LL, enumC1297350jrh.ordinal());
    }

    @Override // X.InterfaceC1288650jdf
    public final void setProgress(float f) {
        if (!LIZ()) {
            return;
        }
        nativeSetProgress(this.LL, f);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setSpeed(float f) {
        if (!LIZ()) {
            return;
        }
        nativeSetSpeed(this.LL, f);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setSrc(String str) {
        if (!LIZ()) {
            return;
        }
        nativeSetSrc(this.LL, str);
        IAnimaXMonitorService iAnimaXMonitorService = (IAnimaXMonitorService) this.LLILLJJLI.LJ.LIZ.LIZ(IAnimaXMonitorService.class);
        if (str != null && iAnimaXMonitorService != null) {
            iAnimaXMonitorService.setCurrentUrl(str);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void setSrcPolyfill(JavaOnlyMap javaOnlyMap) {
        if (!LIZ()) {
            return;
        }
        nativeSetSrcPolyfill(this.LL, javaOnlyMap);
    }

    @Override // X.InterfaceC1288650jdf
    public final void setStartFrame(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetStartFrame(this.LL, i);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZJ(int[] iArr, boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSubscribeUpdateEvents(this.LL, iArr, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJII(float f, float f2) {
        if (!LIZ()) {
            return;
        }
        nativeOnTap(this.LL, f, f2);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIJ(int i, int i2) {
        if (!LIZ()) {
            return;
        }
        this.LLILLJJLI.LJ.LJIIL(true);
        nativePlaySegment(this.LL, i, i2);
    }

    public final void LJIIZILJ(boolean z, EnumC1288660jdg enumC1288660jdg) {
        boolean z2;
        if ((this.LLJIJIL & enumC1288660jdg.getValue()) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        this.LLJIJIL ^= enumC1288660jdg.getValue();
        if (z) {
            if (LIZ()) {
                nativeOnShow(this.LL, enumC1288660jdg.getValue());
            }
        } else {
            if (!LIZ()) {
                return;
            }
            nativeOnHide(this.LL, enumC1288660jdg.getValue());
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZIZ(EnumC1288440jdK enumC1288440jdK, String str, AnimaXValueParam animaXValueParam) {
        if (!LIZ()) {
            return;
        }
        nativeSetResourceProperty(this.LL, enumC1288440jdK.getValue(), str, animaXValueParam, null);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIIZ(EnumC1288880je2 enumC1288880je2, AnimaXKeyPath animaXKeyPath, AnimaXValueParam animaXValueParam) {
        if (!LIZ()) {
            return;
        }
        nativeUpdateLayerProperty(this.LL, enumC1288880je2.getValue(), animaXKeyPath, animaXValueParam, null);
    }
}
