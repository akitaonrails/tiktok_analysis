package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Cell implements Serializable {
    public static final int $stable = 8;

    @C09CT("cell_type")
    public Integer cellType;

    @C09CT("tail_red_dot")
    public Boolean tailRedDot = Boolean.FALSE;

    @C09CT("tail_text")
    public String tailText;

    public final Integer getCellType() {
        return this.cellType;
    }

    public final Boolean getTailRedDot() {
        return this.tailRedDot;
    }

    public final String getTailText() {
        return this.tailText;
    }

    public final void setCellType(Integer num) {
        this.cellType = num;
    }

    public final void setTailRedDot(Boolean bool) {
        this.tailRedDot = bool;
    }

    public final void setTailText(String str) {
        this.tailText = str;
    }
}
