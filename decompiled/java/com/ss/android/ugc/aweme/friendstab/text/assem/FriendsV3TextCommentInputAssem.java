package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C0RSR;
import X.C0SDD;
import X.C0XQ7;
import X.C1209980ham;
import X.C1344410l5b;
import X.C1346240l8Y;
import X.C1347310lAH;
import X.C1351060lGK;
import X.C1357780lRA;
import X.C1386160mAw;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2214851BmN;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C452501pT;
import X.C523420Kfs;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC1346360l8k;
import X.InterfaceC1348780lCe;
import X.InterfaceC1351090lGN;
import X.InterfaceC1351180lGW;
import X.InterfaceC2217461Bqa;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
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
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3TextCommentInputAssem extends BasePanelUISlotComponent implements InterfaceC1348780lCe, FriendsV3CommentProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public InterfaceC1351180lGW LLJJJ;
    public int LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextCommentInputAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3TextCommentInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 203), AFwS259S0000000_21.get$arr$(160), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 567));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Cj0(Comment comment) {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cam;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Kn0(long j) {
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
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getSessionId() {
        return null;
    }

    public final Map<String, Object> ip() {
        C1351060lGK c1351060lGKLIZ;
        Pair[] pairArr = new Pair[5];
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        pairArr[0] = new Pair("enter_from", C1389300mG0.LIZ(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null));
        Aweme commentInputAweme = getCommentInputAweme();
        pairArr[1] = new Pair("author_id", commentInputAweme != null ? AwemeExtKt.getAuthorUid(commentInputAweme) : null);
        Aweme commentInputAweme2 = getCommentInputAweme();
        pairArr[2] = new Pair("group_id", commentInputAweme2 != null ? commentInputAweme2.getAid() : null);
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C0SDD c0sddOQ2 = ((FriendsV3TextFeedListViewModel) assemVMLazy.getValue()).OQ2();
        if (c0sddOQ2 == null || (c1351060lGKLIZ = c0sddOQ2.LJLIIL()) == null) {
            c1351060lGKLIZ = C1357780lRA.LIZ(null);
        }
        pairArr[3] = new Pair("visible_comment_cnt", Integer.valueOf((int) c1351060lGKLIZ.LIZ.total));
        pairArr[4] = new Pair(Scene.SCENE_SERVICE, "friends_exposed_comment");
        return C2097608Jq.LJIIIIZZ(pairArr);
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

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    @Override // X.InterfaceC1348780lCe
    public final Aweme getCommentInputAweme() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C0SDD c0sddOQ2 = ((FriendsV3TextFeedListViewModel) assemVMLazy.getValue()).OQ2();
        if (c0sddOQ2 != null) {
            return c0sddOQ2.getAweme();
        }
        return null;
    }

    public final void kp() {
        C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
        c1389890mGx.LJIIIZ(2131829223);
        c1389890mGx.LJIIJJI();
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

    @Override // X.InterfaceC1348780lCe
    public final String getEventType() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return C1389300mG0.LIZ(fragmentLJI != null ? C1578630rBN.LIZIZ(fragmentLJI) : null);
    }

    public final String hp() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6.getCid();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, this);
        super.onDestroy();
    }

    @Override // X.InterfaceC1348780lCe
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.FEED_QUICK_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final boolean I0(String str) {
        String aid;
        Aweme commentInputAweme = getCommentInputAweme();
        if (commentInputAweme != null) {
            aid = commentInputAweme.getAid();
        } else {
            aid = null;
        }
        return Intrinsics.LJFF(aid, str);
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS701S0100000_21(this, 1, 42), view);
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lJK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZLLL(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS600S0100000_21(this, 125), 24, null);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        String strLJII;
        if (comment == null) {
            return;
        }
        kp();
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
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJJJ;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        } else {
            strLJII = null;
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme, eventType, "click_friends_quick_panel", false, strLJII, comment.getImageList());
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        boolean z2;
        String awemeId;
        Aweme commentInputAweme;
        long commentCount;
        if (!this.LLILZ) {
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
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJJJ;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme3, eventType, "click_friends_quick_panel", true, strLJII, comment.getImageList());
        C2214851BmN.LJFF(6);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH) {
        String strLJII;
        c1347310lAH.LJIIJJI = false;
        c1347310lAH.LJIILLIIL = "friends_v3_text_post_detail";
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme = getCommentInputAweme();
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLJJJ;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        } else {
            strLJII = null;
        }
        commentServiceLIZ.LJLLLL(commentInputAweme, charSequence, eventType, "click_friends_quick_panel", i, c1347310lAH, strLJII);
    }
}
