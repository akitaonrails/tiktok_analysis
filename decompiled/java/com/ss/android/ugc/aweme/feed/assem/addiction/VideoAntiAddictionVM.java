package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C0R91;
import X.C0RZH;
import X.C13LE;
import X.C2217371BqR;
import X.C291001Au;
import X.C703800Rj8;
import X.C717590SCv;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoAntiAddictionVM extends FeedBaseViewModel<C0R91> {
    public static final C0RZH LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C717590SCv LL = new C717590SCv(AFwS198S0000000_11.get$arr$(78));
    public boolean LLILLJJLI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoAntiAddictionVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLILLL = new C0RZH();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0R91(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        boolean zBooleanValue;
        C291001Au<C703800Rj8> c291001Au = ((C0R91) interfaceC0148002o).LL;
        if (c291001Au != null) {
            C703800Rj8 c703800Rj8 = c291001Au.LIZ;
        }
        LLILLL.getClass();
        boolean zLIZ = C0RZH.LIZ(videoItemParams);
        Boolean boolLIZ = ComplianceServiceProvider.LJ().LIZ();
        if (boolLIZ != null) {
            zBooleanValue = boolLIZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C703800Rj8 c703800Rj82 = new C703800Rj8(zLIZ, zBooleanValue);
        if (zBooleanValue) {
            this.LLILLJJLI = false;
        }
        return new C0R91(new C291001Au(c703800Rj82));
    }
}
