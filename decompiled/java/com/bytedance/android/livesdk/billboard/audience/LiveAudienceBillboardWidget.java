package com.bytedance.android.livesdk.billboard.audience;

import X.C011V;
import X.C1161920gLG;
import X.C15438062q;
import X.C201100q1;
import X.C201400q4;
import X.C201600q6;
import X.C201700q7;
import X.C2757014x;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1085190eLV;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.AObserverS221S0100000_17;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAudienceBillboardWidget extends LiveRecycleSourceWidget {
    public View LL;
    public boolean LLILLJJLI;
    public C201600q6 LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.fzc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean y1() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room == null || !C781520UlC.LJFF(room)) {
            return this.LLILZ || this.LLILZIL;
        }
        return false;
    }

    public final void A1() {
        if (y1()) {
            super.hide();
        } else {
            show();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        InterfaceC1085190eLV interfaceC1085190eLV;
        super.onResume();
        KeyEvent.Callback callback = this.LL;
        if (!(callback instanceof InterfaceC1085190eLV) || (interfaceC1085190eLV = (InterfaceC1085190eLV) callback) == null) {
            return;
        }
        interfaceC1085190eLV.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (y1()) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        if (recycleSource == RecycleSource.FROM_CONFIG_CHANGE) {
            this.LLILLJJLI = true;
        } else {
            this.LL = null;
            this.LLILLL = null;
        }
        this.LLILZ = false;
        this.LLILZIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(C201600q6 c201600q6) {
        Object tag;
        C201600q6 c201600q62;
        FrameLayout frameLayout;
        C201600q6 c201600q63;
        DisplayPosition displayPosition;
        FrameLayout.LayoutParams layoutParams;
        InterfaceC1085190eLV interfaceC1085190eLV;
        FrameLayout frameLayout2;
        View view = this.LL;
        View view2 = null;
        List<C2757014x> list = null;
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof C201600q6) {
            c201600q62 = (C201600q6) tag;
        } else {
            c201600q62 = null;
        }
        if (c201600q62 != null) {
            List<C2757014x> list2 = c201600q62.LIZ;
            ArrayList arrayList = new ArrayList();
            for (C2757014x c2757014x : list2) {
                C2757014x c2757014x2 = c2757014x;
                List<C2757014x> list3 = c201600q6.LIZ;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<C2757014x> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ.boardId, c2757014x2.LIZ.boardId)) {
                            break;
                        }
                    }
                }
                arrayList.add(c2757014x);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C2757014x) it3.next()).LIZ.boardId);
            }
            if (!arrayList.isEmpty()) {
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C2757014x) it4.next()).LIZ);
                }
                c784440UpuLIZ.LIZIZ(new C201100q1(arrayList3));
            }
        }
        if (c201600q6.LIZ.isEmpty()) {
            View view3 = this.contentView;
            if ((view3 instanceof FrameLayout) && (frameLayout2 = (FrameLayout) view3) != null) {
                C786410Ut5.LJJJJIZL(frameLayout2);
            }
            this.LL = null;
            super.hide();
            return;
        }
        View view4 = this.LL;
        if (view4 != 0) {
            Object tag2 = view4.getTag();
            if (tag2 instanceof C201600q6) {
                c201600q63 = (C201600q6) tag2;
            } else {
                c201600q63 = null;
            }
            View view5 = this.LL;
            if (view5 != null) {
                view5.setTag(c201600q6);
            }
            DisplayPosition displayPosition2 = c201600q6.LIZIZ;
            if (c201600q63 != null) {
                displayPosition = c201600q63.LIZIZ;
            } else {
                displayPosition = null;
            }
            if (!Intrinsics.LJFF(displayPosition2, displayPosition) || this.LLILLJJLI) {
                this.LLILLJJLI = false;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    if (layoutParams != null) {
                        x1(layoutParams, c201600q6.LIZIZ);
                    }
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(view4, layoutParams);
                C786410Ut5.ed(view4, 0.0f);
            }
            List<C2757014x> list4 = c201600q6.LIZ;
            if (c201600q63 != null) {
                list = c201600q63.LIZ;
            }
            if (!Intrinsics.LJFF(list4, list) && (view4 instanceof InterfaceC1085190eLV) && (interfaceC1085190eLV = (InterfaceC1085190eLV) view4) != null) {
                interfaceC1085190eLV.setupData(c201600q6);
            }
        } else {
            View viewYt0 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).Yt0(new C201700q7(getContext(), c201600q6, C011V.AUDIENCE, this, this.dataChannel, null, 32));
            if (viewYt0 != null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                x1(layoutParams3, c201600q6.LIZIZ);
                View view6 = this.contentView;
                if ((view6 instanceof FrameLayout) && (frameLayout = (FrameLayout) view6) != null) {
                    C786410Ut5.LJJJLL(frameLayout);
                    frameLayout.addView(viewYt0, layoutParams3);
                }
                viewYt0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 3));
                viewYt0.setTag(c201600q6);
                view2 = viewYt0;
            }
            this.LL = view2;
        }
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room roomLJJLIIIIJ;
        C201600q6 c201600q6 = this.LLILLL;
        if (c201600q6 != null) {
            IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
            MultiHostBoard multiHostBoardLIZJ = C201400q4.LIZJ(c201600q6);
            C011V c011v = C011V.AUDIENCE;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            iBillboardService.yw2(multiHostBoardLIZJ, c011v, roomLJJLIIIIJ);
        }
        this.dataChannel.EQ2(this, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 85));
        this.dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 86));
        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.AUDIENCE, Long.valueOf(C500260Jjc.LJJLIIIJ(this.dataChannel))).observe(this, new AObserverS221S0100000_17(this, 6));
    }

    public final void x1(FrameLayout.LayoutParams layoutParams, DisplayPosition displayPosition) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        Integer numValueOf;
        if (C497740JfY.LJIL() && displayPosition != null && (numValueOf = Integer.valueOf(displayPosition.alignment)) != null) {
            if (numValueOf.intValue() == 0) {
                i = 8388611;
            } else {
                numValueOf.intValue();
                i = 8388613;
            }
        } else {
            i = 8388613;
        }
        layoutParams.gravity = i;
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        if (C497740JfY.LJIL()) {
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126));
            if (displayPosition != null) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Long.valueOf(displayPosition.marginTop)));
            } else {
                iLIZIZ2 = 0;
            }
            iLIZIZ = iLIZIZ3 + iLIZIZ2;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(128));
        }
        layoutParams.topMargin = iLIZIZ;
    }
}
