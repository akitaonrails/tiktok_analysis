package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1749280vcc;
import X.C339190DRl;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiDetailLoadingAssem extends PoiDetailBaseUiSlotComponent<Object> {
    public C1749280vcc LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3l;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJJIJI = c1749280vcc;
        if (c1749280vcc != null) {
            C339190DRl.LIZLLL(c1749280vcc);
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJI;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }
}
