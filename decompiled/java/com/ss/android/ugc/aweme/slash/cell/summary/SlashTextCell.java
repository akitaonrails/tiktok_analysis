package com.ss.android.ugc.aweme.slash.cell.summary;

import X.C01GW;
import X.C098200Yq;
import X.C189200o6;
import X.C2248361CzK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashTextCell extends SlashCell<SlashTextCellModel> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f9d;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        String str;
        int i;
        Object c098200Yq;
        Integer numLIZIZ;
        SlashTextCellModel slashTextCellModel = (SlashTextCellModel) this.LLJJIII;
        TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(R.id.wp8);
        Object obj = null;
        if (slashTextCellModel != null) {
            str = slashTextCellModel.text;
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        if (slashTextCellModel != null) {
            String str2 = slashTextCellModel.textColor;
            if (str2 != null) {
                try {
                    C01GW c01gw = C2248361CzK.LIZ;
                    c098200Yq = C2248361CzK.LJ(tuxTextView.getContext(), str2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    tuxTextView.setTextColor(num.intValue());
                }
            }
            String str3 = slashTextCellModel.font;
            if (str3 != null && (numLIZIZ = C2248361CzK.LIZIZ(str3)) != null) {
                tuxTextView.setTuxFont(numLIZIZ.intValue());
            }
            i = slashTextCellModel.maxLine;
        } else {
            i = 2;
        }
        tuxTextView.setMaxLines(i);
    }
}
