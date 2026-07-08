package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C12824050c;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMixFeed {
    public transient Map<String, ? extends Object> LIZ;
    public transient String LIZIZ;

    @C09CT("bot_info")
    public TakoBotItem bot;

    @C09CT("bot_market_info")
    public BotMarketInfo botMarketInfo;

    @C09CT("cache_sug")
    public TakoSug cacheSug;

    @C09CT("card_type")
    public int cardType;

    @C09CT("chat_intent")
    public String chatIntent;

    @C09CT("client_ext")
    public TakoClientExt clientExt;

    @C09CT("disclaimer")
    public TakoDisclaimerInfo disclaimer;

    @C09CT("enhanced_item_info")
    public TakoEnhancedItemInfo enhancedVideoItemInfo;

    @C09CT("ext")
    public TakoPassExt ext;

    @C09CT("from_video_sug")
    public boolean fromVideoSug;

    @C09CT("gid")
    public String gid;

    @C09CT("hint")
    public String hint;

    @C09CT("hint_in_text")
    public String hintInText;

    @C09CT("pics")
    public List<BaseImage> images;

    @C09CT("input_type")
    public int inputType;

    @C09CT("interaction_status")
    public List<TakoInteractionConfig> interactionStatus;

    @C09CT("links")
    public List<TakoLinkItem> linkList;

    @C09CT("dynamic_patch")
    public TakoLynx lynxData;

    @C09CT("memory")
    public TakoMemory memory;

    @C09CT("msg_ext")
    public Map<String, String> msgExt;

    @C09CT("multi_modal_info")
    public TakoMultiModalInfo multiModalInfo;

    @C09CT("nimble_config")
    public TakoNimbleConfig nimbleConfig;

    @C09CT("nimble_data_str")
    public String nimbleDataStr;

    @C09CT("placeholder_sources")
    public Map<String, TakoPlaceholderSource> placeholderSources;

    @C09CT("process_info")
    public List<TakoProcessInfo> processInfo;

    @C09CT("goods_info")
    public TakoProductInfo products;

    @C09CT("search_info")
    public TakoSearchInfo searchInfo;

    @C09CT("selects")
    public List<TakoNovelChoiceSelect> selects;

    @C09CT("sources")
    public List<TakoSourceItem> sources;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("style")
    public List<ConvertStyleItem> style;

    @C09CT("sug")
    public TakoSug sug;

    @C09CT("text")
    public String text;

    @C09CT("text_hint")
    public String textHint;

    @C09CT("think_content")
    public String thinkContent;

    @C09CT("think_cost_s")
    public Long thinkCostS;

    @C09CT("users")
    public List<TakoUserItem> userList;

    @C09CT("video_gen_card")
    public TakoVideoGenCard videoGenCard;

    @C09CT("items")
    public List<TakoVideoItem> videoList;

    @C09CT("videos")
    public List<BaseVideo> videos;

    public TakoMixFeed() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
    }

    public static TakoMixFeed LIZ(TakoMixFeed takoMixFeed, List list, TakoClientExt takoClientExt, int i) {
        String str;
        List<TakoVideoItem> list2;
        TakoEnhancedItemInfo takoEnhancedItemInfo;
        String str2;
        String str3;
        List<TakoLinkItem> list3;
        List<BaseImage> list4;
        List<BaseVideo> list5;
        List<ConvertStyleItem> list6;
        TakoProductInfo takoProductInfo;
        List<TakoSourceItem> list7;
        TakoBotItem takoBotItem;
        int i2;
        TakoPassExt takoPassExt;
        List<TakoUserItem> list8;
        int i3;
        List<TakoProcessInfo> list9;
        TakoSearchInfo takoSearchInfo;
        String str4;
        TakoLynx takoLynx;
        TakoSug takoSug;
        String str5;
        BotMarketInfo botMarketInfo;
        List<TakoNovelChoiceSelect> list10;
        Map<String, String> map;
        Map<String, TakoPlaceholderSource> map2;
        String str6;
        Long l;
        String str7;
        TakoClientExt takoClientExt2 = takoClientExt;
        List list11 = list;
        TakoSug takoSug2 = null;
        if ((i & 1) != 0) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            list2 = takoMixFeed.videoList;
        } else {
            list2 = null;
        }
        if ((i & 4) != 0) {
            takoEnhancedItemInfo = takoMixFeed.enhancedVideoItemInfo;
        } else {
            takoEnhancedItemInfo = null;
        }
        if ((i & 8) != 0) {
            str2 = takoMixFeed.hint;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = takoMixFeed.hintInText;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            list3 = takoMixFeed.linkList;
        } else {
            list3 = null;
        }
        if ((i & 64) != 0) {
            list4 = takoMixFeed.images;
        } else {
            list4 = null;
        }
        if ((i & 128) != 0) {
            list5 = takoMixFeed.videos;
        } else {
            list5 = null;
        }
        if ((i & 256) != 0) {
            list6 = takoMixFeed.style;
        } else {
            list6 = null;
        }
        if ((i & 512) != 0) {
            takoProductInfo = takoMixFeed.products;
        } else {
            takoProductInfo = null;
        }
        if ((i & 1024) != 0) {
            list7 = takoMixFeed.sources;
        } else {
            list7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            takoBotItem = takoMixFeed.bot;
        } else {
            takoBotItem = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i2 = takoMixFeed.cardType;
        } else {
            i2 = 0;
        }
        if ((i & 8192) != 0) {
            takoPassExt = takoMixFeed.ext;
        } else {
            takoPassExt = null;
        }
        if ((i & 16384) != 0) {
            list8 = takoMixFeed.userList;
        } else {
            list8 = null;
        }
        if ((32768 & i) != 0) {
            i3 = takoMixFeed.status;
        } else {
            i3 = 0;
        }
        if ((65536 & i) != 0) {
            list11 = takoMixFeed.interactionStatus;
        }
        if ((131072 & i) != 0) {
            list9 = takoMixFeed.processInfo;
        } else {
            list9 = null;
        }
        if ((262144 & i) != 0) {
            takoSearchInfo = takoMixFeed.searchInfo;
        } else {
            takoSearchInfo = null;
        }
        if ((524288 & i) != 0) {
            takoClientExt2 = takoMixFeed.clientExt;
        }
        if ((1048576 & i) != 0) {
            str4 = takoMixFeed.textHint;
        } else {
            str4 = null;
        }
        if ((2097152 & i) != 0) {
            takoLynx = takoMixFeed.lynxData;
        } else {
            takoLynx = null;
        }
        if ((4194304 & i) != 0) {
            takoSug = takoMixFeed.sug;
        } else {
            takoSug = null;
        }
        if ((8388608 & i) != 0) {
            str5 = takoMixFeed.gid;
        } else {
            str5 = null;
        }
        if ((16777216 & i) != 0) {
            botMarketInfo = takoMixFeed.botMarketInfo;
        } else {
            botMarketInfo = null;
        }
        if ((33554432 & i) != 0) {
            list10 = takoMixFeed.selects;
        } else {
            list10 = null;
        }
        if ((67108864 & i) != 0) {
            map = takoMixFeed.msgExt;
        } else {
            map = null;
        }
        if ((134217728 & i) != 0) {
            map2 = takoMixFeed.placeholderSources;
        } else {
            map2 = null;
        }
        if ((268435456 & i) != 0) {
            str6 = takoMixFeed.thinkContent;
        } else {
            str6 = null;
        }
        if ((536870912 & i) != 0) {
            l = takoMixFeed.thinkCostS;
        } else {
            l = null;
        }
        if ((1073741824 & i) != 0) {
            str7 = takoMixFeed.chatIntent;
        } else {
            str7 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            takoSug2 = takoMixFeed.cacheSug;
        }
        return new TakoMixFeed(str, list2, takoEnhancedItemInfo, str2, str3, list3, list4, list5, list6, takoProductInfo, list7, takoBotItem, i2, takoPassExt, list8, i3, list11, list9, takoSearchInfo, takoClientExt2, str4, takoLynx, takoSug, str5, botMarketInfo, list10, map, map2, str6, l, str7, takoSug2, takoMixFeed.LIZ, takoMixFeed.nimbleDataStr, takoMixFeed.nimbleConfig, takoMixFeed.disclaimer, takoMixFeed.memory, takoMixFeed.multiModalInfo, takoMixFeed.videoGenCard, takoMixFeed.fromVideoSug, takoMixFeed.inputType, takoMixFeed.LIZIZ);
    }

    public TakoMixFeed(String str, List<TakoVideoItem> list, TakoEnhancedItemInfo takoEnhancedItemInfo, String str2, String str3, List<TakoLinkItem> list2, List<BaseImage> list3, List<BaseVideo> list4, List<ConvertStyleItem> list5, TakoProductInfo takoProductInfo, List<TakoSourceItem> list6, TakoBotItem takoBotItem, int i, TakoPassExt takoPassExt, List<TakoUserItem> list7, int i2, List<TakoInteractionConfig> list8, List<TakoProcessInfo> list9, TakoSearchInfo takoSearchInfo, TakoClientExt takoClientExt, String str4, TakoLynx takoLynx, TakoSug takoSug, String str5, BotMarketInfo botMarketInfo, List<TakoNovelChoiceSelect> list10, Map<String, String> map, Map<String, TakoPlaceholderSource> map2, String str6, Long l, String str7, TakoSug takoSug2, Map<String, ? extends Object> map3, String str8, TakoNimbleConfig takoNimbleConfig, TakoDisclaimerInfo takoDisclaimerInfo, TakoMemory takoMemory, TakoMultiModalInfo takoMultiModalInfo, TakoVideoGenCard takoVideoGenCard, boolean z, int i3, String str9) {
        this.text = str;
        this.videoList = list;
        this.enhancedVideoItemInfo = takoEnhancedItemInfo;
        this.hint = str2;
        this.hintInText = str3;
        this.linkList = list2;
        this.images = list3;
        this.videos = list4;
        this.style = list5;
        this.products = takoProductInfo;
        this.sources = list6;
        this.bot = takoBotItem;
        this.cardType = i;
        this.ext = takoPassExt;
        this.userList = list7;
        this.status = i2;
        this.interactionStatus = list8;
        this.processInfo = list9;
        this.searchInfo = takoSearchInfo;
        this.clientExt = takoClientExt;
        this.textHint = str4;
        this.lynxData = takoLynx;
        this.sug = takoSug;
        this.gid = str5;
        this.botMarketInfo = botMarketInfo;
        this.selects = list10;
        this.msgExt = map;
        this.placeholderSources = map2;
        this.thinkContent = str6;
        this.thinkCostS = l;
        this.chatIntent = str7;
        this.cacheSug = takoSug2;
        this.LIZ = map3;
        this.nimbleDataStr = str8;
        this.nimbleConfig = takoNimbleConfig;
        this.disclaimer = takoDisclaimerInfo;
        this.memory = takoMemory;
        this.multiModalInfo = takoMultiModalInfo;
        this.videoGenCard = takoVideoGenCard;
        this.fromVideoSug = z;
        this.inputType = i3;
        this.LIZIZ = str9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLynx] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoDisclaimerInfo] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMemory] */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r50v0, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoGenCard] */
    public TakoMixFeed(String str, List list, TakoEnhancedItemInfo takoEnhancedItemInfo, String str2, String str3, List list2, List list3, List list4, List list5, TakoProductInfo takoProductInfo, List list6, TakoBotItem takoBotItem, int i, TakoPassExt takoPassExt, List list7, int i2, List list8, List list9, TakoSearchInfo takoSearchInfo, TakoClientExt takoClientExt, String str4, TakoLynx takoLynx, TakoSug takoSug, String str5, BotMarketInfo botMarketInfo, List list10, Map map, Map map2, String str6, Long l, String str7, TakoSug takoSug2, Map map3, String str8, TakoNimbleConfig takoNimbleConfig, TakoDisclaimerInfo takoDisclaimerInfo, TakoMemory takoMemory, TakoMultiModalInfo takoMultiModalInfo, TakoVideoGenCard takoVideoGenCard, boolean z, int i3, String str9, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        Map map4;
        String str10 = str9;
        int i6 = i3;
        TakoMultiModalInfo takoMultiModalInfo2 = takoMultiModalInfo;
        ?? r48 = takoMemory;
        ?? r47 = takoDisclaimerInfo;
        ?? r46 = takoNimbleConfig;
        ?? r45 = str8;
        Map map5 = map3;
        String str11 = str6;
        Map map6 = map2;
        Map map7 = map;
        ?? r36 = botMarketInfo;
        String str12 = str5;
        ?? r34 = takoSug;
        ?? r33 = takoLynx;
        String str13 = str4;
        TakoClientExt takoClientExt2 = takoClientExt;
        TakoSearchInfo takoSearchInfo2 = takoSearchInfo;
        List list11 = list8;
        int i7 = i2;
        List list12 = list9;
        List list13 = list7;
        List list14 = list6;
        ?? r43 = takoSug2;
        TakoPassExt takoPassExt2 = takoPassExt;
        TakoProductInfo takoProductInfo2 = takoProductInfo;
        List list15 = list5;
        ?? r41 = l;
        int i8 = i;
        List list16 = list4;
        List list17 = list3;
        List list18 = list2;
        String str14 = str3;
        boolean z2 = z;
        ?? r37 = list10;
        TakoBotItem takoBotItem2 = takoBotItem;
        String str15 = str2;
        TakoEnhancedItemInfo takoEnhancedItemInfo2 = takoEnhancedItemInfo;
        List list19 = list;
        String str16 = (i4 & 1) != 0 ? "" : str;
        list19 = (i4 & 2) != 0 ? C13BV.INSTANCE : list19;
        takoEnhancedItemInfo2 = (i4 & 4) != 0 ? new TakoEnhancedItemInfo(null, false, 3, null) : takoEnhancedItemInfo2;
        str15 = (i4 & 8) != 0 ? "" : str15;
        str14 = (i4 & 16) != 0 ? "" : str14;
        list18 = (i4 & 32) != 0 ? C13BV.INSTANCE : list18;
        list17 = (i4 & 64) != 0 ? C13BV.INSTANCE : list17;
        list16 = (i4 & 128) != 0 ? C13BV.INSTANCE : list16;
        list15 = (i4 & 256) != 0 ? C13BV.INSTANCE : list15;
        takoProductInfo2 = (i4 & 512) != 0 ? new TakoProductInfo(null, false, 3, null) : takoProductInfo2;
        list14 = (i4 & 1024) != 0 ? C13BV.INSTANCE : list14;
        takoBotItem2 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new TakoBotItem(null, "") : takoBotItem2;
        i8 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i8;
        takoPassExt2 = (i4 & 8192) != 0 ? new TakoPassExt(0, null, 0, "", "", C12824050c.LIZ(), 0, "", 0, "", 0, "", null, null, 0, null, "") : takoPassExt2;
        list13 = (i4 & 16384) != 0 ? C13BV.INSTANCE : list13;
        i7 = (32768 & i4) != 0 ? 0 : i7;
        list11 = (65536 & i4) != 0 ? C13BV.INSTANCE : list11;
        list12 = (131072 & i4) != 0 ? C13BV.INSTANCE : list12;
        if ((262144 & i4) != 0) {
            map4 = null;
            takoSearchInfo2 = new TakoSearchInfo("");
        } else {
            map4 = null;
        }
        this(str16, list19, takoEnhancedItemInfo2, str15, str14, list18, list17, list16, list15, takoProductInfo2, list14, takoBotItem2, i8, takoPassExt2, list13, i7, list11, list12, takoSearchInfo2, (524288 & i4) != 0 ? new TakoClientExt("", "", true, map4) : takoClientExt2, (1048576 & i4) != 0 ? "" : str13, (2097152 & i4) != 0 ? map4 : r33, (4194304 & i4) != 0 ? map4 : r34, (8388608 & i4) != 0 ? "" : str12, (16777216 & i4) != 0 ? map4 : r36, (33554432 & i4) != 0 ? map4 : r37, (67108864 & i4) != 0 ? new LinkedHashMap() : map7, (134217728 & i4) != 0 ? new LinkedHashMap() : map6, (268435456 & i4) != 0 ? "" : str11, (536870912 & i4) != 0 ? map4 : r41, (1073741824 & i4) == 0 ? str7 : "", (i4 & Integer.MIN_VALUE) != 0 ? map4 : r43, (i5 & 1) != 0 ? map4 : map5, (i5 & 2) != 0 ? map4 : r45, (i5 & 4) != 0 ? map4 : r46, (i5 & 8) != 0 ? map4 : r47, (i5 & 16) != 0 ? map4 : r48, (i5 & 32) != 0 ? new TakoMultiModalInfo(new TakoImageRatio(900, 1600), 1, 0L) : takoMultiModalInfo2, (i5 & 64) == 0 ? takoVideoGenCard : map4, (i5 & 128) != 0 ? false : z2, (i5 & 256) != 0 ? 0 : i6, (i5 & 512) != 0 ? null : str10);
    }
}
