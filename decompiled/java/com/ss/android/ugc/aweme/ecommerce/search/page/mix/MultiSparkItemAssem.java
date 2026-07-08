package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.AbstractC21673719rz;
import X.C019F;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C142100gV;
import X.C1537720q7O;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C677470Qhl;
import X.C679540Ql6;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.RunnableC678870Qk1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiSparkItemAssem extends MixReusedUIAssem<MultiSparkItemAssem, C677470Qhl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final Set<Integer> LLLFZ;
    public static final Set<Integer> LLLI;
    public static final List<Integer> LLLII;
    public boolean LLJLIL;
    public C1537720q7O LLJLILLLLZIIL;
    public View LLJLL;
    public final AssemVMLazy LLJLLIL;
    public RunnableC678870Qk1 LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public C679540Ql6 LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiSparkItemAssem.class, "mixShopBizVM", "getMixShopBizVM()Lcom/ss/android/ugc/aweme/ecommerce/search/page/mix/MixShopSearchBizVM;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = C13LQ.LJLIIL(new Integer[]{11, 12, 13, 24, 25, 26, 40, 42, 43});
        LLLI = C13LQ.LJLIIL(new Integer[]{8, 9, 10, 11, 12, 13, 24, 25, 26, 40, 42, 43, 35});
        LLLII = C1697810uHb.LJIIJJI(1, 20, 21, 9, 10);
    }

    public MultiSparkItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixShopSearchBizVM.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 100), AFwS241S0000000_10.get$arr$(59), null, true);
        this.LLJZIJLIL = -1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bq1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLIL = false;
        RunnableC678870Qk1 runnableC678870Qk1 = this.LLJLLL;
        if (runnableC678870Qk1 != null && !runnableC678870Qk1.LL) {
            if (tp().LLJJLIIIJLLLLLLLZ) {
                tp().LLJJL.removeCallbacks(runnableC678870Qk1);
            } else {
                tp().LLJJJJ.remove(runnableC678870Qk1);
            }
        }
        this.LLJLLL = null;
        if (((Boolean) C142100gV.LIZ.getValue()).booleanValue()) {
            C679540Ql6 c679540Ql6 = this.LLLFF;
            if (c679540Ql6 != null) {
                c679540Ql6.LIZLLL = null;
                c679540Ql6.LJJ = null;
            }
            this.LLLFF = null;
        }
    }

    public final MixShopSearchBizVM tp() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (MixShopSearchBizVM) assemVMLazy.getValue();
    }

    public final void up() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view = this.LLJLL;
        for (Object parent = view != null ? view.getParent() : null; parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) parent;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                        staggeredGridLayoutManager.LJJIIZ();
                    }
                    AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
                    if (itemAnimator != null) {
                        itemAnimator.LJIIL();
                    }
                    recyclerView.requestLayout();
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLL = view;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        sp((C677470Qhl) obj, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C677470Qhl r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.MultiSparkItemAssem.sp(X.0Qhl, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        boolean z;
        C677470Qhl c677470Qhl = (C677470Qhl) interfaceC1587906Jp;
        if (list != null && C13LP.LJJJLL(list) != null) {
            z = true;
        } else {
            z = false;
        }
        sp(c677470Qhl, z);
    }
}
