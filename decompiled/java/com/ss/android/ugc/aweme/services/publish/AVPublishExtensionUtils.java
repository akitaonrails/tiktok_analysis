package com.ss.android.ugc.aweme.services.publish;

import X.C0WIY;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AVPublishExtensionUtils {
    public static final <T> T findModel(List<? extends C0WIY<Class<?>, IAVPublishExtension<?>>> list, Class<T> cls) {
        IAVPublishExtension<?> iAVPublishExtension;
        Iterator<? extends C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = list.iterator();
        boolean z = false;
        C0WIY<Class<?>, IAVPublishExtension<?>> c0wiy = null;
        while (true) {
            if (it2.hasNext()) {
                C0WIY<Class<?>, IAVPublishExtension<?>> next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, cls)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    c0wiy = next;
                }
            } else if (!z) {
                break;
            }
        }
        c0wiy = null;
        C0WIY<Class<?>, IAVPublishExtension<?>> c0wiy2 = c0wiy;
        if (c0wiy2 == null || (iAVPublishExtension = c0wiy2.LIZIZ) == null) {
            return null;
        }
        return (T) iAVPublishExtension.provideExtensionData();
    }
}
