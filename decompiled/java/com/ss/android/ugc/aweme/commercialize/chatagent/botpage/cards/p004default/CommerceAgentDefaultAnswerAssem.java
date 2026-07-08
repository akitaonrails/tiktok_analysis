package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.p004default;

import X.C321310Cif;
import X.C321330Cih;
import X.C340910DYb;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import X.InterfaceC321360Cik;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentDefaultAnswerAssem extends CommerceAgentAnswerBaseAssem<C321310Cif> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ak1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem
    public final InterfaceC1860810yWV sp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.ety);
        if (viewFindViewById instanceof C340910DYb) {
            return (C340910DYb) viewFindViewById;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS583S0100000_4(this, 42));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem, com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem
    /* JADX INFO: renamed from: op */
    public final void up(InterfaceC321360Cik interfaceC321360Cik) {
        super.up((C321310Cif) interfaceC321360Cik);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem, com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        super.up((C321310Cif) obj);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerBaseAssem
    /* JADX INFO: renamed from: tp */
    public final void up(C321330Cih c321330Cih) {
        super.up((C321310Cif) c321330Cih);
    }
}
