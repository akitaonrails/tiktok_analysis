package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1342260l28;
import X.C1347990lBN;
import X.C13LE;
import X.C2217381BqS;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class KeyboardIconGroupVM extends AssemViewModel<C1347990lBN> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public InterfaceC665370Q7z LL;
    public final C1342260l28 LLILLJJLI = new C1342260l28(new AwS565S0100000_21(this, 154));
    public GiftViewModel LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(KeyboardIconGroupVM.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1347990lBN(0);
    }

    public final CommentContextSource vQ2() {
        C1342260l28 c1342260l28 = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return c1342260l28.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(boolean r5) {
        /*
            r4 = this;
            X.0lFf r0 = X.C1350650lFf.LIZ
            r0.getClass()
            boolean r0 = X.C1350650lFf.LIZ()
            r3 = 0
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L60
            boolean r0 = r0.getForceDisableReplyWithVideo()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L20:
            boolean r0 = X.C1346420l8q.LIZIZ(r0)
            if (r0 == 0) goto L62
            r2 = 1
        L27:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateVideoIcon "
            r1.append(r0)
            boolean r0 = X.C1350650lFf.LIZ()
            r1.append(r0)
            java.lang.String r0 = "  "
            r1.append(r0)
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L50
            boolean r0 = r0.getForceDisableReplyWithVideo()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L50:
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            kotlin.jvm.internal.AwS5S0020000_21 r1 = new kotlin.jvm.internal.AwS5S0020000_21
            r0 = 1
            r1.<init>(r2, r5, r0)
            r4.setStateImmediate(r1)
            return
        L60:
            r0 = r3
            goto L20
        L62:
            r2 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupVM.xQ2(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(boolean r5, boolean r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateGiftIcon isReplyingComment==>"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "   isSelectGift==>"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "KeyboardIconGroupVM"
            X.C1344030l4z.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            r3 = 0
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.aweme
        L2c:
            com.ss.android.ugc.aweme.setting.services.IVideoGiftService r0 = com.ss.android.ugc.aweme.setting.services.VideoGiftService.LJI()
            boolean r0 = r0.LIZ(r1)
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L93
            boolean r0 = r0.getEnableGiftScene()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L4a:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 == 0) goto L95
            if (r5 != 0) goto L95
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L91
            boolean r0 = r0.isLandscapeMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L66:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 != 0) goto L95
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r4.vQ2()
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r0.getKeyboardModel()
            if (r0 == 0) goto L8f
            java.lang.String r1 = r0.getClickFrom()
        L7c:
            java.lang.String r0 = "click_add_recommendation"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L95
            r2 = 1
        L85:
            kotlin.jvm.internal.AwS5S0020000_21 r1 = new kotlin.jvm.internal.AwS5S0020000_21
            r0 = 0
            r1.<init>(r2, r6, r0)
            r4.setStateImmediate(r1)
            return
        L8f:
            r1 = r3
            goto L7c
        L91:
            r0 = r3
            goto L66
        L93:
            r0 = r3
            goto L4a
        L95:
            r2 = 0
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r4.LLILLL
            if (r0 == 0) goto L85
            androidx.lifecycle.MutableLiveData r0 = r0.wQ2()
            if (r0 == 0) goto L85
            r0.setValue(r3)
            goto L85
        La4:
            r1 = r3
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupVM.wQ2(boolean, boolean):void");
    }
}
