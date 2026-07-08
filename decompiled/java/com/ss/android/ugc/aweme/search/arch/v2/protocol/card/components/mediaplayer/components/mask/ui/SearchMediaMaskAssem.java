package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.mask.ui;

import X.C10IT;
import X.InterfaceC657240PqE;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaMaskAssem extends BaseSearchMediaOptionalAssem {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu9;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = interfaceC657240PqE.getAweme();
        c10it.getClass();
        return C10IT.LJIIL(aweme);
    }
}
