package com.tiktok.ttr.video;

import X.C08BN;
import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import bdp.a;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class TTRVideoRender {
    public static ArrayList<C08BN> registeredListeners = new ArrayList<>();
    public final String TAG = "TTRVideoRender";
    public int mEngineId = -1;
    public long mNativeRenderContext;

    private native int nativeAddFilter(long j, int i);

    private native Object nativeGetSurface(int i);

    private native int nativeInit(Object obj, Object obj2);

    private native int nativePause(int i);

    private native int nativeRelease(int i);

    private native int nativeRemoveFilter(long j, int i);

    private native int nativeResume(int i);

    private native int nativeSetSurface(Object obj, int i);

    private native int nativeSetSurfaceSize(int i, int i2, int i3);

    static {
        INVOKESTATIC_com_tiktok_ttr_video_TTRVideoRender_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("TTR");
    }

    public Surface getSurface() {
        return (Surface) nativeGetSurface(this.mEngineId);
    }

    public int pausePlayer() {
        return nativePause(this.mEngineId);
    }

    public int releasePlayer() {
        return nativeRelease(this.mEngineId);
    }

    public int resumePlayer() {
        return nativeResume(this.mEngineId);
    }

    public int getVideoRenderId() {
        return this.mEngineId;
    }

    public static void INVOKESTATIC_com_tiktok_ttr_video_TTRVideoRender_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static void registerListener(C08BN c08bn) {
        synchronized (registeredListeners) {
            try {
                registeredListeners.add(c08bn);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int addFilter(long j) {
        return nativeAddFilter(j, this.mEngineId);
    }

    public int removeFilter(long j) {
        return nativeRemoveFilter(j, this.mEngineId);
    }

    public int setSurface(Surface surface) {
        return nativeSetSurface(surface, this.mEngineId);
    }

    public static void notifyAll(int i, String str) {
        synchronized (registeredListeners) {
            try {
                Iterator<C08BN> it2 = registeredListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setSurfaceSize(int i, int i2) {
        return nativeSetSurfaceSize(i, i2, this.mEngineId);
    }

    public static void notify(int i, int i2, int i3, int i4, int i5) {
        synchronized (registeredListeners) {
            try {
                Iterator<C08BN> it2 = registeredListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int initPlayer(Context context, Surface surface, int i, int i2, int i3) {
        Object weakReference = new WeakReference(this);
        a aVar = new a();
        aVar.LIZ = surface;
        int iNativeInit = nativeInit(weakReference, aVar);
        this.mEngineId = 0;
        return iNativeInit;
    }
}
