package com.ss.android.ugc.aweme.home.router;

import X.C01GW;
import X.C1005580cH6;
import X.C1007050cJT;
import X.C1009860cO0;
import X.C123100dR;
import X.C1238130iKB;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19EG;
import X.C20642515q3;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletIntermediateRoute implements IRouteAction {
    public final C01GW getSchemaUseCase$delegate = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(186));

    public final C1005580cH6 getGetSchemaUseCase() {
        return (C1005580cH6) this.getSchemaUseCase$delegate.getValue();
    }

    public final void showErrorPopup(Context context, String str) {
        if (!C123100dR.LIZ(str)) {
            str = C20642515q3.LJI(2131832545);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(str);
        C1238130iKB.LIZ(c1397580mTM, AFwS252S0000000_16.get$arr$(145));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Activity topActivity;
        InterfaceC497601wk interfaceC497601wkLIZ;
        if (context == null || (topActivity = C1388190mED.LIZ(context)) == null) {
            topActivity = ActivityStack.getTopActivity();
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(topActivity);
        C786410Ut5.J4(dialogC1389620mGW);
        C1009860cO0 c1009860cO0 = new C1009860cO0(CoroutineExceptionHandler.LJJLIL, dialogC1389620mGW, this, topActivity);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(topActivity);
        if (c19egLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, c1009860cO0, null, new C1007050cJT(bundle, this, context, dialogC1389620mGW, topActivity, null), 2);
        return Unit.LIZ;
    }
}
