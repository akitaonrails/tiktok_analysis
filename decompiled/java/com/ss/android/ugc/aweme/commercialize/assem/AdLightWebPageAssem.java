package com.ss.android.ugc.aweme.commercialize.assem;

import X.C01GW;
import X.C0RP1;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1041070dCL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C988570bpf;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdEventViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLightWebPageAssem extends ReusedUIContentAssem<AdLightWebPageAssem> implements InterfaceC712990Rxx<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final BPEAHandler LLJJJJ = new BPEAHandler(Looper.getMainLooper());
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdLightWebPageAssem.class, "lightWebPageVM", "getLightWebPageVM()Lcom/ss/android/ugc/aweme/commercialize/assem/AdLightWebPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdLightWebPageAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdLightWebPageVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 128), null, AFwS252S0000000_16.get$arr$(103));
        this.LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(104));
        this.LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(105));
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS252S0000000_16.get$arr$(106));
        this.LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdEventViewModel.class), AFwS252S0000000_16.get$arr$(107));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        this.LLJJJJ.removeCallbacksAndMessages(null);
    }

    public final AdLightWebPageVM dp() {
        return (AdLightWebPageVM) this.LLJJJJJIL.getValue(this, LLJLIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C1022620cia.LJ("AdLightWebPageAssem", "on in active");
    }

    public final FrameLayout cp(C19EG c19eg) {
        Integer numValueOf;
        ViewStub viewStub = (ViewStub) c19eg.findViewById(R.id.a91);
        if (viewStub != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                numValueOf = Integer.valueOf(R.layout.cd4);
            } else {
                numValueOf = null;
            }
            viewStub.setLayoutResource(numValueOf.intValue());
            return (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        }
        return (FrameLayout) c19eg.findViewById(R.id.a90);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout frameLayoutCp;
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (SettingsManager.LIZ("commerce_video_root_view_optimize", true)) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (frameLayoutCp = cp(c19egLIZ)) != null) {
                C1022620cia.LJ("AdLightWebPageAssem", "set containerView");
                this.LLJJI = frameLayoutCp;
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0c2X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJIJIL;
            }
        }, null, AFwS300S0000000_16.get$arr$(18), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rsy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, AFwS300S0000000_16.get$arr$(19), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0SJw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(20), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0c2W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996360c2E) obj).LLILZLL;
            }
        }, null, AFwS300S0000000_16.get$arr$(21), 6);
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && C1017070cZd.LJJLIIIJLJLI(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
