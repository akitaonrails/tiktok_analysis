package com.ss.android.ugc.aweme.pipo.ccdc.nfc;

import X.C092O;
import X.C1722550uvV;
import X.C19EG;
import X.C356901a3;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes27.dex */
public final class EMVReader$lifecycleObserver$2$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1722550uvV LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public EMVReader$lifecycleObserver$2$1(C1722550uvV c1722550uvV) {
        this.LL = c1722550uvV;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        NfcAdapter.getDefaultAdapter(this.LL.LIZIZ).disableForegroundDispatch(this.LL.LIZIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C19EG c19eg = this.LL.LIZIZ;
        Intent intent = new Intent(c19eg, c19eg.getClass());
        intent.addFlags(536870912);
        NfcAdapter.getDefaultAdapter(this.LL.LIZIZ).enableForegroundDispatch(this.LL.LIZIZ, PendingIntent.getActivity(this.LL.LIZIZ, 0, intent, 33554432), new IntentFilter[]{new IntentFilter("android.nfc.action.TECH_DISCOVERED")}, new String[][]{new String[]{IsoDep.class.getName()}});
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        C1722550uvV c1722550uvV = this.LL;
        c1722550uvV.LIZIZ.addOnNewIntentListener((C092O) c1722550uvV.LJFF.getValue());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        C1722550uvV c1722550uvV = this.LL;
        c1722550uvV.LIZIZ.removeOnNewIntentListener((C092O) c1722550uvV.LJFF.getValue());
    }
}
