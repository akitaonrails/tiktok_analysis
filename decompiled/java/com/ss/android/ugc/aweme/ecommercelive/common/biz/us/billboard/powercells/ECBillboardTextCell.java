package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells;

import X.C03DZ;
import X.C045900En;
import X.C13BV;
import X.C1697810uHb;
import X.C19ME;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ActivityConfigItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.PromotionConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ECBillboardTextCell extends PowerCell<C045900En> implements InterfaceC20631915oL {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public ViewGroup LLILZ;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bx6;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.xor);
        this.LLILLL = (FrameLayout) this.itemView.findViewById(R.id.kl2);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.kl4);
        this.LLILZ = viewGroup;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zk);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewGroup.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            frameLayout.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ?? arrayList;
        int i;
        List<ActivityConfigItem> list;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C045900En c045900En = (C045900En) interfaceC1891350zJl;
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c045900En.LL.title);
        }
        int i2 = c045900En.LLILLL;
        if (i2 > 1) {
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                C03DZ.LIZJ(viewGroup);
            }
            FrameLayout frameLayout = this.LLILLL;
            if (frameLayout != null) {
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) / i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
            }
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 != null) {
                layoutParams2 = linearLayout2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                LinearLayout linearLayout3 = this.LLILLJJLI;
                if (linearLayout3 != null) {
                    C786410Ut5.d6(linearLayout3, marginLayoutParams2);
                }
            }
        } else {
            ViewGroup viewGroup2 = this.LLILZ;
            if (viewGroup2 != null) {
                C03DZ.LIZ(viewGroup2);
            }
            LinearLayout linearLayout4 = this.LLILLJJLI;
            if (linearLayout4 != null) {
                layoutParams = linearLayout4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                LinearLayout linearLayout5 = this.LLILLJJLI;
                if (linearLayout5 != null) {
                    C786410Ut5.d6(linearLayout5, marginLayoutParams);
                }
            }
        }
        PromotionConfig promotionConfig = c045900En.LL.promotionConfig;
        if (promotionConfig != null && (list = promotionConfig.activityConfigItems) != null) {
            arrayList = new ArrayList();
            for (ActivityConfigItem activityConfigItem : list) {
                if (Intrinsics.LJFF(activityConfigItem.chosen, Boolean.TRUE)) {
                    arrayList.add(activityConfigItem);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.size() == 1) {
            LinearLayout linearLayout6 = this.LLILLJJLI;
            if (linearLayout6 != null) {
                linearLayout6.setGravity(1);
            }
        } else {
            LinearLayout linearLayout7 = this.LLILLJJLI;
            if (linearLayout7 != null) {
                linearLayout7.setGravity(8388611);
            }
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ActivityConfigItem activityConfigItem2 = (ActivityConfigItem) obj;
                LinearLayout linearLayout8 = this.LLILLJJLI;
                if (linearLayout8 != null) {
                    int size = arrayList.size();
                    TuxTextView tuxTextView2 = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    if (i3 > 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    C786410Ut5.R6(tuxTextView2, layoutParams3);
                    if (size == 1) {
                        tuxTextView2.setTextAlignment(4);
                    }
                    tuxTextView2.setTuxFont(81);
                    tuxTextView2.setTextColorRes(R.attr.a0p);
                    tuxTextView2.setText(activityConfigItem2.text);
                    linearLayout8.addView(tuxTextView2);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLILLL;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.setMarginStart(i * layoutParams2.width);
        }
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams2);
        }
    }
}
