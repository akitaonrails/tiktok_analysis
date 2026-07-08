package com.bytedance.tts.pigeon.paas.components.base;

import X.AnonymousClass0956;
import X.C054G;
import X.C09A1;
import X.C0YTD;
import X.C0YWR;
import X.C0YWT;
import X.C0YXD;
import X.C0YXE;
import X.C13LE;
import X.C1BNE;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23118094a;
import X.C23119094b;
import X.C23250099c;
import X.C317670Ccn;
import X.C317680Cco;
import X.C872060YIy;
import X.InterfaceC497601wk;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS29S0010000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonIMLogicComponent extends AbsPigeonGlobalProtocol implements PigeonIMLoginStateComponentApi {
    public final GECPigeon LL;
    public C054G LLILLL;
    public AnonymousClass0956 LLILZ;
    public final C0YXE LLILZIL;
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(Boolean.FALSE);
    public final C2252321DDq LLILZLL = C1BNE.LIZ(new C0YWT(0, null, null, null, null, null, null, 0, 0, null, 0, 8191));

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final synchronized void LJIILLIIL() {
        LJJJJIZL(new AwS593S0100000_14(this, 8), false);
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final synchronized void LJJI() {
        if (this.LL.getPigeonIMClient().isLogin()) {
            this.LL.getPigeonIMClient().logout();
            LJJLIIIJJI(false);
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIL() {
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZ), null, null, new C0YWR(this, null), 3);
    }

    public final InterfaceC497601wk LJJLIIIJILLIZJL() {
        C054G c054g = this.LLILLL;
        if (c054g != null) {
            return c054g;
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        GECPigeon.Companion.getClass();
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C872060YIy.LIZ().LIZJ().LIZ));
        this.LLILLL = c054gLIZ;
        return c054gLIZ;
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final InterfaceC497601wk LJJJJJ() {
        return LJJLIIIJILLIZJL();
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final C2252321DDq LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final C2252321DDq LJJJJI() {
        return this.LLILZLL;
    }

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public PigeonIMLogicComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
        this.LLILZIL = new C0YXE(gECPigeon, C13LE.LIZ(WSManagerComponentApi.class));
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final void LJIIL(C0YWT c0ywt) {
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZJ), null, null, new C317680Cco(this, c0ywt, null), 3);
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final synchronized void LJIILL(C0YWT c0ywt) {
        if (this.LL.getPigeonIMClient().isLogin()) {
            return;
        }
        this.LL.login(c0ywt);
        LJJLIIIJJI(true);
    }

    public final void LJJLIIIJJI(boolean z) {
        CoroutineContext coroutineContext;
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue() == z) {
            return;
        }
        C23250099c.LIZLLL(LJJLIIIJILLIZJL(), null, null, new C317670Ccn(this, z, null), 3);
        C0YXD.LIZJ(this.LL, new AwS29S0010000_14(z, 1));
        if (!z) {
            C054G c054g = this.LLILLL;
            if (c054g != null && (coroutineContext = c054g.LL) != null) {
                C23118094a.LIZJ(coroutineContext, null);
            }
            this.LLILLL = null;
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.InterfaceC875510YWf
    public final void LJJIZ(int i, int i2) {
        LJIILLIIL();
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi
    public final void LJJJJIZL(Function1 function1, boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        GECPigeon.Companion.getClass();
        this.LLILZ = C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZJ), null, null, new C0YTD(this, z, function1, null), 3);
    }
}
