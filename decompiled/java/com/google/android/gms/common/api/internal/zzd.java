package com.google.android.gms.common.api.internal;

import X.C786410Ut5;
import X.C830490Whz;
import X.InterfaceC831130Wj1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class zzd extends Fragment implements InterfaceC831130Wj1 {
    public static final WeakHashMap LLILZ = new WeakHashMap();
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmEwHELIOSJyghJiF9KTUlZyY9PCA+Jy4/Zj82LQ==";
    public final Map LL = Collections.synchronizedMap(new C830490Whz());
    public int LLILLJJLI = 0;
    public Bundle LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = 5;
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLILLJJLI = 3;
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            ((LifecycleCallback) it2.next()).LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLILLJJLI = 2;
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            ((LifecycleCallback) it2.next()).LJII();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLILLJJLI = 4;
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            ((LifecycleCallback) it2.next()).LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC831130Wj1
    public final /* synthetic */ Activity s8() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.LLILLJJLI = 1;
        this.LLILLL = bundle;
        for (Map.Entry entry : this.LL.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.LJ(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.LL.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).LJI(bundle2);
            C786410Ut5.LJJIIZI(bundle, bundle2, (String) entry.getKey());
        }
    }

    @Override // X.InterfaceC831130Wj1
    public final void jM(final String str, final LifecycleCallback lifecycleCallback) {
        if (!this.LL.containsKey(str)) {
            this.LL.put(str, lifecycleCallback);
            if (this.LLILLJJLI > 0) {
                new zzi(Looper.getMainLooper()).post(new Runnable() { // from class: X.19Cw
                    public final void LIZ() {
                        zzd zzdVar = this.LLILLL;
                        if (zzdVar.LLILLJJLI > 0) {
                            LifecycleCallback lifecycleCallback2 = lifecycleCallback;
                            Bundle bundle = zzdVar.LLILLL;
                            lifecycleCallback2.LJ(bundle != null ? bundle.getBundle(str) : null);
                        }
                        if (this.LLILLL.LLILLJJLI >= 2) {
                            lifecycleCallback.LJII();
                        }
                        if (this.LLILLL.LLILLJJLI >= 3) {
                            lifecycleCallback.LJFF();
                        }
                        if (this.LLILLL.LLILLJJLI >= 4) {
                            lifecycleCallback.LJIIIIZZ();
                        }
                        if (this.LLILLL.LLILLJJLI >= 5) {
                            lifecycleCallback.getClass();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzc@449b.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzc@449b.run");
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // X.InterfaceC831130Wj1
    public final LifecycleCallback uu(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.LL.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            ((LifecycleCallback) it2.next()).LIZLLL(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            ((LifecycleCallback) it2.next()).LIZ(str, fileDescriptor, printWriter, strArr);
        }
    }
}
