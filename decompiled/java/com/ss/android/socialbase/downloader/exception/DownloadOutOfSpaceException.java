package com.ss.android.socialbase.downloader.exception;

import X.C2199751B7l;
import X.C786410Ut5;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public class DownloadOutOfSpaceException extends BaseException {
    public final long avaliableSpaceBytes;
    public final long requiredSpaceBytes;

    public long getAvaliableSpaceBytes() {
        return this.avaliableSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadOutOfSpaceException(long j, long j2) {
        long j3;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(j2);
        int iLJIIIIZZ = C2199751B7l.LJFF.LJIIIIZZ("report_space_grain_size", 50);
        if (iLJIIIIZZ > 0) {
            long j4 = iLJIIIIZZ;
            j3 = ((j / 1048576) / j4) * j4;
        } else if (iLJIIIIZZ < 0) {
            j3 = 0;
        } else {
            j3 = j / 1048576;
        }
        objArr[1] = Long.valueOf(j3 * 1048576);
        super(1006, C786410Ut5.k4(locale, "space is not enough required space is : %d but available space is :%d", objArr));
        this.avaliableSpaceBytes = j;
        this.requiredSpaceBytes = j2;
    }
}
