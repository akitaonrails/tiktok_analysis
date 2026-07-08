package com.bytedance.android.livesdk.interaction;

import X.C011Z;
import X.C0UID;
import X.C19EH;
import X.C475510Ikn;
import X.C513200KAs;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveInteractionFeaturesSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yHELIOSKzElJiF9BCw6LAY9PCA+KCwnISoiDyoyPDA+LDwAICApPQ==";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        if (C0UID.LJIIJ(C475510Ikn.LJ(this)) && TryModeGuidanceSetting.INSTANCE.isV3EnhancedBubble()) {
            return C011Z.LIZ.LJ();
        }
        return C513200KAs.LIZ(context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, CppSeeDetailsClickEvent.class, new AwS591S0100000_12(this, 574));
            dataChannelLJ.BQ2(this, DismissToolbarPopEvent.class, new AwS591S0100000_12(this, 575));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LiveInteractionFeaturesFragment liveInteractionFeaturesFragment = new LiveInteractionFeaturesFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("collapsable", false);
        C786410Ut5.LJJJI("entrance", "toolbar", bundle2);
        liveInteractionFeaturesFragment.setArguments(bundle2);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.iiv, liveInteractionFeaturesFragment);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hm0, viewGroup, false);
    }
}
