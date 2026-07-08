package com.bytedance.android.livesdk.userservice;

import X.C1161920gLG;
import X.C207245167v;
import X.InterfaceC500940Jki;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUserCenterInitOptSetting;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class UserService {
    public static volatile UserService instance;
    public volatile InterfaceC500940Jki userCenter;

    public static UserService getInstance() {
        if (instance == null) {
            synchronized (UserService.class) {
                try {
                    if (instance == null) {
                        instance = new UserService();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return instance;
    }

    public InterfaceC500940Jki user() {
        if (this.userCenter == null) {
            synchronized (InterfaceC500940Jki.class) {
                try {
                    if (this.userCenter == null) {
                        if (LiveUserCenterInitOptSetting.INSTANCE.isEnable()) {
                            this.userCenter = new InterfaceC500940Jki() { // from class: X.167w
                                public volatile C207245167v LIZ;

                                public final InterfaceC500940Jki LJJ() {
                                    if (this.LIZ == null) {
                                        synchronized (InterfaceC500940Jki.class) {
                                            try {
                                                if (this.LIZ == null) {
                                                    this.LIZ = new C207245167v((IHostUser) C1161920gLG.LIZJ(IHostUser.class));
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                    }
                                    return this.LIZ;
                                }

                                @Override // X.InterfaceC500940Jki
                                public final long getCurrentUserId() {
                                    return ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final boolean isLogin() {
                                    return ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isLogin();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<FollowPair> LJFF() {
                                    return ((C207245167v) LJJ()).LJIIIIZZ;
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NN<C784060UpI> LJII() {
                                    return ((C207245167v) LJJ()).LJI;
                                }

                                @Override // X.InterfaceC500940Jki
                                public final boolean LJIILJJIL() {
                                    return ((C207245167v) LJJ()).LJIILJJIL();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<InterfaceC2262081DgM> LJIILLIIL() {
                                    return LJJ().LJIILLIIL();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final User LJIJJLI() {
                                    return LJJ().LJIJJLI();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final List<C750550TcL> getAllFriends() {
                                    return ((C207245167v) LJJ()).getAllFriends();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final InterfaceC2262081DgM getCurrentUser() {
                                    return LJJ().getCurrentUser();
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<FollowPair> LIZ(C1812130xFz c1812130xFz) {
                                    return ((C207245167v) LJJ()).LIZ(c1812130xFz);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<FollowPair> LIZIZ(long j) {
                                    return LJJ().LIZIZ(j);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final void LIZJ(InterfaceC2262081DgM interfaceC2262081DgM) {
                                    ((C207245167v) LJJ()).LIZJ(interfaceC2262081DgM);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<FollowPair> LIZLLL(C1099330eiJ c1099330eiJ) {
                                    return ((C207245167v) LJJ()).LIZLLL(c1099330eiJ);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<FollowPair> LJI(C1812120xFy c1812120xFy) {
                                    return ((C207245167v) LJJ()).LJI(c1812120xFy);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<User> LJIIIIZZ(long j) {
                                    return ((C207245167v) LJJ()).LJIIIIZZ(j);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<InterfaceC2262081DgM> LJIIIZ(long j) {
                                    return ((C207245167v) LJJ()).LJIIIZ(j);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final void LJIIJJI(FollowPair followPair) {
                                    ((C207245167v) LJJ()).LJIIJJI(followPair);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<InterfaceC2262081DgM> LJIIL(String str) {
                                    return ((C207245167v) LJJ()).LJIIL(str);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<User> LJIILIIL(User user) {
                                    return ((C207245167v) LJJ()).LJIILIIL(user);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final void LJIIZILJ(User user) {
                                    ((C207245167v) LJJ()).LIZIZ = user;
                                }

                                @Override // X.InterfaceC500940Jki
                                public final String LJIJ(long j) {
                                    return LJJ().LJIJ(j);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final boolean LJIJI(EnumC1134120fcQ enumC1134120fcQ) {
                                    return ((C207245167v) LJJ()).LJIJI(enumC1134120fcQ);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz LJIL(HashMap map) {
                                    return ((C207245167v) LJJ()).LJIL(map);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz LJIIJ(String str, HashMap map) {
                                    return ((C207245167v) LJJ()).LJIIJ(str, map);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final C11NZ<InterfaceC2262081DgM> LJIILL(Context context, C501600Jlm c501600Jlm) {
                                    return ((C207245167v) LJJ()).LJIILL(context, c501600Jlm);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<User> LJIJJ(long j, String str) {
                                    return ((C207245167v) LJJ()).LJIJJ(j, str);
                                }

                                @Override // X.InterfaceC500940Jki
                                public final AbstractC19484711Kz<User> LJ(long j, String str, String str2) {
                                    return ((C207245167v) LJJ()).LJ(j, str, str2);
                                }
                            };
                        } else {
                            this.userCenter = new C207245167v((IHostUser) C1161920gLG.LIZJ(IHostUser.class));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.userCenter;
    }
}
