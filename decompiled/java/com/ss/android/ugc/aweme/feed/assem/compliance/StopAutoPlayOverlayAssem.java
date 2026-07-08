package com.ss.android.ugc.aweme.feed.assem.compliance;

import X.C01GW;
import X.C0CNO;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StopAutoPlayOverlayAssem extends FeedBaseAssem<StopAutoPlayOverlayAssem> {
    public long LLJL;
    public boolean LLJLIL;
    public CellSurveyComponentAbility LLJLILLLLZIIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(57));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(80));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bag;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public final VideoPlayViewModel tp() {
        return (VideoPlayViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void Er() {
        if (getContentView().getVisibility() == 0) {
            C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 213));
        }
    }

    public final boolean LJJLIL() {
        if (getContentView().getVisibility() == 0) {
            return false;
        }
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = (CellSurveyComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CellSurveyComponentAbility.class, null);
        }
        CellSurveyComponentAbility cellSurveyComponentAbility = this.LLJLILLLLZIIL;
        if (cellSurveyComponentAbility != null && cellSurveyComponentAbility.ti2()) {
            return false;
        }
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = (CellSurveyComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CellSurveyComponentAbility.class, null);
        }
        CellSurveyComponentAbility cellSurveyComponentAbility2 = this.LLJLILLLLZIIL;
        return (cellSurveyComponentAbility2 == null || !cellSurveyComponentAbility2.Gg1()) && !this.LLJLIL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (((Number) this.LLJLL.getValue()).intValue() > 0) {
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0S91
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJJJ;
                }
            }, C736820SvI.LIZLLL(), new AwS625S0100000_11(videoItemParams2, 99), 4);
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0RCB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJILJILJ;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(227), 4);
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0S92
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(228), 4);
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0S93
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJLIIIJLLLLLLLZ;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(229), 4);
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0P1c
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS625S0100000_11(videoItemParams2, 98), 4);
            C736680Sv4.LJIILL(this, tp(), new C2217381BqS() { // from class: X.0RSs
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLILZLL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(226), 4);
        }
    }
}
