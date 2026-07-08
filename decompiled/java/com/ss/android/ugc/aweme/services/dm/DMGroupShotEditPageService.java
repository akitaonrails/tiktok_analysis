package com.ss.android.ugc.aweme.services.dm;

import X.C04TD;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DMGroupShotEditPageService implements IDMGroupShotEditPageService {
    public static final DMGroupShotEditPageService INSTANCE = new DMGroupShotEditPageService();
    public final /* synthetic */ IDMGroupShotEditPageService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.dm.IDMGroupShotEditPageService
    public void goToEditPage(Context context, AIGroupShotMediaModel aIGroupShotMediaModel) {
        this.$$delegate_0.goToEditPage(context, aIGroupShotMediaModel);
    }

    public DMGroupShotEditPageService() {
        IDMGroupShotEditPageService iDMGroupShotEditPageService;
        Object objLIZ = C04TD.LIZ(IDMGroupShotEditPageService.class, false);
        if (objLIZ != null) {
            iDMGroupShotEditPageService = (IDMGroupShotEditPageService) objLIZ;
        } else {
            if (C04TD.b6 == null) {
                synchronized (IDMGroupShotEditPageService.class) {
                    if (C04TD.b6 == null) {
                        C04TD.b6 = new DMGroupShotEditPageServiceImpl();
                    }
                }
            }
            iDMGroupShotEditPageService = C04TD.b6;
        }
        this.$$delegate_0 = iDMGroupShotEditPageService;
    }
}
