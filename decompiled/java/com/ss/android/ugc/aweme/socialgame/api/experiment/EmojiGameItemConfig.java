package com.ss.android.ugc.aweme.socialgame.api.experiment;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameItemConfig {

    @C09CT("channel")
    public final String channel;

    @C09CT("config")
    public final Map<String, String> config;

    @C09CT("custom_query_params")
    public final Map<String, String> customQueryParams;

    @C09CT("name")
    public final String gameNameKey;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("is_fully_launch")
    public final int isFullyLaunch;

    @C09CT("match_list")
    public final List<EmojiGameMatchStruct> matchList;

    @C09CT("path")
    public final String path;

    public EmojiGameItemConfig() {
        this(null, null, null, null, null, 0, null, null, 255, null);
    }

    public EmojiGameItemConfig(String str, List<EmojiGameMatchStruct> list, Map<String, String> map, Integer num, Map<String, String> map2, int i, String str2, String str3) {
        this.path = str;
        this.matchList = list;
        this.config = map;
        this.id = num;
        this.customQueryParams = map2;
        this.isFullyLaunch = i;
        this.gameNameKey = str2;
        this.channel = str3;
    }

    public EmojiGameItemConfig(String str, List list, Map map, Integer num, Map map2, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : map2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? "" : str2, (i2 & 128) == 0 ? str3 : null);
    }
}
