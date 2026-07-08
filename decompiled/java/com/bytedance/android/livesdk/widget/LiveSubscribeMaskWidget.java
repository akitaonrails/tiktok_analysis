package com.bytedance.android.livesdk.widget;

import X.C0IJT;
import X.C0K9Q;
import X.C0KVU;
import X.C1161920gLG;
import X.C12ES;
import X.C16F5;
import X.C16FS;
import X.C474500IjA;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSubscribeMaskWidget extends LiveWidget {
    public C16F5 LL;
    public C16FS LLILLJJLI;
    public Room LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2i;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLILZ = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel);
        C16F5 c16f5 = (C16F5) findViewById(R.id.wij);
        this.LL = c16f5;
        if (c16f5 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c16f5.getLayoutParams();
            int iLJIIIIZZ = ((int) (((double) C12ES.LJIIIIZZ(this.context)) * 0.3d)) - C497740JfY.LJIJ();
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            marginLayoutParams.setMargins(iLIZIZ, iLJIIIIZZ, iLIZIZ, 0);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("sub_only_preview_end_page", "show_entrance");
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LIZ();
        }
        C16FS c16fs = (C16FS) findViewById(R.id.whz);
        this.LLILLJJLI = c16fs;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS142S0100000_7(this, 117));
        }
        show();
        this.dataChannel.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS586S0100000_7(this, 192));
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 193);
        this.dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, awS586S0100000_7);
        this.dataChannel.BQ2(this, RoomUserChannel.class, new AwS373S0200000_7(this, awS586S0100000_7, 8));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        SubscribeInfo subscribeInfo2;
        User owner3;
        SubscribeInfo subscribeInfo3;
        String str;
        super.show();
        Room room2 = this.LLILLL;
        boolean z = (room2 != null ? room2.liveSubOnlyTier : 0L) > 0 || (room2 != null && room2.liveSubOnlyMonth > 0);
        str = null;
        str = null;
        String str2 = null;
        if ((room2 == null || (owner3 = room2.getOwner()) == null || (subscribeInfo3 = owner3.getSubscribeInfo()) == null || (str = subscribeInfo3.solRoomDisplayText) == null || str.length() <= 0) ? false : true) {
            if (this.LLILZ) {
                C16F5 c16f5 = this.LL;
                if (c16f5 != null) {
                    Object[] objArr = new Object[1];
                    Room room3 = this.LLILLL;
                    objArr[0] = C0KVU.LIZ(room3 != null ? room3.getOwner() : null);
                    c16f5.setText(C497740JfY.LJIJJ(2131856592, objArr));
                }
            } else {
                C16F5 c16f52 = this.LL;
                if (c16f52 != null) {
                    Room room4 = this.LLILLL;
                    if (room4 != null && (owner2 = room4.getOwner()) != null && (subscribeInfo2 = owner2.getSubscribeInfo()) != null) {
                        str2 = subscribeInfo2.solRoomDisplayText;
                    }
                    c16f52.setText(str2);
                }
            }
        } else if (this.LLILZ) {
            C16F5 c16f53 = this.LL;
            if (c16f53 != null) {
                Object[] objArr2 = new Object[1];
                Room room5 = this.LLILLL;
                objArr2[0] = C0KVU.LIZ(room5 != null ? room5.getOwner() : null);
                c16f53.setText(C497740JfY.LJIJJ(2131856592, objArr2));
            }
        } else {
            C16F5 c16f54 = this.LL;
            if (c16f54 != null) {
                Object[] objArr3 = new Object[1];
                Room room6 = this.LLILLL;
                objArr3[0] = C0KVU.LIZ(room6 != null ? room6.getOwner() : null);
                c16f54.setText(C497740JfY.LJIJJ(2131844218, objArr3));
            }
        }
        Room room7 = this.LLILLL;
        ISubscriptionStatusService.LJIIIZ.getClass();
        if (!C0K9Q.LIZ().m70(room7).LIZ || !z || (room = this.LLILLL) == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || subscribeInfo.isSolEligible) {
            if (this.LLILZ) {
                C16FS c16fs = this.LLILLJJLI;
                if (c16fs != null) {
                    c16fs.setText(C497740JfY.LJIJI(2131856618));
                    return;
                }
                return;
            }
            C16FS c16fs2 = this.LLILLJJLI;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131844445));
                return;
            }
            return;
        }
        if (this.LLILZ) {
            C16FS c16fs3 = this.LLILLJJLI;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131856618));
                return;
            }
            return;
        }
        C16FS c16fs4 = this.LLILLJJLI;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIJI(2131857034));
        }
    }
}
