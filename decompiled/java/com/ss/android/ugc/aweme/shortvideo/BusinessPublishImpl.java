package com.ss.android.ugc.aweme.shortvideo;

import X.C01GW;
import X.C120W;
import X.C15OG;
import X.C15OZ;
import X.C20511815Oa;
import X.C452501pT;
import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: loaded from: classes32.dex */
public final class BusinessPublishImpl implements IBusinessPublishService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C15OZ());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C20511815Oa());

    @Override // com.ss.android.ugc.aweme.services.IBusinessPublishService
    public final void initWaterMark() {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) this.LIZIZ.getValue();
        if (iUnKnownOwnershipBusinessOuterService != null) {
            iUnKnownOwnershipBusinessOuterService.LJJIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessPublishService
    public final boolean isInActivity() {
        IMainService iMainService = (IMainService) this.LIZ.getValue();
        return iMainService != null && iMainService.isInActivity();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessPublishService
    public final Class<? extends Activity> getPushCameraBlurActivityCls() {
        return PushCameraBlurActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessPublishService
    public final void parserTo(Activity activity, Uri uri) throws Throwable {
        C120W.LIZ.getClass();
        C120W.LIZLLL(activity, uri);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessPublishService
    public final void goDuetWithMovie(String str, Activity activity, String str2) {
        new C15OG().LIZLLL(str, activity, str2);
    }
}
