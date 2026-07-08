package com.ss.android.ugc.tiktok.addyours.hub;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OD0;
import X.C0OEI;
import X.C0OM1;
import X.C0XQ7;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19651011uW;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20742916Ex;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C615560OCk;
import X.C723850SaN;
import X.C724750Sbp;
import X.C730000SkI;
import X.C987103tV;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class AddYoursHubFragment extends BaseFragment implements InterfaceC21503819Do, AddYoursHubAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqHELIOSJzA+OmE7PSdiCCs3ESo5OzwbPScKOy40JSAiPQ==";
    public TuxNavBar LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public User LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursHubFragment.class, "hubTabViewModel", "getHubTabViewModel()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public AddYoursHubFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursHubTabViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1630);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(689);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1631), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1632), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1633), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(691), "uid", String.class);
        this.LLJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(688), "show_topic_detail", Integer.class);
        this.LLJILJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(690), "topic_id", Long.class);
        this.LLJILJILJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(683), "enter_from", String.class);
        this.LLJILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(685), "nick_name", String.class);
        this.LLJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(684), "enter_method", String.class);
        this.LLJJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS240S0000000_9.get$arr$(686), "is_from_qa", Boolean.class);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final C0OD0 D30() {
        return new C0OD0(this.LLJI, (String) this.LLJ.getValue(), (String) this.LLJILJILJ.getValue(), (String) this.LLJJ.getValue());
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final String qS0() {
        String nickname;
        User user = this.LLJI;
        return (user == null || (nickname = user.getNickname()) == null) ? (String) this.LLJILLL.getValue() : nickname;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C730000SkI.LIZIZ.LIZJ(1, 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(687));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility
    public final void qL1(User user) {
        this.LLJI = user;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        ViewGroup.LayoutParams layoutParams;
        int iLIZJ;
        super.onViewCreated(view, bundle);
        C730000SkI.LIZIZ.LIZJ(1, 2);
        View viewFindViewById = view.findViewById(R.id.w0u);
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            Context context = getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            layoutParams.height = iLIZJ;
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, AddYoursHubAbility.class, null, null);
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById2;
        }
        String string = viewFindViewById2.getContext().getString(2131825076);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1738));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        View viewFindViewById3 = this.LLIZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.p15);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById3;
        }
        ((TuxNavBar) viewFindViewById3).setNavActions(c0om1);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 497), 3);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) assemVMLazy.getValue();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ((String) this.LLJ.getValue())) {
            assemSingleListViewModel.setState(AFwS240S0000000_9.get$arr$(899));
            assemSingleListViewModel.listAddAll(C1697810uHb.LJIIJJI(new C0OEI(1, 2131825094, true, new C615560OCk(0, 0)), new C0OEI(2, 2131825103, false, new C615560OCk(2, 0))));
        } else {
            assemSingleListViewModel.setState(AFwS240S0000000_9.get$arr$(900));
            assemSingleListViewModel.listAddAll(Collections.singletonList(new C0OEI(1, 2131825094, true, new C615560OCk(1, 0))));
        }
        Context context2 = getContext();
        if (((Number) this.LLJIJIL.getValue()).intValue() == 1 && ((Number) this.LLJILJIL.getValue()).longValue() >= 0 && context2 != null) {
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            AddYoursTopic addYoursTopic = new AddYoursTopic(Long.valueOf(((Number) this.LLJILJIL.getValue()).longValue()), null, null, null, null, null, null, Boolean.valueOf(((Boolean) this.LLJJI.getValue()).booleanValue()), -1, null, Boolean.FALSE, null, 0);
            boolean zBooleanValue = ((Boolean) this.LLJJI.getValue()).booleanValue();
            if (((Boolean) this.LLJJI.getValue()).booleanValue()) {
                str = "qa_share";
            } else if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ((String) this.LLJ.getValue())) {
                str = "added";
            } else {
                str = "others_hub";
            }
            if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ((String) this.LLJ.getValue())) {
                i = 2;
            } else {
                i = 1;
            }
            c19651011uW.LJIILJJIL(context2, addYoursTopic, null, null, null, zBooleanValue, "add_yours_topic_list_page", str, i, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C20742916Ex.LIZ(getContext(), R.layout.f854m3, viewGroup, false, -1);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
