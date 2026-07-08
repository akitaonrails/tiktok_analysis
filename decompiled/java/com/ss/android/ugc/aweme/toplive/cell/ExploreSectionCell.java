package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C481820Iuy;
import X.C481850Iv1;
import X.C482300Ivk;
import X.C482330Ivn;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class ExploreSectionCell extends ToplivePagePowerCell<C482330Ivn> implements C03H8 {
    public RecyclerView LLILLJJLI;
    public LinearLayoutManager LLILLL;
    public C481850Iv1 LLILZ;

    public ExploreSectionCell() {
        super(true);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem = C482300Ivk.LIZLLL;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem2 = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw2 == null || (str = abstractC482420Ivw2.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str2 = abstractC482420Ivw3.LLILLJJLI) == null) {
            str2 = "discovery";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem, toplivePageItem2, str, str2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.hh9);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
            linearLayoutManager.setOrientation(0);
            this.LLILLL = linearLayoutManager;
            this.LLILZ = new C481850Iv1();
            RecyclerView recyclerView = this.LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(this.LLILLL);
            }
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.LLILZ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di7, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) interfaceC1891350zJl;
        super.onBindItemView(abstractC482420Ivw, list);
        C481850Iv1 c481850Iv1 = this.LLILZ;
        if (c481850Iv1 != null) {
            List<ToplivePageItem> list2 = abstractC482420Ivw.LL.subItems;
            String str = abstractC482420Ivw.LLILLL;
            c481850Iv1.LL = list2;
            c481850Iv1.LLILLJJLI = str;
            c481850Iv1.notifyDataSetChanged();
        }
    }
}
