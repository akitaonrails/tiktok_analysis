package com.ss.android.ugc.aweme.tako.botpage.components.botmarket;

import X.C01GW;
import X.C0H5X;
import X.C0H5Z;
import X.C0ID0;
import X.C0IDT;
import X.C12P4;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LP;
import X.C1558520qew;
import X.C1858110yS9;
import X.C2097608Jq;
import X.C2441009hQ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoBotMarketHubAssem extends ReusedUISlotAssem<TakoBotMarketHubAssem> implements InterfaceC712990Rxx<C0H5X> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 733));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 732));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 729));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 731));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 730));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fk6;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0H5X c0h5x) {
        String str;
        Map<String, String> mapLJ;
        String str2;
        int color;
        List<TakoBotInfo> list;
        TakoBotInfo takoBotInfo;
        String str3;
        C0H5X c0h5x2 = c0h5x;
        BotMarketInfo botMarketInfoLJLLLL = c0h5x2.LJLLLL();
        if (botMarketInfoLJLLLL == null || (str = botMarketInfoLJLLLL.backgroundUrl) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
        c1331670kl3LJI.LJJIJL(getContext());
        c1331670kl3LJI.LJJ((SmartImageView) this.LLJLIL.getValue());
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        View view = (View) this.LLJLIL.getValue();
        BotMarketInfo botMarketInfoLJLLLL2 = c0h5x2.LJLLLL();
        String str4 = null;
        if (botMarketInfoLJLLLL2 != null) {
            str2 = botMarketInfoLJLLLL2.backgroundUrl;
        } else {
            str2 = null;
        }
        c1331670kl3LJI.LJJJIL = new C1338340kvo(view, "TakoBotMarketHub", str2, mapLJ);
        c1331670kl3LJI.LJIIJ(new C0ID0(3));
        C786410Ut5.I7(new AkS52S0200000_6(this, c0h5x2, 13), (View) this.LLJLIL.getValue());
        ((View) this.LLJLIL.getValue()).setOnLongClickListener(new C0IDT(this, 3));
        BotMarketInfo botMarketInfoLJLLLL3 = c0h5x2.LJLLLL();
        if (botMarketInfoLJLLLL3 != null && (str3 = botMarketInfoLJLLLL3.bgThemeColor) != null) {
            color = ColorProtector.parseColor(str3);
        } else {
            color = 0;
        }
        float[] fArr = {0.0f, 0.0f, 0.25f};
        C2441009hQ.LIZIZ(Color.red(color), Color.green(color), Color.blue(color), fArr);
        int iLIZ = C2441009hQ.LIZ(fArr);
        ((C12P4) this.LLJLILLLLZIIL.getValue()).setShadeColor(iLIZ);
        View contentView = getContentView();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(iLIZ);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        contentView.setBackground(c384050F3z.LIZ(getContentView().getContext()));
        C0H5Z c0h5z = (C0H5Z) this.LLJLL.getValue();
        BotMarketInfo botMarketInfoLJLLLL4 = c0h5x2.LJLLLL();
        if (botMarketInfoLJLLLL4 != null && (list = botMarketInfoLJLLLL4.bots) != null && (takoBotInfo = (TakoBotInfo) C13LP.LJJJLL(list)) != null) {
            Context context = c0h5z.getContext();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            View view2 = (View) this.LLJLL.getValue();
            String strLJLIIIL = c0h5x2.LJLIIIL();
            BotMarketInfo botMarketInfoLJLLLL5 = c0h5x2.LJLLLL();
            if (botMarketInfoLJLLLL5 != null) {
                str4 = botMarketInfoLJLLLL5.bgThemeColor;
            }
            c0h5z.LIZ(C1858110yS9.LIZIZ(takoBotInfo, context, interfaceC665370Q7zLJIIL, view2, strLJLIIIL, str4, 33, false, 64));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0H5X c0h5x) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0H5X c0h5x) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
