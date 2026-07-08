package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.playentity;

import X.AbstractC20356314kz;
import X.C086F;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20347214jW;
import X.C20347414jY;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C758450Tp5;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.boards.BoardsPageActionChannel;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookBoardEntityStatusChannel;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.playentity.BoardsEntity;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class BoardsEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("boards", 0, 39000003, 0, C1697810uHb.LJIIJJI("boards_ongoing", "boards_finished", "never"), null, 20464);
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public BoardsEntity() {
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.14g6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BoardsEntity@5942.addBoardsPageActionChannelObserver$1");
                try {
                    BoardsEntity boardsEntity = this.LL;
                    DataChannel dataChannel = boardsEntity.LLJ;
                    if (dataChannel != null) {
                        dataChannel.CQ2(BoardsPageActionChannel.class, boardsEntity, new C20347014jU(boardsEntity));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BoardsEntity@5942.addBoardsPageActionChannelObserver$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.14fl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BoardsEntity@5942.clearData$1");
                try {
                    this.LL.LJJIL();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BoardsEntity@5942.clearData$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        LJJLIIIIJ(0);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if ((!C500260Jjc.LJJIL() && !InteractServiceDel.LLILLJJLI.J8()) || (((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIZILJ() != null && C758450Tp5.LIZIZ(this.LLJ))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PlaybookBoardEntityStatusChannel.class), Boolean.TRUE)) {
            LJJIJ();
            return;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.CQ2(PlaybookBoardEntityStatusChannel.class, this, new C20347214jW(this));
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        boolean z;
        String strLJIJI = C497740JfY.LJIJI(2131851416);
        String strLJIJI2 = C497740JfY.LJIJI(2131851416);
        C13BV c13bv = C13BV.INSTANCE;
        if (!C500260Jjc.LJJIL() && !InteractServiceDel.LLILLJJLI.J8()) {
            z = false;
        } else {
            z = true;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.ctk, R.attr.ctk, c13bv, null, i, null, z, null, 3712);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        boolean z;
        String str2;
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIZILJ();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new C20347414jY(c259800zU));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        if (dataChannel.gg0(RoomChannel.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean zJ8 = InteractServiceDel.LLILLJJLI.J8();
        if (C500260Jjc.LJJIJLIJ()) {
            str2 = "playbook_live_take_page";
        } else if (z && zJ8) {
            str2 = "playbook_live_detail";
        } else {
            str2 = "playbook";
        }
        C758450Tp5 c758450Tp5LJIIZILJ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIZILJ();
        if (c758450Tp5LJIIZILJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("state_id", String.valueOf(c20361214lm.LIZIZ));
            c758450Tp5LJIIZILJ.LIZJ(dataChannel, str2, linkedHashMap);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3);
    }
}
