package com.ss.android.ugc.tools.chat.message.cell.usermessagecell;

import X.C18WJ;
import X.C910300ZnQ;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseMessageCell;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class UserMessageCell extends BaseMessageCell<SkeletonLayoutContainerAssem<C910300ZnQ>, C910300ZnQ> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        C18WJ c18wj = new C18WJ();
        c18wj.LIZIZ = R.layout.ae_;
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(9));
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(10));
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(11));
        return new SkeletonLayoutContainerAssem(R.id.eu1, c18wj.LIZ, c18wj.LIZIZ, c18wj.LIZJ);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
    }
}
