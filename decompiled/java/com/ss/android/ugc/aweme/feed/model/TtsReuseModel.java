package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class TtsReuseModel implements Serializable {

    @C09CT("align")
    public int align;

    @C09CT("bg_mode")
    public int bgMode;

    @C09CT("border_color")
    public String borderColor;

    @C09CT("color")
    public int color;

    @C09CT("end_time")
    public int endTime;

    @C09CT("font_resource_id")
    public String fontResId;

    @C09CT("is_voice_clone")
    public Boolean isVoiceClone;

    @C09CT("layer")
    public int layer;

    @C09CT("rotation")
    public float rotation;

    @C09CT("scale")
    public float scale;

    @C09CT("speaker_id")
    public String speakerId;

    @C09CT("start_time")
    public int startTime;

    @C09CT("stream_speaker_id")
    public String streamSpeakerId;

    @C09CT("text_str")
    public String textStr;

    @C09CT("text_style")
    public int textStyle;

    @C09CT("transform_x")
    public float transformX;

    @C09CT("transform_y")
    public float transformY;

    @C09CT("voice_effect_id")
    public String voiceEffectId;

    @C09CT("voice_resource_id")
    public String voiceResId;

    public TtsReuseModel() {
        this("", 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 2, null, null, null, null, null, null, -1, null);
    }

    public String toString() {
        return "TtsReuseModel(textStr=" + this.textStr + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", transformX=" + this.transformX + ", transformY=" + this.transformY + ", scale=" + this.scale + ", rotation=" + this.rotation + ", layer=" + this.layer + ", bgMode=" + this.bgMode + ", color=" + this.color + ", align=" + this.align + ", fontResId=" + this.fontResId + ", voiceResId=" + this.voiceResId + ", voiceEffectId=" + this.voiceEffectId + ", speakerId=" + this.speakerId + ", streamSpeakerId=" + this.streamSpeakerId + ", isVoiceClone=" + this.isVoiceClone + ", textStyle=" + this.textStyle + ", borderColor=" + this.borderColor + ')';
    }

    public final Boolean isVoiceClone() {
        return this.isVoiceClone;
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFontResId(String str) {
        this.fontResId = str;
    }

    public final void setLayer(int i) {
        this.layer = i;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setStreamSpeakerId(String str) {
        this.streamSpeakerId = str;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setTextStyle(int i) {
        this.textStyle = i;
    }

    public final void setTransformX(float f) {
        this.transformX = f;
    }

    public final void setTransformY(float f) {
        this.transformY = f;
    }

    public final void setVoiceClone(Boolean bool) {
        this.isVoiceClone = bool;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceResId(String str) {
        this.voiceResId = str;
    }

    public TtsReuseModel(String str, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i7, String str7) {
        this.textStr = str;
        this.startTime = i;
        this.endTime = i2;
        this.transformX = f;
        this.transformY = f2;
        this.scale = f3;
        this.rotation = f4;
        this.layer = i3;
        this.bgMode = i4;
        this.color = i5;
        this.align = i6;
        this.fontResId = str2;
        this.voiceResId = str3;
        this.voiceEffectId = str4;
        this.speakerId = str5;
        this.streamSpeakerId = str6;
        this.isVoiceClone = bool;
        this.textStyle = i7;
        this.borderColor = str7;
    }
}
