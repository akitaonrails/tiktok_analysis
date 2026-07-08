package com.ss.android.ugc.aweme.live.avatar;

import X.C08JS;
import X.C1017070cZd;
import X.C10EU;
import X.C1257180iou;
import X.C1260740iue;
import X.C1492170ovv;
import X.C14EU;
import X.C356901a3;
import X.C479910Irt;
import X.EnumC1607270rvZ;
import X.EnumC1608460rxU;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import X.InterfaceC1608830ry5;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarLiveDataAdapter implements InterfaceC1608830ry5<EnumC1608460rxU, C1257180iou>, InterfaceC1608820ry4<EnumC1608460rxU, C1257180iou>, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C1257180iou LL;
    public InterfaceC1607380rvk LLILLJJLI;
    public String LLILLL;
    public AvatarComponentView LLILZ;

    public AvatarLiveDataAdapter() {
        this(null);
    }

    @Override // X.InterfaceC1608820ry4
    public final /* bridge */ /* synthetic */ InterfaceC1606880ruw LJFF(Object obj) {
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public AvatarLiveDataAdapter(C1257180iou c1257180iou) {
        this.LL = c1257180iou;
    }

    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        NewLiveRoomStruct newLiveRoomStruct;
        if (obj instanceof User) {
            if (C1260740iue.LIZ()) {
                User user = (User) obj;
                if (user.isLive() && ((!user.isSecret() || C10EU.LJIIL(user)) && !user.isEnableAdOfficialLiveAuthor() && user.isLive() && C1492170ovv.LIZ() && !user.isBlock())) {
                    C1257180iou c1257180iou = this.LL;
                    if (c1257180iou != null && c1257180iou.LJFF != null) {
                        user.getUid();
                    }
                    C1257180iou c1257180iou2 = this.LL;
                    if (c1257180iou2 != null && c1257180iou2.LJFF != null && (newLiveRoomStruct = (NewLiveRoomStruct) C08JS.LIZ(user.roomData, NewLiveRoomStruct.class)) != null) {
                        newLiveRoomStruct.roomStructConstructor();
                    }
                    C1257180iou c1257180iou3 = this.LL;
                    if (c1257180iou3 != null && c1257180iou3.LJFF != null) {
                        user.getFollowStatus();
                    }
                    return EnumC1608460rxU.LIVE;
                }
            }
        } else if ((obj instanceof Aweme) && C1017070cZd.LLJIJIL((Aweme) obj)) {
            return EnumC1608460rxU.LIVE;
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C479910Irt c479910Irt) {
        Long lValueOf;
        String str;
        InterfaceC1607380rvk interfaceC1607380rvk;
        String strLJJJJJ;
        InterfaceC1607380rvk interfaceC1607380rvk2 = this.LLILLJJLI;
        if (interfaceC1607380rvk2 != null && (strLJJJJJ = interfaceC1607380rvk2.LJJJJJ()) != null) {
            this.LLILLL = strLJJJJJ;
        }
        try {
            String str2 = this.LLILLL;
            if (str2 != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                lValueOf = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lValueOf = 0L;
        }
        long j = c479910Irt.LIZIZ;
        if (lValueOf != null && lValueOf.longValue() == j && c479910Irt.LIZJ && (str = this.LLILLL) != null && (interfaceC1607380rvk = this.LLILLJJLI) != null) {
            interfaceC1607380rvk.LJIIZILJ(str, null, EnumC1607270rvZ.LIVE, false, new AwS603S0100000_24(this, 126));
        }
    }

    @Override // X.InterfaceC1608820ry4
    public final void LJ(AvatarComponentView avatarComponentView, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LLILZ = avatarComponentView;
        C1257180iou c1257180iou = this.LL;
        if ((c1257180iou != null && !c1257180iou.LJ) || lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    @Override // X.InterfaceC1608820ry4
    public final void LIZJ(String str, InterfaceC1607380rvk interfaceC1607380rvk, Object obj) {
        this.LLILLJJLI = interfaceC1607380rvk;
        this.LLILLL = str;
    }
}
