package com.ss.android.ugc.aweme.relation.monitor;

import X.C0DVD;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackCell extends PowerCell<C0DVD> {
    public boolean LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Function0<Unit> function0;
        super.onViewAttachedToWindow();
        if (this.LL) {
            return;
        }
        C0DVD item = getItem();
        if (item != null && (function0 = item.LL) != null) {
            function0.invoke();
        }
        this.LL = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, 0));
        return view;
    }
}
