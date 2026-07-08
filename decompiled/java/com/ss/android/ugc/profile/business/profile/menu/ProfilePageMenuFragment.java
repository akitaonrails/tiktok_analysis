package com.ss.android.ugc.profile.business.profile.menu;

import X.AbstractC19994813Le;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C0S4U;
import X.C0SXF;
import X.C1242680iRW;
import X.C1246850iYF;
import X.C1249240ic6;
import X.C1249710icr;
import X.C1250590ieH;
import X.C1250680ieQ;
import X.C1256610inz;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C13LZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1720106oR;
import X.C189200o6;
import X.C18IO;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C296200BjG;
import X.C452070Ho5;
import X.C452501pT;
import X.C639090P4x;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1249460icS;
import X.InterfaceC1385905bd;
import X.InterfaceC2027807wy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC596290Na7;
import Y.AObjectS71S0000000_19;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IActivityMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.root.ProfileMenuRootComponent;
import com.ss.android.ugc.profile.business.profile.menu.root.base.ProfileMenuRootBaseComponent;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS484S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfilePageMenuFragment extends CommonPageFragment implements InterfaceC1055110dYz, IPageMenuAbility, InterfaceC1385905bd, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9HELIOSODcjLyY/LWshLCEmZhU+Jik6JCAcKCg2BSAiPAkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2102));
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public final C01GW LLILZIL;
    public C1242680iRW LLILZLL;
    public List<? extends ProfileComponents> LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfilePageMenuFragment.class, "profilePageMenuViewModel", "getProfilePageMenuViewModel()Lcom/ss/android/ugc/profile/business/profile/menu/viewmodel/ProfileMenuViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "page_setting";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    public final ProfileMenuViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (ProfileMenuViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility
    public final Context ub1() {
        View view = this.LLILLL;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    public ProfilePageMenuFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileMenuViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 2103), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2104), AFwS257S0000000_19.get$arr$(351));
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2099));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2101));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2100));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ProfileMenuViewModel.class, new AObjectS71S0000000_19(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        IActivityMenuAbility iActivityMenuAbility;
        C19EG activity = getActivity();
        if (activity != null && !Hox.LLJILJIL.LIZ(activity).LQ2("page_setting")) {
            return false;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && (iActivityMenuAbility = (IActivityMenuAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity2, null), IActivityMenuAbility.class, null)) != null) {
            iActivityMenuAbility.at1("click_back_button");
        }
        C1249240ic6.LIZ.getClass();
        C1249240ic6.LIZLLL("click_back_button");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        HomePageViewPagerAbility homePageViewPagerAbilityLIZJ;
        super.onDestroy();
        ((InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class)).LIZ(this);
        C1249710icr c1249710icr = (C1249710icr) this.LL.getValue();
        if (c1249710icr != null) {
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c1249710icr.LIZ, null), MainActivityScope.class);
                Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class) : null;
                homePageViewPagerAbilityLIZJ = (HomePageViewPagerAbility) (ability instanceof HomePageViewPagerAbility ? ability : null);
            } else {
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c1249710icr.LIZ);
                if (mainActivityScopeLIZJ == null) {
                    return;
                } else {
                    homePageViewPagerAbilityLIZJ = C1256610inz.LIZJ(mainActivityScopeLIZJ);
                }
            }
            if (homePageViewPagerAbilityLIZJ != null) {
                homePageViewPagerAbilityLIZJ.yT(c1249710icr.LJI);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility
    public final ProfileMenuViewModel zn2() {
        return MR();
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility
    public final void KG1(List<? extends ProfileComponents> list) {
        if (!Intrinsics.LJFF(this.LLIZ, list)) {
            this.LLIZ = list;
            if (MR().getState().LLILLL) {
                NR(this.LLILLL, list);
                MR().vQ2(Collections.singletonList("CENTER"));
            } else {
                this.LLIZLLLIL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IPageMenuAbility.class, null, null);
        }
        boolean z = true;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO((Fragment) this, "a2270.b8727", false, z, z, (String) null, 100));
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        int i = C2187451AjH.LIZ;
        C1249710icr c1249710icr = (C1249710icr) this.LL.getValue();
        if (c1249710icr != null) {
            c1249710icr.LIZIZ(8);
        }
        MR().setState(new AwS24S0010000_9(false, 15));
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        if (iMinisApiService != null) {
            iMinisApiService.LJJIIJ();
        }
        List list = (List) this.LLJI.getValue();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((ContentCellProtocol) next).LLJLILLLLZIIL) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        C1242680iRW c1242680iRW = this.LLILZLL;
        if (c1242680iRW != null) {
            c1242680iRW.scrollTo(0, 0);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        int i = C2187451AjH.LIZ;
        C1249710icr c1249710icr = (C1249710icr) this.LL.getValue();
        if (c1249710icr != null) {
            View viewLIZ = c1249710icr.LIZ();
            if (viewLIZ != null) {
                C786410Ut5.I7(c1249710icr.LJFF, viewLIZ);
            }
            c1249710icr.LIZIZ(0);
        }
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            NR(this.LLILLL, this.LLIZ);
        }
        MR().setState(new AwS24S0010000_9(true, 15));
        MR().setState(AFwS240S0000000_9.get$arr$(818));
    }

    public final void NR(View view, List list) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (isAdded() && !isDetached()) {
            AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
            if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if (abstractC738140SxQ instanceof ProfileMenuRootComponent) {
                        ProfileMenuRootBaseComponent profileMenuRootBaseComponent = (ProfileMenuRootBaseComponent) abstractC738140SxQ;
                        profileMenuRootBaseComponent.LLJJIJI = list;
                        C1250680ieQ.LIZ.getClass();
                        if (C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, 10)) <= 0) {
                            ((LinkedHashMap) C1250680ieQ.LJI).clear();
                        }
                        profileMenuRootBaseComponent.No();
                        return;
                    }
                }
            }
            C723850SaN.LIZ(this, false, null, new AwS228S0300000_19(this, (ProfilePageMenuFragment) list, (List<? extends ProfileComponents>) view, (View) 0), 3);
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("ProfilePageMenuFragment", "updatePageComponentTree not attach");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.0icT] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<? extends ProfileComponents> list;
        ProfileComponents next;
        List<? extends ProfileComponents> list2;
        ProfileComponents next2;
        List<? extends ProfileComponents> list3;
        ProfileComponents next3;
        ProfileComponents profileComponentsXH;
        HomePageViewPagerAbility homePageViewPagerAbilityLIZJ;
        Object ability;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.w0u);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = C0SXF.LJIIZILJ(getActivity());
        }
        C1249710icr c1249710icr = (C1249710icr) this.LL.getValue();
        List<? extends ProfileComponents> list4 = null;
        boolean z = false;
        if (c1249710icr != null) {
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c1249710icr.LIZ, null), MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(HomePageViewPagerAbility.class);
                } else {
                    ability = null;
                }
                if (!(ability instanceof HomePageViewPagerAbility)) {
                    ability = null;
                }
                homePageViewPagerAbilityLIZJ = (HomePageViewPagerAbility) ability;
            } else {
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c1249710icr.LIZ);
                if (mainActivityScopeLIZJ != null) {
                    homePageViewPagerAbilityLIZJ = C1256610inz.LIZJ(mainActivityScopeLIZJ);
                }
            }
            if (homePageViewPagerAbilityLIZJ != null) {
                homePageViewPagerAbilityLIZJ.Jk1(c1249710icr.LJI);
            }
        }
        IMenuAbility iMenuAbility = (IMenuAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IMenuAbility.class, null);
        if (iMenuAbility != null && (profileComponentsXH = iMenuAbility.XH()) != null) {
            list = profileComponentsXH.components;
        } else {
            list = null;
        }
        this.LLIZ = list;
        if (list != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.componentId, "content_section")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfilePageMenuFragment", "initData. not find content_section data, use default data");
            ProfileComponents profileComponents = ((ProfileUser) C1250590ieH.LIZIZ.getValue()).navBarComponents;
            if (profileComponents != null && (list2 = profileComponents.components) != null) {
                Iterator<? extends ProfileComponents> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.componentName, "nav_bar_end")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ProfileComponents profileComponents2 = next2;
                if (profileComponents2 != null && (list3 = profileComponents2.components) != null) {
                    Iterator<? extends ProfileComponents> it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            if (Intrinsics.LJFF(next3.componentName, "nav_bar_end_settings")) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    ProfileComponents profileComponents3 = next3;
                    if (profileComponents3 != null) {
                        list4 = profileComponents3.components;
                    }
                }
            }
            this.LLIZ = list4;
        }
        NR(this.LLILLL, this.LLIZ);
        List<? extends ProfileComponents> list5 = this.LLIZ;
        if (list5 != null) {
            Iterator<? extends ProfileComponents> it5 = list5.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                ProfileComponents next4 = it5.next();
                if (Intrinsics.LJFF(next4.componentId, "search_section")) {
                    if (next4 != null) {
                        z = true;
                    }
                }
            }
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfilePageMenuFragment", "initData. searchEnabled: " + z);
        if (z) {
            final ProfileMenuViewModel profileMenuViewModelMR = MR();
            final ?? r2 = new InterfaceC1249460icS() { // from class: X.0icT
                @Override // X.InterfaceC1249460icS
                public final List<ProfileComponents> LIZ() {
                    return this.LIZ.LLIZ;
                }

                @Override // X.InterfaceC1249460icS
                public final List<ContentCellProtocol> xp() {
                    return (List) this.LIZ.LLJI.getValue();
                }
            };
            ((ArrayList) profileMenuViewModelMR.LLILLJJLI).add(new InterfaceC596290Na7() { // from class: X.1A0p
                public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

                @Override // X.InterfaceC596290Na7
                public final String LIZ() {
                    return "SETTINGS";
                }

                static {
                    C2217401BqU c2217401BqU = new C2217401BqU(C2172491A0p.class, "topGroupVM", "<v#0>", 0);
                    C09R3 c09r3 = C13LE.LIZ;
                    c09r3.getClass();
                    C2217401BqU c2217401BqU2 = new C2217401BqU(C2172491A0p.class, "accountGroupVM", "<v#1>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU3 = new C2217401BqU(C2172491A0p.class, "visibilityGroupVM", "<v#2>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU4 = new C2217401BqU(C2172491A0p.class, "interactionsGroupVM", "<v#3>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU5 = new C2217401BqU(C2172491A0p.class, "contentGroupVM", "<v#4>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU6 = new C2217401BqU(C2172491A0p.class, "cacheGroupVM", "<v#5>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU7 = new C2217401BqU(C2172491A0p.class, "supportGroupVM", "<v#6>", 0);
                    c09r3.getClass();
                    C2217401BqU c2217401BqU8 = new C2217401BqU(C2172491A0p.class, "loginGroupVM", "<v#7>", 0);
                    c09r3.getClass();
                    LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7, c2217401BqU8};
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x034c  */
                @Override // X.InterfaceC596290Na7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.List<X.C1249580ice> LIZIZ() {
                    /*
                        Method dump skipped, instruction units count: 928
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2172491A0p.LIZIZ():java.util.List");
                }
            });
            ((ArrayList) profileMenuViewModelMR.LLILLJJLI).add(new InterfaceC596290Na7() { // from class: X.0icQ
                @Override // X.InterfaceC596290Na7
                public final String LIZ() {
                    return "CENTER";
                }

                @Override // X.InterfaceC596290Na7
                public final List<C1249580ice> LIZIZ() {
                    ProfileComponents next5;
                    List<? extends ProfileComponents> list6;
                    ArrayList arrayList = new ArrayList();
                    if (!this.isAdded() || this.isDetached() || this.getView() == null) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getSearchableMenus, the fragment is not added, source:");
                        sbLIZ.append("CENTER");
                        C1720106oR.LIZ("ProfileMenuViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        return arrayList;
                    }
                    List<ProfileComponents> listLIZ = r2.LIZ();
                    if (listLIZ == null) {
                        listLIZ = C13BV.INSTANCE;
                    }
                    Iterator<ProfileComponents> it6 = listLIZ.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it6.next();
                        if (Intrinsics.LJFF(next5.componentName, "content_section")) {
                            break;
                        }
                    }
                    ProfileComponents profileComponents4 = next5;
                    if (profileComponents4 != null && (list6 = profileComponents4.components) != null) {
                        Iterator<? extends ProfileComponents> it7 = list6.iterator();
                        while (it7.hasNext()) {
                            LIZJ(it7.next(), arrayList, null);
                        }
                    }
                    return arrayList;
                }

                public final void LIZJ(ProfileComponents profileComponents4, List<C1249580ice> list6, String str) {
                    Describe describe;
                    String text;
                    int length;
                    Describe describe2;
                    String text2;
                    String str2 = profileComponents4.componentId;
                    if (str2 != null) {
                        int iHashCode = str2.hashCode();
                        String str3 = "";
                        if (iHashCode != -1506094012) {
                            if (iHashCode != 1405293947) {
                                if (iHashCode == 2120422077 && str2.equals("content_section_cell_list_base_item")) {
                                    C1248250iaV.LIZ.getClass();
                                    BizBaseData bizBaseDataLIZ = C1248250iaV.LIZ(profileComponents4);
                                    if (bizBaseDataLIZ != null && (describe2 = bizBaseDataLIZ.getDescribe()) != null && (text2 = describe2.getText()) != null) {
                                        str3 = text2;
                                    }
                                    List<? extends ProfileComponents> list7 = profileComponents4.components;
                                    if (list7 != null) {
                                        Iterator<? extends ProfileComponents> it6 = list7.iterator();
                                        while (it6.hasNext()) {
                                            LIZJ(it6.next(), list6, str3);
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (!str2.equals("content_section_cell_rich_base_item")) {
                                return;
                            }
                        } else if (!str2.equals("content_section_cell_base_item")) {
                            return;
                        }
                        C1248250iaV.LIZ.getClass();
                        BizBaseData bizBaseDataLIZ2 = C1248250iaV.LIZ(profileComponents4);
                        String string = profileComponents4.componentName;
                        int iIntValue = 0;
                        if (string == null || (u.LJJIIJZLJL(string, "content_section_cell_", false) && 21 < (length = string.length()) && (string = string.subSequence(21, length).toString()) == null)) {
                            string = "";
                        }
                        if (bizBaseDataLIZ2 != null && (describe = bizBaseDataLIZ2.getDescribe()) != null && (text = describe.getText()) != null) {
                            str3 = text;
                        } else {
                            if (bizBaseDataLIZ2 != null) {
                            }
                            ((ArrayList) list6).add(new C1249580ice(string, str3, Integer.valueOf(iIntValue), new AwS484S0200000_19(r2, profileComponents4, 6), str, EnumC1249450icR.CENTER.getPriority(), "CENTER", profileComponents4.eventParams, 257));
                        }
                        Integer numLIZIZ = C1248250iaV.LIZIZ(bizBaseDataLIZ2, this.requireContext(), profileComponents4.componentId);
                        if (numLIZIZ != null) {
                            iIntValue = numLIZIZ.intValue();
                        }
                        ((ArrayList) list6).add(new C1249580ice(string, str3, Integer.valueOf(iIntValue), new AwS484S0200000_19(r2, profileComponents4, 6), str, EnumC1249450icR.CENTER.getPriority(), "CENTER", profileComponents4.eventParams, 257));
                    }
                }
            });
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).orderCenterService().LJ().LIZJ(new InterfaceC2027807wy() { // from class: X.0Na5
                public boolean LIZ;

                @Override // X.InterfaceC2027807wy
                public final void LIZ(String str, String str2, String str3, String str4, boolean z2) {
                    if (z2 == this.LIZ) {
                        return;
                    }
                    this.LIZ = z2;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C596260Na4(profileMenuViewModelMR, null), 3);
                }
            });
        }
        ((InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class)).LIZJ(this);
        C1906580ziK.LIZJ().LIZJ().LJLLLL(getLifecycle(), new AfS182S0100000_13(this, 1));
        C1242680iRW c1242680iRW = this.LLILZLL;
        if (c1242680iRW != null) {
            c1242680iRW.setOnScrollChangedListener(new C639090P4x(this, 1));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1242680iRW c1242680iRW;
        Integer numLIZJ;
        int iIntValue = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ehu, viewGroup, false);
        this.LLILLL = viewTd;
        C19GS c19gs = null;
        if (viewTd != null) {
            c1242680iRW = (C1242680iRW) viewTd.findViewById(R.id.s2b);
        } else {
            c1242680iRW = null;
        }
        this.LLILZLL = c1242680iRW;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        View view = this.LLILLL;
        if (view != null) {
            view.setBackgroundColor(iIntValue);
        }
        C1246850iYF.LIZ.getClass();
        View view2 = this.LLILLL;
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        if (view2 != null) {
            try {
                ViewTreeLifecycleOwner.set(view2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view2, this);
                view2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view2;
    }
}
