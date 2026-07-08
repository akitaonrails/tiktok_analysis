package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend;

import X.C01GW;
import X.C049N;
import X.C0NOH;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1752970viZ;
import X.C1765700w36;
import X.C1773900wGK;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C418440Gaw;
import X.C419120Gc2;
import X.C452501pT;
import X.C679280Qkg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TagInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS12S0410000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendFeedCell extends PowerCell<C1752970viZ> {
    public C0NOH LL;
    public LaneParams LLJ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 453));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 454));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 455));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 452));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 456));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 457));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 458));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(114));

    public final C419120Gc2 I5() {
        return (C419120Gc2) this.LLILLJJLI.getValue();
    }

    public final TuxTextView L5() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final PdpViewModel N5() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return (PdpViewModel) ViewModelProviders.of(currentFragment).get(PdpViewModel.class.getName(), PdpViewModel.class);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        if (C1773900wGK.LIZ()) {
            C0NOH c0noh = this.LL;
            if (c0noh != null) {
                c0noh.LIZJ();
            }
            this.LL = null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.at3, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void R5(android.view.View r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell.R5(android.view.View, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0596  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell.onBindItemView(X.0zJl, java.util.List):void");
    }

    public final void P5(C1752970viZ c1752970viZ, boolean z, Map<String, ? extends Object> map) {
        Type type;
        ProductTile productTile = c1752970viZ.LLILLL;
        String str = null;
        if (productTile != null) {
            str = productTile.logExtra;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(Object.class))));
            } else {
                type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0viO
                }.getType();
            }
            if (!(GsonProtectorUtils.fromJson(gsonLJFF, str, type) instanceof Map)) {
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1748720vbi.LIZLLL(this.itemView, new C049N(), new AwS12S0410000_26(productTile, c1752970viZ, this, map, z, 1));
    }

    public final void S5(int i, long j, Integer num) {
        ProductTile productTile;
        int i2;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        TuxTextView tuxTextView;
        int iMeasureText;
        List<TagInfo> list = null;
        int i3 = 8;
        if (2 == i) {
            int iIntValue = 0;
            if (j <= 86400000) {
                C786410Ut5.H(I5(), 0);
                C419120Gc2 c419120Gc2I5 = I5();
                if (c419120Gc2I5.LLILLJJLI == null) {
                    C1765700w36 c1765700w36 = new C1765700w36(c419120Gc2I5.getContext(), null, 6);
                    c1765700w36.setTuxFont(c419120Gc2I5.LLILZ);
                    c1765700w36.setTextColorRes(R.attr.a1q);
                    c1765700w36.setMaxLines(1);
                    if (num != null) {
                        c1765700w36.LJJJJL(num.intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), "23:59:59");
                    }
                    c419120Gc2I5.LLILLJJLI = c1765700w36;
                    TextPaint paint = c1765700w36.getPaint();
                    if (paint != null) {
                        iMeasureText = (int) paint.measureText("23:59:59");
                    } else {
                        iMeasureText = 0;
                    }
                    int iLIZIZ = iMeasureText + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    C1765700w36 c1765700w362 = c419120Gc2I5.LLILLJJLI;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZIZ, -1);
                    layoutParams.setMarginStart(C679280Qkg.LIZ(2));
                    c419120Gc2I5.addView(c1765700w362, layoutParams);
                }
                if (j <= 86400000 && j >= 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                if (c419120Gc2I5.LLILLL != i2) {
                    c419120Gc2I5.LLILLL = i2;
                    C1765700w36 c1765700w363 = c419120Gc2I5.LLILLJJLI;
                    if (c1765700w363 != null) {
                        if (2 == i2) {
                            i3 = 0;
                        }
                        C786410Ut5.O(c1765700w363, i3);
                    }
                }
                C1765700w36 c1765700w364 = c419120Gc2I5.LLILLJJLI;
                if (c1765700w364 != null && c1765700w364.getVisibility() == 0 && (tuxTextView = c419120Gc2I5.LL) != null) {
                    tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
                }
                C1765700w36 c1765700w365 = c419120Gc2I5.LLILLJJLI;
                if (c1765700w365 != null) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    long j3 = 60;
                    long j4 = j2 / j3;
                    long j5 = j4 / j3;
                    long j6 = j2 % j3;
                    long j7 = j4 % j3;
                    long j8 = j5 % ((long) 24);
                    StringBuilder sb = new StringBuilder();
                    if (iIntValue != 1 || j8 > 0) {
                        if (j8 < 10) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('0');
                            sbLIZ.append(j8);
                            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            strValueOf = String.valueOf(j8);
                        }
                        sb.append(strValueOf);
                        sb.append(':');
                    }
                    if (j7 < 10) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('0');
                        sbLIZ2.append(j7);
                        strValueOf2 = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        strValueOf2 = String.valueOf(j7);
                    }
                    sb.append(strValueOf2);
                    sb.append(':');
                    if (j6 < 10) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('0');
                        sbLIZ3.append(j6);
                        strValueOf3 = C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        strValueOf3 = String.valueOf(j6);
                    }
                    sb.append(strValueOf3);
                    c1765700w365.setText(sb.toString());
                    return;
                }
                return;
            }
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("no need to show flash sale, currentState = ");
        sbLIZ4.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C786410Ut5.H(I5(), 8);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLIZ.getValue(), 8);
        View view = this.itemView;
        C1752970viZ item = getItem();
        if (item != null && (productTile = item.LLILLL) != null) {
            list = productTile.tagList;
        }
        R5(view, list);
    }
}
