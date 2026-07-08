package com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.ageconfirm;

import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03JW;
import X.C03K6;
import X.C03XA;
import X.C04JL;
import X.C098200Yq;
import X.C10515049h;
import X.C13LE;
import X.C1748720vbi;
import X.C189200o6;
import X.C19719912Dl;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719902rV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AgeConfirmModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AgeConfirmCell extends ECPowerCell<C719902rV> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public AgeConfirmModule LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AgeConfirmCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        if (!this.LL) {
            this.LL = true;
            AnonymousClass0378.LIZ().LIZLLL("ec_osp_age_confirm_module_shake", this);
        }
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.03K7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLZZZZ;
            }
        }, null, new AwS615S0100000_1(this, 349), 6);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19ys
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 64), 6);
    }

    public AgeConfirmCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 905);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(51);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 916), awS577S0100000_33, AFwS224S0000000_33.get$arr$(142), new AwS577S0100000_33((C03K6) this, 891), new AwS577S0100000_33((C03K6) this, 893), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 895), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 897), null, new AwS577S0100000_33((C03K6) this, 898));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 892);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 894);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 896);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 33));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 899);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 900);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 901);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 902);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 903);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 904), awS577S0100000_33, AFwS224S0000000_33.get$arr$(140), new AwS577S0100000_33((C03K6) this, 906), new AwS577S0100000_33((C03K6) this, 907), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 908), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 909), null, new AwS577S0100000_33((C03K6) this, 910));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 911), awS577S0100000_33, AFwS224S0000000_33.get$arr$(141), new AwS577S0100000_33((C03K6) this, 912), new AwS577S0100000_33((C03K6) this, 913), new AwS577S0100000_33((C03K6) this, 914), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 915));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_osp_age_confirm_module_shake", this);
    }

    public final void N5(C03JW c03jw) {
        ECRichText eCRichText;
        AgeConfirmModule ageConfirmModule = this.LLJI;
        if (ageConfirmModule == null) {
            return;
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.gfd);
        if (c03jw.LIZIZ && !c03jw.LIZ) {
            eCRichText = ageConfirmModule.needToConfirmText;
        } else {
            eCRichText = ageConfirmModule.text;
        }
        C03C8.LIZJ(textView, eCRichText, "osp_age_confirm", null);
        ((CompoundButton) this.itemView.findViewById(R.id.gfb)).setChecked(c03jw.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        this.LLJI = ((C719902rV) interfaceC1891350zJl).LLILZLL;
        N5(L5().getState().LLZZZZ);
        C786410Ut5.v7((CheckBox) this.itemView.findViewById(R.id.gfb), new C04JL(this, 1));
        AgeConfirmModule ageConfirmModule = this.LLJI;
        if (ageConfirmModule != null) {
            str = ageConfirmModule.daInfo;
        } else {
            str = null;
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(540), new AwS115S1100000_1(this, str, 58));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.aon, viewGroup, false);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_osp_age_confirm_module_shake")) {
            try {
                View view = this.itemView;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.be);
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.gfc);
                if (constraintLayout != null) {
                    constraintLayout.startAnimation(animationLoadAnimation);
                }
                C189200o6.m2constructorimpl(view);
                obj = view;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LIZJ(thM5exceptionOrNullimpl.toString());
            }
        }
    }
}
