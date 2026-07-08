package com.ss.android.ugc.aweme.outreach.dispersion.report;

import X.C13LP;
import X.C1697810uHb;
import X.C20646415qg;
import X.C20679415w0;
import X.C20679815w4;
import X.C20679915w5;
import X.C20680115w7;
import X.InterfaceC20680215w8;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.IOutreachFlowReport;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachFlowReporter implements IOutreachFlowReport {
    @Override // com.ss.android.ugc.aweme.report.IOutreachFlowReport
    public final List<OutreachFlowReportItem> LIZ() {
        C20679915w5.Companion.getClass();
        return C13LP.LLIIII(C20679915w5.instance.getCache().values());
    }

    @Override // com.ss.android.ugc.aweme.report.IOutreachFlowReport
    public final void LJ() {
        C20679415w0.LIZ(new C20680115w7(null, null, null, null, null, null, 127), Collections.singletonList(new InterfaceC20680215w8<C20680115w7>() { // from class: X.15w6
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                BPEAHandler bPEAHandler = C20593084x.LIZ;
                C786410Ut5.LJJZZIII(C20593084x.LIZ, new RunnableC20594084y(new C20676015vS()));
            }
        })).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.report.IOutreachFlowReport
    public final void LIZLLL(C20646415qg c20646415qg) {
        C20679415w0.LIZ(new C20680115w7(c20646415qg, null, null, null, null, null, 126), C1697810uHb.LJIIJJI(C20679815w4.LIZ, new InterfaceC20680215w8<C20680115w7>() { // from class: X.15vm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                OutreachFlowReportItem outreachFlowReportItem = ((C20680115w7) c20679515w1.LIZIZ).LJI;
                if (outreachFlowReportItem == null) {
                    return;
                }
                if (!outreachFlowReportItem.available()) {
                    C20571615ec.LIZ.getClass();
                    C20571615ec.LIZLLL("OutreachRecordReportProcessor: cache is unavailable, can not be reported!");
                    return;
                }
                InterfaceC20676615vY interfaceC20676615vY = C20676315vV.LIZ;
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c20679515w1, 928);
                C20676315vV.LIZ(Collections.singletonList(outreachFlowReportItem), AFwS276S0000000_31.get$arr$(162), awS575S0100000_31);
                c20679515w1.LIZ();
            }
        })).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.report.IOutreachFlowReport
    public final void LIZIZ(C20646415qg c20646415qg, ClickReportInfo clickReportInfo) {
        C20679415w0.LIZ(new C20680115w7(c20646415qg, null, null, null, null, clickReportInfo, 94), C1697810uHb.LJIIJJI(C20679815w4.LIZ, new InterfaceC20680215w8<C20680115w7>() { // from class: X.15w3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                ClickReportInfo clickReportInfo2;
                T t = c20679515w1.LIZIZ;
                OutreachFlowReportItem outreachFlowReportItem = ((C20680115w7) t).LJI;
                if (outreachFlowReportItem == null || (clickReportInfo2 = ((C20680115w7) t).LJFF) == null) {
                    return;
                }
                outreachFlowReportItem.clickReportInfo.add(clickReportInfo2);
                C20679915w5.Companion.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(C20679915w5.instance.getCache().values());
                BPEAHandler bPEAHandler = C20593084x.LIZ;
                C786410Ut5.LJJZZIII(C20593084x.LIZ, new RunnableC20594084y(new AwS575S0100000_31(copyOnWriteArrayList, (CopyOnWriteArrayList<OutreachFlowReportItem>) 927)));
                c20679515w1.LIZ();
            }
        })).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.report.IOutreachFlowReport
    public final void LIZJ(C20646415qg c20646415qg, OutreachInfo outreachInfo, String str, String str2, ShowReportInfo showReportInfo) {
        C20679415w0.LIZ(new C20680115w7(c20646415qg, outreachInfo, str, str2, showReportInfo, null, 96), C1697810uHb.LJIIJJI(C20679815w4.LIZ, new InterfaceC20680215w8<C20680115w7>() { // from class: X.15w2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                ShowReportInfo showReportInfo2;
                T t = c20679515w1.LIZIZ;
                OutreachFlowReportItem outreachFlowReportItem = ((C20680115w7) t).LJI;
                if (outreachFlowReportItem == null || (showReportInfo2 = ((C20680115w7) t).LJ) == null) {
                    return;
                }
                outreachFlowReportItem.setShowReportInfo(showReportInfo2);
                C20648315qz.LIZ.getClass();
                outreachFlowReportItem.setTriggerSession(C20648315qz.LJFF);
                C20679915w5.Companion.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(C20679915w5.instance.getCache().values());
                BPEAHandler bPEAHandler = C20593084x.LIZ;
                C786410Ut5.LJJZZIII(C20593084x.LIZ, new RunnableC20594084y(new AwS575S0100000_31(copyOnWriteArrayList, (CopyOnWriteArrayList<OutreachFlowReportItem>) 929)));
                c20679515w1.LIZ();
            }
        })).LIZ();
    }
}
