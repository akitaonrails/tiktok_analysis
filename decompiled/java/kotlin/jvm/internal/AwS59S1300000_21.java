package kotlin.jvm.internal;

import X.C09AY;
import X.C12F5;
import X.C12FB;
import X.C1359270lTZ;
import X.C1359320lTe;
import X.C1375670lu1;
import X.C1378400lyQ;
import X.C1388190mED;
import X.C1394160mNq;
import X.C1397620mTQ;
import X.C1402840mbq;
import X.C1589640rT8;
import X.C1618440sDa;
import X.C19EG;
import X.C2097608Jq;
import X.C721220SQu;
import X.InterfaceC1052240dUM;
import X.InterfaceC1392640mLO;
import X.InterfaceC706770Rnv;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS59S1300000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        int i;
        String str = (String) obj;
        C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
        String str2 = awS59S1300000_21.s0;
        Aweme aweme = (Aweme) awS59S1300000_21.l1;
        if (str.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        String strLIZJ = C721220SQu.LIZJ((Aweme) awS59S1300000_21.l1, Collections.singleton(0));
        c1375670lu1.getClass();
        C1375670lu1.LIZIZ(1, 0, i, aweme, str2, strLIZJ);
        if (str.length() > 0) {
            IProactiveTriggersService iProactiveTriggersService = (IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class);
            iProactiveTriggersService.LJII();
            if (iProactiveTriggersService.LJ()) {
                iProactiveTriggersService.LJI((C19EG) awS59S1300000_21.l2, awS59S1300000_21.s0);
            } else {
                ((ShareService) ServiceManager.get().getService(ShareService.class)).LJIILJJIL((Aweme) awS59S1300000_21.l1, (C19EG) awS59S1300000_21.l2, str, awS59S1300000_21.s0, (SharePackage) awS59S1300000_21.l3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        IShareRespSendService iShareRespSendService = (IShareRespSendService) PluggableExtentionKt.pluggableSpi$default(IShareRespSendService.class, false, false, false, 14, null);
        if (iShareRespSendService != null) {
            iShareRespSendService.LJFF((Activity) awS59S1300000_21.l1, (C1402840mbq) awS59S1300000_21.l2);
        }
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) awS59S1300000_21.l3;
        String str = awS59S1300000_21.s0;
        shareServiceImpl.getClass();
        ShareServiceImpl.LIZLLL("return", str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131846726, new AwS135S1100000_21((ShareServiceImpl) awS59S1300000_21.l1, awS59S1300000_21.s0, 3));
        c1397620mTQ.LJFF(2131846725, new AwS59S1300000_21((Activity) awS59S1300000_21.l2, (C1402840mbq) awS59S1300000_21.l3, (ShareServiceImpl) awS59S1300000_21.l1, awS59S1300000_21.s0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        C1359320lTe c1359320lTe = C1359320lTe.LIZ;
        String str = awS59S1300000_21.s0;
        UpvotePublishExtraData upvotePublishExtraData = (UpvotePublishExtraData) awS59S1300000_21.l1;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) awS59S1300000_21.l2;
        Function1 function1 = (Function1) awS59S1300000_21.l3;
        c1359320lTe.getClass();
        C1359320lTe.LIZ(str, upvotePublishExtraData, upvotePublishMobParam, (C1359270lTZ) obj, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        Fragment fragmentLJ;
        Fragment fragmentLJ2;
        SmartRoute smartRoute = (SmartRoute) obj;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        InterfaceC1052240dUM interfaceC1052240dUM = (InterfaceC1052240dUM) awS59S1300000_21.l1;
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (interfaceC1052240dUM != null) {
            fragmentLJ = interfaceC1052240dUM.LJ();
        } else {
            fragmentLJ = null;
        }
        smartRoute.withParam("is_story_page", interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragmentLJ));
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        InterfaceC1052240dUM interfaceC1052240dUM2 = (InterfaceC1052240dUM) awS59S1300000_21.l1;
        if (interfaceC1052240dUM2 != null) {
            fragmentLJ2 = interfaceC1052240dUM2.LJ();
        } else {
            fragmentLJ2 = null;
        }
        smartRoute.withParam("is_friend_page", c1589640rT8.t2(fragmentLJ2));
        smartRoute.withParam("story type", ((Aweme) awS59S1300000_21.l2).getIsTikTokStory());
        String str = awS59S1300000_21.s0;
        if (str != null) {
            smartRoute.withParam("extra_edit_effect_uid", str);
        }
        C1394160mNq c1394160mNq = (C1394160mNq) awS59S1300000_21.l3;
        Aweme aweme = (Aweme) awS59S1300000_21.l2;
        InterfaceC1052240dUM interfaceC1052240dUM3 = (InterfaceC1052240dUM) awS59S1300000_21.l1;
        if (interfaceC1052240dUM3 instanceof InterfaceC1392640mLO) {
            interfaceC1392640mLO = (InterfaceC1392640mLO) interfaceC1052240dUM3;
        }
        c1394160mNq.getClass();
        C1394160mNq.LIZ(aweme, interfaceC1392640mLO, smartRoute);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS59S1300000_21 awS59S1300000_21, Object obj) {
        C1378400lyQ c1378400lyQ = (C1378400lyQ) obj;
        c1378400lyQ.LIZ = C1388190mED.LIZIZ(((C12F5) awS59S1300000_21.l1).LL);
        String str = (String) ((Map) awS59S1300000_21.l2).get("enter_from");
        Object obj2 = "";
        if (str == null) {
            str = "";
        }
        c1378400lyQ.LIZIZ = str;
        String str2 = (String) ((Map) awS59S1300000_21.l2).get("enter_method");
        if (str2 == null) {
            str2 = "";
        }
        c1378400lyQ.LIZJ = str2;
        c1378400lyQ.LIZLLL = true;
        c1378400lyQ.LJ = true;
        Pair[] pairArr = new Pair[2];
        Object obj3 = ((Map) awS59S1300000_21.l2).get("process_id");
        if (obj3 != null) {
            obj2 = obj3;
        }
        pairArr[0] = new Pair("tako_process_id", obj2);
        pairArr[1] = new Pair("tako_message_id", C12FB.LIZ((TakoMultipleSelectVM) awS59S1300000_21.l3, awS59S1300000_21.s0));
        c1378400lyQ.LJFF = C2097608Jq.LJIIIIZZ(pairArr);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS59S1300000_21(android.app.Activity r3, X.C1402840mbq r4, com.ss.android.ugc.aweme.internal.ShareServiceImpl r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l1 = r5
            r1.s0 = r6
            r1.l2 = r3
            r1.l3 = r4
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r1.s0 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS59S1300000_21.<init>(android.app.Activity, X.0mbq, com.ss.android.ugc.aweme.internal.ShareServiceImpl, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S1300000_21(InterfaceC1392640mLO interfaceC1392640mLO, Aweme aweme, String str, C1394160mNq c1394160mNq, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1392640mLO;
        this.l2 = aweme;
        this.s0 = str;
        this.l3 = c1394160mNq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S1300000_21(C12F5 c12f5, C12F5 c12f52, Map<String, String> map, TakoMultipleSelectVM takoMultipleSelectVM, String str) {
        super(1);
        this.$t = str;
        this.l1 = c12f5;
        this.l2 = c12f52;
        this.l3 = map;
        this.s0 = takoMultipleSelectVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S1300000_21(UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, String str, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = upvotePublishExtraData;
        this.l2 = upvotePublishMobParam;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S1300000_21(String str, Aweme aweme, C19EG c19eg, SharePackage sharePackage, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.l2 = c19eg;
        this.l3 = sharePackage;
    }
}
