package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetCategoryModel implements Serializable {
    public final List<Asset> asset_list;
    public final String category_key;
    public final String category_name;
    public final List<FilteredAsset> filtered_asset_list;
    public final Boolean has_more;
    public final String icon_url;
    public final String loki_version;
    public final Integer next_position;
    public final String recommend_req_id;
    public final List<String> url_prefix;

    public final AssetCategoryModel copy(String str, String str2, String str3, List<FilteredAsset> list, Boolean bool, Integer num, String str4, List<Asset> list2, String str5, List<String> list3) {
        return new AssetCategoryModel(str, str2, str3, list, bool, num, str4, list2, str5, list3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetCategoryModel(category_key=");
        sbLIZ.append(this.category_key);
        sbLIZ.append(", category_name=");
        sbLIZ.append(this.category_name);
        sbLIZ.append(", icon_url=");
        sbLIZ.append(this.icon_url);
        sbLIZ.append(", filtered_asset_list=");
        sbLIZ.append(this.filtered_asset_list);
        sbLIZ.append(", has_more=");
        sbLIZ.append(this.has_more);
        sbLIZ.append(", next_position=");
        sbLIZ.append(this.next_position);
        sbLIZ.append(", recommend_req_id=");
        sbLIZ.append(this.recommend_req_id);
        sbLIZ.append(", asset_list=");
        sbLIZ.append(this.asset_list);
        sbLIZ.append(", loki_version=");
        sbLIZ.append(this.loki_version);
        sbLIZ.append(", url_prefix=");
        sbLIZ.append(this.url_prefix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AssetCategoryModel(String str, String str2, String str3, List<FilteredAsset> list, Boolean bool, Integer num, String str4, List<Asset> list2, String str5, List<String> list3) {
        this.category_key = str;
        this.category_name = str2;
        this.icon_url = str3;
        this.filtered_asset_list = list;
        this.has_more = bool;
        this.next_position = num;
        this.recommend_req_id = str4;
        this.asset_list = list2;
        this.loki_version = str5;
        this.url_prefix = list3;
    }
}
