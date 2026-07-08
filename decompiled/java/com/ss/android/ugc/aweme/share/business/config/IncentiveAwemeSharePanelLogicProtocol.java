package com.ss.android.ugc.aweme.share.business.config;

import X.AbstractC1387200mCc;
import X.C1895800zQw;
import X.C1906580ziK;
import X.C786410Ut5;
import X.InterfaceC1366490lfD;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class IncentiveAwemeSharePanelLogicProtocol extends AwemeSharePanelLogicProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final View As0() {
        AwemeSharePackage awemeSharePackage;
        Aweme awemeLJJIFFI;
        ShareOperationInfo shareOperationInfo;
        BaseSharePackage baseSharePackage = this.LL;
        if (baseSharePackage instanceof AwemeSharePackage) {
            C786410Ut5.LJJJI("incentive_operation_type", (!(baseSharePackage instanceof AwemeSharePackage) || (awemeSharePackage = (AwemeSharePackage) baseSharePackage) == null || (awemeLJJIFFI = awemeSharePackage.LJJIFFI()) == null || (shareOperationInfo = awemeLJJIFFI.getShareOperationInfo()) == null) ? null : shareOperationInfo.incentiveOperationType, baseSharePackage.extras);
        }
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        return C1895800zQw.LJI(abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZIZ() : null);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        return new InterfaceC1366490lfD() { // from class: X.0loI
            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C099R.LJFF();
                return unit;
            }
        };
    }

    public IncentiveAwemeSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
