package com.ss.android.ugc.aweme.shortcut.datasource.setting;

import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC815990Vzh;
import X.InterfaceC816000Vzi;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class FromSettingShortcutAction implements InterfaceC816000Vzi {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string = bundle.getString("SHORTCUT_ID");
            if (string == null) {
                string = "";
            }
            onShortcutAction(context, string, str, bundle);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC816000Vzi
    public final Object onShortcutAction(Context context, String str, String str2, Bundle bundle) {
        if (Intrinsics.LJFF(str, EnumC815990Vzh.WITHDRAWAL.getShortcutId()) || Intrinsics.LJFF(str, EnumC815990Vzh.WILL_GET_MOST.getShortcutId())) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "feed_popup");
            C20684815ws.LJIILLIIL("enter_activity_page", c2344009Gk.LIZ);
            return null;
        }
        return null;
    }
}
