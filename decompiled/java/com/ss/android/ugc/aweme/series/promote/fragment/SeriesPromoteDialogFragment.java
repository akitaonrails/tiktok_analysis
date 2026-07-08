package com.ss.android.ugc.aweme.series.promote.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1611550s2T;
import X.C1611600s2Y;
import X.C1612490s3z;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC344240DeY;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPromoteDialogFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s8OyA+JzEpHELIOSZykhKSIhLCEnZhYpOyY2OxU+JiI8PCAIIC4/JyIKOy40JSAiPQ==";
    public C1611600s2Y LL;
    public Function0<Unit> LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        String str;
        C197039127h c197039127h;
        SmartImageView smartImageView;
        LinearLayout linearLayout;
        TuxIconView tuxIconView;
        C1611600s2Y c1611600s2Y = this.LL;
        if (c1611600s2Y != null && (tuxIconView = c1611600s2Y.LLILLJJLI) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 44));
        }
        C1611600s2Y c1611600s2Y2 = this.LL;
        if (c1611600s2Y2 != null && (linearLayout = c1611600s2Y2.LLILZIL) != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str = PaidContentImageSettings.LIZ().seriesPromoteDialogImage.dark;
        } else {
            str = PaidContentImageSettings.LIZ().seriesPromoteDialogImage.light;
        }
        C1611600s2Y c1611600s2Y3 = this.LL;
        if (c1611600s2Y3 != null && (smartImageView = c1611600s2Y3.LLILZ) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        C1611600s2Y c1611600s2Y4 = this.LL;
        if (c1611600s2Y4 != null && (c197039127h = c1611600s2Y4.LLILLL) != null) {
            c197039127h.setText(this.LLILLL);
            C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(this, c197039127h, 7));
        }
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        c1612490s3z.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str2);
        c2344009Gk.LJFF("author_id", str3);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_info_show_off_series", c2344009Gk.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bhm, viewGroup, false);
        int i = R.id.s_e;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.s_e, viewTd);
        if (tuxIconView != null) {
            i = R.id.s_f;
            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.s_f, viewTd);
            if (c197039127h != null) {
                i = R.id.s_g;
                SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.s_g, viewTd);
                if (smartImageView != null) {
                    i = R.id.s_h;
                    LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.s_h, viewTd);
                    if (linearLayout != null) {
                        i = R.id.s_i;
                        if (C1616006Uk.LIZ(R.id.s_i, viewTd) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                            this.LL = new C1611600s2Y(constraintLayout, tuxIconView, c197039127h, smartImageView, linearLayout);
                            C19GS c19gs = null;
                            if (!(constraintLayout instanceof View)) {
                                constraintLayout = null;
                            }
                            if (constraintLayout != null) {
                                try {
                                    ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                                    ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                                    constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                    C19EG activity = getActivity();
                                    if (activity instanceof C19GS) {
                                        c19gs = (C19GS) activity;
                                    }
                                    C1685300txQ.LIZ(c19gs);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                    return constraintLayout;
                                }
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
