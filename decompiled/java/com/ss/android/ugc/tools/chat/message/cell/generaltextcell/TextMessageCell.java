package com.ss.android.ugc.tools.chat.message.cell.generaltextcell;

import X.C18WJ;
import X.C909940Zmq;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseMessageCell;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class TextMessageCell extends BaseMessageCell<SkeletonLayoutContainerAssem<C909940Zmq>, C909940Zmq> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        C18WJ c18wj = new C18WJ();
        c18wj.LIZIZ = R.layout.ae8;
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(183));
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(184));
        return new SkeletonLayoutContainerAssem(R.id.eu1, c18wj.LIZ, c18wj.LIZIZ, c18wj.LIZJ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.itemView.setHapticFeedbackEnabled(false);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
    }
}
