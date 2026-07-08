package com.ss.android.ugc.aweme.im.message.content.utils;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultConditionStrategy implements DismissConditionStrategy {
    public final Function2<String, SystemContentDismissContext, Boolean> dismissLogic;

    public final Function2<String, SystemContentDismissContext, Boolean> getDismissLogic() {
        return this.dismissLogic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultConditionStrategy(Function2<? super String, ? super SystemContentDismissContext, Boolean> function2) {
        this.dismissLogic = function2;
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.utils.DismissConditionStrategy
    public boolean shouldDismiss(String str, SystemContentDismissContext systemContentDismissContext) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(this.dismissLogic.invoke(str, systemContentDismissContext).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
