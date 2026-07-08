package com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation;

import X.C019F;
import X.C0HTI;
import X.C1294120jmU;
import X.C1308910kAL;
import X.C13LE;
import X.C15390060u;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBotCreateGuideAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C1294120jmU LLJJIII;
    public ImageView LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMBotCreateGuideAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/creation/IMAIBotCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMBotCreateGuideAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMAIBotCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 257), AFwS229S0000000_2.get$arr$(212), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cei;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        GradientDrawable gradientDrawable;
        super.xo();
        View viewFindViewById = LJJIJL().findViewById(R.id.jc0);
        if (viewFindViewById != null) {
            if (hp().getState().LL == 1) {
                C337180DJs.LIZJ(viewFindViewById);
            } else {
                C337180DJs.LIZ(viewFindViewById);
            }
        }
        if (C15390060u.LL.LJJIIZI()) {
            ip();
            kp(2131846281);
        } else {
            ip();
            kp(2131848483);
        }
        ImageView imageView = (ImageView) LJJIJL().findViewById(R.id.kb6);
        if (imageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.p5;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        } else {
            imageView = null;
        }
        this.LLJJIJI = imageView;
        this.LLJJIII = (C1294120jmU) LJJIJL().findViewById(R.id.axy);
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.e26);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 65));
        }
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.d6g);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS106S0200000_2(this, c197039127h, 12));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ca, c197039127h.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                Drawable background = c197039127h.getBackground();
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    gradientDrawable.setColor(iIntValue);
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06IW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C061Z) obj).LL);
            }
        }, null, new AwS616S0100000_2(this, 102), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06JA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C061Z) obj).LLILLL);
            }
        }, null, AFwS285S0000000_2.get$arr$(44), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.061e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C061Z) obj).LLIZ;
            }
        }, null, new AwS616S0100000_2(this, 103), 6);
    }

    public final IMAIBotCreationVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (IMAIBotCreationVM) assemVMLazy.getValue();
    }

    public final void ip() {
        TextView textView = (TextView) LJJIJL().findViewById(R.id.wlw);
        if (textView != null) {
            textView.setText(textView.getContext().getString(2131848484));
        }
        TextView textView2 = (TextView) LJJIJL().findViewById(R.id.fmd);
        if (textView2 != null) {
            textView2.setText(textView2.getContext().getString(2131848482));
        }
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.mih);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_pen_star_fill);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        PlayerController playerController;
        super.onDestroy();
        if (this.LLJJIJIIJIL) {
            C1294120jmU c1294120jmU = this.LLJJIII;
            if (c1294120jmU != null) {
                c1294120jmU.LIZLLL();
            }
            C1294120jmU c1294120jmU2 = this.LLJJIII;
            if (c1294120jmU2 != null && (playerController = c1294120jmU2.LL) != null) {
                playerController.detachAlphaView(c1294120jmU2);
            }
            this.LLJJIJIIJIL = false;
        }
        C1294120jmU c1294120jmU3 = this.LLJJIII;
        if (c1294120jmU3 != null) {
            c1294120jmU3.LIZIZ();
        }
    }

    public final void kp(int i) {
        TextView textView = (TextView) LJJIJL().findViewById(R.id.wlx);
        if (textView != null) {
            textView.setText(textView.getContext().getString(2131848485));
        }
        TextView textView2 = (TextView) LJJIJL().findViewById(R.id.fmf);
        if (textView2 != null) {
            textView2.setText(textView2.getContext().getString(i));
        }
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.mii);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_ai_bubble_fill);
        }
    }
}
