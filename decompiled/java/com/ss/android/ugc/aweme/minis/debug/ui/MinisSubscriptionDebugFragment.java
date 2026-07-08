package com.ss.android.ugc.aweme.minis.debug.ui;

import X.C1232850iBf;
import X.C1B0H;
import X.C1B0J;
import X.C2197731Azr;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisSubscriptionDebugFragment extends MinisM10nDebugFragment {
    public static WeakReference<C1B0J> LLIZ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiEpKzo0HELIOSZjAlZwI6Jiw/GjoxOyY+ID8nISoiDSoxPSIKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final String MR() {
        return "In-App subscription test";
    }

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final String NR() {
        return "Choose a scenario below to mock a subscription response";
    }

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment
    public final void OR() {
        C1B0J c1b0j;
        String str;
        WeakReference<C1B0J> weakReference = LLIZ;
        if (weakReference == null || (c1b0j = weakReference.get()) == null) {
            return;
        }
        C1232850iBf c1232850iBf = C2197731Azr.LJIIZILJ;
        C1B0H c1b0h = c1b0j.LIZIZ;
        if (c1b0h != null) {
            Integer numValueOf = Integer.valueOf(c1232850iBf.LIZ);
            String str2 = c1232850iBf.LIZIZ;
            if (str2 == null) {
                str = "subscription payment failed";
                str2 = "Subscription payment failed";
            } else {
                str = str2;
            }
            c1b0h.LIZIZ(new M10nMockDebugErrorInfo(numValueOf, str, false, false, str2));
        }
        c1b0j.LJ(this);
    }

    @Override // com.ss.android.ugc.aweme.minis.debug.ui.MinisM10nDebugFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.inl);
        if (textView != null) {
            textView.setText("Subscribe");
        }
    }
}
