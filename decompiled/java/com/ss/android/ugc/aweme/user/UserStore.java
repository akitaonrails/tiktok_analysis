package com.ss.android.ugc.aweme.user;

import X.C01GW;
import X.C09CT;
import X.C11NZ;
import X.C11S5;
import X.C123100dR;
import X.C13BV;
import X.C13LE;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C452501pT;
import X.C810670Vr7;
import X.C844470XAv;
import X.C848300XPo;
import X.C848360XPu;
import X.C848370XPv;
import X.C848380XPw;
import Y.ACallableS420S0100000_13;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class UserStore {
    public static final UserStore LIZ = new UserStore();
    public static final Object LIZIZ = new Object();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C848380XPw());
    public static final SharedPreferences LIZLLL;
    public static final SharedPreferences.Editor LJ;
    public static final C01GW LJFF;
    public static final MutableLiveData<List<String>> LJI;
    public static final LiveData<List<String>> LJII;
    public static final List<C848300XPo> LJIIIIZZ;
    public static String LJIIIZ;

    static {
        C844470XAv.LIZ.getClass();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme_user");
        LIZLLL = sharedPreferencesLIZJ;
        LJ = sharedPreferencesLIZJ.edit();
        LJFF = C452501pT.LIZIZ(new C848360XPu());
        MutableLiveData<List<String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(LIZIZ());
        LJI = mutableLiveData;
        LJII = Transformations.map(mutableLiveData, new C848370XPv());
        LJIIIIZZ = new ArrayList();
        LJIIIZ = "";
    }

    public static List LIZIZ() {
        List listLJJLIIIJILLIZJL;
        synchronized (LIZIZ) {
            try {
                String string = LIZLLL.getString("logged_in_uid_list", "");
                if (string == null) {
                    string = "";
                }
                listLJJLIIIJILLIZJL = string.length() == 0 ? C13BV.INSTANCE : a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLJJLIIIJILLIZJL;
    }

    public static String LIZLLL() {
        String string = LIZLLL.getString("current_foreground_uid", "");
        return !C123100dR.LIZ(string) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.util.ArrayList) com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ).add(new X.C848300XPo(r3));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJ() {
        /*
            java.util.List r5 = LIZIZ()
            java.util.Iterator r4 = r5.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<X.0XPo> r0 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0XPo r0 = (X.C848300XPo) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L8
        L33:
            java.util.List<X.0XPo> r1 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            X.0XPo r0 = new X.0XPo
            r0.<init>(r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            goto L8
        L40:
            java.util.List<X.0XPo> r3 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            X.0XPp r2 = new X.0XPp
            r2.<init>(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L5a
            X.0XPt r0 = new X.0XPt
            r0.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.removeIf(r0)
        L57:
            java.util.List<X.0XPo> r0 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            return r0
        L5a:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r1 = r3.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L60
            r1.remove()
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.UserStore.LJ():java.util.List");
    }

    public static AccountUser LIZ(String str) {
        AccountUser accountUserLIZJ;
        Object next;
        synchronized (LIZIZ) {
            try {
                LIZ.getClass();
                Iterator it2 = ((ArrayList) LJ()).iterator();
                while (true) {
                    accountUserLIZJ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C848300XPo) next).LIZ, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C848300XPo c848300XPo = (C848300XPo) next;
                if (c848300XPo == null) {
                    return null;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AccountUser.class);
                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(User.class))) {
                    if (c848300XPo.LIZIZ().LIZLLL) {
                        accountUserLIZJ = (AccountUser) c848300XPo.LIZIZ().LIZJ();
                    } else {
                        accountUserLIZJ = (AccountUser) c848300XPo.LIZIZ().LIZJ();
                    }
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AccountUser.class))) {
                    accountUserLIZJ = c848300XPo.LIZ().LIZJ();
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(SignificantUserInfo.class))) {
                    accountUserLIZJ = (AccountUser) c848300XPo.LIZJ().LIZJ();
                }
                return accountUserLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static User LIZJ(boolean z) {
        User userLIZJ;
        Object next;
        String strLIZLLL = LIZLLL();
        synchronized (LIZIZ) {
            try {
                LIZ.getClass();
                Iterator it2 = ((ArrayList) LJ()).iterator();
                while (true) {
                    userLIZJ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C848300XPo) next).LIZ, strLIZLLL)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C848300XPo c848300XPo = (C848300XPo) next;
                if (c848300XPo != null) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(User.class);
                    if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(User.class))) {
                        if (!c848300XPo.LIZIZ().LIZLLL && z) {
                            SignificantUserInfo significantUserInfoLIZJ = c848300XPo.LIZJ().LIZJ();
                            if (significantUserInfoLIZJ != null) {
                                userLIZJ = new User();
                                userLIZJ.setUid(significantUserInfoLIZJ.uid);
                                userLIZJ.setShortId(significantUserInfoLIZJ.shortId);
                                userLIZJ.setUniqueId(significantUserInfoLIZJ.uniqueId);
                                userLIZJ.setNickname(significantUserInfoLIZJ.nickname);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                            }
                        } else {
                            userLIZJ = c848300XPo.LIZIZ().LIZJ();
                        }
                    } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AccountUser.class))) {
                        userLIZJ = (User) c848300XPo.LIZ().LIZJ();
                    } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(SignificantUserInfo.class))) {
                        userLIZJ = (User) c848300XPo.LIZJ().LIZJ();
                    }
                    if (userLIZJ != null) {
                        return userLIZJ;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (User) LJFF.getValue();
    }

    public static boolean LJFF(String str) {
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static User LJI(String str) {
        User userLIZJ;
        Object next;
        synchronized (LIZIZ) {
            try {
                LIZ.getClass();
                Iterator it2 = ((ArrayList) LJ()).iterator();
                while (true) {
                    userLIZJ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C848300XPo) next).LIZ, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C848300XPo c848300XPo = (C848300XPo) next;
                if (c848300XPo == null) {
                    return null;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(User.class);
                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(User.class))) {
                    if (c848300XPo.LIZIZ().LIZLLL) {
                        userLIZJ = c848300XPo.LIZIZ().LIZJ();
                    } else {
                        userLIZJ = c848300XPo.LIZIZ().LIZJ();
                    }
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AccountUser.class))) {
                    userLIZJ = (User) c848300XPo.LIZ().LIZJ();
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(SignificantUserInfo.class))) {
                    userLIZJ = (User) c848300XPo.LIZJ().LIZJ();
                }
                return userLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII(User user) {
        C11NZ.LJJJJI(new ACallableS420S0100000_13(user, 3)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
    }

    public static final class AccountUser {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("country_code")
        public String countryCode;

        @C09CT("is_kids_mode")
        public final boolean isKidsMode;

        @C09CT("name")
        public final String name;

        @C09CT("privacy_highlights")
        public final int privacyHighlights;

        @C09CT("private_account_prompt")
        public final int privateAccountPrompt;

        @C09CT("sec_uid")
        public String secUid;

        @C09CT("session_key")
        public final String session;

        @C09CT("uid")
        public final String uid;

        @C09CT("user_verified")
        public final boolean userVerified;

        public AccountUser(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, int i2) {
            this.uid = str;
            this.session = str2;
            this.name = str3;
            this.userVerified = z;
            this.countryCode = str4;
            this.secUid = str5;
            this.isKidsMode = z2;
            this.privateAccountPrompt = i;
            this.privacyHighlights = i2;
        }
    }
}
