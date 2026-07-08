package com.bytedance.ies.sdk.widgets;

import X.AbstractC813200VvC;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C18L3;
import X.C19EG;
import X.C19EH;
import X.C786410Ut5;
import X.InterfaceC487670JAn;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes30.dex */
public class WidgetManager extends Fragment {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyEnZzHELIOSg6LCIpPTx9HywoLionBSQiKCg2Og==";
    public C18L3 asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.WidgetCallback widgetCallback = new Widget.WidgetCallback() { // from class: com.bytedance.ies.sdk.widgets.WidgetManager.1
        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public Fragment getFragment() {
            return WidgetManager.this;
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ViewModel> T getViewModel(Class<T> cls) {
            WidgetManager widgetManager = WidgetManager.this;
            Fragment fragment = widgetManager.parentFragment;
            if (fragment != null) {
                return (T) ViewModelProviders.of(fragment).get(cls);
            }
            return (T) ViewModelProviders.of(widgetManager.getActivity()).get(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent) throws Throwable {
            INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityFragmentXLancet(WidgetManager.this, intent);
        }

        public static void INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityFragmentXLancet(WidgetManager widgetManager, Intent intent) throws Throwable {
            Intent intent2 = intent;
            Fragment fragment = widgetManager;
            C1701330uNH.LIZ(intent2, fragment);
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYIe+cfZRpMQdZNtKQDg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent2};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", fragment, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", null, objArr, fragment, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                }
            }
            fragment.startActivity(intent2);
            c0wst.LIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", null, objArr, fragment, c0wzw, true);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ViewModel> T getViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
            WidgetManager widgetManager = WidgetManager.this;
            Fragment fragment = widgetManager.parentFragment;
            if (fragment != null) {
                return (T) ViewModelProviders.of(fragment, factory).get(cls);
            }
            return (T) ViewModelProviders.of(widgetManager.getActivity(), factory).get(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent, Bundle bundle) throws Throwable {
            INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityFragmentXLancet(WidgetManager.this, intent, bundle);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i) throws Throwable {
            INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(WidgetManager.this, intent, i);
        }

        public static void INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(WidgetManager widgetManager, Intent intent, int i) throws Throwable {
            Fragment fragment;
            int iIntValue = i;
            Intent intent2 = intent;
            C1701330uNH.LIZ(intent2, widgetManager);
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYIe+cfZRpMQdZNtKQDg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent2, Integer.valueOf(iIntValue)};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", widgetManager, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", null, objArr, widgetManager, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = widgetManager;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                }
            } else {
                fragment = widgetManager;
            }
            fragment.startActivityForResult(intent2, iIntValue);
            c0wst.LIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", null, objArr, fragment, c0wzw, true);
        }

        public static void INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityFragmentXLancet(WidgetManager widgetManager, Intent intent, Bundle bundle) throws Throwable {
            Bundle bundle2;
            Fragment fragment;
            Intent intent2 = intent;
            C1701330uNH.LIZ(intent2, widgetManager);
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYIe+cfZRpMQdZNtKQDg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent2, bundle};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", widgetManager, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", null, objArr, widgetManager, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = widgetManager;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    bundle2 = (Bundle) obj3;
                } else {
                    bundle2 = bundle;
                }
            } else {
                bundle2 = bundle;
                fragment = widgetManager;
            }
            fragment.startActivity(intent2, bundle2);
            c0wst.LIZ(11088, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivity", null, objArr, fragment, c0wzw, true);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i, Bundle bundle) throws Throwable {
            INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragmentX(WidgetManager.this, intent, i, bundle);
        }

        public static void INVOKEVIRTUAL_com_bytedance_ies_sdk_widgets_WidgetManager$1_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragmentX(WidgetManager widgetManager, Intent intent, int i, Bundle bundle) throws Throwable {
            Bundle bundle2;
            Fragment fragment;
            int iIntValue = i;
            Intent intent2 = intent;
            C1701330uNH.LIZ(intent2, widgetManager);
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYIe+cfZRpMQdZNtKQDg==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent2, Integer.valueOf(iIntValue), bundle};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", widgetManager, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", null, objArr, widgetManager, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = widgetManager;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                }
                Object obj4 = c0wsuLIZIZ.LIZJ[3];
                if (obj4 != null) {
                    bundle2 = (Bundle) obj4;
                } else {
                    bundle2 = bundle;
                }
            } else {
                bundle2 = bundle;
                fragment = widgetManager;
            }
            fragment.startActivityForResult(intent2, iIntValue, bundle2);
            c0wst.LIZ(11087, "com/bytedance/ies/sdk/widgets/WidgetManager", "startActivityForResult", null, objArr, fragment, c0wzw, true);
        }
    };
    public List<Widget> widgets = new CopyOnWriteArrayList();
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public AbstractC813200VvC parentDestroyedCallback = new AbstractC813200VvC() { // from class: com.bytedance.ies.sdk.widgets.WidgetManager.2
        @Override // X.AbstractC813200VvC
        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            WidgetManager widgetManager = WidgetManager.this;
            if (fragment == widgetManager.parentFragment) {
                fragmentManager.LLIILZL(widgetManager.parentDestroyedCallback);
                C19EH c19ehLJIIJ = fragment.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIIZILJ(WidgetManager.this);
                c19ehLJIIJ.LJIIL();
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.ies.sdk.widgets.WidgetManager$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            $SwitchMap$android$arch$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.DESTROYED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.RESUMED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        this.widgets.add(widget);
        getLifecycle().addObserver(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Widget> it2 = this.widgets.iterator();
        while (it2.hasNext()) {
            it2.next().onConfigurationChanged(configuration);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
        Iterator<Widget> it2 = this.widgets.iterator();
        while (it2.hasNext()) {
            it2.next().dataCenter = dataCenter;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        if (widget == null) {
            return this;
        }
        getLifecycle().removeObserver(widget);
        if (widget.isViewValid) {
            int i = AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State[getLifecycle().getCurrentState().ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            widget.onPause();
                            widget.onStop();
                            widget.onDestroy();
                        }
                    } else {
                        widget.onStop();
                        widget.onDestroy();
                    }
                } else {
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        widget.containerView = null;
        widget.context = null;
        widget.widgetCallback = null;
        widget.dataCenter = null;
        this.widgets.remove(widget);
        if (this.widgetViewGroupHashMap.containsKey(widget)) {
            C786410Ut5.LJJJJI(this.widgetViewGroupHashMap.get(widget));
            this.widgetViewGroupHashMap.remove(widget);
        }
        return this;
    }

    public static WidgetManager of(Fragment fragment, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment, view, fragment.getContext());
        return widgetManager;
    }

    public WidgetManager load(int i, Widget widget) {
        load(i, widget, true);
        return this;
    }

    public static WidgetManager of(C19EG c19eg, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(c19eg, null, view, c19eg);
        return widgetManager;
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        if (widget.containerView == null) {
            return;
        }
        widget.contentView = view;
        if (viewGroup != null && view != null) {
            viewGroup.addView(view);
        }
        this.widgets.add(widget);
        getLifecycle().addObserver(widget);
    }

    public WidgetManager load(int i, final Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        final ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoad(widget, viewGroup, null);
            return this;
        }
        if (z) {
            this.asyncLayoutInflater.LIZ(widget.getLayoutId(), viewGroup, new InterfaceC487670JAn() { // from class: X.11Wv
                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                    this.LIZ.lambda$load$0(widget, viewGroup, view, i2, viewGroup2);
                }
            });
            return this;
        }
        continueLoad(widget, viewGroup, C786410Ut5.Td(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false));
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<Widget> it2 = this.widgets.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }

    public void config(C19EG c19eg, Fragment fragment, View view, Context context) {
        FragmentManager childFragmentManager;
        if (this.configured) {
            return;
        }
        if (c19eg != null) {
            childFragmentManager = c19eg.getSupportFragmentManager();
        } else if (fragment == null) {
            return;
        } else {
            childFragmentManager = fragment.getChildFragmentManager();
        }
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.asyncLayoutInflater = new C18L3(context);
        this.syncLayoutInflater = C786410Ut5.ne(context);
        if (fragment != null && fragment.getFragmentManager() != null) {
            fragment.getFragmentManager().LJZL(this.parentDestroyedCallback, false);
        }
        C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
        c19ehLJIIJ.LIZLLL(this, TAG);
        c19ehLJIIJ.LJIIL();
        this.configured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoad(widget, viewGroup, view);
        }
    }
}
