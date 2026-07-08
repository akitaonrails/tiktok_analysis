package com.ss.android.ugc.aweme.tako.otherpage.image.style;

import X.C01GW;
import X.C06X5;
import X.C0HZQ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1385040m98;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS137S0100000_2;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoImageStyleItemCell extends PowerCell<C06X5> {
    public FrameLayout LL;
    public SmartImageView LLILLJJLI;
    public C0HZQ LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 867));
    public C06X5 LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fmy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.x_c);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = ((Number) this.LLILZLL.getValue()).intValue();
        layoutParams.height = ((Number) this.LLILZLL.getValue()).intValue();
        C786410Ut5.a6(frameLayout, layoutParams);
        this.LL = frameLayout;
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.x__);
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.x_b);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, C1385040m98.LIZ(c0hzq.getContext(), true));
        c0hzq.setCheckBoxUncheckedColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        c0hzq.setClickable(false);
        this.LLILLL = c0hzq;
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.x_d);
        View viewFindViewById = this.itemView.findViewById(R.id.x_a);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        this.LLILZIL = viewFindViewById;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        SmartImageView smartImageView;
        ConvertStyleItem convertStyleItem;
        String str5;
        ConvertStyleItem convertStyleItem2;
        TuxTextView tuxTextView;
        String str6;
        ConvertStyleItem convertStyleItem3;
        C06X5 c06x5 = (C06X5) interfaceC1891350zJl;
        super.onBindItemView(c06x5);
        C06X5 c06x52 = this.LLIZ;
        ColorDrawable colorDrawable = null;
        if (c06x52 != null && (convertStyleItem3 = c06x52.LLILLL) != null) {
            str = convertStyleItem3.imageStyle;
        } else {
            str = null;
        }
        ConvertStyleItem convertStyleItem4 = c06x5.LLILLL;
        if (convertStyleItem4 != null) {
            str2 = convertStyleItem4.imageStyle;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2) && (tuxTextView = this.LLILZ) != null) {
            ConvertStyleItem convertStyleItem5 = c06x5.LLILLL;
            if (convertStyleItem5 != null) {
                str6 = convertStyleItem5.imageStyle;
            } else {
                str6 = null;
            }
            tuxTextView.setText(str6);
        }
        C06X5 c06x53 = this.LLIZ;
        if (c06x53 != null && (convertStyleItem2 = c06x53.LLILLL) != null) {
            str3 = convertStyleItem2.picUrl;
        } else {
            str3 = null;
        }
        ConvertStyleItem convertStyleItem6 = c06x5.LLILLL;
        if (convertStyleItem6 != null) {
            str4 = convertStyleItem6.picUrl;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str3, str4) && (smartImageView = this.LLILLJJLI) != null && (convertStyleItem = c06x5.LLILLL) != null && (str5 = convertStyleItem.picUrl) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str5);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, smartImageView.getContext());
            if (numLIZJ != null) {
                colorDrawable = new ColorDrawable(numLIZJ.intValue());
            }
            c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(smartImageView, "image_convert_style_1", str5, C2097608Jq.LJ());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        this.LLIZ = c06x5;
        C0HZQ c0hzq = this.LLILLL;
        if (c0hzq != null) {
            c0hzq.setChecked(c06x5.LLILLJJLI);
        }
        C786410Ut5.I7(new ACListenerS137S0100000_2(c06x5, 58), this.itemView);
    }
}
