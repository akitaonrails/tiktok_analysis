package com.bytedance.android.livesdk.game.chatroom.widget;

import X.C0TKK;
import X.C0UW3;
import X.C1338270kvh;
import X.C168W;
import X.C19322110iZ;
import X.C19370910qR;
import X.C748880TZe;
import X.C786410Ut5;
import X.C930870aKb;
import X.EnumC1284950jXh;
import X.InterfaceC772390URp;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.game.broadcast.speeddetector.GamePreparationNetworkSpeedTipsDialog;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreparationDefinitionWidget extends LiveRecyclableWidget {
    public final boolean LL;
    public ImageView LLILLJJLI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LL ? R.layout.g1w : R.layout.g1v;
    }

    public GamePreparationDefinitionWidget(boolean z) {
        this.LL = z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ImageView imageView;
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> listLJ;
        PushStreamInfo.Quality qualityLIZJ;
        Map<String, PushStreamInfo.QualityList> map;
        Map<String, PushStreamInfo.Quality> map2;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        View view = getView();
        if (view != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            } else {
                fragmentManager2 = null;
            }
            C786410Ut5.I7(new ACListenerS147S0100000_12(fragmentManager2, 204), view);
        }
        View view2 = getView();
        if (view2 != null) {
            imageView = (ImageView) view2.findViewById(R.id.k00);
        } else {
            imageView = null;
        }
        this.LLILLJJLI = imageView;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
        boolean z = true;
        if (objGg0 != null) {
            Map<String, Object> map3 = C1338270kvh.LIZ;
            dataChannelGlobal.HQ2(BroadcastShareScreenDefinition.class, objGg0);
        } else {
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelGlobal.gg0(C168W.class);
            if (roomCreateInfo != null) {
                Map<Long, PushStreamInfo> map4 = roomCreateInfo.pushStreamInfoMap;
                if (map4 != null) {
                    pushStreamInfo = map4.get(4L);
                } else {
                    pushStreamInfo = null;
                }
                if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                    EnumC1284950jXh enumC1284950jXh = C19370910qR.LIZ;
                    if (pushStreamInfo != null) {
                        map = pushStreamInfo.multiQualities;
                    } else {
                        map = null;
                    }
                    listLJ = C19370910qR.LJ(map);
                    if (pushStreamInfo != null) {
                        map2 = pushStreamInfo.multiDefaultQualities;
                    } else {
                        map2 = null;
                    }
                    qualityLIZJ = C19370910qR.LIZJ(map2);
                } else if (pushStreamInfo != null) {
                    listLJ = pushStreamInfo.qualityList;
                    qualityLIZJ = pushStreamInfo.defaultQuality;
                }
                if (listLJ != null && !listLJ.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<PushStreamInfo.Quality> it2 = listLJ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().sdkKey);
                    }
                    DataChannelGlobal.LLILZ.JQ2(C930870aKb.class, arrayList);
                }
                if (qualityLIZJ != null) {
                    Map<String, Object> map5 = C1338270kvh.LIZ;
                    DataChannelGlobal.LLILZ.HQ2(BroadcastShareScreenDefinition.class, qualityLIZJ);
                }
            }
        }
        DataChannelGlobal.LLILZ.EQ2(this, this, BroadcastShareScreenDefinition.class, new AwS586S0100000_7(this, 508));
        if (InterfaceC772390URp.e.LIZIZ().floatValue() >= 0.1f) {
            Map<String, Object> map6 = C1338270kvh.LIZ;
            C0UW3.LJI = true;
            C0TKK.LJ(2, "show", "");
            Bundle bundle = new Bundle();
            bundle.putInt("enter_from", 2);
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
            } else {
                fragmentManager = null;
            }
            C19322110iZ.LIZLLL(fragmentManager, GamePreparationNetworkSpeedTipsDialog.class, "game_preparation_speed_test_tips", null, bundle);
        } else {
            C0UW3.LJI = false;
        }
        Long lLIZIZ = InterfaceC772390URp.f.LIZIZ();
        if (lLIZIZ != null && lLIZIZ.longValue() == 0) {
            z = false;
        }
        C0UW3.LJIIIIZZ = z;
    }
}
