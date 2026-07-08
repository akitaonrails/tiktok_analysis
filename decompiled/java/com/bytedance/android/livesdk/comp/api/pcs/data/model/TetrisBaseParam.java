package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisBaseParam {

    @C09CT("ad_id")
    public final String adId;

    @C09CT("adv_id")
    public final String advId;

    @C09CT("aid")
    public final String aid;

    @C09CT("app_id")
    public final Integer appId;

    @C09CT("app_name")
    public final String appName;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("behaviors")
    public final List<Object> behaviors;

    @C09CT("channel")
    public final String channel;

    @C09CT("component_id")
    public final String componentId;

    @C09CT("component_type")
    public final String componentType;

    @C09CT("conv_short_id")
    public final String convShortId;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("device_type")
    public final String deviceType;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("did")
    public final String f311did;

    @C09CT("event_type")
    public final String eventType;

    @C09CT("form_card_id")
    public final String formCardId;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("log_id")
    public final String logId;

    @C09CT("network_type")
    public final long networkType;

    @C09CT("os")
    public final String os;

    @C09CT("os_version")
    public final String osVersion;

    @C09CT("page_id")
    public final String pageId;

    @C09CT("pixel_code")
    public final String pixelCode;

    @C09CT("req_id")
    public final String reqId;

    @C09CT("rit")
    public final Long rit;

    @C09CT("scenario")
    public final String scenario;

    @C09CT("sec_user_id")
    public final String secUserId;

    @C09CT("server_msg_id")
    public final String serverMsgId;

    @C09CT("source_type")
    public final int sourceType;

    @C09CT("submission_scene")
    public final int submissionScene;

    @C09CT("ttclid")
    public final String ttclid;

    @C09CT("user_agent")
    public final String userAgent;

    @C09CT("user_id")
    public final String userId;

    @C09CT("user_inputs")
    public final List<Object> userInputs;

    @C09CT("validate_type")
    public final long validateType;

    @C09CT("version_code")
    public final String versionCode;

    public TetrisBaseParam() {
        this(null, 0L, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, -1, 31, null);
    }

    public TetrisBaseParam(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2, Long l, String str8, List<Object> list, String str9, String str10, String str11, List<Object> list2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, int i2, Integer num) {
        this.userId = str;
        this.validateType = j;
        this.versionCode = str2;
        this.adId = str3;
        this.appName = str4;
        this.devicePlatform = str5;
        this.os = str6;
        this.eventType = str7;
        this.networkType = j2;
        this.rit = l;
        this.appVersion = str8;
        this.behaviors = list;
        this.componentType = str9;
        this.deviceType = str10;
        this.pageId = str11;
        this.userInputs = list2;
        this.osVersion = str12;
        this.pixelCode = str13;
        this.reqId = str14;
        this.advId = str15;
        this.aid = str16;
        this.logExtra = str17;
        this.logId = str18;
        this.scenario = str19;
        this.channel = str20;
        this.f311did = str21;
        this.secUserId = str22;
        this.creativeId = str23;
        this.userAgent = str24;
        this.componentId = str25;
        this.ttclid = str26;
        this.formCardId = str27;
        this.serverMsgId = str28;
        this.convShortId = str29;
        this.sourceType = i;
        this.submissionScene = i2;
        this.appId = num;
    }

    public TetrisBaseParam(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, long j2, Long l, String str8, List list, String str9, String str10, String str11, List list2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, int i2, Integer num, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) == 0 ? j2 : 0L, (i3 & 512) != 0 ? null : l, (i3 & 1024) != 0 ? "" : str8, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str9, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? "" : str11, (32768 & i3) != 0 ? C13BV.INSTANCE : list2, (65536 & i3) != 0 ? "" : str12, (131072 & i3) != 0 ? "" : str13, (262144 & i3) != 0 ? "" : str14, (524288 & i3) != 0 ? "" : str15, (1048576 & i3) != 0 ? "" : str16, (2097152 & i3) != 0 ? "" : str17, (4194304 & i3) != 0 ? "" : str18, (8388608 & i3) != 0 ? "" : str19, (16777216 & i3) != 0 ? "" : str20, (33554432 & i3) != 0 ? "" : str21, (67108864 & i3) != 0 ? "" : str22, (134217728 & i3) != 0 ? "" : str23, (268435456 & i3) != 0 ? "" : str24, (536870912 & i3) != 0 ? "" : str25, (1073741824 & i3) != 0 ? null : str26, (i3 & Integer.MIN_VALUE) != 0 ? "" : str27, (i4 & 1) != 0 ? "" : str28, (i4 & 2) == 0 ? str29 : "", (i4 & 4) != 0 ? 1 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? null : num);
    }
}
