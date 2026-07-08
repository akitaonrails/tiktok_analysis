package webcast.api.room;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes13.dex */
public final class _EventTrackingMeta_ProtoEncoder implements InterfaceC1132110fZB<EventTrackingMeta> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EventTrackingMeta eventTrackingMeta) {
        EventTrackingMeta eventTrackingMeta2 = eventTrackingMeta;
        int i = eventTrackingMeta2.type;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, eventTrackingMeta2.objectId);
        long j = eventTrackingMeta2.timestamp;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
    }
}
