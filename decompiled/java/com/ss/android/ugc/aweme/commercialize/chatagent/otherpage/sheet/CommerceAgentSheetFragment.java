package com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet;

import X.C019F;
import X.C01D1;
import X.C0PEM;
import X.C1343605Nq;
import X.C13IQ;
import X.C13LE;
import X.C1467905or;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.EnumC1467505on;
import X.InterfaceC1058150ddt;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.scope.CommerceAgentFragmentScope;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class CommerceAgentSheetFragment extends CommerceAgentBaseFragment implements InterfaceC1058150ddt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKicyPCQrLCHELIOSEnZio4ISohOCQrLGEgICApPWEQJyghLD0wLQQrLCEnGy0pLDsVOiQrJCo9PA==";
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentSheetFragment.class, "commerceAgentSheetVM", "getCommerceAgentSheetVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/otherpage/sheet/CommerceAgentSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    public void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    public C19719912Dl UR() {
        return C13LE.LIZ(SheetTopTitleAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommerceAgentFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(CommerceAgentFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(CommerceAgentFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment
    public String nZ0() {
        return "nine_split_screen";
    }

    public boolean onBackPress() {
        return false;
    }

    public CommerceAgentSheetFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentSheetVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 158);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(42);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 126), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS562S0100000_18((Fragment) this, 127), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 128), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVMLIZ = C1467905or.LIZ(requireActivity().getLifecycle(), EnumC1467505on.COMMERCE_AGENT_PAGE);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        synchronized (commerceAgentCardContainerSharedVMLIZ) {
            if (commerceAgentCardContainerSharedVMLIZ.LLILLL != null) {
                return;
            }
            commerceAgentCardContainerSharedVMLIZ.LLILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(commerceAgentCardContainerSharedVMLIZ), C0PEM.LIZJ, null, new C1343605Nq(interfaceC665370Q7zLJFF, commerceAgentCardContainerSharedVMLIZ, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 60), 3);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        AssemViewModel.selectSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gLS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159030gGb) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS595S0100000_16(new AwS560S0100000_16(this, 157), 224), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentBaseFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
