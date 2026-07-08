package com.ss.android.ugc.aweme.aigc;

import X.C1165304h9;
import X.C13LP;
import X.C1446930nkx;
import X.C542260LOm;
import X.C542370LOx;
import X.C546230LbZ;
import X.C547940LeK;
import X.InterfaceC546090LbL;
import com.ss.android.ugc.aweme.aikit.api.common.AIConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class AIConfigServiceImpl implements AIConfigService {
    public final Map<InterfaceC546090LbL, C546230LbZ> LIZ = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final void LIZ(InterfaceC546090LbL interfaceC546090LbL) {
        ((ConcurrentHashMap) this.LIZ).remove(interfaceC546090LbL);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final void LIZIZ(C546230LbZ c546230LbZ) {
        String str;
        ((ConcurrentHashMap) this.LIZ).put(c546230LbZ.LIZ, c546230LbZ);
        C547940LeK c547940LeKLJFF = c546230LbZ.LJFF();
        if (c547940LeKLJFF != null && (str = c547940LeKLJFF.LIZIZ) != null) {
            C1446930nkx.LIZIZ(str, new AwS587S0100000_8(c546230LbZ, 26));
        }
        Function1<? super C542260LOm, Unit> function1 = (Function1) c546230LbZ.LJIIIZ.getValue();
        if (function1 != null) {
            C542370LOx.LIZ.getClass();
            NoticeService noticeServiceLIZ = C542370LOx.LIZ();
            if (noticeServiceLIZ != null) {
                noticeServiceLIZ.LIZIZ(function1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final InterfaceC546090LbL LIZLLL(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        for (Object obj2 : ((ConcurrentHashMap) this.LIZ).keySet()) {
            InterfaceC546090LbL interfaceC546090LbL = (InterfaceC546090LbL) obj2;
            if (!Intrinsics.LJFF(interfaceC546090LbL.getTag(), str)) {
                String tag = interfaceC546090LbL.getTag();
                Locale locale = Locale.ROOT;
                if (a0.LJJIIZI(tag.toLowerCase(locale), str.toLowerCase(locale), false)) {
                }
            }
            obj = obj2;
        }
        return (InterfaceC546090LbL) obj;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final C546230LbZ LJ(InterfaceC546090LbL interfaceC546090LbL) {
        return (C546230LbZ) ((ConcurrentHashMap) this.LIZ).get(interfaceC546090LbL);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final List<C546230LbZ> LJFF(boolean z) {
        C1165304h9 c1165304h9;
        Function0<Boolean> function0;
        List listLLIIII = C13LP.LLIIII(((ConcurrentHashMap) this.LIZ).values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            C546230LbZ c546230LbZ = (C546230LbZ) obj;
            if (z || ((c1165304h9 = (C1165304h9) c546230LbZ.LIZIZ.getValue()) != null && (function0 = c1165304h9.LIZ) != null && function0.invoke().booleanValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIConfigService
    public final void LIZJ(String str, String str2) {
        ICrashReportService iCrashReportServiceProvideErrorReporter;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iCrashReportServiceProvideErrorReporter = iExternalService.provideErrorReporter()) != null) {
            iCrashReportServiceProvideErrorReporter.setCustomTag(str, str2);
        }
    }
}
