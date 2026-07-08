package com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui;

import X.C0P74;
import X.C0PCE;
import X.C0QSJ;
import X.C0RDF;
import X.C0SMN;
import X.C0SZS;
import X.C0SZT;
import X.C0SZU;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C301190BrJ;
import X.C588600N6s;
import X.C640730PBf;
import X.C650340Pf6;
import X.C652220Pi8;
import X.C652310PiH;
import X.C652320PiI;
import X.C653660PkS;
import X.C654980Pma;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC641090PCp;
import X.InterfaceC652950PjJ;
import X.InterfaceC653430Pk5;
import X.InterfaceC658500PsG;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveCollectionViewHolderAssemSupport extends C652310PiH implements SearchLiveViewHolderAbility, C0P74, C0SMN<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final /* synthetic */ C640730PBf LLJLIL;
    public final /* synthetic */ AssemReusedVHContainer<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8> LLJLILLLLZIIL;
    public final View LLJLL;
    public boolean LLJLLIL;
    public final C650340Pf6 LLJLLL;
    public InterfaceC658500PsG LLJZ;

    @Override // X.C0SMN
    public final C0RDF C41() {
        return this.LLJLILLLLZIIL.C41();
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8> LJJJLL() {
        return this.LLJLILLLLZIIL.LJJJLL();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLJLILLLLZIIL.LLIIIILZ();
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        this.LLJLILLLLZIIL.getClass();
        return null;
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLJLILLLLZIIL.Sl0(view, interfaceC719640SKs);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJZ = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            return this.LLJZ;
        }
        return null;
    }

    @Override // X.C0SMO
    public final C0SZU<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8> getChild() {
        return this.LLJLILLLLZIIL.getChild();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJLILLLLZIIL.getLifecycle();
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJLILLLLZIIL.k0();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LLJLILLLLZIIL.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0SMN
    public final void wY0() {
        this.LLJLILLLLZIIL.wY0();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveViewHolderAbility
    public final void B12() {
        this.LLJLIL.LIZIZ();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJLILLLLZIIL.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveViewHolderAbility
    public final void Jm1() {
        this.LLJLIL.LIZLLL(this);
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJLILLLLZIIL.LLJJ;
    }

    @Override // X.C0P74
    public final void LJL() {
        this.LLJLIL.LL = null;
    }

    @Override // X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLJLILLLLZIIL.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLJLILLLLZIIL.LLILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJLILLLLZIIL.LLJJI;
    }

    @Override // X.C0SMO
    public final C0SZS<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8> getProxy() {
        return this.LLJLILLLLZIIL.LLIZLLLIL;
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLJLILLLLZIIL.LLJIJIL;
    }

    @Override // X.C652310PiH, X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        Taco tacoLIZ = C0PCE.LIZ(this.LLJLILLLLZIIL.LLJJ, false);
        if (tacoLIZ != null) {
            Taco.LIZ(tacoLIZ, this);
        }
    }

    @Override // X.C652310PiH, X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        Taco tacoLIZ = C0PCE.LIZ(this.LLJLILLLLZIIL.LLJJ, false);
        if (tacoLIZ != null) {
            Taco.LJ(tacoLIZ, this);
        }
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<SearchLiveCollectionViewHolderAssemSupport, C652220Pi8> c0szs) {
        this.LLJLILLLLZIIL.LLIZLLLIL = c0szs;
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LLJLIL.LL = c588600N6s;
    }

    @Override // X.C0SMN
    public final void SN1(int i, C652220Pi8 c652220Pi8) {
        this.LLJLILLLLZIIL.LLJJJJLIIL(i, c652220Pi8, null);
    }

    @Override // X.C652310PiH
    public final void R5(SearchMixFeed searchMixFeed, C653660PkS c653660PkS, int i, ClickSearchViewModel clickSearchViewModel) {
        if (C301190BrJ.LIZ()) {
            if (!this.LLJLLIL) {
                C1558520qew.LJII(C1558420qem.LIZIZ(this), this, SearchLiveViewHolderAbility.class, null, null);
                this.LLJLLIL = true;
            }
            this.LLJILJILJ.LLILLJJLI = C1558420qem.LIZIZ(this);
        }
        super.R5(searchMixFeed, c653660PkS, i, clickSearchViewModel);
        C652320PiI c652320PiI = this.LLJJIII;
        if (c652320PiI != null) {
            ((C654980Pma) c652320PiI.LLJJIJI.getValue()).LLJJIJI = this.LLJLLL;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Pf6] */
    public SearchLiveCollectionViewHolderAssemSupport(View view, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ, C0SZT c0szt, Fragment fragment, AwS554S0100000_10 awS554S0100000_10, Fragment fragment2, SearchContextAbilityImpl searchContextAbilityImpl) {
        super(view, interfaceC641090PCp, interfaceC652950PjJ, fragment2);
        this.LLJLIL = new C640730PBf();
        this.LLJLILLLLZIIL = new AssemReusedVHContainer<>(fragment, c0szt, new SearchLiveCollectionAssem(interfaceC641090PCp, fragment2, view, fragment, searchContextAbilityImpl), view, awS554S0100000_10);
        this.LLJLL = view;
        this.LLJLLL = new InterfaceC653430Pk5() { // from class: X.0Pf6
            @Override // X.InterfaceC653430Pk5
            public final void LIZIZ(Aweme aweme) {
            }

            @Override // X.InterfaceC653430Pk5
            public final void LIZ() {
                this.LIZ.LLJLIL.LIZIZ();
            }
        };
        Sl0(view, this);
    }
}
