package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C844470XAv;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$1$1;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS49S0000100_8 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS49S0000100_8 awS49S0000100_8) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new InternalRecordServiceImpl$preloadVESoAsync$1$1(awS49S0000100_8.j0, null), 3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S0000100_8 awS49S0000100_8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check file exist cost: ");
        sbLIZ.append(System.currentTimeMillis() - awS49S0000100_8.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0000100_8(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
