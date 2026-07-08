package com.bytedance.lynx.spark.schema.model;

import X.C098200Yq;
import X.C1338790kwX;
import X.C1545520qJy;
import X.C189200o6;
import X.C2327809Ae;
import X.EnumC1067640dtC;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkPopupSchemaParam extends AbsSparkPopupSchemaParam {
    public boolean autoAdaptActive;
    public int autoAdaptContentWidthPx;
    public Integer overrideOrientation;
    public long resizeDurationInMillSeconds;
    public Map<String, String> schemaQueryMap;
    public Uri schemaUri;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkPopupSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bytedance.lynx.spark.schema.model.SparkSchemaParam, com.bytedance.lynx.hybrid.param.HybridSchemaParam
    public void adjustValues() {
        if (getSelfAdaptiveHeight()) {
            setHeight(-1);
        }
        if (getHeight() == -1) {
            String gravity = getGravity();
            if (Intrinsics.LJFF(gravity, "bottom")) {
                setHeight(C1338790kwX.LIZLLL(null));
            } else if (Intrinsics.LJFF(gravity, "center")) {
                setHeight(C1338790kwX.LIZ(400.0f));
            }
        }
        if (getWidth() == -1) {
            String gravity2 = getGravity();
            if (Intrinsics.LJFF(gravity2, "bottom")) {
                setWidth(C1338790kwX.LJ(null));
            } else if (Intrinsics.LJFF(gravity2, "center")) {
                setWidth(C1338790kwX.LIZ(300.0f));
            }
        }
        if (!getSelfAdaptiveHeight() && getVariableHeight() > getHeight()) {
            setDragHeight(getVariableHeight());
            setDragBack(true);
            setDragByGesture(true);
            setEnablePullDownClose(true);
            setTransitionAnimation("bottom");
            setGravity("bottom");
        }
        if (getMinMarginTop() > 0) {
            setKeyboardAdjust(2);
        }
        if (getForbiddenAnim()) {
            setHideLoading(true);
        }
        if (getTransStatusBar()) {
            setKeyboardCompat(true);
        }
        try {
            long j = (long) (CastFloatProtector.parseFloat(getResizeDuration()) * LSPassThroughRecordSizeConfig.DEFAULT);
            this.resizeDurationInMillSeconds = j;
            if (j < 0) {
                this.resizeDurationInMillSeconds = 300L;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final boolean getAutoAdaptActive() {
        return this.autoAdaptActive;
    }

    public final int getAutoAdaptContentWidthPx() {
        return this.autoAdaptContentWidthPx;
    }

    public final long getResizeDurationInMillSeconds() {
        return this.resizeDurationInMillSeconds;
    }

    public SparkPopupSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
        this.resizeDurationInMillSeconds = 300L;
    }

    public final boolean LIZ(Context context) {
        Resources resources;
        Configuration configuration;
        Integer num = this.overrideOrientation;
        if (num != null) {
            if (num.intValue() == 2) {
                return true;
            }
            return false;
        }
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            return true;
        }
        return false;
    }

    public final String getRealGravity(Context context) {
        if (this.autoAdaptActive) {
            return "center";
        }
        String gravity = getGravity();
        if (LIZ(context) && getLandscapeGravity().length() > 0) {
            return getLandscapeGravity();
        }
        return gravity;
    }

    public final String getRealGravityWithoutDefault(Context context) {
        if (this.autoAdaptActive) {
            return "center";
        }
        String gravityWithoutDefault = getGravityWithoutDefault();
        if (LIZ(context) && getLandscapeGravity().length() > 0) {
            return getLandscapeGravity();
        }
        return gravityWithoutDefault;
    }

    public final int getRealHeight(Context context) {
        int height = getHeight();
        if (LIZ(context) && getLandscapeHeight() > 0) {
            return getLandscapeHeight();
        }
        return height;
    }

    public final String getRealTransitionAnimation(Context context) {
        if (this.autoAdaptActive) {
            return "auto";
        }
        String transitionAnimation = getTransitionAnimation();
        if (LIZ(context) && getLandscapeTransitionAnimation().length() > 0) {
            return getLandscapeTransitionAnimation();
        }
        return transitionAnimation;
    }

    public final int getRealWidth(Context context) {
        int i;
        if (this.autoAdaptActive && (i = this.autoAdaptContentWidthPx) > 0) {
            return i;
        }
        int width = getWidth();
        if (LIZ(context) && getLandscapeWidth() > 0) {
            return getLandscapeWidth();
        }
        return width;
    }

    public final void setAutoAdaptActive(boolean z) {
        this.autoAdaptActive = z;
    }

    public final void setAutoAdaptContentWidthPx(int i) {
        this.autoAdaptContentWidthPx = i;
    }

    public final void setResizeDurationInMillSeconds(long j) {
        this.resizeDurationInMillSeconds = j;
    }

    public static Integer LIZJ(int i, String str) {
        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str);
        if (fLJIIIIZZ != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            if (fFloatValue >= 0.0f && fFloatValue <= 100.0f && i > 0) {
                return Integer.valueOf((int) ((i * fFloatValue) / 100.0f));
            }
            return null;
        }
        return null;
    }

    public final void recordSchemaParams(Map<String, String> map, Uri uri) {
        this.schemaQueryMap = map;
        this.schemaUri = uri;
    }

    public /* synthetic */ SparkPopupSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }

    public static Integer LIZIZ(String str, String str2, int i, Map map) {
        if (u.LJIIZILJ(str2, "%", false)) {
            return LIZJ(i, a0.LJJJLL("%", str2));
        }
        return Integer.valueOf(C1545520qJy.LIZIZ(str, str2, map, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateOrientationDependentParams(int r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.overrideOrientation = r0
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.schemaQueryMap
            if (r2 != 0) goto Lb
            return
        Lb:
            android.net.Uri r0 = r5.schemaUri
            if (r0 != 0) goto L10
            return
        L10:
            r4 = 0
            if (r9 != 0) goto Lb2
            java.lang.String r1 = "width"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L23
            java.lang.Integer r3 = LIZIZ(r1, r0, r7, r2)
            if (r3 != 0) goto L31
        L23:
            java.lang.String r0 = "width_percent"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb2
            java.lang.Integer r3 = LIZJ(r7, r0)
        L31:
            java.lang.String r1 = "height"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto La3
            java.lang.Integer r0 = LIZIZ(r1, r0, r8, r2)
            if (r0 == 0) goto La3
            r4 = r0
        L42:
            r0 = 2
            if (r6 != r0) goto L8e
            if (r9 != 0) goto L5e
            java.lang.String r1 = "landscape_width"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L82
            java.lang.Integer r0 = LIZIZ(r1, r0, r7, r2)
            if (r0 == 0) goto L82
            int r0 = r0.intValue()
        L5b:
            r5.setLandscapeWidth(r0)
        L5e:
            java.lang.String r1 = "landscape_height"
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L76
            java.lang.Integer r0 = LIZIZ(r1, r0, r8, r2)
            if (r0 == 0) goto L76
            int r0 = r0.intValue()
        L72:
            r5.setLandscapeHeight(r0)
        L75:
            return
        L76:
            if (r4 == 0) goto L7d
            int r0 = r4.intValue()
            goto L72
        L7d:
            int r0 = r5.getLandscapeHeight()
            goto L72
        L82:
            if (r3 == 0) goto L89
            int r0 = r3.intValue()
            goto L5b
        L89:
            int r0 = r5.getLandscapeWidth()
            goto L5b
        L8e:
            if (r9 != 0) goto L99
            if (r3 == 0) goto L99
            int r0 = r3.intValue()
            r5.setWidth(r0)
        L99:
            if (r4 == 0) goto L75
            int r0 = r4.intValue()
            r5.setHeight(r0)
            return
        La3:
            java.lang.String r0 = "height_percent"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L42
            java.lang.Integer r4 = LIZJ(r8, r0)
            goto L42
        Lb2:
            r3 = r4
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam.updateOrientationDependentParams(int, int, int, boolean):void");
    }

    public static /* synthetic */ void updateOrientationDependentParams$default(SparkPopupSchemaParam sparkPopupSchemaParam, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        sparkPopupSchemaParam.updateOrientationDependentParams(i, i2, i3, z);
    }
}
