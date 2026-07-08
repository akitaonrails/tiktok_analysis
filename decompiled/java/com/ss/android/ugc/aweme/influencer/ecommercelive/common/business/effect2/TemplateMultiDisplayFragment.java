package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C1308910kAL;
import X.C13LE;
import X.C1421105hJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1728940v5o;
import X.C1729050v5z;
import X.C1729070v61;
import X.C1729250v6J;
import X.C1744700vVE;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C341940Daq;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardMultiGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateMultiDisplayFragment extends Fragment {
    public static final C1729050v5z LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSYlLWsvHELIOSJiI+JytiKzogISspOjx9LSMqLCwnemsYLCIjJCQ4LAImJDElDSYgOCktMAkhKSIhLCEn";
    public FrameLayout LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public C197039127h LLILZLL;
    public final AssemVMLazy LLIZ;
    public Bitmap LLIZLLLIL;
    public Function0<Unit> LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateMultiDisplayFragment.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C1729050v5z();
    }

    public TemplateMultiDisplayFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 771);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(344);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 772), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 773), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 774), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        View viewFindViewById = null;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.kc4);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (FrameLayout) viewFindViewById2;
            }
            viewFindViewById2.setBackgroundColor(iIntValue);
        }
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        BillboardMultiGuide billboardMultiGuide = ((BillboardGlobalViewModel) assemVMLazy.getValue()).Um1().LLJ;
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.lrt);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (ImageView) viewFindViewById3;
        }
        ((ImageView) viewFindViewById3).setImageBitmap(this.LLIZLLLIL);
        View viewFindViewById4 = this.LLILLJJLI;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.lrt);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLJJLI = (ImageView) viewFindViewById4;
        }
        Bitmap bitmap = this.LLIZLLLIL;
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            C1744700vVE.LJIIL(viewFindViewById4, C814420VxA.LIZ((((double) bitmap.getWidth()) / ((double) bitmap.getHeight())) * ((double) C341940Daq.LIZ(240.0d))));
        }
        View viewFindViewById5 = this.LLILLL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.tv_title);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById5;
        }
        TextView textView = (TextView) viewFindViewById5;
        String str3 = "";
        if (billboardMultiGuide == null || (str = billboardMultiGuide.displayTitle) == null) {
            str = "";
        }
        textView.setText(str);
        View viewFindViewById6 = this.LLILZ;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.zxa);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById6;
        }
        TextView textView2 = (TextView) viewFindViewById6;
        if (billboardMultiGuide == null || (str2 = billboardMultiGuide.displayText) == null) {
            str2 = "";
        }
        textView2.setText(str2);
        RootData rootData = ((BillboardGlobalViewModel) this.LLIZ.getValue()).Um1().LL;
        Map mapLIZ = C1729250v6J.LIZ(rootData.roomId, rootData.authorId, rootData.LIZ(), rootData.isNewUser, null, Integer.valueOf(rootData.templateEntryType));
        mapLIZ.put("actionsheet_name", "multi_template_collage");
        C1421105hJ.LIZJ("livesdk_tiktokec_enter_actionsheet", mapLIZ);
        View viewFindViewById7 = this.LLILZIL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.cny);
            } else {
                viewFindViewById7 = null;
            }
            this.LLILZIL = (C197039127h) viewFindViewById7;
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, rootData, 8), viewFindViewById7);
        View view8 = this.LLILZLL;
        if (view8 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById = view9.findViewById(R.id.cp0);
            }
            this.LLILZLL = (C197039127h) viewFindViewById;
            view8 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, rootData, 9), view8);
        BillboardGlobalViewModel billboardGlobalViewModel = (BillboardGlobalViewModel) this.LLIZ.getValue();
        C1728940v5o c1728940v5o = billboardGlobalViewModel.LL.LL;
        String str4 = billboardGlobalViewModel.getState().LL.authorId;
        c1728940v5o.getClass();
        Keva kevaLIZ = C1729070v61.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_is_first_show_multi_template_image_");
        if (str4 != null) {
            str3 = str4;
        }
        sbLIZ.append(str3);
        kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        billboardGlobalViewModel.setState(AFwS268S0000000_26.get$arr$(606));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bu8, viewGroup, false);
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
}
