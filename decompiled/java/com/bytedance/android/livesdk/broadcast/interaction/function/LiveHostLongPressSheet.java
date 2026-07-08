package com.bytedance.android.livesdk.broadcast.interaction.function;

import X.C0UXG;
import X.C0UXY;
import X.C1095570ecF;
import X.C19EH;
import X.C20736316Cj;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C786410Ut5;
import X.EnumC1102750enp;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostLongPressSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9HELIOSPCA+KCwnISoiZykmJiY4ICA9ZgklPyobJzY4BSA9LxU+LDwgGy0pLDs=";
    public final Fragment LLJLLL;
    public final DataChannel LLJZ;
    public FrameLayout LLJZIJLIL;
    public FrameLayout LLL;

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
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DismissToolbarPopEvent.class, new AwS591S0100000_12(this, 164));
        }
    }

    public LiveHostLongPressSheet(Fragment fragment, DataChannel dataChannel) {
        this.LLJLLL = fragment;
        this.LLJZ = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View hS(LayoutInflater layoutInflater, C1095570ecF c1095570ecF) {
        View viewTd;
        LiveMode liveModeLIZJ = null;
        if (!LiveHostSettingsUIConfig.v2() || (viewTd = C786410Ut5.Td(layoutInflater, R.layout.h6y, c1095570ecF, false)) == null) {
            return null;
        }
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        }
        List<EnumC1102750enp> listLIZ = C0UXG.LIZ(liveModeLIZJ, this.LLJZ);
        if (!((ArrayList) listLIZ).isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) viewTd.findViewById(R.id.y_j);
            C500260Jjc.LJIILIIL(viewGroup);
            View viewLIZ = C0UXY.LIZ(listLIZ, viewTd.getContext(), this.LLJZ, this);
            if (viewLIZ != null) {
                C500260Jjc.LLFFF(viewGroup);
                viewGroup.addView(viewLIZ);
            }
        }
        return viewTd;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveMode liveModeLIZJ;
        super.onViewCreated(view, bundle);
        this.LLL = (FrameLayout) view.findViewById(R.id.uz4);
        C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
        Fragment fragment = this.LLJLLL;
        c19ehLJIIJ.LIZJ(R.id.uz4, fragment, fragment.getClass().getCanonicalName());
        c19ehLJIIJ.LJIIJ();
        if (LiveHostSettingsUIConfig.v1()) {
            DataChannel dataChannel = this.LLJZ;
            if (dataChannel != null) {
                liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
            } else {
                liveModeLIZJ = null;
            }
            List<EnumC1102750enp> listLIZ = C0UXG.LIZ(liveModeLIZJ, this.LLJZ);
            if (!((ArrayList) listLIZ).isEmpty()) {
                this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.y_k);
                View viewLIZ = C0UXY.LIZ(listLIZ, getContext(), this.LLJZ, this);
                if (viewLIZ != null) {
                    C500260Jjc.LLFFF(this.LLJZIJLIL);
                    FrameLayout frameLayout = this.LLJZIJLIL;
                    if (frameLayout != null) {
                        frameLayout.addView(viewLIZ);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h6q, viewGroup, false);
    }
}
