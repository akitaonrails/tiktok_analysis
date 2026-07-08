package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0JSS;
import X.C0TZM;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C16F5;
import X.C1819620xS4;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C842240X2g;
import Y.AObserverS221S0100000_17;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: loaded from: classes18.dex */
public class FansClubJoinDialogV3 extends AbsNewFansClubJoinDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJDHELIOS8/ZiMtJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKg8jICEXISQgJigFew==";
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;

    public FansClubJoinDialogV3() {
        super(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aid : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g66);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void OR() {
        MutableLiveData<GetNonFansUserDataResponse.Data> mutableLiveData;
        super.OR();
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        if (joinDialogViewModel == null || (mutableLiveData = joinDialogViewModel.LLJ) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 26));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    public FansClubJoinDialogV3(int i) {
        super(false);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public void NR(View view) {
        View viewFindViewById = view.findViewById(R.id.bps);
        View viewFindViewById2 = view.findViewById(R.id.iy1);
        View viewFindViewById3 = view.findViewById(R.id.bsr);
        View viewFindViewById4 = view.findViewById(R.id.f754mmc);
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v2_badge.png");
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v2_exclusive_gifts.png");
        C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v2_entrance_spotlight.png");
        C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_v2_level_up.png");
        WR(view);
    }

    public final void WR(View view) {
        Room room;
        User owner;
        Gift fansClubGift;
        ImageModel imageModel;
        View viewFindViewById = view.findViewById(R.id.m05);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            C0JSS.LJII(this.LLIZLLLIL, owner.getAvatarThumb());
            if (this.LLILLL != null && (fansClubGift = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getFansClubGift()) != null && (imageModel = fansClubGift.image) != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(C842240X2g.LIZ(imageModel));
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
                c1324610kZfLIZJ.LJJI(viewFindViewById);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZR(tikcast.api.fans.GetNonFansUserDataResponse.Data r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3.ZR(tikcast.api.fans.GetNonFansUserDataResponse$Data):void");
    }

    public FansClubJoinDialogV3(boolean z) {
        super(z);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        JoinDialogViewModel joinDialogViewModel;
        super.onViewCreated(view, bundle);
        if (FansClubJoinDialogStyleSetting.INSTANCE.getValue() != 3 && (joinDialogViewModel = this.LLILLL) != null) {
            joinDialogViewModel.wQ2();
        }
        this.LLJL = view.findViewById(R.id.ql6);
        this.LLJLIL = view.findViewById(R.id.qkx);
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }
}
