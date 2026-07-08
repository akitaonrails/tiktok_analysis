package com.ss.android.ugc.aweme.main.assems;

import X.C1602860roS;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageNewUserAssem extends BaseMainPageFragmentAssem {
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void O9(ViewGroup viewGroup) {
        C1602860roS c1602860roS = C1602860roS.LIZ;
        if (!(viewGroup instanceof View)) {
            viewGroup = null;
        }
        c1602860roS.getClass();
        if (viewGroup != null) {
            C1602860roS.LIZIZ = new WeakReference<>(viewGroup);
        }
    }
}
