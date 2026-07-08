package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0OB8;
import X.C0RSR;
import X.C0SDD;
import X.C0XQ7;
import X.C109100bB;
import X.C1209980ham;
import X.C1344410l5b;
import X.C1346240l8Y;
import X.C1347310lAH;
import X.C1351060lGK;
import X.C1351100lGO;
import X.C1351250lGd;
import X.C1357780lRA;
import X.C1386160mAw;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2214851BmN;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C523420Kfs;
import X.C704790Rkj;
import X.C705700RmC;
import X.C721230SQv;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1346360l8k;
import X.InterfaceC1348780lCe;
import X.InterfaceC1351090lGN;
import X.InterfaceC1351180lGW;
import X.InterfaceC1361270lWn;
import Y.ACListenerS48S0201000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentInputConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentInputAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3CommentInputAssem, InterfaceC1361270lWn> implements InterfaceC1348780lCe, FriendsV3ViewStateProtocol, FriendsV3CellTrackParamsProtocol, FriendsV3CommentProtocol {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 571));
    public InterfaceC1351180lGW LLJLIL;
    public int LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Cj0(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Kn0(long j) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cam;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void U71(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final int getCommentInputViewType() {
        return 2;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final String getEventType() {
        return "homepage_friends";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
    }

    public final Map<String, Object> tp() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "homepage_friends");
        Aweme commentInputAweme = getCommentInputAweme();
        pairArr[1] = new Pair("author_id", commentInputAweme != null ? AwemeExtKt.getAuthorUid(commentInputAweme) : null);
        Aweme commentInputAweme2 = getCommentInputAweme();
        pairArr[2] = new Pair("group_id", commentInputAweme2 != null ? commentInputAweme2.getAid() : null);
        pairArr[3] = new Pair("visible_comment_cnt", Integer.valueOf((int) sp().LIZ.total));
        pairArr[4] = new Pair(Scene.SCENE_SERVICE, "friends_exposed_comment");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cam, new AwS565S0100000_21(this, 572));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        boolean z = false;
        if (ur((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)) && LJJIJL().getVisibility() == 0) {
            z = true;
        }
        return C2097908Jt.LIZJ(new Pair("is_quick_comment_panel", C721230SQv.LIZ(Boolean.valueOf(z))));
    }

    @Override // X.InterfaceC1348780lCe
    public final Aweme getCommentInputAweme() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    public final C1351060lGK sp() {
        C0SDD c0sdd;
        C1351060lGK c1351060lGKLJLIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        return (!(obj instanceof C0SDD) || (c0sdd = (C0SDD) obj) == null || (c1351060lGKLJLIIL = c0sdd.LJLIIL()) == null) ? C1357780lRA.LIZ(null) : c1351060lGKLJLIIL;
    }

    public final void yp() {
        C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
        c1389890mGx.LJIIIZ(2131829223);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(LJJIJL());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Lw2() {
        if (C1386160mAw.LIZIZ(getCommentInputAweme())) {
            C339190DRl.LIZLLL(getContentView());
        } else {
            C337180DJs.LIZ(getContentView());
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final boolean checkCommentInputable() {
        Aweme commentInputAweme;
        AwemeControl awemeControl;
        return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (commentInputAweme = getCommentInputAweme()) != null && (awemeControl = commentInputAweme.getAwemeControl()) != null && awemeControl.canComment();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3ViewStateProtocol.class, this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC1348780lCe
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.FEED_QUICK_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final boolean I0(String str) {
        return Intrinsics.LJFF(getCommentInputAweme().getAid(), str);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishStart(Comment comment) {
        boolean z;
        String awemeId;
        if (comment == null) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null && awemeId2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || (awemeId = commentInputAweme.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C724240Sb0.LJI(this), C724240Sb0.LIZ(this));
        if (listLJJIZ != null) {
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).ei(comment);
            }
        }
        C0RSR c0rsr = new C0RSR(0, null);
        c0rsr.LIZJ = awemeId;
        C1440005kM.LIZ(c0rsr);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context = getContext();
        if (context != null && ((FriendsV3CommentInputConfig) C1351100lGO.LIZIZ.getValue()).enableEmoji) {
            C1351250lGd c1351250lGd = C1351250lGd.LIZ;
            Aweme commentInputAweme = getCommentInputAweme();
            c1351250lGd.getClass();
            List listLJ = C1351250lGd.LJ(context, commentInputAweme);
            this.LLJLILLLLZIIL = listLJ.size();
            if (((ViewGroup) this.LLJL.getValue()).getChildCount() > 0) {
                C786410Ut5.LJJJJJL((LinearLayout) this.LLJL.getValue());
            }
            int size = listLJ.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
                tuxTextView.LJJJJI(22.0f);
                tuxTextView.setGravity(17);
                tuxTextView.setText((CharSequence) ListProtector.get(listLJ, i2));
                C786410Ut5.h9(tuxTextView, new ACListenerS48S0201000_21(i2, this, listLJ, 0));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i2 < listLJ.size() - 1) {
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
                }
                ((ViewGroup) this.LLJL.getValue()).addView(tuxTextView, layoutParams);
            }
        }
        C786410Ut5.I7(new AbS701S0100000_21(this, 2, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        if (ur((InterfaceC1361270lWn) obj)) {
            C339190DRl.LIZLLL(getContentView());
        } else {
            C337180DJs.LIZ(getContentView());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public final boolean ur(InterfaceC1361270lWn interfaceC1361270lWn) {
        boolean z;
        if (C729510SjV.LJJIJIL(interfaceC1361270lWn.getAweme())) {
            return false;
        }
        C01GW c01gw = C1351100lGO.LIZIZ;
        if (((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy != 0 && (((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 2 || (((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 1 && sp().LJFF == 0))) {
            z = true;
        } else {
            z = false;
        }
        if (!(interfaceC1361270lWn instanceof C0SDD) || !C1386160mAw.LIZIZ(getCommentInputAweme()) || !z) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z && view.getVisibility() == 0) {
            C109100bB c109100bB = C109100bB.LIZ;
            Map mapLJIIL = C2097608Jq.LJIIL(tp(), C2097908Jt.LIZJ(new Pair("show_cnt", Integer.valueOf(this.LLJLILLLLZIIL))));
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_quick_comment_panel_show", mapLJIIL);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        String strLJII;
        if (comment == null) {
            return;
        }
        yp();
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C724240Sb0.LJI(this), C724240Sb0.LIZ(this));
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).vz(comment);
            }
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme = getCommentInputAweme();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJLIL;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        } else {
            strLJII = null;
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme, "homepage_friends", "click_friends_quick_panel", false, strLJII, comment.getImageList());
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        boolean z2;
        String awemeId;
        Aweme commentInputAweme;
        long commentCount;
        if (!this.LLJJIII) {
            return;
        }
        C1344410l5b.LIZ(comment);
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null && awemeId2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String strLJII = null;
        if (z2) {
            Aweme commentInputAweme2 = getCommentInputAweme();
            if (commentInputAweme2 == null || (awemeId = commentInputAweme2.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        C1440005kM.LIZ(new C1209980ham(3, new Object[]{awemeId, comment.m169clone()}));
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C724240Sb0.LJI(this), C724240Sb0.LIZ(this));
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).LO(comment);
            }
        }
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if ((iAwemeService != null && (commentInputAweme = iAwemeService.LLILZ(awemeId)) != null) || (commentInputAweme = getCommentInputAweme()) != null) {
            AwemeStatistics statistics = commentInputAweme.getStatistics();
            if (statistics != null) {
                commentCount = statistics.getCommentCount();
            } else {
                commentCount = 0;
                if (commentInputAweme != null) {
                }
            }
            C1440005kM.LIZ(new C737030Svd(awemeId, Long.valueOf(commentCount)));
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme3 = getCommentInputAweme();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJLIL;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme3, "homepage_friends", "click_friends_quick_panel", true, strLJII, comment.getImageList());
        C2214851BmN.LJFF(6);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH) {
        String strLJII;
        c1347310lAH.LJIIJJI = false;
        c1347310lAH.LJIILLIIL = "friends_v3_feeds";
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme = getCommentInputAweme();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJLIL;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        } else {
            strLJII = null;
        }
        commentServiceLIZ.LJLLLL(commentInputAweme, charSequence, "homepage_friends", "click_friends_quick_panel", i, c1347310lAH, strLJII);
    }
}
