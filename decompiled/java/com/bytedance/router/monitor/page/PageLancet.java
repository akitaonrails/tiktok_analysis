package com.bytedance.router.monitor.page;

import X.C19EH;
import X.C2110908Ot;
import X.C2111008Ou;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;

/* JADX INFO: loaded from: classes33.dex */
public class PageLancet {
    public void onPause() {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i = C2111008Ou.LIZ;
        dispatcher.dispatchFragmentOnPaused(new Object());
        int i2 = C2110908Ot.LIZ;
    }

    public void onResume() {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i = C2111008Ou.LIZ;
        dispatcher.dispatchFragmentOnResumed(new Object());
        int i2 = C2110908Ot.LIZ;
    }

    public C19EH attach(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ATTACH);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public C19EH detach(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_DETACH);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public C19EH hide(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_HIDE);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public void onHiddenChanged(boolean z) {
        int i = C2110908Ot.LIZ;
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i2 = C2111008Ou.LIZ;
        dispatcher.dispatchFragmentOnHiddenChanged(new Object(), z);
    }

    public C19EH remove(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_REMOVE);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public C19EH show(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_SHOW);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public void startActivity(Intent intent) {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i = C2111008Ou.LIZ;
        dispatcher.dispatchActivityOpReached(new Object(), intent, "Context_startActivity_1");
        int i2 = C2110908Ot.LIZ;
    }

    public C19EH add(int i, Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        int i2 = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i = C2111008Ou.LIZ;
        dispatcher.dispatchActivityOpReached(new Object(), intent, "Context_startActivity_2");
        int i2 = C2110908Ot.LIZ;
    }

    public void startActivityForResult(Intent intent, int i) {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i2 = C2111008Ou.LIZ;
        dispatcher.dispatchActivityOpReached(new Object(), intent, "Activity_startActivityForResult_2");
        int i3 = C2110908Ot.LIZ;
    }

    public C19EH add(Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        int i = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public C19EH add(int i, Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        int i2 = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public C19EH replace(int i, Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_REPLACE);
        int i2 = C2110908Ot.LIZ;
        return (C19EH) new Object();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        IRouterPageEventDispatcher dispatcher = RouterPageMonitor.INSTANCE.getDispatcher();
        int i2 = C2111008Ou.LIZ;
        dispatcher.dispatchActivityOpReached(new Object(), intent, "Activity_startActivityForResult_3");
        int i3 = C2110908Ot.LIZ;
    }
}
