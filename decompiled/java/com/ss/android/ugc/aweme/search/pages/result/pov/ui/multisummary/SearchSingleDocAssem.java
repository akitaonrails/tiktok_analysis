package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C1322090kVb;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332060klg;
import X.C13LE;
import X.C1829707Ep;
import X.C23271099x;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C621850OaF;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C948503nH;
import X.EnumC1338240kve;
import X.InterfaceC1587906Jp;
import X.InterfaceC657870PrF;
import X.InterfaceC658090Prb;
import X.InterfaceC712990Rxx;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.markdown.SearchMarkDownContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchSingleDocAssem extends ReusedUISlotAssem<SearchSingleDocAssem> implements InterfaceC712990Rxx<InterfaceC658090Prb> {
    public SmartImageView LLJLL;
    public View LLJLLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 660));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 661));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 659));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 658));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 657));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f36;
    }

    public void sp() {
    }

    public abstract InterfaceC657870PrF tp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 262));
        C427690Gpr.LJ(getContentView(), C418440Gaw.LIZIZ(8));
        C786410Ut5.I7(new AbS692S0100000_10(this, 17), getContentView());
    }

    public final void op(InterfaceC658090Prb interfaceC658090Prb) {
        int i;
        UrlModel cover;
        UrlModel cover2;
        int i2 = 0;
        if (C1829707Ep.LIZ()) {
            C723830SaL.LJ(this, ((InterfaceC657870PrF) this.LLJL.getValue()).LIZ(), true, new AwS554S0100000_10(this, 656));
        }
        Video video = interfaceC658090Prb.getAweme().getVideo();
        Object obj = null;
        if (video != null && (cover2 = video.getCover()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover2));
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJIIIIZZ = 358;
            c1331670kl3LJIIIIZZ.LJIIIZ = 201;
            c1331670kl3LJIIIIZZ.LJJIFFI = new C1332060klg(25, 3, 0);
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLIL.getValue());
            c1331670kl3LJIIIIZZ.LJIIJJI();
        } else {
            ((C1322090kVb) this.LLJLIL.getValue()).setController(null);
        }
        SmartImageView smartImageView = this.LLJLL;
        if (smartImageView != null) {
            if (AwemeExtKt.isPhotoMode(interfaceC658090Prb.getAweme())) {
                smartImageView.setActualImageScaleType(EnumC1338240kve.FOCUS_CROP);
            } else {
                smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_INSIDE);
            }
            Video video2 = interfaceC658090Prb.getAweme().getVideo();
            if (video2 != null && (cover = video2.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ2.LJJIIZI((Drawable) this.LLJLLL.getValue());
                c1331670kl3LJIIIIZZ2.LJIL((Drawable) this.LLJLLL.getValue());
                c1331670kl3LJIIIIZZ2.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ2.LJIIJJI();
            } else {
                smartImageView.setController(null);
            }
        }
        View view = this.LLJLLIL;
        if (view != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            if (((InterfaceC658090Prb) obj).LJIIIZ()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = (View) this.LLJLILLLLZIIL.getValue();
        if (!AwemeExtKt.isPhotoMode(interfaceC658090Prb.getAweme())) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC658090Prb interfaceC658090Prb) {
        InterfaceC658090Prb interfaceC658090Prb2 = interfaceC658090Prb;
        if (interfaceC658090Prb2.LJ()) {
            C339190DRl.LIZLLL((View) this.LLJJLIIIJLLLLLLLZ.getValue());
            C723830SaL.LJ(this, C13LE.LIZ(SearchMarkDownContentAssem.class), false, null);
            C948503nH.LJ(this, C23271099x.INSTANCE, new C621850OaF(this, interfaceC658090Prb2, null));
            return;
        }
        C339190DRl.LIZIZ((View) this.LLJJLIIIJLLLLLLLZ.getValue());
        op(interfaceC658090Prb2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC658090Prb interfaceC658090Prb) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC658090Prb interfaceC658090Prb) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
