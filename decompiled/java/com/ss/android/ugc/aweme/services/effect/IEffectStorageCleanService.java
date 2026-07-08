package com.ss.android.ugc.aweme.services.effect;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public interface IEffectStorageCleanService {
    void tryClean(EffectType effectType, Function0<Unit> function0);

    void tryClean(Function0<Unit> function0);

    void tryCleanOnForExtremeLowStorage(EffectType effectType, Long l, Function0<Unit> function0);

    public static final class DefaultImpls {
        public static /* synthetic */ void tryCleanOnForExtremeLowStorage$default(IEffectStorageCleanService iEffectStorageCleanService, EffectType effectType, Long l, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    l = null;
                }
                iEffectStorageCleanService.tryCleanOnForExtremeLowStorage(effectType, l, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryCleanOnForExtremeLowStorage");
        }
    }
}
