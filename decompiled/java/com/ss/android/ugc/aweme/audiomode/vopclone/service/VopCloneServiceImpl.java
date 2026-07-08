package com.ss.android.ugc.aweme.audiomode.vopclone.service;

import X.C01GW;
import X.C19419110yD;
import X.C2188811AlT;
import X.C452501pT;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig;
import java.net.URLEncoder;
import java.util.Vector;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class VopCloneServiceImpl implements IVopCloneService {
    public static final /* synthetic */ int LIZJ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(38));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(39));

    public VopCloneServiceImpl() {
        new Vector();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final void LIZ(Context context, String str) {
        C19419110yD.LIZ.getClass();
        String str2 = ((VopCloneConfig) C19419110yD.LIZJ.getValue()).webUrl;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("&enter_from=");
        sbLIZ.append(str);
        String strEncode = URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(strEncode);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2)).open(0, new OnActivityResultCallback() { // from class: X.10yR
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
            }
        });
    }
}
