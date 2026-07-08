package com.ss.android.ugc.aweme.share.handler;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C11S5;
import X.C1366550lfJ;
import X.C1374720lsU;
import X.C13LE;
import X.C1701940uOG;
import X.C23260099m;
import X.C571830Mbl;
import X.C621180OYa;
import X.DialogC1389620mGW;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import Y.AfS113S0300000_21;
import Y.AkS482S0100000_21;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class TTShareDefaultHandler<T extends BaseSharePackage> extends BaseChannelShareHandler<BaseSharePackage> {
    public final Context LL;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public InterfaceC1371340ln2 LJFF() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        return new String[0];
    }

    public TTShareDefaultHandler(Context context) {
        this.LL = context;
        C13LE.LIZ(BaseSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public Object LJIIIZ(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LL);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        if (C1366550lfJ.LIZ(interfaceC1369790lkX.key())) {
            C571830Mbl.LIZIZ(dialogC1389620mGW);
        }
        C1374720lsU.LJ(baseSharePackage.url, baseSharePackage.itemType, interfaceC1369790lkX.key(), baseSharePackage, 4).LJIIJ(new AkS482S0100000_21(baseSharePackage, 8)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS113S0300000_21(interfaceC1369790lkX, dialogC1389620mGW, c23260099m, 4));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return true;
    }
}
