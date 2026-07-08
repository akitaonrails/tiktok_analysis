package com.ss.android.ugc.aweme.account.oneclicklogin;

import X.AbstractC19483511Kn;
import X.AbstractC846040XGw;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AE;
import X.C09JN;
import X.C0PEM;
import X.C0W3J;
import X.C0XGC;
import X.C0XGJ;
import X.C0XGR;
import X.C0XH5;
import X.C0XHP;
import X.C0XQ5;
import X.C0XTZ;
import X.C0XU4;
import X.C0XUD;
import X.C0XUE;
import X.C0XUT;
import X.C0XW4;
import X.C0XW5;
import X.C0XW8;
import X.C0XW9;
import X.C0XWA;
import X.C0XWB;
import X.C0XWC;
import X.C0XWD;
import X.C0XWE;
import X.C0XWF;
import X.C0XWJ;
import X.C0XWS;
import X.C0XX9;
import X.C0XZV;
import X.C10EU;
import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C1701940uOG;
import X.C19EG;
import X.C1BV9;
import X.C1DFH;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2296808zG;
import X.C23105093n;
import X.C23250099c;
import X.C257190A6b;
import X.C259800zU;
import X.C380801du;
import X.C835130WpT;
import X.C835260Wpg;
import X.C846430XIj;
import X.C848000XOk;
import X.C849680XUw;
import X.C852170Xbr;
import X.EnumC23111093t;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import X.InterfaceC852200Xbu;
import Y.AComparatorS32S0000000_13;
import Y.AObjectS356S0100000_13;
import Y.AObjectS388S0100000_13;
import Y.AfS0S3200000_13;
import Y.AfS172S0100000_3;
import Y.AfS182S0100000_13;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ClearCredScene;
import com.ss.android.ugc.aweme.services.ClearLoginCredentialsService;
import com.ss.android.ugc.aweme.user.UserStore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS38S2100000_13;
import kotlin.jvm.internal.AwS449S0200000_13;
import kotlin.jvm.internal.AwS4S2400000_13;
import kotlin.jvm.internal.AwS53S1300000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS56S2100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS95S1300000_13;
import kotlin.jvm.internal.AwS98S1000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes14.dex */
public final class OneClickLoginService implements IOneClickLoginService {
    public static final /* synthetic */ int LIZJ = 0;
    public final IPluginService LIZ = (IPluginService) ServiceManager.get().getService(IPluginService.class);
    public final boolean LIZIZ = ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIILL();

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.account.model.BaseLoginMethod> LIZJ() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService.LIZJ():java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final boolean LJ() {
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        return (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ()) ? !C10EU.LJIILIIL() : iAccountLoginMethodsService.LIZLLL() && !C10EU.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final boolean LJIILLIIL() {
        C0XUD.LIZ.getClass();
        return C0XUD.LJI.getValue() != C0XHP.NOT_READY;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final MutableLiveData LJIIZILJ() {
        C0XUD.LIZ.getClass();
        C0XUD.LIZLLL("getOclDataReadinessLiveData", null);
        return C0XUD.LJI;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final boolean LIZIZ() {
        return LJ() && LJIILLIIL() && LIZJ().isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final BaseLoginMethod LIZLLL() {
        boolean zContains;
        BaseLoginMethod baseLoginMethod = null;
        if (!LJ()) {
            return null;
        }
        String strLIZLLL = C0XQ5.LIZLLL();
        C0XUD.LIZ.getClass();
        for (BaseLoginMethod baseLoginMethod2 : C0XUD.LJFF) {
            BaseLoginMethod baseLoginMethod3 = baseLoginMethod2;
            if (C846430XIj.LIZIZ()) {
                if (Intrinsics.LJFF(baseLoginMethod3.getUid(), strLIZLLL) && C849680XUw.LJ(baseLoginMethod3)) {
                    baseLoginMethod = baseLoginMethod2;
                    break;
                }
            } else if (Intrinsics.LJFF(baseLoginMethod3.getUid(), strLIZLLL)) {
                synchronized (C0XWA.LIZ) {
                    zContains = C0XWA.LIZJ.contains(strLIZLLL);
                }
                if (!zContains) {
                    baseLoginMethod = baseLoginMethod2;
                    break;
                }
            } else {
                continue;
            }
        }
        return baseLoginMethod;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final boolean LJIIJJI() {
        if (!LJ()) {
            return false;
        }
        String strLIZLLL = C0XQ5.LIZLLL();
        C0XUD.LIZ.getClass();
        List<BaseLoginMethod> list = C0XUD.LJFF;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<BaseLoginMethod> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getUid(), strLIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LIZ(String str) {
        if (!LJ()) {
            return;
        }
        LJIJJLI(str, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13BV] */
    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final List<BaseLoginMethod> LJIIIZ(C0XWE c0xwe) {
        ?? arrayList;
        C0XW9 c0xw9;
        String str;
        String lowerCase;
        List<String> listLJJI = C0XQ5.LIZIZ.LJIIJ().LJJI();
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<BaseLoginMethod> listLIZJ = LIZJ();
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LIZJ() && !iAccountLoginMethodsService.LJIIJJI()) {
            arrayList = C13BV.INSTANCE;
        } else {
            List<BaseLoginMethod> listLIZJ2 = C0XUE.LIZ.LIZJ(listLJJI);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<BaseLoginMethod> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(it2.next().getUid());
            }
            arrayList = new ArrayList();
            for (BaseLoginMethod baseLoginMethod : listLIZJ2) {
                BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
                if (!(baseLoginMethod2 instanceof C0XUT) || this.LIZIZ) {
                    if (!(baseLoginMethod2 instanceof AccountPassLoginMethod) || baseLoginMethod2.getLoginMethodName() != LoginMethodName.USER_NAME_PASS || !Intrinsics.LJFF(((AccountPassLoginMethod) baseLoginMethod2).isOrgOtp(), Boolean.TRUE)) {
                        if (!baseLoginMethod2.m157isOneClickLogin() || !linkedHashSet.contains(baseLoginMethod2.getUid())) {
                            if (baseLoginMethod2.isHistoryLogin()) {
                                arrayList.add(baseLoginMethod);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(C13LP.LL(listLIZJ, 10));
        C0XUD c0xud = C0XUD.LIZ;
        int size = arrayList2.size();
        c0xud.getClass();
        C0XUD.LJIIIZ = size;
        C0XUD.LJIIIIZZ = Math.min(10 - arrayList2.size(), arrayList.size());
        arrayList2.addAll(C13LP.LL(arrayList, C0XUD.LJIIIIZZ));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            c0xw9 = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            BaseLoginMethod baseLoginMethod3 = (BaseLoginMethod) next;
            CommonUserInfo commonUserInfo = baseLoginMethod3.getCommonUserInfo();
            if (commonUserInfo != null && commonUserInfo.userName != null && !listLJJI.contains(baseLoginMethod3.getUid())) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C13LP.LJLLLL(new AComparatorS32S0000000_13(10), arrayList3));
        if (c0xwe == C0XWE.THE_ONE) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C0XWJ c0xwj = C0XWJ.LIZ;
            C0XUD.LIZ.getClass();
            long j = C0XUD.LJIIJ + jCurrentTimeMillis2;
            c0xwj.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZIZ(j, "load_time");
            C20684815ws.LJIILLIIL("the_one_data_load_time", c0xgr.LIZ);
            C0XUD.LJIIJ = 0L;
            int size2 = arrayList4.size();
            IPluginService.ReinstallCheck deviceCheckResult = this.LIZ.getDeviceCheckResult();
            Iterator<C0XW9> it4 = C0XW9.getEntries().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C0XW9 next2 = it4.next();
                if (next2.getValue() == deviceCheckResult.getValue()) {
                    c0xw9 = next2;
                    break;
                }
            }
            C0XW9 c0xw92 = c0xw9;
            if (c0xw92 == null) {
                c0xw92 = C0XW9.UNKNOWN;
            }
            C0XUD.LIZ.getClass();
            if (C0XUD.LJII) {
                str = "local";
            } else {
                C0XUD.LJII = true;
                str = "cloud";
            }
            if (c0xw92 == C0XW9.UNKNOWN) {
                lowerCase = "old";
            } else {
                lowerCase = c0xw92.name().toLowerCase(Locale.ROOT);
            }
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZ(size2, "eligible_acct_shown");
            c0xgr2.LIZLLL("app_type", lowerCase);
            c0xgr2.LIZLLL("storage_type", str);
            C20684815ws.LJIILLIIL("the_one_eligibility_check", c0xgr2.LIZ);
        }
        return arrayList4;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final boolean LJIIJ(C0XWE c0xwe) {
        if (LJIILLIIL() && (!LJIIIZ(c0xwe).isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJIILIIL(Bundle bundle) {
        boolean zContains;
        OIDCToken oIDCToken;
        C0XWD c0xwd;
        String strLIZLLL = C0XQ5.LIZLLL();
        synchronized (C0XWA.LIZ) {
            zContains = C0XWA.LIZJ.contains(strLIZLLL);
        }
        boolean zLJIIJJI = LJIIJJI();
        boolean zContainsKey = bundle.containsKey("ocl_checkbox_checked");
        boolean z = bundle.getBoolean("ocl_checkbox_checked");
        String oneClickLoginToken = null;
        if (Build.VERSION.SDK_INT >= 33) {
            oIDCToken = (OIDCToken) bundle.getSerializable("oidc_token", OIDCToken.class);
        } else {
            Serializable serializable = bundle.getSerializable("oidc_token");
            if (serializable instanceof OIDCToken) {
                oIDCToken = (OIDCToken) serializable;
            } else {
                oIDCToken = null;
            }
        }
        if (zLJIIJJI) {
            if (!z && zContainsKey) {
                BaseLoginMethod baseLoginMethodLIZLLL = LIZLLL();
                if (baseLoginMethodLIZLLL != null) {
                    oneClickLoginToken = baseLoginMethodLIZLLL.getOneClickLoginToken();
                }
                LJIILL(oneClickLoginToken, strLIZLLL, false, C0XWC.DEFAULT, "background_refresh", AFwS200S0000000_13.get$arr$(88), AFwS247S0000000_13.get$arr$(17));
                return;
            }
            if (C846430XIj.LIZIZ() || !zContains) {
                return;
            }
            LJIIIIZZ(true, C0XWD.REFRESH, "background_refresh", null, new AwS98S1000000_13(strLIZLLL, 1), new AwS127S1100000_13(strLIZLLL, this, 0));
            return;
        }
        if (!z || !zContainsKey) {
            return;
        }
        if (C0XQ5.LIZ().isNewUser()) {
            c0xwd = C0XWD.SIGN_UP;
        } else {
            c0xwd = C0XWD.LOGIN;
        }
        AwS162S1100000_13 awS162S1100000_13 = new AwS162S1100000_13(strLIZLLL, bundle, 6);
        AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(bundle, 31);
        if (C846430XIj.LIZIZ()) {
            C0XGC.LJFF(C0XGC.LIZ, null, true, oIDCToken, new AwS557S0100000_13(awS162S1100000_13, 170), new AwS592S0100000_13(awS592S0100000_13, 87), 1);
        }
        LJIJ(c0xwd, false, new AwS379S0200000_13(this, awS162S1100000_13, 20), new AwS592S0100000_13(awS592S0100000_13, 88));
    }

    public static Object LJIJI(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C0XU4 c0xu4 = C0XU4.LIZ;
        final AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(c2252611DEt, 32);
        c0xu4.getClass();
        C835260Wpg c835260Wpg = (C835260Wpg) C0XU4.LIZLLL.getValue();
        c835260Wpg.getClass();
        C0XX9.LIZ.getClass();
        if (!C0XX9.LIZ()) {
            awS592S0100000_13.invoke(null);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_oidc_key");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C835130WpT c835130WpT = new C835130WpT();
            List listSingletonList = Collections.singletonList(strLIZIZ);
            C0W3J.LJIIIZ(listSingletonList, "Keys cannot be set to null");
            c835130WpT.LIZ = listSingletonList;
            c835260Wpg.LIZ.LIZIZ(new RetrieveBytesRequest(c835130WpT.LIZ, false)).LJFF(new InterfaceC835710WqP() { // from class: X.0WpQ
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    String str2;
                    byte[] bArr;
                    RetrieveBytesResponse.BlockstoreData blockstoreData = ((RetrieveBytesResponse) obj).LJLZ().get(strLIZIZ);
                    if (blockstoreData != null && (bArr = blockstoreData.zza) != null) {
                        str2 = new String(bArr, C835260Wpg.LIZIZ);
                    } else {
                        str2 = null;
                    }
                    if (C123100dR.LIZ(str2)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            OIDCToken oIDCToken = (OIDCToken) C1227904rF.LIZIZ(str2, OIDCToken.class);
                            Function1<OIDCToken, Unit> function1 = awS592S0100000_13;
                            if (function1 != null) {
                                function1.invoke(oIDCToken);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Function1<OIDCToken, Unit> function12 = awS592S0100000_13;
                            if (function12 != null) {
                                function12.invoke(null);
                                return;
                            }
                            return;
                        }
                    }
                    Function1<OIDCToken, Unit> function13 = awS592S0100000_13;
                    if (function13 != null) {
                        function13.invoke(null);
                    }
                }
            }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0WpR
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    Function1<OIDCToken, Unit> function1 = awS592S0100000_13;
                    if (function1 != null) {
                        function1.invoke(null);
                    }
                }
            });
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJI(Function0 function0, Function1 function1) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C23105093n(this, Mp4ScreenVideoLoadTimeout.CONTROL, function1, function0, null), 3);
    }

    public static void LJIJJLI(String str, Function2 function2, boolean z) {
        if (z) {
            C0XUE.LIZ.LJIIIIZZ(str, false);
        }
        C0XUD.LIZ.getClass();
        if (C0XUD.LJI.getValue() == C0XHP.NOT_READY) {
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, -1);
                return;
            }
            return;
        }
        List<BaseLoginMethod> list = C0XUD.LJFF;
        ArrayList arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : list) {
            if (!Intrinsics.LJFF(baseLoginMethod.getUid(), str)) {
                arrayList.add(baseLoginMethod);
            }
        }
        C0XUD.LJ(arrayList, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.ss.android.ugc.aweme.account.model.BaseLoginMethod] */
    public static void LJIL(String str, String str2, Function2 function2) {
        BaseLoginMethod next;
        boolean z;
        ?? LJJJLL = C13LP.LJJJLL(C0XUE.LIZ.LJ(str));
        UserStore.LIZ.getClass();
        User userLJI = UserStore.LJI(str);
        LJJJLL = LJJJLL;
        if (LJJJLL == 0) {
            C0XUD.LIZ.getClass();
            Iterator<BaseLoginMethod> it2 = C0XUD.LJFF.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getUid(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BaseLoginMethod baseLoginMethod = next;
            LJJJLL = baseLoginMethod;
            if (baseLoginMethod == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LMM method not found: Creating a new method, user=");
                if (userLJI != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                Boolean bool = Boolean.TRUE;
                LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
                CommonUserInfo.Companion.getClass();
                LJJJLL = new BaseLoginMethod(str, loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), lValueOf, lValueOf2, bool, Boolean.FALSE, str2, null, Boolean.FALSE, null, null, null);
            }
            if (userLJI != null) {
                if (userLJI.isPhoneBinded()) {
                    LJJJLL.setDisplayPlatform("PHONE_SMS");
                    LJJJLL = LJJJLL;
                } else {
                    LJJJLL = LJJJLL;
                    if (userLJI.isHasEmail()) {
                        LJJJLL.setDisplayPlatform("EMAIL_PASS");
                        LJJJLL = LJJJLL;
                    }
                }
                BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) LJJJLL;
                C0XTZ c0xtz = CommonUserInfo.Companion;
                CommonUserInfo commonUserInfo = baseLoginMethod2.getCommonUserInfo();
                c0xtz.getClass();
                baseLoginMethod2.setCommonUserInfo(C0XTZ.LIZIZ(userLJI, commonUserInfo));
            }
        } else if (userLJI != null) {
            BaseLoginMethod baseLoginMethod22 = (BaseLoginMethod) LJJJLL;
            C0XTZ c0xtz2 = CommonUserInfo.Companion;
            CommonUserInfo commonUserInfo2 = baseLoginMethod22.getCommonUserInfo();
            c0xtz2.getClass();
            baseLoginMethod22.setCommonUserInfo(C0XTZ.LIZIZ(userLJI, commonUserInfo2));
        }
        BaseLoginMethod baseLoginMethod3 = (BaseLoginMethod) LJJJLL;
        baseLoginMethod3.setOneClickLogin(Boolean.TRUE);
        baseLoginMethod3.setOneClickLoginToken(str2);
        Boolean bool2 = Boolean.FALSE;
        baseLoginMethod3.setHistoryRemoved(bool2);
        baseLoginMethod3.setExpires(new Date(System.currentTimeMillis() + 31536000000L));
        baseLoginMethod3.setDisplayPlatform(baseLoginMethod3.findPlatform());
        ClearLoginCredentialsService clearLoginCredentialsService = ClearLoginCredentialsService.INSTANCE;
        if (clearLoginCredentialsService.shouldTryBlockOclCredentialsSave() && !clearLoginCredentialsService.keepLoginMethodByPlatform(baseLoginMethod3)) {
            clearLoginCredentialsService.triggerClearCredET(ClearCredScene.BLOCK_OCL, 1);
            return;
        }
        C0XUD.LIZ.getClass();
        if (C0XUD.LJI.getValue() == C0XHP.NOT_READY) {
            if (function2 != null) {
                function2.invoke(bool2, -1);
                return;
            }
            return;
        }
        List<BaseLoginMethod> list = C0XUD.LJFF;
        ArrayList arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod4 : list) {
            if (!Intrinsics.LJFF(baseLoginMethod4.getUid(), baseLoginMethod3.getUid())) {
                arrayList.add(baseLoginMethod4);
            }
        }
        C0XUD.LJ(C13LP.LJLILLLLZI(baseLoginMethod3, arrayList), function2);
    }

    public static void LJIJ(C0XWD c0xwd, boolean z, Function1 function1, Function1 function12) {
        String str;
        HashMap map = new HashMap();
        map.put("aid", String.valueOf(1233));
        map.put("source", String.valueOf(c0xwd.getServerCode()));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_refresh", str);
        AbstractC19483511Kn.LJ(new C0XWS("/passport/cloud_token/enable/", map)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS182S0100000_13(function1, 48), new AfS182S0100000_13(function12, 49));
    }

    public static Object LJIJJ(String str, OIDCToken oIDCToken, C0XWB c0xwb, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str2;
        boolean z = true;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (c0xwb != C0XWB.AUTO_LOGIN ? !(C257190A6b.LIZ() == 2 || C257190A6b.LIZ() == 3) : !(C257190A6b.LIZ() == 1 || C257190A6b.LIZ() == 3)) {
            z = false;
        }
        String str3 = oIDCToken.oidcToken;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = oIDCToken.deviceSecret;
        if (str5 == null) {
            str5 = "";
        }
        if (z && (str2 = oIDCToken.tokenID) != null) {
            str4 = str2;
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("oidc_scene", "1"));
        AbstractC846040XGw<C0XZV> abstractC846040XGw = new AbstractC846040XGw<C0XZV>() { // from class: X.0XW6
            @Override // X.AbstractC846040XGw
            public final void LIZ(C0XGA c0xga) {
                if (c2252611DEt.isActive()) {
                    if (c0xga.LIZIZ) {
                        InterfaceC20236714Gf<C0XZV> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(c0xga);
                        interfaceC20236714Gf.resumeWith(c0xga);
                    } else {
                        InterfaceC20236714Gf<C0XZV> interfaceC20236714Gf2 = c2252611DEt;
                        C098200Yq c098200Yq = new C098200Yq(new C0XZJ(c0xga.LJ, c0xga.LJFF, EnumC852660Xce.LOGIN, EnumC852910Xd3.NONE, null, ""));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC20236714Gf2.resumeWith(c098200Yq);
                    }
                }
            }
        };
        TTAccountInit.LIZ();
        C0XH5.LIZ(C848000XOk.LIZ(), str, str3, str5, str4, mapLIZJ, abstractC846040XGw).LJIIIZ();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJIIL(C0XWD c0xwd, String str, String str2, AObjectS388S0100000_13 aObjectS388S0100000_13, AObjectS356S0100000_13 aObjectS356S0100000_13) {
        LJI(new AwS557S0100000_13(aObjectS356S0100000_13, 172), new AwS4S2400000_13(this, c0xwd, str, str2, aObjectS388S0100000_13, aObjectS356S0100000_13, 1));
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final InterfaceC420801kM LJFF(C19EG c19eg, BaseLoginMethod baseLoginMethod, C0XWB c0xwb, Map map, Function0 function0, Function1 function1) {
        Object obj;
        Object obj2;
        InterfaceC852200Xbu c1bv9;
        LinkedHashMap linkedHashMap;
        AwS449S0200000_13 awS449S0200000_13 = new AwS449S0200000_13(this, function0, 1);
        if (c0xwb != C0XWB.AUTO_LOGIN && c19eg == null) {
            function1.invoke(-1);
            return null;
        }
        String uid = baseLoginMethod.getUid();
        String oneClickLoginToken = baseLoginMethod.getOneClickLoginToken();
        if (map == null || (obj = map.get("platform")) == null) {
            obj = "";
        }
        String string = obj.toString();
        if (map != null) {
            obj2 = map.get("MOB_PARAMS_PROVIDER");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof InterfaceC852200Xbu) || (c1bv9 = (InterfaceC852200Xbu) obj2) == null) {
            c1bv9 = new C1BV9("", "", "", "", "", null);
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove("MOB_PARAMS_PROVIDER");
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        Boolean bool = Boolean.FALSE;
        c852170Xbr.getClass();
        C852170Xbr.LJIIJ(bool, string, c1bv9, false, linkedHashMap);
        if (uid.length() != 0 && oneClickLoginToken != null && oneClickLoginToken.length() != 0) {
            return C0XW8.LIZ(uid, oneClickLoginToken, c0xwb).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS182S0100000_13(new C0XW5(string, c1bv9, linkedHashMap, c19eg, awS449S0200000_13, uid), 110), new AfS172S0100000_3((Object) new AwS53S1300000_13(c1bv9, string, linkedHashMap, function1, 1), 74));
        }
        function1.invoke(-1);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJIIIIZZ(boolean z, C0XWD c0xwd, String str, String str2, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
        if (C846430XIj.LIZIZ()) {
            C0XGC.LJFF(C0XGC.LIZ, null, true, null, new AwS56S2100000_13(str, str2, function0, 0), new AwS38S2100000_13(str, str2, function1, 0), 5);
        }
        LJIJ(c0xwd, z, new C0XWF(this, function0, str, str2), new AwS38S2100000_13(str, str2, function1, 1));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.093t] */
    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final C09AE LJIILJJIL(C19EG c19eg, BaseLoginMethod baseLoginMethod, C0XWB c0xwb, Map map, Function0 function0, Function1 function1) {
        Object obj;
        Object obj2;
        InterfaceC852200Xbu c1bv9;
        LinkedHashMap linkedHashMap;
        LifecycleCoroutineScope lifecycleScope;
        OIDCToken oIDCTokenLIZIZ = null;
        if (c0xwb != C0XWB.AUTO_LOGIN && c19eg == null) {
            function1.invoke(-1);
            return null;
        }
        String uid = baseLoginMethod.getUid();
        String oneClickLoginToken = baseLoginMethod.getOneClickLoginToken();
        if (map == null || (obj = map.get("platform")) == null) {
            obj = "";
        }
        String string = obj.toString();
        if (map != null) {
            obj2 = map.get("MOB_PARAMS_PROVIDER");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof InterfaceC852200Xbu) || (c1bv9 = (InterfaceC852200Xbu) obj2) == null) {
            c1bv9 = new C1BV9("", "", "", "", "", null);
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove("MOB_PARAMS_PROVIDER");
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (C846430XIj.LIZIZ() && Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.TRUE)) {
            C0XU4.LIZ.getClass();
            oIDCTokenLIZIZ = C0XU4.LIZIZ(uid);
        }
        AwS95S1300000_13 awS95S1300000_13 = new AwS95S1300000_13(c1bv9, string, linkedHashMap, function1, 1);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = EnumC23111093t.NOT_STARTED;
        C380801du c380801du = new C380801du(CoroutineExceptionHandler.LJJLIL, awS95S1300000_13, c259800zU);
        C0XW4 c0xw4 = new C0XW4(oIDCTokenLIZIZ, this, uid, baseLoginMethod, c259800zU, string, c1bv9, linkedHashMap, oneClickLoginToken, c0xwb, c19eg, true, awS95S1300000_13, function0, null);
        if (c19eg != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg)) != null) {
            return C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ.plus(c380801du), null, c0xw4, 2);
        }
        return C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(c380801du)), null, null, c0xw4, 3);
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJII(String str, String str2, String str3, String str4, Function0 function0, Function1 function1, boolean z) {
        C0XUD c0xud = C0XUD.LIZ;
        C0XGJ c0xgj = new C0XGJ(str, str2, str3, str4, function0, function1, z);
        c0xud.getClass();
        C0XUD.LIZLLL("initOclAndUpdateOIDCToken", c0xgj);
    }

    @Override // com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService
    public final void LJIILL(String str, String str2, boolean z, C0XWC c0xwc, final String str3, Function0 function0, final Function1 function1) {
        if (C846430XIj.LIZIZ()) {
            C0XUE.LIZ.LJIIL(str2, "", new AwS56S2100000_13(str3, function0, 1), new AwS38S2100000_13(str3, function1, 2));
        }
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("user_id", str2);
        map.put("aid", String.valueOf(1233));
        map.put("cloud_token", str);
        map.put("disable_all", String.valueOf(z ? 1 : 0));
        map.put("source", String.valueOf(c0xwc.getServerCode()));
        AbstractC19483511Kn.LJ(new C0XWS("/passport/cloud_token/disable/", map)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS0S3200000_13(this, str2, function0, str3, 1), new C09JN() { // from class: X.0XW7
            public final /* synthetic */ String LLILLJJLI = null;

            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OneClickLoginService@601d.disableTokenForOneClickLogin$4");
                Throwable th = (Throwable) obj;
                if (!C846430XIj.LIZIZ()) {
                    int errorCode = ((C0XZJ) th).getErrorCode();
                    C0XWJ c0xwj = C0XWJ.LIZ;
                    String str4 = str3;
                    String str5 = this.LLILLJJLI;
                    Boolean bool = Boolean.FALSE;
                    Integer numValueOf = Integer.valueOf(errorCode);
                    c0xwj.getClass();
                    C0XWJ.LJIILLIIL(str4, str5, false, bool, numValueOf);
                    function1.invoke(Integer.valueOf(errorCode));
                }
                C1C7U.LIZIZ("OneClickLoginService@601d.disableTokenForOneClickLogin$4");
            }
        });
    }
}
