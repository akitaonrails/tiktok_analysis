package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot;

import X.AnonymousClass0629;
import X.C0ZR2;
import X.C0ZR3;
import X.C1668706g9;
import X.C1954807lC;
import X.C2188811AlT;
import X.C869590Y9l;
import X.C899630ZQz;
import X.C914160Zte;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final class FeedbackViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final Set<String> LL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(4);
    }

    public static void vQ2(C869590Y9l c869590Y9l, C0ZR2 c0zr2, boolean z) {
        int i = C899630ZQz.LIZ[c0zr2.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
                C0ZR3 feedbackService = C1668706g9.LIZ(c1668706g9).getFeedbackService();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feedback_bot_");
                sbLIZ.append(c869590Y9l.getUuid());
                feedbackService.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C1668706g9.LIZ(c1668706g9).getFeedbackService().LIZJ(c869590Y9l, z);
                return;
            }
            throw new C1954807lC();
        }
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LJJI(c869590Y9l.getUuid());
    }
}
