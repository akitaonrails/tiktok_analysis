package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C197039127h;
import X.C700100RdA;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class AntiAddictionVideoAssem extends BaseCellSlotComponent<AntiAddictionVideoAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b56;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Set<String> set = C700100RdA.LIZ;
        view.setTag(C700100RdA.LJIIIZ, "no_click");
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.vya), new View.OnClickListener() { // from class: X.07wp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ComplianceServiceProvider.LJIIJJI().LJIJI(C1388190mED.LIZ(view2.getContext()), "tab_pop_up_enter_wellbeing");
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
