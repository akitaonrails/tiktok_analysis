package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C07CD;
import X.C086I;
import X.C0BJP;
import X.C0BTX;
import X.C0HD5;
import X.C0HZQ;
import X.C1090570eUB;
import X.C123100dR;
import X.C1308910kAL;
import X.C1322510kWH;
import X.C1322560kWM;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1339470kxd;
import X.C1339790ky9;
import X.C1339950kyP;
import X.C1339960kyQ;
import X.C1340040kyY;
import X.C1340110kyf;
import X.C1340410kz9;
import X.C1340440kzC;
import X.C1341070l0D;
import X.C1341780l1M;
import X.C1344540l5o;
import X.C1345550l7R;
import X.C1350920lG6;
import X.C1401850maF;
import X.C1440005kM;
import X.C14EU;
import X.C1602160rnK;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1609500rzA;
import X.C19MB;
import X.C19ME;
import X.C2036007yI;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C294180Bg0;
import X.C294200Bg2;
import X.C294210Bg3;
import X.C296020Biy;
import X.C337180DJs;
import X.C461720I8s;
import X.C463050IDv;
import X.C563400M7u;
import X.C687700QyG;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1341650l19;
import X.InterfaceC1146704e9;
import X.InterfaceC1322530kWJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentSecondaryItemCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class CommentSecondaryItemCell<T> extends BaseCommentCell<C1340440kzC> implements InterfaceC1146704e9 {
    public ViewStub LLLLLZIL;
    public RemoteImageView LLLLLZL;
    public C1331100kk8 LLLLZ;
    public C1322560kWM LLLLZI;
    public boolean LLLLZIL;
    public TextView LLLLZLL;
    public View LLLLZLLIL;
    public View LLLLZLLLI;
    public View LLLZ;
    public Integer LLLZI;
    public boolean LLLZIIL;

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean I7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean L7() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final boolean T6() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void b7() {
        Aweme aliasAweme;
        Aweme aliasAweme2;
        Aweme aliasAweme3;
        Comment commentQ6;
        if (P5(false)) {
            if (C294180Bg0.LIZ() && (commentQ6 = q6()) != null && commentQ6.isUserBuried()) {
                return;
            }
            if (C07CD.LIZ() && K6()) {
                return;
            }
            Comment commentQ62 = q6();
            String aid = null;
            if (commentQ62 == null || commentQ62.getAliasAweme() == null) {
                BaseCommentCell.S7(this, q6(), "click_text", null, 12);
                C844470XAv.LIZ.getClass();
                if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                    Comment commentQ63 = q6();
                    if (!C1339790ky9.LIZ() || commentQ63 == null) {
                        return;
                    }
                    C1440005kM.LIZ(new C2036007yI(commentQ63));
                    return;
                }
                return;
            }
            Context context = getContext();
            if (context != null) {
                Comment commentQ64 = q6();
                if (TextUtils.isEmpty((commentQ64 == null || (aliasAweme3 = commentQ64.getAliasAweme()) == null) ? null : aliasAweme3.getAid())) {
                    return;
                }
                RemoteImageView remoteImageView = this.LLLLLZL;
                C1606420ruC c1606420ruCLIZ = remoteImageView != null ? C1607950rwf.LIZ(remoteImageView, remoteImageView.getWidth(), remoteImageView.getHeight()) : null;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
                smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ != null ? c1606420ruCLIZ.LJFF() : null);
                smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                Comment commentQ65 = q6();
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, (commentQ65 == null || (aliasAweme2 = commentQ65.getAliasAweme()) == null) ? null : aliasAweme2.getAid());
                smartRouteBuildRoute.withParam("refer", "comment");
                smartRouteBuildRoute.withParam("last_group_id", a6());
                smartRouteBuildRoute.open();
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                String strEnterFrom = CommentContextSourceKt.enterFrom(i6());
                String strA6 = a6();
                Comment commentQ66 = q6();
                String cid = commentQ66 != null ? commentQ66.getCid() : null;
                Comment commentQ67 = q6();
                if (commentQ67 != null && (aliasAweme = commentQ67.getAliasAweme()) != null) {
                    aid = aliasAweme.getAid();
                }
                c1350920lG6.getClass();
                C2344009Gk c2344009GkLJIIIZ = C1350920lG6.LJIIIZ(strEnterFrom, strA6);
                c2344009GkLJIIIZ.LJIIIIZZ("comment_id", cid);
                c2344009GkLJIIIZ.LJIIIIZZ("to_group_id", aid);
                C1350920lG6.LJJJ(c2344009GkLJIIIZ, "click_video_comment");
            }
        }
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    private final void u8() {
        Object next;
        String str;
        Integer num;
        Comment comment;
        User user;
        Comment comment2;
        CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct;
        String str2;
        Comment comment3;
        SmartImageView smartImageView = this.LLLF;
        if (smartImageView == null) {
            smartImageView = (SmartImageView) this.itemView.findViewById(R.id.lcl);
        }
        List listLIZ = C1340110kyf.LIZ();
        C1340440kzC c1340440kzC = (C1340440kzC) getItem();
        if ((c1340440kzC == null || (comment3 = c1340440kzC.LLILZIL) == null || comment3.getCmtUserBadgeInfoStruct() == null) && listLIZ != null) {
            C1340440kzC c1340440kzC2 = (C1340440kzC) getItem();
            if (Intrinsics.LJFF((c1340440kzC2 == null || (comment = c1340440kzC2.LLILZIL) == null || (user = comment.getUser()) == null) ? null : user.getUid(), C461720I8s.LIZIZ())) {
                Iterator it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct2 = (CmtUserBadgeInfoStruct) next;
                    if (cmtUserBadgeInfoStruct2 != null && (num = cmtUserBadgeInfoStruct2.level) != null && num.intValue() == 2) {
                        break;
                    }
                }
                CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct3 = (CmtUserBadgeInfoStruct) next;
                if (cmtUserBadgeInfoStruct3 != null && (str = cmtUserBadgeInfoStruct3.url) != null && C123100dR.LIZ(str)) {
                    if (smartImageView != null) {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                        c1331670kl3LJIIIZ.LJJ(smartImageView);
                        c1331670kl3LJIIIZ.LJIIL(new C463050IDv(this, 9));
                        return;
                    }
                    return;
                }
            }
        }
        C1340440kzC c1340440kzC3 = (C1340440kzC) getItem();
        if (c1340440kzC3 == null || (comment2 = c1340440kzC3.LLILZIL) == null || (cmtUserBadgeInfoStruct = comment2.getCmtUserBadgeInfoStruct()) == null || !C123100dR.LIZ(cmtUserBadgeInfoStruct.url) || (str2 = cmtUserBadgeInfoStruct.url) == null) {
            if (smartImageView != null) {
                smartImageView.setImageDrawable(null);
            }
        } else if (smartImageView != null) {
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ2.LJJ(smartImageView);
            c1331670kl3LJIIIZ2.LJIIL(new C463050IDv(this, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f8() {
        /*
            r5 = this;
            X.0l15 r2 = X.EnumC1341610l15.HATE
            boolean r0 = X.C294180Bg0.LIZ()
            r1 = 1
            r3 = 8
            r4 = 0
            if (r0 == 0) goto Lb8
            X.0zJl r0 = r5.getItem()
            X.0kzC r0 = (X.C1340440kzC) r0
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.LLILZIL
            if (r0 == 0) goto L77
            boolean r0 = r0.isUserBuried()
            if (r0 != r1) goto L77
            r5.T5()
            X.0lK2 r0 = r5.LLJJI
            if (r0 == 0) goto L28
            X.C786410Ut5.w(r0, r3)
        L28:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJJJIL
            if (r0 == 0) goto L2f
            X.C786410Ut5.LLLLZLL(r0, r4)
        L2f:
            com.bytedance.tux.input.TuxTextView r1 = r5.LLJJJIL
            if (r1 == 0) goto L38
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.B5(r1, r0)
        L38:
            r1 = 1
        L39:
            android.view.View r0 = r5.LLLLZLLLI
            if (r0 == 0) goto L68
            X.C786410Ut5.LJLLLLLL(r3, r0)
            boolean r0 = r5.K6()
            if (r0 == 0) goto L68
            android.view.View r0 = r5.LLLLZLLLI
            if (r0 == 0) goto L4d
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L4d:
            X.0lK2 r0 = r5.LLJJI
            if (r0 == 0) goto L54
            X.C786410Ut5.w(r0, r3)
        L54:
            X.0l15 r2 = X.EnumC1341610l15.FOLD
        L56:
            android.view.View r0 = r5.itemView
            r5.n7(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r5.LLLLLLLLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            android.view.View r0 = r5.itemView
            r5.z6(r0, r2)
            return
        L68:
            if (r1 != 0) goto L56
            android.view.View r0 = r5.itemView
            r5.n7(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r5.LLLLLLLLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            return
        L77:
            X.0zJl r0 = r5.getItem()
            X.0kzC r0 = (X.C1340440kzC) r0
            r1 = 0
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.LLILZIL
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.getText()
        L88:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L95
            X.0lK2 r0 = r5.LLJJI
            if (r0 == 0) goto L95
            X.C786410Ut5.w(r0, r4)
        L95:
            X.0lK2 r0 = r5.LLJJI
            if (r0 == 0) goto La2
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto La2
            r0 = -2
            r1.height = r0
        La2:
            X.0lK2 r0 = r5.LLJJI
            if (r0 == 0) goto La9
            X.C786410Ut5.g7(r0, r1)
        La9:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJJJIL
            if (r0 == 0) goto Lb0
            X.C786410Ut5.LLLLZLL(r0, r3)
        Lb0:
            com.bytedance.tux.input.TuxTextView r1 = r5.LLJJJIL
            if (r1 == 0) goto Lb8
            r0 = 0
            X.C786410Ut5.B5(r1, r0)
        Lb8:
            r1 = 0
            goto L39
        Lba:
            r0 = r1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentSecondaryItemCell.f8():void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void t7() {
        C337180DJs.LIZJ(this.LLJI);
    }

    public final void t8() {
        C1341070l0D.LIZ(this.LLLLZLL);
        if (C1339960kyQ.LIZ()) {
            View view = this.LLILZ;
            if (view == null || !(view instanceof ConstraintLayout)) {
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(R.id.xy6, 6);
            c19mb.LJI(R.id.xy6, 7);
            c19mb.LJI(R.id.tv_reply_to_reply, 7);
            boolean zLIZ = C0BTX.LIZ();
            int i = R.id.e_9;
            if (zLIZ && constraintLayout.findViewById(R.id.e_9) == null) {
                i = R.id.title;
            }
            c19mb.LJIIIIZZ(R.id.xy6, 6, i, 7);
            c19mb.LJJII(0.0f, R.id.xy6);
            c19mb.LJIIIIZZ(R.id.xy6, 7, R.id.tv_relation_label, 6);
            c19mb.LJIIIIZZ(R.id.tv_reply_to_reply, 7, R.id.jey, 6);
            c19mb.LIZIZ(constraintLayout);
        }
        TextView textView = this.LLLLZLL;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.g6(textView, layoutParams);
        }
    }

    public final void z8() {
        TextView textView = this.LLLLIIIILLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C1341070l0D.LIZ(this.LLLLZLL);
        if (C1339960kyQ.LIZ()) {
            Comment commentQ6 = q6();
            View view = this.LLILZ;
            if ((view instanceof ConstraintLayout) && commentQ6 != null && C1339960kyQ.LIZ()) {
                C19MB c19mb = new C19MB();
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                c19mb.LJII(constraintLayout);
                c19mb.LJI(R.id.xy6, 6);
                c19mb.LJI(R.id.xy6, 7);
                c19mb.LJIIIIZZ(R.id.xy6, 6, R.id.tv_reply_to_reply, 7);
                c19mb.LJIIIIZZ(R.id.xy6, 7, R.id.jey, 6);
                c19mb.LIZIZ(constraintLayout);
            }
        }
        View view2 = this.itemView;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS106S0100000_6(this, 268));
        }
        this.LLLZI = null;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0kWM] */
    public final void A8() {
        Aweme aliasAweme;
        Video video;
        UrlModel cover;
        List<String> urlList;
        C1331070kk5 hierarchy;
        Comment commentQ6 = q6();
        if (commentQ6 == null || commentQ6.getAliasAweme() == null) {
            RemoteImageView remoteImageView = this.LLLLLZL;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
                return;
            }
            return;
        }
        if (this.LLLLLZL == null) {
            ViewStub viewStub = this.LLLLLZIL;
            View viewLJLLLL = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
            this.LLLLLZL = viewLJLLLL instanceof RemoteImageView ? (RemoteImageView) viewLJLLLL : null;
        }
        RemoteImageView remoteImageView2 = this.LLLLLZL;
        if (remoteImageView2 != null) {
            C786410Ut5.l(remoteImageView2, 0);
        }
        Comment commentQ62 = q6();
        if (commentQ62 == null || (aliasAweme = commentQ62.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || urlList.isEmpty()) {
            return;
        }
        RemoteImageView remoteImageView3 = this.LLLLLZL;
        if (remoteImageView3 != null && (hierarchy = remoteImageView3.getHierarchy()) != null) {
            if (this.LLLLZ == null) {
                float fLIZIZ = C0HD5.LIZIZ(this.itemView, 2);
                this.LLLLZ = C1331100kk8.LIZIZ(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
            }
            hierarchy.LJJIII(this.LLLLZ);
        }
        RemoteImageView remoteImageView4 = this.LLLLLZL;
        if (remoteImageView4 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, this.itemView.getContext());
            remoteImageView4.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        if (this.LLLLZI == null) {
            this.LLLLZI = new InterfaceC1322530kWJ(this) { // from class: X.0kWM
                public final /* synthetic */ CommentSecondaryItemCell<Object> LL;

                @Override // X.InterfaceC1322530kWJ
                public final void onSuccess() {
                }

                /* JADX WARN: Type inference failed for: r0v10, types: [REQUEST, X.0kbR] */
                @Override // X.InterfaceC1322530kWJ
                public final void onFail() {
                    C1331070kk5 hierarchy2;
                    RemoteImageView remoteImageView5 = this.LL.LLLLLZL;
                    if (remoteImageView5 != null && (hierarchy2 = remoteImageView5.getHierarchy()) != null) {
                        hierarchy2.LJIIZILJ(InterfaceC1320380kSq.LJFF);
                    }
                    RemoteImageView remoteImageView6 = this.LL.LLLLLZL;
                    if (remoteImageView6 != null) {
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        RemoteImageView remoteImageView7 = this.LL.LLLLLZL;
                        c1320810kTXLIZJ.LJIILJJIL = remoteImageView7 != null ? remoteImageView7.getController() : null;
                        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.afg);
                        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                        imageDecodeOptionsBuilder.getClass();
                        c1325700kbQLIZJ.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                        c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZJ.LIZ();
                        remoteImageView6.setController(c1320810kTXLIZJ.LIZ());
                    }
                }

                {
                    this.LL = this;
                }
            };
        }
        RemoteImageView remoteImageView5 = this.LLLLLZL;
        UrlModel cover2 = video != null ? video.getCover() : null;
        C1322560kWM c1322560kWM = this.LLLLZI;
        if (C086I.LIZIZ(cover2.getUrlList()) && TextUtils.isEmpty(cover2.getUri())) {
            return;
        }
        C1322510kWH c1322510kWH = new C1322510kWH(remoteImageView5, cover2, c1322560kWM);
        c1322510kWH.LJIIIZ = true;
        c1322510kWH.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onDestroy() {
        super.onDestroy();
        if (C0BJP.LIZ()) {
            if (this.LLLFF) {
                EventBus.LIZLLL().LJJI(this);
                this.LLLFF = false;
                return;
            }
            return;
        }
        if (this.LLLZIIL) {
            EventBus.LIZLLL().LJJI(this);
            this.LLLZIIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        C1345550l7R c1345550l7R;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onItemViewCreated();
        this.LLLLLZIL = (ViewStub) this.itemView.findViewById(R.id.video_cover_viewstub);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_reply_to_reply);
        this.LLLLZLL = textView;
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, textView, EnumC1341650l19.USERNAME, 0.0f, null, 12);
        this.LLLLZLLIL = this.itemView.findViewById(R.id.t7p);
        TextView textView2 = this.LLLLZLL;
        if (textView2 != null) {
            C786410Ut5.I7(new C1401850maF(this, 17), textView2);
        }
        this.itemView.findViewById(R.id.bsx);
        C1609500rzA c1609500rzA = this.LLJI;
        if (c1609500rzA != null) {
            c1609500rzA.setRingStrokeWidthByAvatarSize(24);
        }
        C1609500rzA c1609500rzA2 = this.LLJI;
        if (c1609500rzA2 != null) {
            ViewGroup.LayoutParams layoutParams = c1609500rzA2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.j_);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            C786410Ut5.W5(c1609500rzA2, layoutParams);
        }
        if (C0BJP.LIZ()) {
            this.LLLF = (SmartImageView) this.itemView.findViewById(R.id.lcl);
        }
        if (C296020Biy.LIZ() && (c1345550l7R = this.LLJJJ) != null) {
            ViewGroup.LayoutParams layoutParams2 = c1345550l7R.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = C0HD5.LIZ(c1345550l7R, 4);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1345550l7R);
                c1345550l7R.setLayoutParams(marginLayoutParams);
            }
        }
        if (C07CD.LIZ()) {
            this.LLLLZLLLI = C1090570eUB.LIZ(R.id.mhx, R.id.ndc, this.itemView);
        }
        this.LLLZ = this.itemView.findViewById(R.id.t7g);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (C0BJP.LIZ()) {
            if (this.LLLFF) {
                EventBus.LIZLLL().LJJI(this);
                this.LLLFF = false;
                return;
            }
            return;
        }
        if (this.LLLZIIL) {
            EventBus.LIZLLL().LJJI(this);
            this.LLLZIIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void a7(boolean z) {
        String aid;
        C1606420ruC c1606420ruCLIZ;
        Bundle bundleLJFF;
        String aid2;
        String cid;
        Aweme aliasAweme;
        Aweme aliasAweme2;
        Aweme aliasAweme3;
        if (J6()) {
            Comment commentQ6 = q6();
            String aid3 = null;
            if (commentQ6 != null && commentQ6.getAliasAweme() != null) {
                Context context = getContext();
                if (context != null) {
                    Comment commentQ62 = q6();
                    if (commentQ62 != null && (aliasAweme3 = commentQ62.getAliasAweme()) != null) {
                        aid = aliasAweme3.getAid();
                    } else {
                        aid = null;
                    }
                    if (!TextUtils.isEmpty(aid)) {
                        RemoteImageView remoteImageView = this.LLLLLZL;
                        if (remoteImageView != null) {
                            c1606420ruCLIZ = C1607950rwf.LIZ(remoteImageView, remoteImageView.getWidth(), remoteImageView.getHeight());
                        } else {
                            c1606420ruCLIZ = null;
                        }
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
                        if (c1606420ruCLIZ != null) {
                            bundleLJFF = c1606420ruCLIZ.LJFF();
                        } else {
                            bundleLJFF = null;
                        }
                        smartRouteBuildRoute.withBundleAnimation(bundleLJFF);
                        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                        Comment commentQ63 = q6();
                        if (commentQ63 != null && (aliasAweme2 = commentQ63.getAliasAweme()) != null) {
                            aid2 = aliasAweme2.getAid();
                        } else {
                            aid2 = null;
                        }
                        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aid2);
                        smartRouteBuildRoute.withParam("refer", "comment");
                        smartRouteBuildRoute.withParam("last_group_id", a6());
                        smartRouteBuildRoute.open();
                        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                        String strEnterFrom = CommentContextSourceKt.enterFrom(i6());
                        String strA6 = a6();
                        Comment commentQ64 = q6();
                        if (commentQ64 != null) {
                            cid = commentQ64.getCid();
                        } else {
                            cid = null;
                        }
                        Comment commentQ65 = q6();
                        if (commentQ65 != null && (aliasAweme = commentQ65.getAliasAweme()) != null) {
                            aid3 = aliasAweme.getAid();
                        }
                        c1350920lG6.getClass();
                        C2344009Gk c2344009GkLJIIIZ = C1350920lG6.LJIIIZ(strEnterFrom, strA6);
                        c2344009GkLJIIIZ.LJIIIIZZ("comment_id", cid);
                        c2344009GkLJIIIZ.LJIIIIZZ("to_group_id", aid3);
                        C1350920lG6.LJJJ(c2344009GkLJIIIZ, "click_video_comment");
                        return;
                    }
                    return;
                }
                return;
            }
            if (z) {
                u7();
                Comment commentQ66 = q6();
                if (commentQ66 != null) {
                    CommentManagementAssemVM commentManagementAssemVMF6 = f6();
                    ((HashMap) commentManagementAssemVMF6.LL).put(commentQ66.getCid(), commentQ66);
                    commentManagementAssemVMF6.setState(new AwS597S0100000_18(commentManagementAssemVMF6, 1104));
                    return;
                }
                return;
            }
            p7();
            Comment commentQ67 = q6();
            if (commentQ67 == null) {
                return;
            }
            CommentManagementAssemVM commentManagementAssemVMF62 = f6();
            ((HashMap) commentManagementAssemVMF62.LL).remove(commentQ67.getCid());
            commentManagementAssemVMF62.setState(new AwS597S0100000_18(commentManagementAssemVMF62, 1105));
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public void h7(boolean z) {
        Aweme aliasAweme;
        boolean z2;
        C1340410kz9 c1340410kz9;
        C1340040kyY c1340040kyY;
        TuxTextView tuxTextView;
        int i;
        Comment commentQ6 = q6();
        if (commentQ6 != null) {
            aliasAweme = commentQ6.getAliasAweme();
        } else {
            aliasAweme = null;
        }
        if (aliasAweme != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            U5();
            TuxTextView tuxTextView2 = this.LLLII;
            if (tuxTextView2 != null) {
                C786410Ut5.h9(tuxTextView2, null);
            }
            TuxTextView tuxTextView3 = this.LLLII;
            if (tuxTextView3 != null) {
                tuxTextView3.setClickable(false);
            }
        }
        C0HZQ c0hzq = this.LLLILZ;
        if (c0hzq != null) {
            if (z) {
                if (!z2) {
                    i = 0;
                } else {
                    i = 4;
                }
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLZ(c0hzq, i);
        }
        if (z) {
            C1345550l7R c1345550l7R = this.LLJJJ;
            if (c1345550l7R != null) {
                int visibility = c1345550l7R.getVisibility();
                c1345550l7R.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1345550l7R);
            }
            TuxTextView tuxTextView4 = this.LLLIIL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 8);
            }
        } else {
            C1340440kzC c1340440kzC = (C1340440kzC) getItem();
            if (c1340440kzC != null && (c1340410kz9 = c1340440kzC.LLILZLL) != null && (c1340040kyY = c1340410kz9.LJ) != null && c1340040kyY.LIZ == 2) {
                if (!this.LLLLZIL) {
                    z7();
                }
                if (!J6() && (tuxTextView = this.LLLIIL) != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            }
            p7();
            TuxTextView tuxTextView5 = this.LLLII;
            if (tuxTextView5 != null) {
                C786410Ut5.h9(tuxTextView5, new ACListenerS155S0100000_21(this, 53));
            }
        }
        x8(z);
        X5();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final View m7(ViewGroup viewGroup) {
        C1344540l5o c1344540l5o = C1344540l5o.LIZ;
        Context context = viewGroup.getContext();
        c1344540l5o.getClass();
        if (C294200Bg2.LIZJ()) {
            int iLIZIZ = ((C563400M7u) C1344540l5o.LJIIL.getValue()).LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReplyCellCreated  ");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iLIZIZ <= 1) {
                C786410Ut5.LJJZZIII((Handler) C1344540l5o.LJIILJJIL.getValue(), new ARunnableS121S0100000_21(context, 130));
            }
        }
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a30, viewGroup, false);
    }

    @C14EU
    public final void onDiggUpdate(C1339950kyP c1339950kyP) {
        C1340440kzC c1340440kzC;
        Comment comment;
        C1340440kzC c1340440kzC2;
        C1340410kz9 c1340410kz9;
        boolean z;
        boolean z2;
        boolean z3;
        if (!C0BJP.LIZ() && (c1340440kzC = (C1340440kzC) getItem()) != null && (comment = c1340440kzC.LLILZIL) != null && Intrinsics.LJFF(c1339950kyP.LIZ, comment.getCid())) {
            boolean z4 = false;
            if (c1339950kyP.LIZ.length() != 0 && (c1340440kzC2 = (C1340440kzC) getItem()) != null && (c1340410kz9 = c1340440kzC2.LLILZLL) != null) {
                boolean z5 = c1340410kz9.LIZIZ;
                int i = c1339950kyP.LIZIZ;
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z5 != z) {
                    comment.setUserDigged(i);
                    comment.setDiggCount(c1339950kyP.LIZJ);
                    comment.isAuthorDigged = c1339950kyP.LJ;
                    C1345550l7R c1345550l7R = this.LLJJJ;
                    if (c1345550l7R != null) {
                        if (c1339950kyP.LIZIZ == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c1345550l7R.LJIIJ(Boolean.valueOf(z3), Boolean.valueOf(c1339950kyP.LJ), Integer.valueOf(c1339950kyP.LIZJ), true, true);
                    }
                }
                boolean z6 = c1340410kz9.LIZJ;
                int i2 = c1339950kyP.LIZLLL;
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z6 != z2) {
                    comment.setUserBuried(i2);
                    C1345550l7R c1345550l7R2 = this.LLJJJ;
                    if (c1345550l7R2 != null) {
                        if (c1339950kyP.LIZLLL == 1) {
                            z4 = true;
                        }
                        c1345550l7R2.LJIIIZ(Boolean.valueOf(z4));
                    }
                }
                c8();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: r8, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C1340440kzC r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentSecondaryItemCell.onBindItemView(X.0kzC):void");
    }

    public final void x8(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int dimension;
        float dimension2;
        int dimension3;
        int dimension4;
        View view = this.LLLZ;
        if (view != null && view.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                Resources resources = view.getContext().getResources();
                if (C294210Bg3.LIZ()) {
                    dimension = ((int) resources.getDimension(R.dimen.jh)) + ((int) resources.getDimension(R.dimen.jb));
                    dimension2 = resources.getDimension(R.dimen.jf);
                } else {
                    dimension = ((int) resources.getDimension(R.dimen.jh)) + ((((int) resources.getDimension(R.dimen.j_)) + ((int) resources.getDimension(R.dimen.jb))) / 2);
                    dimension2 = resources.getDimension(R.dimen.je);
                }
                marginLayoutParams.topMargin = dimension + ((int) dimension2);
                Resources resources2 = view.getContext().getResources();
                if (C294210Bg3.LIZ()) {
                    dimension3 = ((int) resources2.getDimension(R.dimen.jg)) + ((int) resources2.getDimension(R.dimen.ja));
                    dimension4 = ((int) resources2.getDimension(R.dimen.jb)) / 2;
                } else {
                    dimension3 = ((int) resources2.getDimension(R.dimen.jg)) + ((int) resources2.getDimension(R.dimen.ja));
                    dimension4 = ((int) resources2.getDimension(R.dimen.j_)) / 2;
                }
                int dimension5 = dimension3 + dimension4;
                if (z) {
                    dimension5 += ((int) resources2.getDimension(R.dimen.jd)) + ((int) resources2.getDimension(R.dimen.jc));
                }
                marginLayoutParams.setMarginStart(dimension5);
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell
    public final void p8(int i, boolean z) {
        String replyToUserName;
        super.p8(i, z);
        if (q6() != null && C1339960kyQ.LIZ() && i == 2) {
            Comment commentQ6 = q6();
            String replyToReplyCommentId = null;
            if (commentQ6 != null) {
                replyToUserName = commentQ6.getReplyToUserName();
            } else {
                replyToUserName = null;
            }
            if (C123100dR.LIZ(replyToUserName)) {
                Comment commentQ62 = q6();
                if (commentQ62 != null) {
                    replyToReplyCommentId = commentQ62.getReplyToReplyCommentId();
                }
                if (!TextUtils.equals(CardStruct.IStatusCode.DEFAULT, replyToReplyCommentId)) {
                    z8();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: s8, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(C1340440kzC c1340440kzC, List<? extends Object> list) throws Throwable {
        super.onBindItemView(c1340440kzC, list);
        for (Object obj : list) {
            if (!(obj instanceof C1339470kxd)) {
                return;
            }
            C1339470kxd c1339470kxd = (C1339470kxd) obj;
            if (c1339470kxd.LJIILIIL) {
                if (C0BJP.LIZ()) {
                    x7(2);
                } else {
                    u8();
                }
            }
            if (c1339470kxd.LJIILLIIL) {
                f8();
            }
            if (c1339470kxd.LJIIZILJ) {
                if (c1340440kzC.LLILZLL.LJIJJ) {
                    View view = this.LLLZ;
                    if (view != null) {
                        C337180DJs.LIZJ(view);
                    }
                } else {
                    View view2 = this.LLLZ;
                    if (view2 != null) {
                        C337180DJs.LIZ(view2);
                    }
                }
                x8(J6());
            }
        }
    }
}
