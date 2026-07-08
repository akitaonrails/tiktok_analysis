package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283530jVP;
import X.C1283590jVV;
import X.C1954807lC;
import X.C1CIG;
import X.C1CJW;
import X.C1CJX;
import X.C2182931Abz;
import X.C2183001Ac6;
import X.C2183251AcV;
import X.C2228571CKh;
import X.C2231651CWd;
import X.C2236901Cgq;
import X.C2237141ChE;
import X.C2237171ChH;
import X.C972620bPw;
import X.C972640bPy;
import X.C972890bQN;
import X.C972920bQQ;
import X.InterfaceC2181451AZb;
import X.InterfaceC2182941Ac0;
import X.InterfaceC2183241AcU;
import X.InterfaceC2228581CKi;
import X.InterfaceC968360bJ4;
import X.InterfaceC972720bQ6;
import X.InterfaceC972880bQM;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class LinkMicConfig extends AbstractC1283560jVS {
    public static final native long MoltenFfiNativeNewX8348875185625849960(ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicConfig_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicConfig_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public final long LIZIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            return ((C1283590jVV) abstractC1283580jVU).LIZ;
        }
        throw new C1954807lC();
    }

    public LinkMicConfig(long j, boolean z, C972620bPw c972620bPw, C972640bPy c972640bPy, InterfaceC2181451AZb interfaceC2181451AZb, InterfaceC972720bQ6 interfaceC972720bQ6, InterfaceC2183241AcU interfaceC2183241AcU, InterfaceC2182941Ac0 interfaceC2182941Ac0, InterfaceC2228581CKi interfaceC2228581CKi, C1CJX c1cjx, InterfaceC972880bQM interfaceC972880bQM, InterfaceC968360bJ4 interfaceC968360bJ4) {
        C1CIG c1cigLJII;
        Long lValueOf = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z);
        c972620bPw.getClass();
        C2236901Cgq c2236901Cgq = new C2236901Cgq(Long.valueOf(c972620bPw.LIZ), Long.valueOf(c972620bPw.LIZIZ), c972620bPw.LIZJ.into(), Long.valueOf(c972620bPw.LIZLLL));
        c972640bPy.getClass();
        C2237171ChH c2237171ChH = new C2237171ChH(Long.valueOf(c972640bPy.LIZ), Long.valueOf(c972640bPy.LIZIZ), c972640bPy.LIZJ);
        C1CIG c1cigLJIIIIZZ = C2231651CWd.LJIIIIZZ(interfaceC2181451AZb);
        C2183001Ac6 c2183001Ac6 = new C2183001Ac6(interfaceC972720bQ6);
        C972890bQN c972890bQN = C972890bQN.LIZ;
        C1CIG c1cig = new C1CIG(2169935421294370623L, Long.valueOf(c972890bQN.LIZ(c2183001Ac6)));
        C1CIG c1cig2 = new C1CIG(3915607051327902582L, Long.valueOf(c972890bQN.LIZ(new C2183251AcV(interfaceC2183241AcU))));
        C1CIG c1cig3 = new C1CIG(3815187619234093404L, Long.valueOf(c972890bQN.LIZ(new C2182931Abz(interfaceC2182941Ac0))));
        C1CIG c1cig4 = new C1CIG(-318168587056539776L, Long.valueOf(c972890bQN.LIZ(new C2228571CKh(interfaceC2228581CKi))));
        C1CIG c1cig5 = new C1CIG(6911591507675943442L, Long.valueOf(c972890bQN.LIZ(new C1CJW(c1cjx))));
        if (interfaceC972880bQM != null) {
            c1cigLJII = C2231651CWd.LJII(interfaceC972880bQM);
        } else {
            c1cigLJII = null;
        }
        C2237141ChE c2237141ChE = new C2237141ChE(lValueOf, boolValueOf, c2236901Cgq, c2237171ChH, c1cigLJIIIIZZ, c1cig, c1cig2, c1cig3, c1cig4, c1cig5, c1cigLJII, interfaceC968360bJ4 != null ? new C1CIG(-1465185844111376282L, Long.valueOf(c972890bQN.LIZ(new C972920bQQ(interfaceC968360bJ4)))) : null);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(C2237141ChE.ADAPTER.encodedSize(c2237141ChE));
        c2237141ChE.encode(new C1283530jVP(byteBufferAllocateDirect));
        super(new C1283590jVV(MoltenFfiNativeNewX8348875185625849960(byteBufferAllocateDirect)));
    }
}
