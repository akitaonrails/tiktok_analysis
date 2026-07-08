package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CandInputDataOptions {

    @C09CT("header")
    public final CandiHeader candHeader;

    @C09CT("options")
    public final List<CandInputData> candInputOptions;

    @C09CT("manual_guide")
    public final ECRichText manualGuide;

    @C09CT("report")
    public final String report;

    @C09CT("session_key")
    public final String sessionKey;

    @C09CT("view_style")
    public final ViewStyle viewStyle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandInputDataOptions)) {
            return false;
        }
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        return Intrinsics.LJFF(this.candInputOptions, candInputDataOptions.candInputOptions) && Intrinsics.LJFF(this.candHeader, candInputDataOptions.candHeader) && Intrinsics.LJFF(this.sessionKey, candInputDataOptions.sessionKey) && Intrinsics.LJFF(this.report, candInputDataOptions.report) && Intrinsics.LJFF(this.viewStyle, candInputDataOptions.viewStyle) && Intrinsics.LJFF(this.manualGuide, candInputDataOptions.manualGuide);
    }

    public CandInputDataOptions(List<CandInputData> list, CandiHeader candiHeader, String str, String str2, ViewStyle viewStyle, ECRichText eCRichText) {
        this.candInputOptions = list;
        this.candHeader = candiHeader;
        this.sessionKey = str;
        this.report = str2;
        this.viewStyle = viewStyle;
        this.manualGuide = eCRichText;
    }
}
