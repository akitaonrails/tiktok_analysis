package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive;

import X.C0OB8;
import X.C0SDD;
import X.C1206504nn;
import X.C1356610lPH;
import X.C1697580uHE;
import X.C1BWL;
import X.C2215101Bmm;
import X.C337180DJs;
import X.C426750GoL;
import X.C704790Rkj;
import X.C705700RmC;
import X.C718100SEu;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1361270lWn;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS99S0110000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsNormalInteractiveAssem extends BaseFriendsV3CellUISlotAssem<FriendsNormalInteractiveAssem, InterfaceC1361270lWn> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cax;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cax, new AwS555S0100000_11(this, 453));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean zLIZ = C1206504nn.LIZ();
        C723830SaL.LIZ(this, null, new AwS99S0110000_11(this, zLIZ, 0));
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
                C337180DJs.LIZJ(viewFindViewById4);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        String strLJI;
        Aweme aweme = ((C0OB8) obj).getAweme();
        TuxTextView tuxTextView = (TuxTextView) LJJIJL().findViewById(R.id.tv_timestamp);
        if (tuxTextView != null) {
            if (C1206504nn.LIZ()) {
                C337180DJs.LIZ(tuxTextView);
                return;
            }
            if (aweme != null && aweme.getCreateTime() > 0 && !AwemeExtKt.isScheduleVideo(aweme)) {
                long createTime = aweme.getCreateTime() * 1000;
                if (C718100SEu.LIZJ()) {
                    strLJI = C2215101Bmm.LJIILIIL(createTime);
                } else {
                    strLJI = C1356610lPH.LJI(createTime, C1BWL.LIZ());
                }
                if (!TextUtils.isEmpty(strLJI) && strLJI != null) {
                    tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 450, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
                    C786410Ut5.LJLLLLLL(0, tuxTextView);
                    tuxTextView.setText(strLJI);
                    return;
                }
            }
            C337180DJs.LIZIZ(tuxTextView);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof C0SDD;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
