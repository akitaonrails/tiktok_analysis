package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.subcard.assem;

import X.C01GW;
import X.C07E5;
import X.C0QSJ;
import X.C0R45;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1723230uwb;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C452501pT;
import X.C631370Opb;
import X.C656130PoR;
import X.C687700QyG;
import X.C723590SZx;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC657370PqR;
import X.EnumC682590Qq1;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC656110PoP;
import X.InterfaceC657240PqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ProductAggregationSubCardAssem<DATA extends InterfaceC657240PqE> extends ReusedUISlotAssem<ProductAggregationSubCardAssem<DATA>> implements InterfaceC712990Rxx<InterfaceC657240PqE>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C656130PoR.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10((ProductAggregationSubCardAssem) this, 239));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10((ProductAggregationSubCardAssem) this, 242));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10((ProductAggregationSubCardAssem) this, 238));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10((ProductAggregationSubCardAssem) this, 241));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10((ProductAggregationSubCardAssem) this, 240));
    public final String LLJLLL = EnumC682590Qq1.ADS.getValue();
    public volatile InterfaceC656110PoP LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProductAggregationSubCardAssem.class, "searchGridAbility", "getSearchGridAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/grid/ability/SearchGridAbility;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euf;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchGridScope.class});
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchGridScope.class);
        return arrayList;
    }

    public abstract EnumC657370PqR sp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TuxTextView tp() {
        return (TuxTextView) this.LLJLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC656110PoP up() {
        /*
            r4 = this;
            X.0PoP r0 = r4.LLJZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0PoP r0 = r4.LLJZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJZIJLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJZIJLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope> r1 = com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0PoP> r0 = X.InterfaceC656110PoP.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0PoP r0 = (X.InterfaceC656110PoP) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.subcard.assem.ProductAggregationSubCardAssem.up():X.0PoP");
    }

    public String op() {
        return this.LLJLLL;
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
        C427690Gpr.LJFF(LJJIJL(), ((C656130PoR) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL);
        FrameLayout frameLayout = (FrameLayout) this.LLJL.getValue();
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS145S0100000_10(this, 60));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJLIL.getValue();
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS145S0100000_10(this, 61));
        }
        LJJIJL().addOnAttachStateChangeListener(new C0R45(this, 32));
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, (View) this, (ProductAggregationSubCardAssem<InterfaceC657240PqE>) 98));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        Integer num;
        AwemeSearchAdModel searchAdInfo;
        List<Product> list;
        Product product;
        AwemeSearchAdModel searchAdInfo2;
        InterfaceC657240PqE interfaceC657240PqE2 = interfaceC657240PqE;
        InterfaceC656110PoP interfaceC656110PoPUp = up();
        if (interfaceC656110PoPUp != null) {
            interfaceC656110PoPUp.T(C631370Opb.LIZIZ(this), interfaceC657240PqE2);
        }
        AwemeRawAd awemeRawAd = interfaceC657240PqE2.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (searchAdInfo2 = awemeRawAd.getSearchAdInfo()) != null) {
            num = searchAdInfo2.searchFormatType;
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd2 = interfaceC657240PqE2.getAweme().getAwemeRawAd();
        if (awemeRawAd2 != null && (searchAdInfo = awemeRawAd2.getSearchAdInfo()) != null && (list = searchAdInfo.productsInfo) != null && (product = (Product) C13LP.LJJJLL(list)) != null) {
            if (C1723230uwb.LIZJ(product.title)) {
                TextView textView = (TextView) this.LLJLILLLLZIIL.getValue();
                if (textView != null) {
                    textView.setText(product.title);
                }
                if (num != null && num.intValue() == 55) {
                    TextView textView2 = (TextView) this.LLJLILLLLZIIL.getValue();
                    if (textView2 != null) {
                        textView2.setMaxLines(1);
                    }
                } else {
                    TextView textView3 = (TextView) this.LLJLILLLLZIIL.getValue();
                    if (textView3 != null) {
                        textView3.setMaxLines(2);
                    }
                }
                TuxTextView tuxTextView = (TuxTextView) this.LLJLILLLLZIIL.getValue();
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            }
            if (C1723230uwb.LIZJ(product.formatOriginPriceNumber)) {
                String str = product.formatPriceNumber;
                if ((str == null || str.length() == 0) && C1723230uwb.LIZJ(product.formatOriginPriceNumber)) {
                    TuxTextView tuxTextViewTp = tp();
                    if (tuxTextViewTp != null) {
                        tuxTextViewTp.setText(product.formatOriginPriceNumber);
                    }
                } else {
                    TuxTextView tuxTextViewTp2 = tp();
                    if (tuxTextViewTp2 != null) {
                        tuxTextViewTp2.setText(product.formatPriceNumber);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) product.formatOriginPriceNumber);
                    C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), 0, spannableStringBuilder.length(), 17);
                    TextView textView4 = (TextView) this.LLJLLIL.getValue();
                    if (textView4 != null) {
                        textView4.setText(spannableStringBuilder);
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.LLJLLIL.getValue();
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                }
                TuxTextView tuxTextViewTp3 = tp();
                if (tuxTextViewTp3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewTp3, 0);
                    return;
                }
                return;
            }
            if (!C1723230uwb.LIZJ(product.brandName)) {
                return;
            }
            TuxTextView tuxTextViewTp4 = tp();
            if (tuxTextViewTp4 != null) {
                tuxTextViewTp4.setText(product.brandName);
            }
            TuxTextView tuxTextViewTp5 = tp();
            if (tuxTextViewTp5 != null) {
                tuxTextViewTp5.setTuxFont(72);
            }
            TuxTextView tuxTextViewTp6 = tp();
            if (tuxTextViewTp6 != null) {
                tuxTextViewTp6.setTextColorRes(R.attr.a1j);
            }
            TuxTextView tuxTextViewTp7 = tp();
            if (tuxTextViewTp7 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextViewTp7, 0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
