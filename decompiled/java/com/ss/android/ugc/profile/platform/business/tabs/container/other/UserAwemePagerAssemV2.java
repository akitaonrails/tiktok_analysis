package com.ss.android.ugc.profile.platform.business.tabs.container.other;

import X.C01GW;
import X.C08B7;
import X.C0BI9;
import X.C0PEM;
import X.C0PSA;
import X.C1058550deX;
import X.C10EU;
import X.C1249040ibm;
import X.C1249090ibr;
import X.C1251820igG;
import X.C1252220igu;
import X.C1252230igv;
import X.C1252470ihJ;
import X.C1252480ihK;
import X.C1253160iiQ;
import X.C1253210iiV;
import X.C1253260iia;
import X.C1253930ijf;
import X.C1257410ipH;
import X.C1257470ipN;
import X.C1257500ipQ;
import X.C1257570ipX;
import X.C1257640ipe;
import X.C1258020iqG;
import X.C1259360isQ;
import X.C1259870itF;
import X.C1260030itV;
import X.C1260090itb;
import X.C1260280itu;
import X.C1279004zU;
import X.C1279104zV;
import X.C1360460lVU;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1601110rld;
import X.C1602160rnK;
import X.C1637190shp;
import X.C1656550tD3;
import X.C1697810uHb;
import X.C1733740vDY;
import X.C1848410yCV;
import X.C19EG;
import X.C1ER1;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C267180AdY;
import X.C299890BpD;
import X.C412301iz;
import X.C412401j0;
import X.C452501pT;
import X.C486860J7k;
import X.C563290M7j;
import X.C703302op;
import X.C723580SZw;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1253020iiC;
import X.InterfaceC1248970ibf;
import X.InterfaceC1257400ipG;
import X.InterfaceC1257670iph;
import X.InterfaceC1257980iqC;
import X.InterfaceC1258070iqL;
import X.InterfaceC1258260iqe;
import X.InterfaceC1258470iqz;
import X.InterfaceC546120LbO;
import X.InterfaceC633510Ot3;
import Y.ACListenerS154S0100000_19;
import Y.AObjectS393S0100000_19;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS25S0201000_19;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ba.impl.ui.BusinessPageFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.ShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.series.profile.view.SeriesProfileFragment;
import com.ss.android.ugc.aweme.service.IDramaProfileHistoryTabService;
import com.ss.android.ugc.aweme.service.ISeriesProfileService;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.business.effect.EffectProfileListFragment;
import com.ss.android.ugc.profile.business.feed.CollectProfileListFragment;
import com.ss.android.ugc.profile.business.message.fragment.StickerStoreProfileListFragment;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.tab.ProfileLikesAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.platform.IHeaderRecommendUserCardAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: loaded from: classes20.dex */
public final class UserAwemePagerAssemV2 extends AwemePagerAssem implements UserAwemePagerAbility, InterfaceC1248970ibf {
    public static final int LLLLZLLIL = 8;
    public C1257570ipX LLLJL;
    public ProfileLikesAwemeListFragment LLLL;
    public ProfileBaseAwemeListFragment LLLLII;
    public MTAwemeListFragment LLLLIIIILLL;
    public ProfileListFragment LLLLIIL;
    public ProfileListFragment LLLLIILL;
    public EffectProfileListFragment LLLLIILLL;
    public StickerStoreProfileListFragment LLLLIL;
    public ProfileListFragment LLLLILI;
    public ProfileListFragment LLLLJ;
    public ProfileListFragment LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public String LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public String LLLLLIL = "";
    public final C01GW LLLLLZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2564));
    public final C1559260qg8 LLLLLZL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "profile_tab"), checkSupervisorPrepared());
    public String LLLLZ = "others_homepage";
    public final C01GW LLLLZI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2562));
    public final C01GW LLLLZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2563));
    public InterfaceC1258470iqz LLLLZLL = new InterfaceC1258470iqz() { // from class: X.0ipS
        @Override // X.InterfaceC1258470iqz
        public final void LIZIZ(int i) {
        }

        @Override // X.InterfaceC1258470iqz
        public final void LIZ(int i) {
            C1260280itu c1260280itu = this.LIZ.LLJJIJI;
            if (c1260280itu != null) {
                c1260280itu.setCanScrollUp(true);
            }
            if (i == 0) {
                ProfileViewModel profileViewModelLq = this.LIZ.lq();
                profileViewModelLq.getClass();
                profileViewModelLq.setState(new AwS47S0010000_35(false, 32));
                ProfileViewModel profileViewModelLq2 = this.LIZ.lq();
                profileViewModelLq2.getClass();
                profileViewModelLq2.setState(new AwS47S0010000_35(false, 31));
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this.LIZ);
            if (fragmentLJI != null) {
                String uid = null;
                IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IHeaderRecommendUserCardAbility.class, null);
                if (iHeaderRecommendUserCardAbility != null) {
                    User user = this.LIZ.getUser();
                    if (user != null) {
                        uid = user.getUid();
                    }
                    iHeaderRecommendUserCardAbility.tQ2(uid);
                }
            }
        }

        @Override // X.InterfaceC1258470iqz
        public final void LIZJ(int i, boolean z) {
            User user;
            boolean z2;
            IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility;
            IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility2;
            C1260280itu c1260280itu = this.LIZ.LLJJIJI;
            if (c1260280itu != null) {
                c1260280itu.setCanScrollUp(true);
            }
            if (i == 0) {
                ProfileViewModel profileViewModelLq = this.LIZ.lq();
                profileViewModelLq.getClass();
                profileViewModelLq.setState(new AwS47S0010000_35(true, 32));
                if (!z && (user = this.LIZ.getUser()) != null) {
                    UserAwemePagerAssemV2 userAwemePagerAssemV2 = this.LIZ;
                    if (user.getFollowerCount() < 1000 && user.getAccountType() != 2 && user.getAccountType() != 3) {
                        userAwemePagerAssemV2.LLLLLJIL = true;
                        if (C283600B9q.LIZ() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Fragment fragmentLJI = C724240Sb0.LJI(userAwemePagerAssemV2);
                            if (fragmentLJI != null && (iHeaderRecommendUserCardAbility2 = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IHeaderRecommendUserCardAbility.class, null)) != null) {
                                iHeaderRecommendUserCardAbility2.mB1(user, "auto_no_post_item");
                            }
                            userAwemePagerAssemV2.LLLLLJIL = false;
                        } else if (user.tabType == 0 || C10EU.LJIILL(user, false)) {
                            Fragment fragmentLJI2 = C724240Sb0.LJI(userAwemePagerAssemV2);
                            if (fragmentLJI2 != null && (iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), IHeaderRecommendUserCardAbility.class, null)) != null) {
                                iHeaderRecommendUserCardAbility.mB1(user, "auto_no_post_item");
                            }
                            userAwemePagerAssemV2.LLLLLJIL = false;
                        }
                    }
                }
                ProfileViewModel profileViewModelLq2 = this.LIZ.lq();
                profileViewModelLq2.getClass();
                profileViewModelLq2.setState(new AwS47S0010000_35(true, 31));
            }
        }
    };

    private final String lu(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 6 ? i != 14 ? (i == 16 || i == 20) ? "user_shop" : i != 24 ? "no matched" : "cameo" : "private_post" : "effect" : "ost" : "like" : "post";
    }

    public final void Ev(int[] iArr) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.InterfaceC1251830igH, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final void Ou() {
        this.LLLLLLLLL = false;
        this.LLLLLLL = false;
        this.LLLLLLJ = false;
        this.LLLLLLLLLL = false;
    }

    @Override // X.InterfaceC1248970ibf
    public void Xn(int i) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void di2() {
        this.LLLLLLZZ = true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean jr() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void onBackPress() {
    }

    private final InterfaceC1258260iqe It() {
        return (InterfaceC1258260iqe) this.LLLLZI.getValue();
    }

    private final void Iu() {
        List<Integer> list = this.LLJJ;
        if (list == null || list.size() == 0) {
            Pair[] pairArr = new Pair[2];
            C1257500ipQ c1257500ipQ = this.LLJLLL;
            pairArr[0] = new Pair(c1257500ipQ != null ? Integer.valueOf(c1257500ipQ.getTabCount()) : null, "tab_cnt");
            pairArr[1] = new Pair("", "tab_name");
            C20684815ws.LJIJI("profile_tab_show", pairArr);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = this.LLJJ;
        if (list2 != null) {
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(lu(it2.next().intValue()));
            }
        }
        Pair[] pairArr2 = new Pair[2];
        C1257500ipQ c1257500ipQ2 = this.LLJLLL;
        pairArr2[0] = new Pair(c1257500ipQ2 != null ? Integer.valueOf(c1257500ipQ2.getTabCount()) : null, "tab_cnt");
        pairArr2[1] = new Pair(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63), "tab_name");
        C20684815ws.LJIJI("profile_tab_show", pairArr2);
    }

    private final InterfaceC1258070iqL Nt() {
        return (InterfaceC1258070iqL) this.LLLLZIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Vv() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2.Vv():void");
    }

    private final C1249090ibr<ProfileComponents> iq() {
        return (C1249090ibr) this.LLLLLZL.getValue();
    }

    private final Bundle ut() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("sec_user_id", wq(), bundle);
        C786410Ut5.LJJJI("author_id", Bq(), bundle);
        bundle.putBoolean("is_my_profile", false);
        C786410Ut5.LJJJI("enter_from", getEventType(), bundle);
        C786410Ut5.LJJJI("show_window_source", Xt(), bundle);
        Aweme aweme = jq().getState().LLJILJILJ;
        C786410Ut5.LJJJI("group_id", aweme != null ? aweme.getAid() : null, bundle);
        C786410Ut5.LJJJI("room_id", Ut(), bundle);
        C786410Ut5.LJJJI("source_content_id", Yt(), bundle);
        C786410Ut5.LJJJI("page_name", "others_homepage", bundle);
        C786410Ut5.LJJJI("source_previous_page", "others_homepage", bundle);
        C786410Ut5.LJJJI("entrance_type", "showcase_list", bundle);
        C786410Ut5.LJJJI("search_id", this.LLLLLL, bundle);
        C786410Ut5.LJJJI("search_result_id", this.LLLLLJLJLL, bundle);
        C786410Ut5.LJJJI("list_source_content_id", this.LLLLLLIL, bundle);
        C786410Ut5.LJJJI("previous_page", getPreviousPage(), bundle);
        C786410Ut5.LJJJI("trackParams", nu(), bundle);
        int[] iArrQu = qu();
        if (iArrQu != null && iArrQu.length != 0) {
            bundle.putIntArray("traffic_source_list", qu());
        }
        User user = getUser();
        if (user != null) {
            bundle.putInt("follow_status", user.getFollowStatus());
        }
        return bundle;
    }

    private final void vv() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1252480ihK c1252480ihKFt = Ft();
        if (c1252480ihKFt != null) {
            C1252470ihJ.LIZJ(c1252480ihKFt, linkedHashMap);
        }
        Map<String, String> mapPt = Pt();
        if (mapPt != null) {
            linkedHashMap.putAll(mapPt);
            if (Ft() == null) {
                String eventType = getEventType();
                if (eventType == null) {
                    eventType = "";
                }
                linkedHashMap.put("enter_from_merge", eventType);
            }
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLJILJILJ = linkedHashMap;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public boolean Aw0() {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        return mTAwemeListFragment != null && mTAwemeListFragment.LLLJ == 3;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Dr() {
        MTAwemeListFragment mTAwemeListFragment;
        List<Integer> list = this.LLJJ;
        if (list == null || ((Number) ListProtector.get(list, this.LLJJIJIIJIL)).intValue() != 0 || (mTAwemeListFragment = this.LLLLIIIILLL) == null) {
            return;
        }
        C412401j0 c412401j0 = mTAwemeListFragment.LLLI;
        RecyclerView recyclerView = mTAwemeListFragment.LLJJIJI;
        AObjectS393S0100000_19 aObjectS393S0100000_19 = new AObjectS393S0100000_19(mTAwemeListFragment, 22);
        if (c412401j0.LIZIZ) {
            return;
        }
        c412401j0.LIZIZ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C412301iz(recyclerView, c412401j0, aObjectS393S0100000_19, null), 3);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Nq() {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment == null || mTAwemeListFragment.LLJILLL || mTAwemeListFragment.LLJIJIL != 0) {
            return;
        }
        mTAwemeListFragment.RU();
    }

    public final boolean Ov() {
        Fragment fragmentLJI;
        if (!this.LLLLL && (fragmentLJI = C724240Sb0.LJI(this)) != null && !fragmentLJI.isResumed()) {
            return false;
        }
        if ((this.LLLLLLLZIL && C1601110rld.LIZ()) || this.LLLLLLZ) {
            return false;
        }
        if (!C299890BpD.LIZ() && CommerceAnchorService.LJIILL().LIZLLL(jq().getAweme())) {
            return false;
        }
        if (!C299890BpD.LIZ() && this.LLLLLLL) {
            return false;
        }
        if (C299890BpD.LIZ() && this.LLLLLLLLL) {
            return false;
        }
        return (C299890BpD.LIZ() && this.LLLLLLJ) ? false : true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public boolean XN0() {
        Fragment fragmentLJI;
        if (this.LLLLL || (fragmentLJI = C724240Sb0.LJI(this)) == null || fragmentLJI.isResumed()) {
            return ((this.LLLLLLLZIL && C1601110rld.LIZ()) || this.LLLLLLZ) ? false : true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public int getTabCount() {
        C1257500ipQ c1257500ipQ = this.LLJLLL;
        if (c1257500ipQ != null) {
            return c1257500ipQ.getTabCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public String getTabName() {
        List<Integer> list = this.LLJJ;
        if (list == null || this.LLJJIJIIJIL < 0) {
            return "";
        }
        int size = list.size();
        int i = this.LLJJIJIIJIL;
        if (size <= i) {
            return "";
        }
        List<Integer> list2 = this.LLJJ;
        return C1259870itF.LIZ(list2 != null ? ((Number) ListProtector.get(list2, i)).intValue() : -1);
    }

    public final C1257570ipX ru() {
        return (C1257570ipX) this.LLLLLZIL.getValue();
    }

    public final C1257570ipX su() {
        View viewFindViewById = this.LLLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.user_just_watched_btn) : null;
            this.LLLJL = (C1257570ipX) viewFindViewById;
        }
        return (C1257570ipX) viewFindViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public List<Aweme> zn() {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            return mTAwemeListFragment.zn();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void zr() {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Jn();
        }
    }

    private final void Bu() throws Throwable {
        Fragment fragmentLJJJJZI;
        C1252230igv c1252230igv;
        String str;
        String str2;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) {
            fragmentLJJJJZI = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append('1');
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragmentLIZ = fragmentLJJJJZI instanceof ProfileLikesAwemeListFragment ? (ProfileLikesAwemeListFragment) fragmentLJJJJZI : null;
        Bundle bundle = new Bundle();
        int[] iArrQu = qu();
        if (iArrQu != null && iArrQu.length != 0) {
            bundle.putIntArray("traffic_source_list", qu());
        }
        String strDq = dq();
        if (strDq != null && strDq.length() > 0) {
            C786410Ut5.LJJJI("profile_enter_method", strDq, bundle);
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (str2 = c1249090ibrIq.LLILLL) != null && str2.length() > 0) {
            C786410Ut5.LJJJI("enter_from", str2, bundle);
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
        if (c1249090ibrIq2 != null && (c1252230igv = c1249090ibrIq2.LLIZLLLIL) != null && (str = c1252230igv.LLILZIL) != null && str.length() > 0) {
            C786410Ut5.LJJJI("rfevent_previous_page", str, bundle);
        }
        if (profileLikesAwemeListFragmentLIZ == null) {
            String strBq = Bq();
            String strWq = wq();
            User user = getUser();
            profileLikesAwemeListFragmentLIZ = C1257410ipH.LIZ(-1, strBq, strWq, user != null ? user.getUniqueId() : null, false, bundle);
        }
        this.LLLL = profileLikesAwemeListFragmentLIZ;
        profileLikesAwemeListFragmentLIZ.Gn(getUser());
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJJJJJIL = ip();
            profileLikesAwemeListFragment.LLJJIII = this.LLJJIJIIJIL == (Us() ? 2 : 1);
            profileLikesAwemeListFragment.An(C1259870itF.LIZ(1));
            profileLikesAwemeListFragment.LLILLL = getPreviousPage();
            R6(Et());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1252480ihK c1252480ihKFt = Ft();
            if (c1252480ihKFt != null) {
                C1252470ihJ.LIZJ(c1252480ihKFt, linkedHashMap);
            }
            Map<String, String> mapPt = Pt();
            if (mapPt != null) {
                linkedHashMap.putAll(mapPt);
                if (Ft() == null) {
                    String eventType = getEventType();
                    if (eventType == null) {
                        eventType = "";
                    }
                    linkedHashMap.put("enter_from_merge", eventType);
                }
            }
            profileLikesAwemeListFragment.LLJJJ = linkedHashMap;
            String strBq2 = Bq();
            String strWq2 = wq();
            profileLikesAwemeListFragment.LLIZ = strBq2;
            profileLikesAwemeListFragment.LLIZLLLIL = strWq2;
            profileLikesAwemeListFragment.LLLF = new C1258020iqG(this);
            Jo(profileLikesAwemeListFragment, 1);
        }
    }

    private final C1253260iia Ct() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIJJLI;
    }

    private final void kt() {
        C1257570ipX c1257570ipXRu = ru();
        View.OnClickListener aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(this, 189);
        if (C1848410yCV.LIZ) {
            aCListenerS154S0100000_19 = new f(aCListenerS154S0100000_19);
        }
        a aVar = new a(aCListenerS154S0100000_19);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1257570ipXRu);
        }
        c1257570ipXRu.setOnClickListener(aVar);
    }

    private final void yu() {
        Fragment fragmentLJJJJZI;
        InterfaceC1257670iph interfaceC1257670iphT8;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) {
            fragmentLJJJJZI = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append("24");
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProfileListFragment profileListFragmentLJI = fragmentLJJJJZI instanceof ProfileBaseAwemeListFragment ? (ProfileBaseAwemeListFragment) fragmentLJJJJZI : null;
        Bundle bundle = new Bundle();
        if (profileListFragmentLJI == null) {
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ == null || (interfaceC1257670iphT8 = aITheaterProfileServiceLIZ.T8()) == null) {
                profileListFragmentLJI = null;
            } else {
                String strBq = Bq();
                String strWq = wq();
                User user = getUser();
                profileListFragmentLJI = interfaceC1257670iphT8.LJI(strBq, strWq, user != null ? user.getUniqueId() : null, bundle);
            }
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = profileListFragmentLJI instanceof ProfileBaseAwemeListFragment ? (ProfileBaseAwemeListFragment) profileListFragmentLJI : null;
        this.LLLLII = profileBaseAwemeListFragment;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.Gn(getUser());
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment2 = this.LLLLII;
        if (profileBaseAwemeListFragment2 != null) {
            profileBaseAwemeListFragment2.LLJJJJJIL = ip();
            List<Integer> list = this.LLJJ;
            profileBaseAwemeListFragment2.LLJJIII = list != null && this.LLJJIJIIJIL == list.indexOf(24);
            profileBaseAwemeListFragment2.An(C1259870itF.LIZ(24));
            profileBaseAwemeListFragment2.setPreviousPage(getPreviousPage());
            profileBaseAwemeListFragment2.nS(Bq(), wq());
            Jo(profileBaseAwemeListFragment2, 24);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String Bq() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZ;
    }

    public final void Cu() {
        ru().LIZIZ();
    }

    public final String Et() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIILL;
    }

    public final C1252480ihK Ft() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIJI;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void OC1() {
        if (!C10EU.LJIILL(getUser(), false)) {
            MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
            if (mTAwemeListFragment != null) {
                mTAwemeListFragment.xU("fresh_update_user_info", false, false);
            }
            ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
            if (profileLikesAwemeListFragment != null) {
                profileLikesAwemeListFragment.XS("fresh_update_user_info");
            }
            ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
            if (profileBaseAwemeListFragment != null) {
                profileBaseAwemeListFragment.XS("fresh_update_user_info");
                return;
            }
            return;
        }
        tv(true);
        MTAwemeListFragment mTAwemeListFragment2 = this.LLLLIIIILLL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.sU();
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment2 = this.LLLL;
        if (profileLikesAwemeListFragment2 != null && !profileLikesAwemeListFragment2.JS() && profileLikesAwemeListFragment2.isViewValid()) {
            profileLikesAwemeListFragment2.RS(false);
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment2 = this.LLLLII;
        if (profileBaseAwemeListFragment2 == null || profileBaseAwemeListFragment2.JS() || !profileBaseAwemeListFragment2.isViewValid()) {
            return;
        }
        profileBaseAwemeListFragment2.RS(false);
    }

    public final Map<String, String> Pt() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIIL;
    }

    public final String St() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJ;
    }

    public final String Ut() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIIJJI;
    }

    public final String Wt() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Aweme aweme;
        HashMap<String, String> mobParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null || (aweme = otherParams.LIZJ) == null || (mobParams = aweme.getMobParams()) == null) {
            return null;
        }
        return mobParams.get("scene_type");
    }

    public final String Xt() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIILJJIL;
    }

    public final String Yt() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIILIIL;
    }

    public final void clearAnimation() {
        C1257570ipX c1257570ipXRu = ru();
        int visibility = c1257570ipXRu.getVisibility();
        c1257570ipXRu.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1257570ipXRu);
        ru().clearAnimation();
        if (((Boolean) C267180AdY.LIZ.getValue()).booleanValue()) {
            C1257570ipX c1257570ipXRu2 = ru();
            c1257570ipXRu2.LLILLL.cancel();
            c1257570ipXRu2.getJustWatchedIconFromXml().clearAnimation();
            c1257570ipXRu2.LLILLJJLI = false;
        }
    }

    public final String getEventType() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIIJ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String getPreviousPage() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZLLL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public User getUser() {
        UserProfileAbility userProfileAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null) {
            return null;
        }
        return userProfileAbility.getUser();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean kr() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        if (c19egLIZ instanceof C08B7) {
            return C1058550deX.LIZIZ(c19egLIZ, "NOTIFICATION") || !C486860J7k.LIZIZ(c19egLIZ).FQ2("page_feed");
        }
        C1260090itb c1260090itb = C1260090itb.LIZIZ;
        return c1260090itb.isDetailActivity(c19egLIZ) ? !C486860J7k.LIZIZ(c19egLIZ).FQ2("page_feed") : c1260090itb.isUserProfileActivity(c19egLIZ);
    }

    public final String ku() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJFF;
    }

    public final String mu() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIL;
    }

    public final String nu() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIIZILJ;
    }

    public final int[] qu() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LJIILLIIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String wq() {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) {
            return null;
        }
        return otherParams.LIZIZ;
    }

    private final void Eu() {
        kt();
    }

    private final void vu() {
        yu();
    }

    private final void zu() throws Throwable {
        Bu();
    }

    public final ProfileListFragment Bt() {
        return this.LLLLIIL;
    }

    public final EffectProfileListFragment Dt() {
        return this.LLLLIILLL;
    }

    public final boolean Hu() {
        return this.LLLLL;
    }

    public final ProfileLikesAwemeListFragment Ot() {
        return this.LLLL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public boolean SG() {
        return this.LLLLLLZZ;
    }

    public final MTAwemeListFragment Tt() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public String getEnterFrom() {
        return this.LLLLZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public InterfaceC1258470iqz ip() {
        return this.LLLLZLL;
    }

    public final ProfileBaseAwemeListFragment zt() {
        return this.LLLLII;
    }

    private final void Av(EnumC1253020iiC enumC1253020iiC) {
        ProfileListFragment profileListFragment;
        StickerStoreProfileListFragment stickerStoreProfileListFragment;
        ProfileListFragment profileListFragment2;
        EffectProfileListFragment effectProfileListFragment;
        User user;
        User user2;
        ProfileListFragment profileListFragment3;
        ProfileListFragment profileListFragment4;
        boolean z;
        User user3;
        User user4;
        MTAwemeListFragment mTAwemeListFragment;
        boolean zLJIILL;
        boolean z2;
        User user5;
        User user6;
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment;
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment2;
        boolean zLJIILL2;
        boolean z3;
        User user7;
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment;
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment2;
        boolean zLJIILL3;
        boolean z4;
        User user8;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPublishPrivateData source: ");
        sbLIZ.append(enumC1253020iiC);
        sbLIZ.append(", pos: ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z5 = true;
        if (this.LLJJIJIIJIL == aq(1) && (profileLikesAwemeListFragment = this.LLLL) != null && ((profileLikesAwemeListFragment.LJLLL() || ((user8 = getUser()) != null && user8.isBlock)) && (profileLikesAwemeListFragment2 = this.LLLL) != null)) {
            User user9 = profileLikesAwemeListFragment2.LLL;
            if (user9 == null) {
                zLJIILL3 = this.LLLLLILLIL;
            } else {
                zLJIILL3 = C10EU.LJIILL(user9, false);
            }
            profileLikesAwemeListFragment2.LLILZLL = zLJIILL3;
            User user10 = profileLikesAwemeListFragment2.LLL;
            if (user10 != null && user10.isBlocked()) {
                z4 = true;
            } else {
                z4 = false;
            }
            profileLikesAwemeListFragment2.LLJI = z4;
            profileLikesAwemeListFragment2.Ii(false);
        }
        if (this.LLJJIJIIJIL == aq(24) && (profileBaseAwemeListFragment = this.LLLLII) != null && ((profileBaseAwemeListFragment.LJLLL() || ((user7 = getUser()) != null && user7.isBlock)) && (profileBaseAwemeListFragment2 = this.LLLLII) != null)) {
            User user11 = profileBaseAwemeListFragment2.LLL;
            if (user11 == null) {
                zLJIILL2 = this.LLLLLILLIL;
            } else {
                zLJIILL2 = C10EU.LJIILL(user11, false);
            }
            profileBaseAwemeListFragment2.b(zLJIILL2);
            User user12 = profileBaseAwemeListFragment2.LLL;
            if (user12 != null && user12.isBlocked()) {
                z3 = true;
            } else {
                z3 = false;
            }
            profileBaseAwemeListFragment2.ro(z3);
            profileBaseAwemeListFragment2.Ii(false);
        }
        if (this.LLJJIJIIJIL == aq(0) && (mTAwemeListFragment = this.LLLLIIIILLL) != null && (mTAwemeListFragment.LLJLILLLLZIIL || ((user6 = getUser()) != null && user6.isBlock))) {
            if (getUser() == null) {
                zLJIILL = this.LLLLLILLIL;
            } else {
                zLJIILL = C10EU.LJIILL(getUser(), false);
            }
            MTAwemeListFragment mTAwemeListFragment2 = this.LLLLIIIILLL;
            if (mTAwemeListFragment2 != null) {
                mTAwemeListFragment2.b(zLJIILL);
            }
            MTAwemeListFragment mTAwemeListFragment3 = this.LLLLIIIILLL;
            if (mTAwemeListFragment3 != null) {
                if (getUser() != null && (user5 = getUser()) != null && user5.isBlocked()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mTAwemeListFragment3.ro(z2);
            }
            MTAwemeListFragment mTAwemeListFragment4 = this.LLLLIIIILLL;
            if (mTAwemeListFragment4 != null) {
                mTAwemeListFragment4.Ii(false);
            }
        }
        if (this.LLJJIJIIJIL == aq(3) && (profileListFragment4 = this.LLLIILIL) != null && (profileListFragment4.LJLLL() || ((user4 = getUser()) != null && user4.isBlock))) {
            ProfileListFragment profileListFragment5 = this.LLLIILIL;
            if (profileListFragment5 != null) {
                profileListFragment5.b(C10EU.LJIILL(getUser(), false));
            }
            ProfileListFragment profileListFragment6 = this.LLLIILIL;
            if (profileListFragment6 != null) {
                if (getUser() != null && (user3 = getUser()) != null && user3.isBlocked()) {
                    z = true;
                } else {
                    z = false;
                }
                profileListFragment6.ro(z);
            }
            ProfileListFragment profileListFragment7 = this.LLLIILIL;
            if (profileListFragment7 != null) {
                profileListFragment7.Ii(false);
            }
        }
        if (this.LLJJIJIIJIL == aq(18) && (profileListFragment3 = this.LLLIIL) != null && profileListFragment3.LJLLL()) {
            ProfileListFragment profileListFragment8 = this.LLLIIL;
            if (profileListFragment8 != null) {
                profileListFragment8.b(C10EU.LJIILL(getUser(), false));
            }
            ProfileListFragment profileListFragment9 = this.LLLIIL;
            if (profileListFragment9 != null) {
                profileListFragment9.Ii(false);
            }
        }
        if (this.LLJJIJIIJIL == aq(6) && (effectProfileListFragment = this.LLLLIILLL) != null && (effectProfileListFragment.LLJJI || ((user2 = getUser()) != null && user2.isBlock))) {
            EffectProfileListFragment effectProfileListFragment2 = this.LLLLIILLL;
            if (effectProfileListFragment2 != null) {
                effectProfileListFragment2.LLJJIJIIJIL = C10EU.LJIILL(getUser(), false);
            }
            EffectProfileListFragment effectProfileListFragment3 = this.LLLLIILLL;
            if (effectProfileListFragment3 != null) {
                if (getUser() == null || (user = getUser()) == null || !user.isBlocked()) {
                    z5 = false;
                }
                effectProfileListFragment3.LLJJIJI = z5;
            }
            EffectProfileListFragment effectProfileListFragment4 = this.LLLLIILLL;
            if (effectProfileListFragment4 != null) {
                effectProfileListFragment4.Ii(false);
            }
        }
        if (this.LLJJIJIIJIL == aq(16) && getUser() != null && (profileListFragment2 = this.LLLLIILL) != null) {
            profileListFragment2.Ii(false);
        }
        if (this.LLJJIJIIJIL == aq(19) && getUser() != null && (stickerStoreProfileListFragment = this.LLLLIL) != null) {
            stickerStoreProfileListFragment.Ii(false);
        }
        if (this.LLJJIJIIJIL == aq(21) && getUser() != null && (profileListFragment = this.LLLIIIL) != null) {
            profileListFragment.Ii(false);
        }
    }

    private final void Cv(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.m = Boolean.valueOf(z);
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.kS(z);
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.kS(z);
        }
        ProfileListFragment profileListFragment = this.LLLLIIL;
        if (profileListFragment != null) {
            profileListFragment.kS(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.kS(z);
        }
    }

    private final void Nu(int i) {
        IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility;
        if (this.LLLLLJIL && i == 0) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IHeaderRecommendUserCardAbility.class, null)) != null) {
                iHeaderRecommendUserCardAbility.mB1(getUser(), "auto_switch_tab");
            }
            this.LLLLLJIL = false;
        }
    }

    private final void Wv(int i) {
        User user;
        if (i == aq(0)) {
            if (this.LLLLLLLLLL && this.LLLLLLJ && getUser() != null && (user = getUser()) != null && !user.isBlock()) {
                C1257570ipX c1257570ipXRu = ru();
                c1257570ipXRu.LIZJ(c1257570ipXRu.LLILZIL);
                return;
            }
            return;
        }
        if (!this.LLLLLLJ) {
            return;
        }
        this.LLLLLLLLLL = true;
        clearAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Zu(java.lang.Integer r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L11
            int r1 = r3.intValue()
            X.0igQ r0 = X.EnumC1252760ihm.Companion
            r0.getClass()
            X.0ihm r1 = X.C1251920igQ.LIZ(r1)
            if (r1 != 0) goto L13
        L11:
            X.0ihm r1 = X.EnumC1252760ihm.UNKNOWN
        L13:
            com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment r0 = r2.LLLLIIIILLL
            if (r0 == 0) goto L1a
            r0.iS(r1)
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2.Zu(java.lang.Integer):void");
    }

    private final void cv(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.dS(z);
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.dS(z);
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.dS(z);
        }
        ProfileListFragment profileListFragment = this.LLLLIIL;
        if (profileListFragment != null) {
            profileListFragment.dS(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.dS(z);
        }
    }

    private final void hv(EnumC1253020iiC enumC1253020iiC) {
        int iAp = Ap(this.LLJJIJIIJIL);
        Fragment fragmentGp = Gp(this.LLJJIJIIJIL);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPublishPrivateData source: ");
        sbLIZ.append(enumC1253020iiC);
        sbLIZ.append(", pos: ");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", type: ");
        sbLIZ.append(iAp);
        C2188811AlT.LIZIZ(sbLIZ);
        if (fragmentGp == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1251820igG(fragmentGp, new ARunnableS25S0201000_19(iAp, fragmentGp, this, 4), null), 3);
    }

    private final void jv(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJIJIL = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.HP(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.HP(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.HP(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.HP(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLLLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LLIZLLLIL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLLIIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.HP(z);
        }
    }

    private final void nt(User user) {
        if (user != null && user.getGeneralPermission() != null && !TextUtils.isEmpty(user.getGeneralPermission().getProfileToast())) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
            c2344009Gk.LJIIIIZZ("show_type", uu(user));
            C20684815ws.LJIILLIIL("show_punish_toast", c2344009Gk.LIZ);
        }
    }

    private final void nv(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJI = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.ro(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.ro(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.ro(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.ro(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLLLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LLIZ = z;
        }
        ProfileListFragment profileListFragment3 = this.LLLIIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.ro(z);
        }
    }

    public static final C1249090ibr<ProfileComponents> ot(C1559260qg8<C1249090ibr<ProfileComponents>> c1559260qg8) {
        return c1559260qg8.getValue();
    }

    private final void ov(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJILJIL = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.Sl(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Sl(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.Sl(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.Sl(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLLLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LLJ = z;
        }
        ProfileListFragment profileListFragment3 = this.LLLIIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.Sl(z);
        }
    }

    private final void pv(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJILJILJ = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.vs(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.vs(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.vs(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.vs(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLLLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LLJI = z;
        }
        ProfileListFragment profileListFragment3 = this.LLLIIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.vs(z);
        }
    }

    public static final C1249090ibr<ProfileComponents> rt(C1559260qg8<C1249090ibr<ProfileComponents>> c1559260qg8) {
        return c1559260qg8.getValue();
    }

    private final void tv(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLILZLL = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.b(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.b(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.b(z);
        }
        EffectProfileListFragment effectProfileListFragment = this.LLLLIILLL;
        if (effectProfileListFragment != null) {
            effectProfileListFragment.LLJJIJIIJIL = z;
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.b(z);
        }
        ProfileListFragment profileListFragment3 = this.LLLIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.b(z);
        }
    }

    private final String uu(User user) {
        if (user.getGeneralPermission() == null) {
            return "";
        }
        int followToastType = user.getGeneralPermission().getFollowToastType();
        if (followToastType != 1) {
            if (followToastType != 2) {
                return "";
            }
            return "suspend";
        }
        return "ban";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) throws Throwable {
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null) {
            c1249090ibrIq.LL = profileComponents;
        }
        Vv();
        AwemePagerVM awemePagerVMXp = Xp();
        int i = this.LLJJIJIIJIL;
        awemePagerVMXp.getClass();
        awemePagerVMXp.setState(new AwS33S0001000_19(i, 21));
        C1257500ipQ c1257500ipQ = this.LLJLLL;
        if (c1257500ipQ != null) {
            HandlerHook.viewPostDelay(c1257500ipQ, new ARunnableS119S0100000_19(this, 120), 1000L);
        }
    }

    public final void Hv(C1257570ipX c1257570ipX) {
        this.LLLJL = c1257570ipX;
    }

    public final void Jv(boolean z) {
        this.LLLLL = z;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Kr(InterfaceC1258470iqz interfaceC1258470iqz) {
        this.LLLLZLL = interfaceC1258470iqz;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.InterfaceC1258060iqK
    public void LJIIJJI(int i) {
        super.LJIIJJI(i);
        Nu(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void LLIZ(String str) {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Ov(str, false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Mq(int i) {
        super.Mq(i);
        Wv(i);
        zv(EnumC1253020iiC.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean Pq(int i) {
        List<Integer> list;
        Integer num;
        C1260280itu c1260280itu;
        InterfaceC1257980iqC interfaceC1257980iqC;
        InterfaceC1257980iqC interfaceC1257980iqC2;
        boolean z = true;
        Gi1(true, true);
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.VT(false);
        }
        if (Math.abs(i) > 0 && (list = this.LLJJ) != null && (num = (Integer) C13LP.LJJJLZIJ(this.LLJJIJIIJIL, list)) != null) {
            if (num.intValue() == 16) {
                ComponentCallbacks componentCallbacks = this.LLLLIILL;
                if ((componentCallbacks instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC2 = (InterfaceC1257980iqC) componentCallbacks) != null) {
                    interfaceC1257980iqC2.q3(false);
                }
            } else {
                if (num.intValue() != 20 || (c1260280itu = this.LLJJIJI) == null) {
                    return false;
                }
                ComponentCallbacks componentCallbacks2 = this.LLLIIIIL;
                if ((componentCallbacks2 instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC = (InterfaceC1257980iqC) componentCallbacks2) != null) {
                    if (c1260280itu.getScrollY() < c1260280itu.getMaxY()) {
                        z = false;
                    }
                    interfaceC1257980iqC.q3(z);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void R6(String str) throws Throwable {
        InterfaceC1257980iqC interfaceC1257980iqC;
        InterfaceC1257980iqC interfaceC1257980iqC2;
        InterfaceC1257980iqC interfaceC1257980iqC3;
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            C1259360isQ c1259360isQ = profileLikesAwemeListFragment.LLJJL;
            if (c1259360isQ != null) {
                c1259360isQ.LLJL = str;
            }
            profileLikesAwemeListFragment.LLJZIJLIL = str;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            C1259360isQ c1259360isQ2 = profileBaseAwemeListFragment.LLJJL;
            if (c1259360isQ2 != null) {
                c1259360isQ2.LLJL = str;
            }
            profileBaseAwemeListFragment.LLJZIJLIL = str;
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLLLLLJ = str;
            C1259360isQ c1259360isQ3 = mTAwemeListFragment.LLJJJ;
            if (c1259360isQ3 != null) {
                c1259360isQ3.LLJL = str;
            }
        }
        if (str != null && !a0.LJJJIL(str)) {
            ComponentCallbacks componentCallbacks = this.LLLIIIIL;
            if ((componentCallbacks instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC3 = (InterfaceC1257980iqC) componentCallbacks) != null) {
                interfaceC1257980iqC3.PB(str);
            }
            ComponentCallbacks componentCallbacks2 = this.LLLLIILL;
            if ((componentCallbacks2 instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC2 = (InterfaceC1257980iqC) componentCallbacks2) != null) {
                interfaceC1257980iqC2.PB(str);
            }
            ComponentCallbacks componentCallbacks3 = this.LLLLILI;
            if ((componentCallbacks3 instanceof InterfaceC1257980iqC) && (interfaceC1257980iqC = (InterfaceC1257980iqC) componentCallbacks3) != null) {
                interfaceC1257980iqC.PB(str);
            }
            User user = getUser();
            if (user != null && C10EU.LJFF(user) == 18) {
                Lo(user);
            }
        }
    }

    public final void Rv(boolean z) {
        ru().LIZJ(z);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void So(int i) throws Throwable {
        Fragment fragmentLJI;
        String uniqueId;
        String str;
        Fragment fragmentLJI2;
        Fragment fragment;
        String uniqueId2;
        String uid;
        int followStatus;
        int followStatus2;
        ProfileListFragment profileListFragment;
        Fragment fragmentLJI3;
        FragmentManager childFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment next;
        TabSetting tabSetting;
        StickerTab stickerTab;
        C1252230igv c1252230igv;
        String str2;
        Long lLJIILIIL;
        Bundle bundle;
        long jLongValue;
        Long lLJIILIIL2;
        C1252230igv c1252230igv2;
        HashMap<String, String> map;
        C1252230igv c1252230igv3;
        HashMap<String, String> map2;
        Fragment fragmentLJ;
        C0PSA c0psaQ3;
        Long lLJIILIIL3;
        dt(i);
        String str3 = "";
        boolean z = true;
        int i2 = 1;
        if (i != 0) {
            if (i != 6) {
                Map<String, String> mapLJ = null;
                ProfileListFragment profileListFragment2 = null;
                SeriesProfileFragment seriesProfileFragment = null;
                BusinessPageFragment businessPageFragment = null;
                String str4 = null;
                String secUid = null;
                Map<String, String> mapLJ2 = null;
                uniqueId = null;
                String uniqueId3 = null;
                String str5 = "others_homepage";
                if (i != 12) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                long jLongValue2 = 0;
                                switch (i) {
                                    case 14:
                                        User user = getUser();
                                        if (user != null) {
                                            String eventType = getEventType();
                                            if (eventType != null) {
                                                str5 = eventType;
                                            }
                                            if (this.LLLIIIIL == null) {
                                                Bundle bundleWt = wt(str5, user);
                                                if (user.tabType == 14 && (fragmentLJI2 = C724240Sb0.LJI(this)) != null) {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    linkedHashMap.put("shop_traffic_from", "tab_from_default");
                                                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                                                    PageFinder pageFinderVia = PageFinder.via(fragmentLJI2);
                                                    BcmParams bcmParams = new BcmParams();
                                                    bcmParams.merge(linkedHashMap);
                                                    btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
                                                }
                                                ProfileListFragment profileListFragmentCreateProfileTab = ShowcaseSaaSService.LIZ().createProfileTab(i);
                                                if (profileListFragmentCreateProfileTab != null) {
                                                    profileListFragmentCreateProfileTab.setArguments(bundleWt);
                                                } else {
                                                    profileListFragmentCreateProfileTab = null;
                                                }
                                                this.LLLIIIIL = profileListFragmentCreateProfileTab;
                                            }
                                            Jo(this.LLLIIIIL, 20);
                                            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                                            String str6 = this.LLLLLLIL;
                                            if (user.tabType == 14) {
                                                str = "default_product_tab";
                                            } else {
                                                str = "shop_list";
                                            }
                                            Fragment fragmentLJI4 = C724240Sb0.LJI(this);
                                            if (fragmentLJI4 != null) {
                                                mapLJ2 = C1733740vDY.LJ(fragmentLJI4, "c9203.d0");
                                            }
                                            C1253930ijf.LJJIIJ(c1253930ijf, "others_homepage", 0, str5, user, str6, str, mapLJ2, 192);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (this.LLLIIL == null) {
                                            ProfileListFragment profileListFragmentLJFF = C1360460lVU.LIZIZ.LJFF();
                                            if (profileListFragmentLJFF != null && (fragmentLJI3 = C724240Sb0.LJI(this)) != null && (childFragmentManager = fragmentLJI3.getChildFragmentManager()) != null && (listLJJLIIIJL = childFragmentManager.LJJLIIIJL()) != null) {
                                                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (next.getClass() == profileListFragmentLJFF.getClass()) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                fragment = next;
                                            } else {
                                                fragment = null;
                                            }
                                            if ((fragment instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) fragment) != null) {
                                                this.LLLIIL = profileListFragment;
                                            } else {
                                                if (profileListFragmentLJFF != null) {
                                                    profileListFragmentLJFF.nS(Bq(), wq());
                                                    Bundle bundle2 = new Bundle();
                                                    C786410Ut5.LJJJI("enter_from", "others_homepage", bundle2);
                                                    int followerStatus = -1;
                                                    bundle2.putInt("bottom_bar_height", -1);
                                                    bundle2.putBoolean("private_account", C10EU.LJIILL(getUser(), false));
                                                    User user2 = getUser();
                                                    if (user2 != null) {
                                                        uniqueId2 = user2.getUniqueId();
                                                    } else {
                                                        uniqueId2 = null;
                                                    }
                                                    C786410Ut5.LJJJI("user_unique_id", uniqueId2, bundle2);
                                                    User user3 = getUser();
                                                    if (user3 != null) {
                                                        uid = user3.getUid();
                                                    } else {
                                                        uid = null;
                                                    }
                                                    C786410Ut5.LJJJI("uid", uid, bundle2);
                                                    User user4 = getUser();
                                                    if (user4 != null) {
                                                        secUid = user4.getSecUid();
                                                    }
                                                    C786410Ut5.LJJJI("sec_user_id", secUid, bundle2);
                                                    C786410Ut5.LJJJI("previous_page", getPreviousPage(), bundle2);
                                                    User user5 = getUser();
                                                    if (user5 != null) {
                                                        followStatus = user5.getFollowStatus();
                                                    } else {
                                                        followStatus = -1;
                                                    }
                                                    bundle2.putInt("follow_status", followStatus);
                                                    profileListFragmentLJFF.setArguments(bundle2);
                                                    profileListFragmentLJFF.setPreviousPage(getPreviousPage());
                                                    User user6 = getUser();
                                                    if (user6 != null) {
                                                        followStatus2 = user6.getFollowStatus();
                                                    } else {
                                                        followStatus2 = -1;
                                                    }
                                                    profileListFragmentLJFF.gS(followStatus2);
                                                    User user7 = getUser();
                                                    if (user7 != null) {
                                                        followerStatus = user7.getFollowerStatus();
                                                    }
                                                    profileListFragmentLJFF.hS(followerStatus);
                                                }
                                                this.LLLIIL = profileListFragmentLJFF;
                                            }
                                        }
                                        if (jr()) {
                                            str5 = "personal_homepage";
                                        }
                                        C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
                                        getContext();
                                        String strBq = Bq();
                                        c1253930ijf2.getClass();
                                        C1253930ijf.LJIJI("repost_history_show", str5, strBq, "");
                                        Jo(this.LLLIIL, 18);
                                        break;
                                    case 16:
                                        if (this.LLLLIL == null) {
                                            StickerStoreProfileListFragment stickerStoreProfileListFragment = new StickerStoreProfileListFragment();
                                            Bundle bundle3 = new Bundle();
                                            C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
                                            if (c1249090ibrIq != null && (c1252230igv = c1249090ibrIq.LLIZLLLIL) != null && (str2 = c1252230igv.LLILLL) != null) {
                                                str4 = str2;
                                            } else {
                                                C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
                                                if (c1249090ibrIq2 != null) {
                                                    str4 = c1249090ibrIq2.LLILLL;
                                                }
                                            }
                                            C786410Ut5.LJJJI("enter_from", str4, bundle3);
                                            C786410Ut5.LJJJI("uid", Bq(), bundle3);
                                            C786410Ut5.LJJJI("sec_userid", wq(), bundle3);
                                            bundle3.putBoolean("is_self", false);
                                            User user8 = getUser();
                                            if (user8 != null && (tabSetting = user8.getTabSetting()) != null && (stickerTab = tabSetting.stickerTab) != null) {
                                                Boolean bool = stickerTab.showStickerSetSticker;
                                                if (bool != null) {
                                                    bundle3.putBoolean("key_show_sticker_set_sticker", bool.booleanValue());
                                                }
                                                Boolean bool2 = stickerTab.showVideoSticker;
                                                if (bool2 != null) {
                                                    bundle3.putBoolean("key_show_video_sticker", bool2.booleanValue());
                                                }
                                                Integer num = stickerTab.stickerSetCount;
                                                if (num != null) {
                                                    bundle3.putInt("key_sticker_set_count", num.intValue());
                                                }
                                                Integer num2 = stickerTab.videoStickerCount;
                                                if (num2 != null) {
                                                    bundle3.putInt("key_video_sticker_count", num2.intValue());
                                                }
                                            }
                                            stickerStoreProfileListFragment.setArguments(bundle3);
                                            this.LLLLIL = stickerStoreProfileListFragment;
                                        }
                                        Jo(this.LLLLIL, 19);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        User user9 = getUser();
                                        if (user9 != null) {
                                            if (this.LLLIIIL == null) {
                                                BusinessPageFragment businessPageFragmentLJIIIZ = BAProfilePageServiceImpl.LJIIL().LJIIIZ(AFwS207S0000000_19.get$arr$(571), false);
                                                if (businessPageFragmentLJIIIZ != null) {
                                                    Bundle bundle4 = new Bundle();
                                                    C786410Ut5.LJJJI("enter_from", "others_homepage", bundle4);
                                                    C786410Ut5.LJJJI("author_id", user9.getUid(), bundle4);
                                                    C786410Ut5.LJJJI("user_handle", C10EU.LIZJ(user9), bundle4);
                                                    String bioUrl = user9.getBioUrl();
                                                    if (bioUrl == null) {
                                                        bioUrl = "";
                                                    }
                                                    C786410Ut5.LJJJI("web_url", bioUrl, bundle4);
                                                    String bioSecureUrl = user9.getBioSecureUrl();
                                                    if (bioSecureUrl != null) {
                                                        str3 = bioSecureUrl;
                                                    }
                                                    C786410Ut5.LJJJI("secure_web_url", str3, bundle4);
                                                    businessPageFragmentLJIIIZ.setArguments(bundle4);
                                                    businessPageFragment = businessPageFragmentLJIIIZ;
                                                }
                                                this.LLLIIIL = businessPageFragment;
                                            }
                                            Jo(this.LLLIIIL, 21);
                                            break;
                                        }
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        if (this.LLLLILI == null) {
                                            ISeriesProfileService iSeriesProfileService = (ISeriesProfileService) ServiceManager.get().getService(ISeriesProfileService.class);
                                            String strBq2 = Bq();
                                            if (strBq2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strBq2)) != null) {
                                                jLongValue2 = lLJIILIIL.longValue();
                                            }
                                            SeriesProfileFragment seriesProfileFragmentLIZIZ = iSeriesProfileService.LIZIZ(new C1279104zV(jLongValue2, jr(), false));
                                            if (seriesProfileFragmentLIZIZ instanceof ProfileListFragment) {
                                                seriesProfileFragment = seriesProfileFragmentLIZIZ;
                                            }
                                            this.LLLLILI = seriesProfileFragment;
                                        }
                                        ProfileListFragment profileListFragment3 = this.LLLLILI;
                                        if (profileListFragment3 != null) {
                                            Jo(profileListFragment3, 22);
                                        }
                                        break;
                                    case 19:
                                        if (this.LLLLJI == null) {
                                            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                                            if (iLiveOuterService != null && (c0psaQ3 = iLiveOuterService.Q3()) != null) {
                                                fragmentLJ = c0psaQ3.LJ();
                                            } else {
                                                fragmentLJ = null;
                                            }
                                            if (fragmentLJ instanceof ProfileListFragment) {
                                                profileListFragment2 = (ProfileListFragment) fragmentLJ;
                                            }
                                            this.LLLLJI = profileListFragment2;
                                        }
                                        ProfileListFragment profileListFragment4 = this.LLLLJI;
                                        if (profileListFragment4 != null) {
                                            C1559260qg8 c1559260qg8 = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "root_data"), checkSupervisorPrepared());
                                            C1559260qg8 c1559260qg82 = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "header"), checkSupervisorPrepared());
                                            C1249090ibr<ProfileComponents> c1249090ibrOt = ot(c1559260qg8);
                                            if (c1249090ibrOt != null && (c1252230igv3 = c1249090ibrOt.LLIZLLLIL) != null && (map2 = c1252230igv3.LLJILJILJ) != null) {
                                                map2.put("to_acc_type", "org_acc");
                                            }
                                            C1249090ibr<ProfileComponents> c1249090ibrRt = rt(c1559260qg82);
                                            if (c1249090ibrRt != null && (c1252230igv2 = c1249090ibrRt.LLIZLLLIL) != null && (map = c1252230igv2.LLJILJILJ) != null) {
                                                map.put("to_acc_type", "org_acc");
                                            }
                                            try {
                                                bundle = new Bundle();
                                                String strBq3 = Bq();
                                                if (strBq3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strBq3)) != null) {
                                                    jLongValue = lLJIILIIL2.longValue();
                                                } else {
                                                    jLongValue = 0;
                                                }
                                                bundle.putLong("CreatorUid", jLongValue);
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                bundle = new Bundle();
                                                bundle.putLong("CreatorUid", 0L);
                                            }
                                            profileListFragment4.setArguments(bundle);
                                            Jo(profileListFragment4, 23);
                                        }
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        if (this.LLLLJ == null) {
                                            IDramaProfileHistoryTabService.LIZ.getClass();
                                            IDramaProfileHistoryTabService value = C1257470ipN.LIZIZ.getValue();
                                            if (value != null) {
                                                String strBq4 = Bq();
                                                if (strBq4 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(strBq4)) != null) {
                                                    jLongValue2 = lLJIILIIL3.longValue();
                                                }
                                                new C1279004zU(jLongValue2, jr(), false);
                                                value.LIZ();
                                            }
                                            this.LLLLJ = null;
                                        }
                                        ProfileListFragment profileListFragment5 = this.LLLLJ;
                                        if (profileListFragment5 != null) {
                                            Jo(profileListFragment5, 26);
                                        }
                                        break;
                                    case 21:
                                        yu();
                                        break;
                                }
                                return;
                            }
                            if (this.LLLLIILLL == null) {
                                EffectProfileListFragment effectProfileListFragmentTp = AwemePagerAssem.tp(this, 0, 1, null);
                                this.LLLLIILLL = effectProfileListFragmentTp;
                                if (effectProfileListFragmentTp != null) {
                                    effectProfileListFragmentTp.An(C1259870itF.LIZ(6));
                                }
                            }
                            EffectProfileListFragment effectProfileListFragment = this.LLLLIILLL;
                            if (effectProfileListFragment != null) {
                                effectProfileListFragment.nS(Bq(), wq());
                            }
                            Jo(this.LLLLIILLL, 6);
                            if (!C1656550tD3.LIZIZ()) {
                                return;
                            }
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1637190shp(this, null), 3);
                            return;
                        }
                        if (this.LLLIILIL == null) {
                            ProfileListFragment profileListFragmentTp = AwemePagerAssem.Tp(this, 0, dq(), 1, null);
                            this.LLLIILIL = profileListFragmentTp;
                            if (profileListFragmentTp != null) {
                                profileListFragmentTp.An(C1259870itF.LIZ(3));
                            }
                        }
                        ProfileListFragment profileListFragment6 = this.LLLIILIL;
                        if (profileListFragment6 == null) {
                            return;
                        }
                        IProfileMusicTabService iProfileMusicTabServiceJp = Jp();
                        if (iProfileMusicTabServiceJp != null) {
                            iProfileMusicTabServiceJp.LJIILJJIL(profileListFragment6, new InterfaceC633510Ot3() { // from class: X.0iq8
                                @Override // X.InterfaceC633510Ot3
                                public final void LIZ() {
                                    this.LIZ.Jq();
                                }
                            });
                        }
                        IProfileMusicTabService iProfileMusicTabServiceJp2 = Jp();
                        if (iProfileMusicTabServiceJp2 != null) {
                            User user10 = getUser();
                            if (user10 != null) {
                                uniqueId = user10.getUniqueId();
                            } else {
                                uniqueId = null;
                            }
                            if (TextUtils.isEmpty(uniqueId)) {
                                User user11 = getUser();
                                if (user11 != null) {
                                    uniqueId3 = user11.getShortId();
                                }
                            } else {
                                User user12 = getUser();
                                if (user12 != null) {
                                    uniqueId3 = user12.getUniqueId();
                                }
                            }
                            iProfileMusicTabServiceJp2.LJIIIIZZ(profileListFragment6, uniqueId3);
                        }
                        profileListFragment6.nS(Bq(), wq());
                        Jo(profileListFragment6, 3);
                        return;
                    }
                    Bu();
                    return;
                }
                User user13 = getUser();
                if (user13 == null) {
                    return;
                }
                if (this.LLLLIILL == null) {
                    Bundle bundleUt = ut();
                    C786410Ut5.LJJIJL(bundleUt, "user", new MiniUser(user13));
                    if (user13.tabType == 12 && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("shop_traffic_from", "tab_from_default");
                        BtmSDK btmSDK2 = BtmSDK.INSTANCE;
                        PageFinder pageFinderVia2 = PageFinder.via(fragmentLJI);
                        BcmParams bcmParams2 = new BcmParams();
                        bcmParams2.merge(linkedHashMap2);
                        btmSDK2.setBcmPageParams(pageFinderVia2, bcmParams2, Boolean.FALSE);
                    }
                    ProfileListFragment profileListFragmentCreateProfileTab2 = ShowcaseSaaSService.LIZ().createProfileTab(i);
                    this.LLLLIILL = profileListFragmentCreateProfileTab2;
                    if (profileListFragmentCreateProfileTab2 != null) {
                        profileListFragmentCreateProfileTab2.setArguments(bundleUt);
                    }
                }
                Jo(this.LLLLIILL, 16);
                IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
                if (iECommerceShowcaseService == null) {
                    return;
                }
                String strValueOf = String.valueOf(getEventType());
                String strBq5 = Bq();
                if (user13.getFollowStatus() == 0) {
                    i2 = 0;
                }
                Integer numValueOf = Integer.valueOf(i2);
                String previousPage = getPreviousPage();
                if (previousPage != null || (previousPage = getEventType()) != null) {
                    str5 = previousPage;
                }
                String str7 = this.LLLLLL;
                String str8 = this.LLLLLJLJLL;
                String str9 = this.LLLLLLIL;
                Fragment fragmentLJI5 = C724240Sb0.LJI(this);
                if (fragmentLJI5 != null) {
                    mapLJ = C1733740vDY.LJ(fragmentLJI5, "c8467.d0");
                }
                iECommerceShowcaseService.LJIIIIZZ(strValueOf, "others_homepage", "showcase_list", strBq5, false, numValueOf, str5, str7, str8, str9, null, mapLJ);
                return;
            }
            if (this.LLLLIIL == null) {
                CollectProfileListFragment collectProfileListFragmentLIZ = C1257640ipe.LIZ(getUser(), getPreviousPage(), false, false);
                this.LLLLIIL = collectProfileListFragmentLIZ;
                collectProfileListFragmentLIZ.An(C1259870itF.LIZ(8));
            }
            Jo(this.LLLLIIL, 8);
            return;
        }
        if (this.LLLLIIIILLL == null) {
            this.LLLLIIIILLL = At(0, 0);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment == null) {
            return;
        }
        if (C1260030itV.LIZ()) {
            mTAwemeListFragment.Gn(getUser());
        }
        mTAwemeListFragment.LLJL = ip();
        mTAwemeListFragment.LLLII = It();
        mTAwemeListFragment.LLLIIII = Nt();
        if (this.LLJJIJIIJIL != Us()) {
            z = false;
        }
        mTAwemeListFragment.LLJJ = z;
        mTAwemeListFragment.An(C1259870itF.LIZ(0));
        mTAwemeListFragment.setPreviousPage(getPreviousPage());
        mTAwemeListFragment.n = St();
        getEventType();
        mTAwemeListFragment.o = ku();
        mTAwemeListFragment.t = Wt();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C1252480ihK c1252480ihKFt = Ft();
        if (c1252480ihKFt != null) {
            C1252470ihJ.LIZJ(c1252480ihKFt, linkedHashMap3);
        }
        Map<String, String> mapPt = Pt();
        if (mapPt != null) {
            linkedHashMap3.putAll(mapPt);
            if (Ft() == null) {
                String eventType2 = getEventType();
                if (eventType2 != null) {
                    str3 = eventType2;
                }
                linkedHashMap3.put("enter_from_merge", str3);
            }
        }
        mTAwemeListFragment.LLJILJILJ = linkedHashMap3;
        String strEt = Et();
        mTAwemeListFragment.LLLLLLJ = strEt;
        C1259360isQ c1259360isQ = mTAwemeListFragment.LLJJJ;
        if (c1259360isQ != null) {
            c1259360isQ.LLJL = strEt;
        }
        mTAwemeListFragment.LLLZLZ = Ct();
        mTAwemeListFragment.nS(Bq(), wq());
        Jo(mTAwemeListFragment, 0);
        C1253160iiQ.LIZ.getClass();
        C1253160iiQ.LIZ(new C1253210iiV());
        kt();
    }

    public final void Tu(ProfileBaseAwemeListFragment profileBaseAwemeListFragment) {
        this.LLLLII = profileBaseAwemeListFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void UO(C1253260iia c1253260iia) {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLLZLZ = c1253260iia;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public void Xr(String str) {
        this.LLLLZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zv(boolean r4) {
        /*
            r3 = this;
            boolean r0 = X.C2532609wC.LIZLLL()
            if (r0 == 0) goto L7
            return
        L7:
            r2 = 1
            if (r4 != 0) goto L17
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = X.C1257750ipp.LIZ(r0)
            if (r0 != r2) goto L18
        L17:
            r1 = 1
        L18:
            r0 = r1 ^ 1
            r3.dI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2.Zv(boolean):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public List<Integer> bt(User user) {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        if (iq() == null) {
            return super.bt(user);
        }
        C1249040ibm c1249040ibm = C1249040ibm.LIZ;
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (profileComponents = c1249090ibrIq.LL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        User user2 = getUser();
        c1249040ibm.getClass();
        return C1249040ibm.LIZIZ(user2, list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public List<Integer> ct(String str) {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        if (iq() == null) {
            return super.ct(str);
        }
        C1249040ibm c1249040ibm = C1249040ibm.LIZ;
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (profileComponents = c1249090ibrIq.LL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        User user = getUser();
        c1249040ibm.getClass();
        return C1249040ibm.LIZIZ(user, list);
    }

    public final void fv(ProfileListFragment profileListFragment) {
        this.LLLLIIL = profileListFragment;
    }

    public final void gv(EffectProfileListFragment effectProfileListFragment) {
        this.LLLLIILLL = effectProfileListFragment;
    }

    public final void iv(ProfileLikesAwemeListFragment profileLikesAwemeListFragment) {
        this.LLLL = profileLikesAwemeListFragment;
    }

    public final void kv(boolean z) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLJ = z;
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.Wb(z);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Wb(z);
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.Wb(z);
        }
        ProfileListFragment profileListFragment2 = this.LLLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.Wb(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLLLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LLILZLL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLLIIIL;
        if (profileListFragment3 != null) {
            profileListFragment3.Wb(z);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, X.InterfaceC1258060iqK
    public void onSelect(int i) {
        super.onSelect(i);
        if (this.LLJJJJJIL) {
            nr(i);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Map<String, String> mapFetchSearchParams;
        Fragment fragmentLJI;
        Fragment fragmentLJI2;
        boolean zLIZ = C1260030itV.LIZ();
        String strEt = null;
        if (zLIZ && (fragmentLJI2 = C724240Sb0.LJI(this)) != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), this, UserAwemePagerAbility.class, null, null);
        }
        super.onViewCreated(view);
        if (!zLIZ && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, UserAwemePagerAbility.class, null, null);
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI3, null), this, UserAwemePagerAbility.class, null, null);
        }
        if (C703302op.LIZ(Yt())) {
            strEt = Yt();
        } else if (C703302op.LIZ(Ut())) {
            strEt = Ut();
        } else if (C703302op.LIZ(Et())) {
            strEt = Et();
        }
        this.LLLLLLIL = strEt;
        if (this.LLLLLJLJLL == null && this.LLLLLL == null && C703302op.LIZ(getEventType()) && (mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(getEventType(), "")) != null && !mapFetchSearchParams.isEmpty()) {
            this.LLLLLJLJLL = mapFetchSearchParams.get("search_result_id");
            this.LLLLLL = mapFetchSearchParams.get("search_id");
        }
        if (C1260030itV.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0ipy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 180), 4);
            C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0ipv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1158970gGV) obj).LLILLJJLI);
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 181), 4);
        } else {
            C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0ipz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJJL;
                }
            }, null, new AwS633S0100000_19(this, 182), 6);
            C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0ipw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1158970gGV) obj).LLILLJJLI);
                }
            }, null, new AwS633S0100000_19(this, 183), 6);
        }
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0dW4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJILJILJ;
            }
        }, null, new AwS633S0100000_19(this, 184), 6);
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0dW3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJJIL;
            }
        }, null, new AwS633S0100000_19(this, 185), 6);
        jq().FQ2(new AwS598S0100000_19(this, 497));
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0dW2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJJ;
            }
        }, null, new AwS633S0100000_19(this, 186), 6);
        C736680Sv4.LJIIIZ(this, jq(), new C2217381BqS() { // from class: X.0ips
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJ;
            }
        }, new C2217381BqS() { // from class: X.0iq5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJJIL;
            }
        }, null, new AwS668S0100000_19(this, 34), 12);
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0iq0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJLIIIJLLLLLLLZ;
            }
        }, null, new AwS633S0100000_19(this, 187), 6);
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0iq6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJL;
            }
        }, null, new AwS633S0100000_19(this, 188), 6);
        C736680Sv4.LJIIIIZZ(this, jq(), new C2217381BqS() { // from class: X.0iq7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 179), 4);
    }

    public final void wv(String str) {
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLLLZLLLI = str;
        }
    }

    public final void yv(MTAwemeListFragment mTAwemeListFragment) {
        this.LLLLIIIILLL = mTAwemeListFragment;
    }

    public final void zv(EnumC1253020iiC enumC1253020iiC) {
        if (C0BI9.LIZ()) {
            hv(enumC1253020iiC);
        } else {
            Av(enumC1253020iiC);
        }
    }

    private final MTAwemeListFragment At(int i, int i2) {
        Fragment fragmentLJJJJZI;
        MTAwemeListFragment mTAwemeListFragment;
        Bundle arguments;
        C1252230igv c1252230igv;
        String str;
        String str2;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(i2);
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            fragmentLJJJJZI = null;
        }
        if (fragmentLJJJJZI instanceof MTAwemeListFragment) {
            mTAwemeListFragment = (MTAwemeListFragment) fragmentLJJJJZI;
        } else {
            mTAwemeListFragment = null;
        }
        Bundle bundle = new Bundle();
        int[] iArrQu = qu();
        if (iArrQu != null && iArrQu.length != 0) {
            bundle.putIntArray("traffic_source_list", qu());
        }
        String strDq = dq();
        if (strDq != null && strDq.length() > 0) {
            C786410Ut5.LJJJI("profile_enter_method", strDq, bundle);
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (str2 = c1249090ibrIq.LLILLL) != null && str2.length() > 0) {
            C786410Ut5.LJJJI("enter_from", str2, bundle);
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
        if (c1249090ibrIq2 != null && (c1252230igv = c1249090ibrIq2.LLIZLLLIL) != null && (str = c1252230igv.LLILZIL) != null && str.length() > 0) {
            C786410Ut5.LJJJI("rfevent_previous_page", str, bundle);
        }
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
            C786410Ut5.LJJIIJZLJL(bundle, arguments);
        }
        if (mTAwemeListFragment == null) {
            return MTAwemeListFragment.HU(-1, i, Bq(), wq(), false, true, false, bundle);
        }
        return mTAwemeListFragment;
    }

    private final Bundle wt(String str, User user) {
        String str2;
        String aid;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        if (user.tabType == 14) {
            str2 = "default_product_tab";
        } else {
            str2 = "shop_list";
        }
        C786410Ut5.LJJJI("entrance_type", str2, bundle);
        C786410Ut5.LJJJI("list_source_content_id", this.LLLLLLIL, bundle);
        C786410Ut5.LJJJI("source_previous_page", "others_homepage", bundle);
        bundle.putIntArray("traffic_source_list", qu());
        C786410Ut5.LJJIJL(bundle, "user", new MiniUser(user));
        C786410Ut5.LJJJI("trackParams", nu(), bundle);
        Aweme aweme = jq().getState().LLJILJILJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C786410Ut5.LJJJI("group_id", aid, bundle);
        return bundle;
    }

    public final void Fv(String str, String str2) {
        String uniqueId;
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.nS(str, str2);
            IProfileMusicTabService iProfileMusicTabServiceJp = Jp();
            if (iProfileMusicTabServiceJp != null) {
                User user = getUser();
                String uniqueId2 = null;
                if (user != null) {
                    uniqueId = user.getUniqueId();
                } else {
                    uniqueId = null;
                }
                if (TextUtils.isEmpty(uniqueId)) {
                    User user2 = getUser();
                    if (user2 != null) {
                        uniqueId2 = user2.getShortId();
                    }
                } else {
                    User user3 = getUser();
                    if (user3 != null) {
                        uniqueId2 = user3.getUniqueId();
                    }
                }
                iProfileMusicTabServiceJp.LJIIIIZZ(profileListFragment, uniqueId2);
            }
        }
        EffectProfileListFragment effectProfileListFragment = this.LLLLIILLL;
        if (effectProfileListFragment != null) {
            effectProfileListFragment.nS(str, str2);
        }
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = this.LLLLII;
        if (profileBaseAwemeListFragment != null) {
            profileBaseAwemeListFragment.nS(str, str2);
        }
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = this.LLLL;
        if (profileLikesAwemeListFragment != null) {
            profileLikesAwemeListFragment.LLIZ = str;
            profileLikesAwemeListFragment.LLIZLLLIL = str2;
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLLLIIIILLL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.nS(str, str2);
        }
        ProfileListFragment profileListFragment2 = this.LLLIIL;
        if (profileListFragment2 != null) {
            profileListFragment2.nS(str, str2);
        }
        ProfileListFragment profileListFragment3 = this.LLLLILI;
        if (profileListFragment3 != null) {
            profileListFragment3.nS(str, str2);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void Gi1(boolean z, boolean z2) {
        Object obj;
        List<ProfileListFragment> list = this.LLJILLL;
        if (list != null && this.LLJJIJIIJIL < list.size()) {
            List<ProfileListFragment> list2 = this.LLJILLL;
            ComponentCallbacks componentCallbacks = null;
            if (list2 != null) {
                obj = ListProtector.get(list2, this.LLJJIJIIJIL);
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC1257400ipG) {
                List<ProfileListFragment> list3 = this.LLJILLL;
                if (list3 != null) {
                    componentCallbacks = (ProfileListFragment) ListProtector.get(list3, this.LLJJIJIIJIL);
                }
                InterfaceC1257400ipG interfaceC1257400ipG = (InterfaceC1257400ipG) componentCallbacks;
                if (interfaceC1257400ipG != null) {
                    if (z) {
                        interfaceC1257400ipG.aD(false, z2);
                    } else {
                        interfaceC1257400ipG.oF();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean Ys(User user, int i) {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        C1249040ibm c1249040ibm = C1249040ibm.LIZ;
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (profileComponents = c1249090ibrIq.LL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        User user2 = getUser();
        c1249040ibm.getClass();
        return ((ArrayList) C1249040ibm.LIZIZ(user2, list)).contains(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem
    public boolean at(String str, int i) {
        InterfaceC546120LbO interfaceC546120LbOLIZIZ;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(0, 2);
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null && (interfaceC546120LbOLIZIZ = aITheaterProfileServiceLIZ.LIZIZ()) != null && interfaceC546120LbOLIZIZ.LIZLLL()) {
            listLJIILJJIL.add(21);
        }
        return listLJIILJJIL.contains(Integer.valueOf(i));
    }

    private final void Ju(InterfaceC1257980iqC interfaceC1257980iqC, User user, int i) {
        if (Ys(user, i)) {
            interfaceC1257980iqC.za(new MiniUser(user));
        }
    }
}
