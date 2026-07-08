package com.ss.android.ugc.aweme.effectplatform;

import X.C0ARK;
import X.C0CHQ;
import X.C0PEM;
import X.C1336210ksN;
import X.C1954807lC;
import X.C20011213Rm;
import X.C20011513Rp;
import X.C20186013yc;
import X.C201955140j;
import X.C2250131D5f;
import X.C2296808zG;
import X.C23250099c;
import X.C262570AQt;
import X.C286970BMp;
import X.C300080BpW;
import X.InterfaceC1635410sex;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.EffectType;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectStorageCleanServiceImpl implements IEffectStorageCleanService {
    @Override // com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService
    public final void tryClean(Function0<Unit> function0) {
        if (!((Boolean) C262570AQt.LIZ.getValue()).booleanValue()) {
            function0.invoke();
            return;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class);
            EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
            effectPlatformBuilder.setContext(C0CHQ.LIZ);
            EffectConfiguration effectConfigurationBuild = iEffectPlatformFactory.createEffectConfigurationBuilder(effectPlatformBuilder).build();
            EffectManager effectManager = new EffectManager();
            effectManager.init(effectConfigurationBuild);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20011213Rm(effectConfigurationBuild, effectManager, function0, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService
    public final void tryClean(EffectType effectType, Function0<Unit> function0) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            if (C286970BMp.LIZ()) {
                EffectPlatform.LJJJJLL(false);
            }
            tryCleanOnForExtremeLowStorage(effectType, Long.valueOf(((Number) C300080BpW.LIZIZ.getValue()).longValue()), function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService
    public final void tryCleanOnForExtremeLowStorage(EffectType effectType, Long l, Function0<Unit> function0) {
        long jLongValue;
        InterfaceC1635410sex interfaceC1635410sexCreateFontEffectPlatform;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        EffectManager effectManagerLLJILJILJ = null;
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            try {
                int i = C20011513Rp.LIZ[effectType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        IEffectService iEffectServiceEffectService = ((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).effectService();
                        if (iEffectServiceEffectService != null && (interfaceC1635410sexCreateFontEffectPlatform = iEffectServiceEffectService.createFontEffectPlatform(C0CHQ.LIZ)) != null) {
                            effectManagerLLJILJILJ = interfaceC1635410sexCreateFontEffectPlatform.LLJILJILJ();
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    IEffectService iEffectServiceEffectService2 = ((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).effectService();
                    if (iEffectServiceEffectService2 != null) {
                        Application application = C0CHQ.LIZ;
                        InterfaceC1635410sex interfaceC1635410sexCreateEffectPlatform = iEffectServiceEffectService2.createEffectPlatform(application, C20186013yc.LIZ());
                        if (interfaceC1635410sexCreateEffectPlatform != null) {
                            effectManagerLLJILJILJ = interfaceC1635410sexCreateEffectPlatform.LLJILJILJ();
                        }
                    }
                }
                C201955140j.LIZIZ("EffectStorageClean", "tryCleanOnForExtremeLowStorage: " + effectType);
                if (l != null) {
                    jLongValue = l.longValue();
                } else if (C1336210ksN.LJ) {
                    jLongValue = ((Number) C2250131D5f.LJIIIIZZ.getValue()).longValue();
                } else {
                    jLongValue = ((Number) C0ARK.LIZ.getValue()).longValue();
                }
                if (effectManagerLLJILJILJ != null) {
                    effectManagerLLJILJILJ.triggerCacheClean(jLongValue);
                }
                function0.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                function0.invoke();
            }
        }
    }
}
