package com.bytedance.tiktok.sdk.powerviewpager;

import X.C128Y;
import X.C13LP;
import X.InterfaceC1206390hUz;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.sdk.powerviewpager.adapter.PowerViewPagerFragmentAdapter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentPageSelectedManager implements LifecycleEventObserver {
    public final PowerViewPagerFragmentAdapter LL;
    public final HashMap<PowerViewPagerFragmentItem<?>, WeakReference<Fragment>> LLILLJJLI = new HashMap<>();
    public Fragment LLILLL;

    public FragmentPageSelectedManager(PowerViewPagerFragmentAdapter powerViewPagerFragmentAdapter) {
        this.LL = powerViewPagerFragmentAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, Fragment fragment) {
        if (fragment != 0 && !Intrinsics.LJFF(fragment, this.LLILLL)) {
            C128Y c128y = this.LLILLL;
            if (c128y instanceof InterfaceC1206390hUz) {
                ((InterfaceC1206390hUz) c128y).LLLILZLLLI();
            }
            if (fragment.isAdded() && (fragment instanceof InterfaceC1206390hUz)) {
                ((InterfaceC1206390hUz) fragment).onPageSelected(i);
                this.LLILLL = fragment;
            } else {
                this.LLILLL = null;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Fragment fragment;
        Fragment fragment2;
        if (event == Lifecycle.Event.ON_RESUME) {
            if (lifecycleOwner instanceof Fragment) {
                fragment2 = (Fragment) lifecycleOwner;
            } else {
                fragment2 = null;
            }
            LIZ(this.LL.LLLILZLLLI(), fragment2);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            for (Object obj : C13LP.LLIIII(this.LLILLJJLI.keySet())) {
                WeakReference<Fragment> weakReference = this.LLILLJJLI.get(obj);
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                if (Intrinsics.LJFF(fragment, lifecycleOwner)) {
                    this.LLILLJJLI.remove(obj);
                }
            }
            if (Intrinsics.LJFF(lifecycleOwner, this.LLILLL)) {
                if (lifecycleOwner instanceof InterfaceC1206390hUz) {
                    ((InterfaceC1206390hUz) lifecycleOwner).LLLILZLLLI();
                }
                this.LLILLL = null;
            }
        }
    }
}
