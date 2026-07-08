package com.bytedance.android.livesdk.guide;

import X.C01GW;
import X.C0K9J;
import X.C1123440fLC;
import X.C1123620fLU;
import X.C1123630fLV;
import X.C1123650fLX;
import X.C1131530fYF;
import X.C1151790g4v;
import X.C13LP;
import X.C13LZ;
import X.C1548820qPI;
import X.C20441214yg;
import X.C452501pT;
import X.C473050Igp;
import X.C531650Kt9;
import X.C784440Upu;
import X.C786410Ut5;
import X.C916790Zxt;
import X.C930940aKi;
import X.EnumC1100250ejn;
import X.EnumC1107830ew1;
import X.EnumC512800K9e;
import X.InterfaceC1077770e9X;
import X.InterfaceC1102120emo;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.gift.SendGiftSuccessEvent;
import com.bytedance.android.live.liveinteract.api.CompetitionLayoutChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.livesdk.UGTaskFinishByDetailPage;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideLynxPopupEnableSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.notify.AnimatableNotifyWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideWidget extends AnimatableNotifyWidget implements InterfaceC1077770e9X {
    public final String LLILLJJLI = "GiftGuide";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(44));
    public GiftGuideMessage LLILZ;
    public final AwS596S0100000_17 LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C1123620fLU LLIZLLLIL;
    public final AwS561S0100000_17 LLJ;
    public final AwS561S0100000_17 LLJI;
    public final AwS561S0100000_17 LLJIJIL;
    public final C1151790g4v LLJILJIL;

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 7;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gnz;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1123440fLC E1() {
        return (C1123440fLC) this.LLILLL.getValue();
    }

    public final void G1() {
        if (!GiftGuideLynxPopupEnableSetting.INSTANCE.isNewGiftGuideAnimation()) {
            F1();
            return;
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS117S0100000_17(this, 90));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GiftGuideWidgetVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GiftGuideWidgetVisibilityChannel.class, Boolean.TRUE);
        }
    }

    public GiftGuideWidget() {
        new AwS561S0100000_17(this, 177);
        new AwS596S0100000_17(this, 156);
        this.LLILZIL = new AwS596S0100000_17(this, 157);
        this.LLIZLLLIL = new C1123620fLU();
        this.LLJ = new AwS561S0100000_17(this, 175);
        this.LLJI = new AwS561S0100000_17(this, 174);
        this.LLJIJIL = new AwS561S0100000_17(this, 176);
        this.LLJILJIL = new C1151790g4v(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1() {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.guide.GiftGuideWidget.F1():void");
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        E1().getClass();
        return EnumC1107830ew1.SIDE_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return E1().LLLF;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return E1().getUiInfo();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        E1().getClass();
        return EnumC1100250ejn.MESSAGE;
    }

    public static void D1(ViewGroup viewGroup) {
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, viewGroup.getChildCount()).iterator();
        while (it2.LLILLL) {
            View childAt = viewGroup.getChildAt(it2.nextInt());
            if (childAt != null && (childAt instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) childAt).LJJ(true);
            }
        }
    }

    public final String C1(C1123650fLX c1123650fLX) {
        String strPopupUrl;
        String str;
        String str2;
        String str3;
        ImageModel imageModel;
        List urls;
        User owner;
        ImageModel avatarThumb;
        List urls2;
        long j = c1123650fLX.LIZIZ.giftId;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (c1123650fLX.LIZIZ.popUrl.length() == 0) {
            strPopupUrl = GiftGuideLynxPopupEnableSetting.INSTANCE.popupUrl();
        } else {
            strPopupUrl = c1123650fLX.LIZIZ.popUrl;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(strPopupUrl).buildUpon();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str4 = null;
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null && (urls2 = avatarThumb.getUrls()) != null) {
            str = (String) C13LP.LJJJJZI(urls2);
        } else {
            str = null;
        }
        builderBuildUpon.appendQueryParameter("host_avatar_url", str);
        builderBuildUpon.appendQueryParameter("user_avatar_url", (String) C13LP.LJJJJZI(UserService.getInstance().user().getCurrentUser().getAvatarThumb().getUrls()));
        builderBuildUpon.appendQueryParameter("gift_id", String.valueOf(j));
        if (giftFindGiftById == null || (imageModel = giftFindGiftById.image) == null || (urls = imageModel.getUrls()) == null || (str2 = (String) C13LP.LJJJJZI(urls)) == null) {
            str2 = "";
        }
        builderBuildUpon.appendQueryParameter("gift_icon_url", str2);
        GiftGuideLynxPopupEnableSetting giftGuideLynxPopupEnableSetting = GiftGuideLynxPopupEnableSetting.INSTANCE;
        builderBuildUpon.appendQueryParameter("width", String.valueOf(giftGuideLynxPopupEnableSetting.width()));
        builderBuildUpon.appendQueryParameter("height", String.valueOf(giftGuideLynxPopupEnableSetting.height()));
        if (c1123650fLX.LIZJ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        builderBuildUpon.appendQueryParameter("from_recharge", str3);
        if (giftFindGiftById != null) {
            str4 = giftFindGiftById.name;
        }
        builderBuildUpon.appendQueryParameter("gift_name", str4);
        builderBuildUpon.appendQueryParameter("ug_task_points", String.valueOf(C1131530fYF.LIZJ()));
        builderBuildUpon.appendQueryParameter("pre_reward_ug_task_points", String.valueOf(C1131530fYF.LIZIZ(j, this.dataChannel)));
        return builderBuildUpon.build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUnload(com.bytedance.ies.sdk.widgets.RecycleSource r24) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.guide.GiftGuideWidget.onUnload(com.bytedance.ies.sdk.widgets.RecycleSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1077770e9X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(com.bytedance.android.livesdk.model.message.GiftGuideMessage r23, java.lang.Long r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.guide.GiftGuideWidget.R0(com.bytedance.android.livesdk.model.message.GiftGuideMessage, java.lang.Long):void");
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room room;
        boolean zLJI = MethodIDManager.LJI(202276);
        z1(EnumC512800K9e.OTHERS, false);
        if (GiftGuideLynxPopupEnableSetting.INSTANCE.enable()) {
            C784440Upu.LIZ().LIZJ(this, C1123630fLV.class).LIZJ(new AfS186S0100000_17(this, 104));
            C1548820qPI.LIZLLL("live_lynx_gift_guide_popup_load_finish", this.LLJILJIL);
        }
        C1123440fLC c1123440fLCE1 = E1();
        DataChannel dataChannel = this.dataChannel;
        AwS596S0100000_17 awS596S0100000_17 = this.LLILZIL;
        AwS561S0100000_17 awS561S0100000_17 = this.LLJ;
        AwS561S0100000_17 awS561S0100000_172 = this.LLJI;
        AwS561S0100000_17 awS561S0100000_173 = this.LLJIJIL;
        c1123440fLCE1.getClass();
        boolean zLJI2 = MethodIDManager.LJI(202276);
        c1123440fLCE1.LLJJIJI = false;
        c1123440fLCE1.LLJIJIL = false;
        C20441214yg.LIZIZ("GiftGuide", "init");
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        c1123440fLCE1.LLJL = room;
        c1123440fLCE1.LLJ = dataChannel;
        c1123440fLCE1.LLIZLLLIL = this;
        c1123440fLCE1.LLILLJJLI = awS596S0100000_17;
        c1123440fLCE1.LLILLL = awS561S0100000_17;
        c1123440fLCE1.LLILZ = awS561S0100000_172;
        c1123440fLCE1.LLILZIL = awS561S0100000_173;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BaseSingleTapEvent.class, new AwS596S0100000_17(c1123440fLCE1, 411));
        }
        if (!C916790Zxt.LIZ(7)) {
            for (Class<? extends Channel<Boolean>> cls : c1123440fLCE1.LLLFZ) {
                if (dataChannel != null) {
                    dataChannel.BQ2(this, cls, new AwS596S0100000_17(c1123440fLCE1, 412));
                }
            }
            for (Class<? extends Channel<Boolean>> cls2 : c1123440fLCE1.LLLII) {
                if (dataChannel != null) {
                    dataChannel.BQ2(this, cls2, new AwS596S0100000_17(c1123440fLCE1, 413));
                }
            }
            if (dataChannel != null) {
                dataChannel.BQ2(this, LockScreenChannel.class, new AwS596S0100000_17(c1123440fLCE1, 414));
            }
            for (Class<? extends Channel<Boolean>> cls3 : c1123440fLCE1.LLLIIII) {
                if (dataChannel != null) {
                    dataChannel.BQ2(this, cls3, new AwS596S0100000_17(c1123440fLCE1, 415));
                }
            }
            C473050Igp.LIZIZ().LIZLLL.observe(this, new AObserverS221S0100000_17(c1123440fLCE1, 36));
            DataChannelGlobal.LLILZ.BQ2(c1123440fLCE1, this, SparkOpenChannel.class, new AwS596S0100000_17(c1123440fLCE1, 416));
            if (dataChannel != null) {
                dataChannel.BQ2(this, LivePinCardVisibilityChannel.class, new AwS596S0100000_17(c1123440fLCE1, 417));
                dataChannel.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(c1123440fLCE1, 418));
                dataChannel.BQ2(this, GameLinkGuestNumChannel.class, new AwS596S0100000_17(c1123440fLCE1, 408));
                dataChannel.BQ2(this, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(c1123440fLCE1, 409));
                dataChannel.BQ2(this, CompetitionLayoutChangeEvent.class, new AwS596S0100000_17(c1123440fLCE1, 410));
                dataChannel.BQ2(this, UGTaskFinishByDetailPage.class, new AwS383S0200000_17(c1123440fLCE1, dataChannel, 80));
                dataChannel.BQ2(this, SendGiftSuccessEvent.class, new AwS383S0200000_17(c1123440fLCE1, dataChannel, 81));
            }
        } else if (dataChannel != null) {
            dataChannel.BQ2(this, UGTaskFinishByDetailPage.class, new AwS383S0200000_17(c1123440fLCE1, dataChannel, 80));
            dataChannel.BQ2(this, SendGiftSuccessEvent.class, new AwS383S0200000_17(c1123440fLCE1, dataChannel, 81));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
