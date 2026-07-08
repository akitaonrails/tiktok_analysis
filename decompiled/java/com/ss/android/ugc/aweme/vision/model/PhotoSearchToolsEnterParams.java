package com.ss.android.ugc.aweme.vision.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchToolsEnterParams implements Serializable {
    public List<ProductCard> fypProductImages;
    public Boolean hasScreenShot;
    public String localFilePath;
    public String lowImageUrl;
    public String searchSource;
    public Long searchTime;
    public Boolean useBitmap;

    public PhotoSearchToolsEnterParams() {
        this(null, null, "", null, null, null, null);
    }

    public final PhotoSearchToolsEnterParams copy(String str, Long l, String str2, Boolean bool, String str3, Boolean bool2, List<ProductCard> list) {
        return new PhotoSearchToolsEnterParams(str, l, str2, bool, str3, bool2, list);
    }

    public final void setFypProductImages(List<ProductCard> list) {
        this.fypProductImages = list;
    }

    public final void setHasScreenShot(Boolean bool) {
        this.hasScreenShot = bool;
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public final void setLowImageUrl(String str) {
        this.lowImageUrl = str;
    }

    public final void setSearchSource(String str) {
        this.searchSource = str;
    }

    public final void setSearchTime(Long l) {
        this.searchTime = l;
    }

    public final void setUseBitmap(Boolean bool) {
        this.useBitmap = bool;
    }

    public PhotoSearchToolsEnterParams(String str, Long l, String str2, Boolean bool, String str3, Boolean bool2, List<ProductCard> list) {
        this.localFilePath = str;
        this.searchTime = l;
        this.searchSource = str2;
        this.useBitmap = bool;
        this.lowImageUrl = str3;
        this.hasScreenShot = bool2;
        this.fypProductImages = list;
    }
}
