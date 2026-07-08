package ttpobfuscated;

import X.C0X0W;
import X.C0X33;
import X.C0XLP;
import X.C0XLY;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import okhttp3.Request;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class o1 extends gg {
    public final s1 a;
    public final yd b;

    public final s1 a() {
        return this.a;
    }

    public final yd b() {
        return this.b;
    }

    @Override // ttpobfuscated.gg
    public C0XLY a(C0X0W c0x0w) {
        GeneralConfig generalConfig;
        String strInvoke;
        s1 s1Var = this.a;
        Request request = c0x0w.request();
        C0XLP c0xlpLJIIJ = request.url().LJIIJ();
        c0xlpLJIIJ.LIZJ("app_version", s1Var.a);
        c0xlpLJIIJ.LIZJ("platform", s1Var.f);
        c0xlpLJIIJ.LIZJ("os_version", s1Var.d);
        c0xlpLJIIJ.LIZJ("ttp_version", s1Var.e);
        c0xlpLJIIJ.LIZJ("current_version", s1Var.b);
        Function0<String> function0 = s1Var.c;
        if (function0 != null && (strInvoke = function0.invoke()) != null && kotlin.text.a0.LJLIIIL(strInvoke).toString().length() > 0) {
            c0xlpLJIIJ.LIZJ("experiment_group", strInvoke);
        }
        C0X33 c0x33NewBuilder = request.newBuilder();
        c0x33NewBuilder.LJIIIIZZ(c0xlpLJIIJ.LIZLLL());
        Request requestLIZIZ = c0x33NewBuilder.LIZIZ();
        q3.b.a(q3.a, "ServerConfigInterceptor - request: " + requestLIZIZ, (String) null, (Throwable) null, 6, (Object) null);
        C0XLY c0xlyLIZ = c0x0w.LIZ(requestLIZIZ);
        int i = c0xlyLIZ.LLILLL;
        if (400 <= i && i < 500) {
            Config configA = x.a.a(ConfigType.General.INSTANCE);
            ServerConfig serverConfig = null;
            if ((configA instanceof GeneralConfig) && (generalConfig = (GeneralConfig) configA) != null) {
                Iterator<ServerConfig> it2 = generalConfig.getServerConfigs().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ServerConfig next = it2.next();
                    if (next.name == ServerAPIType.CONFIGURATION) {
                        serverConfig = next;
                        break;
                    }
                }
                ServerConfig serverConfig2 = serverConfig;
                if (serverConfig2 != null) {
                    ServerConfig serverConfigA = this.b.a(ServerAPIType.CONFIGURATION);
                    this.b.a(serverConfigA.copy(serverConfigA.name, serverConfig2.baseUrl, serverConfigA.timeoutInMS, serverConfigA.maxPayloadSizeInBytes, serverConfigA.serviceDeferIntervalInSeconds, serverConfigA.apiVersionPathParameter));
                }
            }
        }
        return c0xlyLIZ;
    }

    public final void a(String str) {
        s1 s1Var = this.a;
        s1Var.getClass();
        s1Var.b = str;
    }

    public o1(s1 s1Var, yd ydVar) {
        this.a = s1Var;
        this.b = ydVar;
    }
}
