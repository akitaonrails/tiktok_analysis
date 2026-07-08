package com.ss.android.ugc.aweme.poi.detail.ymal.vertical;

import X.AbstractC1180940gpw;
import X.C09CT;
import X.C1173340gdg;
import X.C1173350gdh;
import X.C1201190hMb;
import X.C15438062q;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailYmalModule extends AbstractC1180940gpw implements Serializable {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("poi_detail_tag_style_map")
    public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

    @C09CT("poi_list")
    public final List<PoiDiscoveryCard> poiList;

    @C09CT("poi_list_v2")
    public final List<PoiGeneralCard> poiListV2;

    @C09CT("title")
    public final String title;

    public PoiDetailYmalModule() {
        this(null, null, null, null, null, null);
    }

    public final PoiDetailYmalModule copy(String str, List<PoiDiscoveryCard> list, List<PoiGeneralCard> list2, Map<String, PoiDetailTagStyle> map, Integer num, Boolean bool) {
        return new PoiDetailYmalModule(str, list, list2, map, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailYmalModule)) {
            return false;
        }
        PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) obj;
        return Intrinsics.LJFF(this.title, poiDetailYmalModule.title) && Intrinsics.LJFF(this.poiList, poiDetailYmalModule.poiList) && Intrinsics.LJFF(this.poiListV2, poiDetailYmalModule.poiListV2) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiDetailYmalModule.poiDetailTagStyleMap) && Intrinsics.LJFF(this.cursor, poiDetailYmalModule.cursor) && Intrinsics.LJFF(this.hasMore, poiDetailYmalModule.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PoiDiscoveryCard> list = this.poiList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PoiGeneralCard> list2 = this.poiListV2;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.cursor;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailYmalModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", poiList=");
        sbLIZ.append(this.poiList);
        sbLIZ.append(", poiListV2=");
        sbLIZ.append(this.poiListV2);
        sbLIZ.append(", poiDetailTagStyleMap=");
        sbLIZ.append(this.poiDetailTagStyleMap);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C1173340gdg> toHorizontalYmalCards() {
        List<PoiDiscoveryCard> list = this.poiList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PoiDiscoveryCard> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1173340gdg(it2.next()));
        }
        return arrayList;
    }

    public final List<C1173350gdh> toYmalCards() {
        List<PoiDiscoveryCard> list = this.poiList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PoiDiscoveryCard> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1173350gdh(it2.next()));
        }
        return arrayList;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Map<String, PoiDetailTagStyle> getPoiDetailTagStyleMap() {
        return this.poiDetailTagStyleMap;
    }

    public final List<PoiDiscoveryCard> getPoiList() {
        return this.poiList;
    }

    public final List<PoiGeneralCard> getPoiListV2() {
        return this.poiListV2;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        if (!(baseComponentData instanceof PoiDetailYmalModule)) {
            return false;
        }
        PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) baseComponentData;
        if (!Intrinsics.LJFF(this.title, poiDetailYmalModule.title) || !Intrinsics.LJFF(this.poiList, poiDetailYmalModule.poiList) || !Intrinsics.LJFF(this.poiListV2, poiDetailYmalModule.poiListV2) || !Intrinsics.LJFF(this.poiDetailTagStyleMap, poiDetailYmalModule.poiDetailTagStyleMap) || !Intrinsics.LJFF(this.cursor, poiDetailYmalModule.cursor) || !Intrinsics.LJFF(this.hasMore, poiDetailYmalModule.hasMore)) {
            return false;
        }
        return true;
    }

    public PoiDetailYmalModule(String str, List<PoiDiscoveryCard> list, List<PoiGeneralCard> list2, Map<String, PoiDetailTagStyle> map, Integer num, Boolean bool) {
        this.title = str;
        this.poiList = list;
        this.poiListV2 = list2;
        this.poiDetailTagStyleMap = map;
        this.cursor = num;
        this.hasMore = bool;
    }
}
