package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C038L;
import X.C03C8;
import X.C03D7;
import X.C1005503wT;
import X.C10515049h;
import X.C13LE;
import X.C13LP;
import X.C1748720vbi;
import X.C1755030vlt;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C809103Eb;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpBtm;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpRichTextContainerData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichTextContainerVH extends AbsFullSpanVH<SeaPdpRichTextContainerData> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
    }

    public SeaPdpRichTextContainerVH(ViewGroup viewGroup) {
        super(new C03D7(viewGroup.getContext()));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 74));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03D7 c03d7;
        Integer numLIZ;
        int i;
        TextView textView;
        Integer numLIZ2;
        final SeaPdpRichTextContainerData seaPdpRichTextContainerData = (SeaPdpRichTextContainerData) obj;
        View view = this.itemView;
        if ((view instanceof C03D7) && (c03d7 = (C03D7) view) != null) {
            CustomColor customColor = seaPdpRichTextContainerData.backgroundColor;
            if (customColor != null && (numLIZ2 = C038L.LIZ(customColor, c03d7.getContext(), null)) != null) {
                c03d7.setBackgroundColor(numLIZ2.intValue());
            } else {
                c03d7.setBackground(null);
            }
            C809103Eb c809103Eb = C809103Eb.LIZ;
            SmartImageView smartImageView = c03d7.LL;
            Icon icon = seaPdpRichTextContainerData.icon;
            c809103Eb.getClass();
            C809103Eb.LIZ(smartImageView, icon);
            List<ECRichText> list = seaPdpRichTextContainerData.content;
            if (list != null) {
                List listLJJJJLI = C13LP.LJJJJLI(list);
                int childCount = c03d7.LLILLJJLI.getChildCount();
                int size = ((ArrayList) listLJJJJLI).size();
                if (childCount > size) {
                    C786410Ut5.LJJZZI(c03d7.LLILLJJLI, size, childCount - size);
                } else if (childCount < size) {
                    while (childCount < size) {
                        LinearLayout linearLayout = c03d7.LLILLJJLI;
                        if (childCount > 0) {
                            i = C03D7.LLJIJIL;
                        } else {
                            i = 0;
                        }
                        TuxTextView tuxTextView = new TuxTextView(c03d7.getContext(), null, 6, 0);
                        tuxTextView.setId(LinearLayout.generateViewId());
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.topMargin = i;
                        C786410Ut5.R6(tuxTextView, marginLayoutParams);
                        tuxTextView.setGravity(8388627);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setTuxFont(61);
                        tuxTextView.setTextColorRes(R.attr.a1i);
                        linearLayout.addView(tuxTextView);
                        childCount++;
                    }
                }
                for (int i2 = 0; i2 < size; i2++) {
                    View childAt = c03d7.LLILLJJLI.getChildAt(i2);
                    if ((childAt instanceof TuxTextView) && (textView = (TextView) childAt) != null) {
                        C03C8.LIZJ(textView, (ECRichText) C13LP.LJJJLZIJ(i2, listLJJJJLI), "sea_pdp_richtext_container", null);
                    }
                }
            } else {
                C786410Ut5.LJJJJJL(c03d7.LLILLJJLI);
            }
            ECRichText eCRichText = seaPdpRichTextContainerData.arrowContent;
            if (eCRichText != null) {
                C786410Ut5.LLLLZLL(c03d7.LLILZ, 0);
                C03C8.LIZJ(c03d7.LLILZ, eCRichText, "sea_pdp_richtext_end_arrow_content", null);
            } else {
                C786410Ut5.LLLLZLL(c03d7.LLILZ, 8);
            }
            CustomColor customColor2 = seaPdpRichTextContainerData.arrowColor;
            if (customColor2 != null && (numLIZ = C038L.LIZ(customColor2, c03d7.getContext(), null)) != null) {
                c03d7.LLILLL.setTintColor(numLIZ.intValue());
            } else {
                c03d7.LLILLL.setTintColorRes(R.attr.a1k);
            }
        }
        C1005503wT c1005503wT = C1005503wT.LIZ;
        SeaPdpBtm seaPdpBtm = seaPdpRichTextContainerData.btm;
        c1005503wT.getClass();
        final String strLIZ = C1005503wT.LIZ(seaPdpBtm);
        final PageFinder pageFinderVia = PageFinder.via(this.itemView);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.03wS
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view2) {
                int value;
                C1005503wT c1005503wT2 = C1005503wT.LIZ;
                Context context = this.LLILZ.itemView.getContext();
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) this.LLILZ.LLJJIJIL.getValue();
                SeaPdpRichTextContainerData seaPdpRichTextContainerData2 = seaPdpRichTextContainerData;
                String str = seaPdpRichTextContainerData2.schema;
                Integer num = seaPdpRichTextContainerData2.schemaType;
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = EnumC1005603wU.COUPON.getValue();
                }
                Map<String, String> map = seaPdpRichTextContainerData.trackParamsForSchema;
                String str2 = strLIZ;
                View view3 = this.LLILZ.itemView;
                c1005503wT2.getClass();
                C1005503wT.LIZJ(context, seaPdpViewModel, str, value, map, str2, view3);
                C1748720vbi.LJ(this.LLILZ.itemView, new C10516049i(), strLIZ, pageFinderVia, new AwS580S0100000_1(seaPdpRichTextContainerData, 809));
            }
        }, this.itemView);
        C1748720vbi.LJI(this.itemView, new C10515049h(), new AwS545S0100000_1(seaPdpRichTextContainerData, 1680), strLIZ, pageFinderVia, new AwS580S0100000_1(seaPdpRichTextContainerData, 810));
    }
}
