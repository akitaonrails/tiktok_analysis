package com.ss.android.ugc.aweme.tangram;

import X.C1440550naf;
import X.C1D80;
import X.C1D82;
import X.C569090MTr;
import X.C575000Mgs;
import X.C575010Mgt;
import X.C575020Mgu;
import X.C575060Mgy;
import X.C575070Mgz;
import X.C575090Mh1;
import X.InterfaceC568850MSt;
import X.InterfaceC569070MTp;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.ITangramService;
import com.ss.android.ugc.aweme.tangram.router.TangramRouter;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.CaptionResModel;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import com.ss.ugc.aweme.creation.base.MusicModel;
import com.ss.ugc.aweme.creation.base.MusicResModel;
import com.ss.ugc.aweme.creation.base.PhotoModeComposer;
import com.ss.ugc.aweme.creation.base.SpecialEffectResModel;
import com.ss.ugc.aweme.creation.base.StickerResModel;
import com.ss.ugc.aweme.creation.base.VideoGroupComposer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS167S0400000_8;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class TangramServiceImpl implements ITangramService {
    @Override // com.ss.android.ugc.aweme.services.external.ITangramService
    public final IInterceptor tangramRouter() {
        return new TangramRouter();
    }

    public TangramServiceImpl() {
        C575000Mgs.LIZLLL.put(CreationConfigModel.class, AFwS194S0000000_8.get$arr$(526));
        C575020Mgu.LIZ(MusicResModel.class, AFwS194S0000000_8.get$arr$(530));
        C575020Mgu.LIZ(ImportItemModel.class, AFwS194S0000000_8.get$arr$(531));
        C575020Mgu.LIZ(EditConfigModel.class, AFwS194S0000000_8.get$arr$(532));
        C575020Mgu.LIZ(VideoGroupComposer.class, AFwS194S0000000_8.get$arr$(533));
        C575020Mgu.LIZ(PhotoModeComposer.class, AFwS194S0000000_8.get$arr$(534));
        C575020Mgu.LIZ(StickerResModel.class, AFwS194S0000000_8.get$arr$(535));
        C575020Mgu.LIZ(SpecialEffectResModel.class, AFwS194S0000000_8.get$arr$(536));
        C575020Mgu.LIZ(BasicModelCompat.class, AFwS194S0000000_8.get$arr$(537));
        C575020Mgu.LIZ(CreationConfigModel.class, AFwS194S0000000_8.get$arr$(538));
        C575020Mgu.LIZ(CreationConfigModelCompat.class, AFwS194S0000000_8.get$arr$(527));
        C575020Mgu.LIZ(CaptionResModel.class, AFwS194S0000000_8.get$arr$(528));
        C575020Mgu.LIZ(MusicModel.class, AFwS194S0000000_8.get$arr$(529));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ITangramService
    public final InterfaceC568850MSt start(Context context, Object obj, Function1<? super InterfaceC569070MTp, Unit> function1, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        C575000Mgs c575000Mgs = new C575000Mgs();
        AwS167S0400000_8 awS167S0400000_8 = new AwS167S0400000_8((Function1) function1, (Function1<? super InterfaceC569070MTp, Unit>) obj, (Object) context, (Context) this, (TangramServiceImpl) 3);
        C575060Mgy c575060Mgy = new C575060Mgy(obj);
        C575090Mh1 c575090Mh1 = new C575090Mh1(C575000Mgs.LIZIZ, C575000Mgs.LIZJ, C575000Mgs.LIZLLL);
        C575010Mgt c575010Mgt = new C575010Mgt(new C569090MTr(), awS167S0400000_8);
        C1D82 c1d82 = new C1D82(AFwS194S0000000_8.get$arr$(575), "tangram_prepare");
        C1D82 c1d822 = new C1D82(AFwS194S0000000_8.get$arr$(573), "tangram_convert_model");
        C1D82 c1d823 = new C1D82(AFwS194S0000000_8.get$arr$(572), "tangram_check_legality");
        C1D82 c1d824 = new C1D82(AFwS194S0000000_8.get$arr$(574), "tangram_parse_model");
        c1d822.LIZ(c1d82);
        c1d823.LIZ(c1d822);
        c1d824.LIZ(c1d823, c1d822);
        C1440550naf c1440550naf = new C1440550naf("Tangram", (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1));
        ((ArrayList) c1440550naf.LJI).add(c575060Mgy);
        ((ArrayList) c1440550naf.LIZLLL).add(c575090Mh1);
        ((ArrayList) c1440550naf.LIZLLL).add(c575010Mgt);
        C1D80 c1d80LIZ = c1440550naf.LIZ();
        C575070Mgz.LIZ(c1d80LIZ, new AwS374S0200000_8(c575000Mgs, (C575000Mgs) function2, (Function2<? super Boolean, ? super Throwable, Unit>) 215));
        c1d80LIZ.LJII();
        return c575000Mgs;
    }
}
