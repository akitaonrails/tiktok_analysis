package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.C0UXY;
import X.C1095570ecF;
import X.C1161920gLG;
import X.C20736316Cj;
import X.C497740JfY;
import X.C500260Jjc;
import X.C773800UXa;
import X.C773810UXb;
import X.C773830UXd;
import X.C786410Ut5;
import X.EnumC1088870eRR;
import X.EnumC1102750enp;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostToolbarMoreSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9HELIOSPCA+KCwnISoiZzs8JykuKD19BCw6LAc8OzEYJiA/KiQ+BCAhLRYkLCon";
    public final List<EnumC1102750enp> LLJLLL;
    public final List<EnumC1102750enp> LLJZ;
    public final List<EnumC1102750enp> LLJZIJLIL;
    public final List<EnumC1102750enp> LLL;
    public final DataChannel LLLF;
    public FrameLayout LLLFF;
    public LinearLayout LLLFFI;
    public FrameLayout LLLFZ;
    public final C773800UXa LLLI;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C773800UXa c773800UXa = this.LLLI;
        C773810UXb c773810UXb = c773800UXa.LJFF;
        if (c773810UXb != null) {
            c773810UXb.LL.remove(c773800UXa);
        }
        EnumC1088870eRR.POPUP_BASIC.release(c773800UXa.LJIILIIL);
        EnumC1088870eRR.POPUP_SETTING.release(c773800UXa.LJIILIIL);
        DataChannel dataChannel = this.LLLF;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.isClipChildren = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLLI.LIZJ(this.LLLF);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View hS(LayoutInflater layoutInflater, C1095570ecF c1095570ecF) {
        View viewTd;
        if (LiveHostSettingsUIConfig.v2() && (viewTd = C786410Ut5.Td(layoutInflater, R.layout.h6y, c1095570ecF, false)) != null) {
            ViewGroup viewGroup = (ViewGroup) viewTd.findViewById(R.id.y_j);
            C500260Jjc.LJIILIIL(viewGroup);
            View viewLIZ = C0UXY.LIZ(this.LLJZIJLIL, viewTd.getContext(), this.LLLF, this);
            if (viewLIZ != null) {
                C500260Jjc.LLFFF(viewGroup);
                if (viewGroup != null) {
                    viewGroup.addView(viewLIZ);
                }
            }
            return viewTd;
        }
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLFFI = (LinearLayout) view.findViewById(R.id.js1);
        View viewFindViewById = view.findViewById(R.id.olp);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            LinearLayout linearLayout = this.LLLFFI;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.e_j);
            }
        } else {
            LinearLayout linearLayout2 = this.LLLFFI;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundResource(R.drawable.dyb);
            }
        }
        this.LLLFZ = (FrameLayout) view.findViewById(R.id.okr);
        if (LiveHostSettingsUIConfig.v1()) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.y_k);
            this.LLLFF = frameLayout;
            C500260Jjc.LJIILIIL(frameLayout);
            View viewLIZ = C0UXY.LIZ(this.LLJZIJLIL, getContext(), this.LLLF, this);
            if (viewLIZ != null) {
                C500260Jjc.LLFFF(this.LLLFF);
                FrameLayout frameLayout2 = this.LLLFF;
                if (frameLayout2 != null) {
                    frameLayout2.addView(viewLIZ);
                }
            }
        }
        this.LLLI.LIZLLL(view);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h6z, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveHostToolbarMoreSheet(List<? extends EnumC1102750enp> list, List<? extends EnumC1102750enp> list2, List<? extends EnumC1102750enp> list3, List<? extends EnumC1102750enp> list4, C773830UXd c773830UXd, DataChannel dataChannel) {
        this.LLJLLL = list;
        this.LLJZ = list2;
        this.LLJZIJLIL = list3;
        this.LLL = list4;
        this.LLLF = dataChannel;
        this.LLLI = new C773800UXa(list, list2, c773830UXd, this, new AwS556S0100000_12(this, 162));
    }
}
