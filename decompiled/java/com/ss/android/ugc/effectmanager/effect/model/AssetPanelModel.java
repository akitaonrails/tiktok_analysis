package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetPanelModel implements Serializable {
    public final List<Asset> asset_list;
    public final List<CategoryInfo> category_list;
    public final String extra;
    public final List<FilteredAsset> filtered_asset_list;
    public final boolean has_more;
    public final String loki_version;
    public final int next_position;
    public final String recommend_req_id;
    public final List<String> url_prefix;

    public final AssetPanelModel copy(List<CategoryInfo> list, boolean z, int i, String str, String str2, List<Asset> list2, List<FilteredAsset> list3, String str3, List<String> list4) {
        return new AssetPanelModel(list, z, i, str, str2, list2, list3, str3, list4);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetPanelModel(category_list=");
        sbLIZ.append(this.category_list);
        sbLIZ.append(", has_more=");
        sbLIZ.append(this.has_more);
        sbLIZ.append(", next_position=");
        sbLIZ.append(this.next_position);
        sbLIZ.append(", loki_version=");
        sbLIZ.append(this.loki_version);
        sbLIZ.append(", recommend_req_id=");
        sbLIZ.append(this.recommend_req_id);
        sbLIZ.append(", asset_list=");
        sbLIZ.append(this.asset_list);
        sbLIZ.append(", filtered_asset_list=");
        sbLIZ.append(this.filtered_asset_list);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", url_prefix=");
        sbLIZ.append(this.url_prefix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AssetPanelModel(List<CategoryInfo> list, boolean z, int i, String str, String str2, List<Asset> list2, List<FilteredAsset> list3, String str3, List<String> list4) {
        this.category_list = list;
        this.has_more = z;
        this.next_position = i;
        this.loki_version = str;
        this.recommend_req_id = str2;
        this.asset_list = list2;
        this.filtered_asset_list = list3;
        this.extra = str3;
        this.url_prefix = list4;
    }
}
