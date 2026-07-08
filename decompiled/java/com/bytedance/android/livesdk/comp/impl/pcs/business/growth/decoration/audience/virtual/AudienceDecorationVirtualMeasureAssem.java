package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual;

import X.C019F;
import X.C01GW;
import X.C056E;
import X.C056F;
import X.C056G;
import X.C09R3;
import X.C1145200fuI;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1814980xKa;
import X.C1816500xN2;
import X.C1816680xNK;
import X.C1816690xNL;
import X.C1816700xNM;
import X.C1816710xNN;
import X.C1816720xNO;
import X.C1816740xNQ;
import X.C1816790xNV;
import X.C1816800xNW;
import X.C1816810xNX;
import X.C1816930xNj;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.AudienceDecorationDataViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class AudienceDecorationVirtualMeasureAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public DataChannel LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AudienceDecorationVirtualMeasureAssem.class, "stateViewModel", "getStateViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/virtual/AudienceDecorationStateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AudienceDecorationVirtualMeasureAssem.class, "decorationDataViewModel", "getDecorationDataViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/AudienceDecorationDataViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public AudienceDecorationVirtualMeasureAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AudienceDecorationStateViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C056E(c19719912DlLIZ), new C1816800xNW(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AudienceDecorationDataViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C056F(c19719912DlLIZ2), new C1816810xNX(), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1145200fuI.class, null), checkSupervisorPrepared());
        this.LLJILJIL = C452501pT.LIZIZ(new C056G(this));
    }

    public final C1145200fuI Lo() {
        return (C1145200fuI) this.LLJI.getValue();
    }

    public final AudienceDecorationStateViewModel No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (AudienceDecorationStateViewModel) assemVMLazy.getValue();
    }

    public final C1816500xN2 Oo() {
        return (C1816500xN2) this.LLJILJIL.getValue();
    }

    public static boolean Ho(BoardItem boardItem) {
        SceneryContent sceneryContent;
        int i = boardItem.boardItemType;
        if (i == 5 || i == 1 || i == 8 || (i == 6 && (sceneryContent = boardItem.sceneryContent) != null && sceneryContent.sceneryType == 1)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DataChannel dataChannel = Lo().LLILLL;
        this.LLJIJIL = dataChannel;
        if (dataChannel != null) {
            C1816500xN2 c1816500xN2Oo = Oo();
            c1816500xN2Oo.LLILZIL = this;
            c1816500xN2Oo.LLILLJJLI = (ConstraintLayout) c1816500xN2Oo.LL.findViewById(R.id.gaj);
            c1816500xN2Oo.LLILLL = (ConstraintLayout) c1816500xN2Oo.LL.findViewById(R.id.u1c);
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0xNT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C449901p3) obj).LL;
            }
        }, null, new C1816680xNK(this), 6);
    }

    public final C1814980xKa Go(Board board, BoardItem boardItem) {
        String string;
        String string2;
        String string3;
        String str;
        String string4;
        Room roomLJJLIIIIJ;
        Room roomLJJLIIIIJ2;
        User owner;
        long j = board.id;
        long j2 = boardItem.id;
        DataChannel dataChannel = this.LLJIJIL;
        String str2 = "";
        if (dataChannel == null || (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel)) == null || (owner = roomLJJLIIIIJ2.getOwner()) == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = "";
        }
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) == null || (string2 = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
            string2 = "";
        }
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (recommendBoardInfo == null || (string3 = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string3 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = board.version;
        if (i != 1) {
            if (i != 2) {
                str = "semi_customized";
            } else {
                str = "rich_text_decoration";
            }
        } else {
            str = "fully_customized";
        }
        RecommendBoardInfo recommendBoardInfo2 = board.recommendBoardInfo;
        if (recommendBoardInfo2 != null && (string4 = Long.valueOf(recommendBoardInfo2.recommendBoardId).toString()) != null) {
            str2 = string4;
        }
        return new C1814980xKa(j, j2, string, string2, str, string3, recommendBoardInfo, str2, "audience", 128);
    }

    public final C1816930xNj Jo(Board board, BoardItem boardItem) {
        return new C1816930xNj(boardItem, false, false, true, new C1816720xNO(this), new C1816790xNV(), new C1816690xNL(this, board, boardItem), new C1816740xNQ(), new C1816710xNN(), new C1816700xNM(), Go(board, boardItem), Lo().LL);
    }
}
