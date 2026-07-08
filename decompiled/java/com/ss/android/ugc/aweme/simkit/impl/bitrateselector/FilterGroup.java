package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import X.C09CT;
import X.C1477350oY1;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class FilterGroup {

    @C09CT("bitrate_range")
    public final int[] bitrateRange;

    @C09CT("codec")
    public final List<Integer> codecList;

    @C09CT("fps_range")
    public final int[] fpsRange;

    @C09CT("height_range")
    public final int[] heightRange;

    @C09CT("min_width_range")
    public final int[] minWidthRange;

    @C09CT("quality_range")
    public final int[] qualityRange;

    @C09CT("width_range")
    public final int[] widthRange;

    private final boolean hasContainsCodec(int i) {
        List<Integer> list = this.codecList;
        if (list != null) {
            return list.contains(Integer.valueOf(i));
        }
        return true;
    }

    private final boolean isBitrateInRange(int i) {
        return isInRange(this.bitrateRange, i);
    }

    private final boolean isFpsInRange(int i) {
        return isInRange(this.fpsRange, i);
    }

    private final boolean isHeightInRange(int i) {
        return isInRange(this.heightRange, i);
    }

    private final boolean isMinWidthInRange(int i) {
        return isInRange(this.minWidthRange, i);
    }

    private final boolean isQualityInRange(int i) {
        return isInRange(this.qualityRange, i);
    }

    private final boolean isWidthInRange(int i) {
        return isInRange(this.widthRange, i);
    }

    public final <T extends InterfaceC1477220oXo> boolean isMatch(T t) {
        boolean z = false;
        if (t == null) {
            return false;
        }
        if (isQualityInRange(t.getQualityType()) && hasContainsCodec(t.isBytevc1()) && isFpsInRange((int) t.getFps()) && isMinWidthInRange(Math.min(t.getVideoWidth(), t.getVideoHeight())) && isWidthInRange(t.getVideoWidth()) && isHeightInRange(t.getVideoHeight()) && isBitrateInRange(t.getBitRate())) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(": ");
        sbLIZ.append(C1477350oY1.LIZ(t));
        sbLIZ.append(" ==> ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInRange(int[] r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            r3 = 1
            if (r6 == 0) goto L11
            int r1 = r6.length
            r0 = 2
            if (r1 != r0) goto L11
            r2 = r6[r4]
            r1 = -1
            if (r2 != r1) goto L13
            r0 = r6[r3]
            if (r0 != r1) goto L21
        L11:
            r4 = 1
        L12:
            return r4
        L13:
            if (r2 == r1) goto L21
            r0 = r6[r3]
            if (r0 != r1) goto L1c
            if (r2 > r7) goto L12
            goto L11
        L1c:
            if (r2 > r7) goto L12
            if (r7 > r0) goto L12
            goto L11
        L21:
            r0 = r6[r3]
            if (r7 > r0) goto L12
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.FilterGroup.isInRange(int[], int):boolean");
    }

    public FilterGroup(int[] iArr, List<Integer> list, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.qualityRange = iArr;
        this.codecList = list;
        this.fpsRange = iArr2;
        this.bitrateRange = iArr3;
        this.minWidthRange = iArr4;
        this.widthRange = iArr5;
        this.heightRange = iArr6;
    }
}
