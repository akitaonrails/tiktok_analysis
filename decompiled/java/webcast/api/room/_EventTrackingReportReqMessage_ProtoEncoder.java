package webcast.api.room;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _EventTrackingReportReqMessage_ProtoEncoder implements InterfaceC1132110fZB<EventTrackingReportReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EventTrackingReportReqMessage eventTrackingReportReqMessage) {
        EventTrackingReportReqMessage eventTrackingReportReqMessage2 = eventTrackingReportReqMessage;
        List<EventTrackingMeta> list = eventTrackingReportReqMessage2.metaList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < eventTrackingReportReqMessage2.metaList.size(); i++) {
                EventTrackingMeta eventTrackingMeta = (EventTrackingMeta) ListProtector.get(eventTrackingReportReqMessage2.metaList, i);
                if (eventTrackingMeta != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIIZ(1, eventTrackingMeta.type) + C1142340fpg.LJIILL(2, eventTrackingMeta.objectId) + C1142340fpg.LJIIL(3, eventTrackingMeta.timestamp));
                    int i2 = eventTrackingMeta.type;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LIZJ(i2);
                    C1142340fpg.LJFF(c1142350fph, 2, eventTrackingMeta.objectId);
                    long j = eventTrackingMeta.timestamp;
                    c1142350fph.LIZLLL(3, 0);
                    c1142350fph.LJFF(j);
                }
            }
        }
    }
}
