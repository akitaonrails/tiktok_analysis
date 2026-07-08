package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base;

import X.C01GW;
import X.C07E5;
import X.C0PXJ;
import X.C1322090kVb;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332060klg;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1744700vVE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C656290Poh;
import X.C685130Qu7;
import X.C723830SaL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC657870PrF;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.pov.viewmodel.SearchPovCardVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchNimbleDocBaseAssem extends ReusedUISlotAssem<SearchNimbleDocBaseAssem> implements InterfaceC712990Rxx<C656290Poh> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public View LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchNimbleDocBaseAssem.class, "povCardVM", "getPovCardVM()Lcom/ss/android/ugc/aweme/search/pages/result/pov/viewmodel/SearchPovCardVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchNimbleDocBaseAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPovCardVM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 586), AFwS241S0000000_10.get$arr$(274), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 584));
        this.LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 582));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 585));
        this.LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 581));
        this.LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 587));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyw;
    }

    public abstract InterfaceC657870PrF sp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 243));
        C427690Gpr.LJ(getContentView(), C418440Gaw.LIZIZ(8));
        C786410Ut5.I7(new AbS692S0100000_10(this, 8), getContentView());
        C0PXJ c0pxj = C0PXJ.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 583);
        c0pxj.getClass();
        C0PXJ.LJFF(view, interfaceC665370Q7z, awS554S0100000_10);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void tp(C656290Poh c656290Poh) {
        UrlModel cover;
        Template template;
        NimbleConfig nimbleConfig;
        NimbleConfig nimbleConfig2;
        UrlModel cover2;
        int i;
        Template template2 = c656290Poh.LLILLJJLI;
        if (template2 != null) {
            C1744700vVE.LJIIJ(C685130Qu7.LIZ(template2, true, ((View) this.LLJLILLLLZIIL.getValue()).getContext()), (View) this.LLJLILLLLZIIL.getValue());
            NimbleConfig nimbleConfig3 = template2.config;
            if (nimbleConfig3 != null) {
                Float f = nimbleConfig3.videoSizeRatio;
                if (f != null && f.floatValue() > 0.0f) {
                    float fFloatValue = f.floatValue();
                    FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) this.LLJLILLLLZIIL.getValue();
                    fixedRatioFrameLayout.LLILLJJLI = fFloatValue;
                    fixedRatioFrameLayout.LL = 1;
                }
                View view = this.LLJLLIL;
                if (view != null) {
                    if (Intrinsics.LJFF(nimbleConfig3.videoPlayIcon, Boolean.TRUE)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view);
                }
            }
        }
        Template template3 = c656290Poh.LLILLJJLI;
        if (template3 != null && (nimbleConfig2 = template3.config) != null && Intrinsics.LJFF(nimbleConfig2.aggregatable, Boolean.FALSE)) {
            Video video = c656290Poh.LL.getVideo();
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
        }
        SmartImageView smartImageView = this.LLJLL;
        if (smartImageView != null) {
            if (!AwemeExtKt.isPhotoMode(c656290Poh.LL) && (template = c656290Poh.LLILLJJLI) != null && (nimbleConfig = template.config) != null && Intrinsics.LJFF(nimbleConfig.aggregatable, Boolean.FALSE)) {
                smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_INSIDE);
            } else {
                smartImageView.setActualImageScaleType(EnumC1338240kve.FOCUS_CROP);
            }
            Video video2 = c656290Poh.LL.getVideo();
            if (video2 != null && (cover = video2.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ2.LJJIIZI((Drawable) this.LLJLLL.getValue());
                c1331670kl3LJIIIIZZ2.LJIL((Drawable) this.LLJLLL.getValue());
                c1331670kl3LJIIIIZZ2.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ2.LJIIJJI();
                return;
            }
            smartImageView.setController(null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C656290Poh c656290Poh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C656290Poh c656290Poh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
