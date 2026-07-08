package kotlin.jvm.internal;

import X.C09AY;
import X.C1004300cF2;
import X.C12F5;
import X.C12FE;
import X.C1382930m5j;
import X.C1857570yRH;
import X.C1858670yT3;
import X.C1863500yaq;
import X.C2217381BqS;
import X.C259800zU;
import X.C326880Cre;
import X.DialogC1389620mGW;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS0S7810100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j16;
    public Object l10;
    public Object l11;
    public Object l12;
    public Object l13;
    public Object l14;
    public Object l7;
    public Object l8;
    public Object l9;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public String s6;
    public boolean z15;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S7810100_27 awS0S7810100_27, Object obj) {
        C12FE c12fe = (C12FE) obj;
        c12fe.LIZ = new C1857570yRH((TakoMultipleSelectVM) awS0S7810100_27.l7, awS0S7810100_27.z15, (InterfaceC665370Q7z) awS0S7810100_27.l8, (Map) awS0S7810100_27.l9, awS0S7810100_27.s0);
        c12fe.LIZIZ = new AwS571S0100000_27((TakoMultipleSelectVM) awS0S7810100_27.l7, 1335);
        boolean z = awS0S7810100_27.z15;
        TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS0S7810100_27.l7;
        View view = (View) awS0S7810100_27.l10;
        Map map = (Map) awS0S7810100_27.l9;
        String str = awS0S7810100_27.s0;
        String str2 = awS0S7810100_27.s1;
        long j = awS0S7810100_27.j16;
        Long l = (Long) awS0S7810100_27.l11;
        String str3 = awS0S7810100_27.s2;
        String str4 = awS0S7810100_27.s3;
        String str5 = awS0S7810100_27.s4;
        String str6 = awS0S7810100_27.s5;
        c12fe.LIZJ = new AwS0S7810100_27(j, view, (InterfaceC665370Q7z) awS0S7810100_27.l8, (TakoCardAbility) awS0S7810100_27.l13, takoMultipleSelectVM, (IMessageAbility) awS0S7810100_27.l14, (Integer) awS0S7810100_27.l12, l, str, str2, str3, str4, str5, str6, awS0S7810100_27.s6, map, z, 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S7810100_27 awS0S7810100_27, Object obj) {
        C326880Cre c326880CreM50;
        Message messageU30;
        C12F5 c12f5 = (C12F5) obj;
        boolean z = awS0S7810100_27.z15;
        TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS0S7810100_27.l7;
        View view = (View) awS0S7810100_27.l8;
        Map map = (Map) awS0S7810100_27.l9;
        String str = awS0S7810100_27.s0;
        String str2 = awS0S7810100_27.s1;
        Long lValueOf = Long.valueOf(awS0S7810100_27.j16);
        Long l = (Long) awS0S7810100_27.l10;
        String str3 = awS0S7810100_27.s2;
        String str4 = awS0S7810100_27.s3;
        String str5 = awS0S7810100_27.s4;
        String str6 = awS0S7810100_27.s5;
        Integer num = (Integer) awS0S7810100_27.l11;
        String str7 = awS0S7810100_27.s6;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS0S7810100_27.l12;
        if (takoMultipleSelectVM != null) {
            AssemViewModel.selectSubscribe$default(takoMultipleSelectVM, new C2217381BqS() { // from class: X.0gM0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1160200gIU) obj2).LLILLL;
                }
            }, null, null, null, new AwS607S0100000_28(new AwS430S0200000_29(c12f5, takoMultipleSelectVM, z, 126), 364), 14, null);
            AssemViewModel.selectSubscribe$default(takoMultipleSelectVM, new C2217381BqS() { // from class: X.0gLz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1160200gIU) obj2).LLILLJJLI;
                }
            }, null, null, null, new AwS607S0100000_28(new C1863500yaq(c12f5, z, map, str, interfaceC665370Q7z, str2, lValueOf, l, str4, str3, str5, str6, num, str7, takoMultipleSelectVM), 365), 14, null);
            if (!z) {
                C259800zU c259800zU = new C259800zU();
                AssemViewModel.asyncSubscribe$default(takoMultipleSelectVM, new C2217381BqS() { // from class: X.0gLy
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C1160200gIU) obj2).LLILZIL;
                    }
                }, null, new AwS25S1400000_21(c259800zU, (C259800zU<DialogC1389620mGW>) c12f5, (C12F5) view, (View) map, (Map<String, String>) str, (String) 3), new AwS422S0200000_21(c12f5, (C12F5) c259800zU, (C259800zU<DialogC1389620mGW>) 120), new C1382930m5j(c259800zU, c12f5, takoMultipleSelectVM, str, map, view, interfaceC665370Q7z), 2, null);
            }
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) awS0S7810100_27.l13;
        if (takoCardAbility != null && (c326880CreM50 = takoCardAbility.m50()) != null) {
            IMessageAbility iMessageAbility = (IMessageAbility) awS0S7810100_27.l14;
            TakoMultipleSelectVM takoMultipleSelectVM2 = (TakoMultipleSelectVM) awS0S7810100_27.l7;
            if (iMessageAbility != null && (messageU30 = iMessageAbility.U30(c326880CreM50.LLILLL)) != null && takoMultipleSelectVM2 != null) {
                takoMultipleSelectVM2.vQ2(true, new C326880Cre(null, messageU30, null, 27));
            }
            if (C1858670yT3.LJIIJ(c326880CreM50.LLILLL) && !C1004300cF2.LIZJ(c326880CreM50.LLILLL.LJIIIZ(), c326880CreM50.LLILLL.serverTime) && takoMultipleSelectVM2 != null) {
                takoMultipleSelectVM2.yQ2(Collections.singletonList(c326880CreM50), true);
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S7810100_27(long r21, android.view.View r23, X.InterfaceC665370Q7z r24, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility r25, com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM r26, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r27, java.lang.Integer r28, java.lang.Long r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.Map r37, boolean r38, int r39) {
        /*
            r20 = this;
            r1 = r39
            r19 = r20
            r0 = r19
            r0.$t = r1
            r0 = r38
            r2 = r37
            r3 = r36
            r6 = r35
            r7 = r34
            r8 = r33
            r9 = r32
            r10 = r31
            r12 = r30
            r13 = r29
            r14 = r28
            r11 = r27
            r15 = r26
            r16 = r25
            r17 = r24
            r18 = r23
            r4 = r21
            if (r1 == 0) goto L5b
            r1 = r19
            r1.z15 = r0
            r1.l7 = r15
            r0 = r18
            r1.l8 = r0
            r1.l9 = r2
            r1.s0 = r12
            r1.s1 = r10
            r1.j16 = r4
            r1.l10 = r13
            r1.s2 = r9
            r1.s3 = r8
            r1.s4 = r7
            r1.s5 = r6
            r1.l11 = r14
            r1.s6 = r3
            r0 = r17
            r1.l12 = r0
            r0 = r16
            r1.l13 = r0
            r1.l14 = r11
            r0 = 1
        L57:
            r1.<init>(r0)
            return
        L5b:
            r1 = r19
            r1.l7 = r15
            r1.z15 = r0
            r0 = r17
            r1.l8 = r0
            r1.l9 = r2
            r1.s0 = r12
            r0 = r18
            r1.l10 = r0
            r1.s1 = r10
            r1.j16 = r4
            r1.l11 = r13
            r1.s2 = r9
            r1.s3 = r8
            r1.s4 = r7
            r1.s5 = r6
            r1.l12 = r14
            r1.s6 = r3
            r0 = r16
            r1.l13 = r0
            r1.l14 = r11
            r0 = 1
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S7810100_27.<init>(long, android.view.View, X.0Q7z, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility, com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, int):void");
    }
}
