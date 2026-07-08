package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AVPublishWhiteBoxServiceImpl implements IAVPublishWhiteBoxService {
    public final C01GW keva$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(630));

    private final Keva getKeva() {
        return (Keva) this.keva$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService
    public boolean enableShowWhiteBoxedCard(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Keva keva = getKeva();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("published_");
        sbLIZ.append(str);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        Keva keva2 = getKeva();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dismissed_");
        sbLIZ2.append(str);
        if (!keva2.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService
    public void markCardDismissed(String str) {
        if (str != null && str.length() != 0) {
            Keva keva = getKeva();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dismissed_");
            sbLIZ.append(str);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService
    public void recordWhiteBoxCardClick(String str) {
        if (str != null && str.length() != 0) {
            Keva keva = getKeva();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click_");
            sbLIZ.append(str);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService
    public void recordWhiteBoxCardPublished(String str) {
        if (str != null && str.length() != 0) {
            Keva keva = getKeva();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click_");
            sbLIZ.append(str);
            if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                Keva keva2 = getKeva();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("published_");
                sbLIZ2.append(str);
                keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            }
        }
    }
}
