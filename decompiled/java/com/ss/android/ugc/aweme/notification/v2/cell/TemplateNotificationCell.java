package com.ss.android.ugc.aweme.notification.v2.cell;

import X.AbstractC1349310lDV;
import X.AbstractViewOnClickListenerC1907000zj0;
import X.C01GW;
import X.C0BV3;
import X.C0C64;
import X.C0OBG;
import X.C0OQ5;
import X.C0QB7;
import X.C0SDC;
import X.C1075780e6K;
import X.C1242270iQr;
import X.C1243340iSa;
import X.C1245020iVI;
import X.C1260910iuv;
import X.C1262570ixb;
import X.C128Y;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1357130lQ7;
import X.C1360460lVU;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C1508630pMT;
import X.C1570820qym;
import X.C1609500rzA;
import X.C1618770sE7;
import X.C1720106oR;
import X.C1900870zZ7;
import X.C1900970zZH;
import X.C1901000zZK;
import X.C1901230zZh;
import X.C1901610zaJ;
import X.C1902710zc5;
import X.C1902840zcI;
import X.C1902850zcJ;
import X.C1903780zdo;
import X.C1904270zeb;
import X.C1905050zfr;
import X.C1905080zfu;
import X.C1905130zfz;
import X.C1906140zhc;
import X.C1906180zhg;
import X.C1906760zic;
import X.C1906800zig;
import X.C1906880zio;
import X.C1906910zir;
import X.C1907070zj7;
import X.C1907110zjB;
import X.C1907120zjC;
import X.C1907140zjE;
import X.C1907160zjG;
import X.C1907190zjJ;
import X.C1907300zjU;
import X.C1907530zjr;
import X.C1907600zjy;
import X.C1907940zkW;
import X.C1908030zkf;
import X.C1D0F;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2252408s6;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C424560Gko;
import X.C429790GtF;
import X.C431420Gvs;
import X.C452501pT;
import X.C498470Jgj;
import X.C634610Oup;
import X.C703302op;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C890290YwF;
import X.C895230ZAb;
import X.C946803n0;
import X.C960203pA;
import X.EnumC1154130g8h;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1605470rsf;
import X.EnumC1905020zfo;
import X.EnumC1905950zhJ;
import X.EnumC1906160zhe;
import X.EnumC1906270zhp;
import X.EnumC1907220zjM;
import X.EnumC1907390zjd;
import X.EnumC624380OeK;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC1901490za7;
import X.InterfaceC1906810zih;
import X.InterfaceC1906920zis;
import X.InterfaceC1907020zj2;
import X.InterfaceC1907310zjV;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.ExtraActionTemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.v2.cell.TemplateNotificationCell;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.INotificationResultViewModelAbility;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class TemplateNotificationCell extends BaseTemplateNotificationCell<C1900970zZH> implements View.OnClickListener, View.OnLongClickListener, InterfaceC1907020zj2 {
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 817));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 818));
    public final String LLJIJIL;
    public final C01GW LLJILJIL;
    public C1905130zfz LLJILJILJ;
    public boolean LLJILLL;
    public List<? extends InterfaceC1906920zis> LLJJ;
    public long LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell, X.InterfaceC1508640pMU
    public final String T() {
        return "TemplateNotificationCell";
    }

    @Override // X.InterfaceC1907020zj2
    public final View.OnLongClickListener c2() {
        return this;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getEnterMethod() {
        return "notification";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final HashMap<String, String> D1() {
        String string;
        Bundle arguments;
        Bundle arguments2;
        Bundle arguments3;
        Bundle arguments4;
        Bundle arguments5;
        C1901230zZh c1901230zZh;
        C1901230zZh c1901230zZh2;
        HashMap<String, String> map = new HashMap<>();
        MusNotice musNoticeX5 = X5();
        String string2 = null;
        map.put("account_type", musNoticeX5 != null ? musNoticeX5.getAccountType() : null);
        String str = C1900870zZ7.LIZ;
        if (str != null) {
            map.put("inbox_position", str);
        }
        MusNotice musNoticeX52 = X5();
        if (musNoticeX52 == null || (string = Integer.valueOf(musNoticeX52.type).toString()) == null) {
            string = "";
        }
        map.put("notice_message_type", string);
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        map.put("sort_option_name", (c1900970zZH == null || (c1901230zZh2 = c1900970zZH.LLJI) == null) ? null : c1901230zZh2.LIZ);
        C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
        map.put("notification_tab_name", (c1900970zZH2 == null || (c1901230zZh = c1900970zZH2.LLJI) == null) ? null : c1901230zZh.LIZIZ);
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && (arguments3 = currentFragment.getArguments()) != null && arguments3.getInt("is_from_push", 0) == 1) {
            map.put("is_from_push", "1");
            Fragment currentFragment2 = getCurrentFragment();
            map.put("push_type", (currentFragment2 == null || (arguments5 = currentFragment2.getArguments()) == null) ? null : arguments5.getString("push_type"));
            Fragment currentFragment3 = getCurrentFragment();
            map.put("push_id", (currentFragment3 == null || (arguments4 = currentFragment3.getArguments()) == null) ? null : arguments4.getString("push_id"));
        }
        Fragment currentFragment4 = getCurrentFragment();
        if (C703302op.LIZ((currentFragment4 == null || (arguments2 = currentFragment4.getArguments()) == null) ? null : arguments2.getString("from_inner_user_num"))) {
            Fragment currentFragment5 = getCurrentFragment();
            if (currentFragment5 != null && (arguments = currentFragment5.getArguments()) != null) {
                string2 = arguments.getString("from_inner_user_num");
            }
            map.put("from_inner_user_num", string2);
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell
    public final Observer<C1243340iSa> createAliasObserver() {
        return new AObserverS230S0100000_28(this, 36);
    }

    @Override // X.InterfaceC1907020zj2
    public final Fragment getCurFragment() {
        return C946803n0.LIZ(this.itemView);
    }

    @Override // X.InterfaceC1907020zj2
    public final InterfaceC1907310zjV u0() {
        return (InterfaceC1907310zjV) this.LLJILJIL.getValue();
    }

    public TemplateNotificationCell() {
        C1902850zcJ.LIZ.getClass();
        Object obj = ((Map) ((C1902840zcI) C1902850zcJ.LIZIZ.getValue()).LJ.getValue()).get("AND_TEXT");
        String string = (String) (obj == null ? null : obj);
        if (string == null) {
            C844470XAv.LIZ.getClass();
            string = C844470XAv.LIZ().getString(2131838297);
        }
        this.LLJIJIL = string;
        this.LLJILJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(303));
        this.LLJILLL = true;
        this.LLJJ = C13BV.INSTANCE;
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 815));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 816));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 814));
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 819));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final void LJJIL() {
        MusNotice musNotice;
        C1900970zZH c1900970zZH;
        Function1<MusNotice, Unit> function1;
        C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
        if (c1900970zZH2 == null || (musNotice = c1900970zZH2.LL) == null || (c1900970zZH = (C1900970zZH) getItem()) == null || (function1 = c1900970zZH.LLJILJIL) == null) {
            return;
        }
        function1.invoke(musNotice);
    }

    @Override // X.InterfaceC1907020zj2
    public final int Q4() {
        return getLayoutPosition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MusNotice X5() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LL;
        }
        return null;
    }

    @Override // X.InterfaceC1907020zj2
    public final void a4() {
        GeneralTemplateNotice generalTemplateNotice;
        MusNotice musNoticeX5 = X5();
        if (musNoticeX5 != null) {
            musNoticeX5.hasRead = true;
        }
        MusNotice musNoticeX52 = X5();
        if (musNoticeX52 == null || (generalTemplateNotice = musNoticeX52.templateNotice) == null) {
            return;
        }
        generalTemplateNotice.hasRead = true;
    }

    public final String a6() {
        GeneralTemplateNotice generalTemplateNotice;
        String strLIZ;
        GeneralTemplateNotice generalTemplateNotice2;
        MusNotice musNoticeX5 = X5();
        String str = (musNoticeX5 == null || (generalTemplateNotice2 = musNoticeX5.templateNotice) == null) ? null : generalTemplateNotice2.schemaUrl;
        MusNotice musNoticeX52 = X5();
        return (musNoticeX52 == null || (generalTemplateNotice = musNoticeX52.templateNotice) == null || (strLIZ = C1906180zhg.LIZ(generalTemplateNotice, str)) == null) ? str : strLIZ;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getAccountType() {
        MusNotice musNoticeX5 = X5();
        if (musNoticeX5 != null) {
            return musNoticeX5.getAccountType();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final String getEnterFrom() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LLILZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final String getPageName() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LLIZLLLIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell
    public final EnumC1906270zhp getScenario() {
        InterfaceC1901490za7 interfaceC1901490za7;
        C128Y currentFragment = getCurrentFragment();
        if (!(currentFragment instanceof InterfaceC1901490za7) || (interfaceC1901490za7 = (InterfaceC1901490za7) currentFragment) == null) {
            return null;
        }
        return interfaceC1901490za7.wj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final String getTabName() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LLILLL;
        }
        return null;
    }

    public final User getUserFromNotice() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        MusNotice musNoticeX5 = X5();
        if (musNoticeX5 == null || (generalTemplateNotice = musNoticeX5.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || list.size() != 1) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final String i0() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LLJIJIL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final boolean i3() {
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH != null) {
            return c1900970zZH.LLILZIL;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onItemViewCreated();
        this.LLJJI = System.currentTimeMillis();
        C786410Ut5.I7(this, this.itemView);
        this.itemView.setOnLongClickListener(this);
        View view = this.itemView;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS128S0100000_28(view, 52));
        C2211631BhB.LJ(this.itemView, new AwS607S0100000_28(this, 104));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View viewFindViewById = this.itemView.findViewById(R.id.pf1);
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(viewFindViewById, enumC1906160zhe, 0.0f);
        C1906880zio c1906880zioL5 = BaseTemplateNotificationCell.L5(getScenario(), getContext());
        applyHeadStoryRing(c1906880zioL5, (View) this.LL.getValue());
        C1907110zjB c1907110zjB = (C1907110zjB) this.itemView.findViewById(R.id.peb);
        C1907300zjU notificationHeadSingleFromXml = c1907110zjB.getNotificationHeadSingleFromXml();
        int i = c1906880zioL5.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (i != -1) {
            BaseTemplateNotificationCell.S5(notificationHeadSingleFromXml, iLIZIZ);
        }
        applyHeadStoryRing(c1906880zioL5, c1907110zjB.getNotificationHeadPlaceholderFromXml());
        SmartAvatarImageView notificationHeadUser1FromXml = c1907110zjB.getNotificationHeadUser1FromXml();
        ConstraintLayout notificationHeadDoubleFromXml = c1907110zjB.getNotificationHeadDoubleFromXml();
        SmartAvatarImageView notificationHeadUser2FromXml = c1907110zjB.getNotificationHeadUser2FromXml();
        int i2 = c1906880zioL5.LIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        if (i2 != -1) {
            int i3 = c1906880zioL5.LIZIZ;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            if (i3 != -1) {
                int i4 = c1906880zioL5.LIZJ;
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
                if (i4 != -1) {
                    BaseTemplateNotificationCell.S5(notificationHeadDoubleFromXml, iLIZIZ2);
                    BaseTemplateNotificationCell.S5(notificationHeadUser1FromXml, iLIZIZ3);
                    BaseTemplateNotificationCell.S5(notificationHeadUser2FromXml, iLIZIZ4);
                }
            }
        }
        int iLIZIZ5 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LIZIZ)))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) notificationHeadUser1FromXml.getLayoutParams();
        marginLayoutParams2.topMargin = iLIZIZ5;
        marginLayoutParams2.setMarginEnd(iLIZIZ5);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(notificationHeadUser1FromXml);
        notificationHeadUser1FromXml.setLayoutParams(marginLayoutParams2);
        C1907160zjG c1907160zjG = (C1907160zjG) this.itemView.findViewById(R.id.peh);
        c1907160zjG.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LIZ))));
        applyTitleSize(c1906880zioL5, c1907160zjG.getNotification_name());
        TuxTextView notification_name = c1907160zjG.getNotification_name();
        Typeface typeface = c1906880zioL5.LJIILJJIL;
        if (typeface != null && (notification_name instanceof TuxTextView)) {
            notification_name.setTypeface(typeface);
        }
        TuxTextView notificationContentFromXml = c1907160zjG.getNotificationContentFromXml();
        int i5 = c1906880zioL5.LJII;
        if (i5 != -1 && (notificationContentFromXml instanceof TuxTextView) && notificationContentFromXml != null) {
            notificationContentFromXml.setTextColor(i5);
        }
        C1907120zjC c1907120zjC = (C1907120zjC) this.itemView.findViewById(R.id.pf0);
        TuxIconView notificationArrowFromXml = c1907120zjC.getNotificationArrowFromXml();
        Drawable drawable = c1906880zioL5.LJIIL;
        if (drawable == null) {
            notificationArrowFromXml.setTintColor(C960203pA.LIZ(R.attr.a1h, notificationArrowFromXml.getContext()));
        } else if (notificationArrowFromXml instanceof TuxIconView) {
            notificationArrowFromXml.setImageDrawable(drawable);
        }
        applyContentTitleGap(c1906880zioL5, c1907160zjG.getNotificationContentFromXml());
        C424560Gko rightNotificationCoverFromXml = c1907120zjC.getRightNotificationCoverFromXml();
        int i6 = c1906880zioL5.LJIILL;
        if (i6 != -1 && (rightNotificationCoverFromXml instanceof C424560Gko)) {
            BaseTemplateNotificationCell.S5(rightNotificationCoverFromXml, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i6))));
        }
        C424560Gko rightNotificationCoverFromXml2 = c1907120zjC.getRightNotificationCoverFromXml();
        if (c1906880zioL5.LJIILLIIL != -1 && (rightNotificationCoverFromXml2 instanceof C424560Gko)) {
            rightNotificationCoverFromXml2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(r6))));
        }
        View view2 = (View) this.LLJJIJIIJIL.getValue();
        C424560Gko c424560Gko = (C424560Gko) this.LLJJIII.getValue();
        C424560Gko c424560Gko2 = (C424560Gko) this.LLJJIJI.getValue();
        if (view2 != null && c424560Gko != null && c424560Gko2 != null) {
            int i7 = c1906880zioL5.LJIJI;
            if (i7 != -1) {
                BaseTemplateNotificationCell.S5(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i7))));
            }
            int i8 = c1906880zioL5.LJIJJ;
            if (i8 != -1) {
                BaseTemplateNotificationCell.S5(c424560Gko, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8))));
                BaseTemplateNotificationCell.S5(c424560Gko2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LJIJJ))));
            }
            if (c1906880zioL5.LJIJJLI != -1) {
                c424560Gko.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(r0))));
                c424560Gko2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LJIJJLI))));
                Context context = getContext();
                if (context != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
                    c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LJIJJLI + 1))));
                    c424560Gko.setBackground(c384050F3z.LIZ(context));
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zn);
                    c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zioL5.LJIJJLI + 1))) + 1);
                    c424560Gko2.setBackground(c384050F3z2.LIZ(context));
                }
            }
            int i9 = c1906880zioL5.LJIL;
            if (i9 != -1) {
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i9)));
                C1331100kk8 c1331100kk8 = ((C1331070kk5) c424560Gko.getHierarchy()).LIZJ;
                if (c1331100kk8 == null) {
                    c1331100kk8 = new C1331100kk8();
                }
                c1331100kk8.LJIIIZ(fLIZIZ);
                c1331100kk8.LJFF = C1618770sE7.LIZ(R.attr.bx);
                c1331100kk8.LJFF(fLIZIZ);
                ((C1331070kk5) c424560Gko.getHierarchy()).LJJIII(c1331100kk8);
                ViewGroup.LayoutParams layoutParams = c424560Gko.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    float f = 2 * fLIZIZ;
                    marginLayoutParams.width = (int) (marginLayoutParams.width + f);
                    marginLayoutParams.height = (int) (marginLayoutParams.height + f);
                    int i10 = -((int) fLIZIZ);
                    marginLayoutParams.setMarginStart(i10);
                    marginLayoutParams.bottomMargin = i10;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424560Gko);
                    c424560Gko.setLayoutParams(marginLayoutParams);
                }
            }
        }
        if (c1906880zioL5.LIZ == 56) {
            resetViewTopMargin(c1907120zjC.getNotificationArrowRootFromXml(), getViewTopMarginAddSpace(c1907120zjC.getNotificationArrowRootFromXml(), this.LLILZ));
            resetViewTopMargin(c1907120zjC.getNotificationButtonFromXml(), getViewTopMarginAddSpace(c1907120zjC.getNotificationButtonFromXml(), this.LLILZ));
            resetViewTopMargin(c1907120zjC.getRelationBtnFromXml(), getViewTopMarginAddSpace(c1907120zjC.getRelationBtnFromXml(), this.LLILZ));
        }
        this.LLJILLL = c1906880zioL5.LJIILIIL == 1;
        int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        C1907120zjC c1907120zjC2 = (C1907120zjC) this.itemView.findViewById(R.id.pf0);
        C424560Gko rightNotificationCoverFromXml3 = c1907120zjC2.getRightNotificationCoverFromXml();
        if (iLIZIZ6 > 0) {
            BaseTemplateNotificationCell.S5(rightNotificationCoverFromXml3, iLIZIZ6);
        }
        C424560Gko notificationStickerCoverFromXml = c1907120zjC2.getRightNotificationCoverWithIconFromXml().getNotificationStickerCoverFromXml();
        if (iLIZIZ6 > 0) {
            BaseTemplateNotificationCell.S5(notificationStickerCoverFromXml, iLIZIZ6);
        }
        ViewGroup.LayoutParams layoutParams2 = c1907120zjC2.getRightNotificationCoverWithIconFromXml().getLayoutParams();
        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + iLIZIZ6;
        layoutParams2.height = iLIZIZ6 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        long j = this.LLJJI;
        if (j > 0) {
            C1508630pMT.LIZ.getClass();
            C1508630pMT.LIZIZ(j, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Function0<Unit> function0;
        super.onViewAttachedToWindow();
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH == null || (function0 = c1900970zZH.LLJILLL) == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final String v5() {
        String str;
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        return (c1900970zZH == null || (str = c1900970zZH.LLILLJJLI) == null) ? "" : str;
    }

    @Override // X.InterfaceC1907020zj2
    public final C1905130zfz S0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1907020zj2
    public final List<InterfaceC1906920zis> getInterceptors() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1907020zj2
    public final void LLD(EnumC1154130g8h enumC1154130g8h) {
        b6(EnumC1905020zfo.Click, enumC1154130g8h);
        a4();
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.cell.BaseTemplateNotificationCell
    public final void P5(EnumC1605470rsf enumC1605470rsf) {
        boolean z;
        if (enumC1605470rsf != EnumC1605470rsf.ON && enumC1605470rsf != EnumC1605470rsf.OFF) {
            z = false;
        } else {
            z = true;
        }
        if (C1906760zic.LIZ(getScenario())) {
            BaseTemplateNotificationCell.S5(this.LLILZLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        } else if (z) {
            BaseTemplateNotificationCell.S5(this.LLILZLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        } else {
            BaseTemplateNotificationCell.S5(this.LLILZLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        }
    }

    public final void T5(SmartRoute smartRoute) {
        C1905050zfr c1905050zfr;
        MusNotice musNoticeX5;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        C1905130zfz c1905130zfz = this.LLJILJILJ;
        if (c1905130zfz != null && (c1905050zfr = c1905130zfz.LIZIZ) != null && c1905050zfr.LJFF && (musNoticeX5 = X5()) != null && (generalTemplateNotice = musNoticeX5.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null) {
            smartRoute.withParam("recommend_enter_profile_params", recommendParamsOfUser(user, EnumC1260920iuw.INBOX_NOTICE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U5(X.C2344009Gk r7) {
        /*
            r6 = this;
            boolean r0 = X.C297160Bko.LIZ()
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r6.X5()
            r1 = 0
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r0.templateNotice
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData r0 = r0.extraData
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.comment
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.getNoticeRepliedCid()
        L1d:
            boolean r5 = X.C703302op.LIZ(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r6.X5()
            r4 = 0
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r0.templateNotice
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData r0 = r0.extraData
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentSuggestInfo r0 = r0.commentSuggestInfo
            if (r0 == 0) goto L7a
            int r0 = r0.type
        L36:
            r3 = 1
            if (r0 == 0) goto L3a
            r4 = 1
        L3a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r6.X5()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r0.templateNotice
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData r0 = r0.extraData
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentSuggestInfo r0 = r0.commentSuggestInfo
            if (r0 == 0) goto L77
            int r0 = r0.type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L77
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L6e
            java.lang.String r2 = "on_device"
        L5d:
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L6d
            java.lang.String r1 = "show_type"
            java.lang.String r0 = "emoji"
            r7.LJFF(r1, r0)
            java.lang.String r0 = "model_source"
            r7.LJFF(r0, r2)
        L6d:
            return
        L6e:
            int r0 = r2.intValue()
            if (r0 != r3) goto L77
            java.lang.String r2 = "cloud"
            goto L5d
        L77:
            java.lang.String r2 = "none"
            goto L5d
        L7a:
            r0 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.cell.TemplateNotificationCell.U5(X.09Gk):void");
    }

    @Override // X.InterfaceC1907020zj2
    public final boolean c3(String str) {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        MusNotice musNoticeX5 = X5();
        if (musNoticeX5 != null && (generalTemplateNotice = musNoticeX5.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null && C1245020iVI.LIZLLL(user)) {
            String enterFrom = getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "notification_page";
            }
            I5(user, enterFrom, C1900870zZ7.LIZ, getAccountType(), D1(), str);
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1900970zZH c1900970zZH) {
        boolean z;
        User userFromNotice;
        MusNotice musNoticeX5;
        GeneralTemplateNotice generalTemplateNotice;
        UrlModel urlModel;
        NoticeUITemplate noticeUITemplate;
        C1242270iQr c1242270iQr;
        C1242270iQr c1242270iQr2;
        C1242270iQr c1242270iQr3;
        super.onBindItemView(c1900970zZH);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MusNotice musNoticeX52 = X5();
        if (musNoticeX52 == null) {
            return;
        }
        this.LLJJ = c1900970zZH.LLILZLL;
        C1905130zfz c1905130zfzLIZ = C1905080zfu.LIZ(musNoticeX52);
        this.LLJILJILJ = c1905130zfzLIZ;
        if (c1905130zfzLIZ != null) {
            c1905130zfzLIZ.LIZJ();
        }
        AbstractViewOnClickListenerC1907000zj0 abstractViewOnClickListenerC1907000zj0 = (AbstractViewOnClickListenerC1907000zj0) this.itemView.findViewById(R.id.peb);
        MusNotice musNotice = null;
        if (abstractViewOnClickListenerC1907000zj0 != null) {
            C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
            if (c1900970zZH2 != null) {
                c1242270iQr3 = c1900970zZH2.LLJ;
            } else {
                c1242270iQr3 = null;
            }
            abstractViewOnClickListenerC1907000zj0.LIZ(musNoticeX52, this, c1242270iQr3);
        }
        C1907160zjG c1907160zjG = (C1907160zjG) this.itemView.findViewById(R.id.peh);
        if (c1907160zjG != null) {
            c1907160zjG.setCanShowRelationLabel(this.LLJILLL);
        }
        AbstractViewOnClickListenerC1907000zj0 abstractViewOnClickListenerC1907000zj02 = (AbstractViewOnClickListenerC1907000zj0) this.itemView.findViewById(R.id.peh);
        if (abstractViewOnClickListenerC1907000zj02 != null) {
            C1900970zZH c1900970zZH3 = (C1900970zZH) getItem();
            if (c1900970zZH3 != null) {
                c1242270iQr2 = c1900970zZH3.LLJ;
            } else {
                c1242270iQr2 = null;
            }
            abstractViewOnClickListenerC1907000zj02.LIZ(musNoticeX52, this, c1242270iQr2);
        }
        AbstractViewOnClickListenerC1907000zj0 abstractViewOnClickListenerC1907000zj03 = (AbstractViewOnClickListenerC1907000zj0) this.itemView.findViewById(R.id.pf0);
        if (abstractViewOnClickListenerC1907000zj03 != null) {
            C1900970zZH c1900970zZH4 = (C1900970zZH) getItem();
            if (c1900970zZH4 != null) {
                c1242270iQr = c1900970zZH4.LLJ;
            } else {
                c1242270iQr = null;
            }
            abstractViewOnClickListenerC1907000zj03.LIZ(musNoticeX52, this, c1242270iQr);
        }
        C1900970zZH c1900970zZH5 = (C1900970zZH) getItem();
        if (c1900970zZH5 != null && c1900970zZH5.LLIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLLLIL(((C1907120zjC) this.itemView.findViewById(R.id.pf0)).getIvNotificationRedDotFromXml(), 8);
        }
        ((C1907530zjr) this.itemView.findViewById(R.id.pdq)).LIZ(musNoticeX52, this);
        C1907300zjU notificationHeadSingleFromXml = ((C1907110zjB) this.itemView.findViewById(R.id.peb)).getNotificationHeadSingleFromXml();
        if (notificationHeadSingleFromXml != null) {
            GeneralTemplateNotice generalTemplateNotice2 = musNoticeX52.templateNotice;
            if (generalTemplateNotice2 != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null) {
                urlModel = noticeUITemplate.avatarBadgeUrl;
            } else {
                urlModel = null;
            }
            Context context = getContext();
            if (context != null) {
                this.LLILZLL = notificationHeadSingleFromXml;
                if (((C1609500rzA) this.LL.getValue()).getMode() == EnumC1605470rsf.NONE) {
                    C1907140zjE.LIZ.getClass();
                    C1907140zjE.LIZIZ(notificationHeadSingleFromXml);
                    C1907140zjE.LIZ(notificationHeadSingleFromXml, context, urlModel, C960203pA.LIZ(R.attr.bx, notificationHeadSingleFromXml.getContext()), true);
                }
            }
        }
        if (getScenario() != EnumC1906270zhp.INBOX_SEARCH && getScenario() != EnumC1906270zhp.AGGREGATE_PAGE && (musNoticeX5 = X5()) != null && (generalTemplateNotice = musNoticeX5.templateNotice) != null && generalTemplateNotice.type != null) {
            userFromNotice = getUserFromNotice();
        } else {
            userFromNotice = null;
        }
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLIZ.getValue();
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZLLL(userFromNotice);
        }
        MusNotice musNoticeX53 = X5();
        if (musNoticeX53 != null) {
            int layoutPosition = getLayoutPosition();
            getItem();
            C1907600zjy c1907600zjy = new C1907600zjy(musNoticeX53, layoutPosition, i3());
            Iterator<? extends InterfaceC1906920zis> it2 = this.LLJJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c1907600zjy);
            }
        }
        C1907160zjG c1907160zjG2 = (C1907160zjG) this.itemView.findViewById(R.id.peh);
        TuxTextView notification_name = c1907160zjG2.getNotification_name();
        View notificationContentFromXml = c1907160zjG2.getNotificationContentFromXml();
        C0QB7 mutualRelationViewFromXml = c1907160zjG2.getMutualRelationViewFromXml();
        int visibility = c1907160zjG2.getTitle_container().getVisibility();
        if (notification_name != null && notificationContentFromXml != null && visibility != 8 && notification_name.getVisibility() != 8 && notification_name.getTextSize() == this.LLILZIL && notificationContentFromXml.getVisibility() != 8) {
            if (mutualRelationViewFromXml != null && mutualRelationViewFromXml.getVisibility() != 8) {
                resetViewTopMargin(notificationContentFromXml, 0);
            } else {
                resetViewTopMargin(notificationContentFromXml, this.LLILLL);
            }
        }
        boolean z2 = musNoticeX52.hasRead;
        View view = this.itemView;
        C1900970zZH c1900970zZH6 = (C1900970zZH) getItem();
        if (c1900970zZH6 != null && c1900970zZH6.LLIZ && view != null) {
            N5(view);
            if (!z2) {
                C429790GtF.LIZIZ(view);
            }
        }
        C1508630pMT.LIZ.getClass();
        C1508630pMT.LIZ(jCurrentTimeMillis, this);
        INotificationResultViewModelAbility iNotificationResultViewModelAbility = (INotificationResultViewModelAbility) this.LLJJJ.getValue();
        if (iNotificationResultViewModelAbility != null) {
            C1900970zZH c1900970zZH7 = (C1900970zZH) getItem();
            if (c1900970zZH7 != null) {
                musNotice = c1900970zZH7.LL;
            }
            if (iNotificationResultViewModelAbility.rD1(musNotice)) {
                View view2 = this.itemView;
                Context context2 = getContext();
                if (context2 != null) {
                    HandlerHook.viewPostDelay(this.itemView, new ARunnableS74S0200000_5(context2, view2, 49), 100L);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        GeneralTemplateNotice generalTemplateNotice;
        GeneralTemplateNotice generalTemplateNotice2;
        NoticeUITemplate noticeUITemplate;
        String str;
        String str2;
        String strLIZ;
        String str3;
        String accountType;
        String templateId;
        int i;
        Activity activityLIZ;
        GeneralTemplateNotice generalTemplateNotice3;
        GeneralTemplateNotice generalTemplateNotice4;
        Integer num;
        GeneralTemplateNotice generalTemplateNotice5;
        Integer num2;
        GeneralTemplateNotice generalTemplateNotice6;
        Integer num3;
        MusNotice musNoticeX5;
        MusNotice musNoticeX52;
        GeneralTemplateNotice generalTemplateNotice7;
        Integer num4;
        GeneralTemplateNotice generalTemplateNotice8;
        Integer num5;
        C1905050zfr c1905050zfr;
        GeneralTemplateNotice generalTemplateNotice9;
        String str4;
        String strLIZ2;
        GeneralTemplateNotice generalTemplateNotice10;
        Integer num6;
        String str5;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        q(view);
        NoticeVideoManager.InnerManager innerManagerLIZ = NoticeVideoManager.LIZ();
        if (innerManagerLIZ != null) {
            C2252408s6.LJIIIZ(new AwS422S0200000_21(X5(), innerManagerLIZ, 50));
        }
        String strA6 = a6();
        if (strA6 != null) {
            C1905130zfz c1905130zfz = this.LLJILJILJ;
            if (c1905130zfz != null) {
                strLIZ2 = c1905130zfz.LIZ(EnumC1905950zhJ.CELL, strA6);
            } else {
                strLIZ2 = null;
            }
            MusNotice musNoticeX53 = X5();
            if (musNoticeX53 != null && (generalTemplateNotice10 = musNoticeX53.templateNotice) != null && (num6 = generalTemplateNotice10.type) != null && num6.intValue() == 210) {
                IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
                String pageName = getPageName();
                String enterFrom = getEnterFrom();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C1900970zZH c1900970zZH = (C1900970zZH) getItem();
                if (c1900970zZH != null) {
                    str5 = c1900970zZH.LLJIJIL;
                } else {
                    str5 = null;
                }
                sbLIZ.append(str5);
                sbLIZ.append("_i");
                sbLIZ.append(getLayoutPosition());
                strA6 = iECommerceService.modifySchemaOfNotice(strA6, pageName, enterFrom, C2188811AlT.LIZIZ(sbLIZ), view);
            } else if (strLIZ2 != null) {
                strA6 = strLIZ2;
            }
        } else {
            strA6 = null;
        }
        MusNotice musNoticeX54 = X5();
        String str6 = "";
        if (musNoticeX54 != null && (generalTemplateNotice9 = musNoticeX54.templateNotice) != null) {
            EnumC1907390zjd enumC1907390zjd = EnumC1907390zjd.Root;
            int layoutPosition = getLayoutPosition();
            getItem();
            C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
            if (c1900970zZH2 == null || (str4 = c1900970zZH2.LLILZ) == null) {
                str4 = "";
            }
            C1907070zj7 c1907070zj7 = new C1907070zj7(generalTemplateNotice9, view, strA6, enumC1907390zjd, layoutPosition, str4, i3(), generalTemplateNotice9.LIZIZ, this);
            Iterator<? extends InterfaceC1906920zis> it2 = this.LLJJ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ(c1907070zj7)) {
                    LLD(EnumC1154130g8h.OTHERS);
                    return;
                }
            }
        }
        C1905130zfz c1905130zfz2 = this.LLJILJILJ;
        if (c1905130zfz2 != null && (c1905050zfr = c1905130zfz2.LIZIZ) != null && c1905050zfr.LJFF && c3("click_cell")) {
            LLD(EnumC1154130g8h.OTHERS);
            return;
        }
        C1905130zfz c1905130zfz3 = this.LLJILJILJ;
        if (c1905130zfz3 != null) {
            c1905130zfz3.LIZIZ(getEnterFrom());
        }
        if (strA6 != null && strA6.length() != 0) {
            String enterFrom2 = getEnterFrom();
            if (strA6 == null) {
                strLIZ = null;
            } else {
                if (enterFrom2 == null) {
                    str2 = "notification_page";
                } else {
                    str2 = enterFrom2;
                }
                String strLIZ3 = C0OQ5.LIZ(strA6, "enter_from", str2);
                if (enterFrom2 == null) {
                    enterFrom2 = "notification_page";
                }
                strLIZ = C0OQ5.LIZ(strLIZ3, "refer", enterFrom2);
            }
            Bundle bundle = new Bundle();
            MusNotice musNoticeX55 = X5();
            if (musNoticeX55 != null && (generalTemplateNotice6 = musNoticeX55.templateNotice) != null && (num3 = generalTemplateNotice6.type) != null && num3.intValue() == 41 && (((musNoticeX5 = X5()) != null && (generalTemplateNotice8 = musNoticeX5.templateNotice) != null && (num5 = generalTemplateNotice8.legacySubType) != null && num5.intValue() == 3) || ((musNoticeX52 = X5()) != null && (generalTemplateNotice7 = musNoticeX52.templateNotice) != null && (num4 = generalTemplateNotice7.legacySubType) != null && num4.intValue() == 10))) {
                C786410Ut5.LJJJI("comment_enter_method", "CLICK_LIKE_COMMENT_NOTICE", bundle);
            }
            MusNotice musNoticeX56 = X5();
            if (musNoticeX56 != null && (generalTemplateNotice5 = musNoticeX56.templateNotice) != null && (num2 = generalTemplateNotice5.type) != null && num2.intValue() == 323) {
                C786410Ut5.LJJJI("video_from", "STORY_ENTRANCE_DEFAULT", bundle);
            }
            MusNotice musNoticeX57 = X5();
            if (musNoticeX57 != null && (generalTemplateNotice4 = musNoticeX57.templateNotice) != null && (num = generalTemplateNotice4.type) != null && num.intValue() == 20138) {
                bundle.putBoolean("show_repost_guide_tooltip", C1360460lVU.LIZIZ.LJJJJIZL());
            }
            MusNotice musNoticeX58 = X5();
            if (musNoticeX58 != null) {
                str3 = musNoticeX58.nid;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("notice_id_for_comment", str3, bundle);
            MusNotice musNoticeX59 = X5();
            if (musNoticeX59 != null) {
                accountType = musNoticeX59.getAccountType();
            } else {
                accountType = null;
            }
            C786410Ut5.LJJJI("notice_type_for_comment", accountType, bundle);
            MusNotice musNoticeX510 = X5();
            if (musNoticeX510 != null) {
                templateId = musNoticeX510.getTemplateId();
            } else {
                templateId = null;
            }
            C786410Ut5.LJJJI("notice_template_id_for_comment", templateId, bundle);
            if (strLIZ != null) {
                LLD(EnumC1154130g8h.OTHERS);
                MusNotice musNoticeX511 = X5();
                if (musNoticeX511 != null && (generalTemplateNotice3 = musNoticeX511.templateNotice) != null) {
                    i = generalTemplateNotice3.LIZ;
                } else {
                    i = -1;
                }
                v(i);
                if (a0.LJJIIZI(strLIZ, "profile/viewer", false)) {
                    ((IProfileService) ServiceManager.get().getService(IProfileService.class)).mobClickEnterProfileViewer();
                }
                Context context = getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    NoticeVideoManager noticeVideoManager = NoticeVideoManager.LL;
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, strLIZ);
                    noticeVideoManager.getClass();
                    NoticeVideoManager.LIZJ(smartRouteBuildRoute, strLIZ);
                    C1357130lQ7.LJ(smartRouteBuildRoute, D1());
                    C1357130lQ7.LJFF(smartRouteBuildRoute, getCurFragment());
                    String str7 = C1900870zZ7.LIZ;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    smartRouteBuildRoute.withParam("inbox_position", str6);
                    smartRouteBuildRoute.withParam(bundle);
                    T5(smartRouteBuildRoute);
                    smartRouteBuildRoute.open();
                    return;
                }
                NoticeVideoManager noticeVideoManager2 = NoticeVideoManager.LL;
                C844470XAv.LIZ.getClass();
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(C844470XAv.LIZ(), strLIZ);
                String str8 = C1900870zZ7.LIZ;
                if (str8 != null) {
                    str6 = str8;
                }
                smartRouteBuildRoute2.withParam("inbox_position", str6);
                smartRouteBuildRoute2.withParam(bundle);
                T5(smartRouteBuildRoute2);
                noticeVideoManager2.getClass();
                NoticeVideoManager.LIZJ(smartRouteBuildRoute2, strLIZ);
                C1357130lQ7.LJ(smartRouteBuildRoute2, D1());
                smartRouteBuildRoute2.open();
                return;
            }
            return;
        }
        MusNotice musNoticeX512 = X5();
        if (musNoticeX512 != null && (generalTemplateNotice2 = musNoticeX512.templateNotice) != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (str = noticeUITemplate.toastText) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("TemplateNotificationCell", "schemaUrl is null");
        C1907190zjJ c1907190zjJ = C1907190zjJ.LIZ;
        MusNotice musNoticeX513 = X5();
        if (musNoticeX513 != null) {
            generalTemplateNotice = musNoticeX513.templateNotice;
        } else {
            generalTemplateNotice = null;
        }
        EnumC1907220zjM enumC1907220zjM = EnumC1907220zjM.ROOT;
        c1907190zjJ.getClass();
        C1907190zjJ.LIZIZ(generalTemplateNotice, enumC1907220zjM, "not_schema");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.aaj, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Fragment curFragment;
        MusNotice musNotice;
        C1900970zZH c1900970zZH;
        Function1<MusNotice, Unit> function1;
        MusNotice musNotice2;
        GeneralTemplateNotice generalTemplateNotice;
        C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
        if (c1900970zZH2 != null && (musNotice2 = c1900970zZH2.LL) != null && (generalTemplateNotice = musNotice2.templateNotice) != null && generalTemplateNotice.shouldKeep) {
            return false;
        }
        C1900970zZH c1900970zZH3 = (C1900970zZH) getItem();
        if (c1900970zZH3 != null && (musNotice = c1900970zZH3.LL) != null && (c1900970zZH = (C1900970zZH) getItem()) != null && (function1 = c1900970zZH.LLJILJILJ) != null) {
            function1.invoke(musNotice);
        }
        if (C0BV3.LIZ() && (curFragment = getCurFragment()) != null) {
            C895230ZAb.LIZ(curFragment);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // X.InterfaceC1907020zj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r10.X5()
            r9 = 0
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r3 = r0.templateNotice
            if (r3 == 0) goto L50
            java.lang.Long r2 = r3.nid     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3f
            r2.longValue()     // Catch: java.lang.Throwable -> L41
            com.ss.android.ugc.aweme.notice.repo.list.bean.ActionToReportStruct r0 = r3.actions     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3f
            boolean r1 = r0.click     // Catch: java.lang.Throwable -> L41
            r0 = 1
            if (r1 != r0) goto L3f
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L41
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r4 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Throwable -> L41
            X.0565 r0 = X.AnonymousClass0565.NOTICE_ACTION_CLICK     // Catch: java.lang.Throwable -> L41
            int r7 = r0.getValue()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = r3.actionMeta     // Catch: java.lang.Throwable -> L41
            X.11NZ r1 = r4.reportNoticeAction(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L41
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Throwable -> L41
            X.01kM r0 = r0.LJJLJ()     // Catch: java.lang.Throwable -> L41
        L3b:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L41
            goto L4d
        L3f:
            r0 = r9
            goto L3b
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4d:
            X.C189200o6.m1boximpl(r0)
        L50:
            if (r11 == 0) goto L7a
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.LLJJIJIL
            int r1 = r11.getId()
            r0 = 2131383046(0x7f0a5306, float:1.8386455E38)
            if (r1 == r0) goto L91
            int r1 = r11.getId()
            r0 = 2131383044(0x7f0a5304, float:1.838645E38)
            if (r1 == r0) goto L91
            int r1 = r11.getId()
            r0 = 2131388806(0x7f0a6986, float:1.8398137E38)
            if (r1 != r0) goto L8a
            X.0zip r0 = X.EnumC1906890zip.PHOTO
            java.lang.String r1 = r0.getValue()
        L75:
            java.lang.String r0 = "click_area"
            r2.put(r0, r1)
        L7a:
            X.0zcO r2 = X.C1902900zcO.LIZ
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r10.X5()
            if (r0 == 0) goto L88
            java.lang.String r1 = r0.nid
        L84:
            monitor-enter(r2)
            if (r1 == 0) goto La1
            goto L98
        L88:
            r1 = r9
            goto L84
        L8a:
            X.0zip r0 = X.EnumC1906890zip.CONTENT
            java.lang.String r1 = r0.getValue()
            goto L75
        L91:
            X.0zip r0 = X.EnumC1906890zip.HEAD
            java.lang.String r1 = r0.getValue()
            goto L75
        L98:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = X.C1902900zcO.LIZJ     // Catch: java.lang.Throwable -> L9e
            r0.add(r1)     // Catch: java.lang.Throwable -> L9e
            goto La1
        L9e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        La1:
            monitor-exit(r2)
            r10.N5(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.cell.TemplateNotificationCell.q(android.view.View):void");
    }

    @Override // X.InterfaceC1907020zj2
    public final void v(int i) {
        EnumC624380OeK enumC624380OeK;
        NoticeGroupAttrs noticeGroupAttrsLJI = C1903780zdo.LJI(i);
        if (noticeGroupAttrsLJI != null) {
            enumC624380OeK = noticeGroupAttrsLJI.clearOccasion;
        } else {
            enumC624380OeK = null;
        }
        if (enumC624380OeK == EnumC624380OeK.AfterClick && C1903780zdo.LJIIJJI(i)) {
            C1903780zdo.LIZJ(i);
            C1440005kM.LIZ(new C1570820qym());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b6(EnumC1905020zfo enumC1905020zfo, EnumC1154130g8h enumC1154130g8h) {
        String accountType;
        Integer numValueOf;
        String accountType2;
        String str;
        String str2;
        Long l;
        String templateId;
        int i;
        String str3;
        boolean z;
        Integer num;
        int i2;
        boolean z2;
        C1901230zZh c1901230zZh;
        Boolean boolLIZIZ;
        GeneralTemplateNotice generalTemplateNotice;
        Integer num2;
        GeneralTemplateNotice generalTemplateNotice2;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        String str4;
        C1905050zfr c1905050zfr;
        C1905130zfz c1905130zfz;
        String str5;
        Map<String, String> map;
        GeneralTemplateNotice generalTemplateNotice3;
        Integer num3;
        MusNotice musNoticeX5;
        GeneralTemplateNotice generalTemplateNotice4;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate2;
        List<User> list2;
        User user2;
        GeneralTemplateNotice generalTemplateNotice5;
        Integer num4;
        GeneralTemplateNotice generalTemplateNotice6;
        NoticeExtraData noticeExtraData;
        GeneralTemplateNotice generalTemplateNotice7;
        NoticeUITemplate noticeUITemplate3;
        TitleTemplate titleTemplate3;
        ExtraActionTemplate extraActionTemplate;
        User userFromNotice;
        GeneralTemplateNotice generalTemplateNotice8;
        String str6;
        GeneralTemplateNotice generalTemplateNotice9;
        String str7;
        int i3;
        String str8;
        GeneralTemplateNotice generalTemplateNotice10;
        Long l2;
        GeneralTemplateNotice generalTemplateNotice11;
        MusNotice musNoticeX52;
        GeneralTemplateNotice generalTemplateNotice12;
        EnumC1260930iux enumC1260930iux;
        String imprId;
        User user3;
        String str9;
        GeneralTemplateNotice generalTemplateNotice13;
        NoticeUITemplate noticeUITemplate4;
        TitleTemplate titleTemplate4;
        List<User> list3;
        User user4;
        String uid;
        NoticeUITemplate noticeUITemplate5;
        TitleTemplate titleTemplate5;
        List<User> list4;
        MusNotice musNoticeX53 = X5();
        int i4 = 0;
        String str10 = "notification_page";
        String str11 = "";
        if (musNoticeX53 != null && musNoticeX53.type == 225 && (enumC1154130g8h != EnumC1154130g8h.RELATION_BUTTON || enumC1905020zfo != EnumC1905020zfo.Click)) {
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            EnumC1905020zfo enumC1905020zfo2 = EnumC1905020zfo.Show;
            if (enumC1905020zfo == enumC1905020zfo2) {
                enumC1260930iux = EnumC1260930iux.SHOW;
            } else {
                enumC1260930iux = EnumC1260930iux.ENTER_PROFILE;
            }
            c1260910iuv.LJJLIIIJJI = enumC1260930iux;
            c1260910iuv.LJJIJLIJ("notification_page");
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.INBOX_NOTICE;
            c1260910iuv.LJJJJLL();
            String str12 = C1900870zZ7.LIZ;
            if (str12 == null) {
                str12 = "";
            }
            c1260910iuv.LJJJJIZL(str12);
            LogPbBean logPbBean = musNoticeX53.logPbBean;
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            c1260910iuv.LJJJJLI(imprId);
            GeneralTemplateNotice generalTemplateNotice14 = musNoticeX53.templateNotice;
            if (generalTemplateNotice14 != null && (noticeUITemplate5 = generalTemplateNotice14.uiTemplate) != null && (titleTemplate5 = noticeUITemplate5.titleTemplate) != null && (list4 = titleTemplate5.fromUsers) != null) {
                user3 = (User) C13LP.LJJJLL(list4);
            } else {
                user3 = null;
            }
            c1260910iuv.LJJJJZI(user3);
            GeneralTemplateNotice generalTemplateNotice15 = musNoticeX53.templateNotice;
            if (generalTemplateNotice15 != null) {
                str9 = generalTemplateNotice15.messageExtra;
            } else {
                str9 = null;
            }
            Map<String, String> mapLIZ = C1075780e6K.LIZ(str9);
            if (enumC1905020zfo == enumC1905020zfo2 && (generalTemplateNotice13 = musNoticeX53.templateNotice) != null && (noticeUITemplate4 = generalTemplateNotice13.uiTemplate) != null && (titleTemplate4 = noticeUITemplate4.titleTemplate) != null && (list3 = titleTemplate4.fromUsers) != null && (user4 = (User) C13LP.LJJJLL(list3)) != null && (uid = user4.getUid()) != null) {
                C1262570ixb.LIZ("207", uid);
            }
            c1260910iuv.LIZIZ(mapLIZ);
            c1260910iuv.LJIILJJIL();
        }
        if (getScenario() == EnumC1906270zhp.INBOX_SEARCH) {
            return;
        }
        String enterFrom = getEnterFrom();
        if (enterFrom != null) {
            str10 = enterFrom;
        }
        C1907160zjG c1907160zjG = (C1907160zjG) this.itemView.findViewById(R.id.peh);
        MusNotice musNoticeX54 = X5();
        if (musNoticeX54 == null || (accountType = musNoticeX54.getAccountType()) == null) {
            accountType = "";
        }
        AbstractC1349310lDV abstractC1349310lDV = (AbstractC1349310lDV) c1907160zjG.getQuickCommentContainerFromXml().findViewById(R.id.smd);
        if (abstractC1349310lDV != null) {
            abstractC1349310lDV.LIZLLL(str10, C1900870zZ7.LIZ, accountType);
        }
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            MusNotice musNoticeX55 = X5();
            if (musNoticeX55 != null) {
                numValueOf = Integer.valueOf(musNoticeX55.type);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "type");
            c2344009Gk.LJIIIIZZ("enter_from", str10);
            MusNotice musNoticeX56 = X5();
            if (musNoticeX56 == null || (accountType2 = musNoticeX56.getAccountType()) == null) {
                accountType2 = "";
            }
            c2344009Gk.LJIIIIZZ("account_type", accountType2);
            C1900970zZH c1900970zZH = (C1900970zZH) getItem();
            if (c1900970zZH != null) {
                str = c1900970zZH.LLILLL;
            } else {
                str = null;
            }
            c2344009Gk.LJIIIIZZ("tab_name", str);
            MusNotice musNoticeX57 = X5();
            if (musNoticeX57 != null) {
                str2 = musNoticeX57.nid;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("content_id", str2);
            c2344009Gk.LJIIIIZZ("action_type", enumC1905020zfo.getValue());
            c2344009Gk.LJIIIIZZ("client_order", String.valueOf(getLayoutPosition()));
            MusNotice musNoticeX58 = X5();
            if (musNoticeX58 != null && (generalTemplateNotice12 = musNoticeX58.templateNotice) != null) {
                l = generalTemplateNotice12.createTime;
            } else {
                l = null;
            }
            c2344009Gk.LJ(l, "message_time");
            MusNotice musNoticeX59 = X5();
            if (musNoticeX59 != null) {
                templateId = musNoticeX59.getTemplateId();
            } else {
                templateId = null;
            }
            c2344009Gk.LJIIIIZZ("template_id", templateId);
            if (!C1902710zc5.LIZJ() && (musNoticeX52 = X5()) != null && musNoticeX52.hasRead) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_read");
            MusNotice musNoticeX510 = X5();
            if (musNoticeX510 != null && (generalTemplateNotice11 = musNoticeX510.templateNotice) != null) {
                str3 = generalTemplateNotice11.messageExtra;
            } else {
                str3 = null;
            }
            Map<String, String> mapLIZ2 = C1075780e6K.LIZ(str3);
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ2;
            String str13 = (String) linkedHashMap.get("notification_type");
            if (str13 == null) {
                str13 = "";
            }
            c2344009Gk.LJII(mapLIZ2);
            c2344009Gk.LJFF("enter_from", str10);
            MusNotice musNoticeX511 = X5();
            if (musNoticeX511 != null && (generalTemplateNotice10 = musNoticeX511.templateNotice) != null && (l2 = generalTemplateNotice10.createTime) != null) {
                c2344009Gk.LIZLLL(((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - l2.longValue()) / ((long) 86400), "timeline");
            }
            C1900970zZH c1900970zZH2 = (C1900970zZH) getItem();
            if (c1900970zZH2 != null && (str8 = c1900970zZH2.LLIZLLLIL) != null) {
                c2344009Gk.LJFF("page_name", str8);
            }
            if (C890290YwF.LIZIZ.LIZJ(false)) {
                MusNotice musNoticeX512 = X5();
                if (musNoticeX512 != null && musNoticeX512.isPriority) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                c2344009Gk.LIZJ(i3, "is_priority");
            }
            String strA6 = a6();
            if (strA6 == null) {
                strA6 = "";
            }
            String strLIZIZ = C1907940zkW.LIZIZ(UriProtector.parse(strA6), "event_keyword");
            if (strLIZIZ != null) {
                str11 = strLIZIZ;
            }
            if (str11.length() > 0) {
                c2344009Gk.LJFF("event_keyword", str11);
            }
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            c2344009Gk.LJFF("to_user_id", currentUserID);
            String str14 = (String) linkedHashMap.get("from_user_id");
            if (str14 != null && str14.length() > 0) {
                MusNotice musNoticeX513 = X5();
                if (musNoticeX513 != null && musNoticeX513.type == 283) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str14, new String[]{","}, 0, 6);
                    str14 = listLJJLIIIJILLIZJL.isEmpty() ^ true ? (String) listLJJLIIIJILLIZJL.get(0) : null;
                }
                c2344009Gk.LJFF("from_user_id", str14);
            }
            CharSequence charSequence = (CharSequence) linkedHashMap.get("group_id");
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                MusNotice musNoticeX514 = X5();
                if (musNoticeX514 != null && (generalTemplateNotice9 = musNoticeX514.templateNotice) != null && (str7 = generalTemplateNotice9.schemaUrl) != null && a0.LJJIIZI(str7, "aweme://story/detail", false)) {
                    str6 = "story";
                    currentUserID = c2344009Gk.LJIIIZ("from_user_id");
                } else {
                    str6 = "post";
                }
                c2344009Gk.LJFF("story_type", str6);
                c2344009Gk.LJFF("author_id", currentUserID);
            }
            Integer[] numArr = (Integer[]) C1904270zeb.LJ.getValue();
            MusNotice musNoticeX515 = X5();
            if (musNoticeX515 != null && (generalTemplateNotice8 = musNoticeX515.templateNotice) != null) {
                num = generalTemplateNotice8.type;
            } else {
                num = null;
            }
            if (C13LQ.LJIILLIIL(num, numArr)) {
                c2344009Gk.LJFF("EVENT_ORIGIN_FEATURE", "TEMAI");
            }
            MusNotice musNoticeX516 = X5();
            if (musNoticeX516 != null && (generalTemplateNotice7 = musNoticeX516.templateNotice) != null && (noticeUITemplate3 = generalTemplateNotice7.uiTemplate) != null && (titleTemplate3 = noticeUITemplate3.titleTemplate) != null && (extraActionTemplate = titleTemplate3.extraAction) != null && extraActionTemplate.actionType == 2 && (userFromNotice = getUserFromNotice()) != null && userFromNotice.getFollowStatus() == 0) {
                if (userFromNotice.getFollowerStatus() == 0) {
                    c2344009Gk.LJFF("with_follow_button", "follow");
                } else {
                    c2344009Gk.LJFF("with_follow_button", "follow_back");
                }
            }
            MusNotice musNoticeX517 = X5();
            if (musNoticeX517 != null && (generalTemplateNotice6 = musNoticeX517.templateNotice) != null && (noticeExtraData = generalTemplateNotice6.extraData) != null && noticeExtraData.isAwemeInvalid()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c2344009Gk.LIZJ(i2, "is_video_valid");
            MusNotice musNoticeX518 = X5();
            if (musNoticeX518 != null && (generalTemplateNotice5 = musNoticeX518.templateNotice) != null && (num4 = generalTemplateNotice5.type) != null && num4.intValue() == 265) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (musNoticeX5 = X5()) != null && (generalTemplateNotice4 = musNoticeX5.templateNotice) != null && (noticeUITemplate2 = generalTemplateNotice4.uiTemplate) != null && (titleTemplate2 = noticeUITemplate2.titleTemplate) != null && (list2 = titleTemplate2.fromUsers) != null && list2.size() == 1 && (user2 = (User) C13LP.LJJJLL(list2)) != null) {
                C1906910zir.LIZ.getClass();
                c2344009Gk.LJFF("follow_status", C1906910zir.LIZJ(user2));
                c2344009Gk.LJFF("author_id", user2.getUid());
            }
            MusNotice musNoticeX519 = X5();
            if (musNoticeX519 != null && (generalTemplateNotice3 = musNoticeX519.templateNotice) != null && (num3 = generalTemplateNotice3.type) != null && num3.intValue() == 45) {
                c2344009Gk.LJFF("author_id", c2344009Gk.LJIIIZ("from_user_id"));
            }
            c2344009Gk.LJII(this.LLJJIJIL);
            String str15 = C1900870zZ7.LIZ;
            if (str15 != null) {
                c2344009Gk.LJFF("position", str15);
                c2344009Gk.LJFF("page_name", str15);
            }
            C1900970zZH c1900970zZH3 = (C1900970zZH) getItem();
            if (c1900970zZH3 != null) {
                c1901230zZh = c1900970zZH3.LLJI;
            } else {
                c1901230zZh = null;
            }
            C1901610zaJ.LIZ(c2344009Gk, c1901230zZh);
            U5(c2344009Gk);
            if (i3()) {
                C1900970zZH c1900970zZH4 = (C1900970zZH) getItem();
                if (c1900970zZH4 != null && (map = c1900970zZH4.LLJJ) != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                    }
                }
                if (Intrinsics.LJFF("official", str13)) {
                    MusNotice musNoticeX520 = X5();
                    if (musNoticeX520 != null) {
                        str5 = musNoticeX520.dataSourceInterfaceName;
                    } else {
                        str5 = null;
                    }
                    c2344009Gk.LJFF("data_source_interface", str5);
                    c2344009Gk.LJFF("page_name", "activities_shop_updates");
                    C20684815ws.LJIILLIIL("official_message_folded_message", c2344009Gk.LIZ);
                } else {
                    C0SDC c0sdc = C0SDC.LIZ;
                    Context context = this.itemView.getContext();
                    User userFromNotice2 = getUserFromNotice();
                    c0sdc.getClass();
                    c2344009Gk.LJFF("button_type", C0SDC.LIZ(context, userFromNotice2));
                    C20684815ws.LJIILLIIL("notification_message_folded_message", c2344009Gk.LIZ);
                }
            } else {
                C1905130zfz c1905130zfz2 = this.LLJILJILJ;
                if (c1905130zfz2 != null && (c1905050zfr = c1905130zfz2.LIZIZ) != null && c1905050zfr.LJI) {
                    c2344009Gk.LJFF("scene_id", "1002");
                }
                if (Intrinsics.LJFF("official", str13)) {
                    MusNotice musNoticeX521 = X5();
                    if (musNoticeX521 != null) {
                        str4 = musNoticeX521.dataSourceInterfaceName;
                    } else {
                        str4 = null;
                    }
                    c2344009Gk.LJFF("data_source_interface", str4);
                    C20684815ws.LJIILLIIL("official_message_inner_message", c2344009Gk.LIZ);
                } else {
                    MusNotice musNoticeX522 = X5();
                    if (musNoticeX522 != null && (generalTemplateNotice2 = musNoticeX522.templateNotice) != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && list.size() == 1 && (user = (User) C13LP.LJJJLL(list)) != null) {
                        C1906910zir.LIZ.getClass();
                        String strLIZJ = C1906910zir.LIZJ(user);
                        c2344009Gk.LJFF("follow_status_to_user", strLIZJ);
                        c2344009Gk.LJFF("follow_status", strLIZJ);
                    }
                    MusNotice musNoticeX523 = X5();
                    if (musNoticeX523 == null || (generalTemplateNotice = musNoticeX523.templateNotice) == null || (num2 = generalTemplateNotice.type) == null || num2.intValue() != 216) {
                        C0SDC c0sdc2 = C0SDC.LIZ;
                        Context context2 = this.itemView.getContext();
                        User userFromNotice3 = getUserFromNotice();
                        c0sdc2.getClass();
                        c2344009Gk.LJFF("button_type", C0SDC.LIZ(context2, userFromNotice3));
                    }
                    MusNotice musNoticeX524 = X5();
                    if (musNoticeX524 != null && (boolLIZIZ = C634610Oup.LIZIZ(musNoticeX524)) != null) {
                        if (boolLIZIZ.booleanValue()) {
                            i4 = 1;
                        }
                        c2344009Gk.LIZJ(i4, "is_muted");
                    }
                    C20684815ws.LJIILLIIL("notification_message_inner_message", c2344009Gk.LIZ);
                }
            }
            Context context3 = getContext();
            if (context3 != null && (c1905130zfz = this.LLJILJILJ) != null) {
                c1905130zfz.LIZLLL(enumC1905020zfo, context3);
            }
            ((LinkedHashMap) this.LLJJIJIL).clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1900970zZH c1900970zZH = (C1900970zZH) interfaceC1891350zJl;
        super.onBindItemView(c1900970zZH, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C1901000zZK) {
            C1901000zZK c1901000zZK = (C1901000zZK) objLJJJLZIJ;
            if (c1901000zZK.LIZ) {
                onBindItemView(c1900970zZH);
            }
            if (c1901000zZK.LIZIZ) {
                this.LLJILJILJ = C1905080zfu.LIZ(c1900970zZH.LL);
            }
        }
    }

    public final void V5(C1360520lVa c1360520lVa, User user, MusNotice musNotice) {
        C1906140zhc.LIZ.getClass();
        String strLIZJ = C1906140zhc.LIZJ(user);
        if (!TextUtils.isEmpty(strLIZJ)) {
            c1360520lVa.LJ(strLIZJ, c6(user, 0, musNotice, null));
        }
    }

    @Override // X.InterfaceC1907020zj2
    public final C1360500lVY LLILLL(List list, Integer num, MusNotice musNotice, String str) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return W5(list, iIntValue, musNotice, str);
    }

    public final C1360500lVY W5(List list, int i, MusNotice musNotice, String str) {
        String string;
        C1360520lVa c1360520lVa = new C1360520lVa();
        Context context = getContext();
        if (context == null) {
            return c1360520lVa.LIZ;
        }
        if (list != null) {
            if (list.size() == 1) {
                V5(c1360520lVa, (User) ListProtector.get(list, 0), musNotice);
            } else if (list.size() == 2 && 1 <= i && i < 4) {
                V5(c1360520lVa, (User) ListProtector.get(list, 0), musNotice);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.LLJIJIL);
                c1360520lVa.LIZ.append((CharSequence) " ");
                V5(c1360520lVa, (User) ListProtector.get(list, 1), musNotice);
            } else if (list.size() >= 3 && i <= 3) {
                V5(c1360520lVa, (User) ListProtector.get(list, 0), musNotice);
                c1360520lVa.LIZ.append((CharSequence) ", ");
                V5(c1360520lVa, (User) ListProtector.get(list, 1), musNotice);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.LLJIJIL);
                c1360520lVa.LIZ.append((CharSequence) " ");
                V5(c1360520lVa, (User) ListProtector.get(list, 2), musNotice);
            } else if (list.size() >= 3 && i > 3) {
                int size = list.size();
                if (i < size) {
                    i = size;
                }
                int i2 = i - 2;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_followers_title_localized_format", true) >= 1) {
                    string = context.getResources().getQuantityString(2131755415, i2, C498470Jgj.LIZ(i2));
                } else {
                    string = context.getString(2131838296, Integer.valueOf(i2));
                }
                C1906800zig c1906800zigC6 = c6(null, 100, musNotice, str);
                V5(c1360520lVa, (User) ListProtector.get(list, 0), musNotice);
                c1360520lVa.LIZ.append((CharSequence) ", ");
                V5(c1360520lVa, (User) ListProtector.get(list, 1), musNotice);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.LLJIJIL);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZJ(string, c1906800zigC6, 33);
            }
        }
        return c1360520lVa.LIZ;
    }

    public final C1906800zig c6(User user, final int i, final BaseNotice baseNotice, final String str) {
        Integer num = (Integer) this.LLJ.getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.LLJI.getValue();
            if (num2 != null) {
                return new C1906800zig(user, i, iIntValue, num2.intValue(), new InterfaceC1906810zih() { // from class: X.0zif
                    @Override // X.InterfaceC1906810zih
                    public final void LIZ(View view, User user2, int i2) {
                        String uid;
                        String str2;
                        Activity activityLIZ;
                        String uid2;
                        GeneralTemplateNotice generalTemplateNotice;
                        this.LIZ.q(view);
                        TemplateNotificationCell templateNotificationCell = this.LIZ;
                        Map<String, String> map = templateNotificationCell.LLJJIJIL;
                        String accountType = null;
                        if (user2 != null) {
                            uid = user2.getUid();
                        } else {
                            uid = null;
                        }
                        map.put("click_user_id", uid);
                        MusNotice musNoticeX5 = templateNotificationCell.X5();
                        if (musNoticeX5 != null && (generalTemplateNotice = musNoticeX5.templateNotice) != null) {
                            str2 = generalTemplateNotice.messageExtra;
                        } else {
                            str2 = null;
                        }
                        String str3 = (String) ((LinkedHashMap) C1075780e6K.LIZ(str2)).get("from_user_id");
                        if (str3 != null) {
                            List listLJJLIIIJ = a0.LJJLIIIJ(str3, new char[]{','}, false, 0, 6);
                            if (user2 != null) {
                                uid2 = user2.getUid();
                            } else {
                                uid2 = null;
                            }
                            templateNotificationCell.LLJJIJIL.put("click_name_position", String.valueOf(listLJJLIIIJ.indexOf(uid2)));
                        }
                        templateNotificationCell.LLJJIJIL.put("click_area", EnumC1906890zip.NAME.getValue());
                        this.LIZ.LLD(EnumC1154130g8h.OTHERS);
                        int i3 = i;
                        if (i3 != 0) {
                            if (i3 == 100) {
                                Context context = this.LIZ.getContext();
                                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                                    SmartRouter.buildRoute(activityLIZ, str).open();
                                } else {
                                    String str4 = str;
                                    C844470XAv.LIZ.getClass();
                                    SmartRouter.buildRoute(C844470XAv.LIZ(), str4).open();
                                }
                            }
                        } else if (user2 != null) {
                            BaseNotice baseNotice2 = baseNotice;
                            TemplateNotificationCell templateNotificationCell2 = this.LIZ;
                            C1906170zhf.LIZ.getClass();
                            C1906170zhf.LIZ(this, user2, baseNotice2);
                            String uid3 = user2.getUid();
                            String str5 = "";
                            if (uid3 == null) {
                                uid3 = "";
                            }
                            String secUid = user2.getSecUid();
                            if (secUid != null) {
                                str5 = secUid;
                            }
                            String enterFrom = templateNotificationCell2.getEnterFrom();
                            if (baseNotice2 != null) {
                                accountType = baseNotice2.getAccountType();
                            }
                            templateNotificationCell2.R5(uid3, str5, enterFrom, accountType, true, null, templateNotificationCell2.D1(), null);
                        }
                        BaseNotice baseNotice3 = baseNotice;
                        if (baseNotice3 != null) {
                            baseNotice3.hasRead = true;
                        }
                    }
                });
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1907020zj2
    public final void s4(User user, String str, String str2, String str3) {
        String str4;
        String uid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1900970zZH c1900970zZH = (C1900970zZH) getItem();
        if (c1900970zZH == null || (str4 = c1900970zZH.LLILZ) == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("position", str2);
        c2344009Gk.LJIIIIZZ("account_type", str3);
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        C1D0F c1d0f = C1D0F.LIZ;
        c2344009Gk.LJ(Boolean.valueOf(c1d0f.isConnected()), c1d0f.LIZ());
        c2344009Gk.LJIIIIZZ(c1d0f.LIZIZ(), c1d0f.LIZJ());
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1907020zj2
    public final void l5(String str, String str2, BaseNotice baseNotice, boolean z, C1242270iQr c1242270iQr) {
        String accountType;
        String enterFrom = getEnterFrom();
        if (baseNotice != null) {
            accountType = baseNotice.getAccountType();
        } else {
            accountType = null;
        }
        R5(str, str2, enterFrom, accountType, z, "", D1(), c1242270iQr);
    }

    @Override // X.InterfaceC1907020zj2
    public final void x5(TuxTextView tuxTextView, List list, Integer num, MusNotice musNotice, String str) {
        int iIntValue;
        tuxTextView.setTag("");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setText(W5(list, iIntValue, musNotice, str));
        C431420Gvs c431420Gvs = C431420Gvs.LIZ;
        c431420Gvs.getClass();
        tuxTextView.setMovementMethod(c431420Gvs);
        if (list.size() == 1 && C1908030zkf.LJIIJ(getContext(), new UserVerify(null, ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), -1), tuxTextView)) {
            tuxTextView.setTag(" T");
        }
    }
}
