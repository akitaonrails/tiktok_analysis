package com.ss.android.ugc.aweme.video.local;

import X.AbstractC848400XPy;
import X.C073R;
import X.C0C64;
import X.C0VSJ;
import X.C0XQ7;
import X.C1443010ned;
import X.C14E5;
import X.C15O7;
import X.C1785006yu;
import X.C1827607Du;
import X.C19748512Ol;
import X.C20231414Ee;
import X.C20308514dH;
import X.C280380Ayq;
import X.C286930BMl;
import X.C310770CGd;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C844470XAv;
import Y.ARunnableS130S0100000_30;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.HighStoreUserLocalVideoCacheConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public class LocalVideoPlayerManager implements GenericLifecycleObserver {
    public static LocalVideoPlayerManager LLIZ;
    public static volatile Boolean LLIZLLLIL = null;
    public HashMap<String, LocalVideoUrlModel> LLILLL;
    public HandlerThread LLILZ;
    public BPEAHandler LLILZIL;
    public final C20231414Ee LL = new C20231414Ee();
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final ARunnableS130S0100000_30 LLILZLL = new ARunnableS130S0100000_30(this, 19);

    public static Map LJIIIIZZ() {
        try {
            C844470XAv.LIZ.getClass();
            String string = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme_local_video").getString("extra_data", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return (Map) C19748512Ol.LIZIZ.LJIIIIZZ(string, new TypeToken<HashMap<String, LocalVideoUrlModel>>() { // from class: X.14Eh
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public static LocalVideoPlayerManager LJ() {
        if (LLIZ == null) {
            synchronized (LocalVideoPlayerManager.class) {
                try {
                    if (LLIZ == null) {
                        LLIZ = new LocalVideoPlayerManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZ;
    }

    public static boolean LJFF() {
        if (!C1827607Du.LJ(new C073R(), C1785006yu.LIZJ())) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "is_local_video_play_enable", true, true);
        }
        Boolean bool = LLIZLLLIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (LocalVideoPlayerManager.class) {
            try {
                Boolean bool2 = LLIZLLLIL;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                Boolean boolValueOf = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "is_local_video_play_enable", true, true));
                LLIZLLLIL = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LJFF()) {
            if (!this.LLILLJJLI.get()) {
                if (C1827607Du.LJ(new C073R(), C1785006yu.LIZJ())) {
                    synchronized (this) {
                        try {
                            if (!this.LLILLJJLI.get()) {
                                Map mapLJIIIIZZ = LJIIIIZZ();
                                if (this.LLILLJJLI.compareAndSet(false, true) && mapLJIIIIZZ != null && !mapLJIIIIZZ.isEmpty()) {
                                    if (C286930BMl.LIZ()) {
                                        this.LL.LJI(mapLJIIIIZZ.values());
                                    } else {
                                        this.LL.LJFF(mapLJIIIIZZ.values());
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    Map mapLJIIIIZZ2 = LJIIIIZZ();
                    synchronized (this) {
                        try {
                            if (this.LLILLJJLI.compareAndSet(false, true) && mapLJIIIIZZ2 != null && !mapLJIIIIZZ2.isEmpty()) {
                                if (C286930BMl.LIZ()) {
                                    this.LL.LJI(mapLJIIIIZZ2.values());
                                } else {
                                    this.LL.LJFF(mapLJIIIIZZ2.values());
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C310770CGd.LIZ("default").LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "LocalVideoPlayerManager:ensureRestoreDataState");
            }
        }
    }

    public final List<File> LIZIZ() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Collection<LocalVideoUrlModel> collectionValues = this.LL.LIZIZ.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            String str = ((LocalVideoUrlModel) it2.next()).localPath;
            C0VSJ c0vsj = str != null ? new C0VSJ(str) : null;
            if (c0vsj != null) {
                arrayList.add(c0vsj);
            }
        }
        return arrayList;
    }

    public final void LJI() {
        if (!C286930BMl.LIZ()) {
            LJIIIZ(this.LL.LIZIZ);
            return;
        }
        this.LLILLL = new HashMap<>(this.LL.LIZIZ);
        if (this.LLILZIL == null) {
            if (this.LLILZ == null) {
                HandlerThread handlerThread = new HandlerThread("local_video_cache_handler_thread");
                this.LLILZ = handlerThread;
                handlerThread.start();
            }
            this.LLILZIL = new BPEAHandler(C786410Ut5.W2(this.LLILZ));
        }
        this.LLILZIL.removeCallbacks(this.LLILZLL);
        if (this.LLILZIL == null) {
            if (this.LLILZ == null) {
                HandlerThread handlerThread2 = new HandlerThread("local_video_cache_handler_thread");
                this.LLILZ = handlerThread2;
                handlerThread2.start();
            }
            this.LLILZIL = new BPEAHandler(C786410Ut5.W2(this.LLILZ));
        }
        C786410Ut5.LJLIIL(1000L, this.LLILZIL, this.LLILZLL);
    }

    public final void LJII() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C20231414Ee c20231414Ee = this.LL;
        c20231414Ee.getClass();
        Long localVideoLruCacheDays = ((HighStoreUserLocalVideoCacheConfig) C1443010ned.LIZIZ.getValue()).isOpen ? ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getLocalVideoLruCacheDays() : Long.valueOf(((Number) C280380Ayq.LIZ.getValue()).longValue());
        ArrayList<LocalVideoUrlModel> arrayList = new ArrayList();
        Iterator it2 = new LinkedHashMap(c20231414Ee.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) ((Map.Entry) it2.next()).getValue();
            if (System.currentTimeMillis() - localVideoUrlModel.accessedTime.longValue() > localVideoLruCacheDays.longValue()) {
                C0VSJ c0vsj = new C0VSJ(localVideoUrlModel.localPath);
                long length = c0vsj.exists() ? c0vsj.length() : 0L;
                arrayList.add(localVideoUrlModel);
                c20231414Ee.LJ -= length;
            }
        }
        for (LocalVideoUrlModel localVideoUrlModel2 : arrayList) {
            c20231414Ee.LIZ(localVideoUrlModel2.getSourceId(), localVideoUrlModel2.localPath, new AwS431S0200000_30(c20231414Ee, localVideoUrlModel2, 26));
        }
        c20231414Ee.LIZJ = true;
    }

    public final String LIZJ(VideoUrlModel videoUrlModel) {
        LocalVideoUrlModel localVideoUrlModelLIZIZ;
        String strLIZLLL = LIZLLL(videoUrlModel.getSourceId());
        if (TextUtils.isEmpty(strLIZLLL) || (localVideoUrlModelLIZIZ = this.LL.LIZIZ(videoUrlModel.getSourceId())) == null) {
            return strLIZLLL;
        }
        String uri = localVideoUrlModelLIZIZ.getUri();
        String uri2 = videoUrlModel.getUri();
        if (uri != null && uri2 != null && !TextUtils.equals(uri.split("_")[0], uri2.split("_")[0])) {
            this.LL.LJII(localVideoUrlModelLIZIZ.getSourceId());
            return null;
        }
        return strLIZLLL;
    }

    public final String LIZLLL(String str) {
        LocalVideoUrlModel localVideoUrlModelLIZIZ;
        LIZ();
        if (!TextUtils.isEmpty(str) && LJFF() && (localVideoUrlModelLIZIZ = this.LL.LIZIZ(str)) != null && TextUtils.equals(localVideoUrlModelLIZIZ.authorId, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            boolean zLIZLLL = this.LL.LIZLLL(this.LL.LIZIZ(str));
            if (zLIZLLL) {
                this.LL.LJII(str);
                if (!(!zLIZLLL)) {
                    return null;
                }
            }
            LocalVideoUrlModel localVideoUrlModelLIZIZ2 = this.LL.LIZIZ(str);
            if (localVideoUrlModelLIZIZ2 != null) {
                localVideoUrlModelLIZIZ2.accessedTime = Long.valueOf(System.currentTimeMillis());
                this.LL.LIZJ = true;
                return localVideoUrlModelLIZIZ2.localPath;
            }
            return "";
        }
        return null;
    }

    public final void LJIIIZ(HashMap<String, LocalVideoUrlModel> map) {
        try {
            LIZ();
            C844470XAv.LIZ.getClass();
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme_local_video");
            sharedPreferencesLIZJ.edit().putString("extra_data", C19748512Ol.LIZIZ.LJIILL(map)).apply();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final boolean LJIIJ(String str, final String str2, C14E5 c14e5) {
        final String strLIZLLL = LIZLLL(str);
        boolean z = !TextUtils.isEmpty(strLIZLLL);
        if (z) {
            C15O7.LIZJ(new Callable() { // from class: X.0ouQ
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    String str3 = strLIZLLL;
                    String str4 = str2;
                    C1C7U.LIZ("LocalVideoPlayerManager@f6a7.tryUseLocalVideo$1L");
                    try {
                        C19889612ru.LIZ(new C0VSJ(str3), new C0VSJ(str4));
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C15O7.LJIIIZ(e);
                    }
                    C1C7U.LIZIZ("LocalVideoPlayerManager@f6a7.tryUseLocalVideo$1L");
                    return null;
                }
            }).LJ(new C20308514dH(c14e5, str2, 0), C15O7.LJIIIIZZ, null);
        }
        return z;
    }
}
