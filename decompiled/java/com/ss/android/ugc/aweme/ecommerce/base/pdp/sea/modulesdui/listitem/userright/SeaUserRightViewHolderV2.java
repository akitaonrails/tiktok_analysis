package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright;

import X.C01GW;
import X.C038L;
import X.C03IV;
import X.C0GYY;
import X.C1054104Ah;
import X.C118300cf;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2011207uI;
import X.C2097608Jq;
import X.C259800zU;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.C956003oU;
import X.C956403oY;
import X.C956503oZ;
import Y.ACListenerS105S0200000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class SeaUserRightViewHolderV2 extends PdpHolder<C03IV> {
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final List<String> LLJLL = C1697810uHb.LJIIJJI("author_id", "biz_type", "coupon_cost_role", "coupon_type", "coupon_type_info", "enter_from_info", "entrance_form", "entrance_info", "is_ad", "original_price", "original_price_highest", "original_price_lowest", "sale_price", "sale_price_highest", "sale_price_lowest", "product_id");
    public final Fragment LLJJIJIL;
    public final C01GW LLJJJ;
    public C03IV LLJJJIL;
    public final LinearLayout LLJJJJ;
    public final TuxTextView LLJJJJJIL;
    public final HorizontalScrollView LLJJJJLIIL;
    public final ConstraintLayout LLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final String c6(String str) {
        ?? LJ;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Uri uri = UriProtector.parse(str);
        Map mapLJIIJ = C1741890vQh.LJIIJ(C2011207uI.LIZJ(uri, "trackParams"));
        if (mapLJIIJ == null) {
            mapLJIIJ = new LinkedHashMap();
        }
        mapLJIIJ.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        mapLJIIJ.put("previous_page", "product_detail");
        C1054104Ah c1054104Ah = ((SeaPdpViewModel) this.LLJJJ.getValue()).LLJLIL;
        if (c1054104Ah != null && (concurrentHashMap = c1054104Ah.LIZIZ) != null) {
            LJ = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                if (LLJLL.contains(entry.getKey())) {
                    LJ.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        mapLJIIJ.putAll(LJ);
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLJIIJ);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (str2 != null && !str2.equals("trackParams")) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            }
        }
        return C956403oY.LIZ(builderClearQuery.build(), strLJIIIIZZ).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str;
        Context context;
        int size;
        List<ExposeUserRight> list;
        List<ExposeUserRight> list2;
        String str2;
        Integer numLIZ;
        Integer numLIZ2;
        final C03IV c03iv = (C03IV) obj;
        if (!Intrinsics.LJFF(c03iv, this.LLJJJIL)) {
            this.LLJJJIL = c03iv;
            ExposeUserRightPanel exposeUserRightPanel = c03iv.LL.exposeUserRightPanel;
            int i = 0;
            if (exposeUserRightPanel != null) {
                CustomColor customColor = exposeUserRightPanel.bgStartColor;
                if (customColor != null) {
                    numLIZ = C038L.LIZ(customColor, this.itemView.getContext(), null);
                } else {
                    numLIZ = null;
                }
                CustomColor customColor2 = exposeUserRightPanel.bgEndColor;
                if (customColor2 != null) {
                    numLIZ2 = C038L.LIZ(customColor2, this.itemView.getContext(), null);
                } else {
                    numLIZ2 = null;
                }
                if (numLIZ != null && numLIZ2 != null) {
                    Drawable background = this.LLJJJJ.getBackground();
                    if (background instanceof GradientDrawable) {
                        GradientDrawable gradientDrawable = (GradientDrawable) background;
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
                        gradientDrawable.setColors(new int[]{numLIZ.intValue(), numLIZ2.intValue()});
                        this.LLJJJJ.setBackground(background);
                    } else {
                        this.LLJJJJ.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{numLIZ.intValue(), numLIZ2.intValue()}));
                    }
                } else {
                    this.LLJJJJ.setBackground(null);
                }
            }
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                ExposeUserRightPanel exposeUserRightPanel2 = c03iv.LL.exposeUserRightPanel;
                if (exposeUserRightPanel2 != null) {
                    str2 = exposeUserRightPanel2.title;
                } else {
                    str2 = null;
                }
                tuxTextView.setText(str2);
            }
            ConstraintLayout constraintLayout = this.LLJJL;
            if (constraintLayout != null) {
                C786410Ut5.LJJJJL(constraintLayout);
            }
            ConstraintLayout constraintLayout2 = this.LLJJL;
            if (constraintLayout2 != null && (context = constraintLayout2.getContext()) != null) {
                ExposeUserRightPanel exposeUserRightPanel3 = c03iv.LL.exposeUserRightPanel;
                if (exposeUserRightPanel3 != null && (list2 = exposeUserRightPanel3.exposeUserRights) != null) {
                    size = list2.size() / 2;
                } else {
                    size = 0;
                }
                C118300cf c118300cf = new C118300cf();
                C259800zU c259800zU = new C259800zU();
                ExposeUserRightPanel exposeUserRightPanel4 = c03iv.LL.exposeUserRightPanel;
                if (exposeUserRightPanel4 != null && (list = exposeUserRightPanel4.exposeUserRights) != null) {
                    C956003oU c956003oU = new C956003oU(context, this, c259800zU, c118300cf, size);
                    int iLIZ = C0GYY.LIZ(0, list.size() - 1, 2);
                    if (iLIZ >= 0) {
                        while (true) {
                            int i2 = i + 1;
                            if (i2 < list.size()) {
                                c956003oU.invoke(ListProtector.get(list, i), ListProtector.get(list, i2));
                            } else {
                                c956003oU.invoke(ListProtector.get(list, i), null);
                            }
                            if (i == iLIZ) {
                                break;
                            } else {
                                i += 2;
                            }
                        }
                    }
                }
            }
            ConstraintLayout constraintLayout3 = this.LLJJL;
            if (constraintLayout3 != null) {
                C786410Ut5.Y7(constraintLayout3, new ACListenerS105S0200000_1(this, c03iv, 9));
            }
            final C817403Hg c817403Hg = new C817403Hg();
            final int scaledTouchSlop = ViewConfiguration.get(this.itemView.getContext()).getScaledTouchSlop();
            HorizontalScrollView horizontalScrollView = this.LLJJJJLIIL;
            if (horizontalScrollView != null) {
                horizontalScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: X.03IU
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        Integer numValueOf;
                        C1054104Ah c1054104Ah;
                        String str3;
                        String str4 = null;
                        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                            if (numValueOf.intValue() == 0) {
                                c817403Hg.element = motionEvent.getX();
                                return false;
                            }
                            if (numValueOf.intValue() != 1) {
                                return false;
                            }
                            float x = motionEvent.getX() - c817403Hg.element;
                            if (Math.abs(x) <= scaledTouchSlop || (c1054104Ah = ((SeaPdpViewModel) this.LLJJJ.getValue()).LLJLIL) == null) {
                                return false;
                            }
                            if (x > 0.0f) {
                                str3 = "left";
                            } else {
                                str3 = "right";
                            }
                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("glide_type", str3));
                            ExposeUserRightPanel exposeUserRightPanel5 = c03iv.LL.exposeUserRightPanel;
                            if (exposeUserRightPanel5 != null) {
                                str4 = exposeUserRightPanel5.daInfo;
                            }
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                            if (interfaceC1748810vbrLJJIZ == null) {
                                return false;
                            }
                            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10517049j(), new AwS86S1200000_1(c1054104Ah, str4, mapLIZJ, 21));
                            return false;
                        }
                        return false;
                    }
                });
            }
        }
        C1054104Ah c1054104Ah = ((SeaPdpViewModel) this.LLJJJ.getValue()).LLJLIL;
        if (c1054104Ah != null) {
            ExposeUserRightPanel exposeUserRightPanel5 = c03iv.LL.exposeUserRightPanel;
            if (exposeUserRightPanel5 != null) {
                str = exposeUserRightPanel5.daInfo;
            } else {
                str = null;
            }
            C1054104Ah.LJJIIZI(1, c1054104Ah, str, null);
        }
        C786410Ut5.I7(new AjS40S0200000_1(this, c03iv, 34), this.itemView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaUserRightViewHolderV2(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(0, C1755600vmo.LIZ(R.layout.ang, context, viewGroup, false, false), true);
        this.LLJJIJIL = eCBaseFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 117));
        this.LLJJJJ = (LinearLayout) this.itemView.findViewById(R.id.ulj);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.yza);
        this.LLJJJJJIL = tuxTextView;
        this.LLJJL = (ConstraintLayout) this.itemView.findViewById(R.id.user_right_details_container);
        this.LLJJJJLIIL = (HorizontalScrollView) this.itemView.findViewById(R.id.user_right_details_scrollView);
        if (((Boolean) C956503oZ.LIZ.getValue()).booleanValue()) {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.y4h);
            TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.y4g);
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_shield_tick);
            }
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(61);
            }
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1k);
            }
        }
    }
}
