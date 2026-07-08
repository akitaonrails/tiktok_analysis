package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoBotInfo {

    @C09CT("bg_basic_color")
    public final String bgBasicColor;

    @C09CT("bg_url")
    public final String bgUrl;

    @C09CT("bg_urls")
    public final List<String> bgUrls;

    @C09CT("bot_avatar")
    public final String botAvatar;

    @C09CT("bot_desc")
    public final String botDescripton;

    @C09CT("bot_emoji")
    public final String botEmoji;

    @C09CT("bot_id")
    public final long botId;

    @C09CT("bot_mode")
    public final int botMode;

    @C09CT("bot_name")
    public final String botName;

    @C09CT("bot_source")
    public final int botSource;

    @C09CT("bot_type")
    public final int botType;

    @C09CT("bubble_color")
    public final String bubbleColor;

    @C09CT("cover_img_urls")
    public final List<String> coverImgUrls;

    @C09CT("creator")
    public final String creator;

    @C09CT("disable_history")
    public final boolean disableHistory;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("hint_content_color")
    public final String hintContentColor;

    @C09CT("interaction_info")
    public final BotInteractionInfo interactionInfo;

    @C09CT("is_play")
    public final boolean isPlay;

    @C09CT("new_category_labels")
    public final List<String> newCategoryLabels;

    @C09CT("opening_sugs")
    public final List<String> openingSugs;

    @C09CT("push_button_desc")
    public final String pushButtonDesc;

    @C09CT("share_info")
    public final BotShareInfo shareInfo;

    @C09CT("support_image")
    public final boolean supportImage;

    @C09CT("tag_list")
    public final List<BotTagInfo> tagList;

    @C09CT("bot_new_domain")
    public final boolean useIndependentDomain;

    public TakoBotInfo() {
        this(0L, 0, null, null, 0, 0, null, null, false, false, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 67108863, null);
    }

    public TakoBotInfo(long j, int i, String str, String str2, int i2, int i3, String str3, String str4, boolean z, boolean z2, Map<String, String> map, boolean z3, String str5, List<String> list, String str6, String str7, String str8, List<String> list2, boolean z4, List<String> list3, List<String> list4, String str9, BotInteractionInfo botInteractionInfo, String str10, List<BotTagInfo> list5, BotShareInfo botShareInfo) {
        this.botId = j;
        this.botSource = i;
        this.botName = str;
        this.botDescripton = str2;
        this.botType = i2;
        this.botMode = i3;
        this.botEmoji = str3;
        this.botAvatar = str4;
        this.disableHistory = z;
        this.useIndependentDomain = z2;
        this.extra = map;
        this.supportImage = z3;
        this.creator = str5;
        this.bgUrls = list;
        this.bgUrl = str6;
        this.bubbleColor = str7;
        this.hintContentColor = str8;
        this.newCategoryLabels = list2;
        this.isPlay = z4;
        this.openingSugs = list3;
        this.coverImgUrls = list4;
        this.bgBasicColor = str9;
        this.interactionInfo = botInteractionInfo;
        this.pushButtonDesc = str10;
        this.tagList = list5;
        this.shareInfo = botShareInfo;
    }

    public TakoBotInfo(long j, int i, String str, String str2, int i2, int i3, String str3, String str4, boolean z, boolean z2, Map map, boolean z3, String str5, List list, String str6, String str7, String str8, List list2, boolean z4, List list3, List list4, String str9, BotInteractionInfo botInteractionInfo, String str10, List list5, BotShareInfo botShareInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1L : j, (i4 & 2) != 0 ? 1 : i, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? false : z2, (i4 & 1024) != 0 ? C2097608Jq.LJ() : map, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z3, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str5, (i4 & 8192) != 0 ? C13BV.INSTANCE : list, (i4 & 16384) != 0 ? "" : str6, (32768 & i4) != 0 ? "" : str7, (65536 & i4) != 0 ? "" : str8, (131072 & i4) != 0 ? null : list2, (262144 & i4) != 0 ? false : z4, (524288 & i4) != 0 ? C13BV.INSTANCE : list3, (1048576 & i4) != 0 ? C13BV.INSTANCE : list4, (2097152 & i4) == 0 ? str9 : "", (4194304 & i4) != 0 ? new BotInteractionInfo(null, "") : botInteractionInfo, (8388608 & i4) != 0 ? null : str10, (16777216 & i4) != 0 ? C13BV.INSTANCE : list5, (i4 & 33554432) == 0 ? botShareInfo : null);
    }
}
