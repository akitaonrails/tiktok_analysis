package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.AbstractViewOnClickListenerC372950Ejl;
import X.C0DMM;
import X.C0P0V;
import X.C0S4U;
import X.C1389910mGz;
import X.C15438062q;
import X.C1585070rLl;
import X.C1612960s4k;
import X.C1697810uHb;
import X.C19EG;
import X.C2188811AlT;
import X.C2421209eE;
import X.C786410Ut5;
import X.EnumC1584360rKc;
import X.InterfaceC1583870rJp;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class MiniDramaFavoriteGuideServiceImpl implements IMiniDramaFavoriteGuideService {
    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LJI(long j, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LIZ() {
        Keva keva = C1612960s4k.LIZ;
        C1612960s4k.LIZ.storeBoolean("favorite_guide_in_inner_feed_shown", true);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final boolean LJ() {
        C0P0V.LIZ.getClass();
        return C0P0V.LIZ() && (C1612960s4k.LIZ.getBoolean("favorite_guide_in_inner_feed_shown", false) ^ true);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final boolean LIZLLL() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List listL32;
        Activity activityLIZ = C2421209eE.LIZ();
        Object obj = null;
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (listL32 = homeTabAbilityLIZ.l32()) != null) {
            Iterator it2 = listL32.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC1583870rJp) next).tag(), "Drama")) {
                    obj = next;
                    break;
                }
            }
        }
        boolean z = obj != null;
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SERIES;
        c1585070rLl.getClass();
        return z || C1585070rLl.LJFF(enumC1584360rKc, null);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final String LIZIZ(String str) {
        String str2;
        if (LJ() && Intrinsics.LJFF(str, "paid_series_detail_page")) {
            str2 = "first_";
        } else {
            str2 = "";
        }
        if (LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("with_drama_tab");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append("no_drama_tab");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final CharSequence LIZJ(Context context) {
        if (LIZLLL()) {
            return LJIIIIZZ(2131839465, context, Collections.singletonList(2131839456));
        }
        return LJIIIIZZ(2131839467, context, Collections.singletonList(2131839458));
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LJII(Context context, String str) {
        if (LIZLLL()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://paidcontent/drama/mylist");
            smartRouteBuildRoute.withParam(Scene.SCENE_SERVICE, "2");
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute2.withParam("from_scene", "1040");
        smartRouteBuildRoute2.withParam("favorite_auto_landing_method", "click_drama_toast");
        smartRouteBuildRoute2.withParam("enter_from", str);
        smartRouteBuildRoute2.withParam("extra_from_pre_page", str);
        smartRouteBuildRoute2.open();
    }

    public static CharSequence LJIIIIZZ(int i, Context context, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(context.getString(((Number) it2.next()).intValue()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
        SpannableString spannableString = new SpannableString(string);
        for (String str : strArr) {
            int iLJJJ = a0.LJJJ(string, str, 0, false, 6);
            if (iLJJJ >= 0) {
                C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
            }
        }
        return spannableString;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final C1389910mGz LJFF(final C19EG c19eg, final Aweme aweme, final String str) {
        C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
        c1389910mGz.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZLLL = 2;
        c1389910mGz.LJFF(2131839470);
        c1389910mGz.LJII(false);
        if (LIZLLL()) {
            c1389910mGz.LJIIJ(LJIIIIZZ(2131839464, c19eg, C1697810uHb.LJIIJJI(2131839463, 2131839456)));
        } else {
            c1389910mGz.LJIIJ(LJIIIIZZ(2131839466, c19eg, Collections.singletonList(2131839458)));
        }
        c1389910mGz.LIZ.LJIIIIZZ = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0gbY
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                String aid;
                String authorUid;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                Aweme aweme2 = aweme;
                String str2 = "";
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                Aweme aweme3 = aweme;
                if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
                    str2 = authorUid;
                }
                c2344009Gk.LJIIIIZZ("author_id", str2);
                c2344009Gk.LJIIIIZZ("toast_type", C1612950s4j.LIZIZ.LIZIZ(str));
                C20684815ws.LJIILLIIL("favourite_notice_click", ((C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk, aweme)).LIZ);
                this.LJII(c19eg, str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(500L);
            }
        };
        return c1389910mGz;
    }
}
