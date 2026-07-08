package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1324720kZq;
import X.C2204961BRm;
import X.C452501pT;
import X.C475510Ikn;
import X.C486790J7d;
import X.C497740JfY;
import X.C758170Tod;
import X.C786120Usc;
import X.C786410Ut5;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewTitleCoverFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiGT02PiwpPhs6PCkpCiAlLTcKOy40JSAiPRw7LSA4";
    public C1324720kZq LLJLLL;
    public LinearLayout LLJZ;
    public LiveEditText LLL;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(83));
    public String LLLF = "";
    public final C786120Usc LLLFF = new C786120Usc(this, 9);

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842032));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
    }

    public final void uS(String str) {
        if (str != null && str.length() != 0) {
            LiveEditText liveEditText = this.LLL;
            LiveEditText liveEditText2 = null;
            if (liveEditText == null) {
                liveEditText = null;
            }
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText3 = this.LLL;
                if (liveEditText3 == null) {
                    liveEditText3 = null;
                }
                if (!TextUtils.isEmpty(String.valueOf(C2204961BRm.LLLFZ(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null))))) {
                    LiveEditText liveEditText4 = this.LLL;
                    if (liveEditText4 != null) {
                        liveEditText2 = liveEditText4;
                    }
                    liveEditText2.setText(str);
                    return;
                }
            }
            SpannableString spannableString = new SpannableString(str + ' ');
            LiveEditText liveEditText5 = this.LLL;
            if (liveEditText5 != null) {
                liveEditText2 = liveEditText5;
            }
            liveEditText2.setText(spannableString);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEditText liveEditText;
        LifecycleOwner lifecycleOwner;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        String str = null;
        if (dataChannelLJ != null) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                lifecycleOwner = dataChannelLJ2.LLILZ;
            } else {
                lifecycleOwner = null;
            }
            dataChannelLJ.EQ2(lifecycleOwner, BroadcastCoverData.class, new AwS591S0100000_12(this, 428));
        }
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 92), this);
        View view2 = getView();
        if (view2 != null) {
            liveEditText = (LiveEditText) view2.findViewById(R.id.y1_);
        } else {
            liveEditText = null;
        }
        if ((liveEditText instanceof LiveEditText) && liveEditText != null) {
            this.LLL = liveEditText;
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 != null) {
                dataChannelLJ3.BQ2(this, PreviewHideKeyboardEvent.class, new AwS591S0100000_12(this, 793));
            }
            DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
            if (dataChannelLJ4 != null) {
                str = (String) dataChannelLJ4.gg0(PreviewTitleChannel.class);
            }
            uS(str);
            DataChannel dataChannelLJ5 = C475510Ikn.LJ(this);
            if (dataChannelLJ5 != null) {
                dataChannelLJ5.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 795));
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gl7, viewGroup, false);
    }
}
