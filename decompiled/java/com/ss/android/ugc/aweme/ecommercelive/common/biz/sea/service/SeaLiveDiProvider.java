package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.service;

import X.C01GW;
import X.C098200Yq;
import X.C0IIC;
import X.C0IJH;
import X.C1390920mIc;
import X.C14EU;
import X.C1558360qeg;
import X.C1732670vBp;
import X.C1733340vCu;
import X.C1733350vCv;
import X.C1733360vCw;
import X.C1733450vD5;
import X.C189200o6;
import X.C2097608Jq;
import X.C356901a3;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C958103op;
import X.EnumC599400Nf8;
import X.InterfaceC599460NfE;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC737790Swr;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.scope.LiveFragmentScope;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.container.SeaLivePopupCustomBehavior;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.container.SeaLivePopupFragment;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaLiveDiProvider implements C0IIC, InterfaceC713360RyY, DefaultLifecycleObserver, GenericLifecycleObserver, InterfaceC737790Swr {
    public final Fragment LL;
    public final Lifecycle LLILLJJLI;
    public Integer LLILZIL;
    public Long LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(190));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 674));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 673));

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{LiveFragmentScope.class}).unbindAbility(LJI(), ISeaLiveContextAbility.class);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{LiveFragmentScope.class}).bindAbility(LJI(), ISeaLiveContextAbility.class);
    }

    public final ISeaLiveContextAbility LJI() {
        return (ISeaLiveContextAbility) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJFF(this.LL, null);
    }

    @Override // X.C0IIC
    public final InterfaceC665370Q7z LIZ() {
        return k0();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    @Override // X.C0IIC
    public final boolean LIZIZ(Room room) {
        CommerceStruct commerceStruct;
        if (room == null || (commerceStruct = room.getCommerceStruct()) == null || commerceStruct.commercePermission != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C0IIC
    public final void LIZLLL(Map<String, ? extends Object> map) {
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                LJI().SU1().LIZLLL(entry.getKey(), entry.getValue(), EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        this.LLILLJJLI.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Integer num = this.LLILZIL;
        if (num != null) {
            C1732670vBp.LIZ = Integer.valueOf(num.intValue());
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void subscribePopupFragment(C1733340vCu c1733340vCu) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4 = this.LLILZIL;
        if ((((num4 != null && num4.intValue() == 1) || ((num = this.LLILZIL) != null && num.intValue() == 0)) && Intrinsics.LJFF(this.LLILZIL, c1733340vCu.LIZ)) || ((((num2 = this.LLILZIL) != null && num2.intValue() == 2) || ((num3 = this.LLILZIL) != null && num3.intValue() == 3)) && Intrinsics.LJFF(c1733340vCu.LIZIZ, this.LLILZLL))) {
            FragmentManager childFragmentManager = this.LL.getChildFragmentManager();
            C1733350vCv c1733350vCv = c1733340vCu.LIZJ;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            SeaLivePopupFragment seaLivePopupFragment = new SeaLivePopupFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("lynx_url", c1733350vCv.LIZ, bundle);
            C786410Ut5.LJJJI("data", c1733350vCv.LIZJ, bundle);
            C786410Ut5.LJJJI("popup_key", c1733350vCv.LIZIZ, bundle);
            seaLivePopupFragment.setArguments(bundle);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = seaLivePopupFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJLLL = false;
            tuxSheet2.LLJJIJIIJIL = c1733350vCv.LIZLLL;
            int iLJ = (int) C958103op.LJ();
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLJJL = iLJ;
            tuxSheet3.LLJLL = true;
            c1390920mIc.LIZ.LLJI = 0;
            SeaLivePopupCustomBehavior seaLivePopupCustomBehavior = new SeaLivePopupCustomBehavior();
            TuxSheet tuxSheet4 = c1390920mIc.LIZ;
            tuxSheet4.LLLIIII = seaLivePopupCustomBehavior;
            tuxSheet4.show(childFragmentManager, SeaLivePopupFragment.class.getName());
        }
    }

    public SeaLiveDiProvider(Fragment fragment, C0IJH c0ijh) {
        this.LL = fragment;
        this.LLILLJJLI = fragment.getLifecycle();
        this.LLIZ = C452501pT.LIZIZ(new AwS427S0200000_26(this, c0ijh, 40));
    }

    @Override // X.C0IIC
    public final boolean LIZJ(int i, final Room room) {
        Long lValueOf;
        final boolean z;
        if (i != 0) {
            try {
                if (!LIZIZ(room)) {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        }
        this.LLILZIL = Integer.valueOf(i);
        if (room == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(room.getId());
        }
        this.LLILZLL = lValueOf;
        EventBus.LIZLLL().LJIJJ(this);
        C1732670vBp.LIZ = Integer.valueOf(i);
        new C1733450vD5(LJI());
        final ISeaLiveContextAbility iSeaLiveContextAbilityLJI = LJI();
        final Integer numValueOf = Integer.valueOf(i);
        if (i != 0 && i != 1) {
            z = false;
        } else {
            z = true;
        }
        new Object(iSeaLiveContextAbilityLJI, numValueOf, room, z) { // from class: X.0vDw
            public final ISeaLiveContextAbility LIZ;
            public final Integer LIZIZ;
            public final Room LIZJ;
            public final boolean LIZLLL;
            public final Boolean LJ = null;

            {
                String string;
                String string2;
                boolean z2;
                CommerceStruct commerceStruct;
                User owner;
                FollowInfo followInfo;
                String string3;
                Unit unit;
                this.LIZ = iSeaLiveContextAbilityLJI;
                this.LIZIZ = numValueOf;
                this.LIZJ = room;
                this.LIZLLL = z;
                try {
                    n nVar = (n) C301930BsV.LIZ.getValue();
                    if (nVar != null) {
                        iSeaLiveContextAbilityLJI.SU1().LIZLLL("ab_params", C12844050w.LIZ(nVar), EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                try {
                    InterfaceC599740Nfg interfaceC599740NfgSU1 = this.LIZ.SU1();
                    interfaceC599740NfgSU1.LIZLLL(Scene.SCENE_SERVICE, this.LIZIZ, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    Room room2 = this.LIZJ;
                    if (room2 != null) {
                        string = Long.valueOf(room2.getId()).toString();
                    } else {
                        string = null;
                    }
                    interfaceC599740NfgSU1.LIZLLL("room_id", string, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    Room room3 = this.LIZJ;
                    if (room3 != null) {
                        string2 = Long.valueOf(room3.getOwnerUserId()).toString();
                    } else {
                        string2 = null;
                    }
                    interfaceC599740NfgSU1.LIZLLL("author_id", string2, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                    interfaceC599740NfgSU1.LIZLLL("user_id", iUserService != null ? iUserService.getCurrentUserID() : null, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    Room room4 = this.LIZJ;
                    interfaceC599740NfgSU1.LIZLLL("follow_status", (room4 == null || (owner = room4.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (string3 = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) ? "-1" : string3, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    Room room5 = this.LIZJ;
                    int i2 = 1;
                    if (room5 != null && (commerceStruct = room5.getCommerceStruct()) != null && commerceStruct.asyncLoad) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    interfaceC599740NfgSU1.LIZLLL("async_load", Boolean.valueOf(z2), EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    if (!this.LIZLLL) {
                        if (Intrinsics.LJFF(this.LJ, Boolean.TRUE)) {
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                    }
                    interfaceC599740NfgSU1.LIZLLL("role_type", Integer.valueOf(i2), EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    C189200o6.m2constructorimpl(interfaceC599740NfgSU1);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
        };
        this.LLILLJJLI.addObserver(this);
        return true;
    }

    @Override // X.C0IIC
    public final void LJ(Room room, Long l, String str, String str2, HashMap<String, String> map) {
        String lowerCase;
        String lowerCase2;
        InterfaceC599460NfE interfaceC599460NfEHW1 = ((C1733360vCw) this.LLIZLLLIL.getValue()).LIZ.hW1();
        try {
            interfaceC599460NfEHW1.LIZ(String.valueOf(room.getOwnerUserId()), "author_id");
            interfaceC599460NfEHW1.LIZ("TEMAI", "EVENT_ORIGIN_FEATURE");
            interfaceC599460NfEHW1.LIZ(String.valueOf(room.getId()), "room_id");
            if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
                lowerCase = "";
            }
            interfaceC599460NfEHW1.LIZ(lowerCase, "enter_from_merge");
            if (str2 == null) {
                str2 = "";
            }
            interfaceC599460NfEHW1.LIZ(str2, "action_type");
            interfaceC599460NfEHW1.LIZ("live_cart_tag", "carrier_type");
            interfaceC599460NfEHW1.LIZ("live", "page_type");
            interfaceC599460NfEHW1.LIZ("live_cart_tag", "anchor_show_type");
            interfaceC599460NfEHW1.LIZ("live_cart", "entrance_form");
            interfaceC599460NfEHW1.LIZ("live", "page_name");
            interfaceC599460NfEHW1.LIZ("live", "source_page_type");
            String requestId = room.getRequestId();
            Unit unit = null;
            if (requestId != null) {
                lowerCase2 = requestId.toLowerCase(Locale.ROOT);
            } else {
                lowerCase2 = null;
            }
            interfaceC599460NfEHW1.LIZ(lowerCase2, "request_id");
            interfaceC599460NfEHW1.LIZ(l, "click_enter_room_time");
            if (map != null) {
                String str3 = map.get("rec_params");
                if (str3 != null) {
                    interfaceC599460NfEHW1.LIZ(str3, "rec_params");
                }
                String str4 = map.get("source_module");
                if (str4 != null) {
                    interfaceC599460NfEHW1.LIZ(str4, "source_module");
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
