package com.ss.android.ugc.aweme.newcreatoredit.translation;

import X.C123100dR;
import X.C1390920mIc;
import X.C1749280vcc;
import X.C197039127h;
import X.C20703515zt;
import X.C21384818mU;
import X.C23250099c;
import X.C418440Gaw;
import X.C480201tw;
import X.C710280Rta;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogInterfaceOnDismissListenerC21523619Le;
import X.RunnableC21384618mS;
import Y.ACListenerS166S0100000_32;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class NewCreatorCaptionEditTranslationFragment extends NewCreatorCaptionEditFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZispPiwhLSQ4Jj02LCw4ZzshKSs/JSHELIOS4nISoiZwE2PwY+LC4nJzcPKD8nISoiDCs6PBE+KCEgJCQ4ICA9DjctLiI2JjE=";
    public LinearLayout LLJZIJLIL;
    public C197039127h LLL;
    public C197039127h LLLF;
    public ViewGroup LLLFF;
    public C197039127h LLLFFI;
    public boolean LLLFZ;

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final boolean cS() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void OR() {
        String str;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null) {
            C21384818mU c21384818mU = newCreatorCaptionEditViewModel.LLILZLL;
            Long l = c21384818mU != null ? c21384818mU.LIZ : null;
            C21384818mU c21384818mU2 = newCreatorCaptionEditViewModel.LLILZLL;
            Long lValueOf = (c21384818mU2 == null || (str = c21384818mU2.LIZIZ) == null) ? null : Long.valueOf(CastLongProtector.parseLong(str));
            String strYQ2 = this.LLILZ != null ? NewCreatorCaptionEditViewModel.yQ2() : null;
            if (l != null) {
                l.longValue();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(newCreatorCaptionEditViewModel), null, null, new C480201tw(newCreatorCaptionEditViewModel, l, lValueOf, strYQ2, null), 3);
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
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L7b
            int r0 = r6.remainingEditTimes
            if (r0 <= 0) goto L7b
            r5 = 1
        L12:
            X.18mN r4 = r7.RR()
            int r1 = r7.LLJILLL
            int r0 = r6.remainingEditTimes
            int r1 = r1 - r0
            r4.LJ = r1
            r7.nS()
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r4 = r7.LLILZ
            if (r4 == 0) goto L38
            r4.LLJJIII = r5
            boolean r0 = r4.LLJJIII
            if (r0 == 0) goto L79
            java.lang.String r1 = r4.vQ2()
            if (r1 == 0) goto L38
            java.util.Set<java.lang.String> r0 = r4.LLJJIJI
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L79
        L38:
            r0 = 0
        L39:
            r7.MR(r0)
            android.view.ViewGroup r0 = r7.LLJLIL
            if (r0 == 0) goto L43
            X.C786410Ut5.LJLZ(r2, r0)
        L43:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            boolean r0 = X.C20703515zt.LJJIIJ(r0)
            if (r0 != 0) goto L64
            boolean r0 = r7.LLLFZ
            if (r0 != 0) goto L64
            X.18mN r1 = r7.RR()
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r7.LLILZ
            if (r0 == 0) goto L77
            X.18mU r0 = r0.LLILZLL
            if (r0 == 0) goto L77
            java.lang.Boolean r0 = r0.LJIIIIZZ
        L5f:
            r1.LJII(r2, r0)
            r7.LLLFZ = r3
        L64:
            X.18mP r0 = r7.LLILZIL
            if (r0 == 0) goto L6b
            r0.notifyDataSetChanged()
        L6b:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r1 = r7.VR()
            r0 = 0
            r1.LJIIIZ(r0)
            r7.iS(r2, r2)
            return
        L77:
            r0 = 0
            goto L5f
        L79:
            r0 = 1
            goto L39
        L7b:
            r5 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newcreatoredit.translation.NewCreatorCaptionEditTranslationFragment.dS():void");
    }

    public final boolean qS() {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null && (mutableLiveData2 = newCreatorCaptionEditViewModel.LLIZLLLIL) != null && Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE)) {
            return false;
        }
        if (oS()) {
            return true;
        }
        Boolean boolValueOf = this.LLILZ != null ? Boolean.valueOf(C123100dR.LIZ(NewCreatorCaptionEditViewModel.yQ2())) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            return false;
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LLILZ;
        return newCreatorCaptionEditViewModel2 == null || (mutableLiveData = newCreatorCaptionEditViewModel2.LLIZLLLIL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), bool);
    }

    public final void rS() {
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null) {
            newCreatorCaptionEditViewModel.LLIZLLLIL.setValue(Boolean.TRUE);
        }
        TranslationLanguagePanelFragment translationLanguagePanelFragment = new TranslationLanguagePanelFragment();
        translationLanguagePanelFragment.LL = this.LLILZ;
        translationLanguagePanelFragment.LLILLJJLI = RR();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJJIJI = translationLanguagePanelFragment;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC21523619Le(this, 1);
        tuxSheet.show(getChildFragmentManager(), "CLACaptionSheet");
    }

    public final void sS() {
        C197039127h c197039127h = this.LLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 31));
        }
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ViewGroup viewGroup = this.LLLFF;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        LinearLayout linearLayout = this.LLJZIJLIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void aS() {
        super.aS();
        if (this.LLILZ != null && C123100dR.LIZ(NewCreatorCaptionEditViewModel.yQ2()) && !oS()) {
            OR();
        } else if (!qS()) {
            sS();
        }
        WR();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C710280Rta(this, null), 3);
    }

    public final boolean oS() {
        Aweme aweme = getAweme();
        String strLJIIIZ = aweme != null ? C20703515zt.LJIIIZ(aweme) : null;
        String strYQ2 = this.LLILZ != null ? NewCreatorCaptionEditViewModel.yQ2() : null;
        return (Intrinsics.LJFF(strLJIIIZ, "fr") || Intrinsics.LJFF(strLJIIIZ, "fr-CA")) ? Intrinsics.LJFF(strYQ2, "fr") || Intrinsics.LJFF(strYQ2, "fr-CA") : Intrinsics.LJFF(strYQ2, strLJIIIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (qS()) {
            rS();
        }
        ((Handler) this.LLJLL.getValue()).post((RunnableC21384618mS) this.LLJLLL.getValue());
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel == null || !newCreatorCaptionEditViewModel.LLIZ) {
            hS();
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LLILZ;
            if (newCreatorCaptionEditViewModel2 != null) {
                newCreatorCaptionEditViewModel2.LLIZ = true;
            }
        } else {
            C1749280vcc c1749280vcc = this.LLJJJJLIIL;
            if (c1749280vcc != null && c1749280vcc.getVisibility() == 8 && !VR().LJFF() && !this.LLIZLLLIL) {
                gS(false);
            }
        }
        SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void MR(boolean z) {
        if (z) {
            C197039127h c197039127h = this.LLLFFI;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 0.5f);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLLFFI;
        if (c197039127h2 == null) {
            return;
        }
        C786410Ut5.w5(c197039127h2, 1.0f);
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final ViewGroup ZR(View view) {
        String strYQ2;
        this.LLLFF = (ViewGroup) view.findViewById(R.id.yis);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.yis);
        C786410Ut5.LJLZ(0, viewGroup);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.yix);
        this.LLLFFI = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 29));
        }
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.yj0);
        C786410Ut5.U8(c197039127h2, new ACListenerS166S0100000_32(this, 30));
        c197039127h2.setButtonSize(3);
        c197039127h2.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
        C20703515zt c20703515zt = C20703515zt.LIZ;
        if (this.LLILZ != null) {
            strYQ2 = NewCreatorCaptionEditViewModel.yQ2();
        } else {
            strYQ2 = null;
        }
        c20703515zt.getClass();
        String strLJII = C20703515zt.LJII(strYQ2);
        if (strLJII == null) {
            strLJII = "";
        }
        c197039127h2.setText(strLJII);
        this.LLLF = c197039127h2;
        return viewGroup;
    }

    @Override // com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment
    public final void bS(View view) {
        super.bS(view);
        this.LLJZIJLIL = (LinearLayout) view.findViewById(R.id.dl6);
        this.LLL = (C197039127h) view.findViewById(R.id.dl5);
    }
}
