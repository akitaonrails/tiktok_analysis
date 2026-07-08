package com.ss.android.ugc.aweme.im.service.impl;

import X.C04TD;
import X.C0ZDX;
import X.C443120HZe;
import X.C869590Y9l;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.service.service.IIMContentService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMContentService implements IIMContentService {
    public static IIMContentService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IIMContentService.class, false);
        if (objLIZ != null) {
            return (IIMContentService) objLIZ;
        }
        if (C04TD.f1 == null) {
            synchronized (IIMContentService.class) {
                if (C04TD.f1 == null) {
                    C04TD.f1 = new IMContentService();
                }
            }
        }
        return C04TD.f1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMContentService
    public final boolean LIZ(BaseTemplate baseTemplate) {
        if (baseTemplate != null) {
            return C0ZDX.LJIJJ(baseTemplate);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMContentService
    public final boolean LIZIZ(C869590Y9l c869590Y9l) {
        return ShareAwemeContent.Companion.isEncourageMufInteractionMsg(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMContentService
    public final C443120HZe<Boolean, Integer, String> LIZJ(SharePackage sharePackage) {
        Bundle bundle;
        String string;
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("share_live_intent")) != null && Intrinsics.LJFF(string, "multi_guest_invite")) {
            return new C443120HZe<>(Boolean.TRUE, 0, ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJZ("pm_mt_multi_sendinvite"));
        }
        return new C443120HZe<>(Boolean.FALSE, 0, "");
    }
}
