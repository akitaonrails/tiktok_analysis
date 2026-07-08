package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import X.C20225714Bz;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutProductDetailRequest implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("jsonrpc")
    public final String jsonrpc;

    @C09CT("method")
    public final String method;

    @C09CT("params")
    public final ShopifyProductDetailRequestParams params;
    public static final C20225714Bz Companion = new Object() { // from class: X.14Bz
    };
    public static final int $stable = 8;

    public static final class ShopifyProductDetailRequestParams implements Serializable {
        public static final int $stable = 8;

        @C09CT("arguments")
        public final ShopifyProductDetailRequestArguments arguments;

        @C09CT("name")
        public final String name;

        public ShopifyProductDetailRequestParams(String str, ShopifyProductDetailRequestArguments shopifyProductDetailRequestArguments) {
            this.name = str;
            this.arguments = shopifyProductDetailRequestArguments;
        }
    }

    public static final class ShopifyProductDetailRequestArguments implements Serializable {
        public static final int $stable = 8;

        @C09CT("country")
        public final String country;

        @C09CT("language")
        public final String language;

        @C09CT("options")
        public final Map<String, String> options;

        @C09CT("product_id")
        public final String product_id;

        public ShopifyProductDetailRequestArguments(String str, Map<String, String> map, String str2, String str3) {
            this.product_id = str;
            this.options = map;
            this.country = str2;
            this.language = str3;
        }
    }

    public ShopifySkuCheckoutProductDetailRequest(String str, Integer num, String str2, ShopifyProductDetailRequestParams shopifyProductDetailRequestParams) {
        this.jsonrpc = str;
        this.id = num;
        this.method = str2;
        this.params = shopifyProductDetailRequestParams;
    }
}
