package com.bytedance.iap.core.model;

import X.C09CT;
import X.EnumC1780720wRK;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPProductDetail {
    public final transient String LIZ;
    public final transient EnumC1780720wRK LIZIZ;
    public final transient String LIZJ;
    public final transient String LIZLLL;
    public final transient String LJ;
    public final transient String LJFF;
    public final transient String LJI;
    public final transient String LJII;
    public final transient String LJIIIIZZ;

    @C09CT("client_payload")
    public final String clientPayload;

    @C09CT("prices")
    public final List<IAPProductPrice> prices;

    @C09CT("request_product_id")
    public final String requestProductId;

    public IAPProductDetail(String str, String str2, EnumC1780720wRK enumC1780720wRK, String str3, String str4, String str5, String str6, List<IAPProductPrice> list, String str7, String str8, String str9, String str10) {
        this.LIZ = str;
        this.requestProductId = str2;
        this.LIZIZ = enumC1780720wRK;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.clientPayload = str6;
        this.prices = list;
        this.LJFF = str7;
        this.LJI = str8;
        this.LJII = str9;
        this.LJIIIIZZ = str10;
    }
}
