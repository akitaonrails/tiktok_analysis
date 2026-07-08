package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C01GW;
import X.C0HX6;
import X.C1076010e6h;
import X.C123100dR;
import X.C1242270iQr;
import X.C1242520iRG;
import X.C1243340iSa;
import X.C1252610ihX;
import X.C1253000iiA;
import X.C1260910iuv;
import X.C1308910kAL;
import X.C1356610lPH;
import X.C1357130lQ7;
import X.C1365450ldX;
import X.C1380890m2R;
import X.C1609500rzA;
import X.C1697810uHb;
import X.C1866820ygC;
import X.C1900870zZ7;
import X.C1906280zhq;
import X.C1906700ziW;
import X.C1906760zic;
import X.C1906880zio;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2215101Bmm;
import X.C2344009Gk;
import X.C341940Daq;
import X.C418440Gaw;
import X.C429790GtF;
import X.C444960Hcc;
import X.C452501pT;
import X.C703302op;
import X.C735410St1;
import X.C736420Sue;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C946803n0;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1605470rsf;
import X.EnumC1906270zhp;
import X.EnumC1906770zid;
import X.InterfaceC1508640pMU;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseTemplateNotificationCell<T extends InterfaceC1891350zJl> extends PowerCell<T> implements InterfaceC1508640pMU {
    public C0HX6 LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28((BaseTemplateNotificationCell) this, 375));
    public final char LLILLJJLI = 8237;
    public final int LLILLL = C341940Daq.LIZ(3.0d);
    public final int LLILZ = C341940Daq.LIZ(4.0d);
    public final int LLILZIL = C341940Daq.LIZ(16.0d);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28((BaseTemplateNotificationCell) this, 374));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28((BaseTemplateNotificationCell) this, 373));

    public void P5(EnumC1605470rsf enumC1605470rsf) {
    }

    @Override // X.InterfaceC1508640pMU
    public String T() {
        return "";
    }

    public abstract Observer<C1243340iSa> createAliasObserver();

    public abstract EnumC1906270zhp getScenario();

    public final EnumC1906770zid LJJLIIIJLJLI() {
        EnumC1906270zhp scenario = getScenario();
        if (scenario != null) {
            int i = C1906280zhq.LIZ[scenario.ordinal()];
            if (i == 1) {
                return EnumC1906770zid.ACTIVITY;
            }
            if (i == 2) {
                return EnumC1906770zid.FOLLOWER;
            }
            if (i == 3) {
                return EnumC1906770zid.SEARCH;
            }
            if (i == 4) {
                return EnumC1906770zid.AGGREGATE;
            }
        }
        return EnumC1906770zid.OTHER;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, (Observer) this.LLIZLLLIL.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().removeObserver((Observer) this.LLIZLLLIL.getValue());
        }
    }

    public final void N5(Object obj) {
        FollowRequestData followRequestData;
        C429790GtF.LIZ(this.itemView);
        BaseNotice baseNotice = null;
        if (obj instanceof BaseNotice) {
            baseNotice = (BaseNotice) obj;
        }
        if (baseNotice != null) {
            baseNotice.hasRead = true;
        }
        if ((obj instanceof FollowRequestData) && (followRequestData = (FollowRequestData) obj) != null) {
            followRequestData.setHasRead(true);
        }
    }

    public static C1906880zio L5(EnumC1906270zhp enumC1906270zhp, Context context) {
        int i;
        int i2;
        int i3;
        int iIntValue;
        int i4;
        int i5;
        int i6;
        int i7;
        Context contextLIZ = context;
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        Typeface value = null;
        if (enumC1906270zhp == EnumC1906270zhp.NEW_FOLLOWER) {
            if (C1906760zic.LIZIZ()) {
                value = C1906700ziW.LL.getValue();
            }
            if (C1906760zic.LIZIZ()) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            return new C1906880zio(56, 42, 40, 42, 0, 0, 0, 0, i7, 0, 0, value, 0, 0, 0.0f, 0, 0, 0, 0, 0, 33487841);
        }
        if (C1906760zic.LIZ(enumC1906270zhp)) {
            i = 48;
        } else {
            i = 56;
        }
        if (C1906760zic.LIZ(enumC1906270zhp)) {
            i2 = 36;
        } else {
            i2 = 42;
        }
        if (C1906760zic.LIZ(enumC1906270zhp)) {
            i3 = 36;
        } else {
            i3 = 40;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, contextLIZ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        if (C1906760zic.LIZIZ()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        if (C1906760zic.LIZIZ()) {
            value = C1906700ziW.LL.getValue();
        }
        if (C1906760zic.LIZ(enumC1906270zhp)) {
            i5 = 48;
        } else {
            i5 = 56;
        }
        if (C1906760zic.LIZIZ()) {
            i6 = 8;
        } else {
            i6 = 4;
        }
        return new C1906880zio(i, i2, i3, 42, 0, 0, iIntValue, R.attr.a1j, i4, 0, 0, value, i5, i6, 0.0f, 0, 56, 42, 8, 2, 1603809);
    }

    public static void S5(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public final String addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, long j) {
        CharSequence charSequence;
        int i;
        Integer numLIZJ;
        String strLJFF;
        Context context = getContext();
        if (j == 0) {
            charSequence = "";
        } else {
            C1866820ygC.LIZ.getClass();
            if (C1866820ygC.LIZ()) {
                strLJFF = C2215101Bmm.LJI(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C1866820ygC.LIZIZ());
            } else {
                strLJFF = C1356610lPH.LJFF(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), context);
            }
            String strReplace = new Regex("(.)").replace(strLJFF, "$1\u2060");
            if (!C444960Hcc.LIZJ(context)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(strReplace);
                sbLIZ.append(this.LLILLJJLI);
                strReplace = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(C444960Hcc.LIZ(context));
            sbLIZ2.append(strReplace);
            CharSequence charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            charSequence = charSequenceLIZIZ;
            if (charSequenceLIZIZ == null) {
                charSequence = spannableStringBuilder;
            }
        }
        boolean z = false;
        if (a0.LJJIZ(charSequence, this.LLILLJJLI, 0, false, 6) > -1) {
            i = 2;
        } else {
            i = 0;
        }
        EnumC1906270zhp enumC1906270zhp = EnumC1906270zhp.NEW_FOLLOWER;
        C1906760zic.LIZIZ();
        if (!TextUtils.isEmpty(charSequence)) {
            spannableStringBuilder.append(charSequence);
            if (C1906760zic.LIZIZ() && enumC1906270zhp != null) {
                z = true;
            }
            if (z) {
                C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(12, true), (spannableStringBuilder.length() - charSequence.length()) + i, spannableStringBuilder.length(), 17);
            }
            Context context2 = getContext();
            if (context2 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context2)) == null) {
                return "";
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), (spannableStringBuilder.length() - charSequence.length()) + i, spannableStringBuilder.length(), 17);
        }
        return charSequence.toString();
    }

    public final void applyContentTitleGap(C1906880zio c1906880zio, TextView textView) {
        int i = c1906880zio.LJIIIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (i != -1 && (textView instanceof TuxTextView)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams.topMargin = iLIZIZ;
            C786410Ut5.g6(textView, marginLayoutParams);
        }
    }

    public final void applyHeadStoryRing(C1906880zio c1906880zio, View view) {
        int i = c1906880zio.LIZ;
        if (i != -1) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))) + ((int) TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
            ((C1609500rzA) this.LL.getValue()).setRingStrokeWidthByAvatarSize(56);
            int i2 = c1906880zio.LIZ;
            if (i2 != 48) {
                if (i2 == 56) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            }
            S5(view, iLIZIZ);
        }
    }

    public final void applyTitleSize(C1906880zio c1906880zio, TextView textView) {
        int i = c1906880zio.LIZLLL;
        if (i != -1 && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).setTuxFont(i);
        }
        int i2 = c1906880zio.LJ;
        if (i2 != -1 && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).LJJJJI(i2);
        }
    }

    public final int getViewTopMarginAddSpace(View view, int i) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i;
    }

    public final C1252610ihX recommendParamsOfUser(User user, EnumC1260920iuw enumC1260920iuw) {
        Integer numValueOf;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null) {
            return null;
        }
        List<? extends Aweme> list = matchedFriendStruct.awemeList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        matchedFriendStruct.setAwemeListSize(numValueOf);
        List<? extends Aweme> list2 = matchedFriendStruct.awemeList;
        int i = 0;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<? extends Aweme> it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                Video video = it2.next().getVideo();
                if (video != null && video.getCover() != null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        matchedFriendStruct.setAwemeListVideoCoverSize(Integer.valueOf(i));
        matchedFriendStruct.setAwemeList(null);
        String str = matchedFriendStruct.recType;
        C1252610ihX.Companion.getClass();
        return new C1252610ihX("notification_page", "notification_page", enumC1260920iuw, str, C736420Sue.LIZ(user), user.getUid(), null, null, "", null, matchedFriendStruct.relationType, matchedFriendStruct.socialInfo, matchedFriendStruct, null, null, null, false, null, null, null, null, false, null, false, null);
    }

    public final void resetViewTopMargin(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
    }

    public final void I5(User user, String str, String str2, String str3, HashMap<String, String> map, String str4) {
        String str5;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJJJIZL(str2);
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
        c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJIILJJIL();
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJJLIIJ = user.getUid();
        c735410St1.LIZLLL = str;
        C1365450ldX.LIZLLL(c735410St1, user);
        c735410St1.LJZ = str2;
        c735410St1.LJZI = str3;
        c735410St1.LJJLIIIJILLIZJL = str4;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (str5 = matchedFriendStruct.recType) == null) {
            str5 = "";
        }
        c735410St1.LJIJJ = str5;
        C1380890m2R.LJII(c735410St1, C946803n0.LIZ(this.itemView));
        c735410St1.LJZL = Boolean.TRUE;
        c735410St1.LJIILJJIL();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        C1357130lQ7.LJFF(smartRouteBuildRoute, C946803n0.LIZ(this.itemView));
        C1357130lQ7.LJ(smartRouteBuildRoute, map);
        if (C703302op.LIZ(str2)) {
            smartRouteBuildRoute.withParam("position", str2);
        }
        C1252610ihX c1252610ihXRecommendParamsOfUser = recommendParamsOfUser(user, enumC1260920iuw);
        if (c1252610ihXRecommendParamsOfUser != null) {
            smartRouteBuildRoute.withParam("recommend_enter_profile_params", c1252610ihXRecommendParamsOfUser);
        }
        smartRouteBuildRoute.open();
    }

    public final void R5(String str, String str2, String str3, String str4, boolean z, String str5, HashMap<String, String> map, C1242270iQr c1242270iQr) {
        C1242520iRG.LIZ(str, str2, str3, map);
        if (!C123100dR.LIZ(str5)) {
            if (z) {
                str5 = "click_name";
            } else {
                str5 = "click_head";
            }
        }
        if (c1242270iQr != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
            c2344009Gk.LJIIIIZZ("inbox_search_position", "result");
            c2344009Gk.LJIIIIZZ("inbox_search_cell_type", c1242270iQr.LIZIZ);
            c2344009Gk.LJIIIIZZ("inbox_search_tab_name", c1242270iQr.LIZ);
            c2344009Gk.LJIIIIZZ("to_user_id", str);
            c2344009Gk.LJIIIIZZ("enter_method", "click_dm_search_cell");
            c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
            return;
        }
        String str6 = C1900870zZ7.LIZ;
        if (str6 == null) {
            str6 = "";
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str3);
        c2344009Gk2.LJIIIIZZ("enter_method", str5);
        c2344009Gk2.LJIIIIZZ("position", str6);
        c2344009Gk2.LJIIIIZZ("account_type", str4);
        c2344009Gk2.LJIIIIZZ("to_user_id", str);
        c2344009Gk2.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        C1380890m2R.LJIIIIZZ(c2344009Gk2, C946803n0.LIZ(this.itemView));
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk2.LIZ);
    }
}
