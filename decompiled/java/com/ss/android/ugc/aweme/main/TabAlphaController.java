package com.ss.android.ugc.aweme.main;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Locale;

/* JADX INFO: loaded from: classes25.dex */
public final class TabAlphaController extends BPEAHandler implements GenericLifecycleObserver {
    public static final String[] LLILZ = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};
    public static TabAlphaController LLILZIL;
    public View LL;
    public boolean LLILLJJLI;
    public final boolean LLILLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.LL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LJ(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase(Locale.getDefault()))) {
            for (String str : LLILZ) {
                if (TextUtils.equals(str, Build.MODEL)) {
                    this.LLILLL = true;
                    return;
                }
            }
        }
    }

    public final void LJ(boolean z) {
        if (this.LL != null && this.LLILLL) {
            if (z && !this.LLILLJJLI) {
                if (!hasMessages(1)) {
                    sendEmptyMessageDelayed(1, 1200000L);
                }
            } else {
                if (!hasMessages(1)) {
                    return;
                }
                removeMessages(1);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        View view;
        C1C7U.LIZ("TabAlphaController@3487.handleMessage");
        if (message.what == 1 && (view = this.LL) != null && !this.LLILLJJLI) {
            C786410Ut5.T4(view, view.getAlpha() / 2);
            this.LLILLJJLI = true;
        }
        C1C7U.LIZIZ("TabAlphaController@3487.handleMessage");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner lifecycleOwner) {
        LJ(true);
    }
}
