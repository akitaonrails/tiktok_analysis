package ttpobfuscated;

import X.C15438062q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class hg implements yd {
    public List<ServerConfig> a;

    public hg(GeneralConfig generalConfig) {
        List<ServerConfig> serverConfigs;
        if (generalConfig != null) {
            serverConfigs = generalConfig.getServerConfigs();
        } else {
            serverConfigs = null;
        }
        this.a = serverConfigs;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // ttpobfuscated.yd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ttp.orbu.sdk.configuration.model.ServerConfig a(ttp.orbu.sdk.configuration.model.ServerAPIType r11) {
        /*
            r10 = this;
            java.util.List<ttp.orbu.sdk.configuration.model.ServerConfig> r0 = r10.a
            r4 = r11
            if (r0 == 0) goto L1e
            java.util.Iterator r1 = r0.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r1.next()
            r0 = r3
            ttp.orbu.sdk.configuration.model.ServerConfig r0 = (ttp.orbu.sdk.configuration.model.ServerConfig) r0
            ttp.orbu.sdk.configuration.model.ServerAPIType r0 = r0.name
            if (r0 != r4) goto L9
        L1a:
            ttp.orbu.sdk.configuration.model.ServerConfig r3 = (ttp.orbu.sdk.configuration.model.ServerConfig) r3
            if (r3 != 0) goto L63
        L1e:
            ttp.orbu.sdk.configuration.model.ServerConfig r3 = new ttp.orbu.sdk.configuration.model.ServerConfig
            java.lang.String r5 = r4.getBaseUrl()
            r6 = 30000(0x7530, float:4.2039E-41)
            ttpobfuscated.x r1 = ttpobfuscated.x.a
            ttp.orbu.sdk.configuration.model.ConfigType$General r0 = ttp.orbu.sdk.configuration.model.ConfigType.General.INSTANCE
            ttp.orbu.sdk.configuration.model.Config r1 = r1.a(r0)
            boolean r0 = r1 instanceof ttp.orbu.sdk.configuration.model.GeneralConfig
            r7 = 0
            if (r0 == 0) goto L58
            ttp.orbu.sdk.configuration.model.GeneralConfig r1 = (ttp.orbu.sdk.configuration.model.GeneralConfig) r1
            if (r1 == 0) goto L58
            java.util.List r0 = r1.getServerConfigs()
            if (r0 == 0) goto L58
            java.util.Iterator r2 = r0.iterator()
        L41:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()
            r0 = r1
            ttp.orbu.sdk.configuration.model.ServerConfig r0 = (ttp.orbu.sdk.configuration.model.ServerConfig) r0
            ttp.orbu.sdk.configuration.model.ServerAPIType r0 = r0.name
            if (r0 != r4) goto L41
        L52:
            ttp.orbu.sdk.configuration.model.ServerConfig r1 = (ttp.orbu.sdk.configuration.model.ServerConfig) r1
            if (r1 == 0) goto L58
            java.lang.Integer r7 = r1.maxPayloadSizeInBytes
        L58:
            java.lang.Integer r8 = r4.getDefaultServiceDeferIntervalInSeconds()
            java.lang.String r9 = r4.getDefaultApiVersionPathParameter()
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L63:
            return r3
        L64:
            r1 = r7
            goto L52
        L66:
            r3 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.hg.a(ttp.orbu.sdk.configuration.model.ServerAPIType):ttp.orbu.sdk.configuration.model.ServerConfig");
    }

    @Override // ttpobfuscated.yd
    public void a(ServerConfig serverConfig) {
        List<ServerConfig> list = this.a;
        if (list != null) {
            Iterator<ServerConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ServerConfig next = it2.next();
                if (next.name == serverConfig.name) {
                    if (next != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (ServerConfig serverConfig2 : list) {
                            if (serverConfig2.name == serverConfig.name) {
                                serverConfig2 = serverConfig;
                            }
                            arrayList.add(serverConfig2);
                        }
                        this.a = arrayList;
                        if (Unit.LIZ == null) {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.add(serverConfig);
            this.a = arrayList2;
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.a = Collections.singletonList(serverConfig);
    }

    @Override // ttpobfuscated.yd
    public void a(List<ServerConfig> list) {
        this.a = list;
    }
}
