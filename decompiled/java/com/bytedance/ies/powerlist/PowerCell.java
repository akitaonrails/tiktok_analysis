package com.bytedance.ies.powerlist;

import X.AbstractC1906720ziY;
import X.AbstractC903280Zc6;
import X.C03K6;
import X.C06LL;
import X.C0SMO;
import X.C0SZS;
import X.C0SZU;
import X.C13BV;
import X.C19EG;
import X.C20603715jn;
import X.C20605015k0;
import X.C20605915k9;
import X.C20673215v0;
import X.C2188811AlT;
import X.C2493909px;
import X.C480440Isk;
import X.C710340Rtg;
import X.C738350Sxl;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906710ziX;
import X.InterfaceC1906740zia;
import X.InterfaceC20603815jo;
import X.InterfaceC336510DHd;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.PowerContextImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public abstract class PowerCell<T extends InterfaceC1891350zJl> extends RecyclerView.ViewHolder implements LifecycleOwner, LifecycleEventObserver, C0SMO<PowerCell<T>, T>, C06LL, C03K6, HasDefaultViewModelProviderFactory, InterfaceC1906740zia {
    public InterfaceC20603815jo adapterManager;
    public RecyclerView attachView;
    public final C0SZU<PowerCell<T>, T> child;
    public boolean isLifecycleObserved;
    public boolean isPreloading;
    public boolean isResumed;
    public boolean isUnBind;
    public T item;
    public final LifecycleRegistry lifecycleRegistry;
    public LifecycleOwner parent;
    public View preloadView;
    public C0SZS<PowerCell<T>, T> proxy;
    public InterfaceC1906710ziX stub;
    public final PowerCell<T> vmReceiver;

    public static /* synthetic */ void getStub$annotations() {
    }

    private final void moveToResumeState() {
        this.isResumed = true;
        int i = C480440Isk.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i == 1) {
            dispatchStart();
            dispatchResume(false);
        } else {
            if (i != 2) {
                return;
            }
            dispatchResume(false);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    public int getLayoutId() {
        return 0;
    }

    public void onBindItemView(T t, List<? extends Object> list) {
    }

    @Override // X.InterfaceC1906750zib
    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onItemViewCreated() {
    }

    public void onItemViewCreated(Object obj) {
    }

    @Override // X.InterfaceC1906750zib
    public void onPause() {
    }

    public void onPreload() {
    }

    @Override // X.InterfaceC1906750zib
    public void onResume(boolean z) {
    }

    @Override // X.InterfaceC1906750zib
    public void onStart() {
    }

    @Override // X.InterfaceC1906750zib
    public void onStop() {
    }

    public void onVMSubscribeForReusedReceiver() {
    }

    public void unBind() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerCell() {
        this((View) C20605015k0.LIZJ.getValue());
        C20605015k0 c20605015k0 = C20605015k0.LIZ;
        if (!C20605015k0.LIZLLL) {
            synchronized (c20605015k0) {
                try {
                    if (!C20605015k0.LIZLLL) {
                        Application application = PowerContextImpl.createIPowerContextbyMonsterPlugin(false).getApplication();
                        if (application != null) {
                            C20605015k0.LIZIZ = application;
                        }
                        C20605015k0.LIZLLL = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void detachFromHost$powerlist_release() {
        Lifecycle lifecycle;
        if (this.isLifecycleObserved) {
            LifecycleOwner parent = getParent();
            if (parent != null && (lifecycle = parent.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            this.isLifecycleObserved = false;
        }
        setParent(null);
        this.adapterManager = null;
        this.attachView = null;
        this.stub = null;
    }

    public void dispatchPause() {
        if (this.isResumed) {
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            onPause();
        }
    }

    public void dispatchStart() {
        if (this.isResumed) {
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
            onStart();
        }
    }

    public void dispatchStop() {
        if (this.isResumed) {
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            onStop();
        }
    }

    public final AbstractC1906720ziY getChunk() {
        AbstractC1906720ziY abstractC1906720ziYLJIIJJI;
        InterfaceC1906710ziX interfaceC1906710ziX = this.stub;
        if (interfaceC1906710ziX == null || (abstractC1906720ziYLJIIJJI = interfaceC1906710ziX.LJIIJJI()) == null || !(!(abstractC1906720ziYLJIIJJI instanceof C20605915k9))) {
            return null;
        }
        return abstractC1906720ziYLJIIJJI;
    }

    @Override // X.C03K6
    public Context getContext() {
        return this.itemView.getContext();
    }

    public final C19EG getCurrentActivity() {
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null) {
            return interfaceC20603815jo.getCurrentActivity();
        }
        return null;
    }

    public final Fragment getCurrentFragment() {
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null) {
            return interfaceC20603815jo.getCurrentFragment();
        }
        return null;
    }

    public final LifecycleOwner getCurrentLifecycleOwner() {
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null) {
            return interfaceC20603815jo.getLifecycleOwner();
        }
        return null;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return new ViewModelProvider.NewInstanceFactory();
    }

    public final int getItemCount() {
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null) {
            return interfaceC20603815jo.getItemCount();
        }
        return 0;
    }

    public final void tryObserveLifecycle() {
        Lifecycle lifecycle;
        if (this.isLifecycleObserved) {
            return;
        }
        LifecycleOwner parent = getParent();
        if (parent != null && (lifecycle = parent.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.isLifecycleObserved = true;
    }

    public final void unBindViewHolder$powerlist_release() {
        if (this.isUnBind) {
            return;
        }
        this.isUnBind = true;
        unBind();
    }

    private final void moveToResume() {
        tryObserveLifecycle();
        moveToResumeState();
    }

    private final void moveToStopState() {
        int i = C480440Isk.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i == 1 || i == 2) {
            dispatchStop();
        } else if (i == 3) {
            dispatchPause();
            dispatchStop();
        }
        this.isResumed = false;
    }

    public void dispatchCreate() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        onCreate();
    }

    public void dispatchDestroy() {
        Lifecycle lifecycle;
        moveToStopState();
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        LifecycleOwner parent = getParent();
        if (parent != null && (lifecycle = parent.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        onDestroy();
    }

    /* JADX WARN: Incorrect return type in method signature: <T::LX/0DHd;>()TT; */
    @InterfaceC1294060jmO
    public final InterfaceC336510DHd getControl() {
        if (getStub() == null) {
            return null;
        }
        Intrinsics.LJIILIIL();
        throw null;
    }

    @Override // X.C03K6
    public LifecycleOwner getCurrentLifeCycleOwner() {
        return getCurrentLifecycleOwner();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public void onViewAttachedToWindow() {
        moveToResumeState();
        tryObserveLifecycle();
    }

    private final void moveToStop() {
        moveToStopState();
    }

    public final InterfaceC20603815jo getAdapterManager$powerlist_release() {
        return this.adapterManager;
    }

    public final RecyclerView getAttachView$powerlist_release() {
        return this.attachView;
    }

    public C0SZU<PowerCell<T>, T> getChild() {
        return this.child;
    }

    public final T getItem() {
        return this.item;
    }

    @Override // X.InterfaceC1906740zia
    public LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    public LifecycleOwner getParent() {
        return this.parent;
    }

    public final View getPreloadView() {
        return this.preloadView;
    }

    @Override // X.C0SMO
    public C0SZS<PowerCell<T>, T> getProxy() {
        return this.proxy;
    }

    public final InterfaceC1906710ziX getStub() {
        return this.stub;
    }

    public final boolean isPreloading() {
        return this.isPreloading;
    }

    public final boolean isResumed$powerlist_release() {
        return this.isResumed;
    }

    public void onViewDetachedFromWindow() {
        moveToStopState();
    }

    public PowerCell<T> getVmReceiver() {
        return this.vmReceiver;
    }

    public PowerCell(View view) {
        super(view);
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.vmReceiver = this;
    }

    public final void bindItem$powerlist_release(T t) {
        this.item = t;
    }

    public void dispatchResume(boolean z) {
        if (!this.isResumed) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        onResume(z);
    }

    public void onBindItemView(T t) {
        onBindItemView(t, C13BV.INSTANCE);
    }

    public View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView;
        Integer numValueOf = Integer.valueOf(getLayoutId());
        if (numValueOf.intValue() != 0 && (viewInflateItemView = inflateItemView(viewGroup, numValueOf.intValue(), this.isPreloading)) != null) {
            return viewInflateItemView;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateItemView layoutId is invalid, class name: ");
        sbLIZ.append(getClass().getName());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setAdapterManager$powerlist_release(InterfaceC20603815jo interfaceC20603815jo) {
        this.adapterManager = interfaceC20603815jo;
    }

    public final void setAttachView$powerlist_release(RecyclerView recyclerView) {
        this.attachView = recyclerView;
    }

    public final void setItem(T t) {
        this.item = t;
    }

    public void setParent(LifecycleOwner lifecycleOwner) {
        this.parent = lifecycleOwner;
    }

    public final void setPreloadView(View view) {
        this.preloadView = view;
    }

    public final void setPreloading(boolean z) {
        this.isPreloading = z;
    }

    @Override // X.C0SMO
    public void setProxy(C0SZS<PowerCell<T>, T> c0szs) {
        this.proxy = c0szs;
    }

    public final void setResumed$powerlist_release(boolean z) {
        this.isResumed = z;
    }

    public final void setStub(InterfaceC1906710ziX interfaceC1906710ziX) {
        this.stub = interfaceC1906710ziX;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;Landroidx/lifecycle/ViewModelProvider$Factory;)TT; */
    @Override // X.C06LL
    public ViewModel getActivityViewModel(Class cls, ViewModelProvider.Factory factory) {
        C19EG currentActivity;
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null && (currentActivity = interfaceC20603815jo.getCurrentActivity()) != null) {
            return ViewModelProviders.of(currentActivity, factory).get(cls);
        }
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;Landroidx/lifecycle/ViewModelProvider$Factory;)TT; */
    @Override // X.C06LL
    public ViewModel getFragmentViewModel(Class cls, ViewModelProvider.Factory factory) {
        Fragment currentFragment;
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null && (currentFragment = interfaceC20603815jo.getCurrentFragment()) != null) {
            return ViewModelProviders.of(currentFragment, factory).get(cls);
        }
        return null;
    }

    public final void onBindViewHolder(T t, List<? extends Object> list) {
        this.isUnBind = false;
        moveToStopState();
        moveToResume();
        if (t == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            onBindItemView(t, list);
        } else {
            onBindItemView(t);
        }
    }

    public View onCreateItemView(ViewGroup viewGroup, int i) {
        View view = this.preloadView;
        if (view == null) {
            return onCreateItemView(viewGroup);
        }
        return view;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (C480440Isk.LIZ[event.ordinal()]) {
            case 1:
                dispatchCreate();
                break;
            case 2:
                dispatchStart();
                break;
            case 3:
                dispatchResume(true);
                break;
            case 4:
                dispatchPause();
                break;
            case 5:
                dispatchStop();
                break;
            case 6:
                dispatchDestroy();
                break;
        }
    }

    public final View inflateItemView(ViewGroup viewGroup, int i, boolean z) {
        Context contextLIZIZ;
        LayoutInflater layoutInflaterNe;
        C20603715jn c20603715jnLLILZLL;
        C20603715jn c20603715jnLLILZLL2;
        InterfaceC20603815jo interfaceC20603815jo = this.adapterManager;
        if (interfaceC20603815jo != null && (c20603715jnLLILZLL2 = interfaceC20603815jo.LLILZLL()) != null && c20603715jnLLILZLL2.LJI) {
            C19EG c19egLIZIZ = C2493909px.LIZIZ(viewGroup.getContext());
            if (c19egLIZIZ instanceof Activity) {
                C710340Rtg.LIZ(i);
                View viewLIZJ = C20673215v0.LIZJ(i, c19egLIZIZ);
                if (!C20673215v0.LIZ(i, c19egLIZIZ)) {
                    C20673215v0.LJI(i, c19egLIZIZ);
                }
                return viewLIZJ;
            }
            "context is not an Activity??".toString();
            throw new IllegalStateException("context is not an Activity??");
        }
        InterfaceC20603815jo interfaceC20603815jo2 = this.adapterManager;
        if (interfaceC20603815jo2 != null && (c20603715jnLLILZLL = interfaceC20603815jo2.LLILZLL()) != null && c20603715jnLLILZLL.LJIIZILJ) {
            contextLIZIZ = viewGroup.getContext();
        } else {
            contextLIZIZ = C2493909px.LIZIZ(viewGroup.getContext());
        }
        if (z) {
            layoutInflaterNe = C786410Ut5.ne(contextLIZIZ).cloneInContext(contextLIZIZ);
        } else {
            layoutInflaterNe = C786410Ut5.ne(contextLIZIZ);
        }
        return C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false);
    }

    public static /* synthetic */ View inflateItemView$default(PowerCell powerCell, ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z = false;
            }
            return powerCell.inflateItemView(viewGroup, i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inflateItemView");
    }
}
