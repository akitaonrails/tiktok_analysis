package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiCampaignShareHandler extends TTShareDefaultHandler<PoiCampaignSharePackage> {
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        return new String[0];
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2() { // from class: X.0OZd
            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
            }
        };
    }

    public PoiCampaignShareHandler(Context context) {
        super(context);
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIIZ(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return baseSharePackage.extras.getString("short_url");
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }
}
