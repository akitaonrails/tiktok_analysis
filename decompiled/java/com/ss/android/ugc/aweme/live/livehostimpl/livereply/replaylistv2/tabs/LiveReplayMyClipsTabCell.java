package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs;

import X.C1835530xrj;
import X.C781710UlV;
import X.InterfaceC20631915oL;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsTabAssem;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayMyClipsTabCell extends AssemPowerCell<MyClipsTabAssem, C1835530xrj> implements InterfaceC20631915oL {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new MyClipsTabAssem();
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        C781710UlV c781710UlV = ((MyClipsTabAssem) NG1()).LLJLLL;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        MyClipsTabAssem myClipsTabAssem = (MyClipsTabAssem) NG1();
        C781710UlV c781710UlV = myClipsTabAssem.LLJLLL;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        if (!myClipsTabAssem.LLJLLIL) {
            myClipsTabAssem.LLJLLIL = true;
            List<ITEM> listListGetAll = myClipsTabAssem.op().listGetAll();
            if (listListGetAll == 0 || listListGetAll.isEmpty()) {
                myClipsTabAssem.op().manualListRefresh();
                return;
            }
            return;
        }
        myClipsTabAssem.op();
    }
}
