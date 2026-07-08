package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.AnonymousClass0317;
import X.C034S;
import X.C049Z;
import X.C098200Yq;
import X.C10508049a;
import X.C1120604Zw;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C1685300txQ;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C786410Ut5;
import X.C958103op;
import X.C993603uY;
import X.EnumC1338240kve;
import X.EnumC1769850w9n;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SizeGuideFragment extends ECBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSExKTYpZz83OGs/PC0jKSIpZxw6MiALPCY3LQM+KCg+LSs4";
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public SmartImageView LLILZIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "size_pic";
    }

    public final SmartImageView VR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vdr) : null;
            this.LLILZIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS86S1200000_1(((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? "close" : "return", this, C1748730vbj.LIZIZ(this, "lib_track_builtin_lane_business"), 17));
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int marginStart;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.jzi);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 47), viewFindViewById);
        SizeGuide sizeGuide = (SizeGuide) C993603uY.LIZIZ(this, "size_guide");
        if (sizeGuide != null) {
            View viewFindViewById2 = this.LLILZ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(sizeGuide.skuSizeGuideTitle);
            Image image = sizeGuide.originSizeGuideImage;
            if (image != null) {
                int marginEnd = 0;
                C786410Ut5.LJLLLLLL(0, VR());
                int iLIZLLL = C958103op.LIZLLL();
                ViewGroup.LayoutParams layoutParams = VR().getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart = 0;
                }
                int i = iLIZLLL - marginStart;
                ViewGroup.LayoutParams layoutParams2 = VR().getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                }
                C1744700vVE.LJIIIIZZ((int) ((i - marginEnd) / image.getRadio()), VR());
                C786410Ut5.I7(new AjS40S0200000_1(this, image, 35), VR());
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C1334210kp9.LIZ(image, EnumC1769850w9n.PDP_SIZE_GUIDE, null, null, null, null, 252);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
                c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LIZLLL.LJJ(VR());
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
        }
        C1748720vbi.LIZIZ(this, new C049Z(), null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aze, viewGroup, false);
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
