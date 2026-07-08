package com.ss.android.ugc.aweme.tako.share.panel;

import X.AbstractC1387200mCc;
import X.C036E;
import X.C063E;
import X.C063V;
import X.C0M7Y;
import X.C0PEM;
import X.C1370940lmO;
import X.C1388190mED;
import X.C1906580ziK;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C326880Cre;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoBatchMessageSharePackage extends TakoSharePackage {
    public Function0<Unit> onDmSendSuccess;
    public volatile Bitmap renderedLongImage;
    public List<C326880Cre> selectedMessages;
    public String shareId;
    public static final C063V Companion = new Object() { // from class: X.063V
    };
    public static final int $stable = 8;

    public TakoBatchMessageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.shareId = "";
    }

    @Override // com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        DialogC1389620mGW dialogC1389620mGW;
        boolean zLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
        }
        if (activityLIZ != null && !activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
            dialogC1389620mGW = new DialogC1389620mGW(activityLIZ);
            dialogC1389620mGW.LJJLIIJ(false);
            dialogC1389620mGW.LJJLJ(2131846630);
            C786410Ut5.J4(dialogC1389620mGW);
        } else {
            dialogC1389620mGW = null;
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C063E(dialogC1389620mGW, view, activityLIZ, context, null), 3);
            return true;
        }
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        super.LJII(interfaceC1369790lkX, context, view, c0m7y, function1);
        return false;
    }
}
