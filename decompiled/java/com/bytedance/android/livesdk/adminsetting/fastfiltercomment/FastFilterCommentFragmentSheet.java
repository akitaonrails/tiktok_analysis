package com.bytedance.android.livesdk.adminsetting.fastfiltercomment;

import X.C01GW;
import X.C0IJT;
import X.C0TZN;
import X.C13LQ;
import X.C292401Bi;
import X.C328450CuB;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C786180Usi;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FastFilterCommentFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZiMtOjHELIOSs1ISk4LD0wJyghLCEnZgMtOjsVISk4LD0QJyghLCEnDjctLiI2JjEfISo2PA==";
    public C328450CuB LLJLLL;
    public long[] LLL;
    public String LLJZ = "";
    public String LLJZIJLIL = "";
    public boolean LLLF = true;
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 153));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131841000), R.style.a7h, new C786180Usi(this, 5)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long[] longArray;
        boolean zBooleanValue;
        String str;
        Boolean bool;
        String string2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("trigger")) == null) {
            string = "";
        }
        this.LLJZ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("action")) != null) {
            str2 = string2;
        }
        this.LLJZIJLIL = str2;
        Bundle arguments3 = getArguments();
        List<Long> listLJL = null;
        if (arguments3 != null) {
            longArray = arguments3.getLongArray("trigger_comment_id");
        } else {
            longArray = null;
        }
        this.LLL = longArray;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (bool = (Boolean) dataChannelLJ.gg0(C0TZN.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLLF = zBooleanValue;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C0TZN.class, Boolean.FALSE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_suggestion_popup_show");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(this.LLJZ, "trigger");
        c474500IjALIZ.LJJII(this.LLJZIJLIL, "action");
        long[] jArr = this.LLL;
        if (jArr != null) {
            listLJL = C13LQ.LJL(jArr);
        }
        c474500IjALIZ.LJJII(listLJL, "trigger_comment_id");
        if (((Boolean) this.LLLFF.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LJJII(Boolean.valueOf(this.LLLF), "live_room_first_time_see");
        c474500IjALIZ.LJJII(0, "community_flag_filter_status");
        c474500IjALIZ.LIZ();
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null) {
            C500260Jjc.LJJLIIIJ(dataChannelLJ3);
        }
        this.LLJLLL = new C328450CuB(this, dataChannelLJ3, C500260Jjc.LJIIZILJ(dataChannelLJ3));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 131), view.findViewById(R.id.e1g));
        ((TextView) view.findViewById(R.id.km7)).setText(C497740JfY.LJIJJ(2131841003, C497740JfY.LJIJI(2131841004)));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g6d, viewGroup, false);
    }
}
