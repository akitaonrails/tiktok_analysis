package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C0PDT;
import X.C0PF9;
import X.C0PFM;
import X.C0PFU;
import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchServiceCenterImplKt {
    public static final C0PFM LJ(LifecycleOwner lifecycleOwner, List<? extends C0PFU> list) {
        InternalPlayerSyncAbilityImpl internalPlayerSyncAbilityImpl = new InternalPlayerSyncAbilityImpl(list);
        LIZ(lifecycleOwner, internalPlayerSyncAbilityImpl, InternalPlayerSyncAbility.class);
        return internalPlayerSyncAbilityImpl;
    }

    public static final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC494301wD interfaceC494301wD, Class<? extends InterfaceC494301wD> cls) {
        lifecycleOwner.getLifecycle().addObserver(new SearchServiceCenterImplKt$autoBindAbility$1(lifecycleOwner, interfaceC494301wD, cls));
    }

    public static final void LIZIZ(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        LIZ(lifecycleOwner, new CommonAbilityImpl(recyclerView, layoutManager), SearchServiceCenter$RecyclerViewAbility.class);
    }

    public static final void LIZJ(LifecycleOwner lifecycleOwner, C0PF9 c0pf9, GridLayoutManager gridLayoutManager) {
        LIZ(lifecycleOwner, new TopMixAdapterControlAbilityImpl(c0pf9, gridLayoutManager), SearchServiceCenter$AdapterControlAbility.class);
    }

    public static final void LIZLLL(LifecycleOwner lifecycleOwner, Fragment fragment, C0PDT c0pdt, AwS589S0100000_10 awS589S0100000_10) {
        LIZ(lifecycleOwner, new TopMixNavigateAbilityImpl(fragment, c0pdt, awS589S0100000_10), SearchServiceCenter$NavigateAbility.class);
    }
}
