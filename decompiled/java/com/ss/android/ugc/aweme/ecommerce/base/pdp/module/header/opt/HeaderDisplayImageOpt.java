package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt;

import X.C01GW;
import X.C1066190dqr;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes27.dex */
public final class HeaderDisplayImageOpt {
    public static String LIZJ = "";
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;

    public HeaderDisplayImageOpt(InterfaceC497601wk interfaceC497601wk, String str, Lifecycle lifecycle) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C01GW c01gw = C1066190dqr.LIZ;
                    C1066190dqr.LJI(HeaderDisplayImageOpt.this.LIZIZ, true);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.lighten.loader.SmartImageView r13, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r14, int r15, java.lang.String r16, boolean r17, X.InterfaceC1320380kSq r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.C1331670kl3 r20, final X.InterfaceC427850Gq7 r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt.LIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, int, java.lang.String, boolean, X.0kSq, kotlin.jvm.functions.Function0, X.0kl3, X.0Gq7, boolean, boolean):void");
    }
}
