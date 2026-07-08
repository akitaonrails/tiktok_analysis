package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.message;

import X.AbstractC738140SxQ;
import X.C001A;
import X.C019F;
import X.C1085240eLa;
import X.C1094530eaZ;
import X.C1145200fuI;
import X.C1145310fuT;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C776250Uch;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationStateViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.message.SMBBoardMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class AudienceDecorationMessageAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1559260qg8 LL;
    public final C1085240eLa LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AudienceDecorationMessageAssem.class, "stateViewModel", "getStateViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/virtual/AudienceDecorationStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0eLa] */
    public AudienceDecorationMessageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AudienceDecorationStateViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1094530eaZ(c19719912DlLIZ), new C1145310fuT(), null, true);
        this.LL = new C1559260qg8(new C723590SZx(this, C1145200fuI.class, null), checkSupervisorPrepared());
        this.LLILLJJLI = new OnIMMessageListener() { // from class: X.0eLa
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "AudienceDecorationMessageAssem";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                Long lValueOf;
                int size;
                String string;
                List<BoardItem> list;
                if (iMessage instanceof SMBBoardMessage) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[BoardTrace] [4] audience#AudienceDecorationMessageAssem.onMessage SMBBoardMessage received action=");
                    SMBBoardMessage sMBBoardMessage = (SMBBoardMessage) iMessage;
                    sbLIZ.append(sMBBoardMessage.action);
                    sbLIZ.append(" boardId=");
                    Board board = sMBBoardMessage.board;
                    Long lValueOf2 = null;
                    if (board != null) {
                        lValueOf = Long.valueOf(board.id);
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ.append(lValueOf);
                    sbLIZ.append(" itemCount=");
                    Board board2 = sMBBoardMessage.board;
                    if (board2 != null && (list = board2.boardItemList) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    sbLIZ.append(size);
                    sbLIZ.append(" roomId=");
                    DataChannel dataChannel = ((C1145200fuI) this.LL.LL.getValue()).LLILLL;
                    if (dataChannel != null) {
                        lValueOf2 = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
                    }
                    sbLIZ.append(lValueOf2);
                    C20441214yg.LIZIZ("pcs_audience_decoration", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC781460Ul6 interfaceC781460Ul6ZI2 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2();
                    C1078550eAn c1078550eAn = new C1078550eAn(sMBBoardMessage.action, sMBBoardMessage.board);
                    EnumC1083620eIy enumC1083620eIy = EnumC1083620eIy.AUDIENCE;
                    DataChannel dataChannel2 = ((C1145200fuI) this.LL.LL.getValue()).LLILLL;
                    if (dataChannel2 == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)).toString()) == null) {
                        string = "";
                    }
                    interfaceC781460Ul6ZI2.LJIIIZ(c1078550eAn, enumC1083620eIy, string);
                }
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = ((C1145200fuI) this.LL.getValue()).LLILLL;
        IMessageManager iMessageManager = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[BoardTrace] [3] audience#AudienceDecorationMessageAssem.onCreate registeringListener=");
        sbLIZ.append(iMessageManager != null);
        sbLIZ.append(" roomId=");
        DataChannel dataChannel2 = ((C1145200fuI) this.LL.getValue()).LLILLL;
        sbLIZ.append(dataChannel2 != null ? Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)) : null);
        C20441214yg.LIZIZ("pcs_audience_decoration", C2188811AlT.LIZIZ(sbLIZ));
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.S_M_B_BOARD_MESSAGE.getIntType(), (OnIMMessageListener) this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        DataChannel dataChannel = ((C1145200fuI) this.LL.getValue()).LLILLL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(C001A.S_M_B_BOARD_MESSAGE.getIntType(), this.LLILLJJLI);
    }
}
