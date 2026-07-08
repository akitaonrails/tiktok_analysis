package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.C04TD;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC1253800ijS;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IFollowingAndFollowerVisibilityService;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingAndFollowerVisibilityServiceImpl implements IFollowingAndFollowerVisibilityService {
    public static IFollowingAndFollowerVisibilityService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IFollowingAndFollowerVisibilityService.class, false);
        if (objLIZ != null) {
            return (IFollowingAndFollowerVisibilityService) objLIZ;
        }
        if (C04TD.LLLLLJIL == null) {
            synchronized (IFollowingAndFollowerVisibilityService.class) {
                if (C04TD.LLLLLJIL == null) {
                    C04TD.LLLLLJIL = new FollowingAndFollowerVisibilityServiceImpl();
                }
            }
        }
        return C04TD.LLLLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IFollowingAndFollowerVisibilityService
    public final TuxSheet LIZ(Context context, String str) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            FollowingAndFollowerVisibilityGuideFragment followingAndFollowerVisibilityGuideFragment = new FollowingAndFollowerVisibilityGuideFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", str, bundle);
            followingAndFollowerVisibilityGuideFragment.setArguments(bundle);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = followingAndFollowerVisibilityGuideFragment;
            tuxSheet.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(1);
            DialogInterfaceOnDismissListenerC1253800ijS dialogInterfaceOnDismissListenerC1253800ijS = new DialogInterface.OnDismissListener() { // from class: X.0ijS
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i = C2187451AjH.LIZ;
                }
            };
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1253800ijS;
            tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.0ijT
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i = C2187451AjH.LIZ;
                }
            };
            tuxSheet2.show(supportFragmentManager, "following_and_follower_visibility_guide");
            return tuxSheet2;
        }
        return null;
    }
}
