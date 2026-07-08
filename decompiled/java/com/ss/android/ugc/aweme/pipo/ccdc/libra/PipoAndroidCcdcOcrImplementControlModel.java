package com.ss.android.ugc.aweme.pipo.ccdc.libra;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class PipoAndroidCcdcOcrImplementControlModel {

    @C09CT("by_entrance")
    public final Map<String, PipoAndroidCcdcOcrImplementControlModel> byEntrance;

    @C09CT("show_ocr_result")
    public final boolean showOcrResult;

    @C09CT("bd_ocr")
    public final boolean useBytedanceOcr;

    @C09CT("clientai_ocr")
    public final boolean useClientAIOcr;

    @C09CT("mb_ocr")
    public final boolean useMicroblinkOcr;

    public PipoAndroidCcdcOcrImplementControlModel() {
        this(true, true, false, true, null);
    }

    public PipoAndroidCcdcOcrImplementControlModel(boolean z, boolean z2, boolean z3, boolean z4, Map<String, PipoAndroidCcdcOcrImplementControlModel> map) {
        this.useMicroblinkOcr = z;
        this.useBytedanceOcr = z2;
        this.useClientAIOcr = z3;
        this.showOcrResult = z4;
        this.byEntrance = map;
    }
}
