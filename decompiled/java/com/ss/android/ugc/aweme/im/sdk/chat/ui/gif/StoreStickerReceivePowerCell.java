package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.C0I6Y;
import X.C0I90;
import X.C0ICX;
import X.C0Z2Z;
import X.C0ZL0;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C1EEO;
import X.C451050HmR;
import X.C454650HsF;
import X.C457780HxI;
import X.C723590SZx;
import X.C724270Sb3;
import X.C869590Y9l;
import X.C898670ZNh;
import X.InterfaceC1681406iC;
import X.InterfaceC2187708hf;
import X.InterfaceC461380I7k;
import android.graphics.Rect;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class StoreStickerReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C0ICX> implements C0I90 {
    public final C1EEO LLJJJIL = C1EEO.LIZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final boolean V5() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreStickerCardReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerReceivePowerCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                ISocialGameService iSocialGameService;
                InterfaceC1681406iC interfaceC1681406iCLIZ;
                C724270Sb3 c724270Sb3 = this.LLJI;
                StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)), StickerTemplate.class);
                if (stickerTemplate == null || (iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class)) == null || (interfaceC1681406iCLIZ = iSocialGameService.LIZ()) == null) {
                    return;
                }
                interfaceC1681406iCLIZ.LIZIZ(((C457780HxI) this.LLLIIII.getValue()).LL, new EmojiGameInfo(1, null, new StickerMatchStruct(stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_set_id"), stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_id"), (String) C13LP.LJJJLZIJ(0, stickerTemplate.imageComponent.urls))));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                IMCrossAppFeatureDiffApi.LIZ.getClass();
                IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
                if (iMCrossAppFeatureDiffApiLIZIZ != null) {
                    iMCrossAppFeatureDiffApiLIZIZ.LJIIIIZZ();
                    return C454650HsF.LIZ(c869590Y9l, Up());
                }
                return yp(c869590Y9l, false);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0I90
    public final String F5() {
        C869590Y9l c869590Y9l;
        C0ICX c0icx = (C0ICX) getItem();
        if (c0icx == null || (c869590Y9l = c0icx.LLILII().LIZ.LIZ) == null) {
            return null;
        }
        return c869590Y9l.getUuid();
    }

    @Override // X.C0I90
    public final Rect Yi() {
        return C451050HmR.LIZ(LJJIJL().findViewById(R.id.eu1));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell
    public final InterfaceC2187708hf T5() {
        return this.LLJJJIL;
    }
}
