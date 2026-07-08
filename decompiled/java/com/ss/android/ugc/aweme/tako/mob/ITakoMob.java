package com.ss.android.ugc.aweme.tako.mob;

import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface ITakoMob {
    void mobMediaCardClick(Map<String, String> map);

    void mobMediaCardShow(Map<String, String> map);

    void mobTikbotEntranceClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, ? extends Object> map, String str14, String str15, String str16, String str17, SuggestionWordInfo suggestionWordInfo, FeedEnterAwemeInfo feedEnterAwemeInfo, String str18, String str19, String str20, Integer num, String str21, String str22, String str23);

    void mobTikbotEntranceMisTouch(String str, String str2, String str3, long j);

    void mobTikbotEntranceShow(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SuggestionWordInfo suggestionWordInfo, FeedEnterAwemeInfo feedEnterAwemeInfo, String str13, String str14, String str15, Integer num, String str16, String str17, Map<String, ? extends Object> map, boolean z2);

    void mobTikbotEntranceTouchDown(String str, String str2);

    void mobTikbotInfoSeeMoreClick(String str, String str2, String str3, String str4);

    void mobTikbotQuickInteractionClick(Map<String, String> map, Map<String, String> map2, Long l);

    void mobTikbotQuickInteractionShow(Map<String, String> map, Map<String, String> map2);
}
