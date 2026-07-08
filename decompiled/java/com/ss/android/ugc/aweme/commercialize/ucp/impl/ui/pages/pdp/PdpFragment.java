package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.AbstractC332980D3o;
import X.AbstractC343940De4;
import X.AnonymousClass0951;
import X.C01GW;
import X.C098200Yq;
import X.C0D21;
import X.C0D3K;
import X.C0D3V;
import X.C0DBC;
import X.C0DBY;
import X.C0DD8;
import X.C0DDE;
import X.C0DDI;
import X.C0DDM;
import X.C0DDS;
import X.C0DDU;
import X.C0DE2;
import X.C0DET;
import X.C0DGC;
import X.C0DGD;
import X.C0DH8;
import X.C0DIR;
import X.C1023960ckk;
import X.C1203340hQ4;
import X.C1281204zq;
import X.C1391190mJ3;
import X.C13LZ;
import X.C1524305xx;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C16BC;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19V8;
import X.C1BNE;
import X.C20632315oP;
import X.C21578619ce;
import X.C2252321DDq;
import X.C2265001Dl4;
import X.C2265341Dlc;
import X.C332690D2l;
import X.C332730D2p;
import X.C332950D3l;
import X.C333520D5q;
import X.C335000DBi;
import X.C335860DEq;
import X.C336800DIg;
import X.C343960De6;
import X.C343980De8;
import X.C343990De9;
import X.C344000DeA;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.EnumC12947054v;
import X.EnumC333530D5r;
import X.EnumC335450DDb;
import X.InterfaceC333090D3z;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS41S0100100_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpFragment extends BasePdpSheetFragment implements InterfaceC333090D3z {
    public static final C2252321DDq LLJJL = C1BNE.LIZ(0L);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiPCwjZiwhOSN9PSxiOS40LTZiOSsjZhUoOQkhKSIhLCEn";
    public C0DD8 LLIZLLLIL;
    public PdpViewModel LLJ;
    public C0DDM LLJILJILJ;
    public C0DDI LLJILLL;
    public C335000DBi LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public C1281204zq LLJJJ;
    public boolean LLJJJIL;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C0DGD LLJI = new C0DGD();
    public final C0DH8 LLJIJIL = new C0DH8();
    public final C0DGC LLJILJIL = new C0DGC(new AwS583S0100000_4(this, 54));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 98));
    public long LLJJJJ = -1;

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment
    public final C19V8 MR() {
        C0DD8 c0dd8 = this.LLIZLLLIL;
        if (c0dd8 != null) {
            return c0dd8.LLJIJIL;
        }
        return null;
    }

    public final C0DD8 WR() {
        C0DD8 c0dd8 = this.LLIZLLLIL;
        if (c0dd8 != null) {
            return c0dd8;
        }
        "UcpActivityPdpBinding is only valid between onCreateView and onDestroyView".toString();
        throw new IllegalArgumentException("UcpActivityPdpBinding is only valid between onCreateView and onDestroyView");
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        C332690D2l c332690D2l;
        CommonAdData commonAdData;
        PdpViewModel pdpViewModel = this.LLJ;
        if (pdpViewModel != null && (c332690D2l = pdpViewModel.LLILZLL) != null && (commonAdData = c332690D2l.rawAdData) != null) {
            return commonAdData;
        }
        C0DBY c0dby = C335000DBi.LIZJ;
        Map<String, String> map = pdpViewModel != null ? pdpViewModel.LLJ : null;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    public final void gS() {
        C1281204zq c1281204zq = this.LLJJJ;
        if (c1281204zq == null) {
            return;
        }
        this.LLJJJ = null;
        this.LLJJJIL = false;
        C1524305xx c1524305xx = C1524305xx.LIZ;
        C19EG activity = getActivity();
        c1524305xx.getClass();
        C1524305xx.LJ(c1281204zq, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.LLJJJ != null) {
            this.LLJJJIL = true;
        }
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0DET c0det;
        C19EG activity = getActivity();
        int i = (!(activity instanceof C0DET) || (c0det = (C0DET) activity) == null) ? 0 : c0det.LLILLL;
        cS(i);
        bS(i);
        gS();
        this.LLJJJJ = -1L;
        this.LLJJ = null;
        C20632315oP c20632315oP = (C20632315oP) WR().LL.findViewById(R.id.vpProductMedia);
        if (c20632315oP != null) {
            C0DDI c0ddi = this.LLJILLL;
            if (c0ddi != null) {
                c20632315oP.LJI(c0ddi);
            }
            c20632315oP.setAdapter(null);
        }
        RecyclerView recyclerView = (RecyclerView) WR().LL.findViewById(R.id.tug);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        RecyclerView recyclerView2 = (RecyclerView) WR().LL.findViewById(R.id.tuc);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
        }
        this.LLJILLL = null;
        this.LLJILJILJ = null;
        super.onDestroyView();
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJJ == null || !this.LLJJJIL) {
            return;
        }
        gS();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLJJJJ = SystemClock.elapsedRealtime();
        this.LLJJJJLIIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        CommonAdData commonAdDataEe;
        C332690D2l c332690D2l;
        super.onStop();
        long j = this.LLJJJJ;
        if (j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            C335000DBi c335000DBi = this.LLJJ;
            if (c335000DBi != null) {
                C1023960ckk c1023960ckk = C2265001Dl4.LIZ;
                PdpViewModel pdpViewModel = this.LLJ;
                if (pdpViewModel == null || (c332690D2l = pdpViewModel.LLILZLL) == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                    commonAdDataEe = ee();
                }
                c335000DBi.logAd(c1023960ckk, commonAdDataEe, new AwS41S0100100_4(this, jElapsedRealtime, 0));
            }
        }
        this.LLJJJJ = -1L;
    }

    @Override // X.InterfaceC333090D3z
    public final /* bridge */ /* synthetic */ C335000DBi g4() {
        return this.LLJJ;
    }

    public final String VR(Bundle bundle) {
        Bundle bundleRequireArguments;
        if (bundle == null && ((bundleRequireArguments = requireArguments()) == null || (bundle = bundleRequireArguments.getBundle("arg_entry_args")) == null)) {
            bundle = new Bundle();
        }
        C1524305xx c1524305xx = C1524305xx.LIZ;
        requireActivity();
        c1524305xx.getClass();
        String strLIZJ = C1524305xx.LIZJ(bundle);
        if (this.LLJJJ == null) {
            this.LLJJJIL = false;
            this.LLJJJ = C1524305xx.LIZ(strLIZJ, (String) this.LLJJIJIL.getValue(), EnumC12947054v.CHILD_ACTIVITY, getActivity());
        }
        return strLIZJ;
    }

    public final void ZR(PdpSupplementData pdpSupplementData) {
        CommonAdData commonAdDataEe;
        C332690D2l c332690D2l;
        C335000DBi c335000DBi = this.LLJJ;
        if (c335000DBi != null) {
            C1023960ckk c1023960ckk = C336800DIg.LIZ;
            PdpViewModel pdpViewModel = this.LLJ;
            if (pdpViewModel == null || (c332690D2l = pdpViewModel.LLILZLL) == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                commonAdDataEe = ee();
            }
            c335000DBi.logAd(c1023960ckk, commonAdDataEe, new AwS370S0200000_4(this, pdpSupplementData, 14));
        }
    }

    public final void aS(C0D3K c0d3k) {
        CommonAdData commonAdDataEe;
        C332690D2l c332690D2l;
        C335000DBi c335000DBi = this.LLJJ;
        if (c335000DBi != null) {
            C1023960ckk c1023960ckk = C336800DIg.LIZ;
            PdpViewModel pdpViewModel = this.LLJ;
            if (pdpViewModel == null || (c332690D2l = pdpViewModel.LLILZLL) == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                commonAdDataEe = ee();
            }
            c335000DBi.logAd(c1023960ckk, commonAdDataEe, new AwS370S0200000_4(c0d3k, this, 15));
        }
    }

    public final void bS(int i) {
        C0DET c0det;
        if (!this.LLJJIJI && this.LLJJIJIIJIL != 0) {
            this.LLJJIJI = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
            C335000DBi c335000DBi = this.LLJJ;
            if (c335000DBi != null) {
                c335000DBi.LJJII(jCurrentTimeMillis, EnumC335450DDb.PDP.getValue(), i, ee());
            }
            C19EG activity = getActivity();
            if ((activity instanceof C0DET) && (c0det = (C0DET) activity) != null) {
                if (c0det.LLILLL == 0) {
                    c0det.LLILLL = i;
                }
                c0det.LLILZ = true;
            }
        }
    }

    public final void cS(int i) {
        AbstractC332980D3o abstractC332980D3o;
        C0D21 c0d21;
        Map<String, String> map;
        CommonAdData commonAdDataEe;
        C332690D2l c332690D2l;
        C21578619ce c21578619ce;
        int i2;
        C0D21 c0d212;
        C0D3K pageData;
        C0D3V c0d3v;
        String str;
        C0D3K pageData2;
        C0D3V c0d3v2;
        Map<String, String> map2;
        AnonymousClass0951 anonymousClass0951;
        if (!this.LLJJIII && this.LLJJI) {
            boolean z = true;
            this.LLJJIII = true;
            PdpViewModel pdpViewModel = this.LLJ;
            String str2 = null;
            if (pdpViewModel != null && (anonymousClass0951 = pdpViewModel.LLILLJJLI) != null) {
                abstractC332980D3o = (AbstractC332980D3o) anonymousClass0951.getValue();
            } else {
                abstractC332980D3o = null;
            }
            boolean z2 = abstractC332980D3o instanceof C0D21;
            if (z2) {
                c0d21 = (C0D21) abstractC332980D3o;
            } else {
                c0d21 = null;
            }
            int iLJ = 0;
            if (c0d21 == null || (pageData2 = c0d21.getPageData()) == null || (c0d3v2 = pageData2.skuSelection) == null || (map2 = c0d3v2.selectedSkuOptions) == null || !(!map2.isEmpty())) {
                z = false;
            }
            if (z2 && (c0d212 = (C0D21) abstractC332980D3o) != null && (pageData = c0d212.getPageData()) != null && (c0d3v = pageData.skuSelection) != null && (str = c0d3v.selectedVariantId) != null) {
                str2 = str;
            } else {
                PdpViewModel pdpViewModel2 = this.LLJ;
                if (pdpViewModel2 != null && (map = pdpViewModel2.LLJ) != null) {
                    str2 = map.get("shopify_variant_id");
                }
            }
            C0DD8 c0dd8 = this.LLIZLLLIL;
            if (c0dd8 != null && (c21578619ce = c0dd8.LLILZIL) != null) {
                int scrollY = c21578619ce.getScrollY();
                View childAt = c21578619ce.getChildAt(0);
                if (childAt != null) {
                    int height = childAt.getHeight();
                    int height2 = c21578619ce.getHeight();
                    iLJ = (height <= height2 || (i2 = height - height2) <= 0) ? 100 : C13LZ.LJ((int) ((scrollY / i2) * 100), 0, 100);
                }
            }
            C335000DBi c335000DBi = this.LLJJ;
            if (c335000DBi != null) {
                C1023960ckk c1023960ckk = C2265341Dlc.LIZ;
                PdpViewModel pdpViewModel3 = this.LLJ;
                if (pdpViewModel3 == null || (c332690D2l = pdpViewModel3.LLILZLL) == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                    commonAdDataEe = ee();
                }
                c335000DBi.logAd(c1023960ckk, commonAdDataEe, new C335860DEq(i, iLJ, str2, z));
            }
        }
    }

    public final void hS(EnumC333530D5r enumC333530D5r) {
        String string;
        if (this.LLIZLLLIL == null) {
            return;
        }
        View viewFindViewById = WR().LL.findViewById(R.id.m6x);
        TextView textView = (TextView) WR().LL.findViewById(R.id.z3s);
        View viewFindViewById2 = WR().LL.findViewById(R.id.cmd);
        C786410Ut5.LLIZ(WR().LLILZIL, 8);
        C786410Ut5.LJZL(8, WR().LLILLJJLI);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        int i = C333520D5q.LIZ[enumC333530D5r.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    string = getString(2131857609);
                } else {
                    throw new C1954807lC();
                }
            } else {
                string = getString(2131857579);
            }
        } else {
            string = getString(2131857586);
        }
        if (textView != null) {
            textView.setText(string);
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 23), viewFindViewById2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kS(boolean r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment.kS(boolean):void");
    }

    public final void mS(float f) {
        BottomSheetBehavior bottomSheetBehavior;
        LinearLayout linearLayout = WR().LLILLJJLI;
        String str = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this);
        Integer numValueOf = null;
        if ((c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null) {
            numValueOf = Integer.valueOf(bottomSheetBehavior.getPeekHeight());
        }
        if (numValueOf == null) {
            C786410Ut5.hd(linearLayout, 0.0f);
            return;
        }
        int height = WR().LL.getHeight();
        if (height == 0) {
            C786410Ut5.hd(linearLayout, 0.0f);
        } else if (f < 0.0f) {
            C786410Ut5.hd(linearLayout, 0.0f);
        } else {
            float fIntValue = numValueOf.intValue() - height;
            C786410Ut5.hd(linearLayout, fIntValue + (f * (0.0f - fIntValue)));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i;
        super.onDismiss(dialogInterface);
        AbstractC343940De4 abstractC343940De4 = this.LLILZLL;
        if (!(abstractC343940De4 instanceof C343960De6) && !Intrinsics.LJFF(abstractC343940De4, C343980De8.LIZ)) {
            if (abstractC343940De4 instanceof C344000DeA) {
                i = 1;
            } else if (!(abstractC343940De4 instanceof C343990De9) && this.LLJJJJLIIL) {
                i = 2;
            } else {
                i = 3;
            }
        } else {
            i = 4;
        }
        cS(i);
        bS(i);
    }

    public final void t4(boolean z) {
        int i;
        int i2;
        ImageView imageView;
        int i3;
        if (this.LLIZLLLIL == null) {
            return;
        }
        View viewFindViewById = WR().LL.findViewById(R.id.m7r);
        View viewFindViewById2 = WR().LL.findViewById(R.id.m6x);
        if (viewFindViewById != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById);
        }
        C21578619ce c21578619ce = WR().LLILZIL;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLIZ(c21578619ce, i);
        LinearLayout linearLayout = WR().LLILLJJLI;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LJZL(i2, linearLayout);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = WR().LL.findViewById(R.id.veb);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0DE4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        if (z && viewFindViewById != null && (imageView = (ImageView) viewFindViewById.findViewById(R.id.ve2)) != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment, X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        if (this.LLIZLLLIL == null) {
            return;
        }
        super.LLLFFI(tuxSheet, f);
        if (f < 0.0f) {
            this.LLJJJJLIIL = true;
        }
        mS(f);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        Context context;
        if (this.LLIZLLLIL == null) {
            return;
        }
        super.LLLLIIIILLL(tuxSheet, i);
        int iLIZJ = 0;
        if (i == 3 && (context = getContext()) != null) {
            iLIZJ = C497820Jfg.LIZJ(context);
        }
        FrameLayout frameLayout = WR().LL;
        if (frameLayout.getPaddingTop() != iLIZJ) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), iLIZJ, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.0DDI, X.0Rwk] */
    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BasePdpSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3o, viewGroup, false);
        int i = R.id.cag;
        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.cag, viewTd);
        if (linearLayout != null) {
            i = R.id.clt;
            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.clt, viewTd);
            if (c197039127h != null) {
                i = R.id.clu;
                if (C1616006Uk.LIZ(R.id.clu, viewTd) != null) {
                    i = R.id.cmd;
                    if (C1616006Uk.LIZ(R.id.cmd, viewTd) != null) {
                        i = R.id.cml;
                        C197039127h c197039127h2 = (C197039127h) C1616006Uk.LIZ(R.id.cml, viewTd);
                        if (c197039127h2 != null) {
                            i = R.id.eu8;
                            C21578619ce c21578619ce = (C21578619ce) C1616006Uk.LIZ(R.id.eu8, viewTd);
                            if (c21578619ce != null) {
                                i = R.id.m6q;
                                View viewLIZ = C1616006Uk.LIZ(R.id.m6q, viewTd);
                                if (viewLIZ != null) {
                                    int i2 = R.id.n9q;
                                    if (C1616006Uk.LIZ(R.id.n9q, viewLIZ) != null) {
                                        i2 = R.id.z21;
                                        if (C1616006Uk.LIZ(R.id.z21, viewLIZ) != null) {
                                            i = R.id.m6u;
                                            View viewLIZ2 = C1616006Uk.LIZ(R.id.m6u, viewTd);
                                            if (viewLIZ2 != null) {
                                                int i3 = R.id.brd;
                                                if (C1616006Uk.LIZ(R.id.brd, viewLIZ2) != null) {
                                                    i3 = R.id.bre;
                                                    FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.bre, viewLIZ2);
                                                    if (frameLayout != null) {
                                                        LinearLayout linearLayout2 = (LinearLayout) viewLIZ2;
                                                        i3 = R.id.llj;
                                                        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.llj, viewLIZ2);
                                                        if (tuxIconView != null) {
                                                            i3 = R.id.lvb;
                                                            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.lvb, viewLIZ2);
                                                            if (tuxIconView2 != null) {
                                                                i3 = R.id.zt1;
                                                                if (C1616006Uk.LIZ(R.id.zt1, viewLIZ2) != null) {
                                                                    C0DDE c0dde = new C0DDE(linearLayout2, frameLayout, tuxIconView, tuxIconView2);
                                                                    i = R.id.m6v;
                                                                    View viewLIZ3 = C1616006Uk.LIZ(R.id.m6v, viewTd);
                                                                    if (viewLIZ3 != null) {
                                                                        if (C1616006Uk.LIZ(R.id.n_3, viewLIZ3) != null) {
                                                                            i = R.id.m6x;
                                                                            if (C1616006Uk.LIZ(R.id.m6x, viewTd) != null) {
                                                                                i = R.id.m6y;
                                                                                if (C1616006Uk.LIZ(R.id.m6y, viewTd) != null) {
                                                                                    i = R.id.m73;
                                                                                    View viewLIZ4 = C1616006Uk.LIZ(R.id.m73, viewTd);
                                                                                    if (viewLIZ4 != null) {
                                                                                        int i4 = R.id.fz6;
                                                                                        if (C1616006Uk.LIZ(R.id.fz6, viewLIZ4) != null) {
                                                                                            i4 = R.id.m7c;
                                                                                            if (C1616006Uk.LIZ(R.id.m7c, viewLIZ4) != null) {
                                                                                                i4 = R.id.m7d;
                                                                                                if (C1616006Uk.LIZ(R.id.m7d, viewLIZ4) != null) {
                                                                                                    i4 = R.id.m7m;
                                                                                                    if (C1616006Uk.LIZ(R.id.m7m, viewLIZ4) != null) {
                                                                                                        i4 = R.id.m7n;
                                                                                                        if (C1616006Uk.LIZ(R.id.m7n, viewLIZ4) != null) {
                                                                                                            i4 = R.id.m7o;
                                                                                                            if (C1616006Uk.LIZ(R.id.m7o, viewLIZ4) != null) {
                                                                                                                i4 = R.id.m7p;
                                                                                                                if (C1616006Uk.LIZ(R.id.m7p, viewLIZ4) != null) {
                                                                                                                    i4 = R.id.n_l;
                                                                                                                    if (C1616006Uk.LIZ(R.id.n_l, viewLIZ4) != null) {
                                                                                                                        i4 = R.id.z4n;
                                                                                                                        if (C1616006Uk.LIZ(R.id.z4n, viewLIZ4) != null) {
                                                                                                                            i4 = R.id.z63;
                                                                                                                            if (C1616006Uk.LIZ(R.id.z63, viewLIZ4) != null) {
                                                                                                                                i4 = R.id.z6s;
                                                                                                                                if (C1616006Uk.LIZ(R.id.z6s, viewLIZ4) != null) {
                                                                                                                                    i4 = R.id.z6v;
                                                                                                                                    if (C1616006Uk.LIZ(R.id.z6v, viewLIZ4) != null) {
                                                                                                                                        i4 = R.id.z6w;
                                                                                                                                        if (C1616006Uk.LIZ(R.id.z6w, viewLIZ4) != null) {
                                                                                                                                            i4 = R.id.z6x;
                                                                                                                                            if (C1616006Uk.LIZ(R.id.z6x, viewLIZ4) != null) {
                                                                                                                                                i = R.id.m75;
                                                                                                                                                View viewLIZ5 = C1616006Uk.LIZ(R.id.m75, viewTd);
                                                                                                                                                if (viewLIZ5 != null) {
                                                                                                                                                    int i5 = R.id.n_m;
                                                                                                                                                    if (C1616006Uk.LIZ(R.id.n_m, viewLIZ5) != null) {
                                                                                                                                                        i5 = R.id.vpProductMedia;
                                                                                                                                                        if (C1616006Uk.LIZ(R.id.vpProductMedia, viewLIZ5) != null) {
                                                                                                                                                            i = R.id.m76;
                                                                                                                                                            View viewLIZ6 = C1616006Uk.LIZ(R.id.m76, viewTd);
                                                                                                                                                            if (viewLIZ6 != null) {
                                                                                                                                                                int i6 = R.id.n_n;
                                                                                                                                                                if (C1616006Uk.LIZ(R.id.n_n, viewLIZ6) != null) {
                                                                                                                                                                    i6 = R.id.tuc;
                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.tuc, viewLIZ6) != null) {
                                                                                                                                                                        i6 = R.id.w0q;
                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.w0q, viewLIZ6) != null) {
                                                                                                                                                                            i6 = R.id.z4p;
                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.z4p, viewLIZ6) != null) {
                                                                                                                                                                                i6 = R.id.vsMoreFromShopError;
                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.vsMoreFromShopError, viewLIZ6) != null) {
                                                                                                                                                                                    i = R.id.m7_;
                                                                                                                                                                                    View viewLIZ7 = C1616006Uk.LIZ(R.id.m7_, viewTd);
                                                                                                                                                                                    if (viewLIZ7 != null) {
                                                                                                                                                                                        int i7 = R.id.n_8;
                                                                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) C1616006Uk.LIZ(R.id.n_8, viewLIZ7);
                                                                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                                                                            i7 = R.id.n_u;
                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.n_u, viewLIZ7) != null) {
                                                                                                                                                                                                i7 = R.id.n_w;
                                                                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) C1616006Uk.LIZ(R.id.n_w, viewLIZ7);
                                                                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                                                                    i7 = R.id.z3i;
                                                                                                                                                                                                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z3i, viewLIZ7);
                                                                                                                                                                                                    if (tuxTextView != null) {
                                                                                                                                                                                                        i7 = R.id.z42;
                                                                                                                                                                                                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.z42, viewLIZ7);
                                                                                                                                                                                                        if (tuxTextView2 != null) {
                                                                                                                                                                                                            i7 = R.id.z51;
                                                                                                                                                                                                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.z51, viewLIZ7);
                                                                                                                                                                                                            if (tuxTextView3 != null) {
                                                                                                                                                                                                                i7 = R.id.z5i;
                                                                                                                                                                                                                TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.z5i, viewLIZ7);
                                                                                                                                                                                                                if (tuxTextView4 != null) {
                                                                                                                                                                                                                    i7 = R.id.z5o;
                                                                                                                                                                                                                    TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.z5o, viewLIZ7);
                                                                                                                                                                                                                    if (tuxTextView5 != null) {
                                                                                                                                                                                                                        C0DDU c0ddu = new C0DDU((ConstraintLayout) viewLIZ7, linearLayout3, linearLayout4, tuxTextView, tuxTextView2, tuxTextView3, tuxTextView4, tuxTextView5);
                                                                                                                                                                                                                        i = R.id.m7a;
                                                                                                                                                                                                                        View viewLIZ8 = C1616006Uk.LIZ(R.id.m7a, viewTd);
                                                                                                                                                                                                                        if (viewLIZ8 != null) {
                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.n_c, viewLIZ8) != null) {
                                                                                                                                                                                                                                i = R.id.m7g;
                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.m7g, viewTd) != null) {
                                                                                                                                                                                                                                    i = R.id.m7j;
                                                                                                                                                                                                                                    View viewLIZ9 = C1616006Uk.LIZ(R.id.m7j, viewTd);
                                                                                                                                                                                                                                    if (viewLIZ9 != null) {
                                                                                                                                                                                                                                        int i8 = R.id.amt;
                                                                                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.amt, viewLIZ9) != null) {
                                                                                                                                                                                                                                            i8 = R.id.amu;
                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.amu, viewLIZ9) != null) {
                                                                                                                                                                                                                                                i8 = R.id.amv;
                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.amv, viewLIZ9) != null) {
                                                                                                                                                                                                                                                    i8 = R.id.m78;
                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.m78, viewLIZ9) != null) {
                                                                                                                                                                                                                                                        i8 = R.id.m7f;
                                                                                                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.m7f, viewLIZ9) != null) {
                                                                                                                                                                                                                                                            i8 = R.id.srf;
                                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.srf, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                i8 = R.id.tfu;
                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.tfu, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                    i8 = R.id.tug;
                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.tug, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                        i8 = R.id.z29;
                                                                                                                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.z29, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                            i8 = R.id.z2_;
                                                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.z2_, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                i8 = R.id.z46;
                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.z46, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                    i8 = R.id.z53;
                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.z53, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                        i8 = R.id.z5w;
                                                                                                                                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.z5w, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                            i8 = R.id.z68;
                                                                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.z68, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                                i8 = R.id.vsReviewError;
                                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.vsReviewError, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                                    i8 = R.id.vsReviewSkeleton;
                                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.vsReviewSkeleton, viewLIZ9) != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.m7q;
                                                                                                                                                                                                                                                                                                        View viewLIZ10 = C1616006Uk.LIZ(R.id.m7q, viewTd);
                                                                                                                                                                                                                                                                                                        if (viewLIZ10 != null) {
                                                                                                                                                                                                                                                                                                            int i9 = R.id.cmk;
                                                                                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.cmk, viewLIZ10) != null) {
                                                                                                                                                                                                                                                                                                                i9 = R.id.l7i;
                                                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.l7i, viewLIZ10) != null) {
                                                                                                                                                                                                                                                                                                                    i9 = R.id.l7k;
                                                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.l7k, viewLIZ10) != null) {
                                                                                                                                                                                                                                                                                                                        i9 = R.id.z6z;
                                                                                                                                                                                                                                                                                                                        TuxTextView tuxTextView6 = (TuxTextView) C1616006Uk.LIZ(R.id.z6z, viewLIZ10);
                                                                                                                                                                                                                                                                                                                        if (tuxTextView6 != null) {
                                                                                                                                                                                                                                                                                                                            i9 = R.id.z71;
                                                                                                                                                                                                                                                                                                                            if (C1616006Uk.LIZ(R.id.z71, viewLIZ10) != null) {
                                                                                                                                                                                                                                                                                                                                C0DE2 c0de2 = new C0DE2((LinearLayout) viewLIZ10, tuxTextView6);
                                                                                                                                                                                                                                                                                                                                i = R.id.m7r;
                                                                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.m7r, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.m7s;
                                                                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.m7s, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                        i = R.id.m7x;
                                                                                                                                                                                                                                                                                                                                        View viewLIZ11 = C1616006Uk.LIZ(R.id.m7x, viewTd);
                                                                                                                                                                                                                                                                                                                                        if (viewLIZ11 != null) {
                                                                                                                                                                                                                                                                                                                                            int i10 = R.id.jt5;
                                                                                                                                                                                                                                                                                                                                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C1616006Uk.LIZ(R.id.jt5, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                            if (horizontalScrollView != null) {
                                                                                                                                                                                                                                                                                                                                                i10 = R.id.n9v;
                                                                                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.n9v, viewLIZ11) != null) {
                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.n_x;
                                                                                                                                                                                                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) C1616006Uk.LIZ(R.id.n_x, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.sre;
                                                                                                                                                                                                                                                                                                                                                        C1203340hQ4 c1203340hQ4 = (C1203340hQ4) C1616006Uk.LIZ(R.id.sre, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                        if (c1203340hQ4 != null) {
                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.z2e;
                                                                                                                                                                                                                                                                                                                                                            TuxTextView tuxTextView7 = (TuxTextView) C1616006Uk.LIZ(R.id.z2e, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                            if (tuxTextView7 != null) {
                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.z2f;
                                                                                                                                                                                                                                                                                                                                                                TuxTextView tuxTextView8 = (TuxTextView) C1616006Uk.LIZ(R.id.z2f, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                                if (tuxTextView8 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.z2g;
                                                                                                                                                                                                                                                                                                                                                                    TuxTextView tuxTextView9 = (TuxTextView) C1616006Uk.LIZ(R.id.z2g, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                                    if (tuxTextView9 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.z5l;
                                                                                                                                                                                                                                                                                                                                                                        TuxTextView tuxTextView10 = (TuxTextView) C1616006Uk.LIZ(R.id.z5l, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                                        if (tuxTextView10 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.z5u;
                                                                                                                                                                                                                                                                                                                                                                            TuxTextView tuxTextView11 = (TuxTextView) C1616006Uk.LIZ(R.id.z5u, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                                            if (tuxTextView11 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.z65;
                                                                                                                                                                                                                                                                                                                                                                                TuxTextView tuxTextView12 = (TuxTextView) C1616006Uk.LIZ(R.id.z65, viewLIZ11);
                                                                                                                                                                                                                                                                                                                                                                                if (tuxTextView12 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    C0DDS c0dds = new C0DDS((ConstraintLayout) viewLIZ11, horizontalScrollView, linearLayout5, c1203340hQ4, tuxTextView7, tuxTextView8, tuxTextView9, tuxTextView10, tuxTextView11, tuxTextView12);
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.ve1;
                                                                                                                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.ve1, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.veb;
                                                                                                                                                                                                                                                                                                                                                                                        C21578619ce c21578619ce2 = (C21578619ce) C1616006Uk.LIZ(R.id.veb, viewTd);
                                                                                                                                                                                                                                                                                                                                                                                        if (c21578619ce2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.y6m;
                                                                                                                                                                                                                                                                                                                                                                                            C19V8 c19v8 = (C19V8) C1616006Uk.LIZ(R.id.y6m, viewTd);
                                                                                                                                                                                                                                                                                                                                                                                            if (c19v8 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.z3s;
                                                                                                                                                                                                                                                                                                                                                                                                if (C1616006Uk.LIZ(R.id.z3s, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.z52;
                                                                                                                                                                                                                                                                                                                                                                                                    if (C1616006Uk.LIZ(R.id.z52, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.z62;
                                                                                                                                                                                                                                                                                                                                                                                                        if (C1616006Uk.LIZ(R.id.z62, viewTd) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.viewBottomButtonSpacer;
                                                                                                                                                                                                                                                                                                                                                                                                            View viewLIZ12 = C1616006Uk.LIZ(R.id.viewBottomButtonSpacer, viewTd);
                                                                                                                                                                                                                                                                                                                                                                                                            if (viewLIZ12 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                this.LLIZLLLIL = new C0DD8((FrameLayout) viewTd, linearLayout, c197039127h, c197039127h2, c21578619ce, c0dde, c0ddu, c0de2, c0dds, c21578619ce2, c19v8, viewLIZ12);
                                                                                                                                                                                                                                                                                                                                                                                                                WR().LL.setLayoutDirection(3);
                                                                                                                                                                                                                                                                                                                                                                                                                WR().LL.setTextDirection(5);
                                                                                                                                                                                                                                                                                                                                                                                                                FrameLayout frameLayout2 = WR().LL;
                                                                                                                                                                                                                                                                                                                                                                                                                C19GS c19gs = null;
                                                                                                                                                                                                                                                                                                                                                                                                                if (!(frameLayout2 instanceof View)) {
                                                                                                                                                                                                                                                                                                                                                                                                                    frameLayout2 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                if (frameLayout2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                                        ViewTreeLifecycleOwner.set(frameLayout2, getViewLifecycleOwner());
                                                                                                                                                                                                                                                                                                                                                                                                                        ViewTreeViewModelStoreOwner.set(frameLayout2, this);
                                                                                                                                                                                                                                                                                                                                                                                                                        frameLayout2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                                                                                                                                                                                                                                                                                                                                                                                                        C19EG activity = getActivity();
                                                                                                                                                                                                                                                                                                                                                                                                                        if (activity instanceof C19GS) {
                                                                                                                                                                                                                                                                                                                                                                                                                            c19gs = (C19GS) activity;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        C1685300txQ.LIZ(c19gs);
                                                                                                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th) {
                                                                                                                                                                                                                                                                                                                                                                                                                        TryCatchGuardChecker.doCheck(th);
                                                                                                                                                                                                                                                                                                                                                                                                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                                                                                                                                                                                                                                                                                                                                                                                                        return frameLayout2;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                C189200o6.m2constructorimpl(Unit.LIZ);
                                                                                                                                                                                                                                                                                                                                                                                                                return frameLayout2;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ11.getResources().getResourceName(i10)));
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ10.getResources().getResourceName(i9)));
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ9.getResources().getResourceName(i8)));
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ8.getResources().getResourceName(R.id.n_c)));
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ7.getResources().getResourceName(i7)));
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ6.getResources().getResourceName(i6)));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ5.getResources().getResourceName(i5)));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ4.getResources().getResourceName(i4)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ3.getResources().getResourceName(R.id.n_3)));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ2.getResources().getResourceName(i3)));
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ.getResources().getResourceName(i2)));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public static void iS(PdpFragment pdpFragment, int i, String str, String str2, int i2) {
        Object c098200Yq;
        String str3 = str2;
        String str4 = str;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = 1;
        }
        if ((i2 & 2) != 0) {
            str4 = "product_detail";
        }
        if ((i2 & 4) != 0) {
            str3 = "PDP";
        }
        PdpViewModel pdpViewModel = pdpFragment.LLJ;
        if (pdpViewModel != null) {
            AbstractC332980D3o abstractC332980D3o = (AbstractC332980D3o) pdpViewModel.LLILLJJLI.getValue();
            if (abstractC332980D3o instanceof C0D21) {
                C332690D2l c332690D2l = pdpViewModel.LLILZLL;
                Map<String, String> map = pdpViewModel.LLJ;
                if (c332690D2l != null) {
                    C332730D2p c332730D2p = new C332730D2p(c332690D2l, null, pdpViewModel.LLIZLLLIL, map, pdpViewModel.LLJI);
                    dS(pdpFragment, (C0D21) abstractC332980D3o, i3, str4, false, 8);
                    pdpFragment.VR(null);
                    try {
                        C332950D3l.LIZIZ(pdpFragment.requireContext(), ((C0D21) abstractC332980D3o).getPageData(), c332730D2p, i3, str3, new AwS583S0100000_4(pdpFragment, 250));
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m8isSuccessimpl(c098200Yq)) {
                        pdpFragment.gS();
                    }
                }
            }
        }
    }

    public static void dS(PdpFragment pdpFragment, C0D21 c0d21, int i, String str, boolean z, int i2) {
        C335000DBi c335000DBi;
        String str2;
        CommonAdData commonAdDataEe;
        boolean z2 = z;
        String str3 = str;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 1;
        }
        if ((i2 & 4) != 0) {
            str3 = "product_detail";
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        PdpViewModel pdpViewModel = pdpFragment.LLJ;
        if (pdpViewModel != null && (c335000DBi = pdpFragment.LLJJ) != null) {
            C0D3K pageData = c0d21.getPageData();
            Map<String, String> map = pdpViewModel.LLJ;
            C0D3V c0d3v = pageData.skuSelection;
            if (c0d3v == null || (str2 = c0d3v.selectedVariantId) == null) {
                str2 = map.get("shopify_variant_id");
            }
            C1023960ckk c1023960ckk = C0DIR.LIZ;
            C332690D2l c332690D2l = pdpViewModel.LLILZLL;
            if (c332690D2l == null || (commonAdDataEe = c332690D2l.rawAdData) == null) {
                commonAdDataEe = pdpFragment.ee();
            }
            c335000DBi.logAd(c1023960ckk, commonAdDataEe, new C0DBC(z2, str3, i3, pageData, str2, pdpFragment, map));
        }
    }
}
