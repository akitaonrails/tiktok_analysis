package com.ss.android.ugc.aweme.commercialize.depend;

import X.AbstractC1025070cmX;
import X.AbstractC1027370cqF;
import X.C04TD;
import X.C0WZX;
import X.C1017070cZd;
import X.C1019830ce5;
import X.C1022290ci3;
import X.C1025610cnP;
import X.C1027230cq1;
import X.C1027240cq2;
import X.C1027350cqD;
import X.C1027360cqE;
import X.C1027480cqQ;
import X.C1027620cqe;
import X.C1029220ctE;
import X.C1034340d1U;
import X.C1041940dDk;
import X.C123100dR;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1668706g9;
import X.C1701330uNH;
import X.C1744706sP;
import X.C19724912Fj;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2429209fW;
import X.C289890BXv;
import X.C294500BgW;
import X.C730040SkM;
import X.C816140Vzw;
import X.C988850bq7;
import X.EnumC1001040c9m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class AdRouterHandlerDependImpl implements IAdRouterHandlerDepend {
    public static IAdRouterHandlerDepend LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdRouterHandlerDepend.class, false);
        if (objLIZ != null) {
            return (IAdRouterHandlerDepend) objLIZ;
        }
        if (C04TD.LLL == null) {
            synchronized (IAdRouterHandlerDepend.class) {
                if (C04TD.LLL == null) {
                    C04TD.LLL = new AdRouterHandlerDependImpl();
                }
            }
        }
        return C04TD.LLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        sbLIZ.append(C816140Vzw.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZ(String str) {
        C730040SkM.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJ(final Function1<? super Boolean, Unit> function1) {
        return new C1027350cqD() { // from class: X.0cnL
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJFF(final Function1<? super Boolean, Unit> function1) {
        return new C1027240cq2() { // from class: X.0cnN
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIIIIZZ(final Function1<? super Boolean, Unit> function1) {
        return new C1027620cqe() { // from class: X.0cnO
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIIJJI(final Function1<? super Boolean, Unit> function1) {
        return new C1027360cqE() { // from class: X.0cnM
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIILIIL(final Function1<? super Boolean, Unit> function1) {
        return new C1027230cq1() { // from class: X.0cnK
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJIILJJIL(Function1<? super Boolean, Unit> function1) {
        AbstractC1025070cmX.LJJIIJ(new C1025610cnP(function1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean open(String str) {
        return C19724912Fj.LIZLLL().LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void pendingDeepLinkLog(Function1<? super Boolean, Unit> function1) {
        AbstractC1025070cmX.LJJIII(new C1025610cnP(function1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LIZJ(Context context, String str) {
        return C1041940dDk.LIZJ(context, str, null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIZ(C19EG c19eg, String str) {
        return C19724912Fj.LIZLLL().LJI(c19eg, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJI(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJII(int i, Context context, Aweme aweme, boolean z) {
        Aweme aweme2;
        String authorUid = null;
        if (aweme == null) {
            C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
            if (c1019830ce5LIZ == null || (aweme2 = c1019830ce5LIZ.LJIIL) == null) {
                return false;
            }
        } else {
            aweme2 = aweme;
        }
        if (!C1017070cZd.LJJZZIII(aweme2)) {
            return false;
        }
        DmNoticeProxy dmNoticeProxyLIZJ = DmNoticeProxyImpl.LIZJ();
        if (dmNoticeProxyLIZJ != null && dmNoticeProxyLIZJ.LIZIZ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
            }
            return false;
        }
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (z && iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LIZLLL(context, aweme2, i);
        }
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(AbstractC1025070cmX.LJIIIIZZ(context, aweme2, i), null);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        if (C123100dR.LIZ(authorUid) && C1017070cZd.LLI(aweme) && ((Number) C289890BXv.LIZ.getValue()).intValue() > -1) {
            C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJI().LIZIZ(new C1744706sP(EnumC1001040c9m.CLICK_ENTRANCE, authorUid, aweme));
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIJ(Context context, String str, Uri uri, C1027480cqQ c1027480cqQ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("【filterUrl】 = ");
        sbLIZ.append(str);
        sbLIZ.append(" 【market】 special handle");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("commerce_jump", C2188811AlT.LIZIZ(sbLIZ));
        new Object() { // from class: X.0cnQ
        }.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOMMEUMY2D0bS5+k8=", null));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJIIL(String str, String str2, String str3, String str4, Context context) {
        if (C294500BgW.LIZ()) {
            C1034340d1U.LIZLLL.LIZ().LIZ("draw_ad", new C1029220ctE(null, str, str2, str3), null, str4, context);
        }
    }
}
