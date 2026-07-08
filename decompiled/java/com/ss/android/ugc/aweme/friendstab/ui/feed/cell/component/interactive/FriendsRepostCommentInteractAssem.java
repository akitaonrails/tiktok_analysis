package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive;

import X.C1206504nn;
import X.C1356610lPH;
import X.C1697580uHE;
import X.C1BWL;
import X.C2215101Bmm;
import X.C426750GoL;
import X.C705700RmC;
import X.C718100SEu;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS99S0110000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsRepostCommentInteractAssem extends BaseFriendsV3CellUISlotAssem<FriendsRepostCommentInteractAssem, InterfaceC1361270lWn> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cax;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cax, new AwS555S0100000_11(this, 454));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean zLIZ = C1206504nn.LIZ();
        C723830SaL.LIZ(this, null, new AwS99S0110000_11(this, zLIZ, 1));
        if (zLIZ) {
            View viewFindViewById = LJJIJL().findViewById(R.id.i52);
            if (viewFindViewById != null) {
                viewFindViewById.setPaddingRelative(0, viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), viewFindViewById.getPaddingBottom());
            }
            View viewFindViewById2 = LJJIJL().findViewById(R.id.i55);
            if (viewFindViewById2 != null) {
                C426750GoL.LJIIIZ(viewFindViewById2, null, null, 0, null, false, 27);
            }
            View viewFindViewById3 = LJJIJL().findViewById(R.id.i4f);
            if (viewFindViewById3 != null) {
                C426750GoL.LJIIIZ(viewFindViewById3, null, null, 0, null, false, 27);
            }
            View viewFindViewById4 = LJJIJL().findViewById(R.id.i7w);
            if (viewFindViewById4 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        InterfaceC1357880lRK interfaceC1357880lRK;
        TuxTextView tuxTextView;
        String strLJI;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
        if ((interfaceC1361270lWn instanceof InterfaceC1357880lRK) && (interfaceC1357880lRK = (InterfaceC1357880lRK) interfaceC1361270lWn) != null && (tuxTextView = (TuxTextView) LJJIJL().findViewById(R.id.tv_timestamp)) != null) {
            if (C1206504nn.LIZ()) {
                C786410Ut5.LJLLLLLL(8, tuxTextView);
                return;
            }
            Long l = interfaceC1357880lRK.LLD().repostTime;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    long j = jLongValue * 1000;
                    if (C718100SEu.LIZJ()) {
                        strLJI = C2215101Bmm.LJIILIIL(j);
                    } else {
                        strLJI = C1356610lPH.LJI(j, C1BWL.LIZ());
                    }
                    if (!TextUtils.isEmpty(strLJI) && strLJI != null) {
                        tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 450, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
                        C786410Ut5.LJLLLLLL(0, tuxTextView);
                        tuxTextView.setText(strLJI);
                        return;
                    }
                }
            }
            C786410Ut5.LJLLLLLL(8, tuxTextView);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof InterfaceC1357880lRK;
    }
}
