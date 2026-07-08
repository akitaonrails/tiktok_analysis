package com.ss.android.ugc.aweme.services.external;

import X.InterfaceC568850MSt;
import X.InterfaceC569070MTp;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS291S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface ITangramService {
    InterfaceC568850MSt start(Context context, Object obj, Function1<? super InterfaceC569070MTp, Unit> function1, Function2<? super Boolean, ? super Throwable, Unit> function2);

    IInterceptor tangramRouter();

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC568850MSt start$default(ITangramService iTangramService, Context context, Object obj, Function1 function1, Function2 function2, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    function1 = AFwS239S0000000_8.get$arr$(59);
                }
                if ((i & 8) != 0) {
                    function2 = AFwS291S0000000_8.get$arr$(7);
                }
                return iTangramService.start(context, obj, function1, function2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
    }
}
