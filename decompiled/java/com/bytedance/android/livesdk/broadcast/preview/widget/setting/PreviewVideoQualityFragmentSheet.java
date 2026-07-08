package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0UWY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1397760mTe;
import X.C1D4I;
import X.C20441214yg;
import X.C20483915Dh;
import X.C2188811AlT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C758070ToT;
import X.C758170Tod;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel;
import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.android.livesdk.broadcast.VideoPreScheduleStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewManualSpeedTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewVideoQualityFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZjYpPTs6JiJiGT02PiwpPhk6LCAjGDoyJCw4MAkhKSIhLCEnGy0pLDs=";
    public RecyclerView LLJLLL;
    public C758070ToT LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(uS());
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        Object objGg0 = dataChannelLJ != null ? dataChannelLJ.gg0(LiveModeChannel.class) : null;
        if (LivePreviewManualSpeedTestSetting.INSTANCE.enabled() && objGg0 == LiveMode.VIDEO) {
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            c1397760mTe.LIZ = C497740JfY.LJIJI(2131844547);
            c1119170fEJ.LJFF = Collections.singletonList(new C758170Tod(R.attr.eeo, c1397760mTe.LIZ(), new ACListenerS147S0100000_12(this, 172)));
        }
        return c1119170fEJ;
    }

    public final String uS() {
        if (!LivePreviewManualSpeedTestSetting.INSTANCE.enabled()) {
            return C497740JfY.LJIJI(2131843878);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        Pair pair = dataChannelLJ != null ? (Pair) dataChannelLJ.gg0(PreScheduleResultChannel.class) : null;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        Object objGg0 = dataChannelLJ2 != null ? dataChannelLJ2.gg0(VideoPreScheduleStatusChannel.class) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status: ");
        sbLIZ.append(objGg0);
        sbLIZ.append(", result: ");
        sbLIZ.append(pair != null ? pair.getFirst() : null);
        sbLIZ.append(", result2: ");
        sbLIZ.append(pair != null ? pair.getSecond() : null);
        C20441214yg.LIZIZ("PreviewVideoQualityFragmentSheet", C2188811AlT.LIZIZ(sbLIZ));
        return pair != null ? C497740JfY.LJIJI(2131843878) : objGg0 == C0UWY.TESTING ? C497740JfY.LJIJI(2131853101) : C497740JfY.LJIJI(2131843878);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20441214yg.LIZIZ("PreviewVideoQualityFragmentSheet", "onResume");
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Pair pair;
        int iIntValue;
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/preview/widget/setting/PreviewVideoQualityFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrpTJ5OadEHp9VvTWU5Mn2Y80KblbS6A1eQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        C20441214yg.LIZIZ("PreviewVideoQualityFragmentSheet", "onHiddenChange: " + z);
        if (!z) {
            C758070ToT c758070ToT = this.LLJZ;
            if (c758070ToT != null) {
                DataChannel dataChannel = c758070ToT.LLILLJJLI;
                if (dataChannel != null && (pair = (Pair) dataChannel.gg0(PreScheduleResultChannel.class)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("result: ");
                    sbLIZ.append(pair);
                    C20441214yg.LIZIZ("PreviewVideoQualityFragmentSheet", C2188811AlT.LIZIZ(sbLIZ));
                    Integer num = (Integer) pair.getFirst();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = c758070ToT.LL.recommendStreamResolution;
                    }
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    if (((Number) pair.getSecond()).intValue() == -1) {
                        z2 = false;
                    }
                    c758070ToT.LLILZIL = new Pair<>(numValueOf, Boolean.valueOf(z2));
                    c758070ToT.LLILZLL = ((Number) pair.getSecond()).intValue();
                }
                c758070ToT.notifyDataSetChanged();
            }
            C20483915Dh c20483915Dh = this.LLIZ;
            if (c20483915Dh != null) {
                c20483915Dh.setTitle(uS());
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C1D4I.LIZLLL = false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PreScheduleStream preScheduleStream;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (preScheduleStream = (PreScheduleStream) dataChannelLJ.gg0(PreScheduleStreamChannel.class)) != null) {
            this.LLJZ = new C758070ToT(this, preScheduleStream);
            View viewFindViewById = this.LLJLLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.t0q);
                } else {
                    viewFindViewById = null;
                }
                this.LLJLLL = (RecyclerView) viewFindViewById;
            }
            ((RecyclerView) viewFindViewById).setAdapter(this.LLJZ);
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                dataChannelLJ2.EQ2(this, PreScheduleResultChannel.class, new AwS591S0100000_12(this, 429));
            }
            C1D4I.LIZLLL = true;
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gl9, viewGroup, false);
    }
}
