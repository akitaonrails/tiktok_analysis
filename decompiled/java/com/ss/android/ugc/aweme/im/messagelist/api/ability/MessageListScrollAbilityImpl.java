package com.ss.android.ugc.aweme.im.messagelist.api.ability;

import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C1762006vC;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C869590Y9l;
import X.C907070ZiD;
import X.EnumC461200I6s;
import X.InterfaceC1891350zJl;
import X.InterfaceC904700ZeO;
import X.InterfaceC904740ZeS;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListScrollAbilityImpl implements MessageListScrollAbility {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C054G LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final EnumC461200I6s LLJ;
    public long LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Function1<? super Integer, Unit> LLJILLL;
    public Function0<Unit> LLJJ;
    public Function2<? super C869590Y9l, ? super Integer, Unit> LLJJI;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
    }

    public final MessagePowerListAbility LIZ() {
        return (MessagePowerListAbility) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void C31(long j, Function2<? super C869590Y9l, ? super Integer, Unit> function2) {
        int iIntValue;
        if (j <= 0) {
            InterfaceC904700ZeO interfaceC904700ZeO = (InterfaceC904700ZeO) this.LLILLJJLI.getValue();
            if (interfaceC904700ZeO != null && interfaceC904700ZeO.LIZ()) {
                iIntValue = LIZ().vi2().size() - 1;
            } else {
                iIntValue = -1;
            }
        } else {
            iIntValue = ((Number) new AwS593S0100000_14(this, 312).invoke(Long.valueOf(j))).intValue();
        }
        List<C869590Y9l> listVi2 = LIZ().vi2();
        if (listVi2 == null) {
            return;
        }
        if (iIntValue != -1 && iIntValue < listVi2.size()) {
            Object obj = ListProtector.get(listVi2, iIntValue);
            if (function2 != null) {
                function2.invoke(obj, Integer.valueOf(iIntValue));
            }
            this.LLIZ = false;
            return;
        }
        this.LLJI = j;
        this.LLIZLLLIL = false;
        this.LLIZ = true;
        this.LLJJI = function2;
        int i = this.LLILZLL + 1;
        this.LLILZLL = i;
        if (i > 10) {
            this.LLIZ = false;
            this.LLILZLL = 0;
            if (function2 != null) {
                function2.invoke(null, -1);
                return;
            }
            return;
        }
        InterfaceC904700ZeO interfaceC904700ZeO2 = (InterfaceC904700ZeO) this.LLILLJJLI.getValue();
        if (interfaceC904700ZeO2 != null) {
            interfaceC904700ZeO2.LIZJ();
        }
    }

    public MessageListScrollAbilityImpl(C01GW<? extends Context> c01gw, C01GW<? extends MessagePowerListAbility> c01gw2, C01GW<? extends InterfaceC904700ZeO> c01gw3) {
        this.LL = c01gw2;
        this.LLILLJJLI = c01gw3;
        this.LLILLL = c01gw;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILZIL = -1;
        this.LLIZLLLIL = true;
        this.LLJ = EnumC461200I6s.TOP;
        this.LLJI = -1L;
        this.LLJIJIL = -1L;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC904740ZeS interfaceC904740ZeS : list2) {
            if (interfaceC904740ZeS instanceof C1762006vC) {
                arrayList.add(interfaceC904740ZeS);
            }
        }
        if ((!arrayList.isEmpty()) && this.LLIZ) {
            if (this.LLIZLLLIL) {
                long j = this.LLJIJIL;
                if (j != -1) {
                    xh1(j, this.LLJ, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
                    return;
                }
                long j2 = this.LLJI;
                if (j2 == -1) {
                    nt2(this.LLILZIL, this.LLJ, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
                    return;
                } else {
                    d42(j2, this.LLJ, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
                    return;
                }
            }
            C31(this.LLJI, this.LLJJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void d42(long j, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        this.LLJI = j;
        this.LLJIJIL = -1L;
        int iIntValue = ((Number) new AwS593S0100000_14(this, 312).invoke(Long.valueOf(j))).intValue();
        this.LLILZIL = iIntValue;
        nt2(iIntValue, enumC461200I6s, z, function0, function1, function02);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void nt2(int i, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        C23250099c.LIZLLL(this.LLILZ, null, null, new C907070ZiD(i, this, function0, enumC461200I6s, z, function1, function02, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility
    public final void xh1(long j, EnumC461200I6s enumC461200I6s, boolean z, Function0<Unit> function0, Function1<? super Integer, Unit> function1, Function0<Unit> function02) {
        this.LLJI = -1L;
        this.LLJIJIL = j;
        int iIntValue = ((Number) new AwS593S0100000_14(this, 313).invoke(Long.valueOf(j))).intValue();
        this.LLILZIL = iIntValue;
        nt2(iIntValue, enumC461200I6s, z, function0, function1, function02);
    }
}
