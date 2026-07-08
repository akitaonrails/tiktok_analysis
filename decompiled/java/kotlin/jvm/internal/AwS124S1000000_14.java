package kotlin.jvm.internal;

import X.C01GW;
import X.C06QH;
import X.C09AY;
import X.C0I0B;
import X.C0Z58;
import X.C0ZTX;
import X.C1383370m6R;
import X.C1618506Vj;
import X.C23250099c;
import X.C890770Yx1;
import X.C892950Z1h;
import X.C893580Z3s;
import X.C894400Z6w;
import X.C913630Zsn;
import X.EnumC1230500i7s;
import X.EnumC1365740le0;
import X.InterfaceC893080Z1u;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.IToastHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.share.invitelink.InviteLinkFragment;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS124S1000000_14 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S1000000_14(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        String strLIZ;
        Activity activity = (Activity) obj2;
        IIMAnalyticsUtil.LIZ.getClass();
        IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
        if (iIMAnalyticsUtilLIZ == null || (strLIZ = iIMAnalyticsUtilLIZ.LIZ(awS124S1000000_14.s0)) == null) {
            strLIZ = "";
        }
        C06QH c06qh = PushFeature.LIZ;
        PushFeature pushFeatureLIZ = c06qh.LIZ();
        if (pushFeatureLIZ != null) {
            pushFeatureLIZ.LJIIZILJ(awS124S1000000_14.s0, strLIZ);
        }
        PushFeature pushFeatureLIZ2 = c06qh.LIZ();
        if (pushFeatureLIZ2 != null) {
            pushFeatureLIZ2.LIZLLL(activity, awS124S1000000_14.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        String str = awS124S1000000_14.s0;
        C01GW c01gw = C894400Z6w.LIZ;
        C894400Z6w.LIZ((Context) obj2, str, "group_setting", "group_add_member", EnumC1230500i7s.ADD_MEMBER_GROUP_SETTING);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        String str = awS124S1000000_14.s0;
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL.getValue().LIZ((Context) obj2, str, "group_setting");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C890770Yx1((InterfaceC893080Z1u) obj2, awS124S1000000_14.s0, baseActionViewModel, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        Context context = (Context) obj2;
        C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
        String str = awS124S1000000_14.s0;
        c913630Zsn.LIZJ.getClass();
        if (context != null) {
            if (C0Z58.LIZ.LJ(str)) {
                IMGroupChatDetailAnalytics.LIZ.LJFF("click_invite_link", new Pair[]{new Pair("enter_from", "group_setting"), new Pair("allow_link_invite", "1"), new Pair("conversation_id", str)}, C0I0B.LJFF.LIZIZ());
                String str2 = InviteLinkFragment._pnsPageId;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/new/detail/invite_link");
                smartRouteBuildRoute.withParam("key_conversation_id", str);
                smartRouteBuildRoute.withParam("enter_from", "group_setting");
                smartRouteBuildRoute.open();
                IMGroupChatDetailAnalytics.LJ = "group_setting";
                IMGroupChatDetailAnalytics.LIZLLL = "invite_link_page";
            } else {
                IMGroupChatDetailAnalytics.LIZ.LJFF("click_invite_link", new Pair[]{new Pair("enter_from", "group_setting"), new Pair("allow_link_invite", CardStruct.IStatusCode.DEFAULT), new Pair("conversation_id", str)}, C0I0B.LJFF.LIZIZ());
                IToastHelper iToastHelper = (IToastHelper) PluggableExtentionKt.pluggableSpiForReal(IToastHelper.class);
                if (iToastHelper != null) {
                    iToastHelper.LIZ(EnumC1365740le0.TOP, C1383370m6R.LJIIJ(2131831422), 3000L, AFwS201S0000000_14.get$arr$(291), false, 3, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS124S1000000_14 awS124S1000000_14, Object obj, Object obj2) {
        BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), null, null, new C892950Z1h((InterfaceC893080Z1u) obj2, awS124S1000000_14.s0, baseSwitchActionViewModel, null), 3);
        return Unit.LIZ;
    }
}
