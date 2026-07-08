package com.ss.android.ugc.aweme.commercialize.feed.assem.playfun;

import X.C01GW;
import X.C04TD;
import X.C07KT;
import X.C0RP1;
import X.C1017070cZd;
import X.C1077120e8U;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C814420VxA;
import X.C995620c12;
import X.C996810c2x;
import X.C996820c2y;
import X.C996840c30;
import X.C996860c32;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC996800c2w;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.IAdPlayFunTranslationAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.abtest.SplashAdAssemOptConfig;
import com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPlayFunAssem extends CommerceContentBaseAssem<AdPlayFunAssem> implements IAdPlayFunAbility, IAdPlayFunTranslationAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 164));
    public final InterfaceC1731706qJ LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public AwS560S0100000_16 LLJLLIL;
    public final AwS590S0100000_11 LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdPlayFunAssem.class, "playFunVM", "getPlayFunVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/playfun/AdPlayFunVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdPlayFunAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdPlayFunVM.class);
        this.LLJJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 109), null, AFwS252S0000000_16.get$arr$(119));
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(120));
        this.LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(121));
        this.LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS252S0000000_16.get$arr$(122));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 108));
        this.LLJLLL = new AwS590S0100000_11(this, 52);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1877745982 || iHashCode == 414912799) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        SplashAdAssemOptConfig splashAdAssemOptConfig;
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995620c12) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(35), 4);
        if (!this.LLJLL && (splashAdAssemOptConfig = (SplashAdAssemOptConfig) C07KT.LIZ.getValue()) != null && Intrinsics.LJFF(splashAdAssemOptConfig.playFunOptV2, Boolean.TRUE) && ((C995620c12) hp().getState()).LL != null) {
            if (this.LLJJIII) {
                ip().start();
            } else {
                this.LLJLLIL = new AwS560S0100000_16(this, 165);
            }
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995620c12) obj).LL;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(36), 4);
        this.LLJLL = true;
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0c2H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995620c12) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(37), 4);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility
    public final int Ho0() {
        ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) this.LLJLILLLLZIIL.getValue();
        if (iCommerceTransAndCaptionAbility == null || !iCommerceTransAndCaptionAbility.GH1()) {
            return 0;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) this.LLJLILLLLZIIL.getValue();
        if (iCommerceTransAndCaptionAbility != null) {
            iCommerceTransAndCaptionAbility.rz1(this.LLJLLL);
        }
    }

    public final FeedAdViewModel ep() {
        return (FeedAdViewModel) this.LLJLIL.getValue();
    }

    public final AdPlayFunVM hp() {
        return (AdPlayFunVM) this.LLJJL.getValue(this, LLJZ[0]);
    }

    public final InterfaceC996800c2w ip() {
        return (InterfaceC996800c2w) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility
    public final Rect getWidgetRect() {
        return ip().getWidgetRect();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        ip().setVisibility(8);
        ip().LIZJ(null);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility
    public final boolean tn() {
        return ip().tn();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.IAdPlayFunTranslationAbility
    public final void Sm2(C996860c32 c996860c32) {
        String str;
        C996840c30 c996840c30 = c996860c32.LIZIZ;
        if (c996840c30 != null && (str = c996840c30.LIZ) != null) {
            ip().LJLILLLLZI(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            return C1017070cZd.LLIILZL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.IAdPlayFunTranslationAbility
    public final void cv2(C996810c2x c996810c2x) {
        String str;
        C996820c2y c996820c2y = c996810c2x.LIZIZ;
        if (c996820c2y != null && (str = c996820c2y.LIZ) != null) {
            ip().LJLILLLLZI(str);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(43), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(44), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0SJx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(45), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0RnN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(38), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(39), 4);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LL;
            }
        }, null, AFwS300S0000000_16.get$arr$(40), 6);
        C736680Sv4.LJIIIIZZ(this, ep(), new C2217381BqS() { // from class: X.0c2B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C996560c2Y) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(41), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0RnL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(42), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Aweme aweme;
        VideoItemParams item;
        Fragment fragment;
        C19EG activity;
        IAdPlayFunAsseUtils iAdPlayFunAsseUtils;
        AwemePlayFunModel playFunModel;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme2 = videoItemParams2.getAweme();
        if (aweme2 != null) {
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            UrlModel urlModel = null;
            if (awemeRawAd != null && (playFunModel = awemeRawAd.getPlayFunModel()) != null) {
                urlModel = playFunModel.imageInfo;
            }
            VideoItemParams item2 = hp().getItem();
            if (item2 != null && (aweme = item2.getAweme()) != null && (item = hp().getItem()) != null && (fragment = item.fragment) != null && (activity = fragment.getActivity()) != null) {
                Object objLIZ = C04TD.LIZ(IAdPlayFunAsseUtils.class, false);
                if (objLIZ != null) {
                    iAdPlayFunAsseUtils = (IAdPlayFunAsseUtils) objLIZ;
                } else {
                    if (C04TD.LLLIL == null) {
                        synchronized (IAdPlayFunAsseUtils.class) {
                            if (C04TD.LLLIL == null) {
                                C04TD.LLLIL = new AdPlayFunAsseUtils();
                            }
                        }
                    }
                    iAdPlayFunAsseUtils = C04TD.LLLIL;
                }
                if (iAdPlayFunAsseUtils != null && urlModel != null) {
                    iAdPlayFunAsseUtils.LIZ(aweme);
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LJJIL(activity);
                    c1331670kl3LJIIIIZZ.LJJII(new C1077120e8U(iAdPlayFunAsseUtils, aweme, 0));
                }
            }
            ip().LIZJ(aweme2);
        }
        ip().LJIIIIZZ(videoItemParams2.dataCenter);
        ip().setVisibility(8);
        ip().LJFF(this);
        AwS560S0100000_16 awS560S0100000_16 = this.LLJLLIL;
        if (awS560S0100000_16 != null) {
            awS560S0100000_16.invoke();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        ICommerceTransAndCaptionAbility iCommerceTransAndCaptionAbility = (ICommerceTransAndCaptionAbility) this.LLJLILLLLZIIL.getValue();
        if (iCommerceTransAndCaptionAbility != null) {
            iCommerceTransAndCaptionAbility.pg1(this.LLJLLL);
        }
    }
}
