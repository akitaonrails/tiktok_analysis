package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui.opt;

import X.C01GW;
import X.C07E5;
import X.C0HXV;
import X.C0IDG;
import X.C0PQX;
import X.C0PU4;
import X.C0PUB;
import X.C0PUL;
import X.C0Q3E;
import X.C0QRC;
import X.C13BV;
import X.C418040GaI;
import X.C452501pT;
import X.C645860PUy;
import X.C653660PkS;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCSCardSingleAssem extends ReusedUISlotAssem<SearchCSCardSingleAssem> implements InterfaceC712990Rxx<C0PU4>, View.OnAttachStateChangeListener {
    public C0PU4 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 761));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 756));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 757));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 760));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 758));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 759));
    public WrapGridLayoutManager LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etp;
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
        C0PU4 c0pu4 = this.LLJJLIIIJLLLLLLLZ;
        if (c0pu4 != null && (c0pqx2 = c0pu4.LL) != null && (c0qrc = c0pqx2.LJFF) != null && (clickSearchResponse = c0qrc.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C0PU4 c0pu42 = this.LLJJLIIIJLLLLLLLZ;
        C0PUB c0pub = null;
        if (c0pu42 != null && (c0pqx = c0pu42.LL) != null) {
            str = c0pqx.LIZJ;
        } else {
            str = null;
        }
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(LJJIJL());
        C0PU4 c0pu43 = this.LLJJLIIIJLLLLLLLZ;
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
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJLL.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchCSItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        ((RecyclerView) this.LLJLL.getValue()).addItemDecoration(new C0IDG(14));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0PU4 c0pu4) {
        int i;
        List list;
        ClickSearchResponse clickSearchResponse;
        C0PU4 c0pu42 = c0pu4;
        this.LLJJLIIIJLLLLLLLZ = c0pu42;
        if (c0pu42.LLILZ) {
            ((View) this.LLJLIL.getValue()).setPadding(0, 0, 0, (int) C418040GaI.LIZ(8));
            ((View) this.LLJLILLLLZIIL.getValue()).setPadding(0, (int) C418040GaI.LIZ(12), 0, (int) C418040GaI.LIZ(16));
        } else {
            ((View) this.LLJLIL.getValue()).setPadding(0, 0, 0, 0);
            ((View) this.LLJLILLLLZIIL.getValue()).setPadding(0, (int) C418040GaI.LIZ(12), 0, (int) C418040GaI.LIZ(8));
        }
        C653660PkS c653660PkS = c0pu42.LLILLJJLI;
        int i2 = -1;
        if (c653660PkS != null) {
            i = c653660PkS.LJJJLL;
            i2 = c653660PkS.LJJJLIIL;
        } else {
            i = -1;
        }
        if (c0pu42.LLILLL && i > 0 && i2 >= 0) {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJLLIL.getValue());
            C0HXV.LJI((int) (((((((Number) this.LLJL.getValue()).intValue() - (C418040GaI.LIZ(8) * (i + 1))) / (i * 2)) * ((i2 * 2) + 1)) + (C418040GaI.LIZ(8) * i2)) - C418040GaI.LIZ(8)), (View) this.LLJLLL.getValue());
        } else {
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJLLIL.getValue());
        }
        C0PQX c0pqx = c0pu42.LL;
        C0QRC<ClickSearchResponse> c0qrc = c0pqx.LJFF;
        if (c0qrc == null || (clickSearchResponse = c0qrc.LIZIZ) == null || (list = clickSearchResponse.wordsList) == null) {
            list = C13BV.INSTANCE;
        }
        String str = c0pqx.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0PUL((ClickSearchWord) it2.next(), c0pu42.LLILLJJLI, str, c0pu42.LL.LJIIIZ));
        }
        ArrayList arrayList2 = (ArrayList) ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJLL.getValue()).getState().LJII();
        if (arrayList.size() == arrayList2.size()) {
            Iterator it3 = arrayList2.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                int i4 = i3 + 1;
                if (Intrinsics.LJFF(it3.next(), ListProtector.get(arrayList, i3))) {
                    i3 = i4;
                } else {
                    this.LLJZ = new WrapGridLayoutManager(1, 0, LJJIJL().getContext(), false);
                    ((RecyclerView) this.LLJLL.getValue()).setLayoutManager(this.LLJZ);
                    break;
                }
            }
        } else {
            this.LLJZ = new WrapGridLayoutManager(1, 0, LJJIJL().getContext(), false);
            ((RecyclerView) this.LLJLL.getValue()).setLayoutManager(this.LLJZ);
            break;
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJLL.getValue()).getState().LJIILL(arrayList, null);
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
