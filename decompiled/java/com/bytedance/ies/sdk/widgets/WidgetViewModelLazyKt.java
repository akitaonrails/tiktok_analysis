package com.bytedance.ies.sdk.widgets;

import X.AbstractC813200VvC;
import X.C01GW;
import X.C09R7;
import X.C1124140fMK;
import X.C13IQ;
import X.C19EG;
import X.C2188811AlT;
import X.C294780Bgy;
import X.C786410Ut5;
import X.C903300Zc8;
import X.EnumC494740Jai;
import X.InterfaceC1097170eep;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class WidgetViewModelLazyKt {
    public static final Fragment fragmentFinder(LifecycleOwner lifecycleOwner) {
        InterfaceC1097170eep interfaceC1097170eep;
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if ((lifecycleOwner instanceof C19EG) || !(lifecycleOwner instanceof com.bytedance.android.widget.Widget) || (interfaceC1097170eep = ((com.bytedance.android.widget.Widget) lifecycleOwner).widgetCallback) == null) {
            return null;
        }
        return interfaceC1097170eep.getFragment();
    }

    public static final ViewModelProvider.Factory getDefaultViewModelProviderFactory(LiveRecyclableWidget liveRecyclableWidget) {
        return new ViewModelProvider.NewInstanceFactory();
    }

    public static final Function0<ViewModelProvider.Factory> getDefaultViewModelProviderFactoryProducer(LiveRecyclableWidget liveRecyclableWidget) {
        return new AwS551S0100000_7(liveRecyclableWidget, 121);
    }

    public static final <VM extends LiveWidgetViewModel, T extends LiveRecyclableWidget> C01GW<VM> provideViewModelDelegate(final T t, final C13IQ<VM> c13iq, final EnumC494740Jai enumC494740Jai, final Function0<String> function0, final Function0<? extends ViewModelProvider.Factory> function02, final boolean z) {
        return (C01GW<VM>) new C01GW<VM>() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt.provideViewModelDelegate.1

            /* JADX INFO: Incorrect field signature: TVM; */
            public LiveWidgetViewModel cached;

            /* JADX INFO: renamed from: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC494740Jai.values().length];
                    try {
                        iArr[EnumC494740Jai.ROOT_CONTAINER.ordinal()] = 1;
                    } catch (NoSuchFieldError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        iArr[EnumC494740Jai.FRAGMENT.ordinal()] = 2;
                    } catch (NoSuchFieldError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    try {
                        iArr[EnumC494740Jai.WIDGET.ordinal()] = 3;
                    } catch (NoSuchFieldError e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            @Override // X.C01GW
            public LiveWidgetViewModel getValue() {
                LiveWidgetViewModel liveWidgetViewModel = this.cached;
                return liveWidgetViewModel != null ? liveWidgetViewModel : newViewModel();
            }

            @Override // X.C01GW
            public boolean isInitialized() {
                return this.cached != null;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            /* JADX WARN: Multi-variable type inference failed */
            public final LiveWidgetViewModel newViewModel() {
                final ViewModelStore viewModelStore;
                ViewModelProvider.Factory newInstanceFactory;
                LiveWidgetViewModel liveWidgetViewModel;
                ViewModelProvider.Factory newInstanceFactory2;
                ViewModelStoreOwner viewModelStoreOwnerLIZ;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                final ViewModelStore viewModelStore2;
                ViewModelProvider.Factory defaultViewModelProviderFactory2;
                EnumC494740Jai enumC494740Jai2 = enumC494740Jai;
                int i = enumC494740Jai2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC494740Jai2.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        Fragment fragment = t.widgetCallback.getFragment();
                        Context context = fragment.getContext();
                        ComponentCallbacks2 componentCallbacks2LJFF = context != null ? SAFExtensionKt.LJFF(context) : null;
                        if (!C294780Bgy.LIZ() ? !((componentCallbacks2LJFF instanceof InterfaceC214897198d) && ((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                            while (true) {
                                if (!(fragment instanceof InterfaceC214902198i)) {
                                    fragment = fragment.getParentFragment();
                                    if (fragment == 0) {
                                        break;
                                    }
                                } else {
                                    Object obj = (InterfaceC214902198i) fragment;
                                    if (obj != null) {
                                        viewModelStoreOwnerLIZ = (Fragment) obj;
                                    }
                                }
                            }
                        } else {
                            viewModelStoreOwnerLIZ = C1124140fMK.LIZ(t.context);
                            if (viewModelStoreOwnerLIZ == null) {
                                return null;
                            }
                        }
                        ViewModelStore viewModelStore3 = viewModelStoreOwnerLIZ.getViewModelStore();
                        Function0<ViewModelProvider.Factory> function03 = function02;
                        if (function03 == null || (defaultViewModelProviderFactory = function03.invoke()) == null) {
                            defaultViewModelProviderFactory = WidgetViewModelLazyKt.getDefaultViewModelProviderFactory(t);
                        }
                        LiveWidgetViewModel liveWidgetViewModel2 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore3, defaultViewModelProviderFactory, C903300Zc8.LIZJ).get(function0.invoke(), C09R7.LIZ(c13iq));
                        liveWidgetViewModel2.setDataChannel(t.dataChannel);
                        return liveWidgetViewModel2;
                    }
                    if (i == 2) {
                        InterfaceC1097170eep interfaceC1097170eep = t.widgetCallback;
                        if (interfaceC1097170eep == null) {
                            return null;
                        }
                        Fragment fragment2 = interfaceC1097170eep.getFragment();
                        if (fragment2 == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        try {
                            viewModelStore2 = fragment2.getViewModelStore();
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            viewModelStore2 = new ViewModelStore();
                            FragmentManager fragmentManager = fragment2.getFragmentManager();
                            if (fragmentManager != null) {
                                fragmentManager.LJZL(new AbstractC813200VvC() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1$newViewModel$store$1
                                    @Override // X.AbstractC813200VvC
                                    public void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment3) {
                                        super.onFragmentDestroyed(fragmentManager2, fragment3);
                                        viewModelStore2.clear();
                                    }
                                }, false);
                            }
                        }
                        Function0<ViewModelProvider.Factory> function04 = function02;
                        if (function04 == null || (defaultViewModelProviderFactory2 = function04.invoke()) == null) {
                            defaultViewModelProviderFactory2 = WidgetViewModelLazyKt.getDefaultViewModelProviderFactory(t);
                        }
                        LiveWidgetViewModel liveWidgetViewModel3 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore2, defaultViewModelProviderFactory2, C903300Zc8.LIZJ).get(function0.invoke(), C09R7.LIZ(c13iq));
                        liveWidgetViewModel3.setDataChannel(t.dataChannel);
                        return liveWidgetViewModel3;
                    }
                    if (i != 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Don't support this VMScope: ");
                        sbLIZ.append(enumC494740Jai);
                        sbLIZ.append(" there");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                InterfaceC1097170eep interfaceC1097170eep2 = t.widgetCallback;
                if (interfaceC1097170eep2 == null) {
                    return null;
                }
                Fragment fragment3 = interfaceC1097170eep2.getFragment();
                if (fragment3 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                try {
                    viewModelStore = fragment3.getViewModelStore();
                } catch (IllegalStateException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    viewModelStore = new ViewModelStore();
                    FragmentManager fragmentManager2 = fragment3.getFragmentManager();
                    if (fragmentManager2 != null) {
                        fragmentManager2.LJZL(new AbstractC813200VvC() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1$newViewModel$store$2
                            @Override // X.AbstractC813200VvC
                            public void onFragmentDestroyed(FragmentManager fragmentManager3, Fragment fragment4) {
                                super.onFragmentDestroyed(fragmentManager3, fragment4);
                                viewModelStore.clear();
                            }
                        }, false);
                    }
                }
                if (z) {
                    Looper.getMainLooper().getThread();
                    C786410Ut5.u3();
                    Function0<ViewModelProvider.Factory> function05 = function02;
                    if (function05 == null || (newInstanceFactory2 = function05.invoke()) == null) {
                        newInstanceFactory2 = new ViewModelProvider.NewInstanceFactory();
                    }
                    LiveWidgetViewModel liveWidgetViewModel4 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore, newInstanceFactory2, C903300Zc8.LIZJ).get("widget_" + c13iq.LJI() + '_' + t.widgetCallback.getRootLifeCycleOwner().hashCode(), C09R7.LIZ(c13iq));
                    liveWidgetViewModel4.setDataChannel(t.dataChannel);
                    return liveWidgetViewModel4;
                }
                Function0<ViewModelProvider.Factory> function06 = function02;
                C13IQ<VM> c13iq2 = c13iq;
                LiveRecyclableWidget liveRecyclableWidget = t;
                synchronized (viewModelStore) {
                    try {
                        if (function06 == null || (newInstanceFactory = function06.invoke()) == null) {
                            newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
                        }
                        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, newInstanceFactory, C903300Zc8.LIZJ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("widget_");
                        sbLIZ2.append(c13iq2.LJI());
                        sbLIZ2.append('_');
                        sbLIZ2.append(liveRecyclableWidget.widgetCallback.getRootLifeCycleOwner().hashCode());
                        liveWidgetViewModel = (LiveWidgetViewModel) viewModelProvider.get(C2188811AlT.LIZIZ(sbLIZ2), C09R7.LIZ(c13iq2));
                        liveWidgetViewModel.setDataChannel(liveRecyclableWidget.dataChannel);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return liveWidgetViewModel;
            }
        };
    }

    public static final /* synthetic */ <VM extends LiveWidgetViewModel, T extends LiveRecyclableWidget> C01GW<VM> widgetViewModel(T t, C13IQ<VM> c13iq, EnumC494740Jai enumC494740Jai, Function0<String> function0, Function0<? extends ViewModelProvider.Factory> function02, boolean z) {
        if (enumC494740Jai == null) {
            enumC494740Jai = EnumC494740Jai.WIDGET;
        }
        if (function02 == null) {
            function02 = getDefaultViewModelProviderFactoryProducer(t);
        }
        return provideViewModelDelegate(t, c13iq, enumC494740Jai, function0, function02, z);
    }

    public static C01GW widgetViewModel$default(LiveRecyclableWidget liveRecyclableWidget, C13IQ c13iq, EnumC494740Jai enumC494740Jai, Function0 function0, Function0 function02, boolean z, int i, Object obj) {
        if ((i & 1) == 0) {
            if ((i & 2) != 0) {
                enumC494740Jai = null;
            }
            if ((i & 4) != 0) {
                function0 = new AwS551S0100000_7(c13iq, 122);
            }
            if ((i & 8) != 0) {
                function02 = null;
            }
            if ((i & 16) != 0) {
                z = WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync();
            }
            if (enumC494740Jai == null) {
                enumC494740Jai = EnumC494740Jai.WIDGET;
            }
            if (function02 == null) {
                function02 = getDefaultViewModelProviderFactoryProducer(liveRecyclableWidget);
            }
            return provideViewModelDelegate(liveRecyclableWidget, c13iq, enumC494740Jai, function0, function02, z);
        }
        Intrinsics.LJIILIIL();
        throw null;
    }
}
