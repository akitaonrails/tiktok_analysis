package com.ss.android.ugc.aweme.effect;

import X.C01TT;
import X.C0CHQ;
import X.C0T3H;
import X.C23250099c;
import X.C860930Xpz;
import X.C860960Xq2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS258S0300000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EffectCreationBanStatusViewModel extends ViewModel implements C0T3H, GenericLifecycleObserver {
    public static final Map<String, TTAppMGetUserPunishmentStatusResp> LLILZIL = new LinkedHashMap();
    public static final TTAppMGetUserPunishmentStatusResp LLILZLL = new TTAppMGetUserPunishmentStatusResp(1, 0, null);
    public final MutableLiveData<Integer> LL = new MutableLiveData<>();
    public final C860960Xq2 LLILLJJLI = new C860960Xq2();
    public final EffectCreationBanStatusService LLILLL;
    public boolean LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final boolean vQ2() {
        if (this.LLILZ) {
            return false;
        }
        Integer value = this.LL.getValue();
        if (value != null && value.intValue() == 2) {
            return true;
        }
        Integer value2 = this.LL.getValue();
        return value2 != null && value2.intValue() == 1 && this.LLILLJJLI.LIZIZ() == 3;
    }

    public EffectCreationBanStatusViewModel() {
        EffectCreationBanStatusService.LIZ.getClass();
        this.LLILLL = (EffectCreationBanStatusService) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofitWithInterceptors(C0CHQ.LIZ().getNetworkService().getApiHost(), true, EffectCreationBanStatusService.class, Collections.singletonList(new EPRequestInterceptor()));
        if (((LinkedHashMap) LLILZIL).get(C0CHQ.LIZ().getAccountService().getCurrentUserID()) == null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C860930Xpz(this, null), 3);
        }
    }

    @Override // X.C0T3H
    public final void eP1(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        TTAppMGetUserPunishmentStatusResp tTAppMGetUserPunishmentStatusResp = (TTAppMGetUserPunishmentStatusResp) ((LinkedHashMap) LLILZIL).get(C0CHQ.LIZ().getAccountService().getCurrentUserID());
        if (tTAppMGetUserPunishmentStatusResp != null) {
            int i = tTAppMGetUserPunishmentStatusResp.userPunishmentStatus;
            if (i != 3) {
                function1.invoke(Integer.valueOf(i));
                return;
            }
            return;
        }
        C01TT.LIZLLL(new AwS258S0300000_14(this, (EffectCreationBanStatusViewModel) lifecycleOwner, (LifecycleOwner) function1, (Function1<? super Integer, Unit>) 3));
    }
}
