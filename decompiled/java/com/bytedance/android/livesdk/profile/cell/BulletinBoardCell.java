package com.bytedance.android.livesdk.profile.cell;

import X.AbstractC495800JcQ;
import X.C01GW;
import X.C0IJT;
import X.C13BV;
import X.C16F5;
import X.C1850730yGF;
import X.C2097908Jt;
import X.C452501pT;
import X.C474500IjA;
import X.C495870JcX;
import X.C495920Jcc;
import X.C495980Jci;
import X.C497740JfY;
import X.C500260Jjc;
import X.EnumC495780JcO;
import X.EnumC495860JcW;
import X.EnumC496240Jd8;
import X.InterfaceC1364105Vn;
import X.InterfaceC495890JcZ;
import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.BulletinData;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class BulletinBoardCell extends AbstractC495800JcQ<BulletinData> implements GenericLifecycleObserver {
    public final EnumC495780JcO LLILZIL;
    public ViewGroup LLILZLL;
    public C16F5 LLIZ;
    public TuxSheet LLIZLLLIL;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJ;
    public final C01GW LLJI;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.gy6;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZLL = view != null ? (ViewGroup) view.findViewById(R.id.bua) : null;
        View view2 = this.LLILLL;
        this.LLIZ = view2 != null ? (C16F5) view2.findViewById(R.id.bub) : null;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        View view = this.LLILLL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        TuxSheet tuxSheet = this.LLIZLLLIL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJ;
    }

    public BulletinBoardCell(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLILZIL = EnumC495780JcO.BULLETIN_BOARD;
        this.LLJ = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(c495920Jcc, 81));
    }

    @Override // X.AbstractC495790JcP
    public final Map LJIIJJI(Object obj) {
        String str;
        BulletinData bulletinData = (BulletinData) obj;
        if (bulletinData != null && (str = bulletinData.bbId) != null) {
            return C2097908Jt.LIZJ(new Pair("bulletin_board_id", str));
        }
        return null;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        return responseData.bulletinData;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        BulletinData bulletinData = (BulletinData) obj;
        if (bulletinData == null || C500260Jjc.LJJIJIIJIL(Boolean.valueOf(bulletinData.bbPermission)) || bulletinData.bbId.length() == 0 || LJIIIIZZ(user)) {
            return false;
        }
        if (bulletinData.membersCount <= 0) {
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
        } else {
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
            C16F5 c16f53 = this.LLIZ;
            if (c16f53 != null) {
                long j = bulletinData.membersCount;
                c16f53.setText(C497740JfY.LJIIL(2131755604, (int) j, C1850730yGF.LIZJ(j)));
            }
        }
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
            ACListenerS74S0300000_7 aCListenerS74S0300000_7 = new ACListenerS74S0300000_7(this, user, bulletinData, 11);
            C495980Jci c495980Jci = this.LL;
            EnumC495860JcW enumC495860JcW = EnumC495860JcW.BUSINESS;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("bulletin_board_id", bulletinData.bbId));
            c495870JcX.getClass();
            C495870JcX.LIZIZ(viewGroup, aCListenerS74S0300000_7, false, c495980Jci, enumC495860JcW, "bulletin_board", mapLIZJ);
        }
        View view = this.LLILLL;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        LJIIZILJ(bulletinData, "show");
        this.LL.LIZIZ.getLifecycle().addObserver(this);
        return true;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super BulletinData> interfaceC1364105Vn) {
        return responseData.bulletinData;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super BulletinData> interfaceC1364105Vn) {
        return responseData.bulletinData;
    }

    public final void LJIIZILJ(BulletinData bulletinData, String str) {
        int i;
        if (this.LL.LJFF.getOwnerUserId() == this.LL.LJI.getId()) {
            i = 1;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("bulletin_board_cell");
        c474500IjALIZJ.LJJII("live_room_avatar_page", "enter_from");
        c474500IjALIZJ.LJJII(str, "action_type");
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZJ.LJJII("enter_cell", "click_type");
        }
        c474500IjALIZJ.LJJII(bulletinData.bbId, "channel_id");
        c474500IjALIZJ.LJJII("open", "channel_status");
        c474500IjALIZJ.LJJII(Integer.valueOf(i), "is_author");
        if (i == 0) {
            c474500IjALIZJ.LJJII(-1, "is_subscribed");
        }
        c474500IjALIZJ.LIZ();
    }
}
