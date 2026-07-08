package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.C0C5P;
import X.EnumC19241510Pl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class MandatoryLoginService$hybridABForcedLogin$2 extends C09AY implements Function0<MandatoryLoginService.Companion.HybridABForcedLogin> {
    public final /* synthetic */ MandatoryLoginService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MandatoryLoginService$hybridABForcedLogin$2(MandatoryLoginService mandatoryLoginService) {
        super(0);
        this.this$0 = mandatoryLoginService;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ MandatoryLoginService.Companion.HybridABForcedLogin invoke() {
        IPluginService.SimplePluginData simplePluginData;
        List<IPluginService.PluginData> currentPluginListPluginData;
        int i = 0;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        IPluginService.PluginData pluginData = null;
        if (iPluginService != null && (currentPluginListPluginData = iPluginService.getCurrentPluginListPluginData()) != null) {
            Iterator<IPluginService.PluginData> it2 = currentPluginListPluginData.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                IPluginService.PluginData next = it2.next();
                if (next.id == EnumC19241510Pl.FORCE_LOGIN.getValue()) {
                    pluginData = next;
                    break;
                }
            }
            pluginData = pluginData;
        }
        if (pluginData == null || !Intrinsics.LJFF(pluginData.showConfig.shouldShow, Boolean.TRUE)) {
            Keva keva = this.this$0.keva;
            MandatoryLoginService.Companion.HybridABForcedLogin hybridABForcedLogin = MandatoryLoginService.Companion.HybridABForcedLogin.CONTROL;
            keva.storeInt("force_login_group", hybridABForcedLogin.getValue());
            return hybridABForcedLogin;
        }
        int i2 = this.this$0.keva.getInt("force_login_group", -1);
        if (i2 >= 0) {
            MandatoryLoginService.Companion.HybridABForcedLogin value = MandatoryLoginService.Companion.HybridABForcedLogin.Companion.getValue(i2);
            return value == null ? MandatoryLoginService.Companion.HybridABForcedLogin.CONTROL : value;
        }
        String str = pluginData.abExposeVid;
        if (str != null) {
            C0C5P.LIZJ().getClass();
            C0C5P.LIZ(str);
        }
        IPluginService.PluginDataWrapper pluginDataWrapper = pluginData.configData;
        if (pluginDataWrapper != null && (simplePluginData = pluginDataWrapper.simplePluginData) != null) {
            i = simplePluginData.abGroup;
        }
        this.this$0.keva.storeInt("force_login_group", i);
        MandatoryLoginService.Companion.HybridABForcedLogin value2 = MandatoryLoginService.Companion.HybridABForcedLogin.Companion.getValue(i);
        return value2 == null ? MandatoryLoginService.Companion.HybridABForcedLogin.CONTROL : value2;
    }
}
