package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0I0B;
import X.C1228470i4b;
import X.C1228780i56;
import X.C1228810i59;
import X.C1229380i64;
import X.C1229500i6G;
import X.C1229760i6g;
import X.C1229780i6i;
import X.C1230080i7C;
import X.C1230090i7D;
import X.C1230440i7m;
import X.C1231150i8v;
import X.C1391190mJ3;
import X.C1529305yl;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C343970De7;
import X.C459080HzO;
import X.C830490Whz;
import X.C913630Zsn;
import X.EnumC1229960i70;
import X.EnumC1230500i7s;
import X.EnumC1231170i8x;
import X.InterfaceC1229620i6S;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupJoinPanelFragment;
import com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.view.GroupAssemCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public class AbS190S0400000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS190S0400000_19 abS190S0400000_19, View view) {
        C1228810i59 c1228810i59;
        Object next;
        EnumC1230500i7s enumC1230500i7s;
        C1228470i4b c1228470i4b;
        Object obj;
        if (view != null) {
            if (((GroupAssemCell) abS190S0400000_19.l0).up().zQ2()) {
                if (!((GroupAssemCell) abS190S0400000_19.l0).up().getState().LLILZIL) {
                    C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                    Context context = ((ConstraintLayout) abS190S0400000_19.l1).getContext();
                    C1229500i6G c1229500i6G = (C1229500i6G) abS190S0400000_19.l2;
                    String strValueOf = String.valueOf(((C1229760i6g) abS190S0400000_19.l3).LL);
                    c1230440i7m.getClass();
                    C1230440i7m.LJ(context, c1229500i6G, strValueOf);
                } else {
                    return;
                }
            } else {
                final GroupAssemCell groupAssemCell = (GroupAssemCell) abS190S0400000_19.l0;
                final C1229760i6g c1229760i6g = (C1229760i6g) abS190S0400000_19.l3;
                C1229500i6G c1229500i6G2 = (C1229500i6G) abS190S0400000_19.l2;
                C1228780i56 c1228780i56Op = groupAssemCell.op();
                C1230090i7D c1230090i7DLIZJ = null;
                if (c1228780i56Op != null && (c1228470i4b = c1228780i56Op.LL) != null) {
                    c1228810i59 = c1228470i4b.LIZIZ;
                } else {
                    c1228810i59 = null;
                }
                if (c1229760i6g.LLILZIL == EnumC1229960i70.FULL) {
                    C1229780i6i.LIZ(groupAssemCell.tp(), groupAssemCell.LJJIJL().getContext().getString(2131830197));
                } else {
                    List<InterfaceC1891350zJl> list = groupAssemCell.up().getState().LL.LIZ;
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                        if (interfaceC1891350zJl instanceof C1229760i6g) {
                            arrayList.add(interfaceC1891350zJl);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((C1229760i6g) next).LL == c1229760i6g.LL) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1229760i6g c1229760i6g2 = (C1229760i6g) next;
                    if (c1229760i6g2 != null) {
                        C1229380i64 c1229380i64LJJIJLIJ = C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, "im", "public_group_list");
                        Context context2 = groupAssemCell.LJJIJL().getContext();
                        GroupPreviewDisplayMeta groupPreviewDisplayMeta = c1229760i6g2.LLJILJIL;
                        if (groupPreviewDisplayMeta != null) {
                            c1230090i7DLIZJ = C1229780i6i.LIZJ(groupPreviewDisplayMeta);
                        }
                        if (c1228810i59 == null || (enumC1230500i7s = c1228810i59.LJII) == null) {
                            enumC1230500i7s = EnumC1230500i7s.UNKNOWN;
                        }
                        c1229380i64LJJIJLIJ.LIZIZ(context2, new C1230080i7C(enumC1230500i7s, c1229760i6g.LLILZIL, c1229500i6G2, String.valueOf(c1229760i6g2.LL), null, false, groupAssemCell.LJJIJL(), true, new InterfaceC1229620i6S() { // from class: X.0i6M
                            @Override // X.InterfaceC1229620i6S
                            public final void LIZ(C0YMW c0ymw) {
                            }

                            @Override // X.InterfaceC1229620i6S
                            public final void LIZIZ(String str) {
                            }

                            @Override // X.InterfaceC1229620i6S
                            public final void LIZJ(EnumC1229960i70 enumC1229960i70, PopupDisplayMeta popupDisplayMeta) {
                                groupAssemCell.up().EQ2(String.valueOf(c1229760i6g.LL), enumC1229960i70.getValue(), popupDisplayMeta);
                            }
                        }, 16), c1230090i7DLIZJ);
                    }
                }
            }
            Pair[] pairArr = new Pair[3];
            Map map = (Map) ((LinkedHashMap) ((GroupAssemCell) abS190S0400000_19.l0).up().LLILLJJLI).get(Long.valueOf(((C1229760i6g) abS190S0400000_19.l3).LL));
            if (map == null || (obj = map.get("group_type")) == null) {
                obj = "";
            }
            pairArr[0] = new Pair("group_type", obj);
            pairArr[1] = new Pair("is_master", C1529305yl.LIZ(Boolean.valueOf(((GroupAssemCell) abS190S0400000_19.l0).up().zQ2())));
            pairArr[2] = new Pair("group_status", String.valueOf(((C1229760i6g) abS190S0400000_19.l3).LLILZIL.getValue()));
            C459080HzO.LJFF("group_list_page_click", pairArr);
        }
    }

    public static final void LIZ$1(AbS190S0400000_19 abS190S0400000_19, View view) {
        String string;
        Map<String, String> mapLJ;
        Long l;
        if (view != null && ((C197039127h) abS190S0400000_19.l0).getContext() != null) {
            ((FanGroupJoinPanelFragment) abS190S0400000_19.l1).SR(true);
            FanGroupJoinPanelFragment fanGroupJoinPanelFragment = (FanGroupJoinPanelFragment) abS190S0400000_19.l1;
            GroupJoinResponse groupJoinResponse = fanGroupJoinPanelFragment.LLJIJIL;
            if (groupJoinResponse != null) {
                Integer num = groupJoinResponse.actionType;
                int action = EnumC1231170i8x.ACTION_FOLLOW_AND_JOIN.getAction();
                if (num != null && num.intValue() == action) {
                    C830490Whz c830490Whz = new C830490Whz();
                    GroupJoinResponse groupJoinResponse2 = fanGroupJoinPanelFragment.LLJIJIL;
                    if (groupJoinResponse2 == null || (l = groupJoinResponse2.creatorId) == null || (string = l.toString()) == null) {
                        string = "";
                    }
                    c830490Whz.put("anchor_id", string);
                    C1231150i8v c1231150i8v = fanGroupJoinPanelFragment.LLJI;
                    if (c1231150i8v == null || (mapLJ = c1231150i8v.getFollowLogParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c830490Whz.putAll(mapLJ);
                    c830490Whz.put("click_user_position", "profile_card_group");
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("livesdk_follow", c830490Whz);
                }
            }
            Object obj = null;
            List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF((FanGroupJoinPanelFragment) abS190S0400000_19.l1, null), IJoinFanGroupPanelActionProtocol.class, false);
            if (listLIZIZ != null) {
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    int action2 = ((IJoinFanGroupPanelActionProtocol) next).getAction();
                    Integer num2 = ((GroupJoinResponse) abS190S0400000_19.l2).actionType;
                    if (num2 != null && action2 == num2.intValue()) {
                        obj = next;
                        break;
                    }
                }
                IJoinFanGroupPanelActionProtocol iJoinFanGroupPanelActionProtocol = (IJoinFanGroupPanelActionProtocol) obj;
                if (iJoinFanGroupPanelActionProtocol != null) {
                    iJoinFanGroupPanelActionProtocol.CR1(((C197039127h) abS190S0400000_19.l0).getContext(), (C1231150i8v) abS190S0400000_19.l3, (GroupJoinResponse) abS190S0400000_19.l2);
                }
            }
            FanGroupJoinPanelFragment fanGroupJoinPanelFragment2 = (FanGroupJoinPanelFragment) abS190S0400000_19.l1;
            fanGroupJoinPanelFragment2.LLIZ = "click_action_btn";
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fanGroupJoinPanelFragment2, C343970De7.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS190S0400000_19(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
