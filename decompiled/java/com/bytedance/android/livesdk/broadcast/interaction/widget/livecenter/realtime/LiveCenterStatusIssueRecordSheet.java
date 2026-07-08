package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.realtime;

import X.C011Z;
import X.C0DXR;
import X.C0IJT;
import X.C0IP0;
import X.C0IP3;
import X.C0IP6;
import X.C12OY;
import X.C1834150xpV;
import X.C466130IPr;
import X.C466140IPs;
import X.C474500IjA;
import X.C475510Ikn;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.broadcast.LiveCenterStatusIssueInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCenterStatusIssueRecordSheet extends LiveSheetFragment {
    public static long LLJZIJLIL = 0;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCA+KCwnISoiZzg6LCHELIOSIpPWE/ITMpKio9PCA+Zz02KSk4ICI2ZgklPyoQLSs4LD0APCQ4PDwaOzY5LB02Kyo+LRw7LSA4";
    public C0IP0 LLJLLL;
    public final List<C466140IPs> LLJZ = new ArrayList();

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
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannelProvideDataChannel;
        String string;
        String string2;
        String string3;
        String string4;
        Collection collection;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.w1u);
        if (textView != null) {
            textView.setText(getString(2131855079));
        }
        View viewFindViewById = view.findViewById(R.id.f821w1p);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 25), viewFindViewById);
        }
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(getActivity());
        String string5 = null;
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        ((ArrayList) this.LLJZ).clear();
        if (dataChannelProvideDataChannel != null && (collection = (Collection) dataChannelProvideDataChannel.gg0(LiveCenterStatusIssueInfo.class)) != null) {
            ((ArrayList) this.LLJZ).addAll(collection);
        }
        Collections.reverse(this.LLJZ);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.w1r);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C0DXR(this) { // from class: X.0IP2
                public final int LL;

                {
                    this.LL = (int) (8 * this.getResources().getDisplayMetrics().density);
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i;
                    if (recyclerView2.getChildLayoutPosition(view2) == 0) {
                        i = 0;
                    } else {
                        i = this.LL;
                    }
                    rect.top = i;
                }
            });
            C0IP0 c0ip0 = new C0IP0(recyclerView.getContext(), this.LLJZ);
            this.LLJLLL = c0ip0;
            recyclerView.setAdapter(c0ip0);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        if (dataChannelProvideDataChannel != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                string5 = arguments.getString("arg_enter_from");
            }
            String str = "";
            if (string5 == null) {
                string5 = "";
            }
            Context context = view.getContext();
            List<C466140IPs> list = this.LLJZ;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                Integer numLIZ = C466130IPr.LIZ((C466140IPs) it2.next());
                if (numLIZ != null && (string4 = context.getString(numLIZ.intValue())) != null) {
                    arrayList.add(string4);
                }
            }
            String string6 = new JSONArray((Collection) arrayList).toString();
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("arg_network_suggestion")) == null) {
                string = "";
            }
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string2 = arguments3.getString("arg_audio_suggestion")) == null) {
                string2 = "";
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string3 = arguments4.getString("arg_performance_suggestion")) != null) {
                str = string3;
            }
            C0IP6 c0ip6 = new C0IP6(string, string2, str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_device_status_issue_record_show");
            c474500IjALIZ.LJIJJLI(dataChannelProvideDataChannel);
            C12OY.LIZIZ(c474500IjALIZ, C12OY.LJIIIIZZ(dataChannelProvideDataChannel), true);
            C12OY.LIZ(c474500IjALIZ, c0ip6);
            c474500IjALIZ.LJJII(string5, "enter_from");
            c474500IjALIZ.LJJII(string6, "issue_record_detail");
            c474500IjALIZ.LIZ();
            dataChannelProvideDataChannel.BQ2(this, LiveCenterStatusIssueInfo.class, new AwS586S0100000_7(this, 31));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.h6a, viewGroup, false);
    }
}
