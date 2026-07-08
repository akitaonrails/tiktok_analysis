package com.ss.android.ugc.aweme.im.common.assem;

import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IMUISlotViewAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public abstract View LLLILZJ();

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Zo(LLLILZJ());
        super.xo();
    }
}
