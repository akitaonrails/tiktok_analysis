package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.AbstractC1764350w0v;
import X.C03C8;
import X.C098200Yq;
import X.C13BV;
import X.C1697810uHb;
import X.C1744700vVE;
import X.C1765050w23;
import X.C1765060w24;
import X.C1765080w26;
import X.C189200o6;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419020Gbs;
import X.C419030Gbt;
import X.C419040Gbu;
import X.C786410Ut5;
import X.C809103Eb;
import X.C814420VxA;
import X.C961403pM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS160S0100000_26;
import Y.ACListenerS58S0101000_26;
import Y.ARunnableS95S0200000_26;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer.SeaPdpRichTextContainerBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vo.SeaPdpAction;
import com.zhiliaoapp.musically.R;
import irm.AkS93S0100000_26;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpRichTextContainerBffVH extends AbsCardVH<SeaPdpRichTextContainerBffVO, C1765060w24, C1765080w26> {
    public final C419020Gbs LLJJI;
    public SmartImageView LLJJIII;
    public C419030Gbt LLJJIJI;
    public C419040Gbu LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C1765050w23 LLJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void LIZIZ() {
        Map<String, ? extends Object> map;
        VM vm = this.LLJIJIL;
        if (vm == 0 || (map = vm.LLILZIL.LJIJI) == null || !map.containsKey("moduleClick")) {
            return;
        }
        vm.LIZ("moduleClick", null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void e6() {
        PageStateContext pageStateContextA6;
        super.e6();
        String str = this.LLJJIJIL;
        if (str != null && (pageStateContextA6 = a6()) != null) {
            PageStateContext.LJFF(pageStateContextA6, "page_show_type", str);
        }
        this.LLJJIJIL = null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0w23] */
    public SeaPdpRichTextContainerBffVH(ViewGroup viewGroup) {
        C419020Gbs c419020Gbs = new C419020Gbs(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419020Gbs);
        c419020Gbs.setLayoutParams(layoutParams);
        c419020Gbs.setLayoutDirection(viewGroup.getLayoutDirection());
        super(c419020Gbs);
        View view = this.itemView;
        this.LLJJI = (C419020Gbs) view;
        this.LLJJJ = new IPageStateContextCallback() { // from class: X.0w23
            @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback
            public final void invoke(Object obj, Object obj2) {
                SeaPdpRichTextContainerBffVH seaPdpRichTextContainerBffVH = this.LIZ;
                HandlerHook.viewPost(seaPdpRichTextContainerBffVH.itemView, new ARunnableS95S0200000_26(seaPdpRichTextContainerBffVH, obj2, 8));
            }
        };
        C786410Ut5.I7(new AkS93S0100000_26(this, 0), view);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void b6(AbstractC1764350w0v abstractC1764350w0v) {
        boolean z;
        Icon icon;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        Object objLIZ;
        Integer num;
        PageStateContext pageStateContextA6;
        List<SeaPdpRichTextContainerMiddleItem> list;
        List list2;
        TuxTextView tuxTextView;
        SeaPdpAction seaPdpAction;
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float fFloatValue;
        int i;
        Integer num2;
        C1765060w24 c1765060w24 = (C1765060w24) abstractC1764350w0v;
        SeaPdpRichTextContainerLeftData seaPdpRichTextContainerLeftData = ((SeaPdpRichTextContainerBffVO) c1765060w24.LLILZ).left;
        C419020Gbs c419020Gbs = this.LLJJI;
        if (seaPdpRichTextContainerLeftData != null && (num2 = seaPdpRichTextContainerLeftData.layout) != null && num2.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        c419020Gbs.setLeftTopAligned(z);
        String strLIZIZ = null;
        if (seaPdpRichTextContainerLeftData != null) {
            icon = seaPdpRichTextContainerLeftData.icon;
        } else {
            icon = null;
        }
        if (icon == null) {
            removeView(this.LLJJIII);
            this.LLJJIII = null;
        } else {
            SmartImageView smartImageView = this.LLJJIII;
            if (smartImageView == null) {
                smartImageView = new SmartImageView(this.itemView.getContext());
                C786410Ut5.G6(smartImageView, new ViewGroup.MarginLayoutParams(-2, -2));
                this.LLJJI.addView(smartImageView, 0);
                this.LLJJIII = smartImageView;
            }
            C809103Eb c809103Eb = C809103Eb.LIZ;
            Icon icon2 = seaPdpRichTextContainerLeftData.icon;
            c809103Eb.getClass();
            C809103Eb.LIZ(smartImageView, icon2);
            List<Float> list3 = seaPdpRichTextContainerLeftData.padding;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (list3 != null && list3.size() == 4) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list3, 3)));
                } else {
                    iLIZIZ = 0;
                }
                if (list3 != null && list3.size() == 4) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list3, 0)));
                } else {
                    iLIZIZ2 = 0;
                }
                if (list3 != null && list3.size() == 4) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list3, 1)));
                } else {
                    iLIZIZ3 = 0;
                }
                if (list3 != null && list3.size() == 4) {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list3, 2)));
                } else {
                    iLIZIZ4 = 0;
                }
                if (marginLayoutParams.leftMargin != iLIZIZ || marginLayoutParams.topMargin != iLIZIZ2 || marginLayoutParams.rightMargin != iLIZIZ3 || marginLayoutParams.bottomMargin != iLIZIZ4) {
                    marginLayoutParams.leftMargin = iLIZIZ;
                    marginLayoutParams.topMargin = iLIZIZ2;
                    marginLayoutParams.rightMargin = iLIZIZ3;
                    marginLayoutParams.bottomMargin = iLIZIZ4;
                    C786410Ut5.W5(smartImageView, marginLayoutParams);
                }
            }
        }
        SeaPdpRichTextContainerMiddleData seaPdpRichTextContainerMiddleData = ((SeaPdpRichTextContainerBffVO) c1765060w24.LLILZ).middle;
        if (seaPdpRichTextContainerMiddleData != null && (list = seaPdpRichTextContainerMiddleData.items) != null && !list.isEmpty()) {
            C419030Gbt c419030Gbt = this.LLJJIJI;
            if (c419030Gbt == null) {
                c419030Gbt = new C419030Gbt(this.itemView.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419030Gbt);
                c419030Gbt.setLayoutParams(marginLayoutParams3);
                C419020Gbs c419020Gbs2 = this.LLJJI;
                if (this.LLJJIII == null) {
                    i = 0;
                } else {
                    i = 1;
                }
                c419020Gbs2.addView(c419030Gbt, i);
                this.LLJJIJI = c419030Gbt;
            }
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(c1765060w24, 758);
            if (seaPdpRichTextContainerMiddleData == null || (list2 = seaPdpRichTextContainerMiddleData.items) == null) {
                list2 = C13BV.INSTANCE;
            }
            while (c419030Gbt.getChildCount() > list2.size()) {
                View childAt = c419030Gbt.getChildAt(c419030Gbt.getChildCount() - 1);
                if (!(childAt instanceof TuxTextView) || childAt == null) {
                    break;
                }
                int childCount = c419030Gbt.getChildCount() - 1;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c419030Gbt, null);
                c419030Gbt.removeViewAt(childCount);
                c419030Gbt.LLILLJJLI.addLast((TuxTextView) childAt);
            }
            while (c419030Gbt.getChildCount() < list2.size()) {
                TuxTextView tuxTextViewPollFirst = c419030Gbt.LLILLJJLI.pollFirst();
                if (tuxTextViewPollFirst != null) {
                    C786410Ut5.wd(tuxTextViewPollFirst, 0.0f);
                    C786410Ut5.B5(tuxTextViewPollFirst, 1.0f);
                    C786410Ut5.h9(tuxTextViewPollFirst, null);
                    tuxTextViewPollFirst.setClickable(false);
                    tuxTextViewPollFirst.setMaxLines(Integer.MAX_VALUE);
                } else {
                    tuxTextViewPollFirst = new TuxTextView(c419030Gbt.getContext(), null, 6, 0);
                    C786410Ut5.R6(tuxTextViewPollFirst, new LinearLayout.LayoutParams(-2, -2));
                    tuxTextViewPollFirst.setGravity(8388627);
                    tuxTextViewPollFirst.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextViewPollFirst.setTuxFont(61);
                    tuxTextViewPollFirst.setTextColorRes(R.attr.a1i);
                }
                c419030Gbt.addView(tuxTextViewPollFirst);
            }
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SeaPdpRichTextContainerMiddleItem seaPdpRichTextContainerMiddleItem = (SeaPdpRichTextContainerMiddleItem) obj;
                    View childAt2 = c419030Gbt.getChildAt(i2);
                    if ((childAt2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) childAt2) != null) {
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            Float f = seaPdpRichTextContainerMiddleItem.topSpace;
                            if (f != null) {
                                fFloatValue = f.floatValue();
                            } else {
                                fFloatValue = 0.0f;
                            }
                            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                            if (marginLayoutParams2.topMargin != iLIZIZ5) {
                                marginLayoutParams2.topMargin = iLIZIZ5;
                                C786410Ut5.R6(tuxTextView, marginLayoutParams2);
                            }
                        }
                        C03C8.LIZJ(tuxTextView, seaPdpRichTextContainerMiddleItem.richText, "sea_pdp_richtext_container", null);
                        Map<String, SeaPdpAction> map = seaPdpRichTextContainerMiddleItem.action;
                        if (map != null && (seaPdpAction = map.get("click")) != null && (str = seaPdpAction.actionName) != null && str.length() != 0) {
                            C786410Ut5.h9(tuxTextView, new ACListenerS58S0101000_26(i2, awS605S0100000_26, 3));
                            tuxTextView.setClickable(true);
                        } else {
                            C786410Ut5.h9(tuxTextView, null);
                            tuxTextView.setClickable(false);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C961403pM.LIZ(c419030Gbt, seaPdpRichTextContainerMiddleData.padding);
        } else {
            removeView(this.LLJJIJI);
            this.LLJJIJI = null;
        }
        PageStateContext pageStateContextA62 = a6();
        if (pageStateContextA62 != null) {
            objLIZ = PageStateContext.LIZ(pageStateContextA62, "page_show_type");
        } else {
            objLIZ = null;
        }
        if (objLIZ instanceof Integer) {
            num = (Integer) objLIZ;
        } else {
            num = null;
        }
        f6(c1765060w24, num);
        this.LLJJI.LJI(this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL);
        String str2 = this.LLJJIJIL;
        if (str2 != null && (pageStateContextA6 = a6()) != null) {
            PageStateContext.LJFF(pageStateContextA6, "page_show_type", str2);
        }
        this.LLJJIJIL = null;
        PageStateContext pageStateContextA63 = a6();
        if (pageStateContextA63 != null) {
            strLIZIZ = PageStateContext.LIZIZ(pageStateContextA63, "page_show_type", this.LLJJJ);
        }
        this.LLJJIJIL = strLIZIZ;
    }

    public final void removeView(View view) {
        ViewParent parent;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        C419020Gbs c419020Gbs = this.LLJJI;
        if (parent == c419020Gbs) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c419020Gbs, view);
            c419020Gbs.removeView(view);
        }
    }

    public final void f6(C1765060w24 c1765060w24, Integer num) {
        Integer num2;
        String color;
        Object c098200Yq;
        LinearLayout.LayoutParams layoutParams;
        SeaPdpAction seaPdpAction;
        String str;
        int i;
        if (c1765060w24 == null) {
            return;
        }
        SeaPdpRichTextContainerRightData seaPdpRichTextContainerRightData = ((SeaPdpRichTextContainerBffVO) c1765060w24.LLILZ).right;
        boolean z = false;
        if (seaPdpRichTextContainerRightData != null && ((seaPdpRichTextContainerRightData.richText != null || Intrinsics.LJFF(seaPdpRichTextContainerRightData.showArrow, Boolean.TRUE)) && (((num2 = seaPdpRichTextContainerRightData.showMode) == null || num2.intValue() != 1 || (num != null && num.intValue() == 2)) && seaPdpRichTextContainerRightData != null))) {
            C419040Gbu c419040Gbu = this.LLJJIJIIJIL;
            if (c419040Gbu == null) {
                c419040Gbu = new C419040Gbu(this.itemView.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419040Gbu);
                c419040Gbu.setLayoutParams(marginLayoutParams);
                this.LLJJI.addView(c419040Gbu);
                this.LLJJIJIIJIL = c419040Gbu;
            }
            if (seaPdpRichTextContainerRightData.richText != null) {
                TuxTextView tuxTextView = c419040Gbu.LL;
                if (tuxTextView == null) {
                    tuxTextView = new TuxTextView(c419040Gbu.getContext(), null, 6, 0);
                    C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    c419040Gbu.addView(tuxTextView, 0);
                    c419040Gbu.LL = tuxTextView;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C03C8.LIZJ(tuxTextView, seaPdpRichTextContainerRightData.richText, "sea_pdp_richtext_end_arrow_content", null);
            } else {
                TuxTextView tuxTextView2 = c419040Gbu.LL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                TuxTextView tuxTextView3 = c419040Gbu.LL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText((CharSequence) null);
                }
            }
            Boolean bool = seaPdpRichTextContainerRightData.showArrow;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2) && seaPdpRichTextContainerRightData.customIcon != null) {
                SmartImageView smartImageView = c419040Gbu.LLILLJJLI;
                if (smartImageView == null) {
                    smartImageView = new SmartImageView(c419040Gbu.getContext());
                    C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(-2, -2));
                    C786410Ut5.LLFF(8, smartImageView);
                    c419040Gbu.LIZ(smartImageView);
                    if (c419040Gbu.LL == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    c419040Gbu.addView(smartImageView, i);
                    c419040Gbu.LLILLJJLI = smartImageView;
                }
                C786410Ut5.LLFF(0, smartImageView);
                C809103Eb c809103Eb = C809103Eb.LIZ;
                Icon icon = seaPdpRichTextContainerRightData.customIcon;
                c809103Eb.getClass();
                C809103Eb.LIZ(smartImageView, icon);
                TuxIconView tuxIconView = c419040Gbu.LLILLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
            } else {
                SmartImageView smartImageView2 = c419040Gbu.LLILLJJLI;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(8, smartImageView2);
                }
                SmartImageView smartImageView3 = c419040Gbu.LLILLJJLI;
                if (smartImageView3 != null) {
                    smartImageView3.setImageDrawable(null);
                }
                if (Intrinsics.LJFF(seaPdpRichTextContainerRightData.showArrow, bool2)) {
                    TuxIconView tuxIconView2 = c419040Gbu.LLILLL;
                    if (tuxIconView2 == null) {
                        tuxIconView2 = new TuxIconView(c419040Gbu.getContext(), null, 0, 6, null);
                        C786410Ut5.M6(tuxIconView2, new LinearLayout.LayoutParams(-2, -2));
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                        ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
                        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                            int i2 = C419040Gbu.LLILZIL;
                            layoutParams.width = i2;
                            layoutParams.height = i2;
                            C786410Ut5.M6(tuxIconView2, layoutParams);
                        }
                        tuxIconView2.setIconRes(R.raw.icon_chevron_right_offset_ltr);
                        tuxIconView2.setTintColorRes(R.attr.a1k);
                        c419040Gbu.LIZ(tuxIconView2);
                        c419040Gbu.addView(tuxIconView2);
                        c419040Gbu.LLILLL = tuxIconView2;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    CommonColor commonColor = seaPdpRichTextContainerRightData.arrowColor;
                    if (C1744700vVE.LJ(c419040Gbu.getContext(), null)) {
                        if (commonColor != null) {
                            color = commonColor.getDarkColor();
                            if (color == null && !a0.LJJJIL(color)) {
                                try {
                                    if (!u.LJJIIJZLJL(color, "#", false)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append('#');
                                        sbLIZ.append(color);
                                        color = C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    tuxIconView2.setTintColor(Color.parseColor(color));
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    tuxIconView2.setTintColor(0);
                                    tuxIconView2.setTintColorRes(R.attr.a1k);
                                }
                            }
                        }
                        tuxIconView2.setTintColorRes(R.attr.a1k);
                    } else {
                        if (commonColor != null) {
                            color = commonColor.getColor();
                            if (color == null) {
                            }
                        }
                        tuxIconView2.setTintColorRes(R.attr.a1k);
                    }
                } else {
                    TuxIconView tuxIconView3 = c419040Gbu.LLILLL;
                    if (tuxIconView3 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                    }
                }
            }
            C961403pM.LIZ(c419040Gbu, seaPdpRichTextContainerRightData.padding);
            c419040Gbu.setInternalSpace(seaPdpRichTextContainerRightData.space);
            Map<String, SeaPdpAction> map = seaPdpRichTextContainerRightData.action;
            if (map != null && (seaPdpAction = map.get("click")) != null && (str = seaPdpAction.actionName) != null && str.length() != 0) {
                C786410Ut5.ob(c419040Gbu, new ACListenerS160S0100000_26(c1765060w24, 31));
                c419040Gbu.setClickable(true);
            } else {
                C786410Ut5.ob(c419040Gbu, null);
                c419040Gbu.setClickable(false);
            }
            C419020Gbs c419020Gbs = this.LLJJI;
            Integer num3 = seaPdpRichTextContainerRightData.layout;
            if (num3 != null && num3.intValue() == 1) {
                z = true;
            }
            c419020Gbs.setRightFollowMiddle(z);
            this.LLJJI.LJI(this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL);
            return;
        }
        removeView(this.LLJJIJIIJIL);
        this.LLJJIJIIJIL = null;
        this.LLJJI.setRightFollowMiddle(false);
        this.LLJJI.LJI(this.LLJJIII, this.LLJJIJI, null);
    }
}
