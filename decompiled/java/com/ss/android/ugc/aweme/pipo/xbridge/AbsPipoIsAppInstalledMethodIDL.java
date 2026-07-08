package com.ss.android.ugc.aweme.pipo.xbridge;

import X.AbstractC1549150qPp;
import X.C09CT;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549730qQl;
import X.InterfaceC1724540uyi;
import X.InterfaceC1724550uyj;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public abstract class AbsPipoIsAppInstalledMethodIDL extends AbstractC1549150qPp<InterfaceC1724540uyi, InterfaceC1724550uyj> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "38840"));

    @InterfaceC1549730qQl(name = "pipo.isAppInstalled", params = {"app_list"}, results = {"checkResult"})
    public final String name = "pipo.isAppInstalled";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }

    public static final class AppInfo implements Serializable {

        @C09CT("app_name")
        public final String appName;

        @C09CT("package_name")
        public final String packageName;

        @C09CT("schema")
        public final String schema;

        public AppInfo(String str, String str2, String str3) {
            this.appName = str;
            this.packageName = str2;
            this.schema = str3;
        }
    }
}
