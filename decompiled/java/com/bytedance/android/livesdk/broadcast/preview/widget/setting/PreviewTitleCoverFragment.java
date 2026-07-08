package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C098200Yq;
import X.C0WZX;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2204961BRm;
import X.C452501pT;
import X.C475510Ikn;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C764830TzN;
import X.C786120Usc;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewTitleCoverFragment extends BasePreviewFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlHELIOSLDh9PywoLionZjYpPTs6JiJiGT02PiwpPhs6PCkpCiAlLTcKOy40JSAiPQ==";
    public FrameLayout LL;
    public C1324720kZq LLILLJJLI;
    public LiveEditText LLILLL;
    public LinearLayout LLILZ;
    public LiveEditText LLILZLL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(82));
    public String LLIZ = "";
    public final C786120Usc LLIZLLLIL = new C786120Usc(this, 8);

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    public final void NR(String str) {
        if (str != null && str.length() != 0) {
            LiveEditText liveEditText = this.LLILZLL;
            LiveEditText liveEditText2 = null;
            if (liveEditText == null) {
                liveEditText = null;
            }
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText3 = this.LLILZLL;
                if (liveEditText3 == null) {
                    liveEditText3 = null;
                }
                if (!TextUtils.isEmpty(String.valueOf(C2204961BRm.LLLFZ(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null))))) {
                    LiveEditText liveEditText4 = this.LLILZLL;
                    if (liveEditText4 != null) {
                        liveEditText2 = liveEditText4;
                    }
                    liveEditText2.setText(str);
                    return;
                }
            }
            SpannableString spannableString = new SpannableString(str + ' ');
            LiveEditText liveEditText5 = this.LLILZLL;
            if (liveEditText5 != null) {
                liveEditText2 = liveEditText5;
            }
            liveEditText2.setText(spannableString);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LifecycleOwner lifecycleOwner;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        LiveEditText liveEditText = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 170));
        C764830TzN c764830TzN = new C764830TzN();
        c764830TzN.LIZ = this;
        c764830TzN.LIZIZ = view;
        c764830TzN.LIZ();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                lifecycleOwner = dataChannelLJ2.LLILZ;
            } else {
                lifecycleOwner = null;
            }
            dataChannelLJ.EQ2(lifecycleOwner, BroadcastCoverData.class, new AwS591S0100000_12(this, 427));
        }
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 91), this);
        View view3 = getView();
        if (view3 != null) {
            liveEditText = (LiveEditText) view3.findViewById(R.id.y1_);
        }
        if ((liveEditText instanceof LiveEditText) && liveEditText != null) {
            this.LLILZLL = liveEditText;
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 != null) {
                dataChannelLJ3.BQ2(this, PreviewHideKeyboardEvent.class, new AwS591S0100000_12(this, 813));
            }
            DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
            if (dataChannelLJ4 != null) {
                dataChannelLJ4.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 815));
            }
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        View view = getView();
        if (view != null) {
            C500260Jjc.LJJLJ(i - ((int) C497740JfY.LIZIZ(20.0f)), view);
        }
        if (!z) {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.y1_);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (LiveEditText) viewFindViewById;
            }
            viewFindViewById.clearFocus();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gl6, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
