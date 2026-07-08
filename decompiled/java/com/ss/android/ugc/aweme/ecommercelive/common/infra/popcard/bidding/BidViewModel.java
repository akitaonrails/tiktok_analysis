package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.bidding;

import X.C01GW;
import X.C1741890vQh;
import X.C1766270w41;
import X.C452501pT;
import X.C948503nH;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class BidViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public String LL = "";
    public final List<Object> LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final C01GW LLILZIL;

    public BidViewModel() {
        Boolean bool = Boolean.FALSE;
        C948503nH.LJIIL(bool);
        C948503nH.LJIIL(bool);
        this.LLILLJJLI = new ArrayList();
        new LinkedHashMap();
        this.LLILLL = -1L;
        this.LLILZ = -1L;
        this.LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(55));
    }

    public final Map<String, String> vQ2(Boolean bool) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", String.valueOf(this.LLILZ));
        linkedHashMap.put("room_id", String.valueOf(this.LLILLL));
        linkedHashMap.put("product_id", "null");
        linkedHashMap.put("live_status", "during_live");
        linkedHashMap.put("auction_id", "null");
        linkedHashMap.put("entrance_form", "live_popup_card");
        String str3 = "bid";
        linkedHashMap.put("source_button", "bid");
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "live_auction_set_max_bid";
        } else {
            str = "live_auction_set_bid";
        }
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("previous_page", "live");
        linkedHashMap.put("source_page_type", "live");
        linkedHashMap.put("sku_id", "");
        linkedHashMap.put("source_content_id", String.valueOf(this.LLILLL));
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = "max_bid";
            }
            linkedHashMap.put("bid_type", str3);
            if (!bool.booleanValue()) {
                str2 = "";
            } else {
                str2 = this.LL;
            }
            linkedHashMap.put("bid_price", str2);
        }
        linkedHashMap.put("auction_status", "");
        linkedHashMap.put("is_single_sku", "1");
        linkedHashMap.put("bid_starting_price", "null");
        C1766270w41.LIZ.getClass();
        linkedHashMap.put("entrance_info", C1741890vQh.LJIIIIZZ(C1766270w41.LIZ(C1766270w41.LIZIZ, null)));
        linkedHashMap.put("rd_auction_status", "null");
        return linkedHashMap;
    }
}
