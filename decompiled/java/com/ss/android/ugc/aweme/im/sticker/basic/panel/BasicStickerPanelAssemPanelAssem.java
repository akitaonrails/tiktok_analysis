package com.ss.android.ugc.aweme.im.sticker.basic.panel;

import X.C13LE;
import X.C19719912Dl;
import X.C723850SaN;
import X.InterfaceC1632206aG;
import android.view.View;
import com.ss.android.ugc.aweme.im.assem.BasePanelAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BasicStickerPanelAssemPanelAssem extends BasePanelAssem {
    public final C19719912Dl LLJJIJIL = C13LE.LIZ(InterfaceC1632206aG.class);

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cs7;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelAssem
    public final C19719912Dl ip() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 231));
    }
}
