package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells;

import X.C03DZ;
import X.C046100Ep;
import X.C123100dR;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LP;
import X.C1729270v6L;
import X.C19411510wz;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1769850w9n;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ActivityConfigItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.Price;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ProductConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.PromotionConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS41S0200000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ECBillboardProductCell extends PowerCell<C046100Ep> implements InterfaceC20631915oL {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public SmartImageView LLILZLL;
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public ViewGroup LLJ;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bx5;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.rsx);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.fat);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ptu);
        this.LLILZ = tuxTextView;
        if (tuxTextView != null) {
            TextPaint paint = tuxTextView.getPaint();
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ry2);
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILZLL = (SmartImageView) this.itemView.findViewById(R.id.rxu);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.rzv);
        this.LLIZLLLIL = (FrameLayout) this.itemView.findViewById(R.id.kl2);
        this.LLJ = (ViewGroup) this.itemView.findViewById(R.id.kl4);
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ka);
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(10));
            linearLayout.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zc);
            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(10));
            tuxTextView2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        SmartImageView smartImageView = this.LLILZLL;
        if (smartImageView != null) {
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zl);
            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            smartImageView.setBackground(c384050F3z3.LIZ(this.itemView.getContext()));
        }
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C384050F3z c384050F3z4 = new C384050F3z();
            c384050F3z4.LIZIZ = Integer.valueOf(R.attr.zk);
            c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewGroup.setBackground(c384050F3z4.LIZ(this.itemView.getContext()));
        }
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C384050F3z c384050F3z5 = new C384050F3z();
            c384050F3z5.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            frameLayout.setBackground(c384050F3z5.LIZ(this.itemView.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        ActivityConfigItem activityConfigItem;
        List<ActivityConfigItem> list;
        String str4;
        Object obj;
        String str5;
        Price price;
        Price price2;
        String str6;
        Price price3;
        Price price4;
        C046100Ep c046100Ep = (C046100Ep) interfaceC1891350zJl;
        int i = c046100Ep.LLILLL;
        boolean z = true;
        if (i > 1) {
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                C03DZ.LIZJ(viewGroup);
            }
            FrameLayout frameLayout = this.LLIZLLLIL;
            if (frameLayout != null) {
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) / i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
            }
        } else {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 != null) {
                C03DZ.LIZ(viewGroup2);
            }
        }
        ProductConfig productConfig = c046100Ep.LL.productConfig;
        ArrayList arrayList = null;
        if (productConfig != null && (price4 = productConfig.price) != null) {
            str = price4.promotionPriceStr;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        String str7 = "";
        if (z) {
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText("");
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                C03DZ.LIZ(tuxTextView3);
            }
            SmartImageView smartImageView = this.LLILZLL;
            if (smartImageView != null) {
                smartImageView.setImageURI("");
            }
            TuxTextView tuxTextView4 = this.LLIZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText("");
            }
            TuxTextView tuxTextView5 = this.LL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(c046100Ep.LL.title);
            }
            String str8 = c046100Ep.LL.billboardId;
            if (str8 != null) {
                str7 = str8;
            }
            C1729270v6L.LIZ("product_template_skeleton", null, null, null, null, null, str7, 0, 0, 0, 958);
        } else {
            TuxTextView tuxTextView6 = this.LLILLL;
            if (tuxTextView6 != null) {
                ProductConfig productConfig2 = c046100Ep.LL.productConfig;
                if (productConfig2 != null && (price3 = productConfig2.price) != null) {
                    str6 = price3.promotionPriceStr;
                } else {
                    str6 = null;
                }
                tuxTextView6.setText(str6);
            }
            TuxTextView tuxTextView7 = this.LLILZIL;
            if (tuxTextView7 != null) {
                C03DZ.LIZJ(tuxTextView7);
            }
            ProductConfig productConfig3 = c046100Ep.LL.productConfig;
            if (productConfig3 != null && (price2 = productConfig3.price) != null) {
                str2 = price2.originalPriceStr;
            } else {
                str2 = null;
            }
            if (C123100dR.LIZ(str2)) {
                TuxTextView tuxTextView8 = this.LLILZ;
                if (tuxTextView8 != null) {
                    ProductConfig productConfig4 = c046100Ep.LL.productConfig;
                    if (productConfig4 != null && (price = productConfig4.price) != null) {
                        str5 = price.originalPriceStr;
                    } else {
                        str5 = null;
                    }
                    tuxTextView8.setText(str5);
                }
                TuxTextView tuxTextView9 = this.LLILZ;
                if (tuxTextView9 != null) {
                    C03DZ.LIZJ(tuxTextView9);
                }
            } else {
                TuxTextView tuxTextView10 = this.LLILZ;
                if (tuxTextView10 != null) {
                    C03DZ.LIZ(tuxTextView10);
                }
            }
            TuxTextView tuxTextView11 = this.LLILZIL;
            if (tuxTextView11 != null) {
                ProductConfig productConfig5 = c046100Ep.LL.productConfig;
                if (productConfig5 == null || (obj = productConfig5.index) == null) {
                    obj = "";
                }
                tuxTextView11.setText(obj.toString());
            }
            ProductConfig productConfig6 = c046100Ep.LL.productConfig;
            if (productConfig6 != null && (str4 = productConfig6.imageUrl) != null) {
                C19411510wz.LIZIZ(C19411510wz.LIZ, str4, EnumC1769850w9n.LIVE_BILLBOARD_AUDIENCE_PRODUCT_IMAGE);
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str4);
                c1331670kl3LIZLLL.LJJ(this.LLILZLL);
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
            PromotionConfig promotionConfig = c046100Ep.LL.promotionConfig;
            if (promotionConfig != null && (list = promotionConfig.activityConfigItems) != null) {
                arrayList = new ArrayList();
                for (ActivityConfigItem activityConfigItem2 : list) {
                    if (Intrinsics.LJFF(activityConfigItem2.chosen, Boolean.TRUE)) {
                        arrayList.add(activityConfigItem2);
                    }
                }
            }
            TuxTextView tuxTextView12 = this.LLIZ;
            if (tuxTextView12 != null) {
                if (arrayList == null || (activityConfigItem = (ActivityConfigItem) C13LP.LJJJLZIJ(0, arrayList)) == null || (str3 = activityConfigItem.text) == null) {
                    str3 = "";
                }
                tuxTextView12.setText(str3);
            }
            TuxTextView tuxTextView13 = this.LL;
            if (tuxTextView13 != null) {
                tuxTextView13.setText(c046100Ep.LL.title);
            }
            String str9 = c046100Ep.LL.billboardId;
            if (str9 != null) {
                str7 = str9;
            }
            C1729270v6L.LIZ("product_template_real_data", null, null, null, null, null, str7, 0, 0, 0, 958);
        }
        C786410Ut5.I7(new AjS41S0200000_6(c046100Ep, this, 0), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.itemView.getContext()).cloneInContext(new ContextThemeWrapper(this.itemView.getContext(), R.style.acp)), R.layout.bx5, viewGroup, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLIZLLLIL;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.setMarginStart(i * layoutParams2.width);
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams2);
        }
    }
}
