package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public class CellBizBaseData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("cell")
    public Cell cell;

    public final Cell getCell() {
        return this.cell;
    }

    public final void setCell(Cell cell) {
        this.cell = cell;
    }
}
