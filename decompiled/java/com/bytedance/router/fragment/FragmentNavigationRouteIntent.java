package com.bytedance.router.fragment;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.ContextExtensionKt;

/* JADX INFO: loaded from: classes33.dex */
public final class FragmentNavigationRouteIntent extends RouteIntent {
    public FragmentManager fragmentManager;
    public FragmentNavigationContainer fragmentNavigationContainer;
    public PopOp popOp;
    public PushOp pushOp;

    public static final class Builder extends RouteIntent.Builder {
        public Fragment fragment;
        public FragmentManager fragmentManager;
        public FragmentNavigationContainer fragmentNavigationContainer;
        public PopOp popOp;
        public PushOp pushOp;

        @Override // com.bytedance.router.RouteIntent.Builder
        public FragmentNavigationRouteIntent build() {
            FragmentNavigationRouteIntent fragmentNavigationRouteIntent = new FragmentNavigationRouteIntent();
            apply(fragmentNavigationRouteIntent);
            fragmentNavigationRouteIntent.setFragmentNavigationContainer(this.fragmentNavigationContainer);
            fragmentNavigationRouteIntent.setPushOp(this.pushOp);
            fragmentNavigationRouteIntent.setPopOp(this.popOp);
            fragmentNavigationRouteIntent.setFragment(this.fragment);
            fragmentNavigationRouteIntent.fragmentManager = this.fragmentManager;
            return fragmentNavigationRouteIntent;
        }

        public final Builder withFragment(Fragment fragment) {
            this.fragment = fragment;
            return this;
        }

        public final Builder withFragmentManager(FragmentManager fragmentManager) {
            this.fragmentManager = fragmentManager;
            return this;
        }

        public final Builder withFragmentNavigationContainer(FragmentNavigationContainer fragmentNavigationContainer) {
            this.fragmentNavigationContainer = fragmentNavigationContainer;
            return this;
        }

        public final Builder withPopOp(PopOp popOp) {
            this.popOp = popOp;
            return this;
        }

        public final Builder withPushOp(PushOp pushOp) {
            this.pushOp = pushOp;
            return this;
        }
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final FragmentNavigationContainer getFragmentNavigationContainer() {
        return this.fragmentNavigationContainer;
    }

    public final PopOp getPopOp() {
        return this.popOp;
    }

    public final PushOp getPushOp() {
        return this.pushOp;
    }

    public final Activity getActivity(Context context) {
        Activity activity;
        if (context == null || (activity = ContextExtensionKt.getActivity(context)) == null) {
            Fragment fragment = getFragment();
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        return activity;
    }

    public final void setFragmentNavigationContainer(FragmentNavigationContainer fragmentNavigationContainer) {
        this.fragmentNavigationContainer = fragmentNavigationContainer;
    }

    public final void setPopOp(PopOp popOp) {
        this.popOp = popOp;
    }

    public final void setPushOp(PushOp pushOp) {
        this.pushOp = pushOp;
    }
}
