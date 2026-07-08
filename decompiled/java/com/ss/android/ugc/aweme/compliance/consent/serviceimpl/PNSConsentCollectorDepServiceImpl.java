package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.C15438062q;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.IPNSConsentCollectorDepService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSConsentCollectorDepServiceImpl implements IPNSConsentCollectorDepService {
    @Override // com.ss.android.ugc.aweme.pns.consent.collector.IPNSConsentCollectorDepService
    public final List<UserCommunicationProcessorModel> LIZ(String str) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        List<DecisionMakerNetworkApi.PPFActionModel> list;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ(str)) != null && (list = eligibilityModelLIZ.actionList) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : list) {
                arrayList.add(new UserCommunicationProcessorModel(pPFActionModel.actionId, pPFActionModel.actionParams, pPFActionModel.necessary));
            }
            return arrayList;
        }
        return null;
    }
}
