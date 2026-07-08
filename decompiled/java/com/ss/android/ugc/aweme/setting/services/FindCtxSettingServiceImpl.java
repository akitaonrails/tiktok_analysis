package com.ss.android.ugc.aweme.setting.services;

import X.C020I;
import X.C0WZX;
import X.C1070520dxq;
import X.C1070540dxs;
import X.C19EG;
import X.C2204961BRm;
import Y.AObserverS220S0100000_16;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class FindCtxSettingServiceImpl implements IFindCtxSettingService {
    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJI() {
        C1070520dxq.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final boolean LJIILLIIL() {
        C1070520dxq.LIZ.getClass();
        return C1070520dxq.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LIZIZ(C19EG c19eg) throws Throwable {
        C1070520dxq.LIZ.getClass();
        if (c19eg != null) {
            C2204961BRm.LJIILIIL(c19eg, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94h7pDIDOYxag81xAlF0nvWtFUOqUK2CRAFt69oG3H40cpg==", null));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final CharSequence LIZLLL(Context context) {
        C1070520dxq.LIZ.getClass();
        return C1070520dxq.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJ(String str) {
        C1070520dxq.LIZ.getClass();
        FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
        if (findCtxViewModel != null) {
            findCtxViewModel.vQ2(new C1070540dxs(str, true));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIILJJIL(Context context) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LJIILL(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIILL(ViewModelStoreOwner viewModelStoreOwner) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LJII(viewModelStoreOwner);
        C1070520dxq.LJI();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LIZJ(LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1) {
        MutableLiveData<C1070540dxs> mutableLiveData;
        C1070520dxq.LIZ.getClass();
        FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
        if (findCtxViewModel != null && (mutableLiveData = findCtxViewModel.LLILZ) != null) {
            mutableLiveData.observe(lifecycleOwner, new AObserverS220S0100000_16(function1, 24));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJFF(LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1) {
        MutableLiveData<C1070540dxs> mutableLiveData;
        C1070520dxq.LIZ.getClass();
        FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
        if (findCtxViewModel != null && (mutableLiveData = findCtxViewModel.LLILZLL) != null) {
            mutableLiveData.observe(lifecycleOwner, new AObserverS220S0100000_16(function1, 26));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIL(LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1) {
        MutableLiveData<C1070540dxs> mutableLiveData;
        C1070520dxq.LIZ.getClass();
        FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
        if (findCtxViewModel != null && (mutableLiveData = findCtxViewModel.LLILZIL) != null) {
            mutableLiveData.observe(lifecycleOwner, new AObserverS220S0100000_16(function1, 25));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIILIIL(Integer num, String str) {
        C1070520dxq.LIZ.LJIIIZ(num, str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJII(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LJIJJ(context, lifecycleOwner, z);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIIZ(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LJIJI(context, lifecycleOwner, z);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIJ(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LJIJJLI(context, lifecycleOwner, z);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIIIZZ(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        C020I c020i = new C020I(context, lifecycleOwner, function1, function12, 2);
        c1070520dxq.getClass();
        C1070520dxq.LJIJ(context, lifecycleOwner, function1, function12, c020i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIJJI(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LIZIZ(context, lifecycleOwner, function1, function12);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIIZILJ(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        C020I c020i = new C020I(context, lifecycleOwner, function1, function12, 0);
        c1070520dxq.getClass();
        C1070520dxq.LJIILLIIL(context, lifecycleOwner, function1, function12, c020i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIJ(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LIZ(context, lifecycleOwner, function1, function12);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIJI(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        C020I c020i = new C020I(context, lifecycleOwner, function1, function12, 1);
        c1070520dxq.getClass();
        C1070520dxq.LJIIZILJ(context, lifecycleOwner, function1, function12, c020i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService
    public final void LJIJJ(Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        C1070520dxq.LIZ.getClass();
        C1070520dxq.LIZJ(context, lifecycleOwner, function1, function12);
    }
}
