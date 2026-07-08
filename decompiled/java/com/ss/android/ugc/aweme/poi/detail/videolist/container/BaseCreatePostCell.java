package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.C2211631BhB;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AwS597S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseCreatePostCell<T extends InterfaceC1891350zJl> extends PowerCell<T> {
    public abstract int I5();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18((BaseCreatePostCell) this, 367));
        C786410Ut5.I7(new AbS699S0100000_18(this, 19, 42), this.itemView);
    }
}
