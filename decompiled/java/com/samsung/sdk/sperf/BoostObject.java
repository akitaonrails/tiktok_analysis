package com.samsung.sdk.sperf;

/* JADX INFO: loaded from: classes32.dex */
public class BoostObject {
    public static int[] priority = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 2};
    public int id;
    public int[] levels;
    public int[] timeouts;

    public BoostObject() {
        this.id = -1;
        this.levels = new int[11];
        this.timeouts = new int[11];
        int i = 0;
        do {
            this.levels[i] = 64532198;
            this.timeouts[i] = 64532198;
            i++;
        } while (i < 11);
    }

    public BoostObject(int[] iArr, int[] iArr2) {
        this.id = -1;
        this.levels = new int[iArr.length];
        this.timeouts = new int[iArr2.length];
        for (int i = 0; i < iArr.length; i++) {
            this.levels[i] = iArr[i];
        }
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.timeouts[i2] = iArr2[i2];
        }
    }

    public BoostObject copyBoostObject() {
        return new BoostObject(this.levels, this.timeouts);
    }

    public int getID() {
        return this.id;
    }

    public int getLevel(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.levels[i];
    }

    public int getTimeout(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.timeouts[i];
    }

    public void setID(int i) {
        this.id = i;
    }

    public int update(int i, int i2, int i3) {
        if (i > 11 || i < 0) {
            return -1;
        }
        this.levels[i] = i2;
        this.timeouts[i] = i3;
        SPerfUtil.log("Update Boost - type : " + i + "   level : " + this.levels[i] + "   timeouts : " + this.timeouts[i]);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: ArrayIndexOutOfBoundsException -> 0x0057, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0057, blocks: (B:8:0x000b, B:10:0x0014, B:12:0x001a, B:14:0x0020, B:17:0x0028, B:20:0x0035, B:23:0x0041, B:24:0x004a, B:25:0x0054), top: B:30:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean combineBoostObject(com.samsung.sdk.sperf.BoostObject r10) {
        /*
            r9 = this;
            r8 = 0
            if (r10 != 0) goto L4
            return r8
        L4:
            r3 = 0
        L5:
            int[] r0 = r9.levels
            int r0 = r0.length
            r7 = 1
            if (r3 >= r0) goto L6d
            int r6 = r10.getLevel(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r1 = 64532198(0x3d8aee6, float:1.2735494E-36)
            if (r6 == r1) goto L54
            int[] r5 = r9.levels     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r4 = r5[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            if (r4 == r1) goto L4a
            int[] r2 = r9.timeouts     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r0 = r2[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            if (r0 == r1) goto L4a
            int[] r0 = com.samsung.sdk.sperf.BoostObject.priority     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r1 = r0[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            if (r1 != 0) goto L31
            if (r4 >= r6) goto L54
            r5[r3] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            int r0 = r10.getTimeout(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r2[r3] = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            goto L54
        L31:
            if (r1 != r7) goto L3e
            if (r4 <= r6) goto L54
            r5[r3] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            int r0 = r10.getTimeout(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r2[r3] = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            goto L54
        L3e:
            r0 = 2
            if (r1 != r0) goto L54
            r5[r3] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            int r0 = r10.getTimeout(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r2[r3] = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            goto L54
        L4a:
            r5[r3] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            int[] r1 = r9.timeouts     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            int r0 = r10.getTimeout(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r1[r3] = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
        L54:
            int r3 = r3 + 1
            goto L5
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Combine Boost Object has array out of bounds on type : "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.samsung.sdk.sperf.SPerfUtil.log(r0)
            return r8
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostObject.combineBoostObject(com.samsung.sdk.sperf.BoostObject):boolean");
    }
}
