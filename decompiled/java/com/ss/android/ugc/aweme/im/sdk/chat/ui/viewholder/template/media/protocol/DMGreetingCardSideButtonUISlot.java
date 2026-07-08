package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C019F;
import X.C01GW;
import X.C0IBH;
import X.C0ZDX;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1584506Ih;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C461300I7c;
import X.C462510IBt;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS117S0200000_14;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.experiment.IMOperateBtnColorAB;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DMGreetingCardSideButtonUISlot extends ReusedSkeletonUISlotAssem<DMGreetingCardSideButtonUISlot, MessageLeftIconState> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DMGreetingCardSideButtonUISlot.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cnm;
    }

    public DMGreetingCardSideButtonUISlot() {
        super(C462510IBt.LIZ);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GreetingCardViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 975), null, AFwS248S0000000_14.get$arr$(269));
        this.LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 974));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 973));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) this.LLJLLL.getValue();
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        C0IBH c0ibh;
        TextView textView;
        GreetingCardInfoComponent greetingCardInfoComponentLJI = C0ZDX.LJI(c869590Y9l);
        if (greetingCardInfoComponentLJI != null && (c0ibh = greetingCardInfoComponentLJI.status) != null && !C461300I7c.LIZIZ(c869590Y9l, c0ibh)) {
            if (IMOperateBtnColorAB.INSTANCE.isEnabled() && (textView = (TextView) LJJIJL().findViewById(R.id.pnq)) != null) {
                textView.setTextColor(C1383370m6R.LJFF(R.attr.a1j));
            }
            C1584506Ih.LIZIZ((View) this.LLJZ.getValue());
            C786410Ut5.h9((TuxTextView) this.LLJZ.getValue(), new ACListenerS117S0200000_14(this, c869590Y9l, 23));
            return;
        }
        C1584506Ih.LIZ((View) this.LLJZ.getValue());
    }
}
