package com.ss.android.ugc.profile.business.ur.camera;

import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.ur.camera.ICameraService;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraService implements ICameraService {
    @Override // com.ss.android.ugc.ur.camera.ICameraService
    public final void LLZZZZ(Activity activity, int i, Uri uri) throws Throwable {
        Intent intent = new Intent(activity, (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZqBNuT/9eaJurInzfo=", null));
    }

    @Override // com.ss.android.ugc.ur.camera.ICameraService
    public final void b(Fragment fragment, int i, Uri uri) throws Throwable {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) LiveCoverCameraActivity.class);
            intent.putExtra("photoUri", uri);
            C1701330uNH.LIZ(intent, fragment);
            C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCZqBNuT/9eaJurInzfo=", null));
        }
    }
}
