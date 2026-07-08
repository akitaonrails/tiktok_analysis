package com.bytedance.android.livesdk.comp.impl.game.partnership.ui;

import X.C1554300qY8;
import X.C1BHX;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public class GamePartnershipWebviewDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiHELIOSOS4hPCspOzw7ITViPCZ9DyQhLB8yOjEiLD0gICw8HioxPiwpPgs6KSkjLg==";
    public View LLJLLL;
    public FrameLayout LLJZ;
    public TuxIconView LLJZIJLIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = this.LLJZIJLIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new View.OnClickListener() { // from class: X.0xw3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.close(1);
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        String string3;
        View viewFindViewById;
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_url")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        TuxIconView tuxIconView = null;
        if (arguments2 != null) {
            string2 = arguments2.getString("arg_title");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("arg_desc");
        } else {
            string3 = null;
        }
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = string;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402653199);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gnj, viewGroup, false);
        this.LLJLLL = viewTd;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.jit);
        } else {
            viewFindViewById = null;
        }
        View view = this.LLJLLL;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.tv_title);
        } else {
            textView = null;
        }
        View view2 = this.LLJLLL;
        if (view2 != null) {
            textView2 = (TextView) view2.findViewById(R.id.zhs);
        } else {
            textView2 = null;
        }
        View view3 = this.LLJLLL;
        if (view3 != null) {
            frameLayout = (FrameLayout) view3.findViewById(R.id.webview_container);
        } else {
            frameLayout = null;
        }
        this.LLJZ = frameLayout;
        View view4 = this.LLJLLL;
        if (view4 != null) {
            tuxIconView = (TuxIconView) view4.findViewById(R.id.cov);
        }
        this.LLJZIJLIL = tuxIconView;
        if (string2 != null && !a0.LJJJIL(string2) && textView != null) {
            textView.setText(string2);
        }
        if (string3 != null && !a0.LJJJIL(string3) && textView2 != null) {
            textView2.setText(string3);
        }
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ezq);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
        C1BHX c1bhxLIZ = C1554300qY8.LIZ(requireContext(), sparkThirdContext);
        FrameLayout frameLayout2 = this.LLJZ;
        if (frameLayout2 != null) {
            frameLayout2.addView(c1bhxLIZ);
        }
        if (c1bhxLIZ != null) {
            c1bhxLIZ.LIZ(sparkThirdContext);
        }
        if (getResources().getConfiguration().orientation == 2) {
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            if (viewFindViewById != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                viewFindViewById.setBackground(gradientDrawable);
                viewFindViewById.setClipToOutline(true);
                viewFindViewById.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            FrameLayout frameLayout3 = this.LLJZ;
            if (frameLayout3 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(-1);
                gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ});
                frameLayout3.setBackground(gradientDrawable2);
                frameLayout3.setClipToOutline(true);
                frameLayout3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
        }
        View view5 = this.LLJLLL;
        if (view5 == null) {
            return new FrameLayout(requireContext());
        }
        return view5;
    }
}
