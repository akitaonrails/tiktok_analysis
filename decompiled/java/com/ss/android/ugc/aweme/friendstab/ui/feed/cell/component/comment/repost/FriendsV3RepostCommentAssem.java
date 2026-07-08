package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.repost;

import X.C01GW;
import X.C0Q4Y;
import X.C109100bB;
import X.C123100dR;
import X.C1351100lGO;
import X.C1351880lHe;
import X.C1354720lME;
import X.C1356730lPT;
import X.C1357790lRB;
import X.C1357800lRC;
import X.C1357810lRD;
import X.C1357870lRJ;
import X.C1359520lTy;
import X.C1360320lVG;
import X.C1389890mGx;
import X.C13BV;
import X.C13DA;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C2097608Jq;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C523420Kfs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C814420VxA;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.api.FriendsV3FeedRepostCommentAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentAvatarConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentInputConfig;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.repo.RepostCommentStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostCommentAssem extends BaseFriendsV3CellContentAssem<FriendsV3RepostCommentAssem, InterfaceC1361270lWn> implements FriendsV3FeedRepostCommentAbility, FriendsV3ViewStateProtocol, FriendsV3CellTrackParamsProtocol, IRepostInteractionSyncProtocol {
    public FriendsV3RepostModel LLJJJJLIIL;
    public C1357800lRC LLJJL;
    public int LLJLL;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(266));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1454));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1453));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 573));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1452));

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void E22(C1359520lTy c1359520lTy) {
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(this.LLJLIL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        RepostCommentStruct repostCommentStruct;
        List<RepostReplyStruct> list;
        FriendsV3RepostModel friendsV3RepostModel = this.LLJJJJLIIL;
        int size = (friendsV3RepostModel == null || (repostCommentStruct = friendsV3RepostModel.repostComments) == null || (list = repostCommentStruct.repostCommentList) == null) ? 0 : list.size();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("click_vm_num", Integer.valueOf(this.LLJLL));
        pairArr[1] = new Pair("is_with_repost", size > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("exposed_repost_cnt", Integer.valueOf(size));
        Map<String, Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        this.LLJLL = 0;
        return mapLJIIIIZZ;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv cp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJL.getValue();
    }

    public final void dp() {
        RepostCommentStruct repostCommentStruct;
        FriendsV3RepostModel friendsV3RepostModel = this.LLJJJJLIIL;
        if (friendsV3RepostModel != null) {
            if (friendsV3RepostModel.repostComments == null) {
                if (friendsV3RepostModel != null) {
                    friendsV3RepostModel.repostComments = new RepostCommentStruct(new ArrayList(), 0, null);
                }
            } else if (friendsV3RepostModel != null) {
                RepostCommentStruct repostCommentStruct2 = friendsV3RepostModel.repostComments;
                if ((repostCommentStruct2 == null || (repostCommentStruct2.repostCommentList == null && friendsV3RepostModel != null)) && (repostCommentStruct = friendsV3RepostModel.repostComments) != null) {
                    repostCommentStruct.repostCommentList = new ArrayList();
                }
            }
        }
    }

    public final void hp() {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        VideoItemParams videoItemParams;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        if (obj instanceof VideoItemParams) {
            VideoItemParams videoItemParams2 = (VideoItemParams) obj;
            int i = -1;
            if (videoItemParams2 == null || videoItemParams2.currentPosition == -1 || (friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) == null) {
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), FriendsV3FeedRepostCommentAbility.class, null);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLILLLLZIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, this);
        }
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), IRepostInteractionSyncProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, FriendsV3FeedRepostCommentAbility.class, null, null);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLILLLLZIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IRepostInteractionSyncProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void PO(C1357870lRJ c1357870lRJ) {
        String str;
        FriendsV3RepostModel friendsV3RepostModel;
        RepostCommentStruct repostCommentStruct;
        List<RepostReplyStruct> list;
        String str2 = c1357870lRJ.LIZ.repostId;
        FriendsV3RepostModel friendsV3RepostModel2 = this.LLJJJJLIIL;
        if (friendsV3RepostModel2 != null) {
            str = friendsV3RepostModel2.realRepostId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str) && (friendsV3RepostModel = this.LLJJJJLIIL) != null && (repostCommentStruct = friendsV3RepostModel.repostComments) != null && (list = repostCommentStruct.repostCommentList) != null) {
            Iterator<RepostReplyStruct> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().replyId, c1357870lRJ.LIZ.replyId)) {
                    if (i >= 0 && i < list.size()) {
                        ListProtector.remove(list, i);
                    }
                } else {
                    i++;
                }
            }
            hp();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.FriendsV3FeedRepostCommentAbility
    public final void Rc1(RepostReplyStruct repostReplyStruct) {
        FriendsV3RepostModel friendsV3RepostModel;
        Aweme aweme;
        IUpvoteService iUpvoteService;
        Object obj;
        String str;
        User user;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (friendsV3RepostModel = this.LLJJJJLIIL) != null && (aweme = friendsV3RepostModel.repostedAweme) != null && repostReplyStruct.cacheState != UpvoteCacheState.PRE_PUBLISH && (iUpvoteService = (IUpvoteService) this.LLJJJJJIL.getValue()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            String str2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            FriendsV3RepostModel friendsV3RepostModel2 = this.LLJJJJLIIL;
            if (friendsV3RepostModel2 != null) {
                str = friendsV3RepostModel2.realRepostId;
                user = friendsV3RepostModel2.reposter;
                str2 = friendsV3RepostModel2.repostText;
            } else {
                str = null;
                user = null;
            }
            iUpvoteService.LJJ(c19egLIZ, obj, new C1356730lPT(repostReplyStruct, str, user, !TextUtils.isEmpty(str2), aweme, "homepage_friends", "friends_repost_cell", "friends_v3_feeds", null, 256));
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void Zc1(C1357810lRD c1357810lRD) {
        String str;
        FriendsV3RepostModel friendsV3RepostModel;
        RepostCommentStruct repostCommentStruct;
        List<RepostReplyStruct> list;
        RepostCommentStruct repostCommentStruct2;
        List<RepostReplyStruct> list2;
        FriendsV3RepostModel friendsV3RepostModel2;
        RepostCommentStruct repostCommentStruct3;
        List<RepostReplyStruct> list3;
        RepostCommentStruct repostCommentStruct4;
        List<RepostReplyStruct> list4;
        RepostReplyStruct repostReplyStruct = c1357810lRD.LIZIZ;
        String str2 = null;
        if (repostReplyStruct != null) {
            str = repostReplyStruct.repostId;
        } else {
            str = null;
        }
        FriendsV3RepostModel friendsV3RepostModel3 = this.LLJJJJLIIL;
        if (friendsV3RepostModel3 != null) {
            str2 = friendsV3RepostModel3.realRepostId;
        }
        if (Intrinsics.LJFF(str, str2)) {
            int i = C1357790lRB.LIZ[c1357810lRD.LIZJ.ordinal()];
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        FriendsV3RepostModel friendsV3RepostModel4 = this.LLJJJJLIIL;
                        if (friendsV3RepostModel4 != null && (repostCommentStruct4 = friendsV3RepostModel4.repostComments) != null && (list4 = repostCommentStruct4.repostCommentList) != null) {
                            Iterator<RepostReplyStruct> it2 = list4.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.LJFF(it2.next().fakeId, c1357810lRD.LJ)) {
                                    if (i2 >= 0 && i2 < list4.size()) {
                                        ListProtector.remove(list4, i2);
                                        hp();
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
                        c1389890mGx.LJIIIZ(2131829223);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                dp();
                RepostReplyStruct repostReplyStruct2 = c1357810lRD.LIZIZ;
                if (repostReplyStruct2 == null || (friendsV3RepostModel2 = this.LLJJJJLIIL) == null || (repostCommentStruct3 = friendsV3RepostModel2.repostComments) == null || (list3 = repostCommentStruct3.repostCommentList) == null) {
                    return;
                }
                Iterator<RepostReplyStruct> it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it3.next().fakeId, c1357810lRD.LJ)) {
                        if (i2 >= 0 && i2 < list3.size()) {
                            ((RepostReplyStruct) ListProtector.get(list3, i2)).updateWhenPublishSuccess(repostReplyStruct2);
                            hp();
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
                list3.add(repostReplyStruct2);
                hp();
                return;
            }
            dp();
            RepostReplyStruct repostReplyStruct3 = c1357810lRD.LIZIZ;
            if (repostReplyStruct3 == null || (friendsV3RepostModel = this.LLJJJJLIIL) == null || (repostCommentStruct = friendsV3RepostModel.repostComments) == null || (list = repostCommentStruct.repostCommentList) == null) {
                return;
            }
            Iterator<RepostReplyStruct> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it4.next().fakeId, c1357810lRD.LJ)) {
                    if (i2 != -1) {
                        return;
                    }
                } else {
                    i2++;
                }
            }
            FriendsV3RepostModel friendsV3RepostModel5 = this.LLJJJJLIIL;
            if (friendsV3RepostModel5 != null && (repostCommentStruct2 = friendsV3RepostModel5.repostComments) != null && (list2 = repostCommentStruct2.repostCommentList) != null) {
                list2.add(repostReplyStruct3);
            }
            hp();
        }
    }

    public final void ep(boolean z) {
        String str;
        RepostCommentStruct repostCommentStruct;
        int i;
        int size;
        String aid;
        Boolean boolValueOf;
        Integer numValueOf;
        User user;
        User user2;
        String str2;
        Aweme aweme;
        List<RepostReplyStruct> list;
        if (z) {
            str = "ttsocial_friend_tab_vmcomment_btn_show";
        } else {
            str = "ttsocial_friend_tab_vmcomment_btn_click";
        }
        FriendsV3RepostModel friendsV3RepostModel = this.LLJJJJLIIL;
        String uid = null;
        if (friendsV3RepostModel != null) {
            repostCommentStruct = friendsV3RepostModel.repostComments;
        } else {
            repostCommentStruct = null;
        }
        C1357800lRC c1357800lRC = this.LLJJL;
        int i2 = 0;
        if (c1357800lRC != null) {
            i = c1357800lRC.LIZ;
        } else {
            i = 0;
        }
        if (repostCommentStruct != null && (list = repostCommentStruct.repostCommentList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        int i3 = i - size;
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("friends_tab_version", "v3.0");
        c13da.put("enter_from", "homepage_friends");
        c13da.put("is_detail_page", CardStruct.IStatusCode.DEFAULT);
        FriendsV3RepostModel friendsV3RepostModel2 = this.LLJJJJLIIL;
        if (friendsV3RepostModel2 != null && (aweme = friendsV3RepostModel2.repostedAweme) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c13da.put("group_id", aid);
        if (i3 > 0) {
            i2 = i3;
        }
        c13da.put("hide_reply_num", Integer.valueOf(i2));
        FriendsV3RepostModel friendsV3RepostModel3 = this.LLJJJJLIIL;
        if (friendsV3RepostModel3 != null && (str2 = friendsV3RepostModel3.repostText) != null) {
            boolValueOf = Boolean.valueOf(C123100dR.LIZ(str2));
        } else {
            boolValueOf = null;
        }
        c13da.put("with_text", boolValueOf);
        FriendsV3RepostModel friendsV3RepostModel4 = this.LLJJJJLIIL;
        if (friendsV3RepostModel4 != null && (user2 = friendsV3RepostModel4.reposter) != null) {
            numValueOf = Integer.valueOf(C1360320lVG.LIZ(user2));
        } else {
            numValueOf = null;
        }
        c13da.put("follow_status", numValueOf);
        FriendsV3RepostModel friendsV3RepostModel5 = this.LLJJJJLIIL;
        if (friendsV3RepostModel5 != null && (user = friendsV3RepostModel5.reposter) != null) {
            uid = user.getUid();
        }
        c13da.put("reposter_uid", uid);
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ(str, mapBuild);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCp = cp();
        CommentService.LIZ.getClass();
        viewOnAttachStateChangeListenerC20604515jvCp.LJIILJJIL(C523420Kfs.LIZ().LJIL());
        viewOnAttachStateChangeListenerC20604515jvCp.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jvCp.setNestedScrollingEnabled(false);
        viewOnAttachStateChangeListenerC20604515jvCp.LIZLLL((View) this.LLJLIL.getValue());
        viewOnAttachStateChangeListenerC20604515jvCp.onViewAttachedToWindow(viewOnAttachStateChangeListenerC20604515jvCp);
        viewOnAttachStateChangeListenerC20604515jvCp.getState().LIZLLL = C0Q4Y.BUFFER;
        C01GW c01gw = C1351100lGO.LIZIZ;
        int i = 2;
        if (((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 2 || ((FriendsV3CommentInputConfig) c01gw.getValue()).exposeStrategy == 1) {
            viewOnAttachStateChangeListenerC20604515jvCp.setItemAnimator(null);
        }
        if (C1354720lME.LIZ()) {
            if (!((FriendsV3CommentAvatarConfig) C1354720lME.LIZIZ.getValue()).enableCommentAvatar) {
                i = 4;
            }
            C426750GoL.LJIIIZ(viewOnAttachStateChangeListenerC20604515jvCp, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, null, false, 29);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        FriendsV3RepostModel friendsV3RepostModelLLD;
        C1357800lRC c1357800lRCLJLJL;
        List list;
        RepostCommentStruct repostCommentStruct;
        InterfaceC1357880lRK interfaceC1357880lRK;
        InterfaceC1357880lRK interfaceC1357880lRK2;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
        boolean z = interfaceC1361270lWn instanceof InterfaceC1357880lRK;
        if (z && (interfaceC1357880lRK2 = (InterfaceC1357880lRK) interfaceC1361270lWn) != null) {
            friendsV3RepostModelLLD = interfaceC1357880lRK2.LLD();
        } else {
            friendsV3RepostModelLLD = null;
        }
        this.LLJJJJLIIL = friendsV3RepostModelLLD;
        if (z && (interfaceC1357880lRK = (InterfaceC1357880lRK) interfaceC1361270lWn) != null) {
            c1357800lRCLJLJL = interfaceC1357880lRK.LJLJL();
        } else {
            c1357800lRCLJLJL = null;
        }
        this.LLJJL = c1357800lRCLJLJL;
        FriendsV3RepostModel friendsV3RepostModel = this.LLJJJJLIIL;
        if (friendsV3RepostModel == null || (repostCommentStruct = friendsV3RepostModel.repostComments) == null || (list = repostCommentStruct.repostCommentList) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1351880lHe((RepostReplyStruct) it2.next()));
        }
        cp().getState().LJIIJJI(arrayList, null);
        C1357800lRC c1357800lRC = this.LLJJL;
        if (c1357800lRC != null && c1357800lRC.LIZJ) {
            C339190DRl.LIZLLL((View) this.LLJLIL.getValue());
        } else {
            C339190DRl.LIZIZ((View) this.LLJLIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof InterfaceC1357880lRK;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        FriendsV3RepostModel friendsV3RepostModel;
        Set<String> set;
        Set<String> set2;
        if (z && view.getVisibility() == 0 && (friendsV3RepostModel = this.LLJJJJLIIL) != null && (set = friendsV3RepostModel.LIZ) != null && !set.contains("view_more_mob")) {
            FriendsV3RepostModel friendsV3RepostModel2 = this.LLJJJJLIIL;
            if (friendsV3RepostModel2 != null && (set2 = friendsV3RepostModel2.LIZ) != null) {
                set2.add("view_more_mob");
            }
            ep(true);
        }
    }
}
