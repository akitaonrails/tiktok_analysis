package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C06VL;
import X.C0I0B;
import X.C0Z9N;
import X.C1247530iZL;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1461005nk;
import X.C1527905yX;
import X.C1668706g9;
import X.C19EG;
import X.C866950Xzh;
import X.C894180Z6a;
import X.C909290Zln;
import X.EnumC877490Ybb;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.notify.GroupNotifyCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.notify.GroupNotifyViewModel;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public class AbS504S0200000_14 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS504S0200000_14 abS504S0200000_14, View view) {
        C19EG c19egLIZIZ;
        int i;
        if (view != null) {
            GroupDetailMemberCell groupDetailMemberCell = (GroupDetailMemberCell) abS504S0200000_14.l0;
            IMUser iMUser = (IMUser) abS504S0200000_14.l1;
            Context context = groupDetailMemberCell.getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                ArrayList arrayList = new ArrayList();
                Object value = groupDetailMemberCell.R5().LLILZIL.getValue();
                int i2 = groupDetailMemberCell.R5().getState().LLJ;
                C1461005nk c1461005nk = C1461005nk.LIZ;
                int iLIZ = C1527905yX.LIZ(Integer.valueOf(c1461005nk.LJFF(Long.valueOf(C866950Xzh.LIZLLL(iMUser.getUid())), groupDetailMemberCell.R5().wQ2())));
                value.getClass();
                C0Z9N c0z9n = C0Z9N.OWNER;
                if (i2 == c0z9n.getValue() || (i2 == C0Z9N.ADMIN.getValue() && iLIZ == C0Z9N.ORDINARY.getValue())) {
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZJ(R.raw.icon_person_x_mark);
                    c1247530iZL.LJ = new ACListenerS117S0200000_14(groupDetailMemberCell, iMUser, 26);
                    c1247530iZL.LIZIZ(2131835227);
                    arrayList.add(c1247530iZL);
                }
                Object value2 = groupDetailMemberCell.R5().LLILZIL.getValue();
                int i3 = groupDetailMemberCell.R5().getState().LLJ;
                int iLIZ2 = C1527905yX.LIZ(Integer.valueOf(c1461005nk.LJFF(Long.valueOf(C866950Xzh.LIZLLL(iMUser.getUid())), groupDetailMemberCell.R5().wQ2())));
                value2.getClass();
                if (iLIZ2 != C0Z9N.ADMIN.getValue() && i3 == c0z9n.getValue()) {
                    C1247530iZL c1247530iZL2 = new C1247530iZL();
                    c1247530iZL2.LIZJ(R.raw.icon_person_gear);
                    c1247530iZL2.LIZIZ(2131830194);
                    c1247530iZL2.LJ = new ACListenerS117S0200000_14(groupDetailMemberCell, iMUser, 27);
                    arrayList.add(c1247530iZL2);
                }
                C1247530iZL c1247530iZL3 = new C1247530iZL();
                c1247530iZL3.LIZJ(R.raw.icon_block);
                if (iMUser.isBlock()) {
                    i = 2131835251;
                } else {
                    i = 2131835247;
                }
                c1247530iZL3.LIZIZ(i);
                c1247530iZL3.LIZJ = !iMUser.isBlock() ? 1 : 0;
                c1247530iZL3.LJ = new ACListenerS117S0200000_14(groupDetailMemberCell, iMUser, 28);
                arrayList.add(c1247530iZL3);
                C1247530iZL c1247530iZL4 = new C1247530iZL();
                c1247530iZL4.LIZJ(R.raw.icon_flag);
                c1247530iZL4.LIZIZ(R.string.s65);
                c1247530iZL4.LIZJ = 1;
                c1247530iZL4.LJ = new ACListenerS117S0200000_14(groupDetailMemberCell, iMUser, 29);
                arrayList.add(c1247530iZL4);
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LIZLLL(R.string.f1_);
                String displayName = iMUser.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                c1390850mIV.LIZ.LLJJIJI = displayName;
                c1390850mIV.LJFF(arrayList);
                c1390850mIV.LIZJ().show(c19egLIZIZ.getSupportFragmentManager(), "operate_member_dialog");
            }
            IMGroupChatDetailAnalytics.LIZ.LJFF("click_member_setting", new Pair[]{new Pair("enter_from", ((GroupDetailMemberCell) abS504S0200000_14.l0).getEnterFrom())}, C0I0B.LJFF.LIZIZ());
        }
    }

    public static final void LIZ$1(AbS504S0200000_14 abS504S0200000_14, View view) {
        if (view != null) {
            C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
            c1668706g9.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService != null) {
                iIMBusinessChatService.LJIL((IMUser) abS504S0200000_14.l0);
            }
            C1668706g9.LIZ(c1668706g9).LJIILJJIL().LJIIIIZZ((C909290Zln) ((ProfileReusedUISlot) abS504S0200000_14.l1).LLJLIL.getValue());
        }
    }

    public static final void LIZ$2(AbS504S0200000_14 abS504S0200000_14, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GroupNotifyCell) abS504S0200000_14.l0).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupNotifyCell.LLILZIL;
            GroupNotifyViewModel groupNotifyViewModel = (GroupNotifyViewModel) assemVMLazy.getValue();
            EnumC877490Ybb enumC877490Ybb = ((C894180Z6a) abS504S0200000_14.l1).LLILZ;
            groupNotifyViewModel.setState(new AwS380S0200000_14(groupNotifyViewModel, enumC877490Ybb, 111));
            ((C06VL) groupNotifyViewModel.LL.getValue()).LLILLJJLI.invoke(enumC877490Ybb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS504S0200000_14(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
