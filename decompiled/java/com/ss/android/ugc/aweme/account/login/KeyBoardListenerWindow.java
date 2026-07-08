package com.ss.android.ugc.aweme.account.login;

import X.C01GW;
import X.C19EG;
import X.C214906198m;
import X.C452501pT;
import X.InterfaceC1261900iwW;
import Y.ARunnableS119S0100000_19;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class KeyBoardListenerWindow extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener, GenericLifecycleObserver {
    public final C19EG LL;
    public final InterfaceC1261900iwW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public int LLILZLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ((Rect) this.LLILZIL.getValue()).setEmpty();
        ((View) this.LLILZ.getValue()).getWindowVisibleDisplayFrame((Rect) this.LLILZIL.getValue());
        int i = ((Rect) this.LLILZIL.getValue()).bottom;
        int i2 = this.LLILZLL;
        if (i2 == -1) {
            this.LLILZLL = i;
        } else {
            if (i2 == i) {
                return;
            }
            if (i2 > i) {
                this.LLILLJJLI.kp(i);
            } else {
                this.LLILLJJLI.LLIIIZ();
            }
            this.LLILZLL = i;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestory() {
        dismiss();
    }

    public KeyBoardListenerWindow(Fragment fragment, C19EG c19eg, InterfaceC1261900iwW interfaceC1261900iwW) {
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1261900iwW;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 71));
        this.LLILLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS563S0100000_19(this, 70));
        this.LLILZ = c01gwLIZIZ2;
        this.LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(20));
        this.LLILZLL = -1;
        setContentView((View) c01gwLIZIZ2.getValue());
        setWidth(0);
        setHeight(-1);
        HandlerHook.viewPost((View) c01gwLIZIZ.getValue(), new ARunnableS119S0100000_19(this, 17));
        fragment.getLifecycle().addObserver(this);
        setSoftInputMode(37);
        setInputMethodMode(1);
    }
}
