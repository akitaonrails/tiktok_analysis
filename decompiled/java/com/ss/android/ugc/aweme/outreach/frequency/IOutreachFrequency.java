package com.ss.android.ugc.aweme.outreach.frequency;

import X.C20653915rt;
import X.InterfaceC20677715vj;
import com.ss.android.ugc.aweme.frequency.model.CommonFrequencyClientInfo;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.List;
import kotlin.jvm.internal.AFwS353S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public interface IOutreachFrequency {
    CommonFrequencyClientInfo LIZ(AFwS353S0000000_31 aFwS353S0000000_31, String str, String str2);

    void LIZIZ();

    List<OutreachFlowReportItem> LIZJ(String str);

    void LIZLLL(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str);

    void LJ(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo);

    RuleHitState LJFF(C20653915rt c20653915rt, OutreachInfo outreachInfo, String str, String str2);

    void LJI(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str, String str2, String str3);

    void init();

    void release();
}
