package com.ss.android.ugc.profile.platform.business.tabs.container;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0BI9;
import X.C0HZJ;
import X.C0XQ7;
import X.C117P;
import X.C1249040ibm;
import X.C1249090ibr;
import X.C1250680ieQ;
import X.C1251330ifT;
import X.C1252230igv;
import X.C1252710ihh;
import X.C1254120ijy;
import X.C1257230ioz;
import X.C1257410ipH;
import X.C1257490ipP;
import X.C1258310iqj;
import X.C1259360isQ;
import X.C1259780it6;
import X.C1259870itF;
import X.C128Y;
import X.C1358700lSe;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C14LC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15O7;
import X.C1720106oR;
import X.C19EG;
import X.C1EDI;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2532609wC;
import X.C296260BjM;
import X.C299970BpL;
import X.C300140Bpc;
import X.C309690CBz;
import X.C452501pT;
import X.C517240KQg;
import X.C563290M7j;
import X.C666390QBx;
import X.C712300Rwq;
import X.C723580SZw;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737030Svd;
import X.C746350TPl;
import X.C786410Ut5;
import X.InterfaceC1248970ibf;
import X.InterfaceC1249800id0;
import X.InterfaceC1252070igf;
import X.InterfaceC1257400ipG;
import X.InterfaceC1257670iph;
import X.InterfaceC1257980iqC;
import X.InterfaceC563350M7p;
import X.InterfaceC737090Svj;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.business.feed.CollectProfileListFragment;
import com.ss.android.ugc.profile.business.message.fragment.StickerStoreProfileListFragment;
import com.ss.android.ugc.profile.business.profile.edit.pop.ProfileEditBottomBannerImpl;
import com.ss.android.ugc.profile.business.profile.tab.ProfileLikesAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class MineAwemePagerAssem extends AwemePagerAssem implements InterfaceC1249800id0, InterfaceC1248970ibf {
    public static final C1257490ipP LLLLLZL = new Object() { // from class: X.0ipP
    };
    public static final int LLLLZ = 8;
    public boolean LLLLII;
    public InterfaceC1257400ipG LLLLIIL;
    public ProfileLikesAwemeListFragment LLLLIILL;
    public ProfileBaseAwemeListFragment LLLLIILLL;
    public ProfileListFragment LLLLIL;
    public InterfaceC1257400ipG LLLLILI;
    public InterfaceC1257400ipG LLLLJ;
    public CollectProfileListFragment LLLLJI;
    public StickerStoreProfileListFragment LLLLL;
    public ProfileListFragment LLLLLIL;
    public ProfileListFragment LLLLLILLIL;
    public ProfileListFragment LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public Integer LLLLLLZZ;
    public Integer LLLLLZ;
    public boolean LLLLLZIL;
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2559));
    public boolean LLLL = true;
    public final C1559260qg8 LLLLIIIILLL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "profile_tab"), checkSupervisorPrepared());
    public boolean LLLLLLIL = true;
    public final C01GW LLLLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2561));
    public String LLLLLLL = "personal_homepage";
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2560));

    public final void It() {
        if (getUser() != null) {
            Lo(getUser());
        }
        jq().JQ2(new AwS598S0100000_19(this, 492));
        jq().KQ2(new AwS598S0100000_19(this, 493));
        if (C300140Bpc.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0inY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1251350ifV) obj).LLILLL);
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 174), 4);
        }
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0inZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251330ifT) obj).LJI;
            }
        }, new AwS598S0100000_19(this, 494));
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.InterfaceC1251830igH, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC1248970ibf
    public void Xn(int i) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean jr() {
        return true;
    }

    private final AssemViewModel<C1358700lSe> At() {
        return (AssemViewModel) this.LLLLLLJ.getValue();
    }

    private final C1249090ibr<ProfileComponents> iq() {
        return (C1249090ibr) this.LLLLIIIILLL.getValue();
    }

    private final Bundle ut() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "personal_homepage", bundle);
        C786410Ut5.LJJJI("page_name", "personal_homepage", bundle);
        C786410Ut5.LJJJI("source_previous_page", "personal_homepage", bundle);
        C786410Ut5.LJJJI("entrance_type", "showcase_list", bundle);
        C786410Ut5.LJJJI("previous_page", getPreviousPage(), bundle);
        User user = getUser();
        if (user != null) {
            C786410Ut5.LJJJI("sec_user_id", user.getSecUid(), bundle);
            C786410Ut5.LJJJI("author_id", user.getUid(), bundle);
            bundle.putBoolean("is_my_profile", true);
            bundle.putInt("follow_status", user.getFollowStatus());
        }
        return bundle;
    }

    private final MyProfileAbility wt() {
        return (MyProfileAbility) this.LLLJL.getValue();
    }

    @Override // X.InterfaceC1249800id0
    public void Yj() {
        List<ProfileListFragment> list = this.LLJILLL;
        if (list == null || list.size() <= 0) {
            return;
        }
        C128Y c128yYp = yp(0);
        C666390QBx.LIZIZ = c128yYp instanceof InterfaceC1257400ipG ? ((InterfaceC1257400ipG) c128yYp).zn() : null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public User getUser() {
        User user;
        C1251330ifT c1251330ifT = (C1251330ifT) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1252070igf.class));
        return (c1251330ifT == null || (user = c1251330ifT.LIZ) == null) ? ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() : user;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void zr() {
        InterfaceC1257400ipG interfaceC1257400ipG = this.LLLLILI;
        if (interfaceC1257400ipG != null) {
            interfaceC1257400ipG.Jn();
        }
    }

    public final FrameLayout zt() {
        return (FrameLayout) this.LLLLLLLLL.getValue();
    }

    private final void Bt() {
        Fragment fragmentLJJJJZI;
        ProfileListFragment profileListFragmentLJIIIZ;
        InterfaceC1257670iph interfaceC1257670iphT8;
        InterfaceC563350M7p interfaceC563350M7pK9;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) {
            fragmentLJJJJZI = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append('7');
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = fragmentLJJJJZI instanceof ProfileBaseAwemeListFragment ? (ProfileBaseAwemeListFragment) fragmentLJJJJZI : null;
        this.LLLLIILLL = profileBaseAwemeListFragment;
        boolean z = false;
        if (profileBaseAwemeListFragment == null) {
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ == null || (interfaceC1257670iphT8 = aITheaterProfileServiceLIZ.T8()) == null) {
                profileListFragmentLJIIIZ = null;
            } else {
                boolean z2 = C14LC.LJIIIZ;
                C309690CBz.LIZ.getClass();
                int iLIZIZ = C14LC.LIZIZ();
                AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
                profileListFragmentLJIIIZ = interfaceC1257670iphT8.LJIIIZ(iLIZIZ, (aITheaterProfileService == null || (interfaceC563350M7pK9 = aITheaterProfileService.k9()) == null) ? null : interfaceC563350M7pK9.LIZLLL(), false);
            }
            this.LLLLIILLL = profileListFragmentLJIIIZ instanceof ProfileBaseAwemeListFragment ? (ProfileBaseAwemeListFragment) profileListFragmentLJIIIZ : null;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment2 = this.LLLLIILLL;
        Jo(profileBaseAwemeListFragment2 instanceof ProfileListFragment ? profileBaseAwemeListFragment2 : null, 24);
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment3 = this.LLLLIILLL;
        if (profileBaseAwemeListFragment3 != null) {
            profileBaseAwemeListFragment3.setPreviousPage(getPreviousPage());
            profileBaseAwemeListFragment3.LLJJJJJIL = ip();
            List<Integer> list = this.LLJJ;
            if (list != null && this.LLJJIJIIJIL == list.indexOf(24)) {
                z = true;
            }
            profileBaseAwemeListFragment3.LLJJIII = z;
            profileBaseAwemeListFragment3.An(C1259870itF.LIZ(24));
        }
    }

    private final void Ct() {
        Fragment fragmentLJJJJZI;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) {
            fragmentLJJJJZI = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append('2');
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = fragmentLJJJJZI instanceof ProfileLikesAwemeListFragment ? (ProfileLikesAwemeListFragment) fragmentLJJJJZI : null;
        this.LLLLIILL = profileLikesAwemeListFragment;
        if (profileLikesAwemeListFragment == null) {
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            this.LLLLIILL = C1257410ipH.LIZ(iLIZIZ, curUserId, curSecUserId, curUser != null ? curUser.getUniqueId() : null, true, new Bundle());
        }
        Jo(this.LLLLIILL, 1);
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment2 = this.LLLLIILL;
        if (profileLikesAwemeListFragment2 != null) {
            profileLikesAwemeListFragment2.LLILLL = getPreviousPage();
            profileLikesAwemeListFragment2.LLJJJJJIL = ip();
            List<Integer> list = this.LLJJ;
            profileLikesAwemeListFragment2.LLJJIII = list != null && this.LLJJIJIIJIL == list.indexOf(1);
            profileLikesAwemeListFragment2.An(C1259870itF.LIZ(1));
        }
    }

    private final void Ot() {
        if (C2532609wC.LIZLLL()) {
            return;
        }
        User user = getUser();
        if (TextUtils.equals(user != null ? user.getUid() : null, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            Integer numLIZ = C746350TPl.LIZ.LJIIJJI().LIZ();
            dI(numLIZ != null && numLIZ.intValue() == 0);
        }
    }

    private final boolean kt() {
        boolean zLIZIZ = ProfileEditBottomBannerImpl.LIZJ().LIZIZ(true, Boolean.FALSE);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isProfileVisible ");
        sbLIZ.append(this.LLLLLL);
        sbLIZ.append(", isPostSuccess ");
        sbLIZ.append(this.LLLLLJLJLL);
        sbLIZ.append(", popupShouldShow ");
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(", hasPopupShowing ");
        sbLIZ.append(PopupManager.LJI());
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLLLLL && this.LLLLLJLJLL && zLIZIZ && !PopupManager.LJI();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String Bq() {
        ProfileCommonInfo profileCommonInfoWG2;
        UserProfileInfo userProfileInfo;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility == null || (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) == null || (userProfileInfo = profileCommonInfoWG2.getUserProfileInfo()) == null) {
            return null;
        }
        return userProfileInfo.getUid();
    }

    public final void Et() {
        final IAVDraftService iAVDraftServiceDraftService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService();
        if (this.LLLLLZIL || !iAVDraftServiceDraftService.enableAddDraftLossMonitor()) {
            return;
        }
        this.LLLLLZIL = true;
        C15O7.LIZIZ(new Callable() { // from class: X.0M9Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MineAwemePagerAssem@8803.monitorDraftLost$1");
                List<String> listQueryAllDraftsCreationIdFromDB = iAVDraftServiceDraftService.queryAllDraftsCreationIdFromDB(new C0M4M(true, false, EnumC562220M3g.ALL, (C562260M3k) null, 24));
                List<String> listGenCreationIdsOfVisibleDraft = iAVDraftServiceDraftService.genCreationIdsOfVisibleDraft();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("-> MineAwemePagerAssem -> draftInDBList: ");
                sbLIZ.append(this.Dt(listQueryAllDraftsCreationIdFromDB));
                C1720106oR.LJI("monitorDraftLost ", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("-> MineAwemePagerAssem -> visibleDraftList: ");
                sbLIZ2.append(this.Dt(listGenCreationIdsOfVisibleDraft));
                C1720106oR.LJI("monitorDraftLost ", C2188811AlT.LIZIZ(sbLIZ2));
                if (listQueryAllDraftsCreationIdFromDB.containsAll(listGenCreationIdsOfVisibleDraft)) {
                    C1720106oR.LJI("monitorDraftLost ", "-> no draft lost");
                    C1C7U.LIZIZ("MineAwemePagerAssem@8803.monitorDraftLost$1");
                    return null;
                }
                ArrayList arrayList = new ArrayList(listGenCreationIdsOfVisibleDraft);
                arrayList.removeAll(listQueryAllDraftsCreationIdFromDB);
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                int size = arrayList.size();
                int size2 = listQueryAllDraftsCreationIdFromDB.size();
                c1253930ijf.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(size, "lost_count");
                c2344009Gk.LIZJ(size2, "draft_cnt");
                C20684815ws.LJIILLIIL("draft_item_show_error", c2344009Gk.LIZ);
                iAVDraftServiceDraftService.reportDraftLostException(arrayList);
                C1C7U.LIZIZ("MineAwemePagerAssem@8803.monitorDraftLost$1");
                return null;
            }
        }, iAVDraftServiceDraftService.executor(), null);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Xq() {
        super.Xq();
        Ot();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String getPreviousPage() {
        C1252230igv c1252230igv;
        if (!C300140Bpc.LIZ()) {
            C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
            if (c1249090ibrIq != null) {
                return c1249090ibrIq.LLILLL;
            }
            return null;
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
        if (c1249090ibrIq2 == null || (c1252230igv = c1249090ibrIq2.LLIZLLLIL) == null) {
            return null;
        }
        return c1252230igv.LLJJIII;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        InterfaceC1257400ipG interfaceC1257400ipG = this.LLLLIIL;
        if (interfaceC1257400ipG != null && !this.LLLL) {
            interfaceC1257400ipG.mz();
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLLIILL;
        if (profileLikesAwemeListFragment != null && !this.LLLL) {
            profileLikesAwemeListFragment.mz();
        }
        this.LLLL = false;
        if (this.LLLLII) {
            this.LLLLII = false;
            List<ProfileListFragment> list = this.LLJILLL;
            if (list != null) {
                for (ComponentCallbacks componentCallbacks : list) {
                    if (componentCallbacks instanceof InterfaceC737090Svj) {
                        ((InterfaceC737090Svj) componentCallbacks).W0();
                    }
                }
            }
        }
    }

    public final void rt() {
        FrameLayout frameLayoutZt;
        C19EG c19egLIZ;
        C19EG c19egLIZIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (frameLayoutZt = zt()) == null || !kt() || (c19egLIZ = C724240Sb0.LIZ(this)) == null || (c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ)) == null) {
            return;
        }
        ProfileEditBottomBannerImpl.LIZJ().LIZ(C0HZJ.LIZ(c19egLIZIZ), new C1257230ioz(frameLayoutZt, true).LIZ, fragmentLJI, true);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String wq() {
        ProfileCommonInfo profileCommonInfoWG2;
        UserProfileInfo userProfileInfo;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility == null || (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) == null || (userProfileInfo = profileCommonInfoWG2.getUserProfileInfo()) == null) {
            return null;
        }
        return userProfileInfo.getSecUid();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String getEnterFrom() {
        return this.LLLLLLL;
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
    }

    private final boolean Ft(ProfileComponents profileComponents) {
        Integer numValueOf;
        boolean z;
        Integer numValueOf2;
        MusicTabInfo musicTabInfo;
        MusicTabClaimInfo musicTabClaimInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabClaimInfo musicTabClaimInfo2;
        User user;
        TabSetting tabSetting;
        BATab bATab;
        User user2;
        TabSetting tabSetting2;
        BATab bATab2;
        User user3;
        TabSetting tabSetting3;
        ShopTab shopTab;
        User user4;
        TabSetting tabSetting4;
        StickerTab stickerTab;
        User user5;
        TabSetting tabSetting5;
        User user6;
        TabSetting tabSetting6;
        StickerTab stickerTab2;
        Integer numValueOf3;
        Integer num = this.LLLLLZ;
        List<? extends ProfileComponents> list = profileComponents.components;
        Integer numValueOf4 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        if (!Intrinsics.LJFF(num, numValueOf)) {
            List<? extends ProfileComponents> list2 = profileComponents.components;
            if (list2 != null) {
                numValueOf3 = Integer.valueOf(list2.size());
            } else {
                numValueOf3 = null;
            }
            this.LLLLLZ = numValueOf3;
            z = true;
        } else {
            z = false;
        }
        if (this.LLLLLLZ && ((user5 = getUser()) == null || (tabSetting5 = user5.getTabSetting()) == null || tabSetting5.stickerTab == null || ((user6 = getUser()) != null && (tabSetting6 = user6.getTabSetting()) != null && (stickerTab2 = tabSetting6.stickerTab) != null && Intrinsics.LJFF(stickerTab2.showStickerTab, Boolean.FALSE)))) {
            this.LLLLLLZ = false;
            return true;
        }
        if (!this.LLLLLLZ && (user4 = getUser()) != null && (tabSetting4 = user4.getTabSetting()) != null && (stickerTab = tabSetting4.stickerTab) != null && Intrinsics.LJFF(stickerTab.showStickerTab, Boolean.TRUE)) {
            this.LLLLLLZ = true;
            return true;
        }
        if (!this.LLLLLLLLLL && (user3 = getUser()) != null && (tabSetting3 = user3.getTabSetting()) != null && (shopTab = tabSetting3.shopTab) != null && shopTab.showShopTab) {
            return true;
        }
        if (!this.LLLLLLLZIL && (user2 = getUser()) != null && (tabSetting2 = user2.getTabSetting()) != null && (bATab2 = tabSetting2.baTab) != null && Intrinsics.LJFF(bATab2.getShowBATab(), Boolean.TRUE)) {
            return true;
        }
        if (this.LLLLLLLZIL && ((user = getUser()) == null || (tabSetting = user.getTabSetting()) == null || (bATab = tabSetting.baTab) == null || !Intrinsics.LJFF(bATab.getShowBATab(), Boolean.TRUE))) {
            this.LLLLLLLZIL = false;
            return true;
        }
        User user7 = getUser();
        if (user7 != null && (musicTabInfo2 = user7.getMusicTabInfo()) != null && (musicTabClaimInfo2 = musicTabInfo2.musicTabClaimInfo) != null) {
            numValueOf2 = Integer.valueOf(musicTabClaimInfo2.status);
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf2, this.LLLLLLZZ)) {
            User user8 = getUser();
            if (user8 != null && (musicTabInfo = user8.getMusicTabInfo()) != null && (musicTabClaimInfo = musicTabInfo.musicTabClaimInfo) != null) {
                numValueOf4 = Integer.valueOf(musicTabClaimInfo.status);
            }
            this.LLLLLLZZ = numValueOf4;
            return true;
        }
        return z;
    }

    public static final C1249090ibr<ProfileComponents> nt(C1559260qg8<C1249090ibr<ProfileComponents>> c1559260qg8) {
        return c1559260qg8.getValue();
    }

    public static final C1249090ibr<ProfileComponents> ot(C1559260qg8<C1249090ibr<ProfileComponents>> c1559260qg8) {
        return c1559260qg8.getValue();
    }

    public final String Dt(List<String> list) {
        String strLIZIZ = "";
        for (String str : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            sbLIZ.append(';');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022b  */
    @Override // X.InterfaceC1248970ibf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Hj(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssem.Hj(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):void");
    }

    @Override // X.InterfaceC1249800id0
    public void LLIZ(String str) {
        InterfaceC1257400ipG interfaceC1257400ipG = this.LLLLILI;
        if (interfaceC1257400ipG != null) {
            interfaceC1257400ipG.Ov(str, true);
        }
        InterfaceC1257400ipG interfaceC1257400ipG2 = this.LLLLIIL;
        if (interfaceC1257400ipG2 != null) {
            interfaceC1257400ipG2.Ov(str, true);
        }
        InterfaceC1257400ipG interfaceC1257400ipG3 = this.LLLLJ;
        if (interfaceC1257400ipG3 != null) {
            interfaceC1257400ipG3.Ov(str, true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Mq(int i) {
        Object obj;
        InterfaceC1257400ipG interfaceC1257400ipG;
        super.Mq(i);
        InterfaceC1257400ipG interfaceC1257400ipG2 = this.LLLLIIL;
        Object obj2 = null;
        if (interfaceC1257400ipG2 != null) {
            List<ProfileListFragment> list = this.LLJILLL;
            if (list != null) {
                obj = ListProtector.get(list, this.LLJJIJIIJIL);
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(interfaceC1257400ipG2, obj) && !this.LLLL && (interfaceC1257400ipG = this.LLLLIIL) != null) {
                interfaceC1257400ipG.mz();
            }
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLLIILL;
        if (profileLikesAwemeListFragment != null) {
            List<ProfileListFragment> list2 = this.LLJILLL;
            if (list2 != null) {
                obj2 = ListProtector.get(list2, this.LLJJIJIIJIL);
            }
            if (Intrinsics.LJFF(profileLikesAwemeListFragment, obj2) && !this.LLLL) {
                profileLikesAwemeListFragment.mz();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean Pq(int i) {
        List<Integer> list;
        Integer num;
        InterfaceC1257980iqC interfaceC1257980iqC;
        if (Math.abs(i) > 0 && (list = this.LLJJ) != null && (num = (Integer) C13LP.LJJJLZIJ(this.LLJJIJIIJIL, list)) != null && num.intValue() == 16) {
            ComponentCallbacks componentCallbacks = this.LLLLIL;
            if ((componentCallbacks instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC = (InterfaceC1257980iqC) componentCallbacks) != null) {
                interfaceC1257980iqC.q3(false);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void So(int r24) {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssem.So(int):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Xr(String str) {
        this.LLLLLLL = str;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public List<Integer> bt(User user) {
        C1249090ibr<ProfileComponents> c1249090ibrIq;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        if (iq() != null) {
            C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
            List<? extends ProfileComponents> list = null;
            if (c1249090ibrIq2 != null && c1249090ibrIq2.LL != null && (c1249090ibrIq = iq()) != null && (profileComponents = c1249090ibrIq.LL) != null && profileComponents.components != null) {
                C1249040ibm c1249040ibm = C1249040ibm.LIZ;
                C1249090ibr<ProfileComponents> c1249090ibrIq3 = iq();
                if (c1249090ibrIq3 != null && (profileComponents2 = c1249090ibrIq3.LL) != null) {
                    list = profileComponents2.components;
                }
                User user2 = getUser();
                c1249040ibm.getClass();
                List<Integer> listLIZIZ = C1249040ibm.LIZIZ(user2, list);
                if (C296260BjM.LIZ()) {
                    ((ArrayList) listLIZIZ).remove((Object) 6);
                }
                return listLIZIZ;
            }
        }
        return super.bt(user);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public List<Integer> ct(String str) {
        C1249090ibr<ProfileComponents> c1249090ibrIq;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        if (iq() != null) {
            C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
            List<? extends ProfileComponents> list = null;
            if (c1249090ibrIq2 != null && c1249090ibrIq2.LL != null && (c1249090ibrIq = iq()) != null && (profileComponents = c1249090ibrIq.LL) != null && profileComponents.components != null) {
                C1249040ibm c1249040ibm = C1249040ibm.LIZ;
                C1249090ibr<ProfileComponents> c1249090ibrIq3 = iq();
                if (c1249090ibrIq3 != null && (profileComponents2 = c1249090ibrIq3.LL) != null) {
                    list = profileComponents2.components;
                }
                User user = getUser();
                c1249040ibm.getClass();
                List<Integer> listLIZIZ = C1249040ibm.LIZIZ(user, list);
                if (C296260BjM.LIZ()) {
                    ((ArrayList) listLIZIZ).remove((Object) 6);
                }
                return listLIZIZ;
            }
        }
        return super.ct(str);
    }

    @C14EU
    public final void onMyEnterpriseProfileEvent(C517240KQg c517240KQg) {
        c517240KQg.getClass();
        this.LLLLII = true;
    }

    @C14EU
    public final void onRefreshProfileViewPagerDataEvent(C712300Rwq c712300Rwq) {
        this.LLLLII = true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.InterfaceC1258060iqK
    public void onSelect(int i) {
        super.onSelect(i);
        if (this.LLJJJJJIL) {
            nr(i);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onStickyPublishEvent(C737030Svd c737030Svd) {
        if (C1EDI.LJI() && c737030Svd.LIZ == 15) {
            this.LLLLLJLJLL = true;
            rt();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(C1258310iqj c1258310iqj) {
        Ot();
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String tag;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            tag = fragmentLJI.getTag();
        } else {
            tag = null;
        }
        if (!Intrinsics.LJFF("platform_fragment", tag)) {
            return;
        }
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i != 13) {
                if (i != 15) {
                    return;
                } else {
                    C0XQ7.LJFF().LJII(1);
                }
            } else {
                Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ((String) c737030Svd.LIZIZ);
                if (awemeLLILZ != null && awemeLLILZ.getUserDigg() == 1) {
                    C0XQ7.LJFF().LJIIJ(1);
                } else {
                    C0XQ7.LJFF().LJIIJ(-1);
                }
            }
        } else {
            C0XQ7.LJFF().LJII(-1);
        }
        User curUser = C0XQ7.LJFF().getCurUser();
        dp(curUser.getAwemeCount());
        ep(curUser.getFavoritingCount());
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C117P c117p;
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onViewCreated(view);
        if (!C0BI9.LIZ() && (c117p = this.LLJZ) != null) {
            c117p.setOffscreenPageLimit(3);
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && Intrinsics.LJFF(c1249090ibrIq.LLILZIL, Boolean.TRUE)) {
            C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0ifn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLILZ;
                }
            }, null, new AwS633S0100000_19(this, 175), 6);
        } else {
            It();
        }
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0ifi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLILLJJLI);
            }
        }, null, new AwS633S0100000_19(this, 176), 6);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0ipu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1158970gGV) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 177), 4);
        AssemViewModel<C1358700lSe> assemViewModelAt = At();
        if (assemViewModelAt != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModelAt, new C2217381BqS() { // from class: X.0iqA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1358700lSe) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 178), 4);
        }
        ProfileViewModel profileViewModelLq = lq();
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 496);
        profileViewModelLq.getClass();
        JediViewModel.bR2(profileViewModelLq, new C2217381BqS() { // from class: X.0ipM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileState) obj).getTargetTab();
            }
        }, null, new AwS598S0100000_19(awS598S0100000_19, 841), 2, null);
        ProfileViewModel profileViewModelLq2 = lq();
        AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(this, 495);
        profileViewModelLq2.getClass();
        JediViewModel.bR2(profileViewModelLq2, C1254120ijy.LL, null, new AwS581S0100000_2((Function1) awS598S0100000_192, (Function1<Object, String>) 631), 2, null);
        String str = "profile_tab";
        if (!C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            String str2 = this.assemTagInternal;
            if (str2 != null) {
                str = str2;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c1250680ieQ.getClass();
            Map<String, Boolean> map = C1250680ieQ.LIZIZ;
            Object obj = ((LinkedHashMap) map).get(str);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(obj, bool)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("profile_attributes", C1250680ieQ.LJIIJJI);
                c2344009Gk.LJIIIIZZ("report_scene", "profile_component_cost_time");
                c2344009Gk.LJIIIIZZ("component_tag", str);
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "component_tab_create_time");
                C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
                map.put(str, bool);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mobForComponentTabCreateCostTime: ");
                sbLIZ.append(str);
                sbLIZ.append(", costTime: ");
                sbLIZ.append(jCurrentTimeMillis2);
                C1720106oR.LJI("ProfilePlatformStatistics", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
        String str3 = this.assemTagInternal;
        if (str3 != null) {
            str = str3;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
        c1250680ieQ2.getClass();
        Map<String, Boolean> map2 = C1250680ieQ.LIZIZ;
        Object obj2 = ((LinkedHashMap) map2).get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(obj2, bool2)) {
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("report_scene", "profile_component_cost_time");
        c2344009Gk2.LJIIIIZZ("component_tag", str);
        c2344009Gk2.LIZLLL(jCurrentTimeMillis3, "component_tab_create_time");
        c2344009Gk2.LJ(bool2, "is_my_profile");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk2.LIZ);
        map2.put(str, bool2);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mobForComponentTabCreateCostTime: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", costTime: ");
        sbLIZ2.append(jCurrentTimeMillis3);
        sbLIZ2.append(", isMine: ");
        sbLIZ2.append(true);
        C1720106oR.LJI("ProfilePlatformStatistics", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1249800id0
    public void YF(String str, Aweme aweme) {
        C1259360isQ c1259360isQ;
        ArrayList arrayList;
        View childAt;
        C1259780it6 c1259780it6;
        InterfaceC1257400ipG interfaceC1257400ipG = this.LLLLILI;
        if (interfaceC1257400ipG != null) {
            interfaceC1257400ipG.In(aweme, str);
        }
        InterfaceC1257400ipG interfaceC1257400ipG2 = this.LLLLJ;
        if (interfaceC1257400ipG2 != null) {
            interfaceC1257400ipG2.In(aweme, str);
        }
        InterfaceC1257400ipG interfaceC1257400ipG3 = this.LLLLIIL;
        if (interfaceC1257400ipG3 != null) {
            interfaceC1257400ipG3.In(aweme, str);
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLLIILL;
        if (profileLikesAwemeListFragment != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateUIByAweme aid=");
            sbLIZ.append(str);
            sbLIZ.append(" type=");
            sbLIZ.append(profileLikesAwemeListFragment.LLJILLL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (profileLikesAwemeListFragment.LLJJL != null && str.length() != 0 && (c1259360isQ = profileLikesAwemeListFragment.LLJJL) != null) {
                Collection collection = c1259360isQ.mmItems;
                String aid = null;
                if ((collection instanceof ArrayList) && (arrayList = (ArrayList) collection) != null) {
                    int iLLLII = c1259360isQ.LLLII(str);
                    if (iLLLII >= 0 && iLLLII < arrayList.size()) {
                        ListProtector.set(arrayList, iLLLII, aweme);
                        int iLLLJL = c1259360isQ.LLLJL();
                        RecyclerView recyclerView = profileLikesAwemeListFragment.LLJJJIL;
                        if (recyclerView != null && (childAt = recyclerView.getChildAt(iLLLII + iLLLJL)) != null) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                            if ((childViewHolder instanceof C1259780it6) && (c1259780it6 = (C1259780it6) childViewHolder) != null) {
                                Aweme aweme2 = c1259780it6.LL;
                                if (aweme2 != null && TextUtils.equals(aweme2.getAid(), str)) {
                                    c1259780it6.a6();
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("holder aid not equal updated aid; holder aid: ");
                                Aweme aweme3 = c1259780it6.LL;
                                if (aweme3 != null) {
                                    aid = aweme3.getAid();
                                }
                                sbLIZ2.append(aid);
                                sbLIZ2.append("; updated aid: ");
                                sbLIZ2.append(str);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("update fail by reason: ");
                                sbLIZ3.append(strLIZIZ);
                                C2344809Gs.LJFF("FrontierReeditPushImpl", C2188811AlT.LIZIZ(sbLIZ3));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("aid not in list; aid: ");
                    sbLIZ4.append(str);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("update fail by reason: ");
                    sbLIZ5.append(strLIZIZ2);
                    C2344809Gs.LJFF("FrontierReeditPushImpl", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        }
    }

    private final void Nt(InterfaceC1257980iqC interfaceC1257980iqC, User user, int i) {
        if (Ys(user, i)) {
            interfaceC1257980iqC.za(new MiniUser(user));
        }
    }
}
