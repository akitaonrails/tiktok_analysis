package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky;

import X.C14EU;
import X.C356901a3;
import X.C484220Iyq;
import X.C622680Oba;
import X.EnumC894560Z7m;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class DmFilterReportEventObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final IMChatListApi LL;
    public final LifecycleOwner LLILLJJLI;
    public final Function0<FragmentManager> LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        if (!C622680Oba.LIZ(this)) {
            C622680Oba.LIZJ(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String strOptString;
        FragmentManager fragmentManagerInvoke;
        IMChatListApi iMChatListApi = this.LL;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject == null || (strOptString = jSONObject.optString("eventName")) == null) {
            strOptString = "";
        }
        if (iMChatListApi.LJIL(strOptString, this.LLILLJJLI.getLifecycle().getCurrentState()) && (fragmentManagerInvoke = this.LLILLL.invoke()) != null) {
            this.LL.LIZJ(fragmentManagerInvoke, EnumC894560Z7m.REPORT, null);
        }
    }

    public DmFilterReportEventObserver(IMChatListApi iMChatListApi, LifecycleOwner lifecycleOwner, AwS546S0100000_2 awS546S0100000_2) {
        this.LL = iMChatListApi;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = awS546S0100000_2;
    }
}
