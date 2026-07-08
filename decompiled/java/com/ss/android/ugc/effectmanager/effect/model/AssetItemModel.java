package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetItemModel implements Serializable {
    public final List<Asset> asset_list;
    public final List<FilteredAsset> filtered_asset_list;

    public AssetItemModel(List<Asset> list, List<FilteredAsset> list2) {
        this.asset_list = list;
        this.filtered_asset_list = list2;
    }
}
