package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C1228650i4t;
import X.C13LE;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC1767506w5;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationConfirmWidgetAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationConfirmWidgetAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCreationConfirmWidgetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 762), AFwS229S0000000_2.get$arr$(469), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 759));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 760));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 761));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cja;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ik
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1228870i5F) obj).LLJILJILJ);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 120), 4);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLJJIJI.getValue();
        appCompatTextView.setText("");
        if (appCompatTextView.getText().length() == 0) {
            C1584506Ih.LIZ(appCompatTextView);
        } else {
            appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
            appCompatTextView.setHighlightColor(0);
            C1584506Ih.LIZIZ(appCompatTextView);
        }
        ((C197039127h) this.LLJJIJIIJIL.getValue()).setEnabled(true);
        C786410Ut5.I7(new AbS700S0100000_19(this, 12), (View) this.LLJJIJIIJIL.getValue());
        LJJIJL().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1767506w5(this, 2));
        C1228650i4t c1228650i4t = ((C1527305yR) this.LLJJI.getValue()).LL.LIZ;
        if (c1228650i4t.LJIJJ) {
            C1584506Ih.LIZIZ((View) this.LLJJIJIL.getValue());
        }
        int i = c1228650i4t.LJIJJLI;
        int i2 = c1228650i4t.LJIL;
        ViewGroup.LayoutParams layoutParams = ((View) this.LLJJIJIIJIL.getValue()).getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            C786410Ut5.J6((C197039127h) this.LLJJIJIIJIL.getValue(), marginLayoutParams);
        }
    }
}
