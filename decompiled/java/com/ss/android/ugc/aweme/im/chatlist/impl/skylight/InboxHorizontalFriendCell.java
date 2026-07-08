package com.ss.android.ugc.aweme.im.chatlist.impl.skylight;

import X.C04TK;
import X.C0S1B;
import X.C0ZE7;
import X.C0ZJ7;
import X.C0ZK1;
import X.C0ZKF;
import X.C1076010e6h;
import X.C1153350g7R;
import X.C1243240iSQ;
import X.C1247000iYU;
import X.C1253000iiA;
import X.C1336205Ku;
import X.C1387040mCM;
import X.C1595350rcL;
import X.C1598860ri0;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1608750rxx;
import X.C20619615mM;
import X.C295190Bhd;
import X.C343230Dcv;
import X.C614770O9j;
import X.C786410Ut5;
import X.C844470XAv;
import X.C897490ZIt;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1910440zoY;
import X.EnumC896490ZEx;
import X.InterfaceC1595080rbu;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS126S1000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InboxHorizontalFriendCell extends PowerCell<C1598860ri0> {
    public AvatarComponentView LL;
    public TextView LLILLJJLI;
    public IDMAvatarLoader LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cop;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        IMUser iMUser;
        super.onViewAttachedToWindow();
        C1598860ri0 item = getItem();
        if (item == null || !item.LLILLJJLI) {
            return;
        }
        C1598860ri0 item2 = getItem();
        C1595350rcL.LIZJ(this, "activity_status", (item2 == null || (iMUser = item2.LL) == null) ? null : iMUser.getUid(), 2, null, null, 114);
    }

    public final void I5() {
        String uid;
        IMUser iMUser;
        String uid2;
        IMUser iMUser2;
        C1598860ri0 item = getItem();
        if (item == null) {
            return;
        }
        EnterChatParams enterChatParams = new EnterChatParams(this.itemView.getContext(), item.LL);
        EnumC1910440zoY enumC1910440zoY = EnumC1910440zoY.INBOX_TOP;
        enterChatParams.setEnterMethodForMob(enumC1910440zoY.getValue());
        enterChatParams.setEnterFromForMob("notification_page");
        C20619615mM.LIZ.getClass();
        enterChatParams.setMobEnterMethodForEditShare(C20619615mM.LIZ());
        enterChatParams.setActivityStatus(item.LLILLJJLI ? EnumC896490ZEx.ACTIVE_NOW : EnumC896490ZEx.NO_STATUS);
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
        int iLIZ = C1595350rcL.LIZ(this);
        C1595350rcL.LIZIZ(this, "activity_status", item.LL.getUid(), 2, iLIZ, null, null, 98);
        InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
        int i = iLIZ - 1;
        C1598860ri0 item2 = getItem();
        String str = "";
        if (item2 == null || (iMUser2 = item2.LL) == null || (uid = iMUser2.getUid()) == null) {
            uid = "";
        }
        interfaceC1595080rbuLIZJ.LJI(i, "notification_page", null, "friends", null, uid, null);
        C0ZE7 c0ze7 = new C0ZE7(getCurrentLifeCycleOwner());
        C1598860ri0 item3 = getItem();
        if (item3 != null && (iMUser = item3.LL) != null && (uid2 = iMUser.getUid()) != null) {
            str = uid2;
        }
        c0ze7.LIZJ = str;
        c0ze7.LJII = Boolean.TRUE;
        c0ze7.LIZLLL = "notification_page";
        c0ze7.LJFF = "chat_room";
        c0ze7.LIZIZ(enumC1910440zoY);
        c0ze7.LJI = Integer.valueOf(C1595350rcL.LIZ(this) - 1);
        C897490ZIt.LIZIZ(c0ze7);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        IDMAvatarLoader iDMAvatarLoader = this.LLILLL;
        if (iDMAvatarLoader != null) {
            iDMAvatarLoader.LIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1595350rcL.LIZLLL(this);
        this.LL = (AvatarComponentView) this.itemView.findViewById(R.id.biz);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.p0w);
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        View view = this.itemView;
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        TextView textView = this.LLILLJJLI;
        if (textView == null) {
            textView = null;
        }
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, avatarComponentView, (View) null, textView, (TuxIconView) null, 48), C295190Bhd.LIZIZ());
        AvatarComponentView avatarComponentView2 = this.LL;
        AvatarComponentView avatarComponentView3 = avatarComponentView2 != null ? avatarComponentView2 : null;
        C1608750rxx config = avatarComponentView3.getConfig();
        new AwS600S0100000_21(this, 129).invoke(config.LIZ);
        config.LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.INBOX_TOP_LIST, null, true, true, null, 158)));
        avatarComponentView3.LJFF(avatarComponentView3.getConfig());
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, new AObserverS224S0100000_21(this, 68));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String nickName;
        IMUser iMUser;
        C1598860ri0 c1598860ri0 = (C1598860ri0) interfaceC1891350zJl;
        AvatarComponentView avatarComponentView = this.LL;
        TextView textView = null;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        String uid2 = c1598860ri0.LL.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        C0S1B.LIZ(avatarComponentView, uid2, new C1153350g7R(0), this, false, null, 56);
        AvatarComponentView avatarComponentView2 = this.LL;
        if (avatarComponentView2 == null) {
            avatarComponentView2 = null;
        }
        avatarComponentView2.setClickable(false);
        if (this.LLILLL == null) {
            IMAvatarLoaderApi.LIZ.getClass();
            IMAvatarLoaderApi iMAvatarLoaderApi = C04TK.LIZIZ;
            AvatarComponentView avatarComponentView3 = this.LL;
            if (avatarComponentView3 == null) {
                avatarComponentView3 = null;
            }
            this.LLILLL = iMAvatarLoaderApi.LIZJ(avatarComponentView3.getAvatar(), "skylight");
        }
        IDMAvatarLoader iDMAvatarLoader = this.LLILLL;
        if (iDMAvatarLoader == null) {
            iDMAvatarLoader = null;
        }
        iDMAvatarLoader.LIZIZ(c1598860ri0.LL.getUid(), c1598860ri0.LL.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
        c0ze7.LIZIZ(EnumC1910440zoY.INBOX_TOP);
        C1598860ri0 item = getItem();
        if (item != null && (iMUser = item.LL) != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        c0ze7.LIZJ = uid;
        Boolean bool = Boolean.TRUE;
        c0ze7.LJII = bool;
        c0ze7.LJI = Integer.valueOf(getBindingAdapterPosition());
        C897490ZIt.LIZLLL(c0ze7);
        C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
        IMUser iMUser2 = c1598860ri0.LL;
        c1243240iSQ.getClass();
        if (C343230Dcv.LIZ()) {
            nickName = C1247000iYU.LIZ(iMUser2);
            if (nickName == null && (nickName = iMUser2.getNickName()) == null) {
                C844470XAv.LIZ.getClass();
                nickName = C844470XAv.LIZ().getString(2131831188);
            }
        } else {
            nickName = iMUser2.getNickName();
            if (nickName == null) {
                C844470XAv.LIZ.getClass();
                nickName = C844470XAv.LIZ().getString(2131831188);
            }
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            textView = textView2;
        }
        textView.setText(nickName);
        C1387040mCM.LIZ(this.itemView, new AwS126S1000000_21(nickName, 0));
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 211), this.itemView);
        C0ZJ7.LIZIZ(this.itemView, c1598860ri0.LL.getUid(), bool);
    }
}
