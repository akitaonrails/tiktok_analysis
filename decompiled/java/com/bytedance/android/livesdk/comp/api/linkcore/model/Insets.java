package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class Insets {
    public static final Companion Companion = new Companion();

    @C09CT("insetsForAndroid")
    public List<Integer> insets;

    @C09CT("align_less_ratio")
    public String lessThanRatioAlign;

    @C09CT("align_greater_ratio")
    public String moreThanRatioAlign;

    @C09CT("ratio")
    public float ratio;

    @C09CT("scale_type")
    public String scaleType;

    @C09CT("stream_offset")
    public float streamOffset;

    @C09CT("view_percent")
    public List<Float> viewPercent;

    public static final class Companion {
        public final boolean isContains(Insets insets, int i, int i2) {
            return (i & i2) == i2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) obj;
        return Intrinsics.LJFF(this.viewPercent, insets.viewPercent) && Intrinsics.LJFF(this.insets, insets.insets) && Float.compare(this.ratio, insets.ratio) == 0 && Intrinsics.LJFF(this.moreThanRatioAlign, insets.moreThanRatioAlign) && Intrinsics.LJFF(this.lessThanRatioAlign, insets.lessThanRatioAlign) && Intrinsics.LJFF(this.scaleType, insets.scaleType) && Float.compare(this.streamOffset, insets.streamOffset) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Insets(viewPercent=");
        sbLIZ.append(this.viewPercent);
        sbLIZ.append(", insets=");
        sbLIZ.append(this.insets);
        sbLIZ.append(", ratio=");
        sbLIZ.append(this.ratio);
        sbLIZ.append(", moreThanRatioAlign=");
        sbLIZ.append(this.moreThanRatioAlign);
        sbLIZ.append(", lessThanRatioAlign=");
        sbLIZ.append(this.lessThanRatioAlign);
        sbLIZ.append(", scaleType=");
        sbLIZ.append(this.scaleType);
        sbLIZ.append(", streamOffset=");
        sbLIZ.append(this.streamOffset);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lessThanRatioAlign() {
        /*
            r3 = this;
            java.lang.String r2 = r3.lessThanRatioAlign
            int r0 = r2.hashCode()
            r1 = 34
            switch(r0) {
                case -1580828439: goto Lc;
                case -1568783182: goto L17;
                case -1514196637: goto L22;
                case -1494981747: goto L2d;
                case -1364013995: goto L38;
                case -1349088399: goto L43;
                case -1113993601: goto L4e;
                case 1699249582: goto L59;
                case 1718464472: goto L64;
                case 1718760733: goto L6f;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "bottom_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 132(0x84, float:1.85E-43)
            return r1
        L17:
            java.lang.String r0 = "right_top"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 40
            return r1
        L22:
            java.lang.String r0 = "left_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L2d:
            java.lang.String r0 = "left_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 66
            return r1
        L38:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 68
            return r1
        L43:
            java.lang.String r0 = "custom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 256(0x100, float:3.59E-43)
            return r1
        L4e:
            java.lang.String r0 = "top_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 36
            return r1
        L59:
            java.lang.String r0 = "right_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 136(0x88, float:1.9E-43)
            return r1
        L64:
            java.lang.String r0 = "right_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 72
            return r1
        L6f:
            java.lang.String r0 = "left_top"
            r2.equals(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.Insets.lessThanRatioAlign():int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int moreThanRatioAlign() {
        /*
            r3 = this;
            java.lang.String r2 = r3.moreThanRatioAlign
            int r0 = r2.hashCode()
            r1 = 34
            switch(r0) {
                case -1580828439: goto Lc;
                case -1568783182: goto L17;
                case -1514196637: goto L22;
                case -1494981747: goto L2d;
                case -1364013995: goto L38;
                case -1349088399: goto L43;
                case -1113993601: goto L4e;
                case 1699249582: goto L59;
                case 1718464472: goto L64;
                case 1718760733: goto L6f;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "bottom_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 132(0x84, float:1.85E-43)
            return r1
        L17:
            java.lang.String r0 = "right_top"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 40
            return r1
        L22:
            java.lang.String r0 = "left_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L2d:
            java.lang.String r0 = "left_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 66
            return r1
        L38:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 68
            return r1
        L43:
            java.lang.String r0 = "custom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 256(0x100, float:3.59E-43)
            return r1
        L4e:
            java.lang.String r0 = "top_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 36
            return r1
        L59:
            java.lang.String r0 = "right_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 136(0x88, float:1.9E-43)
            return r1
        L64:
            java.lang.String r0 = "right_center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 72
            return r1
        L6f:
            java.lang.String r0 = "left_top"
            r2.equals(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.Insets.moreThanRatioAlign():int");
    }

    public final void mergeWith(Insets insets) {
        String str;
        String str2;
        String str3;
        List<Float> list = insets.viewPercent;
        if (list == null || !(!list.isEmpty())) {
            list = this.viewPercent;
        }
        this.viewPercent = list;
        List<Integer> list2 = insets.insets;
        if (list2 == null || !(!list2.isEmpty())) {
            list2 = this.insets;
        }
        this.insets = list2;
        this.ratio = insets.ratio;
        String str4 = insets.moreThanRatioAlign;
        if (str4 != null && str4.length() != 0) {
            str = insets.moreThanRatioAlign;
        } else {
            str = this.moreThanRatioAlign;
        }
        this.moreThanRatioAlign = str;
        String str5 = insets.lessThanRatioAlign;
        if (str5 != null && str5.length() != 0) {
            str2 = insets.lessThanRatioAlign;
        } else {
            str2 = this.lessThanRatioAlign;
        }
        this.lessThanRatioAlign = str2;
        String str6 = insets.scaleType;
        if (str6 != null && str6.length() != 0) {
            str3 = insets.scaleType;
        } else {
            str3 = this.scaleType;
        }
        this.scaleType = str3;
        this.streamOffset = insets.streamOffset;
    }

    public final void setInsets(List<Integer> list) {
        this.insets = list;
    }

    public final void setLessThanRatioAlign(String str) {
        this.lessThanRatioAlign = str;
    }

    public final void setMoreThanRatioAlign(String str) {
        this.moreThanRatioAlign = str;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setScaleType(String str) {
        this.scaleType = str;
    }

    public final void setStreamOffset(float f) {
        this.streamOffset = f;
    }

    public final void setViewPercent(List<Float> list) {
        this.viewPercent = list;
    }

    public Insets(List<Float> list, List<Integer> list2, float f, String str, String str2, String str3, float f2) {
        this.viewPercent = list;
        this.insets = list2;
        this.ratio = f;
        this.moreThanRatioAlign = str;
        this.lessThanRatioAlign = str2;
        this.scaleType = str3;
        this.streamOffset = f2;
    }
}
