package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem;

import X.AnonymousClass0317;
import X.C019F;
import X.C034S;
import X.C0GXB;
import X.C1120604Zw;
import X.C13LE;
import X.C1569950qxN;
import X.C1569960qxO;
import X.C1637806bA;
import X.C1775880wJW;
import X.C19719912Dl;
import X.C1AQS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpLivePlaybackEntranceSettings;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLivePlaybackVideoControlAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public FrameLayout LLJ;
    public SmartImageView LLJI;
    public TextView LLJIJIL;
    public C0GXB LLJILJIL;
    public TuxIconView LLJILJILJ;
    public FrameLayout LLJILLL;
    public LinearLayout LLJJ;
    public ECVideoPlaybackController LLJJI;
    public long LLJJIII;
    public String LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlaybackVideoControlAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECLivePlaybackVideoControlAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 362), AFwS264S0000000_24.get$arr$(111), null, true);
        this.LLJJIJI = "";
    }

    public final ECLivePlaybackViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (ECLivePlaybackViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3;
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECLivePlaybackVideoControlAssem, onCreate, enableStopLive=");
        EcSeaPdpLivePlaybackEntranceSettings.EcSeaPdpLivePlaybackEntranceModel ecSeaPdpLivePlaybackEntranceModel = EcSeaPdpLivePlaybackEntranceSettings.LIZ;
        Integer num = ecSeaPdpLivePlaybackEntranceModel.enableStopLiveWhenInPlaybackPage;
        sbLIZ.append(num != null && num.intValue() == 1);
        sbLIZ.append(" , isLivePlaying=");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        sbLIZ.append(((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).isPlaying());
        C2188811AlT.LIZIZ(sbLIZ);
        Integer num2 = ecSeaPdpLivePlaybackEntranceModel.enableStopLiveWhenInPlaybackPage;
        if (num2 == null || num2.intValue() != 1) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        if (Intrinsics.LJFF(((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2).isPlaying(), Boolean.TRUE)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime3, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
            }
            ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3).stopLivePlayer(true);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJI = null;
    }

    public final String Go(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        return C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
    }

    public final void Lo(long j) {
        String strGo = Go(j);
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            textView.setText(C786410Ut5.k4(Locale.US, "%s/%s", Arrays.copyOf(new Object[]{strGo, this.LLJJIJI}, 2)));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (FrameLayout) view.findViewById(R.id.i2_);
        this.LLJI = (SmartImageView) view.findViewById(R.id.l7r);
        this.LLJIJIL = (TextView) view.findViewById(R.id.z5f);
        this.LLJILJIL = (C0GXB) view.findViewById(R.id.vke);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.l70);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.i23);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.dus);
        ECLivePlaybackViewModel eCLivePlaybackViewModelHo = Ho();
        C1569960qxO c1569960qxO = new C2217381BqS() { // from class: X.0qxO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLILZIL;
            }
        };
        C1569950qxN c1569950qxN = new C2217381BqS() { // from class: X.0qxN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLILZLL;
            }
        };
        getActualLifecycleOwner();
        AssemViewModel.selectSubscribe$default(eCLivePlaybackViewModelHo, this, c1569960qxO, c1569950qxN, C736820SvI.LIZLLL(), null, null, new AwS640S0100000_26(this, 40), 48, null);
        C0GXB c0gxb = this.LLJILJIL;
        if (c0gxb != null) {
            C786410Ut5.xb(c0gxb, new C1775880wJW(this, 2));
        }
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS160S0100000_26(this, 61));
        }
    }

    public static void Jo(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.Ab(view, 0.0f);
    }
}
