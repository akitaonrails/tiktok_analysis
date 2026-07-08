package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe;

import X.C01GW;
import X.C11NZ;
import X.C1ABF;
import X.C1ABG;
import X.C1ACA;
import X.C452501pT;
import X.C470590Icr;
import Y.AfS62S0110000_33;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes34.dex */
public final class SubscribeMaskLayerVM extends LiveWidgetViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C01GW LL = C452501pT.LIZIZ(new C1ABG(this));
    public final NextLiveData LLILLJJLI = new NextLiveData();
    public final NextLiveData<C1ABF> LLILLL = new NextLiveData<>();
    public long LLILZ = -1;

    public final void vQ2(boolean z) {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1aca = (C1ACA) this.LL.getValue();
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            long j = liveRoomStruct.allowPreviewTime;
            long j2 = 0;
            if (j < 0) {
                if (!z) {
                    return;
                }
            } else if (z) {
                return;
            }
            long j3 = liveRoomStruct.id;
            long j4 = this.LLILZ - j;
            if (j4 <= 0) {
                j4 = 0;
            }
            if (!z) {
                j2 = j4;
            }
            C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> c11nzReportSubscribePreviewTime = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().reportSubscribePreviewTime(j3, j2);
            if (c11nzReportSubscribePreviewTime != null) {
                c11nzReportSubscribePreviewTime.LJJLL(new AfS62S0110000_33(z, this, 0), new AfS62S0110000_33(z, this, 1));
            }
        }
    }
}
