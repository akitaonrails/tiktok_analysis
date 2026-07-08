package com.ss.android.ugc.aweme.im.utils;

import X.C04TD;
import X.C069P;
import X.C0I0B;
import X.C0Y8T;
import X.C1240600iOA;
import X.C1336205Ku;
import X.C1D0F;
import X.C339360DSc;
import X.C879350Yeb;
import X.C882340YjQ;
import X.EnumC1240610iOB;
import X.EnumC1240620iOC;
import X.EnumC1240680iOI;
import X.InterfaceC893670Z4b;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.search.api.service.IIMSearchRouterUtils;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;

/* JADX INFO: loaded from: classes20.dex */
public final class IMSearchRouterUtilsIpml implements IIMSearchRouterUtils {
    public static IIMSearchRouterUtils LJ() {
        Object objLIZ = C04TD.LIZ(IIMSearchRouterUtils.class, false);
        if (objLIZ != null) {
            return (IIMSearchRouterUtils) objLIZ;
        }
        if (C04TD.n1 == null) {
            synchronized (IIMSearchRouterUtils.class) {
                if (C04TD.n1 == null) {
                    C04TD.n1 = new IMSearchRouterUtilsIpml();
                }
            }
        }
        return C04TD.n1;
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchRouterUtils
    public final void LIZIZ(Context context) {
        SmartRouter.buildRoute(context, "//im/search/detail").open();
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchRouterUtils
    public final void LIZ(IMUser iMUser, EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC) {
        String uid;
        String uid2;
        String uid3;
        String value;
        boolean zIsConnected;
        String strLIZJ;
        IMContactApi.LIZ.getClass();
        InterfaceC893670Z4b interfaceC893670Z4bLIZLLL = C069P.LIZ().LIZLLL();
        String value2 = null;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        interfaceC893670Z4bLIZLLL.LIZIZ(uid);
        C879350Yeb c879350Yeb = C879350Yeb.LIZ;
        if (iMUser != null) {
            uid2 = iMUser.getUid();
        } else {
            uid2 = null;
        }
        c879350Yeb.getClass();
        C879350Yeb.LIZIZ(uid2, "dm_search_page", "click_dm_search_cell", null);
        C1240600iOA c1240600iOA = C1240600iOA.LIZIZ;
        if (iMUser != null) {
            uid3 = iMUser.getUid();
        } else {
            uid3 = null;
        }
        String value3 = EnumC1240680iOI.RESULT.getValue();
        if (enumC1240610iOB != null) {
            value = enumC1240610iOB.getValue();
        } else {
            value = null;
        }
        if (enumC1240620iOC != null) {
            value2 = enumC1240620iOC.getValue();
        }
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null) {
            zIsConnected = c1d0f.isConnected();
        } else {
            zIsConnected = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zIsConnected);
        if (c1d0f == null || (strLIZJ = c1d0f.LIZJ()) == null) {
            strLIZJ = "";
        }
        c1240600iOA.LJFF(uid3, value3, value, value2, boolValueOf, strLIZJ, -1, C0I0B.LJFF.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchRouterUtils
    public final void LIZLLL(View view, C0Y8T c0y8t, String str, Long l, String str2, EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, boolean z) {
        Context context;
        String conversationId;
        boolean zIsStickTop;
        String value;
        if (view != null) {
            C339360DSc.LIZ(view);
        }
        int unreadCount = 0;
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        String value2 = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        EnterChatParams enterChatParams = new EnterChatParams(context, 3, conversationId);
        enterChatParams.setEnterFromForMob("dm_search_page");
        if (str == null) {
            str = "click_dm_search_cell";
        }
        enterChatParams.setEnterMethodForMob(str);
        if (c0y8t != null) {
            zIsStickTop = c0y8t.isStickTop();
        } else {
            zIsStickTop = false;
        }
        enterChatParams.setStickyTop(zIsStickTop);
        if (c0y8t != null) {
            unreadCount = (int) c0y8t.getUnreadCount();
        }
        enterChatParams.setUnreadCount(unreadCount);
        enterChatParams.setSearchTargetIndex(l);
        enterChatParams.setMatchedKeyword(str2);
        enterChatParams.setInboxSearchPosition(EnumC1240680iOI.RESULT.getValue());
        if (enumC1240610iOB != null) {
            value = enumC1240610iOB.getValue();
        } else {
            value = null;
        }
        enterChatParams.setInboxSearchCellType(value);
        if (enumC1240620iOC != null) {
            value2 = enumC1240620iOC.getValue();
        }
        enterChatParams.setInboxSearchTabName(value2);
        enterChatParams.setImSearchNeedBounce(Boolean.valueOf(z));
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchRouterUtils
    public final void LIZJ(View view, IMUser iMUser, C0Y8T c0y8t, String str, Long l, String str2, EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, boolean z) {
        Context context;
        boolean zIsStickTop;
        int unreadCount;
        String value;
        if (view != null) {
            C339360DSc.LIZ(view);
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        String value2 = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
        enterChatParams.setEnterFromForMob("dm_search_page");
        if (str == null) {
            str = "click_dm_search_cell";
        }
        enterChatParams.setEnterMethodForMob(str);
        if (c0y8t != null) {
            zIsStickTop = c0y8t.isStickTop();
        } else {
            zIsStickTop = false;
        }
        enterChatParams.setStickyTop(zIsStickTop);
        if (c0y8t != null) {
            unreadCount = (int) c0y8t.getUnreadCount();
        } else {
            unreadCount = 0;
        }
        enterChatParams.setUnreadCount(unreadCount);
        enterChatParams.setSearchTargetIndex(l);
        enterChatParams.setMatchedKeyword(str2);
        enterChatParams.setInboxSearchPosition(EnumC1240680iOI.RESULT.getValue());
        if (enumC1240610iOB != null) {
            value = enumC1240610iOB.getValue();
        } else {
            value = null;
        }
        enterChatParams.setInboxSearchCellType(value);
        if (enumC1240620iOC != null) {
            value2 = enumC1240620iOC.getValue();
        }
        enterChatParams.setInboxSearchTabName(value2);
        enterChatParams.setImSearchNeedBounce(Boolean.valueOf(z));
        int i = 1;
        if (c0y8t == null || !C882340YjQ.LJ(c0y8t)) {
            i = -1;
        }
        enterChatParams.setChatType(i);
        imChatService.LJIILLIIL(enterChatParams, null);
    }
}
