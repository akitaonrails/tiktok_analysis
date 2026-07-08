package com.bytedance.android.livesdk.grouplive.inroomranking.panel;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AnonymousClass0207;
import X.C019F;
import X.C020Z;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2872019i;
import X.C5182020e;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC512201z6;
import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.items.PanelRankingCell;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveRankingPanelAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupLiveRankingPanelAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/grouplive/inroomranking/panel/GroupLiveRankingPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupLiveRankingPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupLiveRankingPanelViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 92), AnonymousClass0207.get$arr$(25), null, true);
    }

    public final GroupLiveRankingPanelViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (GroupLiveRankingPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC21674919sB abstractC21674919sB;
        int iIntValue;
        ViewGroup viewGroup;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(250L);
            layoutTransition.enableTransitionType(4);
            viewGroup.setLayoutTransition(layoutTransition);
        }
        TextView textView = (TextView) view.findViewById(R.id.j7p);
        if (textView != null) {
            Integer numLIZ = C2872019i.LIZ(R.attr.ezq, textView.getContext());
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = -592138;
            }
            textView.setTextColor(iIntValue);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.j7n);
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PanelRankingCell.class);
            AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv2.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
            viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv2;
        }
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        View viewFindViewById = view.findViewById(R.id.j7o);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 59), viewFindViewById);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0197
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AnonymousClass0190) obj).LL;
            }
        }, null, new C020Z(view, this, 12), 6);
    }
}
