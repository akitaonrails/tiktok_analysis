package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0J7I;
import X.C0XPD;
import X.C0XQ7;
import X.C1076010e6h;
import X.C10EU;
import X.C1243240iSQ;
import X.C1336305Kv;
import X.C149A;
import X.C1812120xFy;
import X.C1812160xG2;
import X.C1839790xyb;
import X.C19EG;
import X.C20639815pc;
import X.C207236167m;
import X.C207245167v;
import X.C20748616Hc;
import X.C20749416Hk;
import X.C2222691Bz1;
import X.C750550TcL;
import X.InterfaceC1812170xG3;
import X.InterfaceC1839810xyd;
import X.InterfaceC20311214di;
import X.InterfaceC207238167o;
import X.InterfaceC207239167p;
import X.InterfaceC207240167q;
import X.InterfaceC207241167r;
import X.InterfaceC2262081DgM;
import X.InterfaceC472150IfN;
import X.InterfaceC586170Myt;
import X.InterfaceC626120Oh8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes32.dex */
public class LiveHostUser implements IHostUser {
    public C207236167m LL;
    public C1839790xyb LLILLJJLI;

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean interceptOperation(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void dismissCaptcha() {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).dismissCaptcha();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final List<C750550TcL> getAllFriends() {
        List<IMUser> allFriends = C1336305Kv.LIZ().getImUserService().getAllFriends();
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : allFriends) {
            if (!IMUser.isInvalidUser(iMUser.getUid()) && iMUser.getAvatarThumb() != null) {
                arrayList.add(new C750550TcL(Long.valueOf(CastLongProtector.parseLong(iMUser.getUid())), iMUser.getSecUid(), iMUser.getNickName(), iMUser.getUniqueId(), new ImageModel(iMUser.getAvatarThumb().getUri(), iMUser.getAvatarThumb().getUrlList())));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final InterfaceC2262081DgM getCurUser() {
        return C20639815pc.LIZLLL(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final long getCurUserId() {
        return CastLongProtector.parseLong(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getCurrentRegionCode() {
        return C2222691Bz1.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getEmail() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? "" : currentUser.getEmail();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isDeleteByAgeGate() {
        return C10EU.LJIIIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isLogin() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isMinorMode() {
        return C10EU.LJIIIIZZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNeedProtectMinor() {
        return ComplianceServiceProvider.LJIL().LJJJJZI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isNewUser() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isNewUser();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void cacheUserBeforeEnterProfile(com.bytedance.android.live.base.model.user.User user) {
        IUserProfilePreload iUserProfilePreload;
        User userLIZJ = C20639815pc.LIZJ(user);
        if (userLIZJ == null || (iUserProfilePreload = (IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)) == null) {
            return;
        }
        iUserProfilePreload.LIZ(userLIZJ);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void observeAccountChange(final C0J7I c0j7i) {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0J7J
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                C0J7I c0j7i2 = c0j7i;
                if (z) {
                    c0j7i2.LIZ();
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerCurrentUserUpdateListener(InterfaceC207240167q interfaceC207240167q) {
        if (this.LL == null) {
            this.LL = new C207236167m();
        }
        C207236167m c207236167m = this.LL;
        c207236167m.LIZ = interfaceC207240167q;
        synchronized (c207236167m) {
            if (!EventBus.LIZLLL().LJIIJ(c207236167m)) {
                EventBus.LIZLLL().LJIJJ(c207236167m);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerFollowStatusListener(InterfaceC1839810xyd interfaceC1839810xyd) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C1839790xyb();
        }
        C1839790xyb c1839790xyb = this.LLILLJJLI;
        c1839790xyb.LIZ = interfaceC1839810xyd;
        synchronized (c1839790xyb) {
            if (!EventBus.LIZLLL().LJIIJ(c1839790xyb)) {
                EventBus.LIZLLL().LJIJJ(c1839790xyb);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void reportData(String str) {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void event(String str, String str2) {
        IRuntimeBehaviorService iRuntimeBehaviorService = (IRuntimeBehaviorService) PluggableExtentionKt.pluggableSpi(IRuntimeBehaviorService.class);
        if (iRuntimeBehaviorService != null) {
            iRuntimeBehaviorService.event(str, str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final Map<String, String> frameSign(String str, int i) {
        return ((ISecApi) ServiceManager.get().getService(ISecApi.class)).frameSign(str, i);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final String getTTDisPlayName(String str, String str2) {
        C1243240iSQ.LIZ.getClass();
        return C1243240iSQ.LIZLLL(str2, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void onFollowStatusChanged(int i, long j) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.setUserId(String.valueOf(j));
        followStatus.setFollowStatus(i);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(followStatus);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void requestLivePermission(InterfaceC472150IfN interfaceC472150IfN, String str) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIILIIL(interfaceC472150IfN, str, str, null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).jumpLiveSquareWithLogin(context, str, str2, interfaceC20311214di);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void popCaptchaV2(Activity activity, String str, final InterfaceC207238167o interfaceC207238167o, Fragment fragment) {
        if (activity == null) {
            if (interfaceC207238167o != null) {
                interfaceC207238167o.LIZJ();
                return;
            }
            return;
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptchaV2(activity, str, new C149A() { // from class: X.167n
            @Override // X.C149A
            public final void LIZ() {
                InterfaceC207238167o interfaceC207238167o2 = interfaceC207238167o;
                if (interfaceC207238167o2 != null) {
                    interfaceC207238167o2.LIZ();
                }
            }

            @Override // X.C149A
            public final void LIZJ() {
                InterfaceC207238167o interfaceC207238167o2 = interfaceC207238167o;
                if (interfaceC207238167o2 != null) {
                    interfaceC207238167o2.LIZJ();
                }
            }

            @Override // X.C149A
            public final void LIZLLL() {
                InterfaceC207238167o interfaceC207238167o2 = interfaceC207238167o;
                if (interfaceC207238167o2 != null) {
                    interfaceC207238167o2.LIZIZ();
                }
            }

            @Override // X.C149A
            public final void LIZIZ(int i, boolean z) {
                InterfaceC207238167o interfaceC207238167o2;
                if (z && (interfaceC207238167o2 = interfaceC207238167o) != null) {
                    interfaceC207238167o2.onSuccess();
                }
            }
        }, fragment);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unFollowWithConfirm(Activity activity, int i, long j, InterfaceC1812170xG3 interfaceC1812170xG3) {
        final C1812160xG2 c1812160xG2 = (C1812160xG2) interfaceC1812170xG3;
        C207245167v c207245167v = c1812160xG2.LIZLLL;
        long j2 = c1812160xG2.LIZ.LIZ;
        C1812120xFy c1812120xFy = c1812160xG2.LIZIZ;
        c207245167v.LJJ(0, j2, c1812120xFy.LIZLLL, c1812120xFy.LJFF, c1812120xFy.LJ, c1812120xFy.LJI, false, false).LIZIZ(new InterfaceC626120Oh8<FollowPair>() { // from class: X.0xG4
            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                c1812160xG2.LIZJ.onComplete();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                c1812160xG2.LIZJ.onError(th);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(FollowPair followPair) {
                c1812160xG2.LIZJ.onNext(followPair);
                c1812160xG2.LIZJ.onComplete();
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void bindMobile(Activity activity, String str, String str2, Bundle bundle, InterfaceC207239167p interfaceC207239167p) {
        ((IBindService) ServiceManager.get().getService(IBindService.class)).bindMobile(activity, str, str2, bundle, new C20748616Hc(interfaceC207239167p, 6));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void login(C19EG c19eg, InterfaceC207241167r interfaceC207241167r, String str, String str2, int i, String str3, String str4, String str5) {
        C0XPD.LIZIZ(c19eg, str4, "live_room", null, new C20749416Hk(interfaceC207241167r, 2));
    }
}
