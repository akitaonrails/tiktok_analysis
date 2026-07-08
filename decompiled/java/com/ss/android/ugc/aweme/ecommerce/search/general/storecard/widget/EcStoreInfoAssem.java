package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget;

import X.C013C;
import X.C0Q1G;
import X.C0QNG;
import X.C0R12;
import X.C12ES;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LP;
import X.C1558520qew;
import X.C1608500rxY;
import X.C1610670s13;
import X.C1610770s1D;
import X.C1697810uHb;
import X.C419910GdJ;
import X.C655610Pnb;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662850PzH;
import X.C662860PzI;
import X.C723830SaL;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1338240kve;
import X.EnumC1769850w9n;
import X.EnumC658120Pre;
import X.EnumC662900PzM;
import X.InterfaceC1587906Jp;
import X.InterfaceC657510Pqf;
import X.InterfaceC662780PzA;
import X.InterfaceC712990Rxx;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.EComAddressCardStarlingToTranslated;
import com.ss.android.ugc.aweme.ecommerce.model.EComImage;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.model.LabelIcon;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.zhiliaoapp.musically.R;
import g1c.AjS42S0200000_10;
import g1c.AjS65S0100000_10;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcStoreInfoAssem extends ReusedUISlotAssem<EcStoreInfoAssem> implements InterfaceC712990Rxx<C661010PwJ> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C1610770s1D LLJL;
    public C1610670s13 LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public ConstraintLayout LLL;
    public FrameLayout LLLF;
    public C661010PwJ LLLFF;
    public C1608500rxY LLLFFI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bs1;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ConstraintLayout sp() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.duv) : null;
            this.LLJZIJLIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1610770s1D tp() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l2p) : null;
            this.LLJL = (C1610770s1D) viewFindViewById;
        }
        return (C1610770s1D) viewFindViewById;
    }

    public final C1610670s13 up() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l9h) : null;
            this.LLJLIL = (C1610670s13) viewFindViewById;
        }
        return (C1610670s13) viewFindViewById;
    }

    public final LinearLayout yp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ni_) : null;
            this.LLJLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 7));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C661010PwJ c661010PwJ) {
        String str;
        Aweme aweme;
        EComShopCardStruct eComShopCardStruct;
        User user;
        String nickname;
        List<EComAddressCardStarlingToTranslated> list;
        List<EComShopLabel> list2;
        EComShopLabel eComShopLabel;
        List<EComShopLabel> list3;
        AwemeRawAd awemeRawAd;
        SearchMixFeedBase searchMixFeedBase;
        C661010PwJ c661010PwJ2 = c661010PwJ;
        this.LLLFF = c661010PwJ2;
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.zym);
            } else {
                viewFindViewById = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        EComShopCardStruct eComShopCardStruct2 = c661010PwJ2.LL.shopCard;
        String str2 = "";
        if (eComShopCardStruct2 == null || (str = eComShopCardStruct2.shopName) == null) {
            str = "";
        }
        textView.setText(str);
        EComShopCardStruct eComShopCardStruct3 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct3 != null) {
            aweme = eComShopCardStruct3.liveEntity;
        } else {
            aweme = null;
        }
        int i = 1;
        if (aweme != null) {
            C1608500rxY c1608500rxY = this.LLLFFI;
            if (c1608500rxY != null) {
                c1608500rxY.LJII();
            }
            C1610770s1D c1610770s1DTp = tp();
            if (c1610770s1DTp != null) {
                C786410Ut5.Y(c1610770s1DTp, 0);
            }
            C1608500rxY c1608500rxY2 = new C1608500rxY(up(), up(), tp());
            c1608500rxY2.LJIIIIZZ = false;
            this.LLLFFI = c1608500rxY2;
            up().LJFF(true);
            C662860PzI.LJIIIIZZ(this.LLLFF, C1558520qew.LJIIL(this));
        } else {
            C1610770s1D c1610770s1DTp2 = tp();
            if (c1610770s1DTp2 != null) {
                C786410Ut5.Y(c1610770s1DTp2, 8);
            }
            up().getAvatarImageView().setBorderAttrRes(R.attr.ng);
        }
        C0QNG.LJFF(up(), 36.0d, 14.0d);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        C661010PwJ c661010PwJ3 = this.LLLFF;
        if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null) {
            eComShopCardStruct = searchMixFeedBase.shopCard;
        } else {
            eComShopCardStruct = null;
        }
        String strLJJJJLI = iEcomSearchService.LJJJJLI(C662850PzH.LIZLLL(eComShopCardStruct).getSecond(), EnumC1769850w9n.GENERAL_SEARCH_STORE_CARD_AVATAR);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJJJLI);
        c1331670kl3LIZLLL.LJJ(up().getAvatarImageView());
        c1331670kl3LIZLLL.LIZLLL("ECStoreIntroductionAssem");
        c1331670kl3LIZLLL.LJIL(c419910GdJ.LIZ(up().getContext()));
        C786410Ut5.h3(c1331670kl3LIZLLL);
        C0QNG.LJI(up(), R.raw.icon_color_default_avatar);
        View viewFindViewById3 = this.LLJLILLLLZIIL;
        int i2 = R.id.ni9;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.ni9);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJLILLLLZIIL = (LinearLayout) viewFindViewById3;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById3);
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        EComShopCardStruct eComShopCardStruct4 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct4 != null && C662850PzH.LJ(eComShopCardStruct4)) {
            i = 2;
        }
        EComShopCardStruct eComShopCardStruct5 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct5 != null && (list3 = eComShopCardStruct5.shopLabels) != null) {
            int i3 = 0;
            for (EComShopLabel eComShopLabel2 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    EComShopLabel eComShopLabel3 = eComShopLabel2;
                    if (i3 <= i) {
                        View viewFindViewById4 = this.LLJLILLLLZIIL;
                        if (viewFindViewById4 == null) {
                            View viewLJJIJL3 = LJJIJL();
                            if (viewLJJIJL3 != null) {
                                viewFindViewById4 = viewLJJIJL3.findViewById(i2);
                            } else {
                                viewFindViewById4 = null;
                            }
                            this.LLJLILLLLZIIL = (LinearLayout) viewFindViewById4;
                        }
                        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
                        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(c013c, 1227);
                        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(c013c, 1692);
                        AwS584S0100000_5 awS584S0100000_52 = new AwS584S0100000_5(c013c2, 1228);
                        AwS549S0100000_5 awS549S0100000_52 = new AwS549S0100000_5(c013c2, 1693);
                        EComShopCardStruct eComShopCardStruct6 = c661010PwJ2.LL.shopCard;
                        if (eComShopCardStruct6 != null) {
                            awemeRawAd = eComShopCardStruct6.awemeRawAd;
                        } else {
                            awemeRawAd = null;
                        }
                        op(eComShopLabel3, linearLayout, awS584S0100000_5, awS549S0100000_5, awS584S0100000_52, awS549S0100000_52, awemeRawAd);
                    }
                    i3 = i4;
                    i2 = R.id.ni9;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C786410Ut5.LJLLLLLL(8, yp());
        EComShopCardStruct eComShopCardStruct7 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct7 != null && (list2 = eComShopCardStruct7.shopTags) != null && (eComShopLabel = (EComShopLabel) C13LP.LJJJLZIJ(0, list2)) != null) {
            C786410Ut5.LJLLLLLL(0, yp());
            op(eComShopLabel, yp(), null, null, null, null, null);
        }
        EComShopCardStruct eComShopCardStruct8 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct8 != null && (list = eComShopCardStruct8.starlingToTranslated) != null) {
            for (EComAddressCardStarlingToTranslated eComAddressCardStarlingToTranslated : list) {
                if (Intrinsics.LJFF(eComAddressCardStarlingToTranslated.starlingKey, "top_shop_enter")) {
                    View viewFindViewById5 = this.LLJLLIL;
                    if (viewFindViewById5 == null) {
                        View viewLJJIJL4 = LJJIJL();
                        if (viewLJJIJL4 != null) {
                            viewFindViewById5 = viewLJJIJL4.findViewById(R.id.tv_store_entrance);
                        } else {
                            viewFindViewById5 = null;
                        }
                        this.LLJLLIL = (TuxTextView) viewFindViewById5;
                    }
                    TextView textView2 = (TextView) viewFindViewById5;
                    String str3 = eComAddressCardStarlingToTranslated.translated;
                    if (str3 == null) {
                        str3 = "";
                    }
                    textView2.setText(str3);
                }
                if (Intrinsics.LJFF(eComAddressCardStarlingToTranslated.starlingKey, "top_shop_card_title")) {
                    View viewFindViewById6 = this.LLJLLL;
                    if (viewFindViewById6 == null) {
                        View viewLJJIJL5 = LJJIJL();
                        if (viewLJJIJL5 != null) {
                            viewFindViewById6 = viewLJJIJL5.findViewById(R.id.tv_title);
                        } else {
                            viewFindViewById6 = null;
                        }
                        this.LLJLLL = (TuxTextView) viewFindViewById6;
                    }
                    TextView textView3 = (TextView) viewFindViewById6;
                    String str4 = eComAddressCardStarlingToTranslated.translated;
                    if (str4 == null) {
                        str4 = "";
                    }
                    textView3.setText(str4);
                }
            }
        }
        View viewFindViewById7 = this.LLJZ;
        if (viewFindViewById7 == null) {
            View viewLJJIJL6 = LJJIJL();
            if (viewLJJIJL6 != null) {
                viewFindViewById7 = viewLJJIJL6.findViewById(R.id.z83);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJZ = (TuxTextView) viewFindViewById7;
        }
        TextView textView4 = (TextView) viewFindViewById7;
        EComShopCardStruct eComShopCardStruct9 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct9 != null && (user = eComShopCardStruct9.userInfo) != null && (nickname = user.getNickname()) != null) {
            str2 = nickname;
        }
        textView4.setText(str2);
        sp().setForeground(null);
        C662810PzD.LIZLLL(sp(), null, Integer.valueOf(R.drawable.bkp), new AwS554S0100000_10(this, 1341));
        View viewFindViewById8 = this.LLJZ;
        if (viewFindViewById8 == null) {
            View viewLJJIJL7 = LJJIJL();
            if (viewLJJIJL7 != null) {
                viewFindViewById8 = viewLJJIJL7.findViewById(R.id.z83);
            } else {
                viewFindViewById8 = null;
            }
            this.LLJZ = (TuxTextView) viewFindViewById8;
        }
        C662810PzD.LIZLLL(viewFindViewById8, null, null, new AwS554S0100000_10(this, 1342));
        View viewFindViewById9 = this.LLL;
        if (viewFindViewById9 == null) {
            View viewLJJIJL8 = LJJIJL();
            if (viewLJJIJL8 != null) {
                viewFindViewById9 = viewLJJIJL8.findViewById(R.id.dyx);
            } else {
                viewFindViewById9 = null;
            }
            this.LLL = (ConstraintLayout) viewFindViewById9;
        }
        C786410Ut5.I7(new AjS65S0100000_10(this, 31), viewFindViewById9);
        View viewFindViewById10 = this.LLJLLIL;
        if (viewFindViewById10 == null) {
            View viewLJJIJL9 = LJJIJL();
            if (viewLJJIJL9 != null) {
                viewFindViewById10 = viewLJJIJL9.findViewById(R.id.tv_store_entrance);
            } else {
                viewFindViewById10 = null;
            }
            this.LLJLLIL = (TuxTextView) viewFindViewById10;
        }
        C786410Ut5.I7(new AjS65S0100000_10(this, 32), viewFindViewById10);
        View view = this.LLLF;
        if (view == null) {
            View viewLJJIJL10 = LJJIJL();
            if (viewLJJIJL10 != null) {
                viewFindViewById2 = viewLJJIJL10.findViewById(R.id.i33);
            }
            this.LLLF = (FrameLayout) viewFindViewById2;
            view = viewFindViewById2;
        }
        C786410Ut5.I7(new AjS42S0200000_10(c661010PwJ2, this, 6), view);
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

    /* JADX WARN: Removed duplicated region for block: B:129:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(androidx.constraintlayout.widget.ConstraintLayout r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoAssem.zp(androidx.constraintlayout.widget.ConstraintLayout, java.lang.String):void");
    }

    public final void Ap(View view, String str, String str2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void op(EComShopLabel eComShopLabel, LinearLayout linearLayout, Function1<? super Boolean, Unit> function1, Function0<Boolean> function0, Function1<? super Boolean, Unit> function12, Function0<Boolean> function02, AwemeRawAd awemeRawAd) {
        int size;
        float fFloatValue;
        String str;
        EComImage eComImage;
        List<String> list;
        String str2;
        EComImage eComImage2;
        List<String> list2;
        Integer num;
        Integer num2;
        EComImage eComImage3;
        List<String> list3;
        LabelIcon labelIcon = eComShopLabel.icon;
        int i = 0;
        if (labelIcon != null && (eComImage3 = labelIcon.labelImageLight) != null && (list3 = eComImage3.urlList) != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        Float fValueOf = 0;
        fValueOf = 0;
        fValueOf = 0;
        fValueOf = 0;
        fValueOf = 0;
        String str3 = "";
        if (size > 0) {
            LabelIcon labelIcon2 = eComShopLabel.icon;
            if (labelIcon2 != null) {
                EComImage eComImage4 = labelIcon2.labelImageLight;
                if (eComImage4 != null) {
                    num = eComImage4.width;
                } else {
                    num = null;
                    if (labelIcon2 != null) {
                    }
                }
                EComImage eComImage5 = labelIcon2.labelImageLight;
                if (eComImage5 != null && (num2 = eComImage5.height) != null) {
                    int iIntValue = num2.intValue();
                    if (num != null) {
                        fValueOf = Float.valueOf(num.intValue() / iIntValue);
                    }
                }
            }
            if (fValueOf != 0) {
                fFloatValue = fValueOf.floatValue() * 15.0f;
            } else {
                fFloatValue = 47.0f;
            }
            SmartImageView smartImageView = new SmartImageView(getContext());
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams((int) C12ES.LIZJ(fFloatValue, getContext()), (int) C12ES.LIZJ(15.0f, getContext())));
            LabelIcon labelIcon3 = eComShopLabel.icon;
            if (labelIcon3 == null || (eComImage2 = labelIcon3.labelImageLight) == null || (list2 = eComImage2.urlList) == null || (str = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
                str = "";
            }
            if (C960203pA.LIZIZ(linearLayout.getContext())) {
                LabelIcon labelIcon4 = eComShopLabel.icon;
                if (labelIcon4 != null && (eComImage = labelIcon4.labelImageDark) != null && (list = eComImage.urlList) != null && (str2 = (String) C13LP.LJJJLZIJ(0, list)) != null) {
                    str3 = str2;
                }
                str = str3;
            }
            String strLJJJJLI = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJJJLI(str, EnumC1769850w9n.GENERAL_SEARCH_STORE_CARD_LABEL);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJJJLI);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LIZLLL.LJJI(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            linearLayout.addView(smartImageView);
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) C12ES.LIZJ(1.0f, getContext()), (int) C12ES.LIZJ(8.0f, getContext()));
        layoutParams.setMarginStart((int) C12ES.LIZJ(6.0f, getContext()));
        C786410Ut5.W5(view, layoutParams);
        view.setBackground(C1308910kAL.LJ(R.attr.ng, linearLayout.getContext()));
        Integer num3 = eComShopLabel.type;
        int type = EnumC662900PzM.REVIEW_RATING.getType();
        if (num3 != null && num3.intValue() == type) {
            if (function02 != null && function02.invoke().booleanValue() && function0 != null && !function0.invoke().booleanValue()) {
                linearLayout.addView(view);
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bs5, null, false);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            C786410Ut5.W5(viewTd, layoutParams2);
            if (function02 != null && function02.invoke().booleanValue()) {
                layoutParams2.setMarginStart((int) C12ES.LIZJ(6.0f, getContext()));
            }
            linearLayout.addView(viewTd);
            TextView textView = (TextView) viewTd.findViewById(R.id.tv_star);
            String str4 = eComShopLabel.value;
            if (str4 != null) {
                str3 = str4;
            }
            textView.setText(str3);
            if (function12 == null) {
                return;
            }
            function12.invoke(Boolean.TRUE);
            return;
        }
        Integer num4 = eComShopLabel.type;
        int type2 = EnumC662900PzM.AD_TAG.getType();
        if (num4 != null && num4.intValue() == type2 && awemeRawAd != null) {
            View viewLJIIZILJ = C0R12.LIZIZ.LJIIZILJ(awemeRawAd, linearLayout, EnumC658120Pre.EC_SHOP_CARD);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            if (function02 != null && function02.invoke().booleanValue()) {
                layoutParams3.setMarginStart((int) C12ES.LIZJ(6.0f, getContext()));
            }
            if (viewLJIIZILJ != null) {
                C786410Ut5.W5(viewLJIIZILJ, layoutParams3);
            }
            linearLayout.addView(viewLJIIZILJ);
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
            }
            if (function1 == null) {
                return;
            }
            function1.invoke(Boolean.TRUE);
            return;
        }
        if (function02 != null && function02.invoke().booleanValue()) {
            linearLayout.addView(view);
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
            }
        }
        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), fValueOf, 6, i);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (function02 != null && function02.invoke().booleanValue()) {
            layoutParams4.setMarginStart((int) C12ES.LIZJ(6.0f, getContext()));
        }
        C786410Ut5.R6(tuxTextView, layoutParams4);
        tuxTextView.setTuxFont(61);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, linearLayout.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        String str5 = eComShopLabel.translatedLabelText;
        if (str5 != null) {
            str3 = str5;
        }
        tuxTextView.setText(str3);
        linearLayout.addView(tuxTextView);
        if (function12 == null) {
            return;
        }
        function12.invoke(Boolean.TRUE);
    }
}
