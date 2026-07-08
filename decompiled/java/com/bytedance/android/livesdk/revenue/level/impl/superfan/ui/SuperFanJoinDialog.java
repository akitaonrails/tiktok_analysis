package com.bytedance.android.livesdk.revenue.level.impl.superfan.ui;

import X.C1143680frq;
import X.C19EH;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFanJoinDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDHELIOSk2JGslJD8/ZjY5OSohLiQiZzo6ZhY5OSohDiQiAyA6JgElKCM8Lw==";
    public SuperFanViewModel LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public String LLJLLL = "";
    public final int LLLF = (int) C497740JfY.LIZIZ(12.0f);

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new AbS689S0100000_7(this, 16), view.findViewById(R.id.hof));
        C786410Ut5.I7(new AbS689S0100000_7(this, 17), view.findViewById(R.id.bmy));
        C1143680frq.LIZLLL(view.findViewById(R.id.npq), "tiktok_live_fans_club_join_dialog", "ttlive_logo_super_fan.png");
        this.LLJZIJLIL = view.findViewById(R.id.npq);
        this.LLL = view.findViewById(R.id.title);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        SuperFanJoinFragment superFanJoinFragment = new SuperFanJoinFragment();
        superFanJoinFragment.LL = this.LLJLLL;
        superFanJoinFragment.LLILLJJLI = this.LLJZ;
        superFanJoinFragment.LLLLZLL(true);
        c19ehLJIIJ.LIZIZ(R.id.iiv, superFanJoinFragment);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gc1, viewGroup, false);
    }
}
