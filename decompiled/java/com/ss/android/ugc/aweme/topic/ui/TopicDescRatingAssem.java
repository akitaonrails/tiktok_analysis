package com.ss.android.ugc.aweme.topic.ui;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C418540Gb6;
import X.C639090P4x;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicDescRatingAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public C418540Gb6 LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicDescRatingAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicDescRatingAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1576), AFwS240S0000000_9.get$arr$(657), null, true);
        this.LLJJIJIL = true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fvy;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        this.LLJJIII = (C418540Gb6) view.findViewById(R.id.srg);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.srz);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.srj);
        C418540Gb6 c418540Gb6 = this.LLJJIII;
        C418540Gb6 c418540Gb62 = null;
        if (c418540Gb6 == null) {
            c418540Gb6 = null;
        }
        c418540Gb6.setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C418540Gb6 c418540Gb63 = this.LLJJIII;
        if (c418540Gb63 == null) {
            c418540Gb63 = null;
        }
        c418540Gb63.setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        C418540Gb6 c418540Gb64 = this.LLJJIII;
        if (c418540Gb64 != null) {
            c418540Gb62 = c418540Gb64;
        }
        c418540Gb62.setRatingEnableTouch(false);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Oha
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C626430Ohd) obj).LLILZ);
            }
        }, null, new AwS623S0100000_9(view, 152), 6);
        AssemViewModel value = this.LLJJI.getValue();
        selectSubscribe(value, new C2217381BqS() { // from class: X.0OhZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C626430Ohd) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.0Ohb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C626430Ohd) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0Ohc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C626430Ohd) obj).LLILLL);
            }
        }, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C639090P4x(this, 3));
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 91), view);
    }
}
