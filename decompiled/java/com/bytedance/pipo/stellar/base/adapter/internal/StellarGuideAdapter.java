package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1227904rF;
import X.C1720520usE;
import X.C1720560usI;
import X.C1720680usU;
import X.C1720760usc;
import X.C1720820usi;
import X.EnumC1720670usT;
import X.EnumC1720960usw;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import android.view.View;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarGuideAdapter extends StellarCardAdapter<C1720560usI> {
    public final C1720820usi LLIZLLLIL = new C1720820usi();

    @Override // X.InterfaceC1720230url
    public final String LLFII() {
        return EnumC1720960usw.CARD_GUIDE.getValue();
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        this.LLIZLLLIL.getClass();
        return R.layout.adr;
    }

    @Override // X.InterfaceC1720230url
    public final InterfaceC1720550usH J2(CardDO cardDO) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String cardData = cardDO.getCardData();
        c1227904rF.getClass();
        GuideDO guideDO = (GuideDO) C1227904rF.LIZIZ(cardData, GuideDO.class);
        String id = cardDO.getId();
        if (id == null) {
            id = "";
        }
        String sectionId = cardDO.getSectionId();
        Map<String, Object> sectionTrackingParams = cardDO.getSectionTrackingParams();
        String type = cardDO.getType();
        if (type == null) {
            type = EnumC1720960usw.CARD_GUIDE.getValue();
        }
        String height = cardDO.getHeight();
        String str = "-2";
        if (height == null) {
            height = "-2";
        }
        String width = cardDO.getWidth();
        if (width != null) {
            str = width;
        }
        MarginDO margin = cardDO.getMargin();
        MarginDO cardPadding = cardDO.getCardPadding();
        StellarActionDO action = cardDO.getAction();
        BackgroundDO background = cardDO.getBackground();
        C1720680usU c1720680usU = EnumC1720670usT.Companion;
        String theme = cardDO.getTheme();
        c1720680usU.getClass();
        return new C1720560usI(id, sectionId, sectionTrackingParams, type, height, str, margin, cardPadding, action, background, C1720520usE.LIZ(cardDO, null), C1720680usU.LIZ(theme), cardDO.getLayoutGravity(), guideDO, 0);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    public final void N5(View view, InterfaceC1720550usH interfaceC1720550usH) {
        C1720760usc c1720760uscKa1;
        C1720560usI c1720560usI = (C1720560usI) interfaceC1720550usH;
        C1720820usi c1720820usi = this.LLIZLLLIL;
        InterfaceC1720700usW interfaceC1720700usWR5 = R5();
        if (interfaceC1720700usWR5 != null) {
            c1720760uscKa1 = interfaceC1720700usWR5.Ka1();
        } else {
            c1720760uscKa1 = null;
        }
        c1720820usi.LL = c1720760uscKa1;
        GuideDO guideDO = c1720560usI.LLJILLL;
        if (guideDO != null) {
            this.LLIZLLLIL.LJFF(view, guideDO, null);
        }
        this.LLIZLLLIL.LLILZ = new AwS392S0200000_26(this, c1720560usI, 150);
    }
}
