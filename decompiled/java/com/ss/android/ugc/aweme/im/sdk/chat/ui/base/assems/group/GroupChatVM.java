package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group;

import X.AbstractC1711506n3;
import X.C01GW;
import X.C05QR;
import X.C05QT;
import X.C069P;
import X.C06M6;
import X.C0PEM;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C0Z58;
import X.C0ZFW;
import X.C1229100i5c;
import X.C1461005nk;
import X.C1509305vX;
import X.C1559260qg8;
import X.C15606069c;
import X.C1611806Su;
import X.C1657506eL;
import X.C1657806eO;
import X.C1658206eS;
import X.C1769306wN;
import X.C1BGS;
import X.C2095008Iq;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C723600SZy;
import X.C913140Zs0;
import X.InterfaceC0148002o;
import X.InterfaceC1480505qt;
import X.InterfaceC1655706e3;
import X.InterfaceC876950Yaj;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatVM extends AssemViewModel<C1657506eL> implements C05QR {
    public final InterfaceC1655706e3 LL;
    public final C1559260qg8 LLILLJJLI;
    public final C01GW LLILLL;
    public String LLILZ;

    public GroupChatVM() {
        this(null);
    }

    @Override // X.C05QR
    public final void WB2(String str) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C0ZFW c0zfw = C0ZFW.LIZ;
        String strLJIILLIIL = c0zfw.LJIILLIIL(wQ2());
        String strLJIIJ = c0zfw.LJIIJ(wQ2());
        C291001Au c291001Au = new C291001Au(Boolean.FALSE);
        C0Y8T c0y8tWQ2 = wQ2();
        boolean zLJIIIZ = C1229100i5c.LJIIIZ(c0y8tWQ2 != null ? c0y8tWQ2.getConversationId() : null);
        boolean zLJIIIZ2 = c0zfw.LJIIIZ(wQ2());
        C0Y8T c0y8tWQ22 = wQ2();
        boolean zIsMute = c0y8tWQ22 != null ? c0y8tWQ22.isMute() : false;
        C0Y8T c0y8tWQ23 = wQ2();
        return new C1657506eL(strLJIILLIIL, strLJIIJ, c291001Au, zLJIIIZ2, zLJIIIZ, zIsMute, null, c0y8tWQ23 != null ? c0y8tWQ23.getMemberIds() : null, null, null);
    }

    public final C913140Zs0 xQ2() {
        return (C913140Zs0) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        String conversationId;
        super.onPrepared();
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 != null) {
            IMGroupChatDetailAnalytics.LJFF = c0y8tWQ2.getConversationId();
        }
        C913140Zs0 c913140Zs0XQ2 = xQ2();
        if (c913140Zs0XQ2 != null && (conversationId = c913140Zs0XQ2.getConversationId()) != null) {
            C1658206eS.LIZ(C1461005nk.LIZ, conversationId, this);
        }
        InterfaceC1655706e3 interfaceC1655706e3 = this.LL;
        if (interfaceC1655706e3 != null) {
            interfaceC1655706e3.cc1(new AwS581S0100000_2(this, 221));
        } else {
            vQ2();
        }
    }

    public final void vQ2() {
        String conversationId;
        IMGroupChatApi iMGroupChatApiLIZ;
        C913140Zs0 c913140Zs0XQ2;
        String conversationId2;
        Long lLJIILIIL;
        if (C1611806Su.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1657806eO(this, null), 3);
        }
        if (wQ2() == null && (c913140Zs0XQ2 = xQ2()) != null && (conversationId2 = c913140Zs0XQ2.getConversationId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(conversationId2)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            C913140Zs0 c913140Zs0XQ22 = xQ2();
            interfaceC876950YajLIZIZ.LJJI(c913140Zs0XQ22 != null ? c913140Zs0XQ22.getConversationId() : null, jLongValue, AbstractC1711506n3.LIZIZ, new C1769306wN(this, 4));
        }
        C913140Zs0 c913140Zs0XQ23 = xQ2();
        if (c913140Zs0XQ23 != null && (conversationId = c913140Zs0XQ23.getConversationId()) != null && (iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ()) != null) {
            iMGroupChatApiLIZ.LJJ(conversationId);
        }
        C0Y8T c0y8tWQ2 = wQ2();
        if (C1229100i5c.LJII(c0y8tWQ2 != null ? c0y8tWQ2.getConversationId() : null)) {
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            Long lLJJI = C0ZFW.LJJI(wQ2());
            c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.06eP
                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    if (iMUser.getUid() != null) {
                        this.LIZ.setState(new AwS581S0100000_2(iMUser, 590));
                    }
                }
            }, lLJJI != null ? lLJJI.toString() : null, null, "im_chat", true);
        }
        zQ2();
    }

    public final C0Y8T wQ2() {
        String conversationId;
        C913140Zs0 c913140Zs0XQ2 = xQ2();
        if (c913140Zs0XQ2 == null || (conversationId = c913140Zs0XQ2.getConversationId()) == null) {
            return null;
        }
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
    }

    public final void zQ2() {
        C913140Zs0 c913140Zs0XQ2;
        String conversationId;
        String str;
        IMGroupChatApi iMGroupChatApiLIZ;
        Map<String, String> ext;
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 == null || c0y8tWQ2.isTemp() || (c913140Zs0XQ2 = xQ2()) == null || (conversationId = c913140Zs0XQ2.getConversationId()) == null || !C1229100i5c.LIZ.LJIIJJI(conversationId)) {
            return;
        }
        C0Z58.LIZ.getClass();
        C0Y8Y coreInfo = c0y8tWQ2.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:access_criteria")) == null) {
            str = "";
        }
        this.LLILZ = str;
        if (C0ZFW.LIZ.LJIIIZ(wQ2()) && (iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ()) != null) {
            iMGroupChatApiLIZ.LJIIJJI(c0y8tWQ2, ViewModelKt.getViewModelScope(this));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public GroupChatVM(InterfaceC1655706e3 interfaceC1655706e3) {
        this.LL = interfaceC1655706e3;
        new C723600SZy(this, C06M6.class, null);
        this.LLILLJJLI = new C1559260qg8(new C723600SZy(this, C15606069c.class, null), true);
        this.LLILLL = C1509305vX.LIZ(new AwS546S0100000_2(this, 524));
    }

    public final void yQ2(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (c0y8t.isTemp() || !C1229100i5c.LIZ.LJIIJJI(c0y8t.getConversationId()) || !C0ZFW.LIZ.LJIIIZ(wQ2())) {
            return;
        }
        C0Z58.LIZ.getClass();
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:access_criteria")) == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(str, this.LLILZ)) {
            this.LLILZ = str;
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null) {
                iMGroupChatApiLIZ.LJIIJJI(c0y8t, ViewModelKt.getViewModelScope(this));
            }
        }
    }

    @Override // X.C05QR
    public final void Ys1(C05QT c05qt, String str, List list) {
        setState(new AwS581S0100000_2(list, (List<ActionBarButtonConfBusiness>) 591));
    }
}
