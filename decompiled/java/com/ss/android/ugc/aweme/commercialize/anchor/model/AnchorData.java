package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import X.InterfaceC1392640mLO;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorData implements Serializable {

    @C09CT("anchor")
    public AnchorCommonStruct anchor;

    @C09CT("anchor_context")
    public InterfaceC1392640mLO anchorContext;

    @C09CT("map_extra")
    public MapExtra mapExtra;

    @C09CT("tracking_data")
    public Map<String, String> trackingData;

    public AnchorData() {
        this(null, null, null, null);
    }

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final InterfaceC1392640mLO getAnchorContext() {
        return this.anchorContext;
    }

    public final MapExtra getMapExtra() {
        return this.mapExtra;
    }

    public final Map<String, String> getTrackingData() {
        return this.trackingData;
    }

    public final void setAnchor(AnchorCommonStruct anchorCommonStruct) {
        this.anchor = anchorCommonStruct;
    }

    public final void setAnchorContext(InterfaceC1392640mLO interfaceC1392640mLO) {
        this.anchorContext = interfaceC1392640mLO;
    }

    public final void setMapExtra(MapExtra mapExtra) {
        this.mapExtra = mapExtra;
    }

    public final void setTrackingData(Map<String, String> map) {
        this.trackingData = map;
    }

    public AnchorData(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, Map<String, String> map, MapExtra mapExtra) {
        this.anchor = anchorCommonStruct;
        this.anchorContext = interfaceC1392640mLO;
        this.trackingData = map;
        this.mapExtra = mapExtra;
    }
}
