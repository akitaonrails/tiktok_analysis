package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.AbstractC1883407Zg;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C05TC;
import X.C05TE;
import X.C05TN;
import X.C05TP;
import X.C05VZ;
import X.C09IR;
import X.C0C2B;
import X.C0C3L;
import X.C0CSC;
import X.C0PEM;
import X.C0QSJ;
import X.C0T1R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C1212050he7;
import X.C1220000hqw;
import X.C1222800hvS;
import X.C1279710jPF;
import X.C127G;
import X.C1301910jz3;
import X.C1355280lN8;
import X.C1360910lWD;
import X.C1371870lnt;
import X.C13LE;
import X.C13LQ;
import X.C14EU;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1597406Ng;
import X.C1606550ruP;
import X.C1622206Wu;
import X.C1687350u0j;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1883307Zf;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1BNE;
import X.C1D17;
import X.C20235014Fo;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C2239641ClG;
import X.C2239661ClI;
import X.C2239671ClJ;
import X.C2239681ClK;
import X.C2239691ClL;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C329200CvO;
import X.C338490DOt;
import X.C338520DOw;
import X.C449180HjQ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C465401rY;
import X.C597050NbL;
import X.C616540OGe;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737030Svd;
import X.C739550Szh;
import X.C739870T0n;
import X.C786410Ut5;
import X.C861500Xqu;
import X.C861530Xqx;
import X.C987103tV;
import X.EnumC1284930jXf;
import X.EnumC1284940jXg;
import X.EnumC1301920jz4;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import X.EnumC1687410u0p;
import X.EnumC1783070wV7;
import X.EnumC325100Com;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1360930lWF;
import X.InterfaceC1368705Xh;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC737790Swr;
import X.InterfaceC861480Xqs;
import Y.AObjectS408S0100000_34;
import Y.ARunnableS30S0101000_19;
import android.os.Bundle;
import android.os.Looper;
import android.util.ArrayMap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbilityImpl;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoPushServerInfo;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoEntranceRecorder;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS7S1010000_25;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class TakoAiVideoDetailPageFragment extends DetailPageFragment implements InterfaceC1682240tsU, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9KSw6ICs2J2soLDHELIOSsyISliOS40LWsYKCQ8CSwaICs2JwEpPS46JBUtLioVOiQrJCo9PA==";
    public C0C3L LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public boolean LLJIJIL;
    public final AssemVMLazy LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C329200CvO LLJJIJIIJIL;
    public final C1301910jz3 LLJJIJIL;
    public C0C2B LLJJJ;
    public final C01GW LLJJJIL;
    public EnumC325100Com LLJJJJ;
    public final C1212050he7 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C1D17 LLJL;
    public IViewPagerComponentAbility LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public Long LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public C861500Xqu LLLII;
    public boolean LLLIIII;
    public final C2252321DDq LLLIIIIL;
    public final C2252331DDr LLLIIIL;
    public final C2252331DDr LLLIIL;
    public final C2252321DDq LLLIILIL;
    public final C01GW LLLIL;
    public boolean LLLILZ;
    public C127G LLLILZJ;
    public int LLJI = -1;
    public final Map<String, Long> LLJILJIL = new LinkedHashMap();
    public final Map<Integer, String> LLJILJILJ = new ConcurrentHashMap();
    public final Map<Integer, TakoPushServerInfo.Biz> LLJILLL = new ConcurrentHashMap();
    public final TakoAiVideoDetailPageFragment LLJJ = this;
    public final TakoAIVideoOverlayAbilityImpl LLJJI = new TakoAIVideoOverlayAbilityImpl();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAiVideoDetailPageFragment.class, "aiVideoViewModel", "getAiVideoViewModel()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AiVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    public final void gS() {
        C0C3L c0c3l = this.LLIZLLLIL;
        if (c0c3l == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        this.LLIZLLLIL = null;
        boolean z = this.LLJIJIL;
        this.LLJIJIL = false;
        bS("", false);
        ZR(UUID.randomUUID().toString(), c0c3l.LIZ, EnumC1687410u0p.USER_QUERY, true, c0c3l.LIZIZ);
        if (z) {
            ZR(UUID.randomUUID().toString(), getString(2131822587), EnumC1687410u0p.THINK, true, -1L);
        }
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [X.0he7] */
    public TakoAiVideoDetailPageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AiVideoViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 617);
        AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(31);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS578S0100000_34((HasDefaultViewModelProviderFactory) this, 93), aFwS281S0000000_34, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS578S0100000_34((Fragment) this, 94), aFwS281S0000000_34, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS578S0100000_34((HasDefaultViewModelProviderFactory) this, 95), aFwS281S0000000_34, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
        AFwS225S0000000_34 aFwS225S0000000_34 = AFwS225S0000000_34.get$arr$(134);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(TakoAIVideoFeedViewModel.class), aFwS225S0000000_34, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS281S0000000_34.get$arr$(32), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIJIIJIL = new C329200CvO();
        this.LLJJIJIL = new C1301910jz3();
        this.LLJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS225S0000000_34.get$arr$(135));
        this.LLJJJJJIL = new C0CSC() { // from class: X.0he7
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment = this.LIZ;
                EnumC325100Com enumC325100Com2 = takoAiVideoDetailPageFragment.LLJJJJ;
                takoAiVideoDetailPageFragment.LLJJJJ = enumC325100Com;
                EnumC325100Com enumC325100Com3 = EnumC325100Com.NOT_AVAILABLE;
                if (enumC325100Com == enumC325100Com3 && enumC325100Com2 != null && enumC325100Com2 != enumC325100Com3) {
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        C1212040he6.LIZLLL(2131827517, C1212040he6.LIZ(takoAiVideoDetailPageFragment));
                    } else {
                        C786410Ut5.LJJZZIII(C1212040he6.LIZ, new ARunnableS30S0101000_19(takoAiVideoDetailPageFragment, 6));
                    }
                }
            }
        };
        this.LLJL = new C1D17(this, 6);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 92));
        this.LLJLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 91));
        this.LLLIIIIL = C1BNE.LIZ(C05TC.SHOW_AWEME);
        this.LLLIIIL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLLIIL = C09IR.LIZIZ(0, 16, null, 5);
        this.LLLIILIL = C1BNE.LIZ(Boolean.TRUE);
        this.LLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 616));
    }

    @Override // X.InterfaceC1682240tsU
    public final void Fh() {
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIJ()) {
            return;
        }
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_ai_video_first_entry_guide");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        String string = getString(2131822612);
        this.LLJJJ = new C0C2B(string, C786410Ut5.j4(getString(2131822611), Arrays.copyOf(new Object[]{getString(2131828523)}, 1)));
        iS().LJIIZILJ(string);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailPageComponent NR() {
        return new TakoAIVideoDetailPageComponent();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailFragmentPanel OR() {
        return new TakoAIVideoPlayDetailPageFragmentPanel(this.LLILLJJLI, this.LLJJ);
    }

    @Override // X.InterfaceC1682240tsU
    public final InterfaceC1368705Xh Ru() {
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJLIL;
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.Ru();
        }
        return null;
    }

    public final void cS() {
        C19EG activity;
        if (this.LLLIIII || !isAdded() || (activity = getActivity()) == null || activity.isFinishing()) {
            return;
        }
        this.LLLIIII = true;
        if (getContext() != null) {
            iS().destroyClient();
        }
        C861500Xqu c861500Xqu = this.LLLII;
        if (c861500Xqu != null) {
            AnonymousClass0956 anonymousClass0956 = c861500Xqu.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c861500Xqu.LIZJ = null;
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                businessCapabilityServiceLIZ.LIZJ(EnumC1355300lNA.TAKO_AIVIDEO);
            }
        }
        this.LLLII = null;
        h7("voice_call");
        activity.finish();
    }

    public final void dS() throws JSONException {
        String str;
        Long l = this.LLLFFI;
        if (l != null) {
            long jLongValue = l.longValue();
            String takoScreenType = null;
            this.LLLFFI = null;
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            C2189821An6 c2189821An6 = this.LLILLJJLI;
            DetailNavArgModel navArgModel = c2189821An6 != null ? c2189821An6.getNavArgModel() : null;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String eventType = c2189821An6 != null ? c2189821An6.getEventType() : null;
            str = "";
            if (eventType == null) {
                eventType = "";
            }
            String strI7 = i7();
            if (navArgModel != null) {
                String takoVideoSessionId = navArgModel.getTakoVideoSessionId();
                str = takoVideoSessionId != null ? takoVideoSessionId : "";
                if (navArgModel != null) {
                    takoScreenType = navArgModel.getTakoScreenType();
                }
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", eventType);
            jSONObject.put("enter_method", strI7);
            jSONObject.put("video_session_id", str);
            jSONObject.put("duration", jCurrentTimeMillis);
            if (takoScreenType != null && takoScreenType.length() > 0) {
                jSONObject.put("screen_type", takoScreenType);
            }
            c20235014FoLIZ.LIZIZ("tikbot_video_stay_time", jSONObject);
        }
    }

    public final AiVideoViewModel hS() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (AiVideoViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1682240tsU
    public final String i7() {
        return (String) this.LLLIL.getValue();
    }

    public final ITakoRTCAbility iS() {
        return (ITakoRTCAbility) this.LLJLL.getValue();
    }

    public final void oS() {
        if ((this.LLJLLIL || this.LLJLLL || this.LLJZIJLIL || this.LLL) && isResumed() && isAdded() && getUserVisibleHint() && !this.LLJZ && getContext() != null && iS().LIZLLL() == EnumC1301920jz4.VOICE.getCode()) {
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            C19EG activity = getActivity();
            c449180HjQ.getClass();
            if (C449180HjQ.LIZJ(activity)) {
                iS().startAudioCapture();
                this.LLJLLIL = false;
                this.LLJLLL = false;
                this.LLJZIJLIL = false;
                this.LLL = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        String processId;
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJLIL;
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLJL);
        }
        this.LLJLIL = null;
        INetworkStateService iNetworkStateService = (INetworkStateService) this.LLJJJIL.getValue();
        if (iNetworkStateService != null) {
            iNetworkStateService.removeNetworkChangeObserver(this.LLJJJJJIL);
        }
        this.LLJJJJ = null;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (!this.LLLI && (((activity = getActivity()) != null && activity.isFinishing()) || isRemoving() || isDetached())) {
            this.LLLI = true;
            C2189821An6 c2189821An6 = this.LLILLJJLI;
            DetailNavArgModel navArgModel = c2189821An6 != null ? c2189821An6.getNavArgModel() : null;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String eventType = c2189821An6 != null ? c2189821An6.getEventType() : null;
            String str = "";
            if (eventType == null) {
                eventType = "";
            }
            String strI7 = i7();
            if (c2189821An6 != null && (processId = c2189821An6.getProcessId()) != null) {
                str = processId;
            }
            String takoVideoSessionId = navArgModel != null ? navArgModel.getTakoVideoSessionId() : null;
            String str2 = this.LLLFZ;
            if (str2 == null) {
                str2 = "other";
            }
            String takoScreenType = navArgModel != null ? navArgModel.getTakoScreenType() : null;
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("enter_from", eventType);
            arrayMap.put("enter_method", strI7);
            arrayMap.put("process_id", str);
            if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
                arrayMap.put("video_session_id", takoVideoSessionId);
            }
            arrayMap.put("exit_method", str2);
            if (takoScreenType != null && takoScreenType.length() > 0) {
                arrayMap.put("screen_type", takoScreenType);
            }
            c20235014FoLIZ.LIZ("tikbot_exit_video", arrayMap);
        }
        C2239641ClG.LIZ.getClass();
        C2239641ClG.LIZIZ.clear();
        C2239641ClG.LIZJ = null;
        C2239641ClG.LIZLLL = null;
        C2239641ClG.LJ = false;
        ((LinkedHashMap) this.LLJILJIL).clear();
        ((ConcurrentHashMap) this.LLJILJILJ).clear();
        ((ConcurrentHashMap) this.LLJILLL).clear();
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZIJLIL = false;
        this.LLL = false;
        this.LLLF = false;
        this.LLLFF = false;
        this.LLJZ = false;
        this.LLJJJJLIIL = false;
        this.LLLIIII = false;
        TakoAIVideoEntranceRecorder.reset();
        C1606550ruP.LIZ.getClass();
        if (C1606550ruP.LIZ()) {
            C861500Xqu c861500Xqu = this.LLLII;
            if (c861500Xqu != null) {
                AnonymousClass0956 anonymousClass0956 = c861500Xqu.LIZJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c861500Xqu.LIZJ = null;
                BusinessCapabilityService.LIZ.getClass();
                BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
                if (businessCapabilityServiceLIZ != null) {
                    businessCapabilityServiceLIZ.LIZJ(EnumC1355300lNA.TAKO_AIVIDEO);
                }
            }
            this.LLLII = null;
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC1682240tsU
    public final void wf() {
        ((AssemSingleListViewModel) this.LLJJIJI.getValue()).manualListRefresh();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1222800hvS(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void VR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1578630rBN.LJIIIIZZ(arguments, "DETAIL_AI_TAKO_VIDEO");
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLILZJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLILZJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{AiVideoViewModel.class, new AObjectS408S0100000_34(this, 7)}, defaultViewModelProviderFactory);
                    this.LLLILZJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final boolean mS() {
        if (getContext() == null) {
            return false;
        }
        return iS().LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() throws JSONException {
        super.onPause();
        if (mS()) {
            iS().stopAudioCapture();
            this.LLJLLIL = true;
        }
        if (getContext() != null) {
            iS().LJIIJJI(EnumC1284940jXg.MUTE);
        }
        dS();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(TakoAiVideoDetailPageFragment.class.getName());
        }
        super.onResume();
        if (isAdded() && getUserVisibleHint()) {
            if (this.LLLFFI == null) {
                this.LLLFFI = Long.valueOf(System.currentTimeMillis());
            }
            oS();
        }
    }

    @Override // X.InterfaceC1682240tsU
    public final /* bridge */ /* synthetic */ C2252321DDq Ji() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1682240tsU
    public final /* bridge */ /* synthetic */ C2252331DDr QJ() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC1682240tsU
    public final C2189821An6 Xn() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1682240tsU
    public final /* bridge */ /* synthetic */ C2252321DDq k5() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC1682240tsU
    public final void G4(C737030Svd c737030Svd) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05TP(this, c737030Svd, null), 3);
    }

    @Override // X.InterfaceC1682240tsU
    public final void Ls(boolean z) {
        this.LLLIILIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1682240tsU
    public final void TE(Aweme aweme) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05TN(this, aweme, null), 3);
    }

    @Override // X.InterfaceC1682240tsU
    public final void TQ(String str) {
        qS(EnumC1783070wV7.KEYBOARD);
        C2239641ClG.LIZ.getClass();
        C2239671ClJ c2239671ClJ = C2239641ClG.LIZJ;
        if (c2239671ClJ != null && !c2239671ClJ.LIZLLL) {
            C2239681ClK c2239681ClK = c2239671ClJ.LIZ;
            c2239681ClK.getClass();
            if (str != null && str.length() > 0) {
                c2239681ClK.LIZLLL = str;
                c2239681ClK.LIZ(str, "query_message_id");
            }
        }
    }

    public final void WR(String str) {
        ZR(UUID.randomUUID().toString(), str, EnumC1687410u0p.NORMAL_TIP, true, -1L);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoAIVideoDetailScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJJ, InterfaceC1682240tsU.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJI, TakoAIVideoOverlayAbility.class);
        c0qsjLIZIZ.unbindAbility(hS(), C05VZ.class);
        c0qsjLIZIZ.unbindAbility(iS(), ITakoRTCAbility.class);
    }

    @Override // X.InterfaceC1682240tsU
    public final void eI(String str) throws JSONException {
        DetailNavArgModel navArgModel;
        Aweme awemeLJIIIIZZ;
        String eventType;
        String takoSessionId;
        String takoVideoSessionId;
        String aid;
        String processId;
        C2189821An6 c2189821An6 = this.LLILLJJLI;
        String takoScreenType = null;
        if (c2189821An6 != null) {
            navArgModel = c2189821An6.getNavArgModel();
        } else {
            navArgModel = null;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(this);
        if (iFeedPanelPlatformAbilityLIZJ != null) {
            awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        String str2 = "";
        if (eventType == null) {
            eventType = "";
        }
        String strI7 = i7();
        if (c2189821An6 != null && (processId = c2189821An6.getProcessId()) != null) {
            str2 = processId;
        }
        if (navArgModel != null) {
            takoSessionId = navArgModel.getTakoSessionId();
            takoVideoSessionId = navArgModel.getTakoVideoSessionId();
        } else {
            takoSessionId = null;
            takoVideoSessionId = null;
        }
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        if (navArgModel != null) {
            takoScreenType = navArgModel.getTakoScreenType();
        }
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", eventType);
        jSONObject.put("enter_method", strI7);
        jSONObject.put("process_id", str2);
        if (takoSessionId != null && takoSessionId.length() > 0) {
            jSONObject.put("tako_session_id", takoSessionId);
        }
        if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
            jSONObject.put("video_session_id", takoVideoSessionId);
        }
        if (aid != null && aid.length() > 0) {
            jSONObject.put("group_id", aid);
        }
        if (takoScreenType != null && takoScreenType.length() > 0) {
            jSONObject.put("screen_type", takoScreenType);
        }
        jSONObject.put("button_type", str);
        c20235014FoLIZ.LIZIZ("tikbot_msg_panel_button_click", jSONObject);
    }

    @Override // X.InterfaceC1682240tsU
    public final void fz(C05TC c05tc) throws JSONException {
        String str;
        DetailNavArgModel navArgModel;
        Aweme awemeLJIIIIZZ;
        String eventType;
        String takoSessionId;
        String takoVideoSessionId;
        String aid;
        String processId;
        Object value = this.LLLIIIIL.getValue();
        this.LLLIIIIL.setValue(c05tc);
        if (c05tc != value) {
            int i = C05TE.LIZ[c05tc.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    str = "hide";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "show";
            }
            C2189821An6 c2189821An6 = this.LLILLJJLI;
            String takoScreenType = null;
            if (c2189821An6 != null) {
                navArgModel = c2189821An6.getNavArgModel();
            } else {
                navArgModel = null;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(this);
            if (iFeedPanelPlatformAbilityLIZJ != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            String str2 = "";
            if (eventType == null) {
                eventType = "";
            }
            String strI7 = i7();
            if (c2189821An6 != null && (processId = c2189821An6.getProcessId()) != null) {
                str2 = processId;
            }
            if (navArgModel != null) {
                takoSessionId = navArgModel.getTakoSessionId();
                takoVideoSessionId = navArgModel.getTakoVideoSessionId();
            } else {
                takoSessionId = null;
                takoVideoSessionId = null;
            }
            if (awemeLJIIIIZZ != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            if (navArgModel != null) {
                takoScreenType = navArgModel.getTakoScreenType();
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", eventType);
            jSONObject.put("enter_method", strI7);
            jSONObject.put("process_id", str2);
            if (takoSessionId != null && takoSessionId.length() > 0) {
                jSONObject.put("tako_session_id", takoSessionId);
            }
            if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
                jSONObject.put("video_session_id", takoVideoSessionId);
            }
            if (aid != null && aid.length() > 0) {
                jSONObject.put("group_id", aid);
            }
            if (takoScreenType != null && takoScreenType.length() > 0) {
                jSONObject.put("screen_type", takoScreenType);
            }
            jSONObject.put("button_type", str);
            c20235014FoLIZ.LIZIZ("tikbot_msg_panel_button_show", jSONObject);
        }
    }

    @Override // X.InterfaceC1682240tsU
    public final void h7(String str) {
        if (this.LLLFZ == null) {
            this.LLLFZ = str;
        }
    }

    public final void kS(boolean z) {
        this.LLJZ = z;
        if (z) {
            if (mS()) {
                iS().stopAudioCapture();
                this.LLJLLL = true;
                return;
            }
            return;
        }
        oS();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListPageDialogEvent(C739870T0n c739870T0n) {
        C19EG activity = getActivity();
        if (activity == null || activity.isFinishing() || c739870T0n.LIZIZ != activity.hashCode()) {
            return;
        }
        int i = c739870T0n.LIZ;
        if (i != 0) {
            if (i == 1) {
                kS(true);
                return;
            }
            return;
        }
        kS(false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1279710jPF.LIZ.LIZ(EnumC1284930jXf.PAGE_ENTERED);
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        C1558520qew.LJI(this, TakoAIVideoDetailScope.class, iS(), ITakoRTCAbility.class, this, null);
        C1558520qew.LJI(this, TakoAIVideoDetailScope.class, this.LLJJI, TakoAIVideoOverlayAbility.class, this, null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1371870lnt c1371870lnt) {
        kS(c1371870lnt.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReportDialogVisibleEvent(C739550Szh c739550Szh) {
        kS(c739550Szh.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C19EG activity;
        C1597406Ng c1597406Ng;
        if (c737030Svd.LIZ != 76 || (activity = getActivity()) == null || c737030Svd.LJIILLIIL != System.identityHashCode(activity)) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof C1597406Ng) && (c1597406Ng = (C1597406Ng) obj) != null) {
            if (c1597406Ng.LIZ) {
                if (mS()) {
                    iS().stopAudioCapture();
                    this.LLJZIJLIL = true;
                    return;
                }
                return;
            }
            oS();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoAIVideoDetailScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJJ, InterfaceC1682240tsU.class);
        c0qsjLIZIZ.bindAbility(this.LLJJI, TakoAIVideoOverlayAbility.class);
        c0qsjLIZIZ.bindAbility(hS(), C05VZ.class);
        c0qsjLIZIZ.bindAbility(iS(), ITakoRTCAbility.class);
    }

    public final void qS(EnumC1783070wV7 enumC1783070wV7) {
        DetailNavArgModel navArgModel;
        String eventType;
        String takoSessionId;
        String takoVideoSessionId;
        String processId;
        C2189821An6 c2189821An6 = this.LLILLJJLI;
        if (c2189821An6 != null) {
            navArgModel = c2189821An6.getNavArgModel();
        } else {
            navArgModel = null;
        }
        C2239641ClG c2239641ClG = C2239641ClG.LIZ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        String str = "";
        if (eventType == null) {
            eventType = "";
        }
        String strI7 = i7();
        if (c2189821An6 != null && (processId = c2189821An6.getProcessId()) != null) {
            str = processId;
        }
        if (navArgModel != null) {
            takoSessionId = navArgModel.getTakoSessionId();
            takoVideoSessionId = navArgModel.getTakoVideoSessionId();
        } else {
            takoSessionId = null;
            takoVideoSessionId = null;
        }
        c2239641ClG.getClass();
        boolean z = false;
        C2239671ClJ c2239671ClJ = new C2239671ClJ(0);
        c2239671ClJ.LIZLLL = false;
        c2239671ClJ.LJ = false;
        c2239671ClJ.LJFF = false;
        c2239671ClJ.LJI = false;
        C2239681ClK c2239681ClK = c2239671ClJ.LIZ;
        c2239681ClK.LIZIZ = null;
        c2239681ClK.LIZJ = null;
        c2239681ClK.LIZLLL = null;
        c2239681ClK.LIZ.clear();
        C2239661ClI c2239661ClI = c2239671ClJ.LIZIZ;
        c2239661ClI.LIZIZ = -1L;
        c2239661ClI.LIZJ = -1L;
        c2239661ClI.LIZLLL = -1L;
        c2239661ClI.LJ = -1L;
        c2239661ClI.LJFF = -1L;
        c2239661ClI.LJI = -1L;
        c2239661ClI.LJII = -1L;
        c2239661ClI.LJIIIIZZ = -1L;
        c2239661ClI.LJIIIZ = null;
        c2239661ClI.LJIIJ = null;
        c2239661ClI.LJIIJJI = null;
        c2239661ClI.LJIIL = null;
        c2239661ClI.LJIILIIL = null;
        c2239661ClI.LJIILJJIL = null;
        c2239661ClI.LIZ.clear();
        C2239691ClL c2239691ClL = c2239671ClJ.LIZJ;
        c2239691ClL.LIZIZ = null;
        c2239691ClL.LIZ.clear();
        c2239671ClJ.LJ = true;
        C2239681ClK c2239681ClK2 = c2239671ClJ.LIZ;
        String value = enumC1783070wV7.getValue();
        c2239681ClK2.getClass();
        if (value != null && value.length() > 0) {
            c2239681ClK2.LIZIZ = value;
            c2239681ClK2.LIZ(value, "send_type");
        }
        if (eventType.length() > 0) {
            c2239681ClK2.LIZ(eventType, "enter_from");
        }
        if (strI7 != null && strI7.length() > 0) {
            c2239681ClK2.LIZ(strI7, "enter_method");
        }
        if (str.length() > 0) {
            c2239681ClK2.LIZ(str, "process_id");
        }
        if (takoSessionId != null && takoSessionId.length() > 0) {
            c2239681ClK2.LIZ(takoSessionId, "tako_session_id");
        }
        if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
            c2239681ClK2.LIZ(takoVideoSessionId, "video_session_id");
        }
        C2239641ClG.LIZJ = c2239671ClJ;
        C2239641ClG.LIZLLL = null;
        if (c2239671ClJ.LJ) {
            z = true;
        }
        C2239641ClG.LJ = z;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/tako/aivideo/detail/page/TakoAiVideoDetailPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3TsMIBBEgUi7jhdmMoCq3T+jQCRdc8UsYOXpM+6a9AWK7TqXweDjb5/s7YuDlZz2fw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (isResumed()) {
                if (this.LLLFFI == null) {
                    this.LLLFFI = Long.valueOf(System.currentTimeMillis());
                }
                oS();
            }
        } else {
            dS();
            if (mS()) {
                iS().stopAudioCapture();
                this.LLJLLIL = true;
            }
            if (getContext() != null) {
                iS().LJIIJJI(EnumC1284940jXg.MUTE);
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(TakoAiVideoDetailPageFragment.class);
        }
    }

    public final void bS(String str, boolean z) {
        if (str.length() == 0) {
            hS().setState(new AwS7S1010000_25(str, false, 1));
            AiVideoViewModel aiVideoViewModelHS = hS();
            C23250099c.LIZLLL(aiVideoViewModelHS.getAssemVMScope(), null, null, new C465401rY(aiVideoViewModelHS, null), 3);
            return;
        }
        hS().setState(new AwS7S1010000_25(str, z, 1));
    }

    public final void nS(int i, EnumC1783070wV7 enumC1783070wV7) {
        C2239681ClK c2239681ClK;
        if (i > 0 && i != this.LLJI) {
            this.LLJI = i;
            C2239641ClG.LIZ.getClass();
            C2239671ClJ c2239671ClJLIZ = C2239641ClG.LIZ();
            if (c2239671ClJLIZ == null || (c2239681ClK = c2239671ClJLIZ.LIZ) == null) {
                c2239681ClK = new C2239681ClK();
            }
            Integer num = c2239681ClK.LIZJ;
            boolean z = true;
            if (!C2239641ClG.LJ || (num != null && num.intValue() != i)) {
                qS(enumC1783070wV7);
            }
            C2239671ClJ c2239671ClJ = C2239641ClG.LIZJ;
            if (c2239671ClJ != null) {
                C2239641ClG.LIZJ = null;
                C2239641ClG.LIZIZ.put(Integer.valueOf(i), c2239671ClJ);
                C2239641ClG.LJII();
            } else {
                LinkedHashMap<Integer, C2239671ClJ> linkedHashMap = C2239641ClG.LIZIZ;
                Integer numValueOf = Integer.valueOf(i);
                C2239671ClJ c2239671ClJ2 = linkedHashMap.get(numValueOf);
                if (c2239671ClJ2 == null) {
                    c2239671ClJ2 = new C2239671ClJ(0);
                    linkedHashMap.put(numValueOf, c2239671ClJ2);
                }
                c2239671ClJ = c2239671ClJ2;
                C2239641ClG.LJII();
            }
            C2239681ClK c2239681ClK2 = c2239671ClJ.LIZ;
            c2239681ClK2.LIZJ = Integer.valueOf(i);
            c2239681ClK2.LIZ(Integer.valueOf(i), "round_id");
            C2239641ClG.LIZLLL = Integer.valueOf(i);
            if (!c2239671ClJ.LJ) {
                z = false;
            }
            C2239641ClG.LJ = z;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.1ClH] */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1606550ruP.LIZ.getClass();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = null;
        if (C1606550ruP.LIZ()) {
            ?? r8 = new InterfaceC861480Xqs() { // from class: X.1ClH
                @Override // X.InterfaceC861480Xqs
                public final void LIZ() {
                    this.LIZ.cS();
                }

                @Override // X.InterfaceC861480Xqs
                public final void LIZIZ() {
                    IPlayerComponentAbility iPlayerComponentAbilityX32;
                    TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment = this.LIZ;
                    if (takoAiVideoDetailPageFragment.isAdded()) {
                        C19EG activity = takoAiVideoDetailPageFragment.getActivity();
                        if (activity == null || !activity.isFinishing()) {
                            if (!takoAiVideoDetailPageFragment.LLLF) {
                                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(takoAiVideoDetailPageFragment);
                                if (iFeedPanelPlatformAbilityLIZJ != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null) {
                                    iPlayerComponentAbilityX32.LLLLLLLLLL();
                                }
                                takoAiVideoDetailPageFragment.LLLF = true;
                            }
                            if (takoAiVideoDetailPageFragment.getContext() != null && !takoAiVideoDetailPageFragment.LLLFF) {
                                takoAiVideoDetailPageFragment.iS().LIZ(true);
                                takoAiVideoDetailPageFragment.LLLFF = true;
                            }
                            if (takoAiVideoDetailPageFragment.mS()) {
                                takoAiVideoDetailPageFragment.iS().stopAudioCapture();
                                takoAiVideoDetailPageFragment.LLL = true;
                            }
                        }
                    }
                }

                @Override // X.InterfaceC861480Xqs
                public final void LIZJ() {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
                    IPlayerComponentAbility iPlayerComponentAbilityX32;
                    TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment = this.LIZ;
                    if (takoAiVideoDetailPageFragment.isAdded()) {
                        C19EG activity = takoAiVideoDetailPageFragment.getActivity();
                        if (activity == null || !activity.isFinishing()) {
                            if (takoAiVideoDetailPageFragment.LLLF) {
                                takoAiVideoDetailPageFragment.LLLF = false;
                                if (takoAiVideoDetailPageFragment.isResumed() && takoAiVideoDetailPageFragment.isAdded() && takoAiVideoDetailPageFragment.getUserVisibleHint() && !takoAiVideoDetailPageFragment.LLJZ && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(takoAiVideoDetailPageFragment)) != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null) {
                                    iPlayerComponentAbilityX32.tryResumePlay();
                                }
                            }
                            if (takoAiVideoDetailPageFragment.LLLFF && takoAiVideoDetailPageFragment.getContext() != null) {
                                takoAiVideoDetailPageFragment.LLLFF = false;
                                if (takoAiVideoDetailPageFragment.isResumed() && takoAiVideoDetailPageFragment.isAdded() && takoAiVideoDetailPageFragment.getUserVisibleHint() && !takoAiVideoDetailPageFragment.LLJZ) {
                                    takoAiVideoDetailPageFragment.iS().LIZ(false);
                                }
                            }
                            takoAiVideoDetailPageFragment.oS();
                        }
                    }
                }

                public final void LIZLLL() {
                    String eventType;
                    String takoSessionId;
                    String takoSessionSource;
                    String takoScreenType;
                    TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment = this.LIZ;
                    if (!takoAiVideoDetailPageFragment.LLLILZ) {
                        takoAiVideoDetailPageFragment.LLLILZ = true;
                        C2189821An6 c2189821An6 = takoAiVideoDetailPageFragment.LLILLJJLI;
                        String takoVideoSessionId = null;
                        DetailNavArgModel navArgModel = c2189821An6 != null ? c2189821An6.getNavArgModel() : null;
                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                            eventType = "";
                        }
                        String strI7 = takoAiVideoDetailPageFragment.i7();
                        String processId = c2189821An6 != null ? c2189821An6.getProcessId() : null;
                        if (navArgModel != null) {
                            takoSessionId = navArgModel.getTakoSessionId();
                            takoSessionSource = navArgModel.getTakoSessionSource();
                            takoScreenType = navArgModel.getTakoScreenType();
                            takoVideoSessionId = navArgModel.getTakoVideoSessionId();
                        } else {
                            takoSessionId = null;
                            takoSessionSource = null;
                            takoScreenType = null;
                        }
                        C1862330yYx.LJIIJJI(c1862330yYx, eventType, strI7, processId, takoSessionId, takoSessionSource, takoScreenType, takoVideoSessionId);
                    }
                    this.LIZ.cS();
                }
            };
            final C861500Xqu c861500Xqu = new C861500Xqu(this, r8);
            this.LLLII = c861500Xqu;
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.TAKO_AIVIDEO;
                businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
                Set<? extends EnumC1355290lN9> setLJLIIL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE});
                EnumC1355300lNA enumC1355300lNA2 = EnumC1355300lNA.VOICE_CALL;
                AbstractC1883407Zg abstractC1883407ZgLJFF = businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, setLJLIIL, new C1360910lWD(Collections.singleton(enumC1355300lNA2), new InterfaceC1360930lWF() { // from class: X.0Xqw
                    @Override // X.InterfaceC1360930lWF
                    public final void LIZ(EnumC1355300lNA enumC1355300lNA3, Set set) {
                        if (!set.contains(EnumC1355290lN9.MICROPHONE)) {
                            return;
                        }
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c861500Xqu.LIZ);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C861460Xqq(c861500Xqu, null), 2);
                    }
                }));
                if ((abstractC1883407ZgLJFF instanceof C1883307Zf) && ((C1883307Zf) abstractC1883407ZgLJFF).LIZIZ.contains(enumC1355300lNA2)) {
                    r8.LIZLLL();
                    return;
                }
                c861500Xqu.LIZ(true);
                c861500Xqu.LIZIZ(true);
                AnonymousClass0956 anonymousClass0956 = c861500Xqu.LIZJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c861500Xqu.LIZJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C861530Xqx(c861500Xqu, null), 3);
            }
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        INetworkStateService iNetworkStateService = (INetworkStateService) this.LLJJJIL.getValue();
        if (iNetworkStateService != null) {
            this.LLJJJJ = iNetworkStateService.getNetworkStatus();
            iNetworkStateService.observerNetworkChange(this.LLJJJJJIL);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(this);
        if (iFeedPanelPlatformAbilityLIZJ != null) {
            iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityLIZJ.Mb();
        }
        this.LLJLIL = iViewPagerComponentAbilityMb;
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(this.LLJL);
        }
    }

    public final void ZR(String str, String str2, EnumC1687410u0p enumC1687410u0p, boolean z, long j) {
        hS().setState(new AwS604S0100000_25(new C1687350u0j(str, str2, enumC1687410u0p, z, j), 558));
    }
}
