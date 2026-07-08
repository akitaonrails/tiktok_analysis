package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C09CT;
import X.C11NZ;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C197039127h;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class TrashBinBottomComponent extends BasePanelComponent implements IDetailBottomProtocol {
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 414));

    public static final class TrashBinRestoreApiManager {
        public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(182));

        public interface TrashBinRestoreApi {
            @InterfaceC1501300pAe
            @InterfaceC1501170pAR("/tiktok/activity_center/trash_bin/recover/v1/")
            C11NZ<TrashBinUpdateResponse> trashBinRestore(@InterfaceC1501050pAF("aweme_ids") String str);
        }

        public static final class TrashBinUpdateResponse extends BaseResponse {

            @C09CT("log_pb")
            public final LogPbBean logPbBean;

            @C09CT("recover_fail_items")
            public List<String> recoverFailItems;

            @C09CT("recover_success_items")
            public List<String> recoverSuccessItems;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public static long bo(Aweme aweme) {
        return ((long) 30) - (((aweme.getTrashBinRemainingTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 24)) / ((long) 3600));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.blr, viewGroup, false);
        C786410Ut5.U8((C197039127h) viewTd.findViewById(R.id.tdc), new ACListenerS147S0100000_12(this, 242));
        return viewTd;
    }
}
