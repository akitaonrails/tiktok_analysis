package com.ss.android.ugc.aweme.featureeffectvideo.powerlist;

import X.C186900nj;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnClickListenerC512201z6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureVideoCreateNewVideoCell extends PowerCell<C186900nj> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.c6z, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C786410Ut5.I7(new ViewOnClickListenerC512201z6((C186900nj) interfaceC1891350zJl, 43), this.itemView);
    }
}
