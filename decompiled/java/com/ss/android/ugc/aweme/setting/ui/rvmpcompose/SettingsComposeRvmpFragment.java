package com.ss.android.ugc.aweme.setting.ui.rvmpcompose;

import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0C64;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1207504nx;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1555940qam;
import X.C1557460qdE;
import X.C1622206Wu;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19261910Xh;
import X.C19291610de;
import X.C19474211Gy;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2174561A8o;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C987103tV;
import X.EnumC1427810nG7;
import X.InterfaceC0148002o;
import X.InterfaceC1556650qbv;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.AccountGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.SettingsBannerVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.CacheGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.ContentGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.LogoutVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.InteractionsGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.VisibilityGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.SupportGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.TopGroupVM;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes34.dex */
public class SettingsComposeRvmpFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiPCZ9OjHELIOSMhOSw8JTUjOip9GyA4PSY9LzYPJiIjJzYpGzk+OAM+KCg+LSs4";
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;

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

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SettingsComposeRvmpFragment.class, "hostVM", "getHostVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/SettingsRvmpComposeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SettingsComposeRvmpFragment.class, "bannerVM", "getBannerVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/banner/SettingsBannerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SettingsComposeRvmpFragment.class, "topGroupVM", "getTopGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/top/TopGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SettingsComposeRvmpFragment.class, "accountGroupVM", "getAccountGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/AccountGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SettingsComposeRvmpFragment.class, "visibilityGroupVM", "getVisibilityGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/privacy/VisibilityGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SettingsComposeRvmpFragment.class, "interactionsGroupVM", "getInteractionsGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/privacy/InteractionsGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SettingsComposeRvmpFragment.class, "cacheGroupVM", "getCacheGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/CacheGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SettingsComposeRvmpFragment.class, "contentGroupVM", "getContentGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/ContentGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(SettingsComposeRvmpFragment.class, "supportGroupVM", "getSupportGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/SupportGroupVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(SettingsComposeRvmpFragment.class, "loginGroupVM", "getLoginGroupVM()Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/login/LoginGroupVM;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    public final AccountGroupVM UR() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (AccountGroupVM) assemVMLazy.getValue();
    }

    public final CacheGroupVM VR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (CacheGroupVM) assemVMLazy.getValue();
    }

    public final ContentGroupVM WR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (ContentGroupVM) assemVMLazy.getValue();
    }

    public final SettingsRvmpComposeViewModel ZR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SettingsRvmpComposeViewModel) assemVMLazy.getValue();
    }

    public final InteractionsGroupVM aS() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (InteractionsGroupVM) assemVMLazy.getValue();
    }

    public final SupportGroupVM bS() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SupportGroupVM) assemVMLazy.getValue();
    }

    public final VisibilityGroupVM cS() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (VisibilityGroupVM) assemVMLazy.getValue();
    }

    public SettingsComposeRvmpFragment() {
        Intent intent;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SettingsRvmpComposeViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1835);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(222);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZ = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3174), aFwS279S0000000_33);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SettingsBannerVM.class);
        this.LLIZLLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS563S0100000_19(c19719912DlLIZ2, 1829), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3175), AFwS279S0000000_33.get$arr$(223));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TopGroupVM.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), new AwS563S0100000_19(c19719912DlLIZ3, 1831), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3177), AFwS279S0000000_33.get$arr$(225));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(AccountGroupVM.class);
        this.LLJI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), new AwS563S0100000_19(c19719912DlLIZ4, 1830), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3176), AFwS279S0000000_33.get$arr$(224));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(VisibilityGroupVM.class);
        this.LLJIJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), new AwS563S0100000_19(c19719912DlLIZ5, 1832), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3178), AFwS279S0000000_33.get$arr$(226));
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(InteractionsGroupVM.class);
        this.LLJILJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), new AwS563S0100000_19(c19719912DlLIZ6, 1833), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3179), AFwS279S0000000_33.get$arr$(227));
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(CacheGroupVM.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ7), new AwS563S0100000_19(c19719912DlLIZ7, 1834), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3180), AFwS279S0000000_33.get$arr$(228));
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(ContentGroupVM.class);
        this.LLJILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ8), new AwS563S0100000_19(c19719912DlLIZ8, 1836), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3171), AFwS279S0000000_33.get$arr$(229));
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(SupportGroupVM.class);
        this.LLJJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ9), new AwS563S0100000_19(c19719912DlLIZ9, 1827), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3172), AFwS279S0000000_33.get$arr$(220));
        C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(LoginGroupVM.class);
        this.LLJJI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ10), new AwS563S0100000_19(c19719912DlLIZ10, 1828), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3173), AFwS279S0000000_33.get$arr$(221));
        C19EG activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        try {
            intent.getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = 0;
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        LifecycleEventObserver[] lifecycleEventObserverArr = {ZR(), assemVMLazy.getValue(), cS(), aS(), UR(), VR(), WR(), bS(), this.LLJJI.getValue()};
        do {
            getViewLifecycleOwner().getLifecycle().removeObserver(lifecycleEventObserverArr[i]);
            i++;
        } while (i < 9);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        activityConfiguration(new AwS608S0100000_29(this, 141));
        NR(AFwS273S0000000_29.get$arr$(102));
        super.onCreate(bundle);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        InterfaceC1556650qbv interfaceC1556650qbv = (InterfaceC1556650qbv) assemVMLazy.getValue().getState();
        InterfaceC1556650qbv interfaceC1556650qbv2 = (InterfaceC1556650qbv) UR().getState();
        Iterator it2 = ((ArrayList) C1557460qdE.LIZ(C1557460qdE.LIZ(C1557460qdE.LIZ(C1557460qdE.LIZ(C1557460qdE.LIZ(C13LP.LJLIL(interfaceC1556650qbv2.getItems(), interfaceC1556650qbv.getItems()), (InterfaceC1556650qbv) cS().getState()), (InterfaceC1556650qbv) aS().getState()), (InterfaceC1556650qbv) WR().getState()), (InterfaceC1556650qbv) VR().getState()), (InterfaceC1556650qbv) bS().getState())).iterator();
        while (it2.hasNext()) {
            C2174561A8o.LIZJ(this, (InterfaceC19211810Ea) it2.next());
        }
        AssemVMLazy assemVMLazy2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIII;
        C1555940qam c1555940qam = (C1555940qam) assemVMLazy2.getValue().getState();
        if (c1555940qam.LLILZ) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SwitchAccountVM.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 333);
            AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(308);
            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3900), aFwS279S0000000_33, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            } else {
                new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3901), aFwS279S0000000_33, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
            }
        }
        if (c1555940qam.LLILLL) {
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LogoutVM.class);
            C5182020e c5182020e2 = new C5182020e((C13IQ) c19719912DlLIZ2, 334);
            AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(309);
            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3902), aFwS279S0000000_332, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            } else {
                new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3899), aFwS279S0000000_332, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
            }
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b4907", (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        IPrivacySettingAPIService iPrivacySettingAPIService;
        super.onViewCreated(view, bundle);
        SettingsRvmpComposeViewModel settingsRvmpComposeViewModelZR = ZR();
        C736680Sv4.LJIIIIZZ(this, settingsRvmpComposeViewModelZR, new C2217381BqS() { // from class: X.1A3D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1688880u3C) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS455S0200000_19(settingsRvmpComposeViewModelZR, this, 20), 4);
        C736680Sv4.LJIIIIZZ(this, settingsRvmpComposeViewModelZR, new C2217381BqS() { // from class: X.1A3E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1688880u3C) obj).LLILZIL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 90), 4);
        C19EG activity = getActivity();
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        EventBus.LIZLLL().LJIJJ(settingsRvmpComposeViewModelZR.LL);
        int i = 0;
        SettingsManagerProxy.inst().registerSettingsWatcher(settingsRvmpComposeViewModelZR.LLILLJJLI, false);
        C19291610de.LIZ.getClass();
        C19291610de.LIZIZ = null;
        C19291610de.LIZ(null, settingsRvmpComposeViewModelZR.LLILLL, true);
        settingsRvmpComposeViewModelZR.vQ2();
        if (intent != null) {
            if (intent.getIntExtra("show_tag_info", 0) == 1) {
                settingsRvmpComposeViewModelZR.setState(new AwS17S0010000_2(true, 15));
                settingsRvmpComposeViewModelZR.setState(new AwS40S0010000_28(20));
            }
            try {
                String stringExtra = intent.getStringExtra("scroll_to_item_and_highlight");
                if (stringExtra != null) {
                    settingsRvmpComposeViewModelZR.setState(new AwS53S1000000_2(stringExtra, 15));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        new Object() { // from class: X.1A3G
        }.getClass();
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "verify_proaccount_server_exp", true, false);
        boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "verify_proaccount_precise_exp", true, false);
        boolean zLJIIIZ3 = C0C64.LJIILLIIL().LJIIIZ(31744, "verify_proaccount_precise_did_exp", true, false);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("verify_proaccount_server_exp", String.valueOf(zLJIIIZ));
        c2344009Gk.LJIIIIZZ("verify_proaccount_precise_exp", String.valueOf(zLJIIIZ2));
        c2344009Gk.LJIIIIZZ("verify_proaccount_precise_did_exp", String.valueOf(zLJIIIZ3));
        C20684815ws.LJIILLIIL("proaccount_enter_for_experiment", c2344009Gk.LIZ);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        LifecycleEventObserver[] lifecycleEventObserverArr = {ZR(), assemVMLazy.getValue(), UR(), cS(), aS(), VR(), WR(), bS(), this.LLJJI.getValue()};
        do {
            getViewLifecycleOwner().getLifecycle().addObserver(lifecycleEventObserverArr[i]);
            i++;
        } while (i < 9);
        if (C1207504nx.LIZ() && (iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null)) != null) {
            iPrivacySettingAPIService.LJIIIIZZ(view.getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILJJIL();
            C19261910Xh.LIZJ("app_update_click");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(256694148, new AwS445S0200000_9(composeView, this, 18), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel r25, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.SettingsBannerVM r26, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.TopGroupVM r27, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.AccountGroupVM r28, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.VisibilityGroupVM r29, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.InteractionsGroupVM r30, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.CacheGroupVM r31, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.ContentGroupVM r32, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.SupportGroupVM r33, X.InterfaceC1680500tpg r34, int r35) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment.SR(com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.SettingsBannerVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.TopGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.AccountGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.VisibilityGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.InteractionsGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.CacheGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.ContentGroupVM, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.SupportGroupVM, X.0tpg, int):void");
    }
}
