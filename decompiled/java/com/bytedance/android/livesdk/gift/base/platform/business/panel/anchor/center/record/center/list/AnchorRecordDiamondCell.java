package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list;

import X.C050F;
import X.C1143680frq;
import X.C16F5;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AnchorRecordDiamondCell extends PowerCell<C050F> {
    public LiveIconView LL;
    public C16F5 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.findViewById(R.id.xts);
        this.LL = (LiveIconView) this.itemView.findViewById(R.id.fto);
        this.LLILLJJLI = (C16F5) this.itemView.findViewById(R.id.yfm);
        C1143680frq.LJ(this.LL, "tiktok_live_broadcast_demand_13", "ttlive_end_slr_diamonds.png", ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C050F c050f = (C050F) interfaceC1891350zJl;
        super.onBindItemView(c050f);
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(c050f.LL));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpd, viewGroup, false);
    }
}
