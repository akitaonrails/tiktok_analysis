package com.ss.android.ugc.aweme.im.service.impl.selectmsg;

import X.C01GW;
import X.C069P;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C1684506ih;
import X.C2188811AlT;
import X.C452501pT;
import X.C461720I8s;
import X.InterfaceC1480505qt;
import X.InterfaceC876950Yaj;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.service.impl.selectmsg.BlockSystemMsgManager;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BlockSystemMsgManager implements IBlockSystemMsgManager {
    public static final BlockSystemMsgManager LIZ = new BlockSystemMsgManager();
    public static final C01GW<Keva> LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(518));

    @Override // com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager
    public final void LIZIZ(String str) {
        String string;
        try {
            String strLIZLLL = C0YNP.LIZLLL(Long.valueOf(CastLongProtector.parseLong(str)));
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
            if (fakeMsgOperatorService != null) {
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(10);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("msg_uuid|");
                sbLIZ.append(C461720I8s.LIZIZ());
                sbLIZ.append('|');
                sbLIZ.append(strLIZLLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Keva value = LIZIZ.getValue();
                if (value == null || (string = value.getString(strLIZIZ, null)) == null) {
                    string = "uuid-block-user-inline";
                }
                c1684506ih.LIZJ = string;
                fakeMsgOperatorService.LIZ(strLIZLLL, c1684506ih, null, null);
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager
    public final void LIZ(final Context context, String str, boolean z) {
        final C0Y8T c0y8tLIZ;
        if (z || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) == null) {
            return;
        }
        long jLJII = C0YNP.LJII(str);
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt(c0y8tLIZ, context) { // from class: X.05uo
            public final /* synthetic */ C0Y8T LIZIZ;

            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                String uid;
                if (iMUser.isBlock() || (uid = iMUser.getUid()) == null) {
                    return;
                }
                BlockSystemMsgManager blockSystemMsgManager = this.LIZ;
                C0Y8T c0y8t = this.LIZIZ;
                blockSystemMsgManager.LIZIZ(uid);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uuid-block-user-inline");
                sbLIZ.append(System.currentTimeMillis());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String conversationId = c0y8t.getConversationId();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("msg_uuid|");
                sbLIZ2.append(C461720I8s.LIZIZ());
                sbLIZ2.append('|');
                sbLIZ2.append(conversationId);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                Keva value = BlockSystemMsgManager.LIZIZ.getValue();
                if (value != null) {
                    value.storeString(strLIZIZ2, strLIZIZ);
                }
                FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
                if (fakeMsgOperatorService != null) {
                    String conversationId2 = c0y8t.getConversationId();
                    C1684506ih c1684506ih = new C1684506ih();
                    c1684506ih.LIZLLL(10);
                    c1684506ih.LIZJ = strLIZIZ;
                    c1684506ih.LIZLLL = C2095008Iq.LJIILIIL(uid);
                    fakeMsgOperatorService.LIZIZ(conversationId2, c1684506ih, null, null, null);
                }
            }
        }, String.valueOf(jLJII), null, "im_chat_block", true);
    }
}
