package com.ss.android.ugc.aweme.tako.botpage.components.botmarket;

import X.C01GW;
import X.C0H5X;
import X.C0IDG;
import X.C0Q4Y;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C15438062q;
import X.C1558520qew;
import X.C1858110yS9;
import X.C20600815jK;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.botpage.components.botmarket.marketitem.TakoMarketBotItemPowerCell;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoBotMarketListAssem extends ReusedUISlotAssem<TakoBotMarketListAssem> implements InterfaceC712990Rxx<C0H5X> {
    public C0H5X LLJLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 734));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 735));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 736));
    public final C0IDG LLJLL = new C0IDG(6);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fk7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        powerList.LJIILJJIL(TakoMarketBotItemPowerCell.class);
        powerList.addItemDecoration(this.LLJLL);
        powerList.getState().LIZLLL = C0Q4Y.BUFFER;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0H5X c0h5x) {
        BotMarketInfo botMarketInfoLJLLLL;
        BotMarketInfo botMarketInfoLJLLLL2;
        List<TakoBotInfo> list;
        String str;
        Map<String, String> mapLJ;
        int iLIZIZ;
        String str2;
        C0H5X c0h5x2 = c0h5x;
        C0H5X c0h5x3 = this.LLJLIL;
        String str3 = null;
        if (c0h5x3 != null) {
            botMarketInfoLJLLLL = c0h5x3.LJLLLL();
        } else {
            botMarketInfoLJLLLL = null;
        }
        if (!Intrinsics.LJFF(botMarketInfoLJLLLL, c0h5x2.LJLLLL()) && (botMarketInfoLJLLLL2 = c0h5x2.LJLLLL()) != null && (list = botMarketInfoLJLLLL2.bots) != null) {
            getPowerList().getState().LJFF(null);
            boolean z = true;
            if (list.size() != 1) {
                z = false;
            }
            C20600815jK<InterfaceC1891350zJl> state = getPowerList().getState();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TakoBotInfo takoBotInfo : list) {
                Context context = getContext();
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
                String strLJLIIIL = c0h5x2.LJLIIIL();
                BotMarketInfo botMarketInfoLJLLLL3 = c0h5x2.LJLLLL();
                if (botMarketInfoLJLLLL3 != null) {
                    str2 = botMarketInfoLJLLLL3.bgThemeColor;
                } else {
                    str2 = null;
                }
                arrayList.add(C1858110yS9.LIZIZ(takoBotInfo, context, interfaceC665370Q7zLJIIL, powerList, strLJLIIIL, str2, 0, !z, 32));
            }
            state.LIZLLL(arrayList, null);
            BotMarketInfo botMarketInfoLJLLLL4 = c0h5x2.LJLLLL();
            if (botMarketInfoLJLLLL4 == null || (str = botMarketInfoLJLLLL4.fuzzyIconUrl) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            c1331670kl3LJI.LJJIJL(getContext());
            c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI.LJJ((SmartImageView) this.LLJJLIIIJLLLLLLLZ.getValue());
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLILLLLZIIL.getValue();
            if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            View view = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
            BotMarketInfo botMarketInfoLJLLLL5 = c0h5x2.LJLLLL();
            if (botMarketInfoLJLLLL5 != null) {
                str3 = botMarketInfoLJLLLL5.fuzzyIconUrl;
            }
            c1331670kl3LJI.LJJJIL = new C1338340kvo(view, "TakoBotMarketList", str3, mapLJ);
            C786410Ut5.h3(c1331670kl3LJI);
            if (z) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            getPowerList().setPadding(getPowerList().getPaddingLeft(), getPowerList().getPaddingTop(), getPowerList().getPaddingRight(), iLIZIZ);
            this.LLJLIL = c0h5x2;
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
