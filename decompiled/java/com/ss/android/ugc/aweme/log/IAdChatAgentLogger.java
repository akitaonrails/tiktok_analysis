package com.ss.android.ugc.aweme.log;

import X.AbstractC207072161e;
import X.C1023630ckD;
import X.C1023640ckE;
import X.C1196804mE;
import X.C443120HZe;
import X.InterfaceC1023400cjq;
import X.InterfaceC1023590ck9;
import X.InterfaceC1023650ckF;
import X.InterfaceC1126004ao;
import X.InterfaceC665370Q7z;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.tracker.event.AdBaseEvent;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdChatAgentLogger extends InterfaceC1023590ck9 {
    /* synthetic */ Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr);

    @Override // X.InterfaceC1024040cks
    /* synthetic */ Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr, Function1<? super C1023640ckE, Unit> function1);

    @Override // X.InterfaceC1004190cEr
    /* synthetic */ void log(InterfaceC1023400cjq<?> interfaceC1023400cjq);

    @Override // X.InterfaceC1004190cEr
    /* synthetic */ void log(InterfaceC1023400cjq<?> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1);

    @Override // X.InterfaceC1009950cO9
    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq);

    @Override // X.InterfaceC1009950cO9
    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData);

    @Override // X.InterfaceC1009950cO9
    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData, Function1<? super C1023640ckE, Unit> function1);

    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, String str, String str2, String str3);

    @Override // X.InterfaceC1009950cO9
    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, String str, String str2, String str3, Function1<? super C1023640ckE, Unit> function1);

    @Override // X.InterfaceC1009950cO9
    /* synthetic */ void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1);

    /* synthetic */ <T extends AdBaseEvent> void logAdEvent(T t, AwemeRawAd awemeRawAd, Function2<? super T, ? super C1023640ckE, Unit> function2);

    /* synthetic */ <T extends AdBaseEvent> void logAdEvent(T t, String str, String str2, String str3, Function2<? super T, ? super C1023640ckE, Unit> function2);

    /* synthetic */ <T extends AbstractC207072161e> void logWithEvent(T t);

    /* synthetic */ <T extends AbstractC207072161e> void logWithEvent(T t, Function2<? super T, ? super C1023640ckE, Unit> function2);

    /* synthetic */ void setHostContextDepend(IHostContextDepend iHostContextDepend);

    /* synthetic */ void setLogDepend(IAppLogDepend iAppLogDepend);

    /* synthetic */ void setMonitorDepend(IMonitorDepend iMonitorDepend);

    @Override // X.InterfaceC1024040cks
    /* synthetic */ void withContext(Object obj);

    @Override // X.InterfaceC1024040cks
    /* synthetic */ void withContext(Object... objArr);

    /* synthetic */ void withContextByType(Class<?> cls, Object obj);

    /* synthetic */ void withLogicProvider(InterfaceC1126004ao interfaceC1126004ao);

    @Override // X.InterfaceC1024040cks
    /* synthetic */ <T> void withParam(InterfaceC1023650ckF<T, ?> interfaceC1023650ckF, T t);

    /* synthetic */ void withParamLogic(C1023630ckD<?> c1023630ckD);

    /* synthetic */ <T> void withParamLogic(InterfaceC1023650ckF<T, ?> interfaceC1023650ckF, Function1<? super C1196804mE, ? extends T> function1);

    /* synthetic */ void withVScope(InterfaceC665370Q7z interfaceC665370Q7z);
}
