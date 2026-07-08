package com.ss.android.ugc.aweme.im.saas.host.impl.interaction;

import X.C0ICM;
import X.C0Z9Y;
import X.C1537050q6J;
import X.C15438062q;
import X.C1551950qUL;
import X.C2097908Jt;
import X.C869590Y9l;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionFeatureImpl implements InteractionFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature
    public final String LIZIZ(String str) {
        C0ICM c0icmLJJJIL;
        C0Z9Y c0z9y = (C0Z9Y) PluggableExtentionKt.pluggableSpi$default(ILightInteractionPlatformService.class, false, false, false, 14, null);
        if (c0z9y != null && (c0icmLJJJIL = c0z9y.LJJJIL()) != null) {
            return c0icmLJJJIL.LIZIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature
    public final void LIZJ(Set<String> set) {
        IMainService iMainService;
        String accessKey;
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        if (iAwemeImManager != null && iAwemeImManager.getProxy() != null && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpiForReal(IMainService.class)) != null && (accessKey = iMainService.getAccessKey()) != null) {
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(false);
            optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
            }
            if (c1551950qULLIZ != null) {
                try {
                    c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature
    public final String LJI(C869590Y9l c869590Y9l) {
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpi$default(ILightInteractionPlatformService.class, false, false, false, 14, null);
        if (iLightInteractionPlatformService != null) {
            return iLightInteractionPlatformService.LJI(c869590Y9l);
        }
        return null;
    }
}
