package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LayoutArray {

    @C09CT("business_id")
    public String businessId;

    @C09CT("config_id")
    public String configId;

    @C09CT("pos")
    public List<Float> pos;

    @C09CT("corner_radius")
    public Float radius;
    public RectF rectF;

    @C09CT("reso_id")
    public String reso_id;

    @C09CT("win_id")
    public Integer windowId;

    @C09CT("z")
    public Integer zOrder;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getReso_id$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutArray)) {
            return false;
        }
        LayoutArray layoutArray = (LayoutArray) obj;
        return Intrinsics.LJFF(this.pos, layoutArray.pos) && Intrinsics.LJFF(this.reso_id, layoutArray.reso_id) && Intrinsics.LJFF(this.businessId, layoutArray.businessId) && Intrinsics.LJFF(this.configId, layoutArray.configId) && Intrinsics.LJFF(this.zOrder, layoutArray.zOrder) && Intrinsics.LJFF(this.radius, layoutArray.radius) && Intrinsics.LJFF(this.windowId, layoutArray.windowId);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutArray(pos=");
        sbLIZ.append(this.pos);
        sbLIZ.append(", reso_id=");
        sbLIZ.append(this.reso_id);
        sbLIZ.append(", businessId=");
        sbLIZ.append(this.businessId);
        sbLIZ.append(", configId=");
        sbLIZ.append(this.configId);
        sbLIZ.append(", zOrder=");
        sbLIZ.append(this.zOrder);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", windowId=");
        sbLIZ.append(this.windowId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final RectF createLayoutSize() {
        return new RectF(((Number) ListProtector.get(this.pos, 0)).floatValue(), ((Number) ListProtector.get(this.pos, 1)).floatValue(), ((Number) ListProtector.get(this.pos, 2)).floatValue(), ((Number) ListProtector.get(this.pos, 3)).floatValue());
    }

    private final boolean isRectFUpdated() {
        RectF rectF = this.rectF;
        if (rectF == null) {
            return true;
        }
        if (!Intrinsics.LIZLLL(Float.valueOf(rectF.left), ((Number) ListProtector.get(this.pos, 0)).floatValue())) {
            return true;
        }
        RectF rectF2 = this.rectF;
        if (!Intrinsics.LIZLLL(rectF2 != null ? Float.valueOf(rectF2.top) : null, ((Number) ListProtector.get(this.pos, 1)).floatValue())) {
            return true;
        }
        RectF rectF3 = this.rectF;
        if (!Intrinsics.LIZLLL(rectF3 != null ? Float.valueOf(rectF3.right) : null, ((Number) ListProtector.get(this.pos, 2)).floatValue())) {
            return true;
        }
        RectF rectF4 = this.rectF;
        return !Intrinsics.LIZLLL(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, ((Number) ListProtector.get(this.pos, 3)).floatValue());
    }

    public final float getRadius() {
        Float f = this.radius;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final int getWindowId() {
        Integer num = this.windowId;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getZOrder() {
        Integer num = this.zOrder;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final float getBottom$livemodel_release() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.bottom;
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.bottom;
    }

    public final float getHeight() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.height();
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.height();
    }

    public final float getLeft() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.left;
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.left;
    }

    public final RectF getLocationRectF() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF;
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize;
    }

    public final float getRight() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.right;
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.right;
    }

    public final float getTop() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.top;
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.top;
    }

    public final float getWidth() {
        RectF rectF;
        if (!isRectFUpdated() && (rectF = this.rectF) != null) {
            return rectF.width();
        }
        RectF rectFCreateLayoutSize = createLayoutSize();
        this.rectF = rectFCreateLayoutSize;
        return rectFCreateLayoutSize.width();
    }

    public final void mergeWith(LayoutArray layoutArray) {
        List<Float> list;
        String str;
        String str2;
        String str3;
        List<Float> list2 = layoutArray.pos;
        if (list2 != null && !list2.isEmpty()) {
            list = layoutArray.pos;
        } else {
            list = this.pos;
        }
        this.pos = list;
        String str4 = layoutArray.reso_id;
        if (str4 != null && str4.length() != 0) {
            str = layoutArray.reso_id;
        } else {
            str = this.reso_id;
        }
        this.reso_id = str;
        String str5 = layoutArray.businessId;
        if (str5 != null && str5.length() != 0) {
            str2 = layoutArray.businessId;
        } else {
            str2 = this.businessId;
        }
        this.businessId = str2;
        String str6 = layoutArray.configId;
        if (str6 != null && str6.length() != 0) {
            str3 = layoutArray.configId;
        } else {
            str3 = this.configId;
        }
        this.configId = str3;
        Integer num = layoutArray.zOrder;
        if (num == null) {
            num = this.zOrder;
        }
        this.zOrder = num;
        Float f = layoutArray.radius;
        if (f == null) {
            f = this.radius;
        }
        this.radius = f;
        Integer num2 = layoutArray.windowId;
        if (num2 == null) {
            num2 = this.windowId;
        }
        this.windowId = num2;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setConfigId(String str) {
        this.configId = str;
    }

    public final void setPos(List<Float> list) {
        this.pos = list;
    }

    public final void setRadius(Float f) {
        this.radius = f;
    }

    public final void setReso_id(String str) {
        this.reso_id = str;
    }

    public final void setWindowId(Integer num) {
        this.windowId = num;
    }

    public final void setZOrder(Integer num) {
        this.zOrder = num;
    }

    public LayoutArray(List<Float> list, String str, String str2, String str3, Integer num) {
        this(list, str, str2, str3, num, Float.valueOf(0.0f), null);
    }

    public LayoutArray(List<Float> list, String str, String str2, String str3, Integer num, Float f, Integer num2) {
        this.pos = list;
        this.reso_id = str;
        this.businessId = str2;
        this.configId = str3;
        this.zOrder = num;
        this.radius = f;
        this.windowId = num2;
    }
}
