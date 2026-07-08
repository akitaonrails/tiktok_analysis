package com.ss.android.ugc.aweme.share.common;

import X.C1390130mHL;
import X.C1B4F;
import X.C419290GcJ;
import X.EnumC1850560yFy;
import X.InterfaceC1850580yG0;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ShareEntryFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKDHELIOS02ZiYjJCI8JmsfIS4hLQAiPT0qDjctLiI2JjE=";
    public TuxNavBar LL;
    public View LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public C419290GcJ LLILZIL;
    public TuxTextView LLILZLL;
    public C1390130mHL LLIZ;
    public final List<Pair<EnumC1850560yFy, SmartImageView>> LLIZLLLIL = new ArrayList();
    public final List<SmartImageView> LLJ = new ArrayList();
    public InterfaceC1850580yG0 LLJI;

    public void NR() {
    }

    public void OR(C1B4F c1b4f) {
    }

    public final TuxNavBar MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.common.ShareEntryFragment.PR():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x083f  */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.0F2L] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(X.C12MX r27) {
        /*
            Method dump skipped, instruction units count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.common.ShareEntryFragment.RR(X.12MX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L35
        Le:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r5.getContext()
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.setTheme(r0)
        L1a:
            r0 = 2131562213(0x7f0d0ee5, float:1.8749848E38)
            android.view.View r3 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L27
            r3 = r2
        L27:
            if (r3 == 0) goto L55
            goto L37
        L2a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886939(0x7f12035b, float:1.940847E38)
            r1.setTheme(r0)
            goto L1a
        L35:
            r0 = 0
            goto Le
        L37:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5b
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L52
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5b
        L52:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.common.ShareEntryFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
