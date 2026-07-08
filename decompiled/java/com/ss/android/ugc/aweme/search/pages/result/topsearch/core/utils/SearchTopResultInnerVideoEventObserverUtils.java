package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils;

import X.C01GW;
import X.C452501pT;
import X.C737030Svd;
import X.InterfaceC639600P6w;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTopResultInnerVideoEventObserverUtils {
    public static final /* synthetic */ int LIZ = 0;

    public static final class InnerFlowVideoEventObserversVM extends ViewModel implements InterfaceC639600P6w {
        public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(329));

        @Override // X.InterfaceC639600P6w
        public final void gj0(C737030Svd c737030Svd) {
            Iterator it2 = ((ArrayList) this.LL.getValue()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC639600P6w) it2.next()).gj0(c737030Svd);
            }
        }
    }

    public static InnerFlowVideoEventObserversVM LIZ(Fragment fragment) {
        if (fragment.getActivity() != null) {
            return (InnerFlowVideoEventObserversVM) ViewModelProviders.of(fragment).get(InnerFlowVideoEventObserversVM.class);
        }
        return null;
    }
}
