package com.ss.android.ugc.aweme.utils;

import X.C1619106Vp;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes3.dex */
public final class IMCustomizeRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (bundle != null) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.openCustomizeFragment(bundle.getString("key_conversation_id", ""), bundle.getBoolean("is_group"), bundle.getString("enter_method", ""), bundle.getBoolean("is_new_label_shown"), bundle.getString("default_tab", ""));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
