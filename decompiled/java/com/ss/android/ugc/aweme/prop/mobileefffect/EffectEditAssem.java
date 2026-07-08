package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.AbstractC1736670vIH;
import X.C019F;
import X.C01GW;
import X.C0LAB;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1735720vGk;
import X.C1736280vHe;
import X.C1737900vKG;
import X.C1737910vKH;
import X.C1775770wJL;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20642515q3;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C420290Gdv;
import X.C452501pT;
import X.C723590SZx;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1733870vDl;
import X.EnumC1737480vJa;
import X.InterfaceC1670800ta2;
import X.InterfaceC1733820vDg;
import X.InterfaceC1736270vHd;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import android.app.Activity;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectEditAssem extends UISlotAssem implements InterfaceC1733820vDg {
    public static final C1736280vHe LLJJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final int LLJJI = 25;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vHe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectEditAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/EffectEditVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = new Object() { // from class: X.0vHe
        };
        LLJL = 8;
    }

    public EffectEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectEditVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 1105), AFwS268S0000000_26.get$arr$(443), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1107));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1104));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1109));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1108));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1106));
    }

    private final void Qp() {
        C736680Sv4.LJIIIZ(this, up(), new C2217381BqS() { // from class: X.0vHD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0vHC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLILZLL;
            }
        }, null, new AwS675S0100000_26(this, 7), 12);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0vHW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLIZ;
            }
        }, null, new AwS640S0100000_26(this, 51), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0vHX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJI;
            }
        }, null, new AwS640S0100000_26(this, 52), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0vHb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLIZLLLIL;
            }
        }, null, new AwS640S0100000_26(this, 53), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0vHZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJ;
            }
        }, null, new AwS640S0100000_26(this, 50), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.ro;
    }

    @Override // X.InterfaceC1733820vDg, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final void Xp(AbstractC1736670vIH abstractC1736670vIH) {
    }

    public final int lp() {
        return 2131820924;
    }

    private final void Bp() {
        C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 142));
    }

    private final void Fp() {
        int i;
        View view = this.LLJJIJIIJIL;
        if (view == null) {
            view = null;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.gpn);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1110));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        int i2 = C1735720vGk.LIZ[ip().mode.ordinal()];
        if (i2 == 1) {
            i = 2131833783;
        } else {
            if (i2 != 2) {
                throw new C1954807lC();
            }
            i = 2131833759;
        }
        c1250250idj.LIZJ = C20642515q3.LJI(i);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        tuxNavBar.setNavActions(c0om1);
    }

    private final C420290Gdv mp() {
        return (C420290Gdv) this.LLJJJJ.getValue();
    }

    private final void yp() {
        View view = this.LLJJIJIIJIL;
        if (view == null) {
            view = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.oij);
        int i = C1735720vGk.LIZ[ip().mode.ordinal()];
        if (i == 1) {
            textView.setText(C1737900vKG.LJIJ(textView.getContext()));
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            textView.setText(C1737900vKG.LJIIZILJ(textView.getContext()));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final MobileEffectData ip() {
        return (MobileEffectData) this.LLJJIJI.getValue();
    }

    public final ProgressBarDialog kp() {
        return (ProgressBarDialog) this.LLJJJJLIIL.getValue();
    }

    public final C420290Gdv op() {
        return (C420290Gdv) this.LLJJJIL.getValue();
    }

    public final View sp() {
        return (View) this.LLJJJ.getValue();
    }

    public final TextView tp() {
        return (TextView) this.LLJJIJIL.getValue();
    }

    public final EffectEditVM up() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (EffectEditVM) assemVMLazy.getValue();
    }

    private final void Gp() {
        if (ip().mode != EnumC1733870vDl.PUBLISH) {
            C786410Ut5.LJLLLLLL(8, sp());
            return;
        }
        C786410Ut5.I7(new ACListenerS160S0100000_26(this, 35), sp());
        up().BQ2();
    }

    private final void Jp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        Bp();
        Ip(c19egLIZ);
        Gp();
        yp();
        Fp();
        Ap(c19egLIZ);
        zp(c19egLIZ);
        EffectEditVM effectEditVMUp = up();
        if (effectEditVMUp.yQ2().mode == EnumC1733870vDl.PUBLISH) {
            MobileEffectData mobileEffectDataYQ2 = effectEditVMUp.yQ2();
            C0LAB c0labLJI = C1737900vKG.LJI(mobileEffectDataYQ2, null, EnumC1737480vJa.PUBLISH.getTag());
            C1737900vKG.LIZIZ(c0labLJI, mobileEffectDataYQ2.publishData);
            Map<String, String> map = c0labLJI.LIZ;
            C1737900vKG.LIZJ(map, effectEditVMUp.getState().LLJI);
            C1737910vKH.LIZ("publish_effect_show", map);
        }
    }

    private final void Tp() {
        if (ip().mode == EnumC1733870vDl.EDIT) {
            return;
        }
        EffectEditVM effectEditVMUp = up();
        effectEditVMUp.DQ2(effectEditVMUp.getState().LLILZLL);
    }

    @Override // X.InterfaceC1733820vDg
    public void LJJLIIIJJIZ() {
        up().HQ2();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Ap(X.C19EG r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem.Ap(X.19EG):void");
    }

    private final void Ep(View view) {
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0vHV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InputMethodManager inputMethodManager;
                Activity activityLIZ = C1388190mED.LIZ(view2.getContext());
                Object objF2 = null;
                if (activityLIZ != null) {
                    objF2 = C786410Ut5.F2(activityLIZ, "input_method");
                }
                if ((objF2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objF2) != null && inputMethodManager.isAcceptingText()) {
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                }
            }
        }, view);
    }

    private final void Ip(C19EG c19eg) {
        TextView textViewTp = tp();
        int i = C1735720vGk.LIZ[ip().mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                textViewTp.setText(2131833757);
            } else {
                throw new C1954807lC();
            }
        } else {
            textViewTp.setText(2131833768);
        }
        C786410Ut5.I7(new C1775770wJL(this, c19eg, 0), tp());
    }

    private final void zp(C19EG c19eg) {
        LinearLayout linearLayout;
        mp().LIZ(ip().iconViewType);
        EffectPackageDataWrapper effectPackageDataWrapper = ip().publishData;
        if (effectPackageDataWrapper == null) {
            C420290Gdv c420290GdvMp = mp();
            int visibility = c420290GdvMp.getVisibility();
            c420290GdvMp.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c420290GdvMp);
            return;
        }
        List<EffectHint> list = effectPackageDataWrapper.availableEffectHintList;
        if (list.isEmpty() || ip().mode == EnumC1733870vDl.EDIT) {
            C420290Gdv c420290GdvMp2 = mp();
            int visibility2 = c420290GdvMp2.getVisibility();
            c420290GdvMp2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c420290GdvMp2);
        }
        mp().setTitleText(C20642515q3.LJI(2131821233));
        View viewSd = C786410Ut5.Sd(R.layout.fub, C786410Ut5.ne(c19eg), null);
        if ((viewSd instanceof LinearLayout) && (linearLayout = (LinearLayout) viewSd) != null) {
            mp().setContentFieldView(linearLayout);
        } else {
            linearLayout = null;
        }
        this.LLJJJJJIL = linearLayout;
        TuxTextView tuxTextView = new TuxTextView(c19eg, null, 6, 0);
        tuxTextView.setText(C20642515q3.LJI(2131821231));
        tuxTextView.setTuxFont(61);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c19eg);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
            mp().setFooterFieldView(tuxTextView);
            C786410Ut5.na(mp(), new ACListenerS128S0200000_26(this, list, 11));
        }
    }

    @Override // X.InterfaceC1733820vDg
    public void LLLLZIL(Uri uri) {
        up().IQ2(uri, null);
    }

    public final void Up(String str) {
        InterfaceC1736270vHd interfaceC1736270vHd;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736270vHd) && (interfaceC1736270vHd = (InterfaceC1736270vHd) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736270vHd.LJJI(str);
        }
    }

    public final void Vp(EffectDoneInitState effectDoneInitState) {
        InterfaceC1736270vHd interfaceC1736270vHd;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736270vHd) && (interfaceC1736270vHd = (InterfaceC1736270vHd) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736270vHd.LIZLLL(effectDoneInitState);
        }
    }

    public final void hp(String str) {
        InterfaceC1736270vHd interfaceC1736270vHd;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736270vHd) && (interfaceC1736270vHd = (InterfaceC1736270vHd) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736270vHd.LJJ(str);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = view;
        Jp();
        Qp();
        Tp();
        Ep(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(X.C1156280gCA r4, androidx.fragment.app.Fragment r5) {
        /*
            r3 = this;
            java.lang.Integer r2 = r4.LIZ
            if (r2 == 0) goto L3f
            int r1 = r2.intValue()
            r0 = 1408(0x580, float:1.973E-42)
            if (r1 != r0) goto L1b
            r1 = 2131833755(0x7f11339b, float:1.9300601E38)
        Lf:
            X.0mGx r0 = new X.0mGx
            r0.<init>(r5)
            r0.LJIIIZ(r1)
            r0.LJIIJJI()
            return
        L1b:
            int r1 = r2.intValue()
            r0 = 1411(0x583, float:1.977E-42)
            if (r1 != r0) goto L27
            r1 = 2131821236(0x7f1102b4, float:1.927521E38)
            goto Lf
        L27:
            int r1 = r2.intValue()
            r0 = 1412(0x584, float:1.979E-42)
            if (r1 != r0) goto L33
            r1 = 2131821235(0x7f1102b3, float:1.9275207E38)
            goto Lf
        L33:
            int r1 = r2.intValue()
            r0 = 1413(0x585, float:1.98E-42)
            if (r1 != r0) goto L3f
            r1 = 2131821234(0x7f1102b2, float:1.9275205E38)
            goto Lf
        L3f:
            r1 = 2131822173(0x7f11065d, float:1.927711E38)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem.Wp(X.0gCA, androidx.fragment.app.Fragment):void");
    }
}
