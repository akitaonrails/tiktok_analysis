package com.ss.android.ugc.feed.platform.cell.component.cover;

import X.AbstractC1604130rqV;
import X.AbstractC581530MrP;
import X.C0C64;
import X.C0N6Z;
import X.C0R5B;
import X.C0RRP;
import X.C0SFC;
import X.C0SUC;
import X.C1017070cZd;
import X.C1299020juO;
import X.C1331670kl3;
import X.C1473160oRG;
import X.C1595060rbs;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2245741Cv6;
import X.C582130MsN;
import X.C583420MuS;
import X.C690870R8b;
import X.C708750Rr7;
import X.C729980SkG;
import X.C786410Ut5;
import X.InterfaceC689860R4e;
import X.InterfaceC690040R4w;
import X.InterfaceC691060R8u;
import Y.AObjectS354S0100000_11;
import Y.AObjectS386S0100000_11;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoCoverComponentTemp implements VideoCoverAbility {
    public final SmartImageView LL;
    public final VideoViewCell LLILLJJLI;
    public final AbstractC1604130rqV LLILLL;
    public final Function1<Video, C1331670kl3> LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final Function0<Boolean> LLIZ;
    public final Function0<CellAdaptionComponentAbility> LLIZLLLIL;
    public final Function0<ViewGroup> LLJ;
    public final Function0<ViewGroup> LLJI;
    public final Function0<InterfaceC690040R4w> LLJIJIL;
    public boolean LLJILJIL = true;
    public C0R5B LLJILJILJ;

    public final C708750Rr7 LIZ() {
        return new C708750Rr7(new InterfaceC691060R8u(this) { // from class: X.0R5X
            @Override // X.InterfaceC691060R8u
            public final void LIZ() {
            }
        }, this.LLILLJJLI.getAweme(), this.LLJILJILJ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final SmartImageView getVideoCover() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void Er1(String str) {
        boolean z;
        boolean z2;
        String desc;
        C690870R8b c690870R8bJm;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        InterfaceC689860R4e interfaceC689860R4e;
        AbstractC581530MrP abstractC581530MrPLJJJLL;
        Aweme aweme = this.LLILLJJLI.LLJJ;
        if (aweme != null && aweme.getAwemeType() == 77) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_0, null);
            int i = C2187451AjH.LIZ;
            return;
        }
        if (C0SUC.LIZ(this.LLILLJJLI.LLLLLLLLLL).getVideoCurrentPosition() > 0) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_1, null);
            return;
        }
        if (C1017070cZd.LLILZLL(aweme)) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_0, null);
            return;
        }
        SmartImageView smartImageView = this.LL;
        C1299020juO.LIZLLL(C729980SkG.LIZJ(aweme), str);
        if (((this.LLJILJIL && ((interfaceC689860R4e = this.LLILLJJLI.LLLLZ) == null || (abstractC581530MrPLJJJLL = interfaceC689860R4e.LJJJLL()) == null || !abstractC581530MrPLJJJLL.LIZIZ(aweme))) || smartImageView == null) && ((!C2245741Cv6.LIZIZ(aweme) || !C0N6Z.LJIIIZ) && !C0SFC.LIZIZ.LJIL(aweme))) {
            z2 = false;
        } else {
            z2 = true;
        }
        String eventType = this.LLILLJJLI.getEventType();
        if (aweme == null || (desc = aweme.getDesc()) == null) {
            desc = "";
        }
        if (z2) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_2, null);
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            AbstractC1604130rqV abstractC1604130rqV = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[showCover],");
            sbLIZ.append(eventType);
            abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
            return;
        }
        if (this.LLILZLL.invoke().booleanValue() && (Intrinsics.LJFF(eventType, "playlist") || Intrinsics.LJFF(eventType, "chat"))) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_3, null);
            return;
        }
        if (this.LLILLJJLI.Gg1()) {
            C583420MuS.LIZIZ(aweme, C0RRP.E_S_COVER_4, null);
            return;
        }
        RootCellComponent rootCellComponent = this.LLILLJJLI.LLZZZZ;
        if (rootCellComponent != null && (c690870R8bJm = rootCellComponent.jm()) != null && (baseFeedPageParams = c690870R8bJm.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null && c2189821An6.getStoryToPostNeedHideCover()) {
            return;
        }
        if (smartImageView != null) {
            VideoViewCell videoViewCell = this.LLILLJJLI;
            int i2 = videoViewCell.LLJILJILJ.LJIIJ;
            int i3 = videoViewCell.LLJJI;
            if (i2 != 1 ? !(i2 != 125 || i3 != 0) : !(!C1595060rbs.LIZIZ.LJIIIZ() || i3 != 0)) {
                smartImageView.setController(null);
            }
            C786410Ut5.LLFF(0, smartImageView);
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            C583420MuS.LIZJ(C729980SkG.LIZJ(aweme), C0RRP.S_COVER);
        }
        this.LLILZIL.invoke(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void lD2(boolean z) {
        BaseFeedPlayerView baseFeedPlayerView;
        SmartImageView smartImageView;
        String desc;
        if (z || (baseFeedPlayerView = this.LLILLJJLI.LLJLIL) == null || !baseFeedPlayerView.Mg() || (smartImageView = this.LL) == null || C0C64.LJIILLIIL().LJIJ(31744, 0, "player_setting_show_cover_for_surface_view", true) != 1) {
            return;
        }
        C786410Ut5.LLFF(0, smartImageView);
        Aweme aweme = this.LLILLJJLI.LLJJ;
        if (aweme == null || (desc = aweme.getDesc()) == null) {
            desc = "";
        }
        C582130MsN.LIZ().LJ().getClass();
        C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility
    public final void qa1(String str) {
        String desc;
        Aweme aweme = this.LLILLJJLI.getAweme();
        String strLIZJ = C729980SkG.LIZJ(aweme);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideCover ");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(", source ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C583420MuS.LIZJ(C729980SkG.LIZJ(aweme), C0RRP.H_COVER);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            if (aweme == null || (desc = aweme.getDesc()) == null) {
                desc = "";
            }
            C786410Ut5.LLFF(8, smartImageView);
            C582130MsN.LIZ().LJ().getClass();
            C1473160oRG.LIZ(smartImageView, desc, C729980SkG.LIZJ(aweme));
            AbstractC1604130rqV abstractC1604130rqV = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(str);
            sbLIZ2.append("], ");
            sbLIZ2.append(this.LLILLJJLI.getEventType());
            abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), aweme);
        }
        this.LLILZIL.invoke(Boolean.TRUE);
    }

    public VideoCoverComponentTemp(SmartImageView smartImageView, VideoViewCell videoViewCell, AbstractC1604130rqV abstractC1604130rqV, AObjectS354S0100000_11 aObjectS354S0100000_11, AObjectS354S0100000_11 aObjectS354S0100000_112, AObjectS386S0100000_11 aObjectS386S0100000_11, AObjectS386S0100000_11 aObjectS386S0100000_112, AObjectS386S0100000_11 aObjectS386S0100000_113, AObjectS386S0100000_11 aObjectS386S0100000_114, AObjectS386S0100000_11 aObjectS386S0100000_115, AObjectS386S0100000_11 aObjectS386S0100000_116) {
        this.LL = smartImageView;
        this.LLILLJJLI = videoViewCell;
        this.LLILLL = abstractC1604130rqV;
        this.LLILZ = aObjectS354S0100000_11;
        this.LLILZIL = aObjectS354S0100000_112;
        this.LLILZLL = aObjectS386S0100000_11;
        this.LLIZ = aObjectS386S0100000_112;
        this.LLIZLLLIL = aObjectS386S0100000_113;
        this.LLJ = aObjectS386S0100000_114;
        this.LLJI = aObjectS386S0100000_115;
        this.LLJIJIL = aObjectS386S0100000_116;
    }
}
