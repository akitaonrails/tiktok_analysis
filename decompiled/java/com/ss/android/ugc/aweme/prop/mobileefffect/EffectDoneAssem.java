package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C13LE;
import X.C1620990sHh;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C446980Hfs;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class EffectDoneAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public View LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectDoneAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/EffectDoneVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rq;
    }

    public EffectDoneAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectDoneVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 845);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(257);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 846), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 847));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 844));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = view;
        Context context = getContext();
        if (context != null) {
            C1749280vcc c1749280vcc = (C1749280vcc) this.LLJJIJI.getValue();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
            c419910GdJ.LIZLLL = Integer.valueOf(C446980Hfs.LIZ(context, R.color.f570cs));
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = context.getString(2131833781);
            c1722300uv6.LJIIIIZZ = context.getString(2131833780);
            c1749280vcc.setStatus(c1722300uv6);
            ((C1749280vcc) this.LLJJIJI.getValue()).setTopMargin(C418440Gaw.LIZIZ(0));
            C786410Ut5.LLLZLZ((C1749280vcc) this.LLJJIJI.getValue(), 0);
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 43), (View) this.LLJJIJIIJIL.getValue());
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        AssemViewModel value = assemVMLazy.getValue();
        selectSubscribe(value, new C2217381BqS() { // from class: X.0r0c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571980r0e) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0r0d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571980r0e) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0r0Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571980r0e) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0r0a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571980r0e) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C1620990sHh(this, 0));
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0r0b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571980r0e) obj).LLILZIL;
            }
        }, null, AFwS292S0000000_9.get$arr$(32), 6);
    }
}
