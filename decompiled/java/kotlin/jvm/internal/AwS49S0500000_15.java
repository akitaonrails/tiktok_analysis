package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0KVU;
import X.C13DA;
import X.C19748512Ol;
import X.C307001Gy;
import X.C497740JfY;
import X.C766270U4b;
import X.C917860Zzc;
import X.C918220a0C;
import X.C918230a0D;
import X.C918240a0E;
import X.C918350a0P;
import X.C918410a0V;
import X.C918650a0t;
import X.C921640a5i;
import X.C924630aAX;
import X.C925600aC6;
import X.C927600aFK;
import X.C932140aMe;
import X.EnumC918970a1P;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.controller.InviteResultInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS49S0500000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS49S0500000_15 awS49S0500000_15, Object obj) {
        Function2<Long, Throwable, Unit> function2;
        List<InviteResultInfo> list;
        C918230a0D c918230a0D = (C918230a0D) obj;
        C918650a0t c918650a0t = (C918650a0t) awS49S0500000_15.l0;
        C918350a0P c918350a0P = (C918350a0P) awS49S0500000_15.l1;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) awS49S0500000_15.l2;
        C918410a0V c918410a0V = (C918410a0V) awS49S0500000_15.l3;
        int i = c918410a0V.LIZIZ;
        c918650a0t.getClass();
        long id = linkPlayerInfo.mUser.getId();
        Long lValueOf = null;
        String strLJIILIIL = null;
        if (C918240a0E.LIZLLL(c918230a0D)) {
            Function1<Boolean, Unit> function1 = c918410a0V.LJIIJJI;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            C921640a5i.LLILZLL.put(Long.valueOf(id), C0KVU.LIZ(linkPlayerInfo.mUser));
            if (c918410a0V.LJ == 4 && C917860Zzc.LIZIZ()) {
                Function1<Long, Unit> function12 = c918410a0V.LJIIL;
                if (function12 != null) {
                    function12.invoke(Long.valueOf(id));
                }
            } else {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842764));
            }
            C924630aAX.LJJIII(id);
            if (c918410a0V.LJ != 4 || !C917860Zzc.LIZIZ()) {
                List listLIZJ = C932140aMe.LIZJ(id);
                List listLIZLLL = C932140aMe.LIZLLL(id);
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                String str = c918410a0V.LJIIIIZZ;
                Gson gson = C19748512Ol.LIZJ;
                String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
                int size = listLIZJ.size();
                int followStatus = (int) linkPlayerInfo.mUser.getFollowInfo().getFollowStatus();
                InviteResponse inviteResponse = c918230a0D.LJI;
                if (inviteResponse != null) {
                    list = inviteResponse.inviteResultList;
                } else {
                    list = null;
                }
                boolean zLIZJ = C918220a0C.LIZJ(id, list, true);
                MultiGuestDataHolder multiGuestDataHolderLJI = c918650a0t.LJI();
                if (multiGuestDataHolderLJI != null) {
                    strLJIILIIL = multiGuestDataHolderLJI.LJIILIIL();
                }
                C13DA c13da = new C13DA();
                Map<String, String> map = c918410a0V.LJIIIZ;
                if (map != null) {
                    c13da.putAll(map);
                }
                c13da.putAll(C918220a0C.LIZIZ(id, c918230a0D));
                C925600aC6.LJIIJ(id, enumC918970a1PLJII, str, json, json2, size, followStatus, zLIZJ, i, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, c13da.build(), c918410a0V.LJIIJ, false);
            }
        } else {
            Function1<Boolean, Unit> function13 = c918410a0V.LJIIJJI;
            if (function13 != null) {
                function13.invoke(Boolean.FALSE);
            }
            Number numberLIZIZ = c918230a0D.LIZLLL;
            if (numberLIZIZ == null) {
                numberLIZIZ = C918240a0E.LIZIZ(c918230a0D);
            }
            String strLIZJ = C918240a0E.LIZJ(c918230a0D);
            if (numberLIZIZ != null) {
                lValueOf = Long.valueOf(numberLIZIZ.longValue());
            }
            c918650a0t.LJFF(c918350a0P, c918230a0D, linkPlayerInfo, lValueOf, strLIZJ);
            C921640a5i.LJII(id, false);
            if (c918410a0V.LJ == 4 && C917860Zzc.LIZIZ() && (function2 = c918410a0V.LJIILIIL) != null) {
                function2.invoke(Long.valueOf(id), c918230a0D.LJFF);
            }
            C924630aAX.LJJIFFI(id, c918230a0D.LJFF);
        }
        Function1 function14 = (Function1) awS49S0500000_15.l4;
        if (function14 != null) {
            function14.invoke(c918230a0D);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S0500000_15 awS49S0500000_15, Object obj) {
        List<InviteResultInfo> list;
        Player player;
        C918230a0D c918230a0D = (C918230a0D) obj;
        if (c918230a0D.LIZJ) {
            Function0 function0 = (Function0) awS49S0500000_15.l0;
            if (function0 != null) {
                function0.invoke();
            }
            InviteResponse inviteResponse = c918230a0D.LJI;
            if (inviteResponse != null && (list = inviteResponse.inviteResultList) != null) {
                List list2 = (List) awS49S0500000_15.l2;
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) awS49S0500000_15.l3;
                Function2 function2 = (Function2) awS49S0500000_15.l4;
                for (InviteResultInfo inviteResultInfo : list) {
                    if (C918240a0E.LJ(inviteResultInfo)) {
                        if (inviteResultInfo.actionType == 1 && (player = inviteResultInfo.player) != null) {
                            multiLiveAsAnchorListDialogV2.LJLLJ().LIZ(player.uid);
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
                                Player player2 = inviteResultInfo.player;
                                if (player2 != null && linkPlayerInfo.mUser.getId() == player2.uid) {
                                    if (next != null && function2 != null) {
                                        function2.invoke(next, c918230a0D);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ((Function1) awS49S0500000_15.l1).invoke(Boolean.valueOf(c918230a0D.LIZJ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS49S0500000_15(C918650a0t c918650a0t, C918650a0t c918650a0t2, C918350a0P c918350a0P, LinkPlayerInfo linkPlayerInfo, C918410a0V c918410a0V, Function1<? super C918230a0D, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c918650a0t;
        this.l1 = c918650a0t2;
        this.l2 = c918350a0P;
        this.l3 = linkPlayerInfo;
        this.l4 = c918410a0V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0500000_15(AwS416S0200000_15 awS416S0200000_15, Function1 function1, List list, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, AwS629S0100000_15 awS629S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS416S0200000_15;
        this.l1 = function1;
        this.l2 = list;
        this.l3 = multiLiveAsAnchorListDialogV2;
        this.l4 = awS629S0100000_15;
    }
}
