package com.ss.android.ugc.aweme.setting.ui.rvmpcompose;

import X.AbstractC848400XPy;
import X.C063M;
import X.C0C0W;
import X.C0CQT;
import X.C0XGN;
import X.C0XQ7;
import X.C11JF;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1688880u3C;
import X.C1733506qb;
import X.C1906580ziK;
import X.C19290910dX;
import X.C19320710iL;
import X.C19321110iP;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C848040XOo;
import X.EnumC1254690ikt;
import X.InterfaceC0148002o;
import X.InterfaceC19320610iK;
import X.InterfaceC19474811He;
import X.InterfaceC2254908sV;
import X.InterfaceC500500Jk0;
import Y.AfS197S0100000_28;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS271S0000000_28;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingsRvmpComposeViewModel extends AssemViewModel<C1688880u3C> implements InterfaceC2254908sV, LifecycleEventObserver {
    public boolean LLILZIL;
    public C11JF LLIZ;
    public final C19321110iP LL = new Object() { // from class: X.10iP
        @C14EU(threadMode = ThreadMode.MAIN)
        public final void onEvent(C19321210iQ c19321210iQ) {
            this.LIZ.setState(AFwS271S0000000_28.get$arr$(207));
        }

        @C14EU(threadMode = ThreadMode.MAIN)
        public final void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
            this.LIZ.setState(AFwS271S0000000_28.get$arr$(208));
        }
    };
    public final C19320710iL LLILLJJLI = C19320710iL.LL;
    public final C11NJ LLILLL = new C11NJ();
    public final CopyOnWriteArraySet<String> LLILZ = new CopyOnWriteArraySet<>();
    public int LLILZLL = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1688880u3C("", false, false, false, false, null, new C063M(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean getUseCoroutines() {
        return C0C0W.LIZ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJ();
        C19290910dX.LJIIIZ();
        EventBus.LIZLLL().LJJI(this.LL);
        SettingsManagerProxy.inst().removeSettingsWatcher(this.LLILLJJLI);
    }

    public final void vQ2() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (C19290910dX.LIZJ()) {
                C2277881EDy.LIZIZ.queryProfileResponse(new WeakHandler(new WeakHandler.IHandler() { // from class: X.0il8
                    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                    public final void handleMsg(Message message) {
                        UserResponse userResponse;
                        User user;
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if ((messageObj instanceof UserResponse) && (user = (userResponse = (UserResponse) messageObj).getUser()) != null && userResponse.status_code == 0) {
                            this.LL.LLILZLL = user.getProAccountUpdateNotificationStatus();
                            SettingsRvmpComposeViewModel settingsRvmpComposeViewModel = this.LL;
                            int i = settingsRvmpComposeViewModel.LLILZLL;
                            if (i < 0 || i > 2) {
                                settingsRvmpComposeViewModel.LLILZLL = 0;
                            }
                        }
                    }
                }), EnumC1254690ikt.SETTINGS);
                return;
            }
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keva_key_need_write_red_dot");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                ((InterfaceC19320610iK) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC19320610iK.class)).LIZ().LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0Cu9
                    @Override // X.InterfaceC19474811He
                    public final void onError(Throwable th) {
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSuccess(BaseResponse baseResponse) {
                        boolean z;
                        if (baseResponse.status_code != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Keva repo2 = Keva.getRepo("keva_repo_qa");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("keva_key_need_write_red_dot");
                        sbLIZ2.append(C0XQ7.LJFF().getCurUserId());
                        repo2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), z);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC2254908sV
    public final CopyOnWriteArraySet<String> Lk2() {
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IBenchmarkService iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin;
        int i = C1733506qb.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false)) != null) {
                        iBenchmarkServiceCreateIBenchmarkServicebyMonsterPlugin.stopBenchmark();
                        return;
                    }
                    return;
                }
                this.LLILZIL = true;
                this.LLIZ = (C11JF) C11NZ.LJLLILLLL(C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()), C1906580ziK.LIZJ().LJI(), new InterfaceC500500Jk0() { // from class: X.10iI
                    @Override // X.InterfaceC500500Jk0
                    public final Object apply(Object obj, Object obj2) {
                        return new C19320510iJ((ITpcConsentService) obj, (AbstractC1387200mCc) obj2);
                    }
                }).LJL(C11S5.LIZ()).LJJLJLI(new AfS197S0100000_28(this, 21));
                return;
            }
            if (C848040XOo.LIZIZ != null) {
                C0XGN.LJ();
            }
            if (this.LLILZIL && this.LLILZLL == 1) {
                vQ2();
            }
            this.LLILZIL = false;
            this.LLIZ = (C11JF) C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()).LJL(C11S5.LIZ()).LJJLJLI(new AfS197S0100000_28(this, 79));
            return;
        }
        BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).startBenchmark(1);
    }
}
