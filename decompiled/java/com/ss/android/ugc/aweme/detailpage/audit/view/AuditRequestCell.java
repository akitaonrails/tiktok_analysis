package com.ss.android.ugc.aweme.detailpage.audit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0HZQ;
import X.C0ZK1;
import X.C0ZKF;
import X.C1217970hnf;
import X.C1218000hni;
import X.C1218180ho0;
import X.C123100dR;
import X.C13LE;
import X.C1584506Ih;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestCell extends PowerCell<C1218000hni> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1005));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1003));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1018));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1008));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, LSPassThroughRecordSizeConfig.DEFAULT));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1007));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1001));
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuditRequestCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/audit/viewmodel/AuditRequestListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AuditRequestCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuditRequestListViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1024);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(144);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1006), awS563S0100000_19, AFwS207S0000000_19.get$arr$(96), new AwS563S0100000_19((C03K6) this, 1009), new AwS563S0100000_19((C03K6) this, 1011), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1013), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1015), null, new AwS563S0100000_19((C03K6) this, 1016));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 1010);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1012);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 1014);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 42));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1017);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 1019);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 1020);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 1021);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 1022);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1023), awS563S0100000_19, AFwS207S0000000_19.get$arr$(97), new AwS563S0100000_19((C03K6) this, 1025), new AwS563S0100000_19((C03K6) this, 1026), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1027), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1028), null, new AwS563S0100000_19((C03K6) this, 1029));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1030), awS563S0100000_19, AFwS207S0000000_19.get$arr$(98), new AwS563S0100000_19((C03K6) this, 998), new AwS563S0100000_19((C03K6) this, 999), new AwS563S0100000_19((C03K6) this, 1002), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 1004));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    public final AuditRequestListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (AuditRequestListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        ((IDMAvatarLoader) this.LLIZ.getValue()).LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1218000hni c1218000hni = (C1218000hni) interfaceC1891350zJl;
        C1218180ho0 c1218180ho0 = c1218000hni.LL;
        IMUser iMUser = c1218180ho0.LIZ;
        if (iMUser != null) {
            ((TextView) this.LLILLL.getValue()).setText(iMUser.getDisplayName());
            if (C123100dR.LIZ(c1218180ho0.LJII)) {
                TextView textView = (TextView) this.LLILZ.getValue();
                String str = c1218180ho0.LJII;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                C1584506Ih.LIZIZ((View) this.LLILZ.getValue());
            } else {
                C1584506Ih.LIZ((View) this.LLILZ.getValue());
            }
            ((IDMAvatarLoader) this.LLIZ.getValue()).LIZIZ(iMUser.getUid(), iMUser.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            int i = C1217970hnf.LIZ[c1218000hni.LLILLJJLI.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C0HZQ c0hzq = (C0HZQ) this.LL.getValue();
                    C1584506Ih.LIZIZ(c0hzq);
                    c0hzq.setChecked(c1218000hni.LLILLL);
                    c0hzq.setInterceptToggleListener(new AwS420S0200000_19(this, c1218000hni, 186));
                    C1584506Ih.LIZ((View) this.LLILZIL.getValue());
                    C1584506Ih.LIZ((View) this.LLILZLL.getValue());
                    C786410Ut5.I7(new AbS509S0200000_19(this, c1218000hni, 8), this.itemView);
                    return;
                }
                throw new C1954807lC();
            }
            C1584506Ih.LIZ((View) this.LL.getValue());
            View view = (View) this.LLILZIL.getValue();
            C1584506Ih.LIZIZ(view);
            C786410Ut5.I7(new AbS509S0200000_19(this, c1218000hni, 9), view);
            View view2 = (View) this.LLILZLL.getValue();
            C1584506Ih.LIZIZ(view2);
            C786410Ut5.I7(new AbS509S0200000_19(this, c1218000hni, 10), view2);
            C786410Ut5.I7(new AbS509S0200000_19(this, c1218000hni, 7), this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cis, viewGroup, false);
    }
}
