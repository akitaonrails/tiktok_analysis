package com.ss.android.ugc.aweme.captionsheet;

import X.C01GW;
import X.C0OM1;
import X.C1238760iLC;
import X.C1308910kAL;
import X.C13LP;
import X.C1839820xye;
import X.C20693015yC;
import X.C20693915yL;
import X.C20698415z4;
import X.C20700315zN;
import X.C20703515zt;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1390800mIQ;
import X.InterfaceC20698115z1;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1077400e8w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PhotoTranslationPanelFragment extends BaseCaptionSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/ISHELIOSo2PGscISAnJxE+KCEgJCQ4ICA9GCQiLCMVOiQrJCo9PA==";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C20693015yC LLJ;
    public C20693915yL LLJI;
    public C1238760iLC LLJIJIL;
    public String[] LLJILJIL;
    public final boolean LLJILJILJ;
    public final C01GW LLJILLL;

    public PhotoTranslationPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean RR() {
        return false;
    }

    public final EnumC1390800mIQ getEnterMethod() {
        InterfaceC20698115z1 interfaceC20698115z1;
        EnumC1390800mIQ enterMethod;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        return (c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null || (enterMethod = interfaceC20698115z1.getEnterMethod()) == null) ? EnumC1390800mIQ.LONG_PRESS : enterMethod;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1Sn = super.Sn();
        c0om1Sn.LIZLLL = true;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            c0om1Sn.LIZJ(numLIZJ.intValue());
        }
        c0om1Sn.LIZLLL = false;
        return c0om1Sn;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        this.LLJILJIL = C20700315zN.LIZJ();
        ZR(this.LLJILJIL);
        C20693915yL c20693915yL = this.LLJI;
        if (c20693915yL != null) {
            c20693915yL.LJI(new AwS590S0100000_11(this, 597));
        }
        if (this.LLJILJILJ) {
            View viewFindViewById = this.LLIZLLLIL;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
                this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
            if (PR()) {
                C786410Ut5.x3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077400e8w(this, viewOnAttachStateChangeListenerC20604515jv, 2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean PR() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C20693015yC SR() {
        return this.LLJ;
    }

    public PhotoTranslationPanelFragment(int i) {
        this.LLJILJILJ = true;
        this.LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1580));
    }

    public final void ZR(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            C1238760iLC c1238760iLC = this.LLJIJIL;
            if (c1238760iLC != null) {
                c1238760iLC.LJI(AFwS276S0000000_31.get$arr$(57));
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                C20703515zt.LIZ.getClass();
                arrayList.add(C20703515zt.LJII(str));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
            C1238760iLC c1238760iLC2 = this.LLJIJIL;
            if (c1238760iLC2 != null) {
                c1238760iLC2.LJIIIIZZ(strLJJLIIIJ);
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        Context context = getContext();
        TuxTextView tuxTextView = null;
        if (context != null) {
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            tuxTextView = tuxTextView2;
            tuxTextView2.setText(getString(2131828825));
            tuxTextView2.setTextColorRes(R.attr.bb);
            tuxTextView2.setTuxFont(42);
        }
        linearLayout.addView(tuxTextView);
        C1238760iLC c1238760iLC3 = this.LLJIJIL;
        if (c1238760iLC3 != null) {
            c1238760iLC3.LJI(new AwS610S0100000_31(linearLayout, 141));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.my);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final View VR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.adc, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v83 */
    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
