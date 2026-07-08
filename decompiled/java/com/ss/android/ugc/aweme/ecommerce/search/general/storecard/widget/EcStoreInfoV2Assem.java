package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget;

import X.C013C;
import X.C0H9H;
import X.C0Q1G;
import X.C0QNG;
import X.C123100dR;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LP;
import X.C1558520qew;
import X.C1608500rxY;
import X.C1610670s13;
import X.C1610770s1D;
import X.C1697810uHb;
import X.C197039127h;
import X.C21532619Oq;
import X.C419910GdJ;
import X.C655610Pnb;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662850PzH;
import X.C662860PzI;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1769850w9n;
import X.InterfaceC1587906Jp;
import X.InterfaceC657510Pqf;
import X.InterfaceC662780PzA;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.EComAddressCardStarlingToTranslated;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopBrandInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.zhiliaoapp.musically.R;
import g1c.AjS42S0200000_10;
import g1c.AjS65S0100000_10;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcStoreInfoV2Assem extends ReusedUISlotAssem<EcStoreInfoAssem> implements InterfaceC712990Rxx<C661010PwJ> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C1610770s1D LLJLL;
    public C1610670s13 LLJLLIL;
    public C21532619Oq LLJLLL;
    public LinearLayout LLJZ;
    public C197039127h LLJZIJLIL;
    public ConstraintLayout LLL;
    public FrameLayout LLLF;
    public C661010PwJ LLLFF;
    public C1608500rxY LLLFFI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bs2;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1610770s1D tp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l2p) : null;
            this.LLJLL = (C1610770s1D) viewFindViewById;
        }
        return (C1610770s1D) viewFindViewById;
    }

    public final C1610670s13 up() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l9h) : null;
            this.LLJLLIL = (C1610670s13) viewFindViewById;
        }
        return (C1610670s13) viewFindViewById;
    }

    public final LinearLayout yp() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ni_) : null;
            this.LLJZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public static TuxTextView op(View view) {
        TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, 0);
        tuxTextView.setText("·");
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, view.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(C0H9H.LIZIZ(4), -2));
        tuxTextView.setTuxFont(61);
        C0H9H.LJFF(C0H9H.LIZIZ(2), tuxTextView);
        return tuxTextView;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 8));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C661010PwJ c661010PwJ) {
        String str;
        boolean zLJFF;
        int i;
        Aweme aweme;
        EComShopCardStruct eComShopCardStruct;
        List<EComAddressCardStarlingToTranslated> list;
        List<EComShopLabel> list2;
        EComShopLabel eComShopLabel;
        List<EComShopLabel> list3;
        SearchMixFeedBase searchMixFeedBase;
        ShopBrandInfo shopBrandInfo;
        String str2;
        C661010PwJ c661010PwJ2 = c661010PwJ;
        EcStoreInfoV2Assem ecStoreInfoV2Assem = this;
        ecStoreInfoV2Assem.LLLFF = c661010PwJ2;
        EComShopCardStruct eComShopCardStruct2 = c661010PwJ2.LL.shopCard;
        View viewFindViewById = null;
        if (eComShopCardStruct2 != null && (shopBrandInfo = eComShopCardStruct2.brandInfo) != null && (str2 = shopBrandInfo.expression) != null && C123100dR.LIZ(str2)) {
            View viewFindViewById2 = ecStoreInfoV2Assem.LLJJLIIIJLLLLLLLZ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = ecStoreInfoV2Assem.LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.zls);
                } else {
                    viewFindViewById2 = null;
                }
                ecStoreInfoV2Assem.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(str2);
            View viewFindViewById3 = ecStoreInfoV2Assem.LLJL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = ecStoreInfoV2Assem.LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.zlt);
                } else {
                    viewFindViewById3 = null;
                }
                ecStoreInfoV2Assem.LLJL = (LinearLayout) viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        View viewFindViewById4 = ecStoreInfoV2Assem.LLJLIL;
        if (viewFindViewById4 == null) {
            View viewLJJIJL3 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById4 = viewLJJIJL3.findViewById(R.id.zym);
            } else {
                viewFindViewById4 = null;
            }
            ecStoreInfoV2Assem.LLJLIL = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        EComShopCardStruct eComShopCardStruct3 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct3 == null || (str = eComShopCardStruct3.shopName) == null) {
            str = "";
        }
        textView.setText(str);
        View viewFindViewById5 = ecStoreInfoV2Assem.LLJLILLLLZIIL;
        if (viewFindViewById5 == null) {
            View viewLJJIJL4 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById5 = viewLJJIJL4.findViewById(R.id.c4k);
            } else {
                viewFindViewById5 = null;
            }
            ecStoreInfoV2Assem.LLJLILLLLZIIL = (TuxIconView) viewFindViewById5;
        }
        EComShopCardStruct eComShopCardStruct4 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct4 != null) {
            zLJFF = Intrinsics.LJFF(eComShopCardStruct4.blueV, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById5);
        EComShopCardStruct eComShopCardStruct5 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct5 != null) {
            aweme = eComShopCardStruct5.liveEntity;
        } else {
            aweme = null;
        }
        int i2 = 1;
        if (aweme != null) {
            C1608500rxY c1608500rxY = ecStoreInfoV2Assem.LLLFFI;
            if (c1608500rxY != null) {
                c1608500rxY.LJII();
            }
            C1610770s1D c1610770s1DTp = ecStoreInfoV2Assem.tp();
            if (c1610770s1DTp != null) {
                C786410Ut5.Y(c1610770s1DTp, 0);
            }
            C1608500rxY c1608500rxY2 = new C1608500rxY(ecStoreInfoV2Assem.up(), ecStoreInfoV2Assem.up(), ecStoreInfoV2Assem.tp());
            c1608500rxY2.LJIIIIZZ = false;
            ecStoreInfoV2Assem.LLLFFI = c1608500rxY2;
            ecStoreInfoV2Assem.up().LJFF(true);
            C662860PzI.LJIIIIZZ(ecStoreInfoV2Assem.LLLFF, C1558520qew.LJIIL(ecStoreInfoV2Assem));
        } else {
            C1610770s1D c1610770s1DTp2 = ecStoreInfoV2Assem.tp();
            if (c1610770s1DTp2 != null) {
                C786410Ut5.Y(c1610770s1DTp2, 8);
            }
            ecStoreInfoV2Assem.up().getAvatarImageView().setBorderAttrRes(R.attr.ng);
        }
        C0QNG.LJFF(ecStoreInfoV2Assem.up(), 36.0d, 14.0d);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        C661010PwJ c661010PwJ3 = ecStoreInfoV2Assem.LLLFF;
        if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null) {
            eComShopCardStruct = searchMixFeedBase.shopCard;
        } else {
            eComShopCardStruct = null;
        }
        String strLJJJJLI = iEcomSearchService.LJJJJLI(C662850PzH.LIZLLL(eComShopCardStruct).getSecond(), EnumC1769850w9n.GENERAL_SEARCH_STORE_CARD_AVATAR);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJJJLI);
        c1331670kl3LIZLLL.LJJ(ecStoreInfoV2Assem.up().getAvatarImageView());
        c1331670kl3LIZLLL.LIZLLL("ECStoreIntroductionAssem");
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJIL(c419910GdJ.LIZ(ecStoreInfoV2Assem.up().getContext()));
        C786410Ut5.h3(c1331670kl3LIZLLL);
        ecStoreInfoV2Assem.up().getAvatarImageView().setAdjustViewBounds(true);
        C0QNG.LJI(ecStoreInfoV2Assem.up(), R.raw.icon_color_default_avatar);
        View viewFindViewById6 = ecStoreInfoV2Assem.LLJLLL;
        if (viewFindViewById6 == null) {
            View viewLJJIJL5 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL5 != null) {
                viewFindViewById6 = viewLJJIJL5.findViewById(R.id.ni9);
            } else {
                viewFindViewById6 = null;
            }
            ecStoreInfoV2Assem.LLJLLL = (C21532619Oq) viewFindViewById6;
        }
        C786410Ut5.LJJJJZI((C21532619Oq) viewFindViewById6);
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        EComShopCardStruct eComShopCardStruct6 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct6 != null && C662850PzH.LJ(eComShopCardStruct6)) {
            i2 = 2;
        }
        EComShopCardStruct eComShopCardStruct7 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct7 != null && (list3 = eComShopCardStruct7.shopLabels) != null) {
            int i3 = 0;
            for (EComShopLabel eComShopLabel2 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    EComShopLabel eComShopLabel3 = eComShopLabel2;
                    if (i3 <= i2) {
                        View viewFindViewById7 = ecStoreInfoV2Assem.LLJLLL;
                        if (viewFindViewById7 == null) {
                            View viewLJJIJL6 = ecStoreInfoV2Assem.LJJIJL();
                            if (viewLJJIJL6 != null) {
                                viewFindViewById7 = viewLJJIJL6.findViewById(R.id.ni9);
                            } else {
                                viewFindViewById7 = null;
                            }
                            ecStoreInfoV2Assem.LLJLLL = (C21532619Oq) viewFindViewById7;
                        }
                        ecStoreInfoV2Assem.sp(eComShopLabel3, (ViewGroup) viewFindViewById7, new AwS584S0100000_5(c013c, 1229), new AwS549S0100000_5(c013c, 1694), new AwS584S0100000_5(c013c2, 1230), new AwS549S0100000_5(c013c2, 1695));
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C786410Ut5.LJLLLLLL(8, ecStoreInfoV2Assem.yp());
        EComShopCardStruct eComShopCardStruct8 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct8 != null && (list2 = eComShopCardStruct8.shopTags) != null && (eComShopLabel = (EComShopLabel) C13LP.LJJJLZIJ(0, list2)) != null) {
            C786410Ut5.LJLLLLLL(0, ecStoreInfoV2Assem.yp());
            ecStoreInfoV2Assem = ecStoreInfoV2Assem;
            ecStoreInfoV2Assem.sp(eComShopLabel, ecStoreInfoV2Assem.yp(), AFwS231S0000000_3.get$arr$(293), AFwS196S0000000_10.get$arr$(776), AFwS231S0000000_3.get$arr$(294), AFwS196S0000000_10.get$arr$(777));
        }
        EComShopCardStruct eComShopCardStruct9 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct9 != null && (list = eComShopCardStruct9.starlingToTranslated) != null) {
            for (EComAddressCardStarlingToTranslated eComAddressCardStarlingToTranslated : list) {
                if (Intrinsics.LJFF(eComAddressCardStarlingToTranslated.starlingKey, "top_shop_enter")) {
                    View viewFindViewById8 = ecStoreInfoV2Assem.LLJZIJLIL;
                    if (viewFindViewById8 == null) {
                        View viewLJJIJL7 = ecStoreInfoV2Assem.LJJIJL();
                        if (viewLJJIJL7 != null) {
                            viewFindViewById8 = viewLJJIJL7.findViewById(R.id.tv_store_entrance);
                        } else {
                            viewFindViewById8 = null;
                        }
                        ecStoreInfoV2Assem.LLJZIJLIL = (C197039127h) viewFindViewById8;
                    }
                    TextView textView2 = (TextView) viewFindViewById8;
                    String str3 = eComAddressCardStarlingToTranslated.translated;
                    if (str3 == null) {
                        str3 = "";
                    }
                    textView2.setText(str3);
                }
            }
        }
        View viewFindViewById9 = ecStoreInfoV2Assem.LLL;
        if (viewFindViewById9 == null) {
            View viewLJJIJL8 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL8 != null) {
                viewFindViewById9 = viewLJJIJL8.findViewById(R.id.dyx);
            } else {
                viewFindViewById9 = null;
            }
            ecStoreInfoV2Assem.LLL = (ConstraintLayout) viewFindViewById9;
        }
        C786410Ut5.I7(new AjS65S0100000_10(ecStoreInfoV2Assem, 33), viewFindViewById9);
        View viewFindViewById10 = ecStoreInfoV2Assem.LLJZIJLIL;
        if (viewFindViewById10 == null) {
            View viewLJJIJL9 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL9 != null) {
                viewFindViewById10 = viewLJJIJL9.findViewById(R.id.tv_store_entrance);
            } else {
                viewFindViewById10 = null;
            }
            ecStoreInfoV2Assem.LLJZIJLIL = (C197039127h) viewFindViewById10;
        }
        C786410Ut5.I7(new AjS65S0100000_10(ecStoreInfoV2Assem, 34), viewFindViewById10);
        View view = ecStoreInfoV2Assem.LLLF;
        if (view == null) {
            View viewLJJIJL10 = ecStoreInfoV2Assem.LJJIJL();
            if (viewLJJIJL10 != null) {
                viewFindViewById = viewLJJIJL10.findViewById(R.id.i33);
            }
            ecStoreInfoV2Assem.LLLF = (FrameLayout) viewFindViewById;
            view = viewFindViewById;
        }
        C786410Ut5.I7(new AjS42S0200000_10(c661010PwJ2, ecStoreInfoV2Assem, 7), view);
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
        tp(interfaceC1587906Jp);
    }

    public final void zp(View view, String str, String str2) {
        String str3;
        EComShopCardStruct eComShopCardStruct;
        C0Q1G c0q1g;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct2;
        String str4;
        SearchMixFeedBase searchMixFeedBase2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        C661010PwJ c661010PwJ = this.LLLFF;
        String str5 = "";
        if (c661010PwJ == null || (searchMixFeedBase3 = c661010PwJ.LL) == null || (eComShopCardStruct3 = searchMixFeedBase3.shopCard) == null || (str3 = eComShopCardStruct3.docId) == null) {
            str3 = "";
        }
        C662810PzD.LIZIZ(view, str3);
        SmartRouter.buildRoute(view.getContext(), C662810PzD.LJII(C1558520qew.LJIIL(this), this.LLLFF, str2, BtmSDK.INSTANCE.createJumpSourceBtmToken("c3812.d3621", PageFinder.via(view), null))).open();
        C662860PzI.LJIILLIIL(str, this.LLLFF, C1558520qew.LJIIL(this), "a2270.b6880.c3812.d0", PageFinder.via(view));
        C662860PzI.LJIILL(this.LLLFF, C1558520qew.LJIIL(this), PageFinder.via(view));
        C661010PwJ c661010PwJ2 = this.LLLFF;
        if (c661010PwJ2 != null && (searchMixFeedBase2 = c661010PwJ2.LL) != null) {
            eComShopCardStruct = searchMixFeedBase2.shopCard;
        } else {
            eComShopCardStruct = null;
        }
        if (C662850PzH.LJ(eComShopCardStruct)) {
            if (Intrinsics.LJFF(str, "enter_shop_button")) {
                c0q1g = C0Q1G.VISIT_SHOP;
            } else if (Intrinsics.LJFF(str, "click_info")) {
                c0q1g = C0Q1G.SOURCE;
            } else {
                c0q1g = C0Q1G.SOURCE;
            }
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null) {
                C661010PwJ c661010PwJ3 = this.LLLFF;
                if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null && (eComShopCardStruct2 = searchMixFeedBase.shopCard) != null && (str4 = eComShopCardStruct2.shopId) != null) {
                    str5 = str4;
                }
                InterfaceC662780PzA interfaceC662780PzALJIJI = interfaceC657510PqfLIZLLL.LJIJI(str5, false, null);
                if (interfaceC662780PzALJIJI != null) {
                    interfaceC662780PzALJIJI.LJIL(c0q1g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel r11, android.view.ViewGroup r12, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r13, kotlin.jvm.functions.Function0<java.lang.Boolean> r14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r15, kotlin.jvm.functions.Function0<java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoV2Assem.sp(com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel, android.view.ViewGroup, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }
}
