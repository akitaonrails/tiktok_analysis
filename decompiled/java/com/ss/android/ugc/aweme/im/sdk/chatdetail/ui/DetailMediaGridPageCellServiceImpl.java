package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui;

import X.C13LE;
import X.C19719912Dl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IDetailMediaGridPageCellService;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailMediaGridPageCellServiceImpl implements IDetailMediaGridPageCellService {
    public final Class<? extends PowerCell<?>> LIZ = DetailMediaGridPageCell.class;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IDetailMediaGridPageCellService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(DetailMediaGridContentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IDetailMediaGridPageCellService
    public final Class<? extends PowerCell<?>> LIZIZ() {
        return this.LIZ;
    }
}
