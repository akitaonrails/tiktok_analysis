package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1066404Fa;
import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Data implements InterfaceC1066404Fa {
    public Object LIZ;
    public final transient Map<String, Object> LIZIZ;

    @C09CT("action_data")
    public Map<String, ? extends Object> actionData;

    @C09CT("features")
    public final GodaV2Feature features;

    @C09CT("item_data")
    public final n itemData;

    @C09CT("style")
    public final GodaV2Style style;

    @C09CT("track_data")
    public final Map<String, GodaV2EventGroup> trackData;

    @C09CT("track_template")
    public final Map<String, EventParam> trackTemplate;

    public GodaV2Data() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Data)) {
            return false;
        }
        GodaV2Data godaV2Data = (GodaV2Data) obj;
        return Intrinsics.LJFF(this.features, godaV2Data.features) && Intrinsics.LJFF(this.itemData, godaV2Data.itemData) && Intrinsics.LJFF(this.trackData, godaV2Data.trackData) && Intrinsics.LJFF(this.trackTemplate, godaV2Data.trackTemplate) && Intrinsics.LJFF(this.style, godaV2Data.style) && Intrinsics.LJFF(this.actionData, godaV2Data.actionData) && Intrinsics.LJFF(this.LIZ, godaV2Data.LIZ);
    }

    public final int hashCode() {
        GodaV2Feature godaV2Feature = this.features;
        int iHashCode = (godaV2Feature == null ? 0 : godaV2Feature.hashCode()) * 31;
        n nVar = this.itemData;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Map<String, GodaV2EventGroup> map = this.trackData;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, EventParam> map2 = this.trackTemplate;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        GodaV2Style godaV2Style = this.style;
        int iHashCode5 = (iHashCode4 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        Map<String, ? extends Object> map3 = this.actionData;
        int iHashCode6 = (iHashCode5 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Object obj = this.LIZ;
        return iHashCode6 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2Data(features=");
        sbLIZ.append(this.features);
        sbLIZ.append(", itemData=");
        sbLIZ.append(this.itemData);
        sbLIZ.append(", trackData=");
        sbLIZ.append(this.trackData);
        sbLIZ.append(", trackTemplate=");
        sbLIZ.append(this.trackTemplate);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", actionData=");
        sbLIZ.append(this.actionData);
        sbLIZ.append(", itemDataModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1066404Fa
    public final Map<String, Object> LIZ() {
        return this.LIZIZ;
    }

    public GodaV2Data(GodaV2Feature godaV2Feature, n nVar, Map<String, GodaV2EventGroup> map, Map<String, EventParam> map2, GodaV2Style godaV2Style, Map<String, ? extends Object> map3, Object obj) {
        this.features = godaV2Feature;
        this.itemData = nVar;
        this.trackData = map;
        this.trackTemplate = map2;
        this.style = godaV2Style;
        this.actionData = map3;
        this.LIZ = obj;
        this.LIZIZ = new LinkedHashMap();
    }
}
