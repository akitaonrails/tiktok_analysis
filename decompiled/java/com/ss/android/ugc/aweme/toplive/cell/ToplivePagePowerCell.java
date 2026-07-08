package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C21681819tI;
import X.C482270Ivh;
import X.C482280Ivi;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ToplivePagePowerCell<T extends AbstractC482420Ivw> extends PowerCell<T> {
    public final boolean LL;

    public ToplivePagePowerCell() {
        this(true);
    }

    public void L5() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C482280Ivi.LIZ.getClass();
        C482270Ivh c482270Ivh = C482280Ivi.LIZJ;
        if (c482270Ivh.LJ <= 0) {
            c482270Ivh.LJ = System.currentTimeMillis();
        }
        c482270Ivh.LIZ();
        L5();
    }

    public ToplivePagePowerCell(boolean z) {
        this.LL = z;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        C21681819tI c21681819tI;
        super.onBindItemView(t);
        boolean z = this.LL;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            c21681819tI.LLILLJJLI = z;
        }
    }
}
