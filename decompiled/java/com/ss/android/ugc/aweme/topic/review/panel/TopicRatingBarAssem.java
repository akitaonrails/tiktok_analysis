package com.ss.android.ugc.aweme.topic.review.panel;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418540Gb6;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRatingBarAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public C418540Gb6 LLJJIII;
    public final AbS691S0100000_9 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicRatingBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicRatingBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1570), AFwS240S0000000_9.get$arr$(655), null, true);
        this.LLJJIJI = new AbS691S0100000_9(this, 35);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fw7;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        C418540Gb6 c418540Gb6 = (C418540Gb6) view.findViewById(R.id.srg);
        this.LLJJIII = c418540Gb6;
        C418540Gb6 c418540Gb62 = null;
        if (c418540Gb6 == null) {
            c418540Gb6 = null;
        }
        c418540Gb6.setRatingValue(0.0f);
        C418540Gb6 c418540Gb63 = this.LLJJIII;
        if (c418540Gb63 != null) {
            c418540Gb62 = c418540Gb63;
        }
        c418540Gb62.setOnStarChanged$topic_release(new AwS588S0100000_9(this, 407));
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OiG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C626430Ohd) obj).LLILZIL);
            }
        }, null, new AwS623S0100000_9(view, 151), 6);
    }
}
