package com.ss.android.ugc.aweme.qrcode;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0FNV;
import X.C0OM1;
import X.C0WZX;
import X.C0XQ7;
import X.C1233040iBy;
import X.C1237450iJ5;
import X.C12ES;
import X.C1685300txQ;
import X.C189200o6;
import X.C19296310eP;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C20696615ym;
import X.C20696815yo;
import X.C20697115yr;
import X.C20697315yt;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C446980Hfs;
import X.C666390QBx;
import X.C786410Ut5;
import X.C810560Vqw;
import X.C838410Wul;
import X.C844470XAv;
import X.C960203pA;
import X.DialogC1389620mGW;
import X.InterfaceC836760Ws6;
import Y.ACallableS431S0100000_28;
import Y.AObjectS128S0000000_31;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public class QRCodeFragment extends QRCodeFragmentKt implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjQ+KiA3LWsdGww8LCAKOy40JSAiPQ==";
    public C20697115yr LLJ;
    public TextView LLJI;
    public TextView LLJIJIL;
    public FrameLayout LLJILJIL;
    public C20697315yt LLJILJILJ;
    public DialogC1389620mGW LLJILLL;
    public View LLJJ;
    public TuxNavBar LLJJI;
    public TextView LLJJIII;
    public boolean LLJJIJI;
    public List<Aweme> LLJJIJIIJIL;

    @Override // X.InterfaceC20696715yn
    public final void LLJJIJIL() {
    }

    public final void UR() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJILLL;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        C786410Ut5.LJIIJ(this.LLJILLL);
    }

    @Override // X.InterfaceC20696715yn
    public final void zi() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJILLL;
        if (dialogC1389620mGW != null && !dialogC1389620mGW.isShowing()) {
            C786410Ut5.J4(this.LLJILLL);
        }
        C19296310eP c19296310eP = new C19296310eP();
        c19296310eP.LJIILLIIL = this.LLJ.enterFrom;
        c19296310eP.LJIIZILJ = "normal";
        c19296310eP.LJIJ = "shaped";
        c19296310eP.LJIILJJIL();
    }

    @Override // X.InterfaceC20696715yn
    public final void C0() {
        if (getActivity().isFinishing()) {
            return;
        }
        UR();
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131846801);
        c1233040iBy.LIZLLL();
        this.LLJI.announceForAccessibility(getString(2131846801));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C666390QBx.LIZIZ == this.LLJJIJIIJIL) {
            C666390QBx.LIZIZ = null;
        }
        C20696615ym c20696615ymSR = SR();
        c20696615ymSR.LIZ = null;
        c20696615ymSR.LIZIZ = null;
        UR();
    }

    @Override // X.InterfaceC20696715yn
    public final C20697315yt jQ() {
        return this.LLJILJILJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(new AObjectS128S0000000_31(5));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == R.id.l_a) {
            getActivity().finish();
            return;
        }
        if (id == R.id.tv_save_image) {
            if (this.LLJILJILJ.LLILZIL) {
                C20696615ym c20696615ymSR = SR();
                if (C838410Wul.LIZ(c20696615ymSR.LIZIZ, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && Build.VERSION.SDK_INT < 33) {
                    c20696615ymSR.LIZ();
                    return;
                } else {
                    c20696615ymSR.LIZ.zi();
                    C810560Vqw.LIZJ(new ARunnableS131S0100000_31(c20696615ymSR, 1));
                    return;
                }
            }
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(getString(2131832373));
            c1233040iBy.LIZLLL();
            view.announceForAccessibility(getString(2131832373));
            return;
        }
        if (id != R.id.tv_scan) {
            return;
        }
        boolean z = false;
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(getContext())) {
            C786410Ut5.re(Toast.makeText(getContext(), getString(2131832497), 0));
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "qr_code_detail");
        c2344009Gk.LJIIIIZZ("previous_page", this.LLJ.enterFrom);
        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
        Context context = getContext();
        if (this.LLJ.type == 4) {
            z = true;
        }
        C2204961BRm.i(context, z, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxRQVG6DkHXCFWB5SPKuA==", null));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C20697315yt c20697315yt;
        super.onViewCreated(view, bundle);
        NR(new AObjectS128S0000000_31(4));
        this.LLJJIJIIJIL = C666390QBx.LIZIZ;
        this.LLJJ = view.findViewById(R.id.er6);
        this.LLJJI = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLJJIII = (TextView) view.findViewById(R.id.u0u);
        this.LLJI = (TextView) view.findViewById(R.id.tv_save_image);
        this.LLJIJIL = (TextView) view.findViewById(R.id.tv_scan);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.sjp);
        C786410Ut5.T7(this.LLJI, this);
        C786410Ut5.T7(this.LLJIJIL, this);
        TuxNavBar tuxNavBar = this.LLJJI;
        C0OM1 c0om1 = new C0OM1();
        C20697115yr c20697115yr = this.LLJ;
        int i = 2131845728;
        if (c20697115yr == null) {
            string = getString(2131845728);
        } else {
            int i2 = c20697115yr.type;
            String str = c20697115yr.objectId;
            if (i2 == 4 && TextUtils.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str)) {
                i = 2131837888;
            }
            string = getString(i);
        }
        C1237450iJ5.LIZ(c0om1, string, requireActivity());
        tuxNavBar.setNavActions(c0om1);
        if (this.LLJ == null) {
            getActivity().finish();
            return;
        }
        int iLJIILJJIL = C12ES.LJIILJJIL(C12ES.LJIIIIZZ(getContext()), getContext());
        if (iLJIILJJIL < 660) {
            float f = iLJIILJJIL / 667.0f;
            C786410Ut5.Pb(this.LLJILJIL, f);
            C786410Ut5.qc(this.LLJILJIL, f);
            float f2 = ((1.0f - f) * 400.0f) / 2.0f;
            float f3 = (32.0f * f) - f2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LLJILJIL.getLayoutParams();
            layoutParams.topMargin = (int) C12ES.LIZJ(f3, getContext());
            C786410Ut5.a6(this.LLJILJIL, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LLJJIII.getLayoutParams();
            layoutParams2.topMargin = (int) C12ES.LIZJ(16.0f - f2, getContext());
            C786410Ut5.g6(this.LLJJIII, layoutParams2);
        }
        C20697115yr c20697115yr2 = this.LLJ;
        if (c20697115yr2 != null && c20697115yr2.type == 4) {
            c20697315yt = new C20697315yt(getContext()) { // from class: X.15yu
                @Override // X.AbstractC20697215ys
                public final C19232510Lz LIZIZ() {
                    return new C19232510Lz() { // from class: X.0krf
                        @Override // X.C19232510Lz
                        public final File LIZJ() {
                            return C08SY.LIZIZ(0);
                        }

                        @Override // X.C19232510Lz
                        public final boolean LIZLLL() {
                            return C08SY.LIZIZ(0) != null;
                        }

                        @Override // X.C19232510Lz
                        public final void LJ(final String str2) {
                            C15O7.LIZJ(new Callable() { // from class: X.0kre
                                public final /* synthetic */ int LLILLJJLI = 0;

                                /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
                                @Override // java.util.concurrent.Callable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object call() throws java.lang.Throwable {
                                    /*
                                        r9 = this;
                                        java.lang.String r1 = r2
                                        int r6 = r9.LLILLJJLI
                                        java.lang.String r8 = "UserQRCodeImageCacheHelper@72a8.saveImageToCache$1L"
                                        X.C1C7U.LIZ(r8)
                                        X.0XAv r7 = X.C844470XAv.LIZ
                                        r7.getClass()
                                        android.content.Context r2 = X.C844470XAv.LIZ()
                                        java.lang.String r0 = "getImageAbsolutePath may cause ANR,use getImageAbsolutePathAsync or you should call it in Non-UI Thread"
                                        X.C1324840ka2.LJIILIIL(r0)
                                        boolean r0 = X.C2093608Ic.LJ(r1)
                                        r5 = 0
                                        if (r0 != 0) goto L9a
                                        android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
                                        boolean r0 = X.C1324840ka2.LJIIZILJ(r1)
                                        if (r0 == 0) goto L9a
                                        X.0kbR r1 = X.C1325710kbR.LIZ(r1)
                                        X.0kZz r0 = X.C1324810kZz.LJI()
                                        X.0NLr r1 = r0.LIZ(r1, r5)
                                        X.0kfL r0 = X.C1328130kfL.LJIILIIL()
                                        X.0kdO r0 = r0.LJIILL()
                                        X.0kOZ r0 = r0.LJIIJ(r1)
                                        if (r0 == 0) goto L9a
                                        X.0krc r0 = (X.C1335740krc) r0
                                        java.io.File r4 = r0.LIZ
                                        if (r4 == 0) goto L9a
                                        X.0ksy r0 = new X.0ksy
                                        r0.<init>(r2)
                                        java.lang.String r3 = X.C1336580ksy.LJ
                                        java.lang.String r0 = r4.getName()
                                        java.lang.String r2 = X.C08HM.LIZJ(r0)
                                        X.0VSJ r1 = new X.0VSJ
                                        r1.<init>(r3, r2)
                                        boolean r0 = r1.exists()
                                        if (r0 != 0) goto L69
                                        java.lang.String r0 = r4.getAbsolutePath()
                                        X.C2112608Pk.LIZLLL(r0, r3, r2)
                                    L69:
                                        java.lang.String r2 = r1.getAbsolutePath()
                                    L6d:
                                        r7.getClass()
                                        android.content.Context r0 = X.C844470XAv.LIZ()
                                        java.io.File r0 = X.C786410Ut5.w2(r0)
                                        if (r0 == 0) goto L98
                                        X.C2354709Kn.LJI(r0)
                                        java.lang.String r1 = r0.getAbsolutePath()
                                    L81:
                                        boolean r0 = android.text.TextUtils.isEmpty(r1)
                                        if (r0 != 0) goto L94
                                        boolean r0 = android.text.TextUtils.isEmpty(r2)
                                        if (r0 != 0) goto L94
                                        java.lang.String r0 = X.C08SY.LIZ(r6)
                                        X.C2112608Pk.LIZLLL(r2, r1, r0)
                                    L94:
                                        X.C1C7U.LIZIZ(r8)
                                        return r5
                                    L98:
                                        r1 = r5
                                        goto L81
                                    L9a:
                                        java.lang.String r2 = ""
                                        goto L6d
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1335760kre.call():java.lang.Object");
                                }
                            });
                        }
                    };
                }

                @Override // X.C20697315yt, X.InterfaceC19232410Ly
                public final void LJJLIIIJ(Exception exc) {
                    if (!this.LLILZ) {
                        super.LJJLIIIJ(exc);
                    }
                }

                @Override // X.C20697315yt, X.AbstractC20697215ys
                public void setData(C20697115yr c20697115yr3) {
                    File fileLIZJ;
                    super.setData(c20697115yr3);
                    M m = this.LL.LL;
                    if (m != 0 && ((C19232510Lz) m).LIZLLL()) {
                        this.LLILZ = true;
                        M m2 = this.LL.LL;
                        if (m2 != 0) {
                            fileLIZJ = ((C19232510Lz) m2).LIZJ();
                        } else {
                            fileLIZJ = null;
                        }
                        Uri uriFromFile = Uri.fromFile(fileLIZJ);
                        C1322200kVm.LIZ().LIZJ(uriFromFile);
                        RemoteImageView remoteImageView = this.LLILLJJLI;
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJI(uriFromFile);
                        c1320810kTXLIZJ.LJIILJJIL = this.LLILLJJLI.getController();
                        c1320810kTXLIZJ.LJIIIIZZ = this.LLILZLL;
                        remoteImageView.setController(c1320810kTXLIZJ.LIZ());
                        InterfaceC20697015yq interfaceC20697015yq = this.LLILLL;
                        if (interfaceC20697015yq != null) {
                            QRCodeFragment qRCodeFragment = ((C20696815yo) interfaceC20697015yq).LIZ;
                            qRCodeFragment.LLJJIJI = true;
                            qRCodeFragment.UR();
                        }
                        C15O7.LIZJ(new ACallableS431S0100000_28(this, 19)).LJ(new C19335310kh(this, 8), C15O7.LJIIIIZZ, null);
                    }
                }
            };
        } else {
            c20697315yt = new C20697315yt(getContext());
        }
        this.LLJILJILJ = c20697315yt;
        this.LLJILJIL.addView(c20697315yt);
        if (this.LLJILLL == null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(requireContext());
            this.LLJILLL = dialogC1389620mGW;
            dialogC1389620mGW.LJJLJ(2131845734);
            C0FNV.LIZJ(this.LLJILLL);
        }
        this.LLJILJILJ.setOnBindQrCodeListener(new C20696815yo(this));
        this.LLJILJILJ.setData(this.LLJ);
        this.LLJJ.setBackgroundColor(C960203pA.LIZ(R.attr.c7, getContext()));
        this.LLJI.setTextColor(C446980Hfs.LIZ(getContext(), R.color.ui));
        this.LLJIJIL.setTextColor(C446980Hfs.LIZ(getContext(), R.color.ui));
        this.LLJILJILJ.setQRCodeCardTitleColor(C960203pA.LIZ(R.attr.a1h, getContext()));
        this.LLJILJILJ.setQRCodeCardSubtitleColor(C960203pA.LIZ(R.attr.a1k, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.jy, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C20696615ym c20696615ymSR = SR();
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    c20696615ymSR.LIZ();
                    return;
                }
            }
            c20696615ymSR.LIZ.zi();
            C810560Vqw.LIZJ(new ARunnableS131S0100000_31(c20696615ymSR, 1));
        }
    }
}
