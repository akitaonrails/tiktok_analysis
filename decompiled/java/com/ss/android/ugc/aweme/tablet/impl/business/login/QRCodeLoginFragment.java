package com.ss.android.ugc.aweme.tablet.impl.business.login;

import X.C098200Yq;
import X.C0AVC;
import X.C1389890mGx;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19412710xB;
import X.C19412810xC;
import X.C19736912Jz;
import X.C19EG;
import X.C19GS;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C786410Ut5;
import X.EnumC2199071B4v;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.GenericDeclaration;
import kotlin.Unit;
import mf.a;

/* JADX INFO: loaded from: classes30.dex */
public final class QRCodeLoginFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtKyM2PGslJD8/HELIOSZic5OiY9LTY/ZyM8LywiZx4BCyooLAM8LywiDz0yLygpJzs=";
    public C19412810xC LLJJJJ;
    public C19736912Jz LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public TuxTextView LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public BaseQRCodeLoginViewModel LLJLIL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    public final LinearLayout aS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sjx) : null;
            this.LLJJJJLIIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout bS() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sk0) : null;
            this.LLJL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C19736912Jz cS() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sk7) : null;
            this.LLJJJJJIL = (C19736912Jz) viewFindViewById;
        }
        return (C19736912Jz) viewFindViewById;
    }

    public final C19412810xC dS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLJJJJ = (C19412810xC) viewFindViewById;
        }
        return (C19412810xC) viewFindViewById;
    }

    public final void LJIIL() {
        if (dS().getVisibility() != 8) {
            C786410Ut5.F1(dS(), 8);
        }
    }

    public final void gS() {
        if (aS().getVisibility() != 8) {
            C786410Ut5.LJZL(8, aS());
        }
    }

    public final void hS() {
        C19736912Jz c19736912JzCS = cS();
        int visibility = c19736912JzCS.getVisibility();
        c19736912JzCS.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c19736912JzCS);
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sk8) : null;
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.LJZ(4, (FrameLayout) viewFindViewById);
    }

    public final void iS() {
        C19412810xC c19412810xCDS = dS();
        Context context = getContext();
        c19412810xCDS.setBackground(context != null ? context.getDrawable(R.drawable.dd_) : null);
        if (dS().getVisibility() != 0) {
            C786410Ut5.F1(dS(), 0);
        }
        if (aS().getVisibility() != 0) {
            C786410Ut5.LJZL(0, aS());
        }
        View view = this.LLJJL;
        if (view == null) {
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.sjw) : null;
            this.LLJJL = (TuxTextView) viewFindViewById;
            view = viewFindViewById;
        }
        ((TextView) view).setText(getString(2131832374));
        C19412810xC c19412810xCDS2 = dS();
        c19412810xCDS2.getClass();
        C786410Ut5.F1(c19412810xCDS2, 0);
        c19412810xCDS2.setStatus(2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        BaseQRCodeLoginViewModel baseQRCodeLoginViewModel = this.LLJLIL;
        if (baseQRCodeLoginViewModel != null) {
            baseQRCodeLoginViewModel.xQ2(getViewLifecycleOwner());
        }
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    @Override // X.C0XYD
    public final void dk(int i) {
        if (i != 0) {
            if (i == 1) {
                kS(false);
                hS();
                gS();
                return;
            }
            return;
        }
        LJIIL();
        C19736912Jz c19736912JzCS = cS();
        int visibility = c19736912JzCS.getVisibility();
        c19736912JzCS.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c19736912JzCS);
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.sk8);
            } else {
                viewFindViewById = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.LJZ(0, (FrameLayout) viewFindViewById);
        gS();
    }

    public final void kS(boolean z) {
        Drawable drawable;
        if (z) {
            dS().setBackgroundColor(0);
        } else {
            C19412810xC c19412810xCDS = dS();
            Context context = getContext();
            if (context != null) {
                drawable = context.getDrawable(R.drawable.ddf);
            } else {
                drawable = null;
            }
            c19412810xCDS.setBackground(drawable);
        }
        if (dS().getVisibility() != 0) {
            C786410Ut5.F1(dS(), 0);
        }
        dS().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GenericDeclaration genericDeclaration;
        MutableLiveData<EnumC2199071B4v> mutableLiveData;
        super.onViewCreated(view, bundle);
        boolean z = true;
        if (((Number) C0AVC.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        if (z) {
            genericDeclaration = QRCodeLoginViewModelV2.class;
        } else {
            genericDeclaration = QRCodeLoginViewModel.class;
        }
        this.LLJLIL = (BaseQRCodeLoginViewModel) viewModelProvider.get((Class) genericDeclaration);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.dd_);
        C19412810xC c19412810xCDS = dS();
        C19412710xB c19412710xBLIZ = C19412710xB.LIZ(dS().getContext());
        c19412710xBLIZ.LIZLLL = imageView;
        C786410Ut5.W5(c19412710xBLIZ.LIZLLL, new FrameLayout.LayoutParams(-1, -1));
        c19412810xCDS.setBuilder(c19412710xBLIZ);
        C19412810xC c19412810xCDS2 = dS();
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 111);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19412810xCDS2);
        }
        c19412810xCDS2.setOnClickListener(aVar);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.tet);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS163S0100000_29(this, 112));
        }
        BaseQRCodeLoginViewModel baseQRCodeLoginViewModel = this.LLJLIL;
        if (baseQRCodeLoginViewModel != null && (mutableLiveData = baseQRCodeLoginViewModel.LLILLJJLI) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 94));
        }
        BaseQRCodeLoginViewModel baseQRCodeLoginViewModel2 = this.LLJLIL;
        if (baseQRCodeLoginViewModel2 != null) {
            baseQRCodeLoginViewModel2.wQ2();
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(requireActivity());
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fj4, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
