package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.follow.view;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1610680s14;
import X.C1610710s17;
import X.C1610720s18;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AsS50S0100000_24;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.FollowShopItem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class ECAuctionFollowAssem extends ReusedUISlotAssem<ECAuctionFollowAssem> implements InterfaceC712990Rxx<C1610710s17> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECAuctionFollowAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECAuctionFollowAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 354), AFwS264S0000000_24.get$arr$(99), null, true);
        this.LLJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 353));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bsl;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1610720s18.LIZ.getClass();
        ((ArrayList) C1610720s18.LIZIZ).clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.yk3);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.yk2);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter((AbstractC21673619ry) this.LLJLIL.getValue());
            recyclerView.addOnScrollListener(new AsS50S0100000_24(this, 0));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1610710s17 c1610710s17) {
        C1610710s17 c1610710s172 = c1610710s17;
        String str = c1610710s172.LLILLL;
        if (str != null && !a0.LJJJIL(str)) {
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(str);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        C1610680s14 c1610680s14 = (C1610680s14) this.LLJLIL.getValue();
        List<FollowShopItem> list = c1610710s172.LLILLJJLI;
        c1610680s14.LLILLJJLI.clear();
        c1610680s14.LLILLJJLI.addAll(list);
        c1610680s14.notifyDataSetChanged();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1610710s17 c1610710s17) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1610710s17 c1610710s17) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
