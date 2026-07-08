package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs;

import X.C1835520xri;
import X.C781710UlV;
import X.InterfaceC20631915oL;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighlightTabAssem;
import java.util.List;
import kotlin.jvm.internal.AwS33S0000100_18;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayHighlightTabCell extends AssemPowerCell<HighlightTabAssem, C1835520xri> implements InterfaceC20631915oL {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new HighlightTabAssem();
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        HighlightTabAssem highlightTabAssem = (HighlightTabAssem) NG1();
        C781710UlV c781710UlV = highlightTabAssem.LLJZIJLIL;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
        highlightTabAssem.LLL = highlightTabAssem.sp().getState().LL;
        highlightTabAssem.sp().setState(new AwS33S0000100_18(-1L, 8));
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        HighlightTabAssem highlightTabAssem = (HighlightTabAssem) NG1();
        C781710UlV c781710UlV = highlightTabAssem.LLJZIJLIL;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        if (!highlightTabAssem.LLJLLL) {
            highlightTabAssem.LLJLLL = true;
            List<ITEM> listListGetAll = highlightTabAssem.op().listGetAll();
            if (listListGetAll == 0 || listListGetAll.isEmpty()) {
                highlightTabAssem.op().manualListRefresh();
                return;
            }
            return;
        }
        highlightTabAssem.op();
        if (!highlightTabAssem.LLJZ) {
            return;
        }
        Long l = highlightTabAssem.LLL;
        if (l != null && l.longValue() != -1) {
            highlightTabAssem.sp().setState(new AwS33S0000100_18(l.longValue(), 8));
        } else {
            highlightTabAssem.sp().vQ2((ViewOnAttachStateChangeListenerC20604515jv) highlightTabAssem.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }
}
