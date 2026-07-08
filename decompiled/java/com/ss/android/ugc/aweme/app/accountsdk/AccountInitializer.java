package com.ss.android.ugc.aweme.app.accountsdk;

import X.C0XHA;
import X.C0XPY;
import X.InterfaceC1154304fN;
import X.InterfaceC427710Gpt;
import Y.ACallableS420S0100000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IAccountInitializer;
import com.ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.ss.android.ugc.aweme.account.IAccountInitService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.IDownloadService;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.app.services.WebviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountInitializer implements IAccountInitializer {
    @Override // com.ss.android.ugc.aweme.IAccountInitializer
    public final void LIZ(Application application) {
        C0XHA c0xha = new C0XHA() { // from class: X.0XIJ
            @Override // X.C0XHA
            public final Gson getGson() {
                return ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
            }

            @Override // X.C0XHA
            public final int LIZIZ(Throwable th) {
                if (th instanceof C1494430ozZ) {
                    if (((C1494430ozZ) th).getStatusCode() == 503) {
                        return -19;
                    }
                    return -16;
                }
                return 0;
            }

            @Override // X.C0XHA
            public final <T> T LIZ(String str, int i, String str2, Class<T> cls, String str3, List<? extends C2259691DcV> list) throws IOException {
                boolean zLIZIZ;
                if (list != null) {
                    String str4 = Api.LIZ;
                    if (String.class.equals(cls)) {
                        return (T) Api.LJ(str, i, str2, C0XIK.LIZ, str3);
                    }
                    C14SG c14sg = new C14SG(cls);
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    try {
                        zLIZIZ = C036E.LIZ.LIZIZ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        zLIZIZ = false;
                    }
                    if (zLIZIZ) {
                        return (T) Api.LJI(NetworkUtils.postFile(i, str, "file", str2, list), c14sg, str3, str);
                    }
                    throw new IOException();
                }
                String str5 = Api.LIZ;
                if (String.class.equals(cls)) {
                    return (T) Api.LJ(str, i, str2, C0XIK.LIZ, str3);
                }
                return (T) Api.LJ(str, i, str2, new C14SG(cls), str3);
            }
        };
        InterfaceC427710Gpt interfaceC427710Gpt = new InterfaceC427710Gpt() { // from class: X.0XQa
            public static String LIZ(User user) {
                if (user != null && user.getAvatarThumb() != null && !C1256140inE.LIZ(user.getAvatarThumb().getUrlList())) {
                    return (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
                }
                return "";
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [X.0XQc] */
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                boolean z;
                boolean z2 = false;
                IMUser iMUserLIZJ = null;
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i == 10) {
                                C1440005kM.LIZIZ(new IEvent() { // from class: X.0XQb
                                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                    public final /* synthetic */ IEvent post() {
                                        C1440005kM.LIZ(this);
                                        return this;
                                    }

                                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                    public final /* synthetic */ IEvent postSticky() {
                                        C1440005kM.LIZIZ(this);
                                        return this;
                                    }
                                });
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("code", 1);
                                    jSONObject.put("user_id", user2.getUid());
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                C1440005kM.LIZIZ(new C848460XQe("userLogin", jSONObject));
                            }
                        } else {
                            InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
                            if (user2 != null) {
                                IMUser.Companion.getClass();
                                iMUserLIZJ = C2201941BFw.LIZJ(user2);
                            }
                            imUserService.LJIILIIL(iMUserLIZJ);
                        }
                    } else {
                        C1440005kM.LIZ(new C848450XQd(user2));
                    }
                } else {
                    C15O7.LIZIZ(new ACallableS420S0100000_13(user2, 13), C823050WQl.LIZLLL(), null);
                }
                List listAsList = Arrays.asList(6, 7);
                if (user != null && user2 != null) {
                    z2 = !TextUtils.equals(user.getNickname(), user2.getNickname());
                    z = !TextUtils.equals(LIZ(user), LIZ(user2));
                } else {
                    z = false;
                }
                if (!listAsList.contains(Integer.valueOf(i)) && !z2 && !z) {
                    return;
                }
                ?? r2 = new Object() { // from class: X.0XQc
                };
                if (z2) {
                    user2.getNickname();
                }
                if (z) {
                    LIZ(user2);
                }
                C09UZ.LIZ(new ARunnableS92S0000000_13((C848440XQc) r2, 56));
            }
        };
        new Object() { // from class: X.0XPZ
        };
        InterfaceC1154304fN interfaceC1154304fN = new InterfaceC1154304fN() { // from class: X.04fL
            @Override // X.InterfaceC1154304fN
            public final <T> ServiceProvider<T> getService(Class<T> cls) {
                IAccountInitService iAccountInitService;
                if (Intrinsics.LJFF(cls, IWebViewService.class)) {
                    return new ServiceProvider() { // from class: X.04fI
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return new WebviewService();
                        }
                    };
                }
                if (Intrinsics.LJFF(cls, IRegionService.class)) {
                    return new ServiceProvider() { // from class: X.04fJ
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return new RegionService();
                        }
                    };
                }
                if (Intrinsics.LJFF(cls, IFeed0VVManagerService.class)) {
                    return new ServiceProvider() { // from class: X.04fK
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return new Feed0VVManagerService();
                        }
                    };
                }
                if (Intrinsics.LJFF(cls, IPushLaunchPageAssistantService.class)) {
                    return new ServiceProvider() { // from class: X.04fH
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return new PushLaunchPageAssistantService();
                        }
                    };
                }
                if (Intrinsics.LJFF(cls, IDownloadService.class)) {
                    return new ServiceProvider() { // from class: X.04fM
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return new DownloadService();
                        }
                    };
                }
                Object objLIZ = C04TD.LIZ(IAccountInitService.class, false);
                if (objLIZ != null) {
                    iAccountInitService = (IAccountInitService) objLIZ;
                } else {
                    if (C04TD.LJLI == null) {
                        synchronized (IAccountInitService.class) {
                            if (C04TD.LJLI == null) {
                                C04TD.LJLI = new AccountInitServiceImpl();
                            }
                        }
                    }
                    iAccountInitService = C04TD.LJLI;
                }
                return iAccountInitService.getService(cls);
            }
        };
        C0XPY.LIZ.getClass();
        C0XPY.LIZIZ = application;
        C0XPY.LIZJ = c0xha;
        C0XPY c0xpy = C0XPY.LIZ;
        C0XPY.LIZLLL = interfaceC427710Gpt;
        C0XPY.LJ = new ConcurrentHashMap<>();
        C0XPY.LJFF = interfaceC1154304fN;
    }
}
