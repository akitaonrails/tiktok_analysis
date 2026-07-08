package com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.vo;

import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1708610uZ1;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1711340udQ;
import X.C1712670ufZ;
import X.C1712690ufb;
import X.C1712700ufc;
import X.C1712720ufe;
import X.C1712760ufi;
import X.C1712770ufj;
import X.C1722120uuo;
import X.C1841350y17;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1709240ua2;
import X.EnumC1711310udN;
import X.EnumC1712730uff;
import X.InterfaceC1709310ua9;
import X.InterfaceC1891350zJl;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS60S1200000_26;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.LinkBlock;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundOptionCell extends PowerCell<C1712670ufZ> {
    public String LL = "request_refund";

    public final void L5(C1712670ufZ c1712670ufZ) {
        int i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C1722120uuo.LIZ(6));
        int iLIZ = C1722120uuo.LIZ(1);
        Context context = this.itemView.getContext();
        if (c1712670ufZ.LLIZ) {
            if (c1712670ufZ.LL == EnumC1709240ua2.TOKO) {
                i = R.attr.dt;
            } else {
                i = R.attr.a04;
            }
        } else {
            i = R.attr.a01;
        }
        gradientDrawable.setStroke(iLIZ, C1712770ufj.LIZ(i, context));
        this.itemView.findViewById(R.id.t2r).setBackground(gradientDrawable);
    }

    public final void N5(C1712670ufZ c1712670ufZ) {
        boolean z;
        String str = c1712670ufZ.LLILZIL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2s), 8);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2s), 0);
            ((TextView) this.itemView.findViewById(R.id.t2s)).setText(c1712670ufZ.LLILZIL);
        }
    }

    public final void P5(C1712670ufZ c1712670ufZ) {
        boolean z;
        float f;
        float f2;
        if (c1712670ufZ.LLILZLL) {
            C786410Ut5.I7(new ACListenerS128S0200000_26(c1712670ufZ, this, 8), this.itemView);
            C786410Ut5.e9((C1841350y17) this.itemView.findViewById(R.id.t2v), new ACListenerS128S0200000_26(c1712670ufZ, this, 9));
        } else {
            C786410Ut5.I7(null, this.itemView);
            C786410Ut5.e9((C1841350y17) this.itemView.findViewById(R.id.t2v), null);
        }
        ((C1841350y17) this.itemView.findViewById(R.id.t2v)).setEnabled(c1712670ufZ.LLILZLL);
        C1841350y17 c1841350y17 = (C1841350y17) this.itemView.findViewById(R.id.t2v);
        if (c1712670ufZ.LLILZLL) {
            z = c1712670ufZ.LLIZ;
        } else {
            z = false;
        }
        c1841350y17.setChecked(z);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.t2y);
        float f3 = 1.0f;
        if (c1712670ufZ.LLILZLL) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.B5(tuxTextView, f);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.t2s);
        if (c1712670ufZ.LLILZLL) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        C786410Ut5.B5(tuxTextView2, f2);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.t2u);
        if (!c1712670ufZ.LLILZLL) {
            f3 = 0.4f;
        }
        C786410Ut5.W4(linearLayout, f3);
    }

    public final void R5(C1712670ufZ c1712670ufZ) {
        String str;
        C1712690ufb c1712690ufb;
        LinkBlock linkBlock = c1712670ufZ.LLJILJIL;
        if (linkBlock != null && C123100dR.LIZ(linkBlock.linkText)) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2t), 0);
            ((TextView) this.itemView.findViewById(R.id.t2t)).setText(c1712670ufZ.LLJILJIL.linkText);
            ArrayList<C1712690ufb> arrayList = c1712670ufZ.LLJIJIL;
            String str2 = "";
            if (arrayList == null || (c1712690ufb = (C1712690ufb) C13LP.LJJJLL(arrayList)) == null || (str = c1712690ufb.LLJILJIL) == null) {
                str = "";
            }
            C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.t2t), new ACListenerS60S1200000_26(c1712670ufZ, this, str, 2));
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(c1712670ufZ.LLILLL);
            String str3 = this.LL;
            String str4 = c1712670ufZ.LLJILJIL.buttonName;
            if (str4 != null) {
                str2 = str4;
            }
            interfaceC1709310ua9LIZIZ.LJ(str3, str2, null, C2097608Jq.LJIIIIZZ(new Pair("page_name", str3), new Pair("payment_option", str)));
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2t), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public final void S5(C1712670ufZ c1712670ufZ) {
        ?? arrayList;
        C1712700ufc c1712700ufc;
        C1712690ufb c1712690ufb;
        String str;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.t2u);
        ArrayList<C1712690ufb> arrayList2 = c1712670ufZ.LLJIJIL;
        if (arrayList2 != null) {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (C1712690ufb c1712690ufb2 : arrayList2) {
                C1712690ufb c1712690ufb3 = c1712690ufb2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1712690ufb3.LLJ);
                sbLIZ.append(c1712690ufb3.LLJI);
                if (hashSet.add(C2188811AlT.LIZIZ(sbLIZ))) {
                    arrayList.add(c1712690ufb2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        int childCount = linearLayout.getChildCount() - arrayList.size();
        if (childCount > 0) {
            C786410Ut5.LJJZZI(linearLayout, 0, childCount);
        } else if (childCount < 0) {
            int iAbs = Math.abs(childCount);
            for (int i = 0; i < iAbs; i++) {
                linearLayout.addView(new C1712700ufc(this.itemView.getContext()));
            }
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1712690ufb c1712690ufb4 = (C1712690ufb) obj;
                View childAt = linearLayout.getChildAt(i2);
                if ((childAt instanceof C1712700ufc) && (c1712700ufc = (C1712700ufc) childAt) != null && ((c1712690ufb = c1712700ufc.LLILZ) == null || (!c1712690ufb.areContentsTheSame(c1712690ufb4)))) {
                    c1712700ufc.LLILZ = c1712690ufb4;
                    String str2 = c1712690ufb4.LLILZ;
                    String str3 = c1712690ufb4.LL;
                    if (C123100dR.LIZ(c1712690ufb4.LLILLL)) {
                        str = c1712690ufb4.LLILLL;
                    } else {
                        str = c1712690ufb4.LLILLJJLI;
                        if (str == null) {
                            str = "";
                        }
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
                    c1331670kl3LJIIIZ.LJJIIZI(C1308910kAL.LJ(R.attr.c7, c1712700ufc.getContext()));
                    c1331670kl3LJIIIZ.LJJ(c1712700ufc.getPaymentMethodIconFromXml());
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    SmartImageView paymentMethodIconFromXml = c1712700ufc.getPaymentMethodIconFromXml();
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = C12ES.LIZJ(3.0f, c1712700ufc.getContext());
                    paymentMethodIconFromXml.setCircleOptions(new C1331730kl9(c1331750klB));
                    C786410Ut5.u5(c1712700ufc.getPaymentMethodIconFromXml(), 1.0f);
                    c1712700ufc.getPaymentMethodNameFromXml().setText(str3);
                    if (str.length() == 0) {
                        C786410Ut5.LLLLZLL(c1712700ufc.getPaymentMethodDescFromXml(), 8);
                    } else {
                        c1712700ufc.getPaymentMethodDescFromXml().setText(str);
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void T5(C1712670ufZ c1712670ufZ) {
        if (c1712670ufZ.LL == EnumC1709240ua2.TOKO) {
            ((C1841350y17) this.itemView.findViewById(R.id.t2v)).LIZ(C1712770ufj.LIZ(R.attr.dt, this.itemView.getContext()), C1712770ufj.LIZ(R.attr.a01, this.itemView.getContext()));
        } else {
            ((C1841350y17) this.itemView.findViewById(R.id.t2v)).LIZ(C1712770ufj.LIZ(R.attr.a04, this.itemView.getContext()), C1712770ufj.LIZ(R.attr.a01, this.itemView.getContext()));
        }
    }

    public final void U5(C1712670ufZ c1712670ufZ) {
        C1712720ufe c1712720ufe;
        ((TextView) this.itemView.findViewById(R.id.t2y)).setText(c1712670ufZ.LLILZ);
        ArrayList<C1712720ufe> arrayList = c1712670ufZ.LLJ;
        if (arrayList != null) {
            c1712720ufe = (C1712720ufe) C13LP.LJJJLL(arrayList);
        } else {
            c1712720ufe = null;
        }
        if (c1712720ufe != null) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2w), 0);
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.t2w);
            tuxTextView.setText(c1712720ufe.LL);
            tuxTextView.setTuxFont(82);
            C1711340udQ c1711340udQ = C1711340udQ.LIZ;
            Context context = tuxTextView.getContext();
            String str = c1712720ufe.LLILLJJLI;
            String str2 = c1712720ufe.LLILZ;
            c1711340udQ.getClass();
            tuxTextView.setTextColor(C1711340udQ.LIZLLL(C1711340udQ.LIZIZ(context, str, str2), "#089292"));
            tuxTextView.setIncludeFontPadding(false);
            tuxTextView.setGravity(16);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C1722120uuo.LIZ(4));
            gradientDrawable.setColor(C1711340udQ.LIZLLL(C1711340udQ.LIZIZ(tuxTextView.getContext(), c1712720ufe.LLILLL, c1712720ufe.LLILZIL), "#1F00B8B9"));
            tuxTextView.setPaddingRelative(C1722120uuo.LIZ(4), C1722120uuo.LIZ(1), C1722120uuo.LIZ(4), C1722120uuo.LIZ(1));
            tuxTextView.setBackground(gradientDrawable);
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.t2w), 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1712670ufZ c1712670ufZ = (C1712670ufZ) interfaceC1891350zJl;
        super.onBindItemView(c1712670ufZ);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("RefundCashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindItemView ");
        sbLIZ.append(c1712670ufZ.LLILZ);
        c1708720uZCLIZ.LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
        T5(c1712670ufZ);
        if (c1712670ufZ.LLILLJJLI == EnumC1711310udN.MAIN) {
            this.LL = "select_refund_method";
        }
        U5(c1712670ufZ);
        N5(c1712670ufZ);
        S5(c1712670ufZ);
        R5(c1712670ufZ);
        P5(c1712670ufZ);
        L5(c1712670ufZ);
        I5(c1712670ufZ, EnumC1712730uff.LL);
        if (c1712670ufZ.LLIZ) {
            I5(c1712670ufZ, EnumC1712730uff.LLILLJJLI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1708710uZB.LIZ("RefundCashier").LIZ(3, "onCreateItemView");
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dw4, false, 4, null);
    }

    public final void I5(C1712670ufZ c1712670ufZ, EnumC1712730uff enumC1712730uff) {
        String str;
        String str2;
        String str3;
        boolean z;
        ArrayList<C1712690ufb> arrayList;
        int iOrdinal = enumC1712730uff.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            str = "tiktokls_select_option";
        } else {
            str = "tiktokls_option_show";
        }
        int iOrdinal2 = enumC1712730uff.ordinal();
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                str2 = "1";
            } else if (iOrdinal2 == 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                throw new C1954807lC();
            }
        } else {
            str2 = "";
        }
        if (c1712670ufZ.LLILZLL) {
            str4 = "1";
        }
        String str5 = "original_payment_methods";
        if (!c1712670ufZ.LIZIZ()) {
            str3 = "original_payment_methods";
        } else {
            str3 = "refund_to_credit";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", this.LL);
        linkedHashMap.put("parent_option_name", str3);
        ArrayList<C1712690ufb> arrayList2 = c1712670ufZ.LLJIJIL;
        if (arrayList2 != null) {
            Iterator<C1712690ufb> it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1712690ufb next = it2.next();
                if (Intrinsics.LJFF(next.LLILZLL, "refund_to_wallet")) {
                    str5 = next.LLJILJIL;
                    break;
                }
            }
        }
        linkedHashMap.put("option_name", str5);
        linkedHashMap.put("rank", String.valueOf(c1712670ufZ.LLJILLL));
        linkedHashMap.put("status_code", str4);
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put("is_default", str2);
        }
        C1708610uZ1.LIZIZ(c1712670ufZ.LLILLL).LIZ(str, linkedHashMap);
        if (!c1712670ufZ.LIZIZ() && (arrayList = c1712670ufZ.LLJIJIL) != null) {
            for (C1712690ufb c1712690ufb : arrayList) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("page_name", this.LL);
                linkedHashMap2.put("parent_option_name", str3);
                linkedHashMap2.put("option_name", c1712690ufb.LLJILJIL);
                linkedHashMap2.put("rank", String.valueOf(c1712690ufb.LLJIJIL));
                linkedHashMap2.put("status_code", str4);
                if (str2.length() > 0) {
                    linkedHashMap2.put("is_default", str2);
                }
                C1708610uZ1.LIZIZ(c1712670ufZ.LLILLL).LIZ(str, linkedHashMap2);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1712670ufZ c1712670ufZ = (C1712670ufZ) interfaceC1891350zJl;
        super.onBindItemView(c1712670ufZ, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C1712760ufi) {
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("RefundCashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBindItemView ");
            sbLIZ.append(objLJJJLZIJ);
            c1708720uZCLIZ.LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
            C1712760ufi c1712760ufi = (C1712760ufi) objLJJJLZIJ;
            if (c1712760ufi.LIZ) {
                ((C1841350y17) this.itemView.findViewById(R.id.t2v)).setChecked(c1712670ufZ.LLIZ);
                L5(c1712670ufZ);
                if (c1712670ufZ.LLIZ) {
                    I5(c1712670ufZ, EnumC1712730uff.LLILLL);
                }
            }
            if (c1712760ufi.LIZIZ) {
                P5(c1712670ufZ);
            }
            if (c1712760ufi.LIZJ || c1712760ufi.LJ) {
                U5(c1712670ufZ);
            }
            if (c1712760ufi.LIZLLL) {
                N5(c1712670ufZ);
            }
            if (c1712760ufi.LJFF) {
                S5(c1712670ufZ);
            }
            if (c1712760ufi.LJI) {
                R5(c1712670ufZ);
            }
            if (c1712760ufi.LJII) {
                T5(c1712670ufZ);
            }
        }
    }
}
