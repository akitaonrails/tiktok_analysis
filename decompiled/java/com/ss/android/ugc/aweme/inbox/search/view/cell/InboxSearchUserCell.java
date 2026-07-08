package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C0DTR;
import X.C1241350iPN;
import X.C1241390iPR;
import X.C1241460iPY;
import X.C12ES;
import X.C1336205Ku;
import X.C1908030zkf;
import X.C2097608Jq;
import X.C340780DXo;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1241340iPM;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906710ziX;
import X.InterfaceC336510DHd;
import Y.ACListenerS85S0300000_19;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchUserCell extends PowerCell<C1241350iPN> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C1241390iPR LLILZ;
    public boolean LLILZIL = true;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a9v;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (C427660Gpo) this.itemView.findViewById(R.id.biz);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.y3j);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.ewz);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1241350iPN item;
        C1241390iPR c1241390iPR;
        super.onViewAttachedToWindow();
        if (this.LLILZIL && (item = getItem()) != null) {
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LIZ(false);
            String uid = item.LL.getUid();
            if (uid == null || (c1241390iPR = this.LLILZ) == null) {
                return;
            }
            EnumC1241340iPM enumC1241340iPM = item.LLILLL;
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("position", enumC1241340iPM == EnumC1241340iPM.RECENT ? "recent" : "suggested");
            pairArr[1] = new Pair("cell_type", "user_cell");
            pairArr[2] = new Pair("to_user_id", uid);
            pairArr[3] = new Pair("relation_tag", String.valueOf(item.LL.getFollowStatus()));
            String recType = item.LL.getRecType();
            if (recType == null) {
                recType = "";
            }
            pairArr[4] = new Pair("rec_type", recType);
            pairArr[5] = new Pair("chat_type", "private");
            pairArr[6] = new Pair("conversation_id", C1336205Ku.LIZ(false).getImUserService().LIZLLL(uid));
            String str = item.LLILZLL.get("rank_num");
            if (str == null) {
                str = "-1";
            }
            pairArr[7] = new Pair("rank_num", str);
            String str2 = item.LLILZLL.get("item_num");
            pairArr[8] = new Pair("item_num", str2 != null ? str2 : "-1");
            c1241390iPR.LIZLLL(uid, enumC1241340iPM, C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC336510DHd interfaceC336510DHdLJ;
        C1241350iPN c1241350iPN = (C1241350iPN) interfaceC1891350zJl;
        super.onBindItemView(c1241350iPN);
        InterfaceC1906710ziX stub = getStub();
        C427660Gpo c427660Gpo = null;
        if (stub != null) {
            interfaceC336510DHdLJ = stub.LJ(C1241390iPR.class);
        } else {
            interfaceC336510DHdLJ = null;
        }
        this.LLILZ = (C1241390iPR) interfaceC336510DHdLJ;
        IMUser iMUser = c1241350iPN.LL;
        C427660Gpo c427660Gpo2 = this.LL;
        if (c427660Gpo2 == null) {
            c427660Gpo2 = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo2, C438710HIf.LIZ(iMUser.getDisplayAvatar()), false, null, null, false, true, null, null, false, null, 990);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(iMUser.getNickName());
        Context context = this.itemView.getContext();
        String customVerify = iMUser.getCustomVerify();
        String enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView2);
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(iMUser.getUniqueId());
        C427660Gpo c427660Gpo3 = this.LL;
        if (c427660Gpo3 != null) {
            c427660Gpo = c427660Gpo3;
        }
        C786410Ut5.T8(c427660Gpo, new ACListenerS85S0300000_19(iMUser, c1241350iPN, this, 15));
        C786410Ut5.I7(new ACListenerS85S0300000_19(iMUser, c1241350iPN, this, 16), this.itemView);
        if (c1241350iPN.LLILLJJLI) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.kjm));
            C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.kjm), new ACListenerS85S0300000_19(iMUser, c1241350iPN, this, 17));
            C340780DXo.LIZIZ(this.itemView.findViewById(R.id.kjm));
            return;
        }
        C0DTR.LIZIZ(this.itemView.findViewById(R.id.kjm));
    }
}
