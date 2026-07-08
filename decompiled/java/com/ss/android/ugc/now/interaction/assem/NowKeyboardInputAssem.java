package com.ss.android.ugc.now.interaction.assem;

import X.C01GW;
import X.C03IT;
import X.C1344030l4z;
import X.C1351950lHl;
import X.C1352460lIa;
import X.C1352810lJ9;
import X.C1353510lKH;
import X.C1354870lMT;
import X.C13LE;
import X.C1402120mag;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS22S0210000_21;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardInputAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class NowKeyboardInputAssem extends BaseNowKeyboardInputAssem implements InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public C427660Gpo LLJJI;
    public FrameLayout LLJJIII;
    public TuxIconView LLJJIJI;
    public C1353510lKH LLJJIJIIJIL;
    public C1352460lIa LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public Comment LLJL;
    public String LLJLIL;

    public NowKeyboardInputAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NowKeyboardVM.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 70));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1127));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1128));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1126));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1125));
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1124));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3z;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void N2() {
        lp(false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1684082298) {
            return null;
        }
        return this;
    }

    public final C1353510lKH hp() {
        return (C1353510lKH) this.LLJJJJLIIL.getValue();
    }

    public final C1352460lIa ip() {
        C1352460lIa c1352460lIa = this.LLJJIJIL;
        return c1352460lIa == null ? C1352810lJ9.LIZ(this) : c1352460lIa;
    }

    public final NowKeyboardVM kp() {
        return (NowKeyboardVM) this.LLJJJ.getValue();
    }

    public final void mp() {
        String strLIZIZ;
        hp().setFocusableInTouchMode(true);
        hp().setFocusable(true);
        C1353510lKH c1353510lKHHp = hp();
        Boolean boolValueOf = c1353510lKHHp != null ? Boolean.valueOf(c1353510lKHHp.requestFocus()) : null;
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("input request edit focus failed, visible=");
            C1353510lKH c1353510lKHHp2 = hp();
            sbLIZ.append(c1353510lKHHp2 != null ? Integer.valueOf(c1353510lKHHp2.getVisibility()) : null);
            sbLIZ.append(", enable=");
            C1353510lKH c1353510lKHHp3 = hp();
            sbLIZ.append(c1353510lKHHp3 != null ? Boolean.valueOf(c1353510lKHHp3.isEnabled()) : null);
            sbLIZ.append(", focusable=");
            C1353510lKH c1353510lKHHp4 = hp();
            sbLIZ.append(c1353510lKHHp4 != null ? Boolean.valueOf(c1353510lKHHp4.isFocusable()) : null);
            sbLIZ.append(", focusableInTouch=");
            C1353510lKH c1353510lKHHp5 = hp();
            sbLIZ.append(c1353510lKHHp5 != null ? Boolean.valueOf(c1353510lKHHp5.isFocusableInTouchMode()) : null);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BaseKeyboardPanel: reqFocusRes=");
        sbLIZ2.append(boolValueOf);
        sbLIZ2.append("  msg===> ");
        sbLIZ2.append(strLIZIZ);
        C1344030l4z.LIZJ("CommentInputAssem", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void dr(C1352460lIa c1352460lIa) {
        this.LLJJIJIL = c1352460lIa;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void h10(Editable editable) {
        C1353510lKH c1353510lKHHp = hp();
        if (c1353510lKHHp != null) {
            c1353510lKHHp.setText(editable);
        }
        C1353510lKH c1353510lKHHp2 = hp();
        if (c1353510lKHHp2 != null) {
            c1353510lKHHp2.requestLayout();
        }
    }

    public final void lp(boolean z) {
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openSoftInput  ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("CommentInputAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1353510lKH c1353510lKHHp = hp();
        if (z) {
            j = 30;
        } else {
            j = 0;
        }
        HandlerHook.viewPostDelay(c1353510lKHHp, new ARunnableS22S0210000_21(this, z, c1353510lKHHp, 2), j);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C03IT c03itLIZ = C1354870lMT.LIZ(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser());
        if (c03itLIZ != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LLJJJIL.getValue(), c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
        }
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJJJJIL.getValue());
        hp().setMentionTextColor(C1351950lHl.LJ(R.attr.a1h, R.color.da, hp().getContext()));
        hp().setMentionTextTypeface(1);
        hp().addTextChangedListener(new C1402120mag(this, 16));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAGc  panelType  ");
        sbLIZ.append(kp());
        C2188811AlT.LIZIZ(sbLIZ);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lI0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLILZ;
            }
        }, null, new AwS635S0100000_21(this, 147), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lIC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 126), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lHw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1352050lHv) obj).LLIZ);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 150), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lCE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1352050lHv) obj).LLJILJILJ);
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 141), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lIB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJ;
            }
        }, null, new AwS635S0100000_21(this, 157), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lCw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJJI;
            }
        }, null, new AwS635S0100000_21(this, 159), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lIF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJJIII;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 161), 4);
        C786410Ut5.O7((FrameLayout) this.LLJJJJ.getValue(), new ACListenerS155S0100000_21(this, 219));
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 220), (View) this.LLJJJJJIL.getValue());
    }
}
