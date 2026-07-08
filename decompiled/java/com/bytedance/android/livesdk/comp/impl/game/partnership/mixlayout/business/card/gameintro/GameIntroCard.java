package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.C1155600gB4;
import X.C13IQ;
import X.C13LE;
import X.InterfaceC1881340z3c;
import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.AbsBaseAssemMixCard;
import com.bytedance.assem.arch.view.UISlotAssem;

/* JADX INFO: loaded from: classes29.dex */
public final class GameIntroCard extends AbsBaseAssemMixCard<GameInfoCardModel> {
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.AbsBaseAssemMixCard
    public final C13IQ<? extends UISlotAssem> LJJJJLI() {
        return C13LE.LIZ(GameIntroCardAssem.class);
    }

    public GameIntroCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
