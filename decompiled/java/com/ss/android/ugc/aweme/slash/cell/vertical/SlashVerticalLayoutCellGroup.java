package com.ss.android.ugc.aweme.slash.cell.vertical;

import X.C1175970ghv;
import X.C1179060gmu;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellGroup;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashVerticalLayoutCellGroup extends SlashCellGroup<C1179060gmu> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f94;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        List<SlashCellModel> list;
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp != null && (list = slashCellModelLp.cells) != null && (!list.isEmpty())) {
            C1175970ghv.LIZ(this, list, (ViewGroup) getContentView());
        }
    }
}
