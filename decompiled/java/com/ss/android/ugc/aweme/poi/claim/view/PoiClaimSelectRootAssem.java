package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC738140SxQ;
import X.C1200770hLv;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS102S1200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimSelectRootAssem extends UIContentAssem implements IPoiClaimSelectRootAssemAbility, InterfaceC1554640qYg {
    public ConstraintLayout LLIZLLLIL;
    public ConstraintLayout LLJ;
    public final C736950SvV LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 438452235) {
            return null;
        }
        return this;
    }

    public PoiClaimSelectRootAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(280);
        this.LLJI = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(285), new AwS562S0100000_18((AbstractC738140SxQ) this, 890), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        this.LLJILJIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSelectRootAssemAbility
    public final boolean NY() {
        return this.LLJIJIL;
    }

    public final void Go(double d) {
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        Context context = getContext();
        if (context == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        int fullScreenHeight = (ScreenUtils.getFullScreenHeight(context) - ScreenUtils.getStatusBarHeight(context)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
        if (layoutParams != null) {
            layoutParams.height = (int) (((double) fullScreenHeight) * d);
        }
        ConstraintLayout constraintLayout2 = this.LLJ;
        if (constraintLayout2 != null) {
            C786410Ut5.m6(constraintLayout2, layoutParams);
        }
        ConstraintLayout constraintLayout3 = this.LLJ;
        if (constraintLayout3 != null) {
            constraintLayout3.bringToFront();
        }
        ConstraintLayout constraintLayout4 = this.LLJ;
        if (constraintLayout4 != null) {
            constraintLayout4.requestLayout();
        }
        if (d == 0.6d) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = !z;
        IPoiClaimListAssemAbility iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiClaimListAssemAbility.class, null);
        if (iPoiClaimListAssemAbility != null) {
            iPoiClaimListAssemAbility.HF(this.LLJIJIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimSelectRootAssem onViewCreated, containerView hashCode=");
        sbLIZ.append(LJJIJL().hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = (ConstraintLayout) LJJIJL().findViewById(R.id.qym);
        this.LLJ = (ConstraintLayout) LJJIJL().findViewById(R.id.qyw);
        C1200770hLv c1200770hLv = C1200770hLv.LIZ;
        Integer numValueOf = Integer.valueOf((int) (System.currentTimeMillis() - this.LLJILJIL));
        c1200770hLv.getClass();
        c1200770hLv.LIZJ("load_content_success", new AwS102S1200000_18(numValueOf, (Integer) (-1), "poi_list_page", 13));
        Context context = getContext();
        if (context != null) {
            ConstraintLayout constraintLayout = this.LLIZLLLIL;
            if (constraintLayout != null) {
                layoutParams = constraintLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            int statusBarHeight = ScreenUtils.getStatusBarHeight(context);
            int fullScreenHeight = (ScreenUtils.getFullScreenHeight(context) - statusBarHeight) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
            if (layoutParams != null) {
                layoutParams.height = (int) (((double) fullScreenHeight) * 0.42d);
            }
            ConstraintLayout constraintLayout2 = this.LLIZLLLIL;
            if (constraintLayout2 != null) {
                C786410Ut5.m6(constraintLayout2, layoutParams);
            }
        }
        Go(0.6d);
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 902));
        C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.0hLl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1200090hKp) obj).LLILLJJLI;
            }
        }, null, AFwS302S0000000_18.get$arr$(19), 6);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSelectRootAssemAbility
    public final void uJ1(boolean z) {
        if (z == this.LLJIJIL) {
            return;
        }
        if (z) {
            Go(0.8d);
        } else {
            Go(0.6d);
        }
    }
}
