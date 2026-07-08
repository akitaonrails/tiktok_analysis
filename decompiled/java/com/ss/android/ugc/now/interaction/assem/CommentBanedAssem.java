package com.ss.android.ugc.now.interaction.assem;

import X.C786410Ut5;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentBanedAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        if (ComplianceServiceProvider.LJFF().LIZJ(3)) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        } else {
            if (LJJIJL().getVisibility() != 0) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }
}
