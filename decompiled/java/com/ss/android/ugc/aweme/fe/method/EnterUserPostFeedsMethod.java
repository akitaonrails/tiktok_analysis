package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1388190mED;
import X.C1893760zNe;
import X.C19724912Fj;
import X.C686150Qvl;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        Activity activityLIZ;
        String str;
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = null;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (!(context instanceof Activity) || (activityLIZ = C1388190mED.LIZ(context)) == null || !C1893760zNe.LIZ(activityLIZ, true)) {
            return;
        }
        String strOptString = jSONObject.optString("user_id");
        int iOptInt = jSONObject.optInt("task");
        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
        C686150Qvl c686150Qvl = new C686150Qvl("aweme://aweme/detail/0");
        if (TextUtils.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), strOptString)) {
            str = "from_profile_self";
        } else {
            str = "from_profile_other";
        }
        c686150Qvl.LIZIZ("video_from", str);
        c686150Qvl.LIZ(0, "video_type");
        c686150Qvl.LIZIZ("userid", strOptString);
        c686150Qvl.LIZ(iOptInt, "task_type");
        c19724912FjLIZLLL.LJI(activityLIZ, c686150Qvl.LIZJ());
    }
}
