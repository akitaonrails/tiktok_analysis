package kotlin.jvm.internal;

import X.AbstractC20000013Ne;
import X.C09AY;
import X.C13MA;
import X.C13MG;
import X.C13NV;
import X.C13NY;
import X.C143O;
import X.C1662010tLr;
import X.C260620AJg;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS146S0110000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS146S0110000_30 awS146S0110000_30) {
        String stringExtra;
        boolean booleanExtra;
        CreativeToolsPluginService creativeToolsPluginService;
        Intent intent = ((SAAActivity) awS146S0110000_30.l0).getIntent();
        String stringExtra2 = null;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        Intent intent2 = ((SAAActivity) awS146S0110000_30.l0).getIntent();
        if (intent2 != null) {
            try {
                stringExtra2 = intent2.getStringExtra("shoot_way");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Intent intent3 = ((SAAActivity) awS146S0110000_30.l0).getIntent();
        boolean booleanExtra2 = false;
        if (intent3 != null) {
            booleanExtra = intent3.getBooleanExtra("isFromDraft", false);
        } else {
            booleanExtra = false;
        }
        Intent intent4 = ((SAAActivity) awS146S0110000_30.l0).getIntent();
        if (intent4 != null) {
            booleanExtra2 = intent4.getBooleanExtra("ignoreVEPluginCheck", false);
        }
        C143O.LIZ(Boolean.valueOf(booleanExtra), stringExtra, stringExtra2);
        if (!booleanExtra2 && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            creativeToolsPluginService.LJII(Boolean.valueOf(booleanExtra), awS146S0110000_30.z1, stringExtra, stringExtra2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS146S0110000_30 awS146S0110000_30) {
        ((Function1) awS146S0110000_30.l0).invoke(Boolean.valueOf(!awS146S0110000_30.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS146S0110000_30 awS146S0110000_30) {
        ((AbstractC20000013Ne) awS146S0110000_30.l0).onPause(awS146S0110000_30.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS146S0110000_30 awS146S0110000_30) {
        String strExpectedMd5;
        C13NV c13nv = (C13NV) awS146S0110000_30.l0;
        C13MG c13mg = c13nv.LIZIZ.LJJJI;
        Effect effect = c13nv.LIZ;
        c13mg.getClass();
        int i = 10001;
        String str = "10001";
        if (effect != null && (strExpectedMd5 = EffectKt.expectedMd5(effect)) != null) {
            CopyOnWriteArraySet<C13NY> copyOnWriteArraySet = C13MG.LIZJ.get(strExpectedMd5);
            if (copyOnWriteArraySet != null) {
                Iterator<C13NY> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().onFail(effect, new C1662010tLr(10001, new Exception("10001")));
                }
            }
            C13MG.LIZJ.remove(strExpectedMd5);
            C13MG.LIZIZ.remove(strExpectedMd5);
        }
        if (!((Boolean) C260620AJg.LIZ.getValue()).booleanValue() || awS146S0110000_30.z1) {
            C13NV c13nv2 = (C13NV) awS146S0110000_30.l0;
            C13MA c13maLIZ = c13nv2.LIZIZ.LJJJIL.LIZ(c13nv2.LIZJ);
            if ((c13maLIZ instanceof C13NY) && c13maLIZ != null) {
                Effect effect2 = ((C13NV) awS146S0110000_30.l0).LIZ;
                if (awS146S0110000_30.z1) {
                    i = 10028;
                }
                if (awS146S0110000_30.z1) {
                    str = "10028";
                }
                c13maLIZ.onFail(effect2, new C1662010tLr(i, new Exception(str)));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0110000_30(C13NV c13nv, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c13nv;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0110000_30(AbstractC20000013Ne abstractC20000013Ne, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20000013Ne;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0110000_30(SAAActivity sAAActivity, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = sAAActivity;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0110000_30(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }
}
