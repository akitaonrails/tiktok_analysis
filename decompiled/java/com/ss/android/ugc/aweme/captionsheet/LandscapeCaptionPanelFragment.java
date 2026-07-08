package com.ss.android.ugc.aweme.captionsheet;

import X.C0OM1;
import X.C1250250idj;
import X.C1308910kAL;
import X.C1440005kM;
import X.C19319010i4;
import X.C19319110i5;
import X.C19EG;
import X.C20698415z4;
import X.C418440Gaw;
import X.C715550S4z;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC20698315z3;
import X.InterfaceC20698115z1;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class LandscapeCaptionPanelFragment extends CaptionsPanelFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/ISHELIOSo2PGsAKCE3OyYtOSoQKTU4ICA9GCQiLCMVOiQrJCo9PA==";
    public final EnumC20698315z3 LLJJJJ;

    public LandscapeCaptionPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean PR() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getTitle();
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZJ(0);
        return c0om1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final C19319110i5 gS() {
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        return new C19319110i5(new C19319010i4("", true, false, objArr, objArr2, null, null == true ? 1 : 0, null == true ? 1 : 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, objArr3, objArr4, 54268));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void oS() {
        InterfaceC20698115z1 interfaceC20698115z1;
        Aweme aweme;
        super.oS();
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        C1440005kM.LIZ(new C715550S4z((c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null || (aweme = interfaceC20698115z1.getAweme()) == null) ? null : aweme.getAid(), false));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void qS() {
        InterfaceC20698115z1 interfaceC20698115z1;
        Aweme aweme;
        super.qS();
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        C1440005kM.LIZ(new C715550S4z((c20698415z4 == null || (interfaceC20698115z1 = c20698415z4.LIZ) == null || (aweme = interfaceC20698115z1.getAweme()) == null) ? null : aweme.getAid(), true));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final EnumC20698315z3 iS() {
        return this.LLJJJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeCaptionPanelFragment(int i) {
        super(0);
        EnumC20698315z3 enumC20698315z3 = EnumC20698315z3.LANDSCAPE_CAPTIONS;
        this.LLJJJJ = enumC20698315z3;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void sS(Context context) {
        context.setTheme(R.style.hm);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final ViewGroup NR(ViewGroup viewGroup, C19EG c19eg) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(c19eg, R.style.hm);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375)), -1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.oh, contextThemeWrapper);
        if (numLIZJ != null) {
            linearLayout.setBackgroundColor(numLIZJ.intValue());
        }
        return linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final View VR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewVR = super.VR(layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), R.style.hm)), viewGroup);
        viewVR.setBackground(null);
        return viewVR;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.p1z);
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        }
        View viewFindViewById2 = view.findViewById(R.id.rn0);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setPadding(viewFindViewById2.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), viewFindViewById2.getPaddingEnd(), viewFindViewById2.getPaddingBottom());
        }
    }
}
