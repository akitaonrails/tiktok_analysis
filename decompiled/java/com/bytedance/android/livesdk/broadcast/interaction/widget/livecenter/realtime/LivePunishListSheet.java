package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.realtime;

import X.C011Z;
import X.C0IJT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1834150xpV;
import X.C20441214yg;
import X.C2176721AGw;
import X.C2188811AlT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C476680Img;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.broadcast.LiveCenterPunishInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePunishListSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCA+KCwnISHELIOSoiZzg6LCIpPWE/ITMpKio9PCA+Zz02KSk4ICI2ZgklPyoDPSslOicfITY4Gic2LTE=";
    public C2176721AGw LLJLLL;

    public final void uS() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_penalty_panel");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LIZIZ(C475510Ikn.LJ(this))), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this))), "room_id");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/interaction/widget/livecenter/realtime/LivePunishListSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+Gp9Q1VypT8E/Gij+waThsUj5W+EXmIDP4cFg9RIElNntddKwayjRSOSAwz7t9lE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            uS();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePunishListSheet onDismiss cause = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    str = "draw";
                }
            } else {
                str = "click_elsewhere";
            }
        } else {
            str = "close";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_penalty_panel");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this))), "room_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(str, "leave_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        Collection collection;
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.hkh);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 26));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.si6);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C476680Img(3));
            Context context = recyclerView.getContext();
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null && (collection = (Collection) dataChannelLJ2.gg0(LiveCenterPunishInfo.class)) != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = null;
            }
            C2176721AGw c2176721AGw = new C2176721AGw(context, dataChannelLJ, arrayList);
            this.LLJLLL = c2176721AGw;
            recyclerView.setAdapter(c2176721AGw);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null) {
            dataChannelLJ3.BQ2(this, LiveCenterPunishInfo.class, new AwS586S0100000_7(this, 32));
        }
        uS();
        C2176721AGw c2176721AGw2 = this.LLJLLL;
        if (c2176721AGw2 != null && c2176721AGw2.LLILZIL == null) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            c2176721AGw2.LLILZIL = bPEAHandler;
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(c2176721AGw2, 183);
            c2176721AGw2.LLILZLL = aRunnableS107S0100000_7;
            C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS107S0100000_7);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.hk9, viewGroup, false);
    }
}
