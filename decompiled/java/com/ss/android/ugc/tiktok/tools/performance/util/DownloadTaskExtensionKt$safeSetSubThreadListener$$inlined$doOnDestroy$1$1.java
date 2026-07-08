package com.ss.android.ugc.tiktok.tools.performance.util;

import X.C09NW;
import X.C0PEM;
import X.C20102213l6;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadTaskExtensionKt$safeSetSubThreadListener$$inlined$doOnDestroy$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ String LL;
    public final /* synthetic */ DownloadTask LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IDownloadListener LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" onDestroy");
        C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09NW(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
    }

    public DownloadTaskExtensionKt$safeSetSubThreadListener$$inlined$doOnDestroy$1$1(String str, DownloadTask downloadTask, String str2, IDownloadListener iDownloadListener) {
        this.LL = str;
        this.LLILLJJLI = downloadTask;
        this.LLILLL = str2;
        this.LLILZ = iDownloadListener;
    }
}
