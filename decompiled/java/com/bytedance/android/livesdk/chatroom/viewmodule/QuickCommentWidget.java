package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C001A;
import X.C0163003d;
import X.C01GW;
import X.C09JN;
import X.C0DXR;
import X.C0IFW;
import X.C0IJT;
import X.C0J1N;
import X.C0K9Q;
import X.C0UO0;
import X.C1114840f7K;
import X.C1114850f7L;
import X.C1114880f7O;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C13LQ;
import X.C195900pB;
import X.C20441214yg;
import X.C204543151x;
import X.C292401Bi;
import X.C470590Icr;
import X.C474500IjA;
import X.C480460Ism;
import X.C494680Jac;
import X.C497120JeY;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516201zk;
import X.C5183020f;
import X.C749410TaV;
import X.C776250Uch;
import X.C778700Uge;
import X.C786410Ut5;
import X.EnumC1134120fcQ;
import X.InterfaceC1114710f77;
import X.RunnableC514801zW;
import Y.AsS44S0100000_17;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.FirstGiftQuickComment;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.IsFromWatchFocusTray;
import com.bytedance.android.live.LiveCommentQuickEmojiSetting;
import com.bytedance.android.live.QuickCommentGiftSubChannel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.room.GameMomentChannel;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.model.QuickCommentIsShowing;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.GameRecommendQuickCommentChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveGameMomentQuickCommentExpand;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS82S1300000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class QuickCommentWidget extends AnimatableRecyclableWidget implements OnMessageListener, Handler.Callback, InterfaceC1114710f77, C0IFW {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final C01GW LL = C292401Bi.LIZ(new AwS561S0100000_17(this, 131));
    public final C1114840f7K LLILLJJLI = new C1114840f7K(this, this);
    public Room LLILLL;
    public final ISubscriptionStatusService LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final long LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public C1114850f7L LLJILJILJ;
    public final BPEAHandler LLJILLL;
    public C195900pB LLJJ;
    public C11NJ LLJJI;
    public final List<Runnable> LLJJIII;
    public boolean LLJJIJI;
    public C195900pB LLJJIJIIJIL;
    public String LLJJIJIL;
    public int LLJJJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h3t;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1114710f77
    public final void w() {
        this.LLJJJ = 3;
        x1();
    }

    public final void x1() {
        this.LLILZIL = false;
        this.LLJJ = null;
        this.LLJILLL.removeMessages(1);
        if (isShowing()) {
            hide();
            cancelHideAnimation();
            this.dataChannel.zW(QuickCommentIsShowing.class, Boolean.FALSE);
        }
    }

    @Override // X.C0IFW
    public final void cancel() {
        C11NJ c11nj = this.LLJJI;
        if (c11nj != null) {
            c11nj.dispose();
        }
    }

    @Override // X.C0IFW
    public final void pause() {
        C20441214yg.LJIIIZ("matao-test", "QuickComment pause");
        this.LLJJIJI = true;
    }

    @Override // X.C0IFW
    public final void resume() {
        C20441214yg.LJIIIZ("matao-test", "QuickComment resume");
        this.LLJJIJI = false;
        if (((ArrayList) this.LLJJIII).isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        ((ArrayList) this.LLJJIII).clear();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String str = this.LLIZ ? "click_comment" : "auto";
        this.LLJJIJIL = str;
        Iterator<C1114880f7O> it2 = this.LLILLJJLI.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL = str;
        }
        C1114850f7L c1114850f7L = this.LLJILJILJ;
        if (c1114850f7L != null) {
            c1114850f7L.LJFF = this.LLJJIJIL;
        }
        super.show();
    }

    public final boolean y1() {
        return this.LLILZ.m70(this.LLILLL).LIZ;
    }

    public QuickCommentWidget() {
        ISubscriptionStatusService.LJIIIZ.getClass();
        this.LLILZ = C0K9Q.LIZ();
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLJ = Long.MAX_VALUE;
        this.LLJIJIL = Long.MAX_VALUE;
        this.LLJILJIL = "";
        this.LLJILLL = new BPEAHandler(Looper.getMainLooper(), this);
        this.LLJJIII = new ArrayList();
        this.LLJJIJIL = "auto";
        this.LLJJJ = 1;
    }

    @Override // X.C0IFW
    public final void W() {
        cancel();
        ((ArrayList) this.LLJJIII).clear();
        this.LLJILLL.removeCallbacksAndMessages(null);
        this.LLJJIJI = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (isShowing() && this.LLJJJ != -1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_quick_comment_vanish");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(this.LLJJIJIL, "show_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLJJJ), "vanish_type");
            c474500IjALIZ.LIZ();
        }
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        x1();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        super.onHideAnimationStart();
        View view = (View) this.LL.getValue();
        if (view != null) {
            view.setEnabled(false);
        }
    }

    public final void A1(C195900pB c195900pB) {
        long j;
        if (c195900pB == null) {
            return;
        }
        long j2 = c195900pB.LIZJ;
        C195900pB c195900pB2 = this.LLJJ;
        if (c195900pB2 != null) {
            j = c195900pB2.LIZJ;
        } else {
            j = 0;
        }
        if (j2 >= j) {
            this.LLJJ = c195900pB;
            if ((this.LLIZ && !c195900pB.LJFF) || c195900pB.LJFF) {
                B1(c195900pB);
            }
        }
    }

    public final void B1(C195900pB c195900pB) {
        String str;
        Object obj;
        boolean zLJFF;
        C204543151x c204543151x;
        Object obj2;
        String str2 = "";
        if (c195900pB == null || (str = c195900pB.LIZLLL) == null) {
            str = "";
        }
        boolean z = true;
        int iLIZIZ = 0;
        if ((CardStruct.IStatusCode.DEFAULT.equals(str) && LiveCommentQuickEmojiSetting.isForbidQuickComment(this.LLILLL)) || c195900pB == null) {
            return;
        }
        ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).H42(this);
        C1114840f7K c1114840f7K = this.LLILLJJLI;
        c1114840f7K.LLILLJJLI.clear();
        c1114840f7K.LLILLL = c195900pB;
        List<QuickChatContent> list = c195900pB.LIZ;
        if (list != null) {
            QuickCommentWidget quickCommentWidget = c1114840f7K.LLILZ;
            Iterator<QuickChatContent> it2 = list.iterator();
            while (it2.hasNext()) {
                c1114840f7K.LLILLJJLI.add(new C1114880f7O(it2.next(), quickCommentWidget.dataChannel));
            }
        }
        c1114840f7K.notifyDataSetChanged();
        C1114850f7L c1114850f7L = this.LLJILJILJ;
        if (c1114850f7L != null) {
            c1114850f7L.LJ = c195900pB.LIZLLL;
        }
        DataChannel dataChannel = this.dataChannel;
        Boolean bool = Boolean.TRUE;
        dataChannel.zW(QuickCommentIsShowing.class, bool);
        this.LLJILLL.removeMessages(1);
        C786410Ut5.LJLJJI(1, TimeUnit.SECONDS.toMillis(c195900pB.LIZIZ), this.LLJILLL);
        show();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.LJFF(c195900pB.LIZLLL, "1")) {
            if (c195900pB.LJ) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("quick_comment_subscribe_type", obj2);
        }
        if (Intrinsics.LJFF(c195900pB.LIZLLL, "3")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_gift_quick_comment", obj);
        if (Intrinsics.LJFF(c195900pB.LIZLLL, "2")) {
            str2 = "2";
        } else if (Intrinsics.LJFF(c195900pB.LIZLLL, "1")) {
            str2 = "1";
        }
        if (str2.length() != 0) {
            linkedHashMap.put("quick_comment_subscribe_show_type", str2);
        }
        if (Intrinsics.LJFF(c195900pB.LIZLLL, "5")) {
            linkedHashMap.put("is_ecom_quick", "1");
        }
        if (C497740JfY.LJIL()) {
            linkedHashMap.put("room_orientation", "portrait");
        } else {
            linkedHashMap.put("room_orientation", "landscape");
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            zLJFF = Intrinsics.LJFF(dataChannel2.gg0(IsFromWatchFocusTray.class), bool);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            linkedHashMap.put("is_game_highlight_broadcast", "1");
        } else {
            linkedHashMap.put("is_game_highlight_broadcast", CardStruct.IStatusCode.DEFAULT);
        }
        if (C13LQ.LJJIJIIJI(c195900pB.LIZLLL, new String[]{"7", "8", "9"}) < 0) {
            z = false;
        }
        if (z) {
            linkedHashMap.put("from_game_highlight_moment", "1");
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (c204543151x = (C204543151x) dataChannel3.gg0(GameMomentChannel.class)) != null) {
                iLIZIZ = c204543151x.LIZIZ();
            }
            linkedHashMap.put("highlight_moment_type", C778700Uge.LIZ(iLIZIZ));
        } else {
            linkedHashMap.put("from_game_highlight_moment", CardStruct.IStatusCode.DEFAULT);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_quick_comment_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            Room room = this.LLILLL;
            if (room != null) {
                C480460Ism.LIZ().getClass();
                ((C0J1N) ((CommentApi) C480460Ism.LIZLLL(CommentApi.class)).sendChatEvent(room.getId(), 1).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this))).LIZ(new C09JN() { // from class: X.0f7Q
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("QuickCommentWidget@bd17.handleMessage$1$1");
                        C1C7U.LIZIZ("QuickCommentWidget@bd17.handleMessage$1$1");
                    }
                }, new C09JN() { // from class: X.0f7R
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("QuickCommentWidget@bd17.handleMessage$1$2");
                        C1C7U.LIZIZ("QuickCommentWidget@bd17.handleMessage$1$2");
                    }
                });
            }
            this.LLJJJ = 1;
            if (!isShowing()) {
                x1();
                return true;
            }
            animateHide();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1114850f7L c1114850f7L;
        this.LLJILJILJ = new C1114850f7L();
        RecyclerView recyclerView = (RecyclerView) this.LL.getValue();
        if (recyclerView != null && (c1114850f7L = this.LLJILJILJ) != null) {
            c1114850f7L.LIZLLL = recyclerView;
            recyclerView.addOnScrollListener(new AsS44S0100000_17(c1114850f7L, 4));
        }
        RecyclerView recyclerView2 = (RecyclerView) this.LL.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILLJJLI);
        }
        RecyclerView recyclerView3 = (RecyclerView) this.LL.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0f7P
                public final int LL = (int) C497740JfY.LIZIZ(8.0f);

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    boolean z;
                    super.LIZIZ(rect, view, recyclerView4, c21673919s1);
                    if (view.getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (recyclerView4.getChildAdapterPosition(view) < this.LLILLJJLI.LLILLJJLI.getItemCount() - 1) {
                        if (z) {
                            rect.left = this.LL;
                            rect.right = 0;
                            return;
                        } else {
                            rect.right = this.LL;
                            rect.left = 0;
                            return;
                        }
                    }
                    rect.left = 0;
                    rect.right = 0;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r3 = true;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
        /*
            r10 = this;
            boolean r1 = r11 instanceof com.bytedance.android.livesdk.model.message.RoomVerifyMessage
            r0 = 0
            if (r1 == 0) goto L8
            r0 = r11
            com.bytedance.android.livesdk.model.message.RoomVerifyMessage r0 = (com.bytedance.android.livesdk.model.message.RoomVerifyMessage) r0
        L8:
            r3 = 0
            if (r0 == 0) goto L13
            int r1 = r0.verifyAction
            r0 = 3
            if (r1 != r0) goto L13
            r10.x1()
        L13:
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.model.message.QuickChatListMessage
            if (r0 == 0) goto L59
            com.bytedance.android.livesdk.model.message.QuickChatListMessage r11 = (com.bytedance.android.livesdk.model.message.QuickChatListMessage) r11
            if (r11 == 0) goto L59
            java.util.List<com.bytedance.android.livesdk.model.message.QuickChatContent> r8 = r11.contentList
            long r4 = r11.duration
            long r6 = r11.priority
            java.lang.String r1 = r11.scene
            java.lang.String r0 = "commerce"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5a
            java.lang.String r9 = "5"
        L2d:
            java.util.List<com.bytedance.android.livesdk.model.message.QuickChatContent> r0 = r11.contentList
            java.util.Iterator r2 = r0.iterator()
        L33:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.model.message.QuickChatContent r0 = (com.bytedance.android.livesdk.model.message.QuickChatContent) r0
            com.bytedance.android.live.base.model.emoji.EmoteModel r0 = r0.emote
            if (r0 == 0) goto L33
            if (r1 != 0) goto L47
        L46:
            r3 = 1
        L47:
            r3 = r3 ^ 1
            X.00pB r2 = new X.00pB
            r2.<init>(r3, r4, r6, r8, r9)
            boolean r0 = r10.LLILZIL
            if (r0 != 0) goto L56
            boolean r0 = r10.LLILZLL
            if (r0 == 0) goto L59
        L56:
            r10.A1(r2)
        L59:
            return
        L5a:
            java.lang.String r1 = r11.scene
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L67
            java.lang.String r9 = "6"
            goto L2d
        L67:
            java.lang.String r9 = "0"
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        this.LLJJJ = -1;
        x1();
        this.LLJJIJIIJIL = null;
        this.LLIZ = false;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).bF1(this);
        C1114850f7L c1114850f7L = this.LLJILJILJ;
        if (c1114850f7L != null) {
            c1114850f7L.LIZJ = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        boolean zBooleanValue;
        boolean zLJFF;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        UserAttr userAttr;
        View view = (View) this.LL.getValue();
        if (view != null) {
            view.setEnabled(true);
        }
        C1114850f7L c1114850f7L = this.LLJILJILJ;
        if (c1114850f7L != null) {
            c1114850f7L.LIZJ = this.dataChannel;
        }
        this.LLILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLJJJ = -1;
        x1();
        this.LLJJJ = 5;
        this.LLILZIL = true;
        this.LLILZLL = true;
        Boolean bool = (Boolean) this.dataChannel.gg0(ECLiveStatusChangeChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZLLLIL = zBooleanValue;
        if (!UserService.getInstance().user().isLogin()) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        User user = (User) this.dataChannel.gg0(RoomUserChannel.class);
        if (user != null && (userAttr = user.getUserAttr()) != null && userAttr.isMuted) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        this.dataChannel.EQ2(this, BanTalkEvent.class, new AwS596S0100000_17(this, 310));
        this.dataChannel.EQ2(this, CommentStatusChannel.class, new C5183020f(this, 155));
        Room room = this.LLILLL;
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && roomAuthStatus2.getQuickCommentState() == 2) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        Room room2 = this.LLILLL;
        if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null && !roomAuthStatus.enableChat) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        if (UserService.getInstance().user().LJIJI(EnumC1134120fcQ.COMMENT)) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        Room room3 = this.LLILLL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (C494680Jac.LJIIJJI(zLJFF, room3) && !y1()) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        this.dataChannel.BQ2(this, SubscribeSubOnlyChatChangeEvent.class, new AwS596S0100000_17(this, 298));
        Integer num = (Integer) this.dataChannel.gg0(SelectPollShowChannel.class);
        if (num != null && num.intValue() > 0) {
            this.LLILZIL = false;
            this.LLILZLL = false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        dataChannel2.EQ2(this, WarningInfoVisibilityEvent.class, new AwS596S0100000_17(this, 301));
        dataChannel2.EQ2(this, FrameL3SlotVisibilityChannel.class, new C5183020f(this, 154));
        dataChannel2.EQ2(this, SelectPollShowChannel.class, new AwS596S0100000_17(this, 302));
        dataChannel2.BQ2(this, PartnershipPromoteGameCardShowChannel.class, new AwS596S0100000_17(this, 303));
        dataChannel2.BQ2(this, LiveEventCardVisibility.class, new AwS596S0100000_17(this, 304));
        dataChannel2.BQ2(this, LivePinCardVisibilityChannel.class, new AwS596S0100000_17(this, 305));
        dataChannel2.EQ2(this, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 306));
        dataChannel2.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 307));
        C11NJ c11nj = this.LLJJI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLJJI = new C11NJ();
        DataChannel dataChannel3 = this.dataChannel;
        dataChannel3.EQ2(this, QuickCommentGiftSubChannel.class, new C5183020f(this, 103));
        dataChannel3.EQ2(this, GameRecommendQuickCommentChannel.class, new C5183020f(this, 104));
        dataChannel3.EQ2(this, FirstGiftQuickComment.class, new AwS596S0100000_17(this, 101));
        dataChannel3.EQ2(this, ECLiveStatusChangeChannel.class, new C5183020f(this, 105));
        if (TtliveGameMomentQuickCommentExpand.INSTANCE.enableQuickComment()) {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.BQ2(this, GameMomentChannel.class, new AwS596S0100000_17(this, 102));
            }
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.BQ2(this, IsFromWatchFocusTray.class, new AwS596S0100000_17(this, 103));
            }
        }
        this.dataChannel.BQ2(this, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 308));
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.QUICK_CHAT_LIST_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
        if (this.LLILZIL && C500260Jjc.LJJIII(C497740JfY.LIZ)) {
            C786410Ut5.LJJZZIII(this.LLJILLL, new RunnableC514801zW(this, 92));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if ((dataChannel6 == null || !Intrinsics.LJFF(dataChannel6.gg0(C749410TaV.class), Boolean.FALSE)) && this.LLILZIL && !this.LLIZLLLIL && this.LLJJIJIIJIL == null) {
            C786410Ut5.LJLIIL(3000L, this.LLJILLL, new RunnableC514801zW(this, 38));
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 != null) {
                dataChannel7.SX0(C749410TaV.class, Boolean.FALSE);
            }
        }
    }

    public final void z1(JSONObject jSONObject, final String str, boolean z) {
        String strJ3;
        C11NZ<C470590Icr<C0163003d>> c11nzQueryQuickComments;
        Room room = this.LLILLL;
        if (room != null) {
            final boolean z2 = !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT);
            if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/room/quick_chat_list/")) {
                c11nzQueryQuickComments = C497120JeY.LJIIZILJ.LIZIZ("/webcast/room/quick_chat_list/", new AwS82S1300000_17(room, this, str, jSONObject, 0));
            } else {
                C480460Ism.LIZ().getClass();
                CommentApi commentApi = (CommentApi) C480460Ism.LIZLLL(CommentApi.class);
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                boolean zY1 = y1();
                if (jSONObject == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
                    strJ3 = "";
                }
                c11nzQueryQuickComments = commentApi.queryQuickComments(id, ownerUserId, zY1, str, strJ3);
            }
            C11JF c11jfLIZ = ((C0J1N) c11nzQueryQuickComments.LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this))).LIZ(new C09JN() { // from class: X.00pA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("QuickCommentWidget@bd17.queryQuickComments$1$1");
                    final C470590Icr c470590Icr = (C470590Icr) obj;
                    final QuickCommentWidget quickCommentWidget = this.LL;
                    final boolean z3 = z2;
                    final String str2 = str;
                    Runnable runnable = new Runnable() { // from class: X.00p9
                        public final void LIZ() {
                            C0163003d c0163003d;
                            List<EmoteModel> list;
                            C0163003d c0163003d2;
                            List<String> list2;
                            QuickCommentWidget quickCommentWidget2 = quickCommentWidget;
                            if ((quickCommentWidget2.LLILZIL || ((quickCommentWidget2.LLILZLL && z3) || Intrinsics.LJFF(str2, "3"))) && !quickCommentWidget.LLIZLLLIL) {
                                C470590Icr<C0163003d> c470590Icr2 = c470590Icr;
                                List listLJJJJLI = null;
                                List listLJJJJLI2 = (c470590Icr2 == null || (c0163003d2 = c470590Icr2.data) == null || (list2 = c0163003d2.list) == null) ? null : C13LP.LJJJJLI(list2);
                                C470590Icr<C0163003d> c470590Icr3 = c470590Icr;
                                if (c470590Icr3 != null && (c0163003d = c470590Icr3.data) != null && (list = c0163003d.emoteList) != null) {
                                    listLJJJJLI = C13LP.LJJJJLI(list);
                                }
                                if ((listLJJJJLI2 != null && !listLJJJJLI2.isEmpty()) || (listLJJJJLI != null && !listLJJJJLI.isEmpty())) {
                                    quickCommentWidget.A1(C0162003c.LIZ(c470590Icr.data, str2, false));
                                    return;
                                }
                                QuickCommentWidget quickCommentWidget3 = quickCommentWidget;
                                if (quickCommentWidget3.LLJJ == null) {
                                    quickCommentWidget3.x1();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("QuickCommentWidget@bd17.queryQuickComments$1$1$pausedRunnable$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("QuickCommentWidget@bd17.queryQuickComments$1$1$pausedRunnable$1");
                        }
                    };
                    if (!quickCommentWidget.LLJJIJI) {
                        runnable.run();
                    } else {
                        ((ArrayList) quickCommentWidget.LLJJIII).add(runnable);
                    }
                    C1C7U.LIZIZ("QuickCommentWidget@bd17.queryQuickComments$1$1");
                }
            }, new C516201zk(this, 124));
            C11NJ c11nj = this.LLJJI;
            if (c11nj != null) {
                c11nj.LIZ(c11jfLIZ);
            }
        }
    }
}
