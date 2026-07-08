package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C01GW;
import X.C050L;
import X.C1241390iPR;
import X.C1241460iPY;
import X.C2097608Jq;
import X.C340780DXo;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1241340iPM;
import X.InterfaceC1891350zJl;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchRecentKeywordCell extends PowerCell<C050L> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1565));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1241390iPR c1241390iPR;
        super.onViewAttachedToWindow();
        C1241460iPY.LIZ.getClass();
        C1241460iPY.LIZ(false);
        C050L item = getItem();
        if (item == null || (c1241390iPR = (C1241390iPR) this.LL.getValue()) == null) {
            return;
        }
        String str = item.LL;
        EnumC1241340iPM enumC1241340iPM = EnumC1241340iPM.RECENT;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("position", "recent");
        pairArr[1] = new Pair("cell_type", "keyword");
        String str2 = item.LLILLJJLI.get("rank_num");
        if (str2 == null) {
            str2 = "-1";
        }
        pairArr[2] = new Pair("rank_num", str2);
        String str3 = item.LLILLJJLI.get("item_num");
        pairArr[3] = new Pair("item_num", str3 != null ? str3 : "-1");
        c1241390iPR.LIZLLL(str, enumC1241340iPM, C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C050L c050l = (C050L) interfaceC1891350zJl;
        super.onBindItemView(c050l);
        ((TextView) this.itemView.findViewById(R.id.kjn)).setText(c050l.LL);
        C786410Ut5.I7(new ACListenerS122S0200000_19(c050l, this, 28), this.itemView);
        C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.kjl), new ACListenerS122S0200000_19(c050l, this, 29));
        C340780DXo.LIZIZ(this.itemView.findViewById(R.id.kjl));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_e, viewGroup, false);
    }
}
