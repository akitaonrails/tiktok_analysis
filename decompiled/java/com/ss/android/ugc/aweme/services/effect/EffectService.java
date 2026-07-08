package com.ss.android.ugc.aweme.services.effect;

import X.C01GW;
import X.C0C64;
import X.C0MZ9;
import X.C0VSJ;
import X.C1446630nkT;
import X.C1626140sQ0;
import X.C1633850scR;
import X.C20137613qo;
import X.C297340Bl6;
import X.C452501pT;
import X.C558340Lv6;
import X.C844470XAv;
import X.InterfaceC1625580sP6;
import X.InterfaceC1635410sex;
import android.content.Context;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS139S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS584S0100000_5;
import lth.o;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectService implements IEffectService {
    public static EffectService sInstance;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public final File MV_RES_CACHE_FILE = new C0VSJ(o.LJJ.LJIIIIZZ().LIZ().LIZLLL());
    public final C01GW mvEffectPlatformInstance$delegate = C452501pT.LIZIZ(new AwS569S0100000_25(this, 226));
    public final C01GW fontEffectPlatformInstance$delegate = C452501pT.LIZIZ(new AwS569S0100000_25(this, 225));

    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final EffectService getInstance() {
            if (EffectService.sInstance == null) {
                synchronized (EffectService.class) {
                    try {
                        if (EffectService.sInstance == null) {
                            EffectService.sInstance = new EffectService();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return EffectService.sInstance;
        }
    }

    public static final EffectService getInstance() {
        return Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.LJJJJL(false);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    private final InterfaceC1635410sex getFontEffectPlatformInstance() {
        return (InterfaceC1635410sex) this.fontEffectPlatformInstance$delegate.getValue();
    }

    private final InterfaceC1635410sex getMvEffectPlatformInstance() {
        return (InterfaceC1635410sex) this.mvEffectPlatformInstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getCacheDir() {
        return EffectPlatform.LLILZ.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getModelCacheDir() {
        return EffectPlatform.LLILZIL.getAbsolutePath();
    }

    private final InterfaceC1625580sP6 getStickerFetch(InterfaceC1635410sex interfaceC1635410sex) {
        return C1626140sQ0.LIZ(interfaceC1635410sex);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC1635410sex createFontEffectPlatform(Context context) {
        if (C297340Bl6.LIZIZ()) {
            return getFontEffectPlatformInstance();
        }
        return C1633850scR.LIZ(context, new AwS584S0100000_5(this, 38));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC1635410sex createMvEffectPlatform(Context context) {
        return createMvEffectPlatform(context, null);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public Size getRealVideoSize(String str) {
        C20137613qo c20137613qo = C20137613qo.LIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C558340Lv6 c558340Lv6LIZLLL = c20137613qo.LIZLLL(str);
        return new Size(c558340Lv6LIZLLL.LIZIZ, c558340Lv6LIZLLL.LIZJ);
    }

    public final void setFontEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_font_cache", true, false)) {
            effectPlatformBuilder.effectMaxCacheSize = C0C64.LJIILLIIL().LJIJJLI(31744, 838860800L, "creative_tool_font_cache_threshold", true) * 1048576;
        }
    }

    public final void setMvEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_mv_cache", true, false)) {
            effectPlatformBuilder.effectMaxCacheSize = C0C64.LJIILLIIL().LJIJJLI(31744, 838860800L, "creative_tool_mv_cache_threshold", true) * 1048576;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC1635410sex createEffectPlatform(Context context, String str) {
        if (C297340Bl6.LIZIZ() && str == null) {
            return C1633850scR.LIZ(context, null);
        }
        return C1633850scR.LIZ(context, C297340Bl6.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC1635410sex createMvEffectPlatform(Context context, String str) {
        if (C297340Bl6.LIZIZ() && str == null) {
            return getMvEffectPlatformInstance();
        }
        return C1633850scR.LIZ(context, new AwS139S1100000_25(str, this, 2));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(InterfaceC1635410sex interfaceC1635410sex, String str, String str2, IFetchEffectListener iFetchEffectListener) {
        C1626140sQ0.LIZ(interfaceC1635410sex).LIZ(str, str2, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(InterfaceC1635410sex interfaceC1635410sex, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        C1626140sQ0.LIZ(interfaceC1635410sex).LIZIZ(str, map, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<? extends EffectPointModel> list, FilterBean filterBean, float f, int i, boolean z, AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        EditPreviewInfo editPreviewInfoLJ;
        filterBean.getFilterFolder();
        if (awemeDraft != null) {
            editPreviewInfoLJ = C0MZ9.LJ(awemeDraft, true);
        } else {
            editPreviewInfoLJ = null;
        }
        C1446630nkT.LIZIZ(i, z, editPreviewInfoLJ, null, onVideoCoverCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<? extends EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C1446630nkT.LIZIZ(i, z, editPreviewInfo, null, onVideoCoverCallback);
    }
}
