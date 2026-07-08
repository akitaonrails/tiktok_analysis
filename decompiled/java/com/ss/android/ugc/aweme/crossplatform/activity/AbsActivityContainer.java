package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C1043690dGZ;
import X.InterfaceC1038990d8z;
import X.InterfaceC342470Dbh;
import android.content.Intent;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsActivityContainer implements InterfaceC342470Dbh, InterfaceC1038990d8z, GenericLifecycleObserver {
    public abstract void LJIIZILJ(C1043690dGZ c1043690dGZ);

    public abstract void LJIJ();

    public abstract boolean LJIJI(int i, String str);

    public abstract void LJIJJ(InterfaceC342470Dbh interfaceC342470Dbh);

    public abstract void LJIJJLI(int i, Intent intent);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
