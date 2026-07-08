package com.ss.android.ugc.aweme.relation.auth.spi;

import X.AbstractC1071680dzi;
import X.AbstractC1074460e4C;
import X.C01S9;
import X.C1070350dxZ;
import X.C1071250dz1;
import X.C1071520dzS;
import X.C1071530dzT;
import X.C1071550dzV;
import X.C1071560dzW;
import X.C1071570dzX;
import X.C1071580dzY;
import X.C1072160e0U;
import X.C1072330e0l;
import X.C1072580e1A;
import X.C1072610e1D;
import X.C1074580e4O;
import X.C1074610e4R;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2188811AlT;
import X.EnumC1070340dxY;
import X.EnumC1070410dxf;
import X.InterfaceC1004520cFO;
import X.InterfaceC1055970daN;
import X.InterfaceC1056100daa;
import X.InterfaceC1056200dak;
import X.InterfaceC1070470dxl;
import X.InterfaceC1071180dyu;
import X.InterfaceC1072620e1E;
import X.InterfaceC800130Va7;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.profile.model.AccessTokenApp;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformAccessInfo;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.aweme.relation.auth.IAuthService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.ss.android.ugc.aweme.relation.auth.lego.EmailUploadRequest;
import com.ss.android.ugc.aweme.relation.auth.lego.PermissionRequestAndUploadLegoTask;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes17.dex */
public final class AuthServiceImpl implements IAuthService {
    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final List<InterfaceC800130Va7> LJIIIIZZ() {
        return C1697810uHb.LJIIJJI(new PermissionRequestAndUploadLegoTask(), new EmailUploadRequest());
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1071180dyu LIZ() {
        return (C1071250dz1) C1071580dzY.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1055970daN LIZIZ() {
        return new C1072330e0l();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC1074460e4C LIZJ() {
        return new C1074580e4O();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC1071680dzi LJFF() {
        return new C1074610e4R();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1004520cFO LJII() {
        return new C1072160e0U();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1056100daa LJIIIZ() {
        return new InterfaceC1056100daa() { // from class: X.09j7
            @Override // X.InterfaceC1056100daa
            public final Object LIZ(int i, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws Throwable {
                boolean z;
                List<Account> listLJJLL;
                C2451609j8 c2451609j8 = new C2451609j8(i);
                C844470XAv.LIZ.getClass();
                AccountManager accountManager = AccountManager.get(C844470XAv.LIZ());
                Account[] accountArrLIZ = new Account[0];
                try {
                    if (((AccountUserService) C0XQ7.LJFF()).LIZLLL()) {
                        accountArrLIZ = C2204961BRm.LIZ(accountManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitb57a1T2PZzsc7UjYycRbDJ0zNO55aZSQEga9Ry0d4kH2i7rxCY4sX2+YyG9j", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    e.getStackTrace();
                }
                if (accountArrLIZ.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    listLJJLL = C13LQ.LJJLL(accountArrLIZ);
                } else {
                    listLJJLL = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLL, 10));
                for (Account account : listLJJLL) {
                    arrayList.add(new Pair(account.name.toLowerCase(Locale.ROOT), account.type));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (C2451909jB.LIZ((String) ((Pair) obj).getFirst())) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(((String) ((Pair) it2.next()).getFirst()).getBytes(Charsets.UTF_8));
                    if (bArrDigest != null) {
                        int length = bArrDigest.length;
                        if (length <= bArrDigest.length) {
                            int i3 = length * 2;
                            char[] cArr = new char[i3];
                            int i4 = 0;
                            for (byte b : bArrDigest) {
                                int i5 = b & 255;
                                int i6 = i4 + 1;
                                char[] cArr2 = C2451709j9.LIZ;
                                cArr[i4] = cArr2[i5 >> 4];
                                i4 = i6 + 1;
                                cArr[i6] = cArr2[i5 & 15];
                            }
                            arrayList3.add(new String(cArr, 0, i3));
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        throw new NullPointerException("bytes is null");
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((Pair) it3.next()).getSecond());
                }
                List listLJIJJLI = C15438062q.LJIJJLI(Collections.singletonList(C1697810uHb.LJIIIZ(arrayList3)));
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJIJJLI, 10));
                Iterator it4 = ((ArrayList) listLJIJJLI).iterator();
                while (it4.hasNext()) {
                    ((Number) it4.next()).intValue();
                    arrayList5.add(C2286608xc.LJ(EnumC043100Dl.EMAIL.ordinal()));
                }
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("add_account_type_to_email", true)) {
                    arrayList4 = null;
                }
                return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2452009jC(new IAuthApi.IdentityBody(arrayList3, arrayList5, arrayList4), c2451609j8, null));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1072620e1E LJIIJ() {
        return new InterfaceC1072620e1E() { // from class: X.0e1B
            public static final Map<String, Integer> LIZIZ;

            static {
                AccessTokenApp accessTokenApp = AccessTokenApp.ACCESS_TOKEN_APP_TIKTOK_M;
                LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("1233", Integer.valueOf(accessTokenApp.getValue())), new Pair("1180", Integer.valueOf(AccessTokenApp.ACCESS_TOKEN_APP_TIKTOK_T.getValue())), new Pair("259", Integer.valueOf(accessTokenApp.getValue())));
            }

            @Override // X.InterfaceC1072620e1E
            public final int LIZ() {
                Map<String, Integer> map = LIZIZ;
                C844470XAv.LIZ.getClass();
                Integer num = map.get(String.valueOf(C844470XAv.LJIIJ));
                int iIntValue = num != null ? num.intValue() : AccessTokenApp.ACCESS_TOKEN_APP_TIKTOK_T.getValue();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[FacebookMTSyncController] getCurrentFacebookAuthAccessRegion ");
                sbLIZ.append(iIntValue);
                C2188811AlT.LIZIZ(sbLIZ);
                return iIntValue;
            }

            @Override // X.InterfaceC1072620e1E
            public final Integer LIZIZ(SocialPlatformSetting socialPlatformSetting) {
                int value;
                Integer tokenStatus;
                C844470XAv.LIZ.getClass();
                String strValueOf = String.valueOf(C844470XAv.LJIIJ);
                Integer num = LIZIZ.get(strValueOf);
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = AccessTokenApp.ACCESS_TOKEN_APP_TIKTOK_T.getValue();
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[FacebookMTSyncController] getTokenStatus for FB, appId is ");
                sbLIZ.append(strValueOf);
                sbLIZ.append(", regionCode is ");
                sbLIZ.append(value);
                C2188811AlT.LIZIZ(sbLIZ);
                List<SocialPlatformAccessInfo> allAccessInfo = socialPlatformSetting.getAllAccessInfo();
                Integer tokenStatus2 = null;
                boolean z = false;
                if (allAccessInfo != null) {
                    tokenStatus = null;
                    for (SocialPlatformAccessInfo socialPlatformAccessInfo : (ArrayList) C13LP.LJJJJLI(allAccessInfo)) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[FacebookMTSyncController] getTokenStatus for FB for each accessInfo, it.accessTokenApp is ");
                        sbLIZ2.append(socialPlatformAccessInfo.getAccessTokenApp());
                        sbLIZ2.append(", it.tokenStatus is ");
                        sbLIZ2.append(socialPlatformAccessInfo.getTokenStatus());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        Integer accessTokenApp = socialPlatformAccessInfo.getAccessTokenApp();
                        if (accessTokenApp != null && accessTokenApp.intValue() == value) {
                            tokenStatus = socialPlatformAccessInfo.getTokenStatus();
                            z = true;
                        }
                    }
                } else {
                    tokenStatus = null;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[FacebookMTSyncController] getTokenStatus for FB performMTSync = false, tokenStatus is ");
                sbLIZ3.append(tokenStatus);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (!z) {
                    SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                    if (accessInfo != null) {
                        tokenStatus2 = accessInfo.getTokenStatus();
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[FacebookMTSyncController] getTokenStatus for FB allAccessInfo is null, tokenStatus is ");
                    sbLIZ4.append(tokenStatus2);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    return tokenStatus2;
                }
                return tokenStatus;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1056200dak LIZLLL(EnumC1070410dxf enumC1070410dxf) {
        int i = C1070350dxZ.LIZ[enumC1070410dxf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new InterfaceC1056200dak() { // from class: X.0dxn
                    public static final C11RK<C1070430dxh> LIZIZ = new C11RK<>();
                    public static C1070430dxh LIZJ = LIZJ();

                    public static final C1070430dxh LIZJ() {
                        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                        if (curUserId == null) {
                            curUserId = "";
                        }
                        return new C1070430dxh(curUserId, C1076010e6h.LIZJ.LJII().LIZJ());
                    }

                    @Override // X.InterfaceC1056200dak
                    public final C1070430dxh LIZ() {
                        C1070430dxh c1070430dxhLIZJ = !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), LIZJ.LIZ) ? LIZJ() : C1070430dxh.LIZ(LIZJ, null, C1076010e6h.LIZJ.LJII().LIZJ(), null, null, 119);
                        LIZJ = c1070430dxhLIZJ;
                        return c1070430dxhLIZJ;
                    }

                    @Override // X.InterfaceC1056200dak
                    public final void LIZIZ(Function1<? super C1070430dxh, C1070430dxh> function1) {
                        C1070430dxh c1070430dxhInvoke = function1.invoke(LIZ());
                        LIZJ = c1070430dxhInvoke;
                        LIZIZ.onNext(c1070430dxhInvoke);
                    }
                };
            }
            throw new C1954807lC();
        }
        return new InterfaceC1056200dak() { // from class: X.0dxm
            public static final C11RK<C1070430dxh> LIZIZ = new C11RK<>();
            public static C1070430dxh LIZJ = LIZJ();

            public static final C1070430dxh LIZJ() {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                return new C1070430dxh(curUserId, C1076010e6h.LIZJ.LJIIJ().LIZJ());
            }

            @Override // X.InterfaceC1056200dak
            public final C1070430dxh LIZ() {
                C1070430dxh c1070430dxhLIZJ = !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), LIZJ.LIZ) ? LIZJ() : C1070430dxh.LIZ(LIZJ, null, C1076010e6h.LIZJ.LJIIJ().LIZJ(), null, null, 119);
                LIZJ = c1070430dxhLIZJ;
                return c1070430dxhLIZJ;
            }

            @Override // X.InterfaceC1056200dak
            public final void LIZIZ(Function1<? super C1070430dxh, C1070430dxh> function1) {
                C1070430dxh c1070430dxhInvoke = function1.invoke(LIZ());
                LIZJ = c1070430dxhInvoke;
                LIZIZ.onNext(c1070430dxhInvoke);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1070470dxl LJ(EnumC1070340dxY enumC1070340dxY) {
        int i = C1070350dxZ.LIZIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    return C1072610e1D.LIZ;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("wrong relationAuthPlatform: ");
                sbLIZ.append(enumC1070340dxY);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            return C1072580e1A.LIZ;
        }
        return new InterfaceC1070470dxl() { // from class: X.0e1C
            @Override // X.InterfaceC1070470dxl
            public final Integer LIZLLL() {
                return Integer.valueOf(SocialPlatformTokenStatus.STATUS_VALID.getValue());
            }

            @Override // X.InterfaceC1070470dxl
            public final boolean LIZIZ() {
                SocialPlatformSetting next;
                List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
                if (socialPlatformSettings == null) {
                    return false;
                }
                Iterator<SocialPlatformSetting> it2 = socialPlatformSettings.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.getSocialPlatform() == 1) {
                        break;
                    }
                }
                SocialPlatformSetting socialPlatformSetting = next;
                if (socialPlatformSetting != null) {
                    return socialPlatformSetting.getContactAdsDisclosure();
                }
                return false;
            }

            @Override // X.InterfaceC1070470dxl
            public final boolean LJ() {
                return ((AccountUserService) C0XQ7.LJFF()).LIZLLL() && LIZIZ();
            }

            @Override // X.InterfaceC1070470dxl
            public final void LJFF(boolean z) {
                SocialPlatformSetting next;
                AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
                List<SocialPlatformSetting> socialPlatformSettings = abstractC848400XPy.getCurUser().getSocialData().getSocialPlatformSettings();
                if (socialPlatformSettings != null) {
                    Iterator<SocialPlatformSetting> it2 = socialPlatformSettings.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getSocialPlatform() == 1) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SocialPlatformSetting socialPlatformSetting = next;
                    if (socialPlatformSetting != null) {
                        socialPlatformSetting.setContactAdsDisclosure(z);
                        abstractC848400XPy.LJIJ();
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final C01S9<C1071570dzX> LJI(EnumC1070340dxY enumC1070340dxY) {
        int i = C1070350dxZ.LIZIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return C1071530dzT.LIZ;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wrong relationAuthPlatform: ");
                    sbLIZ.append(enumC1070340dxY);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
                return C1071560dzW.LIZ;
            }
            return C1071550dzV.LIZ;
        }
        return C1071520dzS.LIZ;
    }
}
