package com.ss.android.ugc.profile.business.profile.ui.v2;

import X.C013C;
import X.C01GW;
import X.C059B;
import X.C098200Yq;
import X.C0BI9;
import X.C0BMT;
import X.C0CJG;
import X.C0GUC;
import X.C0K77;
import X.C0OGM;
import X.C0PEM;
import X.C0PSL;
import X.C0S4U;
import X.C0SE5;
import X.C0SSX;
import X.C0W93;
import X.C0X35;
import X.C0X37;
import X.C0XKC;
import X.C1020810cff;
import X.C1075590e61;
import X.C10EU;
import X.C1209900hae;
import X.C123100dR;
import X.C1245340iVo;
import X.C1248210iaR;
import X.C1249540ica;
import X.C1250160ida;
import X.C1250210idf;
import X.C1250680ieQ;
import X.C1251390ifZ;
import X.C1251760igA;
import X.C1251850igJ;
import X.C1252220igu;
import X.C1252480ihK;
import X.C1252610ihX;
import X.C1252710ihh;
import X.C1253080iiI;
import X.C1253100iiK;
import X.C1253110iiL;
import X.C1253130iiN;
import X.C1253140iiO;
import X.C1253150iiP;
import X.C1253160iiQ;
import X.C1253180iiS;
import X.C1253190iiT;
import X.C1253200iiU;
import X.C1253220iiW;
import X.C1253260iia;
import X.C1253310iif;
import X.C1253330iih;
import X.C1253340iii;
import X.C1253360iik;
import X.C1253420iiq;
import X.C1253470iiv;
import X.C1253930ijf;
import X.C1255980imy;
import X.C1256070in7;
import X.C1256610inz;
import X.C1259950itN;
import X.C1260030itV;
import X.C1260280itu;
import X.C1265520j2M;
import X.C1336205Ku;
import X.C1365870leD;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1513630pUX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581030rFF;
import X.C1595060rbs;
import X.C1599690rjL;
import X.C1642406bu;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1889007aa;
import X.C189200o6;
import X.C19406010w6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1CRB;
import X.C1ELC;
import X.C20673215v0;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2217401BqU;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2537109wv;
import X.C268330AfP;
import X.C287520BOs;
import X.C291001Au;
import X.C296970BkV;
import X.C299940BpI;
import X.C299970BpL;
import X.C299980BpM;
import X.C300140Bpc;
import X.C418440Gaw;
import X.C426750GoL;
import X.C443701o3;
import X.C452070Ho5;
import X.C452501pT;
import X.C486860J7k;
import X.C486890J7n;
import X.C616540OGe;
import X.C628000OkA;
import X.C680080Qly;
import X.C688120Qyw;
import X.C724750Sbp;
import X.C727520SgI;
import X.C736400Suc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C818480W8w;
import X.C823050WQl;
import X.C848450XQd;
import X.C888460YtI;
import X.C913080Zru;
import X.EnumC048600Fo;
import X.EnumC1251790igD;
import X.EnumC1253850ijX;
import X.EnumC1260930iux;
import X.EnumC1990407qw;
import X.EnumC2139108Zp;
import X.InterfaceC1252070igf;
import X.InterfaceC1253240iiY;
import X.InterfaceC1253300iie;
import X.InterfaceC1345705Ol;
import X.InterfaceC20660615sy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC744170THb;
import Y.AObserverS182S0200000_19;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS9S1000000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.experiment.FollowAddRedDotShowSceneExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.iap.component.IPgcPaymentService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.avatar.IAvatarMainAbility;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import com.ss.android.ugc.profile.business.profile.tab.api.ProfileTabApi;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgBizData;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgVideoInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS18S2000000_19;
import kotlin.jvm.internal.AwS25S0102000_3;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.AwS85S1000000_35;
import kotlin.jvm.internal.AwS91S0110000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class I18nUserProfileFragment extends I18nAbsProfileFragmentV2 implements UserProfileAbility, C0SSX, InterfaceC20660615sy, InterfaceC1253240iiY, C0OGM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODHELIOScjLyY/LWs5IGElemsFeHc9HTYpOx8hJyMlJSoVOiQrJCo9PA==";
    public C1CRB LLJJJIL;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJLIIIJLLLLLLLZ;
    public MutualStruct LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;
    public boolean LLLF;
    public Aweme LLLFF;
    public Map<String, String> LLLIIII;
    public int[] LLLIILIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public String LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public Integer LLLL;
    public boolean LLLLII;
    public C1260280itu LLLLIIIILLL;
    public String LLLLIIL;
    public ProfileUser LLLLJI;
    public ProfilePlatformViewModel LLLLLILLIL;
    public C1252480ihK LLLLLJIL;
    public long LLLLLL;
    public boolean LLLLLLJ;
    public int LLLLLLLLLL;
    public int LLLLLLZ;
    public String LLLLLLZZ;
    public InterfaceC1253300iie LLLLLZIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(388));
    public String LLJJL = "";
    public String LLJL = "";
    public String LLLFFI = "";
    public boolean LLLFZ = true;
    public String LLLI = "";
    public String LLLII = "";
    public final String LLLIIIIL = "";
    public String LLLIIIL = "";
    public String LLLIIL = "";
    public String LLLIL = "";
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2136));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(389));
    public final C01GW LLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(390));
    public final C01GW LLLLILI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(309));
    public boolean LLLLJ = true;
    public final C1252220igu LLLLL = new C1252220igu();
    public final C1253220iiW LLLLLIL = new C1253220iiW();
    public boolean LLLLLJLJLL = true;
    public boolean LLLLLLIL = true;
    public EnumC1990407qw LLLLLLL = EnumC1990407qw.LOAD_IDLE;
    public String LLLLLLLLL = "";
    public String LLLLLLLZIL = "";
    public boolean LLLLLZ = true;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(I18nUserProfileFragment.class, "_profilePlatformViewModel", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLLLLZL = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final boolean PR() {
        return false;
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 4;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "user_profile";
    }

    @Override // X.C0SSX
    public final void hJ() {
        this.LLLLLZ = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public final boolean q1() {
        return false;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final boolean NA() {
        return this.LLLLLLL == EnumC1990407qw.LOAD_DONE;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final Map<String, String> NR() {
        Map<String, String> map = this.LLLIIII;
        return map == null ? new LinkedHashMap() : map;
    }

    public final void OC1() {
        UserAwemePagerAbility userAwemePagerAbility;
        ((InterfaceC1252070igf) C1252710ihh.LIZJ(this, C13LE.LIZ(InterfaceC1252070igf.class))).oA(0, EnumC1251790igD.NORMAL);
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS == null || (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) == null) {
            return;
        }
        userAwemePagerAbility.OC1();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void RR() {
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String str = this.LL;
        String str2 = this.LLILZLL;
        c1253930ijf.getClass();
        C1253930ijf.LJJIFFI(str, "others_homepage", str2, "system_back");
    }

    public final void ZR() {
        User user;
        if (((Boolean) FollowAddRedDotShowSceneExp.LIZLLL.getValue()).booleanValue() && (user = this.LLJI) != null && user.getFollowStatus() == 1) {
            C1595060rbs.LIZIZ.LJI(this.LL, C059B.BACK_FROM_PROFILE_PAGE);
        }
    }

    public final void cS() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doRequest start. userLoadStatus: ");
        sbLIZ.append(this.LLLLLLL);
        sbLIZ.append(", isFirstEnterOtherPage: ");
        sbLIZ.append(this.LLLLLJLJLL);
        C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1990407qw enumC1990407qw = this.LLLLLLL;
        if (enumC1990407qw == EnumC1990407qw.LOAD_ING || enumC1990407qw == EnumC1990407qw.LOAD_DONE) {
            return;
        }
        if (this.LLLLLJLJLL) {
            this.LLLLLJLJLL = false;
            return;
        }
        ck();
        zS();
        C1720106oR.LJI("I18nUserProfileFragment", "doRequest done");
    }

    public final void ck() {
        if (!C1253130iiN.LIZIZ) {
            C1253130iiN.LIZ = "user_profile";
            C818480W8w.LIZ("user_profile");
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1245340iVo.getClass();
            C1245340iVo.LJII = jCurrentTimeMillis;
            if (C1259950itN.LIZIZ()) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C1253130iiN.LIZLLL;
                concurrentHashMap.clear();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setLazyData userId: ");
                sbLIZ.append(this.LL);
                C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
                String str = this.LL;
                if (str == null) {
                    str = "";
                }
                concurrentHashMap.put(str, Boolean.TRUE);
            }
        }
        C1253130iiN.LIZIZ = false;
        C1253420iiq c1253420iiq = C1253420iiq.LIZ;
        EnumC048600Fo enumC048600Fo = EnumC048600Fo.HOMEPAGE_OTHER_PROFILE;
        c1253420iiq.getClass();
        C1253420iiq.LIZLLL(enumC048600Fo, false);
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 12), false);
        }
    }

    public final C1253180iiS dS() {
        return (C1253180iiS) this.LLLLIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("others_homepage");
        return analysis;
    }

    public final boolean iS() {
        return ((Boolean) this.LLLLILI.getValue()).booleanValue();
    }

    public final boolean kS() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    public final void qS() {
        JS(new User(), false, "resetUserWhenMissing");
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void LJIJ() {
        UserAwemePagerAbility userAwemePagerAbility;
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS != null && (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) != null) {
            userAwemePagerAbility.onBackPress();
        }
        if (!TextUtils.equals(this.LLL, "feed_detail") && !TextUtils.equals(this.LLL, "post_mode")) {
            C913080Zru.LIZ(this);
            return;
        }
        InterfaceC1253300iie interfaceC1253300iie = this.LLLLLZIL;
        if (interfaceC1253300iie != null) {
            interfaceC1253300iie.LJIJ();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final int MR() {
        return (C268330AfP.LJIIIZ() || !C2537109wv.LJIIIIZZ() || kS()) ? kS() ? R.layout.ei1 : R.layout.ei0 : !C0BI9.LIZ() ? R.layout.edy : R.layout.edz;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public final void clearData() {
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 3), false);
        }
        this.LLLLLLL = EnumC1990407qw.LOAD_IDLE;
        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
        String str = this.LL;
        c1245340iVo.getClass();
        C1245340iVo.LJII(str, false);
        if (C299980BpM.LIZ()) {
            C1245340iVo.LIZLLL();
        }
        IPgcPaymentService iPgcPaymentService = (IPgcPaymentService) PluggableExtentionKt.pluggableSpi$default(IPgcPaymentService.class, false, false, false, 14, null);
        if (iPgcPaymentService != null) {
            iPgcPaymentService.LJI(this.LL);
        }
    }

    public final ProfilePlatformViewModel gS() {
        if (!isAdded() || isDetached()) {
            return null;
        }
        return this.LLLLLILLIL;
    }

    public final InterfaceC665370Q7z hS() {
        if (isAdded() && !isDetached()) {
            return C1558360qeg.LJFF(this, null);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get scope is error, isAdded: ");
        sbLIZ.append(isAdded());
        C1720106oR.LIZ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    public final void mS() {
        C823050WQl.LIZLLL().execute(new ARunnableS124S0100000_24(this, 99));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        MainActivityScope mainActivityScopeLIZJ;
        HomePageViewPagerAbility homePageViewPagerAbilityLIZJ;
        super.onDestroy();
        C1248210iaR.LJ("I18nUserProfileFragment", "", EnumC1253850ijX.LIFECYCLE, "onDestroy");
        C1265520j2M.LIZ(this.LL);
        C19EG activity = getActivity();
        if (activity != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (homePageViewPagerAbilityLIZJ = C1256610inz.LIZJ(mainActivityScopeLIZJ)) != null) {
            homePageViewPagerAbilityLIZJ.rj0(false);
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), UserProfileAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ProfileBaseAbility.class, null);
        ZR();
        C1209900hae.LIZLLL = false;
        C1209900hae.LIZ = 0;
        if (C1260030itV.LIZ()) {
            C1253180iiS c1253180iiSDS = dS();
            ((ArrayList) c1253180iiSDS.LJIIIIZZ).clear();
            c1253180iiSDS.LIZ = null;
            c1253180iiSDS.LIZLLL = null;
            c1253180iiSDS.LIZIZ = null;
            c1253180iiSDS.LJFF = null;
            c1253180iiSDS.LJI = null;
            c1253180iiSDS.LJII = null;
        }
        if (C1259950itN.LIZIZ() && (str = this.LL) != null && str.length() != 0) {
            C1253130iiN.LIZJ.clear();
            C1253130iiN.LIZLLL.clear();
            C1253360iik.LIZIZ.remove(this.LL);
            C1253360iik.LIZ.remove(this.LL);
        }
        if (C299980BpM.LIZ()) {
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            String str2 = this.LL;
            c1245340iVo.getClass();
            if (str2 != null) {
                ConcurrentHashMap<String, Set<String>> concurrentHashMap = C1245340iVo.LJJIFFI;
                if (concurrentHashMap.contains(str2)) {
                    concurrentHashMap.remove(str2);
                }
            }
        }
        if (C299980BpM.LIZ()) {
            C1245340iVo.LIZ.getClass();
            C1245340iVo.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1248210iaR.LJ("I18nUserProfileFragment", "", EnumC1253850ijX.LIFECYCLE, "onDestroyView");
        C1251760igA.LIZ.getClass();
        ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LJ();
        this.LLJJJJJIL = false;
        this.LLJJJIL = null;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasRequested=");
        sbLIZ.append(this.LLLLII);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onPause");
        C1253420iiq c1253420iiq = C1253420iiq.LIZ;
        EnumC048600Fo enumC048600Fo = EnumC048600Fo.HOMEPAGE_OTHER_PROFILE;
        c1253420iiq.getClass();
        C1253420iiq.LIZIZ(enumC048600Fo);
        if (this.LLLLII) {
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            String str = this.LL;
            if (str == null) {
                str = "";
            }
            String str2 = this.LLLFFI;
            String str3 = str2 != null ? str2 : "";
            String str4 = this.LLLLLLLLL;
            if (str4 == null) {
                str4 = this.LLLI;
            }
            User user = this.LLJI;
            c1245340iVo.getClass();
            C1245340iVo.LIZ(false, str, str3, str4, user);
            C1020810cff c1020810cff = C1020810cff.LIZ;
            String str5 = this.LL;
            c1020810cff.getClass();
            C1020810cff.LJI.submit(new ARunnableS9S1000000_16(str5, 4));
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("I18nUserProfileFragment", "onPause end");
        this.LLLLII = false;
        C1255980imy.LIZIZ();
        this.LLLILZ = false;
        if (C299970BpL.LIZ()) {
            this.LLLLLLIL = false;
        }
        if (this.LLLF) {
            WR();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Intent intent;
        Integer numLJIIJJI;
        Intent intent2;
        User author;
        int iIntValue;
        String string;
        Integer numLJIIJJI2;
        Intent intent3;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(I18nUserProfileFragment.class.getName());
        }
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(this.LL);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onResume");
        User user = this.LLJI;
        if (user != null && user.isLive()) {
            yS(false);
        }
        if (!C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1250680ieQ.getClass();
            C1250680ieQ.LIZJ(jCurrentTimeMillis, "page_on_resume_complete_time");
        }
        String str = this.LL;
        if (str != null) {
            C1209900hae.LIZLLL = true;
            if (!Intrinsics.LJFF(str, C1209900hae.LIZIZ)) {
                C1209900hae.LIZ = 0;
                C1209900hae.LIZIZ = str;
            }
        }
        if (((Boolean) C287520BOs.LIZ.getValue()).booleanValue()) {
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("profile_from_scene")) == null || (numLJIIJJI2 = C2095008Iq.LJIIJJI(string)) == null) {
                iIntValue = 0;
            } else {
                iIntValue = numLJIIJJI2.intValue();
                if (iIntValue == 1026) {
                    ((InterfaceC1252070igf) C1252710ihh.LIZJ(this, C13LE.LIZ(InterfaceC1252070igf.class))).oA(1026, EnumC1251790igD.CHANGE_TAB);
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        arguments2.remove("profile_from_scene");
                    }
                    C19EG activity = getActivity();
                    if (activity != null && (intent3 = activity.getIntent()) != null) {
                        intent3.removeExtra("profile_from_scene");
                    }
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("jumpToTargetTab, scene: ");
            sbLIZ2.append(iIntValue);
            C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C19EG activity2 = getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                try {
                    String stringExtra = intent.getStringExtra("profile_from_scene");
                    if (stringExtra != null && (numLJIIJJI = C2095008Iq.LJIIJJI(stringExtra)) != null && numLJIIJJI.intValue() == 1026) {
                        C19EG activity3 = getActivity();
                        if (activity3 != null && (intent2 = activity3.getIntent()) != null) {
                            intent2.removeExtra("profile_from_scene");
                        }
                        ((InterfaceC1252070igf) C1252710ihh.LIZJ(this, C13LE.LIZ(InterfaceC1252070igf.class))).oA(1026, EnumC1251790igD.CHANGE_TAB);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (this.LLLLLLIL && C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLLLLL;
            c1250680ieQ2.getClass();
            C1250680ieQ.LIZIZ(jCurrentTimeMillis2, "page_on_resume_complete_time");
            C1253110iiL c1253110iiL = new C1253110iiL();
            c1253110iiL.LIZIZ = this.LL;
            c1253110iiL.LJ = this.LLILZLL;
            c1253110iiL.LJIIIIZZ = this.LLLII;
            Aweme aweme = this.LLLFF;
            c1253110iiL.LJII = aweme != null ? aweme.getAid() : null;
            String str2 = this.LLLLLLLLL;
            c1253110iiL.LIZLLL = (str2 == null || str2.length() == 0) ? this.LLLI : this.LLLLLLLLL;
            c1253110iiL.LIZJ = this.LLILZIL;
            c1253110iiL.LJIIIZ = Long.valueOf(this.LLLLLL);
            Aweme aweme2 = this.LLLFF;
            c1253110iiL.LJFF = aweme2 != null ? Integer.valueOf(aweme2.getAwemeType()) : null;
            Aweme aweme3 = this.LLLFF;
            c1253110iiL.LIZ = (aweme3 == null || (author = aweme3.getAuthor()) == null) ? null : author.getUid();
            Aweme aweme4 = this.LLLFF;
            c1253110iiL.LJI = aweme4 != null ? aweme4.getRequestId() : null;
            c1253110iiL.LIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(this.LL);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onStart");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(this.LL);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onStop");
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final C1253180iiS y12() {
        return dS();
    }

    public final void zS() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("is_first_time")) {
            C1253140iiO.LIZ.getClass();
            C1253140iiO.LIZ(new C1253190iiT(), this.LLILZLL);
            C1253200iiU c1253200iiU = new C1253200iiU();
            String str = this.LLILZLL;
            if (str == null) {
                str = this.LLLLLLLLL;
            }
            C1253150iiP.LIZ(c1253200iiU, str, false, "homepage_other_profile");
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.remove("is_first_time");
            }
        }
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 4), false);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("userId. ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uniqueid: ");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append(", isFirstEnterOtherPage: ");
        sbLIZ.append(this.LLLLLJLJLL);
        C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((!C1260030itV.LIZ() || !this.LLLLLJLJLL) && !TextUtils.isEmpty(this.LL)) || !TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
            bS("setUserData");
            InterfaceC1252070igf interfaceC1252070igf = (InterfaceC1252070igf) C1252710ihh.LJ(this, C13LE.LIZ(InterfaceC1252070igf.class), null);
            if (interfaceC1252070igf != null) {
                interfaceC1252070igf.oA(this.LLLLLLLLLL, EnumC1251790igD.CHANGE_TAB);
            }
            this.LLLLLLL = EnumC1990407qw.LOAD_ING;
        } else if (C0SE5.LIZIZ(this.LLLFF)) {
            C628000OkA.LIZ.getClass();
            C628000OkA.LIZJ(null);
        }
        this.LLLLLJLJLL = false;
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String str2 = this.LL;
        if (str2 == null) {
            str2 = "";
        }
        c1253930ijf.getClass();
        C1253930ijf.LJIILLIIL(str2, "request");
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final C1260280itu Zp() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public final String getEnterMethod() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final C1252220igu getOtherParams() {
        return this.LLLLL;
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final User getUser() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public final C1253220iiW rP2() {
        return this.LLLLLIL;
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final boolean sW0() {
        return this.LLLFZ;
    }

    public static void FS(I18nUserProfileFragment i18nUserProfileFragment) {
        Serializable serializable;
        C1252610ihX c1252610ihX;
        String toUserId;
        User userLJII;
        C1253340iii c1253340iii;
        if (!i18nUserProfileFragment.iS() && !i18nUserProfileFragment.isViewValid()) {
            return;
        }
        Bundle arguments = i18nUserProfileFragment.getArguments();
        if (arguments == null || (toUserId = arguments.getString("uid")) == null) {
            Bundle arguments2 = i18nUserProfileFragment.getArguments();
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("recommend_enter_profile_params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C1252610ihX) || (c1252610ihX = (C1252610ihX) serializable) == null) {
                return;
            } else {
                toUserId = c1252610ihX.getToUserId();
            }
        }
        if (toUserId == null || toUserId.length() == 0) {
            return;
        }
        C1253140iiO.LIZ.getClass();
        C1253330iih c1253330iih = C1253140iiO.LIZIZ;
        if (c1253330iih != null && (c1253340iii = c1253330iih.LIZ) != null) {
            c1253340iii.LJFF = System.currentTimeMillis();
        }
        IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class);
        if (iUserProfilePreload != null) {
            userLJII = iUserProfilePreload.LJII(toUserId);
        } else {
            userLJII = null;
        }
        IUserProfilePreload iUserProfilePreload2 = (IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class);
        if (iUserProfilePreload2 != null) {
            iUserProfilePreload2.LIZJ(false);
        }
        i18nUserProfileFragment.T7(userLJII);
        InterfaceC1252070igf interfaceC1252070igf = (InterfaceC1252070igf) C1252710ihh.LJ(i18nUserProfileFragment, C13LE.LIZ(InterfaceC1252070igf.class), null);
        if (interfaceC1252070igf != null) {
            interfaceC1252070igf.je(userLJII, EnumC1251790igD.NORMAL, true);
        }
        C1251760igA c1251760igA = C1251760igA.LIZ;
        boolean zLJFF = Intrinsics.LJFF(i18nUserProfileFragment.LLL, "feed_detail");
        c1251760igA.getClass();
        ProfileUser profileUserLIZ = C1251760igA.LIZ(toUserId, zLJFF);
        if (profileUserLIZ == null) {
            return;
        }
        i18nUserProfileFragment.LLLLJI = profileUserLIZ;
        if (!i18nUserProfileFragment.iS()) {
            i18nUserProfileFragment.ma2(null, "");
        }
        C1253930ijf.LIZ.getClass();
        C1253930ijf.LJIILLIIL(toUserId, "rec_user");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.07aa] */
    public static C1889007aa aS(ProfileComponents profileComponents) {
        n nVar;
        Object c098200Yq;
        ProfileBgInfo profileBgInfo;
        final String aid;
        Aweme awemeInfo;
        final Float fValueOf = null;
        if (profileComponents == null || (nVar = profileComponents.bizData) == null) {
            return null;
        }
        try {
            c098200Yq = (ProfileBgBizData) C1250210idf.LIZ(C1250210idf.LIZIZ(nVar), ProfileBgBizData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ProfileBgBizData profileBgBizData = (ProfileBgBizData) c098200Yq;
        if (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null) {
            return null;
        }
        final int mediaType = profileBgInfo.getMediaType();
        final Boolean autoPlay = profileBgBizData.getAutoPlay();
        if (autoPlay == null) {
            ProfileBgVideoInfo videoInfo = profileBgInfo.getVideoInfo();
            if (videoInfo != null) {
                autoPlay = Boolean.valueOf(videoInfo.getAutoPlay());
            } else {
                autoPlay = null;
            }
        }
        ProfileBgVideoInfo videoInfo2 = profileBgInfo.getVideoInfo();
        if (videoInfo2 != null && (awemeInfo = videoInfo2.getAwemeInfo()) != null) {
            aid = awemeInfo.getAid();
        } else {
            aid = null;
        }
        ProfileBgVideoInfo videoInfo3 = profileBgInfo.getVideoInfo();
        if (videoInfo3 != null) {
            fValueOf = Float.valueOf(videoInfo3.getOffsetYRatio());
        }
        final List<String> imageUrlList = profileBgInfo.getImageUrlList();
        return new Object(mediaType, autoPlay, aid, fValueOf, imageUrlList) { // from class: X.07aa
            public final int LIZ;
            public final Boolean LIZIZ;
            public final String LIZJ;
            public final Float LIZLLL;
            public final List<String> LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1889007aa)) {
                    return false;
                }
                C1889007aa c1889007aa = (C1889007aa) obj;
                return this.LIZ == c1889007aa.LIZ && Intrinsics.LJFF(this.LIZIZ, c1889007aa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1889007aa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1889007aa.LIZLLL) && Intrinsics.LJFF(this.LJ, c1889007aa.LJ);
            }

            public final int hashCode() {
                int i = this.LIZ * 31;
                Boolean bool = this.LIZIZ;
                int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.LIZJ;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Float f = this.LIZLLL;
                int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
                List<String> list = this.LJ;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ProfileBackgroundSignature(mediaType=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", autoPlay=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", awemeId=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", offsetRatio=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", imageUrls=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = mediaType;
                this.LIZIZ = autoPlay;
                this.LIZJ = aid;
                this.LIZLLL = fValueOf;
                this.LJ = imageUrlList;
            }
        };
    }

    public final void ES(Aweme aweme) {
        User author;
        String aid;
        HashMap<String, String> mobParams;
        if (C299970BpL.LIZ()) {
            this.LLLFF = aweme;
            this.LLLLL.LIZJ = aweme;
            this.LLLLLIL.LIZJ = aweme;
        }
        if (!isViewValid()) {
            return;
        }
        if (!C299970BpL.LIZ()) {
            this.LLLFF = aweme;
            this.LLLLL.LIZJ = aweme;
            this.LLLLLIL.LIZJ = aweme;
        }
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS598S0100000_19(aweme, 10), false);
        }
        HashMap<String, String> mobParams2 = null;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        C10EU.LJIILL(author, false);
        this.LLJLIL = C727520SgI.LIZIZ(aweme);
        if (C123100dR.LIZ(this.LLILZLL)) {
            setPreviousPage(this.LLILZLL);
        } else if (!C300140Bpc.LIZ()) {
            setPreviousPage(this.LLLI);
        }
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZIZ(aweme.getAid());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zhoulei_push setmAweme ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" mobParams:");
        if (aweme != null) {
            mobParams2 = aweme.getMobParams();
        }
        sbLIZ.append(mobParams2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && Intrinsics.LJFF(mobParams.get("is_from_push"), "1")) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putInt("is_from_push", 1);
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJJI("push_id", mobParams.get("push_id"), arguments2);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                C786410Ut5.LJJJI("push_type", mobParams.get("push_type"), arguments3);
                return;
            }
            return;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.remove("is_from_push");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.remove("push_id");
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null) {
            return;
        }
        arguments6.remove("push_type");
    }

    public final void GS(boolean z) {
        UserAwemePagerAbility userAwemePagerAbility;
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS != null && (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) != null) {
            userAwemePagerAbility.Gi1(z, false);
        }
    }

    @Override // X.C0SSX
    public final void LLIZ(String str) {
        UserAwemePagerAbility userAwemePagerAbility;
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS != null && (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) != null) {
            userAwemePagerAbility.LLIZ(str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void OR(View view) {
        ProfileUser profileUser;
        super.OR(view);
        if (!iS() || (profileUser = this.LLLLJI) == null) {
            C1250160ida.LIZ.getClass();
            C1250160ida.LIZLLL = null;
            HS("init_update_component_tree", C1250160ida.LIZIZ("load_page_model_init_view", Intrinsics.LJFF(this.LLL, "feed_detail")), view);
        } else {
            HS("set_up_simple_update", profileUser, view);
        }
        if (((Boolean) C1260030itV.LIZ.getValue()).booleanValue()) {
            C1253180iiS c1253180iiSDS = dS();
            c1253180iiSDS.getClass();
            C20673215v0.LJIIIZ("profile_item_aweme");
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "preloadPostItemLayout start preload");
            if (c1253180iiSDS.LIZJ != null) {
                int i2 = 0;
                do {
                    C20673215v0.LJII(c1253180iiSDS.LIZJ, "profile_item_aweme");
                    i2++;
                } while (i2 < 12);
            }
        }
        nS(view);
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0ifp
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1253340iii c1253340iii;
                C1C7U.LIZ("I18nUserProfileFragment@1bc5.initHeaderView$1");
                try {
                    C1253140iiO.LIZ.getClass();
                    C1253330iih c1253330iih = C1253140iiO.LIZIZ;
                    if (c1253330iih != null && (c1253340iii = c1253330iih.LIZ) != null) {
                        c1253340iii.LJI = System.currentTimeMillis();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.initHeaderView$1");
            }
        });
    }

    @Override // X.C0SSX
    public final void Ob(Aweme aweme) {
        if (aweme != null && !TextUtils.equals(this.LL, AwemeExtKt.getAuthorUid(aweme))) {
            clearData();
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) this.LLLLIILLL.getValue();
            if (iProfileMusicTabService != null) {
                iProfileMusicTabService.LJIJJLI("I18nUserProfileFragment tryUpdateUserInfo");
            }
            BS(AwemeExtKt.getAuthorUid(aweme), aweme.getAuthor().getSecUid());
            ES(aweme);
            WL(aweme.getAuthor(), true);
            yS(false);
        }
    }

    @Override // X.C0SSX
    public final void R6(String str) {
        UserAwemePagerAbility userAwemePagerAbility;
        this.LLLFFI = str;
        this.LLLLL.LJIILL = str;
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS != null && (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) != null) {
            userAwemePagerAbility.R6(str);
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void T7(User user) {
        if (C123100dR.LIZ(this.LLJJJJLIIL) && user != null) {
            user.setRequestId(this.LLJJJJLIIL);
        }
        this.LLJI = user;
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.LLJ = this.LLJI;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void aP(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHasRefreshed uid ");
        sbLIZ.append(str);
        sbLIZ.append(", muserId: ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (getParentFragment() != null && (getParentFragment() instanceof ProfilePageFragment) && !this.LLLF) {
            return;
        }
        this.LLLLII = Intrinsics.LJFF(str, this.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Override // X.C0SSX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b2(java.lang.String r5) {
        /*
            r4 = this;
            X.0ijf r0 = X.C1253930ijf.LIZ
            r0.getClass()
            boolean r0 = X.C300140Bpc.LIZ()
            if (r0 == 0) goto L32
            if (r5 == 0) goto L6c
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r2 = r5.toLowerCase(r0)
            if (r2 == 0) goto L32
            int r1 = r2.hashCode()
            r0 = -1424823368(0xffffffffab12ebb8, float:-5.2196745E-13)
            if (r1 == r0) goto L60
            r0 = -1424648093(0xffffffffab159863, float:-5.3146913E-13)
            if (r1 == r0) goto L55
            r0 = 193277936(0xb852ff0, float:5.1301865E-32)
            if (r1 != r0) goto L32
            java.lang.String r0 = "click_avatar"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L69
        L32:
            r3 = 0
            if (r5 == 0) goto L6c
            int r0 = r5.length()
            if (r0 == 0) goto L6c
            r4.LLILZIL = r5
            X.0igu r0 = r4.LLLLL
            r0.LJIJ = r5
            X.0iiW r0 = r4.LLLLLIL
            r0.LIZIZ = r5
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r2 = r4.gS()
            if (r2 == 0) goto L54
            kotlin.jvm.internal.AwS70S1000000_19 r1 = new kotlin.jvm.internal.AwS70S1000000_19
            r0 = 2
            r1.<init>(r5, r0)
            r2.SQ2(r1, r3)
        L54:
            return
        L55:
            java.lang.String r0 = "click_card_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L32
            java.lang.String r5 = "click_name"
            goto L32
        L60:
            java.lang.String r0 = "click_card_head"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L69
            goto L32
        L69:
            java.lang.String r5 = "click_head"
            goto L32
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment.b2(java.lang.String):void");
    }

    public final void bS(String str) {
        C19EG activity;
        Aweme aweme;
        String aid;
        String aid2;
        String secAuthorUid;
        if (!this.LLLLJ || (activity = getActivity()) == null || (aweme = C680080Qly.LIZIZ(activity).LLJILJILJ) == null) {
            return;
        }
        String aid3 = aweme.getAid();
        Aweme aweme2 = this.LLLFF;
        String secAuthorUid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid3, aid)) {
            String secAuthorUid3 = AwemeExtKt.getSecAuthorUid(aweme);
            Aweme aweme3 = this.LLLFF;
            if (aweme3 != null) {
                secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme3);
            } else {
                secAuthorUid = null;
            }
            if (Intrinsics.LJFF(secAuthorUid3, secAuthorUid)) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I18nUserProfileFragment: ");
        sbLIZ.append(str);
        sbLIZ.append(" invalid aweme, aid: ");
        Aweme aweme4 = this.LLLFF;
        if (aweme4 != null) {
            aid2 = aweme4.getAid();
        } else {
            aid2 = null;
        }
        sbLIZ.append(aid2);
        sbLIZ.append(", aweme_secUid: ");
        Aweme aweme5 = this.LLLFF;
        if (aweme5 != null) {
            secAuthorUid2 = AwemeExtKt.getSecAuthorUid(aweme5);
        }
        sbLIZ.append(secAuthorUid2);
        sbLIZ.append(", secUid: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("; homepage_aid: ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", homepage_secUid: ");
        sbLIZ.append(AwemeExtKt.getSecAuthorUid(aweme));
        C2344809Gs.LIZLLL(4, "feed2profile", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void initView(View view) {
        C1252480ihK c1252480ihK;
        super.initView(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJLILLLLZIIL = arguments.getString("unique_id", "");
            this.LLLLIIL = arguments.getString("teen_sec_user_id");
            this.LLL = arguments.getString("profile_from", "");
            this.LLLLLLLLL = arguments.getString("enter_from", "");
            b2(arguments.getString("enter_method", ""));
            this.LLJJL = arguments.getString("from_discover", "");
            String string = arguments.getString("show_window_source");
            if (string == null) {
                string = "";
            }
            this.LLLLLLLZIL = string;
            String string2 = arguments.getString("search_request_id");
            if (string2 == null) {
                string2 = "";
            }
            this.LLJJJJLIIL = string2;
            String string3 = arguments.getString("room_id", "");
            this.LLLII = string3;
            this.LLLLL.LJIIJJI = string3;
            this.LLLIIIL = arguments.getString("return_live", "");
            String string4 = arguments.getString("source_content_id", "");
            this.LLLIIL = string4;
            this.LLLLL.LJIILIIL = string4;
            this.LLLIILIL = arguments.getIntArray("traffic_source_list");
            String string5 = arguments.getString("trackParams");
            if (string5 == null) {
                string5 = "";
            }
            this.LLLIL = string5;
            this.LLJLL = arguments.getString("af_c_id", "");
            this.LLJLLIL = arguments.getString("af_adset_id", "");
            this.LLJLLL = arguments.getString("media_source", "");
            this.LLJZ = arguments.getBoolean("is_ddl", false);
            this.LLJZIJLIL = arguments.getBoolean("from_repost_avatar_sticker", false);
            int[] iArr = this.LLLIILIL;
            if (iArr != null && iArr.length != 0) {
                this.LLLIILIL = iArr;
                this.LLLLL.LJIILLIIL = iArr;
                ProfilePlatformViewModel profilePlatformViewModelGS = gS();
                if (profilePlatformViewModelGS != null) {
                    profilePlatformViewModelGS.SQ2(new AwS598S0100000_19(iArr, 0), false);
                }
            }
            if (!TextUtils.isEmpty(this.LLLIIL)) {
                String str = this.LLLIIL;
                this.LLLIIL = str;
                this.LLLLL.LJIILIIL = str;
            }
            if (!TextUtils.isEmpty(this.LLLII)) {
                String str2 = this.LLLII;
                this.LLLII = str2;
                this.LLLLL.LJIIJJI = str2;
            }
            if (!C2093608Ic.LJ(this.LLJJL)) {
                setPreviousPage(this.LLJJL);
            }
            if (!TextUtils.isEmpty(this.LLLLLLLLL)) {
                setEventType(this.LLLLLLLLL);
            }
            if (!TextUtils.isEmpty(this.LLILZLL)) {
                setPreviousPage(this.LLILZLL);
            }
            if (TextUtils.equals(this.LLLLLLLLL, "discovery_tab")) {
                setPreviousPage("discovery_tab");
            }
            if (TextUtils.equals(this.LLLLLLLLL, "scan")) {
                setPreviousPage(this.LLLLLLLLL);
            }
            if (TextUtils.equals(this.LLLLLLLLL, "prop_page")) {
                setPreviousPage(this.LLLLLLLLL);
            }
            if (!TextUtils.isEmpty(this.LLLLLLLZIL)) {
                this.LLLLL.LJIILJJIL = this.LLLLLLLZIL;
            }
            if (!TextUtils.isEmpty(this.LLLIL)) {
                String str3 = this.LLLIL;
                this.LLLIL = str3;
                this.LLLLL.LJIIZILJ = str3;
                String strOptString = new JSONObject(this.LLLIL).optString("rfevent_previous_page");
                if (strOptString == null) {
                    strOptString = "";
                }
                this.LLJL = strOptString;
            }
            Serializable serializable = arguments.getSerializable("extra_mutual_relation");
            if (serializable instanceof MutualStruct) {
                this.LLJLIL = (MutualStruct) serializable;
            }
            wS(arguments.getString("extra_previous_page_position", "other_places"));
            if (C123100dR.LIZ(this.LLJJLIIIJLLLLLLLZ)) {
                wS(this.LLJJLIIIJLLLLLLLZ);
            }
            String string6 = arguments.getString("source_page");
            this.LLLIZZ = string6;
            if (C123100dR.LIZ(string6)) {
                String str4 = this.LLLIZZ;
                this.LLLIZZ = str4;
                this.LLLLL.LJFF = str4;
            }
            String string7 = arguments.getString("now_card_type");
            this.LLLJ = string7;
            if (C123100dR.LIZ(string7)) {
                String str5 = this.LLLJ;
                this.LLLJ = str5;
                this.LLLLL.LJI = str5;
            }
            String string8 = arguments.getString("is_now_clear");
            this.LLLJIL = string8;
            if (C123100dR.LIZ(string8)) {
                String str6 = this.LLLJIL;
                this.LLLJIL = str6;
                this.LLLLL.LJII = str6;
            }
            String string9 = arguments.getString("now_type");
            this.LLLJL = string9;
            if (C123100dR.LIZ(string9)) {
                String str7 = this.LLLJL;
                this.LLLJL = str7;
                this.LLLLL.LJIIIIZZ = str7;
            }
            Integer numValueOf = Integer.valueOf(arguments.getInt("has_small_window"));
            this.LLLL = numValueOf;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                this.LLLL = Integer.valueOf(iIntValue);
                this.LLLLL.LJIIIZ = Integer.valueOf(iIntValue);
            }
            if (TextUtils.isEmpty(this.LL)) {
                String string10 = arguments.getString("uid", "");
                this.LL = string10;
                C1245340iVo.LIZ.getClass();
                if (string10 == null) {
                    string10 = "";
                }
                C1245340iVo.LJ = string10;
                this.LLLLL.LIZ = this.LL;
            }
            if (TextUtils.isEmpty(this.LLILLJJLI)) {
                String string11 = arguments.getString("sec_user_id", "");
                this.LLILLJJLI = string11;
                this.LLLLL.LIZIZ = string11;
                IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) this.LLLLIILLL.getValue();
                if (iProfileMusicTabService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("I18nUserProfileFragment initView, secUid:");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", enterFrom:");
                    sbLIZ.append(this.LLLLLLLLL);
                    iProfileMusicTabService.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (C123100dR.LIZ(this.LLLFFI)) {
                R6(this.LLLFFI);
            }
            if (C123100dR.LIZ(this.LLILZIL)) {
                b2(this.LLILZIL);
            }
            if (this.LLLIIII != null && (!r0.isEmpty())) {
                uS(this.LLLIIII);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                c1252480ihK = (C1252480ihK) arguments.getSerializable("LIVE_FOLLOW_REPORT_PARAMS", C1252480ihK.class);
            } else {
                Serializable serializable2 = arguments.getSerializable("LIVE_FOLLOW_REPORT_PARAMS");
                if (serializable2 instanceof C1252480ihK) {
                    c1252480ihK = (C1252480ihK) serializable2;
                } else {
                    c1252480ihK = null;
                }
            }
            this.LLLLLJIL = c1252480ihK;
            if (c1252480ihK != null) {
                sS(c1252480ihK);
            }
            String string12 = arguments.getString("video_id");
            if (string12 != null) {
                R6(string12);
            }
            rS(this.LLLLLLZ);
            ProfilePlatformViewModel profilePlatformViewModelGS2 = gS();
            if (profilePlatformViewModelGS2 != null) {
                profilePlatformViewModelGS2.SQ2(new AwS18S2000000_19(this.LL, this.LLILLJJLI, 0), false);
            }
            if (!TextUtils.isEmpty(this.LLLLIIL)) {
                String str8 = this.LLLLIIL;
                this.LLLLL.LJIL = str8;
                ProfilePlatformViewModel profilePlatformViewModelGS3 = gS();
                if (profilePlatformViewModelGS3 != null) {
                    profilePlatformViewModelGS3.SQ2(new AwS70S1000000_19(str8, 1), false);
                }
            }
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LLJILJIL;
            if (analysisStayTimeFragmentComponent != null) {
                analysisStayTimeFragmentComponent.LLILZ = new InterfaceC744170THb() { // from class: X.0iiM
                    @Override // X.InterfaceC744170THb
                    public final C1386470mBR LIZ(C1386470mBR c1386470mBR) {
                        String aid;
                        for (Map.Entry<String, String> entry : this.LIZ.NR().entrySet()) {
                            c1386470mBR.LJ(entry.getKey(), entry.getValue());
                        }
                        C1253010iiB.LIZJ.LIZIZ(c1386470mBR, this.LIZ.LLILZLL);
                        I18nUserProfileFragment i18nUserProfileFragment = this.LIZ;
                        c1386470mBR.LJJLIIIJL = i18nUserProfileFragment.LLILZLL;
                        c1386470mBR.LJJLIIIJLJLI = i18nUserProfileFragment.LL;
                        Aweme aweme = i18nUserProfileFragment.LLLFF;
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        c1386470mBR.LJJLIIIJJIZ = aid;
                        return c1386470mBR;
                    }
                };
            }
        }
        C1075590e61.LIZ(this);
        ProfileViewModel profileViewModel = this.LLJILJILJ;
        String str9 = this.LLLLLLLLL;
        profileViewModel.getClass();
        profileViewModel.setState(new AwS85S1000000_35(str9, 14));
        this.LLLLL.LJIJJ = this.LLLLLLLLL;
    }

    @Override // X.C0SSX
    public final /* bridge */ /* synthetic */ void lL(Boolean bool) {
        yS(bool.booleanValue());
    }

    @Override // X.C0SSX
    public final void mu(InterfaceC1253300iie interfaceC1253300iie) {
        this.LLLLLZIL = interfaceC1253300iie;
    }

    public final void nS(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        View viewFindViewById = view.findViewById(R.id.nh1);
        View viewFindViewById2 = view.findViewById(R.id.him);
        C0GUC c0guc = (C0GUC) view.findViewById(R.id.user_info_layout);
        View viewFindViewById3 = view.findViewById(R.id.aix);
        if (viewFindViewById != null) {
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
        }
        if (viewFindViewById2 != null) {
            C426750GoL.LJIIIZ(viewFindViewById2, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
        }
        if (c0guc != null) {
            C426750GoL.LJIIL(c0guc, null, Integer.valueOf(iLIZIZ2), null, null, 29);
            c0guc.setExpectedEmptyHeightPx(iLIZIZ);
        }
        if (viewFindViewById3 != null) {
            C426750GoL.LJIIL(viewFindViewById3, Integer.valueOf(iLIZIZ3), null, Integer.valueOf(iLIZIZ3), null, 26);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.LLILZ = interfaceC665370Q7zLJFF;
        }
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str;
        if (c0xkc != null && (str = c0xkc.LIZ) != null) {
            if (a0.LJJIIZI(str, "/aweme/v1/user/profile/other/?", false) || a0.LJJIIZI(str, "/aweme/v1/aweme/post/?", false) || a0.LJJIIZI(str, "/aweme/v1/aweme/favorite/?", false)) {
                EventBus.LIZLLL().LIZIZ(c0xkc);
                OC1();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (C123100dR.LIZ(this.LLILZLL)) {
            setPreviousPage(this.LLILZLL);
        }
        if (C123100dR.LIZ(this.LLJJLIIIJLLLLLLLZ)) {
            wS(this.LLJJLIIIJLLLLLLLZ);
        }
        if (C123100dR.LIZ(this.LLLIZZ)) {
            String str = this.LLLIZZ;
            this.LLLIZZ = str;
            this.LLLLL.LJFF = str;
        }
        if (C123100dR.LIZ(this.LLLJ)) {
            String str2 = this.LLLJ;
            this.LLLJ = str2;
            this.LLLLL.LJI = str2;
        }
        if (C123100dR.LIZ(this.LLLJIL)) {
            String str3 = this.LLLJIL;
            this.LLLJIL = str3;
            this.LLLLL.LJII = str3;
        }
        if (C123100dR.LIZ(this.LLLJL)) {
            String str4 = this.LLLJL;
            this.LLLJL = str4;
            this.LLLLL.LJIIIIZZ = str4;
        }
        Integer num = this.LLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLLL = Integer.valueOf(iIntValue);
            this.LLLLL.LJIIIZ = Integer.valueOf(iIntValue);
        }
        if (C123100dR.LIZ(this.LLLI)) {
            setEventType(this.LLLI);
        }
        if (C123100dR.LIZ(this.LLLFFI)) {
            R6(this.LLLFFI);
        }
        rS(this.LLLLLLZ);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        final String str;
        String string2;
        String string3;
        String string4;
        this.LLLLLL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("userId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LLLLLL);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onCreate");
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 2134), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2135), AFwS257S0000000_19.get$arr$(356));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZL;
        this.LLLLLILLIL = (ProfilePlatformViewModel) assemVMLazy.getValue();
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, UserProfileAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ProfileBaseAbility.class, null, null);
        C1253130iiN.LIZ = "new_user_profile";
        C1253130iiN.LIZIZ = true;
        if (C1259950itN.LIZIZ()) {
            Bundle arguments = getArguments();
            if (arguments == null || (string4 = arguments.getString("uid", "")) == null) {
                string4 = "";
            }
            this.LL = string4;
            this.LLLLL.LIZ = string4;
            if (C123100dR.LIZ(string4)) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C1253130iiN.LIZJ;
                concurrentHashMap.clear();
                concurrentHashMap.put(this.LL, Boolean.TRUE);
                C1253130iiN.LIZLLL.put(this.LL, Boolean.FALSE);
            }
        }
        C1250680ieQ.LIZ.getClass();
        C1250680ieQ.LJIIJJI = "other";
        C818480W8w.LIZ(C1253130iiN.LIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1245340iVo.LIZ.getClass();
        C1245340iVo.LJI = jCurrentTimeMillis;
        if (TextUtils.isEmpty(this.LL)) {
            if (bundle == null || (string3 = bundle.getString("uid")) == null) {
                string3 = "";
            }
            this.LL = string3;
            this.LLLLL.LIZ = string3;
            C1245340iVo.LJ = string3;
        }
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            if (bundle == null || (string2 = bundle.getString("sec_user_id")) == null) {
                string2 = "";
            }
            this.LLILLJJLI = string2;
            this.LLLLL.LIZIZ = string2;
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) this.LLLLIILLL.getValue();
            if (iProfileMusicTabService != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("I18nUserProfileFragment onCreate, secUid:");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(", enterFrom:");
                sbLIZ2.append(this.LLLLLLLLL);
                iProfileMusicTabService.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (C1260030itV.LIZ()) {
            final C1253180iiS c1253180iiSDS = dS();
            final ProfilePlatformViewModel profilePlatformViewModelGS = gS();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            final String str2 = this.LLLFFI;
            C1253260iia c1253260iia = this.LLLLL.LJIJJLI;
            if (c1253260iia == null || (str = c1253260iia.LIZIZ) == null) {
                str = "others_homepage";
            }
            final Bundle arguments2 = getArguments();
            final int i = this.LLLLLLZ;
            final C1252220igu c1252220igu = this.LLLLL;
            c1253180iiSDS.getClass();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("vm: ");
            sbLIZ3.append(profilePlatformViewModelGS);
            sbLIZ3.append(", feedAwemeId: ");
            sbLIZ3.append(str2);
            sbLIZ3.append(", enterFrom: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", darkPost: ");
            sbLIZ3.append(i);
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ3));
            c1253180iiSDS.LJIILIIL = lValueOf;
            ((ExecutorService) c1253180iiSDS.LJIIJJI.getValue()).submit(new Runnable() { // from class: X.0iiJ
                public final void LIZ() {
                    String string5;
                    Integer numLJIIJJI;
                    C1253180iiS c1253180iiS = c1253180iiSDS;
                    Bundle bundle2 = arguments2;
                    c1253180iiS.LJFF = bundle2 != null ? bundle2.getString("uid", null) : null;
                    C1253180iiS c1253180iiS2 = c1253180iiSDS;
                    Bundle bundle3 = arguments2;
                    c1253180iiS2.LJI = bundle3 != null ? bundle3.getString("sec_user_id", null) : null;
                    C1253180iiS c1253180iiS3 = c1253180iiSDS;
                    Bundle bundle4 = arguments2;
                    c1253180iiS3.LJII = bundle4 != null ? bundle4.getString("teen_sec_user_id", null) : null;
                    ProfilePlatformViewModel profilePlatformViewModel = profilePlatformViewModelGS;
                    int iIntValue = 0;
                    if (profilePlatformViewModel != null) {
                        C1253180iiS c1253180iiS4 = c1253180iiSDS;
                        profilePlatformViewModel.SQ2(new AwS18S2000000_19(c1253180iiS4.LJFF, c1253180iiS4.LJI, 0), false);
                    }
                    ProfilePlatformViewModel profilePlatformViewModel2 = profilePlatformViewModelGS;
                    if (profilePlatformViewModel2 != null) {
                        profilePlatformViewModel2.SQ2(new AwS70S1000000_19(c1253180iiSDS.LJII, 1), false);
                    }
                    C1252220igu c1252220igu2 = c1252220igu;
                    C1253180iiS c1253180iiS5 = c1253180iiSDS;
                    c1252220igu2.LIZ = c1253180iiS5.LJFF;
                    c1252220igu2.LJIL = c1253180iiS5.LJII;
                    if (C1259950itN.LIZ()) {
                        final C1253180iiS c1253180iiS6 = c1253180iiSDS;
                        final String str3 = str2;
                        final String str4 = str;
                        final Bundle bundle5 = arguments2;
                        final int i3 = i;
                        ((ExecutorService) c1253180iiS6.LJIIJJI.getValue()).submit(new Runnable() { // from class: X.0iim
                            public final void LIZ() {
                                C1253420iiq.LIZ.getClass();
                                C1253420iiq.LJIIIIZZ = System.currentTimeMillis();
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("fetchSugByFastChunk userId：");
                                sbLIZ4.append(c1253180iiS6.LJFF);
                                C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                C846160XHi c846160XHi = new C846160XHi();
                                ((ArrayList) c846160XHi.LL).add(new C2259671DcT("check_preload", "true"));
                                String str5 = str3;
                                final C118300cf c118300cf = new C118300cf();
                                c118300cf.element = EnumC1253390iin.SMALL_PACKAGE.ordinal();
                                C1253180iiS c1253180iiS7 = c1253180iiS6;
                                C1256080in8 c1256080in8LIZ = ProfileTabApi.LIZ(c1253180iiS7.LJI, c1253180iiS7.LJFF, str5, i3, str4, false, null, 0L, Boolean.FALSE, 1);
                                C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                                int iOrdinal = EnumC1253390iin.START_REQUEST.ordinal();
                                Boolean bool = Boolean.TRUE;
                                Boolean bool2 = Boolean.FALSE;
                                c1250680ieQ.getClass();
                                C1250680ieQ.LJIILJJIL(true, iOrdinal, false, bool, null, null, bool2);
                                C15O7<C1515820pY4<FeedItemList>> c15o7LIZIZ = ProfileTabApi.LIZIZ(c1256080in8LIZ);
                                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                                if (c15o7LIZIZ != null) {
                                    final C1253180iiS c1253180iiS8 = c1253180iiS6;
                                    final String str6 = str3;
                                    final String str7 = str4;
                                    final Bundle bundle6 = bundle5;
                                    final int i5 = i3;
                                    c15o7LIZIZ.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0iip
                                        @Override // X.InterfaceC2385309Wh
                                        public final Object then(C15O7 c15o7) {
                                            C1C7U.LIZ("ProfileApiAdvanceRequestHelper@5c8a.fetchSugByFastChunk$1$1");
                                            C1515820pY4 c1515820pY4 = (C1515820pY4) c15o7.LJIIL();
                                            if (c1515820pY4 != null) {
                                                C118300cf c118300cf2 = c118300cf;
                                                C1253180iiS c1253180iiS9 = c1253180iiS8;
                                                long j = jCurrentTimeMillis2;
                                                String str8 = str6;
                                                String str9 = str7;
                                                c1515820pY4.LIZLLL(new C0POE<FeedItemList>(i5, j, bundle6, c1253180iiS9, str8, str9, c118300cf2) { // from class: X.0iio
                                                    public final /* synthetic */ C118300cf LIZ;
                                                    public final /* synthetic */ C1253180iiS LIZIZ;
                                                    public final /* synthetic */ long LIZJ;
                                                    public final /* synthetic */ String LIZLLL;
                                                    public final /* synthetic */ String LJ;
                                                    public final /* synthetic */ int LJFF;

                                                    @Override // X.C0POE
                                                    public final void onComplete() {
                                                        int i6 = C2187451AjH.LIZ;
                                                        C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "fetchSugByFastChunk onComplete");
                                                    }

                                                    @Override // X.C0POE
                                                    public final void onFailed(Throwable th) {
                                                        this.LIZIZ.LJ(this.LIZLLL, this.LJ, this.LJFF, true);
                                                        C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                                        int i6 = this.LIZ.element;
                                                        Boolean bool3 = Boolean.TRUE;
                                                        Boolean bool4 = Boolean.FALSE;
                                                        c1250680ieQ2.getClass();
                                                        C1250680ieQ.LJIILJJIL(true, i6, false, bool3, th, null, bool4);
                                                    }

                                                    @Override // X.C0POE
                                                    public final void onNext(FeedItemList feedItemList) {
                                                        Integer numValueOf;
                                                        FeedItemList feedItemList2 = feedItemList;
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("stream awemeList: ");
                                                        sbLIZ5.append(feedItemList2);
                                                        sbLIZ5.append(", chunk: ");
                                                        if (feedItemList2 != null) {
                                                            numValueOf = Integer.valueOf(feedItemList2.chunkIndex);
                                                        } else {
                                                            numValueOf = null;
                                                        }
                                                        sbLIZ5.append(numValueOf);
                                                        C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                        if (feedItemList2 != null && feedItemList2.chunkIndex == 1) {
                                                            ProfileTabApi.LIZJ(feedItemList2, false);
                                                            C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                                            int iOrdinal2 = EnumC1253390iin.SMALL_PACKAGE.ordinal();
                                                            Boolean bool3 = Boolean.TRUE;
                                                            Boolean bool4 = Boolean.FALSE;
                                                            c1250680ieQ2.getClass();
                                                            C1250680ieQ.LJIILJJIL(true, iOrdinal2, true, bool3, null, null, bool4);
                                                            this.LIZ.element = EnumC1253390iin.BIG_PACKAGE.ordinal();
                                                            return;
                                                        }
                                                        this.LIZIZ.LIZ = feedItemList2;
                                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LIZJ;
                                                        C1253180iiS.LJI(this.LIZIZ.LIZ);
                                                        this.LIZIZ.LIZ(true);
                                                        this.LIZIZ.LIZLLL(true, null, Long.valueOf(jCurrentTimeMillis3));
                                                        C1250680ieQ c1250680ieQ3 = C1250680ieQ.LIZ;
                                                        int iOrdinal3 = EnumC1253390iin.BIG_PACKAGE.ordinal();
                                                        Boolean bool5 = Boolean.TRUE;
                                                        Boolean bool6 = Boolean.FALSE;
                                                        c1250680ieQ3.getClass();
                                                        C1250680ieQ.LJIILJJIL(true, iOrdinal3, true, bool5, null, null, bool6);
                                                    }

                                                    {
                                                        this.LIZ = c118300cf2;
                                                        this.LIZIZ = c1253180iiS9;
                                                        this.LIZLLL = str8;
                                                        this.LJ = str9;
                                                    }
                                                });
                                            } else {
                                                Exception exc = new Exception("request post stream is null");
                                                c1253180iiS8.LJ(str6, str7, i5, true);
                                                C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                                int iOrdinal2 = EnumC1253390iin.REQUEST_PERIOD.ordinal();
                                                Boolean bool3 = Boolean.TRUE;
                                                Boolean bool4 = Boolean.FALSE;
                                                c1250680ieQ2.getClass();
                                                C1250680ieQ.LJIILJJIL(true, iOrdinal2, false, bool3, exc, null, bool4);
                                            }
                                            C1C7U.LIZIZ("ProfileApiAdvanceRequestHelper@5c8a.fetchSugByFastChunk$1$1");
                                            return null;
                                        }
                                    });
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ProfileApiAdvanceRequestHelper@5c8a.fetchSugByFastChunk$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ProfileApiAdvanceRequestHelper@5c8a.fetchSugByFastChunk$1");
                            }
                        });
                    } else {
                        c1253180iiSDS.LJ(str2, str, i, false);
                    }
                    C1253180iiS c1253180iiS7 = c1253180iiSDS;
                    ProfilePlatformViewModel profilePlatformViewModel3 = profilePlatformViewModelGS;
                    Bundle bundle6 = arguments2;
                    c1253180iiS7.getClass();
                    int i4 = C2187451AjH.LIZ;
                    if (profilePlatformViewModel3 != null) {
                        if (bundle6 != null && (string5 = bundle6.getString("profile_from_scene")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string5)) != null) {
                            iIntValue = numLJIIJJI.intValue();
                        }
                        ProfilePlatformViewModel.PQ2(profilePlatformViewModel3, iIntValue, EnumC1251790igD.START_OTHER_PAGE, null, 9);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfileApiAdvanceRequestHelper@5c8a.asyncRequestApi$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfileApiAdvanceRequestHelper@5c8a.asyncRequestApi$1");
                }
            });
        }
        super.onCreate(bundle);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.LLLLJ = arguments3.getBoolean("is_response_home_feed_scroll");
            this.LLLLLLJ = Intrinsics.LJFF(arguments3.getString("extra_from_social_avatar_download_page", ""), "1");
        }
        if (iS()) {
            FS(this);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString("source_btm_token")) == null) {
            string = this.LLLLLLZZ;
        }
        this.LLLLLLZZ = null;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b5836", string);
        C1253420iiq c1253420iiq = C1253420iiq.LIZ;
        EnumC048600Fo enumC048600Fo = EnumC048600Fo.HOMEPAGE_OTHER_PROFILE;
        c1253420iiq.getClass();
        C1253420iiq.LIZLLL(enumC048600Fo, true);
        if (C299970BpL.LIZ()) {
            C1250680ieQ.LIZIZ(System.currentTimeMillis() - this.LLLLLL, "page_on_create_complete_time");
        } else {
            C1250680ieQ.LIZJ(System.currentTimeMillis(), "page_on_create_complete_time");
        }
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZIZ(this, "others_homepage");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C786410Ut5.LJJJI("uid", this.LL, bundle);
        C786410Ut5.LJJJI("sec_user_id", this.LLILLJJLI, bundle);
        super.onSaveInstanceState(bundle);
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LJ, "others_homepage") && getActivity() != null && this.LLJIJIL != null && c1365870leD.LJI == null) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getActivity(), this.LLJIJIL, c1365870leD);
        }
    }

    @C14EU
    public final void onUpdateUserEvent(C848450XQd c848450XQd) {
        User user;
        if (c848450XQd != null && (user = c848450XQd.LIZ) != null && TextUtils.equals(user.getUid(), this.LL)) {
            JS(c848450XQd.LIZ, false, "");
        }
    }

    public final void rS(int i) {
        String str;
        UserAwemePagerAbility userAwemePagerAbility;
        this.LLLLLLZ = i;
        if (C123100dR.LIZ(this.LLILZLL)) {
            str = this.LLILZLL;
        } else if (C123100dR.LIZ(this.LLLI)) {
            str = this.LLLI;
        } else {
            str = this.LLLLLLLLL;
        }
        C1253260iia c1253260iia = new C1253260iia(i, str);
        this.LLLLL.LJIJJLI = c1253260iia;
        InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
        if (interfaceC665370Q7zHS != null && (userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, UserAwemePagerAbility.class, null)) != null) {
            userAwemePagerAbility.UO(c1253260iia);
        }
    }

    public final void sS(C1252480ihK c1252480ihK) {
        this.LLLLL.LJIJI = c1252480ihK;
        if (this.LLLIIII == null) {
            this.LLLIIII = new LinkedHashMap();
        }
        Map<String, String> map = this.LLLIIII;
        String str = "";
        if (map != null) {
            String str2 = c1252480ihK.roomRequestId;
            if (str2 == null) {
                str2 = "";
            }
            map.put("room_request_id", str2);
        }
        Map<String, String> map2 = this.LLLIIII;
        if (map2 != null) {
            String str3 = c1252480ihK.fromRoomId;
            if (str3 == null) {
                str3 = "";
            }
            map2.put("from_room_id", str3);
        }
        Map<String, String> map3 = this.LLLIIII;
        if (map3 != null) {
            String str4 = c1252480ihK.liveEnterModule;
            if (str4 == null) {
                str4 = "";
            }
            map3.put("live_enter_module", str4);
        }
        Map<String, String> map4 = this.LLLIIII;
        if (map4 != null) {
            String str5 = c1252480ihK.fromAnchorId;
            if (str5 != null) {
                str = str5;
            }
            map4.put("from_anchor_id", str);
        }
        uS(this.LLLIIII);
    }

    @Override // X.C0SSX
    public final void setEventType(String str) {
        this.LLLI = str;
        this.LLLLL.LJIIJ = str;
    }

    public final void setPreviousPage(String str) {
        HashMap<String, String> mobParams;
        String str2;
        Aweme aweme = this.LLLFF;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("previous_page")) != null) {
            str = str2;
        }
        this.LLILZLL = str;
        this.LLLLL.LIZLLL = str;
        this.LLLLLIL.LIZ = str;
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS70S1000000_19(this.LLILZLL, 0), false);
        }
    }

    @Override // X.C0SSX
    public final void setVisible(boolean z) {
        String str;
        String aid;
        String str2;
        Integer numValueOf;
        String uid;
        String requestId;
        User author;
        MainActivityScope mainActivityScopeLIZJ;
        HomePageViewPagerAbility homePageViewPagerAbilityLIZJ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisible visible: ");
        sbLIZ.append(z);
        C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLF = z;
        setUserVisibleHint(z);
        if (z) {
            C1513630pUX.LJ = true;
        }
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZ(this);
        String str3 = "";
        if (!z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getHasRequested ");
            sbLIZ2.append(this.LLLLII);
            C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLLLII) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                String str4 = this.LL;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = this.LLLFFI;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = this.LLLLLLLLL;
                if (str6 == null) {
                    str6 = this.LLLI;
                }
                User user = this.LLJI;
                c1245340iVo.getClass();
                C1245340iVo.LIZ(false, str4, str5, str6, user);
                C1020810cff c1020810cff = C1020810cff.LIZ;
                String str7 = this.LL;
                c1020810cff.getClass();
                C1020810cff.LJI.submit(new ARunnableS9S1000000_16(str7, 4));
            }
            C1720106oR.LJI("I18nUserProfileFragment", "setHasRefreshed false");
            this.LLLLII = false;
            this.LLLILZLLLI = this.LL;
            this.LLLILZJ = false;
            if (C299980BpM.LIZ()) {
                C1245340iVo c1245340iVo2 = C1245340iVo.LIZ;
                String str8 = this.LL;
                c1245340iVo2.getClass();
                if (str8 != null) {
                    ConcurrentHashMap<String, Set<String>> concurrentHashMap = C1245340iVo.LJJIFFI;
                    if (concurrentHashMap.contains(str8)) {
                        concurrentHashMap.remove(str8);
                    }
                }
            }
            C1253420iiq c1253420iiq = C1253420iiq.LIZ;
            EnumC048600Fo enumC048600Fo = EnumC048600Fo.HOMEPAGE_OTHER_PROFILE;
            c1253420iiq.getClass();
            C1253420iiq.LIZIZ(enumC048600Fo);
            this.LLJJJJJIL = false;
            this.LLLFZ = false;
            if (C299970BpL.LIZ()) {
                this.LLLLLLIL = false;
            }
            C1255980imy.LIZIZ();
        }
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            profilePlatformViewModelGS.SQ2(new AwS91S0110000_3(new C291001Au(Boolean.valueOf(z)), z, 0), false);
        }
        C19EG activity = getActivity();
        if (activity != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (homePageViewPagerAbilityLIZJ = C1256610inz.LIZJ(mainActivityScopeLIZJ)) != null) {
            homePageViewPagerAbilityLIZJ.rj0(z);
        }
        if (z) {
            if (C299970BpL.LIZ() && !this.LLLLLLIL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setVisible starTime: ");
                sbLIZ3.append(jCurrentTimeMillis);
                C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ3));
                C1253110iiL c1253110iiL = new C1253110iiL();
                c1253110iiL.LIZIZ = this.LL;
                c1253110iiL.LJ = this.LLILZLL;
                c1253110iiL.LJIIIIZZ = this.LLLII;
                Aweme aweme = this.LLLFF;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                c1253110iiL.LJII = aid;
                c1253110iiL.LJIIIZ = Long.valueOf(jCurrentTimeMillis);
                String str9 = this.LLLLLLLLL;
                if (str9 != null && str9.length() != 0) {
                    str2 = this.LLLLLLLLL;
                } else {
                    str2 = this.LLLI;
                }
                c1253110iiL.LIZLLL = str2;
                c1253110iiL.LIZJ = this.LLILZIL;
                Aweme aweme2 = this.LLLFF;
                if (aweme2 != null) {
                    numValueOf = Integer.valueOf(aweme2.getAwemeType());
                } else {
                    numValueOf = null;
                }
                c1253110iiL.LJFF = numValueOf;
                Aweme aweme3 = this.LLLFF;
                if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                c1253110iiL.LIZ = uid;
                Aweme aweme4 = this.LLLFF;
                if (aweme4 != null) {
                    requestId = aweme4.getRequestId();
                } else {
                    requestId = null;
                }
                c1253110iiL.LJI = requestId;
                c1253110iiL.LIZ();
            }
            String str10 = this.LLLILZLLLI;
            if (str10 != null && str10.equals(this.LL)) {
                oS(this.LLJI, EnumC2139108Zp.VISIBLE);
            } else {
                ProfilePlatformViewModel profilePlatformViewModelGS2 = gS();
                if (profilePlatformViewModelGS2 != null) {
                    profilePlatformViewModelGS2.setStateImmediate(new AwS582S0100000_3(new C291001Au(Boolean.TRUE), (C291001Au<Unit>) 2));
                }
            }
            this.LLJJIJIL = System.currentTimeMillis();
            mS();
            String str11 = this.LL;
            if (str11 != null) {
                C1209900hae.LIZLLL = true;
                if (!Intrinsics.LJFF(str11, C1209900hae.LIZIZ)) {
                    C1209900hae.LIZ = 0;
                    C1209900hae.LIZIZ = str11;
                }
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Boolean bool = Boolean.TRUE;
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, bool, c0psl);
            String str12 = this.LLLLLLZZ;
            if (str12 != null) {
                btmSDK.updateBtmPage(this, str12);
                this.LLLLLLZZ = null;
            }
            C1256070in7.LIZ = System.currentTimeMillis();
        } else {
            WR();
            C1253140iiO.LIZ.getClass();
            C1253330iih c1253330iih = C1253140iiO.LIZIZ;
            if (c1253330iih != null) {
                c1253330iih.LIZJ(2, "homepage_other_profile_info", true);
            }
            C1253160iiQ.LIZ.getClass();
            C1253330iih c1253330iih2 = C1253160iiQ.LIZIZ;
            if (c1253330iih2 != null) {
                c1253330iih2.LIZJ(2, "homepage_other_aweme_post", true);
            }
            C1209900hae.LIZLLL = false;
            C1209900hae.LIZ = 0;
            BtmSDK.INSTANCE.onPageHide(this, null);
            ZR();
        }
        C1595060rbs c1595060rbs = C1595060rbs.LIZIZ;
        String str13 = this.LL;
        if (str13 != null) {
            str3 = str13;
        }
        c1595060rbs.LJIILL(str3, z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LLJILJIL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LIZIZ(z);
        }
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        Aweme aweme5 = this.LLLFF;
        if (z) {
            str = "page_visit";
        } else {
            str = "page_leave";
        }
        iCommercePageTrackingServiceLIZLLL.LIZJ(new C19406010w6((Integer) 4, aweme5, "homepage_ad", str, (String) null, 32));
    }

    public final void uS(Map<String, String> map) {
        this.LLLIIII = map;
        this.LLLLL.LJIIL = map;
    }

    public final void wS(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLLLL.LJ = str;
    }

    public final void yS(boolean z) {
        IAvatarMainAbility iAvatarMainAbility;
        EnumC1990407qw enumC1990407qw = this.LLLLLLL;
        if (enumC1990407qw == EnumC1990407qw.LOAD_DONE) {
            InterfaceC665370Q7z interfaceC665370Q7zHS = hS();
            if (interfaceC665370Q7zHS != null && (iAvatarMainAbility = (IAvatarMainAbility) C1558520qew.LIZ(interfaceC665370Q7zHS, IAvatarMainAbility.class, null)) != null) {
                iAvatarMainAbility.hs2(this.LL);
            }
            if (!z) {
                C818480W8w.LIZJ(C1253130iiN.LIZ, C0W93.SUCCESS, null, C2097608Jq.LJ());
                return;
            }
            return;
        }
        if (enumC1990407qw == EnumC1990407qw.LOAD_ING) {
            return;
        }
        zS();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C1248210iaR.LJ("I18nUserProfileFragment", "", EnumC1253850ijX.LIFECYCLE, "onAttach");
        if (C1ELC.LIZLLL()) {
            boolean z = C0CJG.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            if (activity != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C443701o3(interfaceC665370Q7zLJFF, null), 3);
            }
            C0CJG.LIZ(activity);
            C0CJG.LIZLLL(activity, false);
        }
    }

    public final void BS(String str, String str2) {
        String str3;
        String str4;
        ProfilePlatformViewModel profilePlatformViewModelGS;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserId userId: ");
        sbLIZ.append(str);
        C1720106oR.LJI("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1251390ifZ.LIZ.getClass();
        if (C1251390ifZ.LIZIZ(false) && ((!TextUtils.equals(this.LL, str) || !TextUtils.equals(this.LLILLJJLI, str2)) && (str4 = this.LL) != null && str4.length() != 0 && (profilePlatformViewModelGS = gS()) != null)) {
            profilePlatformViewModelGS.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 1), false);
        }
        this.LL = str;
        this.LLILLJJLI = str2;
        C1252220igu c1252220igu = this.LLLLL;
        c1252220igu.LIZ = str;
        c1252220igu.LIZIZ = str2;
        C1245340iVo.LIZ.getClass();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        C1245340iVo.LJ = str3;
        IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) this.LLLLIILLL.getValue();
        if (iProfileMusicTabService != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("I18nUserProfileFragment setUserId, uid:");
            sbLIZ2.append(str);
            sbLIZ2.append(", secUid");
            sbLIZ2.append(str2);
            sbLIZ2.append(", enterMethod:");
            sbLIZ2.append(this.LLLLLLLLL);
            iProfileMusicTabService.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
        }
        ProfilePlatformViewModel profilePlatformViewModelGS2 = gS();
        if (profilePlatformViewModelGS2 != null) {
            profilePlatformViewModelGS2.SQ2(new AwS18S2000000_19(str, str2, 0), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    @Override // X.C0SSX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WL(com.ss.android.ugc.aweme.profile.model.User r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment.WL(com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void hU1(boolean z, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            C1253180iiS c1253180iiSDS = dS();
            c1253180iiSDS.LJ = bool2;
            c1253180iiSDS.LIZ(false);
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "notifyHasUpdateUser call back");
        }
        this.LLLLLLL = EnumC1990407qw.LOAD_IDLE;
        if (!z) {
            oS(this.LLJI, EnumC2139108Zp.FAIL);
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void lO2(int i, int i2) {
        boolean z;
        int i3;
        ProfilePlatformViewModel profilePlatformViewModelGS;
        IMUser iMUserLIZJ;
        ProfilePlatformViewModel profilePlatformViewModelGS2;
        int i4;
        if (this.LLJI == null) {
            return;
        }
        String str = this.LL;
        if (str != null) {
            C1265520j2M.LIZ(str);
        }
        User user = this.LLJI;
        int i5 = 1;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        user.setBlock(z);
        if (C299940BpI.LIZ()) {
            if (i2 == 4) {
                if (i == 1) {
                    i4 = 2131837582;
                } else {
                    i4 = 2131837592;
                }
            } else if (i == 1) {
                i4 = 2131837581;
            } else {
                i4 = 2131837591;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(i4);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
            Resources resources = getResources();
            if (i == 1) {
                i3 = 2131826446;
            } else {
                i3 = R.string.unBlock;
            }
            c1389890mGx2.LJIIJ(resources.getString(i3));
            c1389890mGx2.LJIIJJI();
        }
        if (i == 1) {
            this.LLJI.setFollowStatus(0);
            this.LLJI.boldFields = Collections.singletonList("nickname");
            if (isViewValid()) {
                ProfilePlatformViewModel profilePlatformViewModelGS3 = gS();
                if (profilePlatformViewModelGS3 != null) {
                    profilePlatformViewModelGS3.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 5), false);
                }
                this.LLLLLLL = EnumC1990407qw.LOAD_IDLE;
            }
            C888460YtI c888460YtI = new C888460YtI();
            c888460YtI.LIZ = this.LLJI;
            C1440005kM.LIZ(c888460YtI);
            if (C1249540ica.LIZ && (profilePlatformViewModelGS2 = gS()) != null) {
                ProfilePlatformViewModel.PQ2(profilePlatformViewModelGS2, 0, EnumC1251790igD.NORMAL, "blockUser", 3);
            }
        } else {
            C486890J7n c486890J7n = new C486890J7n();
            c486890J7n.LIZ = this.LLJI;
            C1440005kM.LIZ(c486890J7n);
            OC1();
            if (isViewValid() && C0BMT.LIZ() && (profilePlatformViewModelGS = gS()) != null) {
                profilePlatformViewModelGS.SQ2(new AwS582S0100000_3(new C291001Au(Unit.LIZ), (C291001Au<Unit>) 0), false);
            }
            if (C1249540ica.LIZ) {
                JS(this.LLJI, false, "");
            }
        }
        User user2 = this.LLJI;
        if (i2 != 4) {
            i5 = 0;
        }
        user2.blockingByType = i5;
        InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
        User user3 = this.LLJI;
        if (user3 == null) {
            iMUserLIZJ = null;
        } else {
            IMUser.Companion.getClass();
            iMUserLIZJ = C2201941BFw.LIZJ(user3);
        }
        imUserService.LJIILIIL(iMUserLIZJ);
        if (!C1249540ica.LIZ) {
            JS(this.LLJI, false, "");
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void ma2(Boolean bool, String str) {
        HS(str, this.LLLLJI, this.LLILLL);
        if (Intrinsics.LJFF(str, "refresh")) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                C1253180iiS c1253180iiSDS = dS();
                c1253180iiSDS.LJ = bool2;
                c1253180iiSDS.LIZ(false);
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "notifyHasUpdateUser call back");
            }
        }
        C0X35.LJIJ(C0X37.Profile);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[PHI: r1
      0x00cc: PHI (r1v11 java.lang.String) = (r1v8 java.lang.String), (r1v12 java.lang.String) binds: [B:34:0x00ca, B:32:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[PHI: r1
      0x00ee: PHI (r1v13 java.lang.String) = (r1v6 java.lang.String), (r1v14 java.lang.String) binds: [B:27:0x00b7, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oS(com.ss.android.ugc.aweme.profile.model.User r8, X.EnumC2139108Zp r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment.oS(com.ss.android.ugc.aweme.profile.model.User, X.08Zp):void");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        View view;
        if (!kS() || (view = getView()) == null) {
            return;
        }
        if (getUserVisibleHint()) {
            C1253470iiv.LIZJ(configuration.orientation, view);
        }
        int i = configuration.orientation;
        View view2 = getView();
        if (view2 != null) {
            C1253470iiv.LIZIZ(view2, i, false, 12);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Boolean boolValueOf;
        String strOptString;
        int i;
        Resources resources;
        Configuration configuration;
        C19EG activity;
        String string;
        Integer numLJIIJJI;
        String string2;
        boolean zLJI = MethodIDManager.LJI(202435);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterFrom=");
        sbLIZ.append(this.LLLLLLLLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILZLL);
        C1248210iaR.LJ("I18nUserProfileFragment", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.LIFECYCLE, "onViewCreated");
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("extra_previous_page")) != null && C123100dR.LIZ(string2)) {
            setPreviousPage(string2);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("profile_from_scene")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLLLLLLLLL = iIntValue;
        C1256070in7.LIZ = System.currentTimeMillis();
        super.onViewCreated(view, bundle);
        C1253140iiO.LIZ.getClass();
        C1253140iiO.LIZ(new C1253190iiT(), this.LLILZLL);
        C1253200iiU c1253200iiU = new C1253200iiU();
        String str = this.LLILZLL;
        if (str == null) {
            str = this.LLLLLLLLL;
        }
        C1253150iiP.LIZ(c1253200iiU, str, true, "homepage_other_profile");
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            boolValueOf = Boolean.valueOf(arguments3.getBoolean("delay_profile_loading"));
        } else {
            boolValueOf = null;
        }
        if (!C1260030itV.LIZ() && (boolValueOf == null || !boolValueOf.booleanValue())) {
            C823050WQl.LIZLLL().execute(new ARunnableS119S0100000_19(this, 134));
        }
        try {
            strOptString = new JSONObject(this.LLLIL).optString("rfevent_previous_page");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            strOptString = "";
        }
        this.LLJL = strOptString;
        if (this.LLLLJ && (activity = getActivity()) != null) {
            C486860J7k.LIZIZ(activity).HQ2(this, new AObserverS223S0100000_19(this, 42));
        }
        if (!iS()) {
            FS(this);
        }
        C736400Suc c736400Suc = C736400Suc.LIZ;
        User user = this.LLJI;
        String type = EnumC1260930iux.ENTER_PROFILE.getType();
        String str2 = this.LLLLLLLLL;
        String str3 = this.LLJL;
        c736400Suc.getClass();
        C736400Suc.LJ(user, type, str2, str3, null, null, null);
        if (kS()) {
            C1253470iiv.LIZ(view, false);
            C19EG activity2 = getActivity();
            if (activity2 != null && (resources = activity2.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                i = configuration.orientation;
            } else {
                i = 1;
            }
            View view2 = getView();
            if (view2 != null) {
                C1253470iiv.LIZIZ(view2, i, false, 12);
            }
        }
        if (!C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1250680ieQ.getClass();
            C1250680ieQ.LIZJ(jCurrentTimeMillis, "page_on_view_created_complete_time");
        }
        C1253310iif c1253310iif = new Object() { // from class: X.0iif
        };
        String str4 = this.LLJLLL;
        String str5 = this.LLJLL;
        String str6 = this.LLJLLIL;
        boolean z = this.LLJZ;
        c1253310iif.getClass();
        if (str4 != null && str4.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("page_name", "user profile");
            c2344009Gk.LJIIIIZZ("ug_media_source", str4);
            c2344009Gk.LJIIIIZZ("ug_campaign_id", str5);
            c2344009Gk.LJIIIIZZ("ug_adset_id", str6);
            c2344009Gk.LJ(Boolean.valueOf(z), "is_ddl");
            c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            C20684815ws.LJIILLIIL("tiktokec_internal_enter_page_attribution_event", c2344009Gk.LIZ);
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("I18nUserProfileFragment", "showUserProfile onViewCreated end");
        C013C c013c = new C013C();
        c013c.element = true;
        C0K77 c0k77C3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3();
        if (C296970BkV.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1642406bu(c0k77C3, new C1253100iiK(this, null), null), 3);
        } else {
            c0k77C3.LJIILJJIL().observe(getViewLifecycleOwner(), new AObserverS182S0200000_19(this, c013c, 2));
        }
        if (C299970BpL.LIZ()) {
            C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLLLLL;
            c1250680ieQ2.getClass();
            C1250680ieQ.LIZIZ(jCurrentTimeMillis2, "page_on_view_created_complete_time");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed A[PHI: r1
      0x00ed: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v10 java.lang.String), (r1v10 java.lang.String) binds: [B:52:0x00e9, B:24:0x0051, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pM0(com.ss.android.ugc.aweme.profile.model.User r12, com.ss.android.ugc.profile.platform.base.data.ProfileUser r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment.pM0(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileUser):void");
    }

    @Override // com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility
    public final void sA2(User user, EnumC1251790igD enumC1251790igD) {
        if (user == null) {
            return;
        }
        JS(user, false, enumC1251790igD.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HS(java.lang.String r35, com.ss.android.ugc.profile.platform.base.data.ProfileUser r36, android.view.View r37) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment.HS(java.lang.String, com.ss.android.ugc.profile.platform.base.data.ProfileUser, android.view.View):void");
    }

    public final void JS(User user, boolean z, String str) {
        ProfileComponents profileComponents;
        ProfileUser profileUser;
        T7(user);
        C1889007aa c1889007aaAS = null;
        InterfaceC1252070igf interfaceC1252070igf = (InterfaceC1252070igf) C1252710ihh.LJ(this, C13LE.LIZ(InterfaceC1252070igf.class), null);
        if (interfaceC1252070igf != null) {
            interfaceC1252070igf.je(user, EnumC1251790igD.NORMAL, z);
        }
        C1251390ifZ.LIZ.getClass();
        boolean zLIZIZ = C1251390ifZ.LIZIZ(false);
        try {
            if (zLIZIZ && (profileUser = this.LLLLJI) != null) {
                profileComponents = profileUser.profileBackground;
            } else {
                profileComponents = null;
                if (zLIZIZ) {
                }
                C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                ProfileUser profileUser2 = this.LLLLJI;
                C1253080iiI c1253080iiI = new C1253080iiI(zLIZIZ, profileComponents, c1889007aaAS, this, str);
                c1251850igJ.getClass();
                C1251850igJ.LJIILIIL(user, profileUser2, false, c1253080iiI);
                return;
            }
            C1251850igJ c1251850igJ2 = C1251850igJ.LIZ;
            ProfileUser profileUser22 = this.LLLLJI;
            C1253080iiI c1253080iiI2 = new C1253080iiI(zLIZIZ, profileComponents, c1889007aaAS, this, str);
            c1251850igJ2.getClass();
            C1251850igJ.LJIILIIL(user, profileUser22, false, c1253080iiI2);
            return;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            C1251850igJ.LIZ.getClass();
            n nVar = C1251850igJ.LIZJ;
            c1250680ieQ.getClass();
            C1250680ieQ.LJ(nVar, e);
            C1250160ida.LIZ.getClass();
            this.LLLLJI = C1250160ida.LIZJ;
            return;
        }
        c1889007aaAS = aS(profileComponents);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ProfilePlatformViewModel profilePlatformViewModelGS = gS();
        if (profilePlatformViewModelGS != null) {
            if (i == 10004) {
                profilePlatformViewModelGS.SQ2(new AwS25S0102000_3(i, i2, intent, 0), true);
            } else {
                profilePlatformViewModelGS.SQ2(new AwS25S0102000_3(i, i2, intent, 1), false);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (Build.VERSION.SDK_INT >= 35 && this.LLLLLZ && viewOnCreateView != null) {
            viewOnCreateView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0ip1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Insets insets = windowInsets.getInsets(7);
                    view.setPadding(insets.left, 0, insets.right, insets.bottom);
                    return windowInsets;
                }
            });
        }
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
