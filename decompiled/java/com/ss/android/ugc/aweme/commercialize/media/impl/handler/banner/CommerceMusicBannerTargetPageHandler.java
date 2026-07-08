package com.ss.android.ugc.aweme.commercialize.media.impl.handler.banner;

import X.C15M9;
import X.C15MA;
import X.InterfaceC1399180mVw;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMusicBannerTargetPageHandler implements InterfaceC1399180mVw {
    @Override // X.InterfaceC1399180mVw
    public final void nX(String str, String str2) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(str);
        C15MA.LLIZ.LIZ(str2);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C15MA.LL.getClass();
            C15M9 c15m9 = C15MA.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
            c15m9.LIZ(null);
            C15MA.LLIZ.LIZ(null);
        }
    }
}
