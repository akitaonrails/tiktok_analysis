package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.cell;

import X.C16F5;
import X.InterfaceC1891350zJl;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVerifiedIntroCell extends PowerCell<PcsVerifiedIntroItem> {
    public C16F5 LL;
    public C16F5 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.gu4;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C16F5) this.itemView.findViewById(R.id.title);
        this.LLILLJJLI = (C16F5) this.itemView.findViewById(R.id.eu1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        PcsVerifiedIntroItem pcsVerifiedIntroItem = (PcsVerifiedIntroItem) interfaceC1891350zJl;
        super.onBindItemView(pcsVerifiedIntroItem);
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(pcsVerifiedIntroItem.title);
        }
        C16F5 c16f52 = this.LLILLJJLI;
        if (c16f52 != null) {
            c16f52.setText(pcsVerifiedIntroItem.content);
        }
    }
}
