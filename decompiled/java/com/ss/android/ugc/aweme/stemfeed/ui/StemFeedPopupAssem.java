package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C01GW;
import X.C1156590gCf;
import X.C1383320m6M;
import X.C1390810mIR;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1620550sGz;
import X.C1668306g5;
import X.C19EG;
import X.C20703515zt;
import X.C452501pT;
import X.C688120Qyw;
import X.C723590SZx;
import X.C724240Sb0;
import X.C746760TRa;
import X.C849850XVn;
import X.InterfaceC1554640qYg;
import X.InterfaceC20660615sy;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class StemFeedPopupAssem extends UIContentAssem implements InterfaceC20660615sy, IStemPopupAssemAbility, InterfaceC1554640qYg {
    public StemFeedFragmentPanel LLJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1156590gCf.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(332));
    public final String LLJIJIL = "stem_feed";

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1715811374) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final boolean Go() {
        if (((Keva) this.LLJI.getValue()).getBoolean("popup_with_caption", false) || !C1383320m6M.LIZIZ() || C746760TRa.LIZ().LJLILLLLZI() || C746760TRa.LIZ().LJL()) {
            return false;
        }
        C20703515zt.LIZ.getClass();
        return !Intrinsics.LJFF(C20703515zt.LIZIZ.LLIIZ(), "en");
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return (fragmentLJI == null || (lifecycle = fragmentLJI.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemPopupAssemAbility
    public final void kW1(Aweme aweme) {
        boolean z;
        boolean z2 = ((Keva) this.LLJI.getValue()).getBoolean("intro_guide_show", false);
        boolean z3 = ((Keva) this.LLJI.getValue()).getBoolean("popup_with_caption", false);
        if (!Go() ? !(z2 || z3) : !z3) {
            z = true;
        } else {
            z = false;
        }
        FragmentManager supportFragmentManager = null;
        if (z) {
            if (Go()) {
                boolean z4 = !z2;
                if (Go()) {
                    ComplianceServiceProvider.LJI().LJJIJIL(C724240Sb0.LIZ(this), new C1390810mIR(this, aweme), z4, false);
                    return;
                }
                return;
            }
            StemFeedPopupObserver stemFeedPopupObserver = (StemFeedPopupObserver) C1558520qew.LIZ(C1558520qew.LJIIL(this), StemFeedPopupObserver.class, null);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("stem_feed_desc_pop")) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    supportFragmentManager = c19egLIZ.getSupportFragmentManager();
                }
                PopupManager.LJIJ(new C1620550sGz(this, supportFragmentManager, stemFeedPopupObserver), "stem_feed_desc_pop", new C1668306g5("stem_feed_desc_pop_pns_trigger"));
                return;
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                supportFragmentManager = c19egLIZ2.getSupportFragmentManager();
            }
            PopupManager.LJIJI(new C1620550sGz(this, supportFragmentManager, stemFeedPopupObserver), true);
            return;
        }
        StemFeedPopupObserver stemFeedPopupObserver2 = (StemFeedPopupObserver) C1558520qew.LIZ(C1558520qew.LJIIL(this), StemFeedPopupObserver.class, null);
        if (stemFeedPopupObserver2 == null) {
            return;
        }
        stemFeedPopupObserver2.nF2();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJ = ((C1156590gCf) this.LLIZLLLIL.getValue()).LL;
    }
}
