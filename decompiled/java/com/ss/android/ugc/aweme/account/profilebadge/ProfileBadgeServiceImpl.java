package com.ss.android.ugc.aweme.account.profilebadge;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C09JN;
import X.C0CQT;
import X.C0XQ7;
import X.C11S5;
import X.C1701940uOG;
import X.C786410Ut5;
import X.InterfaceC1256690io7;
import X.InterfaceC20579715fv;
import X.InterfaceC20579815fw;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import Y.AfS200S0100000_31;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ProfileBadgeServiceImpl implements IProfileBadgeService, WeakHandler.IHandler {
    public static final int $stable = 8;
    public ProfileBadgeStruct curBadgeStruct;
    public Handler mainHandler = new BPEAHandler(Looper.getMainLooper());
    public final List<InterfaceC1256690io7> listeners = new ArrayList();
    public final List<WeakReference<InterfaceC20579815fw>> isShowListeners = new ArrayList();
    public final List<WeakReference<InterfaceC20579715fv>> idListeners = new ArrayList();

    private final void onIdUpdateError() {
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS131S0100000_31(this, 43));
    }

    private final void onIsShowUpdateError() {
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS131S0100000_31(this, 44));
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void refresh() {
        boolean zLJI = MethodIDManager.LJI(196665);
        UserGetApi.LIZ.getClass();
        ((UserGetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(UserGetApi.class)).getSelf().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS200S0100000_31(this, 7), new C09JN() { // from class: X.0ylw
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ProfileBadgeServiceImpl@6c54.refresh$2");
                C1C7U.LIZIZ("ProfileBadgeServiceImpl@6c54.refresh$2");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static IProfileBadgeService createIProfileBadgeServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IProfileBadgeService.class, z);
        if (objLIZ != null) {
            return (IProfileBadgeService) objLIZ;
        }
        if (C04TD.LJLJJL == null) {
            synchronized (IProfileBadgeService.class) {
                if (C04TD.LJLJJL == null) {
                    C04TD.LJLJJL = new ProfileBadgeServiceImpl();
                }
            }
        }
        return C04TD.LJLJJL;
    }

    private final void updateBadgeId(Long l) {
        ProfileBadgeStruct profileBadgeStruct;
        if (l != null && (profileBadgeStruct = this.curBadgeStruct) != null) {
            profileBadgeStruct.setId(l);
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJJJZI(this.curBadgeStruct);
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS131S0100000_31(this, 45));
    }

    private final void updateBadgeShouldShow(Boolean bool) {
        ProfileBadgeStruct profileBadgeStruct;
        if (bool != null && (profileBadgeStruct = this.curBadgeStruct) != null) {
            profileBadgeStruct.setShouldShow(bool.booleanValue());
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJJJZI(this.curBadgeStruct);
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS131S0100000_31(this, 46));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            onIsShowUpdateError();
            onIdUpdateError();
            return;
        }
        Long id = null;
        if (HandlerHook.getMessageObj(message.obj) instanceof User) {
            ProfileBadgeStruct profileBadge = ((User) HandlerHook.getMessageObj(message.obj)).getProfileBadge();
            if (profileBadge != null) {
                boolValueOf2 = Boolean.valueOf(profileBadge.getShouldShow());
            } else {
                boolValueOf2 = null;
            }
            updateBadgeShouldShow(boolValueOf2);
            ProfileBadgeStruct profileBadge2 = ((User) HandlerHook.getMessageObj(message.obj)).getProfileBadge();
            if (profileBadge2 != null) {
                id = profileBadge2.getId();
            }
            updateBadgeId(id);
            return;
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof UserResponse)) {
            return;
        }
        int action = ((UserResponse) HandlerHook.getMessageObj(message.obj)).getAction();
        if (action != 1) {
            if (action != 2) {
                ProfileBadgeStruct profileBadge3 = ((UserResponse) HandlerHook.getMessageObj(message.obj)).getUser().getProfileBadge();
                if (profileBadge3 != null) {
                    boolValueOf = Boolean.valueOf(profileBadge3.getShouldShow());
                } else {
                    boolValueOf = null;
                }
                updateBadgeShouldShow(boolValueOf);
                ProfileBadgeStruct profileBadge4 = ((UserResponse) HandlerHook.getMessageObj(message.obj)).getUser().getProfileBadge();
                if (profileBadge4 != null) {
                    id = profileBadge4.getId();
                }
                updateBadgeId(id);
                return;
            }
            onIsShowUpdateError();
            onIdUpdateError();
            return;
        }
        onIsShowUpdateError();
        onIdUpdateError();
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void removeProfileBadgeIdListener(InterfaceC20579715fv interfaceC20579715fv) {
        Iterator<WeakReference<InterfaceC20579715fv>> it2 = this.idListeners.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().get(), interfaceC20579715fv)) {
                it2.remove();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void removeProfileBadgeIsShowListener(InterfaceC20579815fw interfaceC20579815fw) {
        Iterator<WeakReference<InterfaceC20579815fw>> it2 = this.isShowListeners.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().get(), interfaceC20579815fw)) {
                it2.remove();
            }
        }
    }

    public final void safeUpdateListeners(ProfileBadgeStruct profileBadgeStruct) {
        synchronized (this.listeners) {
            try {
                Iterator<InterfaceC1256690io7> it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(profileBadgeStruct);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void subscribe(InterfaceC1256690io7 interfaceC1256690io7) {
        synchronized (this.listeners) {
            try {
                this.listeners.add(interfaceC1256690io7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void unsubscribe(InterfaceC1256690io7 interfaceC1256690io7) {
        synchronized (this.listeners) {
            try {
                this.listeners.remove(interfaceC1256690io7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void updateListeners(ProfileBadgeStruct profileBadgeStruct) {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJJJZI(profileBadgeStruct);
        C786410Ut5.LJJZZIII(this.mainHandler, new ARunnableS100S0200000_31(this, profileBadgeStruct, 10));
    }

    public final void updatePushSettings(User user) {
        boolean z;
        IVideoGiftService iVideoGiftServiceLJI = VideoGiftService.LJI();
        if (user.getVideoGiftStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        iVideoGiftServiceLJI.LJFF(z);
    }

    public final synchronized void safeUpdateIdListeners(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        Iterator<WeakReference<InterfaceC20579715fv>> it2 = this.idListeners.iterator();
        while (it2.hasNext()) {
            InterfaceC20579715fv interfaceC20579715fv = it2.next().get();
            if (interfaceC20579715fv != null) {
                if (z) {
                    interfaceC20579715fv.LIZ(profileBadgeStruct);
                } else {
                    interfaceC20579715fv.onFail();
                }
            }
        }
    }

    public final void safeUpdateIsShowListeners(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        synchronized (this.isShowListeners) {
            try {
                Iterator<WeakReference<InterfaceC20579815fw>> it2 = this.isShowListeners.iterator();
                while (it2.hasNext()) {
                    InterfaceC20579815fw interfaceC20579815fw = it2.next().get();
                    if (interfaceC20579815fw != null) {
                        if (z) {
                            interfaceC20579815fw.LIZ(profileBadgeStruct);
                        } else {
                            interfaceC20579815fw.onFail();
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void updateProfileBadgeId(long j, InterfaceC20579715fv interfaceC20579715fv) {
        this.curBadgeStruct = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getProfileBadge();
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIIJJI(new WeakHandler(this), Long.valueOf(j));
        this.idListeners.add(new WeakReference<>(interfaceC20579715fv));
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void updateProfileBadgeIsShow(boolean z, InterfaceC20579815fw interfaceC20579815fw) {
        this.curBadgeStruct = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getProfileBadge();
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIIJJIZ(new WeakHandler(this), z);
        synchronized (this.isShowListeners) {
            try {
                this.isShowListeners.add(new WeakReference<>(interfaceC20579815fw));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
