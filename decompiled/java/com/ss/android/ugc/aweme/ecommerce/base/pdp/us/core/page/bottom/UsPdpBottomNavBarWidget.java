package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.bottom;

import X.AnonymousClass0413;
import X.AnonymousClass0414;
import X.AnonymousClass0416;
import X.AnonymousClass0434;
import X.AnonymousClass0445;
import X.C01GW;
import X.C041B;
import X.C043J;
import X.C04JW;
import X.C13LE;
import X.C1744700vVE;
import X.C1745060vVo;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C802703Bp;
import X.C814420VxA;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpBottomNavBarWidget extends JediBaseWidget {
    public final PdpFragment LLJ;
    public AnonymousClass0434 LLJI;
    public TuxTextView LLJIJIL;
    public LinearLayout LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public View LLJILLL;
    public ConstraintLayout LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public RelativeLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final LinkedList<C802703Bp> LLJJJIL;
    public final C043J LLJJJJ;
    public final C04JW LLJJJJJIL;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.akz;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null) {
            view.setTag(R.id.gib, this.LLJ);
        }
        LJII().setPdpBottomButtonListener(this.LLJJJJ);
        View view2 = this.LLILZ;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.d78)) != null) {
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), viewFindViewById);
        }
        PdpViewModel pdpViewModelLJIILIIL = LJIILIIL();
        AnonymousClass0413 anonymousClass0413 = new C2217381BqS() { // from class: X.0413
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getBottomAreaElem();
            }
        };
        AnonymousClass0414 anonymousClass0414 = new C2217381BqS() { // from class: X.0414
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getProtectionProgramText();
            }
        };
        AnonymousClass0416 anonymousClass0416 = new C2217381BqS() { // from class: X.0416
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getUserRight();
            }
        };
        AwS650S0100000_1 awS650S0100000_1 = new AwS650S0100000_1(this, 27);
        pdpViewModelLJIILIIL.getClass();
        JediViewModel.ZQ2(pdpViewModelLJIILIIL, anonymousClass0413, anonymousClass0414, anonymousClass0416, null, awS650S0100000_1, 8, null);
        LJIILIIL().hR2(new C2217381BqS() { // from class: X.0vP6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
            }
        }, new AwS580S0100000_1(this, 925));
        LJIILIIL().hR2(new C2217381BqS() { // from class: X.0417
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getAddCartData();
            }
        }, new AwS580S0100000_1(this, 926));
        LJI();
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        this.LLJJJ = false;
        View view = this.LLILZ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            C04JW c04jw = this.LLJJJJJIL;
            viewTreeObserver.removeOnGlobalLayoutListener(c04jw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c04jw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLILLJJLI = true;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJI() {
        ViewTreeObserver viewTreeObserver;
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        View view = this.LLILZ;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        C04JW c04jw = this.LLJJJJJIL;
        viewTreeObserver.addOnGlobalLayoutListener(c04jw);
        C2187701Ajg.LIZ(viewTreeObserver, c04jw, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public final AnonymousClass0434 LJII() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d78) : null;
            this.LLJI = (AnonymousClass0434) viewFindViewById;
        }
        return (AnonymousClass0434) viewFindViewById;
    }

    public final ConstraintLayout LJIIIIZZ() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.mgv) : null;
            this.LLJJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final View LJIIIZ() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ve0) : null;
            this.LLJILLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final RelativeLayout LJIIJ() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w0g) : null;
            this.LLJJIJI = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final ConstraintLayout LJIIJJI() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.xz2) : null;
            this.LLJILJILJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView LJIIL() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zbh) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PdpViewModel LJIILIIL() {
        return (PdpViewModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        PdpViewModel pdpViewModelLJIILIIL;
        PdpBottomAreaElem pdpBottomAreaElemMR2;
        if (((Boolean) C041B.LIZ.getValue()).booleanValue()) {
            Integer num = LJIILIIL().LLLLZLLLI;
            if ((num == null || num.intValue() != 9) && (pdpBottomAreaElemMR2 = (pdpViewModelLJIILIIL = LJIILIIL()).MR2(null)) != null) {
                pdpViewModelLJIILIIL.setState(new AwS580S0100000_1(pdpBottomAreaElemMR2, 1108));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.043J] */
    public UsPdpBottomNavBarWidget(PdpFragment pdpFragment) {
        this.LLJ = pdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 14));
        this.LLJJJIL = new LinkedList<>();
        this.LLJJJJ = new AnonymousClass0445() { // from class: X.043J
            @Override // X.AnonymousClass0445
            public final void LIZJ() {
            }

            /* JADX WARN: Removed duplicated region for block: B:167:0x033a  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x0380  */
            @Override // X.AnonymousClass0445
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C04E4 r28, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r29) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 1224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C043J.LIZ(X.04E4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:109:0x01dd  */
            @Override // X.AnonymousClass0445
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C04E4 r15, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r16) {
                /*
                    Method dump skipped, instruction units count: 627
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C043J.LIZIZ(X.04E4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton):void");
            }
        };
        this.LLJJJJJIL = new C04JW(this, 0);
    }

    public final void LJIILJJIL(TuxTextView tuxTextView, LinkRichText linkRichText) {
        if (linkRichText != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.setText(RichTextUtil.LJ(RichTextUtil.LIZ, C1745060vVo.LIZ(this), linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 16380));
            tuxTextView.setTextColor(linkRichText.LIZIZ(C1745060vVo.LIZ(this)));
            return;
        }
        C786410Ut5.LJLLLLLL(8, tuxTextView);
    }
}
