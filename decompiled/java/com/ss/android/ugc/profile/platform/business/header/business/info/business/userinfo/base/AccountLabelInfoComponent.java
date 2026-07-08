package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.AbstractC738140SxQ;
import X.C1231510i9V;
import X.C1308910kAL;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountLabelInfoComponent<T extends BizBaseData> extends CommonInfoBaseUIComponent<T> {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent
    public final CharSequence Fp() {
        Integer numLIZJ;
        AbstractC738140SxQ abstractC738140SxQ;
        LifecycleOwner parent = getParent();
        if (!Intrinsics.LJFF((!(parent instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) parent) == null) ? null : abstractC738140SxQ.assemTagInternal, "user_account_base_info")) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append((char) 183);
        sbLIZ.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.q2(spannableStringBuilder, new C1231510i9V(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 1, 33);
        Context context = getContext();
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan((context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) == null) ? -7829368 : numLIZJ.intValue()), 1, 2, 33);
        C786410Ut5.q2(spannableStringBuilder, new C1231510i9V(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 2, 3, 33);
        return spannableStringBuilder;
    }
}
