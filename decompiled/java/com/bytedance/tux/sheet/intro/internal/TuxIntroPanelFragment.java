package com.bytedance.tux.sheet.intro.internal;

import X.C1391960mKI;
import X.C21415018rM;
import X.C418440Gaw;
import X.C431830GwX;
import X.C444830HcP;
import X.C444840HcQ;
import X.C497820Jfg;
import X.C814420VxA;
import android.text.Layout;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxIntroPanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9ISs4OyB9HELIOSISs4LD09KSliHTorASs4OyADKSspJQkhKSIhLCEn";
    public C1391960mKI LL;
    public boolean LLILLJJLI = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0387  */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.19GS] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r32, android.view.ViewGroup r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.intro.internal.TuxIntroPanelFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void MR(C21415018rM c21415018rM, CharSequence charSequence, int i, int i2, List<Pair<Integer, Integer>> list) {
        if (charSequence != null && charSequence.length() != 0) {
            C444830HcP c444830HcP = new C444830HcP();
            int iMin = Math.min(C497820Jfg.LIZIZ(c21415018rM.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(420))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
            c444840HcQ.LJ = iMin;
            c444840HcQ.LJI = Layout.Alignment.ALIGN_CENTER;
            c444830HcP.LJIILIIL(charSequence);
            c444830HcP.LJII(i);
            c444830HcP.LJIILJJIL(i2);
            if (list == null) {
                list = C431830GwX.LIZ(c444830HcP, null, null);
            }
            c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.5f, false, list, 26));
        }
    }
}
