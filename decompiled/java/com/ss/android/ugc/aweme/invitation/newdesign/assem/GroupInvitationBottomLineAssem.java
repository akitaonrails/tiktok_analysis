package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.AbstractC1230540i7w;
import X.AnonymousClass0398;
import X.C019F;
import X.C01GW;
import X.C1230720i8E;
import X.C13LE;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.GroupInvitation;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationBottomLineAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, AbstractC1230540i7w.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1573));
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationBottomLineAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationBottomLineAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1574), AFwS257S0000000_19.get$arr$(216), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1571));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1572));
    }

    public final GroupInvitationVM Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (GroupInvitationVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object objLJIIIIZZ;
        super.onViewCreated(view);
        GroupInvitation groupInvitation = (GroupInvitation) this.LLJ.getValue();
        if (groupInvitation != null) {
            if (Go().wQ2()) {
                String str = groupInvitation.inviterName;
                long j = groupInvitation.inviterId;
                SpannableString spannableString = new SpannableString(LJJIJL().getContext().getString(2131831345, str));
                AnonymousClass0398.LIZ(spannableString, Collections.singletonList(str), null, getContext(), Collections.singletonList(new C1230720i8E(this, j)));
                TextView textView = (TextView) this.LLJIJIL.getValue();
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
                textView.setText(spannableString);
                TextView textView2 = (TextView) this.LLJILJIL.getValue();
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setHighlightColor(0);
                textView2.setText(spannableString);
                objLJIIIIZZ = C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0i8F
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1230460i7o) obj).LLJIJIL;
                    }
                }, null, new AwS633S0100000_19(this, 227), 6);
            } else {
                C1584506Ih.LIZ((View) this.LLJILJIL.getValue());
                C1584506Ih.LIZ((View) this.LLJIJIL.getValue());
                objLJIIIIZZ = Unit.LIZ;
            }
            if (objLJIIIIZZ != null) {
                return;
            }
        }
        C1584506Ih.LIZ((View) this.LLJILJIL.getValue());
        C1584506Ih.LIZ((View) this.LLJIJIL.getValue());
    }
}
