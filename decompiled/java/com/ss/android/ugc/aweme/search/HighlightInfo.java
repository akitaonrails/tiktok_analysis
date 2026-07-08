package com.ss.android.ugc.aweme.search;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class HighlightInfo implements Serializable {

    @C09CT("field")
    public String field;

    @C09CT("positions")
    public List<Position> positions;

    public final String getField() {
        return this.field;
    }

    public final List<Position> getPositions() {
        return this.positions;
    }

    public final void setField(String str) {
        this.field = str;
    }

    public final void setPositions(List<Position> list) {
        this.positions = list;
    }
}
