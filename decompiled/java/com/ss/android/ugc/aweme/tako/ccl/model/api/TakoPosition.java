package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C08FF;
import X.C09CS;
import X.C09DL;
import X.C09GX;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.google.gson.TypeAdapter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@C09CS(TakoPositionAdapter.class)
public final class TakoPosition {
    public static final TakoPosition CHAT_PAGE;
    public static final C09GX Companion;
    public static final TakoPosition FEED_CHAT;
    public static final TakoPosition FEED_VOICE;
    public static final /* synthetic */ TakoPosition[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<TakoPosition> getEntries() {
        return LLILLL;
    }

    static {
        TakoPosition takoPosition = new TakoPosition("CHAT_PAGE", 0, 0);
        CHAT_PAGE = takoPosition;
        TakoPosition takoPosition2 = new TakoPosition("FEED_VOICE", 1, 1);
        FEED_VOICE = takoPosition2;
        TakoPosition takoPosition3 = new TakoPosition("FEED_CHAT", 2, 2);
        FEED_CHAT = takoPosition3;
        TakoPosition[] takoPositionArr = {takoPosition, takoPosition2, takoPosition3};
        LLILLJJLI = takoPositionArr;
        LLILLL = new C2254308sP(takoPositionArr);
        Companion = new C09GX();
    }

    public static TakoPosition[] values() {
        return (TakoPosition[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static final class TakoPositionAdapter extends TypeAdapter<TakoPosition> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition read(X.C09CU r5) throws java.io.IOException {
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
                java.lang.String r0 = "Unexpected token for TakoPosition: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                r2.<init>(r0)
                X.C1AF0.LJ(r2)
            L22:
                com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.CHAT_PAGE
            L24:
                return r1
            L25:
                java.lang.String r2 = r5.LJJJZ()
                java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r2)
                if (r0 == 0) goto L3e
                X.09GX r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.Companion
                int r0 = r0.intValue()
                r1.getClass()
                com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition r1 = X.C09GX.LIZ(r0)
                if (r1 != 0) goto L24
            L3e:
                com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.valueOf(r2)     // Catch: java.lang.Throwable -> L46
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
                int[] r1 = X.C09GW.LIZ
                int r0 = r3.ordinal()
                r1 = r1[r0]
                r0 = 1
                if (r1 != r0) goto L7
                X.09GX r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.Companion
                int r0 = r5.LJJIZ()
                r1.getClass()
                com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition r1 = X.C09GX.LIZ(r0)
            L71:
                if (r1 != 0) goto L24
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.TakoPositionAdapter.read(X.09CU):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, TakoPosition takoPosition) {
            TakoPosition takoPosition2 = takoPosition;
            if (takoPosition2 == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJJ(Integer.valueOf(takoPosition2.getValue()));
            }
        }
    }

    public static TakoPosition valueOf(String str) {
        return (TakoPosition) C08FF.LIZ(TakoPosition.class, str);
    }

    public TakoPosition(String str, int i, int i2) {
        this.LL = i2;
    }
}
