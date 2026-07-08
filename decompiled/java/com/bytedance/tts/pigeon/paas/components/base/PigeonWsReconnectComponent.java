package com.bytedance.tts.pigeon.paas.components.base;

import X.C0YXD;
import X.C786580UtM;
import X.C821280WJq;
import X.C845290XDz;
import X.C872060YIy;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import kotlin.jvm.internal.AFwS248S0000000_14;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonWsReconnectComponent extends AbsPigeonGlobalProtocol {
    public final GECPigeon LL;
    public long LLILLJJLI;
    public final int LLILLL = LivePreCreateNextRoomPlayer.ENABLE;
    public long LLILZ;
    public boolean LLILZIL;

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public PigeonWsReconnectComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.InterfaceC875510YWf
    public final void LJIIIIZZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        if (c821280WJq != null) {
            int i = C845290XDz.LIZ[c821280WJq.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    this.LL.getPigeonIMClient().LJIILJJIL().LIZJ();
                    GECPigeon.Companion.getClass();
                    if (!C786580UtM.LIZ(C872060YIy.LIZ().getApplicationContext())) {
                        this.LLILZ = 0L;
                        this.LLILZIL = true;
                        return;
                    }
                    return;
                }
                this.LL.getPigeonIMClient().LJIILJJIL().LJ();
                if (((this.LLILZ > 0 && SystemClock.elapsedRealtime() - this.LLILZ > this.LLILLL) || this.LLILZIL) && SystemClock.elapsedRealtime() - this.LLILLJJLI > this.LLILLL) {
                    this.LLILLJJLI = SystemClock.elapsedRealtime();
                    C0YXD.LIZJ(this.LL, AFwS248S0000000_14.get$arr$(466));
                    this.LL.getPigeonIMClient().LIZ().LIZIZ(-2, false, null, 3);
                }
                this.LLILZIL = false;
                this.LLILZ = 0L;
                return;
            }
            if (this.LLILZ > 0) {
                return;
            }
            this.LLILZ = SystemClock.elapsedRealtime();
        }
    }
}
