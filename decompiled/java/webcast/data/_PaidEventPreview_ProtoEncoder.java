package webcast.data;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _PaidEventPreview_ProtoEncoder implements InterfaceC1132110fZB<PaidEventPreview> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PaidEventPreview paidEventPreview) {
        PaidEventPreview paidEventPreview2 = paidEventPreview;
        long j = paidEventPreview2.allowPreview;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = paidEventPreview2.allowPreviewTime;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
    }
}
