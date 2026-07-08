package com.ss.android.ugc.aweme.ecommerce.base.address.common.selectitem;

import X.AnonymousClass0208;
import X.C019F;
import X.C1153870g8H;
import X.C13LE;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C993650bxr;
import X.InterfaceC1164480gPO;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SelectItemAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectItemAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/address/common/selectitem/SelectItemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectItemViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 163), AFwS256S0000000_18.get$arr$(60), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1153870g8H.class, null), checkSupervisorPrepared());
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SelectItemViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SelectItemViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Go().LL = ((C1153870g8H) this.LLJI.getValue()).LL;
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.rmx);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById).LJIILJJIL(SelectItemViewHolder.class);
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.rmx);
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2;
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        SelectItemViewModel selectItemViewModelGo = Go();
        List<? extends InterfaceC1164480gPO> list = selectItemViewModelGo.LL;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends InterfaceC1164480gPO> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C993650bxr(it2.next()));
            }
            selectItemViewModelGo.setState(new AwS597S0100000_18(arrayList, (List<String>) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gMG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158350gFV) obj).LL;
            }
        }, null, AnonymousClass0208.get$arr$(63), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gMF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158350gFV) obj).LLILLJJLI;
            }
        }, null, AFwS302S0000000_18.get$arr$(28), 6);
    }
}
