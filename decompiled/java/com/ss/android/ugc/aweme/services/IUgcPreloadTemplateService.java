package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public interface IUgcPreloadTemplateService {
    void preloadTemplate(Activity activity, String str, int i, String str2, Function2<? super String, ? super String, Unit> function2, Function0<Unit> function0);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void preloadTemplate$default(IUgcPreloadTemplateService iUgcPreloadTemplateService, Activity activity, String str, int i, String str2, Function2 function2, Function0 function0, int i2, Object obj) {
            String str3 = str2;
            if (obj == null) {
                Function0 function02 = null;
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                if ((i2 & 32) == 0) {
                    function02 = function0;
                }
                iUgcPreloadTemplateService.preloadTemplate(activity, str, i, str3, function2, function02);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadTemplate");
        }
    }
}
