package com.ss.android.ugc.aweme.commercialize.depend;

import X.AbstractC1025070cmX;
import X.C01GW;
import X.C04TD;
import X.C0CG3;
import X.C0WZX;
import X.C1019030ccn;
import X.C1021860chM;
import X.C1022010chb;
import X.C1048440dOE;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1AF0;
import X.C2201701BEy;
import X.C2204961BRm;
import X.C2277881EDy;
import X.C2429209fW;
import X.C316660CbA;
import X.C452501pT;
import X.C523420Kfs;
import X.C988670bpp;
import X.C990310bsT;
import X.InterfaceC1021920chS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS630S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCommentDependImpl implements IAdCommentDepend {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1022010chb());

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String LJIJJLI() {
        AwemeFEConfigs awemeFEConfigs;
        LinkPlan linkPlan;
        String info = null;
        try {
            C0CG3.LIZ().getClass();
            try {
                SettingsManager.LIZLLL().getClass();
                awemeFEConfigs = (AwemeFEConfigs) SettingsManager.LJII("aweme_fe_conf", AwemeFEConfigs.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                awemeFEConfigs = null;
            }
            if (awemeFEConfigs == null || (linkPlan = awemeFEConfigs.getLinkPlan()) == null) {
                return null;
            }
            info = linkPlan.getInfo();
            return info;
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return info;
        }
    }

    public static IAdCommentDepend LJJIJ() {
        Object objLIZ = C04TD.LIZ(IAdCommentDepend.class, false);
        if (objLIZ != null) {
            return (IAdCommentDepend) objLIZ;
        }
        if (C04TD.LLJZ == null) {
            synchronized (IAdCommentDepend.class) {
                if (C04TD.LLJZ == null) {
                    C04TD.LLJZ = new AdCommentDependImpl();
                }
            }
        }
        return C04TD.LLJZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LIZIZ(Aweme aweme) {
        LinkData linkDataLIZ = C990310bsT.LIZ(aweme);
        if (linkDataLIZ != null && linkDataLIZ.linkType == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final NewCommentAdWidget LJFF(AFwS204S0000000_16 aFwS204S0000000_16) {
        return new NewCommentAdWidget(aFwS204S0000000_16);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJII(AwemeRawAd awemeRawAd) {
        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AwS630S0100000_16(awemeRawAd, 12);
        c2201701BEy.getClass();
        C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String LJIILIIL(CommentStruct commentStruct) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LJJLJ(commentStruct);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LJJII(Widget widget) {
        NewCommentAdWidget newCommentAdWidget;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (widget == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (!(widget instanceof NewCommentAdWidget) || (newCommentAdWidget = (NewCommentAdWidget) widget) == null || newCommentAdWidget.LLILLL == null) {
            return false;
        }
        LinearLayout linearLayoutLJIL = newCommentAdWidget.LJIL();
        if (linearLayoutLJIL != null) {
            layoutParams = linearLayoutLJIL.getLayoutParams();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.bottomMargin < 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean isChattingMessageUri(String str) {
        return OpenChatExt.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List LIZLLL(Context context, CommentStruct commentStruct) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LLFF(context, commentStruct);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIILLIIL(Context context, User user) {
        if (user != null && context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", user.getUid());
            smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
            smartRouteBuildRoute.withParam("profile_enterprise_type", C2277881EDy.LIZIZ.getEnterpriseType(user));
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIIZILJ(Context context, Aweme aweme) {
        LinkData linkDataLIZ = C990310bsT.LIZ(aweme);
        if (linkDataLIZ != null) {
            if (linkDataLIZ.linkType == 0) {
                AbstractC1025070cmX.LJIJJ(context, linkDataLIZ, aweme, true);
            } else {
                if (linkDataLIZ.linkType != 1) {
                    return;
                }
                AbstractC1025070cmX.LJIJJ(context, linkDataLIZ, aweme, true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIJ(Context context, String str) {
        String str2;
        this.LIZ.getValue().getClass();
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
            HashMap map = new HashMap();
            LinkData linkDataLIZ = C990310bsT.LIZ(awemeLLILZ);
            String str3 = null;
            if (linkDataLIZ != null) {
                str2 = linkDataLIZ.logExtra;
            } else {
                str2 = null;
            }
            map.put("log_extra", str2);
            if (linkDataLIZ != null) {
                str3 = linkDataLIZ.creativeId;
            }
            map.put("cid", str3);
            iReportServiceLJJ.LIZJ(activityLIZ, C1048440dOE.LIZ(new Uri.Builder(), awemeLLILZ, "landing_page", GsonProtectorUtils.toJson(new Gson(), map)));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJ(Context context, String str, String str2) {
        this.LIZ.getValue().getClass();
        if (!AbstractC1025070cmX.LJIILJJIL(context, str, false)) {
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                C2429209fW.LIZ().appendDataFlowId(intent, "402657282");
                intent.setData(UriProtector.parse(str2));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMvGTolTmEX/cxYqMNXDmf4zqtEybRtaM=", null));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJI(Context context, Aweme aweme, String str) {
        JSONObject jSONObjectLJIIIZ = C1019030ccn.LJIIIZ(context, aweme);
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectLJIIIZ.put("refer", str);
                HashMap map = new HashMap();
                map.put("anchor_id", C1019030ccn.LJI(aweme));
                map.put("room_id", C1019030ccn.LJIIZILJ(aweme));
                jSONObjectLJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        C1019030ccn.LJJJJ(context, "comment", aweme, jSONObjectLJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIIJ(Context context, LinkData linkData, Aweme aweme) {
        this.LIZ.getValue().getClass();
        AbstractC1025070cmX.LJIJJ(context, linkData, aweme, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List LJIILL(Context context, CommentStruct commentStruct, Aweme aweme) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LJJJZ(context, commentStruct);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJJ(Context context, String str, String str2) {
        List<String> list = C1019030ccn.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", "background");
            jSONObject.put("log_extra", str2);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C1019030ccn.LIZJ(0L, context, "draw_ad", "replay", str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
        return C1021860chM.LJJJI(context, aweme, i, interfaceC1021920chS);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List LJIJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AwS565S0100000_21 awS565S0100000_21) {
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LJJJJJ(context, commentStruct, awemeRawAd, awS565S0100000_21);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            r6 = r10
            com.ss.android.ugc.aweme.commercialize.model.LinkData r5 = X.C990310bsT.LIZ(r6)
            if (r5 == 0) goto L65
            int r0 = r5.linkType
            if (r0 != 0) goto L65
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "enterprise_link_"
            r1.append(r0)
            int r0 = r5.saiyanLinkType
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            boolean r0 = X.C1017070cZd.LJLJJLL(r6)
            if (r0 == 0) goto L35
            if (r13 == 0) goto L35
            java.lang.String r3 = "link_click"
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r4 = X.C844470XAv.LIZ()
            r7 = 1
            r8 = 0
            X.C1019030ccn.LJIL(r3, r4, r5, r6, r7, r8)
        L35:
            int r1 = r5.linkType
            r0 = 1
            if (r1 != r0) goto L3c
            java.lang.String r2 = "ad_link"
        L3c:
            if (r6 == 0) goto L64
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r1 = r6.getAid()
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r11)
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r6)
            java.lang.String r0 = "author_id"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "link_type"
            r3.LJIIIIZZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.C20684815ws.LJIILLIIL(r12, r0)
        L64:
            return
        L65:
            java.lang.String r2 = ""
            if (r5 == 0) goto L3c
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJJIIZI(String str, Context context, LinkData linkData, Aweme aweme, String str2) {
        C988670bpp c988670bpp = new C988670bpp();
        c988670bpp.LIZIZ = linkData;
        c988670bpp.LIZJ = aweme;
        c988670bpp.LJ = true;
        c988670bpp.LIZLLL = true;
        c988670bpp.LIZ = str;
        c988670bpp.LJII = str2;
        C1019030ccn.LJIJJ(context, c988670bpp.LIZ());
    }
}
