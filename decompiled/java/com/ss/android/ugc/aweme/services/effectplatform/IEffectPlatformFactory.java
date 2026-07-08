package com.ss.android.ugc.aweme.services.effectplatform;

import X.InterfaceC1635410sex;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public interface IEffectPlatformFactory {

    public static final class DefaultImpls {
    }

    InterfaceC1635410sex create(EffectPlatformBuilder effectPlatformBuilder);

    InterfaceC1635410sex create(EffectConfiguration.Builder builder, Function1<? super EffectConfiguration, Unit> function1, boolean z, boolean z2);

    EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder);

    List<Host> getDownloadableModelHosts();

    List<Host> getHosts();
}
