package com.ss.android.ugc.aweme.tako.botpage.components.action.cell;

import X.C197039127h;
import X.C425340Gm4;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoButtonActionCell extends PowerCell<C425340Gm4> {
    public C197039127h LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C197039127h) this.itemView.findViewById(R.id.a24);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C425340Gm4 c425340Gm4 = (C425340Gm4) interfaceC1891350zJl;
        C197039127h c197039127h = this.LL;
        if (c197039127h != null) {
            Integer num = c425340Gm4.LL;
            if (num != null) {
                c197039127h.setText(this.itemView.getContext().getString(num.intValue()));
            }
            Integer num2 = c425340Gm4.LLILLJJLI;
            if (num2 != null) {
                c197039127h.setTextColorRes(num2.intValue());
            }
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(c425340Gm4, 119), this.itemView);
        Function1<Function1<? super Boolean, Unit>, Unit> function1 = c425340Gm4.LLILZ;
        if (function1 != null) {
            function1.invoke(new AwS585S0100000_6(this, 299));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fq3, viewGroup, false);
    }
}
