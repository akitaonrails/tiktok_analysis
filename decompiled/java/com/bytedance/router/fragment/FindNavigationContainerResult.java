package com.bytedance.router.fragment;

import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes33.dex */
public final class FindNavigationContainerResult {
    public final FragmentNavigationContainer container;
    public final FragmentManager fragmentManager;

    public FindNavigationContainerResult(FragmentManager fragmentManager, FragmentNavigationContainer fragmentNavigationContainer) {
        this.fragmentManager = fragmentManager;
        this.container = fragmentNavigationContainer;
    }
}
