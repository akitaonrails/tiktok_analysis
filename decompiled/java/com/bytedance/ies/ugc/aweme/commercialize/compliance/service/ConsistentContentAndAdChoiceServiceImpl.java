package com.bytedance.ies.ugc.aweme.commercialize.compliance.service;

import X.C19236210Nk;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC746220TOy;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.ConsistentContentAndAdChoiceFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;

/* JADX INFO: loaded from: classes13.dex */
public final class ConsistentContentAndAdChoiceServiceImpl implements IConsistentContentAndAdChoiceService {
    public InterfaceC746220TOy LIZ;
    public String LIZIZ;
    public JourneyConsistentContentAndAdChoicesStruct LIZJ;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final JourneyConsistentContentAndAdChoicesStruct LIZ() {
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("return data is null? ");
        sbLIZ.append(this.LIZJ == null);
        C2188811AlT.LIZIZ(sbLIZ);
        return journeyConsistentContentAndAdChoicesStruct;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final ConsistentContentAndAdChoiceFragment LJ() {
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct = this.LIZJ;
        if (journeyConsistentContentAndAdChoicesStruct == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "keyAdChoiceData", journeyConsistentContentAndAdChoicesStruct);
        ConsistentContentAndAdChoiceFragment consistentContentAndAdChoiceFragment = new ConsistentContentAndAdChoiceFragment();
        consistentContentAndAdChoiceFragment.setArguments(bundle);
        return consistentContentAndAdChoiceFragment;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final InterfaceC746220TOy LIZIZ() {
        return this.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final String LJFF() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LIZJ(C19236210Nk c19236210Nk) {
        this.LIZ = c19236210Nk;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LIZLLL(JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct) {
        boolean z;
        boolean z2;
        this.LIZJ = journeyConsistentContentAndAdChoicesStruct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preSaveAdChoiceData is null? ");
        boolean z3 = true;
        if (journeyConsistentContentAndAdChoicesStruct == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", chooseYourExperienceData is null? ");
        if (journeyConsistentContentAndAdChoicesStruct != null && journeyConsistentContentAndAdChoicesStruct.chooseYourExperienceData != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", customizeYourExperienceData is null? ");
        if (journeyConsistentContentAndAdChoicesStruct != null && journeyConsistentContentAndAdChoicesStruct.customizeYourExperienceData != null) {
            z3 = false;
        }
        sbLIZ.append(z3);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LJI(String str) {
        this.LIZIZ = str;
    }
}
