package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback;

import X.AnonymousClass0602;
import X.AnonymousClass0604;
import X.C1388190mED;
import X.C2095008Iq;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenSmartReplyFeedbackPanelAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String string;
        String string2;
        Long lLJIILIIL;
        String string3 = null;
        if (bundle != null) {
            string = bundle.getString("enter_method");
            string3 = bundle.getString("panel_type");
        } else {
            string = null;
        }
        AnonymousClass0604 anonymousClass0604 = AnonymousClass0604.CREATOR;
        if (!Intrinsics.LJFF(string3, anonymousClass0604.getValue())) {
            AnonymousClass0604 anonymousClass06042 = AnonymousClass0604.USER;
            if (Intrinsics.LJFF(string3, anonymousClass06042.getValue())) {
                anonymousClass0604 = anonymousClass06042;
            }
        }
        if (bundle != null && (string2 = bundle.getString("message_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string2)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            String string4 = bundle.getString("conversation_id");
            if (string4 == null) {
                return Boolean.FALSE;
            }
            if (context != null && C1388190mED.LIZ(context) != null) {
                String strValueOf = String.valueOf(jLongValue);
                if (string == null) {
                    string = "router";
                }
                AnonymousClass0602.LIZ(anonymousClass0604, strValueOf, string4, string);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
