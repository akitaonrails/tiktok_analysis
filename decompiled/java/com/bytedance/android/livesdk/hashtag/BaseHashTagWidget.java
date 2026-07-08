package com.bytedance.android.livesdk.hashtag;

import X.C0IJT;
import X.C0IZP;
import X.C0KYL;
import X.C0TZM;
import X.C0TZX;
import X.C1143680frq;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C454590Hs9;
import X.C468960IaE;
import X.C474500IjA;
import X.C497740JfY;
import X.C760370TsB;
import X.C786410Ut5;
import X.C931340aLM;
import X.EnumC760350Ts9;
import X.InterfaceC2183451Acp;
import Y.ACListenerS142S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagRequestEvent;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.hashtag.BaseHashTagWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNewFeaturedAnchorAbSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNewFeaturedUrlSettings;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseHashTagWidget extends RoomRecycleFunctionWidget {
    public static final /* synthetic */ int LLIZ = 0;
    public TextView LLILLJJLI;
    public ImageView LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public abstract void C1();

    public abstract void D1(FragmentManager fragmentManager);

    public abstract void E1();

    public abstract void F1();

    public abstract void G1(Hashtag hashtag);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gox;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        this.LL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZLL = false;
        this.LLILZIL = false;
    }

    public abstract boolean z1();

    public final void H1() {
        if (this.LLILZIL) {
            if (isShowing()) {
                return;
            }
            show();
            Map<String, String> mapY1 = y1();
            mapY1.put("action_type", "show");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_featured_entrance");
            c474500IjALIZ.LJJIIZI(mapY1);
            c474500IjALIZ.LIZ();
            return;
        }
        Hashtag hashtag = (Hashtag) this.dataChannel.gg0(HashtagChangedChannel.class);
        if (hashtag != null) {
            if (!C468960IaE.LIZ(hashtag) || !Intrinsics.LJFF(this.dataChannel.gg0(C0TZX.class), Boolean.TRUE)) {
                if (isShowing()) {
                    hide();
                }
            } else {
                if (isShowing()) {
                    return;
                }
                show();
                F1();
            }
        }
    }

    public final void I1() {
        Hashtag hashtag;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room == null || (hashtag = room.hashtag) == null) {
            hide();
            return;
        }
        Hashtag hashtag2 = (Hashtag) this.dataChannel.gg0(HashtagChangedChannel.class);
        this.dataChannel.zW(HashtagChangedChannel.class, hashtag);
        DataChannelGlobal.LLILZ.JQ2(C931340aLM.class, hashtag);
        if (Intrinsics.LJFF(hashtag.id, hashtag2 != null ? hashtag2.id : null)) {
            G1(hashtag);
        }
    }

    public final Map<String, String> y1() {
        int guestCount;
        Room room;
        Room room2;
        Map<String, String> mapLJJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC2183451Acp interfaceC2183451Acp = (InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class);
        if (interfaceC2183451Acp != null && (mapLJJ = interfaceC2183451Acp.LJJ(null)) != null) {
            linkedHashMap.putAll(mapLJJ);
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        int i = 0;
        if (iInteractService != null) {
            guestCount = iInteractService.getGuestCount();
            if (guestCount > 0) {
                i = 1;
            }
        } else {
            guestCount = 0;
        }
        linkedHashMap.put("guest_cnt", String.valueOf(guestCount));
        linkedHashMap.put("is_guest_connection", String.valueOf(i));
        DataChannel dataChannel = this.dataChannel;
        long id = 0;
        long ownerUserId = (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0L : room2.getOwnerUserId();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        }
        linkedHashMap.put("room_id", String.valueOf(id));
        linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
        return linkedHashMap;
    }

    public final void B1() throws JSONException {
        String str;
        Map<String, String> mapY1 = y1();
        Uri.Builder builderBuildUpon = UriProtector.parse(MultiGuestNewFeaturedUrlSettings.INSTANCE.getFeaturedUrl()).buildUpon();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapY1).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        builderBuildUpon.appendQueryParameter("track_info", C786410Ut5.J3(jSONObject));
        String string = builderBuildUpon.build().toString();
        DataChannel dataChannel = this.dataChannel;
        Context context = getContext();
        str = "";
        if (TextUtils.isEmpty(string) || context == null || dataChannel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("faile uriString->");
            sbLIZ.append(string);
            sbLIZ.append(", context->");
            sbLIZ.append(context);
            sbLIZ.append(", dataChannel->");
            sbLIZ.append(dataChannel);
            C20441214yg.LJ("openH5", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Uri uri = UriProtector.parse(string);
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null ? strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter : "";
            if (!(!TextUtils.isEmpty(str))) {
                throw new IllegalStateException("Check failed.");
            }
            Uri.Builder builderBuildUpon2 = UriProtector.parse(str).buildUpon();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    if (!Intrinsics.LJFF(str2, "url")) {
                        builderBuildUpon2.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                    }
                }
            }
            Boolean bool = (Boolean) dataChannel.gg0(C0TZM.class);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            C760370TsB c760370TsBLIZIZ = C0KYL.LIZIZ(builderBuildUpon2.build().toString());
            EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
            c760370TsBLIZIZ.LJIJI(8, enumC760350Ts9);
            c760370TsBLIZIZ.LJIIIIZZ(zBooleanValue ? "bottom" : !C454590Hs9.LIZ(context) ? "right" : "left");
            c760370TsBLIZIZ.LJIIIZ((int) C497740JfY.LJJI((int) (((double) C497740JfY.LJIILLIIL()) * 0.7d)), enumC760350Ts9);
            c760370TsBLIZIZ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), enumC760350Ts9);
            c760370TsBLIZIZ.LJ(-1);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZIZ.LIZ().toString(), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("faile h5->");
            sbLIZ2.append(str);
            C20441214yg.LJFF("openH5", C2188811AlT.LIZIZ(sbLIZ2), e);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Room room;
        super.show();
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        if (z1() || (room = (Room) this.dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        C0IZP.LIZJ(room, "topic");
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public void onGetRoomInfo(Room room) {
        I1();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = (TextView) findViewById(R.id.x1w);
        this.LLILLL = (ImageView) findViewById(R.id.x1c);
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 288), view);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 288), view);
        }
        hide();
        this.dataChannel.CQ2(HashtagChangedChannel.class, this, new AwS586S0100000_7(this, 104));
        if (!z1() || (z1() && MultiGuestNewFeaturedAnchorAbSettings.INSTANCE.isAnchorEnable())) {
            this.dataChannel.CQ2(FeaturedHashTagChangedChannel.class, this, new AwS586S0100000_7(this, 105));
            this.dataChannel.FQ2(FeaturedHashTagRequestEvent.class);
        }
        I1();
    }

    public final void x1(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ejk);
                return;
            }
            return;
        }
        C1143680frq.LIZLLL(this.LLILLL, "tiktok_live_interaction_normal_1", "ttlive_icon_featured.webp");
    }

    public final void A1(final Hashtag hashtag, final Boolean bool) {
        if (this.LLILZIL && z1()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
            final ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLILLL, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
            final ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(500L);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0IaD
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BaseHashTagWidget baseHashTagWidget = this.LL;
                    Hashtag hashtag2 = hashtag;
                    baseHashTagWidget.getClass();
                    if (C468960IaE.LIZ(hashtag2)) {
                        TextView textView = baseHashTagWidget.LLILLJJLI;
                        if (textView != null) {
                            textView.setText(hashtag2.title);
                        }
                    } else {
                        baseHashTagWidget.hide();
                    }
                    this.LL.x1(bool);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                    animatorSet2.setDuration(500L);
                    animatorSet2.start();
                }
            });
            animatorSet.start();
        } else {
            if (C468960IaE.LIZ(hashtag)) {
                TextView textView = this.LLILLJJLI;
                if (textView != null) {
                    textView.setText(hashtag.title);
                }
            } else {
                hide();
            }
            x1(bool);
        }
        H1();
    }
}
