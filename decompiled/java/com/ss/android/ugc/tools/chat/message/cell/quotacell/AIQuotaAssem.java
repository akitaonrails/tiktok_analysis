package com.ss.android.ugc.tools.chat.message.cell.quotacell;

import X.C01GW;
import X.C452501pT;
import X.C910290ZnP;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AIQuotaAssem extends SkeletonLayoutContainerAssem<C910290ZnP> {
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 410));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 409));

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aeh;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem
    public final void up(C910290ZnP c910290ZnP) {
        super.up(c910290ZnP);
        ((TextView) this.LLJZ.getValue()).setText(c910290ZnP.LLIZ);
        ((TextView) this.LLJZIJLIL.getValue()).setText(c910290ZnP.LLIZLLLIL);
    }
}
