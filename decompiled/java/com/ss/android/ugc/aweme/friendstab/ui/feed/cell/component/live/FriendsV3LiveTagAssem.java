package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live;

import X.C01GW;
import X.C0OB8;
import X.C13LE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C704790Rkj;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1361270lWn;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3LiveCellViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3LiveTagAssem extends BaseFriendsV3CellContentAssem<FriendsV3LiveTagAssem, InterfaceC1361270lWn> {
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2200));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2199));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2198));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2201));
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3LiveCellViewModel.class), AFwS279S0000000_33.get$arr$(137));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((View) this.LLJJJJJIL.getValue()).setClipToOutline(true);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        LiveRoomStruct newLiveRoomData;
        String strLIZIZ;
        RoomFeedCellStruct roomFeedCellStruct = ((C0OB8) obj).getAweme().getRoomFeedCellStruct();
        if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
            int i = newLiveRoomData.user_count;
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJL.getValue(), 8);
            TextView textView = (TextView) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (i < 1000) {
                strLIZIZ = String.valueOf(i);
            } else if (i < 1000000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((i * 10) / LSPassThroughRecordSizeConfig.DEFAULT) * 0.1f)}, 1)));
                sbLIZ.append('K');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (i < 1000000000) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((i * 10) / 1000000) * 0.1f)}, 1)));
                sbLIZ2.append('M');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((long) (i * 10)) / 1000000000) * 0.1f)}, 1)));
                sbLIZ3.append('B');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            textView.setText(strLIZIZ);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue(), 0);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0s08
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1610110s09) obj2).LL;
            }
        }, null, AFwS321S0000000_33.get$arr$(29), 6);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
