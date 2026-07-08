package com.ss.android.ugc.aweme.topic.review.vm;

import X.C626430Ohd;
import X.C626700Oi4;
import X.C626710Oi5;
import X.C626730Oi7;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReviewVM extends AssemViewModel<C626430Ohd> {
    public String LL = "";
    public int LLILLJJLI = 1;
    public final Map<String, String> LLILLL = new LinkedHashMap();
    public final C626700Oi4 LLILZ = new C626700Oi4();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C626430Ohd(0);
    }

    public final void vQ2(Integer num, String str) {
        C626710Oi5.LIZ(C626710Oi5.LIZ, (String) ((LinkedHashMap) this.LLILLL).get("enter_method"), (String) ((LinkedHashMap) this.LLILLL).get("previous_page"), C626730Oi7.LIZ(this.LLILLJJLI), this.LL, (String) ((LinkedHashMap) this.LLILLL).get("topic_title"), num, str, 257);
    }
}
