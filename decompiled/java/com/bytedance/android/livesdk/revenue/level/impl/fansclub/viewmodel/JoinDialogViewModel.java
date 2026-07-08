package com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel;

import X.C0UO0;
import X.C1095610ecJ;
import X.C1095630ecL;
import X.C1151670g4j;
import X.C1161920gLG;
import X.C1529590puH;
import X.C1537060q6K;
import X.C480460Ism;
import X.C495520Jby;
import X.C495540Jc0;
import X.C497740JfY;
import X.C518180KTw;
import Y.AfS4S0000100_17;
import Y.AfS6S0100100_17;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationFansGroupGuideV2Setting;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV2;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV2New;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.data.FansClubBanner;

/* JADX INFO: loaded from: classes18.dex */
public final class JoinDialogViewModel extends LiveWidgetViewModel {
    public static final /* synthetic */ int LLJILJIL = 0;
    public Fragment LLILLJJLI;
    public Fragment LLILLL;
    public FansClubStickerJoinDialog LLILZ;
    public long LLILZIL;
    public boolean LLJI;
    public C1095610ecJ LLJIJIL;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 4));
    public final MutableLiveData<String> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<FansClubBanner> LLIZ = new MutableLiveData<>(null);
    public final MutableLiveData<Long> LLIZLLLIL = new MutableLiveData<>(100L);
    public final MutableLiveData<GetNonFansUserDataResponse.Data> LLJ = new MutableLiveData<>(null);

    public static Fragment vQ2() {
        return LiveSheetMigrationFansGroupGuideV2Setting.INSTANCE.enable() ? new FansClubJoinDialogV2New() : new FansClubJoinDialogV2(false);
    }

    public final boolean xQ2() {
        GetNonFansUserDataResponse.Data value;
        GetNonFansUserDataResponse.Data value2;
        GetNonFansUserDataResponse.Data value3;
        Room room;
        User owner;
        if (this.LLJ.getValue() == null) {
            return false;
        }
        DataChannel dataChannel = getDataChannel();
        boolean zIsFollowing = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) ? false : owner.isFollowing();
        GetNonFansUserDataResponse.Data value4 = this.LLJ.getValue();
        return (value4 != null ? value4.sendingGiftNum : -1L) > 0 || ((value = this.LLJ.getValue()) != null && value.sendCommentNum > 0) || (((value2 = this.LLJ.getValue()) != null && value2.watchLiveMinute > 0) || (((value3 = this.LLJ.getValue()) != null && value3.watchLiveTimes > 0) || zIsFollowing));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1095610ecJ c1095610ecJ = this.LLJIJIL;
        if (c1095610ecJ != null) {
            C1095630ecL c1095630ecL = c1095610ecJ.LJ;
            if (c1095630ecL != null) {
                c1095630ecL.LIZIZ = -1;
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LJIILL("JoinFansClubBiz");
            }
            c1095610ecJ.LJ = null;
            c1095610ecJ.LIZJ = false;
            c1095610ecJ.LIZIZ = null;
        }
    }

    public final void wQ2() {
        Room room;
        User owner;
        String secUid;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            return;
        }
        String secUid2 = UserService.getInstance().user().getCurrentUser().getSecUid();
        if (secUid2 == null) {
            secUid2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C480460Ism.LIZ().getClass();
        ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getFansUserData(secUid2, secUid).LJFF(new C0UO0()).LJJIIZ(new AfS6S0100100_17(jCurrentTimeMillis, this, 4), new AfS4S0000100_17(jCurrentTimeMillis, 0));
    }

    public final void BQ2(String str) {
        if (this.LLJIJIL != null) {
            return;
        }
        C1095610ecJ c1095610ecJ = new C1095610ecJ(getDataChannel());
        this.LLJIJIL = c1095610ecJ;
        c1095610ecJ.LIZLLL(str, false);
    }

    public final void AQ2(Context context, int i, String str, String str2, String str3) {
        String str4;
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c495520Jby.LIZJ("roma_page_key", str);
        float fLJJI = C497740JfY.LJJI((int) (((double) C497740JfY.LJIILLIIL()) * 0.7d));
        ((ArrayList) c495520Jby.LIZ).add(new C495540Jc0("height", String.valueOf(fLJJI)));
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        }
        if (Intrinsics.LJFF(str, "roma_schema_page_user_rank")) {
            str4 = "member_list";
        } else if (Intrinsics.LJFF(str, "roma_schema_page_user_faq")) {
            str4 = "faq";
        } else {
            str4 = "";
        }
        C518180KTw.LJIILLIIL(getDataChannel(), "click", str2, Boolean.TRUE, str4, Integer.valueOf(i), this.LLJI, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(final android.content.Context r27, final java.lang.String r28, final int r29, java.util.Map<java.lang.String, ? extends java.lang.Object> r30, java.lang.String r31, final java.lang.String r32, final boolean r33, boolean r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel.yQ2(android.content.Context, java.lang.String, int, java.util.Map, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void");
    }
}
