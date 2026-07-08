package com.ss.android.ugc.aweme.aigc;

import X.C0CNO;
import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import X.C547600Ldm;
import X.C547610Ldn;
import X.C547620Ldo;
import X.C547630Ldp;
import X.InterfaceC1364105Vn;
import Y.AObserverS173S0200000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaCache;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIQuotaServiceImpl implements AIQuotaService {
    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final boolean LIZ(Source source) {
        Integer num;
        QuotaResult quotaResult = LIZIZ(source).quotaResult;
        if (quotaResult != null && (num = quotaResult.quotaRemain) != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final QuotaCache LIZIZ(Source source) {
        C547610Ldn.LIZ.getClass();
        QuotaCache quotaCache = (QuotaCache) ((LinkedHashMap) C547610Ldn.LJ).get(source);
        if (quotaCache != null && (!C547610Ldn.LIZIZ(quotaCache))) {
            return quotaCache;
        }
        QuotaRequestParam quotaRequestParam = (QuotaRequestParam) ((LinkedHashMap) C547610Ldn.LIZLLL).get(source);
        if (quotaRequestParam == null) {
            return new QuotaCache(C547610Ldn.LIZ(), null, null, null, Long.valueOf(System.currentTimeMillis()));
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C547630Ldp(source, null), 3);
        String strLIZ = C547610Ldn.LIZ();
        Integer num = quotaRequestParam.expireDefaultValue;
        return new QuotaCache(strLIZ, new QuotaResult(num, num, null, "", null), quotaRequestParam, null, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJI(Map<Source, QuotaRequestParam> map) {
        C547610Ldn.LIZ.getClass();
        C547610Ldn.LIZLLL.putAll(map);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final Object LIZLLL(Source source, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        C547610Ldn.LIZ.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C547600Ldm(source, null));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJFF(Source source, Function1<? super Integer, Unit> function1) {
        C547610Ldn.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C547620Ldo(source, function1, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LIZJ(Source source, AITheaterCreationRootScene aITheaterCreationRootScene, AwS587S0100000_8 awS587S0100000_8) {
        C547610Ldn.LIZ.getClass();
        AObserverS173S0200000_8 aObserverS173S0200000_8 = new AObserverS173S0200000_8(awS587S0100000_8, source, 8);
        if (aITheaterCreationRootScene == null) {
            C547610Ldn.LJFF.observeForever(aObserverS173S0200000_8);
        } else {
            C547610Ldn.LJFF.observe(aITheaterCreationRootScene, aObserverS173S0200000_8);
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJ(Source source, Integer num, Integer num2) {
        int iIntValue;
        C547610Ldn c547610Ldn = C547610Ldn.LIZ;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        c547610Ldn.getClass();
        QuotaCache quotaCache = new QuotaCache(C547610Ldn.LIZ(), new QuotaResult(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue), null, "", null), (QuotaRequestParam) ((LinkedHashMap) C547610Ldn.LIZLLL).get(source), null, Long.valueOf(System.currentTimeMillis()));
        C547610Ldn.LJ.put(source, quotaCache);
        C547610Ldn.LIZLLL();
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(quotaCache, 998));
    }
}
