package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class CardConsumption {

    @C09CT("act")
    public final Set<String> actSet;

    @C09CT("doc_rank")
    public final String docRank;

    @C09CT("inner_play_time")
    public final Long innerPlayTime;

    @C09CT("list_item_id")
    public final String listItemId;

    @C09CT("music_play_time")
    public final Long musicPlayTime;

    @C09CT("outer_play_time")
    public final Long outerPlayTime;

    @C09CT("product_id")
    public final Set<String> productIdList;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("token_type")
    public final String tokenType;

    public CardConsumption() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public CardConsumption(String str, String str2, String str3, Long l, Long l2, Set<String> set, String str4, Long l3, Long l4, Set<String> set2) {
        this.searchResultId = str;
        this.listItemId = str2;
        this.tokenType = str3;
        this.innerPlayTime = l;
        this.outerPlayTime = l2;
        this.productIdList = set;
        this.docRank = str4;
        this.musicPlayTime = l3;
        this.timestamp = l4;
        this.actSet = set2;
    }

    public CardConsumption(String str, String str2, String str3, Long l, Long l2, Set set, String str4, Long l3, Long l4, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : set, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l3, (i & 256) == 0 ? l4 : null, (i & 512) != 0 ? C08CX.INSTANCE : set2);
    }

    public static CardConsumption LIZ(CardConsumption cardConsumption, String str, String str2, String str3, Long l, Long l2, Set set, String str4, Long l3, Long l4, Set set2, int i) {
        Set set3 = set2;
        Long l5 = l4;
        Long l6 = l3;
        String str5 = str4;
        Set set4 = set;
        Long l7 = l2;
        Long l8 = l;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = cardConsumption.searchResultId;
        }
        if ((i & 2) != 0) {
            str7 = cardConsumption.listItemId;
        }
        if ((i & 4) != 0) {
            str6 = cardConsumption.tokenType;
        }
        if ((i & 8) != 0) {
            l8 = cardConsumption.innerPlayTime;
        }
        if ((i & 16) != 0) {
            l7 = cardConsumption.outerPlayTime;
        }
        if ((i & 32) != 0) {
            set4 = cardConsumption.productIdList;
        }
        if ((i & 64) != 0) {
            str5 = cardConsumption.docRank;
        }
        if ((i & 128) != 0) {
            l6 = cardConsumption.musicPlayTime;
        }
        if ((i & 256) != 0) {
            l5 = cardConsumption.timestamp;
        }
        if ((i & 512) != 0) {
            set3 = cardConsumption.actSet;
        }
        return new CardConsumption(str8, str7, str6, l8, l7, set4, str5, l6, l5, set3);
    }
}
