package com.bytedance.router.fragment;

import X.C19EG;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes33.dex */
public final class NavigationUtils {
    public static final NavigationUtils INSTANCE = new NavigationUtils();

    /* JADX WARN: Multi-variable type inference failed */
    public static final FindNavigationContainerResult findNavigationContainer(Fragment fragment) {
        C19EG activity;
        for (Fragment parentFragment = fragment; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof FragmentNavigationContainer) {
                return new FindNavigationContainerResult(parentFragment.getChildFragmentManager(), (FragmentNavigationContainer) parentFragment);
            }
        }
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        return findNavigationContainer(activity);
    }

    public static final Fragment findTopFragment(Fragment fragment) {
        FindNavigationContainerResult findNavigationContainerResultFindNavigationContainer = findNavigationContainer(fragment);
        if (findNavigationContainerResultFindNavigationContainer == null) {
            return null;
        }
        return INSTANCE.findTopFragment(findNavigationContainerResultFindNavigationContainer);
    }

    private final Fragment findTopFragmentByBackStack(FragmentManager fragmentManager) {
        int iLJJLIIIIJ = fragmentManager.LJJLIIIIJ();
        if (iLJJLIIIIJ <= 0) {
            return null;
        }
        return fragmentManager.LJJJJZI(fragmentManager.LJJLI(iLJJLIIIIJ - 1).getName());
    }

    private final Fragment findTopFragmentByVisible(FragmentManager fragmentManager) {
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment.isVisible()) {
                return fragment;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FindNavigationContainerResult findNavigationContainer(C19EG c19eg) {
        FragmentNavigationContainer fragmentNavigationContainer;
        if (!(c19eg instanceof FragmentNavigationContainer) || (fragmentNavigationContainer = (FragmentNavigationContainer) c19eg) == null) {
            return null;
        }
        return new FindNavigationContainerResult(c19eg.getSupportFragmentManager(), fragmentNavigationContainer);
    }

    public final Fragment findTopFragment(C19EG c19eg) {
        FindNavigationContainerResult findNavigationContainerResultFindNavigationContainer = findNavigationContainer(c19eg);
        if (findNavigationContainerResultFindNavigationContainer == null) {
            return null;
        }
        return findTopFragment(findNavigationContainerResultFindNavigationContainer);
    }

    private final Fragment findTopFragment(FindNavigationContainerResult findNavigationContainerResult) {
        FragmentManager fragmentManager = findNavigationContainerResult.fragmentManager;
        Fragment fragmentFindTopFragmentByBackStack = findTopFragmentByBackStack(fragmentManager);
        if (fragmentFindTopFragmentByBackStack == null) {
            return findTopFragmentByVisible(fragmentManager);
        }
        return fragmentFindTopFragmentByBackStack;
    }
}
