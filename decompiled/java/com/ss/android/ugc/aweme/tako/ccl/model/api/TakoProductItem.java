package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProductItem {

    @C09CT("cover")
    public final String cover;

    @C09CT("currency")
    public String currency;

    @C09CT("currency_show_mode")
    public final int currencyShowMode;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("display_sold_count")
    public final String displaySoldCount;

    @C09CT("format_origin_price_number")
    public final String formatOriginPriceNumber;

    @C09CT("format_price_number")
    public final String formatPriceNumber;

    @C09CT("global_sold_count")
    public final long globalSoldCount;

    @C09CT("img")
    public final List<String> img;

    @C09CT("price_prefix")
    public final String pricePrefixval;

    @C09CT("product_id")
    public final long productId;

    @C09CT("product_id_str")
    public final String productIdStr;

    @C09CT("product_rating")
    public final String productRating;

    @C09CT("review_count")
    public final long reviewCount;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_currency_space")
    public final boolean showCurrencySpace;

    @C09CT("sold_count")
    public final long soldCount;

    @C09CT("symbol_position")
    public final int symbolPosition;

    @C09CT("title")
    public final String title;

    @C09CT("title_show_line")
    public final int titleShowLine;

    public TakoProductItem() {
        this(0L, null, null, 0, null, null, false, 0, null, 0L, null, 0L, null, null, null, null, null, null, 0, 0L, 1048575, null);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((C786410Ut5.Y2(this.productId) * 31) + this.productIdStr.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleShowLine) * 31) + this.cover.hashCode()) * 31) + this.img.hashCode()) * 31) + C786410Ut5.Z2(this.showCurrencySpace)) * 31) + this.currencyShowMode) * 31) + this.pricePrefixval.hashCode()) * 31) + C786410Ut5.Y2(this.reviewCount)) * 31) + this.schema.hashCode()) * 31) + C786410Ut5.Y2(this.soldCount)) * 31) + this.currency.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.formatPriceNumber.hashCode()) * 31) + this.formatOriginPriceNumber.hashCode()) * 31) + this.productRating.hashCode()) * 31) + this.displaySoldCount.hashCode()) * 31) + this.symbolPosition) * 31) + C786410Ut5.Y2(this.globalSoldCount);
    }

    public TakoProductItem(long j, String str, String str2, int i, String str3, List<String> list, boolean z, int i2, String str4, long j2, String str5, long j3, String str6, String str7, String str8, String str9, String str10, String str11, int i3, long j4) {
        this.productId = j;
        this.productIdStr = str;
        this.title = str2;
        this.titleShowLine = i;
        this.cover = str3;
        this.img = list;
        this.showCurrencySpace = z;
        this.currencyShowMode = i2;
        this.pricePrefixval = str4;
        this.reviewCount = j2;
        this.schema = str5;
        this.soldCount = j3;
        this.currency = str6;
        this.currencySymbol = str7;
        this.formatPriceNumber = str8;
        this.formatOriginPriceNumber = str9;
        this.productRating = str10;
        this.displaySoldCount = str11;
        this.symbolPosition = i3;
        this.globalSoldCount = j4;
    }

    public TakoProductItem(long j, String str, String str2, int i, String str3, List list, boolean z, int i2, String str4, long j2, String str5, long j3, String str6, String str7, String str8, String str9, String str10, String str11, int i3, long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? C13BV.INSTANCE : list, (i4 & 64) == 0 ? z : false, (i4 & 128) != 0 ? 1 : i2, (i4 & 256) != 0 ? "" : str4, (i4 & 512) != 0 ? 0L : j2, (i4 & 1024) != 0 ? "" : str5, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j3, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str6, (i4 & 8192) != 0 ? "" : str7, (i4 & 16384) != 0 ? "" : str8, (32768 & i4) != 0 ? "" : str9, (65536 & i4) != 0 ? "" : str10, (131072 & i4) == 0 ? str11 : "", (262144 & i4) != 0 ? 1 : i3, (i4 & 524288) != 0 ? 0L : j4);
    }
}
