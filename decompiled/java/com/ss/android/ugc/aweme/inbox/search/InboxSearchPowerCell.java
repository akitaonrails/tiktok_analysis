package com.ss.android.ugc.aweme.inbox.search;

import X.AbstractC1240270iNd;
import X.C1308910kAL;
import X.C786410Ut5;
import X.InterfaceC1240590iO9;
import X.InterfaceC1906710ziX;
import X.InterfaceC336510DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class InboxSearchPowerCell<T extends InterfaceC1240590iO9> extends PowerCell<T> implements View.OnClickListener {
    public AbstractC1240270iNd LL;

    public void L5(View view) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        AbstractC1240270iNd abstractC1240270iNd;
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item == null || !item.getNeedReport() || (abstractC1240270iNd = this.LL) == null) {
            return;
        }
        abstractC1240270iNd.LIZIZ(item.getTabName(), item.getUniqueId(), item.getEventParams());
    }

    public void I5(String str) {
        AbstractC1240270iNd abstractC1240270iNd;
        T item = getItem();
        if (item != null && item.getNeedReport() && (abstractC1240270iNd = this.LL) != null) {
            abstractC1240270iNd.LIZ(str, item.getEventParams());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5 */
    public void onBindItemView(T t) {
        InterfaceC336510DHd interfaceC336510DHdLJ;
        InterfaceC1906710ziX stub = getStub();
        Drawable drawableLJ = null;
        if (stub != null) {
            interfaceC336510DHdLJ = stub.LJ(AbstractC1240270iNd.class);
        } else {
            interfaceC336510DHdLJ = null;
        }
        this.LL = (AbstractC1240270iNd) interfaceC336510DHdLJ;
        t.getType();
        t.getId();
        C786410Ut5.I7(this, this.itemView);
        View view = this.itemView;
        Context context = getContext();
        if (context != null) {
            drawableLJ = C1308910kAL.LJ(R.attr.bx, context);
        }
        view.setBackground(drawableLJ);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I5(null);
        L5(view);
    }
}
