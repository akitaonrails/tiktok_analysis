package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class Resolution {
    public static final Companion Companion = new Companion();

    @C09CT("bits")
    public int _bitrate_kbps;

    @C09CT("e_h")
    public int _effectHeight;

    @C09CT("e_w")
    public int _effectWidth;

    @C09CT("fps")
    public int _fps;

    @C09CT("h")
    public int _height;

    @C09CT("w")
    public int _width;
    public int bitrateKbps;

    @C09CT("business_id")
    public String businessId;
    public final String configId;
    public int effectHeight;
    public int effectWidth;
    public transient int fps;
    public int height;
    public final RtcParams rtcParams;
    public int width;

    public static final class Companion {
    }

    public Resolution() {
        this(0, 0, 0, 0, "linkmic_grid_float_1", 0, 0, "layout_default", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return this._width == resolution._width && this._height == resolution._height && this._fps == resolution._fps && this._bitrate_kbps == resolution._bitrate_kbps && Intrinsics.LJFF(this.businessId, resolution.businessId) && this._effectWidth == resolution._effectWidth && this._effectHeight == resolution._effectHeight && Intrinsics.LJFF(this.configId, resolution.configId) && Intrinsics.LJFF(this.rtcParams, resolution.rtcParams);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resolution(_width=");
        sbLIZ.append(this._width);
        sbLIZ.append(", _height=");
        sbLIZ.append(this._height);
        sbLIZ.append(", _fps=");
        sbLIZ.append(this._fps);
        sbLIZ.append(", _bitrate_kbps=");
        sbLIZ.append(this._bitrate_kbps);
        sbLIZ.append(", businessId=");
        sbLIZ.append(this.businessId);
        sbLIZ.append(", _effectWidth=");
        sbLIZ.append(this._effectWidth);
        sbLIZ.append(", _effectHeight=");
        sbLIZ.append(this._effectHeight);
        sbLIZ.append(", configId=");
        sbLIZ.append(this.configId);
        sbLIZ.append(", rtcParams=");
        sbLIZ.append(this.rtcParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getBitrateKbps() {
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        int iIntValue = (rtcParams == null || (map = rtcParams.codecParam) == null || (num = map.get("bitrate_kbps")) == null) ? this.bitrateKbps : num.intValue();
        return iIntValue <= 0 ? this._bitrate_kbps : iIntValue;
    }

    public final int getEffectHeight() {
        RtcParams rtcParams = this.rtcParams;
        int i = rtcParams != null ? rtcParams.effectHeight : this.effectHeight;
        return i <= 0 ? this._effectHeight : i;
    }

    public final int getEffectWidth() {
        RtcParams rtcParams = this.rtcParams;
        int i = rtcParams != null ? rtcParams.effectWidth : this.effectWidth;
        return i <= 0 ? this._effectWidth : i;
    }

    public final int getFps() {
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        int iIntValue = (rtcParams == null || (map = rtcParams.codecParam) == null || (num = map.get("fps")) == null) ? this.fps : num.intValue();
        return iIntValue <= 0 ? this._fps : iIntValue;
    }

    public final int getHeight() {
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        int iIntValue = (rtcParams == null || (map = rtcParams.codecParam) == null || (num = map.get("height")) == null) ? this.height : num.intValue();
        return iIntValue <= 0 ? this._height : iIntValue;
    }

    public final int getWidth() {
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        int iIntValue = (rtcParams == null || (map = rtcParams.codecParam) == null || (num = map.get("width")) == null) ? this.width : num.intValue();
        return iIntValue <= 0 ? this._width : iIntValue;
    }

    public final void mergeWith(Resolution resolution) {
        this._width = resolution._width;
        this._height = resolution._height;
        this._fps = resolution._fps;
        this._bitrate_kbps = resolution._bitrate_kbps;
        this.businessId = resolution.businessId;
        this._effectWidth = resolution._effectWidth;
        this._effectHeight = resolution._effectHeight;
    }

    public final void setBitrateKbps(int i) {
        this.bitrateKbps = i;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setEffectHeight(int i) {
        this.effectHeight = i;
    }

    public final void setEffectWidth(int i) {
        this.effectWidth = i;
    }

    public final void setFps(int i) {
        this.fps = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void set_bitrate_kbps(int i) {
        this._bitrate_kbps = i;
    }

    public final void set_effectHeight(int i) {
        this._effectHeight = i;
    }

    public final void set_effectWidth(int i) {
        this._effectWidth = i;
    }

    public final void set_fps(int i) {
        this._fps = i;
    }

    public final void set_height(int i) {
        this._height = i;
    }

    public final void set_width(int i) {
        this._width = i;
    }

    public Resolution(int i, int i2, int i3, int i4, String str, int i5, int i6, String str2, RtcParams rtcParams) {
        this._width = i;
        this._height = i2;
        this._fps = i3;
        this._bitrate_kbps = i4;
        this.businessId = str;
        this._effectWidth = i5;
        this._effectHeight = i6;
        this.configId = str2;
        this.rtcParams = rtcParams;
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bitrateKbps = i4;
        this.effectWidth = i5;
        this.effectHeight = i6;
    }
}
