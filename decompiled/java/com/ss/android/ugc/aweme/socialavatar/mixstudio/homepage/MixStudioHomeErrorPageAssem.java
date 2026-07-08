package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.C01GW;
import X.C0HTI;
import X.C1308910kAL;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC440890HQp;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioHomeErrorPageAssem extends MixStudioPageAssem {
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(206));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(207));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(202));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(203));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(201));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(204));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(205));
    public final EnumC440890HQp LLJL = EnumC440890HQp.HOME_ERROR;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public final int kp() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) hp().LLILLJJLI.getValue();
        if (mixStudioStatusRepository != null) {
            mixStudioStatusRepository.LJIIZILJ();
        }
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
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_x_mark_small);
        tuxIconView.setIconWidth(kp());
        tuxIconView.setIconHeight(kp());
        tuxIconView.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 64));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kp(), kp(), 8388661);
        layoutParams.setMarginEnd(((Number) this.LLJJJJLIIL.getValue()).intValue());
        layoutParams.topMargin = ((Number) this.LLJJJJJIL.getValue()).intValue();
        frameLayout.addView(tuxIconView, layoutParams);
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nl;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = context.getString(2131835857);
        c1722300uv6.LJIIIIZZ = context.getString(2131835856);
        int iIntValue = ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
        int iIntValue2 = ((Number) this.LLJJL.getValue()).intValue();
        c1722300uv6.LIZLLL = iIntValue;
        c1722300uv6.LJ = iIntValue2;
        c1749280vcc.setStatus(c1722300uv6);
        frameLayout.addView(c1749280vcc, new FrameLayout.LayoutParams(-1, -1, 17));
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLJL;
    }
}
