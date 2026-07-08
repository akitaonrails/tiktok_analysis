package com.ss.android.ugc.aweme.ecommerce.dependency.notice;

import X.AbstractC1906720ziY;
import X.C04TD;
import X.C1242290iQt;
import X.C1242310iQv;
import X.C1243910iTV;
import X.C1619080sEc;
import X.C1903780zdo;
import X.C19212010Ec;
import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public final class NoticeDependencyService implements INoticeDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public void sendShopNoticeCountChangeEvent() {
        C1619080sEc c1619080sEc = new C1619080sEc(-99999);
        c1619080sEc.LIZLLL(-999999, -1);
        c1619080sEc.post();
    }

    public static INoticeDependencyService createINoticeDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INoticeDependencyService.class, z);
        if (objLIZ != null) {
            return (INoticeDependencyService) objLIZ;
        }
        if (C04TD.f103J == null) {
            synchronized (INoticeDependencyService.class) {
                if (C04TD.f103J == null) {
                    C04TD.f103J = new NoticeDependencyService();
                }
            }
        }
        return C04TD.f103J;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public void clearUnreadCount(int... iArr) {
        C1903780zdo.LIZJ(Arrays.copyOf(iArr, iArr.length));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public int getUnreadSingleGroupSum(int... iArr) {
        return C1903780zdo.LJIIIZ(Arrays.copyOf(iArr, iArr.length));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService
    public AbstractC1906720ziY createNotificationChunk(C1243910iTV c1243910iTV, C19EG c19eg, Fragment fragment) {
        c1243910iTV.getClass();
        return C19212010Ec.LIZJ.LJLL(new C1242310iQv(c19eg, fragment, new C1242290iQt(false, c1243910iTV.LIZ, c1243910iTV.LIZIZ, c1243910iTV.LIZJ, "a2270.b76963.c4379.d8357", c1243910iTV.LIZLLL, c1243910iTV.LJ)));
    }
}
