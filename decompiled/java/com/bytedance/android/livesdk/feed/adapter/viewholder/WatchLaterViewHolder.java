package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.C01GW;
import X.C0IJT;
import X.C0KVU;
import X.C0P0T;
import X.C11NJ;
import X.C1324720kZq;
import X.C13LP;
import X.C1697810uHb;
import X.C1819620xS4;
import X.C418440Gaw;
import X.C452501pT;
import X.C468770IZv;
import X.C474500IjA;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1106030et7;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS10S1200000_4;
import Y.AfS176S0100000_7;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;
import webcast.api.feed.WatchLaterInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchLaterViewHolder extends DrawerFollowingViewHolder {
    public static final /* synthetic */ int LLJJJ = 0;
    public final boolean LLIZ;
    public final View LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public FeedItem LLJJI;
    public int LLJJIII;
    public C11NJ LLJJIJI;
    public C0P0T LLJJIJIIJIL;
    public final ARunnableS107S0100000_7 LLJJIJIL;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void L5() {
        if (this.itemView.getContext() == null || this.LLILLJJLI || !this.LL) {
            return;
        }
        this.LLILLJJLI = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
        c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZ.LJJII("toplive_live_cover", "enter_method");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(1, "is_watch_later");
        c474500IjALIZ.LJJII(22, "room_source");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJJIII), "room_position");
        CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
        FeedItem feedItem = this.LLJJI;
        if (feedItem != null) {
            long j = feedItem.receiveTime;
            if (j > 0) {
                long jUptimeMillis = SystemClock.uptimeMillis() - j;
                c474500IjALIZ.LJJII(String.valueOf(jUptimeMillis >= 0 ? jUptimeMillis : 0L), "latency_show_entrance_interval");
            }
        }
        c474500IjALIZ.LIZ();
    }

    public final void N5() {
        C0P0T c0p0t;
        HandlerHook.viewRemoveCallbacks(this.LLIZLLLIL, this.LLJJIJIL);
        C0P0T c0p0t2 = this.LLJJIJIIJIL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LLJJIJIIJIL) != null) {
            c0p0t.dismiss();
        }
        this.LLJJIJIIJIL = null;
    }

    public final C1324720kZq R5() {
        return (C1324720kZq) this.LLJJ.getValue();
    }

    public final C1324720kZq S5() {
        return (C1324720kZq) this.LLJILJIL.getValue();
    }

    public final C1324720kZq T5() {
        return (C1324720kZq) this.LLJIJIL.getValue();
    }

    public final C1324720kZq U5() {
        return (C1324720kZq) this.LLJILLL.getValue();
    }

    public final C1324720kZq V5() {
        return (C1324720kZq) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C11NJ c11nj = new C11NJ();
        this.LLJJIJI = c11nj;
        c11nj.LIZ(C784440Upu.LIZ().LJ(C468770IZv.class).LJJLJLI(new AfS176S0100000_7(this, 59)));
        Boolean boolLIZ = InterfaceC1106030et7.M9.LIZ();
        boolean zBooleanValue = boolLIZ != null ? boolLIZ.booleanValue() : true;
        Boolean boolLIZ2 = InterfaceC1106030et7.N9.LIZ();
        boolean zBooleanValue2 = boolLIZ2 != null ? boolLIZ2.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2 && !this.LLIZ) {
            HandlerHook.viewRemoveCallbacks(this.LLIZLLLIL, this.LLJJIJIL);
            HandlerHook.viewPostDelay(this.LLIZLLLIL, this.LLJJIJIL, 1000L);
        }
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null) {
            DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwner, TopLiveSkylightVisibilityChannel.class, new AwS586S0100000_7(this, 102));
        }
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void onViewDetachedFromWindow() {
        moveToStopState();
        C11NJ c11nj = this.LLJJIJI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLJJIJI = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        N5();
    }

    public static int P5(String str, List list) {
        int i = 0;
        if (!a0.LJJIJIIJIL(str, (char) 8230)) {
            return 0;
        }
        int length = str.length() - 1;
        int i2 = 0;
        int length2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str2 = (String) obj;
                if (i2 > 0) {
                    length2++;
                }
                if (length2 >= length) {
                    i++;
                }
                length2 += str2.length();
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return i;
    }

    public static void W5(C1324720kZq c1324720kZq, User user) {
        ImageModel avatarThumb;
        List urls;
        String str;
        if (c1324720kZq != null && (avatarThumb = user.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null) {
            C1819620xS4.LIZ().LJIJJLI(str, "toplive_window").LJJI(c1324720kZq);
        }
    }

    public WatchLaterViewHolder(View view, LifecycleOwner lifecycleOwner, boolean z) {
        super(view, lifecycleOwner);
        this.LLIZ = z;
        this.LLIZLLLIL = view.findViewById(R.id.g_s);
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(view, 57));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(view, 18));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(view, 54));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(view, 53));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(view, 56));
        this.LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(view, 55));
        this.LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(view, 52));
        this.LLJJIJIL = new ARunnableS107S0100000_7(this, 81);
    }

    public static void X5(int i, int i2, int i3, C1324720kZq c1324720kZq) {
        if (c1324720kZq == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1324720kZq.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        C786410Ut5.u6(c1324720kZq, layoutParams);
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        User owner;
        this.LLJJI = feedItem;
        this.LLJJIII = i;
        WatchLaterInfo watchLaterInfo = feedItem.watchLaterInfo;
        if (watchLaterInfo == null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 55), this.LLIZLLLIL);
            return;
        }
        List<User> list = watchLaterInfo.anchorList;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        C500260Jjc.LJIILIIL(T5());
                        X5(28, 3, 16, S5());
                        X5(18, 36, 19, V5());
                        X5(14, 27, 4, U5());
                        X5(10, 26, 42, R5());
                        C500260Jjc.LLFFF((View) this.LLJI.getValue());
                        C500260Jjc.LLFFF(S5());
                        C500260Jjc.LLFFF(V5());
                        C500260Jjc.LLFFF(U5());
                        C500260Jjc.LLFFF(R5());
                        W5(S5(), (User) ListProtector.get(list, 0));
                        W5(V5(), (User) ListProtector.get(list, 1));
                        W5(U5(), (User) ListProtector.get(list, 2));
                        W5(R5(), (User) ListProtector.get(list, 3));
                    } else {
                        C500260Jjc.LJIILIIL(T5());
                        X5(28, 9, 24, S5());
                        X5(18, 17, 3, V5());
                        X5(14, 39, 21, U5());
                        C500260Jjc.LLFFF((View) this.LLJI.getValue());
                        C500260Jjc.LLFFF(S5());
                        C500260Jjc.LLFFF(V5());
                        C500260Jjc.LLFFF(U5());
                        C500260Jjc.LJIILIIL(R5());
                        W5(S5(), (User) ListProtector.get(list, 0));
                        W5(V5(), (User) ListProtector.get(list, 1));
                        W5(U5(), (User) ListProtector.get(list, 2));
                    }
                } else {
                    C500260Jjc.LJIILIIL(T5());
                    X5(30, 7, 21, S5());
                    X5(16, 30, 6, V5());
                    C500260Jjc.LLFFF((View) this.LLJI.getValue());
                    C500260Jjc.LLFFF(S5());
                    C500260Jjc.LLFFF(V5());
                    C500260Jjc.LJIILIIL(U5());
                    C500260Jjc.LJIILIIL(R5());
                    W5(S5(), (User) ListProtector.get(list, 0));
                    W5(V5(), (User) ListProtector.get(list, 1));
                }
            } else {
                C500260Jjc.LLFFF(T5());
                C500260Jjc.LJIILIIL((View) this.LLJI.getValue());
                C500260Jjc.LJIILIIL(S5());
                C500260Jjc.LJIILIIL(V5());
                C500260Jjc.LJIILIIL(U5());
                C500260Jjc.LJIILIIL(R5());
                W5(T5(), (User) ListProtector.get(list, 0));
            }
        } else {
            C500260Jjc.LJIILIIL(T5());
            C500260Jjc.LJIILIIL((View) this.LLJI.getValue());
            C500260Jjc.LJIILIIL(S5());
            C500260Jjc.LJIILIIL(V5());
            C500260Jjc.LJIILIIL(U5());
            C500260Jjc.LJIILIIL(R5());
        }
        Room room = watchLaterInfo.latestRoom;
        if (room == null || (owner = room.getOwner()) == null) {
            owner = (User) C13LP.LJJJLL(list);
        }
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            User user2 = user;
            if (owner == null || user2.getId() != owner.getId()) {
                arrayList.add(user);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList, C1697810uHb.LJIIL(owner));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) listLJLIL).iterator();
        while (it2.hasNext()) {
            String strLIZ = C0KVU.LIZ((User) it2.next());
            if (strLIZ != null) {
                arrayList2.add(strLIZ);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            TextView textView = (TextView) this.LLJ.getValue();
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
        } else {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
            if (arrayList3.size() == 1) {
                TextView textView2 = (TextView) this.LLJ.getValue();
                if (textView2 != null) {
                    textView2.setText(strLJJLIIIJ);
                }
            } else {
                View view = (View) this.LLJ.getValue();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS10S1200000_4(this, arrayList3, strLJJLIIIJ, 1));
                }
            }
        }
        C786410Ut5.I7(new ACListenerS111S0200000_7(watchLaterInfo, this, 13), this.LLIZLLLIL);
        L5();
    }
}
