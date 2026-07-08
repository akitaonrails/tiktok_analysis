package joo;

import X.C0C64;
import X.C0WZX;
import X.C1701150uMz;
import X.C1701330uNH;
import X.C19719512Dh;
import X.C201954140i;
import X.C201955140j;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C823050WQl;
import X.C838390Wuj;
import Y.ARunnableS0S1210100_26;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes27.dex */
public final class f {
    public static final f LIZ = new f();
    public static final Map<String, Bundle> LIZIZ = new ConcurrentHashMap();
    public static final Map<Context, String> LIZJ = new WeakHashMap();
    public static final Map<Context, String> LIZLLL = new WeakHashMap();
    public static final Map<Context, Boolean> LJ = new WeakHashMap();
    public static final C1701150uMz LJFF = new C1701150uMz();
    public static final List<Runnable> LJI = new ArrayList();
    public static final ExecutorService LJII = C823050WQl.LIZLLL();
    public static CountDownLatch LJIIIIZZ = new CountDownLatch(1);

    public static void LIZ(Context context) {
        if (!((WeakHashMap) LJ).containsKey(context)) {
            WeakHashMap weakHashMap = (WeakHashMap) LIZJ;
            if (weakHashMap.containsKey(context)) {
                String str = (String) weakHashMap.get(context);
                C19719512Dh.LIZJ(LIZIZ).remove(str);
                C201954140i c201954140i = C201954140i.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LargeTransaction, remove memory cache uuid: ");
                sbLIZ.append(str);
                C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZIZ(Intent intent) {
        int iLIZJ;
        Bundle extras;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null) {
            iLIZJ = 0;
        } else {
            iLIZJ = C838390Wuj.LIZJ(extras);
        }
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction, extra size : ");
        sbLIZ.append(iLIZJ);
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        b.LIZ.getClass();
        if (iLIZJ >= C0C64.LJIILLIIL().LJIJ(31744, 500, "creative_large_transaction_size_threshold", true) * 1024) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LargeTransaction, extra size too large: ");
            sbLIZ2.append(iLIZJ);
            sbLIZ2.append(", intent: ");
            sbLIZ2.append(intent);
            C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ2));
            try {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = UUID.randomUUID().toString();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("LargeTransaction uuid: ");
                    sbLIZ3.append(string);
                    C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ3));
                    ((ConcurrentHashMap) LIZIZ).put(string, extras2);
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("activity_bundle_uuid", string, bundle);
                    intent.replaceExtras(bundle);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LIZLLL(Intent intent) {
        String string;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (string = extras.getString("activity_bundle_uuid")) != null && string.length() != 0) {
                    C201954140i c201954140i = C201954140i.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LargeTransaction, restore uuid: ");
                    sbLIZ.append(string);
                    C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
                    Bundle bundle = (Bundle) concurrentHashMap.get(string);
                    if (bundle != null) {
                        intent.replaceExtras(C838390Wuj.LIZ(C838390Wuj.LIZLLL(bundle)));
                        concurrentHashMap.remove(string);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJ(Context context, Intent intent) {
        LIZIZ(intent);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOapcZjLkiZMwmGWWQ3jzzBc9k0YSkGjdB7Rw7obGhUIB5U=", null));
    }

    public static void LJII(Context context, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        String str = (String) ((WeakHashMap) LIZJ).get(context);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (bundle2 = (Bundle) ((ConcurrentHashMap) LIZIZ).get(str)) != null) {
            C201954140i c201954140i = C201954140i.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LargeTransaction, ");
            sbLIZ.append(context.getClass().getSimpleName());
            sbLIZ.append(" storeActivityIntent store uuid: ");
            sbLIZ.append(str);
            sbLIZ.append(", bundle size ");
            sbLIZ.append(C838390Wuj.LIZJ(bundle2));
            C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
            LJIIIIZZ(LIZ, str, bundle2);
        }
        if (bundle != null) {
            int iLIZJ = C838390Wuj.LIZJ(bundle);
            b.LIZ.getClass();
            if (iLIZJ >= C0C64.LJIILLIIL().LJIJ(31744, 500, "creative_large_transaction_size_threshold", true) * 1024) {
                String string = UUID.randomUUID().toString();
                Bundle bundle3 = new Bundle(bundle);
                ((ConcurrentHashMap) LIZIZ).put(string, bundle3);
                ((WeakHashMap) LIZLLL).put(context, string);
                bundle.clear();
                C786410Ut5.LJJJI("save_state_bundle_uuid", string, bundle);
                C201954140i c201954140i2 = C201954140i.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LargeTransaction, ");
                sbLIZ2.append(context.getClass().getSimpleName());
                sbLIZ2.append(" storeActivityIntent store state uuid: ");
                sbLIZ2.append(string);
                sbLIZ2.append(", bundle size ");
                sbLIZ2.append(C838390Wuj.LIZJ(bundle3));
                C201955140j.LJIILJJIL(c201954140i2, C2188811AlT.LIZIZ(sbLIZ2));
                LJIIIIZZ(LIZ, string, bundle3);
            }
        }
        ((WeakHashMap) LJ).put(context, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[PHI: r0
      0x007c: PHI (r0v10 android.os.Bundle) = (r0v9 android.os.Bundle), (r0v19 android.os.Bundle) binds: [B:14:0x0048, B:18:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Context r6, android.content.Intent r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: joo.f.LIZJ(android.content.Context, android.content.Intent, android.os.Bundle):void");
    }

    public static void LJFF(Context context, Intent intent, Bundle bundle) throws Throwable {
        LIZIZ(intent);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_2");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJ(context, intent, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOapcZjLkiZMwmGWWQ3jzzBc9k0YSkGjdB7Rw7obGhUIB5U=", null));
    }

    public static void LJI(Activity activity, int i, Intent intent) {
        LIZIZ(intent);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOapcZjLkiZMwmGWWQ3jzzBc9k0YSkGjdB7Rw7obGhUIB5U=", null));
    }

    public static void LJIIIIZZ(f fVar, String str, Bundle bundle) {
        fVar.getClass();
        byte[] bArrLIZLLL = C838390Wuj.LIZLLL(bundle);
        if (bArrLIZLLL.length != 0) {
            ARunnableS0S1210100_26 aRunnableS0S1210100_26 = new ARunnableS0S1210100_26(str, System.currentTimeMillis(), null, bArrLIZLLL, false, 0);
            if (LJIIIIZZ.getCount() == 0) {
                LJIIIIZZ = new CountDownLatch(1);
            }
            ((ArrayList) LJI).add(aRunnableS0S1210100_26);
            LJII.execute(aRunnableS0S1210100_26);
            if (C2214201BlK.LJIIJJI) {
                try {
                    LJIIIIZZ.await(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
