package com.ss.android.ugc.aweme.loginplatform;

import X.C09CT;
import X.C1239240iLy;
import X.EnumC1239210iLv;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginSignupConfig {

    @C09CT("order")
    public final List<String> order;

    @C09CT("platform_configs")
    public final List<LoginMethodConfig> platformConfigs;

    @C09CT("show_num")
    public final Integer showNum;

    public LoginSignupConfig() {
        this(null, null, null);
    }

    public final Set<EnumC1239210iLv> LIZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<LoginMethodConfig> list = this.platformConfigs;
        if (list != null) {
            for (LoginMethodConfig loginMethodConfig : list) {
                String str = loginMethodConfig.platform;
                if (str != null && str.length() != 0) {
                    C1239240iLy c1239240iLy = EnumC1239210iLv.Companion;
                    String str2 = loginMethodConfig.platform;
                    c1239240iLy.getClass();
                    EnumC1239210iLv enumC1239210iLvLIZ = C1239240iLy.LIZ(str2);
                    if (enumC1239210iLvLIZ != null) {
                        linkedHashSet.add(enumC1239210iLvLIZ);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public LoginSignupConfig(Integer num, List<String> list, List<LoginMethodConfig> list2) {
        this.showNum = num;
        this.order = list;
        this.platformConfigs = list2;
    }
}
