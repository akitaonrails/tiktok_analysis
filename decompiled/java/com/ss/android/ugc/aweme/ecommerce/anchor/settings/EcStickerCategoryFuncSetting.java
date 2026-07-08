package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C09CT;
import X.C1120604Zw;
import X.C1697810uHb;
import X.C1AQS;
import X.C452501pT;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.creativepage.CreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EcStickerCategoryFuncSetting {
    public static final EcStickerCategoryFuncSetting LIZ = new EcStickerCategoryFuncSetting();
    public static final EcStickerCategoryFuncConfig LIZIZ = new EcStickerCategoryFuncConfig(false, C1697810uHb.LJIILJJIL("ecommerce"));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(67));

    public static EcStickerCategoryFuncConfig LIZ() {
        AnonymousClass0317 anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = CreativePageDependencyService.createICreativePageDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICreativePageDependencyService.class.getName(), anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICreativePageDependencyService.class);
        }
        if (((ICreativePageDependencyService) anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin).studioStickerReqResultHandleOptExperiment()) {
            return (EcStickerCategoryFuncConfig) LIZJ.getValue();
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig = LIZIZ;
        EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig2 = (EcStickerCategoryFuncConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_sticker_category_config", EcStickerCategoryFuncConfig.class, ecStickerCategoryFuncConfig);
        return ecStickerCategoryFuncConfig2 == null ? ecStickerCategoryFuncConfig : ecStickerCategoryFuncConfig2;
    }

    public static final class EcStickerCategoryFuncConfig {

        @C09CT("category_key_list")
        public final List<String> categoryKeyList;

        @C09CT("force_hide")
        public final boolean forceHide;

        public EcStickerCategoryFuncConfig(boolean z, List<String> list) {
            this.forceHide = z;
            this.categoryKeyList = list;
        }
    }
}
