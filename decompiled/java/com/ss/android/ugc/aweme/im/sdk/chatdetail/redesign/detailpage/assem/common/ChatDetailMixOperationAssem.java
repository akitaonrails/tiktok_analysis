package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C06WA;
import X.C127K;
import X.C1509305vX;
import X.C426750GoL;
import X.C786410Ut5;
import X.EnumC1695106kP;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot.BotDetailMixOperationAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatDetailMixOperationAssem extends UISlotAssem {
    public final Map<C06WA, C127K> LLJJI = new LinkedHashMap();
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS546S0100000_2(this, 568));
    public final C01GW LLJJIJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 570));
    public final C01GW LLJJIJIIJIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 571));
    public final C01GW LLJJIJIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 569));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnp;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        getContentView().setBackground(null);
        int i = 0;
        C426750GoL.LJIIIZ(getContentView(), 0, 0, 0, null, false, 24);
        BotDetailMixOperationAssem botDetailMixOperationAssem = (BotDetailMixOperationAssem) this;
        botDetailMixOperationAssem.ip((C127K) botDetailMixOperationAssem.LLJJIII.getValue(), (EnumC1695106kP) botDetailMixOperationAssem.LLJJJIL.getValue());
        botDetailMixOperationAssem.ip((C127K) botDetailMixOperationAssem.LLJJIJI.getValue(), (EnumC1695106kP) botDetailMixOperationAssem.LLJJJJ.getValue());
        botDetailMixOperationAssem.ip((C127K) botDetailMixOperationAssem.LLJJIJIIJIL.getValue(), (EnumC1695106kP) botDetailMixOperationAssem.LLJJJJJIL.getValue());
        botDetailMixOperationAssem.ip((C127K) botDetailMixOperationAssem.LLJJIJIL.getValue(), (EnumC1695106kP) botDetailMixOperationAssem.LLJJJJLIIL.getValue());
        View contentView = getContentView();
        if (((View) this.LLJJIII.getValue()).getVisibility() != 0 && ((View) this.LLJJIJI.getValue()).getVisibility() != 0 && ((View) this.LLJJIJIIJIL.getValue()).getVisibility() != 0 && ((View) this.LLJJIJIL.getValue()).getVisibility() != 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
    }
}
