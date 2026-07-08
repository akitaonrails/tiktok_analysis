package com.ss.android.ugc.aweme.challenge;

import X.AbstractC1255880imo;
import X.AnonymousClass1126;
import X.C04TD;
import X.C1866730yg3;
import X.C194457115z;
import X.C844470XAv;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeDetailServiceImpl implements IChallengeDetailService {
    public static IChallengeDetailService LJFF() {
        Object objLIZ = C04TD.LIZ(IChallengeDetailService.class, false);
        if (objLIZ != null) {
            return (IChallengeDetailService) objLIZ;
        }
        if (C04TD.LLIZ == null) {
            synchronized (IChallengeDetailService.class) {
                if (C04TD.LLIZ == null) {
                    C04TD.LLIZ = new ChallengeDetailServiceImpl();
                }
            }
        }
        return C04TD.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final boolean LIZIZ() {
        return ((Boolean) C1866730yg3.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final AbstractC1255880imo<Aweme, ?> LIZJ() {
        return new C194457115z();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final boolean LJ() {
        return ((Boolean) C1866730yg3.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void clearCache() {
        AnonymousClass1126.LIZ.getClass();
        AnonymousClass1126.LIZJ.LJIIIZ(-1);
        AnonymousClass1126.LIZLLL.LJIIIZ(-1);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment LIZLLL(Intent intent) {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        Bundle extras = null;
        if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return null;
        }
        ChallengeDetailFragment challengeDetailFragment = new ChallengeDetailFragment();
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        challengeDetailFragment.setArguments(extras);
        return challengeDetailFragment;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void LIZ(AbstractC1255880imo<Aweme, ?> abstractC1255880imo, List<? extends Aweme> list) {
        if (abstractC1255880imo instanceof C194457115z) {
            abstractC1255880imo.getClass();
            abstractC1255880imo.setItems(new ArrayList(list));
            ((ChallengeAwemeList) abstractC1255880imo.mData).cursor = list.size();
        }
    }
}
