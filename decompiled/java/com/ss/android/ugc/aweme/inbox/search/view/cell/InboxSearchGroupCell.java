package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C0DTR;
import X.C0Y8T;
import X.C0Y8Y;
import X.C1241310iPJ;
import X.C1241390iPR;
import X.C1241460iPY;
import X.C12ES;
import X.C2097608Jq;
import X.C340780DXo;
import X.C427660Gpo;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1241340iPM;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906710ziX;
import X.InterfaceC336510DHd;
import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchGroupCell extends PowerCell<C1241310iPJ> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C1241390iPR LLILZ;

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
        C1241390iPR c1241390iPR;
        super.onViewAttachedToWindow();
        C1241460iPY.LIZ.getClass();
        C1241460iPY.LIZ(false);
        C1241310iPJ item = getItem();
        if (item == null || (c1241390iPR = this.LLILZ) == null) {
            return;
        }
        String conversationId = item.LL.getConversationId();
        EnumC1241340iPM enumC1241340iPM = item.LLILLL;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("position", enumC1241340iPM == EnumC1241340iPM.RECENT ? "recent" : "suggested");
        pairArr[1] = new Pair("cell_type", "user_cell");
        pairArr[2] = new Pair("conversation_id", item.LL.getConversationId());
        pairArr[3] = new Pair("chat_type", "group");
        String str = item.LLILZ.get("rank_num");
        if (str == null) {
            str = "-1";
        }
        pairArr[4] = new Pair("rank_num", str);
        String str2 = item.LLILZ.get("item_num");
        pairArr[5] = new Pair("item_num", str2 != null ? str2 : "-1");
        c1241390iPR.LIZLLL(conversationId, enumC1241340iPM, C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC336510DHd interfaceC336510DHdLJ;
        UrlModel urlModel;
        String name;
        String quantityString;
        Resources resources;
        String icon;
        C1241310iPJ c1241310iPJ = (C1241310iPJ) interfaceC1891350zJl;
        InterfaceC1906710ziX stub = getStub();
        if (stub != null) {
            interfaceC336510DHdLJ = stub.LJ(C1241390iPR.class);
        } else {
            interfaceC336510DHdLJ = null;
        }
        this.LLILZ = (C1241390iPR) interfaceC336510DHdLJ;
        C786410Ut5.I7(new ACListenerS122S0200000_19(c1241310iPJ, this, 26), this.itemView);
        C0Y8T c0y8t = c1241310iPJ.LL;
        C427660Gpo c427660Gpo = this.LL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (icon = coreInfo.getIcon()) != null && icon.length() != 0) {
            urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList(icon));
        } else {
            urlModel = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 990);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C0Y8Y coreInfo2 = c0y8t.getCoreInfo();
        if (coreInfo2 != null) {
            name = coreInfo2.getName();
        } else {
            name = null;
        }
        tuxTextView.setText(name);
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            quantityString = resources.getQuantityString(2131755394, c0y8t.getMemberCount(), Integer.valueOf(c0y8t.getMemberCount()));
        } else {
            quantityString = null;
        }
        tuxTextView2.setText(quantityString);
        if (c1241310iPJ.LLILLJJLI) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.kjm));
            C786410Ut5.a9((TuxIconView) this.itemView.findViewById(R.id.kjm), new ACListenerS122S0200000_19(c1241310iPJ, this, 27));
            C340780DXo.LIZIZ(this.itemView.findViewById(R.id.kjm));
            return;
        }
        C0DTR.LIZIZ(this.itemView.findViewById(R.id.kjm));
    }
}
