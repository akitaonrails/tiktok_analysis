package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdProductTile implements Serializable {

    @C09CT("container_type")
    public String containerType;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("lynx_scheme")
    public String lynxScheme;

    @C09CT("product_list")
    public List<AdNativeProduct> productList;

    @C09CT("show_seconds")
    public int showSeconds;

    public AdProductTile() {
        this(null, null, 0, "", null);
    }

    public final String getContainerType() {
        return this.containerType;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final List<AdNativeProduct> getProductList() {
        return this.productList;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final void setContainerType(String str) {
        this.containerType = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public final void setProductList(List<AdNativeProduct> list) {
        this.productList = list;
    }

    public final void setShowSeconds(int i) {
        this.showSeconds = i;
    }

    public AdProductTile(String str, List<String> list, int i, String str2, List<AdNativeProduct> list2) {
        this.lynxScheme = str;
        this.geckoChannel = list;
        this.showSeconds = i;
        this.containerType = str2;
        this.productList = list2;
    }
}
