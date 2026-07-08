package com.ss.android.ugc.aweme.hybridkit.task;

import X.AbstractC1538480q8c;
import X.C0CCZ;
import X.C0VZ0;
import X.C1530600pvu;
import X.C1535630q41;
import X.C1538420q8W;
import X.C1867110ygf;
import X.C1877360yxC;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import com.ss.android.ugc.aweme.settings.SparkLynxPrefetchFallbackToV1;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkLynxPrefetchConfigTask implements C0CCZ {
    public static final SparkLynxPrefetchConfigTask LL = new SparkLynxPrefetchConfigTask();
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SparkLynxPrefetchConfigTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        AtomicBoolean atomicBoolean = LLILLJJLI;
        if (atomicBoolean.get()) {
            return;
        }
        if (C1867110ygf.LIZ()) {
            C1535630q41.LJ = new C1530600pvu(DisableSparkLynxPrefetchV2.LIZIZ(), DisableSparkLynxPrefetchV2.LIZ(), (ArrayList) DisableSparkLynxPrefetchV2.LIZJ.getValue(), SparkLynxPrefetchFallbackToV1.LIZ());
        }
        C1877360yxC.LIZ();
        C1538420q8W.LIZ(new AbstractC1538480q8c() { // from class: X.0qB3
            {
                List<Class<? extends InterfaceC1063710dmr>> listLLIFFJFJJ;
                this.LIZ = "hybridkit_default_bid";
                this.LIZIZ = C1877360yxC.LIZJ;
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                List<? extends Class<? extends InterfaceC1063710dmr>> listLIZIZ = C19719512Dh.LIZIZ(new ArrayList((iSparkHostApi == null || (listLLIFFJFJJ = iSparkHostApi.LLIFFJFJJ()) == null) ? C13BV.INSTANCE : listLLIFFJFJJ));
                if (iSparkHostApi != null) {
                    iSparkHostApi.LJL(new AwS602S0100000_23(listLIZIZ, (List<SchemaParserData>) 64));
                    iSparkHostApi.LLILL(new AwS602S0100000_23(listLIZIZ, (List<SchemaParserData>) 65));
                }
                this.LIZJ = listLIZIZ;
            }
        });
        atomicBoolean.set(true);
    }
}
