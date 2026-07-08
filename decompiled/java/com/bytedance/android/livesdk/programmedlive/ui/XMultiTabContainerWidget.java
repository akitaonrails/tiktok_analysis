package com.bytedance.android.livesdk.programmedlive.ui;

import X.C088100Ut;
import X.C0IJT;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C182700n3;
import X.C465900IOu;
import X.C474500IjA;
import X.C520330Kat;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC520300Kaq;
import X.InterfaceC520350Kav;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.dataChannel.MultiTabCurrentIndex;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.programmedlive.ui.XMultiTabContainerWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class XMultiTabContainerWidget extends LiveRecyclableWidget {
    public Room LL;
    public ViewGroup LLILZ;
    public C520330Kat LLILZIL;
    public int LLILZLL;
    public boolean LLIZLLLIL;
    public InterfaceC420801kM LLJ;
    public final List<CustomTab> LLILLJJLI = new ArrayList();
    public final List<InterfaceC520350Kav> LLILLL = new ArrayList();
    public boolean LLIZ = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0k;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (!this.LLIZLLLIL) {
            x1("leave_room");
            this.LLIZLLLIL = true;
        }
        C520330Kat c520330Kat = this.LLILZIL;
        if (c520330Kat != null) {
            ((ArrayList) c520330Kat.LJ).clear();
            c520330Kat.LIZJ.removeCallbacksAndMessages(c520330Kat.LJFF);
        }
        ((ArrayList) this.LLILLJJLI).clear();
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC520350Kav) it2.next()).onDestroy();
        }
        ((ArrayList) this.LLILLL).clear();
        this.LLILZLL = 0;
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.wz5);
        if (viewGroup == null) {
            return;
        }
        this.LLILZ = viewGroup;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List listLIZ;
        InterfaceC520350Kav interfaceC520350KavLIZ;
        Long lValueOf;
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        this.LL = (Room) this.dataChannel.gg0(RoomChannel.class);
        ArrayList arrayList = (ArrayList) this.LLILLJJLI;
        arrayList.clear();
        Room room = this.LL;
        if (room == null || (listLIZ = C088100Ut.LIZ(room)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        arrayList.addAll(listLIZ);
        List<CustomTab> list = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        for (CustomTab customTab : (ArrayList) list) {
            InterfaceC520300Kaq interfaceC520300KaqSD = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).SD(customTab.tabSchemaType);
            Long lValueOf2 = null;
            if (interfaceC520300KaqSD != null && (interfaceC520350KavLIZ = interfaceC520300KaqSD.LIZ(this.context, this.dataChannel, customTab)) != null) {
                ViewGroup viewGroup2 = this.LLILZ;
                if (viewGroup2 != null) {
                    interfaceC520350KavLIZ.LIZJ(viewGroup2);
                }
                Room room2 = this.LL;
                if (room2 != null) {
                    lValueOf = Long.valueOf(room2.getId());
                } else {
                    lValueOf = null;
                }
                Room room3 = this.LL;
                if (room3 != null) {
                    lValueOf2 = Long.valueOf(room3.getOwnerUserId());
                }
                C182700n3.LIZ(lValueOf, lValueOf2, Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "multi_tab_init", interfaceC520350KavLIZ.LIZLLL(), 1, customTab.tabSchema, interfaceC520350KavLIZ.LIZ());
                arrayList2.add(interfaceC520350KavLIZ);
            }
        }
        ArrayList arrayList3 = (ArrayList) this.LLILLL;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        C520330Kat c520330Kat = new C520330Kat(this.dataChannel);
        this.LLILZIL = c520330Kat;
        ViewGroup viewGroup3 = this.LLILZ;
        if (viewGroup3 != null) {
            c520330Kat.LIZIZ = viewGroup3;
        }
        this.dataChannel.EQ2(this, MultiTabCurrentIndex.class, new AwS586S0100000_7(this, 185));
        this.LLJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC19562711gH() { // from class: X.0Kau
            @Override // X.InterfaceC19562711gH
            public final void LLF(Context context) {
                XMultiTabContainerWidget xMultiTabContainerWidget = this.LL;
                InterfaceC520350Kav interfaceC520350Kav = (InterfaceC520350Kav) C13LP.LJJJLZIJ(xMultiTabContainerWidget.LLILZLL, xMultiTabContainerWidget.LLILLL);
                if (interfaceC520350Kav != null) {
                    interfaceC520350Kav.LLLZZ();
                }
            }

            @Override // X.InterfaceC19562711gH
            public final void LLLLIILLL(Context context) {
                XMultiTabContainerWidget xMultiTabContainerWidget = this.LL;
                InterfaceC520350Kav interfaceC520350Kav = (InterfaceC520350Kav) C13LP.LJJJLZIJ(xMultiTabContainerWidget.LLILZLL, xMultiTabContainerWidget.LLILLL);
                if (interfaceC520350Kav != null) {
                    interfaceC520350Kav.LIZIZ();
                }
                xMultiTabContainerWidget.x1("other");
            }
        });
        C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS176S0100000_7(this, 97));
        hide();
    }

    public final void x1(String str) {
        String str2;
        String str3;
        float fLJ;
        Long lValueOf;
        String str4;
        DataChannel dataChannel = this.dataChannel;
        CustomTab customTab = (CustomTab) C13LP.LJJJLZIJ(this.LLILZLL, this.LLILLJJLI);
        String str5 = "";
        if (customTab == null || (str2 = customTab.tabTitle) == null) {
            str2 = "";
        }
        CustomTab customTab2 = (CustomTab) C13LP.LJJJLZIJ(this.LLILZLL, this.LLILLJJLI);
        if (customTab2 != null && (str4 = customTab2.tabBizName) != null) {
            str5 = str4;
        }
        if (this.LLIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = this.LLILZLL;
        int i2 = i + 1;
        InterfaceC520350Kav interfaceC520350Kav = (InterfaceC520350Kav) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (interfaceC520350Kav != null) {
            fLJ = interfaceC520350Kav.LJ();
        } else {
            fLJ = -1.0f;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_tab_page_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "room_id");
        c474500IjALIZ.LJJII(str2, "tab_name");
        c474500IjALIZ.LJJII(str5, "page_tag");
        c474500IjALIZ.LJJII(str3, "is_default");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "position");
        c474500IjALIZ.LJJIFFI(Float.valueOf(fLJ), "duration");
        c474500IjALIZ.LJJII(str, "reason");
        c474500IjALIZ.LIZ();
    }
}
