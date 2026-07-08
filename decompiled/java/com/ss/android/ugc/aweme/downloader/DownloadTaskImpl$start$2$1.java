package com.ss.android.ugc.aweme.downloader;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1C7U;
import X.C356901a3;
import X.C534500Kxk;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.downloader.DownloadTaskImpl$start$2$1", f = "DownloadTask.kt", l = {}, m = "invokeSuspend")
public final class DownloadTaskImpl$start$2$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DownloadTaskImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadTaskImpl$start$2$1(DownloadTaskImpl downloadTaskImpl, InterfaceC1364105Vn<? super DownloadTaskImpl$start$2$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = downloadTaskImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new DownloadTaskImpl$start$2$1(this.LL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.downloader.DownloadTaskImpl$start$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ DownloadTaskImpl LL;

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

        public AnonymousClass1(DownloadTaskImpl downloadTaskImpl) {
            this.LL = downloadTaskImpl;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            this.LL.cancel();
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadTaskImpl@fc86.start$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL.getLifecycle().addObserver(new AnonymousClass1(this.LL));
        C534500Kxk c534500Kxk = this.LL.LJFF;
        ((ArrayList) c534500Kxk.LJI).clear();
        c534500Kxk.LJII = 0;
        ((LinkedHashMap) c534500Kxk.LJIIIIZZ).clear();
        c534500Kxk.LJIIIZ = 0;
        c534500Kxk.LJIIJ.set(true);
        DownloadTaskImpl downloadTaskImpl = this.LL;
        downloadTaskImpl.LJFF.LJII = downloadTaskImpl.LJ.size();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadTaskImpl@fc86.start$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
