package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class AIGCEntranceHasCameo {
    public static final /* synthetic */ int LIZ = 0;

    public static final class GsonAdapter extends TypeAdapter<Integer> {
        /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[PHI: r0
          0x003c: PHI (r0v4 int) = (r0v3 int), (r0v3 int), (r0v8 int), (r0v8 int) binds: [B:24:0x0037, B:25:0x0039, B:20:0x002e, B:21:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Integer read(X.C09CU r6) throws java.io.IOException {
            /*
                r5 = this;
                X.09D6 r0 = r6.LJJLIIIJ()
                if (r0 != 0) goto L43
                r4 = -1
            L7:
                r3 = 1
                if (r4 == r3) goto L3e
                r2 = 0
                r1 = 2
                if (r4 == r1) goto L33
                r0 = 3
                if (r4 == r0) goto L20
                r0 = 4
                if (r4 == r0) goto L1c
                r6.LJJZ()
            L17:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                return r0
            L1c:
                r6.LJJJJJL()
                goto L17
            L20:
                java.lang.String r0 = r6.LJJJZ()
                java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
                if (r0 == 0) goto L17
                int r0 = r0.intValue()
                if (r0 == r3) goto L3c
                if (r0 == r1) goto L3c
                goto L17
            L33:
                int r0 = r6.LJJIZ()
                if (r0 == r3) goto L3c
                if (r0 == r1) goto L3c
                goto L17
            L3c:
                r2 = r0
                goto L17
            L3e:
                boolean r2 = r6.LJJ()
                goto L17
            L43:
                int[] r1 = X.C09EO.LIZ
                int r0 = r0.ordinal()
                r4 = r1[r0]
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceHasCameo.GsonAdapter.read(X.09CU):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Integer num) {
            int iIntValue;
            Integer num2 = num;
            int i = 0;
            if (num2 != null && ((iIntValue = num2.intValue()) == 1 || iIntValue == 2)) {
                i = iIntValue;
            }
            c09dl.LJJJJ(Integer.valueOf(i));
        }
    }
}
