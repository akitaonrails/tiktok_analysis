package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C10VP;
import X.C1243340iSa;
import X.C1244990iVF;
import X.C1245020iVI;
import X.C1260910iuv;
import X.C1264070j01;
import X.C12ES;
import X.C1387050mCN;
import X.C1508630pMT;
import X.C1900990zZJ;
import X.C1906140zhc;
import X.C1906880zio;
import X.C1908030zkf;
import X.C1910480zoc;
import X.C197039127h;
import X.C20684815ws;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C429790GtF;
import X.C438710HIf;
import X.C657150Pq5;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1906160zhe;
import X.EnumC1906270zhp;
import X.InterfaceC1398730mVD;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS92S0300000_28;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.profile.model.FakeDataInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowRequestCell extends BaseTemplateNotificationCell<C1900990zZJ> implements View.OnClickListener, View.OnLongClickListener {
    public User LLJ;
    public String LLJI = "notification_page";
    public long LLJIJIL;

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell, X.InterfaceC1508640pMU
    public final String T() {
        return "FollowRequestCell";
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell
    public final Observer<C1243340iSa> createAliasObserver() {
        return new AObserverS223S0100000_19(this, 32);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(this, this.itemView);
        C786410Ut5.T8((C427660Gpo) this.itemView.findViewById(R.id.pe1), this);
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.tv_username), this);
        this.itemView.setOnLongClickListener(this);
        View view = this.itemView;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS128S0100000_28(view, 51));
        C2211631BhB.LJ(this.itemView, new AwS607S0100000_28(this, 103));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View viewFindViewById = this.itemView.findViewById(R.id.pf1);
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(viewFindViewById, enumC1906160zhe, 0.0f);
        C1906140zhc.LIZ(this.itemView.findViewById(R.id.pe1), EnumC1906160zhe.AVATAR, 0.0f);
        C10VP.LIZIZ(this.itemView.findViewById(R.id.ckx));
        ((TuxTextView) this.itemView.findViewById(R.id.ckx)).setTuxFont(62);
        ((TuxTextView) this.itemView.findViewById(R.id.cki)).setTuxFont(62);
        C1906880zio c1906880zioL5 = BaseTemplateNotificationCell.L5(EnumC1906270zhp.NEW_FOLLOWER, getContext());
        applyHeadStoryRing(c1906880zioL5, (View) this.LL.getValue());
        View viewFindViewById2 = this.itemView.findViewById(R.id.pe1);
        int i = c1906880zioL5.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (i != -1) {
            BaseTemplateNotificationCell.S5(viewFindViewById2, iLIZIZ);
        }
        applyTitleSize(c1906880zioL5, (TextView) this.itemView.findViewById(R.id.tv_username));
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_username);
        Typeface typeface = c1906880zioL5.LJIILJJIL;
        if (typeface != null && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).setTypeface(typeface);
        }
        applyContentTitleGap(c1906880zioL5, (TextView) this.itemView.findViewById(R.id.zhs));
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.zhs);
        int i2 = c1906880zioL5.LJII;
        if (i2 != -1 && (textView2 instanceof TuxTextView) && textView2 != null) {
            textView2.setTextColor(i2);
        }
        if (c1906880zioL5.LIZ == 56) {
            resetViewTopMargin(this.itemView.findViewById(R.id.ckx), getViewTopMarginAddSpace(this.itemView.findViewById(R.id.ckx), this.LLILZ));
        }
        long j = this.LLJIJIL;
        if (j > 0) {
            C1508630pMT.LIZ.getClass();
            C1508630pMT.LIZIZ(j, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell
    public final EnumC1906270zhp getScenario() {
        return EnumC1906270zhp.NEW_FOLLOWER;
    }

    public final User getUserFromNotice() {
        return this.LLJ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1900990zZJ c1900990zZJ) {
        String string;
        long j;
        FakeDataInfo fakeDataInfo;
        FollowRequestData followRequestData;
        super.onBindItemView(c1900990zZJ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        User user = c1900990zZJ.LL.user;
        this.LLJ = user;
        this.LLJI = c1900990zZJ.LLILZ;
        C786410Ut5.LLLLLLJ((C197039127h) this.itemView.findViewById(R.id.ckt), 8);
        ((RelationButton) this.itemView.findViewById(R.id.ckx)).setTracker(new AwS263S0300000_19(c1900990zZJ, this, user, 5));
        C786410Ut5.U8((C197039127h) this.itemView.findViewById(R.id.cki), new ACListenerS92S0300000_28(this, user, c1900990zZJ, 2));
        ((RelationButton) this.itemView.findViewById(R.id.ckx)).setRequestListener(new AwS455S0200000_19(user, this, 10));
        boolean z = true;
        if (user.getFollowerStatus() == 1) {
            showFollowBtn(true, user);
        } else {
            showFollowBtn(false, user);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_username);
        C1906140zhc.LIZ.getClass();
        textView.setText(C1906140zhc.LIZJ(user));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = getContext();
        UrlModel urlModelLIZ = null;
        if (context != null) {
            string = context.getString(2131837484);
        } else {
            string = null;
        }
        spannableStringBuilder.append((CharSequence) string);
        C1900990zZJ c1900990zZJ2 = (C1900990zZJ) getItem();
        if (c1900990zZJ2 != null && (followRequestData = c1900990zZJ2.LL) != null) {
            j = followRequestData.createTime;
        } else {
            j = 0;
        }
        addCreateTimeSpan(spannableStringBuilder, j);
        ((TextView) this.itemView.findViewById(R.id.zhs)).setText(spannableStringBuilder);
        C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), (TextView) this.itemView.findViewById(R.id.tv_username));
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(183);
        C657150Pq5.LIZ.getClass();
        if (C657150Pq5.LIZLLL(user.getUid()) || (fakeDataInfo = user.fakeDataInfo) == null || !Intrinsics.LJFF(fakeDataInfo.isFakeAvatar(), Boolean.TRUE)) {
            z = false;
        }
        if (z) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.pe1), Integer.valueOf(R.raw.icon_color_default_avatar), false, null, LJJLIIIJLJLI().getAvatarSceneTag(), false, false, null, null, false, aFwS271S0000000_28, 502);
        } else {
            FakeDataInfo fakeDataInfo2 = user.fakeDataInfo;
            if (fakeDataInfo2 != null && Intrinsics.LJFF(fakeDataInfo2.isFakeAvatar(), Boolean.TRUE)) {
                urlModelLIZ = new UrlModel();
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    C1910480zoc c1910480zoc = C1910480zoc.LIZ;
                    View viewFindViewById = this.itemView.findViewById(R.id.pe1);
                    c1910480zoc.getClass();
                    urlModelLIZ = C1910480zoc.LIZ(context2, viewFindViewById, user);
                }
            }
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.pe1), C438710HIf.LIZ(urlModelLIZ), false, null, LJJLIIIJLJLI().getAvatarSceneTag(), false, false, null, null, false, aFwS271S0000000_28, 502);
        }
        User userFromNotice = getUserFromNotice();
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLIZ.getValue();
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZLLL(userFromNotice);
        }
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
                RelationLabelTextView relationLabelTextView = (RelationLabelTextView) this.itemView.findViewById(R.id.t4q);
                if (relationLabelTextView != null) {
                    C786410Ut5.v0(relationLabelTextView, 0);
                }
                RelationLabelTextView relationLabelTextView2 = (RelationLabelTextView) this.itemView.findViewById(R.id.t4q);
                if (relationLabelTextView2 != null) {
                    RelationLabelTextView.LJJJJL(relationLabelTextView2, matchedFriendStruct, C1264070j01.LJFF);
                }
            }
        } else {
            RelationLabelTextView relationLabelTextView3 = (RelationLabelTextView) this.itemView.findViewById(R.id.t4q);
            if (relationLabelTextView3 != null) {
                C786410Ut5.v0(relationLabelTextView3, 8);
            }
        }
        boolean z2 = c1900990zZJ.LL.hasRead;
        View view = this.itemView;
        C1900990zZJ c1900990zZJ3 = (C1900990zZJ) getItem();
        if (c1900990zZJ3 != null && c1900990zZJ3.LLILLJJLI && view != null) {
            N5(view);
            if (!z2) {
                C429790GtF.LIZIZ(view);
            }
        }
        C1508630pMT.LIZ.getClass();
        C1508630pMT.LIZ(jCurrentTimeMillis, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell.onClick(android.view.View):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LLJIJIL = System.currentTimeMillis();
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_q, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FollowRequestData followRequestData;
        C1900990zZJ c1900990zZJ;
        Function1<FollowRequestData, Unit> function1;
        C1900990zZJ c1900990zZJ2 = (C1900990zZJ) getItem();
        if (c1900990zZJ2 != null && (followRequestData = c1900990zZJ2.LL) != null && (c1900990zZJ = (C1900990zZJ) getItem()) != null && (function1 = c1900990zZJ.LLILZIL) != null) {
            function1.invoke(followRequestData);
            return true;
        }
        return true;
    }

    public final void showFollowBtn(boolean z, User user) {
        if (z) {
            C786410Ut5.LLLLLLJ((C197039127h) this.itemView.findViewById(R.id.cki), 8);
            C786410Ut5.LLLLLLJ((C197039127h) this.itemView.findViewById(R.id.ckt), 8);
            C786410Ut5.t0((RelationButton) this.itemView.findViewById(R.id.ckx), 0);
            user.setFollowerStatus(1);
            if (user.getFollowStatus() == 1) {
                user.setFollowStatus(2);
            }
            if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
                String uid = user.getUid();
                String accurateRecType = user.getAccurateRecType();
                if (accurateRecType == null) {
                    accurateRecType = "";
                }
                String str = this.LLJI;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("to_user_id", uid);
                c2344009Gk.LJIIIIZZ("rec_type", accurateRecType);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("previous_page", "notification_page");
                C20684815ws.LJIILLIIL("show_follow_back_button", c2344009Gk.LIZ);
            }
            RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.ckx);
            if (relationButton != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJIIJJI = getCurrentLifeCycleOwner();
                relationButton.LLLLZIL(c1387050mCN.LIZ());
            }
            RelationButton relationButton2 = (RelationButton) this.itemView.findViewById(R.id.ckx);
            if (relationButton2 != null) {
                relationButton2.setFollowClickInterceptor(new C1244990iVF(user, this, null));
                return;
            }
            return;
        }
        C786410Ut5.LLLLLLJ((C197039127h) this.itemView.findViewById(R.id.cki), 0);
        C786410Ut5.LLLLLLJ((C197039127h) this.itemView.findViewById(R.id.ckt), 8);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.cki).getLayoutParams();
        layoutParams.width = (int) C12ES.LIZJ(88.0f, this.itemView.getContext());
        layoutParams.height = (int) C12ES.LIZJ(28.0f, this.itemView.getContext());
        C786410Ut5.J6((C197039127h) this.itemView.findViewById(R.id.cki), layoutParams);
        C786410Ut5.t0((RelationButton) this.itemView.findViewById(R.id.ckx), 8);
    }
}
