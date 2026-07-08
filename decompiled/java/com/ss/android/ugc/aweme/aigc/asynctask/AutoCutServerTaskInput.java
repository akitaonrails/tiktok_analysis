package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutServerTaskInput extends C09JG {

    @C09CT("ai_creation_id")
    public String aiCreationId;

    @C09CT("asset_infos_json")
    public final String assetInfosJson;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("clip_id")
    public final String clipId;

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("extra")
    public String extra;

    @C09CT("pick_id")
    public final String pickId;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("source")
    public final Source source;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("theme_str")
    public final String themeStr;

    @C09CT("time_out_second")
    public Long timeOutSecond;

    @C09CT("total_duration_ms")
    public final long totalDurationMs;

    @C09CT("vid")
    public final String vid;

    @C09CT("zip_url")
    public final String zipUrl;

    public AutoCutServerTaskInput() {
        this(null, "", "", "", "", "", "", "", null, null, "", "", "", "", "", 0L, "", null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutServerTaskInput)) {
            return false;
        }
        AutoCutServerTaskInput autoCutServerTaskInput = (AutoCutServerTaskInput) obj;
        return this.source == autoCutServerTaskInput.source && Intrinsics.LJFF(this.assetInfosJson, autoCutServerTaskInput.assetInfosJson) && Intrinsics.LJFF(this.vid, autoCutServerTaskInput.vid) && Intrinsics.LJFF(this.creationId, autoCutServerTaskInput.creationId) && Intrinsics.LJFF(this.businessScene, autoCutServerTaskInput.businessScene) && Intrinsics.LJFF(this.taskType, autoCutServerTaskInput.taskType) && Intrinsics.LJFF(this.promptText, autoCutServerTaskInput.promptText) && Intrinsics.LJFF(this.extra, autoCutServerTaskInput.extra) && Intrinsics.LJFF(this.timeOutSecond, autoCutServerTaskInput.timeOutSecond) && Intrinsics.LJFF(this.commonParentTaskInput, autoCutServerTaskInput.commonParentTaskInput) && Intrinsics.LJFF(this.aiCreationId, autoCutServerTaskInput.aiCreationId) && Intrinsics.LJFF(this.zipUrl, autoCutServerTaskInput.zipUrl) && Intrinsics.LJFF(this.contentType, autoCutServerTaskInput.contentType) && Intrinsics.LJFF(this.contentSource, autoCutServerTaskInput.contentSource) && Intrinsics.LJFF(this.shootWay, autoCutServerTaskInput.shootWay) && this.totalDurationMs == autoCutServerTaskInput.totalDurationMs && Intrinsics.LJFF(this.themeStr, autoCutServerTaskInput.themeStr) && Intrinsics.LJFF(this.clipId, autoCutServerTaskInput.clipId) && Intrinsics.LJFF(this.pickId, autoCutServerTaskInput.pickId);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((((((((((((source == null ? 0 : source.hashCode()) * 31) + this.assetInfosJson.hashCode()) * 31) + this.vid.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.businessScene.hashCode()) * 31) + this.taskType.hashCode()) * 31) + this.promptText.hashCode()) * 31) + this.extra.hashCode()) * 31;
        Long l = this.timeOutSecond;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        int iHashCode3 = (((((((((((((((iHashCode2 + (commonParentTaskInput == null ? 0 : commonParentTaskInput.hashCode())) * 31) + this.aiCreationId.hashCode()) * 31) + this.zipUrl.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.contentSource.hashCode()) * 31) + this.shootWay.hashCode()) * 31) + C786410Ut5.Y2(this.totalDurationMs)) * 31) + this.themeStr.hashCode()) * 31;
        String str = this.clipId;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.pickId.hashCode();
    }

    public final String toString() {
        return "AutoCutServerTaskInput(source=" + this.source + ", assetInfosJson=" + this.assetInfosJson + ", vid=" + this.vid + ", creationId=" + this.creationId + ", businessScene=" + this.businessScene + ", taskType=" + this.taskType + ", promptText=" + this.promptText + ", extra=" + this.extra + ", timeOutSecond=" + this.timeOutSecond + ", commonParentTaskInput=" + this.commonParentTaskInput + ", aiCreationId=" + this.aiCreationId + ", zipUrl=" + this.zipUrl + ", contentType=" + this.contentType + ", contentSource=" + this.contentSource + ", shootWay=" + this.shootWay + ", totalDurationMs=" + this.totalDurationMs + ", themeStr=" + this.themeStr + ", clipId=" + this.clipId + ", pickId=" + this.pickId + ')';
    }

    public AutoCutServerTaskInput(Source source, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, CommonParentTaskInput commonParentTaskInput, String str8, String str9, String str10, String str11, String str12, long j, String str13, String str14, String str15) {
        this.source = source;
        this.assetInfosJson = str;
        this.vid = str2;
        this.creationId = str3;
        this.businessScene = str4;
        this.taskType = str5;
        this.promptText = str6;
        this.extra = str7;
        this.timeOutSecond = l;
        this.commonParentTaskInput = commonParentTaskInput;
        this.aiCreationId = str8;
        this.zipUrl = str9;
        this.contentType = str10;
        this.contentSource = str11;
        this.shootWay = str12;
        this.totalDurationMs = j;
        this.themeStr = str13;
        this.clipId = str14;
        this.pickId = str15;
    }
}
