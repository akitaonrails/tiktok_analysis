package com.ss.android.ugc.aweme.slash.cell.divider;

import X.C01GW;
import X.C098200Yq;
import X.C1180060goW;
import X.C189200o6;
import X.C2248361CzK;
import X.C418440Gaw;
import X.C814420VxA;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashDividerCell extends SlashCell<SlashDividerCellModel> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f95;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        Object c098200Yq;
        View viewFindViewById = getContentView().findViewById(R.id.r1_);
        SlashDividerCellModel slashDividerCellModel = (SlashDividerCellModel) this.LLJJIII;
        if (slashDividerCellModel != null) {
            Integer num = slashDividerCellModel.height;
            if (num != null) {
                C1180060goW.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)), viewFindViewById);
            }
            Integer num2 = slashDividerCellModel.heightPixel;
            if (num2 != null) {
                C1180060goW.LJIIIZ(num2.intValue(), viewFindViewById);
            }
            String str = slashDividerCellModel.color;
            if (str != null) {
                try {
                    C01GW c01gw = C2248361CzK.LIZ;
                    c098200Yq = C2248361CzK.LJ(getContentView().getContext(), str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num3 = (Integer) c098200Yq;
                if (num3 != null) {
                    viewFindViewById.setBackgroundColor(num3.intValue());
                }
            }
        }
    }
}
