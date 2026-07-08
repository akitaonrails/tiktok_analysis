package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C19748512Ol;
import X.C307001Gy;
import X.C497740JfY;
import X.C766270U4b;
import X.C918220a0C;
import X.C918230a0D;
import X.C918240a0E;
import X.C918400a0U;
import X.C918650a0t;
import X.C925600aC6;
import X.C927600aFK;
import X.C932140aMe;
import X.EnumC918970a1P;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.controller.InviteResultInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS9S1301000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS9S1301000_15 r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS9S1301000_15.invoke$0(kotlin.jvm.internal.AwS9S1301000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS9S1301000_15 awS9S1301000_15, Object obj) {
        List<InviteResultInfo> list;
        String str;
        boolean z;
        C918230a0D c918230a0D = (C918230a0D) obj;
        C918650a0t c918650a0t = (C918650a0t) awS9S1301000_15.l1;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) awS9S1301000_15.l2;
        String str2 = awS9S1301000_15.s0;
        int i = awS9S1301000_15.i4;
        c918650a0t.getClass();
        if (C918240a0E.LIZLLL(c918230a0D)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842764));
            long id = linkPlayerInfo.mUser.getId();
            List listLIZJ = C932140aMe.LIZJ(id);
            List listLIZLLL = C932140aMe.LIZLLL(id);
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
            Gson gson = C19748512Ol.LIZJ;
            String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
            String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
            int size = listLIZJ.size();
            int followStatus = (int) linkPlayerInfo.mUser.getFollowInfo().getFollowStatus();
            InviteResponse inviteResponse = c918230a0D.LJI;
            String strLJIILIIL = null;
            if (inviteResponse != null) {
                list = inviteResponse.inviteResultList;
            } else {
                list = null;
            }
            boolean zLIZJ = C918220a0C.LIZJ(id, list, false);
            MultiGuestDataHolder multiGuestDataHolderLJI = c918650a0t.LJI();
            if (multiGuestDataHolderLJI != null) {
                strLJIILIIL = multiGuestDataHolderLJI.LJIILIIL();
            }
            boolean zLIZ = C918400a0U.LIZ(str2);
            if (linkPlayerInfo.LIZIZ == 6) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            if (Intrinsics.LJFF(str2, "multi_guest_invite") && linkPlayerInfo.LJ) {
                z = true;
            } else {
                z = false;
            }
            C925600aC6.LJIIJ(id, enumC918970a1PLJII, "normal_invite", json, json2, size, followStatus, zLIZJ, i, strLJIILIIL, false, zLIZ, str, z, C918220a0C.LIZIZ(id, c918230a0D), linkPlayerInfo.trackMap, false);
        } else {
            c918650a0t.LJFF(null, c918230a0D, linkPlayerInfo, C918240a0E.LIZIZ(c918230a0D), C918240a0E.LIZJ(c918230a0D));
        }
        Function1 function1 = (Function1) awS9S1301000_15.l3;
        if (function1 != null) {
            function1.invoke(c918230a0D);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S1301000_15(C918650a0t c918650a0t, C918650a0t c918650a0t2, LinkPlayerInfo linkPlayerInfo, String str, int i, Function1<? super C918230a0D, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = c918650a0t;
        this.l2 = c918650a0t2;
        this.s0 = linkPlayerInfo;
        this.i4 = str;
        this.l3 = i;
    }
}
