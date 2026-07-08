package com.ss.android.ugc.aweme.comment.exposedcmt.friends;

import X.AbstractC1386130mAt;
import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0SUC;
import X.C0SXF;
import X.C1247000iYU;
import X.C1339690kxz;
import X.C1339950kyP;
import X.C1340390kz7;
import X.C1342220l24;
import X.C1349280lDS;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1357130lQ7;
import X.C1360330lVH;
import X.C1389300mG0;
import X.C14EU;
import X.C1514430pVp;
import X.C1578630rBN;
import X.C1599640rjG;
import X.C1906580ziK;
import X.C19651011uW;
import X.C1ER1;
import X.C20684815ws;
import X.C2241008qG;
import X.C295200Bhe;
import X.C431310Gvh;
import X.C443210HZn;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C735410St1;
import X.C735840Sti;
import X.C786410Ut5;
import X.EnumC1584370rKd;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentCellAssem extends ReusedUISlotAssem<FriendsV3CommentCellAssem> implements InterfaceC712990Rxx<C1340390kz7> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 52));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 53));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 122));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 123));
    public long LLJLL;

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

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        FriendsV3FeedCommentAbility friendsV3FeedCommentAbility = (FriendsV3FeedCommentAbility) this.LLJLIL.getValue();
        if (friendsV3FeedCommentAbility != null) {
            friendsV3FeedCommentAbility.Nc2((Function2) this.LLJLILLLLZIIL.getValue());
        }
        EventBus.LIZLLL().LJJI(this);
    }

    public final Comment sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C1340390kz7) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
    }

    public final CommentContextSource tp() {
        CommentContextSource commentContextSource = new CommentContextSource();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String strLIZ = C1389300mG0.LIZ(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null);
        FriendsV3FeedCommentAbility friendsV3FeedCommentAbility = (FriendsV3FeedCommentAbility) this.LLJLIL.getValue();
        commentContextSource.setCommonModel(new CommentCommonModel(friendsV3FeedCommentAbility != null ? friendsV3FeedCommentAbility.Bx1() : null, null, strLIZ, null, "click_exposed_comment", null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, C1389300mG0.LIZIZ(C724240Sb0.LJI(this)), null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
        commentContextSource.setEventModel(new CommentEventModel("", strLIZ, "", "", "", "", "", "", "", "", "", "", 0L, 0, 0.0f, 0, 0, false, "", "", false, 0, false, "", "", "", false, "", 5, "", 0L, "", "", "", "", "", 0, null, null, new ArrayList()));
        return commentContextSource;
    }

    public final TuxTextView up() {
        return (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final int zp() {
        return ((Number) this.LLJL.getValue()).intValue();
    }

    public final void Bp() {
        Activity activityLIZIZ;
        String replyToUserId = sp().getReplyToUserId();
        if (replyToUserId == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LIZ(this), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", replyToUserId);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        smartRouteBuildRoute.withParam("enter_from", C1389300mG0.LIZ(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null));
        smartRouteBuildRoute.withParam("enter_method", "click_name");
        smartRouteBuildRoute.open();
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceTp = tp();
        String cid = sp().getCid();
        c1350920lG6.getClass();
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSourceTp);
        if (aweme != null) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("group_id", aweme.getAid());
            c2241008qG.LIZ.put("request_id", commentContextSourceTp.getEventModel().requestId);
            c2241008qG.LIZ.put("enter_from", CommentContextSourceKt.enterFrom(commentContextSourceTp));
            c2241008qG.LIZ.put("enter_method", "click_name");
            c2241008qG.LIZ.put("enter_type", "normal_way");
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("enter_detail");
            mobClickObtain.setLabelName("personal_homepage");
            mobClickObtain.setValue(replyToUserId);
            mobClickObtain.setJsonObject(c2241008qG.LJ());
            C20684815ws.onEvent(mobClickObtain);
            C2241008qG c2241008qG2 = new C2241008qG();
            c2241008qG2.LIZ.put("request_id", aweme.getRequestId());
            c2241008qG2.LIZ.put("group_id", aweme.getAid());
            MobClick mobClickObtain2 = MobClick.obtain();
            mobClickObtain2.setEventName("head");
            mobClickObtain2.setLabelName(CommentContextSourceKt.enterFrom(commentContextSourceTp));
            mobClickObtain2.setValue(AwemeExtKt.getAuthorUid(aweme));
            mobClickObtain2.setJsonObject(c2241008qG2.LJ());
            C20684815ws.onEvent(mobClickObtain2);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LIZLLL = CommentContextSourceKt.enterFrom(commentContextSourceTp);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            c735410St1.LJJIJL(abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null);
            c735410St1.LJJLIIIJILLIZJL = "click_name";
            c735410St1.LJJZZIII = "comment_panel";
            c735410St1.LJL = "comment_panel";
            c735410St1.LJLJJI = commentContextSourceTp.getEventModel().fromPage;
            c735410St1.LJLJJL = commentContextSourceTp.getActionFromPage();
            c735410St1.LJIJI(aweme);
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            Integer numValueOf = (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null) ? null : Integer.valueOf(C0SXF.LJJIII(activityLIZIZ, aweme));
            c735410St1.LJLZ = numValueOf != null ? numValueOf.intValue() : 0;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            c735410St1.LJJJJL = C0SUC.LIZ(abstractC1387200mCcLIZIZ2 != null ? abstractC1387200mCcLIZIZ2.LIZIZ() : null).getItemPosition();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ3 = C1906580ziK.LIZIZ();
            c735410St1.LJJJJLI = C0SUC.LIZ(abstractC1387200mCcLIZIZ3 != null ? abstractC1387200mCcLIZIZ3.LIZIZ() : null).getProfileSearchId();
            c735410St1.LJJLIIJ = replyToUserId;
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c735410St1);
            c735840Sti.getClass();
            C735840Sti.LIZJ(objLJIIIZ, aweme, null, null, null, null);
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ;
            C0SXF.LIZJ(abstractC1386130mAt, CommentContextSourceKt.enterFrom(commentContextSourceTp), aweme, null);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ4 = C1906580ziK.LIZIZ();
            C0SXF.LJIIIIZZ(abstractC1386130mAt, aweme, abstractC1387200mCcLIZIZ4 != null ? abstractC1387200mCcLIZIZ4.LIZIZ() : null, false);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ5 = C1906580ziK.LIZIZ();
            C1357130lQ7.LIZ(abstractC1386130mAt, C0SUC.LIZ(abstractC1387200mCcLIZIZ5 != null ? abstractC1387200mCcLIZIZ5.LIZIZ() : null).getInboxLogExtra());
            C735410St1 c735410St12 = (C735410St1) abstractC1386130mAt;
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.j(aweme, c735410St12);
            c1er1.LLILZ(aweme, CommentContextSourceKt.enterFrom(commentContextSourceTp), c735410St12);
            C1599640rjG.LIZIZ.Ou(c735410St12, new C1360330lVH(CommentContextSourceKt.getFriendsV3TrackScene(commentContextSourceTp), null, null, null, 14));
            if (C295200Bhe.LIZIZ) {
                c735410St12.LJZL = Boolean.FALSE;
            }
            c735410St12.LJ("comment_id", cid);
            C1350920lG6.LIZJ(c735410St12, commentContextSourceTp.getEventModel().isEnterGraphicDetail());
            c735410St12.LJIILJJIL();
            C1514430pVp.LJFF(EnumC1584370rKd.PROFILE);
        }
    }

    public final void Ep() {
        User user = sp().getUser();
        if (user != null) {
            Context context = getContentView().getContext();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            C1351950lHl.LJJI(user, context, C1389300mG0.LIZ(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null), null, "click_name", null, null, null, 8172);
        }
        User user2 = sp().getUser();
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceTp = tp();
        String cid = sp().getCid();
        c1350920lG6.getClass();
        C1350920lG6.LJLJLJ(user2, commentContextSourceTp, false, "click_name", cid, null);
    }

    public static String Ap(Comment comment) {
        String strLJ;
        if (!C1339690kxz.LIZ().LIZ || TextUtils.isEmpty(comment.getUser().getUserDisplayName())) {
            strLJ = C1342220l24.LJ(comment.getUser(), "homepage_friends", true, true);
        } else {
            strLJ = C1342220l24.LIZIZ(comment.getUser(), comment.getUser().getUserDisplayName());
        }
        return C443210HZn.LJI(strLJ);
    }

    public static String yp(Comment comment) {
        String strLIZJ = C1247000iYU.LIZJ(comment.getReplyToUserId());
        String strLJIIJ = C1349280lDS.LJIIJ(comment.getReplyToNickName(), comment.getReplyToUserName(), "homepage_friends");
        if (strLIZJ == null) {
            strLIZJ = strLJIIJ;
        }
        return C443210HZn.LJI(strLIZJ);
    }

    @C14EU
    public final void onCommentDiggChangeEvent(C1339950kyP c1339950kyP) {
        String str;
        if (c1339950kyP == null || (str = c1339950kyP.LIZ) == null || !Intrinsics.LJFF(str, sp().getCid())) {
            return;
        }
        Comment commentSp = sp();
        if (commentSp != null) {
            commentSp.setUserDigged(c1339950kyP.LIZIZ);
        }
        Comment commentSp2 = sp();
        if (commentSp2 != null) {
            commentSp2.setDiggCount(c1339950kyP.LIZJ);
        }
        Comment commentSp3 = sp();
        if (commentSp3 != null) {
            commentSp3.isAuthorDigged = c1339950kyP.LJ;
        }
        Comment commentSp4 = sp();
        if (commentSp4 != null) {
            commentSp4.setUserBuried(c1339950kyP.LIZLLL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        up().setMovementMethod(C431310Gvh.LIZ);
        up().setBreakStrategy(0);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 20), getContentView());
        FriendsV3FeedCommentAbility friendsV3FeedCommentAbility = (FriendsV3FeedCommentAbility) this.LLJLIL.getValue();
        if (friendsV3FeedCommentAbility != null) {
            friendsV3FeedCommentAbility.yZ1((Function2) this.LLJLILLLLZIIL.getValue());
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[PHI: r0
      0x007b: PHI (r0v24 java.lang.String) = (r0v18 java.lang.String), (r0v20 java.lang.String), (r0v26 java.lang.String) binds: [B:25:0x0078, B:18:0x005e, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(android.text.SpannableStringBuilder r14) {
        /*
            r13 = this;
            int r3 = r14.length()
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.sp()
            int r1 = r0.getIsPhotoContained()
            r0 = 1
            java.lang.String r4 = ""
            if (r1 != r0) goto L47
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto L20
            r0 = 2131826734(0x7f11182e, float:1.928636E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L7b
        L20:
            r14.append(r4)
            X.0HcY r2 = new X.0HcY
            r10 = 0
            r0 = 41
            r2.<init>(r0, r10)
            r4 = 0
            r5 = 450(0x1c2, float:6.3E-43)
            r8 = 0
            r12 = 253(0xfd, float:3.55E-43)
            r6 = r4
            r7 = r4
            r9 = r4
            r11 = r8
            android.graphics.Typeface r0 = X.C1697580uHE.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L3d
            r2.LL = r0
        L3d:
            int r1 = r14.length()
            r0 = 33
            X.C786410Ut5.q2(r14, r2, r3, r1, r0)
            return
        L47:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.sp()
            boolean r0 = X.C1351950lHl.LJIIIZ(r0)
            if (r0 == 0) goto L61
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto L20
            r0 = 2131826735(0x7f11182f, float:1.9286363E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L7b
            goto L20
        L61:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.sp()
            boolean r0 = X.C1351950lHl.LJI(r0)
            if (r0 == 0) goto L7d
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto L20
            r0 = 2131826733(0x7f11182d, float:1.9286359E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L7b
            goto L20
        L7b:
            r4 = r0
            goto L20
        L7d:
            X.0Sb3 r0 = r13.LLJI
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r0.LL
        L83:
            X.0kz7 r0 = (X.C1340390kz7) r0
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAliasAweme()
            if (r0 == 0) goto L20
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r0 = 91
            r2.append(r0)
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto La6
            r0 = 2131833945(0x7f113459, float:1.9300986E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto La6
            r4 = r0
        La6:
            r2.append(r4)
            r0 = 93
            r2.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r2)
            goto L20
        Lb4:
            r0 = 0
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem.op(android.text.SpannableStringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1340390kz7 r18) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1340390kz7 c1340390kz7) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1340390kz7 c1340390kz7) {
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
    public static void Fp(com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem r9, android.graphics.Bitmap r10, android.text.SpannableStringBuilder r11, X.C419890GdH r12, int r13, int r14) {
        /*
            android.content.Context r1 = r9.getContext()
            com.bytedance.tux.input.TuxTextView r0 = r9.up()
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
            int r6 = r9.zp()
            int r7 = r9.zp()
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
            r0 = 940(0x3ac, float:1.317E-42)
            r2.<init>(r1, r0)
            r5.<init>(r6, r3, r2)
            r0 = 33
            X.C786410Ut5.q2(r11, r5, r13, r14, r0)
            X.C786410Ut5.q2(r11, r4, r13, r14, r0)
            com.bytedance.tux.input.TuxTextView r2 = r9.up()
            Y.ARunnableS75S0200000_6 r1 = new Y.ARunnableS75S0200000_6
            r0 = 150(0x96, float:2.1E-43)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem.Fp(com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem, android.graphics.Bitmap, android.text.SpannableStringBuilder, X.0GdH, int, int):void");
    }
}
