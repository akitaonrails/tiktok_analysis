package com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data;

import X.AnonymousClass1093;
import X.C109T;
import X.C191848103q;
import X.C191960107y;
import X.C191985108x;
import X.C191992109e;
import X.C192002109o;
import X.C192005109r;
import X.C356901a3;
import X.C632200Oqw;
import X.C856230XiP;
import X.InterfaceC1631630sYr;
import X.InterfaceC191997109j;
import X.InterfaceC192001109n;
import Y.AObserverS230S0100000_28;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public abstract class ValuedAccountPrivacySettingItemModel extends C109T implements InterfaceC192001109n {
    public final C191848103q LLIZ;
    public final InterfaceC191997109j LLIZLLLIL;
    public final ViewModelStoreOwner LLJ;
    public final LifecycleOwner LLJI;
    public boolean LLJIJIL;
    public final PrivacyUserSettingDataViewModel LLJILJIL;

    @Override // X.C109T
    public final C192005109r LJIILJJIL() {
        C192005109r c192005109rLJIILJJIL = super.LJIILJJIL();
        this.LLJILJIL.LLILLL.getValue();
        return c192005109rLJIILJJIL;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel$3, reason: invalid class name */
    public final class AnonymousClass3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass3() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
            ValuedAccountPrivacySettingItemModel valuedAccountPrivacySettingItemModel = ValuedAccountPrivacySettingItemModel.this;
            valuedAccountPrivacySettingItemModel.LLJILJIL.LLILZIL.add(valuedAccountPrivacySettingItemModel);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            ValuedAccountPrivacySettingItemModel valuedAccountPrivacySettingItemModel = ValuedAccountPrivacySettingItemModel.this;
            valuedAccountPrivacySettingItemModel.LLJILJIL.LLILZIL.remove(valuedAccountPrivacySettingItemModel);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
            ValuedAccountPrivacySettingItemModel.this.LLJIJIL = false;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
            ValuedAccountPrivacySettingItemModel.this.LLJIJIL = true;
        }
    }

    @Override // X.C109T
    public final C192002109o LJIILIIL(int i) {
        C192002109o c192002109oLJIILIIL = super.LJIILIIL(i);
        c192002109oLJIILIIL.LIZLLL = this.LLJILJIL.LLILLL.getValue();
        return c192002109oLJIILIIL;
    }

    public ValuedAccountPrivacySettingItemModel(C191848103q c191848103q, InterfaceC191997109j interfaceC191997109j) {
        super(interfaceC191997109j, c191848103q);
        this.LLIZ = c191848103q;
        this.LLIZLLLIL = interfaceC191997109j;
        ViewModelStoreOwner viewModelStoreOwner = c191848103q.LIZIZ;
        this.LLJ = viewModelStoreOwner;
        LifecycleOwner lifecycleOwner = c191848103q.LIZJ;
        this.LLJI = lifecycleOwner;
        PrivacyUserSettingDataViewModel privacyUserSettingDataViewModelLIZ = AnonymousClass1093.LIZ(viewModelStoreOwner, interfaceC191997109j.LIZ());
        this.LLJILJIL = privacyUserSettingDataViewModelLIZ;
        privacyUserSettingDataViewModelLIZ.LLILLL.observe(this.LLJI, new AObserverS230S0100000_28(this, 54));
        privacyUserSettingDataViewModelLIZ.LLILZ.observe(this.LLJI, new AObserverS230S0100000_28(this, 55));
        lifecycleOwner.getLifecycle().addObserver(new AnonymousClass3());
        privacyUserSettingDataViewModelLIZ.LLILLL.getValue();
    }

    public void LIZ(int i, Throwable th) {
        C632200Oqw c632200Oqw;
        String errorMsg;
        if (!this.LLJIJIL) {
            return;
        }
        if ((th instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th) != null && (errorMsg = c632200Oqw.getErrorMsg()) != null && errorMsg.length() != 0) {
            C191960107y.LJ(this.LLIZ, errorMsg);
        } else {
            C191848103q c191848103q = this.LLIZ;
            C191960107y.LIZ();
            C191960107y.LIZLLL(c191848103q, 2131835079);
        }
        this.LLIZLLLIL.LIZLLL();
    }

    public void LIZIZ(int i, BaseResponse baseResponse) {
        C191992109e c191992109e = this.LLILZ;
        C192002109o c192002109oLJIILIIL = LJIILIIL(i);
        c192002109oLJIILIIL.LIZLLL = this.LLJILJIL.LL;
        c191992109e.LIZIZ(c192002109oLJIILIIL);
        InterfaceC1631630sYr<ValuedAccountPrivacySettingItemModel, Integer, Integer, BaseResponse, Unit> interfaceC1631630sYrLIZIZ = this.LLIZLLLIL.LIZIZ();
        if (interfaceC1631630sYrLIZIZ != null) {
            interfaceC1631630sYrLIZIZ.invoke(this, this.LLJILJIL.LL, Integer.valueOf(i), baseResponse);
        }
    }

    @Override // X.C109T
    public final void LJIJ(int i, View view) {
        this.LLJILJIL.wQ2(i, null, null, null);
        super.LJIJ(i, view);
    }

    public final void LJIJI(int i, View view) {
        this.LLILZ.LIZ(LJIILIIL(i));
        if (!C191985108x.LIZIZ(LJIILLIIL(), view)) {
            return;
        }
        C191985108x.LIZ(C856230XiP.LIZ(LJIILLIIL(), Integer.valueOf(i)), view);
    }
}
