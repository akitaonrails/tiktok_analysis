package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendEffectRequestParams {

    @C09CT("algorithm_key")
    public final String algorithmKey;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("effect_id_list")
    public final String effectIdList;

    @C09CT("is_multi_content")
    public final String isMultiContent;

    @C09CT("material_type")
    public final String materialType;

    @C09CT("mix_type")
    public final String mixType;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("prop_id_list")
    public final String propIdList;

    @C09CT("original_resolution_list")
    public final List<String> resolutionList;

    @C09CT("count")
    public final int returnSize;

    @C09CT("sdk_version")
    public final String sdkVersion;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("sticker_id_list")
    public final String stickerIdList;

    @C09CT("text_list")
    public final String textList;

    @C09CT("tos_url")
    public final String tosUrl;

    @C09CT("video_length_list")
    public final List<Float> videoLengthList;

    public RecommendEffectRequestParams() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public RecommendEffectRequestParams(int i, String str, String str2, String str3, String str4, List<String> list, List<Float> list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.returnSize = i;
        this.tosUrl = str;
        this.appVersion = str2;
        this.sdkVersion = str3;
        this.algorithmKey = str4;
        this.resolutionList = list;
        this.videoLengthList = list2;
        this.shootWay = str5;
        this.contentSource = str6;
        this.materialType = str7;
        this.isMultiContent = str8;
        this.mixType = str9;
        this.musicId = str10;
        this.stickerIdList = str11;
        this.effectIdList = str12;
        this.propIdList = str13;
        this.textList = str14;
    }

    public RecommendEffectRequestParams(int i, String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "editing_effect_rec_mvp" : str4, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) != 0 ? C13BV.INSTANCE : list2, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str9, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (32768 & i2) != 0 ? "" : str13, (i2 & 65536) == 0 ? str14 : "");
    }
}
