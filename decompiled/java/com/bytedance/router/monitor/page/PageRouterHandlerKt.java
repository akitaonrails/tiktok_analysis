package com.bytedance.router.monitor.page;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes36.dex */
public final class PageRouterHandlerKt {
    public static final IRouterPageEventDispatcher emptyDispatcher = new IRouterPageEventDispatcher() { // from class: com.bytedance.router.monitor.page.PageRouterHandlerKt$emptyDispatcher$1
        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchActivityCreated(Object obj) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchActivityDestroyed(Object obj) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchActivityOpReached(Object obj, Intent intent, String str) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchFragmentOnHiddenChanged(Object obj, boolean z) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchFragmentOnPaused(Object obj) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchFragmentOnResumed(Object obj) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchFragmentOpReached(Fragment fragment, FragmentOpType fragmentOpType) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchSmartRouteFailed(String str) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchSmartRouteIntercepted(String str, String str2) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchSmartRouteOpen(Context context, Intent intent, String str, String str2, String str3) {
        }

        @Override // com.bytedance.router.monitor.page.IRouterPageEventDispatcher
        public void dispatchSmartRouteSuccess(String str) {
        }
    };

    public static final IRouterPageEventDispatcher getEmptyDispatcher() {
        return emptyDispatcher;
    }
}
