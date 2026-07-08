package com.ss.android.ugc.aweme.ecommerce.base.osp.bottom;

import X.C01D1;
import X.C03C8;
import X.C03DZ;
import X.C03MO;
import X.C03O1;
import X.C044O;
import X.C0H1U;
import X.C1077604Ji;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C830603Mi;
import X.C897103ez;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS280S0300000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspBottomWidget extends UISlotAssem implements c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public C03O1 LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MiniOspBottomWidget.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/MiniOspViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MiniOspBottomWidget() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MiniOspViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 111), AFwS228S0000000_1.get$arr$(61), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b3q;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "MiniOspBottomWidget";
    }

    public final TuxTextView hp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.puz) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h ip() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qkp) : null;
            this.LLJJIJIIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final MiniOspViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (MiniOspViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        ap(C044O.LIZ);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void lp(View view) {
        ButtonStyle buttonStyle;
        int i;
        ButtonInfo buttonInfo;
        ECRichText eCRichText;
        LinkRichText linkRichText;
        Context context;
        C197039127h c197039127hIp;
        ButtonInfo buttonInfo2;
        C197039127h c197039127hIp2;
        this.LLJJJIL = view.getContext().getString(2131848100);
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.total_title);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            textView.setText(this.LLJJJIL);
        }
        View viewFindViewById2 = this.LLJJIJI;
        if (viewFindViewById2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.total_price);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJIJI = (TuxTextView) viewFindViewById2;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(32);
        }
        if (C897103ez.LIZ() && (c197039127hIp2 = ip()) != null) {
            c197039127hIp2.setButtonStartIcon(Integer.valueOf(R.raw.icon_shield_tick));
        }
        BillInfoData billInfoData = kp().LLIZ;
        if ((billInfoData == null || (buttonInfo2 = billInfoData.ospButtonInfo) == null || (buttonStyle = buttonInfo2.globalButtonStyle) == null) && (buttonStyle = C03MO.LIZ().placeOrderStyle) == null) {
            i = -1;
        } else {
            i = C830603Mi.LIZ[buttonStyle.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (context = view.getContext()) != null && (c197039127hIp = ip()) != null) {
                        c197039127hIp.LJJJJL(new AwS580S0100000_1(context, 89));
                    }
                } else {
                    C197039127h c197039127hIp3 = ip();
                    if (c197039127hIp3 != null) {
                        c197039127hIp3.setButtonVariant(4);
                    }
                }
            } else {
                C197039127h c197039127hIp4 = ip();
                if (c197039127hIp4 != null) {
                    c197039127hIp4.setButtonVariant(1);
                }
            }
        } else {
            C197039127h c197039127hIp5 = ip();
            if (c197039127hIp5 != null) {
                c197039127hIp5.setButtonVariant(0);
            }
        }
        TuxTextView tuxTextViewHp = hp();
        if (tuxTextViewHp != null) {
            C03DZ.LIZ(tuxTextViewHp);
        }
        BillInfoData billInfoData2 = kp().LLIZ;
        if (billInfoData2 != null && (linkRichText = billInfoData2.buyerProtectionProgram) != null) {
            TuxTextView tuxTextViewHp2 = hp();
            if (tuxTextViewHp2 != null) {
                tuxTextViewHp2.setClickable(true);
            }
            TuxTextView tuxTextViewHp3 = hp();
            if (tuxTextViewHp3 != null) {
                tuxTextViewHp3.setMovementMethod(LinkMovementMethod.getInstance());
            }
            TuxTextView tuxTextViewHp4 = hp();
            if (tuxTextViewHp4 != null) {
                tuxTextViewHp4.setHighlightColor(0);
            }
            TuxTextView tuxTextViewHp5 = hp();
            if (tuxTextViewHp5 != null) {
                C0H1U.LJIIL(tuxTextViewHp5, RichTextUtil.LJ(RichTextUtil.LIZ, view.getContext(), linkRichText, null, 0, false, 62, null, null, null, false, false, null, null, new AwS580S0100000_1(this, 90), 8156), true);
            }
        }
        BillInfoData billInfoData3 = kp().LLIZ;
        if (billInfoData3 != null && (buttonInfo = billInfoData3.ospButtonInfo) != null && (eCRichText = buttonInfo.authorizationStatement) != null) {
            TuxTextView tuxTextViewHp6 = hp();
            if (tuxTextViewHp6 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewHp6, 0);
            }
            TuxTextView tuxTextViewHp7 = hp();
            if (tuxTextViewHp7 != null) {
                C03C8.LIZJ(tuxTextViewHp7, eCRichText, "osp_tips", null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJJ = kp().LLILZLL;
        lp(view);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03Mr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLII;
            }
        }, null, new AwS615S0100000_1(this, 12), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03Mv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS280S0300000_1(this, view, view, 1), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03Mu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILLL;
            }
        }, null, new AwS615S0100000_1(this, 13), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03Ms
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLJIL;
            }
        }, null, new AwS615S0100000_1(this, 14), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.03Mw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLLLZIL;
            }
        }, null, new AwS437S0200000_1(this, view, 5), 6);
        MiniOspViewModel miniOspViewModelKp = kp();
        selectSubscribe(miniOspViewModelKp, new C2217371BqR() { // from class: X.03aq
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, new C2217381BqS() { // from class: X.03Mq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLLL);
            }
        }, new C2217381BqS() { // from class: X.03Mx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLLLLL;
            }
        }, C736820SvI.LIZIZ(miniOspViewModelKp.usedInReusedScene), null, new C1077604Ji(this, view, 0));
        C197039127h c197039127hIp = ip();
        if (c197039127hIp != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 15), c197039127hIp);
        }
    }
}
