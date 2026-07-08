package com.ss.android.ugc.aweme.notification.followrequest.vh;

import X.AbstractC1906850zil;
import X.AbstractC1906870zin;
import X.C10VP;
import X.C1243340iSa;
import X.C1245000iVG;
import X.C1245020iVI;
import X.C1252310ih3;
import X.C1260910iuv;
import X.C1264070j01;
import X.C12ES;
import X.C1387050mCN;
import X.C1388190mED;
import X.C1906140zhc;
import X.C1906330zhv;
import X.C1906880zio;
import X.C1908030zkf;
import X.C1908480zlO;
import X.C1910480zoc;
import X.C19724912Fj;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C427660Gpo;
import X.C438710HIf;
import X.C686150Qvl;
import X.C703302op;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1906160zhe;
import X.EnumC1906770zid;
import X.InterfaceC1252320ih4;
import X.ViewOnAttachStateChangeListenerC1265900j2y;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS223S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowRequestViewHolderInFollower extends AbstractC1906870zin {
    public static final int $stable = 8;
    public final View acceptBtn;
    public final C427660Gpo avatarView;
    public User curUser;
    public final View deleteBtn;
    public final TuxTextView descView;
    public String enterFrom;
    public FollowRequestData followRequestData;
    public final C1252310ih3 mobHelper;
    public final TuxTextView nameView;
    public long noticeCreateTime;
    public final RelationButton relationBtn;
    public final InterfaceC1252320ih4 removedListener;
    public RelationLabelTextView tvMutualLabel;

    public final C1252310ih3 getMobHelper() {
        return null;
    }

    public final void onItemClicked() {
        Activity activityLIZ;
        User user = this.curUser;
        if (user != null) {
            if (C1245020iVI.LIZJ(user)) {
                EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
                BaseNotice baseNotice = this.mMTBaseNotice;
                enterProfileWithRecommendParams(user, "follow_request_page", "follow_request", enumC1260920iuw, true, baseNotice != null ? baseNotice.getAccountType() : null);
            } else {
                Context context = this.itemView.getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://user/profile/");
                    sbLIZ.append(user.getUid());
                    C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                    c686150Qvl.LIZIZ("sec_user_id", user.getSecUid());
                    c686150Qvl.LIZIZ("enter_from", "follow_request_page");
                    c19724912FjLIZLLL.LJI(activityLIZ, c686150Qvl.LIZJ());
                    ((LogHelper) ServiceManager.get().getService(LogHelper.class)).LIZLLL(user.getFollowStatus(), this.enterFrom, user.getUid());
                }
            }
        }
        markHasReadWhenFollowRequest(this.followRequestData);
    }

    private final void setDeleteStyle() {
        C786410Ut5.LJLLLLLL(0, this.acceptBtn);
        C786410Ut5.LJLLLLLL(8, this.deleteBtn);
        ViewGroup.LayoutParams layoutParams = this.acceptBtn.getLayoutParams();
        layoutParams.width = (int) C12ES.LIZJ(88.0f, this.itemView.getContext());
        layoutParams.height = (int) C12ES.LIZJ(28.0f, this.itemView.getContext());
        C786410Ut5.W5(this.acceptBtn, layoutParams);
    }

    @Override // X.AbstractC1906870zin
    public Observer<C1243340iSa> createAliasObserver() {
        return new AObserverS223S0100000_19(this, 27);
    }

    public final void mobFollowApprove() {
        String str;
        User user = this.curUser;
        boolean z = user != null && C1245020iVI.LIZJ(user);
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user2 = this.curUser;
        c2344009Gk.LJIIIIZZ("to_user_id", user2 != null ? user2.getUid() : null);
        c2344009Gk.LJIIIIZZ("enter_from", this.enterFrom);
        c2344009Gk.LJIIIIZZ("has_label", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("has_follow_tag", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("has_follow_message", CardStruct.IStatusCode.DEFAULT);
        User user3 = this.curUser;
        if (user3 == null || user3.getFollowStatus() != 1) {
            User user4 = this.curUser;
            str = (user4 == null || user4.getFollowStatus() != 0) ? "single" : "";
        } else {
            str = "mutual";
        }
        c2344009Gk.LJIIIIZZ("follow_type", str);
        C20684815ws.LJIILLIIL("follow_approve", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC1906850zil
    public void reportShowEvent() {
        super.reportShowEvent();
        if (InnerPushDedupExp.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportShowEvent uid:");
            User user = this.curUser;
            sbLIZ.append(user != null ? user.getUid() : null);
            sbLIZ.append(" noticeCreateTime:");
            sbLIZ.append(this.noticeCreateTime);
            C2188811AlT.LIZIZ(sbLIZ);
            User user2 = this.curUser;
            C1908480zlO.LIZIZ.LIZIZ(new C1906330zhv("Follow", user2 != null ? user2.getUid() : null, this.noticeCreateTime, 2));
        }
    }

    @Override // X.AbstractC1906870zin
    public User getUserFromNotice() {
        return this.curUser;
    }

    private final boolean useFollowMsgStyle(User user) {
        if (user.getFollowFrom() == 29 && C703302op.LIZ(user.getFollowFromMsg())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1906870zin, X.AbstractC1906850zil
    public void applyNewStyle(C1906880zio c1906880zio) {
        super.applyNewStyle(c1906880zio);
        applyHead(c1906880zio, this.avatarView);
        applyTitleSize(c1906880zio, this.nameView);
        applyTitleTypeFace(c1906880zio, this.nameView);
        applyContentTitleGap(c1906880zio, this.descView);
        applyContentColor(c1906880zio, this.descView);
        if (c1906880zio != null && c1906880zio.LIZ == 56) {
            RelationButton relationButton = this.relationBtn;
            resetViewTopMargin(relationButton, getViewTopMarginAddSpace(relationButton, AbstractC1906850zil.LARGE_AVATAR_ADD_SPACE));
        }
    }

    public final void showFollowBtn(boolean z, User user) {
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.acceptBtn);
            C786410Ut5.LJLLLLLL(8, this.deleteBtn);
            C786410Ut5.t0(this.relationBtn, 0);
            user.setFollowerStatus(1);
            if (user.getFollowStatus() == 1) {
                user.setFollowStatus(2);
            }
            if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
                user.getUid();
                user.getAccurateRecType();
                throw null;
            }
            RelationButton relationButton = this.relationBtn;
            if (relationButton != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJIIJJI = requireLifeCycleOwner();
                relationButton.LLLLZIL(c1387050mCN.LIZ());
            }
            RelationButton relationButton2 = this.relationBtn;
            if (relationButton2 != null) {
                relationButton2.setFollowClickInterceptor(new C1245000iVG(user, this, null));
                return;
            }
            return;
        }
        setDeleteStyle();
        C786410Ut5.t0(this.relationBtn, 8);
    }

    public FollowRequestViewHolderInFollower(View view, InterfaceC1252320ih4 interfaceC1252320ih4, C1252310ih3 c1252310ih3) {
        super(view);
        this.enterFrom = "notification_page";
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.ckx);
        this.relationBtn = relationButton;
        View viewFindViewById = this.itemView.findViewById(R.id.cki);
        this.acceptBtn = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.ckt);
        this.deleteBtn = viewFindViewById2;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_username);
        this.nameView = tuxTextView;
        this.descView = (TuxTextView) this.itemView.findViewById(R.id.zhs);
        C427660Gpo c427660Gpo = (C427660Gpo) this.itemView.findViewById(R.id.pe1);
        this.avatarView = c427660Gpo;
        this.tvMutualLabel = (RelationLabelTextView) this.itemView.findViewById(R.id.t4q);
        C10VP.LIZIZ(relationButton);
        relationButton.setTracker(new AwS563S0100000_19(this, 1626));
        relationButton.setTuxFont(62);
        relationButton.setRequestListener(new AwS633S0100000_19(this, 60));
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 60), this.itemView);
        C786410Ut5.T8(c427660Gpo, new ACListenerS162S0100000_28(this, 61));
        C786410Ut5.h9(tuxTextView, new ACListenerS162S0100000_28(this, 62));
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1265900j2y(this, 1));
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 122), viewFindViewById2);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 63), viewFindViewById);
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View view2 = this.itemView;
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(view2, enumC1906160zhe, 0.0f);
        C1906140zhc.LIZ(c427660Gpo, EnumC1906160zhe.AVATAR, 0.0f);
    }

    public final void onBind(User user, long j, int i, String str, FollowRequestData followRequestData, boolean z) {
        String avatarSceneTag;
        this.curUser = user;
        this.noticeCreateTime = j;
        this.followRequestData = followRequestData;
        this.enterFrom = str;
        if (user.getFollowerStatus() == 1) {
            showFollowBtn(true, user);
        } else {
            showFollowBtn(false, user);
        }
        TuxTextView tuxTextView = this.nameView;
        C1906140zhc.LIZ.getClass();
        tuxTextView.setText(C1906140zhc.LIZJ(user));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mContext.getString(2131837484));
        addCreateTimeSpan(spannableStringBuilder, j);
        this.descView.setText(spannableStringBuilder);
        C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.nameView);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(167);
        C1910480zoc c1910480zoc = C1910480zoc.LIZ;
        Context context = this.mContext;
        C427660Gpo c427660Gpo = this.avatarView;
        c1910480zoc.getClass();
        UrlModel urlModelLIZ = C1910480zoc.LIZ(context, c427660Gpo, user);
        C427660Gpo c427660Gpo2 = this.avatarView;
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModelLIZ);
        EnumC1906770zid enumC1906770zid = this.imgInfo;
        if (enumC1906770zid != null) {
            avatarSceneTag = enumC1906770zid.getAvatarSceneTag();
        } else {
            avatarSceneTag = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo2, imageUrlModelLIZ, false, null, avatarSceneTag, false, false, null, null, false, aFwS271S0000000_28, 502);
        AbstractC1906870zin.checkAndGetStory$default(this, false, 1, null);
        if (C1245020iVI.LIZJ(user)) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJJJZI(user);
                c1260910iuv.LJJIJLIJ("notification_page");
                c1260910iuv.LJJJJIZL("follow_request");
                c1260910iuv.LJJLIIIJJI = EnumC1260930iux.SHOW;
                c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJIILJJIL();
                RelationLabelTextView relationLabelTextView = this.tvMutualLabel;
                if (relationLabelTextView != null) {
                    C786410Ut5.v0(relationLabelTextView, 0);
                }
                RelationLabelTextView relationLabelTextView2 = this.tvMutualLabel;
                if (relationLabelTextView2 != null) {
                    RelationLabelTextView.LJJJJL(relationLabelTextView2, matchedFriendStruct, C1264070j01.LJFF);
                }
            }
        } else {
            RelationLabelTextView relationLabelTextView3 = this.tvMutualLabel;
            if (relationLabelTextView3 != null) {
                C786410Ut5.v0(relationLabelTextView3, 8);
            }
        }
        markUnreadIfNeed(followRequestData.hasRead, this.itemView, z);
    }
}
