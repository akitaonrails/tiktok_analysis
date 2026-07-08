package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.C09CT;
import X.C0PSG;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRequestParam {
    public final C0PSG LIZ;
    public final SearchResultParam LIZIZ;
    public final Map<String, String> LIZJ;
    public int LIZLLL;

    @C09CT("attach_products")
    public final String attachProducts;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("search_channel")
    public final String channel;

    @C09CT("cmpl_enc")
    public final String cmplEnc;

    @C09CT("context")
    public final Context context;

    @C09CT("query_correct_type")
    public final int correctType;

    @C09CT("count")
    public final int count;

    @C09CT("current_location_status")
    public final Integer currentLocationStatus;

    @C09CT("offset")
    public final long cursor;

    @C09CT("encrypt_location")
    public final String encryptLocation;

    @C09CT("end_to_end_search_session_id")
    public final String endToEndSearchSessionId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("filter_by")
    public final int filterBy;

    @C09CT("filter_item_ids")
    public final String filterItemIds;

    @C09CT("hot_search")
    public final int hotSearch;

    @C09CT("is_filter_search")
    public final int isFilterSearch;

    @C09CT("is_non_personalized_search")
    public Integer isNonPersonalizedSearch;

    @C09CT("is_rich_sug")
    public final String isRichSug;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("last_search_id")
    public String lastSearchId;

    @C09CT("personal_context_info")
    public final String personalContextInfo;

    @C09CT("poi_card_id_list")
    public final String poiCardIdList;

    @C09CT("query_language")
    public final String queryLanguage;

    @C09CT("refresh_type")
    public final int refreshType;

    @C09CT("live_id_list")
    public final String roomIdList;

    @C09CT("screen_reader_enable")
    public final boolean screenReaderEnable;

    @C09CT("search_channel")
    public final String searchChannel;

    @C09CT("search_context")
    public final String searchContext;

    @C09CT("search_id")
    public String searchId;

    @C09CT("search_session_id")
    public final Long searchSessionId;

    @C09CT("search_source")
    public final String searchSource;

    @C09CT("show_results_source")
    public final String showResultsSource;

    @C09CT("sort_type")
    public final int sortType;

    @C09CT("source")
    public final String source;

    @C09CT("sug_creator_id")
    public final String sugCreatorId;

    @C09CT("sug_generate_type")
    public final String sugGenerateType;

    @C09CT("sug_query_state")
    public final String sugQueryState;

    @C09CT("sug_tag_text")
    public final String sugTagText;

    @C09CT("sug_type")
    public final String sugType;

    @C09CT("sug_user_id")
    public final String sugUserId;

    @C09CT("traffic_source_list")
    public final String trafficSourceList;

    @C09CT("translate_language_code")
    public final String translateLanguageCode;

    public static SearchRequestParam LIZ(SearchRequestParam searchRequestParam, String str, String str2, Integer num, Map map, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        int i5;
        String str5;
        String str6;
        long j;
        int i6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Context context;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Long l;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        Integer num2;
        int i7;
        int i8;
        int i9;
        boolean z;
        C0PSG c0psg;
        Map map2 = map;
        String str30 = str;
        Integer num3 = num;
        String str31 = str2;
        SearchResultParam searchResultParam = null;
        if ((i & 1) != 0) {
            str3 = searchRequestParam.keyword;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            i3 = searchRequestParam.refreshType;
        } else {
            i3 = 0;
        }
        if ((i & 4) != 0) {
            str30 = searchRequestParam.searchSource;
        }
        if ((i & 8) != 0) {
            str4 = searchRequestParam.source;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            i4 = searchRequestParam.hotSearch;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            i5 = searchRequestParam.correctType;
        } else {
            i5 = 0;
        }
        if ((i & 64) != 0) {
            str5 = searchRequestParam.searchId;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = searchRequestParam.lastSearchId;
        } else {
            str6 = null;
        }
        if ((i & 256) != 0) {
            j = searchRequestParam.cursor;
        } else {
            j = 0;
        }
        if ((i & 512) != 0) {
            i6 = searchRequestParam.count;
        } else {
            i6 = 0;
        }
        if ((i & 1024) != 0) {
            str7 = searchRequestParam.enterFrom;
        } else {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = searchRequestParam.channel;
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = searchRequestParam.showResultsSource;
        } else {
            str9 = null;
        }
        if ((i & 8192) != 0) {
            str10 = searchRequestParam.sugUserId;
        } else {
            str10 = null;
        }
        if ((i & 16384) != 0) {
            str11 = searchRequestParam.isRichSug;
        } else {
            str11 = null;
        }
        if ((32768 & i) != 0) {
            str12 = searchRequestParam.roomIdList;
        } else {
            str12 = null;
        }
        if ((65536 & i) != 0) {
            str31 = searchRequestParam.searchContext;
        }
        if ((131072 & i) != 0) {
            context = searchRequestParam.context;
        } else {
            context = null;
        }
        if ((262144 & i) != 0) {
            str13 = searchRequestParam.searchChannel;
        } else {
            str13 = null;
        }
        if ((524288 & i) != 0) {
            str14 = searchRequestParam.sugTagText;
        } else {
            str14 = null;
        }
        if ((1048576 & i) != 0) {
            str15 = searchRequestParam.sugType;
        } else {
            str15 = null;
        }
        if ((2097152 & i) != 0) {
            str16 = searchRequestParam.sugQueryState;
        } else {
            str16 = null;
        }
        if ((4194304 & i) != 0) {
            str17 = searchRequestParam.sugCreatorId;
        } else {
            str17 = null;
        }
        if ((8388608 & i) != 0) {
            str18 = searchRequestParam.attachProducts;
        } else {
            str18 = null;
        }
        if ((16777216 & i) != 0) {
            str19 = searchRequestParam.trafficSourceList;
        } else {
            str19 = null;
        }
        if ((33554432 & i) != 0) {
            str20 = searchRequestParam.personalContextInfo;
        } else {
            str20 = null;
        }
        if ((67108864 & i) != 0) {
            str21 = searchRequestParam.cmplEnc;
        } else {
            str21 = null;
        }
        if ((134217728 & i) != 0) {
            num3 = searchRequestParam.isNonPersonalizedSearch;
        }
        if ((268435456 & i) != 0) {
            str22 = searchRequestParam.sugGenerateType;
        } else {
            str22 = null;
        }
        if ((536870912 & i) != 0) {
            str23 = searchRequestParam.queryLanguage;
        } else {
            str23 = null;
        }
        if ((1073741824 & i) != 0) {
            l = searchRequestParam.searchSessionId;
        } else {
            l = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str24 = searchRequestParam.filterItemIds;
        } else {
            str24 = null;
        }
        if ((i2 & 1) != 0) {
            str25 = searchRequestParam.endToEndSearchSessionId;
        } else {
            str25 = null;
        }
        if ((i2 & 2) != 0) {
            str26 = searchRequestParam.translateLanguageCode;
        } else {
            str26 = null;
        }
        if ((i2 & 4) != 0) {
            str27 = searchRequestParam.poiCardIdList;
        } else {
            str27 = null;
        }
        if ((i2 & 8) != 0) {
            str28 = searchRequestParam.bcmChain;
        } else {
            str28 = null;
        }
        if ((i2 & 16) != 0) {
            str29 = searchRequestParam.encryptLocation;
        } else {
            str29 = null;
        }
        if ((i2 & 32) != 0) {
            num2 = searchRequestParam.currentLocationStatus;
        } else {
            num2 = null;
        }
        if ((i2 & 64) != 0) {
            i7 = searchRequestParam.isFilterSearch;
        } else {
            i7 = 0;
        }
        if ((i2 & 128) != 0) {
            i8 = searchRequestParam.filterBy;
        } else {
            i8 = 0;
        }
        if ((i2 & 256) != 0) {
            i9 = searchRequestParam.sortType;
        } else {
            i9 = 0;
        }
        if ((i2 & 512) != 0) {
            z = searchRequestParam.screenReaderEnable;
        } else {
            z = false;
        }
        if ((i2 & 1024) != 0) {
            c0psg = searchRequestParam.LIZ;
        } else {
            c0psg = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            searchResultParam = searchRequestParam.LIZIZ;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map2 = searchRequestParam.LIZJ;
        }
        searchRequestParam.getClass();
        return new SearchRequestParam(str3, i3, str30, str4, i4, i5, str5, str6, j, i6, str7, str8, str9, str10, str11, str12, str31, context, str13, str14, str15, str16, str17, str18, str19, str20, str21, num3, str22, str23, l, str24, str25, str26, str27, str28, str29, num2, i7, i8, i9, z, c0psg, searchResultParam, map2);
    }

    public SearchRequestParam(String str, int i, String str2, String str3, int i2, int i3, String str4, String str5, long j, int i4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Context context, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Integer num, String str22, String str23, Long l, String str24, String str25, String str26, String str27, String str28, String str29, Integer num2, int i5, int i6, int i7, boolean z, C0PSG c0psg, SearchResultParam searchResultParam, Map<String, String> map) {
        this.keyword = str;
        this.refreshType = i;
        this.searchSource = str2;
        this.source = str3;
        this.hotSearch = i2;
        this.correctType = i3;
        this.searchId = str4;
        this.lastSearchId = str5;
        this.cursor = j;
        this.count = i4;
        this.enterFrom = str6;
        this.channel = str7;
        this.showResultsSource = str8;
        this.sugUserId = str9;
        this.isRichSug = str10;
        this.roomIdList = str11;
        this.searchContext = str12;
        this.context = context;
        this.searchChannel = str13;
        this.sugTagText = str14;
        this.sugType = str15;
        this.sugQueryState = str16;
        this.sugCreatorId = str17;
        this.attachProducts = str18;
        this.trafficSourceList = str19;
        this.personalContextInfo = str20;
        this.cmplEnc = str21;
        this.isNonPersonalizedSearch = num;
        this.sugGenerateType = str22;
        this.queryLanguage = str23;
        this.searchSessionId = l;
        this.filterItemIds = str24;
        this.endToEndSearchSessionId = str25;
        this.translateLanguageCode = str26;
        this.poiCardIdList = str27;
        this.bcmChain = str28;
        this.encryptLocation = str29;
        this.currentLocationStatus = num2;
        this.isFilterSearch = i5;
        this.filterBy = i6;
        this.sortType = i7;
        this.screenReaderEnable = z;
        this.LIZ = c0psg;
        this.LIZIZ = searchResultParam;
        this.LIZJ = map;
    }
}
