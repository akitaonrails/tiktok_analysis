package com.ss.android.ugc.trill.main.login.component;

import X.C0R1H;
import X.C786410Ut5;
import X.InterfaceC849390XTt;
import X.RunnableC849400XTu;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;

/* JADX INFO: loaded from: classes14.dex */
public class I18nLoginActivityComponent extends BaseLoginActivityComponent {
    public Activity LLILLJJLI;
    public Fragment LLILLL;
    public InterfaceC849390XTt LLILZ;
    public Bundle LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC849400XTu LLIZLLLIL = new RunnableC849400XTu(this);

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent
    public final void onDestroy() {
        super.onDestroy();
        ComponentCallbacks2 componentCallbacks2 = this.LLILLJJLI;
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZIL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, X.C0XPE
    public final void LIZ(Fragment fragment, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        if (fragment != null && fragment.getActivity() != null && !C0R1H.LIZ(fragment.getActivity())) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.LIZ(fragment, str, str2, bundle, interfaceC849390XTt);
            this.LLILLL = fragment;
            this.LLILLJJLI = fragment.getActivity();
            this.LLILZIL = bundle;
            this.LLILZLL = str;
            this.LLIZ = str2;
            this.LLILZ = interfaceC849390XTt;
            if (bundle.getBoolean("is_disable_animation", false)) {
                this.LL.removeCallbacks(this.LLIZLLLIL);
                this.LLIZLLLIL.run();
            } else {
                this.LL.removeCallbacks(this.LLIZLLLIL);
                C786410Ut5.LJJZZIII(this.LL, this.LLIZLLLIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, X.C0XPE
    public final void LIZIZ(Activity activity, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        if (activity != null && !activity.isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.LIZIZ(activity, str, str2, bundle, interfaceC849390XTt);
            this.LLILLL = null;
            this.LLILLJJLI = activity;
            this.LLILZIL = bundle;
            this.LLILZLL = str;
            this.LLIZ = str2;
            this.LLILZ = interfaceC849390XTt;
            if (bundle.getBoolean("is_disable_animation", false)) {
                this.LL.removeCallbacks(this.LLIZLLLIL);
                this.LLIZLLLIL.run();
            } else {
                this.LL.removeCallbacks(this.LLIZLLLIL);
                C786410Ut5.LJJZZIII(this.LL, this.LLIZLLLIL);
            }
        }
    }
}
