package com.ss.android.ugc.aweme.tako.botpage.components.image;

import X.C019F;
import X.C01GW;
import X.C06X1;
import X.C13LE;
import X.C15422062a;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1767006w0;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS71S0200000_2;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAIImageConvertStyleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIImageConvertStyleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/botpage/components/image/TakoAIImageConvertStyleVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoAIImageConvertStyleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoAIImageConvertStyleVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 850), AFwS229S0000000_2.get$arr$(521), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C15422062a.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 849));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List<ConvertStyleItem> list;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoAIImageConvertStyleItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 2));
        ArrayList arrayList = null;
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1767006w0(viewOnAttachStateChangeListenerC20604515jv, 2));
        ConvertStyle convertStyle = ((C15422062a) this.LLJ.getValue()).LL;
        if (convertStyle != null && (list = convertStyle.styleList) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (ConvertStyleItem convertStyleItem : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList2.add(new C06X1(i, false, convertStyleItem, AFwS229S0000000_2.get$arr$(520)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList = arrayList2;
        }
        HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS71S0200000_2(viewOnAttachStateChangeListenerC20604515jv, arrayList, 7), 200L);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06X2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C332430D1l) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.06X3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C332430D1l) obj).LLILLL);
            }
        }, null, new AwS651S0100000_2(this, 4), 12);
    }
}
