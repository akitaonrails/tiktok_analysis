package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard;

import X.C011Q;
import X.C01GW;
import X.C09JN;
import X.C0UO0;
import X.C1091340eVQ;
import X.C1108350ewr;
import X.C1108480ex4;
import X.C1161920gLG;
import X.C2097608Jq;
import X.C389001fE;
import X.C452501pT;
import X.C480460Ism;
import X.C494680Jac;
import X.C510380Jzw;
import X.C786410Ut5;
import X.EnumC1108060ewO;
import X.EnumC1108700exQ;
import X.EnumC510330Jzr;
import X.InterfaceC1108360ews;
import X.RunnableC1108390ewv;
import X.RunnableC1108410ewx;
import X.RunnableC1108420ewy;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class SubscriptionExplainCardWidget extends LiveRecyclableWidget implements InterfaceC1108360ews {
    public Room LL;
    public boolean LLILLJJLI;
    public C1091340eVQ LLIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZLLLIL;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public long LLILLL = -1;
    public long LLILZ = -1;
    public final Map<String, String> LLILZIL = new LinkedHashMap();
    public EnumC1108060ewO LLILZLL = EnumC1108060ewO.NULL;
    public boolean LLJ = true;
    public boolean LLJI = true;
    public final BPEAHandler LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC1108420ewy LLJILLL = new Runnable() { // from class: X.0ewy
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SubscriptionExplainCardWidget@28b9.showTask$1");
            try {
                this.LL.show();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SubscriptionExplainCardWidget@28b9.showTask$1");
        }
    };
    public final RunnableC1108410ewx LLJJ = new Runnable() { // from class: X.0ewx
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SubscriptionExplainCardWidget@28b9.hideTask$1");
            try {
                this.LL.hide();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SubscriptionExplainCardWidget@28b9.hideTask$1");
        }
    };
    public final RunnableC1108390ewv LLJJI = new Runnable() { // from class: X.0ewv
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SubscriptionExplainCardWidget@28b9.timeOffTask$1");
            try {
                SubscriptionExplainCardWidget subscriptionExplainCardWidget = this.LL;
                subscriptionExplainCardWidget.I(EnumC1108700exQ.AUTO, Long.valueOf(subscriptionExplainCardWidget.LLJILJIL));
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SubscriptionExplainCardWidget@28b9.timeOffTask$1");
        }
    };
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1108480ex4());

    public abstract void A1(EnumC1108700exQ enumC1108700exQ);

    public abstract void D1();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.i2k;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract String x1(SubPinCard subPinCard, boolean z);

    public abstract int z1();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        C1091340eVQ c1091340eVQ = this.LLIZ;
        if (c1091340eVQ != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091340eVQ, null);
            c1091340eVQ.removeAllViews();
        }
        super.hide();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C1091340eVQ c1091340eVQ = this.LLIZ;
        if (c1091340eVQ != null) {
            c1091340eVQ.LJ();
        }
        C1091340eVQ c1091340eVQ2 = this.LLIZ;
        if (c1091340eVQ2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091340eVQ2, null);
            c1091340eVQ2.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLIZLLLIL = null;
        if (this.LLJIJIL && this.LLJILJIL == UserService.getInstance().user().getCurrentUserId()) {
            A1(EnumC1108700exQ.OTHER);
            this.LLJILJIL = 0L;
        }
        this.LLJIJIL = false;
        this.LLJ = true;
        this.LLILZLL = EnumC1108060ewO.NULL;
        this.LLILLL = -1L;
        this.LLILZ = -1L;
        ((LinkedHashMap) this.LLILZIL).clear();
        this.LLJILJILJ.removeCallbacksAndMessages(null);
        C1108350ewr.LLILLJJLI.LJI(z1());
    }

    @Override // X.InterfaceC1108360ews
    public final void LJLZ() {
        User owner;
        C480460Ism.LIZ().getClass();
        SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
        Room room = this.LL;
        long id = room != null ? room.getId() : 0L;
        int iZ1 = z1();
        Room room2 = this.LL;
        C510380Jzw.LJIILJJIL(subscribeApi.unpinExplainCard(id, 0L, iZ1, (room2 == null || (owner = room2.getOwner()) == null) ? null : owner.getSecUid()), EnumC510330Jzr.GENERAL, getClass().getSimpleName(), "sub/anchor/unpin", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0evZ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscriptionExplainCardWidget@28b9.onWannaUnpin$1");
                if (((BaseResponse) obj).statusCode == 0) {
                    C389001fE.LIZJ("subscription_unpin_card_response", new Pair[]{new Pair("pinCardType", Integer.valueOf(this.LL.z1()))});
                }
                C1C7U.LIZIZ("SubscriptionExplainCardWidget@28b9.onWannaUnpin$1");
            }
        }, new C09JN() { // from class: X.011T
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscriptionExplainCardWidget@28b9.onWannaUnpin$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C501470JlZ) {
                    String prompt = ((C501470JlZ) th).getPrompt();
                    if (!a0.LJJJIL(prompt)) {
                        C766270U4b.LJIIJJI(prompt);
                    }
                }
                C1C7U.LIZIZ("SubscriptionExplainCardWidget@28b9.onWannaUnpin$2");
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C1091340eVQ c1091340eVQ = this.LLIZ;
        if (c1091340eVQ != null) {
            c1091340eVQ.LJFF();
        }
    }

    public final void C1(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isConfirm", z);
        jSONObject.put("pinCardType", z1());
        C389001fE.LIZ("subscription_pin_card_response", jSONObject, System.currentTimeMillis(), false);
    }

    @Override // X.InterfaceC1108360ews
    public final void LLLL(Map<String, String> map) throws JSONException {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZIL;
        linkedHashMap.clear();
        linkedHashMap.putAll(map);
        if (this.LLJ) {
            C1(true);
        } else {
            if (!this.LLJI) {
                return;
            }
            D1();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1091340eVQ c1091340eVQ = (C1091340eVQ) findViewById(R.id.deb);
        this.LLIZ = c1091340eVQ;
        if (c1091340eVQ != null) {
            c1091340eVQ.setAnimationDuration(300L);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        boolean zBooleanValue;
        this.LL = (Room) this.dataChannel.gg0(RoomChannel.class);
        Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLJJLI = zBooleanValue;
        C1108350ewr.LLILLJJLI.LJFF(z1(), this);
        C1108350ewr.LIZ(this.LL);
    }

    public boolean y1(long j) {
        if (j <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final boolean E1(EnumC1108700exQ enumC1108700exQ, Long l) {
        if (!this.LLJIJIL) {
            return false;
        }
        this.LLJILJILJ.removeCallbacksAndMessages(null);
        C1091340eVQ c1091340eVQ = this.LLIZ;
        if (c1091340eVQ != null) {
            c1091340eVQ.LJ();
        }
        C786410Ut5.LJLIIL(300L, this.LLJILJILJ, this.LLJJ);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (l != null && l.longValue() == currentUserId) {
            A1(enumC1108700exQ);
            this.LLJILJIL = 0L;
        }
        this.LLJIJIL = false;
        this.LLILLL = -1L;
        this.LLILZ = -1L;
        ((LinkedHashMap) this.LLILZIL).clear();
        return true;
    }

    public final boolean B1(SubPinCard subPinCard, Long l, Function0<Unit> function0) {
        long j;
        long j2;
        int iZ1 = z1();
        long jLongValue = 0;
        if (iZ1 != 1) {
            if (iZ1 != 2) {
                j2 = 0;
                boolean z = false;
                if (!C494680Jac.LJI(this.dataChannel) || y1(j2) || this.LLJIJIL) {
                    return false;
                }
                this.LLJILJILJ.removeCallbacksAndMessages(null);
                this.LLJIJIL = true;
                this.LLILLL = SystemClock.elapsedRealtime();
                if (l != null) {
                    jLongValue = l.longValue();
                }
                this.LLJILJIL = jLongValue;
                IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                Context context = this.context;
                if (this.LLJILJIL == UserService.getInstance().user().getCurrentUserId()) {
                    z = true;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerService.DU1(context, x1(subPinCard, z), null, true, new C011Q(subPinCard));
                this.LLIZLLLIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                C1091340eVQ c1091340eVQ = this.LLIZ;
                if (c1091340eVQ != null) {
                    c1091340eVQ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
                }
                C786410Ut5.LJLIIL(300L, this.LLJILJILJ, this.LLJILLL);
                C786410Ut5.LJLIIL(j2 - System.currentTimeMillis(), this.LLJILJILJ, this.LLJJI);
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
            SubGoalPinCard subGoalPinCard = subPinCard.goalPinCard;
            if (subGoalPinCard != null) {
                j = subGoalPinCard.timeToLive;
            } else {
                j = 0;
            }
        } else {
            j = subPinCard.timeToLive;
        }
        j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        boolean z2 = false;
        if (!C494680Jac.LJI(this.dataChannel)) {
        }
        return false;
    }

    public void LJJZZIII(boolean z, boolean z2, EnumC1108060ewO enumC1108060ewO) {
        this.LLJ = z;
        this.LLJI = z2;
        this.LLILZLL = enumC1108060ewO;
        if (!z) {
            I(EnumC1108700exQ.REPLACED, Long.valueOf(this.LLJILJIL));
        }
    }
}
