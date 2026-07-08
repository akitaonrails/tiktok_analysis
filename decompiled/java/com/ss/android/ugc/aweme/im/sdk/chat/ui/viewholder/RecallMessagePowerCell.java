package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import X.C0Y3I;
import X.C0Y3R;
import X.C0YNY;
import X.C0YUT;
import X.C462180IAm;
import X.C603540Nlo;
import X.C869590Y9l;
import X.InterfaceC874680YTa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RecallMessagePowerCell extends AssemPowerCell<RecallMessageReusedUISlotAssem, C462180IAm> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new RecallMessageReusedUISlotAssem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C462180IAm c462180IAm = (C462180IAm) getItem();
        if (c462180IAm == null) {
            return;
        }
        C869590Y9l c869590Y9l = c462180IAm.LL.LIZ;
        if (c869590Y9l.getMessageStatus() != C0YUT.RECALLED || Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_recalled_msg_seen"), "1")) {
            return;
        }
        c869590Y9l.addLocalExt("is_recalled_msg_seen", "1");
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "is_recalled_msg_seen", new C0Y3R("1"), new C0Y3I("recalled message onAttachedToWindow local ext IS_RECALL_SEEN = 1"));
    }
}
