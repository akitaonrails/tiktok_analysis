package com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamic;

import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNavigateButtonAssem extends PoiDetailBaseUiSlotComponent<Object> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0r;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AkS28S0300000_18(kp(), this, ip(), 11), view);
    }
}
