package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C13BV;
import X.C20227614Cs;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AIBotInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("bg_basic_color")
    public final String bgBasicColor;

    @C09CT("bg_url")
    public final String bgUrl;

    @C09CT("bg_urls")
    public final List<String> bgUrls;

    @C09CT("bot_avatar")
    public String botAvatar;

    @C09CT("bot_id")
    public long botId;

    @C09CT("bot_mode")
    public final int botMode;

    @C09CT("bot_name")
    public String botName;

    @C09CT("bot_source")
    public int botSource;

    @C09CT("bot_type")
    public final int botType;

    @C09CT("bubble_color")
    public final String bubbleColor;

    @C09CT("creator")
    public final String creator;

    @C09CT("disable_sug")
    public boolean disableSug;

    @C09CT("extra_info")
    public Map<String, ? extends Object> extraInfo;

    @C09CT("hint_content_color")
    public final String hintContentColor;

    @C09CT("is_play")
    public final boolean isPlay;

    @C09CT("new_category_labels")
    public final List<String> newCategoryLabels;

    @C09CT("disable_history")
    public final boolean noHistory;

    @C09CT("share_hashtag")
    public final List<String> shareHashtag;

    @C09CT("share_text")
    public final String shareText;

    @C09CT("share_title")
    public final String shareTitle;

    @C09CT("start_msg")
    public String startMsg;

    @C09CT("start_sug")
    public List<String> startSug;

    @C09CT("bot_new_domain")
    public final boolean useIndependentDomain;

    public AIBotInfo() {
        this(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null);
    }

    public String toString() {
        return "AIBotInfo(botId=" + this.botId + ", botName=" + this.botName + ", botAvatar=" + this.botAvatar + ", botSource=" + this.botSource + ", botType=" + this.botType + ", botMode=" + this.botMode + ", startMsg=" + this.startMsg + ", startSug=" + this.startSug + ", disableSug=" + this.disableSug + ", noHistory=" + this.noHistory + ", useIndependentDomain=" + this.useIndependentDomain + ", extraInfo=" + this.extraInfo + ", creator=" + this.creator + ", bgUrls=" + this.bgUrls + ", bgUrl=" + this.bgUrl + ", bubbleColor=" + this.bubbleColor + ", hintContentColor=" + this.hintContentColor + ", newCategoryLabels=" + this.newCategoryLabels + ", isPlay=" + this.isPlay + ", bgBasicColor=" + this.bgBasicColor + ", shareTitle=" + this.shareTitle + ", shareText=" + this.shareText + ", shareHashtag=" + this.shareHashtag + ')';
    }

    public final boolean isCsiBot() {
        return C20227614Cs.LIZ(this) && this.botId == 88872960259L;
    }

    public final boolean isNovelBot() {
        List<String> list;
        return C20227614Cs.LIZ(this) && (list = this.newCategoryLabels) != null && list.contains("Novel");
    }

    public final boolean isPlay() {
        return this.isPlay;
    }

    public final void setBotAvatar(String str) {
        this.botAvatar = str;
    }

    public final void setBotId(long j) {
        this.botId = j;
    }

    public final void setBotName(String str) {
        this.botName = str;
    }

    public final void setBotSource(int i) {
        this.botSource = i;
    }

    public final void setDisableSug(boolean z) {
        this.disableSug = z;
    }

    public final void setExtraInfo(Map<String, ? extends Object> map) {
        this.extraInfo = map;
    }

    public final void setStartMsg(String str) {
        this.startMsg = str;
    }

    public final void setStartSug(List<String> list) {
        this.startSug = list;
    }

    public AIBotInfo(long j, String str, String str2, int i, int i2, int i3, String str3, List<String> list, boolean z, boolean z2, boolean z3, Map<String, ? extends Object> map, String str4, List<String> list2, String str5, String str6, String str7, List<String> list3, boolean z4, String str8, String str9, String str10, List<String> list4) {
        this.botId = j;
        this.botName = str;
        this.botAvatar = str2;
        this.botSource = i;
        this.botType = i2;
        this.botMode = i3;
        this.startMsg = str3;
        this.startSug = list;
        this.disableSug = z;
        this.noHistory = z2;
        this.useIndependentDomain = z3;
        this.extraInfo = map;
        this.creator = str4;
        this.bgUrls = list2;
        this.bgUrl = str5;
        this.bubbleColor = str6;
        this.hintContentColor = str7;
        this.newCategoryLabels = list3;
        this.isPlay = z4;
        this.bgBasicColor = str8;
        this.shareTitle = str9;
        this.shareText = str10;
        this.shareHashtag = list4;
    }

    public AIBotInfo(long j, String str, String str2, int i, int i2, int i3, String str3, List list, boolean z, boolean z2, boolean z3, Map map, String str4, List list2, String str5, String str6, String str7, List list3, boolean z4, String str8, String str9, String str10, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 1 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? C13BV.INSTANCE : list, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? false : z2, (i4 & 1024) != 0 ? false : z3, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : map, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str4, (i4 & 8192) != 0 ? C13BV.INSTANCE : list2, (i4 & 16384) != 0 ? "" : str5, (32768 & i4) != 0 ? "" : str6, (65536 & i4) != 0 ? "" : str7, (131072 & i4) != 0 ? null : list3, (262144 & i4) != 0 ? false : z4, (524288 & i4) == 0 ? str8 : "", (1048576 & i4) != 0 ? null : str9, (2097152 & i4) != 0 ? null : str10, (i4 & 4194304) == 0 ? list4 : null);
    }
}
