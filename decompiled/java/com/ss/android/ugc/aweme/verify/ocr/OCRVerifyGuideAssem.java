package com.ss.android.ugc.aweme.verify.ocr;

import X.C019F;
import X.C01GW;
import X.C05FS;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C13LE;
import X.C1533950q1J;
import X.C1637806bA;
import X.C1713570uh1;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1714950ujF;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C344820DfU;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C431360Gvm;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.verify.base.model.OCRVerifyButton;
import com.bytedance.pipo.verify.base.model.OCRVerifyGuideContent;
import com.bytedance.pipo.verify.base.model.OCRVerifySecurity;
import com.bytedance.pipo.verify.base.model.OCRVerifyStepItem;
import com.bytedance.pipo.verify.base.model.OCRVerifySteps;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem;
import com.ss.android.ugc.aweme.verify.ab.OcrVerifyGuidePictureSettings;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class OCRVerifyGuideAssem extends BaseVerifyUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1153));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1157));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1158));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1151));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1148));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1150));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1147));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1160));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1156));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1149));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1152));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1154));
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OCRVerifyGuideAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/verify/ocr/OCRVerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OCRVerifyGuideAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OCRVerifyViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 1155), AFwS268S0000000_26.get$arr$(481), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1159));
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem
    public final boolean Ho() {
        return true;
    }

    public final OCRVerifyViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (OCRVerifyViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        OCRVerifyViewModel.LLIZ = null;
        OCRVerifyViewModel.LLIZLLLIL = null;
        OCRVerifyViewModel.LLJI = false;
        OCRVerifyViewModel.LLJILJIL = false;
        OCRVerifyViewModel.LLJIJIL = false;
    }

    public static void Vo(OCRVerifyGuideAssem oCRVerifyGuideAssem) {
        oCRVerifyGuideAssem.getClass();
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(oCRVerifyGuideAssem);
            Unit unit = null;
            String string = null;
            if (fragmentLJI != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                Context context = fragmentLJI.getContext();
                if (context != null) {
                    string = context.getString(2131840459);
                }
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem, com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        OCRVerifyGuideContent oCRVerifyGuideContent;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C1714660uim c1714660uimVR;
        OCRVerifyButton oCRVerifyButton;
        C19EG activity;
        String str8;
        OCRVerifySteps oCRVerifySteps;
        List<OCRVerifyStepItem> list;
        OCRVerifySteps oCRVerifySteps2;
        OCRVerifySecurity oCRVerifySecurity;
        C19EG activity2;
        VerifyDetail verifyDetailLJIIIIZZ;
        super.onViewCreated(view);
        OCRVerifyViewModel oCRVerifyViewModelSo = So();
        C1713570uh1 c1713570uh1Jo = Jo();
        C1714660uim c1714660uim = (C1714660uim) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c1713570uh1Jo != null) {
            oCRVerifyViewModelSo.LL = c1713570uh1Jo;
            oCRVerifyViewModelSo.LLILLJJLI = new C1714950ujF(c1713570uh1Jo, c1714660uim, null, new C05FS(null));
        }
        oCRVerifyViewModelSo.LLILLL = c1714660uim;
        C1713570uh1 c1713570uh1Jo2 = Jo();
        if (c1713570uh1Jo2 != null && (verifyDetailLJIIIIZZ = c1713570uh1Jo2.LJIIIIZZ()) != null) {
            oCRVerifyGuideContent = verifyDetailLJIIIIZZ.guideContent;
        } else {
            oCRVerifyGuideContent = null;
        }
        int i = 1;
        int i2 = 2;
        if (Jo() == null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("pipo_vc_ocr_verify_recreate_ctx_null_handler", 1) == 1) {
                Vo(this);
            } else {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LJ("pipo_vc_ocr_verify_recreate_ctx_null_handler", 1) == 2) {
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if ((fragmentLJI instanceof OCRVerifyGuideFragment) && fragmentLJI != null && (activity2 = fragmentLJI.getActivity()) != null) {
                        activity2.finish();
                    }
                }
            }
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OcrVerifyGuidePictureSettings.OcrVerifyGuidePictureModel ocrVerifyGuidePictureModel = OcrVerifyGuidePictureSettings.LIZ;
        OcrVerifyGuidePictureSettings.OcrVerifyGuidePictureModel ocrVerifyGuidePictureModel2 = (OcrVerifyGuidePictureSettings.OcrVerifyGuidePictureModel) settingsManagerLIZLLL.LJIIIIZZ("ocr_verify_guide_picture", OcrVerifyGuidePictureSettings.OcrVerifyGuidePictureModel.class, ocrVerifyGuidePictureModel);
        if (ocrVerifyGuidePictureModel2 != null) {
            ocrVerifyGuidePictureModel = ocrVerifyGuidePictureModel2;
        }
        OcrVerifyGuidePictureSettings.DataObject dataObject = ocrVerifyGuidePictureModel.dataObject;
        if (dataObject == null || (str = dataObject.imageUrl) == null) {
            str = "";
        }
        if (C1533950q1J.LJ(str)) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJI((ImageView) this.LLJJJJLIIL.getValue());
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            int width = ((View) this.LLJJJJLIIL.getValue()).getWidth();
            int height = ((View) this.LLJJJJLIIL.getValue()).getHeight();
            c1331670kl3LJIIIZ.LJIIIIZZ = width;
            c1331670kl3LJIIIZ.LJIIIZ = height;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJILLL.getValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1459));
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        TextView textView = (TextView) this.LLJJI.getValue();
        if (oCRVerifyGuideContent != null && (oCRVerifySecurity = oCRVerifyGuideContent.security) != null) {
            str2 = oCRVerifySecurity.text;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 93), (View) this.LLJJ.getValue());
        TextView textView2 = (TextView) this.LLJJIII.getValue();
        if (oCRVerifyGuideContent != null) {
            str3 = oCRVerifyGuideContent.title;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        TextView textView3 = (TextView) this.LLJJIJI.getValue();
        if (oCRVerifyGuideContent != null) {
            str4 = oCRVerifyGuideContent.content;
        } else {
            str4 = null;
        }
        textView3.setText(str4);
        TextView textView4 = (TextView) this.LLJJIJIIJIL.getValue();
        if (oCRVerifyGuideContent != null && (oCRVerifySteps2 = oCRVerifyGuideContent.steps) != null) {
            str5 = oCRVerifySteps2.title;
        } else {
            str5 = null;
        }
        textView4.setText(str5);
        if (oCRVerifyGuideContent != null && (oCRVerifySteps = oCRVerifyGuideContent.steps) != null && (list = oCRVerifySteps.allSteps) != null) {
            for (OCRVerifyStepItem oCRVerifyStepItem : list) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, 0);
                C786410Ut5.d6(linearLayout, layoutParams);
                linearLayout.setOrientation(0);
                TuxIconView tuxIconView = new TuxIconView(view.getContext(), null, 0, 6, null);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, view.getContext());
                tuxIconView.setTuxIcon(c419910GdJ);
                C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), 0, 0);
                C786410Ut5.d6(linearLayout2, layoutParams2);
                linearLayout2.setOrientation(i);
                TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, 0);
                tuxTextView.setId(View.generateViewId());
                C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
                tuxTextView.setText(oCRVerifyStepItem.title);
                tuxTextView.setTextColorRes(R.attr.u_);
                tuxTextView.setTuxFont(62);
                TuxTextView tuxTextView2 = new TuxTextView(view.getContext(), null, 6, 0);
                tuxTextView2.setId(View.generateViewId());
                C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-1, -2));
                tuxTextView2.setText(oCRVerifyStepItem.tips);
                tuxTextView2.setTextColorRes(R.attr.a1j);
                tuxTextView2.setTuxFont(62);
                linearLayout.addView(tuxIconView);
                linearLayout2.addView(tuxTextView);
                linearLayout2.addView(tuxTextView2);
                linearLayout.addView(linearLayout2);
                ((ViewGroup) this.LLJJJIL.getValue()).addView(linearLayout);
                i = 1;
                i2 = 2;
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (activity = fragmentLJI2.getActivity()) != null && oCRVerifyGuideContent != null && (str8 = oCRVerifyGuideContent.f332privacy) != null) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJ.getValue(), 0);
            ((TextView) this.LLJJJJ.getValue()).setMovementMethod(C431360Gvm.LIZ());
            ((TextView) this.LLJJJJ.getValue()).setHighlightColor(0);
            ((TextView) this.LLJJJJ.getValue()).setText(C344820DfU.LIZ(activity, str8, new AwS461S0200000_26(this, activity, 14)));
        }
        TextView textView5 = (TextView) this.LLJJIJIL.getValue();
        if (oCRVerifyGuideContent != null && (oCRVerifyButton = oCRVerifyGuideContent.button) != null) {
            str6 = oCRVerifyButton.buttonText;
        } else {
            str6 = null;
        }
        textView5.setText(str6);
        C786410Ut5.U8((C197039127h) this.LLJJIJIL.getValue(), new ACListenerS160S0100000_26(this, 66));
        TextView textView6 = (TextView) this.LLJJJ.getValue();
        if (oCRVerifyGuideContent != null) {
            str7 = oCRVerifyGuideContent.virtualCardFallback;
        } else {
            str7 = null;
        }
        textView6.setText(str7);
        C786410Ut5.h9((TuxTextView) this.LLJJJ.getValue(), new ACListenerS160S0100000_26(this, 67));
        C736680Sv4.LJIIIZ(this, So(), new C2217381BqS() { // from class: X.0uk8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0uk9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LLILLL;
            }
        }, null, new AwS675S0100000_26(this, 10), 12);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0uk6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 74), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0uk4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LLILZIL;
            }
        }, null, new AwS640S0100000_26(this, 122), 6);
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ(this);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            c1714660uimVR.LIZ("rd_pipo_veri_center_page_show", null);
        }
    }
}
