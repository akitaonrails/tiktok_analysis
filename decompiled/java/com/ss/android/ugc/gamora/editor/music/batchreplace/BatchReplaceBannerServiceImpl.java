package com.ss.android.ugc.gamora.editor.music.batchreplace;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0BSJ;
import X.C0XQ7;
import X.C344540Df2;
import X.C344550Df3;
import X.InterfaceC20660715sz;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchReplaceBannerServiceImpl implements IBatchReplaceBannerService {
    public boolean LIZ;

    public static IBatchReplaceBannerService LIZ() {
        Object objLIZ = C04TD.LIZ(IBatchReplaceBannerService.class, false);
        if (objLIZ != null) {
            return (IBatchReplaceBannerService) objLIZ;
        }
        if (C04TD.r6 == null) {
            synchronized (IBatchReplaceBannerService.class) {
                if (C04TD.r6 == null) {
                    C04TD.r6 = new BatchReplaceBannerServiceImpl();
                }
            }
        }
        return C04TD.r6;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService
    public final boolean shouldShowBatchReplaceSnackBar() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        String str = (String) C0BSJ.LIZ.getValue();
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return false;
        }
        C344550Df3.LIZ.getClass();
        return !((Keva) C344550Df3.LIZIZ.getValue()).getBoolean(C344550Df3.LIZ(str), false);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService
    public final boolean getClickPost() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService
    public final void setClickPost(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IBatchReplaceBannerService
    public final void showBatchReplaceSnackBar(ViewGroup viewGroup, InterfaceC20660715sz interfaceC20660715sz) {
        String str = (String) C0BSJ.LIZ.getValue();
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        PopupManager.LJIJI(new C344540Df2(viewGroup, interfaceC20660715sz), true);
        C344550Df3.LIZ.getClass();
        ((Keva) C344550Df3.LIZIZ.getValue()).storeBoolean(C344550Df3.LIZ(str), true);
    }
}
