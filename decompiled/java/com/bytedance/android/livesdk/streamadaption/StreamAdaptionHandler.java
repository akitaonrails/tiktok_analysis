package com.bytedance.android.livesdk.streamadaption;

import X.C01GW;
import X.C0KBR;
import X.C1085120eLO;
import X.C1088930eRX;
import X.C1088940eRY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C784440Upu;
import X.C786410Ut5;
import X.C963140bAe;
import X.EnumC1105670esX;
import X.InterfaceC1105690esZ;
import Y.AComparatorS36S0000000_17;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.live.dynamicstrategy.StreamAdaptionInputEnableEvent;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.setting.LiveStreamCommentAdapterAnimSetting;
import com.bytedance.android.live.setting.LiveStreamCommentAdapterSetting;
import com.bytedance.android.live.setting.LiveStreamECPanelEnhancedAdapterSetting;
import com.bytedance.android.live.setting.LiveStreamPanelAdapterSetting;
import com.bytedance.android.live.setting.LiveStreamPdpPanelAdapterSetting;
import com.bytedance.android.livesdk.dataChannel.WatchPauseLiveChannel;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcSeaPdpStreamAdaptionEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveFixStreamAdaptionSetting;
import com.bytedance.android.livesdk.model.message.SubjectPositionInfo;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class StreamAdaptionHandler implements LifecycleEventObserver, InterfaceC1105690esZ {
    public final DataChannel LL;
    public final View LLILLJJLI;
    public boolean LLILLL = true;
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(1));
    public final C01GW LLILZIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(2));
    public Animator LLILZLL;
    public int LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public final List<EnumC1105670esX> LLJILLL;
    public final PriorityQueue<C0KBR> LLJJ;
    public final Map<String, C0KBR> LLJJI;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.streamadaption.StreamAdaptionHandler.LJFF():void");
    }

    @Override // X.InterfaceC1105690esZ
    public final boolean LIZ() {
        C1088940eRY c1088940eRY;
        if (!this.LLILLL || this.LLJ || this.LLJIJIL) {
            return false;
        }
        IEPIStrategyService iEPIStrategyService = (IEPIStrategyService) this.LLILZ.getValue();
        Object objT12 = iEPIStrategyService != null ? iEPIStrategyService.T12(this.LL, C1088930eRX.LIZLLL.LIZ) : null;
        return (!(objT12 instanceof C1088940eRY) || (c1088940eRY = (C1088940eRY) objT12) == null || LIZJ(c1088940eRY) == null) ? false : true;
    }

    public static C1088940eRY LIZJ(C1088940eRY c1088940eRY) {
        long j;
        if (c1088940eRY.LIZ == null) {
            return null;
        }
        long jLIZJ = C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        SubjectPositionInfo subjectPositionInfo = c1088940eRY.LIZ;
        if (subjectPositionInfo != null) {
            j = subjectPositionInfo.expireTime;
        } else {
            j = 0;
        }
        if (jLIZJ >= j) {
            return null;
        }
        return c1088940eRY;
    }

    public final void LIZLLL(int i) {
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        IWatchLiveService iWatchLiveService = (IWatchLiveService) this.LLILZIL.getValue();
        if (iWatchLiveService != null && iWatchLiveService.zp0()) {
            if (this.LLILLJJLI.getTranslationY() != 0.0f) {
                C786410Ut5.ed(this.LLILLJJLI, 0.0f);
                return;
            }
            return;
        }
        C786410Ut5.ed(this.LLILLJJLI, -i);
    }

    public final void LJ(int i) {
        if (i == this.LLIZ) {
            this.LLJILJIL = 0;
            LIZLLL(i);
            return;
        }
        this.LLJILJIL = i;
        if (LiveStreamCommentAdapterAnimSetting.INSTANCE.getValue()) {
            float f = i;
            if (f != this.LLILLJJLI.getTranslationY()) {
                Animator animator = this.LLILZLL;
                if (animator != null) {
                    animator.cancel();
                }
                IWatchLiveService iWatchLiveService = (IWatchLiveService) this.LLILZIL.getValue();
                if (iWatchLiveService != null && iWatchLiveService.zp0()) {
                    if (this.LLILLJJLI.getTranslationY() != 0.0f) {
                        C786410Ut5.ed(this.LLILLJJLI, 0.0f);
                        return;
                    }
                    return;
                } else {
                    View view = this.LLILLJJLI;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), -f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.setStartDelay(100L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    this.LLILZLL = objectAnimatorOfFloat;
                    return;
                }
            }
            return;
        }
        LIZLLL(i);
    }

    public final int LIZIZ(int i, SubjectPositionInfo subjectPositionInfo) {
        if (subjectPositionInfo == null) {
            return 0;
        }
        float height = this.LLILLJJLI.getHeight() * subjectPositionInfo.topOffset;
        float height2 = this.LLILLJJLI.getHeight() * 0.04f;
        float height3 = this.LLILLJJLI.getHeight() * subjectPositionInfo.centerOffset;
        int height4 = (this.LLILLJJLI.getHeight() - i) / 2;
        float f = height3 - height4;
        if (f < 0.0f) {
            return 0;
        }
        if (height - f < height2) {
            f = height - height2;
        }
        float f2 = i;
        if (f > f2) {
            f = f2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("headOffset: ");
        sbLIZ.append(height);
        sbLIZ.append(", containerSafeOffset: ");
        sbLIZ.append(height2);
        sbLIZ.append(", bodyCenterOffset: ");
        sbLIZ.append(height3);
        sbLIZ.append(", availableAreaCenterOffset: ");
        sbLIZ.append(height4);
        sbLIZ.append(", panelScrollOffset: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("StreamAdaptionHandler", C2188811AlT.LIZIZ(sbLIZ));
        return (int) f;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            Animator animator = this.LLILZLL;
            if (animator != null) {
                animator.cancel();
            }
            LIZLLL(this.LLIZ);
            this.LLJI = false;
        }
    }

    public StreamAdaptionHandler(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = view;
        ArrayList arrayList = new ArrayList();
        this.LLJILLL = arrayList;
        this.LLJJ = new PriorityQueue<>(4, new AComparatorS36S0000000_17(0));
        this.LLJJI = new LinkedHashMap();
        new StreamAdaptionController(lifecycleOwner, dataChannel);
        this.LLIZ = (int) view.getTranslationY();
        this.LLIZLLLIL = (int) view.getTranslationY();
        lifecycleOwner.getLifecycle().addObserver(this);
        LiveStreamPanelAdapterSetting liveStreamPanelAdapterSetting = LiveStreamPanelAdapterSetting.INSTANCE;
        if (liveStreamPanelAdapterSetting.getValue()) {
            arrayList.add(EnumC1105670esX.TOP_VIEWER);
            arrayList.add(EnumC1105670esX.SHARE);
            arrayList.add(EnumC1105670esX.GIFT);
            arrayList.add(EnumC1105670esX.PROFILE);
        }
        LiveStreamECPanelEnhancedAdapterSetting liveStreamECPanelEnhancedAdapterSetting = LiveStreamECPanelEnhancedAdapterSetting.INSTANCE;
        if (liveStreamECPanelEnhancedAdapterSetting.getValue()) {
            arrayList.add(EnumC1105670esX.EC);
        }
        LiveStreamPdpPanelAdapterSetting liveStreamPdpPanelAdapterSetting = LiveStreamPdpPanelAdapterSetting.INSTANCE;
        if (liveStreamPdpPanelAdapterSetting.getValue()) {
            arrayList.add(EnumC1105670esX.PDP);
        }
        if (LiveStreamCommentAdapterSetting.INSTANCE.getValue()) {
            if (LiveFixStreamAdaptionSetting.INSTANCE.getValue()) {
                arrayList.add(EnumC1105670esX.COMMENT);
            }
            C784440Upu.LIZ().LIZJ(lifecycleOwner, C1085120eLO.class).LIZJ(new AfS186S0100000_17(this, 2));
        }
        dataChannel.BQ2(lifecycleOwner, EcSeaPdpStreamAdaptionEvent.class, new AwS596S0100000_17(this, 1));
        if (liveStreamPanelAdapterSetting.getValue() || liveStreamECPanelEnhancedAdapterSetting.getValue() || liveStreamPdpPanelAdapterSetting.getValue()) {
            dataChannel.BQ2(lifecycleOwner, PanelStateEvent.class, new AwS596S0100000_17(this, 2));
            dataChannel.BQ2(lifecycleOwner, GiftDialogHeightChannel.class, new AwS596S0100000_17(this, 3));
        }
        dataChannel.EQ2(lifecycleOwner, StreamAdaptionInputEnableEvent.class, new AwS596S0100000_17(this, 4));
        dataChannel.EQ2(lifecycleOwner, WatchPauseLiveChannel.class, new AwS596S0100000_17(this, 5));
        dataChannel.EQ2(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 6));
        dataChannel.EQ2(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 7));
    }
}
