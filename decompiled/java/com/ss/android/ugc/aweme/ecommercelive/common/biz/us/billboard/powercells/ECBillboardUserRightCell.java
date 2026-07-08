package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells;

import X.C03DZ;
import X.C046000Eo;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C19411510wz;
import X.C19ME;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1769850w9n;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ActivityConfigItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.PromotionConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS41S0200000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class ECBillboardUserRightCell extends PowerCell<C046000Eo> implements InterfaceC20631915oL {
    public TuxTextView LL;
    public SmartImageView LLILLJJLI;
    public LinearLayout LLILLL;
    public FrameLayout LLILZ;
    public ViewGroup LLILZIL;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bx7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.y1t);
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.xor);
        this.LLILZ = (FrameLayout) this.itemView.findViewById(R.id.kl2);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.kl4);
        this.LLILZIL = viewGroup;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zk);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewGroup.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            frameLayout.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ?? arrayList;
        int i;
        List<String> urls;
        String str;
        List<ActivityConfigItem> list;
        List<String> urls2;
        String str2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        String string;
        C046000Eo c046000Eo = (C046000Eo) interfaceC1891350zJl;
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            String str3 = c046000Eo.LL.title;
            if (str3 != null && (string = a0.LJLIIIL(str3).toString()) != null) {
                if (new Regex("\\s+").containsMatchIn(string)) {
                    string = new Regex("\\s+").replaceFirst(string, "\n");
                }
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        int i2 = c046000Eo.LLILLL;
        if (i2 > 1) {
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                C03DZ.LIZJ(viewGroup);
            }
            FrameLayout frameLayout = this.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) / i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
            }
            LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 != null) {
                layoutParams2 = linearLayout2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                LinearLayout linearLayout3 = this.LLILLL;
                if (linearLayout3 != null) {
                    C786410Ut5.d6(linearLayout3, marginLayoutParams2);
                }
            }
        } else {
            ViewGroup viewGroup2 = this.LLILZIL;
            if (viewGroup2 != null) {
                C03DZ.LIZ(viewGroup2);
            }
            LinearLayout linearLayout4 = this.LLILLL;
            if (linearLayout4 != null) {
                layoutParams = linearLayout4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                LinearLayout linearLayout5 = this.LLILLL;
                if (linearLayout5 != null) {
                    C786410Ut5.d6(linearLayout5, marginLayoutParams);
                }
            }
        }
        Image image = c046000Eo.LL.icon;
        if (image != null && (urls2 = image.getUrls()) != null && (str2 = (String) C13LP.LJJJLL(urls2)) != null && str2.length() != 0) {
            C19411510wz.LIZIZ(C19411510wz.LIZ, str2, EnumC1769850w9n.LIVE_BILLBOARD_AUDIENCE_ICON_IMAGE);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
            c1331670kl3LIZLLL.LJJ(this.LLILLJJLI);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            SmartImageView smartImageView = this.LLILLJJLI;
            if (smartImageView != null) {
                C03DZ.LIZJ(smartImageView);
            }
        } else {
            SmartImageView smartImageView2 = this.LLILLJJLI;
            if (smartImageView2 != null) {
                C03DZ.LIZ(smartImageView2);
            }
        }
        PromotionConfig promotionConfig = c046000Eo.LL.promotionConfig;
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
        LinearLayout linearLayout6 = this.LLILLL;
        if (linearLayout6 != null) {
            linearLayout6.setGravity(8388611);
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ActivityConfigItem activityConfigItem2 = (ActivityConfigItem) obj;
                ?? r6 = this.LLILLL;
                if (r6 != 0) {
                    LinearLayout linearLayout7 = new LinearLayout(this.itemView.getContext());
                    linearLayout7.setOrientation(0);
                    linearLayout7.setGravity(8388627);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (i3 > 0) {
                        i = 6;
                    } else {
                        i = 0;
                    }
                    layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                    C786410Ut5.d6(linearLayout7, layoutParams3);
                    Image image2 = c046000Eo.LL.subIcon;
                    if (image2 != null && (urls = image2.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null && str.length() != 0) {
                        SmartImageView smartImageView3 = new SmartImageView(this.itemView.getContext());
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                        layoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        C786410Ut5.G6(smartImageView3, layoutParams4);
                        C19411510wz.LIZIZ(C19411510wz.LIZ, str, EnumC1769850w9n.LIVE_BILLBOARD_AUDIENCE_SUB_ICON_IMAGE);
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str);
                        c1331670kl3LIZLLL2.LJJ(smartImageView3);
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                        linearLayout7.addView(smartImageView3);
                    }
                    TuxTextView tuxTextView2 = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                    C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                    tuxTextView2.setTuxFont(81);
                    tuxTextView2.setTextColorRes(R.attr.a0p);
                    tuxTextView2.setText(activityConfigItem2.text);
                    linearLayout7.addView(tuxTextView2);
                    r6.addView(linearLayout7);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C786410Ut5.I7(new AjS41S0200000_6(c046000Eo, this, 1), this.itemView);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLILZ;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.setMarginStart(i * layoutParams2.width);
        }
        FrameLayout frameLayout2 = this.LLILZ;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams2);
        }
    }
}
