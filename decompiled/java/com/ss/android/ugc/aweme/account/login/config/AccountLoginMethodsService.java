package com.ss.android.ugc.aweme.account.login.config;

import X.C01GW;
import X.C1239240iLy;
import X.C15438062q;
import X.C1869210yk3;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC1239210iLv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class AccountLoginMethodsService implements IAccountLoginMethodsService {
    public static final String LIZIZ;
    public static final C01GW<AccountLoginFeatureOriginConfig> LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(82));

    static {
        C844470XAv.LIZ.getClass();
        LIZIZ = String.valueOf(C844470XAv.LJIIJ);
        LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(81));
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LIZJ() {
        C1869210yk3.LIZ.getClass();
        return ((AccountLoginFeatureOriginConfig) C1869210yk3.LIZIZ.getValue()).enable;
    }

    public final AccountLoginFeatureConfig LJIILL() {
        C1869210yk3.LIZ.getClass();
        C01GW c01gw = C1869210yk3.LIZIZ;
        if (LIZJ.getValue().version >= ((AccountLoginFeatureOriginConfig) c01gw.getValue()).version) {
            return (AccountLoginFeatureConfig) this.LIZ.getValue();
        }
        String str = LIZIZ;
        AccountLoginFeatureConfig accountLoginFeatureConfigLIZ = (AccountLoginFeatureConfig) this.LIZ.getValue();
        try {
            accountLoginFeatureConfigLIZ = ((AccountLoginFeatureOriginConfig) c01gw.getValue()).LIZ(str);
            return accountLoginFeatureConfigLIZ;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return accountLoginFeatureConfigLIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LIZ() {
        return LJIILL().signupMethods.mobile.consent.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LIZIZ() {
        return LIZLLL() && LJIILL().loginMethods.autoLogin.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LIZLLL() {
        return LJIIJJI() && LJIILL().loginMethods.historyLogin.oneClickLogin.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJ() {
        ShareOneTapLoginConfig shareOneTapLoginConfig = LJIILL().loginMethods.shareOneTapLogin;
        return shareOneTapLoginConfig.enable && shareOneTapLoginConfig.isRequester;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJFF() {
        return LJIILL().loginMethods.mobile.gsma.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJI() {
        return LJIILL().loginMethods.passkey.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final String LJII() {
        return LJIILL().loginMethods.accountRecoveryConfig.url;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIIIIZZ() {
        return LJIILL().loginMethods.googleOnetap.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIIIZ() {
        return LJIILL().loginMethods.accountRecoveryConfig.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIIJ() {
        ShareOneTapLoginConfig shareOneTapLoginConfig = LJIILL().loginMethods.shareOneTapLogin;
        return shareOneTapLoginConfig.enable && shareOneTapLoginConfig.isRequester && shareOneTapLoginConfig.blob.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIIJJI() {
        return LJIILL().loginMethods.historyLogin.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIILIIL() {
        return LJIILL().signupMethods.email.consent.enable;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final boolean LJIILJJIL() {
        ShareOneTapLoginConfig shareOneTapLoginConfig = LJIILL().loginMethods.shareOneTapLogin;
        return shareOneTapLoginConfig.enable && shareOneTapLoginConfig.isProvider;
    }

    @Override // com.ss.android.ugc.aweme.IAccountLoginMethodsService
    public final List<EnumC1239210iLv> LJIIL(boolean z) {
        ThirdPartyConfig thirdPartyConfig;
        String strLJIIIIZZ;
        AccountLoginFeatureConfig accountLoginFeatureConfigLJIILL = LJIILL();
        if (z) {
            thirdPartyConfig = accountLoginFeatureConfigLJIILL.signupMethods.thirdParties;
        } else {
            thirdPartyConfig = accountLoginFeatureConfigLJIILL.loginMethods.thirdPartis;
        }
        Map<String, String> map = thirdPartyConfig.regionsToPlatforms;
        String value = thirdPartyConfig.defaultPlatforms;
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it2.next();
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(next.getKey(), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it3 = listLJJLIIIJILLIZJL.iterator();
            while (it3.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it3.next()).toString());
            }
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService == null || (strLJIIIIZZ = iAccountService.LJIIIIZZ()) == null) {
                strLJIIIIZZ = "US";
            }
            if (arrayList.contains(strLJIIIIZZ)) {
                value = next.getValue();
                break;
            }
        }
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(value, new String[]{","}, 0, 6);
        ArrayList<String> arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
        Iterator it4 = listLJJLIIIJILLIZJL2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(a0.LJLIIIL((String) it4.next()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            EnumC1239210iLv.Companion.getClass();
            EnumC1239210iLv enumC1239210iLvLIZ = C1239240iLy.LIZ(str);
            if (enumC1239210iLvLIZ != null) {
                arrayList3.add(enumC1239210iLvLIZ);
            }
        }
        return arrayList3;
    }
}
