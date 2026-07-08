package com.ss.android.ugc.aweme.im.reminduser.impl;

import X.C08CH;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1481605r4;
import X.C191862104e;
import X.C191871104n;
import X.C19EG;
import X.C1B14;
import X.C1B15;
import X.C786410Ut5;
import X.InterfaceC989510brB;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersViewHelper;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes35.dex */
public final class RemindUsersViewHelper implements IRemindUsersViewHelper {
    public static C1389910mGz LIZLLL;
    public static Function1<? super Boolean, Unit> LJ;
    public static boolean LJFF;
    public static WeakReference<Lifecycle> LJI;
    public static final RemindUsersViewHelper LIZIZ = new RemindUsersViewHelper();
    public static int LIZJ = -1;
    public static final C1B15 LJII = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.1B15
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
            if (!C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                RemindUsersViewHelper.LIZIZ.getClass();
                AFwS225S0000000_34 aFwS225S0000000_34 = AFwS225S0000000_34.get$arr$(78);
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    aFwS225S0000000_34.invoke();
                } else {
                    C1481605r4.LIZIZ(new ARunnableS116S0100000_16(aFwS225S0000000_34, (Function0<Unit>) 60));
                }
            }
        }
    };
    public static final RemindUsersViewHelper$lifecycleEventObserver$1 LJIIIIZZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersViewHelper$lifecycleEventObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = C08CH.LIZ[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        RemindUsersViewHelper.LJFF = false;
                        RemindUsersViewHelper.LIZIZ.getClass();
                        RemindUsersViewHelper.LJFF();
                        C191862104e c191862104eLJ = C191871104n.LJ();
                        C1B15 c1b15 = RemindUsersViewHelper.LJII;
                        c191862104eLJ.getClass();
                        C191862104e.LIZLLL(c1b15);
                        return;
                    }
                    return;
                }
                if (!RemindUsersViewHelper.LJFF) {
                    return;
                }
                RemindUsersViewHelper.LIZIZ.getClass();
                AFwS225S0000000_34 aFwS225S0000000_34 = AFwS225S0000000_34.get$arr$(78);
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    aFwS225S0000000_34.invoke();
                    return;
                } else {
                    C1481605r4.LIZIZ(new ARunnableS116S0100000_16(aFwS225S0000000_34, (Function0<Unit>) 60));
                    return;
                }
            }
            RemindUsersViewHelper.LJFF = true;
        }
    };

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
    public final void LIZIZ() {
    }

    public static void LJFF() {
        Lifecycle lifecycle;
        WeakReference<Lifecycle> weakReference = LJI;
        if (weakReference != null && (lifecycle = weakReference.get()) != null) {
            lifecycle.removeObserver(LJIIIIZZ);
        }
        LJI = null;
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
    public final void LJ() {
        C1389910mGz c1389910mGz = LIZLLL;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        LIZLLL = null;
    }

    public static final class Service implements IRemindUsersViewHelper {
        public final /* synthetic */ RemindUsersViewHelper LIZIZ = RemindUsersViewHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
        public final void LIZ(Context context, String str, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
            this.LIZIZ.LIZ(context, str, z, function2);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
        public final void LIZIZ() {
            this.LIZIZ.getClass();
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
        public final void LIZLLL(Context context) {
            this.LIZIZ.LIZLLL(context);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
        public final void LJ() {
            this.LIZIZ.LJ();
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
        public final void LIZJ(int i) {
            this.LIZIZ.getClass();
            RemindUsersViewHelper.LIZJ = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
    public final void LIZJ(int i) {
        LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
    public final void LIZLLL(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131831933);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper
    public final void LIZ(Context context, String str, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        if (context != null && C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
            RemindUsersViewHelper remindUsersViewHelper = LIZIZ;
            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16((Function2) function2, (Function2<? super Boolean, ? super String, Unit>) 97);
            remindUsersViewHelper.getClass();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                C1B14 c1b14 = new C1B14(context, c19egLIZIZ, str, awS595S0100000_16, z);
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    c1b14.invoke();
                    return;
                } else {
                    C1481605r4.LIZIZ(new ARunnableS116S0100000_16(c1b14, (Function0<Unit>) 60));
                    return;
                }
            }
            return;
        }
        function2.invoke(Boolean.TRUE, null);
    }
}
