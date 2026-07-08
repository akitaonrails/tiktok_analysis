package com.bytedance.scene;

import X.C0J4M;
import X.C0T3U;
import X.C0WZX;
import X.C128Y;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19506611Tk;
import X.C197065128h;
import X.C197066128i;
import X.C197069128l;
import X.C19BK;
import X.C19BL;
import X.C19FR;
import X.C20097313kJ;
import X.C214826195k;
import X.C214928199i;
import X.C214937199r;
import X.C21494919Ad;
import X.C21495419Ai;
import X.C21498819Bq;
import X.C21499019Bs;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC214943199x;
import X.EnumC335920DEw;
import X.InterfaceC21498919Br;
import Y.ARunnableS97S0200000_28;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class Scene implements LifecycleOwner, C128Y, ViewModelStoreOwner {
    public static final String SCENE_SERVICE = "scene";
    public Context LL;
    public LayoutInflater LLILLJJLI;
    public C214937199r LLILLL;
    public final StringBuilder LLILZ;
    public final List<Runnable> LLILZIL;
    public boolean LLILZLL;
    public volatile C19506611Tk LLIZ;
    public C197065128h LLIZLLLIL;
    public final boolean LLJ;
    public Activity mActivity;
    public Bundle mArguments;
    public boolean mCalled;
    public long mDestroyTime;
    public Scene mParentScene;
    public InterfaceC21498919Br mRootScopeFactory = C214937199r.LJI;
    public boolean mSceneRestoreEnabled;
    public EnumC214943199x mState;
    public int mThemeResource;
    public View mView;
    public volatile boolean mViewDestroyed;

    public boolean LLJJJ() {
        return true;
    }

    public boolean LLJJJJ() {
        return false;
    }

    public void LLJJL(boolean z) {
    }

    public final void disableSceneRestore() {
        this.mSceneRestoreEnabled = false;
    }

    public void dispatchDetachScene() {
        this.mParentScene = null;
    }

    public void dispatchResume() {
        this.mCalled = false;
        dispatchOnPreSceneResumed(this, false);
        onResume();
        if (!this.mCalled) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene ");
            sbLIZ.append(LLJLIL());
            sbLIZ.append(" did not call through to super.onResume()");
            throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
        }
        dispatchOnSceneResumed(this, false);
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.RESUMED);
        if (this.LLIZ != null) {
            this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    public void dispatchStart() {
        this.mCalled = false;
        dispatchOnPreSceneStarted(this, false);
        onStart();
        if (!this.mCalled) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene ");
            sbLIZ.append(LLJLIL());
            sbLIZ.append(" did not call through to super.onStart()");
            throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
        }
        dispatchOnSceneStarted(this, false);
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.STARTED);
        boolean zIsVisible = isVisible();
        if (zIsVisible != this.LLILZLL) {
            this.LLILZLL = zIsVisible;
            LLJJL(zIsVisible);
        }
        if (this.LLIZ != null) {
            this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore;
        synchronized (this) {
            try {
                C214937199r scope = getScope();
                C21495419Ai c21495419Ai = (C21495419Ai) scope.LJFF(C21495419Ai.class);
                if (c21495419Ai != null) {
                    Class<? extends Scene> cls = c21495419Ai.LIZIZ;
                    if (this.LLJ && cls != null && cls != getClass()) {
                        C0T3U.LIZ(new ARunnableS97S0200000_28(this, (Class) cls, 6));
                    }
                } else {
                    c21495419Ai = new C21495419Ai(new ViewModelStore(), getClass());
                    scope.LJII(C21495419Ai.class, c21495419Ai);
                }
                viewModelStore = c21495419Ai.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return viewModelStore;
    }

    public void onAttach() {
        this.mCalled = true;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
        this.mCalled = true;
        dispatchOnSuperSceneDestroyed(this, false);
    }

    public void onDestroyView() {
        this.mCalled = true;
        dispatchOnSuperSceneViewDestroyed(this, false);
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
        dispatchOnSuperScenePaused(this, false);
    }

    public void onResume() {
        this.mCalled = true;
        dispatchOnSuperSceneResumed(this, false);
        if (((ArrayList) this.LLILZIL).size() > 0) {
            ArrayList arrayList = new ArrayList(this.LLILZIL);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            ((ArrayList) this.LLILZIL).removeAll(arrayList);
        }
    }

    public void onStart() {
        this.mCalled = true;
        dispatchOnSuperSceneStarted(this, false);
    }

    public void onStop() {
        this.mCalled = true;
        dispatchOnSuperSceneStopped(this, false);
        boolean zIsVisible = isVisible();
        if (zIsVisible != this.LLILZLL) {
            this.LLILZLL = zIsVisible;
            LLJJL(zIsVisible);
        }
    }

    public final void setTheme(int i) {
        com_bytedance_scene_Scene_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setSceneTheme(this, i);
    }

    public final C19506611Tk LLJJIJIL() {
        C19506611Tk c19506611Tk;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    if (!LLJJJ()) {
                        throw new C214826195k("Scene initLifecycleIfNeeded when isLifecycleAndSavedStateRegistryEnabled false");
                    }
                    C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this);
                    sbLIZ.append(" create LifecycleRegistry");
                    c21494919Ad.LIZIZ("Scene", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLIZ = new C19506611Tk(new LifecycleRegistry(this));
                }
                c19506611Tk = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c19506611Tk;
    }

    public LayoutInflater LLJJJJJIL() {
        if (this.mActivity != null) {
            return new C0J4M(requireActivity(), this);
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
    }

    public final String LLJLIL() {
        StringBuilder sb = new StringBuilder(128);
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null || canonicalName.length() <= 0) {
            canonicalName = getClass().getName();
        }
        sb.append(canonicalName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    public void dispatchDestroy() {
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.NONE);
        this.mDestroyTime = System.currentTimeMillis();
        this.mCalled = false;
        dispatchOnPreSceneDestroyed(this, false);
        onDestroy();
        if (this.mCalled) {
            dispatchOnSceneDestroyed(this, false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onDestroy()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void dispatchDestroyView() {
        ViewParent parent;
        View view = this.mView;
        if (C21499019Bs.LIZ == 0) {
            try {
                C21499019Bs.LIZ = 2;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("cancelTouchTarget", View.class);
                C21499019Bs.LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
                C21499019Bs.LIZ = 1;
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C21499019Bs.LIZ == 1 && (parent = view.getParent()) != null) {
            try {
                C2204961BRm.a0(C21499019Bs.LIZIZ, parent, new Object[]{view}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1Op23VEcPEAWY7FyFtpP14T7fJZTg=", null));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        this.mViewDestroyed = true;
        if (this.LLIZ != null) {
            this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.CREATED);
        this.mCalled = false;
        dispatchOnPreSceneViewDestroyed(this, false);
        onDestroyView();
        if (this.mCalled) {
            dispatchOnSceneViewDestroyed(this, false);
            this.mView.cancelPendingInputEvents();
            this.mView = null;
            this.LLILLJJLI = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onDestroyView()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void dispatchDetachActivity() {
        Activity activity = this.mActivity;
        this.mActivity = null;
        this.LL = null;
        this.mCalled = false;
        onDetach();
        if (this.mCalled) {
            if (!activity.isChangingConfigurations()) {
                this.LLILLL.LIZIZ();
            }
            this.LLILLL = null;
            ((ArrayList) this.LLILZIL).clear();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onDetach()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void dispatchPause() {
        if (this.LLIZ != null) {
            this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.STARTED);
        this.mCalled = false;
        dispatchOnPreScenePaused(this, false);
        onPause();
        if (this.mCalled) {
            dispatchOnScenePaused(this, false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onPause()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void dispatchStop() {
        if (this.LLIZ != null) {
            this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        LLJJLIIIJLLLLLLLZ(EnumC214943199x.ACTIVITY_CREATED);
        this.mCalled = false;
        dispatchOnPreSceneStopped(this, false);
        onStop();
        if (this.mCalled) {
            dispatchOnSceneStopped(this, false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onStop()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Context getApplicationContext() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return null;
        }
        return C786410Ut5.L3(activity);
    }

    public final String getDebugSceneHierarchy() {
        StringBuilder sb = new StringBuilder();
        C19BL.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = LLJJJJJIL();
        }
        return this.LLILLJJLI;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        if (LLJJJ()) {
            return LLJJIJIL();
        }
        throw new IllegalStateException("Scene disable getLifecycle()");
    }

    public final int getLifecycleObserverCount() {
        return ((ArrayList) this.LLIZ.LLILLJJLI).size();
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        C197065128h c197065128h = this.LLIZLLLIL;
        if (c197065128h != null) {
            return c197065128h.LIZIZ;
        }
        if (LLJJJ()) {
            throw new IllegalStateException("SavedStateRegistry is not created, you can't call before onCreate");
        }
        throw new IllegalStateException("Scene disable SavedStateRegistry");
    }

    public final Context getSceneContext() {
        if (this.mActivity == null) {
            return null;
        }
        if (this.LL == null) {
            this.LL = onGetSceneContext();
        }
        return this.LL;
    }

    public final C214937199r getScope() {
        C214937199r c214937199r = this.LLILLL;
        if (c214937199r != null) {
            return c214937199r;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    public final String getStateHistory() {
        return this.LLILZ.toString();
    }

    public boolean isVisible() {
        return this.mState.value >= EnumC214943199x.STARTED.value;
    }

    public Context onGetSceneContext() {
        if (this.mActivity == null) {
            throw new IllegalStateException("onGetContextThemeWrapper() cannot be executed until the Scene is attached to the Activity.");
        }
        if (this.mThemeResource > 0) {
            final Activity activity = this.mActivity;
            final int i = this.mThemeResource;
            return new C19FR(activity, i) { // from class: X.19FQ
                @Override // X.C19FR, android.content.ContextWrapper
                public final void attachBaseContext(Context context) {
                    if (NxRewordManager.LJIILIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("attachBaseContextWrapper: ");
                        sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
                        C2188811AlT.LIZIZ(sbLIZ);
                        context = new C817700W5w(context, false);
                    }
                    super.attachBaseContext(context);
                }

                @Override // X.C19FR, android.content.ContextWrapper, android.content.Context
                public final Object getSystemService(String str) {
                    if (Scene.SCENE_SERVICE.equals(str)) {
                        return this.LJFF;
                    }
                    if ("layout_inflater".equals(str)) {
                        Scene scene = this.LJFF;
                        if (scene.mActivity != null) {
                            return scene.getLayoutInflater();
                        }
                    }
                    return super.getSystemService(str);
                }
            };
        }
        final Activity activity2 = this.mActivity;
        final Resources.Theme theme = activity2.getTheme();
        return new C19FR(activity2, theme) { // from class: X.19FP
            @Override // X.C19FR, android.content.ContextWrapper
            public final void attachBaseContext(Context context) {
                if (NxRewordManager.LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContextWrapper: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
                    C2188811AlT.LIZIZ(sbLIZ);
                    context = new C817700W5w(context, false);
                }
                super.attachBaseContext(context);
            }

            @Override // X.C19FR, android.content.ContextWrapper, android.content.Context
            public final Object getSystemService(String str) {
                if (Scene.SCENE_SERVICE.equals(str)) {
                    return this.LJFF;
                }
                if ("layout_inflater".equals(str)) {
                    Scene scene = this.LJFF;
                    if (scene.mActivity != null) {
                        return scene.getLayoutInflater();
                    }
                }
                return super.getSystemService(str);
            }
        };
    }

    public final Activity requireActivity() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" not attached to an activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" does not have any arguments.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Scene requireParentScene() {
        Scene scene = this.mParentScene;
        if (scene != null) {
            return scene;
        }
        if (getApplicationContext() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene ");
            sbLIZ.append(LLJLIL());
            sbLIZ.append(" is not attached to any Scene or host");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Scene ");
        sbLIZ2.append(LLJLIL());
        sbLIZ2.append(" is root Scene, not a child Scene");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    public String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    public Scene() {
        EnumC214943199x enumC214943199x = EnumC214943199x.NONE;
        this.mState = enumC214943199x;
        this.LLILZ = new StringBuilder(enumC214943199x.name);
        this.mSceneRestoreEnabled = true;
        this.LLILZIL = new ArrayList();
        this.mCalled = false;
        this.LLILZLL = false;
        this.mViewDestroyed = false;
        this.mDestroyTime = 0L;
        this.LLJ = C214928199i.LIZ;
    }

    public final Resources getResources() {
        return requireActivity().getResources();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final Context requireApplicationContext() {
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" not attached to a context.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Context requireSceneContext() {
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            return sceneContext;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" not attached to an activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Activity getActivity() {
        return this.mActivity;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final long getDestroyTime() {
        return this.mDestroyTime;
    }

    public final Scene getParentScene() {
        return this.mParentScene;
    }

    public final EnumC214943199x getState() {
        return this.mState;
    }

    public final int getTheme() {
        return this.mThemeResource;
    }

    public final View getView() {
        return this.mView;
    }

    public final boolean isSceneRestoreEnabled() {
        return this.mSceneRestoreEnabled;
    }

    public final boolean isViewDestroyed() {
        return this.mViewDestroyed;
    }

    public final void LLJJLIIIJLLLLLLLZ(EnumC214943199x enumC214943199x) {
        EnumC214943199x enumC214943199x2;
        EnumC214943199x enumC214943199x3 = this.mState;
        int i = enumC214943199x.value;
        int i2 = enumC214943199x3.value;
        if (i > i2) {
            if (enumC214943199x3 != EnumC214943199x.NONE && i - i2 != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cant setState from ");
                sbLIZ.append(enumC214943199x3.name);
                sbLIZ.append(" to ");
                sbLIZ.append(enumC214943199x.name);
                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (i < i2 && ((enumC214943199x3 != (enumC214943199x2 = EnumC214943199x.ACTIVITY_CREATED) || enumC214943199x != EnumC214943199x.NONE) && ((enumC214943199x3 != enumC214943199x2 || enumC214943199x != EnumC214943199x.CREATED) && enumC214943199x != EnumC214943199x.NONE && i - i2 != -1))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cant setState from ");
            sbLIZ2.append(enumC214943199x3.name);
            sbLIZ2.append(" to ");
            sbLIZ2.append(enumC214943199x.name);
            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.mState = enumC214943199x;
        StringBuilder sb = this.LLILZ;
        sb.append(" - ");
        sb.append(enumC214943199x.name);
    }

    public final void com_bytedance_scene_Scene__setTheme$___twin___(int i) {
        if (this.mView == null) {
            if (this.mThemeResource != i) {
                this.mThemeResource = i;
                Context sceneContext = this.LL;
                if (sceneContext != null || (this.mActivity != null && (sceneContext = getSceneContext()) != null)) {
                    sceneContext.setTheme(this.mThemeResource);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("setTheme should be invoked before view is created, the best place is in onCreateView method");
    }

    public void dispatchActivityCreated(Bundle bundle) {
        this.mCalled = false;
        dispatchOnPreSceneActivityCreated(this, bundle, false);
        onActivityCreated(bundle);
        if (this.mCalled) {
            dispatchOnSceneActivityCreated(this, bundle, false);
            if (bundle != null) {
                this.mCalled = false;
                onViewStateRestored(bundle);
                if (!this.mCalled) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scene ");
                    sbLIZ.append(LLJLIL());
                    sbLIZ.append(" did not call through to super.onViewStateRestored()");
                    throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            LLJJLIIIJLLLLLLLZ(EnumC214943199x.ACTIVITY_CREATED);
            if (this.LLIZ != null) {
                this.LLIZ.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Scene ");
        sbLIZ2.append(LLJLIL());
        sbLIZ2.append(" did not call through to super.onActivityCreated()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public void dispatchAttachActivity(Activity activity) {
        this.mActivity = activity;
        if (this.LLIZ == null && LLJJJ()) {
            LLJJIJIL();
        }
        if (this.LLIZ != null && this.LLIZ.getCurrentState() != Lifecycle.State.INITIALIZED) {
            C19506611Tk c19506611Tk = this.LLIZ;
            Iterator it2 = ((ArrayList) c19506611Tk.LLILLJJLI).iterator();
            while (it2.hasNext()) {
                c19506611Tk.LL.removeObserver((LifecycleObserver) it2.next());
            }
            c19506611Tk.LL.markState(Lifecycle.State.INITIALIZED);
            Iterator it3 = ((ArrayList) c19506611Tk.LLILLJJLI).iterator();
            while (it3.hasNext()) {
                c19506611Tk.LL.addObserver((LifecycleObserver) it3.next());
            }
        }
        this.mViewDestroyed = false;
    }

    public void dispatchAttachScene(Scene scene) {
        if (scene != null) {
            this.mParentScene = scene;
        } else {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("This Scene is the root Scene ");
            sbLIZ.append(LLJLIL());
            c21494919Ad.LIZJ("Scene", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.mCalled = false;
        onAttach();
        if (this.mCalled) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Scene ");
        sbLIZ2.append(LLJLIL());
        sbLIZ2.append(" did not call through to super.onAttach()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public void dispatchCreate(Bundle bundle) {
        Scene scene = this.mParentScene;
        if (scene == null) {
            this.LLILLL = this.mRootScopeFactory.IQ();
        } else {
            this.LLILLL = scene.getScope().LIZ(this, bundle);
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.mArguments = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.mCalled = false;
        if (LLJJJ()) {
            C197065128h c197065128hLIZ = C197069128l.LIZ(this);
            this.LLIZLLLIL = c197065128hLIZ;
            c197065128hLIZ.LIZ(bundle);
        }
        dispatchOnPreSceneCreated(this, bundle, false);
        onCreate(bundle);
        if (this.mCalled) {
            dispatchOnSceneCreated(this, bundle, false);
            LLJJLIIIJLLLLLLLZ(EnumC214943199x.CREATED);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene ");
            sbLIZ.append(LLJLIL());
            sbLIZ.append(" did not call through to super.onCreate()");
            throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        this.mCalled = false;
        dispatchOnPreSceneSaveInstanceState(this, bundle, false);
        onSaveInstanceState(bundle);
        if (this.mCalled) {
            C197065128h c197065128h = this.LLIZLLLIL;
            if (c197065128h != null) {
                c197065128h.LIZIZ(bundle);
            }
            dispatchOnSceneSaveInstanceState(this, bundle, false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(LLJLIL());
        sbLIZ.append(" did not call through to super.onSaveInstanceState()");
        throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void executeNowOrScheduleAtNextResume(Runnable runnable) {
        if (this.mState == EnumC214943199x.RESUMED) {
            runnable.run();
        } else {
            ((ArrayList) this.LLILZIL).add(runnable);
        }
    }

    public final <T extends View> T findViewById(int i) {
        View view = this.mView;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public void onActivityCreated(Bundle bundle) {
        View decorView = requireActivity().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & 1024) != 0 || (systemUiVisibility & 512) != 0) {
            C20097313kJ.LIZJ(decorView);
        }
        this.mCalled = true;
        dispatchOnSuperSceneActivityCreated(this, bundle, false);
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        dispatchOnSuperSceneCreated(this, bundle, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mCalled = true;
        dispatchOnSuperSceneSaveInstanceState(this, bundle, false);
        if (this.mArguments != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            C786410Ut5.LJJIIZI(bundle, this.mArguments, "bd-scene-nav:scene_argument");
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        C786410Ut5.LJJJI("bd-scene:scope_key", this.LLILLL.LIZIZ, bundle);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.mView.saveHierarchyState(sparseArray);
        C786410Ut5.LJJJ(bundle, "bd-scene:views", sparseArray);
        View viewFindFocus = this.mView.findFocus();
        if (viewFindFocus != null && viewFindFocus.getId() != -1) {
            bundle.putInt("bd-scene:focusedViewId", viewFindFocus.getId());
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
        if (sparseParcelableArray != null) {
            this.mView.restoreHierarchyState(sparseParcelableArray);
        }
        int i = bundle.getInt("bd-scene:focusedViewId", -1);
        if (i != -1) {
            View viewFindViewById = this.mView.findViewById(i);
            if (viewFindViewById != null) {
                viewFindViewById.requestFocus();
                return;
            }
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Previously focused view reported id ");
            sbLIZ.append(i);
            sbLIZ.append(" during save, but can't be found during restore.");
            c21494919Ad.LIZJ("Scene", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void replaceParentScene(Scene scene) {
        C128Y c128y = this.mParentScene;
        if (c128y != null) {
            if ((c128y instanceof C19BK) && !((C19BK) c128y).isSupportChildReplaceParentScene()) {
                throw new IllegalArgumentException("Current Parent Scene don't support child replace parent Scene");
            }
            if (scene instanceof C19BK) {
                if (((C19BK) scene).isSupportChildReplaceParentScene()) {
                    C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Replace ");
                    sbLIZ.append(toString());
                    sbLIZ.append(" parent Scene to ");
                    sbLIZ.append(scene.toString());
                    c21494919Ad.LIZIZ("Scene", C2188811AlT.LIZIZ(sbLIZ));
                    this.mParentScene = scene;
                    C214937199r c214937199r = this.LLILLL;
                    C214937199r c214937199r2 = scene.LLILLL;
                    ((HashMap) c214937199r.LIZ.LIZLLL).remove(c214937199r.LIZIZ);
                    if (!((HashMap) c214937199r2.LIZLLL).containsKey(c214937199r.LIZIZ)) {
                        ((HashMap) c214937199r2.LIZLLL).put(c214937199r.LIZIZ, c214937199r);
                        c214937199r.LIZ = c214937199r2;
                        return;
                    }
                    throw new C214826195k("Duplicate Scope key");
                }
                throw new IllegalArgumentException("Parent Scene isSupportChildReplaceParentScene is false");
            }
            throw new IllegalArgumentException("Parent Scene must implement SceneParent");
        }
        throw new IllegalStateException("Scene has not created or has destroyed");
    }

    public final <T extends View> T requireViewById(int i) {
        T t = (T) requireView().findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            String resourceName = getResources().getResourceName(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" ");
            sbLIZ.append(resourceName);
            sbLIZ.append(" view not found");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ");
            sbLIZ2.append(i);
            sbLIZ2.append(" view not found");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void setArguments(Bundle bundle) {
        this.mArguments = bundle;
    }

    public final void setRootScopeFactory(InterfaceC21498919Br interfaceC21498919Br) {
        this.mRootScopeFactory = interfaceC21498919Br;
    }

    public static void com_bytedance_scene_Scene_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setSceneTheme(Scene scene, int i) {
        Context sceneContext;
        boolean z;
        scene.com_bytedance_scene_Scene__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s), 0).contains(Integer.valueOf(i)) && (sceneContext = scene.getSceneContext()) != null) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, sceneContext);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, sceneContext);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    sceneContext.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    sceneContext.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    sceneContext.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    sceneContext.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        Context sceneContext2 = scene.getSceneContext();
        if (sceneContext2 != null) {
            EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
            if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
                sceneContext2.getTheme().applyStyle(R.style.a9x, true);
            } else {
                if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                    return;
                }
                sceneContext2.getTheme().applyStyle(R.style.a9y, true);
            }
        }
    }

    public void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        if (this.mView == null) {
            View viewOnCreateView = onCreateView(getLayoutInflater(), viewGroup, bundle);
            if (viewOnCreateView != null) {
                if (!LLJJJJ() && viewOnCreateView.getParent() != null) {
                    throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
                }
                viewOnCreateView.getId();
                Context contextRequireSceneContext = requireSceneContext();
                Context context = viewOnCreateView.getContext();
                if (context != contextRequireSceneContext && this.mThemeResource != 0 && C786410Ut5.H2(context, SCENE_SERVICE) != this) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scene theme is not 0, but Scene view's context is incorrect, you should use getLayoutInflater() or requireSceneContext() to create view with theme instead, please check Scene ");
                    sbLIZ.append(getClass().toString());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (LLJJJ() && !LLJJJJ()) {
                    ViewTreeLifecycleOwner.set(viewOnCreateView, this);
                    viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                }
                if (!LLJJJJ()) {
                    ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                    viewOnCreateView.setSaveFromParentEnabled(false);
                }
                viewOnCreateView.setTag(R.id.d8o, this);
                this.mView = viewOnCreateView;
                this.mCalled = false;
                dispatchOnPreSceneViewCreated(this, bundle, false);
                onViewCreated(this.mView, bundle);
                if (this.mCalled) {
                    dispatchOnSceneViewCreated(this, bundle, false);
                    LLJJLIIIJLLLLLLLZ(EnumC214943199x.VIEW_CREATED);
                    return;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Scene ");
                    sbLIZ2.append(LLJLIL());
                    sbLIZ2.append(" did not call through to super.onViewCreated()");
                    throw new C21498819Bq(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            throw new IllegalArgumentException("onCreateView cant return null");
        }
        throw new IllegalArgumentException("Scene already call onCreateView");
    }

    public void dispatchOnPreSceneDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneDestroyed(scene, z2);
        }
    }

    public void dispatchOnPreScenePaused(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreScenePaused(scene, z2);
        }
    }

    public void dispatchOnPreSceneResumed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneResumed(scene, z2);
        }
    }

    public void dispatchOnPreSceneStarted(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneStarted(scene, z2);
        }
    }

    public void dispatchOnPreSceneStopped(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneStopped(scene, z2);
        }
    }

    public void dispatchOnPreSceneViewDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneViewDestroyed(scene, z2);
        }
    }

    public void dispatchOnSceneDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneDestroyed(scene, z2);
        }
    }

    public void dispatchOnScenePaused(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnScenePaused(scene, z2);
        }
    }

    public void dispatchOnSceneResumed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneResumed(scene, z2);
        }
    }

    public void dispatchOnSceneStarted(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneStarted(scene, z2);
        }
    }

    public void dispatchOnSceneStopped(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneStopped(scene, z2);
        }
    }

    public void dispatchOnSceneViewDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneViewDestroyed(scene, z2);
        }
    }

    public void dispatchOnSuperSceneDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneDestroyed(scene, z2);
        }
    }

    public void dispatchOnSuperScenePaused(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperScenePaused(scene, z2);
        }
    }

    public void dispatchOnSuperSceneResumed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneResumed(scene, z2);
        }
    }

    public void dispatchOnSuperSceneStarted(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneStarted(scene, z2);
        }
    }

    public void dispatchOnSuperSceneStopped(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneStopped(scene, z2);
        }
    }

    public void dispatchOnSuperSceneViewDestroyed(Scene scene, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneViewDestroyed(scene, z2);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.mCalled = true;
        dispatchOnSuperSceneViewCreated(this, bundle, false);
    }

    public void dispatchOnPreSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneActivityCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnPreSceneCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnPreSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneSaveInstanceState(scene, bundle, z2);
        }
    }

    public void dispatchOnPreSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnPreSceneViewCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneActivityCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSceneCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneSaveInstanceState(scene, bundle, z2);
        }
    }

    public void dispatchOnSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSceneViewCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSuperSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneActivityCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSuperSceneCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneCreated(scene, bundle, z2);
        }
    }

    public void dispatchOnSuperSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneSaveInstanceState(scene, bundle, z2);
        }
    }

    public void dispatchOnSuperSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        boolean z2;
        Scene scene2 = this.mParentScene;
        if (scene2 != null) {
            if (scene == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            scene2.dispatchOnSuperSceneViewCreated(scene, bundle, z2);
        }
    }
}
