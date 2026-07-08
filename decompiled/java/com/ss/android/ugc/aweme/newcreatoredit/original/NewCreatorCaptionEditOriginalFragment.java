package com.ss.android.ugc.aweme.newcreatoredit.original;

import X.C1749280vcc;
import X.C197039127h;
import X.C21384818mU;
import X.C23250099c;
import X.C480101tv;
import X.C786410Ut5;
import X.RunnableC21384618mS;
import Y.ACListenerS166S0100000_32;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes33.dex */
public final class NewCreatorCaptionEditOriginalFragment extends NewCreatorCaptionEditFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZispPiwhLSQ4Jj02LCw4ZyAhISHELIOSIlJy4/ZgspPgwhLSQ4Jj0QKTU4ICA9DSElPQAhISIlJy4/DjctLiI2JjE=";
    public final boolean LLJZIJLIL = true;
    public C197039127h LLL;

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void OR() {
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null) {
            C21384818mU c21384818mU = newCreatorCaptionEditViewModel.LLILZLL;
            Long l = c21384818mU != null ? c21384818mU.LIZ : null;
            C21384818mU c21384818mU2 = newCreatorCaptionEditViewModel.LLILZLL;
            String str = c21384818mU2 != null ? c21384818mU2.LIZIZ : null;
            if (l != null) {
                l.longValue();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(newCreatorCaptionEditViewModel), null, null, new C480101tv(newCreatorCaptionEditViewModel, l, str, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem r6 = r7.LLILLJJLI
            if (r6 != 0) goto L5
            return
        L5:
            boolean r0 = r6.isUnderReview()
            r5 = 1
            r3 = 0
            if (r0 != 0) goto L61
            int r0 = r6.remainingEditTimes
            if (r0 <= 0) goto L61
            r4 = 1
        L12:
            X.18mN r2 = r7.RR()
            int r1 = r7.LLJILJILJ
            int r0 = r6.remainingEditTimes
            int r1 = r1 - r0
            r2.LJ = r1
            r7.nS()
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r2 = r7.LLILZ
            if (r2 == 0) goto L38
            r2.LLJJI = r4
            boolean r0 = r2.LLJJI
            if (r0 == 0) goto L39
            java.lang.String r1 = r2.vQ2()
            if (r1 == 0) goto L38
            java.util.Set<java.lang.String> r0 = r2.LLJJIJI
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L39
        L38:
            r5 = 0
        L39:
            r7.MR(r5)
            X.18mN r1 = r7.RR()
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r7.LLILZ
            if (r0 == 0) goto L5f
            X.18mU r0 = r0.LLILZLL
            if (r0 == 0) goto L5f
            java.lang.Boolean r0 = r0.LJIIIIZZ
        L4a:
            r1.LJII(r3, r0)
            X.18mP r0 = r7.LLILZIL
            if (r0 == 0) goto L54
            r0.notifyDataSetChanged()
        L54:
            android.view.ViewGroup r0 = r7.LLJLIL
            if (r0 == 0) goto L5b
            X.C786410Ut5.LJLZ(r3, r0)
        L5b:
            r7.WR()
            return
        L5f:
            r0 = 0
            goto L4a
        L61:
            r4 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newcreatoredit.original.NewCreatorCaptionEditOriginalFragment.dS():void");
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void aS() {
        super.aS();
        OR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((Handler) this.LLJLL.getValue()).post((RunnableC21384618mS) this.LLJLLL.getValue());
        C1749280vcc c1749280vcc = this.LLJJJJLIIL;
        if (c1749280vcc != null && c1749280vcc.getVisibility() == 8 && VR() != null && !VR().LJFF() && !this.LLIZLLLIL) {
            gS(false);
        }
        SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final boolean cS() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void MR(boolean z) {
        if (z) {
            C197039127h c197039127h = this.LLL;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 0.5f);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLL;
        if (c197039127h2 == null) {
            return;
        }
        C786410Ut5.w5(c197039127h2, 1.0f);
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final ViewGroup ZR(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pto);
        C786410Ut5.LJLZ(0, viewGroup);
        C197039127h c197039127h = (C197039127h) viewGroup.findViewById(R.id.ptq);
        this.LLL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 28));
        }
        return viewGroup;
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void bS(View view) {
        super.bS(view);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS166S0100000_32(this, 121));
        }
    }
}
