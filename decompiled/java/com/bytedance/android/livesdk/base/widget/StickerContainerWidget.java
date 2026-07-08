package com.bytedance.android.livesdk.base.widget;

import X.AbstractC1847300yAi;
import X.C001A;
import X.C09JN;
import X.C0UO0;
import X.C1081050eEp;
import X.C1097290ef1;
import X.C1152540g68;
import X.C12ES;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1AJI;
import X.C1AJP;
import X.C1AJS;
import X.C1AJU;
import X.C1AJZ;
import X.C2177291AJb;
import X.C2177311AJd;
import X.C465900IOu;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1083170eIF;
import X.EnumC1847310yAj;
import X.InterfaceC1847290yAh;
import X.InterfaceC2177371AJj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS133S0100000_33;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.InsertStickerChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.message.BizStickerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class StickerContainerWidget extends LiveRecyclableWidget implements InterfaceC2177371AJj, OnIMMessageListener {
    public final List<Integer> LL;
    public int[] LLILLJJLI;
    public int[] LLILLL;
    public C1AJP LLILZ;
    public final Set<Sticker> LLILZIL;
    public final List<AbstractC1847300yAi> LLILZLL;
    public final List<AbstractC1847300yAi> LLIZ;
    public Room LLIZLLLIL;
    public boolean LLJ;
    public final BPEAHandler LLJI;
    public final Set<EnumC1847310yAj> LLJIJIL;
    public BizStickerMessage LLJILJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2f;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "StickerContainerWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup;
        IMessageManager iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(this.dataChannel);
        if (iMessageManagerLJJJJLL != null) {
            iMessageManagerLJJJJLL.removeMessageListener((OnIMMessageListener) this);
        }
        this.dataChannel.zQ2(this);
        this.LLJI.removeCallbacksAndMessages(null);
        C1AJP c1ajp = this.LLILZ;
        if (c1ajp != null) {
            c1ajp.e0();
        }
        this.LLILZIL.clear();
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1847300yAi) it2.next()).p0();
        }
        ((ArrayList) this.LLILZLL).clear();
        Iterator it3 = ((ArrayList) this.LLIZ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1847300yAi) it3.next()).p0();
        }
        ((ArrayList) this.LLIZ).clear();
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
        }
        C1AJP c1ajp2 = this.LLILZ;
        if (c1ajp2 != null) {
            c1ajp2.e0();
            c1ajp2.LLJJJJLIIL = null;
        }
    }

    public final void x1() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.LLILZ == null) {
            this.LLILZ = new C1AJP(new MutableContextWrapper(this.context), null, 0);
        }
        C1AJP c1ajp = this.LLILZ;
        if (c1ajp != null) {
            int[] iArr = this.LLILLJJLI;
            boolean z = this.LLJ;
            if (c1ajp.LLJJJJLIIL == null) {
                c1ajp.LLJJJJ = z;
                c1ajp.LLJJJJLIIL = this;
                c1ajp.LLJJJJJIL = iArr;
                ViewGroup.LayoutParams layoutParams = c1ajp.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1ajp);
                c1ajp.setLayoutParams(layoutParams);
                c1ajp.j0();
            }
        }
        C1AJP c1ajp2 = this.LLILZ;
        if (!(c1ajp2 instanceof View) || c1ajp2 == null) {
            return;
        }
        attachAndShow();
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && viewGroup.indexOfChild(c1ajp2) == -1) {
            View view2 = getView();
            if (!(view2 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) view2) == null) {
                return;
            }
            viewGroup2.addView(this.LLILZ);
        }
    }

    public StickerContainerWidget() {
        this.LL = LiveAnchorGiftDisableSetting.INSTANCE.getValue() ? C13BV.INSTANCE : C1697810uHb.LJIIJJI(8, 9, 10, 12, 11, 13);
        this.LLILLJJLI = new int[4];
        this.LLILLL = new int[4];
        this.LLILZIL = new LinkedHashSet();
        this.LLILZLL = new ArrayList();
        this.LLIZ = new ArrayList();
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJIJIL = new LinkedHashSet();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        BizStickerMessage bizStickerMessage = this.LLJILJIL;
        if (bizStickerMessage != null) {
            onMessage(bizStickerMessage);
            this.LLJILJIL = null;
        }
    }

    @Override // X.InterfaceC2177371AJj
    public final List<AbstractC1847300yAi> U() {
        return this.LLILZLL;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final AbstractC1847300yAi A1(RoomSticker roomSticker) {
        Object next;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return null;
        }
        Context context = this.context;
        Iterator it2 = ((ArrayList) C1097290ef1.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1847290yAh) next).getType() == roomSticker.type) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1847290yAh interfaceC1847290yAh = (InterfaceC1847290yAh) next;
        if (interfaceC1847290yAh == null) {
            return null;
        }
        return interfaceC1847290yAh.LIZ(roomSticker, context, dataChannel);
    }

    public final void B1(List<RoomSticker> list) {
        ArrayList<AbstractC1847300yAi> arrayList = new ArrayList();
        Iterator<RoomSticker> it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1847300yAi abstractC1847300yAiA1 = A1(it2.next());
            if (abstractC1847300yAiA1 != null) {
                abstractC1847300yAiA1.j0();
                arrayList.add(abstractC1847300yAiA1);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC1847300yAi> arrayList3 = new ArrayList();
        for (AbstractC1847300yAi abstractC1847300yAi : arrayList) {
            Set<EnumC1847310yAj> set = this.LLJIJIL;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<EnumC1847310yAj> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (abstractC1847300yAi.n0(it3.next())) {
                        arrayList3.add(abstractC1847300yAi);
                        break;
                    }
                }
            }
            arrayList2.add(abstractC1847300yAi);
        }
        for (AbstractC1847300yAi abstractC1847300yAi2 : arrayList3) {
            Set<EnumC1847310yAj> set2 = this.LLJIJIL;
            ArrayList arrayList4 = new ArrayList();
            for (EnumC1847310yAj enumC1847310yAj : set2) {
                if (abstractC1847300yAi2.n0(enumC1847310yAj)) {
                    arrayList4.add(enumC1847310yAj);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((ArrayList) abstractC1847300yAi2.LLJ).add(it4.next());
                abstractC1847300yAi2.hide();
            }
            ((ArrayList) this.LLIZ).add(abstractC1847300yAi2);
        }
        if (!arrayList2.isEmpty()) {
            x1();
            z1(new AwS434S0200000_33((List) arrayList2, (List<RoomSticker>) this, (StickerContainerWidget) 169));
        }
    }

    public final void C1(EnumC1847310yAj enumC1847310yAj) {
        this.LLJIJIL.add(enumC1847310yAj);
        List<AbstractC1847300yAi> list = this.LLILZLL;
        ArrayList<AbstractC1847300yAi> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((AbstractC1847300yAi) obj).n0(enumC1847310yAj)) {
                arrayList.add(obj);
            }
        }
        for (AbstractC1847300yAi abstractC1847300yAi : arrayList) {
            ((ArrayList) abstractC1847300yAi.LLJ).add(enumC1847310yAj);
            abstractC1847300yAi.hide();
            y1(abstractC1847300yAi, true);
        }
    }

    public final void D1(EnumC1847310yAj enumC1847310yAj) {
        this.LLJIJIL.remove(enumC1847310yAj);
        List<AbstractC1847300yAi> list = this.LLIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            AbstractC1847300yAi abstractC1847300yAi = (AbstractC1847300yAi) obj;
            if (abstractC1847300yAi.n0(enumC1847310yAj) && ((ArrayList) abstractC1847300yAi.LLJ).contains(enumC1847310yAj)) {
                ((ArrayList) abstractC1847300yAi.LLJ).remove(enumC1847310yAj);
                if (((ArrayList) abstractC1847300yAi.LLJ).isEmpty()) {
                    abstractC1847300yAi.u0();
                    arrayList.add(obj);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            x1();
            z1(new AwS434S0200000_33((List) arrayList, (List<RoomSticker>) this, (StickerContainerWidget) 169));
        }
    }

    @Override // X.InterfaceC2177371AJj
    public final void LJIJI(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(z, EnumC1083170eIF.STICKER_CONTAINER_WIDGET));
        }
    }

    @Override // X.InterfaceC2177371AJj
    public final void LJJJJLL(int[] iArr) {
        Iterator<AbstractC1847300yAi> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().e0(iArr);
        }
        Iterator<AbstractC1847300yAi> it3 = this.LLIZ.iterator();
        while (it3.hasNext()) {
            it3.next().e0(iArr);
        }
    }

    @Override // X.InterfaceC2177371AJj
    public final void LLILZIL(AbstractC1847300yAi abstractC1847300yAi) {
        if ((C13LP.LJJJJ(abstractC1847300yAi, this.LLILZLL) || C13LP.LJJJJ(abstractC1847300yAi, this.LLIZ)) && abstractC1847300yAi != null) {
            abstractC1847300yAi.LL.xPosition = (int) (abstractC1847300yAi.getX() + (abstractC1847300yAi.getMeasuredWidth() / 2));
            abstractC1847300yAi.LL.yPosition = (int) (abstractC1847300yAi.getY() + (abstractC1847300yAi.getMeasuredHeight() / 2));
            abstractC1847300yAi.z0();
        }
    }

    @Override // X.InterfaceC2177371AJj
    public final void LLJILLL(AbstractC1847300yAi abstractC1847300yAi) {
        if (abstractC1847300yAi != null) {
            if (C13LP.LJJJJ(abstractC1847300yAi, this.LLILZLL) || C13LP.LJJJJ(abstractC1847300yAi, this.LLIZ)) {
                abstractC1847300yAi.s0();
                if (abstractC1847300yAi.LLILZ) {
                    ((RoomStickerApi) C482260Ivg.LIZJ(RoomStickerApi.class)).deleteRoomStickers(abstractC1847300yAi.LL.id, abstractC1847300yAi.LLILLL).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00MP
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("StickerView@fe9c.deleteSticker2Server$1");
                            C1C7U.LIZIZ("StickerView@fe9c.deleteSticker2Server$1");
                        }
                    }, new C09JN() { // from class: X.00af
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("StickerView@fe9c.deleteSticker2Server$2");
                            Throwable th = (Throwable) obj;
                            try {
                                if (th instanceof Exception) {
                                    if (th instanceof C501470JlZ) {
                                        C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                                    } else {
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851990));
                                    }
                                } else {
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                            C1C7U.LIZIZ("StickerView@fe9c.deleteSticker2Server$2");
                        }
                    });
                }
                y1(abstractC1847300yAi, false);
            }
        }
    }

    public final void onEventPause(C465900IOu c465900IOu) {
        int i = c465900IOu.LIZ;
        if (i != 36) {
            if (i == 37) {
                D1(EnumC1847310yAj.PAUSE_EVENT);
                return;
            }
            return;
        }
        C1(EnumC1847310yAj.PAUSE_EVENT);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List<RoomSticker> list;
        Context context;
        MutableContextWrapper mutableContextWrapper;
        this.LLJILJIL = null;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLIZLLLIL = room;
        if (room != null) {
            room.getId();
        }
        this.LLJ = Intrinsics.LJFF(this.dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        C1AJP c1ajp = this.LLILZ;
        if (c1ajp != null) {
            Context context2 = c1ajp.getContext();
            if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                mutableContextWrapper.setBaseContext(this.context);
            }
        }
        if (isViewValid() && (context = this.context) != null) {
            int[] iArr = this.LLILLJJLI;
            iArr[0] = 0;
            iArr[1] = (((C12ES.LJIIIIZZ(context) - C497740JfY.LJIIIZ(R.dimen.azs)) - C1152540g68.LJIIIIZZ(C500260Jjc.LJIIZILJ(this.dataChannel))) - ((int) C497740JfY.LIZIZ(10.0f))) - C497740JfY.LJIIIZ(R.dimen.ajh);
            int[] iArr2 = this.LLILLJJLI;
            iArr2[2] = 0;
            iArr2[3] = C12ES.LJIIJ(this.context);
            int[] iArr3 = this.LLILLJJLI;
            this.LLILLL = Arrays.copyOf(iArr3, iArr3.length);
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.CQ2(LinkCrossRoomStateChangeEvent.class, this, new C1AJU(this));
        dataChannel.EQ2(this, UpdateStickerPositionEvent.class, new C1AJS(this));
        dataChannel.EQ2(this, SubOnlyLiveAudienceStatusChannel.class, new C2177291AJb(this));
        if (this.LLJ) {
            dataChannel.BQ2(this, PauseLiveChannel.class, new C1AJZ(this));
        } else {
            IMessageManager iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(dataChannel);
            if (iMessageManagerLJJJJLL != null) {
                iMessageManagerLJJJJLL.addMessageListener(C001A.BIZ_STICKER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
            C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS202S0100000_33(this, 6));
            dataChannel.EQ2(this, PaidEventStatusChannel.class, new C2177311AJd(this));
        }
        dataChannel.BQ2(this, InsertStickerChannel.class, new AwS612S0100000_33(this, 6));
        dataChannel.BQ2(this, DeleteStickerChannel.class, new AwS612S0100000_33(this, 7));
        Room room2 = this.LLIZLLLIL;
        if (room2 != null && (list = room2.bizStickerList) != null) {
            ArrayList arrayList = new ArrayList();
            for (RoomSticker roomSticker : list) {
                if (this.LL.contains(Integer.valueOf(roomSticker.type))) {
                    arrayList.add(roomSticker);
                }
            }
            if (C781520UlC.LIZIZ(room2) && !this.LLJ) {
                B1(C1AJI.LIZ(arrayList));
            } else {
                B1(arrayList);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BizStickerMessage bizStickerMessage;
        List<RoomSticker> list;
        Room room;
        if (this.LLJ) {
            return;
        }
        boolean z = iMessage instanceof BizStickerMessage;
        BizStickerMessage bizStickerMessage2 = null;
        if (z && (bizStickerMessage = (BizStickerMessage) iMessage) != null && (list = bizStickerMessage.bizSticker) != null) {
            ArrayList arrayList = new ArrayList();
            for (RoomSticker roomSticker : list) {
                if (this.LL.contains(Integer.valueOf(roomSticker.type))) {
                    arrayList.add(roomSticker);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (C781520UlC.LIZIZ(this.LLIZLLLIL) && (room = this.LLIZLLLIL) != null) {
                room.bizStickerList = C1AJI.LIZ(arrayList2);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                if (z) {
                    bizStickerMessage2 = (BizStickerMessage) iMessage;
                }
                this.LLJILJIL = bizStickerMessage2;
            } else {
                AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33((List) arrayList2, (List<RoomSticker>) this, (StickerContainerWidget) 1);
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    awS434S0200000_33.invoke();
                } else {
                    C786410Ut5.LJL(this.LLJI, new ARunnableS133S0100000_33(awS434S0200000_33, 17));
                }
            }
        }
    }

    public final void z1(Function0<Unit> function0) {
        if (C500260Jjc.LJJIIJ()) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS106S0100000_6((Function0) function0, 25));
        }
    }

    public final void y1(AbstractC1847300yAi abstractC1847300yAi, boolean z) {
        ViewGroup viewGroup;
        this.LLILZIL.remove(abstractC1847300yAi.getSticker());
        ((ArrayList) this.LLILZLL).remove(abstractC1847300yAi);
        if (z) {
            ((ArrayList) this.LLIZ).add(abstractC1847300yAi);
        } else {
            ((ArrayList) this.LLIZ).remove(abstractC1847300yAi);
        }
        C1AJP c1ajp = this.LLILZ;
        if (c1ajp != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1ajp, abstractC1847300yAi);
            c1ajp.removeView(abstractC1847300yAi);
        }
        if (((ArrayList) this.LLILZLL).isEmpty()) {
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
            }
        }
    }
}
