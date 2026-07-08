package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui;

import X.C01GW;
import X.C07E5;
import X.C0DXR;
import X.C0HXV;
import X.C0PQX;
import X.C0PU4;
import X.C0PUB;
import X.C0PVQ;
import X.C0Q3E;
import X.C0QRC;
import X.C1744700vVE;
import X.C1913107eT;
import X.C418440Gaw;
import X.C452501pT;
import X.C645860PUy;
import X.C648880Pck;
import X.C650240Pew;
import X.C653660PkS;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCSCardAssem extends ReusedUISlotAssem<SearchCSCardAssem> implements InterfaceC712990Rxx<C0PU4>, View.OnAttachStateChangeListener {
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public C0PU4 LLJLILLLLZIIL;
    public final C01GW LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eto;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchCSCardAssem() {
        this.LLJL = C814420VxA.LIZIZ(C1913107eT.LIZ() != 0 ? C418440Gaw.LIZIZ(10) : C418440Gaw.LIZIZ(16));
        this.LLJLIL = C814420VxA.LIZIZ(C1913107eT.LIZ() != 0 ? C418440Gaw.LIZIZ(10) : C418440Gaw.LIZIZ(8));
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 755));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int size;
        String str;
        C653660PkS c653660PkS;
        C0PQX c0pqx;
        C0PQX c0pqx2;
        C0QRC<ClickSearchResponse> c0qrc;
        ClickSearchResponse clickSearchResponse;
        List<ClickSearchWord> list;
        C0PU4 c0pu4 = this.LLJLILLLLZIIL;
        if (c0pu4 != null && (c0pqx2 = c0pu4.LL) != null && (c0qrc = c0pqx2.LJFF) != null && (clickSearchResponse = c0qrc.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C0PU4 c0pu42 = this.LLJLILLLLZIIL;
        C0PUB c0pub = null;
        if (c0pu42 != null && (c0pqx = c0pu42.LL) != null) {
            str = c0pqx.LIZJ;
        } else {
            str = null;
        }
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(LJJIJL());
        C0PU4 c0pu43 = this.LLJLILLLLZIIL;
        if (c0pu43 != null) {
            c653660PkS = c0pu43.LLILLJJLI;
            C0PQX c0pqx3 = c0pu43.LL;
            if (c0pqx3 != null) {
                c0pub = c0pqx3.LJIIIZ;
            }
        } else {
            c653660PkS = null;
        }
        C645860PUy.LIZ(size, str, iSearchContextAbilityLIZ, c653660PkS, c0pub);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.addOnAttachStateChangeListener(this);
        if (C650240Pew.LIZ()) {
            View viewFindViewById = view.findViewById(R.id.f_n);
            C648880Pck.LIZIZ(viewFindViewById);
            C650240Pew.LIZ.getClass();
            C1744700vVE.LJIIIZ(C650240Pew.LIZJ, viewFindViewById);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.f_o);
        C0HXV.LJI(this.LLJLIL, recyclerView);
        C0HXV.LIZIZ(this.LLJLIL, recyclerView);
        this.LLJJLIIIJLLLLLLLZ = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.f_p);
        C0HXV.LJI(this.LLJL, viewFindViewById2);
        C0HXV.LIZIZ(this.LLJL, viewFindViewById2);
        RecyclerView recyclerView2 = this.LLJJLIIIJLLLLLLLZ;
        RecyclerView recyclerView3 = null;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new WrapGridLayoutManager(2, 1, view.getContext(), false));
        RecyclerView recyclerView4 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView4 != null) {
            recyclerView3 = recyclerView4;
        }
        recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0Ggn
            public final int LL = (int) C418040GaI.LIZ(8);

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                boolean zLIZLLL;
                Context context = view2.getContext();
                if (context != null) {
                    zLIZLLL = C426750GoL.LIZLLL(context);
                } else {
                    zLIZLLL = false;
                }
                int childAdapterPosition = recyclerView5.getChildAdapterPosition(view2);
                if (childAdapterPosition > 1) {
                    rect.top = this.LL;
                }
                int i = childAdapterPosition % 2;
                if (i == 0) {
                    if (zLIZLLL) {
                        rect.left = this.LL / 2;
                        return;
                    } else {
                        rect.right = this.LL / 2;
                        return;
                    }
                }
                if (i != 1) {
                    return;
                }
                if (zLIZLLL) {
                    rect.right = this.LL / 2;
                } else {
                    rect.left = this.LL / 2;
                }
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0PU4 c0pu4) {
        List<ClickSearchWord> list;
        ClickSearchResponse clickSearchResponse;
        C0PU4 c0pu42 = c0pu4;
        this.LLJLILLLLZIIL = c0pu42;
        C0PQX c0pqx = c0pu42.LL;
        C0QRC<ClickSearchResponse> c0qrc = c0pqx.LJFF;
        RecyclerView recyclerView = null;
        if (c0qrc != null && (clickSearchResponse = c0qrc.LIZIZ) != null) {
            list = clickSearchResponse.wordsList;
        } else {
            list = null;
        }
        String str = c0pqx.LIZJ;
        if (list != null && (!list.isEmpty())) {
            RecyclerView recyclerView2 = this.LLJJLIIIJLLLLLLLZ;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            C0PVQ c0pvq = new C0PVQ();
            C653660PkS c653660PkS = c0pu42.LLILLJJLI;
            if (c653660PkS != null) {
                c653660PkS.LJJJJLI = c0pu42.LL.LIZJ;
            }
            ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(LJJIJL());
            C0PQX c0pqx2 = c0pu42.LL;
            C653660PkS c653660PkS2 = c0pu42.LLILLJJLI;
            C0PUB c0pub = c0pqx2.LJIIIZ;
            c0pvq.LLILLJJLI = iSearchContextAbilityLIZ;
            c0pvq.LLILLL = c653660PkS2;
            c0pvq.LLILZ = c0pub;
            c0pvq.LL = list;
            c0pvq.notifyDataSetChanged();
            c0pvq.LLILZIL = str;
            recyclerView.setAdapter(c0pvq);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PU4 c0pu4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PU4 c0pu4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
