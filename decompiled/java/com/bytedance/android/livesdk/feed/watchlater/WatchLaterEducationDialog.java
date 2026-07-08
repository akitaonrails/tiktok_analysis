package com.bytedance.android.livesdk.feed.watchlater;

import X.C1143680frq;
import X.C16FS;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchLaterEducationDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWEkHELIOSKTEvISMyPCA+ZxgyPCYkBS4nLTcJLTowKTElJiEXISQgJig=";
    public final Function0<Unit> LLJLLL;
    public final int LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLJLLL.invoke();
    }

    public WatchLaterEducationDialog(int i, AwS551S0100000_7 awS551S0100000_7) {
        this.LLJLLL = awS551S0100000_7;
        this.LLJZ = i;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.ll6);
        int value = LiveWatchLaterSettingSetting.INSTANCE.getValue();
        if (value != 1) {
            if (value != 2) {
                str = "";
            } else if (this.LLJZ == 1) {
                str = "ttlive_watch_later_Illustration_style2_toplive.png";
            } else {
                str = "ttlive_watch_later_Illustration_style2_other.png";
            }
        } else if (this.LLJZ == 1) {
            str = "ttlive_watch_later_Illustration_style1_toplive.png";
        } else {
            str = "ttlive_watch_later_Illustration_style1_other.png";
        }
        C1143680frq.LJ(viewFindViewById, "tiktok_live_watch_resource_demand_1", str, ImageView.ScaleType.CENTER_INSIDE);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cqt), new ACListenerS142S0100000_7(this, 59));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hxd, viewGroup, false);
    }
}
