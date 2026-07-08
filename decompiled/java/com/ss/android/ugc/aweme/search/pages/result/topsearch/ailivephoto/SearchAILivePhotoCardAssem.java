package com.ss.android.ugc.aweme.search.pages.result.topsearch.ailivephoto;

import X.C01GW;
import X.C1331670kl3;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C452501pT;
import X.C663020PzY;
import X.C689700R3o;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.zhiliaoapp.musically.R;
import irm.AkS55S0200000_10;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAILivePhotoCardAssem extends ReusedUISlotAssem<SearchAILivePhotoCardAssem> implements InterfaceC712990Rxx<C663020PzY> {
    public C663020PzY LLJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 668));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 670));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 672));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 671));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 669));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etf;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        IAILiveService aILiveService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aILiveService = iExternalService.getAILiveService()) != null) {
            SmartImageView smartImageView = (SmartImageView) this.LLJLIL.getValue();
            smartImageView.setClipToOutline(true);
            smartImageView.setOutlineProvider(new C689700R3o(0));
            C1331670kl3 c1331670kl3 = new C1331670kl3(aILiveService.getAILivePhotoEntranceCoverUrl());
            c1331670kl3.LJIILL = (Drawable) this.LLJJLIIIJLLLLLLLZ.getValue();
            c1331670kl3.LJIJ = (Drawable) this.LLJJLIIIJLLLLLLLZ.getValue();
            smartImageView.LIZ(c1331670kl3.LIZJ());
            ((TextView) this.LLJLILLLLZIIL.getValue()).setText(IAILiveService.DefaultImpls.getDynamicString$default(aILiveService, 2131820708, null, new Object[0], 2, null));
            C197039127h c197039127h = (C197039127h) this.LLJLL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c197039127h.setBackground(c384050F3z.LIZ(view.getContext()));
            C427690Gpr.LJ(c197039127h, C418440Gaw.LIZIZ(200));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_video_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
            c197039127h.setButtonStartIconDrawable(c419910GdJ.LIZ(view.getContext()));
            C427690Gpr.LJ((View) this.LLJLLIL.getValue(), C418440Gaw.LIZIZ(10));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C663020PzY c663020PzY) {
        C663020PzY c663020PzY2 = c663020PzY;
        this.LLJL = c663020PzY2;
        C786410Ut5.I7(new AkS55S0200000_10(this, c663020PzY2, 0), (View) this.LLJLLIL.getValue());
        C786410Ut5.I7(new AkS55S0200000_10(this, c663020PzY2, 1), (View) this.LLJLL.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C663020PzY c663020PzY) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C663020PzY c663020PzY) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
