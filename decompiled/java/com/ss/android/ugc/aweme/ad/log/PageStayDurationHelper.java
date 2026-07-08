package com.ss.android.ugc.aweme.ad.log;

import X.AbstractC1023470cjx;
import X.C356901a3;
import X.InterfaceC1023590ck9;
import X.InterfaceC1026360coc;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public final class PageStayDurationHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLILZLL = 0;
    public final InterfaceC1026360coc LL;
    public InterfaceC1023590ck9 LLILLJJLI;
    public AwemeRawAd LLILLL;
    public boolean LLILZ;
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final class AppLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        public AppLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            PageStayDurationHelper pageStayDurationHelper;
            InterfaceC1023590ck9 interfaceC1023590ck9;
            if (PageStayDurationHelper.this.LLILZIL.get() && (interfaceC1023590ck9 = (pageStayDurationHelper = PageStayDurationHelper.this).LLILLJJLI) != null) {
                pageStayDurationHelper.LL.LIZIZ(interfaceC1023590ck9, pageStayDurationHelper.LLILLL);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            if (PageStayDurationHelper.this.LLILZIL.get()) {
                PageStayDurationHelper.this.LL.LIZ();
            }
        }
    }

    public PageStayDurationHelper(InterfaceC1026360coc interfaceC1026360coc) {
        this.LL = interfaceC1026360coc;
    }

    public final void LIZ(boolean z) {
        this.LLILZIL.set(z);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.LIZ();
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        InterfaceC1023590ck9 interfaceC1023590ck9;
        if (this.LLILZIL.get() && (interfaceC1023590ck9 = this.LLILLJJLI) != null) {
            this.LL.LIZIZ(interfaceC1023590ck9, this.LLILLL);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        if (this.LLILZIL.get()) {
            this.LL.LIZ();
        }
    }

    public static void LIZIZ(PageStayDurationHelper pageStayDurationHelper, AbstractC1023470cjx abstractC1023470cjx, String str, String str2, AwemeRawAd awemeRawAd) {
        pageStayDurationHelper.LLILLJJLI = abstractC1023470cjx;
        pageStayDurationHelper.getClass();
        pageStayDurationHelper.getClass();
        pageStayDurationHelper.getClass();
        pageStayDurationHelper.LLILLL = awemeRawAd;
        pageStayDurationHelper.LL.LIZIZ(abstractC1023470cjx, awemeRawAd);
        if (!pageStayDurationHelper.LLILZ) {
            ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(pageStayDurationHelper.new AppLifecycleObserver());
            pageStayDurationHelper.LLILZ = true;
        }
    }
}
