package com.ss.android.ugc.aweme.localservice.inflater;

import X.C08I7;
import X.C1388190mED;
import X.C19EG;
import X.C259800zU;
import X.C686930Qx1;
import X.C686950Qx3;
import X.C786410Ut5;
import X.InterfaceC1181450gql;
import Y.ARunnableS17S0201000_10;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class LSAsyncInflater implements InterfaceC1181450gql {
    public static final LSAsyncInflater LIZ = new LSAsyncInflater();
    public static final WeakHashMap<Context, C686930Qx1> LIZIZ = new WeakHashMap<>();
    public static final C08I7<Integer, String> LIZJ = new C08I7<>(32);
    public static final Set<Integer> LIZLLL = new LinkedHashSet();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // X.InterfaceC1181450gql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZ(android.content.Context r5, int r6, android.view.ViewGroup r7, boolean r8) {
        /*
            r4 = this;
            java.lang.System.currentTimeMillis()
            java.util.WeakHashMap<android.content.Context, X.0Qx1> r0 = com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater.LIZIZ
            java.lang.Object r0 = r0.get(r5)
            X.0Qwv r0 = (X.C686870Qwv) r0
            if (r0 == 0) goto L54
            boolean r1 = r0.LIZ(r6)
            android.view.View r0 = r0.LIZIZ(r6)
            if (r0 == 0) goto L55
            if (r7 == 0) goto L5d
            if (r8 == 0) goto L5d
            r7.addView(r0)
        L1e:
            java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L51
            java.lang.String r3 = "READY"
        L25:
            X.08I7<java.lang.Integer, java.lang.String> r1 = com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.LIZIZ(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.LIZIZ(r0)
            java.lang.String r0 = "layout_name"
            X.C1189060h32.LJIL(r2, r0, r1)
            java.lang.String r0 = "cache_type"
            X.C1189060h32.LJIL(r2, r0, r3)
            X.0gwY r0 = X.C1185040gwY.LIZ
            java.lang.String r1 = "ls_prf_layout_inflate_event"
            r0.getClass()
            r0 = 0
            X.C1185040gwY.LIZJ(r1, r2, r0)
            return r7
        L51:
            java.lang.String r3 = "NO_CACHE"
            goto L25
        L54:
            r1 = 0
        L55:
            android.view.LayoutInflater r0 = X.C786410Ut5.ne(r5)
            android.view.View r0 = X.C786410Ut5.Td(r0, r6, r7, r8)
        L5d:
            r7 = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater.LIZ(android.content.Context, int, android.view.ViewGroup, boolean):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0Qx1] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1181450gql
    public final void LIZIZ(final Context context, Integer num, String str, int i, int i2, final LifecycleOwner lifecycleOwner) {
        int iIntValue;
        Integer numLIZLLL;
        final C19EG c19egLIZIZ;
        LifecycleOwner lifecycleOwner2;
        int i3 = i;
        C259800zU c259800zU = new C259800zU();
        WeakHashMap<Context, C686930Qx1> weakHashMap = LIZIZ;
        ?? r0 = weakHashMap.get(context);
        c259800zU.element = r0;
        if (r0 == 0 && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c259800zU.element = new C686930Qx1(c19egLIZIZ);
            if (lifecycleOwner == null) {
                lifecycleOwner2 = c19egLIZIZ;
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            lifecycleOwner2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater$preload$2$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        LSAsyncInflater.LIZIZ.remove(context);
                        LifecycleOwner lifecycleOwner4 = lifecycleOwner;
                        if (lifecycleOwner4 == null) {
                            lifecycleOwner4 = c19egLIZIZ;
                        }
                        lifecycleOwner4.getLifecycle().removeObserver(this);
                    }
                }
            });
            weakHashMap.put(context, (C686930Qx1) c259800zU.element);
        }
        if (num != null) {
            num.intValue();
            C686930Qx1 c686930Qx1 = (C686930Qx1) c259800zU.element;
            if (c686930Qx1 != null && (numLIZLLL = c686930Qx1.LIZLLL(num.intValue())) != null) {
                iIntValue = numLIZLLL.intValue();
            } else {
                iIntValue = 0;
            }
            int i4 = i2 - iIntValue;
            if (i4 <= i3) {
                i3 = i4;
            }
            if (i3 > 0) {
                C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS17S0201000_10(c259800zU, num, i3, str, i2, 2));
            }
        }
        C08I7<Integer, String> c08i7 = LIZJ;
        if (num != null) {
            int iIntValue2 = num.intValue();
            if (str != null) {
                c08i7.LIZLLL(Integer.valueOf(iIntValue2), str);
            }
        }
    }
}
