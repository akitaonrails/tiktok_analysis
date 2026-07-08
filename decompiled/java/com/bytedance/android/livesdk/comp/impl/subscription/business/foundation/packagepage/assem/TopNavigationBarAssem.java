package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.C019F;
import X.C0KIZ;
import X.C0KJ3;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C513700KCq;
import X.C515120KIc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.TopNavigationBarAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class TopNavigationBarAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public C513700KCq LLJJIII;
    public ViewGroup LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopNavigationBarAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopNavigationBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0KIZ(c19719912DlLIZ), new C0KJ3(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gbk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.p1q);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e1y);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0KI6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Function0<Unit> function0;
                    TopNavigationBarAssem topNavigationBarAssem = this.LL;
                    if (topNavigationBarAssem.LLJJIII == null) {
                        C513700KCq c513700KCq = null;
                        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(topNavigationBarAssem), "source_default_key", C513700KCq.class, null);
                        if (interfaceC1555100qZQLIZIZ != null) {
                            c513700KCq = (C513700KCq) interfaceC1555100qZQLIZIZ.getSource();
                        }
                        topNavigationBarAssem.LLJJIII = c513700KCq;
                    }
                    C513700KCq c513700KCq2 = topNavigationBarAssem.LLJJIII;
                    if (c513700KCq2 != null && (function0 = c513700KCq2.LLJILLL) != null) {
                        function0.invoke();
                    }
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KIl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, new C515120KIc(this), 6);
    }
}
