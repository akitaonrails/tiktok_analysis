package com.bytedance.android.livesdk.locationservice;

import X.C011Z;
import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13LP;
import X.C1533950q1J;
import X.C1819620xS4;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C521860KdM;
import X.C786410Ut5;
import X.C842240X2g;
import X.InterfaceC2262081DgM;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LocationServiceNotionSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JCovKDs6HELIOSJys/LD0lISYpZwM8KyQ4ICA9GyA+PyYwLQsjPSY8JhYkLCon";
    public boolean LLJLLL;
    public boolean LLJZ;
    public String LLJZIJLIL = "";
    public String LLL = "";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131853655), R.style.a7g, new C521860KdM(this, 7)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        if (this.LLJZ) {
            sheetOptions.dimBehindType = 1;
        }
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ImageModel avatarThumb;
        List<String> listLIZ;
        ImageModel avatarThumb2;
        List<String> listLIZ2;
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_anchor", false);
        } else {
            z = false;
        }
        this.LLJLLL = z;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string2 = arguments2.getString("enter_from", "")) != null) {
            str = string2;
        }
        this.LLJZIJLIL = str;
        Bundle arguments3 = getArguments();
        String str2 = "nearby_live_take_page";
        if (arguments3 != null && (string = arguments3.getString("enter_method", "nearby_live_take_page")) != null) {
            str2 = string;
        }
        this.LLL = str2;
        String str3 = "ttlive_nearby_bg_anchor.png";
        String str4 = null;
        if (this.LLJLLL && HostAddLocationSetting.INSTANCE.enable()) {
            if (C011Z.LIZ.LJIJ(getContext()) && C500260Jjc.LJJIJLIJ()) {
                str3 = "ttlive_nearby_bg_anchor_dark.png";
            }
            View viewFindViewById = view.findViewById(R.id.n29);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                C1143680frq.LJI(viewFindViewById, C1143780fs0.LJIIJ("tiktok_live_interaction_demand_11", str3), null, true);
            }
            C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.n2_);
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
                InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
                if (curUser != null && (avatarThumb2 = curUser.getAvatarThumb()) != null && (listLIZ2 = C842240X2g.LIZ(avatarThumb2)) != null) {
                    str4 = (String) C13LP.LJJJLL(listLIZ2);
                }
                if (C1533950q1J.LJ(str4)) {
                    C1819620xS4.LIZ().setUrl(str4).LJJI(c1324720kZq);
                } else {
                    c1324720kZq.setImageResource(R.drawable.eze);
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_location_learn_more");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            c474500IjALIZ.LJJII(this.LLJZIJLIL, "enter_from");
            c474500IjALIZ.LJJII(this.LLL, "enter_method");
            c474500IjALIZ.LIZ();
        } else if (LiveSkylightNearByEntranceSetting.enableRequestLocation()) {
            if (!this.LLJLLL) {
                View viewFindViewById2 = view.findViewById(R.id.n28);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                    C1143680frq.LIZLLL(viewFindViewById2, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_11"), "ttlive_nearby_bg.png");
                }
            } else {
                View viewFindViewById3 = view.findViewById(R.id.n29);
                if (viewFindViewById3 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                    C1143680frq.LIZLLL(viewFindViewById3, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_11"), "ttlive_nearby_bg_anchor.png");
                }
            }
            C1324720kZq c1324720kZq2 = (C1324720kZq) view.findViewById(R.id.n2_);
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 0);
                InterfaceC2262081DgM curUser2 = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
                if (curUser2 != null && (avatarThumb = curUser2.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null) {
                    str4 = (String) C13LP.LJJJLL(listLIZ);
                }
                if (C1533950q1J.LJ(str4)) {
                    C1819620xS4.LIZ().setUrl(str4).LJJI(c1324720kZq2);
                } else {
                    c1324720kZq2.setImageResource(R.drawable.eze);
                }
            }
        } else {
            View viewFindViewById4 = view.findViewById(R.id.l_c);
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_broadcast_demand_7", "ttlive_location_service_notion.png");
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.pg0);
        TextView textView3 = (TextView) view.findViewById(R.id.pg1);
        TextView textView4 = (TextView) view.findViewById(R.id.pg2);
        if (!this.LLJLLL && !C500260Jjc.LJIIZILJ(C475510Ikn.LJ(this)) && !C500260Jjc.LJJIJLIJ()) {
            textView.setText(C497740JfY.LJIJI(2131855689));
            textView2.setText(C497740JfY.LJIJI(2131855686));
            textView3.setText(C497740JfY.LJIJI(2131855687));
            textView4.setText(C497740JfY.LJIJI(2131855688));
        } else {
            C500260Jjc.LJIILIIL(view.findViewById(R.id.pfx));
            if (HostAddLocationSetting.INSTANCE.enable()) {
                textView.setText(C497740JfY.LJIJI(2131854894));
                textView2.setText(C497740JfY.LJIJI(2131854892));
                textView3.setText(C497740JfY.LJIJI(2131854893));
            } else {
                textView.setText(C497740JfY.LJIJI(2131855682));
                textView2.setText(C497740JfY.LJIJI(2131855680));
                textView3.setText(C497740JfY.LJIJI(2131855681));
            }
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 79), view.findViewById(R.id.e1g));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("show_dim_behind");
        } else {
            z = false;
        }
        this.LLJZ = z;
        return C786410Ut5.Td(layoutInflater, R.layout.glc, viewGroup, false);
    }
}
