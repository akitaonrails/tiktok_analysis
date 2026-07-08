package com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey;

import X.AbstractC1028360crq;
import X.C01GW;
import X.C098200Yq;
import X.C1048570dOR;
import X.C1048600dOU;
import X.C1048720dOg;
import X.C1048730dOh;
import X.C1048780dOm;
import X.C1388190mED;
import X.C1389890mGx;
import X.C14EU;
import X.C189200o6;
import X.C452501pT;
import X.C484220Iyq;
import X.C603820NmG;
import X.C724270Sb3;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS51S1300000_11;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAceSurveyBottomBarAssem extends InteractBottomBannerAssem<AdAceSurveyBottomBarAssem> {
    public final AdExperienceEventLogger LLLFFI = new AdExperienceEventLogger();
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(81));
    public final String LLLI = "bottom_banner_commerce_ace_disclaimer";

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean aq() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LLJJIJI) {
            if (LJJIJL().getVisibility() == 8 || getContentView().getVisibility() == 8) {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                C786410Ut5.LJLLLLLL(0, getContentView());
            }
            ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String Jp() {
        return this.LLLI;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        this.LLLFFI.withContext(videoItemParams.getAweme());
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig Up(FeedBottomBannerConfig.Builder builder) {
        builder.setIconWithLocalRes(R.raw.icon_script_fill);
        builder.setUpdateTitleSync(false);
        return builder.build();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean dq(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (C1048600dOU.LJ(aweme)) {
            C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
            if (!C1048570dOR.LIZ().LIZIZ(C1048600dOU.LIZJ(aweme))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void fq(VideoItemParams videoItemParams) {
        String text;
        String buttonText;
        super.fq(videoItemParams);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        Aweme aweme = videoItemParams.getAweme();
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ = C1048600dOU.LIZIZ(aweme);
        if (commerceAceSurveyInfoLIZIZ == null || (text = commerceAceSurveyInfoLIZIZ.getText()) == null) {
            text = "How was your last shopping experience";
        }
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ2 = C1048600dOU.LIZIZ(aweme);
        if (commerceAceSurveyInfoLIZIZ2 == null || (buttonText = commerceAceSurveyInfoLIZIZ2.getButtonText()) == null) {
            buttonText = "Review";
        }
        FeedBottomBannerConfig.Builder builder = Qp().toBuilder();
        builder.setInteractionWithButton(new AwS51S1300000_11(buttonText, this, aweme, videoItemParams, 0));
        Wp(builder);
        iq(Collections.singletonList(new FeedBottomBannerUIProps.Title(text)));
    }

    @C14EU
    public final void onEvent$commercialize_feed_impl_release(C484220Iyq c484220Iyq) {
        Object obj;
        Object obj2;
        Activity activityLIZ;
        if (c484220Iyq == null) {
            return;
        }
        try {
            Object obj3 = null;
            if (TextUtils.equals("commerce_ace_star_scored", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                int i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "score");
                C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
                C1048720dOg c1048720dOgLIZ = C1048570dOR.LIZ();
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                String strLIZJ = C1048600dOU.LIZJ(((VideoItemParams) obj).getAweme());
                if (strLIZJ == null) {
                    c1048720dOgLIZ.getClass();
                } else {
                    C603820NmG<String, C1048730dOh> c603820NmG = c1048720dOgLIZ.LIZIZ;
                    if (c603820NmG != null) {
                        c603820NmG.LIZLLL(strLIZJ, new C1048730dOh(i, false, 4));
                    }
                }
                Context context = getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131824651);
                    c1389890mGx.LJIIJJI();
                }
                AbstractC1028360crq abstractC1028360crq = ((C1048780dOm) this.LLLFZ.getValue()).LIZ;
                if (abstractC1028360crq != null) {
                    abstractC1028360crq.LJFF();
                }
                C1048780dOm c1048780dOm = (C1048780dOm) this.LLLFZ.getValue();
                SettingsManager.LIZLLL().getClass();
                String strLJI = SettingsManager.LJI("ace_submit_page_url", "https://inapp.tiktokv.com/ad/tetris/experience/feedback_rate?hide_nav_bar=1");
                Context context2 = getContext();
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                c1048780dOm.LIZIZ(strLJI, context2, C1048600dOU.LIZ(i, ((VideoItemParams) obj2).getAweme(), "followup1"), null);
            }
            if (TextUtils.equals("card_rate_feedback_submit", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                C01GW<C1048720dOg> c01gw2 = C1048720dOg.LIZJ;
                C1048720dOg c1048720dOgLIZ2 = C1048570dOR.LIZ();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                }
                String strLIZJ2 = C1048600dOU.LIZJ(((VideoItemParams) obj3).getAweme());
                if (strLIZJ2 == null) {
                    c1048720dOgLIZ2.getClass();
                } else {
                    C603820NmG<String, C1048730dOh> c603820NmG2 = c1048720dOgLIZ2.LIZIZ;
                    if (c603820NmG2 != null) {
                        c603820NmG2.LIZLLL(strLIZJ2, new C1048730dOh(0, true, 3));
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        super.J1(i, aweme);
    }
}
