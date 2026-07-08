package com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet;

import X.C019F;
import X.C01D1;
import X.C1052110dU9;
import X.C12ES;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1766560w4U;
import X.C19395810uS;
import X.C19719912Dl;
import X.C19EG;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C321640CjC;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1036100d4K;
import X.InterfaceC1069860dwm;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS106S0100000_6;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.IAdChatAgentLogService;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentSevenSheetFragment extends CommerceAgentSheetFragment implements InterfaceC1069860dwm, InterfaceC1036100d4K {
    public static final C1052110dU9 LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKicyPCQrLCEnHELIOSZio4ISohOCQrLGEgICApPWEQJyghLD0wLQQrLCEnGyA6LCEAICApPQkhKSIhLCEn";
    public final InterfaceC1069860dwm LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public View LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dU9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentSevenSheetFragment.class, "sevenSheetVM", "getSevenSheetVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/otherpage/sheet/CommerceAgentSevenSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new Object() { // from class: X.0dU9
        };
    }

    public CommerceAgentSevenSheetFragment() {
        this(0);
    }

    @Override // X.InterfaceC1069860dwm
    public final void G2(int i) {
        this.LLJJIJI.G2(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment, X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        this.LLJJIJI.LLLFFI(tuxSheet, f);
    }

    @Override // X.InterfaceC1069860dwm
    public final void QH(View view) {
        this.LLJJIJI.QH(view);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment
    public final C19719912Dl UR() {
        return C13LE.LIZ(SevenSheetTopTitleAssem.class);
    }

    @Override // X.InterfaceC1069860dwm
    public final void WO(InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        this.LLJJIJI.WO(interfaceC19396010uU, interfaceC19395910uT);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment, com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment
    public final String nZ0() {
        return "seven_split_screen";
    }

    @Override // X.InterfaceC1069860dwm
    public final TuxSheet tz() {
        return this.LLJJIJI.tz();
    }

    @Override // X.InterfaceC1069860dwm
    public final void w2(TuxSheet tuxSheet) {
        this.LLJJIJI.w2(tuxSheet);
    }

    public final CommerceAgentSevenSheetVM VR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (CommerceAgentSevenSheetVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment, X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = C321640CjC.LIZ;
        String str = C321640CjC.LIZIZ;
        String creativeIdStr = null;
        IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
        if (iAdChatAgentLogService != null) {
            String logExtra = null;
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
                if (aweme != null) {
                }
                iAdChatAgentLogService.LIZ(creativeIdStr, logExtra, str, C321640CjC.LIZJ);
            } else {
                creativeIdStr = awemeRawAd.getCreativeIdStr();
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                logExtra = awemeRawAd2.getLogExtra();
            }
            iAdChatAgentLogService.LIZ(creativeIdStr, logExtra, str, C321640CjC.LIZJ);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        TuxSheet tuxSheetTz;
        Dialog dialog;
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        C19EG activity = getActivity();
        if (activity == null || (tuxSheetTz = tz()) == null || (dialog = tuxSheetTz.getDialog()) == null) {
            return;
        }
        try {
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(activity, dialog);
            tuxImmersionBarLJFF.LJFF(-16777216);
            tuxImmersionBarLJFF.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, dialog, 8);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public CommerceAgentSevenSheetFragment(int i) {
        AssemVMLazy assemVMLazy;
        this.LLJJIJI = new C19395810uS();
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSevenSheetVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 257);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(445);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 682), aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new AwS560S0100000_16((Fragment) this, 683), aFwS252S0000000_16, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 684), aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJIJIIJIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (i != 3) {
            if (i == 4) {
                VR().setState(AFwS236S0000000_6.get$arr$(431));
                return;
            }
            return;
        }
        VR().setState(AFwS236S0000000_6.get$arr$(429));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSheetFragment, com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        int height;
        Dialog dialog;
        Window window;
        View decorView;
        View viewFindViewById;
        String str;
        Window window2;
        View decorView2;
        View viewFindViewById2;
        super.onViewCreated(view, bundle);
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        C19EG activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null && (viewFindViewById2 = decorView2.findViewById(R.id.content)) != null) {
            height = viewFindViewById2.getHeight();
        } else {
            height = 0;
        }
        int iLJIIJJI = height - C12ES.LJIIJJI(getContext());
        int iLJIIIIZZ = C12ES.LJIIIIZZ(getContext());
        if (iLJIIIIZZ >= iLJIIJJI) {
            iLJIIJJI = iLJIIIIZZ;
        }
        if (getContext() != null) {
            if (layoutParams != null) {
                layoutParams.height = (int) (iLJIIJJI * 0.68f);
            }
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        this.LLJJIJI.QH(view);
        this.LLJJIJIL = view.findViewById(com.zhiliaoapp.musically.R.id.y0w);
        AssemViewModel.selectSubscribe$default(VR(), new C2217381BqS() { // from class: X.0Hjl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C449360Hji) obj).LL;
            }
        }, null, null, null, new AwS595S0100000_16(new AwS560S0100000_16(this, 155), 222), 14, null);
        AssemViewModel.selectSubscribe$default(VR(), new C2217381BqS() { // from class: X.0Hjj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C449360Hji) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS595S0100000_16(new AwS560S0100000_16(this, 156), 223), 14, null);
        CommerceAgentEnterParams commerceAgentEnterParams = this.LLJIJIL;
        if (commerceAgentEnterParams != null && (str = commerceAgentEnterParams.autoSendMsgContent) != null && str.length() != 0) {
            LifecycleOwnerExtensionsKt.LIZIZ(this, 200L, new ARunnableS106S0100000_6(this, 40));
        }
        TuxSheet tuxSheetTz = tz();
        if (tuxSheetTz != null && (dialog = tuxSheetTz.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(com.zhiliaoapp.musically.R.id.yg_)) != null) {
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 13), viewFindViewById);
        }
    }
}
