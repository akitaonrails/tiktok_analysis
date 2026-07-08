package com.ss.android.ugc.effectmanager.effect.model;

import X.C13BV;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetPanelModelKt {
    public static final AssetConsumerType toAssetConsumerType(int i) {
        for (AssetConsumerType assetConsumerType : AssetConsumerType.values()) {
            if (assetConsumerType.getValue() == i) {
                return assetConsumerType;
            }
        }
        return null;
    }

    public static final AssetType toAssetType(int i) {
        for (AssetType assetType : AssetType.values()) {
            if (assetType.getValue() == i) {
                return assetType;
            }
        }
        return null;
    }

    public static final UrlModel toUrlModel(FileInf fileInf) {
        UrlModel urlModel = new UrlModel(new ArrayList(), null, null, null, null);
        List<String> url_list = fileInf.getUrl_list();
        if (url_list == null) {
            url_list = C13BV.INSTANCE;
        }
        urlModel.setUrl_list(url_list);
        urlModel.setUri(fileInf.getUri());
        return urlModel;
    }

    public static final UrlModel toUrlModel(CoverInfo coverInfo) {
        UrlModel urlModel = new UrlModel(new ArrayList(), null, null, null, null);
        urlModel.setUrl_list(coverInfo.getUrl_list());
        urlModel.setUri(coverInfo.getUri());
        return urlModel;
    }

    public static final UrlModel toUrlModel(Icon icon) {
        return new UrlModel(icon.getUrl_list(), null, icon.getUri(), null, null);
    }
}
