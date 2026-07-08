package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C098200Yq;
import X.C0HCH;
import X.C0PEM;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C418440Gaw;
import X.C433620GzQ;
import X.C435330H5f;
import X.C438620HHw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC438630HHx;
import X.ViewTreeObserverOnPreDrawListenerC462850IDb;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS171S0200000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryThoughtAvatarSheetFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSHELIOSp9GzEjOzYHICo5LicnCTMtPS4hGy0pLDsVOiQrJCo9PA==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 723));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(335));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(336));
    public C0HCH LLJI;

    public final StoryThoughtAvatarCreationVM SR() {
        return (StoryThoughtAvatarCreationVM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0HCH c0hch = this.LLJI;
        if (c0hch == null) {
            return;
        }
        if (C435330H5f.LIZ()) {
            C786410Ut5.LLLLLLZZ(c0hch.LLILZ, 8);
            C786410Ut5.LLLLZLL(c0hch.LLILZLL, 8);
            C197039127h c197039127h = c0hch.LLILLL;
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                layoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
                layoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
                C786410Ut5.W5(c197039127h, layoutParams2);
                TuxTextView tuxTextView = c0hch.LLIZ;
                ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                if (layoutParams3 != null) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                    C786410Ut5.W5(tuxTextView, layoutParams4);
                    c0hch.LLIZ.setText(getString(2131833988));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            C786410Ut5.a9(c0hch.LLILZ, new ACListenerS141S0100000_6(this, 76));
        }
        C786410Ut5.y3(c0hch.LLILZIL.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC462850IDb(c0hch, 2));
        if (C435330H5f.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C433620GzQ(this, c0hch, null), 2);
        } else {
            C438620HHw c438620HHw = C438620HHw.LIZ;
            EnumC438630HHx enumC438630HHx = EnumC438630HHx.HALF_SHEET_HEADER_IMG;
            SmartImageView smartImageView = c0hch.LLILZIL;
            c438620HHw.getClass();
            C438620HHw.LIZIZ(enumC438630HHx, smartImageView);
        }
        c0hch.LLILZIL.setAdjustViewBounds(true);
        SR().LLL.observe(getViewLifecycleOwner(), new AObserverS171S0200000_6(c0hch, this, 2));
        C197039127h c197039127h2 = c0hch.LLILLL;
        c197039127h2.setBackgroundResource(R.drawable.d_6);
        c197039127h2.setTextColorRes(R.attr.z_);
        if (Intrinsics.LJFF(SR().LLL.getValue(), Boolean.TRUE)) {
            SR().PQ2("show");
        } else {
            SR().LQ2("show");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe8, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewTd;
        int i = R.id.d7_;
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.d7_, viewTd);
        if (c197039127h != null) {
            i = R.id.lf2;
            TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.lf2, viewTd);
            if (tuxIconView != null) {
                i = R.id.ljn;
                SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.ljn, viewTd);
                if (smartImageView != null) {
                    i = R.id.zau;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.zau, viewTd);
                    if (tuxTextView != null) {
                        i = R.id.tv_title;
                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_title, viewTd);
                        if (tuxTextView2 != null) {
                            i = R.id.tv_title_regenerate;
                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_title_regenerate, viewTd);
                            if (tuxTextView3 != null) {
                                this.LLJI = new C0HCH(frameLayout, frameLayout, c197039127h, tuxIconView, smartImageView, tuxTextView, tuxTextView2, tuxTextView3);
                                C19GS c19gs = null;
                                if (!(frameLayout instanceof View)) {
                                    frameLayout = null;
                                }
                                if (frameLayout != null) {
                                    try {
                                        ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                                        ViewTreeViewModelStoreOwner.set(frameLayout, this);
                                        frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                        C19EG activity = getActivity();
                                        if (activity instanceof C19GS) {
                                            c19gs = (C19GS) activity;
                                        }
                                        C1685300txQ.LIZ(c19gs);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                        return frameLayout;
                                    }
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                                return frameLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
