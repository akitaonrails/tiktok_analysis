package com.ss.android.ugc.aweme.poi.osp.assem;

import X.AbstractC1177930gl5;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OM1;
import X.C1192910h9F;
import X.C1193060h9U;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C166V;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS47S0001000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSummaryPanelAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 422));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSummaryPanelAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSummaryPanelBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSummaryPanelAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/osp/PoiOrderSubmitViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PoiOrderSummaryPanelAssem.class, "orderSummaryViewModel", "getOrderSummaryViewModel()Lcom/ss/android/ugc/aweme/poi/osp/assem/PoiOrderSubmitSheetViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PoiOrderSummaryPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1652), AFwS256S0000000_18.get$arr$(531), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiOrderSubmitSheetViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1653), AFwS256S0000000_18.get$arr$(532), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1654));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e5w;
    }

    public final PoiOrderSubmitSheetViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PoiOrderSubmitSheetViewModel) assemVMLazy.getValue();
    }

    public final BottomSheetBehavior<RadiusLayout> ip() {
        return (BottomSheetBehavior) this.LLJJIJI.getValue();
    }

    public final C1193060h9U kp() {
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (C1193060h9U) c166v.LIZ(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = kp().LLILLJJLI;
        C0OM1 c0om1 = new C0OM1();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = view.getContext().getString(2131828875);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 1651));
        c0om1.LIZIZ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        C786410Ut5.p9(kp().LLILZ, new View.OnClickListener() { // from class: X.0h9X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 68), kp().LLILZIL);
        ip().setState(5);
        ip().addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0h9J
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view2, float f) {
                C786410Ut5.T4(this.LIZ.kp().LLILZIL, f);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view2) {
                C1186030gy9.LIZ(new AwS47S0001000_2(i, 3));
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        return;
                    }
                    C786410Ut5.T4(this.LIZ.kp().LLILZIL, 0.0f);
                    C339190DRl.LIZIZ(this.LIZ.kp().LLILZIL);
                    this.LIZ.hp().vQ2(EnumC1192930h9H.ORDER_SUMMARY);
                    return;
                }
                C786410Ut5.T4(this.LIZ.kp().LLILZIL, 1.0f);
                this.LIZ.hp().setState(new AwS597S0100000_18(EnumC1192930h9H.ORDER_SUMMARY, 1134));
            }
        });
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0h9N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1193040h9S) obj).LL;
            }
        }, null, new C1192910h9F(this), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0h9P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1193040h9S) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 140), 6);
    }
}
