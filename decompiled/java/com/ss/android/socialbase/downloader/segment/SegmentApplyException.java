package com.ss.android.socialbase.downloader.segment;

import X.C2188811AlT;
import com.ss.android.socialbase.downloader.exception.BaseException;

/* JADX INFO: loaded from: classes24.dex */
public class SegmentApplyException extends BaseException {
    public int applyCode;

    /* JADX WARN: Illegal instructions before constructor call */
    public SegmentApplyException(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyCode=");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        super(1072, C2188811AlT.LIZIZ(sbLIZ));
        this.applyCode = i;
    }
}
