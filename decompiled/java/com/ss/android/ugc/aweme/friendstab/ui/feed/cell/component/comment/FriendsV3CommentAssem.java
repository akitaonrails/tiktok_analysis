package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment;

import X.C01GW;
import X.C09RD;
import X.C0B70;
import X.C0OAD;
import X.C0OB8;
import X.C0Q4Y;
import X.C0RJN;
import X.C0SDD;
import X.C10EU;
import X.C123100dR;
import X.C1340390kz7;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1349800lEI;
import X.C1351060lGK;
import X.C1351070lGL;
import X.C1351100lGO;
import X.C1354720lME;
import X.C1357780lRA;
import X.C1386160mAw;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C19719612Di;
import X.C19EG;
import X.C2097608Jq;
import X.C278590Avx;
import X.C296440Bje;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C523420Kfs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C814420VxA;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.InterfaceC1361270lWn;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentAvatarConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentInputConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3CommentAssem extends BaseFriendsV3CellContentAssem<FriendsV3CommentAssem, InterfaceC1361270lWn> implements FriendsV3FeedCommentAbility, FriendsV3ViewStateProtocol, FriendsV3CommentProtocol, FriendsV3CellTrackParamsProtocol {
    public static final /* synthetic */ int LLJLLIL = 0;
    public long LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public int LLJLIL;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1450));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 568));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1451));
    public final List<Function2<View, Boolean, Unit>> LLJLILLLLZIIL = new ArrayList();
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1449));

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("is_with_comment", Boolean.valueOf(kp() > 0));
        pairArr[1] = new Pair("exposed_comment_cnt", Integer.valueOf(kp()));
        pairArr[2] = new Pair("click_vm_num", Integer.valueOf(this.LLJLIL));
        pairArr[3] = new Pair("is_view_more", Boolean.valueOf(((View) this.LLJJJJLIIL.getValue()).getVisibility() == 0));
        pairArr[4] = new Pair("is_unfold_comment", Boolean.valueOf(hp().LIZJ));
        pairArr[5] = new Pair("comment_duration_ms", Long.valueOf(this.LLJJLIIIJLLLLLLLZ));
        Map<String, Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        this.LLJJLIIIJLLLLLLLZ = 0L;
        this.LLJL = 0L;
        this.LLJLIL = 0;
        return mapLJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Lw2() {
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        return true;
    }

    public final Aweme cp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ep() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
    }

    public final C1351060lGK hp() {
        C0SDD c0sdd;
        C1351060lGK c1351060lGKLJLIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        return (!(obj instanceof C0SDD) || (c0sdd = (C0SDD) obj) == null || (c1351060lGKLJLIIL = c0sdd.LJLIIL()) == null) ? C1357780lRA.LIZ(null) : c1351060lGKLJLIIL;
    }

    public final void up() {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        VideoItemParams videoItemParams;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        if (obj instanceof VideoItemParams) {
            VideoItemParams videoItemParams2 = (VideoItemParams) obj;
            int i = -1;
            if (videoItemParams2 == null || videoItemParams2.currentPosition == -1 || (friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLJJL.getValue()) == null) {
                return;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            Object obj2 = c724270Sb32 != null ? c724270Sb32.LL : null;
            if ((obj2 instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) obj2) != null) {
                i = videoItemParams.currentPosition;
            }
            friendsV3FeedListAbility.J42(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        List listSingletonList = Collections.singletonList(ep());
        C09RD c09rd = new C09RD(ep());
        ArrayList arrayList = new ArrayList(listSingletonList.size() + 10);
        arrayList.addAll(listSingletonList);
        C19719612Di.LJJIFFI(arrayList, c09rd);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility
    public final Aweme Bx1() {
        return cp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ep().onViewDetachedFromWindow(ep());
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), FriendsV3FeedCommentAbility.class, null);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, this);
        }
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
        ((ArrayList) this.LLJLILLLLZIIL).clear();
    }

    public final List<Comment> dp() {
        List<Comment> list = hp().LIZ.items;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        hp().LIZ.items = arrayList;
        return arrayList;
    }

    public final List<C1340390kz7> ip() {
        List listLL = C13LP.LL(lp(), kp());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1340390kz7((Comment) it2.next()));
        }
        return arrayList;
    }

    public final int kp() {
        return hp().LIZIZ;
    }

    public final List<Comment> lp() {
        List<Comment> listDp = dp();
        ArrayList arrayList = new ArrayList();
        for (Comment comment : listDp) {
            comment.setCommentType(1);
            List<Comment> replyComments = comment.getReplyComments();
            if (replyComments != null) {
                for (Comment comment2 : replyComments) {
                    comment2.setCommentType(2);
                    User user = comment.getUser();
                    if (user != null) {
                        String replyToUserId = comment2.getReplyToUserId();
                        if (!Boolean.valueOf(C123100dR.LIZ(replyToUserId)).booleanValue() || replyToUserId == null) {
                            replyToUserId = user.getUid();
                        }
                        comment2.setReplyToUserId(replyToUserId);
                        String replyToUserName = comment2.getReplyToUserName();
                        if (!Boolean.valueOf(C123100dR.LIZ(replyToUserName)).booleanValue() || replyToUserName == null) {
                            replyToUserName = user.getUniqueId();
                        }
                        comment2.setReplyToUserName(replyToUserName);
                        String replyToNickName = comment2.getReplyToNickName();
                        if (!Boolean.valueOf(C123100dR.LIZ(replyToNickName)).booleanValue() || replyToNickName == null) {
                            replyToNickName = user.getNickname();
                        }
                        comment2.setReplyToNickName(replyToNickName);
                    }
                }
            } else {
                replyComments = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(C13LP.LJLIL(replyComments, Collections.singletonList(comment)), arrayList);
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, FriendsV3FeedCommentAbility.class, null, null);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public final void op() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || !fragmentLJI.isResumed()) {
            hp().LIZLLL = true;
        }
    }

    public final void sp() {
        CommentStruct adCommentStruct;
        long jKp = kp();
        CommentService.LIZ.getClass();
        long j = 0;
        if (!C523420Kfs.LIZ().LJIILLIIL(cp()) && !C0OAD.LIZIZ(cp())) {
            AwemeStatistics statistics = cp().getStatistics();
            long commentCount = statistics != null ? statistics.getCommentCount() : 0L;
            CommentStruct commentStructLLIILII = C523420Kfs.LIZ().LLIILII(cp());
            AwemeStatistics statistics2 = cp().getStatistics();
            if (statistics2 != null && Long.valueOf(statistics2.getCommentCount()) != null) {
                j = (commentStructLLIILII != null || (AwemeExtKt.getAdCommentStruct(cp()) != null && (commentCount > 0 || ((adCommentStruct = AwemeExtKt.getAdCommentStruct(cp())) != null && adCommentStruct.showAsDefault())))) ? commentCount + 1 : commentCount;
            }
        }
        long size = ((ArrayList) lp()).size();
        if (j < size) {
            j = size;
        }
        if (jKp >= j) {
            C337180DJs.LIZ((View) this.LLJJJJLIIL.getValue());
        } else if (C296440Bje.LIZ() && (kp() == 0 || hp().LJ)) {
            C337180DJs.LIZ((View) this.LLJJJJLIIL.getValue());
        } else {
            C337180DJs.LIZJ((View) this.LLJJJJLIIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility
    public final void BF0(Comment comment) {
        C0RJN c0rjnLIZIZ;
        Object obj;
        C0RJN c0rjnLIZIZ2;
        C0RJN c0rjnLIZIZ3;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        if (((Boolean) C0B70.LIZ.getValue()).booleanValue() && AwemeExtKt.isProhibited(cp())) {
            C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
            c1389890mGx.LJIIIZ(2131829184);
            c1389890mGx.LJIIJJI();
            return;
        }
        if (!C1386160mAw.LIZIZ(cp())) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(LJJIJL());
            if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(cp()))) {
                i = 2131829191;
            } else {
                i = 2131829192;
            }
            c1389890mGx2.LJIIIZ(i);
            c1389890mGx2.LJIIJJI();
            return;
        }
        C0RJN c0rjnLIZIZ4 = null;
        if (((Boolean) C278590Avx.LIZ.getValue()).booleanValue()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((C0OB8) obj).getAweme();
            if (aweme != null) {
                CommentService.LIZ.getClass();
                CommentService commentServiceLIZ = C523420Kfs.LIZ();
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI2);
                } else {
                    c0rjnLIZIZ2 = null;
                }
                c1349800lEI.setEnterFrom(C1389300mG0.LIZ(c0rjnLIZIZ2));
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 != null) {
                    c0rjnLIZIZ3 = C1578630rBN.LIZIZ(fragmentLJI3);
                } else {
                    c0rjnLIZIZ3 = null;
                }
                c1349800lEI.setEventType(C1389300mG0.LIZ(c0rjnLIZIZ3));
                if (!aweme.isCmtSwt()) {
                    z = true;
                } else {
                    z = false;
                }
                c1349800lEI.setEnableComment(z);
                c1349800lEI.setCommentClose(C523420Kfs.LIZ().LJIILLIIL(aweme));
                if (C523420Kfs.LIZ().LJIILLIIL(aweme) && !C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1349800lEI.setCommentLimited(z2);
                c1349800lEI.setLocatePageType(1);
                c1349800lEI.setAuthorUid(AwemeExtKt.getAuthorUid(aweme));
                c1349800lEI.setEnterMethod("click_exposed_comment");
                Fragment fragmentLJI4 = C724240Sb0.LJI(this);
                if (fragmentLJI4 != null) {
                    c0rjnLIZIZ4 = C1578630rBN.LIZIZ(fragmentLJI4);
                }
                c1349800lEI.setVideoFrom(C1389300mG0.LIZ(c0rjnLIZIZ4));
                c1349800lEI.setNavigationBarAutoColorOnHide(true);
                c1349800lEI.setFriendsV3Feed(true);
                c1349800lEI.setFriendsV3TrackScene(C1389300mG0.LIZIZ(C724240Sb0.LJI(this)));
                String cid = comment.getCid();
                if (comment.getCommentType() == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1349800lEI.setInsertCids(cid, z3, false);
                c1349800lEI.setHighlightCids(comment.getCid());
                c1349800lEI.setFirstRefreshCount(C1351070lGL.LIZ());
                c1349800lEI.setSmoothScrollToHighlightComment(true);
                c1349800lEI.setHighlightWithoutScroll(true);
                c1349800lEI.forceRefresh(hp().LIZLLL);
                c1349800lEI.setNeedShowMask(true);
                commentServiceLIZ.LJJL(c19egLIZ, fragmentLJI, aweme, c1349800lEI);
                hp().LIZLLL = false;
                return;
            }
            return;
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ2 = C523420Kfs.LIZ();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        Fragment fragmentLJI5 = C724240Sb0.LJI(this);
        Aweme awemeCp = cp();
        Fragment fragmentLJI6 = C724240Sb0.LJI(this);
        if (fragmentLJI6 != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI6);
        } else {
            c0rjnLIZIZ = null;
        }
        String strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
        Fragment fragmentLJI7 = C724240Sb0.LJI(this);
        if (fragmentLJI7 != null) {
            c0rjnLIZIZ4 = C1578630rBN.LIZIZ(fragmentLJI7);
        }
        InterfaceC737440SwI interfaceC737440SwILJLJJL = commentServiceLIZ2.LJLJJL(c19egLIZ2, fragmentLJI5, awemeCp, comment, strLIZ, "click_exposed_comment", C1389300mG0.LIZ(c0rjnLIZIZ4), new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.FEED_QUICK_COMMENT, 0, EnumC1341680l1C.TEXT, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, "", null, C1389300mG0.LIZIZ(C724240Sb0.LJI(this)), null, ""), false), null);
        if (interfaceC737440SwILJLJJL != null) {
            interfaceC737440SwILJLJJL.e6(new AwS565S0100000_21(interfaceC737440SwILJLJJL, 569));
            interfaceC737440SwILJLJJL.sp(new AwS565S0100000_21(interfaceC737440SwILJLJJL, 570));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Cj0(Comment comment) {
        Comment next;
        if (comment.getCommentType() == 1) {
            Iterator<Comment> it2 = dp().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getCid(), comment.getCid())) {
                    return;
                }
            }
            op();
            ListProtector.add(dp(), 0, comment);
            tp(kp() + 1);
            mp(true);
            up();
            return;
        }
        Iterator it3 = ((ArrayList) lp()).iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(((Comment) it3.next()).getCid(), comment.getDirectReplyCid())) {
                Iterator<Comment> it4 = dp().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (Intrinsics.LJFF(next.getCid(), comment.getRootCommentId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Comment comment2 = next;
                if (comment2 != null) {
                    List<Comment> replyComments = comment2.getReplyComments();
                    if (replyComments == null) {
                        replyComments = new ArrayList<>();
                    }
                    Iterator<Comment> it5 = replyComments.iterator();
                    while (it5.hasNext()) {
                        if (Intrinsics.LJFF(it5.next().getCid(), comment.getCid())) {
                            return;
                        }
                    }
                    op();
                    ListIterator<Comment> listIterator = replyComments.listIterator(replyComments.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Comment commentPrevious = listIterator.previous();
                        Iterator it6 = ((ArrayList) ip()).iterator();
                        while (it6.hasNext()) {
                            if (Intrinsics.LJFF(((C1340390kz7) it6.next()).LLILLJJLI.getCid(), commentPrevious.getCid())) {
                                int iNextIndex = listIterator.nextIndex();
                                if (iNextIndex != -1) {
                                    ListProtector.add(replyComments, iNextIndex + 1, comment);
                                }
                            }
                        }
                    }
                    replyComments.add(comment);
                    comment2.setReplyComments(replyComments);
                    comment2.setReplyCommentTotal(comment2.getReplyCommentTotal() + 1);
                }
                Iterator it7 = ((ArrayList) ip()).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    } else if (Intrinsics.LJFF(((C1340390kz7) it7.next()).LLILLJJLI.getCid(), comment.getDirectReplyCid())) {
                        tp(kp() + 1);
                        break;
                    }
                }
                mp(true);
                up();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final boolean I0(String str) {
        return Intrinsics.LJFF(cp().getAid(), str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Kn0(long j) {
        AwemeStatistics statistics = cp().getStatistics();
        if (statistics != null) {
            statistics.setCommentCount(j);
        }
        hp().LIZ.total = j;
        sp();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility
    public final void Nc2(Function2<? super View, ? super Boolean, Unit> function2) {
        ((ArrayList) this.LLJLILLLLZIIL).remove(function2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00af, code lost:
    
        continue;
     */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U71(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem.U71(java.lang.String):void");
    }

    public final void mp(boolean z) {
        if (z) {
            if (kp() != 1) {
                return;
            }
            this.LLJL = System.currentTimeMillis();
        } else if (kp() == 0 && this.LLJL > 0) {
            this.LLJJLIIIJLLLLLLLZ += System.currentTimeMillis() - this.LLJL;
            this.LLJL = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility
    public final Pair<Integer, Integer> mr2(Comment comment) {
        int i = 0;
        int i2 = -1;
        if (comment.getCommentType() == 1) {
            Iterator<Comment> it2 = dp().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().getCid(), comment.getCid())) {
                    i2 = i;
                    break;
                }
                i++;
            }
            return new Pair<>(Integer.valueOf(i2), -1);
        }
        Iterator<Comment> it3 = dp().iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it3.next().getCid(), comment.getRootCommentId())) {
                if (i3 > 0) {
                    List<Comment> replyComments = ((Comment) ListProtector.get(dp(), i3)).getReplyComments();
                    if (replyComments != null) {
                        Iterator<Comment> it4 = replyComments.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(it4.next().getCid(), comment.getCid())) {
                                i2 = i;
                                break;
                            }
                            i++;
                        }
                    }
                    return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
                }
            } else {
                i3++;
            }
        }
        return new Pair<>(-1, -1);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvEp = ep();
        CommentService.LIZ.getClass();
        viewOnAttachStateChangeListenerC20604515jvEp.LJIILJJIL(C523420Kfs.LIZ().LJJLIIIJL());
        viewOnAttachStateChangeListenerC20604515jvEp.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jvEp.setNestedScrollingEnabled(false);
        viewOnAttachStateChangeListenerC20604515jvEp.LIZLLL((View) this.LLJJJJLIIL.getValue());
        viewOnAttachStateChangeListenerC20604515jvEp.onViewAttachedToWindow(viewOnAttachStateChangeListenerC20604515jvEp);
        viewOnAttachStateChangeListenerC20604515jvEp.getState().LIZLLL = C0Q4Y.BUFFER;
        C01GW c01gw = C1351100lGO.LIZIZ;
        int i = 2;
        if (((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 2 || ((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 1) {
            viewOnAttachStateChangeListenerC20604515jvEp.setItemAnimator(null);
        }
        if (C1354720lME.LIZ()) {
            if (!((FriendsV3CommentAvatarConfig) C1354720lME.LIZIZ.getValue()).enableCommentAvatar) {
                i = 4;
            }
            C426750GoL.LJIIIZ(viewOnAttachStateChangeListenerC20604515jvEp, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, null, false, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[PHI: r0
      0x0077: PHI (r0v37 int) = (r0v36 int), (r0v45 int) binds: [B:46:0x013d, B:21:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem.up(java.lang.Object):void");
    }

    public final void tp(int i) {
        C1351060lGK c1351060lGKHp = hp();
        if (i < 0) {
            i = 0;
        }
        c1351060lGKHp.LIZIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        C0OB8 c0ob8 = (C0OB8) obj;
        if ((c0ob8 instanceof C0SDD) && !C729510SjV.LJJIJIL(c0ob8.getAweme())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedCommentAbility
    public final void yZ1(Function2<? super View, ? super Boolean, Unit> function2) {
        ((ArrayList) this.LLJLILLLLZIIL).add(function2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (kp() == 0) {
            return;
        }
        if (view.getId() == R.id.imq) {
            if (z) {
                this.LLJL = System.currentTimeMillis();
                return;
            } else {
                if (this.LLJL <= 0) {
                    return;
                }
                this.LLJJLIIIJLLLLLLLZ += System.currentTimeMillis() - this.LLJL;
                this.LLJL = 0L;
                return;
            }
        }
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it2.hasNext()) {
            ((Function2) it2.next()).invoke(view, Boolean.valueOf(z));
        }
    }
}
