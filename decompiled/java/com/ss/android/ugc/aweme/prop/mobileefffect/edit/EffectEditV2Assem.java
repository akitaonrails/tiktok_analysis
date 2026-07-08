package com.ss.android.ugc.aweme.prop.mobileefffect.edit;

import X.AbstractC1736670vIH;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C13LN;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1736500vI0;
import X.C1737900vKG;
import X.C1748470vbJ;
import X.C1775770wJL;
import X.C1775980wJg;
import X.C1776200wK2;
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
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1670800ta2;
import X.InterfaceC1733820vDg;
import X.InterfaceC1736490vHz;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.aweme.prop.mobileefffect.ProgressBarDialog;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectEditV2Assem extends UISlotAssem implements InterfaceC1733820vDg {
    public static final C1736500vI0 LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final int LLJJI = 25;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public View LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public C420290Gdv LLJJJ;
    public LinearLayout LLJJJIL;
    public final C01GW LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vI0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectEditV2Assem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/edit/EffectEditV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new Object() { // from class: X.0vI0
        };
        LLJJL = 8;
    }

    public EffectEditV2Assem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectEditV2VM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 753), AFwS268S0000000_26.get$arr$(450), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(245));
    }

    private final void Ep() {
        EffectEditV2VM effectEditV2VMMp = mp();
        selectSubscribe(effectEditV2VMMp, new C2217381BqS() { // from class: X.0vHv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0vHp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0vHq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJIJIIJIL;
            }
        }, new C2217381BqS() { // from class: X.0vHw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJJJLIIL;
            }
        }, C736820SvI.LIZIZ(effectEditV2VMMp.usedInReusedScene), null, new C1776200wK2(this, 7));
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLIZ;
            }
        }, null, new AwS640S0100000_26(this, 56), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJI;
            }
        }, null, new AwS640S0100000_26(this, 57), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLIZLLLIL;
            }
        }, null, new AwS640S0100000_26(this, 54), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJ;
            }
        }, null, new AwS640S0100000_26(this, 55), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.rr;
    }

    @Override // X.InterfaceC1733820vDg, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final void Qp(AbstractC1736670vIH abstractC1736670vIH) {
    }

    public final int lp() {
        return 2131820924;
    }

    private final void sp() {
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 283));
    }

    private final void up() {
        C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 143));
    }

    private final void zp() {
        TuxNavBar tuxNavBar;
        View view = this.LLJJIJIIJIL;
        if (view == null || (tuxNavBar = (TuxNavBar) view.findViewById(R.id.gpn)) == null) {
            return;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1113));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131833783);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        tuxNavBar.setNavActions(c0om1);
    }

    public final MobileEffectData ip() {
        return (MobileEffectData) this.LLJJIJI.getValue();
    }

    public final ProgressBarDialog kp() {
        return (ProgressBarDialog) this.LLJJJJ.getValue();
    }

    public final EffectEditV2VM mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (EffectEditV2VM) assemVMLazy.getValue();
    }

    private final void Bp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        sp();
        up();
        Ap(c19egLIZ);
        op();
        zp();
        tp(c19egLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Fp() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem.Fp():void");
    }

    private final void op() {
        View view;
        TextView textView;
        Context context = getContext();
        if (context == null || (view = this.LLJJIJIIJIL) == null || (textView = (TextView) view.findViewById(R.id.oij)) == null) {
            return;
        }
        textView.setText(C1737900vKG.LJIJ(context));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // X.InterfaceC1733820vDg
    public void LJJLIIIJJIZ() {
        EffectEditV2VM effectEditV2VMMp = mp();
        effectEditV2VMMp.getClass();
        effectEditV2VMMp.setState(new AwS605S0100000_26(effectEditV2VMMp, 397));
    }

    private final void Ap(C19EG c19eg) {
        TextView textView = this.LLJJIJIL;
        if (textView != null) {
            textView.setText(2131833768);
        }
        TextView textView2 = this.LLJJIJIL;
        if (textView2 != null) {
            C786410Ut5.I7(new C1775770wJL(c19eg, this, 1), textView2);
        }
    }

    private final void tp(C19EG c19eg) {
        C1748470vbJ c1748470vbJ;
        String strLJZL;
        String str;
        C420290Gdv c420290Gdv = this.LLJJJ;
        if (c420290Gdv != null) {
            c420290Gdv.LIZ(ip().iconViewType);
        }
        View viewSd = C786410Ut5.Sd(R.layout.fuc, C786410Ut5.ne(c19eg), null);
        if ((viewSd instanceof C1748470vbJ) && (c1748470vbJ = (C1748470vbJ) viewSd) != null) {
            NewFaceStickerBean newFaceStickerBean = ip().effect;
            if (newFaceStickerBean == null || (str = newFaceStickerBean.name) == null || (strLJZL = C13LN.LJZL(this.LLJJI, str)) == null) {
                strLJZL = "";
            }
            c1748470vbJ.LJIILIIL(strLJZL);
            c1748470vbJ.LL.setLines(1);
            c1748470vbJ.LJIIIZ(1);
            c1748470vbJ.LIZJ();
            c1748470vbJ.LJFF(true);
            c1748470vbJ.LJIIJ(C20642515q3.LJI(2131833517));
            View viewFindViewById = c1748470vbJ.findViewById(R.id.grz);
            if (viewFindViewById != null) {
                viewFindViewById.setTextAlignment(5);
            }
            c1748470vbJ.LIZIZ(new C1775980wJg(this, 4));
            C420290Gdv c420290Gdv2 = this.LLJJJ;
            if (c420290Gdv2 != null) {
                c420290Gdv2.setContentFieldView(c1748470vbJ);
            }
            C420290Gdv c420290Gdv3 = this.LLJJJ;
            if (c420290Gdv3 != null) {
                c420290Gdv3.setTitleText(C20642515q3.LJI(2131833779));
            }
        }
        TuxTextView tuxTextView = new TuxTextView(c19eg, null, 6, 0);
        tuxTextView.setText(C20642515q3.LJI(2131821230));
        tuxTextView.setTextColorRes(R.attr.zs);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLILLJJLI;
            }
        }, null, new AwS461S0200000_26(this, tuxTextView, 8), 6);
    }

    private final void yp(View view) {
        C19EG c19egLIZ;
        Window window;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("effect_publish_keyboard_adjust_pan", true) && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0vHl
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

    public final void Gp(String str) {
        InterfaceC1736490vHz interfaceC1736490vHz;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736490vHz) && (interfaceC1736490vHz = (InterfaceC1736490vHz) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736490vHz.LJJI(str);
        }
    }

    public final void Ip(EffectDoneInitState effectDoneInitState) {
        InterfaceC1736490vHz interfaceC1736490vHz;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736490vHz) && (interfaceC1736490vHz = (InterfaceC1736490vHz) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736490vHz.LIZLLL(effectDoneInitState);
        }
    }

    @Override // X.InterfaceC1733820vDg
    public void LLLLZIL(Uri uri) {
        mp().yQ2(uri, null);
    }

    public final void hp(String str) {
        InterfaceC1736490vHz interfaceC1736490vHz;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736490vHz) && (interfaceC1736490vHz = (InterfaceC1736490vHz) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736490vHz.LJJ(str);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = view;
        this.LLJJIJIL = (TextView) view.findViewById(R.id.whe);
        this.LLJJJ = (C420290Gdv) view.findViewById(R.id.gw8);
        Bp();
        Ep();
        Fp();
        yp(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(X.C1156280gCA r4, androidx.fragment.app.Fragment r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem.Jp(X.0gCA, androidx.fragment.app.Fragment):void");
    }
}
