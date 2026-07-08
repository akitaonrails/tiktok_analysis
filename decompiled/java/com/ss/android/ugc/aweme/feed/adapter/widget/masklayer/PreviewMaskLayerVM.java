package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C01GW;
import X.C11NZ;
import X.C1548820qPI;
import X.C1ABP;
import X.C1ABR;
import X.C1ABT;
import X.C1ACA;
import X.C20441214yg;
import X.C452501pT;
import X.C470590Icr;
import X.InterfaceC1141530foN;
import Y.AfS145S0000000_31;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PaidEventPreview;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewMaskLayerVM extends LiveWidgetViewModel {
    public final C01GW LL = C452501pT.LIZIZ(new C1ABP(this));
    public final NextLiveData LLILLJJLI = new NextLiveData();
    public final NextLiveData LLILLL = new NextLiveData();
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1ABR(this));
    public long LLILZIL = -1;

    static {
        new Object() { // from class: X.1ABS
        };
    }

    public final C1ACA vQ2() {
        return (C1ACA) this.LL.getValue();
    }

    public final void wQ2(boolean z) {
        LiveRoomStruct liveRoomStruct;
        PaidEventPreview paidEventPreview;
        Long l;
        C1ACA c1acaVQ2 = vQ2();
        if (c1acaVQ2 != null && (liveRoomStruct = c1acaVQ2.LIZJ) != null) {
            if (z && C1ABT.LJIIL(liveRoomStruct)) {
                C20441214yg.LIZIZ("PreviewMaskLayerVM", "unregister");
                C1548820qPI.LJIIIIZZ("live_event_update_result", (InterfaceC1141530foN) this.LLILZ.getValue());
            }
            LiveEventInfo liveEventInfo = liveRoomStruct.liveEventInfo;
            if (liveEventInfo != null && (paidEventPreview = liveEventInfo.paidEventPreview) != null && (l = paidEventPreview.allowPreviewTime) != null) {
                long jLongValue = l.longValue();
                long j = this.LLILZIL;
                if (j <= 0) {
                    return;
                }
                long j2 = j - jLongValue;
                if (j2 <= 0) {
                    j2 = 0;
                }
                this.LLILZIL = 0L;
                if (jLongValue >= 0 && j2 > 0) {
                    C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> c11nzReportPaidEventPreviewTime = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).K5().reportPaidEventPreviewTime(liveRoomStruct.id, j2);
                    if (c11nzReportPaidEventPreviewTime != null) {
                        c11nzReportPaidEventPreviewTime.LJJLL(new AfS145S0000000_31(0), new AfS145S0000000_31(1));
                    }
                }
            }
        }
    }
}
