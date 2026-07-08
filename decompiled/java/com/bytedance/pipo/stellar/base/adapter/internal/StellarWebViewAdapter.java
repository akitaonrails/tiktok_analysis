package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1227904rF;
import X.C1720520usE;
import X.C1720530usF;
import X.C1720680usU;
import X.EnumC1720670usT;
import X.EnumC1720960usw;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarWebViewAdapter extends StellarCardAdapter<C1720530usF> {
    public String LLIZLLLIL;
    public final Map<String, String> LLJ = new LinkedHashMap();

    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter, com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ae2;
    }

    @Override // X.InterfaceC1720230url
    public final String LLFII() {
        return EnumC1720960usw.CARD_WEBVIEW.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        String str;
        Map<String, String> mapYe0;
        super.onViewDetachedFromWindow();
        C1720530usF c1720530usF = (C1720530usF) getItem();
        if (c1720530usF == null || (str = c1720530usF.LL) == null) {
            return;
        }
        InterfaceC1720700usW interfaceC1720700usWR5 = R5();
        if (interfaceC1720700usWR5 == null || (mapYe0 = interfaceC1720700usWR5.Ye0()) == null) {
            mapYe0 = this.LLJ;
        }
        String strRemove = mapYe0.remove(str);
        if (strRemove == null) {
            return;
        }
        IPipoContainerService iPipoContainerService = (IPipoContainerService) PluggableExtentionKt.pluggableSpi$default(IPipoContainerService.class, false, false, false, 14, null);
        if (iPipoContainerService != null) {
            iPipoContainerService.LJIIJJI(strRemove);
        }
        if (Intrinsics.LJFF(this.LLIZLLLIL, strRemove)) {
            this.LLIZLLLIL = null;
        }
    }

    @Override // X.InterfaceC1720230url
    public final InterfaceC1720550usH J2(CardDO cardDO) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String cardData = cardDO.getCardData();
        c1227904rF.getClass();
        WebviewData webviewData = (WebviewData) C1227904rF.LIZIZ(cardData, WebviewData.class);
        String id = cardDO.getId();
        if (id == null) {
            id = "";
        }
        String sectionId = cardDO.getSectionId();
        Map<String, Object> sectionTrackingParams = cardDO.getSectionTrackingParams();
        String type = cardDO.getType();
        if (type == null) {
            type = EnumC1720960usw.CARD_WEBVIEW.getValue();
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
        return new C1720530usF(id, sectionId, sectionTrackingParams, type, height, str, margin, cardPadding, action, background, C1720680usU.LIZ(theme), C1720520usE.LIZ(cardDO, null), cardDO.getLayoutGravity(), webviewData.url);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    @Override // com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(android.view.View r16, X.InterfaceC1720550usH r17) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.adapter.internal.StellarWebViewAdapter.N5(android.view.View, X.0usH):void");
    }
}
