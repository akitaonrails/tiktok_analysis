package webcast.data;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _EventUserInfo_ProtoEncoder implements InterfaceC1132110fZB<EventUserInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EventUserInfo eventUserInfo) {
        EventUserInfo eventUserInfo2 = eventUserInfo;
        long j = eventUserInfo2.userId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, eventUserInfo2.avatarUri);
    }
}
