package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs;

import X.C1835540xrk;
import X.C781710UlV;
import X.InterfaceC20631915oL;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayTabAssem;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayReplayTabCell extends AssemPowerCell<ReplayTabAssem, C1835540xrk> implements InterfaceC20631915oL {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new ReplayTabAssem();
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        C781710UlV c781710UlV = ((ReplayTabAssem) NG1()).LLJLLL;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        ReplayTabAssem replayTabAssem = (ReplayTabAssem) NG1();
        C781710UlV c781710UlV = replayTabAssem.LLJLLL;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        if (!replayTabAssem.LLJLLIL) {
            replayTabAssem.LLJLLIL = true;
            List<ITEM> listListGetAll = replayTabAssem.op().listGetAll();
            if (listListGetAll == 0 || listListGetAll.isEmpty()) {
                replayTabAssem.op().manualListRefresh();
                return;
            }
            return;
        }
        replayTabAssem.op();
    }
}
