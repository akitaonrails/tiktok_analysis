package com.ss.android.ugc.aweme.poi.detail.dishes.gallery;

import X.AbstractC738140SxQ;
import X.C1182540gsW;
import X.C1182610gsd;
import X.C1202300hOO;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C19EG;
import X.C19HL;
import X.C19HN;
import X.C19IN;
import X.C2217381BqS;
import X.C339190DRl;
import X.C426750GoL;
import X.C427690Gpr;
import X.C451610HnL;
import X.C452070Ho5;
import X.C631370Opb;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1325460kb2;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryVM;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendDishesGalleryAssem extends ReusedUISlotAssem<PoiRecommendDishesGalleryAssem> implements InterfaceC712990Rxx<C1182540gsW> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public C19HL LLJJLIIIJLLLLLLLZ;
    public C1749280vcc LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C1202300hOO LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C736950SvV LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRecommendDishesGalleryAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/dishes/gallery/PoiRecommendDishesGalleryVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e3z;
    }

    public final List<View> op() {
        return C1697810uHb.LJIIJJI(this.LLJLLIL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLL, this.LLJZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public PoiRecommendDishesGalleryAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRecommendDishesGalleryVM.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1125), null, AFwS256S0000000_18.get$arr$(395));
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1124);
        this.LLLF = new C736950SvV(C13LE.LIZ(PoiRecommendDishesVM.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(396), new AwS562S0100000_18((AbstractC738140SxQ) this, 1126), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final PoiRecommendDishesVM sp() {
        return (PoiRecommendDishesVM) this.LLLF.getValue();
    }

    public final PoiRecommendDishesGalleryVM tp() {
        return (PoiRecommendDishesGalleryVM) this.LLL.getValue(this, LLLFF[0]);
    }

    public final View Ap() {
        if (Bo()) {
            return LJJIJL();
        }
        return null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        Matrix matrixLIZLLL = C19HN.LIZLLL();
        C19HL c19hl = this.LLJJLIIIJLLLLLLLZ;
        if (c19hl != null) {
            c19hl.LJIIJJI(matrixLIZLLL, 0L, null, null);
        }
        C19HN.LIZJ(matrixLIZLLL);
    }

    public final boolean up() {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isAdded() && !fragmentLJI.isDetached() && !fragmentLJI.isRemoving()) {
            return true;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (lifecycle = c19egLIZ.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null) {
            currentState = Lifecycle.State.DESTROYED;
        }
        return currentState.compareTo(Lifecycle.State.CREATED) > 0;
    }

    public final void Bp(boolean z) {
        Integer numLIZJ;
        if (z) {
            Context context = getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
            } else {
                return;
            }
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                return;
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, context2);
            }
        }
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLJLLL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
        }
    }

    public final void Ep(long j) {
        if (j > 0) {
            TuxTextView tuxTextView = this.LLJZ;
            if (tuxTextView != null) {
                tuxTextView.setText(C1843500y4a.LIZIZ(j));
            }
            TuxTextView tuxTextView2 = this.LLJZ;
            if (tuxTextView2 != null) {
                C339190DRl.LIZLLL(tuxTextView2);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJZ;
        if (tuxTextView3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, tuxTextView3);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        this.LLJJLIIIJLLLLLLLZ = (C19HL) view.findViewById(R.id.r2o);
        this.LLJL = (C1749280vcc) view.findViewById(R.id.r30);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fx7);
        if (C426750GoL.LIZLLL(tuxTextView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        tuxTextView.setTextDirection(i);
        this.LLJLIL = tuxTextView;
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.fx_);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.fx9);
        C1202300hOO c1202300hOO = (C1202300hOO) view.findViewById(R.id.fx3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            c1202300hOO.setExpandActionColor(iIntValue);
            c1202300hOO.setCollapseActionColor(iIntValue);
        }
        this.LLJLLIL = c1202300hOO;
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.k1i);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.ztv);
        this.LLJZIJLIL = view.findViewById(R.id.mm2);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0gsc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1182570gsZ) obj).LLILLJJLI);
            }
        }, null, AFwS302S0000000_18.get$arr$(7), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0gsa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1182570gsZ) obj).LLILLL);
            }
        }, null, AFwS302S0000000_18.get$arr$(8), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0gsb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1182570gsZ) obj).LLILZ);
            }
        }, null, AFwS302S0000000_18.get$arr$(9), 6);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0gsY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1182480gsQ) obj).LLILLJJLI;
            }
        }, null, AFwS302S0000000_18.get$arr$(6), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1182540gsW c1182540gsW) {
        long likeNum;
        List<UrlModel> images;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        String desc;
        String desc2;
        String priceCurrency;
        String name;
        C1182540gsW c1182540gsW2 = c1182540gsW;
        TuxTextView tuxTextView = this.LLJLIL;
        String priceNum = null;
        if (tuxTextView != null) {
            PoiDetailApi.RecommendedDish recommendedDish = c1182540gsW2.LL;
            if (recommendedDish != null) {
                name = recommendedDish.getName();
            } else {
                name = null;
            }
            tuxTextView.setText(name);
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            PoiDetailApi.RecommendedDish recommendedDish2 = c1182540gsW2.LL;
            if (recommendedDish2 != null) {
                priceCurrency = recommendedDish2.getPriceCurrency();
            } else {
                priceCurrency = null;
            }
            tuxTextView2.setText(priceCurrency);
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            PoiDetailApi.RecommendedDish recommendedDish3 = c1182540gsW2.LL;
            if (recommendedDish3 != null) {
                priceNum = recommendedDish3.getPriceNum();
            }
            tuxTextView3.setText(priceNum);
        }
        C1202300hOO c1202300hOO = this.LLJLLIL;
        String str2 = "";
        boolean userLiked = false;
        if (c1202300hOO != null) {
            PoiDetailApi.RecommendedDish recommendedDish4 = c1182540gsW2.LL;
            if (recommendedDish4 != null && (desc = recommendedDish4.getDesc()) != null && desc.length() != 0) {
                C786410Ut5.n0(c1202300hOO, 0);
                PoiDetailApi.RecommendedDish recommendedDish5 = c1182540gsW2.LL;
                if (recommendedDish5 == null || (desc2 = recommendedDish5.getDesc()) == null) {
                    desc2 = "";
                }
                c1202300hOO.setOriginalText(desc2);
                c1202300hOO.setCollapseAction("");
                boolean z = c1182540gsW2.LLILLJJLI;
                c1202300hOO.setExpanded$poi_release(z);
                if (z && c1202300hOO.LLJZIJLIL) {
                    View view = this.LLJZIJLIL;
                    if (view != null) {
                        C339190DRl.LIZLLL(view);
                    }
                } else {
                    View view2 = this.LLJZIJLIL;
                    if (view2 != null) {
                        C339190DRl.LIZIZ(view2);
                    }
                }
                final int i = 1;
                C786410Ut5.I7(new C19IN(this, i) { // from class: X.0hYk
                    public final int $t;
                    public Object l0;

                    @Override // X.C19IN
                    public final void LIZ(View view3) {
                        switch (this.$t) {
                            case 0:
                                LIZ$0(this, view3);
                                break;
                            case 1:
                                LIZ$1(this, view3);
                                break;
                            default:
                                super.LIZ(view3);
                                break;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                        this.$t = i;
                        this.l0 = this;
                    }

                    public static final void LIZ$0(C1208720hYk c1208720hYk, View view3) {
                        PoiRecommendDishesGalleryVM poiRecommendDishesGalleryVMTp = ((PoiRecommendDishesGalleryAssem) c1208720hYk.l0).tp();
                        poiRecommendDishesGalleryVMTp.getClass();
                        poiRecommendDishesGalleryVMTp.setState(AFwS256S0000000_18.get$arr$(872));
                        C1182540gsW item = poiRecommendDishesGalleryVMTp.getItem();
                        if (item != null) {
                            item.LLILLJJLI = !item.LLILLJJLI;
                        }
                    }

                    public static final void LIZ$1(C1208720hYk c1208720hYk, View view3) {
                        PoiRecommendDishesGalleryVM poiRecommendDishesGalleryVMTp = ((PoiRecommendDishesGalleryAssem) c1208720hYk.l0).tp();
                        poiRecommendDishesGalleryVMTp.getClass();
                        poiRecommendDishesGalleryVMTp.setState(AFwS256S0000000_18.get$arr$(872));
                        C1182540gsW item = poiRecommendDishesGalleryVMTp.getItem();
                        if (item != null) {
                            item.LLILLJJLI = !item.LLILLJJLI;
                        }
                    }
                }, c1202300hOO);
            } else {
                C786410Ut5.n0(c1202300hOO, 8);
                View view3 = this.LLJZIJLIL;
                if (view3 != null) {
                    C339190DRl.LIZIZ(view3);
                }
            }
        }
        View view4 = this.LLJZIJLIL;
        if (view4 != null) {
            final int i2 = 0;
            C786410Ut5.I7(new C19IN(this, i2) { // from class: X.0hYk
                public final int $t;
                public Object l0;

                @Override // X.C19IN
                public final void LIZ(View view32) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view32);
                            break;
                        case 1:
                            LIZ$1(this, view32);
                            break;
                        default:
                            super.LIZ(view32);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                    this.$t = i2;
                    this.l0 = this;
                }

                public static final void LIZ$0(C1208720hYk c1208720hYk, View view32) {
                    PoiRecommendDishesGalleryVM poiRecommendDishesGalleryVMTp = ((PoiRecommendDishesGalleryAssem) c1208720hYk.l0).tp();
                    poiRecommendDishesGalleryVMTp.getClass();
                    poiRecommendDishesGalleryVMTp.setState(AFwS256S0000000_18.get$arr$(872));
                    C1182540gsW item = poiRecommendDishesGalleryVMTp.getItem();
                    if (item != null) {
                        item.LLILLJJLI = !item.LLILLJJLI;
                    }
                }

                public static final void LIZ$1(C1208720hYk c1208720hYk, View view32) {
                    PoiRecommendDishesGalleryVM poiRecommendDishesGalleryVMTp = ((PoiRecommendDishesGalleryAssem) c1208720hYk.l0).tp();
                    poiRecommendDishesGalleryVMTp.getClass();
                    poiRecommendDishesGalleryVMTp.setState(AFwS256S0000000_18.get$arr$(872));
                    C1182540gsW item = poiRecommendDishesGalleryVMTp.getItem();
                    if (item != null) {
                        item.LLILLJJLI = !item.LLILLJJLI;
                    }
                }
            }, view4);
        }
        PoiDetailApi.RecommendedDish recommendedDish6 = c1182540gsW2.LL;
        if (recommendedDish6 != null) {
            userLiked = recommendedDish6.getUserLiked();
        }
        Bp(userLiked);
        PoiDetailApi.RecommendedDish recommendedDish7 = c1182540gsW2.LL;
        if (recommendedDish7 != null) {
            likeNum = recommendedDish7.getLikeNum();
        } else {
            likeNum = 0;
        }
        Ep(likeNum);
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS57S0200000_18(c1182540gsW2, this, 18), tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJLLL;
        if (tuxIconView2 != null) {
            C427690Gpr.LJIIIZ(tuxIconView2);
        }
        PoiDetailApi.RecommendedDish recommendedDish8 = c1182540gsW2.LL;
        if (recommendedDish8 != null && (images = recommendedDish8.getImages()) != null && (urlModel = (UrlModel) C13LP.LJJJLL(images)) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            str2 = str;
        }
        int iLIZIZ = C631370Opb.LIZIZ(this);
        Uri uri = UriProtector.parse(str2);
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ != null) {
            interfaceC1325460kb2LIZJ.LJIIL(uri, new C1182610gsd(iLIZIZ, uri, this));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1182540gsW c1182540gsW) {
        return true;
    }

    public final void zp(PoiDetailApi.RecommendedDish recommendedDish) {
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility;
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility2;
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility3;
        sp().vQ2(recommendedDish.copy(recommendedDish.dishId, recommendedDish.images, recommendedDish.name, recommendedDish.desc, recommendedDish.likeNum, recommendedDish.userLiked, recommendedDish.priceNum, recommendedDish.priceCurrency, recommendedDish.cropImages));
        if (up()) {
            if (recommendedDish.getUserLiked()) {
                View viewAp = Ap();
                if (viewAp != null && (poiRecommendDishesGalleryAbility3 = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewAp, null), PoiRecommendDishesGalleryAbility.class, null)) != null) {
                    poiRecommendDishesGalleryAbility3.v02(recommendedDish);
                }
            } else {
                View viewAp2 = Ap();
                if (viewAp2 != null && (poiRecommendDishesGalleryAbility = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewAp2, null), PoiRecommendDishesGalleryAbility.class, null)) != null) {
                    poiRecommendDishesGalleryAbility.AP2(recommendedDish);
                }
            }
            View viewAp3 = Ap();
            if (viewAp3 != null && (poiRecommendDishesGalleryAbility2 = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewAp3, null), PoiRecommendDishesGalleryAbility.class, null)) != null) {
                poiRecommendDishesGalleryAbility2.yv2("click");
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1182540gsW c1182540gsW) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(int r18, boolean r19, android.graphics.Bitmap r20, android.net.Uri r21) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem.yp(int, boolean, android.graphics.Bitmap, android.net.Uri):void");
    }
}
