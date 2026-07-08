package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup;

import X.C01GW;
import X.C03C8;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C13LP;
import X.C1421670n6D;
import X.C15438062q;
import X.C1744700vVE;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.EnumC1769850w9n;
import X.InterfaceC1891350zJl;
import X.RunnableC514501zT;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS156S0100000_22;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class IconLabelHorizontalCell extends PowerCell<IconLabelItem> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.as_, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        int iIntValue;
        int iLIZIZ;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        Image icon;
        ArrayList arrayList;
        IconLabelItem iconLabelItem = (IconLabelItem) interfaceC1891350zJl;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ehn);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.ehm);
        Icon icon2 = iconLabelItem.icon;
        if (icon2 != null) {
            if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                icon = icon2.getIconDark();
            } else {
                icon = icon2.getIcon();
            }
            if (icon != null) {
                List<String> urls = icon.getUrls();
                if (urls != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
                    for (String str : urls) {
                        C1334210kp9.LIZIZ(str, EnumC1769850w9n.PDP_ICON_LABEL_GROUP, null, null, false, false, null, null);
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                icon.setUrls(arrayList);
            }
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            int viewWidth = icon2.getViewWidth();
            if (viewWidth == null) {
                viewWidth = 20;
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(viewWidth));
            int viewHeight = icon2.getViewHeight();
            if (viewHeight == null) {
                viewHeight = 20;
            }
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(viewHeight));
            C786410Ut5.G6(smartImageView, layoutParams);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        } else {
            C786410Ut5.LLFF(8, smartImageView);
        }
        ECRichText eCRichText = iconLabelItem.description;
        if (eCRichText != null) {
            Integer num = iconLabelItem.maxDisplayLines;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
            tuxTextView.setMaxLines(iIntValue);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C03C8.LIZJ(tuxTextView, eCRichText, "pdp_icon_label_horizontal_view", null);
            int length = tuxTextView.getText().length();
            List<MaxWidthRule> list2 = iconLabelItem.maxWidthRules;
            if (list2 != null && !list2.isEmpty()) {
                for (MaxWidthRule maxWidthRule : list2) {
                    Integer num2 = maxWidthRule.maxChar;
                    if (num2 == null || (iIntValue4 = num2.intValue()) == -1 || length <= iIntValue4) {
                        Integer num3 = maxWidthRule.maxWidth;
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
                    }
                }
                Integer num4 = ((MaxWidthRule) C13LP.LJJLIIIJJI(list2)).maxWidth;
                if (num4 != null) {
                    iIntValue2 = num4.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            }
            int lineCount = StaticLayout.Builder.obtain(tuxTextView.getText(), 0, tuxTextView.getText().length(), tuxTextView.getPaint(), iLIZIZ).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(tuxTextView.getIncludeFontPadding()).setMaxLines(tuxTextView.getMaxLines()).build().getLineCount();
            int iMax = 0;
            for (int i = 0; i < lineCount; i++) {
                iMax = Math.max(iMax, (int) Math.ceil(r10.getLineMax(i)));
            }
            if (iMax <= iLIZIZ) {
                iLIZIZ = iMax;
            }
            tuxTextView.setMaxWidth(iLIZIZ);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new RunnableC514501zT(tuxTextView, tuxTextView, 28));
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1421670n6D.LIZIZ(this.itemView, new AwS566S0100000_22(iconLabelItem, 892), new AwS601S0100000_22(iconLabelItem, 686));
        C786410Ut5.I7(new ACListenerS156S0100000_22(iconLabelItem, 46), this.itemView);
    }
}
