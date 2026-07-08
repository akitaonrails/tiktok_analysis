package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton;

import X.C0ID9;
import X.C0R48;
import X.C1378990lzN;
import X.C418440Gaw;
import X.C435210H4t;
import X.C486820J7g;
import X.C655610Pnb;
import X.C661010PwJ;
import X.C662850PzH;
import X.C662890PzL;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC646330PWt;
import X.InterfaceC1587906Jp;
import X.InterfaceC657510Pqf;
import X.InterfaceC662780PzA;
import X.InterfaceC662940PzQ;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcStoreLiveV2Assem extends ReusedUISlotAssem<EcStoreLiveV2Assem> implements InterfaceC712990Rxx<C661010PwJ> {
    public static final /* synthetic */ int LLLF = 0;
    public final EnumC646330PWt LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public LinearLayout LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public FixedRatioFrameLayout LLJLL;
    public FrameLayout LLJLLIL;
    public FrameLayout LLJLLL;
    public FrameLayout LLJZ;
    public C661010PwJ LLJZIJLIL;
    public InterfaceC662780PzA LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bqq;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final LinearLayout sp() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.koe) : null;
            this.LLJLILLLLZIIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout tp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pw4) : null;
            this.LLJLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final FixedRatioFrameLayout up() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ubv) : null;
            this.LLJLL = (FixedRatioFrameLayout) viewFindViewById;
        }
        return (FixedRatioFrameLayout) viewFindViewById;
    }

    public final FrameLayout yp() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.y4k) : null;
            this.LLJLLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public EcStoreLiveV2Assem(EnumC646330PWt enumC646330PWt) {
        this.LLJJLIIIJLLLLLLLZ = enumC646330PWt;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 6));
        view.addOnAttachStateChangeListener(new C0R48(view, this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(android.widget.LinearLayout r25) {
        /*
            Method dump skipped, instruction units count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem.op(android.widget.LinearLayout):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C661010PwJ c661010PwJ) {
        Aweme aweme;
        EComShopCardStruct eComShopCardStruct;
        EComShopCardStruct eComShopCardStruct2;
        final AwemeRawAd awemeRawAd;
        String str;
        EComShopCardStruct eComShopCardStruct3;
        C661010PwJ c661010PwJ2 = c661010PwJ;
        this.LLJZIJLIL = c661010PwJ2;
        C786410Ut5.I7(new AjS65S0100000_10(this, 28), up());
        C786410Ut5.LJJJJJL(tp());
        C786410Ut5.LJJJJJL(sp());
        C661010PwJ c661010PwJ3 = this.LLJZIJLIL;
        InterfaceC662780PzA interfaceC662780PzALJIJI = null;
        if (c661010PwJ3 != null) {
            aweme = c661010PwJ3.LLILLJJLI;
        } else {
            aweme = null;
        }
        if (C486820J7g.LIZ(aweme)) {
            int i = C662890PzL.LIZ[this.LLJJLIIIJLLLLLLLZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        up().setWhRatio(0.75f);
                        up().setClipToOutline(true);
                        up().setOutlineProvider(new C0ID9(35));
                        C1378990lzN.LIZIZ(sp(), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
                        C435210H4t.LIZJ(sp(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                        View viewFindViewById = this.LLJZ;
                        if (viewFindViewById == null) {
                            View viewLJJIJL = LJJIJL();
                            if (viewLJJIJL != null) {
                                viewFindViewById = viewLJJIJL.findViewById(R.id.kof);
                            } else {
                                viewFindViewById = null;
                            }
                            this.LLJZ = (FrameLayout) viewFindViewById;
                        }
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        View viewFindViewById2 = this.LLJZ;
                        if (viewFindViewById2 == null) {
                            View viewLJJIJL2 = LJJIJL();
                            if (viewLJJIJL2 != null) {
                                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.kof);
                            } else {
                                viewFindViewById2 = null;
                            }
                            this.LLJZ = (FrameLayout) viewFindViewById2;
                        }
                        C1378990lzN.LIZ(viewFindViewById2, null, null, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)));
                        op(sp());
                    }
                } else {
                    up().setWhRatio(0.75f);
                    up().setClipToOutline(true);
                    up().setOutlineProvider(new C0ID9(34));
                    C1378990lzN.LIZ(sp(), null, null, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)));
                    C786410Ut5.LJLLLLLL(0, yp());
                    op(sp());
                }
            } else {
                up().setWhRatio(0.79f);
                View viewFindViewById3 = this.LLJLLIL;
                if (viewFindViewById3 == null) {
                    View viewLJJIJL3 = LJJIJL();
                    if (viewLJJIJL3 != null) {
                        viewFindViewById3 = viewLJJIJL3.findViewById(R.id.ubw);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJLLIL = (FrameLayout) viewFindViewById3;
                }
                C1378990lzN.LIZ(viewFindViewById3, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null);
                C1378990lzN.LIZ(tp(), null, null, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)));
                C786410Ut5.LJLLLLLL(0, yp());
                op(tp());
            }
        } else {
            up().setWhRatio(1.33f);
            View viewFindViewById4 = this.LLJLLIL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById4 = viewLJJIJL4.findViewById(R.id.ubw);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJLLIL = (FrameLayout) viewFindViewById4;
            }
            C1378990lzN.LIZ(viewFindViewById4, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null);
            C1378990lzN.LIZ(tp(), null, null, null, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)));
            C786410Ut5.LJLLLLLL(0, yp());
            op(tp());
        }
        SearchMixFeedBase searchMixFeedBase = c661010PwJ2.LL;
        if (searchMixFeedBase != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && C662850PzH.LJ(eComShopCardStruct) && (eComShopCardStruct2 = c661010PwJ2.LL.shopCard) != null && (awemeRawAd = eComShopCardStruct2.awemeRawAd) != null) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null) {
                SearchMixFeedBase searchMixFeedBase2 = c661010PwJ2.LL;
                if (searchMixFeedBase2 == null || (eComShopCardStruct3 = searchMixFeedBase2.shopCard) == null || (str = eComShopCardStruct3.shopId) == null) {
                    str = "";
                }
                interfaceC662780PzALJIJI = interfaceC657510PqfLIZLLL.LJIJI(str, true, new InterfaceC662940PzQ() { // from class: X.0PzO
                    @Override // X.InterfaceC662940PzQ
                    public final AwemeRawAd getRawAd() {
                        return awemeRawAd;
                    }
                });
            }
            this.LLL = interfaceC662780PzALJIJI;
            if (interfaceC662780PzALJIJI != null) {
                interfaceC662780PzALJIJI.bind();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C661010PwJ c661010PwJ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C661010PwJ c661010PwJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(final boolean r20, final com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts r21, java.lang.Integer r22) {
        /*
            r19 = this;
            r4 = r19
            X.0PwJ r0 = r4.LLJZIJLIL
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.LLILLJJLI
            if (r9 == 0) goto Lbf
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility> r0 = com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility.class
            X.01wD r7 = X.C1558520qew.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility r7 = (com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility) r7
            com.bytedance.android.btm.api.BtmSDK r13 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            if (r22 == 0) goto L30
            int r2 = r22.intValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "_w6322_i"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            if (r1 != 0) goto L32
        L30:
            java.lang.String r1 = ""
        L32:
            java.lang.String r0 = "c3812.d4738"
            java.lang.String r6 = r0.concat(r1)
            com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout r0 = r4.up()
            com.bytedance.android.btm.api.model.PageFinder r5 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            X.188v r1 = com.bytedance.android.bcm.api.model.BcmParams.Companion
            r2 = 0
            r3 = r21
            if (r3 == 0) goto Lc2
            com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent r0 = r3.bcmStandardTrackEvent
            if (r0 == 0) goto Lc2
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.chainParamMap
        L4d:
            r1.getClass()
            com.bytedance.android.bcm.api.model.BcmParams r0 = X.C212367188v.LIZJ(r0)
            java.lang.String r0 = r13.createJumpSourceBtmToken(r6, r5, r0)
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSourceBtmToken(r9, r0)
            X.0PzC r6 = new X.0PzC
            r5 = r20
            r6.<init>(r5, r4, r3, r0)
            X.0PwJ r0 = r4.LLJZIJLIL
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase r0 = r0.LL
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct r0 = r0.shopCard
        L6c:
            boolean r1 = X.C662850PzH.LJ(r0)
            r0 = 1
            if (r1 != r0) goto L90
            r9.setAd(r0)
            X.0PwJ r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase r0 = r0.LL
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct r0 = r0.shopCard
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.awemeRawAd
        L84:
            r9.setAwemeRawAd(r2)
            X.0PzA r1 = r4.LLL
            if (r1 == 0) goto L90
            X.0Q1G r0 = X.C0Q1G.LIVE_COVER
            r1.LJIL(r0)
        L90:
            java.lang.String r14 = "a2270.b6880.c3812.d4738"
            com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout r0 = r4.up()
            com.bytedance.android.btm.api.model.PageFinder r15 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            r12 = 0
            r17 = 4
            r16 = r12
            r18 = r12
            java.util.Map r2 = com.bytedance.android.btm.api.BtmSDK.createReportParams$default(r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r1 = X.C0Q3E.LIZJ(r9)
            X.0Pmy r0 = new X.0Pmy
            r0.<init>(r6)
            r1.fe(r0)
            X.0Q7z r8 = X.C1558520qew.LJIIL(r4)
            X.0PzB r10 = new X.0PzB
            r10.<init>(r4, r5, r3, r2)
            r11 = 0
            r13 = r12
            r7.GV0(r8, r9, r10, r11, r12, r13)
        Lbf:
            return
        Lc0:
            r0 = r2
            goto L6c
        Lc2:
            r0 = r2
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem.zp(boolean, com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts, java.lang.Integer):void");
    }
}
