package com.ss.android.ugc.aweme.publicgroup.view;

import X.C019F;
import X.C01GW;
import X.C1157140gDY;
import X.C1164420gPI;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13LE;
import X.C1637806bA;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337180DJs;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C895630ZBp;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.vm.IMWhoCanJoinVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS499S0200000_7;

/* JADX INFO: loaded from: classes19.dex */
public final class IMWhoCanJoinCellAssem extends ReusedUISlotAssem<IMWhoCanJoinCellAssem> implements InterfaceC712990Rxx<C1157140gDY> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMWhoCanJoinCellAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/IMWhoCanJoinVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMWhoCanJoinCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMWhoCanJoinVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2183), null, AFwS256S0000000_18.get$arr$(738));
        this.LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2184));
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2180));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2182));
        this.LLJLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2181));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cj0;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final IMWhoCanJoinVM op() {
        return (IMWhoCanJoinVM) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 120), LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1157140gDY c1157140gDY) {
        String str;
        String strLIZIZ;
        int i;
        Integer numLIZJ;
        GroupAccessCriteria groupAccessCriteria;
        C1157140gDY c1157140gDY2 = c1157140gDY;
        op().getClass();
        GroupAccessCriteriaCollection groupAccessCriteriaCollection = c1157140gDY2.LL;
        C1164420gPI c1164420gPILJII = null;
        if (!groupAccessCriteriaCollection.hasMultipleAccessCriteria || (groupAccessCriteria = groupAccessCriteriaCollection.selectedAccessCriteria) == null || (str = groupAccessCriteria.description) == null) {
            str = "";
        }
        TextView textView = (TextView) this.LLJL.getValue();
        if (str.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1157140gDY2.LL.name);
            sbLIZ.append(" · ");
            sbLIZ.append((Object) str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c1157140gDY2.LL.name;
        }
        textView.setText(strLIZIZ);
        op().getClass();
        if (c1157140gDY2.LL.accessCriteriaSetting.size() > 1) {
            C786410Ut5.I7(new AbS499S0200000_7(this, c1157140gDY2, 0), (View) this.LLJLIL.getValue());
            C337180DJs.LIZJ((View) this.LLJLIL.getValue());
        } else {
            C337180DJs.LIZ((View) this.LLJLIL.getValue());
        }
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null) {
            c1164420gPILJII = iMFoundationBridgeApiLIZ.LJII(LJJIJL().getContext(), c1157140gDY2.LL.accessCriteriaIcon);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJLL.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (c1164420gPILJII != null) {
            i = c1164420gPILJII.LIZ;
        } else {
            i = 0;
        }
        c419910GdJ.LIZ = i;
        if (c1164420gPILJII == null || (numLIZJ = c1164420gPILJII.LIZIZ) == null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, C1383370m6R.LIZ);
        }
        c419910GdJ.LIZLLL = numLIZJ;
        tuxIconView.setTuxIcon(c419910GdJ);
        ((View) this.LLJLILLLLZIIL.getValue()).setClickable(false);
        ((C1841350y17) this.LLJLILLLLZIIL.getValue()).setChecked(c1157140gDY2.LLILLJJLI);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1157140gDY c1157140gDY) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1157140gDY c1157140gDY) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
