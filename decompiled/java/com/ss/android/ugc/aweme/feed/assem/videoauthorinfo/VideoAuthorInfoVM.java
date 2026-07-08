package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.C01GW;
import X.C13LE;
import X.C2217371BqR;
import X.C452501pT;
import X.C717590SCv;
import X.C717830SDt;
import X.C718130SEx;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoAuthorInfoVM extends FeedBaseViewModel<C717830SDt> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final HashMap<String, List<String>> LL = new HashMap<>();
    public final C717590SCv LLILLJJLI = new C717590SCv(new C718130SEx());
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(103));

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoAuthorInfoVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C717830SDt(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM.vQ2(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0375  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r23, com.ss.android.ugc.aweme.feed.model.VideoItemParams r24) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(X.C19EG r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, kotlin.jvm.functions.Function0<kotlin.Unit> r14) {
        /*
            r11 = this;
            X.197k r4 = X.C214878197k.LIZIZ
            java.lang.String r5 = r11.eventType
            if (r5 != 0) goto L8
            java.lang.String r5 = ""
        L8:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
            r7 = r13
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = r7.getCollabInfo()
            if (r0 == 0) goto L48
            java.util.List<com.ss.android.ugc.aweme.feed.model.CollaboratorInfo> r1 = r0.collaborators
            if (r1 == 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.CollaboratorInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollaboratorInfo) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            r2.add(r0)
            goto L2c
        L42:
            java.util.Set r2 = X.C13LP.LLIIJI(r2)
            if (r2 != 0) goto L4a
        L48:
            X.08CX r2 = X.C08CX.INSTANCE
        L4a:
            java.lang.String r1 = r3.getUid()
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L66
            java.lang.String r8 = "author"
        L5a:
            androidx.fragment.app.Fragment r0 = r11.fragment
            java.lang.String r10 = X.C1389300mG0.LIZIZ(r0)
            r9 = r14
            r6 = r12
            r4.LJIIJ(r5, r6, r7, r8, r9, r10)
            return
        L66:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L6f
            java.lang.String r8 = "collaber"
            goto L5a
        L6f:
            java.lang.String r8 = "user"
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM.wQ2(X.19EG, com.ss.android.ugc.aweme.feed.model.Aweme, kotlin.jvm.functions.Function0):void");
    }
}
