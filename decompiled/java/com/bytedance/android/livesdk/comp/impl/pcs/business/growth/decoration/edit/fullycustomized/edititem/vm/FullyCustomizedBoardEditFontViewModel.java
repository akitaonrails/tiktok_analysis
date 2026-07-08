package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm;

import X.C01DP;
import X.C01GW;
import X.C08FK;
import X.C0O2V;
import X.C1161920gLG;
import X.C13LP;
import X.C1559260qg8;
import X.C1815390xLF;
import X.C1817890xPH;
import X.C1817910xPJ;
import X.C1817980xPQ;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC971680bOQ;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class FullyCustomizedBoardEditFontViewModel extends AssemViewModel<C0O2V> {
    public final InterfaceC971680bOQ LL;
    public final C1559260qg8 LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O2V(0);
    }

    public final String vQ2() {
        Pair<C1817980xPQ, Typeface> pairLIZ;
        C1817980xPQ first;
        String str;
        InterfaceC971680bOQ interfaceC971680bOQ = this.LL;
        return (interfaceC971680bOQ == null || (pairLIZ = interfaceC971680bOQ.LIZ()) == null || (first = pairLIZ.getFirst()) == null || (str = first.LIZIZ) == null) ? "" : str;
    }

    public final void wQ2() {
        BoardItemStyle boardItemStyle;
        List<String> list;
        List<String> list2;
        InterfaceC971680bOQ interfaceC971680bOQ = this.LL;
        if (interfaceC971680bOQ != null) {
            interfaceC971680bOQ.LJFF();
        }
        BoardItemStyle boardItemStyle2 = ((BoardItem) this.LLILLL.getValue()).style;
        if ((boardItemStyle2 != null && (list2 = boardItemStyle2.fonts) != null && C13LP.LJJJLZIJ(0, list2) != null) || (boardItemStyle = ((BoardItem) this.LLILLL.getValue()).style) == null || (list = boardItemStyle.fonts) == null) {
            return;
        }
        C08FK.LIZ(list, 0, vQ2());
    }

    public FullyCustomizedBoardEditFontViewModel() {
        this.LL = C1815390xLF.LIZ() ? ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).Eu1() : null;
        this.LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C01DP.class, (Class<Object>) "FullCustomizedBoardHierarchyData", (String) 13), true);
        this.LLILLL = C452501pT.LIZIZ(new C1817910xPJ(this));
    }

    public final void xQ2(int i) {
        List<String> list;
        BoardItemStyle boardItemStyle = ((BoardItem) this.LLILLL.getValue()).style;
        if (boardItemStyle != null && (list = boardItemStyle.fonts) != null) {
            C08FK.LIZ(list, i, vQ2());
        }
        setState(new C1817890xPH(this));
    }
}
