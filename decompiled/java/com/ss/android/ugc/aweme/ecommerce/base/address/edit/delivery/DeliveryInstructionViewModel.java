package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.C004I;
import X.C1747010vYx;
import X.C238400w2;
import X.InterfaceC1164530gPT;
import android.os.SystemClock;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import java.util.HashMap;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS6S1310000_26;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes27.dex */
public class DeliveryInstructionViewModel extends JediViewModel<DeliveryInstructionState> implements InterfaceC1164530gPT {
    public C1747010vYx LLILZIL;
    public Address LLILZLL;
    public HashMap<String, Object> LLIZ;
    public long LLIZLLLIL;
    public final long LLJ = -1;
    public final int LLJI = 1;
    public String LLJIJIL = "";
    public final HashMap<String, Regex> LLJILJIL = new HashMap<>();

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new DeliveryInstructionState(0, null, null, false, null, null, null, null, null, null, null, 2047, null);
    }

    public static void jR2(DeliveryInstructionViewModel deliveryInstructionViewModel) {
        deliveryInstructionViewModel.getClass();
        deliveryInstructionViewModel.setState(new AwS38S0001000_26(Integer.MIN_VALUE, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Object> hR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L5
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L5:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = r11.title
            if (r0 == 0) goto L14
            int r0 = r0.length()
            if (r0 != 0) goto L57
        L14:
            java.lang.String r0 = r11.description
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L57
        L1e:
            X.0vYx r0 = r10.LLILZIL
            r5 = 0
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo r4 = r0.LJFF
            if (r4 != 0) goto L2d
        L27:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r10.LLILZLL
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo r4 = r0.deliveryInstructionInfo
        L2d:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption> r0 = r11.options
            if (r0 == 0) goto Lb6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption) r0
            java.lang.Integer r0 = r0.instructionType
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
            if (r0 == 0) goto L3a
        L51:
            r3.add(r1)
            goto L3a
        L55:
            r4 = r5
            goto L2d
        L57:
            X.0vVh r3 = new X.0vVh
            java.lang.String r2 = r11.title
            java.lang.String r1 = r11.description
            java.lang.String r0 = r11.uiStyle
            r3.<init>(r2, r1, r0)
            r6.add(r3)
            goto L1e
        L66:
            java.util.Iterator r9 = r3.iterator()
            r8 = 0
        L6b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r7 = r9.next()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption r7 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption) r7
            if (r8 != 0) goto Lb4
            java.lang.Integer r1 = r7.instructionType
            if (r4 == 0) goto Lb2
            java.lang.Integer r0 = r4.instructionType
        L7f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb4
            r3 = 1
            java.lang.Integer r0 = r7.instructionType
            if (r0 == 0) goto L98
            int r1 = r0.intValue()
            r0 = 100
            if (r1 != r0) goto L98
            if (r4 == 0) goto Lb0
            java.lang.String r0 = r4.instruction
        L96:
            r10.LLJIJIL = r0
        L98:
            X.0vXp r2 = new X.0vXp
            java.lang.String r0 = r11.uiStyle
            r2.<init>(r7, r3, r5, r0)
            r6.add(r2)
            if (r3 == 0) goto L6b
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 159(0x9f, float:2.23E-43)
            r1.<init>(r2, r0)
            r10.setState(r1)
            r8 = 1
            goto L6b
        Lb0:
            r0 = r5
            goto L96
        Lb2:
            r0 = r5
            goto L7f
        Lb4:
            r3 = 0
            goto L98
        Lb6:
            jR2(r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel.hR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1745340vWG kR2(java.lang.String r20, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule> r21) {
        /*
            r19 = this;
            r6 = 1
            r11 = 0
            r13 = 0
            if (r21 == 0) goto L56
            java.util.Iterator r2 = r21.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule) r0
            java.lang.String r0 = r0.regex
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 != 0) goto L9
        L20:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule) r1
            if (r1 == 0) goto L56
            java.lang.String r9 = r1.error
        L26:
            r7 = r20
            if (r7 == 0) goto Lb3
            int r0 = r7.length()
            if (r0 == 0) goto Lb3
            if (r21 == 0) goto L66
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r21.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule) r0
            java.lang.String r0 = r0.regex
            boolean r0 = X.C703302op.LIZ(r0)
            if (r0 == 0) goto L3b
            r3.add(r1)
            goto L3b
        L54:
            r1 = r13
            goto L20
        L56:
            r9 = r13
            goto L26
        L58:
            if (r0 == 0) goto L78
            boolean r0 = r0.containsMatchIn(r7)
            if (r0 != r6) goto L78
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule) r8
            if (r8 == 0) goto L66
            java.lang.String r13 = r8.error
        L66:
            X.0vWG r12 = new X.0vWG
            r14 = 0
            r18 = 30
            r15 = r11
            r16 = r14
            r17 = r14
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        L74:
            java.util.Iterator r9 = r3.iterator()
        L78:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r8 = r9.next()
            r0 = r8
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule) r0
            java.lang.String r5 = r0.regex
            if (r5 == 0) goto L78
            r10 = r19
            java.util.HashMap<java.lang.String, kotlin.text.Regex> r0 = r10.LLJILJIL
            java.lang.Object r0 = r0.get(r5)
            if (r0 != 0) goto La8
            java.util.HashMap<java.lang.String, kotlin.text.Regex> r4 = r10.LLJILJIL
            kotlin.text.Regex r3 = new kotlin.text.Regex
            byte[] r2 = android.util.Base64.decode(r5, r11)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r0)
            r3.<init>(r1)
            r4.put(r5, r3)
        La8:
            java.util.HashMap<java.lang.String, kotlin.text.Regex> r0 = r10.LLJILJIL
            java.lang.Object r0 = r0.get(r5)
            kotlin.text.Regex r0 = (kotlin.text.Regex) r0
            goto L58
        Lb1:
            r8 = r13
            goto L60
        Lb3:
            X.0vWG r8 = new X.0vWG
            r10 = 0
            r14 = 30
            r12 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel.kR2(java.lang.String, java.util.List):X.0vWG");
    }

    public final void iR2(long j, String str, boolean z) {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime() - j;
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = SystemClock.elapsedRealtime() - this.LLJ;
        if (!z) {
            c238400w22.element = 0L;
            c238400w2.element = 0L;
        }
        setState(new AwS6S1310000_26(z, str, c238400w2, c238400w22, this, 1));
    }
}
