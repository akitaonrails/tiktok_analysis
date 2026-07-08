package com.ss.android.ugc.aweme.slash.cell.list.horizontal;

import X.C09CT;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashHorizontalListCellModel extends BaseSlashCellData {

    @C09CT("view_more_config")
    public final ViewMoreConfig viewMoreConfig;

    public SlashHorizontalListCellModel() {
        this(null);
    }

    public SlashHorizontalListCellModel(ViewMoreConfig viewMoreConfig) {
        super(null, null);
        this.viewMoreConfig = viewMoreConfig;
    }
}
