package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IJT;
import X.C1119170fEJ;
import X.C20736316Cj;
import X.C23250099c;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C487970JBr;
import X.C497740JfY;
import X.C635860Owq;
import X.C751260TdU;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFilterCommentSettingFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICHELIOSE0ZgklPyoVISk4LD0QJyghLCEnGyA4PSY9LwM+KCg+LSs4Gic2LTE=";
    public C751260TdU LLJZ;
    public LinearLayout LLL;
    public LiveIconView LLLF;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 20));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 19));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842728));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        String string;
        String string2;
        super.onViewStateRestored(bundle);
        Room room = (Room) this.LLJLLL.getValue();
        if (room != null) {
            room.getId();
        }
        boolean zBooleanValue = ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
        View view = getView();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("trigger")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("entry")) != null) {
            str = string2;
        }
        this.LLJZ = new C751260TdU(zBooleanValue, view, string, str, C475510Ikn.LJ(this), this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C487970JBr(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        String str;
        String string;
        LinearLayout linearLayout2;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            view2.findViewById(R.id.ni2);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.ngk);
        }
        View view4 = getView();
        LiveIconView liveIconView = null;
        if (view4 != null) {
            linearLayout = (LinearLayout) view4.findViewById(R.id.nc0);
        } else {
            linearLayout = null;
        }
        this.LLL = linearLayout;
        View view5 = getView();
        if (view5 != null) {
            view5.findViewById(R.id.nh3);
        }
        View view6 = getView();
        if (view6 != null) {
            liveIconView = (LiveIconView) view6.findViewById(R.id.k16);
        }
        this.LLLF = liveIconView;
        View view7 = getView();
        if (view7 != null) {
            view7.findViewById(R.id.nsj);
        }
        View view8 = getView();
        if (view8 != null) {
            view8.findViewById(R.id.mi5);
        }
        View view9 = getView();
        if (view9 != null) {
            view9.findViewById(R.id.mi4);
        }
        View view10 = getView();
        if (view10 != null) {
            view10.findViewById(R.id.mi3);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("entry")) != null && Intrinsics.LJFF(string, "autosuggest_comment_filter") && (linearLayout2 = this.LLL) != null) {
            linearLayout2.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c90, getContext()));
        }
        LiveIconView liveIconView2 = this.LLLF;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS142S0100000_7(this, 9));
        }
        LiveIconView liveIconView3 = this.LLLF;
        if (liveIconView3 != null) {
            C635860Owq.LIZ.LIZJ(5, liveIconView3);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_filter_comments_view");
        c474500IjALIZ.LJIL();
        if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g6k, viewGroup, false);
    }
}
