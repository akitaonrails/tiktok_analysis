package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0K3G;
import X.C0K3S;
import X.C0K4B;
import X.C0K4R;
import X.C0K51;
import X.C0QSJ;
import X.C0TVI;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C15WP;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2217381BqS;
import X.C292701Bl;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C512310K7h;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailFragment extends SubSpaceBaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final C0K4R LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzHELIOSZiOjoxOzUtKip9LCA4KCY/ZjMlLDh9LjctLiI2JjFiGjoxGzUtKioXLTEtICMVOiQrJCo9PA==";
    public final AssemVMLazy LLIZ;
    public C0K3S LLIZLLLIL;
    public User LLJ;
    public SpacePost LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K4R] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0K4R
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SubSpaceDetailFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubSpaceDetailFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubSpaceDetailFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public SubSpaceDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 481);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(218);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 482), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 483), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 484), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    public final C0K3S RR() {
        if (this.LLIZLLLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0K3S.class, null);
            this.LLIZLLLIL = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0K3S(), C0K3S.class, "source_default_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        SpacePost spacePost;
        super.onSaveInstanceState(bundle);
        C0K3S c0k3sRR = RR();
        if ((c0k3sRR != null && (spacePost = c0k3sRR.LLILLL) != null) || (spacePost = this.LLJI) != null) {
            try {
                C786410Ut5.LJJJI("pgc_sub_space_detail_post_json", C292701Bl.LIZ().LJIILL(spacePost), bundle);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        long j;
        String string2;
        String string3;
        int i;
        com.ss.android.ugc.aweme.profile.model.User currentUser;
        String string4;
        String string5;
        int i2;
        C0K3S c0k3sRR;
        View viewFindViewById;
        View viewFindViewById2;
        String str;
        boolean z;
        String str2;
        String str3;
        String secUid;
        User user;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String secUid2;
        com.ss.android.ugc.aweme.profile.model.User currentUser2;
        String string6;
        Object c098200Yq;
        super.onViewCreated(view, bundle);
        if (bundle != null && (string6 = bundle.getString("pgc_sub_space_detail_post_json")) != null && string6.length() != 0) {
            try {
                c098200Yq = (SpacePost) C292701Bl.LIZ().LJII(string6, SpacePost.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            SpacePost spacePost = (SpacePost) c098200Yq;
            if (spacePost != null) {
                this.LLJI = spacePost;
                C0K3S c0k3sRR2 = RR();
                if (c0k3sRR2 != null) {
                    c0k3sRR2.LLILLL = spacePost;
                }
                C0K3S c0k3sRR3 = RR();
                if (c0k3sRR3 != null) {
                    c0k3sRR3.LLILZ = spacePost.postId;
                }
            }
        }
        String str4 = "";
        long j2 = 0;
        if (this.LLJI != null && this.LLJ != null) {
            C0K3S c0k3sRR4 = RR();
            if (c0k3sRR4 != null) {
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService != null) {
                    currentUser2 = iUserService.getCurrentUser();
                } else {
                    currentUser2 = null;
                }
                c0k3sRR4.LLJ = C15WP.LJ(currentUser2);
            }
            C0K3S c0k3sRR5 = RR();
            if (c0k3sRR5 != null) {
                c0k3sRR5.LLJI = this.LLJ;
            }
            C0K3S c0k3sRR6 = RR();
            if (c0k3sRR6 != null) {
                User user2 = this.LLJ;
                if (user2 != null) {
                    secUid2 = user2.getSecUid();
                } else {
                    secUid2 = null;
                }
                c0k3sRR6.LLJIJIL = secUid2;
            }
            C0K3S c0k3sRR7 = RR();
            if (c0k3sRR7 != null) {
                SpacePost spacePost2 = this.LLJI;
                if (spacePost2 != null) {
                    j2 = spacePost2.postId;
                }
                c0k3sRR7.LLILZ = j2;
            }
            C0K3S c0k3sRR8 = RR();
            if (c0k3sRR8 != null) {
                c0k3sRR8.LLILLL = this.LLJI;
            }
        } else {
            if (this.LLILZ == 0) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    i2 = arguments.getInt("container_id");
                } else {
                    i2 = 0;
                }
                this.LLILZ = i2;
            }
            if (this.LLILLL.length() == 0) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string5 = arguments2.getString("enter_from")) == null) {
                    string5 = "";
                }
                this.LLILLL = string5;
            }
            C0K3S c0k3sRR9 = RR();
            if (c0k3sRR9 != null) {
                c0k3sRR9.LLIZ = Boolean.TRUE;
            }
            C0K3S c0k3sRR10 = RR();
            if (c0k3sRR10 != null) {
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (string4 = arguments3.getString("sec_anchor_id")) == null) {
                    string4 = "";
                }
                c0k3sRR10.LLJIJIL = string4;
            }
            C0K3S c0k3sRR11 = RR();
            if (c0k3sRR11 != null) {
                IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService2 != null) {
                    currentUser = iUserService2.getCurrentUser();
                } else {
                    currentUser = null;
                }
                c0k3sRR11.LLJ = C15WP.LJ(currentUser);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string = arguments4.getString("post_id");
            } else {
                string = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sRR12 = RR();
                    if (c0k3sRR12 != null) {
                        if (string == null) {
                            j = 0;
                        } else {
                            j = CastLongProtector.parseLong(string);
                        }
                        c0k3sRR12.LLILZ = j;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string2 = arguments5.getString("comment_id");
            } else {
                string2 = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sRR13 = RR();
                    if (c0k3sRR13 != null) {
                        if (string2 != null) {
                            j2 = CastLongProtector.parseLong(string2);
                        }
                        c0k3sRR13.LLILZIL = j2;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                string3 = arguments6.getString("comment_type");
            } else {
                string3 = null;
            }
            if (C0K51.LJ(string)) {
                try {
                    C0K3S c0k3sRR14 = RR();
                    if (c0k3sRR14 != null) {
                        if (string3 == null) {
                            i = 0;
                        } else {
                            i = CastIntegerProtector.parseInt(string3);
                        }
                        c0k3sRR14.LLILZLL = i;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        C0K3S c0k3sRR15 = RR();
        if (c0k3sRR15 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (boolLIZ = C512310K7h.LIZ(arguments7, "hide_banner", Boolean.FALSE)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c0k3sRR15.LLJJIJIL = zBooleanValue;
        }
        C0K3S c0k3sRR16 = RR();
        if (c0k3sRR16 != null) {
            C0K3S c0k3sRR17 = RR();
            if (c0k3sRR17 != null) {
                str3 = c0k3sRR17.LLJIJIL;
            } else {
                str3 = null;
            }
            C0K3S c0k3sRR18 = RR();
            if (c0k3sRR18 != null && (user = c0k3sRR18.LLJ) != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            c0k3sRR16.LLJJIII = Intrinsics.LJFF(str3, secUid);
        }
        C0K3S c0k3sRR19 = RR();
        if (c0k3sRR19 != null) {
            c0k3sRR19.LLJJIJI = this.LLILZ;
        }
        C0K3S c0k3sRR20 = RR();
        if (c0k3sRR20 != null) {
            c0k3sRR20.LLILLJJLI = this.LLILLL;
        }
        C0K3S c0k3sRR21 = RR();
        if (c0k3sRR21 != null) {
            c0k3sRR21.LLJILJIL = false;
        }
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) assemVMLazy.getValue();
        subSpaceDetailVM.LL = C1558360qeg.LJFF(this, null);
        subSpaceDetailVM.LLILLL = new C0K3G(subSpaceDetailVM, subSpaceDetailVM.xQ2());
        C0K3S c0k3sRR22 = RR();
        if (c0k3sRR22 != null) {
            c0k3sRR22.LL = getContext();
        }
        C19EG activity = getActivity();
        if (activity != null && ((SubscriptionBridgeViewModel) new ViewModelProvider(activity).get(SubscriptionBridgeViewModel.class)).LLILLJJLI.getValue() == null) {
            C0K3S c0k3sRR23 = RR();
            if (c0k3sRR23 == null || (str = c0k3sRR23.LLJIJIL) == null) {
                str = "";
            }
            if (c0k3sRR23 != null && (str2 = c0k3sRR23.LLILLJJLI) != null) {
                str4 = str2;
            }
            if (c0k3sRR23 != null && c0k3sRR23.LLJILJIL) {
                z = true;
            } else {
                z = false;
            }
            C0K4B.LIZIZ(new SubscriptionSceneContext(0L, 0L, str, null, null, str4, null, null, z, false, null, false, null, 0L, 0L, null, null, false, null, null, 1048283));
        }
        if (!((SubSpaceDetailVM) this.LLIZ.getValue()).BQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 354), 3);
        View view2 = getView();
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.wg0)) != null) {
            C723850SaN.LIZ(this, false, null, new AwS373S0200000_7(this, viewFindViewById2, 40), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 353), 3);
        C0K3S c0k3sRR24 = RR();
        if (c0k3sRR24 != null && Intrinsics.LJFF(c0k3sRR24.LLIZ, Boolean.TRUE) && ((c0k3sRR = RR()) == null || !c0k3sRR.LLJJIJIL)) {
            View view3 = getView();
            if (view3 != null && (viewFindViewById = view3.findViewById(R.id.bnp)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 411), 3);
        }
        final View viewFindViewById3 = view.findViewById(R.id.wgr);
        if (viewFindViewById3 != null) {
            final int paddingBottom = viewFindViewById3.getPaddingBottom();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DOq
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view4, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ;
                    int i3 = c20246014Ju.LIZ(2).LIZLLL;
                    if (i3 <= 0) {
                        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
                        if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) != null) {
                            i3 = c20244914JjLIZ.LIZLLL;
                        } else {
                            i3 = 0;
                        }
                    }
                    View view5 = viewFindViewById3;
                    view5.setPadding(view5.getPaddingLeft(), view5.getPaddingTop(), view5.getPaddingRight(), paddingBottom + i3);
                    return c20246014Ju;
                }
            });
            if (view.isAttachedToWindow()) {
                C20097313kJ.LIZJ(view);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ffh, viewGroup, false);
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
