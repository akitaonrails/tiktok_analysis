package com.ss.android.ugc.aweme.comment.longpresspanel.repo;

import X.C0M7Y;
import X.C123100dR;
import X.C1339840kyE;
import X.C1339940kyO;
import X.C1342490l2V;
import X.C1344990l6X;
import X.C1345700l7g;
import X.C1346300l8e;
import X.C1350750lFp;
import X.C1350970lGB;
import X.C1350980lGC;
import X.C1350990lGD;
import X.C1351870lHd;
import X.C1355080lMo;
import X.C1355680lNm;
import X.C1369440ljy;
import X.C1369950lkn;
import X.C1371430lnB;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1377850lxX;
import X.C1388190mED;
import X.C1389880mGw;
import X.C13LP;
import X.C19252910Tv;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C294970BhH;
import X.C621180OYa;
import X.C729510SjV;
import X.C735840Sti;
import X.C786410Ut5;
import X.EnumC1342450l2R;
import X.InterfaceC1346260l8a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.comment.experiment.CommentLongPressConfig;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLongPressRepository {
    public static final CommentLongPressRepository LIZ = new CommentLongPressRepository();

    public static final class CommentCopyLinkChannel extends CopyLinkChannel {
        public CommentCopyLinkChannel() {
            super(false);
        }

        @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
        public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
            String strLIZIZ;
            String str = c1371430lnB.LIZJ;
            if (str != null && str.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1371430lnB.LIZJ);
                sbLIZ.append(' ');
                sbLIZ.append(c1371430lnB.LIZLLL);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = c1371430lnB.LIZLLL;
            }
            View viewLIZIZ = null;
            C1377850lxX c1377850lxX = new C1377850lxX(null, false, 3);
            Cert certLIZ = C1369440ljy.LIZ();
            if (c0m7y != null) {
                viewLIZIZ = c0m7y.LIZIZ();
            }
            c1377850lxX.LIZ(strLIZIZ, context, certLIZ, viewLIZIZ);
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                c1389880mGw.LJIIIIZZ(2131829543);
                c1389880mGw.LJIIJ();
            }
            return true;
        }
    }

    public static void LIZ(C1346300l8e c1346300l8e, InterfaceC1346260l8a interfaceC1346260l8a, CommentLongPressFragment commentLongPressFragment) {
        int i;
        int i2;
        if (c1346300l8e.LJII) {
            if (interfaceC1346260l8a != null) {
                interfaceC1346260l8a.LJIIL();
            }
        } else if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJI();
        }
        boolean z = !c1346300l8e.LJII;
        c1346300l8e.LJII = z;
        if (z) {
            i = R.raw.icon_bookmark_fill;
        } else {
            i = R.raw.icon_bookmark;
        }
        c1346300l8e.LIZJ = Integer.valueOf(i);
        if (c1346300l8e.LJII) {
            i2 = 2131834427;
        } else {
            i2 = 2131834425;
        }
        c1346300l8e.LIZLLL = commentLongPressFragment.getString(i2);
        commentLongPressFragment.SR(c1346300l8e);
    }

    public static void LIZIZ(C1346300l8e c1346300l8e, InterfaceC1346260l8a interfaceC1346260l8a, CommentLongPressFragment commentLongPressFragment) {
        int i;
        String string;
        if (c1346300l8e.LJII) {
            if (interfaceC1346260l8a != null) {
                interfaceC1346260l8a.LJIIZILJ();
            }
        } else if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJIIIZ();
        }
        boolean z = !c1346300l8e.LJII;
        c1346300l8e.LJII = z;
        if (z) {
            i = R.raw.icon_star_fill;
        } else {
            i = R.raw.icon_star;
        }
        c1346300l8e.LIZJ = Integer.valueOf(i);
        if (c1346300l8e.LJII) {
            string = commentLongPressFragment.getString(2131848902);
        } else {
            string = commentLongPressFragment.getString(2131848901);
        }
        c1346300l8e.LIZLLL = string;
        commentLongPressFragment.SR(c1346300l8e);
    }

    public static C1371590lnR LIZJ(Aweme aweme, Comment comment, Activity activity, String str, EnumC1342450l2R enumC1342450l2R, Integer num, FypExposedCommentMobParams fypExposedCommentMobParams, boolean z) {
        String str2;
        String str3;
        String desc;
        String title;
        String url;
        int followStatus;
        int i;
        Comment comment2;
        C1371600lnS c1371600lnSLIZ;
        int iIntValue;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer numIsFypShow;
        long jLongValue;
        CommentImageStruct commentImageStruct;
        String str8;
        CommentImageStruct commentImageStruct2;
        if (aweme == null || comment == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_method", "comment_share_panel", bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("is_internal_image_comment", String.valueOf(num), bundle);
        if (C729510SjV.LJJIJIL(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        C786410Ut5.LJJJI("story_type", str2, bundle);
        String str9 = "1";
        if (aweme.isAd()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_ad", str3, bundle);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        C786410Ut5.LJJJI("log_follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author)), bundle);
        C1350980lGC c1350980lGC = new C1350980lGC();
        CommentShareInfo shareInfo = comment.getShareInfo();
        if (shareInfo != null) {
            desc = shareInfo.getDesc();
        } else {
            desc = null;
        }
        String str10 = "";
        if (desc == null) {
            desc = "";
        }
        c1350980lGC.LIZIZ = desc;
        CommentShareInfo shareInfo2 = comment.getShareInfo();
        if (shareInfo2 == null || (title = shareInfo2.getTitle()) == null) {
            title = "";
        }
        c1350980lGC.LIZ = title;
        CommentShareInfo shareInfo3 = comment.getShareInfo();
        if (shareInfo3 == null || (url = shareInfo3.getUrl()) == null) {
            url = "";
        }
        c1350980lGC.LIZJ = url;
        C786410Ut5.LJJIIJZLJL(c1350980lGC.LIZLLL, bundle);
        C1350970lGB c1350970lGB = new C1350970lGB(c1350980lGC);
        CommentSharePackage.Companion.getClass();
        CommentSharePackage commentSharePackageLIZJ = C1351870lHd.LIZJ(aweme, comment, true, c1350970lGB);
        Bundle bundle2 = commentSharePackageLIZJ.extras;
        C786410Ut5.LJJJI("panel_source", "long_press", bundle2);
        C1355680lNm.LIZIZ(bundle2, "long_press_comment");
        C1355680lNm.LIZJ(bundle2, aweme);
        C786410Ut5.LJJJI("comment_category", C1345700l7g.LIZ(comment), bundle2);
        C786410Ut5.LJJJI("comment_message_type", C1350750lFp.LIZ(comment), bundle2);
        C786410Ut5.LJJJI("bizTrackParams", GsonProtectorUtils.toJson(C1344990l6X.LIZ, C2097908Jt.LIZJ(new Pair("comment_id", comment.getCid()))), bundle2);
        C786410Ut5.LJJJI("aid", aweme.getAid(), bundle2);
        C786410Ut5.LJJJI("item_id_string", aweme.getAid(), bundle2);
        C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), bundle2);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            followStatus = author2.getFollowStatus();
        } else {
            followStatus = 0;
        }
        bundle2.putInt("follow_status", followStatus);
        C786410Ut5.LJJJI("channel", C1342490l2V.LIZ(enumC1342450l2R), bundle2);
        C786410Ut5.LJJJI("comment_channel", C1342490l2V.LIZ(enumC1342450l2R), bundle2);
        CommentLongPressConfig commentLongPressConfig = (CommentLongPressConfig) C1339940kyO.LIZ.getValue();
        if (commentLongPressConfig != null) {
            i = commentLongPressConfig.maxContactCount;
        } else {
            i = 15;
        }
        bundle2.putInt("contact_max_size", i);
        if (!comment.getIsTakoGenerated()) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_tako_comment", str9, bundle2);
        C786410Ut5.LJJJI("is_at_tako", C1339840kyE.LIZ(comment), bundle2);
        if (comment.getIsPhotoContained() != 0) {
            comment2 = comment;
        } else {
            comment2 = null;
        }
        String str11 = "static";
        if (comment2 != null) {
            List<CommentImageStruct> imageList = comment2.getImageList();
            if (imageList == null || (commentImageStruct2 = (CommentImageStruct) C13LP.LJJJLL(imageList)) == null || commentImageStruct2.getLivePhotoInfoModel() == null) {
                str8 = "static";
            } else {
                str8 = "live_once";
            }
            C786410Ut5.LJJJI("sub_photo_type", str8, bundle2);
        }
        List<CommentImageStruct> imageList2 = comment.getImageList();
        if (imageList2 != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList2)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
            str11 = "live_once";
        }
        C786410Ut5.LJJJI("sub_photo_type", str11, bundle2);
        UserVoteInfo userVoteInfo = comment.userVoteInfo;
        long jLongValue2 = 0;
        if (userVoteInfo != null && z) {
            Long l = userVoteInfo.pollId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            bundle2.putLong("cmt_poll_id", jLongValue);
            bundle2.putInt("is_cmt_poll_card_show", 1);
            C786410Ut5.LJJJI("cmt_poll_card_show_option", userVoteInfo.voteText, bundle2);
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            Bundle bundle3 = commentSharePackageLIZJ.extras;
            if (fypExposedCommentMobParams != null && (numIsFypShow = fypExposedCommentMobParams.isFypShow()) != null) {
                iIntValue = numIsFypShow.intValue();
            } else {
                iIntValue = 0;
            }
            bundle3.putInt("is_fyp_show", iIntValue);
            if (fypExposedCommentMobParams != null) {
                str4 = fypExposedCommentMobParams.fypCommentId;
            } else {
                str4 = null;
            }
            if (C123100dR.LIZ(str4)) {
                Bundle bundle4 = commentSharePackageLIZJ.extras;
                if (fypExposedCommentMobParams != null) {
                    str7 = fypExposedCommentMobParams.fypCommentId;
                } else {
                    str7 = null;
                }
                C786410Ut5.LJJJI("fyp_comment_id", str7, bundle4);
            }
            if (fypExposedCommentMobParams != null) {
                str5 = fypExposedCommentMobParams.showCmtInterMetricType;
            } else {
                str5 = null;
            }
            if (C123100dR.LIZ(str5)) {
                Bundle bundle5 = commentSharePackageLIZJ.extras;
                if (fypExposedCommentMobParams != null && (str6 = fypExposedCommentMobParams.showCmtInterMetricType) != null) {
                    str10 = str6;
                }
                C786410Ut5.LJJJI("show_cmt_inter_metric_type", str10, bundle5);
            }
            if (fypExposedCommentMobParams != null && fypExposedCommentMobParams.showCmtInterMetricValue != null) {
                Bundle bundle6 = commentSharePackageLIZJ.extras;
                Long l2 = fypExposedCommentMobParams.showCmtInterMetricValue;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                bundle6.putLong("show_cmt_inter_metric_value", jLongValue2);
            }
        }
        if (C294970BhH.LIZ()) {
            c1371600lnSLIZ = new C1371600lnS();
            c1371600lnSLIZ.LJJJJI = true;
            c1371600lnSLIZ.LJJIIJZLJL = false;
            c1371600lnSLIZ.LJJJI = true;
            c1371600lnSLIZ.LIZIZ(new CommentCopyLinkChannel());
            C621180OYa.LIZ.LJIILIIL(activity, c1371600lnSLIZ, true, false);
            c1371600lnSLIZ.LJJJJJ = R.style.ac5;
            if (C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LJ(activity)) {
                C1369950lkn c1369950lkn = new C1369950lkn();
                c1369950lkn.LJFF = true;
                c1371600lnSLIZ.LJJLIIIJILLIZJL = c1369950lkn;
            }
        } else {
            LinkDefaultSharePackage.Companion.getClass();
            c1371600lnSLIZ = C1350990lGD.LIZ(activity);
        }
        c1371600lnSLIZ.LJJIIJ = commentSharePackageLIZJ;
        c1371600lnSLIZ.LJJIL = new C1355080lMo(null);
        return new C1371590lnR(c1371600lnSLIZ);
    }
}
