package kotlin.jvm.internal;

import X.ActivityC2196911AyX;
import X.C09AY;
import X.C0FNV;
import X.C0MJJ;
import X.C123100dR;
import X.C1326305Gz;
import X.C1397620mTQ;
import X.C13LP;
import X.C15438062q;
import X.C1B3M;
import X.C1B3P;
import X.C1B3S;
import X.C2197371AzH;
import X.C2344009Gk;
import X.C259800zU;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthClientInfo;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes35.dex */
public class AwS128S0400000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        OAuthPage oAuthPage = (OAuthPage) obj;
        if (oAuthPage != null && Intrinsics.LJFF(oAuthPage.canSkipConfirm, Boolean.TRUE)) {
            ((OpenAuthPageMethod) awS128S0400000_34.l0).autoAuth((IOpenPlatformService) awS128S0400000_34.l1, (C1B3S) awS128S0400000_34.l2, oAuthPage);
        } else {
            ((OpenAuthPageMethod) awS128S0400000_34.l0).endLoading();
            ((OpenAuthPageMethod) awS128S0400000_34.l0).showAuthPage((IOpenPlatformService) awS128S0400000_34.l1, (Bundle) awS128S0400000_34.l3, oAuthPage);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS128S0400000_34.l0).getResources().getString(2131820652), new AwS128S0400000_34((AIGCPictureHandler) awS128S0400000_34.l1, (Activity) awS128S0400000_34.l0, (List) awS128S0400000_34.l2, (Function1) awS128S0400000_34.l3, 2));
        c1397620mTQ.LIZJ(1, ((Activity) awS128S0400000_34.l0).getResources().getString(2131820653), new AwS613S0100000_34((AIGCPictureHandler) awS128S0400000_34.l1, 38));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        String str;
        AIGCPictureHandler.checkValidAndUpload$continueRun((AIGCPictureHandler) awS128S0400000_34.l0, (Activity) awS128S0400000_34.l1, (List) awS128S0400000_34.l2, (Function1) awS128S0400000_34.l3);
        C0MJJ c0mjj = C0MJJ.LIZ;
        if (((AIGCPictureHandler) awS128S0400000_34.l0).isFastPath) {
            str = "fast";
        } else {
            str = "slow";
        }
        c0mjj.getClass();
        C0MJJ.LIZLLL("confirm", str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        OAuthPage oAuthPage = (OAuthPage) obj;
        if (oAuthPage != null && Intrinsics.LJFF(oAuthPage.canSkipConfirm, Boolean.TRUE)) {
            ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS128S0400000_34.l0).autoAuth((IOpenPlatformService) awS128S0400000_34.l1, (C1B3S) awS128S0400000_34.l2, oAuthPage);
        } else {
            ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS128S0400000_34.l0).endLoading();
            ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS128S0400000_34.l0).showAuthPage((IOpenPlatformService) awS128S0400000_34.l1, (Bundle) awS128S0400000_34.l3, oAuthPage);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    public static final Object invoke$4(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        boolean zLJFF;
        T t;
        T t2;
        OAuthScopeStruct scopeListStruct;
        List<OAuthScope> list;
        OAuthPage oAuthPage = (OAuthPage) obj;
        if (oAuthPage != null) {
            zLJFF = Intrinsics.LJFF(oAuthPage.canSkipConfirm, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            C1B3M c1b3m = (C1B3M) awS128S0400000_34.l0;
            IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) awS128S0400000_34.l1;
            C1B3S c1b3s = (C1B3S) awS128S0400000_34.l2;
            Bundle bundle = (Bundle) awS128S0400000_34.l3;
            String str = c1b3m.LIZLLL;
            String str2 = c1b3m.LIZ;
            String str3 = c1b3m.LIZIZ;
            C259800zU c259800zU = new C259800zU();
            if (str3 == null) {
                t = "";
            } else {
                t = str3;
            }
            c259800zU.element = t;
            OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
            if (oAuthPageDetail != null && (scopeListStruct = oAuthPageDetail.getScopeListStruct()) != null && (list = scopeListStruct.authorizedScopeList) != null) {
                HashSet hashSet = new HashSet();
                Iterator<OAuthScope> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str4 = it2.next().scopeName;
                    if (str4 != null) {
                        hashSet.add(str4);
                    }
                }
                if ((true ^ hashSet.isEmpty()) && str3 != null) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(a0.LJLIIIL((String) it3.next()).toString());
                    }
                    hashSet.addAll(C13LP.LLIIJI(arrayList));
                    c259800zU.element = C13LP.LJJLIIIJ(hashSet, ",", null, null, 0, null, null, 62);
                }
            }
            if (str2 != null && (t2 = c259800zU.element) != 0) {
                iOpenPlatformService.LJIIJ(str2, (String) t2, str, c1b3s.LIZ, "", c1b3m.LIZJ instanceof ActivityC2196911AyX, new AwS128S0400000_34(c1b3m, (C1B3M) oAuthPage, (OAuthPage) bundle, (Bundle) c259800zU, (C259800zU<String>) 5));
            }
        } else {
            C1B3M c1b3m2 = (C1B3M) awS128S0400000_34.l0;
            DialogC1389620mGW dialogC1389620mGW = c1b3m2.LJ;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZ(dialogC1389620mGW);
            }
            c1b3m2.LJ = null;
            C1B3M c1b3m3 = (C1B3M) awS128S0400000_34.l0;
            if (c1b3m3.LJIIIZ) {
                c1b3m3.LIZJ(-2001, "background_load_ui_blocked: UI operation rejected because the mini game container is still being pre-rendered offscreen");
            } else {
                IOpenPlatformService iOpenPlatformService2 = (IOpenPlatformService) awS128S0400000_34.l1;
                Bundle bundle2 = (Bundle) awS128S0400000_34.l3;
                EventBus.LIZLLL().LJIJJ(c1b3m3);
                if (oAuthPage != null) {
                    C786410Ut5.LJJIZ(bundle2, "auth_page_info", oAuthPage);
                }
                Activity activity = c1b3m3.LIZJ;
                if (activity != null) {
                    c1b3m3.LJII.LIZ = true;
                    iOpenPlatformService2.LJIIJJI(activity, bundle2, new AwS400S0200000_34(c1b3m3, bundle2, 42), new AwS578S0100000_34(c1b3m3, 183), c1b3m3.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS128S0400000_34 awS128S0400000_34, Object obj) {
        String str;
        String str2;
        OAuthScopeStruct scopeListStruct;
        String str3;
        OAuthClientInfo clientInfo;
        OAuthClientInfo clientInfo2;
        WebAuthV2Response webAuthV2Response = (WebAuthV2Response) obj;
        C1B3M c1b3m = (C1B3M) awS128S0400000_34.l0;
        DialogC1389620mGW dialogC1389620mGW = c1b3m.LJ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        c1b3m.LJ = null;
        C1B3M c1b3m2 = (C1B3M) awS128S0400000_34.l0;
        OAuthPage oAuthPage = (OAuthPage) awS128S0400000_34.l1;
        Bundle bundle = (Bundle) awS128S0400000_34.l2;
        String str4 = (String) ((C259800zU) awS128S0400000_34.l3).element;
        c1b3m2.getClass();
        String string = bundle.getString("ttoclid");
        C1326305Gz c1326305Gz = C1326305Gz.LIZ;
        HashMap map = new HashMap();
        map.putAll(new C2344009Gk().LIZ);
        map.put("channel", c1b3m2.LIZ);
        String str5 = c1b3m2.LJI;
        if (str5 != null) {
            map.put("enter_method", str5);
        }
        map.put("enter_source", "authorization_sdk");
        String str6 = c1b3m2.LIZ;
        if (str6 == null) {
            OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
            if (oAuthPageDetail != null && (clientInfo2 = oAuthPageDetail.getClientInfo()) != null) {
                str6 = clientInfo2.clientKey;
            } else {
                str6 = null;
            }
        }
        map.put("channel", str6);
        OAuthPageDetail oAuthPageDetail2 = oAuthPage.pageDetail;
        if (oAuthPageDetail2 == null || (clientInfo = oAuthPageDetail2.getClientInfo()) == null || (str = clientInfo.clientName) == null) {
            str = "";
        }
        map.put("auth_app", str);
        map.put("auto_auth", 1);
        if (C123100dR.LIZ(webAuthV2Response.code)) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        map.put("result", str2);
        C2197371AzH c2197371AzH = C2197371AzH.LIZ;
        OAuthPageDetail oAuthPageDetail3 = oAuthPage.pageDetail;
        if (oAuthPageDetail3 != null) {
            scopeListStruct = oAuthPageDetail3.getScopeListStruct();
        } else {
            scopeListStruct = null;
        }
        c2197371AzH.getClass();
        map.put("pattern", C2197371AzH.LIZLLL(false, scopeListStruct).getValue());
        map.put("error_code", webAuthV2Response.errorCode);
        String str7 = webAuthV2Response.errorDescription;
        if (str7 == null) {
            str7 = webAuthV2Response.message;
        }
        map.put("error_message", str7);
        if (a0.LJJIIZI(str4, "user.info.open_id", false)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_silent_auth", str3);
        if (string != null) {
            map.put("ttoclid", string);
        }
        c1326305Gz.getClass();
        C1326305Gz.LIZ("auth_result", map, null);
        ((C1B3M) awS128S0400000_34.l0).onEvent$openplatform_impl_release(new C1B3P(webAuthV2Response.code, (String) ((C259800zU) awS128S0400000_34.l3).element, webAuthV2Response.errorDescription, ((Bundle) awS128S0400000_34.l2).getString("ttoclid"), webAuthV2Response.errorCode, 1, 912));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS128S0400000_34(com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler r3, android.app.Activity r4, java.util.List r5, kotlin.jvm.functions.Function1 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS128S0400000_34.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler, android.app.Activity, java.util.List, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS128S0400000_34(C1B3M c1b3m, C1B3M c1b3m2, OAuthPage oAuthPage, Bundle bundle, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c1b3m;
        this.l1 = c1b3m2;
        this.l2 = oAuthPage;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0400000_34(C1B3M c1b3m, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1b3m;
        this.l1 = iOpenPlatformService;
        this.l2 = c1b3s;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0400000_34(OpenAuthPageMethod openAuthPageMethod, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = openAuthPageMethod;
        this.l1 = iOpenPlatformService;
        this.l2 = c1b3s;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0400000_34(com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod openAuthPageMethod, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = openAuthPageMethod;
        this.l1 = iOpenPlatformService;
        this.l2 = c1b3s;
        this.l3 = bundle;
    }
}
