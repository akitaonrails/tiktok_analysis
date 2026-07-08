package com.ss.android.ugc.aweme.im.saas.host.impl.chatlist;

import X.C0Z8O;
import X.C15438062q;
import X.C1566606Bk;
import X.C869590Y9l;
import X.C878950Ydx;
import X.C890330YwJ;
import X.EnumC885270Yo9;
import X.InterfaceC1566506Bj;
import X.InterfaceC882680Yjy;
import X.InterfaceC884050YmB;
import X.InterfaceC884440Ymo;
import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatListBridgeService implements IMChatListBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi
    public final void LIZLLL() {
        C1566606Bk c1566606Bk = C1566606Bk.LIZ;
        IMChatListApi.LJJIII.getClass();
        InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
        if (interfaceC882680YjyLJJIL != null) {
            interfaceC882680YjyLJJIL.LIZJ(c1566606Bk);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi
    public final List<String> LIZIZ(List<? extends InterfaceC884440Ymo> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC884440Ymo interfaceC884440Ymo : list) {
            if (interfaceC884440Ymo instanceof C0Z8O) {
                arrayList.add(interfaceC884440Ymo);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0Z8O) it2.next()).getExtra().getSessionId());
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi
    public final void LJ(InterfaceC1566506Bj interfaceC1566506Bj) {
        InterfaceC884050YmB interfaceC884050YmB;
        if ((interfaceC1566506Bj instanceof InterfaceC884050YmB) && (interfaceC884050YmB = (InterfaceC884050YmB) interfaceC1566506Bj) != null) {
            IMChatListApi.LJJIII.getClass();
            InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
            if (interfaceC882680YjyLJJIL != null) {
                interfaceC882680YjyLJJIL.LIZ(interfaceC884050YmB);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi
    public final boolean LIZ(C869590Y9l c869590Y9l, boolean z) {
        IDMRiskyKeywordsService iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpi$default(IDMRiskyKeywordsService.class, false, false, false, 14, null);
        if (iDMRiskyKeywordsService != null) {
            return iDMRiskyKeywordsService.LIZ(c869590Y9l, z);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi
    public final void LIZJ(Activity activity, List list, boolean z, Function0 function0, Function0 function02) {
        C878950Ydx c878950YdxLIZIZ;
        IMChatListApi.LJJIII.getClass();
        InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
        if (interfaceC882680YjyLJJIL != null && (c878950YdxLIZIZ = interfaceC882680YjyLJJIL.LIZIZ(FilterTabType.STARRED, null)) != null) {
            EnumC885270Yo9 enumC885270Yo9 = EnumC885270Yo9.STAR_SELECTED;
            C890330YwJ.LIZ().LJJJIL().LIZIZ(activity, c878950YdxLIZIZ.LLILLJJLI, list, c878950YdxLIZIZ, enumC885270Yo9, z, true, new AwS558S0100000_14(function0, 1384), new AwS558S0100000_14(function02, 1385));
            C890330YwJ.LIZ().LIZIZ().LJ(list.size(), c878950YdxLIZIZ.LLILLJJLI, "direct_click", enumC885270Yo9.getSingleTargetMobValue(), c878950YdxLIZIZ.LLILLL.getMobValue());
        }
    }
}
