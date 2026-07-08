package com.ss.android.ugc.aweme.base.xelements;

import X.AbstractC21340218fI;
import X.C1767310w5h;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.LynxVideoManager;
import j27.s;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class UISingleVideo extends LynxVideoManager {
    public UISingleVideo(s sVar) {
        super(sVar);
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager
    /* JADX INFO: renamed from: LJJIIZI */
    public final AbstractC21340218fI createView(Context context) {
        if (context != null) {
            C1767310w5h c1767310w5h = new C1767310w5h(context, null, 0);
            c1767310w5h.setStateChangeReporter(new AwS681S0100000_32(this, 3));
            return c1767310w5h;
        }
        "Required context must be non-null".toString();
        throw new IllegalArgumentException("Required context must be non-null");
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }
}
