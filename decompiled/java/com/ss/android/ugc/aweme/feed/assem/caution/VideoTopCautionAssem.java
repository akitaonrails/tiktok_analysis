package com.ss.android.ugc.aweme.feed.assem.caution;

import X.C01GW;
import X.C0HHT;
import X.C13LE;
import X.C1594680rbG;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2276411E8h;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTopCautionAssem extends BaseCellSlotComponent<VideoTopCautionAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTopCautionAssem.class, "topCautionVM", "getTopCautionVM()Lcom/ss/android/ugc/aweme/feed/assem/caution/VideoTopCautionVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoTopCautionAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTopCautionVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 201), null, AFwS243S0000000_11.get$arr$(54));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(55));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(56));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 199));
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 200));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbb;
    }

    public final VideoTopCautionVM Bp() {
        return (VideoTopCautionVM) this.LLJLLIL.getValue(this, LLLF[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C2276411E8h.LIZIZ.LJII("common_feed", "VideoTopCautionAssem", "onInActive");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.dj0);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS146S0100000_11(this, 8));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Roh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(40), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Roi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(41), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rog
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, AFwS294S0000000_11.get$arr$(42), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rtz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C710540Ru0) obj).LL);
            }
        }, null, AFwS294S0000000_11.get$arr$(43), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Ru1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C710540Ru0) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(39), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C1594680rbG.LJIIIZ(videoItemParams.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
