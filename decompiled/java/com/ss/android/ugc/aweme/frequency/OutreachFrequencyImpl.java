package com.ss.android.ugc.aweme.frequency;

import X.C01GW;
import X.C04QY;
import X.C13BV;
import X.C19297210eY;
import X.C20653915rt;
import X.C20678415vq;
import X.C20678815vu;
import X.C452501pT;
import X.InterfaceC20677715vj;
import X.InterfaceC807990Vmn;
import com.ss.android.ugc.aweme.frequency.model.CommonFrequencyClientInfo;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.List;
import kotlin.jvm.internal.AFwS353S0000000_31;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachFrequencyImpl implements IOutreachFrequency {
    public final C01GW LIZ = C452501pT.LIZIZ(new C04QY());
    public final C19297210eY LIZIZ = new InterfaceC807990Vmn() { // from class: X.10eY
        @Override // X.InterfaceC807990Vmn
        public final void execute(Runnable runnable) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LIZ = C0CME.SCROLL_END;
            c0cm3.LJI = new AwS572S0100000_28(runnable, 219);
            C312240CLu.LIZ(c0cm3);
        }
    };
    public final C01GW LIZJ = C452501pT.LIZIZ(new C20678815vu(this));

    public final C20678415vq LJII() {
        return (C20678415vq) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LIZIZ() {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void init() {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void release() {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final List<OutreachFlowReportItem> LIZJ(String str) {
        List<OutreachFlowReportItem> listLIZJ;
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII == null || (listLIZJ = c20678415vqLJII.LIZJ(str)) == null) {
            return C13BV.INSTANCE;
        }
        return listLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LJ(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo) {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.LJ(interfaceC20677715vj, outreachInfo);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final CommonFrequencyClientInfo LIZ(AFwS353S0000000_31 aFwS353S0000000_31, String str, String str2) {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            return c20678415vqLJII.LIZ(aFwS353S0000000_31, str, str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LIZLLL(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str) {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.LIZLLL(interfaceC20677715vj, outreachInfo, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final RuleHitState LJFF(C20653915rt c20653915rt, OutreachInfo outreachInfo, String str, String str2) {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            return c20678415vqLJII.LJFF(c20653915rt, outreachInfo, str, str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LJI(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str, String str2, String str3) {
        C20678415vq c20678415vqLJII = LJII();
        if (c20678415vqLJII != null) {
            c20678415vqLJII.LJI(interfaceC20677715vj, outreachInfo, str, str2, str3);
        }
    }
}
