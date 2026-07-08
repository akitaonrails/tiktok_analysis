package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model.SearchMinisItemDataModel;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisCardItemCell extends AssemPowerCell<SearchMinisCardItemAssem, SearchMinisItemDataModel> {
    public SearchMinisCardItemAssem LLIZ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        SearchMinisCardItemAssem searchMinisCardItemAssem = this.LLIZ;
        if (searchMinisCardItemAssem != null) {
            return searchMinisCardItemAssem;
        }
        SearchMinisCardItemAssem searchMinisCardItemAssem2 = new SearchMinisCardItemAssem(new AwS589S0100000_10(this, 556));
        this.LLIZ = searchMinisCardItemAssem2;
        return searchMinisCardItemAssem2;
    }
}
