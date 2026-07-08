package com.ss.ugc.android.editor.core.api.params;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes6.dex */
public final class MaskParam {
    public transient String LIZ;

    @C09CT("invert")
    public Boolean invert;

    @C09CT("center_x")
    public final Float maskCenterX;

    @C09CT("center_y")
    public final Float maskCenterY;

    @C09CT("feather")
    public final Float maskFeather;

    @C09CT("height")
    public Float maskHeight;

    @C09CT("rotate")
    public final Float maskRotate;

    @C09CT("round_corner")
    public final Float maskRoundCorner;

    @C09CT("type")
    public String maskType;

    @C09CT("width")
    public Float maskWidth;

    @C09CT("urs")
    public String resourceId;

    @C09CT("rich_text")
    public final String text;

    @C09CT("scale_x")
    public final Float textScaleX;

    @C09CT("scale_y")
    public final Float textScaleY;

    public MaskParam() {
        this(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "none", "", "");
    }

    public static MaskParam LIZ(MaskParam maskParam, Float f, Float f2, Float f3, String str, Boolean bool, Float f4, String str2, String str3, int i) {
        Float f5;
        Float f6;
        Float f7;
        Float f8;
        Float f9;
        String str4 = str3;
        Float f10 = f4;
        String str5 = str;
        Boolean bool2 = bool;
        String str6 = str2;
        Float f11 = f3;
        Float f12 = f2;
        Float f13 = f;
        String str7 = null;
        if ((i & 1) != 0) {
            f5 = maskParam.maskWidth;
        } else {
            f5 = null;
        }
        if ((i & 2) != 0) {
            f6 = maskParam.maskHeight;
        } else {
            f6 = null;
        }
        if ((i & 4) != 0) {
            f13 = maskParam.maskCenterX;
        }
        if ((i & 8) != 0) {
            f12 = maskParam.maskCenterY;
        }
        if ((i & 16) != 0) {
            f11 = maskParam.maskRotate;
        }
        if ((i & 32) != 0) {
            f7 = maskParam.maskRoundCorner;
        } else {
            f7 = null;
        }
        if ((i & 64) != 0) {
            str5 = maskParam.text;
        }
        if ((i & 128) != 0) {
            f8 = maskParam.textScaleX;
        } else {
            f8 = null;
        }
        if ((i & 256) != 0) {
            f9 = maskParam.textScaleY;
        } else {
            f9 = null;
        }
        if ((i & 512) != 0) {
            bool2 = maskParam.invert;
        }
        if ((i & 1024) != 0) {
            f10 = maskParam.maskFeather;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str7 = maskParam.maskType;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = maskParam.resourceId;
        }
        if ((i & 8192) != 0) {
            str4 = maskParam.LIZ;
        }
        return new MaskParam(f5, f6, f13, f12, f11, f7, str5, f8, f9, bool2, f10, str7, str6, str4);
    }

    public MaskParam(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, String str, Float f7, Float f8, Boolean bool, Float f9, String str2, String str3, String str4) {
        this.maskWidth = f;
        this.maskHeight = f2;
        this.maskCenterX = f3;
        this.maskCenterY = f4;
        this.maskRotate = f5;
        this.maskRoundCorner = f6;
        this.text = str;
        this.textScaleX = f7;
        this.textScaleY = f8;
        this.invert = bool;
        this.maskFeather = f9;
        this.maskType = str2;
        this.resourceId = str3;
        this.LIZ = str4;
    }
}
