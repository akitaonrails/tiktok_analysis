package com.ss.android.ugc.aweme.component.searchcomponent.agent;

import X.C433690GzX;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchAgentHintsCell extends PowerCell<C433690GzX> implements View.OnClickListener, View.OnLongClickListener {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.jok);
        C786410Ut5.I7(this, this.itemView);
        this.itemView.setOnLongClickListener(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        C433690GzX c433690GzX = (C433690GzX) interfaceC1891350zJl;
        if (c433690GzX.LL.length() != 0 && (tuxTextView = this.LL) != null) {
            tuxTextView.setText(c433690GzX.LL);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0<Unit> function0;
        C433690GzX item = getItem();
        if (item != null && (function0 = item.LLILLJJLI) != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.q_, viewGroup, false);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Function1<View, Unit> function1;
        if (view != null) {
            C433690GzX item = getItem();
            if (item != null && (function1 = item.LLILLL) != null) {
                function1.invoke(view);
                return true;
            }
            return true;
        }
        return false;
    }
}
