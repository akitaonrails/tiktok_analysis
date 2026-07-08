package com.ss.android.ugc.aweme.poi.mapmode.viewmodel;

import X.C1174450gfT;
import X.C1174920ggE;
import X.C1174940ggG;
import X.C15438062q;
import X.C1697810uHb;
import X.C20642515q3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeFilterVM extends AssemViewModel<C1174940ggG> {
    public String LL;
    public C1174450gfT LLILLJJLI;

    public static List vQ2() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(500, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE), 5000, 10000);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            arrayList.add(iIntValue < 1000 ? new C1174920ggE(String.valueOf(iIntValue), C786410Ut5.j4(C20642515q3.LJI(2131845963), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)), false, false) : new C1174920ggE(String.valueOf(iIntValue), C786410Ut5.j4(C20642515q3.LJI(2131845964), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue / LSPassThroughRecordSizeConfig.DEFAULT)}, 1)), false, false));
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1174940ggG(0);
    }
}
