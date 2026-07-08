package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.AbstractC1823000xXW;
import X.C019F;
import X.C01GW;
import X.C1308910kAL;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1559970qhH;
import X.C1637806bA;
import X.C16F5;
import X.C1822330xWR;
import X.C1822350xWT;
import X.C1822530xWl;
import X.C1822730xX5;
import X.C1822960xXS;
import X.C1823070xXd;
import X.C1823350xY5;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C500260Jjc;
import X.C518290KUh;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC518250KUd;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1823190xXp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PcsServiceBioSingleSkuAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1823070xXd(this));
    public final AssemVMLazy LLJJIII;
    public C1822330xWR LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public C16F5 LLJJJ;
    public String LLJJJIL;
    public AbstractC1823000xXW LLJJJJ;
    public EnumC518250KUd LLJJJJJIL;
    public C1822350xWT LLJJJJLIIL;
    public boolean LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioSingleSkuAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceBioSingleSkuAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1559970qhH(c19719912DlLIZ), new C1823350xY5(), null, true);
        this.LLJJJJJIL = EnumC518250KUd.UNSPECIFIED;
    }

    public abstract int lp();

    public abstract String op();

    public abstract int tp();

    public void yp() {
    }

    public final void Ap() {
        if (this.LLJJL) {
            return;
        }
        int i = C518290KUh.LIZ[this.LLJJJJJIL.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C1822730xX5.LIZLLL("show", "", sp());
            this.LLJJJJJIL = EnumC518250KUd.LOAD_DONE;
            this.LLJJL = true;
        }
    }

    public final PcsServiceBioAbility mp() {
        return (PcsServiceBioAbility) this.LLJJI.getValue();
    }

    public final C1822330xWR sp() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822330xWR.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final PcsServiceBioVM up() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (PcsServiceBioVM) assemVMLazy.getValue();
    }

    public final void Ep() {
        up();
        Pair pairDQ2 = PcsServiceBioVM.DQ2(this, up().LLJI);
        boolean zBooleanValue = ((Boolean) pairDQ2.getFirst()).booleanValue();
        String str = (String) pairDQ2.getSecond();
        if (!zBooleanValue || str.length() <= 0) {
            yp();
            LinearLayout linearLayout = this.LLJJIJIIJIL;
            if (linearLayout != null) {
                C500260Jjc.LJIILIIL(linearLayout);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(op());
            sbLIZ.append("hide content");
            C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        up().LLJJ = this;
        C1822330xWR c1822330xWRSp = sp();
        if (c1822330xWRSp != null) {
            c1822330xWRSp.LLJJJJ = op();
        }
        Bp(str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(op());
        sbLIZ2.append("show content");
        C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C1822350xWT kp() {
        String str;
        String str2;
        if (up().LLJI.isEmpty()) {
            return null;
        }
        C1822350xWT c1822350xWTLIZJ = C1822530xWl.LIZJ(up().LLJI);
        String str3 = c1822350xWTLIZJ != null ? c1822350xWTLIZJ.LIZ : null;
        if (str3 == null) {
            str3 = "";
        }
        if (c1822350xWTLIZJ == null || (str = c1822350xWTLIZJ.LIZJ) == null) {
            str = "";
        }
        if (c1822350xWTLIZJ == null || (str2 = c1822350xWTLIZJ.LIZLLL) == null) {
            str2 = "";
        }
        C1822330xWR c1822330xWRSp = sp();
        return new C1822350xWT(str3, "", str, str2, c1822330xWRSp != null ? c1822330xWRSp.LLJJLIIIJLLLLLLLZ : null);
    }

    public void Bp(String str) {
        PcsServiceBioAbility pcsServiceBioAbilityMp = mp();
        if (pcsServiceBioAbilityMp != null) {
            pcsServiceBioAbilityMp.qo0();
        }
    }

    public final void hp(ViewGroup viewGroup) {
        String str;
        String str2;
        String str3;
        if (viewGroup == null) {
            return;
        }
        if (this.LLJJJJ == null) {
            C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", "bindHeader first time");
            ip(viewGroup);
        } else {
            if (Intrinsics.LJFF(kp(), this.LLJJJJLIIL)) {
                return;
            }
            C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", "bindHeader changed");
            C786410Ut5.LJJLIL(0, viewGroup);
            ip(viewGroup);
        }
        C1822350xWT c1822350xWTKp = kp();
        C1822330xWR c1822330xWRSp = sp();
        String str4 = "";
        String string = null;
        if (c1822330xWRSp != null) {
            if (c1822350xWTKp == null || (str3 = c1822350xWTKp.LIZJ) == null) {
                str3 = "";
            }
            c1822330xWRSp.LLJJJ = str3;
        }
        C1822330xWR c1822330xWRSp2 = sp();
        if (c1822330xWRSp2 != null) {
            if (c1822350xWTKp == null || (str2 = c1822350xWTKp.LIZLLL) == null) {
                str2 = "";
            }
            c1822330xWRSp2.LLJJJIL = str2;
        }
        Context context = getContext();
        if (context != null) {
            int iTp = tp();
            Object[] objArr = new Object[1];
            if (c1822350xWTKp != null && (str = c1822350xWTKp.LIZ) != null) {
                str4 = str;
            }
            objArr[0] = str4;
            string = context.getString(iTp, objArr);
        }
        this.LLJJJIL = string;
        C16F5 c16f5 = this.LLJJJ;
        if (c16f5 != null) {
            c16f5.setText(string);
        }
        AbstractC1823000xXW abstractC1823000xXW = this.LLJJJJ;
        if (abstractC1823000xXW != null) {
            abstractC1823000xXW.I5(c1822350xWTKp);
        }
        this.LLJJJJLIIL = c1822350xWTKp;
    }

    public final void ip(ViewGroup viewGroup) {
        boolean z;
        String str;
        View view;
        View view2;
        Integer numLIZJ;
        View view3;
        View view4;
        CardView cardView;
        String str2;
        C1822330xWR c1822330xWRSp = sp();
        if (c1822330xWRSp != null) {
            z = c1822330xWRSp.LLILZ;
        } else {
            z = false;
        }
        C1822330xWR c1822330xWRSp2 = sp();
        View view5 = null;
        if (c1822330xWRSp2 != null) {
            str = c1822330xWRSp2.LLJI;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        C1822330xWR c1822330xWRSp3 = sp();
        if (c1822330xWRSp3 != null && (str2 = c1822330xWRSp3.LLJ) != null) {
            str3 = str2;
        }
        this.LLJJJJ = C1822960xXS.LIZ(viewGroup, z, str, str3, new InterfaceC1823190xXp() { // from class: X.0xXD
            @Override // X.InterfaceC1823190xXp
            public final void LIZIZ(InterfaceC1822900xXM interfaceC1822900xXM) {
            }

            @Override // X.InterfaceC1823190xXp
            public final void LJFF(Context context, InterfaceC1782170wTf interfaceC1782170wTf) {
            }

            @Override // X.InterfaceC1823190xXp
            public final void LIZJ() {
                C1822730xX5.LIZLLL("click", "verify_label", this.LIZ.sp());
                PcsServiceBioAbility pcsServiceBioAbilityMp = this.LIZ.mp();
                if (pcsServiceBioAbilityMp != null) {
                    pcsServiceBioAbilityMp.kz0();
                }
            }

            @Override // X.InterfaceC1823190xXp
            public final void LIZ(Context context) {
                this.LIZ.up();
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, LiveSubscriptionFAQSetting.INSTANCE.getValue().getSmbDisclaimerUseCaution("service_plus_landing_page"));
                C1822730xX5.LIZLLL("click", "user_caution", this.LIZ.sp());
            }

            @Override // X.InterfaceC1823190xXp
            public final void LIZLLL(String str4) {
                this.LIZ.up().EQ2("click", str4);
            }

            @Override // X.InterfaceC1823190xXp
            public final void LJ(String str4) {
                PcsServiceBioVM pcsServiceBioVMUp = this.LIZ.up();
                if (Intrinsics.LJFF(str4, "email")) {
                    pcsServiceBioVMUp.FQ2();
                } else if (Intrinsics.LJFF(str4, "phone")) {
                    pcsServiceBioVMUp.EQ2("show", "");
                }
                C1822730xX5.LIZLLL("click", str4, pcsServiceBioVMUp.zQ2());
            }
        }, true, tp(), sp());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createHeader content before=");
        sbLIZ.append(viewGroup.getChildCount());
        C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1823000xXW abstractC1823000xXW = this.LLJJJJ;
        if (abstractC1823000xXW != null) {
            view = abstractC1823000xXW.itemView;
        } else {
            view = null;
        }
        viewGroup.addView(view, 0, new LinearLayout.LayoutParams(-1, -2));
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(lp(), context)) != null) {
            int iIntValue = numLIZJ.intValue();
            AbstractC1823000xXW abstractC1823000xXW2 = this.LLJJJJ;
            if (abstractC1823000xXW2 != null) {
                view3 = abstractC1823000xXW2.itemView;
            } else {
                view3 = null;
            }
            if (view3 instanceof CardView) {
                if (abstractC1823000xXW2 != null) {
                    view5 = abstractC1823000xXW2.itemView;
                }
                if ((view5 instanceof CardView) && (cardView = (CardView) view5) != null) {
                    cardView.setCardBackgroundColor(iIntValue);
                }
            } else if (abstractC1823000xXW2 != null && (view4 = abstractC1823000xXW2.itemView) != null) {
                view4.setBackgroundColor(iIntValue);
            }
        }
        AbstractC1823000xXW abstractC1823000xXW3 = this.LLJJJJ;
        if (abstractC1823000xXW3 != null && (view2 = abstractC1823000xXW3.itemView) != null) {
            view2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }

    public final void zp(View view) {
        Integer numLIZJ;
        C16F5 c16f5;
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.eu1);
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                C786410Ut5.W5(linearLayout, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        LinearLayout linearLayout2 = this.LLJJIJIIJIL;
        if (linearLayout2 != null) {
            C500260Jjc.LJIILIIL(linearLayout2);
        }
        this.LLJJIJIL = view.findViewById(R.id.oe2);
        this.LLJJJ = (C16F5) view.findViewById(R.id.jkv);
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() && (c16f5 = this.LLJJJ) != null) {
            c16f5.setMaxLines(1);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(lp(), context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                view2.setBackgroundColor(iIntValue);
            }
        }
        C16F5 c16f52 = this.LLJJJ;
        if (c16f52 != null) {
            ViewGroup.LayoutParams layoutParams2 = c16f52.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                marginLayoutParams.width = -1;
                C786410Ut5.W5(c16f52, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
