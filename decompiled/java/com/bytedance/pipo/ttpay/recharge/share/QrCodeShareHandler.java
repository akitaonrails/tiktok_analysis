package com.bytedance.pipo.ttpay.recharge.share;

import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.content.Context;
import android.view.View;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareHandler;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeShareHandler<T extends BaseSharePackage> extends BaseChannelShareHandler<T> {
    public final Function1<Boolean, Unit> LL;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIIZ(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2(this) { // from class: X.0lmv
            public final /* synthetic */ QrCodeShareHandler<BaseSharePackage> LIZ;

            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                this.LIZ.LL.invoke(Boolean.TRUE);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
                this.LIZ.LL.invoke(Boolean.FALSE);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QrCodeShareHandler(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final ShareContentType[] LJIIIIZZ(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        return new ShareContentType[]{ShareContentType.PHOTO};
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        return new String[]{String.valueOf(baseSharePackage.extras.getString("extra_qr_code_path", ""))};
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }
}
