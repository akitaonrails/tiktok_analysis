package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view;

import X.C019F;
import X.C1161920gLG;
import X.C1217680hnC;
import X.C13LE;
import X.C14K9;
import X.C1637806bA;
import X.C1821800xVa;
import X.C1821820xVc;
import X.C1821830xVd;
import X.C1821840xVe;
import X.C1821850xVf;
import X.C1821860xVg;
import X.C1821870xVh;
import X.C19719912Dl;
import X.C1BHX;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.RunnableC1217690hnD;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel.PcsThirdPartyLinkVm;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkWebviewAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public C1BHX LLJJIII;
    public String LLJJIJI;
    public SparkThirdContext LLJJIJIIJIL;
    public final BPEAHandler LLJJIJIL;
    public boolean LLJJJ;
    public final RunnableC1217690hnD LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsThirdPartyLinkWebviewAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/thirdpartylink/viewmodel/PcsThirdPartyLinkVm;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0hnD] */
    public PcsThirdPartyLinkWebviewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsThirdPartyLinkVm.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217680hnC(c19719912DlLIZ), new C1821870xVh(), null, true);
        this.LLJJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJIL = new Runnable() { // from class: X.0hnD
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsThirdPartyLinkWebviewAssem@1a48.navStatePollRunnable$1");
                try {
                    this.LL.ip();
                    C786410Ut5.LJLIIL(500L, this.LL.LLJJIJIL, this);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsThirdPartyLinkWebviewAssem@1a48.navStatePollRunnable$1");
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz_;
    }

    public final PcsThirdPartyLinkVm hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PcsThirdPartyLinkVm) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJJIJIL.removeCallbacks(this.LLJJJIL);
        super.onDestroy();
    }

    public final void ip() {
        PcsThirdPartyLinkVm pcsThirdPartyLinkVmHp = hp();
        C1BHX c1bhx = this.LLJJIII;
        boolean zCanGoBack = c1bhx != null ? c1bhx.canGoBack() : false;
        C1BHX c1bhx2 = this.LLJJIII;
        pcsThirdPartyLinkVmHp.setState(new C1821800xVa(zCanGoBack, c1bhx2 != null ? c1bhx2.LLJ.canGoForward() : false));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Bundle arguments;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        boolean z = false;
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
            z = arguments.getBoolean("use_rounded_container", false);
        }
        C1BHX c1bhxD60 = null;
        if (z && (viewFindViewById = view.findViewById(R.id.xtf)) != null) {
            float f = viewFindViewById.getResources().getDisplayMetrics().density;
            int i = (int) ((12 * f) + 0.5f);
            int i2 = (int) ((8 * f) + 0.5f);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
            }
            viewFindViewById.setBackgroundResource(R.drawable.f70);
            viewFindViewById.setClipToOutline(true);
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.xtf);
        if (viewGroup != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (context = fragmentLJI2.getContext()) != null) {
                c1bhxD60 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).D60(context, "", new C1821850xVf(this));
            }
            this.LLJJIII = c1bhxD60;
            if (c1bhxD60 != null) {
                C14K9.LJIJI(c1bhxD60, true);
            }
            viewGroup.addView(this.LLJJIII, -1, -1);
            hp().LLILZIL = new C1821830xVd(this);
            hp().LLILZLL = new C1821840xVe(this);
            hp().LLIZ = new C1821860xVg(this);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xVb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1821680xVO) obj).LL;
            }
        }, null, new C1821820xVc(this), 6);
    }
}
