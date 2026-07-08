package com.ss.android.ugc.tools.chat.message.cell.onboardingcell;

import X.C18WJ;
import X.C904560ZeA;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseMessageCell;
import com.ss.android.ugc.tools.chat.message.cell.base.SkeletonLayoutContainerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class OnboardingCell extends BaseMessageCell<SkeletonLayoutContainerAssem<C904560ZeA>, C904560ZeA> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        C18WJ c18wj = new C18WJ();
        c18wj.LIZIZ = R.layout.aeg;
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(192));
        c18wj.LIZ(AFwS278S0000000_32.get$arr$(193));
        return new SkeletonLayoutContainerAssem(R.id.eu1, c18wj.LIZ, c18wj.LIZIZ, c18wj.LIZJ);
    }
}
