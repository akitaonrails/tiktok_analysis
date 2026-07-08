package com.ss.android.ugc.aweme.freqcontrol;

import X.C06NJ;
import X.C06RA;
import X.C06RC;
import X.C06RE;
import X.C06RF;
import X.C06RH;
import X.C0I0B;
import X.C0W8I;
import X.C13LP;
import X.C1419505h3;
import X.C15600068w;
import X.C1675706hH;
import X.C1676706hR;
import X.C1954807lC;
import X.C2188811AlT;
import X.C869590Y9l;
import X.C894660Z7w;
import X.EnumC15599068v;
import X.InterfaceC1677406hY;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PromptUnifiedFrequencyController implements IPromptUnifiedFrequencyController {
    public final Map<String, C06RC> LIZIZ = new LinkedHashMap();
    public final ConcurrentLinkedDeque<C06RA> LIZJ = new ConcurrentLinkedDeque<>();

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final Map<String, C06RC> LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJIIJ(String str) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exiting room for ");
        sbLIZ.append(str);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ), str);
        c06rc.l0();
        this.LIZIZ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LIZ(String str, InterfaceC1677406hY interfaceC1677406hY) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set Hidden ");
        sbLIZ.append(interfaceC1677406hY);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ), str);
        c06rc.v0(interfaceC1677406hY);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LIZIZ(String str, List<? extends C869590Y9l> list) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        LJIIL(this, "Store Messages", str);
        c06rc.o0(list);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LIZJ(String str, List<? extends EnumC15599068v> list) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set Expected ");
        sbLIZ.append(list);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ), str);
        c06rc.n0(list);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJFF(String str, C06RF c06rf) {
        C06RC c06rc;
        EnumC15599068v enumC15599068v;
        EnumC15599068v enumC15599068v2;
        List<EnumC15599068v> listLJLILLLLZI;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        int chatType = c06rc.getChatType();
        int i = C06RE.LIZ[c06rf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (C06NJ.LIZJ()) {
                    listLJLILLLLZI = C15600068w.LIZJ;
                } else {
                    List<EnumC15599068v> list = C15600068w.LIZJ;
                    if (chatType == 3) {
                        enumC15599068v2 = EnumC15599068v.GROUP_CHAT_NOTICE_GET_MESSAGE_EVENT;
                    } else {
                        enumC15599068v2 = EnumC15599068v.SINGLE_CHAT_NOTICE_GET_MESSAGE_EVENT;
                    }
                    listLJLILLLLZI = C13LP.LJLILLLLZI(enumC15599068v2, list);
                }
                LIZJ(str, listLJLILLLLZI);
                return;
            }
            throw new C1954807lC();
        }
        List<EnumC15599068v> list2 = C15600068w.LIZIZ;
        if (chatType == 3) {
            enumC15599068v = EnumC15599068v.GROUP_CHAT_NOTICE_SEND_MESSAGE_EVENT;
        } else {
            enumC15599068v = EnumC15599068v.SINGLE_CHAT_NOTICE_SEND_MESSAGE_EVENT;
        }
        LIZJ(str, C13LP.LJLILLLLZI(enumC15599068v, list2));
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJI(String str, EnumC15599068v enumC15599068v) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release Hold Item ");
        sbLIZ.append(enumC15599068v);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ), str);
        c06rc.t0(enumC15599068v);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJIIIZ(long j, String str) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        c06rc.q0(j);
    }

    public static void LJIIL(PromptUnifiedFrequencyController promptUnifiedFrequencyController, String str, String str2) {
        C06RH c06rh = C06RH.CONTROLLER;
        promptUnifiedFrequencyController.getClass();
        promptUnifiedFrequencyController.LJ(c06rh, str, str2, false);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJIIJJI(String str, InterfaceC1677406hY interfaceC1677406hY, boolean z) {
        C06RC c06rc;
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || (c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set Shown ");
        sbLIZ.append(interfaceC1677406hY);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ), str);
        c06rc.s0(interfaceC1677406hY, z);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LIZLLL(int i, String str, String str2, AwS546S0100000_2 awS546S0100000_2) {
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL) {
            return;
        }
        if (i != 2 && i != 25) {
            if (((LinkedHashMap) this.LIZIZ).get(str2) == null) {
                LJIIL(this, "Creating room", str2);
                C1675706hH c1675706hH = new C1675706hH(str, str2, i);
                c1675706hH.LIZLLL = awS546S0100000_2;
                this.LIZIZ.put(str2, c1675706hH);
                return;
            }
            LJIIL(this, "Reusing room", str2);
            C06RC c06rc = (C06RC) ((LinkedHashMap) this.LIZIZ).get(str2);
            if (c06rc == null) {
                return;
            }
            c06rc.m0(awS546S0100000_2);
            return;
        }
        C06RH c06rh = C06RH.SHARED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported room type ");
        sbLIZ.append(i);
        LJ(c06rh, C2188811AlT.LIZIZ(sbLIZ), str2, false);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    public final void LJ(C06RH c06rh, String str, String str2, boolean z) {
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL) {
            return;
        }
        if (C1676706hR.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UFC ");
            sbLIZ.append(c06rh.getTitle());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0W8I.LIZ.getClass();
        if (!C0W8I.LIZIZ() && !C0W8I.LIZJ()) {
            C0I0B.LJFF.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        ConcurrentLinkedDeque<C06RA> concurrentLinkedDeque = this.LIZJ;
        System.currentTimeMillis();
        concurrentLinkedDeque.add((C06RA) new Object() { // from class: X.06RA
            {
                UUID.randomUUID().toString();
            }
        });
        if (this.LIZJ.size() > 300) {
            this.LIZJ.removeFirst();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r11, X.InterfaceC1677406hY r12, java.lang.Long r13, long r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            r10 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C06RD
            if (r0 == 0) goto L70
            r9 = r3
            X.06RD r9 = (X.C06RD) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r9.LLILLL = r2
        L14:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L76
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.05h3 r0 = X.C1419505h3.LIZ
            r0.getClass()
            boolean r0 = X.C1419505h3.LIZLLL
            if (r0 != 0) goto L40
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L40:
            java.util.Map<java.lang.String, X.06RC> r0 = r10.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r4 = r0.get(r11)
            X.06RC r4 = (X.C06RC) r4
            if (r4 != 0) goto L51
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L51:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Check & Show "
            r1.append(r0)
            r5 = r12
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIIL(r10, r0, r11)
            r9.LLILLL = r2
            r7 = r14
            r6 = r13
            java.lang.Object r1 = r4.x0(r5, r6, r7, r9)
            if (r1 != r3) goto L24
            return r3
        L70:
            X.06RD r9 = new X.06RD
            r9.<init>(r10, r3)
            goto L14
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freqcontrol.PromptUnifiedFrequencyController.LJII(java.lang.String, X.06hY, java.lang.Long, long, X.05Vn):java.lang.Object");
    }
}
