package com.ss.android.ugc.aweme.hangout.component.livecard.view;

import X.AbstractC479160Iqg;
import X.C1161920gLG;
import X.C21681819tI;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseMultiFeedPowerCell<T extends AbstractC479160Iqg> extends PowerCell<T> {
    public final boolean LL;

    public BaseMultiFeedPowerCell() {
        this(0);
    }

    public void L5(String str) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        L5("BaseMultiFeedPowerCell#onViewAttachedToWindow");
    }

    public BaseMultiFeedPowerCell(int i) {
        this.LL = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        C21681819tI c21681819tI;
        super.onBindItemView(t);
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
        boolean z = this.LL;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            c21681819tI.LLILLJJLI = z;
        }
    }
}
