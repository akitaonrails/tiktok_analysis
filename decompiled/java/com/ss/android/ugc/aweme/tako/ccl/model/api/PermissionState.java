package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C08FF;
import X.C09CS;
import X.C09DL;
import X.C09GR;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.google.gson.TypeAdapter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@C09CS(PermissionStateAdapter.class)
public final class PermissionState {
    public static final C09GR Companion;
    public static final PermissionState DENIED;
    public static final PermissionState GRANTED;
    public static final /* synthetic */ PermissionState[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final PermissionState UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<PermissionState> getEntries() {
        return LLILLL;
    }

    static {
        PermissionState permissionState = new PermissionState("UNKNOWN", 0, 0);
        UNKNOWN = permissionState;
        PermissionState permissionState2 = new PermissionState("DENIED", 1, 1);
        DENIED = permissionState2;
        PermissionState permissionState3 = new PermissionState("GRANTED", 2, 2);
        GRANTED = permissionState3;
        PermissionState[] permissionStateArr = {permissionState, permissionState2, permissionState3};
        LLILLJJLI = permissionStateArr;
        LLILLL = new C2254308sP(permissionStateArr);
        Companion = new C09GR();
    }

    public static PermissionState[] values() {
        return (PermissionState[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static final class PermissionStateAdapter extends TypeAdapter<PermissionState> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState read(X.C09CU r5) throws java.io.IOException {
            /*
                r4 = this;
                X.09D6 r3 = r5.LJJLIIIJ()
                if (r3 != 0) goto L59
                r1 = -1
            L7:
                r0 = 2
                if (r1 == r0) goto L25
                com.google.gson.o r2 = new com.google.gson.o
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "Unexpected token for PermissionState: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                r2.<init>(r0)
                X.C1AF0.LJ(r2)
            L22:
                com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.UNKNOWN
            L24:
                return r1
            L25:
                java.lang.String r2 = r5.LJJJZ()
                java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r2)
                if (r0 == 0) goto L3e
                X.09GR r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.Companion
                int r0 = r0.intValue()
                r1.getClass()
                com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = X.C09GR.LIZ(r0)
                if (r1 != 0) goto L24
            L3e:
                com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.valueOf(r2)     // Catch: java.lang.Throwable -> L46
                X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L46
                goto L52
            L46:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                X.00Yq r1 = new X.00Yq
                r1.<init>(r0)
                X.C189200o6.m2constructorimpl(r1)
            L52:
                boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                if (r0 == 0) goto L71
                goto L22
            L59:
                int[] r1 = X.C09GQ.LIZ
                int r0 = r3.ordinal()
                r1 = r1[r0]
                r0 = 1
                if (r1 != r0) goto L7
                X.09GR r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.Companion
                int r0 = r5.LJJIZ()
                r1.getClass()
                com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = X.C09GR.LIZ(r0)
            L71:
                if (r1 != 0) goto L24
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.PermissionStateAdapter.read(X.09CU):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, PermissionState permissionState) {
            PermissionState permissionState2 = permissionState;
            if (permissionState2 == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJJ(Integer.valueOf(permissionState2.getValue()));
            }
        }
    }

    public static PermissionState valueOf(String str) {
        return (PermissionState) C08FF.LIZ(PermissionState.class, str);
    }

    public PermissionState(String str, int i, int i2) {
        this.LL = i2;
    }
}
