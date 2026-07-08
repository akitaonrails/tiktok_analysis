package webcast.im;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes35.dex */
public final class _PreviewRoom_ProtoEncoder implements InterfaceC1132110fZB<PreviewRoom> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PreviewRoom previewRoom) {
        PreviewRoom previewRoom2 = previewRoom;
        long j = previewRoom2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = previewRoom2.liveId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 3, previewRoom2.identity);
        C1142340fpg.LJFF(c1142350fph, 4, previewRoom2.cursor);
        long j3 = previewRoom2.accountType;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j3);
        long j4 = previewRoom2.enterUniqId;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j4);
    }
}
