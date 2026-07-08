package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAnchorInfo implements Serializable {

    @C09CT("anchor_position")
    public List<Integer> anchorPosition;

    @C09CT("map_extra")
    public MapExtra mapExtra;

    public final List<Integer> getAnchorPosition() {
        return this.anchorPosition;
    }

    public final MapExtra getMapExtra() {
        return this.mapExtra;
    }

    public final void setAnchorPosition(List<Integer> list) {
        this.anchorPosition = list;
    }

    public final void setMapExtra(MapExtra mapExtra) {
        this.mapExtra = mapExtra;
    }
}
