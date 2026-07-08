package com.ttnet.org.chromium.net.impl;

import X.C1497220p44;
import X.C1497740p4u;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.h;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class CronetBidirectionalStream extends h {
    public C1497220p44 LIZ;

    private void onCanceled() {
        throw null;
    }

    public static ArrayList<Map.Entry<String, String>> LIZ(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        LIZ(strArr);
        throw null;
    }

    private void onStreamReady(boolean z) {
        throw null;
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            this.LIZ = new C1497220p44(Arrays.asList(null), i, "", LIZ(strArr), false, str, null, j);
            throw null;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            new C1497740p4u("Cannot prepare ResponseInfo", null);
            throw null;
        }
    }

    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        throw null;
    }

    private void onError(final int i, final int i2, int i3, String str, long j) {
        C1497220p44 c1497220p44 = this.LIZ;
        if (c1497220p44 != null) {
            c1497220p44.LJI.set(j);
        }
        if (i != 10 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception in BidirectionalStream: ");
            sbLIZ.append(str);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            new NetworkExceptionImpl(strLIZIZ, i, i2) { // from class: X.0p4s
                @Override // com.ttnet.org.chromium.net.impl.NetworkExceptionImpl, X.AbstractC1497710p4r
                public boolean immediatelyRetryable() {
                    int i4 = this.mCronetInternalErrorCode;
                    if (i4 == -358 || i4 == -352) {
                        return true;
                    }
                    return super.immediatelyRetryable();
                }
            };
            throw null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Exception in BidirectionalStream: ");
        sbLIZ2.append(str);
        new o0(C2188811AlT.LIZIZ(sbLIZ2), i, i2, i3);
        throw null;
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.LIZ.LJI.set(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (i >= 0 && (i4 = i2 + i) <= i3) {
                byteBuffer.position(i4);
                throw null;
            }
            new C1497740p4u("Invalid number of bytes read", null);
            throw null;
        }
        new C1497740p4u("ByteBuffer modified externally during read", null);
        throw null;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        throw null;
    }
}
