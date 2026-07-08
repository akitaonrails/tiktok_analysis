package kotlin.jvm.internal;

import X.C09AY;
import X.C1091830eWD;
import X.C1237780iJc;
import X.C1264860j1I;
import X.C1733740vDY;
import X.C20656615sK;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C736460Sui;
import X.EnumC1237790iJd;
import X.EnumC1237800iJe;
import X.EnumC589810NBj;
import X.InterfaceC1264850j1H;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ForceBindingAccountService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS15S2300000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS15S2300000_19 awS15S2300000_19) {
        ForceBindingAccountService forceBindingAccountService = (ForceBindingAccountService) awS15S2300000_19.l4;
        if (forceBindingAccountService.closeBtnScene == EnumC589810NBj.IS_VISIBLE) {
            C1237780iJc c1237780iJc = C1237780iJc.LIZ;
            String firstButtonActionType = forceBindingAccountService.getFirstButtonActionType(((IForceBindingAccountService.BindPromptConfig) awS15S2300000_19.l2).buttons);
            String str = awS15S2300000_19.s0;
            String str2 = awS15S2300000_19.s1;
            int i = ((IForceBindingAccountService.BindPromptConfig) awS15S2300000_19.l2).groupId;
            EnumC1237790iJd enumC1237790iJd = EnumC1237790iJd.DISMISS;
            ((ForceBindingAccountService) awS15S2300000_19.l4).getCurrentLoginUser3pPlatform();
            IForceBindingAccountService.BindPromptConfig bindPromptConfig = (IForceBindingAccountService.BindPromptConfig) awS15S2300000_19.l2;
            Integer num = bindPromptConfig.non1PBindingType;
            Integer numValueOf = Integer.valueOf(((ForceBindingAccountService) awS15S2300000_19.l4).getPopupFreq(bindPromptConfig.projectId));
            IForceBindingAccountService.BindPromptConfig bindPromptConfig2 = (IForceBindingAccountService.BindPromptConfig) awS15S2300000_19.l2;
            ForceBindingAccountService forceBindingAccountService2 = (ForceBindingAccountService) awS15S2300000_19.l4;
            EnumC1237800iJe enumC1237800iJe = forceBindingAccountService2.safeEnvCheckButtonStatus;
            String pageValue = forceBindingAccountService2.getPageValue("", bindPromptConfig2.projectTag);
            if (pageValue.length() <= 0) {
                pageValue = null;
            }
            c1237780iJc.getClass();
            C1237780iJc.LIZ(firstButtonActionType, str, str2, i, enumC1237790iJd, num, numValueOf, enumC1237800iJe, pageValue);
        }
        ((C20656615sK) awS15S2300000_19.l3).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S2300000_19 awS15S2300000_19) {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("follow_status", String.valueOf(((User) awS15S2300000_19.l2).getFollowStatus())), new Pair("enter_from", C1264860j1I.LIZ((InterfaceC1264850j1H) awS15S2300000_19.l3)), new Pair("source_previous_page", "follow"), new Pair("start_click_time", Long.valueOf(System.currentTimeMillis())));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c7945.d4673_i");
        sbLIZ.append(((InterfaceC1264850j1H) awS15S2300000_19.l3).Yg());
        sbLIZ.append("_w6893");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(strLIZIZ, PageFinder.via((View) awS15S2300000_19.l4), null);
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            iECommerceShowcaseService.LJIIJ(((C1091830eWD) awS15S2300000_19.l4).getContext(), C1733740vDY.LIZ(awS15S2300000_19.s0, strCreateJumpSourceBtmToken), awS15S2300000_19.s1, C1264860j1I.LIZ((InterfaceC1264850j1H) awS15S2300000_19.l3), "follow", "visit_shop", C736460Sui.LIZJ((User) awS15S2300000_19.l2), Integer.valueOf(((User) awS15S2300000_19.l2).getFollowStatus()), C1264860j1I.LIZIZ((InterfaceC1264850j1H) awS15S2300000_19.l3), null, null, null, mapLJIIJ, C1733740vDY.LIZLLL((C1091830eWD) awS15S2300000_19.l4, strLIZIZ));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S2300000_19(User user, InterfaceC1264850j1H interfaceC1264850j1H, C1091830eWD c1091830eWD, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = user;
        this.l3 = interfaceC1264850j1H;
        this.l4 = c1091830eWD;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S2300000_19(ForceBindingAccountService forceBindingAccountService, IForceBindingAccountService.BindPromptConfig bindPromptConfig, String str, String str2, C20656615sK c20656615sK, int i) {
        super(0);
        this.$t = i;
        this.l4 = forceBindingAccountService;
        this.l2 = bindPromptConfig;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c20656615sK;
    }
}
