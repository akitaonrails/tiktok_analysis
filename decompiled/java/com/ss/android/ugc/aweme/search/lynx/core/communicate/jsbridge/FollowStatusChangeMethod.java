package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.C1051660dTQ;
import X.C663340Q0e;
import X.C663400Q0k;
import X.EnumC663360Q0g;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class FollowStatusChangeMethod extends BaseBridgeMethod {
    public static final String METHOD_NAME = "userFollowNotice";
    public static final String PARAM_FOLLOW_STATUS = "status";
    public static final String PARAM_UID = "id";
    public static final String TAG = "userFollowNotice";
    public final C663340Q0e helper;
    public final String name;
    public static final C663400Q0k Companion = new Object() { // from class: X.0Q0k
    };
    public static final int $stable = 8;
    public static final JSONObject EMPTY_JSON_OBJECT = new JSONObject();

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public FollowStatusChangeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "userFollowNotice";
        this.helper = new C663340Q0e(this.contextProviderFactory, getName(), EnumC663360Q0g.STABLE);
    }

    private final void onHandleSuccess(InterfaceC1019840ce6 interfaceC1019840ce6) {
        interfaceC1019840ce6.onSuccess(EMPTY_JSON_OBJECT);
    }

    private final void onHandleError(InterfaceC1019840ce6 interfaceC1019840ce6, String str) {
        interfaceC1019840ce6.LIZ(0, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r9, X.InterfaceC1019840ce6 r10) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
