package com.ss.android.ugc.aweme.dynamic.card.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C085L;
import X.C1391190mJ3;
import X.C1509305vX;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1871910yoP;
import X.C2181808gi;
import X.C2196608j6;
import X.C343970De7;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724240Sb0;
import X.InterfaceC1107590evd;
import X.InterfaceC1548390qOb;
import X.InterfaceC346201Wa;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.dynamic.card.api.ability.DynamicCardPreserveDataAbility;
import com.ss.android.ugc.aweme.dynamic.card.api.preserve.data.DynamicCardPreserveDataService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicCardAbilityAssem extends AbstractC738140SxQ implements DynamicCardPreserveDataAbility, InterfaceC1548390qOb {
    public final C01GW LL = C1509305vX.LIZ(new AwS576S0100000_32(this, 128));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 127));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 129));

    public final C457780HxI bo() {
        return (C457780HxI) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.ability.DynamicCardPreserveDataAbility
    public final InterfaceC346201Wa<Map<String, C2181808gi>> rc0() {
        return (InterfaceC346201Wa) this.LLILLL.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() throws JSONException {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, DynamicCardPreserveDataAbility.class, null, null);
        }
        C1548820qPI.LJI((C085L) this.LLILZ.getValue(), "try_close_quick_chat_room");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        DynamicCardPreserveDataService.LIZ.getClass();
        C2196608j6.LIZIZ.getValue().LIZ(bo().LL.getUuid());
        C1548820qPI.LJIIIZ((C085L) this.LLILZ.getValue(), "try_close_quick_chat_room");
    }

    @Override // X.InterfaceC1548390qOb
    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
        String strLJFF;
        Fragment fragmentLJI;
        IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory;
        if (Intrinsics.LJFF(str, "try_close_quick_chat_room") && bo().LLILLJJLI) {
            String strLJFF2 = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "conversation_id", "");
                strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "process_id", "");
            } else {
                strLJFF = null;
            }
            if (Intrinsics.LJFF(strLJFF, bo().LL.getConversationId()) && Intrinsics.LJFF(strLJFF2, bo().LL.getUuid()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpiForReal(IQuickChatRoomSheetFactory.class)) != null && iQuickChatRoomSheetFactory.LIZJ(fragmentLJI)) {
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
            }
        }
    }
}
