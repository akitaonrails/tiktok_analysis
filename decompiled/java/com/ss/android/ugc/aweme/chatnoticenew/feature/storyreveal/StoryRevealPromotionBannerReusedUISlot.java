package com.ss.android.ugc.aweme.chatnoticenew.feature.storyreveal;

import X.C01GW;
import X.C06IT;
import X.C0I73;
import X.C0VSJ;
import X.C0ZHB;
import X.C1275704yx;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C13LE;
import X.C1559260qg8;
import X.C1684506ih;
import X.C197039127h;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class StoryRevealPromotionBannerReusedUISlot extends ReusedUISlotAssem<StoryRevealPromotionBannerReusedUISlot> implements InterfaceC712990Rxx<C1275704yx> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL = C06IT.LIZ(this);
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 146));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 145));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 147));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 144));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryRevealPromotionBannerReusedUISlot.class, "noticeVM", "getNoticeVM()Lcom/ss/android/ugc/aweme/im/prompts/api/chatnotice/flow/base/viewmodel/ICommonChatNoticeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cs_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        Context context = getContext();
        if (context != null) {
            View view2 = (View) this.LLJLIL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C0I73.LIZ);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
            view2.setBackground(c384050F3z.LIZ(context));
            View view3 = (View) this.LLJLILLLLZIIL.getValue();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            view3.setBackground(c384050F3z2.LIZ(context));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C1275704yx c1275704yx) {
        String strLJI;
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL);
        c1684506ih.LIZJ = c1275704yx.LL;
        c1684506ih.LIZLLL(51);
        c1684506ih.LIZJ(getContext());
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(this, c1684506ih, 121);
        C786410Ut5.a9((TuxIconView) this.LLJLILLLLZIIL.getValue(), new ACListenerS149S0100000_14(awS415S0200000_14, 74));
        C786410Ut5.U8((C197039127h) this.LLJLLIL.getValue(), new ACListenerS122S0200000_19(this, awS415S0200000_14, 77));
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGeckoCommonChannelManager.class);
        if (iDMGeckoCommonChannelManager != null && (strLJI = iDMGeckoCommonChannelManager.LJI()) != null && strLJI.length() != 0 && new C0VSJ(strLJI).exists()) {
            C786410Ut5.LLFF(0, (SmartImageView) this.LLJLL.getValue());
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLJI));
            c1331670kl3LJII.LJJ((SmartImageView) this.LLJLL.getValue());
            C1332130kln.LJFF(c1331670kl3LJII, "Story_Reveal_Promo_Banner", null, false, null, null, null, 62);
            return;
        }
        C786410Ut5.LLFF(8, (SmartImageView) this.LLJLL.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1275704yx c1275704yx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1275704yx c1275704yx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
