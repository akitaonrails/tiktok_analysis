package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.common;

import X.C019F;
import X.C03H5;
import X.C13LE;
import X.C1637806bA;
import X.C1742910vSL;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C631370Opb;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC1742830vSD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public abstract class ECTrendingBaseReusedAssem<T extends C03H5, R extends C1742910vSL> extends ReusedUISlotAssem<T> implements InterfaceC712990Rxx<R>, InterfaceC1742830vSD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECTrendingBaseReusedAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECTrendingBaseReusedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 351), AFwS268S0000000_26.get$arr$(305), null, true);
    }

    public void sp(R r) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TrendingListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (TrendingListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        sp((C1742910vSL) obj);
        TrendingListViewModel trendingListViewModelOp = op();
        int iLIZIZ = C631370Opb.LIZIZ(this);
        if (trendingListViewModelOp.getState().LLILZIL < iLIZIZ) {
            trendingListViewModelOp.setState(new AwS38S0001000_26(iLIZIZ, 26));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
