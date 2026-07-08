package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public class BaseSlashCellData {

    @C09CT("click_event")
    public final String clickEvent;

    @C09CT("padding")
    public final Padding padding;

    public BaseSlashCellData() {
        this(null, null);
    }

    public BaseSlashCellData(Padding padding, String str) {
        this.padding = padding;
        this.clickEvent = str;
    }
}
