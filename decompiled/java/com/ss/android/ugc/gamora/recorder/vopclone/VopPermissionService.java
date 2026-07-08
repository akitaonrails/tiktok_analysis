package com.ss.android.ugc.gamora.recorder.vopclone;

import X.C04TD;
import X.C0CHQ;
import X.C1397580mTM;
import X.C13LP;
import X.C19EG;
import X.C2097908Jt;
import X.C838410Wul;
import X.C985403tE;
import android.app.Application;
import com.ss.android.ugc.aweme.services.audio.IVopPermissionService;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class VopPermissionService implements IVopPermissionService {
    public static IVopPermissionService LIZ() {
        Object objLIZ = C04TD.LIZ(IVopPermissionService.class, false);
        if (objLIZ != null) {
            return (IVopPermissionService) objLIZ;
        }
        if (C04TD.y6 == null) {
            synchronized (IVopPermissionService.class) {
                if (C04TD.y6 == null) {
                    C04TD.y6 = new VopPermissionService();
                }
            }
        }
        return C04TD.y6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkAllPermissionsGranted(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkPermissionGranted(String str) {
        return checkAllPermissionsGranted(new String[]{str});
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final int[] checkSelfPermissions(String[] strArr) {
        Application application = C0CHQ.LIZ;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(application, str)));
        }
        return C13LP.LLII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final void showRequestAudioSettingDialog(C19EG c19eg) {
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131849189));
        c1397580mTM.LIZIZ(c19eg.getString(2131849202, C2097908Jt.LIZJ(new Pair("android.permission.RECORD_AUDIO", c19eg.getString(2131849200))).get(new String[]{"android.permission.RECORD_AUDIO"}[0])));
        C985403tE.LIZ(c1397580mTM, new AwS581S0100000_2(c19eg, 350));
        new AutoDismissPermissionDialog(c19eg, c1397580mTM).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkAllPermissionsGranted(String[] strArr) {
        return checkAllPermissionsGranted(checkSelfPermissions(strArr));
    }
}
