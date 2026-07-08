package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpHeadData {

    @C09CT("action_data")
    public final Map<String, Object> actionData;

    @C09CT("features")
    public final SeaPdpHeadFeatures features;

    @C09CT("item_data")
    public final n itemData;

    @C09CT("pendant_style")
    public final PDPSeaHeaderPendantStyle pendantStyle;

    @C09CT("style")
    public final PDPSeaHeaderListItemStyle style;

    @C09CT("track_data")
    public final Map<String, GodaV2EventGroup> trackData;

    @C09CT("track_template")
    public final Map<String, EventParam> trackTemplate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpHeadData)) {
            return false;
        }
        SeaPdpHeadData seaPdpHeadData = (SeaPdpHeadData) obj;
        return Intrinsics.LJFF(this.features, seaPdpHeadData.features) && Intrinsics.LJFF(this.trackData, seaPdpHeadData.trackData) && Intrinsics.LJFF(this.trackTemplate, seaPdpHeadData.trackTemplate) && Intrinsics.LJFF(this.itemData, seaPdpHeadData.itemData) && Intrinsics.LJFF(this.actionData, seaPdpHeadData.actionData) && Intrinsics.LJFF(this.style, seaPdpHeadData.style) && Intrinsics.LJFF(this.pendantStyle, seaPdpHeadData.pendantStyle);
    }

    public SeaPdpHeadData(SeaPdpHeadFeatures seaPdpHeadFeatures, Map<String, GodaV2EventGroup> map, Map<String, EventParam> map2, n nVar, Map<String, ? extends Object> map3, PDPSeaHeaderListItemStyle pDPSeaHeaderListItemStyle, PDPSeaHeaderPendantStyle pDPSeaHeaderPendantStyle) {
        this.features = seaPdpHeadFeatures;
        this.trackData = map;
        this.trackTemplate = map2;
        this.itemData = nVar;
        this.actionData = map3;
        this.style = pDPSeaHeaderListItemStyle;
        this.pendantStyle = pDPSeaHeaderPendantStyle;
    }
}
