package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C2211631BhB;
import X.C452501pT;
import X.C786410Ut5;
import X.C869590Y9l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.experiment.IMOperateBtnColorAB;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.QuickLiveReact;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS498S0200000_6;

/* JADX INFO: loaded from: classes15.dex */
public final class DMAwemeSideMessageStatusReusedSkeletonUISlot extends SideMessageStatusReusedSkeletonUISlot {
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 962));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 963));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 961));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 965));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 964));

    public final View Jp() {
        return (View) this.LLLILZLLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        super.Ap(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.t7q);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            C786410Ut5.W5(viewStub, layoutParams);
            viewStub.setLayoutResource(R.layout.cgr);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot
    /* JADX INFO: renamed from: Gp */
    public final void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        super.tp(c869590Y9l, messageLeftIconState);
        if (Intrinsics.LJFF(messageLeftIconState, QuickLiveReact.INSTANCE)) {
            C786410Ut5.I7(new AbS498S0200000_6(this, c869590Y9l, 5), Jp());
            C786410Ut5.LJLLLLLL(0, (View) this.LLLILZ.getValue());
            if (IMOperateBtnColorAB.INSTANCE.isEnabled()) {
                ((TuxIconView) this.LLLIZZ.getValue()).setTintColorRes(R.attr.a1j);
                ((TuxTextView) this.LLLJ.getValue()).setTextColorRes(R.attr.a1j);
            }
            C2211631BhB.LIZJ(getContentView(), new AbstractC2211791BhR(this) { // from class: X.0ZaM
                public final C914000ZtO LJ;
                public final float LJFF = 1.0f;

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJFF;
                }

                {
                    this.LJ = new C914000ZtO(this, 5);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final /* bridge */ /* synthetic */ void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        tp(c869590Y9l, messageLeftIconState);
    }
}
