package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm;

import X.C01DP;
import X.C01GW;
import X.C049900Gb;
import X.C0IJT;
import X.C13LP;
import X.C1559260qg8;
import X.C1817990xPR;
import X.C1818000xPS;
import X.C1818010xPT;
import X.C1818020xPU;
import X.C1818030xPV;
import X.C1818040xPW;
import X.C229100uX;
import X.C452501pT;
import X.C474500IjA;
import X.InterfaceC0148002o;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class FullyCustomizedBoardEditPageViewModel extends AssemViewModel<C1817990xPR> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C01DP.class, (Class<Object>) "FullCustomizedBoardHierarchyData", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1818020xPU(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1817990xPR(0);
    }

    public final C01DP wQ2() {
        return (C01DP) this.LL.getValue();
    }

    public final void vQ2() {
        boolean z = true;
        if (wQ2().LLILLL != 8 && (!wQ2().LIZ() ? ((BoardItem) this.LLILLJJLI.getValue()).fullyCustomizedContent.length() <= 0 || a0.LJLIIIL(((BoardItem) this.LLILLJJLI.getValue()).fullyCustomizedContent).toString().length() <= 0 : wQ2().LLILLJJLI.length() <= 0 || a0.LJLIIIL(wQ2().LLILLJJLI).length() <= 0)) {
            z = false;
        }
        setState(new C1818000xPS(z));
    }

    public final void xQ2() {
        if (wQ2().LIZ()) {
            RichTextContent richTextContent = ((BoardItem) this.LLILLJJLI.getValue()).richTextContent;
            if (richTextContent != null) {
                C229100uX c229100uX = (C229100uX) C13LP.LJJJLZIJ(0, new C049900Gb(richTextContent).LIZ().LIZ);
                SpannableStringBuilder spannableStringBuilderLIZ = c229100uX != null ? c229100uX.LIZ() : new SpannableStringBuilder();
                wQ2().LLILLJJLI = spannableStringBuilderLIZ;
                vQ2();
                setState(new C1818030xPV(spannableStringBuilderLIZ));
            }
        } else {
            setState(new C1818040xPW(((BoardItem) this.LLILLJJLI.getValue()).fullyCustomizedContent));
        }
        vQ2();
    }

    public final void yQ2(boolean z) {
        setState(new C1818010xPT(z));
        if (wQ2().LIZ() && !z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_text_item_editing_page");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(wQ2().LLILZ, "decoration_entrance");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII("close", "click_position");
            c474500IjALIZ.LIZ();
        }
    }
}
