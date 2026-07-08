package com.ss.android.ugc.aweme.component.aiagent.banner;

import X.C06LQ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class CapsuleCell extends PowerCell<C06LQ> implements View.OnClickListener {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.im);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.xrg);
        C786410Ut5.I7(this, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C06LQ c06lq = (C06LQ) interfaceC1891350zJl;
        super.onBindItemView(c06lq);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c06lq.LL);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0<Unit> function0;
        C06LQ item = getItem();
        if (item != null && (function0 = item.LLILLJJLI) != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.p_, viewGroup, false);
    }
}
