package com.ss.android.ugc.aweme.commercialize.utils.crouter;

import X.C1001080c9q;
import X.C1010120cOQ;
import X.C1017070cZd;
import X.C1019110ccv;
import X.C1021860chM;
import X.C1021930chT;
import X.C1022290ci3;
import X.C1388190mED;
import X.InterfaceC1021920chS;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.temporary.ICRouterTemporaryDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterTemporaryDelegateImpl implements ICRouterTemporaryDelegate {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.temporary.ICRouterTemporaryDelegate
    public final boolean LIZ(Context context, Object obj, InterfaceC1021920chS interfaceC1021920chS) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1021860chM.LJJJI(context, aweme, 2, interfaceC1021920chS);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.temporary.ICRouterTemporaryDelegate
    public final boolean LIZIZ(Context context, Object obj, InterfaceC1021920chS interfaceC1021920chS) {
        Aweme aweme;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (aweme == null || context == null) {
            return false;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (C1017070cZd.LLJI(aweme)) {
            if (!C1021930chT.LIZIZ) {
                if (aweme.getAuthor() != null) {
                    if (C1017070cZd.LLJIJIL(aweme)) {
                        if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                            C1022290ci3.LIZLLL(context, aweme, 2);
                        }
                        C1021930chT.LIZIZ = true;
                    } else {
                        User author = aweme.getAuthor();
                        if (author != null && author.isLive()) {
                            C1019110ccv.LIZIZ.LJIJI(context, aweme, null);
                        }
                    }
                }
            }
            return true;
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        if (!C1017070cZd.LLD(aweme)) {
            C1010120cOQ.LJJIIZ(aweme);
        }
        return C1001080c9q.LIZIZ(context, aweme, 2);
    }
}
