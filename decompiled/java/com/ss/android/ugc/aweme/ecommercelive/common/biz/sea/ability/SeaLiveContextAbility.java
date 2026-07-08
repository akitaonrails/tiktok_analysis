package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability;

import X.C01GW;
import X.C0IJH;
import X.C1732870vC9;
import X.C1733270vCn;
import X.C452501pT;
import X.C599380Nf6;
import X.C599410Nf9;
import X.InterfaceC599460NfE;
import X.InterfaceC599740Nfg;
import X.InterfaceC600380Ngi;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaLiveContextAbility implements ISeaLiveContextAbility {
    public final Fragment LL;
    public final C0IJH LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public SeaLiveContextAbility() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final InterfaceC600380Ngi Cm0() {
        return (InterfaceC600380Ngi) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final C1732870vC9 JC2() {
        return (C1732870vC9) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final C599380Nf6 MF() {
        return (C599380Nf6) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final InterfaceC599740Nfg SU1() {
        return (InterfaceC599740Nfg) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final C599410Nf9 cu2() {
        return (C599410Nf9) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final InterfaceC599460NfE hW1() {
        return (InterfaceC599460NfE) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final C1733270vCn rl1() {
        return (C1733270vCn) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility
    public final Fragment tY0() {
        return this.LL;
    }

    public SeaLiveContextAbility(Fragment fragment, C0IJH c0ijh) {
        this.LL = fragment;
        this.LLILLJJLI = c0ijh;
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 672));
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 667));
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 666));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 669));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 671));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 668));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 670));
    }
}
