package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.AbstractC1700910uMb;
import X.AnonymousClass0951;
import X.C049800Ga;
import X.C1120090fFn;
import X.C1161920gLG;
import X.C13BV;
import X.C1559260qg8;
import X.C1700900uMa;
import X.C1817470xOb;
import X.C291001Au;
import X.C497740JfY;
import X.C766270U4b;
import X.C995910c1V;
import X.C995940c1Y;
import X.InterfaceC0148002o;
import X.InterfaceC1814530xJr;
import X.InterfaceC1817490xOd;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class DecorationEditNavigationViewModel extends AssemViewModel<C995910c1V> {
    public static final /* synthetic */ int LLILLL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1120090fFn.class, (Class<Object>) "DecorationEditData", (String) 13), true);
    public final InterfaceC1814530xJr LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995910c1V(new C291001Au(new InterfaceC1817490xOd() { // from class: X.0xOu
        }), C13BV.INSTANCE);
    }

    public final C1700900uMa wQ2() {
        AnonymousClass0951 anonymousClass0951LJIIL;
        InterfaceC1814530xJr interfaceC1814530xJr = this.LLILLJJLI;
        AbstractC1700910uMb abstractC1700910uMb = (interfaceC1814530xJr == null || (anonymousClass0951LJIIL = interfaceC1814530xJr.LJIIL()) == null) ? null : (AbstractC1700910uMb) anonymousClass0951LJIIL.getValue();
        if (abstractC1700910uMb instanceof C1700900uMa) {
            return (C1700900uMa) abstractC1700910uMb;
        }
        return null;
    }

    public final C1120090fFn xQ2() {
        return (C1120090fFn) this.LL.getValue();
    }

    public DecorationEditNavigationViewModel() {
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        this.LLILLJJLI = iEffectService != null ? iEffectService.getBoardsDisplayStateManager() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_decoration_editing_page"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            X.0fFn r0 = r4.xQ2()
            X.0xOj r0 = r0.LL
            if (r0 == 0) goto L2a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.LIZ
            if (r0 == 0) goto L2a
            r2.LJJIIZI(r0)
        L2a:
            X.0fFn r0 = r4.xQ2()
            X.0xOj r0 = r0.LL
            r3 = 0
            if (r0 == 0) goto L71
            java.lang.String r1 = r0.LIZIZ
        L35:
            java.lang.String r0 = "rec_template_id"
            r2.LJJII(r1, r0)
            X.0fFn r0 = r4.xQ2()
            X.0xOj r0 = r0.LL
            if (r0 == 0) goto L44
            java.lang.String r3 = r0.LIZJ
        L44:
            java.lang.String r0 = "decoration_set_id"
            r2.LJJII(r3, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "click"
            r2.LJJII(r0, r1)
            java.lang.String r0 = "click_position"
            r2.LJJII(r5, r0)
            X.0fFn r0 = r4.xQ2()
            X.0xOj r0 = r0.LL
            if (r0 == 0) goto L6f
            boolean r1 = r0.LIZLLL
            r0 = 1
            if (r1 != r0) goto L6f
        L62:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "has_secondary_board_bubble"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L6f:
            r0 = 0
            goto L62
        L71:
            r1 = r3
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel.yQ2(java.lang.String):void");
    }

    public final void vQ2(BoardItem boardItem, boolean z) {
        Board board;
        List<BoardItem> list;
        C1700900uMa c1700900uMaWQ2 = wQ2();
        if (c1700900uMaWQ2 != null && (board = c1700900uMaWQ2.LIZIZ) != null && (list = board.boardItemList) != null) {
            ArrayList arrayList = new ArrayList();
            for (BoardItem boardItem2 : list) {
                if (boardItem2.boardItemType == 5) {
                    arrayList.add(boardItem2);
                }
            }
            if (arrayList.size() >= 5) {
                C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755794, 5, 5));
                return;
            }
            if (boardItem == null) {
                boardItem = C049800Ga.LIZIZ();
            }
            setState(new C995940c1Y(new C1817470xOb(boardItem, z)));
        }
    }
}
