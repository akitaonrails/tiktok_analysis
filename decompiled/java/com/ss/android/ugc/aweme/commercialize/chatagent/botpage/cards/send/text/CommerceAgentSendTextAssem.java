package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.send.text;

import X.C01GW;
import X.C0DON;
import X.C321580Cj6;
import X.C321590Cj7;
import X.C452501pT;
import X.InterfaceC321360Cik;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentSendTextAssem extends CommerceAgentSendBaseAssem<C321580Cj6> {
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 60));
    public C0DON LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ak7;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendBaseAssem, com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0DON c0don = (C0DON) view.findViewById(R.id.o_4);
        this.LLJZIJLIL = c0don;
        if (c0don != null) {
            c0don.setOnNotSentClickCallback(new AwS583S0100000_4(this, 43));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendBaseAssem, com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem
    /* JADX INFO: renamed from: op */
    public final void up(InterfaceC321360Cik interfaceC321360Cik) {
        C321590Cj7 c321590Cj7 = (C321590Cj7) interfaceC321360Cik;
        super.up(c321590Cj7);
        C0DON c0don = this.LLJZIJLIL;
        if (c0don != null) {
            c0don.LIZ(c321590Cj7.LLILZIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendBaseAssem, com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C321590Cj7 c321590Cj7 = (C321590Cj7) obj;
        super.up(c321590Cj7);
        C0DON c0don = this.LLJZIJLIL;
        if (c0don != null) {
            c0don.LIZ(c321590Cj7.LLILZIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendBaseAssem
    /* JADX INFO: renamed from: sp */
    public final void up(C321590Cj7 c321590Cj7) {
        super.up(c321590Cj7);
        C0DON c0don = this.LLJZIJLIL;
        if (c0don != null) {
            c0don.LIZ(c321590Cj7.LLILZIL);
        }
    }
}
