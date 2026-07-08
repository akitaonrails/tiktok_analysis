package com.ss.android.ugc.aweme.setting.page;

import X.C01GW;
import X.C12N4;
import X.C19318810i2;
import X.C452501pT;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class AboutPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjYpPTs6JiJiOS40LWsNKyAmPBUtLio=";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 588));
    public C12N4 LLJILJIL;
    public C12N4 LLJILJILJ;
    public C12N4 LLJILLL;
    public C12N4 LLJJ;
    public C12N4 LLJJI;
    public C12N4 LLJJIII;
    public C12N4 LLJJIJI;
    public C12N4 LLJJIJIIJIL;
    public C12N4 LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f78;
    }

    public final C19318810i2 ZR() {
        return (C19318810i2) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
        super.Q9(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.AboutPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
