package com.bytedance.tts.pigeon.paas.components.base;

import X.AnonymousClass0956;
import X.C0XE1;
import X.C0XER;
import X.C0YX4;
import X.C0YX7;
import X.C0YXE;
import X.C13LE;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C821280WJq;
import X.C872060YIy;
import android.os.SystemClock;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonIDCChangeComponent extends AbsPigeonGlobalProtocol implements PigeonIDCChangeComponentApi {
    public final GECPigeon LL;
    public volatile AnonymousClass0956 LLILLJJLI;
    public final C0YXE LLILLL;
    public final C0YX7 LLILZ;
    public long LLILZIL;

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public PigeonIDCChangeComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
        new C0YXE(gECPigeon, C13LE.LIZ(WSManagerComponentApi.class));
        this.LLILLL = new C0YXE(gECPigeon, C13LE.LIZ(PigeonIMLoginStateComponentApi.class));
        this.LLILZ = new C0YX7(0);
        this.LLILZIL = Long.MAX_VALUE;
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.InterfaceC875510YWf
    public final void LJIIIIZZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        C0XE1 c0xe1;
        C0XE1 c0xe12;
        AnonymousClass0956 anonymousClass0956;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ws receive connect event ");
        if (c821280WJq != null) {
            c0xe1 = c821280WJq.LIZIZ;
        } else {
            c0xe1 = null;
        }
        sbLIZ.append(c0xe1);
        sbLIZ.append(", json ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c821280WJq != null && (c0xe12 = c821280WJq.LIZIZ) != null) {
            int i = C0XER.LIZ[c0xe12.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (anonymousClass0956 = this.LLILLJJLI) != null) {
                        anonymousClass0956.LIZIZ(null);
                        return;
                    }
                    return;
                }
                AnonymousClass0956 anonymousClass09562 = this.LLILLJJLI;
                if (anonymousClass09562 == null) {
                    return;
                }
                anonymousClass09562.LIZIZ(null);
                return;
            }
            AnonymousClass0956 anonymousClass09563 = this.LLILLJJLI;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            GECPigeon.Companion.getClass();
            this.LLILLJJLI = C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZJ), null, null, new C0YX4(this, null), 3);
            SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.InterfaceC1364105Vn r14, X.C0YX5 r15) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C0YX6
            if (r0 == 0) goto L74
            r4 = r14
            X.0YX6 r4 = (X.C0YX6) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto L86
            long r0 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L24:
            X.0YX7 r6 = (X.C0YX7) r6
            if (r6 == 0) goto L7a
            long r3 = r6.LIZIZ
            r11 = 0
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 == 0) goto L7a
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9 - r0
            long r4 = r6.LIZIZ
            long r7 = r13.LLILZIL
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L4c
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L4c
            r13.LLILZIL = r2
            r0 = 2
            long r0 = (long) r0
            long r2 = r2 / r0
            long r4 = r4 + r2
            X.C875470YWb.LIZ = r4
            X.C875470YWb.LIZIZ = r9
        L4c:
            return r6
        L4d:
            X.C155000ia.LIZIZ(r6)
            X.0YIy r0 = com.bytedance.tts.pigeon.GECPigeon.Companion
            r0.getClass()
            X.0YWU r0 = X.C872060YIy.LIZ()
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.C786580UtM.LIZ(r0)
            if (r0 != 0) goto L65
            r0 = 0
            return r0
        L65:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.LL = r0
            r4.LLILZ = r2
            java.lang.Object r6 = r15.invoke(r4)
            if (r6 != r3) goto L24
            return r3
        L74:
            X.0YX6 r4 = new X.0YX6
            r4.<init>(r13, r14)
            goto L12
        L7a:
            java.lang.String r1 = "IDCChangeComponent"
            java.lang.String r0 = "calculateServerTime: Received invalid IDCData or timestamp is 0"
            int r0 = android.util.Log.d(r1, r0)
            X.C2286608xc.LJ(r0)
            return r6
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent.LJJLIIIJILLIZJL(X.05Vn, X.0YX5):java.lang.Object");
    }
}
