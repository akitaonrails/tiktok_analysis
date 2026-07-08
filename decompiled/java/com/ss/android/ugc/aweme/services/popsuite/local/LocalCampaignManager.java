package com.ss.android.ugc.aweme.services.popsuite.local;

import X.C21312318an;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class LocalCampaignManager {
    public static final LocalCampaignManager INSTANCE = new LocalCampaignManager();
    public static final List<CampaignManager> campaignManagers = Collections.singletonList(new Gpppa2svUpsellCampaign());
    public static final int $stable = 8;

    public final boolean showLocalCampaign(IPopSuiteManagerService.PopupConfigObject popupConfigObject, C21312318an c21312318an) {
        Iterator<CampaignManager> it2 = campaignManagers.iterator();
        while (it2.hasNext()) {
            if (it2.next().startCampaign(popupConfigObject, c21312318an)) {
                return true;
            }
        }
        return false;
    }
}
