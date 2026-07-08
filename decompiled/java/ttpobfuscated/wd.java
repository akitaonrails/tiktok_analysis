package ttpobfuscated;

import X.AbstractC842530X3j;
import X.C0X0W;
import X.C0X33;
import X.C0XLP;
import X.C0XLQ;
import X.C0XLY;
import X.C13LE;
import X.C13LP;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class wd extends gg {
    public ServerAPIType a;
    public final String b = C13LE.LIZ(wd.class).LJI();

    public wd(ServerAPIType serverAPIType) {
        this.a = serverAPIType;
    }

    @Override // ttpobfuscated.gg
    public C0XLY a(C0X0W c0x0w) {
        ServerConfig serverConfigA = a(this.a);
        Request request = c0x0w.request();
        C0XLQ c0xlqUrl = request.url();
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(serverConfigA.baseUrl);
        C0XLP c0xlpLJIIJ = c0xlqUrl.LJIIJ();
        if (c0xlqLJIIL != null) {
            c0xlpLJIIJ.LJIIJJI(c0xlqLJIIL.LIZ);
            c0xlpLJIIJ.LJFF(c0xlqLJIIL.LIZLLL);
            if (ga.a(c0xlqLJIIL)) {
                c0xlpLJIIJ.LJII(c0xlqLJIIL.LJ);
            }
            c0xlpLJIIJ.LJI = null;
            for (String str : C13LP.LJJJJI(c0xlqUrl.LJIIZILJ())) {
                c0xlpLJIIJ.LIZJ(str, (String) C13LP.LJJJJZI(c0xlqUrl.LJIJ(str)));
            }
        }
        C0X33 c0x33NewBuilder = request.newBuilder();
        c0x33NewBuilder.LJIIIIZZ(c0xlpLJIIJ.LIZLLL());
        AbstractC842530X3j abstractC842530X3jA = y9.a(request.body(), serverConfigA.maxPayloadSizeInBytes);
        if (abstractC842530X3jA != null) {
            c0x33NewBuilder.LIZLLL("POST", abstractC842530X3jA);
        }
        Request requestLIZIZ = c0x33NewBuilder.LIZIZ();
        q3.b.a(q3.a, "intercept -> request: " + requestLIZIZ, this.b, (Throwable) null, 4, (Object) null);
        int i = serverConfigA.timeoutInMS;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return c0x0w.LIZLLL(i, timeUnit).LJFF(serverConfigA.timeoutInMS, timeUnit).LJI(serverConfigA.timeoutInMS, timeUnit).LIZ(requestLIZIZ);
    }

    public final ServerConfig a(ServerAPIType serverAPIType) {
        ServerConfig next;
        GeneralConfig generalConfig;
        List<ServerConfig> serverConfigs;
        ServerConfig next2;
        ua.a.b().e().getClass();
        new y5();
        Iterator<ServerConfig> it2 = y5.b.getServerConfigs().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.name == serverAPIType) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ServerConfig serverConfig = next;
        if (serverConfig == null) {
            String baseUrl = serverAPIType.getBaseUrl();
            Config configA = x.a.a(ConfigType.General.INSTANCE);
            Integer num = null;
            if ((configA instanceof GeneralConfig) && (generalConfig = (GeneralConfig) configA) != null && (serverConfigs = generalConfig.getServerConfigs()) != null) {
                Iterator<ServerConfig> it3 = serverConfigs.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2.name == serverAPIType) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ServerConfig serverConfig2 = next2;
                if (serverConfig2 != null) {
                    num = serverConfig2.maxPayloadSizeInBytes;
                }
            }
            serverConfig = new ServerConfig(serverAPIType, baseUrl, 30000, num, serverAPIType.getDefaultServiceDeferIntervalInSeconds(), serverAPIType.getDefaultApiVersionPathParameter());
        }
        return serverConfig;
    }
}
