package com.ss.android.ugc.aweme.aiportrait.detail.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AIPortraitDetailDescAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIPortraitDetailDescAssem.class, "detailVM", "getDetailVM()Lcom/ss/android/ugc/aweme/aiportrait/detail/model/AIPortraitDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIPortraitDetailDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIPortraitDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 61), AFwS240S0000000_9.get$arr$(57), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ftm;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view, layoutParams);
        lp(view, null);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OjV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OCY) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 20), 14, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0238 A[PHI: r14
      0x0238: PHI (r14v1 com.ss.android.ugc.aweme.aiportrait.detail.model.TemplateAuthor) = 
      (r14v0 com.ss.android.ugc.aweme.aiportrait.detail.model.TemplateAuthor)
      (r14v3 com.ss.android.ugc.aweme.aiportrait.detail.model.TemplateAuthor)
      (r14v3 com.ss.android.ugc.aweme.aiportrait.detail.model.TemplateAuthor)
     binds: [B:39:0x0225, B:41:0x022f, B:43:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(android.view.View r23, com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel r24) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.assem.AIPortraitDetailDescAssem.lp(android.view.View, com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel):void");
    }
}
