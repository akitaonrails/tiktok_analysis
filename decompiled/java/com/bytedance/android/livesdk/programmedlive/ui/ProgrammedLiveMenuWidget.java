package com.bytedance.android.livesdk.programmedlive.ui;

import X.C0IJT;
import X.C0TZM;
import X.C1085120eLO;
import X.C1161920gLG;
import X.C11NJ;
import X.C20743416Fc;
import X.C21538619Qy;
import X.C463520IFq;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520200Kag;
import X.C520220Kai;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC520190Kaf;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class ProgrammedLiveMenuWidget extends LiveRecyclableWidget {
    public C21538619Qy LL;
    public FrameLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public C20743416Fc LLILZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZIL;
    public boolean LLILZLL;
    public Room LLIZLLLIL;
    public final C11NJ LLIZ = new C11NJ();
    public long LLJ = -1;
    public long LLJI = -1;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hjk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (!this.LLILZLL) {
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            this.LLILZIL = null;
            this.LLILZLL = true;
        }
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLIZ.LJ();
        this.LLILZLL = false;
    }

    public final void onEvent(C520200Kag c520200Kag) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        User owner;
        User owner2;
        TopFrameSummary topFrameSummary;
        String str;
        Long lValueOf4;
        User owner3;
        Long lValueOf5 = null;
        if (c520200Kag.LIZ) {
            Room room = this.LLIZLLLIL;
            if (room != null && (topFrameSummary = room.topFrameSummary) != null && (str = topFrameSummary.schema) != null) {
                IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                Context context = this.context;
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                w.LIZ.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerService.DU1(context, builderBuildUpon.appendQueryParameter("action_type", w.LIZLLL()).appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL()).build().toString(), null, true, new AwS586S0100000_7(this, 183));
                this.LLILZIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                FrameLayout frameLayout = this.LLILLJJLI;
                if (frameLayout != null) {
                    frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1);
                }
                this.LLILZLL = false;
                this.LLJ = SystemClock.elapsedRealtime();
                if (c520200Kag.LIZIZ != null) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_list_show");
                    Room room2 = this.LLIZLLLIL;
                    if (room2 != null && (owner3 = room2.getOwner()) != null) {
                        lValueOf4 = Long.valueOf(owner3.getId());
                    } else {
                        lValueOf4 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf4, "anchor_id");
                    Room room3 = this.LLIZLLLIL;
                    if (room3 != null) {
                        lValueOf5 = Long.valueOf(room3.getId());
                    }
                    c474500IjALIZ.LJJII(lValueOf5, "room_id");
                    c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
                    c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
                    c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLILZLL) {
            return;
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLILZIL = null;
        this.LLILZLL = true;
        this.LLJI = SystemClock.elapsedRealtime();
        if (c520200Kag.LIZIZ == null) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_program_live_list_close");
        Room room4 = this.LLIZLLLIL;
        if (room4 != null && (owner2 = room4.getOwner()) != null) {
            lValueOf = Long.valueOf(owner2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ2.LJJII(lValueOf, "anchor_id");
        Room room5 = this.LLIZLLLIL;
        if (room5 != null) {
            lValueOf2 = Long.valueOf(room5.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ2.LJJII(lValueOf2, "room_id");
        w.LIZ.getClass();
        c474500IjALIZ2.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ2.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ2.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ2.LJJII(String.valueOf(c520200Kag.LIZIZ).toLowerCase(Locale.US), "click_position");
        c474500IjALIZ2.LIZ();
        if (this.LLJ == -1 || this.LLJI == -1) {
            return;
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_program_live_list_show_duration");
        Room room6 = this.LLIZLLLIL;
        if (room6 != null && (owner = room6.getOwner()) != null) {
            lValueOf3 = Long.valueOf(owner.getId());
        } else {
            lValueOf3 = null;
        }
        c474500IjALIZ3.LJJII(lValueOf3, "anchor_id");
        Room room7 = this.LLIZLLLIL;
        if (room7 != null) {
            lValueOf5 = Long.valueOf(room7.getId());
        }
        c474500IjALIZ3.LJJII(lValueOf5, "room_id");
        c474500IjALIZ3.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ3.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ3.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ3.LJJII(Long.valueOf((this.LLJI - this.LLJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "user_time");
        c474500IjALIZ3.LIZ();
        this.LLJ = -1L;
        this.LLJI = -1L;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C21538619Qy) findViewById(R.id.bnu);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.o8_);
        this.LLILLL = (LinearLayout) findViewById(R.id.idq);
        findViewById(R.id.idp);
        this.LLILZ = (C20743416Fc) findViewById(R.id.ids);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LLIZLLLIL = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.FALSE)) {
            C500260Jjc.LLFFF(this.LL);
            C500260Jjc.LJIILIIL(this.LLILLL);
            View view = getView();
            if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
                layoutParams2.width = C497740JfY.LJIILLIIL() + ((int) C497740JfY.LIZIZ(56.0f));
                layoutParams2.height = C497740JfY.LJIILLIIL();
            }
            View view2 = getView();
            if (view2 != null) {
                view2.requestLayout();
            }
        } else {
            C500260Jjc.LJIILIIL(this.LL);
            C500260Jjc.LLFFF(this.LLILLL);
            View view3 = getView();
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.width = -1;
                layoutParams.height = 0;
            }
            View view4 = getView();
            if (view4 != null) {
                view4.requestLayout();
            }
        }
        C20743416Fc c20743416Fc = this.LLILZ;
        if (c20743416Fc != null) {
            c20743416Fc.setText(C497740JfY.LJIJI(2131843866));
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS142S0100000_7(this, 97));
        }
        this.LLIZ.LIZ(C784440Upu.LIZ().LJ(C520200Kag.class).LJJLJLI(new AfS176S0100000_7(this, 93)));
        this.LLIZ.LIZ(C784440Upu.LIZ().LIZJ(this, C463520IFq.class).LIZJ(new AfS176S0100000_7(this, 94)));
        this.LLIZ.LIZ(C784440Upu.LIZ().LJ(C1085120eLO.class).LJJLJLI(new AfS176S0100000_7(this, 95)));
    }

    public final void onEvent(C1085120eLO c1085120eLO) {
        C520220Kai c520220Kai;
        if (c1085120eLO.LIZIZ && (c520220Kai = (C520220Kai) this.dataChannel.gg0(ProgrammedLiveMenuVisibilityChannel.class)) != null && c520220Kai.LIZ) {
            this.dataChannel.zW(ProgrammedLiveMenuVisibilityChannel.class, new C520220Kai(false, EnumC520190Kaf.OTHERS_SCENE));
        }
    }
}
