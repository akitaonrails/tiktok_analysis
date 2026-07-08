package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0I0B;
import X.C1007520cKE;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21411818qq;
import X.C2213981Bky;
import X.C23250099c;
import X.C786410Ut5;
import X.C894490Z7f;
import X.C894610Z7r;
import X.C894630Z7t;
import X.C913870ZtB;
import X.EnumC894560Z7m;
import X.InterfaceC836760Ws6;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class RiskyKeywordsSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhHELIOSOSN9LCg+IDw4MWseIDw4MQ4pMDg8OiE/GionPCwiLgkhKSIhLCEn";
    public DmRiskyKeywordsSettingViewModel LLIZ;
    public C1007520cKE LLIZLLLIL;
    public C21411818qq LLJ;
    public AnonymousClass0956 LLJI;
    public AnonymousClass0956 LLJIJIL;
    public final EnumC894560Z7m LLJILJIL = EnumC894560Z7m.SETTING_PAGE;

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        DmRiskyKeywordsSettingViewModel dmRiskyKeywordsSettingViewModel = this.LLIZ;
        if (dmRiskyKeywordsSettingViewModel == null) {
            dmRiskyKeywordsSettingViewModel = null;
        }
        if (dmRiskyKeywordsSettingViewModel.LLIZ.LJIIJ() != dmRiskyKeywordsSettingViewModel.LLIZLLLIL) {
            C1336205Ku.LIZ(false).getImChatService().LIZ();
        }
        DmRiskyKeywordsSettingViewModel dmRiskyKeywordsSettingViewModel2 = this.LLIZ;
        (dmRiskyKeywordsSettingViewModel2 != null ? dmRiskyKeywordsSettingViewModel2 : null).yQ2(this.LLJILJIL);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C894610Z7r(this, null), 3);
        this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C894630Z7t(this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        NR(AFwS248S0000000_14.get$arr$(68));
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 0);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            view.setBackgroundColor(iIntValue);
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LJFF(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS558S0100000_14(this, 240));
        tuxNavBar.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131832039);
        tuxNavBar.LJIJJ(c1250250idj);
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(0);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zhd);
        if (tuxTextView != null) {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            if (!c2213981Bky.isDebug() && !TextUtils.equals(c2213981Bky.getChannel(), "local_test")) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
            C786410Ut5.h9(tuxTextView, new ACListenerS149S0100000_14(this, 15));
        }
        C1007520cKE c1007520cKE = (C1007520cKE) view.findViewById(R.id.x2q);
        c1007520cKE.setDeleteTagAction(new AwS593S0100000_14(this, 29));
        c1007520cKE.setAddTagAction(new AwS380S0200000_14(this, c1007520cKE, 21));
        c1007520cKE.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Z7u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        this.LLIZLLLIL = c1007520cKE;
        C21411818qq c21411818qq = (C21411818qq) view.findViewById(R.id.wu5);
        C786410Ut5.C7(c21411818qq, new C913870ZtB(this, 0));
        this.LLJ = c21411818qq;
        ((TuxTextView) view.findViewById(R.id.zlw)).setTextColorRes(R.attr.a1h);
        ((TuxTextView) view.findViewById(R.id.zlx)).setTextColorRes(R.attr.a1k);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("enter_filtered_keywords_setting", C894490Z7f.LIZ(new Pair("enter_from", "privacy_and_safety_settings")));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLIZ = (DmRiskyKeywordsSettingViewModel) new ViewModelProvider(this).get(DmRiskyKeywordsSettingViewModel.class);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cok, viewGroup, false);
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
