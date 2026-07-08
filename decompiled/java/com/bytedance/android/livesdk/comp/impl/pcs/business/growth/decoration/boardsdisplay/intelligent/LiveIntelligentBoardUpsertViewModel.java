package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent;

import X.C09YA;
import X.C1159750gHl;
import X.C1161920gLG;
import X.C1559260qg8;
import X.C1814200xJK;
import X.C291301Ax;
import X.C443120HZe;
import X.C500260Jjc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1814530xJr;
import X.InterfaceC1816300xMi;
import com.bytedance.android.live.NativeDecorationOperationEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveIntelligentBoardUpsertViewModel extends AssemViewModel<C1159750gHl> implements InterfaceC1816300xMi {
    public final C09YA LL = new C09YA(this, new C1814200xJK());
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C291301Ax.class, "save_data"), true);

    @Override // X.InterfaceC1816300xMi
    public final void Zm2() {
    }

    @Override // X.InterfaceC1816300xMi
    public final void qD1(boolean z) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159750gHl(0);
    }

    public final C291301Ax vQ2() {
        return (C291301Ax) this.LLILLJJLI.getValue();
    }

    public final void wQ2(Board board, boolean z, boolean z2, int i) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        DataChannel dataChannel;
        String string;
        DataChannel dataChannel2;
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null && (boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager()) != null) {
            if (!z && !z2) {
                boardsDisplayStateManager.LJIIIIZZ(null, null);
            } else {
                HashMap<String, String> map = new HashMap<>();
                if (C500260Jjc.LJJ() && i == 3) {
                    map.put("entry_source", "in_live_capsule");
                }
                Board boardLIZ = board.LIZ();
                boardLIZ.status = 2;
                boardsDisplayStateManager.LJIIIIZZ(boardLIZ, map);
            }
            C291301Ax c291301AxVQ2 = vQ2();
            if (c291301AxVQ2 != null && (dataChannel = c291301AxVQ2.LLILLJJLI) != null) {
                C291301Ax c291301AxVQ22 = vQ2();
                if (c291301AxVQ22 == null || (dataChannel2 = c291301AxVQ22.LLILLJJLI) == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                dataChannel.LC0(NativeDecorationOperationEvent.class, new C443120HZe(board, string, 1));
            }
        }
    }
}
