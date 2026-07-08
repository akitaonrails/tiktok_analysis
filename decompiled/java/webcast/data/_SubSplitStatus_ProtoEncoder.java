package webcast.data;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _SubSplitStatus_ProtoEncoder implements InterfaceC1132110fZB<SubSplitStatus> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SubSplitStatus subSplitStatus) {
        SubSplitStatus subSplitStatus2 = subSplitStatus;
        boolean z = subSplitStatus2.isOldSubCreator;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = subSplitStatus2.curPeriod;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
    }
}
