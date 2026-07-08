package com.bytedance.android.livesdk.profile.cell;

import X.AbstractC495580Jc4;
import X.C0IJT;
import X.C0K9Q;
import X.C1114740f7A;
import X.C1161920gLG;
import X.C16FS;
import X.C1954807lC;
import X.C20094213jo;
import X.C2188811AlT;
import X.C474500IjA;
import X.C489040JFu;
import X.C492290JSh;
import X.C495870JcX;
import X.C495920Jcc;
import X.C495980Jci;
import X.C497740JfY;
import X.C510380Jzw;
import X.C518420KUu;
import X.C520010KaN;
import X.C786410Ut5;
import X.EnumC495600Jc6;
import X.EnumC495780JcO;
import X.EnumC495860JcW;
import X.InterfaceC495660JcC;
import X.InterfaceC495890JcZ;
import Y.ACListenerS142S0100000_7;
import Y.AObserverS211S0100000_7;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import qo2.w;
import u4.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class NormalOperationCell extends AbstractC495580Jc4<Unit> implements GenericLifecycleObserver {
    public C16FS LLJI;
    public C16FS LLJIJIL;
    public InterfaceC495660JcC LLJILJIL;
    public C16FS LLJILJILJ;
    public C16FS LLJILLL;
    public C16FS LLJJ;
    public final DataChannel LLJJI;
    public final LiveProfilePreloadViewModel LLJJIII;
    public User LLJJIJI;
    public Room LLJJIJIIJIL;
    public EnumC495600Jc6 LLJJIJIL;
    public UserProfileEvent LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public final EnumC495780JcO LLJJJJJIL;
    public final boolean LLJJJJLIIL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public static int LJIIZILJ() {
        return LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.style.ak2 : R.style.ak1;
    }

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return this.LL.LJ ? R.layout.h34 : R.layout.h35;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        C16FS c16fs = view != null ? (C16FS) view.findViewById(R.id.watch_live) : null;
        this.LLJI = c16fs;
        if (c16fs != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131842889));
            sbLIZ.append(" LIVE");
            c16fs.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C16FS c16fs2 = this.LLJI;
        if (c16fs2 != null) {
            c16fs2.j0(LJIJ());
        }
        View view2 = this.LLILLL;
        C16FS c16fs3 = view2 != null ? (C16FS) view2.findViewById(R.id.b_2) : null;
        this.LLJIJIL = c16fs3;
        if (c16fs3 != null) {
            c16fs3.j0(LJIJ());
        }
        View view3 = this.LLILLL;
        C16FS c16fs4 = view3 != null ? (C16FS) view3.findViewById(R.id.pdg) : null;
        this.LLJILLL = c16fs4;
        if (c16fs4 != null) {
            c16fs4.j0(LJIJ());
        }
        View view4 = this.LLILLL;
        this.LLJJ = view4 != null ? (C16FS) view4.findViewById(R.id.whx) : null;
        if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
            int i = this.LLILZIL;
            int i2 = this.LLIZLLLIL;
            int i3 = this.LLILZLL;
            int i4 = this.LLIZ;
            this.LLJJJJ = (((i - (i2 * 2)) - i3) - i4) / i4;
            this.LLJJJIL = (((i - (i2 * 2)) - (i3 * 2)) - (i4 * 2)) / i4;
        }
    }

    public final int LJIJ() {
        return LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.style.ak5 : R.style.ak4;
    }

    public final void LJIL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
        Room room = this.LLJJIJIIJIL;
        if (room == null) {
            room = null;
        }
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        Room room2 = this.LLJJIJIIJIL;
        c474500IjALIZ.LJJII(Long.valueOf((room2 != null ? room2 : null).getId()), "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJ("click");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZ.LJJII("profile_card", "show_entrance");
        c474500IjALIZ.LJJII(this.LL.LIZJ.LJI ? "anchor" : "user", "user_type");
        C518420KUu.LIZIZ(c474500IjALIZ, this.LLJJI);
        c474500IjALIZ.LJJII("subscribe", "button_type");
        c474500IjALIZ.LJIJJLI(this.LLJJI);
        c474500IjALIZ.LIZ();
        C510380Jzw.LJIJJLI("profile_card");
    }

    public final void LJJ() {
        boolean zC70 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c70();
        EnumC495600Jc6 enumC495600Jc6 = this.LLJJIJIL;
        if (enumC495600Jc6 == null) {
            enumC495600Jc6 = null;
        }
        int iOrdinal = enumC495600Jc6.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C16FS c16fs = this.LLJILJILJ;
                if (c16fs != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c16fs.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                    layoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                    C786410Ut5.x6(c16fs, layoutParams);
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                throw new C1954807lC();
            }
            C16FS c16fs2 = this.LLJILJILJ;
            if (c16fs2 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c16fs2.getLayoutParams();
                layoutParams2.width = 0;
                layoutParams2.weight = this.LLJJJJ;
                layoutParams2.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                C786410Ut5.x6(c16fs2, layoutParams2);
                return;
            }
            return;
        }
        User user = this.LLJJIJI;
        if (user == null) {
            user = null;
        }
        if (user.isFollowing()) {
            C16FS c16fs3 = this.LLJILJILJ;
            if (c16fs3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c16fs3.getLayoutParams();
                layoutParams3.width = 0;
                layoutParams3.weight = 1.0f;
                C786410Ut5.x6(c16fs3, layoutParams3);
                c16fs3.setText("");
                return;
            }
            return;
        }
        User user2 = this.LLJJIJI;
        if (user2 == null) {
            user2 = null;
        }
        if (!user2.isFollowing()) {
            User user3 = this.LLJJIJI;
            if (LJIJI(user3 != null ? user3 : null)) {
                if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
                    C16FS c16fs4 = this.LLJILJILJ;
                    if (c16fs4 != null) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) c16fs4.getLayoutParams();
                        layoutParams4.width = 0;
                        layoutParams4.weight = 1.0f;
                        C786410Ut5.x6(c16fs4, layoutParams4);
                        return;
                    }
                    return;
                }
                C16FS c16fs5 = this.LLJILJILJ;
                if (c16fs5 != null) {
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) c16fs5.getLayoutParams();
                    layoutParams5.width = 0;
                    layoutParams5.weight = 1.0f;
                    C786410Ut5.x6(c16fs5, layoutParams5);
                    c16fs5.j0(LJIJ());
                    c16fs5.setIconAttr(R.attr.e82);
                    c16fs5.setText("");
                    return;
                }
                return;
            }
        }
        C16FS c16fs6 = this.LLJILJILJ;
        if (c16fs6 != null) {
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) c16fs6.getLayoutParams();
            layoutParams6.width = 0;
            layoutParams6.weight = 1.0f;
            C786410Ut5.x6(c16fs6, layoutParams6);
            if (zC70 && LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
                c16fs6.j0(LJIJ());
                c16fs6.setIconAttr(R.attr.e82);
                c16fs6.setText("");
            }
        }
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        ViewGroup viewGroup;
        View view = this.LLILLL;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLJILJILJ, viewGroup);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJJJJLIIL;
    }

    public NormalOperationCell(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLJJI = c495920Jcc.LJIIJJI;
        this.LLJJIII = (LiveProfilePreloadViewModel) C520010KaN.LJJJI(c495920Jcc.LIZ, LiveProfilePreloadViewModel.class, null, 14);
        this.LLJJJIL = 4.0f;
        this.LLJJJJ = 5.2f;
        c495920Jcc.LIZIZ.getLifecycle().addObserver(this);
        this.LLJJJJJIL = EnumC495780JcO.NORMAL_OPERATION;
        this.LLJJJJLIIL = !c495920Jcc.LIZJ.LIZLLL;
    }

    public final boolean LJIJI(User user) {
        SubscribeInfo subscribeInfo;
        if (!LJIJJ(user) || (subscribeInfo = user.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            return false;
        }
        return true;
    }

    public final boolean LJIJJ(User user) {
        SubscribeInfo subscribeInfo;
        if (user.getSubscribeInfo() == null || !C1114740f7A.LIZ(this.LL.LIZJ.LJI) || (subscribeInfo = user.getSubscribeInfo()) == null) {
            return false;
        }
        return subscribeInfo.isAnchorQualified();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r19) {
        /*
            Method dump skipped, instruction units count: 1513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.cell.NormalOperationCell.LJIJJLI(boolean):void");
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        C16FS c16fs;
        MutableLiveData followStatus;
        String str;
        boolean z = false;
        if (!LJIIIIZZ(user)) {
            this.LLJJIJI = user;
            C495980Jci c495980Jci = this.LL;
            this.LLJJIJIIJIL = c495980Jci.LJFF;
            this.LLJJJ = c495980Jci.LJIIIIZZ;
            ILiveProfileService iLiveProfileService = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
            C495920Jcc c495920Jcc = (C495920Jcc) this.LL;
            User user2 = this.LLJJIJI;
            Room room = null;
            if (user2 == null) {
                user2 = null;
            }
            C489040JFu c489040JFuLj2 = iLiveProfileService.Lj2(c495920Jcc, user2);
            this.LLJILJIL = c489040JFuLj2;
            if (c489040JFuLj2 != null) {
                c16fs = c489040JFuLj2.LJ;
            } else {
                c16fs = null;
            }
            this.LLJILJILJ = c16fs;
            if (c489040JFuLj2 != null) {
                c489040JFuLj2.LIZ(2, new LinearLayout.LayoutParams(0, -2, 1.0f), (ViewGroup) this.LLILLL);
            }
            C16FS c16fs2 = this.LLJI;
            if (c16fs2 != null) {
                C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
                ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 239);
                C495980Jci c495980Jci2 = this.LL;
                EnumC495860JcW enumC495860JcW = EnumC495860JcW.OPERATION;
                c495870JcX.getClass();
                C495870JcX.LIZIZ(c16fs2, aCListenerS142S0100000_7, false, c495980Jci2, enumC495860JcW, "watch_live", null);
            }
            final C16FS c16fs3 = this.LLJIJIL;
            if (c16fs3 != null) {
                C495870JcX c495870JcX2 = InterfaceC495890JcZ.LJJLL;
                ACListenerS142S0100000_7 aCListenerS142S0100000_72 = new ACListenerS142S0100000_7(this, 228);
                C495980Jci c495980Jci3 = this.LL;
                EnumC495860JcW enumC495860JcW2 = EnumC495860JcW.OPERATION;
                c495870JcX2.getClass();
                C495870JcX.LIZIZ(c16fs3, aCListenerS142S0100000_72, false, c495980Jci3, enumC495860JcW2, "at_reply", null);
                q0.LJIJ(c16fs3, new C20094213jo() { // from class: X.0Jf0
                    @Override // X.C20094213jo
                    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                        Resources resources = c16fs3.getContext().getResources();
                        Object[] objArr = new Object[1];
                        User user3 = this.LLJJIJI;
                        if (user3 == null) {
                            user3 = null;
                        }
                        objArr[0] = C0KVU.LIZ(user3);
                        accessibilityNodeInfoCompat.setContentDescription(resources.getString(2131840892, objArr));
                    }
                });
            }
            C16FS c16fs4 = this.LLJILLL;
            if (c16fs4 != null) {
                C495870JcX c495870JcX3 = InterfaceC495890JcZ.LJJLL;
                ACListenerS142S0100000_7 aCListenerS142S0100000_73 = new ACListenerS142S0100000_7(this, 229);
                C495980Jci c495980Jci4 = this.LL;
                EnumC495860JcW enumC495860JcW3 = EnumC495860JcW.OPERATION;
                c495870JcX3.getClass();
                C495870JcX.LIZIZ(c16fs4, aCListenerS142S0100000_73, false, c495980Jci4, enumC495860JcW3, "notification", null);
            }
            C16FS c16fs5 = this.LLJJ;
            if (c16fs5 != null) {
                C495870JcX c495870JcX4 = InterfaceC495890JcZ.LJJLL;
                ACListenerS142S0100000_7 aCListenerS142S0100000_74 = new ACListenerS142S0100000_7(this, 230);
                C495980Jci c495980Jci5 = this.LL;
                EnumC495860JcW enumC495860JcW4 = EnumC495860JcW.OPERATION;
                User user3 = this.LLJJIJI;
                if (user3 == null) {
                    user3 = null;
                }
                if (LJIJI(user3)) {
                    str = "unsubscribe";
                } else {
                    str = "subscribe";
                }
                c495870JcX4.getClass();
                C495870JcX.LIZIZ(c16fs5, aCListenerS142S0100000_74, false, c495980Jci5, enumC495860JcW4, str, null);
            }
            z = true;
            LJIJJLI(true);
            InterfaceC495660JcC interfaceC495660JcC = this.LLJILJIL;
            if (interfaceC495660JcC != null && (followStatus = interfaceC495660JcC.getFollowStatus()) != null) {
                followStatus.observe(this.LL.LIZIZ, new AObserverS211S0100000_7(this, 46));
            }
            ISubscriptionStatusService.LJIIIZ.getClass();
            ISubscriptionStatusService iSubscriptionStatusServiceLIZ = C0K9Q.LIZ();
            Room room2 = this.LLJJIJIIJIL;
            if (room2 != null) {
                room = room2;
            }
            LifecycleOwner lifecycleOwner = this.LL.LIZIZ;
            C492290JSh c492290JShFi2 = iSubscriptionStatusServiceLIZ.fi2(room, lifecycleOwner, lifecycleOwner);
            if (c492290JShFi2 != null) {
                c492290JShFi2.LIZIZ(this.LL.LIZIZ, new AwS586S0100000_7(this, 429));
            }
        }
        return z;
    }
}
