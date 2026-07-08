package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.C07GK;
import X.C0QSJ;
import X.C0RDF;
import X.C0SMN;
import X.C0SMO;
import X.C0SZS;
import X.C0SZT;
import X.C0SZU;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C585710My9;
import X.C653660PkS;
import X.C658200Prm;
import X.C658280Pru;
import X.C661470Px3;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC656470Poz;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleClickScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class UserVideoHolderAssemSupport extends C658280Pru implements C0SMN<UserVideoHolderAssemSupport, C658200Prm>, IUserVideoHolderAbility, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ AssemReusedVHContainer<UserVideoHolderAssemSupport, C658200Prm> LLLIIIL;

    @Override // X.C0SMN
    public final C0RDF C41() {
        return this.LLLIIIL.C41();
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<UserVideoHolderAssemSupport, C658200Prm> LJJJLL() {
        return this.LLLIIIL.LJJJLL();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLLIIIL.LLIIIILZ();
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        this.LLLIIIL.getClass();
        return null;
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLLIIIL.Sl0(view, interfaceC719640SKs);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCLASubtitleClickScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.C0SMO
    public final C0SZU<UserVideoHolderAssemSupport, C658200Prm> getChild() {
        return this.LLLIIIL.getChild();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLLIIIL.getLifecycle();
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleClickScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleClickScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLLIIIL.k0();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LLLIIIL.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0SMN
    public final void wY0() {
        this.LLLIIIL.wY0();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLLIIIL.LLJJIJI;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLLIIIL.LLJJ;
    }

    @Override // X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLLIIIL.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLLIIIL.LLILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLLIIIL.LLJJI;
    }

    @Override // X.C0SMO
    public final C0SZS<UserVideoHolderAssemSupport, C658200Prm> getProxy() {
        return this.LLLIIIL.LLIZLLLIL;
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLLIIIL.LLJIJIL;
    }

    @Override // X.C658280Pru
    public final void X5() {
        ISearchCLASubtitleAbility iSearchCLASubtitleAbility;
        super.X5();
        if (!C07GK.LIZ() || (iSearchCLASubtitleAbility = (ISearchCLASubtitleAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), ISearchCLASubtitleAbility.class, null)) == null) {
            return;
        }
        iSearchCLASubtitleAbility.TN2();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.IUserVideoHolderAbility
    public final C661470Px3 X4() {
        return this.LLJJIII;
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<UserVideoHolderAssemSupport, C658200Prm> c0szs) {
        this.LLLIIIL.LLIZLLLIL = c0szs;
    }

    @Override // X.C0SMN
    public final void SN1(int i, C658200Prm c658200Prm) {
        this.LLLIIIL.LLJJJJLIIL(i, c658200Prm, null);
    }

    @Override // X.C658280Pru
    public final void P5(Aweme aweme, C653660PkS c653660PkS, int i) {
        super.P5(aweme, c653660PkS, i);
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, IUserVideoHolderAbility.class, null, null);
        this.LLLIIIL.LLJJJJLIIL(i, new C658200Prm(aweme), null);
    }

    public UserVideoHolderAssemSupport(View view, C585710My9 c585710My9, InterfaceC656470Poz interfaceC656470Poz, C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt, LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC665370Q7z> function0) {
        super(view, c585710My9, interfaceC656470Poz);
        this.LLLIIIL = new AssemReusedVHContainer<>(lifecycleOwner, c0szt, new UserVideoHolderAssem(), view, function0);
        Sl0(view, this);
    }
}
