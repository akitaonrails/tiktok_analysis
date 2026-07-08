package com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost;

import X.C01GW;
import X.C1247000iYU;
import X.C1342220l24;
import X.C1349280lDS;
import X.C1351880lHe;
import X.C1351890lHf;
import X.C1351900lHg;
import X.C1351910lHh;
import X.C1351920lHi;
import X.C1351930lHj;
import X.C1351940lHk;
import X.C1351950lHl;
import X.C1367100lgC;
import X.C1367110lgD;
import X.C426750GoL;
import X.C431310Gvh;
import X.C443210HZn;
import X.C443540HaK;
import X.C443550HaL;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostCommentCellAssem extends ReusedUISlotAssem<FriendsV3RepostCommentCellAssem> implements InterfaceC712990Rxx<C1351880lHe> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 54));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 55));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 124));
    public RepostReplyStruct LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a2g;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TuxTextView op() {
        return (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final String sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        RepostReplyStruct repostReplyStruct = ((C1351880lHe) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
        String str = repostReplyStruct.replyToUserid;
        String strLIZJ = str != null ? C1247000iYU.LIZJ(str) : null;
        String str2 = repostReplyStruct.replyToUsername;
        String strLJIIJ = C1349280lDS.LJIIJ(str2, str2, "homepage_friends");
        if (strLIZJ == null) {
            strLIZJ = strLJIIJ;
        }
        return C443210HZn.LJI(strLIZJ);
    }

    public final int tp() {
        return ((Number) this.LLJL.getValue()).intValue();
    }

    public final void yp() {
        String str;
        C724270Sb3 c724270Sb3 = this.LLJI;
        RepostReplyStruct repostReplyStruct = ((C1351880lHe) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
        if (repostReplyStruct == null || (str = repostReplyStruct.replyToUserid) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LIZ(this), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", str);
        smartRouteBuildRoute.withParam("enter_from", "homepage_friends");
        smartRouteBuildRoute.withParam("enter_method", "click_name");
        smartRouteBuildRoute.open();
    }

    public final void zp() {
        User user;
        RepostReplyStruct repostReplyStruct = this.LLJLILLLLZIIL;
        if (repostReplyStruct == null || (user = repostReplyStruct.user) == null) {
            return;
        }
        C1351950lHl.LJJI(user, getContentView().getContext(), "homepage_friends", null, "click_name", null, null, null, 8172);
    }

    public static String up(User user) {
        String userDisplayName;
        String strLIZIZ;
        String userDisplayName2 = null;
        if (user != null) {
            userDisplayName = user.getUserDisplayName();
        } else {
            userDisplayName = null;
        }
        if (TextUtils.isEmpty(userDisplayName)) {
            strLIZIZ = C1342220l24.LJ(user, "homepage_friends", true, true);
        } else {
            if (user != null) {
                userDisplayName2 = user.getUserDisplayName();
            }
            strLIZIZ = C1342220l24.LIZIZ(user, userDisplayName2);
        }
        return C443210HZn.LJI(strLIZIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op().setMovementMethod(C431310Gvh.LIZ);
        op().setBreakStrategy(0);
        C786410Ut5.I7(new AbS701S0100000_21(this, 0, 42, 42), getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1351880lHe c1351880lHe) {
        String str;
        String uid;
        String str2;
        UrlModel avatarThumb;
        Object obj;
        User user;
        String str3;
        Object obj2;
        User user2;
        String uid2;
        C1351880lHe c1351880lHe2 = c1351880lHe;
        String str4 = null;
        avatarThumb = null;
        UrlModel avatarThumb2 = null;
        if (Intrinsics.LJFF(this.LLJLL, c1351880lHe2.LL.fakeId)) {
            String str5 = this.LLJLLIL;
            User user3 = c1351880lHe2.LL.user;
            if (user3 != null) {
                uid2 = user3.getUid();
            } else {
                uid2 = null;
            }
            if (Intrinsics.LJFF(str5, uid2) && Intrinsics.LJFF(this.LLJLLL, c1351880lHe2.LL.text)) {
                return;
            }
        }
        this.LLJLILLLLZIIL = c1351880lHe2.LL;
        TuxTextView tuxTextViewOp = op();
        RepostReplyStruct repostReplyStruct = this.LLJLILLLLZIIL;
        if (repostReplyStruct != null) {
            str = repostReplyStruct.replyId;
        } else {
            str = null;
        }
        tuxTextViewOp.setTag(str);
        RepostReplyStruct repostReplyStruct2 = c1351880lHe2.LL;
        this.LLJLL = repostReplyStruct2.fakeId;
        User user4 = repostReplyStruct2.user;
        if (user4 != null) {
            uid = user4.getUid();
        } else {
            uid = null;
        }
        this.LLJLLIL = uid;
        this.LLJLLL = c1351880lHe2.LL.text;
        TuxTextView tuxTextViewOp2 = op();
        RepostReplyStruct repostReplyStruct3 = this.LLJLILLLLZIIL;
        if (repostReplyStruct3 != null) {
            str2 = repostReplyStruct3.replyToCommentId;
        } else {
            str2 = null;
        }
        boolean z = !TextUtils.isEmpty(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            RepostReplyStruct repostReplyStruct4 = this.LLJLILLLLZIIL;
            if (repostReplyStruct4 != null) {
                str3 = repostReplyStruct4.text;
            } else {
                str3 = null;
            }
            C443210HZn.LIZIZ(spannableStringBuilder, str3);
            C443210HZn.LJ(spannableStringBuilder, " :", tp(), null);
            if (z) {
                C443210HZn.LJ(spannableStringBuilder, sp(), tp(), new C1351900lHg(this));
                C443210HZn.LIZ(tp(), op().getContext(), spannableStringBuilder);
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            C443210HZn.LJ(spannableStringBuilder, up(((C1351880lHe) obj2).LL.user), tp(), new C1351910lHh(this));
            Context context2 = getContext();
            int iTp = tp();
            RepostReplyStruct repostReplyStruct5 = this.LLJLILLLLZIIL;
            if (repostReplyStruct5 != null && (user2 = repostReplyStruct5.user) != null) {
                avatarThumb2 = user2.getAvatarThumb();
            }
            C443210HZn.LIZJ(spannableStringBuilder, context2, iTp, avatarThumb2, new C1367100lgC(this), new C443540HaK(this), new C1351920lHi(this));
            C443210HZn.LIZLLL(spannableStringBuilder);
        } else {
            Context context3 = getContext();
            int iTp2 = tp();
            RepostReplyStruct repostReplyStruct6 = this.LLJLILLLLZIIL;
            if (repostReplyStruct6 != null && (user = repostReplyStruct6.user) != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C443210HZn.LIZJ(spannableStringBuilder, context3, iTp2, avatarThumb, new C1367110lgD(this), new C443550HaL(this), new C1351930lHj(this));
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj = c724270Sb32.LL;
            } else {
                obj = null;
            }
            C443210HZn.LJ(spannableStringBuilder, up(((C1351880lHe) obj).LL.user), tp(), new C1351940lHk(this));
            if (z) {
                C443210HZn.LIZ(tp(), op().getContext(), spannableStringBuilder);
                C443210HZn.LJ(spannableStringBuilder, sp(), tp(), new C1351890lHf(this));
            }
            C443210HZn.LJ(spannableStringBuilder, ": ", tp(), null);
            RepostReplyStruct repostReplyStruct7 = this.LLJLILLLLZIIL;
            if (repostReplyStruct7 != null) {
                str4 = repostReplyStruct7.text;
            }
            C443210HZn.LIZIZ(spannableStringBuilder, str4);
            C443210HZn.LIZLLL(spannableStringBuilder);
        }
        tuxTextViewOp2.setText(spannableStringBuilder);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1351880lHe c1351880lHe) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1351880lHe c1351880lHe) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Ap(com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost.FriendsV3RepostCommentCellAssem r9, android.graphics.Bitmap r10, android.text.SpannableStringBuilder r11, X.C419890GdH r12, int r13, int r14) {
        /*
            android.content.Context r1 = r9.getContext()
            com.bytedance.tux.input.TuxTextView r0 = r9.op()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            X.0HaJ r4 = X.C443210HZn.LJII(r1, r0, r10)
            android.content.Context r0 = r9.getContext()
            r6 = 0
            if (r0 == 0) goto Lbf
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            r1 = 1
            if (r0 != r1) goto Lbf
        L22:
            r0 = 4
            if (r1 == 0) goto La7
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r5 = X.C814420VxA.LIZIZ(r0)
            r7 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
        L38:
            r2 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.setBounds(r6, r6, r1, r0)
            r11.removeSpan(r12)
            X.0GdH r4 = new X.0GdH
            r0 = 2
            r4.<init>(r3, r0)
            X.0Gwm r5 = new X.0Gwm
            int r6 = r9.tp()
            int r7 = r9.tp()
            int r0 = android.graphics.Color.alpha(r7)
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r3 = X.C814420VxA.LIZIZ(r1)
            int r2 = android.graphics.Color.red(r7)
            int r1 = android.graphics.Color.green(r7)
            int r0 = android.graphics.Color.blue(r7)
            int r3 = android.graphics.Color.argb(r3, r2, r1, r0)
            kotlin.jvm.internal.AwS598S0100000_19 r2 = new kotlin.jvm.internal.AwS598S0100000_19
            r1 = 0
            r0 = 12
            r2.<init>(r1, r0)
            r5.<init>(r6, r3, r2)
            r0 = 33
            X.C786410Ut5.q2(r11, r5, r13, r14, r0)
            X.C786410Ut5.q2(r11, r4, r13, r14, r0)
            com.bytedance.tux.input.TuxTextView r2 = r9.op()
            Y.ARunnableS75S0200000_6 r1 = new Y.ARunnableS75S0200000_6
            r0 = 9
            r1.<init>(r9, r11, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            return
        La7:
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r7 = X.C814420VxA.LIZIZ(r0)
            r3 = r3
            r4 = r4
            r5 = r6
            r6 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            goto L38
        Lbf:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost.FriendsV3RepostCommentCellAssem.Ap(com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost.FriendsV3RepostCommentCellAssem, android.graphics.Bitmap, android.text.SpannableStringBuilder, X.0GdH, int, int):void");
    }
}
