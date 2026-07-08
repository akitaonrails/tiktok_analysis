package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0JS4;
import X.C0TVI;
import X.C1143804dg;
import X.C1161904gb;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
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
import X.C495510Jbx;
import X.C497740JfY;
import X.C500260Jjc;
import X.C503760JpG;
import X.C504510JqT;
import X.C504520JqU;
import X.C504590Jqb;
import X.C504600Jqc;
import X.C504610Jqd;
import X.C504620Jqe;
import X.C504720Jqo;
import X.C512300K7g;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents.SubscriptionSuspensionLifecycleObserver;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedFragment extends SubSpaceBaseFragment {
    public static final C504520JqU LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyHELIOSogO2s8LD04O2s/PC0gOCQvLGE1LSAoZzk6LTJiLz0yLygpJzt9GzAuGj8yKyAKLCo3DjctLiI2JjE=";
    public RelativeLayout LLILZLL;
    public final AssemVMLazy LLIZ;
    public C504510JqT LLIZLLLIL;
    public View LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new C504520JqU();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILZLL = null;
    }

    public SubSpaceFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        C0JS4 c0js4 = new C0JS4(c19719912DlLIZ);
        C504720Jqo c504720Jqo = new C504720Jqo();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0js4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C504590Jqb(this), c504720Jqo, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0js4, new C504600Jqc(this), c504720Jqo, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0js4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C504610Jqd(this), c504720Jqo, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    public final C504510JqT RR() {
        if (this.LLIZLLLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504510JqT.class, null);
            this.LLIZLLLIL = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZLLLIL;
    }

    public final SubSpaceFeedVM SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C497740JfY.LIZLLL(R.attr.c5r, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        this.LLJI = false;
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504510JqT(), C504510JqT.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        View viewFindViewById;
        boolean z;
        final View viewFindViewById2;
        final int paddingBottom;
        final int paddingBottom2;
        C504510JqT c504510JqTRR;
        Object parent;
        View viewFindViewById3;
        C504510JqT c504510JqTRR2;
        C504510JqT c504510JqTRR3;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string2;
        boolean zBooleanValue2;
        Boolean boolLIZ2;
        String string3;
        boolean zBooleanValue3;
        Boolean boolLIZ3;
        boolean zBooleanValue4;
        Boolean boolLIZ4;
        boolean zBooleanValue5;
        Boolean boolLIZ5;
        String string4;
        boolean zBooleanValue6;
        Boolean boolLIZ6;
        boolean zBooleanValue7;
        Boolean boolLIZ7;
        boolean zBooleanValue8;
        Boolean boolLIZ8;
        boolean zBooleanValue9;
        Boolean boolLIZ9;
        String string5;
        boolean zBooleanValue10;
        Boolean boolLIZ10;
        boolean zBooleanValue11;
        Boolean boolLIZ11;
        String str;
        String secUid;
        User user;
        User user2;
        String string6;
        int i;
        boolean zBooleanValue12;
        Boolean boolLIZ12;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("sec_anchor_id")) == null) {
            string = "";
        }
        C504510JqT c504510JqTRR4 = RR();
        Object parent2 = null;
        if (c504510JqTRR4 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (boolLIZ12 = C512300K7g.LIZ(arguments2, "hide_header", null)) != null) {
                zBooleanValue12 = boolLIZ12.booleanValue();
            } else {
                zBooleanValue12 = false;
            }
            c504510JqTRR4.LLJJI = zBooleanValue12;
        }
        if (this.LLILLL == 0) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i = arguments3.getInt("container_id");
            } else {
                i = 0;
            }
            this.LLILLL = i;
        }
        if (this.LLILLJJLI.length() == 0) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string6 = arguments4.getString("enter_from")) == null) {
                string6 = "";
            }
            this.LLILLJJLI = string6;
        }
        C504510JqT c504510JqTRR5 = RR();
        if (c504510JqTRR5 != null) {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser instanceof User) {
                user2 = (User) currentUser;
            } else {
                user2 = null;
            }
            c504510JqTRR5.LLILLJJLI = user2;
        }
        C504510JqT c504510JqTRR6 = RR();
        if (c504510JqTRR6 != null) {
            c504510JqTRR6.LLILZ = string;
        }
        C504510JqT c504510JqTRR7 = RR();
        if (c504510JqTRR7 != null) {
            C504510JqT c504510JqTRR8 = RR();
            if (c504510JqTRR8 != null) {
                str = c504510JqTRR8.LLILZ;
            } else {
                str = null;
            }
            C504510JqT c504510JqTRR9 = RR();
            if (c504510JqTRR9 != null && (user = c504510JqTRR9.LLILLJJLI) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c504510JqTRR7.LLJ = Intrinsics.LJFF(str, secUid);
        }
        C504510JqT c504510JqTRR10 = RR();
        if (c504510JqTRR10 != null) {
            c504510JqTRR10.LLILZIL = false;
        }
        C504510JqT c504510JqTRR11 = RR();
        if (c504510JqTRR11 != null) {
            c504510JqTRR11.LLJI = this.LLILLL;
        }
        C504510JqT c504510JqTRR12 = RR();
        if (c504510JqTRR12 != null) {
            c504510JqTRR12.LLJIJIL = this.LLILLJJLI;
        }
        C504510JqT c504510JqTRR13 = RR();
        if (c504510JqTRR13 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (boolLIZ11 = C512300K7g.LIZ(arguments5, "preview_mode", null)) != null) {
                zBooleanValue11 = boolLIZ11.booleanValue();
            } else {
                zBooleanValue11 = false;
            }
            c504510JqTRR13.LLJILLL = zBooleanValue11;
        }
        C504510JqT c504510JqTRR14 = RR();
        if (c504510JqTRR14 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (boolLIZ10 = C512300K7g.LIZ(arguments6, "use_mock_data", null)) != null) {
                zBooleanValue10 = boolLIZ10.booleanValue();
            } else {
                zBooleanValue10 = false;
            }
            c504510JqTRR14.LLJJ = zBooleanValue10;
        }
        C504510JqT c504510JqTRR15 = RR();
        if (c504510JqTRR15 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string5 = arguments7.getString("last_enter_from")) == null) {
                string5 = "";
            }
            c504510JqTRR15.LLJILJIL = string5;
        }
        C504510JqT c504510JqTRR16 = RR();
        if (c504510JqTRR16 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (boolLIZ9 = C512300K7g.LIZ(arguments8, "disable_swipe_refresh", null)) != null) {
                zBooleanValue9 = boolLIZ9.booleanValue();
            } else {
                zBooleanValue9 = false;
            }
            c504510JqTRR16.LLJJIJI = zBooleanValue9;
        }
        C504510JqT c504510JqTRR17 = RR();
        if (c504510JqTRR17 != null) {
            Bundle arguments9 = getArguments();
            if (arguments9 != null && (boolLIZ8 = C512300K7g.LIZ(arguments9, "hide_indicator", null)) != null) {
                zBooleanValue8 = boolLIZ8.booleanValue();
            } else {
                zBooleanValue8 = false;
            }
            c504510JqTRR17.LLJJIJIIJIL = zBooleanValue8;
        }
        C504510JqT c504510JqTRR18 = RR();
        if (c504510JqTRR18 != null) {
            Bundle arguments10 = getArguments();
            if (arguments10 != null && (boolLIZ7 = C512300K7g.LIZ(arguments10, "hide_bottom_post", null)) != null) {
                zBooleanValue7 = boolLIZ7.booleanValue();
            } else {
                zBooleanValue7 = false;
            }
            c504510JqTRR18.LLJJIJIL = zBooleanValue7;
        }
        C504510JqT c504510JqTRR19 = RR();
        if (c504510JqTRR19 != null) {
            Bundle arguments11 = getArguments();
            if (arguments11 != null && (boolLIZ6 = C512300K7g.LIZ(arguments11, "hide_title", null)) != null) {
                zBooleanValue6 = boolLIZ6.booleanValue();
            } else {
                zBooleanValue6 = false;
            }
            c504510JqTRR19.LLJJJ = zBooleanValue6;
        }
        C504510JqT c504510JqTRR20 = RR();
        if (c504510JqTRR20 != null) {
            Bundle arguments12 = getArguments();
            if (arguments12 == null || (string4 = arguments12.getString("package_id")) == null) {
                string4 = "";
            }
            c504510JqTRR20.LLJJJJJIL = string4;
        }
        C504510JqT c504510JqTRR21 = RR();
        if (c504510JqTRR21 != null) {
            Bundle arguments13 = getArguments();
            if (arguments13 != null && (boolLIZ5 = C512300K7g.LIZ(arguments13, "hide_top_setting", null)) != null) {
                zBooleanValue5 = boolLIZ5.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            c504510JqTRR21.LLJJJJ = zBooleanValue5;
        }
        C504510JqT c504510JqTRR22 = RR();
        if (c504510JqTRR22 != null) {
            Bundle arguments14 = getArguments();
            if (arguments14 != null && (boolLIZ4 = C512300K7g.LIZ(arguments14, "force_show_native_title_bar", null)) != null) {
                zBooleanValue4 = boolLIZ4.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            c504510JqTRR22.LLJJJIL = zBooleanValue4;
        }
        C504510JqT c504510JqTRR23 = RR();
        if (c504510JqTRR23 != null) {
            Bundle arguments15 = getArguments();
            if (arguments15 != null && (boolLIZ3 = C512300K7g.LIZ(arguments15, "ban_package_show", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c504510JqTRR23.LLJJJJLIIL = zBooleanValue3;
        }
        C504510JqT c504510JqTRR24 = RR();
        if (c504510JqTRR24 != null) {
            Bundle arguments16 = getArguments();
            if (arguments16 == null || (string3 = arguments16.getString("preview_title")) == null) {
                string3 = "";
            }
            c504510JqTRR24.LLJJL = string3;
        }
        C504510JqT c504510JqTRR25 = RR();
        if (c504510JqTRR25 != null) {
            Bundle arguments17 = getArguments();
            if (arguments17 != null && (boolLIZ2 = C512300K7g.LIZ(arguments17, "is_full_screen", Boolean.TRUE)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
            c504510JqTRR25.LLJJIII = !zBooleanValue2;
        }
        C504510JqT c504510JqTRR26 = RR();
        if (c504510JqTRR26 != null) {
            Bundle arguments18 = getArguments();
            if (arguments18 != null && (string2 = arguments18.getString("page_source")) != null) {
                str2 = string2;
            }
            c504510JqTRR26.LLJJLIIIJLLLLLLLZ = str2;
        }
        C504510JqT c504510JqTRR27 = RR();
        if (c504510JqTRR27 != null) {
            Bundle arguments19 = getArguments();
            if (arguments19 != null && (boolLIZ = C512300K7g.LIZ(arguments19, "is_super_fans", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c504510JqTRR27.LLJLILLLLZIIL = zBooleanValue;
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
        subSpaceFeedVMSR2.LLILZIL = new C503760JpG(subSpaceFeedVMSR2, subSpaceFeedVMSR2.vQ2());
        if (!SR().zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        getLifecycle().addObserver(new SubscriptionSuspensionLifecycleObserver(new C495510Jbx(this)));
        if (!SR().zQ2() || ((c504510JqTRR3 = RR()) != null && c504510JqTRR3.LLJJIJIL)) {
            View viewFindViewById4 = this.LLILZLL;
            if (viewFindViewById4 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById4 = view2.findViewById(R.id.p7e);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZLL = (RelativeLayout) viewFindViewById4;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById4, 8);
        } else {
            View viewFindViewById5 = this.LLILZLL;
            if (viewFindViewById5 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById5 = view3.findViewById(R.id.p7e);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZLL = (RelativeLayout) viewFindViewById5;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById5, 0);
            C723850SaN.LIZ(this, false, null, new C1161904gb(this), 3);
        }
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.wg0);
        } else {
            viewFindViewById = null;
        }
        this.LLJ = viewFindViewById;
        C504510JqT c504510JqTRR28 = RR();
        if (c504510JqTRR28 == null || !c504510JqTRR28.LLJJJ || ((c504510JqTRR2 = RR()) != null && c504510JqTRR2.LLJJJIL)) {
            View view5 = this.LLJ;
            if (view5 != null) {
                C723850SaN.LIZ(this, false, null, new C504620Jqe(this, view5), 3);
            }
        } else {
            View view6 = this.LLJ;
            if (view6 != null) {
                C500260Jjc.LJIILIIL(view6);
            }
        }
        C723850SaN.LIZ(this, false, null, new C1143804dg(this), 3);
        C504510JqT c504510JqTRR29 = RR();
        if (c504510JqTRR29 != null && c504510JqTRR29.LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((c504510JqTRR = RR()) == null || !c504510JqTRR.LLJJJ)) {
            View viewFindViewById6 = view.findViewById(R.id.bn2);
            if (viewFindViewById6 != null) {
                parent = viewFindViewById6.getParent();
            } else {
                parent = null;
            }
            if ((((parent instanceof View) && (viewFindViewById3 = (View) parent) != null) || (viewFindViewById3 = view.findViewById(R.id.wg0)) != null) && !this.LLJI) {
                int iLJIJ = C497740JfY.LJIJ();
                if (iLJIJ <= 0) {
                    this.LLJI = true;
                } else {
                    viewFindViewById3.setPadding(viewFindViewById3.getPaddingLeft(), viewFindViewById3.getPaddingTop() + iLJIJ, viewFindViewById3.getPaddingRight(), viewFindViewById3.getPaddingBottom());
                    this.LLJI = true;
                }
            }
        }
        C504510JqT c504510JqTRR30 = RR();
        if (c504510JqTRR30 != null && c504510JqTRR30.LLJJIII) {
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
        final int paddingBottom3 = view.getPaddingBottom();
        if (viewFindViewById8 != null) {
            paddingBottom = viewFindViewById8.getPaddingBottom();
        } else {
            paddingBottom = 0;
        }
        if (viewFindViewById9 != null) {
            paddingBottom2 = viewFindViewById9.getPaddingBottom();
        } else {
            paddingBottom2 = 0;
        }
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0JqV
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view7, C20246014Ju c20246014Ju) {
                C504510JqT c504510JqTRR31;
                C504510JqT c504510JqTRR32;
                C20246014Ju c20246014JuLIZ;
                C20244914Jj c20244914JjLIZ;
                C20246014Ju c20246014JuLIZ2;
                C20244914Jj c20244914JjLIZ2;
                C20244914Jj c20244914JjLIZ3 = c20246014Ju.LIZ(7);
                int iLJIJ2 = c20244914JjLIZ3.LIZIZ;
                if (iLJIJ2 <= 0 && ((c20246014JuLIZ2 = C14K4.LIZ(view)) == null || (c20244914JjLIZ2 = c20246014JuLIZ2.LIZ(1)) == null || (iLJIJ2 = c20244914JjLIZ2.LIZIZ) <= 0)) {
                    iLJIJ2 = C497740JfY.LJIJ();
                }
                int iLIZ = c20244914JjLIZ3.LIZLLL;
                if (iLIZ <= 0 && ((c20246014JuLIZ = C14K4.LIZ(view)) == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) == null || (iLIZ = c20244914JjLIZ.LIZLLL) <= 0)) {
                    iLIZ = C2084308En.LIZ(view.getContext());
                }
                if (viewFindViewById2 == null || ((c504510JqTRR32 = this.RR()) != null && c504510JqTRR32.LLJJJ)) {
                    View view8 = view;
                    view8.setPadding(view8.getPaddingLeft(), paddingTop + iLJIJ2, view8.getPaddingRight(), view8.getPaddingBottom());
                } else {
                    View view9 = view;
                    view9.setPadding(view9.getPaddingLeft(), paddingTop, view9.getPaddingRight(), view9.getPaddingBottom());
                }
                View view10 = viewFindViewById8;
                if (view10 == null || view10.getVisibility() != 0 || ((c504510JqTRR31 = this.RR()) != null && c504510JqTRR31.LLJJIJIL)) {
                    View view11 = viewFindViewById9;
                    if (view11 != null) {
                        view11.setPadding(view11.getPaddingLeft(), view11.getPaddingTop(), view11.getPaddingRight(), paddingBottom2 + iLIZ);
                        View view12 = view;
                        view12.setPadding(view12.getPaddingLeft(), view12.getPaddingTop(), view12.getPaddingRight(), paddingBottom3);
                    } else {
                        View view13 = view;
                        view13.setPadding(view13.getPaddingLeft(), view13.getPaddingTop(), view13.getPaddingRight(), paddingBottom3 + iLIZ);
                        return c20246014Ju;
                    }
                } else {
                    View view14 = viewFindViewById8;
                    view14.setPadding(view14.getPaddingLeft(), view14.getPaddingTop(), view14.getPaddingRight(), paddingBottom + iLIZ);
                    View view15 = view;
                    view15.setPadding(view15.getPaddingLeft(), view15.getPaddingTop(), view15.getPaddingRight(), paddingBottom3);
                    View view16 = viewFindViewById9;
                    if (view16 != null) {
                        view16.setPadding(view16.getPaddingLeft(), view16.getPaddingTop(), view16.getPaddingRight(), paddingBottom2);
                        return c20246014Ju;
                    }
                }
                return c20246014Ju;
            }
        });
        if (!view.isAttachedToWindow()) {
            return;
        }
        C20097313kJ.LIZJ(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gln, viewGroup, false);
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
