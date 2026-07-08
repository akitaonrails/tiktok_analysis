package com.ss.android.ugc.aweme.beauty;

import X.C09CT;
import X.C19729712Hf;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class ComposerBeautyExtra {
    public static final C19729712Hf Companion = new Object() { // from class: X.12Hf
    };

    @C09CT("ab_group")
    public final int abGroup;

    @C09CT("beautify")
    public String beautify;

    @C09CT("beautyConfig")
    public String beautyConfig;

    @C09CT("blush_default")
    public final Float blushDefault;

    @C09CT("blush_max")
    public final Float blushMax;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final boolean f49default;

    @C09CT("disable_cache")
    public boolean disableCache;

    @C09CT("eye_default")
    public final Float eyeDefault;

    @C09CT("eye_max")
    public final Float eyeMax;

    @C09CT("face_default")
    public final Float faceDefault;

    @C09CT("face_max")
    public final Float faceMax;
    public final String gender;

    @C09CT("is_none")
    public boolean isNone;

    @C09CT("lipstick_default")
    public final Float lipstickDefault;

    @C09CT("lipstick_max")
    public final Float lipstickMax;

    @C09CT("liveeffectid")
    public String liveEffectId;

    @C09CT("MakeupType")
    public int makeupType;
    public String resourceType;

    @C09CT("sharp_default")
    public final Float sharpDefault;

    @C09CT("sharp_max")
    public final Float sharpMax;

    @C09CT("skin_default")
    public final Float skinDefault;

    @C09CT("skin_max")
    public final Float skinMax;

    @C09CT("testliveeffectid")
    public String testLiveEffectId;

    @C09CT("video_tag")
    public String videoTag;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerBeautyExtra() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, 0, 0 == true ? 1 : 0, objArr14, objArr15, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr16, objArr17, objArr18, 16777215, objArr19);
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final String getBeautify() {
        return this.beautify;
    }

    public final String getBeautyConfig() {
        return this.beautyConfig;
    }

    public final Float getBlushDefault() {
        return this.blushDefault;
    }

    public final Float getBlushMax() {
        return this.blushMax;
    }

    public final boolean getDefault() {
        return this.f49default;
    }

    public final boolean getDisableCache() {
        return this.disableCache;
    }

    public final Float getEyeDefault() {
        return this.eyeDefault;
    }

    public final Float getEyeMax() {
        return this.eyeMax;
    }

    public final Float getFaceDefault() {
        return this.faceDefault;
    }

    public final Float getFaceMax() {
        return this.faceMax;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Float getLipstickDefault() {
        return this.lipstickDefault;
    }

    public final Float getLipstickMax() {
        return this.lipstickMax;
    }

    public final String getLiveEffectId() {
        return this.liveEffectId;
    }

    public final int getMakeupType() {
        return this.makeupType;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final Float getSharpDefault() {
        return this.sharpDefault;
    }

    public final Float getSharpMax() {
        return this.sharpMax;
    }

    public final Float getSkinDefault() {
        return this.skinDefault;
    }

    public final Float getSkinMax() {
        return this.skinMax;
    }

    public final String getTestLiveEffectId() {
        return this.testLiveEffectId;
    }

    public final String getVideoTag() {
        return this.videoTag;
    }

    public final boolean isNone() {
        return this.isNone;
    }

    public final void setBeautify(String str) {
        this.beautify = str;
    }

    public final void setBeautyConfig(String str) {
        this.beautyConfig = str;
    }

    public final void setDisableCache(boolean z) {
        this.disableCache = z;
    }

    public final void setLiveEffectId(String str) {
        this.liveEffectId = str;
    }

    public final void setMakeupType(int i) {
        this.makeupType = i;
    }

    public final void setNone(boolean z) {
        this.isNone = z;
    }

    public final void setResourceType(String str) {
        this.resourceType = str;
    }

    public final void setTestLiveEffectId(String str) {
        this.testLiveEffectId = str;
    }

    public final void setVideoTag(String str) {
        this.videoTag = str;
    }

    public ComposerBeautyExtra(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, int i, boolean z, String str3, String str4, boolean z2, boolean z3, int i2, String str5, String str6, String str7) {
        this.resourceType = str;
        this.gender = str2;
        this.lipstickDefault = f;
        this.lipstickMax = f2;
        this.blushDefault = f3;
        this.blushMax = f4;
        this.eyeDefault = f5;
        this.eyeMax = f6;
        this.faceDefault = f7;
        this.faceMax = f8;
        this.skinDefault = f9;
        this.skinMax = f10;
        this.sharpDefault = f11;
        this.sharpMax = f12;
        this.abGroup = i;
        this.f49default = z;
        this.beautify = str3;
        this.beautyConfig = str4;
        this.isNone = z2;
        this.disableCache = z3;
        this.makeupType = i2;
        this.videoTag = str5;
        this.liveEffectId = str6;
        this.testLiveEffectId = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComposerBeautyExtra(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, int i, boolean z, String str3, String str4, boolean z2, boolean z3, int i2, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str8 = str6;
        String str9 = str5;
        boolean z4 = z3;
        boolean z5 = z2;
        String str10 = str4;
        String str11 = str3;
        boolean z6 = z;
        int i4 = i;
        Float f13 = f12;
        Float f14 = f11;
        Float f15 = f9;
        Float f16 = f8;
        Float f18 = f7;
        Float f19 = f6;
        Float f20 = f5;
        Float f21 = f3;
        Float f22 = f2;
        Float f23 = f;
        Float f24 = f4;
        Float f25 = f10;
        String str12 = str7;
        this((i3 & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i3 & 2) == 0 ? str2 : CardStruct.IStatusCode.DEFAULT, (i3 & 4) != 0 ? null : f23, (i3 & 8) != 0 ? null : f22, (i3 & 16) != 0 ? null : f21, (i3 & 32) != 0 ? null : f24, (i3 & 64) != 0 ? null : f20, (i3 & 128) != 0 ? null : f19, (i3 & 256) != 0 ? null : f18, (i3 & 512) != 0 ? null : f16, (i3 & 1024) != 0 ? null : f15, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f25, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : f14, (i3 & 8192) != 0 ? null : f13, (i3 & 16384) != 0 ? 0 : i4, (32768 & i3) != 0 ? false : z6, (65536 & i3) != 0 ? null : str11, (131072 & i3) != 0 ? null : str10, (262144 & i3) != 0 ? false : z5, (524288 & i3) != 0 ? false : z4, (1048576 & i3) == 0 ? i2 : 0, (2097152 & i3) != 0 ? null : str9, (4194304 & i3) != 0 ? null : str8, (i3 & 8388608) != 0 ? null : str12);
    }
}
