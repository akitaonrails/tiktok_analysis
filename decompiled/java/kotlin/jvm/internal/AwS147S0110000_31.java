package kotlin.jvm.internal;

import X.AbstractC20356314kz;
import X.C09AY;
import X.C15T5;
import X.C15TA;
import X.C1AZW;
import X.C20356714l3;
import X.C20359414lU;
import X.C20360614lg;
import X.C20361214lm;
import X.C20377014oK;
import X.C20379114of;
import X.C20425514w9;
import X.C20441214yg;
import X.C2188811AlT;
import X.C403501hZ;
import X.C500260Jjc;
import X.EnumC20429514wn;
import X.InterfaceC20357414lA;
import Y.ARunnableS0S7101000_11;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.assem.dm.ExploreDMGroupCell;
import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS147S0110000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS147S0110000_31 awS147S0110000_31) {
        if (awS147S0110000_31.z1) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("Editor_PlaybookEditorDialog", "rvPlaybookInfoList?.scrollToPosition(0)", null, null);
            RecyclerView recyclerView = ((PlaybookEditorDialog) awS147S0110000_31.l0).LLLI;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final Object invoke$1(AwS147S0110000_31 awS147S0110000_31) {
        ?? XC0;
        String str;
        String string;
        String str2;
        String string2;
        ExploreChatGroupStruct exploreChatGroupStruct;
        Integer num;
        ExploreChatGroupStruct exploreChatGroupStruct2;
        Long l;
        ExploreChatGroupStruct exploreChatGroupStruct3;
        ExploreChatGroupStruct exploreChatGroupStruct4;
        Long l2;
        ExploreChatGroupStruct exploreChatGroupStruct5;
        String str3;
        String string3;
        String str4;
        String string4;
        ExploreChatGroupStruct exploreChatGroupStruct6;
        Integer num2;
        ExploreChatGroupStruct exploreChatGroupStruct7;
        Long l3;
        ExploreChatGroupStruct exploreChatGroupStruct8;
        ExploreChatGroupStruct exploreChatGroupStruct9;
        Long l4;
        ExploreChatGroupStruct exploreChatGroupStruct10;
        if (((ExploreDMGroupCell) awS147S0110000_31.l0).getLayoutPosition() >= 0) {
            ExploreDMGroupCell exploreDMGroupCell = (ExploreDMGroupCell) awS147S0110000_31.l0;
            boolean z = awS147S0110000_31.z1;
            int layoutPosition = exploreDMGroupCell.getLayoutPosition();
            String strI5 = exploreDMGroupCell.I5();
            FirstScreenCheckingAbility firstScreenCheckingAbility = (FirstScreenCheckingAbility) exploreDMGroupCell.LLJILJILJ.getValue();
            if (firstScreenCheckingAbility != null) {
                firstScreenCheckingAbility.kp0(layoutPosition);
            }
            FirstScreenCheckingAbility firstScreenCheckingAbility2 = (FirstScreenCheckingAbility) exploreDMGroupCell.LLJILJILJ.getValue();
            if (firstScreenCheckingAbility2 != null) {
                XC0 = firstScreenCheckingAbility2.xC0(layoutPosition);
            } else {
                XC0 = 0;
            }
            String string5 = null;
            if (z) {
                C15TA c15ta = C15TA.LIZ;
                Integer numValueOf = Integer.valueOf(layoutPosition);
                C15T5 item = exploreDMGroupCell.getItem();
                if (item != null && (exploreChatGroupStruct10 = item.LL) != null) {
                    str3 = exploreChatGroupStruct10.requestId;
                } else {
                    str3 = null;
                }
                C15T5 item2 = exploreDMGroupCell.getItem();
                if (item2 != null && (exploreChatGroupStruct9 = item2.LL) != null && (l4 = exploreChatGroupStruct9.groupId) != null) {
                    string3 = l4.toString();
                } else {
                    string3 = null;
                }
                C15T5 item3 = exploreDMGroupCell.getItem();
                if (item3 != null && (exploreChatGroupStruct8 = item3.LL) != null) {
                    str4 = exploreChatGroupStruct8.groupName;
                } else {
                    str4 = null;
                }
                C15T5 item4 = exploreDMGroupCell.getItem();
                if (item4 != null && (exploreChatGroupStruct7 = item4.LL) != null && (l3 = exploreChatGroupStruct7.groupOwnerId) != null) {
                    string4 = l3.toString();
                } else {
                    string4 = null;
                }
                C15T5 item5 = exploreDMGroupCell.getItem();
                if (item5 != null && (exploreChatGroupStruct6 = item5.LL) != null && (num2 = exploreChatGroupStruct6.groupMemberCount) != null) {
                    string5 = num2.toString();
                }
                c15ta.getClass();
                C15TA.LJIILL(new ARunnableS0S7101000_11(strI5, XC0, str3, string3, str4, string4, numValueOf, string5, 1));
            } else {
                C15TA c15ta2 = C15TA.LIZ;
                Integer numValueOf2 = Integer.valueOf(layoutPosition);
                C15T5 item6 = exploreDMGroupCell.getItem();
                if (item6 != null && (exploreChatGroupStruct5 = item6.LL) != null) {
                    str = exploreChatGroupStruct5.requestId;
                } else {
                    str = null;
                }
                C15T5 item7 = exploreDMGroupCell.getItem();
                if (item7 != null && (exploreChatGroupStruct4 = item7.LL) != null && (l2 = exploreChatGroupStruct4.groupId) != null) {
                    string = l2.toString();
                } else {
                    string = null;
                }
                C15T5 item8 = exploreDMGroupCell.getItem();
                if (item8 != null && (exploreChatGroupStruct3 = item8.LL) != null) {
                    str2 = exploreChatGroupStruct3.groupName;
                } else {
                    str2 = null;
                }
                C15T5 item9 = exploreDMGroupCell.getItem();
                if (item9 != null && (exploreChatGroupStruct2 = item9.LL) != null && (l = exploreChatGroupStruct2.groupOwnerId) != null) {
                    string2 = l.toString();
                } else {
                    string2 = null;
                }
                C15T5 item10 = exploreDMGroupCell.getItem();
                if (item10 != null && (exploreChatGroupStruct = item10.LL) != null && (num = exploreChatGroupStruct.groupMemberCount) != null) {
                    string5 = num.toString();
                }
                c15ta2.getClass();
                C15TA.LJIILL(new ARunnableS0S7101000_11(strI5, XC0, str, string, str2, string2, numValueOf2, string5, 0));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS147S0110000_31 awS147S0110000_31) {
        List<C20359414lU> list;
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", "disMiss");
        C20425514w9 c20425514w9 = ((C20377014oK) awS147S0110000_31.l0).LIZJ;
        if (c20425514w9 != null) {
            c20425514w9.LIZJ();
        }
        C20425514w9 c20425514w92 = ((C20377014oK) awS147S0110000_31.l0).LIZJ;
        if (c20425514w92 != null) {
            c20425514w92.LIZIZ();
        }
        C20377014oK c20377014oK = (C20377014oK) awS147S0110000_31.l0;
        c20377014oK.LIZJ = null;
        C20379114of c20379114of = c20377014oK.LJFF;
        HashMap<Long, PlayRule> map = new HashMap<>();
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (it3.hasNext()) {
                    PlayRule playRule = it3.next().LIZLLL;
                    if (playRule != null && playRule.getConfig().LJ != 0) {
                        map.put(Long.valueOf(playRule.getConfig().LIZLLL), playRule);
                    }
                }
            }
        }
        c20377014oK.LJ = map;
        C20377014oK c20377014oK2 = (C20377014oK) awS147S0110000_31.l0;
        if (!c20377014oK2.LJIIIZ && !c20377014oK2.LJIIJ) {
            if (awS147S0110000_31.z1) {
                PlaybookUtilKt.LJIILL(c20377014oK2.LJFF);
            } else {
                PlaybookUtilKt.LJII(c20377014oK2.LJFF);
            }
            ((C20377014oK) awS147S0110000_31.l0).LJFF.LIZIZ = null;
        }
        C20377014oK c20377014oK3 = (C20377014oK) awS147S0110000_31.l0;
        c20377014oK3.getClass();
        C403501hZ.LIZ(new AwS575S0100000_31(c20377014oK3, 1467));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS147S0110000_31 awS147S0110000_31) {
        int i = C20356714l3.LIZ[((AbstractC20356314kz) awS147S0110000_31.l0).LJJJIL().LJII.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayEntity_");
            sbLIZ.append(((AbstractC20356314kz) awS147S0110000_31.l0).LJJJIL().LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("transitDecorationStateSucceed error, origin: ");
            sbLIZ2.append(((AbstractC20356314kz) awS147S0110000_31.l0).LJJJIL().LJII);
            C20441214yg.LJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            ((AbstractC20356314kz) awS147S0110000_31.l0).LJJJIL().LJII = EnumC20429514wn.SUCCESS;
            AbstractC20356314kz abstractC20356314kz = (AbstractC20356314kz) awS147S0110000_31.l0;
            boolean z = awS147S0110000_31.z1;
            abstractC20356314kz.getClass();
            C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(abstractC20356314kz, 1607));
            Iterator<InterfaceC20357414lA> it2 = abstractC20356314kz.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(z);
            }
            abstractC20356314kz.LLILZIL.clear();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0110000_31(AbstractC20356314kz abstractC20356314kz, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20356314kz;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0110000_31(C20377014oK c20377014oK, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20377014oK;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0110000_31(ExploreDMGroupCell exploreDMGroupCell, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = exploreDMGroupCell;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0110000_31(boolean z, PlaybookEditorDialog playbookEditorDialog, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = playbookEditorDialog;
    }
}
