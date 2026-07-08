package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697806kq;
import X.C19212010Ec;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C300860Bqm;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C885310YoD;
import X.C885630Yoj;
import X.C914210Ztj;
import X.InterfaceC2217461Bqa;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestBottomContainerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 287));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 286));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 285));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 284));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 288));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 283));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 289));
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestBottomContainerAssem.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestBottomContainerAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MessageRequestBottomContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 290), AFwS248S0000000_14.get$arr$(85), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 291), AFwS248S0000000_14.get$arr$(86), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.csa;
    }

    public final View hp() {
        View view = new View(LJJIJL().getContext());
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
        C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 16);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        return view;
    }

    public final TuxTextView ip() {
        TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 16);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(42);
        return tuxTextView;
    }

    public final TuxTextView kp() {
        return (TuxTextView) this.LLJJIJIL.getValue();
    }

    public final TuxTextView lp() {
        return (TuxTextView) this.LLJJJIL.getValue();
    }

    public final BaseMessageRequestListVM mp() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJJJLIIL;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C885630Yoj.LIZIZ()) {
            C337180DJs.LIZJ((View) this.LLJJIII.getValue());
            TuxTextView tuxTextView = (TuxTextView) this.LLJJIJI.getValue();
            if (tuxTextView != null) {
                String string = tuxTextView.getContext().getString(2131846454);
                C1697806kq.LIZ(tuxTextView);
                String string2 = tuxTextView.getContext().getString(2131846453);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append('\n');
                sbLIZ.append(string2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                C1697806kq.LIZJ(spannableStringBuilder, string2, 71, new AwS593S0100000_14(this, 380));
                tuxTextView.setText(spannableStringBuilder);
                C885310YoD.LIZ.getClass();
                C885310YoD.LJJIIZ("show");
            }
            ViewGroup viewGroup = (ViewGroup) this.LLJJIJIIJIL.getValue();
            if (viewGroup != null) {
                viewGroup.addView(lp());
                viewGroup.addView(hp());
                viewGroup.addView((View) this.LLJJJ.getValue());
                viewGroup.addView(hp());
                viewGroup.addView(kp());
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.LLJJIJIIJIL.getValue();
            if (viewGroup2 != null) {
                viewGroup2.addView(kp());
                viewGroup2.addView(hp());
                viewGroup2.addView(lp());
                if (C19212010Ec.LIZJ.LJ()) {
                    viewGroup2.addView(hp());
                    viewGroup2.addView((View) this.LLJJJ.getValue());
                }
            }
        }
        selectSubscribe(mp(), new C2217381BqS() { // from class: X.0Ysq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Ysr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0Ysp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LL;
            }
        }, C736820SvI.LIZLLL(), null, new C914210Ztj(this, 1));
    }
}
