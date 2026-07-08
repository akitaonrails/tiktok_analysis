package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0K0R;
import X.C0TVI;
import X.C1308910kAL;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C15WP;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C511110K2r;
import X.C511370K3r;
import X.C511440K3y;
import X.C511520K4g;
import X.C512310K7h;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.compat.lifecycle.PgcSubscriptionSuspensionLifecycleObserver;
import com.ss.android.ugc.aweme.subscription.pgc.experiment.PGCRestructureDebugIndicator;
import com.zhiliaoapp.musically.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedFragment extends SubSpaceBaseFragment {
    public static final C511440K3y LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSHELIOSohIzZiOjoxOzUtKip9LiApLWElISA7ZykhKSIhLCEnZhY5KxwjKSYpDyo2LAM+KCg+LSs4";
    public RelativeLayout LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public C511370K3r LLJ;
    public View LLJI;
    public final WeakHashMap<View, Boolean> LLJIJIL;
    public int LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new C511440K3y();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void MR(View view) {
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void clearFromXmlViewCache() {
        this.LLILLJJLI = null;
        this.LLIZ = null;
    }

    public SubSpaceFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 498);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(225);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 499), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 500), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 501), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJIJIL = new WeakHashMap<>();
    }

    public final C511370K3r RR() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C511370K3r.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final SubSpaceFeedVM SR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C511520K4g.LIZIZ(R.attr.f8c, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C511370K3r(), C511370K3r.class, "source_default_key");
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        View viewFindViewById;
        boolean z;
        final View viewFindViewById2;
        int paddingBottom;
        Object parent;
        View viewFindViewById3;
        int i;
        C511370K3r c511370K3rRR;
        String string2;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string3;
        boolean zBooleanValue2;
        Boolean boolLIZ2;
        boolean zBooleanValue3;
        Boolean boolLIZ3;
        String string4;
        boolean zBooleanValue4;
        Boolean boolLIZ4;
        boolean zBooleanValue5;
        Boolean boolLIZ5;
        boolean zBooleanValue6;
        Boolean boolLIZ6;
        boolean zBooleanValue7;
        Boolean boolLIZ7;
        String string5;
        boolean zBooleanValue8;
        Boolean boolLIZ8;
        boolean zBooleanValue9;
        Boolean boolLIZ9;
        String str;
        String secUid;
        User user;
        com.ss.android.ugc.aweme.profile.model.User currentUser;
        String string6;
        int i2;
        boolean zBooleanValue10;
        Boolean boolLIZ10;
        int iIntValue;
        super.onViewCreated(view, bundle);
        if (PGCRestructureDebugIndicator.INSTANCE.isEnabled()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f8b, view.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view.setBackgroundColor(iIntValue);
        }
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("sec_anchor_id")) == null) {
            string = "";
        }
        C511370K3r c511370K3rRR2 = RR();
        Object parent2 = null;
        if (c511370K3rRR2 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (boolLIZ10 = C512310K7h.LIZ(arguments2, "hide_header", null)) != null) {
                zBooleanValue10 = boolLIZ10.booleanValue();
            } else {
                zBooleanValue10 = false;
            }
            c511370K3rRR2.LLJJI = zBooleanValue10;
        }
        if (this.LLILZ == 0) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i2 = arguments3.getInt("container_id");
            } else {
                i2 = 0;
            }
            this.LLILZ = i2;
        }
        if (this.LLILLL.length() == 0) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string6 = arguments4.getString("enter_from")) == null) {
                string6 = "";
            }
            this.LLILLL = string6;
        }
        C511370K3r c511370K3rRR3 = RR();
        if (c511370K3rRR3 != null) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                currentUser = iUserService.getCurrentUser();
            } else {
                currentUser = null;
            }
            c511370K3rRR3.LLILLJJLI = C15WP.LJ(currentUser);
        }
        C511370K3r c511370K3rRR4 = RR();
        if (c511370K3rRR4 != null) {
            c511370K3rRR4.LLILZ = string;
        }
        C511370K3r c511370K3rRR5 = RR();
        if (c511370K3rRR5 != null) {
            C511370K3r c511370K3rRR6 = RR();
            if (c511370K3rRR6 != null) {
                str = c511370K3rRR6.LLILZ;
            } else {
                str = null;
            }
            C511370K3r c511370K3rRR7 = RR();
            if (c511370K3rRR7 != null && (user = c511370K3rRR7.LLILLJJLI) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c511370K3rRR5.LLJ = Intrinsics.LJFF(str, secUid);
        }
        C511370K3r c511370K3rRR8 = RR();
        if (c511370K3rRR8 != null) {
            c511370K3rRR8.LLILZIL = false;
        }
        C511370K3r c511370K3rRR9 = RR();
        if (c511370K3rRR9 != null) {
            c511370K3rRR9.LLJI = this.LLILZ;
        }
        C511370K3r c511370K3rRR10 = RR();
        if (c511370K3rRR10 != null) {
            c511370K3rRR10.LLJIJIL = this.LLILLL;
        }
        C511370K3r c511370K3rRR11 = RR();
        if (c511370K3rRR11 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (boolLIZ9 = C512310K7h.LIZ(arguments5, "preview_mode", null)) != null) {
                zBooleanValue9 = boolLIZ9.booleanValue();
            } else {
                zBooleanValue9 = false;
            }
            c511370K3rRR11.LLJILLL = zBooleanValue9;
        }
        C511370K3r c511370K3rRR12 = RR();
        if (c511370K3rRR12 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (boolLIZ8 = C512310K7h.LIZ(arguments6, "use_mock_data", null)) != null) {
                zBooleanValue8 = boolLIZ8.booleanValue();
            } else {
                zBooleanValue8 = false;
            }
            c511370K3rRR12.LLJJ = zBooleanValue8;
        }
        C511370K3r c511370K3rRR13 = RR();
        if (c511370K3rRR13 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string5 = arguments7.getString("last_enter_from")) == null) {
                string5 = "";
            }
            c511370K3rRR13.LLJILJIL = string5;
        }
        C511370K3r c511370K3rRR14 = RR();
        if (c511370K3rRR14 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (boolLIZ7 = C512310K7h.LIZ(arguments8, "disable_swipe_refresh", null)) != null) {
                zBooleanValue7 = boolLIZ7.booleanValue();
            } else {
                zBooleanValue7 = false;
            }
            c511370K3rRR14.LLJJIJI = zBooleanValue7;
        }
        C511370K3r c511370K3rRR15 = RR();
        if (c511370K3rRR15 != null) {
            Bundle arguments9 = getArguments();
            if (arguments9 != null && (boolLIZ6 = C512310K7h.LIZ(arguments9, "hide_indicator", null)) != null) {
                zBooleanValue6 = boolLIZ6.booleanValue();
            } else {
                zBooleanValue6 = false;
            }
            c511370K3rRR15.LLJJIJIIJIL = zBooleanValue6;
        }
        C511370K3r c511370K3rRR16 = RR();
        if (c511370K3rRR16 != null) {
            Bundle arguments10 = getArguments();
            if (arguments10 != null && (boolLIZ5 = C512310K7h.LIZ(arguments10, "hide_bottom_post", null)) != null) {
                zBooleanValue5 = boolLIZ5.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            c511370K3rRR16.LLJJIJIL = zBooleanValue5;
        }
        C511370K3r c511370K3rRR17 = RR();
        if (c511370K3rRR17 != null) {
            Bundle arguments11 = getArguments();
            if (arguments11 != null && (boolLIZ4 = C512310K7h.LIZ(arguments11, "hide_title", null)) != null) {
                zBooleanValue4 = boolLIZ4.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            c511370K3rRR17.LLJJJ = zBooleanValue4;
        }
        C511370K3r c511370K3rRR18 = RR();
        if (c511370K3rRR18 != null) {
            Bundle arguments12 = getArguments();
            if (arguments12 == null || (string4 = arguments12.getString("package_id")) == null) {
                string4 = "";
            }
            c511370K3rRR18.LLJJJJ = string4;
        }
        C511370K3r c511370K3rRR19 = RR();
        if (c511370K3rRR19 != null) {
            Bundle arguments13 = getArguments();
            if (arguments13 != null && (boolLIZ3 = C512310K7h.LIZ(arguments13, "hide_top_setting", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c511370K3rRR19.LLJJJIL = zBooleanValue3;
        }
        C511370K3r c511370K3rRR20 = RR();
        if (c511370K3rRR20 != null) {
            Bundle arguments14 = getArguments();
            if (arguments14 != null && (boolLIZ2 = C512310K7h.LIZ(arguments14, "ban_package_show", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c511370K3rRR20.LLJJJJJIL = zBooleanValue2;
        }
        C511370K3r c511370K3rRR21 = RR();
        if (c511370K3rRR21 != null) {
            Bundle arguments15 = getArguments();
            if (arguments15 == null || (string3 = arguments15.getString("preview_title")) == null) {
                string3 = "";
            }
            c511370K3rRR21.LLJJJJLIIL = string3;
        }
        C511370K3r c511370K3rRR22 = RR();
        if (c511370K3rRR22 != null) {
            Bundle arguments16 = getArguments();
            if (arguments16 != null && (boolLIZ = C512310K7h.LIZ(arguments16, "is_full_screen", Boolean.TRUE)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c511370K3rRR22.LLJJIII = !zBooleanValue;
        }
        C511370K3r c511370K3rRR23 = RR();
        if (c511370K3rRR23 != null) {
            Bundle arguments17 = getArguments();
            if (arguments17 != null && (string2 = arguments17.getString("page_source")) != null) {
                str2 = string2;
            }
            c511370K3rRR23.LLJJL = str2;
        }
        SubSpaceFeedVM subSpaceFeedVMSR = SR();
        FragmentManager supportFragmentManager = this.LLILZIL;
        if (supportFragmentManager == null) {
            C19EG activity = getActivity();
            if (activity != null) {
                supportFragmentManager = activity.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
        }
        subSpaceFeedVMSR.LLILZ = supportFragmentManager;
        SubSpaceFeedVM subSpaceFeedVMSR2 = SR();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Context context = getContext();
        subSpaceFeedVMSR2.LL = interfaceC665370Q7zLJFF;
        subSpaceFeedVMSR2.LLILLJJLI = context;
        subSpaceFeedVMSR2.LLILZIL = new C511110K2r(subSpaceFeedVMSR2, subSpaceFeedVMSR2.wQ2());
        if (!SR().AQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        getLifecycle().addObserver(new PgcSubscriptionSuspensionLifecycleObserver(new AwS546S0100000_2(this, 1079)));
        if (!SR().AQ2() || ((c511370K3rRR = RR()) != null && c511370K3rRR.LLJJIJIL)) {
            View viewFindViewById4 = this.LLIZ;
            if (viewFindViewById4 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById4 = view2.findViewById(R.id.p7e);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLIZ = (RelativeLayout) viewFindViewById4;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById4, 8);
        } else {
            View viewFindViewById5 = this.LLIZ;
            if (viewFindViewById5 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById5 = view3.findViewById(R.id.p7e);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLIZ = (RelativeLayout) viewFindViewById5;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById5, 0);
            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 526), 3);
        }
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.wg0);
        } else {
            viewFindViewById = null;
        }
        this.LLJI = viewFindViewById;
        C511370K3r c511370K3rRR24 = RR();
        if (c511370K3rRR24 != null && c511370K3rRR24.LLJJJ) {
            View view5 = this.LLJI;
            if (view5 != null) {
                C0K0R.LIZ(view5);
            }
        } else {
            View view6 = this.LLJI;
            if (view6 != null) {
                C723850SaN.LIZ(this, false, null, new AwS373S0200000_7(this, view6, 72), 3);
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 524), 3);
        C511370K3r c511370K3rRR25 = RR();
        if (c511370K3rRR25 != null && c511370K3rRR25.LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            View viewFindViewById6 = view.findViewById(R.id.bn2);
            if (viewFindViewById6 != null) {
                parent = viewFindViewById6.getParent();
            } else {
                parent = null;
            }
            if (!(parent instanceof View) || (viewFindViewById3 = (View) parent) == null) {
                viewFindViewById3 = view.findViewById(R.id.wg0);
            }
            C511370K3r c511370K3rRR26 = RR();
            if (c511370K3rRR26 == null || !c511370K3rRR26.LLJJJ) {
                Boolean bool = this.LLJIJIL.get(viewFindViewById3);
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    int iLIZJ = C497820Jfg.LIZJ(view.getContext());
                    if (iLIZJ <= 0) {
                        this.LLJIJIL.put(viewFindViewById3, bool2);
                    } else {
                        ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
                        if (layoutParams != null && (i = layoutParams.height) > 0) {
                            layoutParams.height = i + iLIZJ;
                            C786410Ut5.W5(viewFindViewById3, layoutParams);
                        }
                        viewFindViewById3.setPadding(viewFindViewById3.getPaddingLeft(), viewFindViewById3.getPaddingTop() + iLIZJ, viewFindViewById3.getPaddingRight(), viewFindViewById3.getPaddingBottom());
                        this.LLJIJIL.put(viewFindViewById3, bool2);
                    }
                }
            }
        }
        C511370K3r c511370K3rRR27 = RR();
        if (c511370K3rRR27 != null && c511370K3rRR27.LLJJIII) {
            return;
        }
        View viewFindViewById7 = view.findViewById(R.id.bn2);
        if (viewFindViewById7 != null) {
            parent2 = viewFindViewById7.getParent();
        }
        if (!(parent2 instanceof View) || (viewFindViewById2 = (View) parent2) == null) {
            viewFindViewById2 = view.findViewById(R.id.wg0);
        }
        final View viewFindViewById8 = view.findViewById(R.id.p7e);
        final View viewFindViewById9 = view.findViewById(R.id.htp);
        final int paddingTop = view.getPaddingTop();
        final int paddingBottom2 = view.getPaddingBottom();
        if (viewFindViewById9 != null) {
            paddingBottom = viewFindViewById9.getPaddingBottom();
        } else {
            paddingBottom = 0;
        }
        view.setPadding(view.getPaddingLeft(), paddingTop, view.getPaddingRight(), paddingBottom2);
        if (viewFindViewById8 != null) {
            viewFindViewById8.setPadding(viewFindViewById8.getPaddingLeft(), viewFindViewById8.getPaddingTop(), viewFindViewById8.getPaddingRight(), 0);
        }
        if (viewFindViewById9 != null) {
            viewFindViewById9.setPadding(viewFindViewById9.getPaddingLeft(), viewFindViewById9.getPaddingTop(), viewFindViewById9.getPaddingRight(), paddingBottom);
        }
        final int i3 = paddingBottom;
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0K3z
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view7, C20246014Ju c20246014Ju) {
                C511370K3r c511370K3rRR28;
                C20246014Ju c20246014JuLIZ;
                C20244914Jj c20244914JjLIZ;
                C20246014Ju c20246014JuLIZ2;
                C20244914Jj c20244914JjLIZ2;
                C20244914Jj c20244914JjLIZ3 = c20246014Ju.LIZ(1);
                C20244914Jj c20244914JjLIZ4 = c20246014Ju.LIZ(2);
                int iLIZJ2 = c20244914JjLIZ3.LIZIZ;
                int i4 = c20244914JjLIZ4.LIZLLL;
                if (iLIZJ2 <= 0 && ((c20246014JuLIZ2 = C14K4.LIZ(view)) == null || (c20244914JjLIZ2 = c20246014JuLIZ2.LIZ(1)) == null || (iLIZJ2 = c20244914JjLIZ2.LIZIZ) <= 0)) {
                    iLIZJ2 = C497820Jfg.LIZJ(view.getContext());
                }
                if (i4 <= 0 && ((c20246014JuLIZ = C14K4.LIZ(view)) == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) == null || (i4 = c20244914JjLIZ.LIZLLL) <= 0)) {
                    i4 = this.LLJILJIL;
                }
                SubSpaceFeedFragment subSpaceFeedFragment = this;
                View view8 = viewFindViewById2;
                View view9 = view;
                int i5 = paddingTop;
                View view10 = viewFindViewById8;
                View view11 = viewFindViewById9;
                int i6 = i3;
                int i7 = paddingBottom2;
                subSpaceFeedFragment.LLJILJIL = i4;
                if (view8 == null || ((c511370K3rRR28 = subSpaceFeedFragment.RR()) != null && c511370K3rRR28.LLJJJ)) {
                    view9.setPadding(view9.getPaddingLeft(), i5 + iLIZJ2, view9.getPaddingRight(), view9.getPaddingBottom());
                } else {
                    view9.setPadding(view9.getPaddingLeft(), i5, view9.getPaddingRight(), view9.getPaddingBottom());
                }
                if (view10 != null) {
                    C511370K3r c511370K3rRR29 = subSpaceFeedFragment.RR();
                    if (c511370K3rRR29 != null && c511370K3rRR29.LLJJIJIL) {
                        view10.setPadding(view10.getPaddingLeft(), view10.getPaddingTop(), view10.getPaddingRight(), 0);
                    } else {
                        if (view11 != null) {
                            view11.setPadding(view11.getPaddingLeft(), view11.getPaddingTop(), view11.getPaddingRight(), i6);
                        }
                        view9.setPadding(view9.getPaddingLeft(), view9.getPaddingTop(), view9.getPaddingRight(), i7);
                        return c20246014Ju;
                    }
                }
                if (view11 != null) {
                    view11.setPadding(view11.getPaddingLeft(), view11.getPaddingTop(), view11.getPaddingRight(), i6 + i4);
                    view9.setPadding(view9.getPaddingLeft(), view9.getPaddingTop(), view9.getPaddingRight(), i7);
                    return c20246014Ju;
                }
                view9.setPadding(view9.getPaddingLeft(), view9.getPaddingTop(), view9.getPaddingRight(), i7 + i4);
                return c20246014Ju;
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0K4M
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view7) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view7) {
                C20097313kJ.LIZJ(view7);
            }
        });
        if (!view.isAttachedToWindow()) {
            return;
        }
        C20097313kJ.LIZJ(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ffj, viewGroup, false);
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
