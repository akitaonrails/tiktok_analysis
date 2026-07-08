package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton;

import X.C041W;
import X.C0H9H;
import X.C0R48;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1558520qew;
import X.C1591860rWi;
import X.C1697810uHb;
import X.C197039127h;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426160GnO;
import X.C426750GoL;
import X.C435210H4t;
import X.C443120HZe;
import X.C655610Pnb;
import X.C661010PwJ;
import X.C662810PzD;
import X.C662850PzH;
import X.C662860PzI;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC1769850w9n;
import X.EnumC646330PWt;
import X.InterfaceC1587906Jp;
import X.InterfaceC657510Pqf;
import X.InterfaceC662780PzA;
import X.InterfaceC662940PzQ;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.ShopCardCategory;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreNoLiveAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.zhiliaoapp.musically.R;
import g1c.AjS2S0301000_10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS70S0301000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcStoreNoLiveAssem extends ReusedUISlotAssem<EcStoreNoLiveAssem> implements InterfaceC712990Rxx<C661010PwJ> {
    public final EnumC646330PWt LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public LinearLayout LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public LinearLayout LLJLLIL;
    public HorizontalScrollView LLJLLL;
    public C661010PwJ LLJZ;
    public InterfaceC662780PzA LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bs4;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJZIJLIL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final LinearLayout sp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.koe) : null;
            this.LLJLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout tp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nbf) : null;
            this.LLJLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final HorizontalScrollView up() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u3e) : null;
            this.LLJLLL = (HorizontalScrollView) viewFindViewById;
        }
        return (HorizontalScrollView) viewFindViewById;
    }

    public final LinearLayout yp() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w0c) : null;
            this.LLJLLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public EcStoreNoLiveAssem(EnumC646330PWt enumC646330PWt) {
        this.LLJJLIIIJLLLLLLLZ = enumC646330PWt;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 28));
        view.addOnAttachStateChangeListener(new C0R48(view, this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.0GnO, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v25, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C661010PwJ c661010PwJ) {
        int i;
        int size;
        List<AddressCardProducts> list;
        ?? LIZIZ;
        EComShopCardStruct eComShopCardStruct;
        EComShopCardStruct eComShopCardStruct2;
        final AwemeRawAd awemeRawAd;
        String str;
        EComShopCardStruct eComShopCardStruct3;
        EComShopCardStruct eComShopCardStruct4;
        List<ShopCardCategory> list2;
        List<ShopCardCategory> list3;
        List<AddressCardProducts> list4;
        Resources resources;
        DisplayMetrics displayMetrics;
        C661010PwJ c661010PwJ2 = c661010PwJ;
        this.LLJZ = c661010PwJ2;
        C786410Ut5.LJJJJJL(sp());
        int i2 = 0;
        C786410Ut5.LJLLLLLL(0, sp());
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        int i3 = 8;
        int i4 = 4;
        int iLIZIZ = C0H9H.LIZIZ(8) * 4;
        if (this.LLJJLIIIJLLLLLLLZ == EnumC646330PWt.NO_LIVE_NEW) {
            iLIZIZ += C0H9H.LIZIZ(8) * 2;
            C435210H4t.LIZJ(sp(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(4)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(12)));
        }
        int i5 = 3;
        int i6 = (i - iLIZIZ) / 3;
        EComShopCardStruct eComShopCardStruct5 = c661010PwJ2.LL.shopCard;
        if (eComShopCardStruct5 != null && (list4 = eComShopCardStruct5.addressCardProduct) != null) {
            size = list4.size();
        } else {
            size = 0;
        }
        View viewFindViewById = null;
        int i7 = 1;
        if (size < 3) {
            C786410Ut5.LJLLLLLL(8, sp());
        } else {
            EComShopCardStruct eComShopCardStruct6 = c661010PwJ2.LL.shopCard;
            if (eComShopCardStruct6 != null && (list = eComShopCardStruct6.addressCardProduct) != null) {
                int i8 = 0;
                for (AddressCardProducts addressCardProducts : list) {
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        AddressCardProducts addressCardProducts2 = addressCardProducts;
                        if (i8 >= i5 || i6 <= 0) {
                            break;
                        }
                        if (this.LLJJLIIIJLLLLLLLZ == EnumC646330PWt.NO_LIVE_NEW) {
                            LIZIZ = new LinearLayout(getContext());
                            LIZIZ.setOrientation(i7);
                            LIZIZ.addView(C662850PzH.LIZIZ(LIZIZ.getContext(), C418440Gaw.LIZIZ(Integer.valueOf(i3)), addressCardProducts2, false, false, EnumC1769850w9n.GENERAL_SEARCH_STORE_CARD_NO_LIVE_PRODUCT), new LinearLayout.LayoutParams(i6, i6));
                            int i10 = 6;
                            TuxTextView tuxTextView = new TuxTextView(LIZIZ.getContext(), 0 == true ? 1 : 0, i10, i2);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setText(addressCardProducts2.title);
                            tuxTextView.setTextColorRes(R.attr.a1h);
                            tuxTextView.setTuxFont(71);
                            tuxTextView.setMaxLines(i7);
                            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C0H9H.LIZIZ(i4)), 0, Integer.valueOf(C0H9H.LIZIZ(i4)), 0, 16);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, -2);
                            layoutParams.setMargins(0, C0H9H.LIZIZ(6), 0, 0);
                            LIZIZ.addView(tuxTextView, layoutParams);
                            ?? c426160GnO = new C426160GnO(LIZIZ.getContext(), null, 6);
                            c426160GnO.setGravity(-1);
                            c426160GnO.setMaxTagLines(1);
                            TuxTextView tuxTextView2 = new TuxTextView(c426160GnO.getContext(), 0 == true ? 1 : 0, i10, i2);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            C041W c041wLIZ = C662850PzH.LIZ(addressCardProducts2);
                            c041wLIZ.LIZLLL(4);
                            c041wLIZ.LJII = R.attr.a1h;
                            tuxTextView2.setText(c041wLIZ.LIZIZ(tuxTextView2.getContext()));
                            tuxTextView2.setMaxLines(1);
                            c426160GnO.addView(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                            String str2 = addressCardProducts2.formatDiscount;
                            if (str2 != null) {
                                TuxTextView tuxTextView3 = new TuxTextView(c426160GnO.getContext(), 0 == true ? 1 : 0, i10, i2);
                                tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                                tuxTextView3.setText(str2);
                                tuxTextView3.setTuxFont(81);
                                tuxTextView3.setTextColorRes(R.attr.a1q);
                                tuxTextView3.setGravity(16);
                                tuxTextView3.setMaxLines(1);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams2.setMargins(C0H9H.LIZIZ(2), C0H9H.LIZIZ(2), 0, 0);
                                c426160GnO.addView(tuxTextView3, layoutParams2);
                            }
                            C426750GoL.LJIIL(c426160GnO, Integer.valueOf(C0H9H.LIZIZ(4)), 0, Integer.valueOf(C0H9H.LIZIZ(4)), 0, 16);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i6, -2);
                            layoutParams3.setMargins(0, C0H9H.LIZIZ(4), 0, 0);
                            LIZIZ.addView(c426160GnO, layoutParams3);
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i6, -2);
                            layoutParams4.setMarginStart(C0H9H.LIZIZ(8));
                            C786410Ut5.d6(LIZIZ, layoutParams4);
                            ?? Sp = sp();
                            if (Sp != 0) {
                                Sp.addView(LIZIZ, LIZIZ.getLayoutParams());
                            }
                        } else {
                            LIZIZ = C662850PzH.LIZIZ(getContext(), C418440Gaw.LIZIZ(8), addressCardProducts2, false, true, EnumC1769850w9n.GENERAL_SEARCH_STORE_CARD_NO_LIVE_PRODUCT);
                            TextView textView = (TextView) LIZIZ.findViewById(R.id.tv_price);
                            C041W c041wLIZ2 = C662850PzH.LIZ(addressCardProducts2);
                            c041wLIZ2.LIZLLL(3);
                            c041wLIZ2.LJII = R.attr.a1h;
                            textView.setText(c041wLIZ2.LIZIZ(LIZIZ.getContext()));
                            LIZIZ.setForeground(LIZIZ.getContext().getDrawable(R.drawable.bks));
                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i6, i6);
                            layoutParams5.setMarginStart(C0H9H.LIZIZ(8));
                            C786410Ut5.W5(LIZIZ, layoutParams5);
                            ?? Sp2 = sp();
                            if (Sp2 != 0) {
                                Sp2.addView(LIZIZ, LIZIZ.getLayoutParams());
                            }
                        }
                        C662810PzD.LIZLLL(LIZIZ, Integer.valueOf(R.drawable.bks), Integer.valueOf(R.drawable.bkt), new AwS70S0301000_10((View) LIZIZ, i8, addressCardProducts2, this, 1));
                        i5 = 3;
                        i8 = i9;
                        i7 = 1;
                        i3 = 8;
                        i4 = 4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        InterfaceC662780PzA interfaceC662780PzALJIJI = null;
        View view = this.LLJLILLLLZIIL;
        if (view == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.die);
            }
            this.LLJLILLLLZIIL = (FrameLayout) viewFindViewById;
            view = viewFindViewById;
        }
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.LJJJJJL(tp());
        C786410Ut5.LJJJJJL(yp());
        if (this.LLJJLIIIJLLLLLLLZ == EnumC646330PWt.NO_LIVE_NEW && (eComShopCardStruct4 = c661010PwJ2.LL.shopCard) != null && (list2 = eComShopCardStruct4.shopCategories) != null && !list2.isEmpty()) {
            View viewFindViewById2 = this.LLJLILLLLZIIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.die);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLILLLLZIIL = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            EComShopCardStruct eComShopCardStruct7 = c661010PwJ2.LL.shopCard;
            if (eComShopCardStruct7 != null && (list3 = eComShopCardStruct7.shopCategories) != null) {
                int size2 = list3.size();
                if (size2 != i7) {
                    if (size2 != 2) {
                        C786410Ut5.LJLLLLLL(0, up());
                        C0H9H.LJ(C0H9H.LIZIZ(16), tp());
                        final ArrayList arrayList = new ArrayList();
                        int i11 = 0;
                        for (ShopCardCategory shopCardCategory : list3) {
                            int i12 = i11 + 1;
                            if (i11 >= 0) {
                                ShopCardCategory shopCardCategory2 = shopCardCategory;
                                C197039127h c197039127hOp = op(shopCardCategory2, i11);
                                if (c197039127hOp != null) {
                                    c197039127hOp.setMinWidth(C0H9H.LIZIZ(10));
                                    c197039127hOp.setMaxWidth(C0H9H.LIZIZ(LSPassThroughRecordSizeConfig.DEFAULT));
                                    arrayList.add(new C443120HZe(c197039127hOp, shopCardCategory2, Integer.valueOf(i11)));
                                } else {
                                    c197039127hOp = null;
                                }
                                ?? Tp = tp();
                                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams6.setMarginEnd(C0H9H.LIZIZ(8));
                                Tp.addView(c197039127hOp, layoutParams6);
                                tp().setPaddingRelative(0, 0, C0H9H.LIZIZ(16), 0);
                                i11 = i12;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        up().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0PzJ
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view2, int i13, int i14, int i15, int i16) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                Rect rect = new Rect();
                                this.up().getHitRect(rect);
                                ArrayList arrayList2 = new ArrayList();
                                List<C443120HZe<C197039127h, ShopCardCategory, Integer>> list5 = arrayList;
                                EcStoreNoLiveAssem ecStoreNoLiveAssem = this;
                                for (C443120HZe<C197039127h, ShopCardCategory, Integer> c443120HZe : list5) {
                                    if (c443120HZe.getFirst().getLocalVisibleRect(rect)) {
                                        C661010PwJ c661010PwJ3 = ecStoreNoLiveAssem.LLJZ;
                                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(ecStoreNoLiveAssem);
                                        ShopCardCategory second = c443120HZe.getSecond();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("a2270.b6880.c3812.d36180_i");
                                        sbLIZ.append(c443120HZe.getThird().intValue());
                                        C662860PzI.LJIILJJIL(c661010PwJ3, interfaceC665370Q7zLJIIL, second, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(this), c443120HZe.getThird().intValue());
                                        arrayList2.add(c443120HZe);
                                    }
                                }
                                arrayList.removeAll(arrayList2);
                            }
                        });
                        HandlerHook.viewPost(up(), new ARunnableS110S0100000_10(this, 200));
                    } else {
                        C786410Ut5.LJLLLLLL(0, yp());
                        int i13 = 0;
                        for (ShopCardCategory shopCardCategory3 : list3) {
                            int i14 = i13 + 1;
                            if (i13 >= 0) {
                                ShopCardCategory shopCardCategory4 = shopCardCategory3;
                                ?? Yp = yp();
                                C197039127h c197039127hOp2 = op(shopCardCategory4, i13);
                                C661010PwJ c661010PwJ3 = this.LLJZ;
                                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("a2270.b6880.c3812.d36180_i");
                                sbLIZ.append(i13);
                                C662860PzI.LJIILJJIL(c661010PwJ3, interfaceC665370Q7zLJIIL, shopCardCategory4, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) c197039127hOp2), i13);
                                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams7.weight = 1.0f;
                                layoutParams7.setMarginStart(C0H9H.LIZIZ(4));
                                layoutParams7.setMarginEnd(C0H9H.LIZIZ(4));
                                Yp.addView(c197039127hOp2, layoutParams7);
                                i13 = i14;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                } else {
                    C786410Ut5.LJLLLLLL(0, yp());
                    ?? Yp2 = yp();
                    C197039127h c197039127hOp3 = op((ShopCardCategory) ListProtector.get(list3, 0), 0);
                    C662860PzI.LJIILJJIL(this.LLJZ, C1558520qew.LJIIL(this), (ShopCardCategory) ListProtector.get(list3, 0), "a2270.b6880.c3812.d36180_i0", PageFinder.via((View) c197039127hOp3), 0);
                    LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams8.setMarginStart(C0H9H.LIZIZ(i4));
                    layoutParams8.setMarginEnd(C0H9H.LIZIZ(i4));
                    Yp2.addView(c197039127hOp3, layoutParams8);
                }
            }
        }
        SearchMixFeedBase searchMixFeedBase = c661010PwJ2.LL;
        if (searchMixFeedBase != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && C662850PzH.LJ(eComShopCardStruct) && (eComShopCardStruct2 = c661010PwJ2.LL.shopCard) != null && (awemeRawAd = eComShopCardStruct2.awemeRawAd) != null) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null) {
                SearchMixFeedBase searchMixFeedBase2 = c661010PwJ2.LL;
                if (searchMixFeedBase2 == null || (eComShopCardStruct3 = searchMixFeedBase2.shopCard) == null || (str = eComShopCardStruct3.shopId) == null) {
                    str = "";
                }
                interfaceC662780PzALJIJI = interfaceC657510PqfLIZLLL.LJIJI(str, true, new InterfaceC662940PzQ() { // from class: X.0PzP
                    @Override // X.InterfaceC662940PzQ
                    public final AwemeRawAd getRawAd() {
                        return awemeRawAd;
                    }
                });
            }
            this.LLJZIJLIL = interfaceC662780PzALJIJI;
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

    public final C197039127h op(ShopCardCategory shopCardCategory, int i) {
        Integer numLIZJ;
        Context context = getContext();
        AttributeSet attributeSet = null;
        if (context == null) {
            return null;
        }
        C197039127h c197039127h = new C197039127h(context, attributeSet, 6, 0);
        c197039127h.setButtonSize(1);
        c197039127h.setButtonVariant(1);
        c197039127h.setLoading(false);
        c197039127h.setEnabled(true);
        C1591860rWi.LJFF(C0H9H.LIZIZ(12), c197039127h);
        Context context2 = c197039127h.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context2)) != null) {
            c197039127h.setBackgroundColor(numLIZJ.intValue());
        }
        String str = shopCardCategory.name;
        if (str == null) {
            str = "";
        }
        c197039127h.setText(str);
        c197039127h.setTuxFont(41);
        c197039127h.setTextColorRes(R.attr.a1i);
        c197039127h.setEllipsize(TextUtils.TruncateAt.END);
        c197039127h.LJJJJLI(false);
        C1378990lzN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(5)), null, null, null, null, 30);
        C786410Ut5.I7(new AjS2S0301000_10(this, c197039127h, shopCardCategory, i, 0), c197039127h);
        return c197039127h;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
