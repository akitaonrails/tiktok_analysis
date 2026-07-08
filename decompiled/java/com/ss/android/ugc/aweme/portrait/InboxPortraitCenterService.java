package com.ss.android.ugc.aweme.portrait;

import X.C01GW;
import X.C04TD;
import X.C2252001DCk;
import com.ss.android.ugc.aweme.portrait.ab.InboxActivityPreferenceExperiment;
import com.ss.android.ugc.aweme.portrait.ab.PortraitMockSetting;

/* JADX INFO: loaded from: classes36.dex */
public final class InboxPortraitCenterService implements IInboxPortraitService {
    public static IInboxPortraitService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IInboxPortraitService.class, false);
        if (objLIZ != null) {
            return (IInboxPortraitService) objLIZ;
        }
        if (C04TD.g3 == null) {
            synchronized (IInboxPortraitService.class) {
                if (C04TD.g3 == null) {
                    C04TD.g3 = new InboxPortraitCenterService();
                }
            }
        }
        return C04TD.g3;
    }

    @Override // com.ss.android.ugc.aweme.portrait.IInboxPortraitService
    public final int LIZ() {
        C01GW c01gw = PortraitMockSetting.LIZIZ;
        if (((PortraitMockSetting.Meta) c01gw.getValue()).isMockOpen && ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceKey != Integer.MIN_VALUE) {
            return ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceKey;
        }
        C01GW c01gw2 = InboxActivityPreferenceExperiment.LIZIZ;
        if (((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).activityPagePreference > 0) {
            return ((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).activityPagePreference;
        }
        if (C2252001DCk.LIZ() < ((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).noticePreferNoticeLowLimit || C2252001DCk.LIZIZ() >= ((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).noticePreferRecommendHighLimit) {
            return (C2252001DCk.LIZIZ() < ((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).recommendPreferRecommendLowLimit || C2252001DCk.LIZ() >= ((InboxActivityPreferenceExperiment.Meta) c01gw2.getValue()).recommendPreferNoticeHighLimit) ? 0 : 2;
        }
        return 1;
    }
}
