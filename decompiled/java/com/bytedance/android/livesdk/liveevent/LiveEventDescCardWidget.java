package com.bytedance.android.livesdk.liveevent;

import X.AbstractC1096550edp;
import X.C01GW;
import X.C1091340eVQ;
import X.C1096420edc;
import X.C1096490edj;
import X.C1096570edr;
import X.C1161920gLG;
import X.C11NJ;
import X.C19748512Ol;
import X.C20441214yg;
import X.C452501pT;
import X.C494680Jac;
import X.C786410Ut5;
import X.InterfaceC1096500edk;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.AAListenerS328S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.liveevent.LiveEventDescCardWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.EventCard;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEventDescCardWidget extends LiveRecyclableWidget {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public boolean LLILZIL;
    public C1096490edj LLILZLL;
    public final ValueAnimator LLJ;
    public final C11NJ LL = new C11NJ();
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 228));
    public final C1096570edr LLIZ = new AbstractC1096550edp() { // from class: X.0edr
        @Override // X.InterfaceC1096500edk
        public final void LIZ(C1096490edj c1096490edj) {
            if (!c1096490edj.LIZJ) {
                LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
                if (liveEventDescCardWidget.LLILZIL) {
                    liveEventDescCardWidget.hide();
                }
            }
        }

        @Override // X.InterfaceC1096500edk
        public final void LIZIZ(C1096490edj c1096490edj) {
            LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
            liveEventDescCardWidget.LLILZLL = c1096490edj;
            if (liveEventDescCardWidget.LLILZIL) {
                liveEventDescCardWidget.hide();
                LiveEventDescCardWidget liveEventDescCardWidget2 = this.LIZ;
                liveEventDescCardWidget2.LLJ.addListener(new AAListenerS328S0100000_17(liveEventDescCardWidget2, 10));
            } else {
                liveEventDescCardWidget.LLILLJJLI.removeCallbacksAndMessages(null);
                LiveEventDescCardWidget liveEventDescCardWidget3 = this.LIZ;
                C786410Ut5.LJLIIL(30000L, liveEventDescCardWidget3.LLILLJJLI, liveEventDescCardWidget3.LLIZLLLIL);
                this.LIZ.show();
            }
        }

        @Override // X.InterfaceC1096500edk
        public final void LIZJ(C1096490edj c1096490edj) {
            LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
            if (!liveEventDescCardWidget.LLILZIL) {
                liveEventDescCardWidget.LLILZLL = c1096490edj;
                liveEventDescCardWidget.LLILLJJLI.removeCallbacksAndMessages(null);
                LiveEventDescCardWidget liveEventDescCardWidget2 = this.LIZ;
                C786410Ut5.LJLIIL(30000L, liveEventDescCardWidget2.LLILLJJLI, liveEventDescCardWidget2.LLIZLLLIL);
                this.LIZ.show();
            }
        }

        @Override // X.InterfaceC1096500edk
        public final void LIZLLL(C1096490edj c1096490edj) {
            if (c1096490edj.LIZLLL != EnumC1085360eLm.REPLACE) {
                this.LIZ.hide();
            }
        }
    };
    public final ARunnableS117S0100000_17 LLIZLLLIL = new ARunnableS117S0100000_17(this, 107);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i03;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (this.LLILZIL) {
            C1091340eVQ c1091340eVQY1 = y1();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091340eVQY1, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            c1091340eVQY1.removeView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            this.LLILLL = null;
            this.LLILZIL = false;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LiveEventCardVisibility.class, Boolean.FALSE);
            }
            this.LLILLJJLI.removeCallbacks(this.LLIZLLLIL);
            this.LLJ.setStartDelay(0L);
            this.LLJ.setFloatValues(1.0f, 0.0f);
            this.LLJ.setDuration(400L);
            this.LLJ.start();
            y1().setAnimationDuration(400L);
            y1().LJ();
            C786410Ut5.LJLIIL(300L, this.LLILLJJLI, new ARunnableS117S0100000_17(this, 108));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            C1096420edc c1096420edc = C1096420edc.LL;
            long id = room.getId();
            C1096570edr c1096570edr = this.LLIZ;
            CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList = C1096420edc.LLILZIL.get(id);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(c1096570edr);
            }
        }
        this.LL.dispose();
        this.LLILLJJLI.removeCallbacksAndMessages(null);
        this.LLJ.removeAllListeners();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveEventCardVisibility.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String string;
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        Long l;
        LiveEventMessage liveEventMessage;
        if (C494680Jac.LJI(this.dataChannel) || this.LLILZIL) {
            return;
        }
        String eventCardLynxUrl = LiveEventPageLynxUrl.INSTANCE.getEventCardLynxUrl();
        try {
            C1096490edj c1096490edj = this.LLILZLL;
            EventCard eventCard = (c1096490edj == null || (liveEventMessage = c1096490edj.LIZIZ) == null) ? null : liveEventMessage.card;
            String strLJIILL = C19748512Ol.LIZIZ.LJIILL(eventCard);
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                string = UriProtector.parse(eventCardLynxUrl).buildUpon().appendQueryParameter("room_id", String.valueOf(room.getId())).appendQueryParameter("anchor_id", String.valueOf(room.getOwnerUserId())).appendQueryParameter("initData", strLJIILL).appendQueryParameter("room_start_time", String.valueOf(room.getCreateTime())).appendQueryParameter("event_id", (eventCard == null || (liveEventInfo2 = eventCard.event) == null || (l = liveEventInfo2.eventId) == null) ? null : l.toString()).appendQueryParameter("pay_method", (eventCard == null || (liveEventInfo = eventCard.event) == null) ? null : Integer.valueOf(liveEventInfo.payMethod).toString()).build().toString();
            } else {
                string = null;
            }
            try {
                C20441214yg.LIZIZ("LiveEventDescCardWidget", string);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJIIIZ("LiveEventDescCardWidget", e.getMessage());
            }
        } catch (Exception e2) {
            e = e2;
            string = null;
        }
        if (string == null) {
            return;
        }
        super.show();
        this.LLILZIL = true;
        if (this.LLILLL != null) {
            C1091340eVQ c1091340eVQY1 = y1();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091340eVQY1, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            c1091340eVQY1.removeView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            this.LLILLL = null;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(this.context, string, null, true, null);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.setBackgroundColor(0);
        this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        y1().addView(this.LLILLL, -1, -1);
        this.dataChannel.zW(LiveEventCardVisibility.class, Boolean.TRUE);
        this.LLJ.setFloatValues(0.0f, 1.0f);
        this.LLJ.setStartDelay(0L);
        this.LLJ.setDuration(300L);
        this.LLJ.start();
        y1().setAnimationDuration(300L);
        y1().LJFF();
        C786410Ut5.LJLIIL(30000L, this.LLILLJJLI, this.LLIZLLLIL);
    }

    public final C1091340eVQ y1() {
        return (C1091340eVQ) this.LLILZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0edr] */
    public LiveEventDescCardWidget() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 36));
        this.LLJ = valueAnimatorOfFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            C1096420edc c1096420edc = C1096420edc.LL;
            long id = room.getId();
            C1096570edr c1096570edr = this.LLIZ;
            LongSparseArray<CopyOnWriteArrayList<InterfaceC1096500edk>> longSparseArray = C1096420edc.LLILZIL;
            CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList = longSparseArray.get(id);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                longSparseArray.put(id, copyOnWriteArrayList);
            }
            if (!copyOnWriteArrayList.contains(c1096570edr)) {
                copyOnWriteArrayList.add(c1096570edr);
            }
            long id2 = room.getId();
            LongSparseArray<C1096490edj> longSparseArray2 = C1096420edc.LLJ;
            C1096490edj c1096490edj = longSparseArray2.get(id2);
            longSparseArray2.remove(id2);
            if (c1096490edj != null) {
                Integer num = C1096420edc.LLILZ.get(room.getId());
                if (num != null && num.intValue() == 0) {
                    this.LLILZLL = c1096490edj;
                    show();
                }
            }
        }
    }
}
