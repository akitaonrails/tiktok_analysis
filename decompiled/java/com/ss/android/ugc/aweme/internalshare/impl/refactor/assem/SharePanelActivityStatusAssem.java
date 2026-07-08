package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C0NYY;
import X.C0ZJ9;
import X.C1250860iei;
import X.C1362120lYA;
import X.C1362130lYB;
import X.C1362270lYP;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1867550yhN;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1910440zoY;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC897380ZIi;
import X.InterfaceC899440ZQg;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelActivityStatusAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelActivityStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public InterfaceC899440ZQg LLJI;
    public final C1362130lYB LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelActivityStatusAssem.class, "contactListViewModel", "getContactListViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lYB] */
    public SharePanelActivityStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 640), AFwS259S0000000_21.get$arr$(177), null, true);
        this.LLJIJIL = new C0NYY() { // from class: X.0lYB
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                AssemVMLazy assemVMLazy = this.LL.LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SharePanelActivityStatusAssem.LLJILJIL;
                ShareContactListViewModel shareContactListViewModel = (ShareContactListViewModel) assemVMLazy.getValue();
                shareContactListViewModel.withState(new AwS387S0200000_21(shareContactListViewModel, (ShareContactListViewModel) map, (Map<String, C595660NXw>) 68));
                return Unit.LIZ;
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C897520ZIw Go() {
        C1362120lYA c1362120lYA;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1362120lYA.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1362120lYA = (C1362120lYA) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c1362120lYA.LLILLJJLI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C897520ZIw c897520ZIwGo = Go();
        if (c897520ZIwGo != null) {
            c897520ZIwGo.LJIIJ(this.LLJIJIL);
        }
        C897520ZIw c897520ZIwGo2 = Go();
        if (c897520ZIwGo2 != null) {
            c897520ZIwGo2.destroy();
        }
        this.LLJI = null;
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        InterfaceC899440ZQg interfaceC899440ZQg = this.LLJI;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onVisible();
        }
        C897520ZIw c897520ZIwGo = Go();
        if (c897520ZIwGo != null) {
            c897520ZIwGo.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        InterfaceC899440ZQg interfaceC899440ZQg = this.LLJI;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onInvisible();
        }
        C897520ZIw c897520ZIwGo = Go();
        if (c897520ZIwGo != null) {
            c897520ZIwGo.LJII();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SharePackage sharePackage;
        Fragment fragmentLJI;
        EnumC1910440zoY enumC1910440zoY;
        super.onViewCreated(view);
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLIZLLLIL.getValue();
        if (c1362270lYP != null && (sharePackage = c1362270lYP.LL) != null) {
            C897520ZIw c897520ZIwGo = Go();
            if (c897520ZIwGo != null) {
                c897520ZIwGo.LIZIZ(false, this.LLJIJIL);
            }
            if (C1867550yhN.LIZ() && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
                if (C1250860iei.LIZ(sharePackage)) {
                    enumC1910440zoY = EnumC1910440zoY.SHARE_PANEL;
                } else {
                    enumC1910440zoY = EnumC1910440zoY.LONG_PRESS_PANEL;
                }
                InterfaceC897380ZIi.LIZIZ.getClass();
                C0ZJ9 c0zj9LJFF = C897370ZIh.LIZ().LJFF();
                View viewFindViewById = view.findViewById(R.id.tx2);
                if (viewFindViewById == null) {
                    viewFindViewById = view;
                }
                this.LLJI = c0zj9LJFF.LIZIZ(enumC1910440zoY, viewFindViewById, fragmentLJI, view.getContext(), fragmentLJI.getView());
            }
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lYC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1362190lYH) obj).LLILLJJLI;
                }
            }, null, new AwS635S0100000_21(this, 111), 6);
        }
    }
}
