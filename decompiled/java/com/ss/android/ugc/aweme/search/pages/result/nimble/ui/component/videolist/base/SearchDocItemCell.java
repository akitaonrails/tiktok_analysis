package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base;

import X.C684920Qtm;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.photo.SearchNimblePhotoAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.video.SearchNimbleVideoAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.SearchUltimateInflateBaseCell;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDocItemCell extends SearchUltimateInflateBaseCell<C684920Qtm> {
    public int LLIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return this.LLIZ - 50000 == 102 ? new SearchNimblePhotoAssem() : new SearchNimbleVideoAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        this.LLIZ = i;
        return onCreateItemView(viewGroup);
    }
}
