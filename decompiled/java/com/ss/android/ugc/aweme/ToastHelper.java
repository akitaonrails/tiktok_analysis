package com.ss.android.ugc.aweme;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0PEM;
import X.C0ZTY;
import X.C1365700ldw;
import X.C1378370lyN;
import X.C1388190mED;
import X.C1389920mH0;
import X.C13BV;
import X.C1717206ny;
import X.C1906580ziK;
import X.C1DEV;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.C817503Hh;
import X.EnumC1365740le0;
import X.InterfaceC1365770le3;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes22.dex */
public final class ToastHelper implements IToastHelper {
    public String LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(43));
    public List<? extends WeakReference<InterfaceC1365770le3>> LIZLLL = C13BV.INSTANCE;
    public final C1DEV LJ = new C1DEV(false);

    public static List LIZIZ() {
        Activity activityLIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C1717206ny.LIZIZ(activityLIZ, linkedHashSet);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            Activity activity = (Activity) obj;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LIZLLL() {
        C1389920mH0 c1389920mH0LIZ;
        Iterator<? extends WeakReference<InterfaceC1365770le3>> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            InterfaceC1365770le3 interfaceC1365770le3 = it2.next().get();
            if (interfaceC1365770le3 != null && (c1389920mH0LIZ = interfaceC1365770le3.LIZ()) != null) {
                c1389920mH0LIZ.LIZ = 0L;
            }
        }
        C1378370lyN.LIZ.getClass();
        C1378370lyN.LIZ();
    }

    public final int LIZJ(Activity activity, Integer num) {
        int i;
        int iMax;
        int iLIZIZ;
        View decorView;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return 0;
        }
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            int i2 = rect.bottom;
            View viewFindViewById = decorView.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.getGlobalVisibleRect(rect);
            }
            i = i2 - rect.bottom;
        } else {
            i = 0;
        }
        if (num != null) {
            iMax = Math.max(i, 0);
            iLIZIZ = num.intValue();
        } else {
            iMax = Math.max(i, 0) + ((Number) this.LIZIZ.getValue()).intValue();
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        return iMax + iLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IToastHelper
    public final String LIZ(EnumC1365740le0 enumC1365740le0, String str, long j, Function0<Unit> function0, boolean z, int i, boolean z2, String str2, C0ZTY c0zty) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1365700ldw(this, enumC1365740le0, str, j, z, i, str2, z2, function0, c0zty, null), 2);
        return str2;
    }
}
