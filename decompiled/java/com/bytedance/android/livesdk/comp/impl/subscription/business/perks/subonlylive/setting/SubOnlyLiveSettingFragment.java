package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0IJT;
import X.C0JTE;
import X.C0JTI;
import X.C0JU0;
import X.C0JY1;
import X.C0JY3;
import X.C0JY5;
import X.C0JY6;
import X.C0JY7;
import X.C0JY8;
import X.C0JY9;
import X.C0JYC;
import X.C0JYD;
import X.C0JYE;
import X.C0JYG;
import X.C0JYH;
import X.C0JYM;
import X.C0JYQ;
import X.C0JYR;
import X.C0K70;
import X.C0KPJ;
import X.C0PEM;
import X.C0ZP4;
import X.C11G4;
import X.C11GO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16F5;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C473420IhQ;
import X.C474500IjA;
import X.C492520JTe;
import X.C492620JTo;
import X.C492720JTy;
import X.C492730JTz;
import X.C493760JXy;
import X.C494120JZi;
import X.C494230JZt;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516680KOc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C931350aLN;
import X.C987103tV;
import X.EnumC499450JiJ;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC492580JTk;
import X.InterfaceC492700JTw;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents.SubscriptionSuspensionLifecycleObserver;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveSuperFanLiveOnlyFaqUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubOnlyLiveStatResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveSettingFragment extends BaseFragment implements C0JTI, InterfaceC724530SbT {
    public static final C0JTE LLJJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlHELIOSJyogO2s8LD04O2s/PC08Jik1JSYlLWs/LDsnISsrZxwmKgoiJTYfITMpGionPCwiLgkhKSIhLCEn";
    public LiveIconView LL;
    public LiveIconView LLILLJJLI;
    public C16F5 LLILLL;
    public C127K LLILZ;
    public C127K LLILZIL;
    public C127K LLILZLL;
    public ViewGroup LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public final AssemVMLazy LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C127K LLJILLL;
    public final C01GW LLJJ;
    public String LLJJI;
    public GetSubInfoResponse LLJJIII;
    public Integer LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JTE] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLiveSettingFragment.class, "subOnlyLiveSettingVM", "getSubOnlyLiveSettingVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vm/SubOnlyLiveSettingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = new Object() { // from class: X.0JTE
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SubOnlyLiveSettingFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLiveSettingVM.class);
        C492520JTe c492520JTe = new C492520JTe(c19719912DlLIZ);
        C0JYG c0jyg = new C0JYG();
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492520JTe, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JY7(this), c0jyg, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492520JTe, new C0JY8(this), c0jyg, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492520JTe, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JY9(this), c0jyg, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new C0JU0(this));
        this.LLJJI = "";
        this.LLJJIJIL = C452501pT.LIZIZ(new C492620JTo(this));
        this.LLJJJ = C452501pT.LIZIZ(new C0JYC(this));
        this.LLJJJIL = true;
        this.LLJJJJ = C452501pT.LIZIZ(new C493760JXy());
        this.LLJJJJJIL = C452501pT.LIZIZ(new C0JY6());
        this.LLJJJJLIIL = C452501pT.LIZIZ(new C0JYD(this));
    }

    public final String NR() {
        return (String) this.LLJJJJ.getValue();
    }

    public final SubOnlyLiveSettingVM OR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (SubOnlyLiveSettingVM) assemVMLazy.getValue();
    }

    public final void RR() {
        C127K c127k = this.LLILZ;
        if ((c127k != null ? c127k.getAccessory() : null) instanceof C127A) {
            C127K c127k2 = this.LLILZ;
            if (((C11GO) (c127k2 != null ? c127k2.getAccessory() : null)).LJIILIIL() && LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
                C127K c127k3 = this.LLILZLL;
                if (c127k3 != null) {
                    C500260Jjc.LLFFF(c127k3);
                    return;
                }
                return;
            }
        }
        C127K c127k4 = this.LLILZLL;
        if (c127k4 != null) {
            C500260Jjc.LJIILIIL(c127k4);
        }
    }

    @Override // X.C0JTI
    public final boolean onBackPressed() {
        FragmentManager supportFragmentManager;
        ((InterfaceC492700JTw) this.LLJJJ.getValue()).LIZIZ();
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            if (supportFragmentManager.LJJLIIIJL().size() > 1) {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
                c19ehLJIIJ.LJIIZILJ(this);
                c19ehLJIIJ.LJIIJ();
            } else {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return true;
                }
            }
        }
        return true;
    }

    public final void SR() {
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && !Intrinsics.LJFF(C0KPJ.We.LIZ(), Boolean.TRUE)) {
            String str = this.LLJJIJIIJIL ? "super_fan" : "";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LiveSubscriptionAnchorUrlSetting.musicIntro());
            sbLIZ.append("&anchor_id=");
            sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
            sbLIZ.append("&show_entrance=");
            sbLIZ.append(str);
            sbLIZ.append("&enter_from=");
            sbLIZ.append(str);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C786410Ut5.LJJZZIII((Handler) this.LLJJJJJIL.getValue(), new Runnable() { // from class: X.0Ij1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubOnlyLiveSettingFragment@8668.showAllowMusicHintDialog$1");
                    try {
                        try {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), strLIZIZ);
                            C0KPJ.We.LIZJ(Boolean.TRUE);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubOnlyLiveSettingFragment@8668.showAllowMusicHintDialog$1");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C11JF c11jf;
        super.onDestroyView();
        Integer num = this.LLJJIJI;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
            tuxImmersionBarLIZLLL.LJIIIZ(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        ((Handler) this.LLJJJJJIL.getValue()).removeCallbacksAndMessages(null);
        SubOnlyStatisticsEnhanceViewModel subOnlyStatisticsEnhanceViewModel = (SubOnlyStatisticsEnhanceViewModel) this.LLJJJJLIIL.getValue();
        if (subOnlyStatisticsEnhanceViewModel == null || (c11jf = subOnlyStatisticsEnhanceViewModel.LL) == null || !(true ^ c11jf.isDisposed())) {
            return;
        }
        c11jf.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.my);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Integer numValueOf;
        boolean z2;
        C127M accessory;
        Integer numLIZ;
        C127M accessory2;
        C127M accessory3;
        C127M accessory4;
        LiveSubOnlyConfig liveSubOnlyConfig;
        boolean z3;
        LiveSubOnlyConfig liveSubOnlyConfig2;
        Window window;
        Bundle arguments;
        String string;
        super.onViewCreated(view, bundle);
        boolean z4 = false;
        try {
            arguments = getArguments();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arguments != null && (string = arguments.getString("is_super_fans")) != null) {
            z = Boolean.parseBoolean(string);
        } else {
            z = false;
        }
        this.LLJJIJIIJIL = z;
        C0K70.LIZJ(requireContext(), "SubOnlyLiveSettingFragment");
        this.LL = (LiveIconView) view.findViewById(R.id.bmy);
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.hof);
        this.LLILLL = (C16F5) view.findViewById(R.id.title);
        this.LLJILJIL = (C16F5) view.findViewById(R.id.i0d);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.uh7);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.i0c);
        this.LLIZLLLIL = (ConstraintLayout) view.findViewById(R.id.wg1);
        this.LLJ = (C16F5) view.findViewById(R.id.wg3);
        this.LLJI = (C16F5) view.findViewById(R.id.wg2);
        this.LLJJ.getValue();
        C516680KOc.LIZIZ((C16F5) view.findViewById(R.id.wfd), this.LLJJIJIIJIL);
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JYB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.onBackPressed();
                }
            });
        }
        LiveIconView liveIconView2 = this.LLILLJJLI;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0JY4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String anchorSubOnlyLiveFaq;
                    Boolean boolValueOf;
                    if (this.LL.LLJJIJIIJIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(LiveSuperFanLiveOnlyFaqUrlSetting.INSTANCE.getValue());
                        sbLIZ.append("show_entrance=");
                        sbLIZ.append(this.LL.LLJJI);
                        sbLIZ.append("&source_page=");
                        sbLIZ.append(this.LL.LLJJI);
                        anchorSubOnlyLiveFaq = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        anchorSubOnlyLiveFaq = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchorSubOnlyLiveFaq();
                    }
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    C19EG activity = this.LL.getActivity();
                    if (anchorSubOnlyLiveFaq == null) {
                        anchorSubOnlyLiveFaq = "";
                    }
                    iActionHandlerService.handle(activity, anchorSubOnlyLiveFaq);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_faq_click");
                    c474500IjALIZ.LJJII(this.LL.NR(), "anchor_id");
                    c474500IjALIZ.LJJII(this.LL.LLJJI, "click_position");
                    GetSubInfoResponse getSubInfoResponse = this.LL.LLJJIII;
                    if (getSubInfoResponse != null) {
                        boolValueOf = Boolean.valueOf(getSubInfoResponse.initialized);
                    } else {
                        boolValueOf = null;
                    }
                    c474500IjALIZ.LJJII(Integer.valueOf(!C500260Jjc.LJJIJIIJIL(boolValueOf) ? 1 : 0), "is_opt_in");
                    c474500IjALIZ.LIZ();
                }
            });
        }
        C19EG activity = getActivity();
        Boolean boolValueOf = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window.getStatusBarColor());
        } else {
            numValueOf = null;
        }
        this.LLJJIJI = numValueOf;
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C497740JfY.LIZLLL(R.attr.zp, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        this.LLILZ = (C127K) view.findViewById(R.id.wfg);
        GetSubInfoResponse getSubInfoResponse = this.LLJJIII;
        if (getSubInfoResponse != null && (liveSubOnlyConfig2 = getSubInfoResponse.liveSubOnlyConfig) != null) {
            z2 = liveSubOnlyConfig2.disabled;
        } else {
            z2 = false;
        }
        Context context = getContext();
        if (context != null) {
            if (this.LLJJIJIIJIL) {
                C127K c127k = this.LLILZ;
                if (c127k != null) {
                    c127k.setTitle(C497740JfY.LJIJI(2131856632));
                }
                C127K c127k2 = this.LLILZ;
                if (c127k2 != null) {
                    c127k2.setSubtitle(C497740JfY.LJIJI(2131856633));
                }
            } else {
                C127K c127k3 = this.LLILZ;
                if (c127k3 != null) {
                    c127k3.setTitle(C497740JfY.LJIJI(2131844459));
                }
                C127K c127k4 = this.LLILZ;
                if (c127k4 != null) {
                    c127k4.setSubtitle(C497740JfY.LJIJI(2131844460));
                }
            }
            C127K c127k5 = this.LLILZ;
            if (c127k5 != null) {
                C127A c127a = new C127A(context);
                if (!z2 && C494680Jac.LIZJ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c127a.LJIILJJIL(z3);
                c127a.LJI(new C494120JZi(this));
                c127a.LJIILL(new C494230JZt(c127a, this));
                c127a.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JZr
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                        C127M accessory5;
                        C127M accessory6;
                        String str;
                        int i;
                        if (this.LL.LLJJIJIIJIL) {
                            DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.valueOf(z5));
                            C494680Jac.LIZ = z5;
                        } else {
                            C494680Jac.LJIJJ(z5);
                        }
                        C494680Jac.LJIL(true);
                        if (z5) {
                            Map<String, String> mapLIZ = C0KPJ.df.LIZ();
                            if (mapLIZ == null) {
                                mapLIZ = new HashMap<>();
                            }
                            C493830JYf c493830JYfLIZ = C0JYR.LIZ(mapLIZ);
                            C494680Jac.LJIJJLI(c493830JYfLIZ.LJ, c493830JYfLIZ.LJFF);
                        }
                        C127K c127k6 = this.LL.LLILZIL;
                        int i2 = 8;
                        if (c127k6 != null) {
                            if (z5) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            C786410Ut5.LLZLL(c127k6, i);
                        }
                        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LL;
                        C127K c127k7 = subOnlyLiveSettingFragment.LLJILLL;
                        if (c127k7 != null) {
                            if (z5) {
                                subOnlyLiveSettingFragment.OR().withState(new C0JYS(this.LL.LLJJI, "show"));
                                i2 = 0;
                            }
                            C786410Ut5.LLZLL(c127k7, i2);
                        }
                        if (z5) {
                            SubOnlyLiveSettingFragment subOnlyLiveSettingFragment2 = this.LL;
                            ((InterfaceC492700JTw) subOnlyLiveSettingFragment2.LLJJJ.getValue()).LIZ(subOnlyLiveSettingFragment2, new C492730JTz(subOnlyLiveSettingFragment2));
                        } else {
                            ((InterfaceC492700JTw) this.LL.LLJJJ.getValue()).LIZIZ();
                        }
                        Boolean boolValueOf2 = null;
                        if (z5) {
                            final SubOnlyLiveSettingFragment subOnlyLiveSettingFragment3 = this.LL;
                            subOnlyLiveSettingFragment3.getClass();
                            C0JT6<Boolean> c0jt6 = C0KPJ.Ke;
                            Boolean boolLIZ = c0jt6.LIZ();
                            Boolean bool = Boolean.TRUE;
                            if (!Intrinsics.LJFF(boolLIZ, bool) && LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_show");
                                c474500IjALIZ.LJJII(subOnlyLiveSettingFragment3.NR(), "anchor_id");
                                c474500IjALIZ.LJJII(subOnlyLiveSettingFragment3.LLJJI, "click_position");
                                c474500IjALIZ.LIZ();
                                c0jt6.LIZJ(bool);
                                String strLJIJI = C497740JfY.LJIJI(2131843863);
                                C782110Um9 c782110Um9 = new C782110Um9(subOnlyLiveSettingFragment3.getContext());
                                c782110Um9.LJIIZILJ(2131843862);
                                c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131843861, strLJIJI));
                                C494720Jag c494720Jag = new C494720Jag();
                                C755620TkW c755620TkW = new C755620TkW();
                                c755620TkW.LIZ = C497740JfY.LJIJI(2131843859);
                                c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZw
                                    @Override // X.InterfaceC743640TFa
                                    public final void LIZ(LiveDialog liveDialog) {
                                        C0KPJ.Je.LIZJ(Boolean.TRUE);
                                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
                                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment3.NR(), "anchor_id");
                                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment3.LLJJI, "click_position");
                                        c474500IjALIZ2.LJJII("confirm", "click_type");
                                        c474500IjALIZ2.LIZ();
                                        liveDialog.dismiss();
                                    }
                                };
                                c494720Jag.LIZ(new C0TZ2(c755620TkW));
                                C755630TkX c755630TkX = new C755630TkX();
                                c755630TkX.LIZ = C497740JfY.LJIJI(2131843860);
                                c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZx
                                    @Override // X.InterfaceC743640TFa
                                    public final void LIZ(LiveDialog liveDialog) {
                                        C0KPJ.Je.LIZJ(Boolean.FALSE);
                                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
                                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment3.NR(), "anchor_id");
                                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment3.LLJJI, "click_position");
                                        c474500IjALIZ2.LJJII("opt_out", "click_type");
                                        c474500IjALIZ2.LIZ();
                                        liveDialog.dismiss();
                                    }
                                };
                                c494720Jag.LIZ(new C0TZ3(c755630TkX));
                                c494720Jag.LIZIZ = 2;
                                c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                                c782110Um9.LJIILLIIL = false;
                                c782110Um9.LJIILL = false;
                                C786410Ut5.E4(c782110Um9.LIZ());
                            }
                        } else {
                            C494680Jac.LJIJ(false);
                            C127K c127k8 = this.LL.LLILZLL;
                            if (c127k8 != null) {
                                accessory5 = c127k8.getAccessory();
                            } else {
                                accessory5 = null;
                            }
                            if (accessory5 instanceof C127A) {
                                C127K c127k9 = this.LL.LLILZLL;
                                if (c127k9 != null) {
                                    accessory6 = c127k9.getAccessory();
                                } else {
                                    accessory6 = null;
                                }
                                ((C11GO) accessory6).LJIILJJIL(false);
                            }
                        }
                        this.LL.RR();
                        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment4 = this.LL;
                        if (z5) {
                            str = "open";
                        } else {
                            str = "close";
                        }
                        subOnlyLiveSettingFragment4.getClass();
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscriber_only_live_button_click");
                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment4.LLJJI, "show_entrance");
                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment4.LLJJI, "click_position");
                        c474500IjALIZ2.LJJII(0, "is_shortcut_entrance");
                        c474500IjALIZ2.LJJII(subOnlyLiveSettingFragment4.NR(), "anchor_id");
                        GetSubInfoResponse getSubInfoResponse2 = subOnlyLiveSettingFragment4.LLJJIII;
                        if (getSubInfoResponse2 != null) {
                            boolValueOf2 = Boolean.valueOf(getSubInfoResponse2.initialized);
                        }
                        c474500IjALIZ2.LJJII(Integer.valueOf(1 ^ (C500260Jjc.LJJIJIIJIL(boolValueOf2) ? 1 : 0)), "is_opt_in");
                        c474500IjALIZ2.LJJII(str, "sub_live_status");
                        c474500IjALIZ2.LIZ();
                        C389001fE.LIZ("fan-club-manage-offline-page-refresh", null, System.currentTimeMillis(), false);
                    }
                });
                c127k5.setAccessory(c127a);
            }
            C127K c127k6 = this.LLILZ;
            if (c127k6 != null) {
                c127k6.setCellEnabled(!z2);
            }
        }
        if (z2) {
            C494680Jac.LJIJJ(false);
        }
        SubVipSubOnlyLiveSetting subVipSubOnlyLiveSetting = SubVipSubOnlyLiveSetting.INSTANCE;
        if (subVipSubOnlyLiveSetting.isEnable() && !this.LLJJIJIIJIL) {
            C127K c127k7 = (C127K) view.findViewById(R.id.wfu);
            this.LLJILLL = c127k7;
            GetSubInfoResponse getSubInfoResponse2 = this.LLJJIII;
            if ((getSubInfoResponse2 == null || (liveSubOnlyConfig = getSubInfoResponse2.liveSubOnlyConfig) == null || !liveSubOnlyConfig.disabled) && C494680Jac.LIZJ()) {
                z4 = true;
            }
            C500260Jjc.LJLJLJ(c127k7, z4);
            C127K c127k8 = this.LLJILLL;
            if (c127k8 != null) {
                c127k8.setTitle(C497740JfY.LJIJI(2131857043));
            }
            C127K c127k9 = this.LLJILLL;
            if (c127k9 != null) {
                accessory3 = c127k9.getAccessory();
            } else {
                accessory3 = null;
            }
            if (accessory3 instanceof C11G4) {
                C127K c127k10 = this.LLJILLL;
                if (c127k10 != null) {
                    accessory4 = c127k10.getAccessory();
                } else {
                    accessory4 = null;
                }
                C11G4 c11g4 = (C11G4) accessory4;
                SubOnlyLiveSettingVM subOnlyLiveSettingVMOR = OR();
                Map<String, String> mapLIZ = C0KPJ.df.LIZ();
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                }
                subOnlyLiveSettingVMOR.setState(new C0JYH(C0JYR.LIZ(mapLIZ)));
                c11g4.LJIILLIIL(true);
                c11g4.LJIILL(new View.OnClickListener() { // from class: X.0JQ0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FragmentManager parentFragmentManager = this.LL.getParentFragmentManager();
                        Bundle bundle2 = new Bundle();
                        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LL;
                        bundle2.putInt("is_close_back_icon", 0);
                        C786410Ut5.LJJJI("show_entrance", subOnlyLiveSettingFragment.LLJJI, bundle2);
                        C19322110iZ.LIZLLL(parentFragmentManager, SubOnlyLiveVipSettingSheet.class, "SubOnlyLiveVipSettingSheet", null, bundle2);
                        this.LL.OR().withState(new C0JYS(this.LL.LLJJI, "click"));
                    }
                });
            }
            C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0JYJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0JYI) obj).LLILLJJLI;
                }
            }, null, new C0JY1(this), 6);
            SubOnlyLiveSettingVM subOnlyLiveSettingVMOR2 = OR();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(subOnlyLiveSettingVMOR2), C0PEM.LIZJ, null, new C0JYQ(subOnlyLiveSettingVMOR2, null), 2);
        }
        C127K c127k11 = (C127K) view.findViewById(R.id.yku);
        this.LLILZIL = c127k11;
        if (c127k11 != null) {
            c127k11.setTitle(C497740JfY.LJIJI(2131844228));
        }
        C127K c127k12 = this.LLILZIL;
        if (c127k12 != null) {
            accessory = c127k12.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            C127K c127k13 = this.LLILZIL;
            if (c127k13 != null) {
                accessory2 = c127k13.getAccessory();
            } else {
                accessory2 = null;
            }
            C11G4 c11g42 = (C11G4) accessory2;
            c11g42.LJIILJJIL(C497740JfY.LJIJI(2131844231));
            c11g42.LJIILLIIL(true);
        }
        ((InterfaceC492580JTk) this.LLJJIJIL.getValue()).LIZLLL(this.LLILZIL, this.LLJJIII, (InterfaceC492700JTw) this.LLJJJ.getValue(), this, new C492720JTy(this));
        if (C494680Jac.LIZJ()) {
            ((InterfaceC492700JTw) this.LLJJJ.getValue()).LIZ(this, new C492730JTz(this));
        }
        C127K c127k14 = (C127K) view.findViewById(R.id.axq);
        this.LLILZLL = c127k14;
        if (c127k14 != null) {
            c127k14.setTitle(C497740JfY.LJIJI(2131842237));
        }
        C127K c127k15 = this.LLILZLL;
        if (c127k15 != null) {
            c127k15.setSubtitle(C497740JfY.LJIJI(2131842236));
        }
        C127K c127k16 = this.LLILZLL;
        if (c127k16 != null) {
            final C127A c127a2 = new C127A(view.getContext());
            c127a2.LJIILJJIL(C494680Jac.LIZIZ());
            c127a2.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JYN
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    String str;
                    C494680Jac.LJIJ(c127a2.LJIILIIL());
                    SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this;
                    boolean zLJIILIIL = c127a2.LJIILIIL();
                    subOnlyLiveSettingFragment.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_use_music_click");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(subOnlyLiveSettingFragment.LLJJI, "click_position");
                    if (zLJIILIIL) {
                        str = "turn_on";
                    } else {
                        str = "turn_off";
                    }
                    c474500IjALIZ.LJJII(str, "click_type");
                    c474500IjALIZ.LIZ();
                }
            });
            c127k16.setAccessory(c127a2);
        }
        C127K c127k17 = this.LLILZLL;
        if (c127k17 != null) {
            c127k17.setOnClickListener(new C0JYE(this));
        }
        RR();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_management_page_show");
        c474500IjALIZ.LJJII(this.LLJJI, "show_entrance");
        c474500IjALIZ.LJJII(NR(), "anchor_id");
        GetSubInfoResponse getSubInfoResponse3 = this.LLJJIII;
        if (getSubInfoResponse3 != null) {
            boolValueOf = Boolean.valueOf(getSubInfoResponse3.initialized);
        }
        c474500IjALIZ.LJJII(Integer.valueOf(!C500260Jjc.LJJIJIIJIL(boolValueOf) ? 1 : 0), "is_opt_in");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_in_live");
        C0JYM c0jym = (C0JYM) DataChannelGlobal.LLILZ.gg0(C931350aLN.class);
        if (c0jym != null && (numLIZ = c0jym.LIZ()) != null) {
            c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(numLIZ.intValue())), "distribution_type");
        }
        c474500IjALIZ.LIZ();
        getLifecycle().addObserver(new SubscriptionSuspensionLifecycleObserver(new C0JY5(this)));
        if (subVipSubOnlyLiveSetting.isEnable()) {
            C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0JYA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0JYI) obj).LL;
                }
            }, null, new C0JY3(this), 6);
        } else {
            SR();
        }
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C500260Jjc.LJIILIIL(viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                C500260Jjc.LLFFF(viewGroup2);
            }
        }
        ((SubOnlyStatisticsEnhanceViewModel) this.LLJJJJLIIL.getValue()).xQ2();
        ((SubOnlyStatisticsEnhanceViewModel) this.LLJJJJLIIL.getValue()).LLILLL.observe(this, new Observer() { // from class: X.0JY2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData getSubOnlyLiveStatData = (GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData) obj;
                if (getSubOnlyLiveStatData != null) {
                    if (!C500260Jjc.LJJJJIZL(this.LL.LLIZLLLIL)) {
                        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LL;
                        C500260Jjc.LLFFF(subOnlyLiveSettingFragment.LLIZLLLIL);
                        C500260Jjc.LLFFF(subOnlyLiveSettingFragment.LLJ);
                        C500260Jjc.LLFFF(subOnlyLiveSettingFragment.LLJI);
                        SpannableString spannableStringLIZIZ = C494780Jam.LIZIZ(subOnlyLiveSettingFragment.getContext(), getSubOnlyLiveStatData, subOnlyLiveSettingFragment.LLJJIJIIJIL);
                        C16F5 c16f5 = subOnlyLiveSettingFragment.LLJ;
                        if (c16f5 != null) {
                            c16f5.setText(spannableStringLIZIZ);
                        }
                        SpannableString spannableStringLIZ = C494780Jam.LIZ(getSubOnlyLiveStatData, subOnlyLiveSettingFragment.LLJJIJIIJIL);
                        if (spannableStringLIZ != null) {
                            C16F5 c16f52 = subOnlyLiveSettingFragment.LLJI;
                            if (c16f52 != null) {
                                c16f52.setText(spannableStringLIZ);
                            }
                        } else {
                            C500260Jjc.LJIILIIL(subOnlyLiveSettingFragment.LLJI);
                        }
                    }
                    SubOnlyLiveSettingFragment subOnlyLiveSettingFragment2 = this.LL;
                    Object value = subOnlyLiveSettingFragment2.LLJJJJLIIL.getValue();
                    String str = subOnlyLiveSettingFragment2.LLJJI;
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    value.getClass();
                    SubOnlyStatisticsEnhanceViewModel.wQ2(str, strValueOf, getSubOnlyLiveStatData);
                }
            }
        });
        C0K70.LIZLLL("SubOnlyLiveSettingFragment", getContext());
        C0K70.LJ("SubOnlyLiveSettingFragment", getContext(), EnumC499450JiJ.GENERAL);
        if (this.LLJJIJIIJIL) {
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131856632));
            }
            C16F5 c16f52 = this.LLJILJIL;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131856606));
            }
            C16F5 c16f53 = this.LLJILJILJ;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131856624));
            }
        }
    }

    public final void PR(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_subscription_popup");
        c474500IjALIZ.LJJII(NR(), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_in_live");
        c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(i)), "distribution_type");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "anchor_decision");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0K70.LJFF(requireContext(), "SubOnlyLiveSettingFragment", this.LLJJI, "sub_only_live");
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gli, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
