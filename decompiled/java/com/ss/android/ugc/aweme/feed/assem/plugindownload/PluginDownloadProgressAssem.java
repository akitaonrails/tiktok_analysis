package com.ss.android.ugc.aweme.feed.assem.plugindownload;

import X.C01GW;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C737910Sx3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PluginDownloadProgressAssem extends FeedBaseContentAssem<PluginDownloadProgressAssem> {
    public View LLJJJJ;
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(79));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewQg = null;
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), RootCellCommonAbility.class, null);
        if (rootCellCommonAbility != null) {
            viewQg = rootCellCommonAbility.Qg("plugin_download_progress_view", false);
        }
        this.LLJJJJ = viewQg;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0R7k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(55), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
