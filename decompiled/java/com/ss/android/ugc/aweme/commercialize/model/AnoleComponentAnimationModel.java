package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentAnimationModel implements Serializable {

    @C09CT("curve")
    public final String curve;

    @C09CT("delay")
    public final long delay;

    @C09CT("duration")
    public final long duration;

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("type")
    public final String type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleComponentAnimationModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", delay=");
        sbLIZ.append(this.delay);
        sbLIZ.append(", curve=");
        sbLIZ.append(this.curve);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final double getFinalHeightValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("to_height") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return -1.0d;
        }
        return d.doubleValue();
    }

    public final Double getFinalOpacityValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("to_opacity") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(0.0d, Math.min(d.doubleValue(), 100.0d)));
    }

    public final Double getFinalScaleValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("to_scale") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(d.doubleValue(), 0.0d));
    }

    public final double getFinalWidthValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("to_width") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return -1.0d;
        }
        return d.doubleValue();
    }

    public final Double getInitialOpacityValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("from_opacity") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(0.0d, Math.min(d.doubleValue(), 100.0d)));
    }

    public final Double getInitialScaleValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("from_scale") : null;
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(d.doubleValue(), 0.0d));
    }

    public final String getResizeType() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("resize_type") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public AnoleComponentAnimationModel(String str, long j, long j2, String str2, Map<String, ? extends Object> map) {
        this.type = str;
        this.duration = j;
        this.delay = j2;
        this.curve = str2;
        this.params = map;
    }
}
