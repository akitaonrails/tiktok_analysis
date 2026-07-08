package com.ss.android.ugc.aweme.im.saas.host.impl.tools;

import X.C14EU;
import X.C15580068c;
import X.C1637706b9;
import X.C458110Hxp;
import com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes7.dex */
public final class IMMediaPublishEventService implements IMMediaPublishEventApi {
    public Function0<Unit> LIZIZ;
    public Function1<? super C1637706b9, Unit> LIZJ;
    public Function1<? super C458110Hxp, Unit> LIZLLL;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi
    public final void LIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi
    public final void LIZIZ() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi
    public final void LIZJ(AwS120S1100000_6 awS120S1100000_6) {
        this.LIZJ = awS120S1100000_6;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi
    public final void LIZLLL(AwS120S1100000_6 awS120S1100000_6) {
        this.LIZLLL = awS120S1100000_6;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi
    public final void LJ(AwS546S0100000_2 awS546S0100000_2) {
        this.LIZIZ = awS546S0100000_2;
    }

    @C14EU
    public final void onAIGroupShotPhotoPublishEvent(IMMediaPublishEvent.AIGroupShotPhotoPublishEvent aIGroupShotPhotoPublishEvent) {
        Function0<Unit> function0 = this.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSendMsgFromRecordPage(IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent) {
        String enterDM = DMPublishService.INSTANCE.getEnterDM(dMRecordMediaPublishEvent.getEditModel());
        Function1<? super C458110Hxp, Unit> function1 = this.LIZLLL;
        if (function1 != null) {
            function1.invoke(new C458110Hxp(dMRecordMediaPublishEvent.getSessionId(), dMRecordMediaPublishEvent.isFromDMTextIcon(), dMRecordMediaPublishEvent.isFromDMEffectIcon(), enterDM));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSendMsgFromRecordPage(IMMediaPublishEvent<?> iMMediaPublishEvent) {
        Function1<? super C1637706b9, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(new C1637706b9(iMMediaPublishEvent.getSessionId(), iMMediaPublishEvent.getMobMap()));
        }
    }
}
