package webcast.api.room;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes13.dex */
public final class _EventReportReqMessage_ProtoEncoder implements InterfaceC1132110fZB<EventReportReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EventReportReqMessage eventReportReqMessage) {
        EventReportReqMessage eventReportReqMessage2 = eventReportReqMessage;
        long j = eventReportReqMessage2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        int i = eventReportReqMessage2.event;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 3, eventReportReqMessage2.effectId);
        C1142340fpg.LJFF(c1142350fph, 4, eventReportReqMessage2.lastEffectId);
        C1142340fpg.LJFF(c1142350fph, 5, eventReportReqMessage2.resourceId);
        C1142340fpg.LJFF(c1142350fph, 6, eventReportReqMessage2.lastResourceId);
        int i2 = eventReportReqMessage2.eventScene;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i2);
        int i3 = eventReportReqMessage2.preFinishType;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LIZJ(i3);
        int i4 = eventReportReqMessage2.confirmBoxOperation;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i4);
    }
}
