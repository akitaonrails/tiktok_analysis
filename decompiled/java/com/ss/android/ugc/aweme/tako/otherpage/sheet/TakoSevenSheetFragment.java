package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C01GW;
import X.C07QD;
import X.C0B19;
import X.C1085850eMZ;
import X.C1163390gNd;
import X.C1163440gNi;
import X.C1383370m6R;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1483410ohn;
import X.C14TF;
import X.C1855770yON;
import X.C1863760ybG;
import X.C19395810uS;
import X.C19719912Dl;
import X.C298850BnX;
import X.C324800CoI;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1069860dwm;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSevenSheetFragment extends TakoSheetFragment implements InterfaceC1069860dwm {
    public static final AtomicInteger LLLLZIL = new AtomicInteger(0);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLDHELIOS0jKSIpZzw7LSA4ZxsyIyofLDk2JhYkLConDjctLiI2JjE=";
    public final InterfaceC1069860dwm LLLLLZL;
    public final C01GW LLLLZ;
    public View LLLLZI;

    public TakoSevenSheetFragment() {
        this(0);
    }

    @Override // X.InterfaceC1069860dwm
    public final void G2(int i) {
        this.LLLLLZL.G2(i);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        this.LLLLLZL.LLLFFI(tuxSheet, f);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        this.LLLLLZL.LLLLIIIILLL(tuxSheet, i);
    }

    @Override // X.InterfaceC1069860dwm
    public final void QH(View view) {
        this.LLLLLZL.QH(view);
    }

    @Override // X.InterfaceC1069860dwm
    public final void WO(InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        this.LLLLLZL.WO(interfaceC19396010uU, interfaceC19395910uT);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final String nZ0() {
        return "seven_split_screen";
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final void oS() {
        this.LLJZ = true;
    }

    @Override // X.InterfaceC1069860dwm
    public final TuxSheet tz() {
        return this.LLLLLZL.tz();
    }

    @Override // X.InterfaceC1069860dwm
    public final void w2(TuxSheet tuxSheet) {
        this.LLLLLZL.w2(tuxSheet);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment
    public final boolean wS() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment
    public final C19719912Dl yS() {
        return C13LE.LIZ(SevenSheetTopTitleAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AtomicInteger atomicInteger = LLLLZIL;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        if (C0B19.LIZ()) {
            C14TF.LIZIZ.LJFF(false);
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        FragmentManager fragmentManager;
        if (!C298850BnX.LIZ()) {
            return super.onBackPress();
        }
        C1855770yON.LIZ.getClass();
        if (!C1855770yON.LIZIZ() || (fragmentManager = (FragmentManager) this.LLLLZ.getValue()) == null || fragmentManager.LJJLIIIIJ() <= 0) {
            return C1855770yON.LIZIZ() && gS();
        }
        FragmentManager fragmentManager2 = (FragmentManager) this.LLLLZ.getValue();
        if (fragmentManager2 != null) {
            fragmentManager2.LJLLILLLL();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLLLLLLLL) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        LLLLZIL.incrementAndGet();
        if (C0B19.LIZ()) {
            C14TF.LIZIZ.LJFF(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment
    public final void uS() {
        super.uS();
        ES();
    }

    public TakoSevenSheetFragment(int i) {
        this.LLLLLZL = new C19395810uS();
        this.LLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 453));
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment
    public final void BS(float f) {
        View viewFindViewById;
        View viewFindViewById2;
        C1383370m6R.LIZ(this.LLLLZI, new C1085850eMZ(f));
        C324800CoI.LIZ.getClass();
        if (C324800CoI.LIZ()) {
            View view = this.LLJJIII;
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.x7j)) != null) {
                C426750GoL.LJIIIZ(viewFindViewById2, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(getContext())), null, null, false, 29);
            }
            View view2 = this.LLJJIII;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.x5z)) != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(getContext())), null, null, false, 29);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment
    public final C1163440gNi zS(C13IQ<? extends UISlotAssem> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(SevenSheetTopTitleAssem.class))) {
            C07QD.LIZ.getClass();
            if (C07QD.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
                return C1163390gNd.LIZ;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment, com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        Activity activityLIZ;
        Resources resources;
        DisplayMetrics displayMetrics;
        TakoEnterParams takoEnterParams = this.LLJILLL;
        ViewGroup.LayoutParams layoutParams = null;
        if (takoEnterParams != null) {
            str = takoEnterParams.processId;
        } else {
            str = null;
        }
        C1863760ybG.LIZLLL(str);
        super.onViewCreated(view, bundle);
        View view2 = this.LLJJIII;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        if (getContext() != null) {
            if (layoutParams != null) {
                Context context = getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (resources = activityLIZ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                layoutParams.height = (int) ((i - ScreenUtils.getStatusBarHeight(context)) * 0.71f);
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        this.LLLLLZL.QH(view);
        this.LLLLZI = view.findViewById(R.id.y0w);
    }
}
