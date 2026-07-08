package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C01GW;
import X.C098200Yq;
import X.C0R45;
import X.C1558520qew;
import X.C189200o6;
import X.C21681919tJ;
import X.C452501pT;
import X.InterfaceC594520NTm;
import X.InterfaceC641770PFf;
import X.InterfaceC655050Pmh;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardCommonAbilityImpl implements SearchServiceCenter$CardCommonAbility, InterfaceC641770PFf {
    public final RecyclerView.ViewHolder LL;
    public final ISearchCardProtocol<InterfaceC594520NTm> LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(158));
    public InterfaceC594520NTm LLILZ;
    public SearchServiceCenter$RecyclerViewAbility LLILZIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final InterfaceC594520NTm cB2() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final ISearchCardProtocol<InterfaceC594520NTm> getProtocol() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final RecyclerView.ViewHolder k4() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final void A12(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        ((ArrayList) this.LLILLL.getValue()).add(onAttachStateChangeListener);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final boolean Qa0(InterfaceC665370Q7z interfaceC665370Q7z) {
        GridLayoutManager gridLayoutManager;
        C21681919tJ c21681919tJ;
        Object c098200Yq;
        boolean z;
        if (this.LLILZIL == null) {
            this.LLILZIL = (SearchServiceCenter$RecyclerViewAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$RecyclerViewAbility.class);
        }
        SearchServiceCenter$RecyclerViewAbility searchServiceCenter$RecyclerViewAbility = this.LLILZIL;
        if (searchServiceCenter$RecyclerViewAbility == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManagerXj0 = searchServiceCenter$RecyclerViewAbility.xj0();
        Object obj = null;
        if (!(layoutManagerXj0 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManagerXj0) == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = this.LL.itemView.getLayoutParams();
        if (!(layoutParams instanceof C21681919tJ) || (c21681919tJ = (C21681919tJ) layoutParams) == null) {
            return false;
        }
        try {
            if (gridLayoutManager.LLIZ.LJFF(this.LL.getBindingAdapterPosition() + (gridLayoutManager.LLILLJJLI - c21681919tJ.LL)) == gridLayoutManager.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public SearchCardCommonAbilityImpl(SearchCardViewHolder searchCardViewHolder, ISearchCardProtocol iSearchCardProtocol) {
        this.LL = searchCardViewHolder;
        this.LLILLJJLI = iSearchCardProtocol;
        searchCardViewHolder.itemView.addOnAttachStateChangeListener(new C0R45(this, 4));
    }

    @Override // X.InterfaceC641770PFf
    public final void LIZ(InterfaceC594520NTm interfaceC594520NTm, InterfaceC655050Pmh interfaceC655050Pmh) {
        this.LLILZ = interfaceC594520NTm;
    }
}
