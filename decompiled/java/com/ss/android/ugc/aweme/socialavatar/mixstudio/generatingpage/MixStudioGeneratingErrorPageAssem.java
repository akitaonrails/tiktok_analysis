package com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage;

import X.C01GW;
import X.C05YD;
import X.C0HGY;
import X.C0HTH;
import X.C0HTI;
import X.C1308910kAL;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C435650H6l;
import X.C440370HOp;
import X.C441500HSy;
import X.C441660HTo;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC440890HQp;
import X.EnumC441390HSn;
import X.EnumC441430HSr;
import X.EnumC441640HTm;
import X.InterfaceC440090HNn;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioGeneratingErrorPageAssem extends MixStudioPageAssem {
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(164));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(165));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(155));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(156));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(158));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(159));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(157));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(161));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(160));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(162));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(163));
    public final EnumC440890HQp LLJLLIL = EnumC440890HQp.GENERATING_ERROR;
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(166));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void LLFF() {
        C05YD<InterfaceC440090HNn> c05ydLIZ;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLJLLL.getValue();
        InterfaceC440090HNn value = (mixStudioStatusRepository == null || (c05ydLIZ = mixStudioStatusRepository.LIZ()) == null) ? null : c05ydLIZ.getValue();
        MixStudioStatusRepository mixStudioStatusRepository2 = (MixStudioStatusRepository) this.LLJLLL.getValue();
        C441500HSy errorInfo = mixStudioStatusRepository2 != null ? mixStudioStatusRepository2.getErrorInfo() : null;
        if (value == null || errorInfo == null) {
            return;
        }
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
        boolean zIsNewUser = hp().isNewUser();
        c440370HOp.getClass();
        C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(value);
        EnumC441390HSn enumC441390HSn = errorInfo.LIZ;
        EnumC441430HSr enumC441430HSr = errorInfo.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTmVQ2).getParam());
        c2344009Gk.LJIIIIZZ("is_new_user", zIsNewUser ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("element", c0hgyLJIILIIL.getParam());
        c2344009Gk.LJIIIIZZ("error_type", enumC441390HSn.getParam());
        c2344009Gk.LJIIIIZZ("error_detail", enumC441430HSr.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_enter_generation_failure_panel", c2344009Gk.LIZ);
    }

    public final int kp() {
        return ((Number) this.LLJJJJLIIL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, ((Number) this.LLJJJ.getValue()).intValue()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        frameLayout.setPadding(0, 0, 0, ((Number) this.LLJJJIL.getValue()).intValue());
        Zo(frameLayout);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(2131826290);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 58));
        frameLayout.addView(tuxTextView, C435650H6l.LIZ(-2, -2, 0, ((Number) this.LLJJJJ.getValue()).intValue(), ((Number) this.LLJJJJJIL.getValue()).intValue(), 204));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_x_mark_small);
        tuxIconView.setIconWidth(kp());
        tuxIconView.setIconHeight(kp());
        tuxIconView.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 59));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kp(), kp(), 8388661);
        layoutParams.setMarginEnd(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue());
        layoutParams.topMargin = ((Number) this.LLJJL.getValue()).intValue();
        frameLayout.addView(tuxIconView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        imageView.setImageDrawable(c0hti.LIZ(context));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, ((Number) this.LLJL.getValue()).intValue());
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = ((Number) this.LLJLIL.getValue()).intValue();
        linearLayout.addView(imageView, layoutParams2);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setText(2131835858);
        tuxTextView2.setTuxFont(102);
        tuxTextView2.setTextColorRes(R.attr.a1j);
        tuxTextView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMarginStart(((Number) this.LLJLL.getValue()).intValue());
        layoutParams3.setMarginEnd(((Number) this.LLJLL.getValue()).intValue());
        layoutParams3.bottomMargin = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        linearLayout.addView(tuxTextView2, layoutParams3);
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        c197039127h.setText(2131835851);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(1);
        C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 60));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        linearLayout.addView(c197039127h, layoutParams4);
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) hp().LLILLJJLI.getValue();
        if (mixStudioStatusRepository != null) {
            mixStudioStatusRepository.LJIIZILJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLJLLIL;
    }

    public final void lp(C0HTH c0hth) {
        InterfaceC440090HNn value;
        String str;
        C05YD<InterfaceC440090HNn> c05ydLIZ;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLJLLL.getValue();
        C441500HSy errorInfo = null;
        if (mixStudioStatusRepository != null && (c05ydLIZ = mixStudioStatusRepository.LIZ()) != null) {
            value = c05ydLIZ.getValue();
        } else {
            value = null;
        }
        MixStudioStatusRepository mixStudioStatusRepository2 = (MixStudioStatusRepository) this.LLJLLL.getValue();
        if (mixStudioStatusRepository2 != null) {
            errorInfo = mixStudioStatusRepository2.getErrorInfo();
        }
        if (value != null && errorInfo != null) {
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
            boolean zIsNewUser = hp().isNewUser();
            c440370HOp.getClass();
            C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(value);
            EnumC441390HSn enumC441390HSn = errorInfo.LIZ;
            EnumC441430HSr enumC441430HSr = errorInfo.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTmVQ2).getParam());
            if (zIsNewUser) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_new_user", str);
            c2344009Gk.LJIIIIZZ("element", c0hgyLJIILIIL.getParam());
            c2344009Gk.LJIIIIZZ("action_type", c0hth.getParam());
            c2344009Gk.LJIIIIZZ("error_type", enumC441390HSn.getParam());
            c2344009Gk.LJIIIIZZ("error_detail", enumC441430HSr.getParam());
            C20684815ws.LJIILLIIL("imagine_studio_click_generation_failure_panel", c2344009Gk.LIZ);
        }
    }
}
