package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.C0IDP;
import X.C259800zU;
import X.C356901a3;
import Y.ARunnableS106S0100000_6;
import android.widget.EditText;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes7.dex */
public final class IMQuickMessageInputAssem$requestFocusOnResume$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ EditText LL;
    public final /* synthetic */ C259800zU<LifecycleObserver> LLILLJJLI;
    public final /* synthetic */ IMQuickMessageInputAssem LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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
        LifecycleObserver lifecycleObserver = this.LLILLJJLI.element;
        if (lifecycleObserver != null) {
            this.LLILLL.getLifecycle().removeObserver(lifecycleObserver);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        EditText editText = this.LL;
        EditText editText2 = this.LL;
        if (editText.isLaidOut() && !editText.isLayoutRequested()) {
            if (!editText2.requestFocus()) {
                HandlerHook.viewPost(editText2, new ARunnableS106S0100000_6((Object) editText2, 71));
                return;
            }
            return;
        }
        editText.addOnLayoutChangeListener(new C0IDP(editText2, 5));
    }

    public IMQuickMessageInputAssem$requestFocusOnResume$1(EditText editText, C259800zU<LifecycleObserver> c259800zU, IMQuickMessageInputAssem iMQuickMessageInputAssem) {
        this.LL = editText;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = iMQuickMessageInputAssem;
    }
}
