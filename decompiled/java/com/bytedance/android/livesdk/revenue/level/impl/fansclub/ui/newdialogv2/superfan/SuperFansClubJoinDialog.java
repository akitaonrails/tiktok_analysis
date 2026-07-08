package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan;

import X.C0KSH;
import X.C0KT2;
import X.C0KT5;
import X.C1097260eey;
import X.C1121570fIB;
import X.C1143680frq;
import X.C1324610kZf;
import X.C16F5;
import X.C16FS;
import X.C1819620xS4;
import X.C1911200zpm;
import X.C1AAA;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C517700KSa;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1095410ebz;
import X.EnumC21668319r7;
import Y.AObserverS235S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class SuperFansClubJoinDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/ZiMtJzHELIOSwwJDAuZzo6ZispPis6KSkjLjlhZjY5OSohLiQiZxwmOCA+Dy49OwYgPC0ZJywiDSYyJCor";
    public JoinDialogProxyViewModel LLJZ;
    public DataChannel LLJZIJLIL;
    public C16FS LLL;
    public ImageView LLLF;
    public C16F5 LLLFF;
    public ImageView LLLFFI;
    public C16F5 LLLFZ;
    public View LLLI;
    public View LLLII;
    public String LLJLLL = "";
    public EnumC21668319r7 LLLIIII = EnumC21668319r7.UNKNOWN;
    public final long LLLIIIIL = System.currentTimeMillis();

    public final C0KT5 uS() {
        return new C0KT5(1, C0KT2.INDEPENDENT_PURCHASE_PAGE, this.LLJLLL, 5);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJZ;
        if (joinDialogProxyViewModel != null) {
            joinDialogProxyViewModel.AQ2(EnumC1095410ebz.ONLY_SUPER_FAN);
        }
        DataChannel dataChannel = this.LLJZIJLIL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLIIIIL;
        C16FS c16fs = this.LLL;
        boolean z = c16fs != null && c16fs.LLJJIJI;
        JoinDialogProxyViewModel joinDialogProxyViewModel2 = this.LLJZ;
        C0KSH.LJII(jCurrentTimeMillis, dataChannel, uS().LIZIZ, z, joinDialogProxyViewModel2 == null || joinDialogProxyViewModel2.LLILLL == null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        if (C1097260eey.LIZIZ()) {
            return C20736316Cj.LIZIZ(R.attr.exe, context);
        }
        return C1911200zpm.LIZ(context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    public final void wS(boolean z) {
        int i;
        View view = this.LLLI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (Intrinsics.LJFF(this.LLJLLL, "fans_club_gift") || Intrinsics.LJFF(this.LLJLLL, "gift_banner")) {
            C1121570fIB c1121570fIB = new C1121570fIB((User) null);
            c1121570fIB.LIZJ = "fans_club_join";
            DataChannel dataChannel = this.LLJZIJLIL;
            if (dataChannel != null) {
                dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannel;
        MutableLiveData<C1AAA> mutableLiveData;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        if (C1097260eey.LIZIZ() && (viewFindViewById = view.findViewById(R.id.dyl)) != null) {
            viewFindViewById.setClipToOutline(true);
            viewFindViewById.setBackgroundResource(R.drawable.drm);
        }
        this.LLL = (C16FS) view.findViewById(R.id.a24);
        this.LLLF = (ImageView) view.findViewById(R.id.user_profile);
        this.LLLFF = (C16F5) view.findViewById(R.id.wpm);
        this.LLLFFI = (ImageView) view.findViewById(R.id.bpm);
        this.LLLFZ = (C16F5) view.findViewById(R.id.fti);
        this.LLLI = view.findViewById(R.id.nnp);
        this.LLLII = view.findViewById(R.id.hc6);
        JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJZ;
        if (joinDialogProxyViewModel != null) {
            C723850SaN.LIZ(this, false, null, new AwS399S0200000_33(this, joinDialogProxyViewModel, 42), 3);
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.eze;
        c1324610kZfLJIIIZ.LJJI(this.LLLF);
        C786410Ut5.I7(new AbS712S0100000_33(this, 15), view.findViewById(R.id.hbk));
        View viewFindViewById2 = view.findViewById(R.id.user_info_container_shadow);
        if (viewFindViewById2 != null) {
            C1143680frq.LJ(viewFindViewById2, "tiktok_live_new_style_fans_club_join_dialog", "ttlive_bg_fans_club_user_info_shadow.png", ImageView.ScaleType.FIT_XY);
        }
        C16F5 c16f5 = this.LLLFF;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(C497740JfY.LJIJI(2131856589));
            sbLIZ.append(']');
            C517700KSa.LIZLLL(c16f5, C497740JfY.LJIJJ(2131852353, C2188811AlT.LIZIZ(sbLIZ)), 82, C20736316Cj.LIZIZ(R.attr.ezs, getContext()), new AwS577S0100000_33(this, 4076));
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel2 = this.LLJZ;
        if (joinDialogProxyViewModel2 != null && (mutableLiveData = joinDialogProxyViewModel2.LLIZ) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS235S0100000_33(this, 68));
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel3 = this.LLJZ;
        if (joinDialogProxyViewModel3 != null) {
            joinDialogProxyViewModel3.BQ2(EnumC1095410ebz.ONLY_SUPER_FAN, uS());
        }
        if ((Intrinsics.LJFF(this.LLJLLL, "fans_club_gift") || Intrinsics.LJFF(this.LLJLLL, "gift_banner")) && (dataChannel = this.LLJZIJLIL) != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gc3, viewGroup, false);
    }
}
