package kotlin.jvm.internal;

import X.C013C;
import X.C01KE;
import X.C09AY;
import X.C0IJT;
import X.C0KPJ;
import X.C0UD4;
import X.C0UX6;
import X.C1161920gLG;
import X.C1454240nwk;
import X.C1454380nwy;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C740100T1k;
import X.C745220TLc;
import X.C750510TcH;
import X.C766270U4b;
import X.C767250U7v;
import X.C768690UDj;
import X.C775690Ubn;
import X.C775710Ubp;
import X.C775850Uc3;
import X.EnumC775860Uc4;
import X.InterfaceC500940Jki;
import X.InterfaceC769000UEo;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.stablemode.DowngradeInfo;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.smb.BoardInfo;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public class AwS448S0200000_12 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS448S0200000_12(C740100T1k c740100T1k, C740100T1k c740100T1k2, Function1<? super Throwable, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c740100T1k;
        this.l1 = c740100T1k2;
    }

    public static final Object invoke$0(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        String str;
        EnumC775860Uc4 enumC775860Uc4;
        ((Boolean) obj).booleanValue();
        C775690Ubn c775690Ubn = (C775690Ubn) awS448S0200000_12.l0;
        C775850Uc3 c775850Uc3 = EnumC775860Uc4.Companion;
        DowngradeInfo downgradeInfo = ((ModuleDecision) obj2).LIZ;
        if (downgradeInfo != null) {
            str = downgradeInfo.level;
        } else {
            str = null;
        }
        c775850Uc3.getClass();
        EnumC775860Uc4 enumC775860Uc4LIZ = C775850Uc3.LIZ(str);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS448S0200000_12.l1;
        EnumC775860Uc4 enumC775860Uc42 = c775690Ubn.LIZIZ;
        if (enumC775860Uc42 != enumC775860Uc4LIZ || (c775690Ubn.LIZ && enumC775860Uc4LIZ == (enumC775860Uc4 = EnumC775860Uc4.NONE) && enumC775860Uc42 == enumC775860Uc4)) {
            c775690Ubn.LIZIZ = enumC775860Uc4LIZ;
            C01KE.LIZ(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), new C775710Ubp(enumC775860Uc4LIZ, c775690Ubn, null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        InterfaceC769000UEo interfaceC769000UEo;
        DataChannel dataChannel;
        LiveEffect liveEffectLIZ = (LiveEffect) obj2;
        if (liveEffectLIZ == null) {
            LiveEffect liveEffectLJIIIIZZ = ((MultiGuestStickerListView) awS448S0200000_12.l0).LJIIIIZZ();
            if (liveEffectLJIIIIZZ != null) {
                InterfaceC769000UEo interfaceC769000UEo2 = (InterfaceC769000UEo) awS448S0200000_12.l1;
                MultiGuestStickerListView multiGuestStickerListView = (MultiGuestStickerListView) awS448S0200000_12.l0;
                if (interfaceC769000UEo2 != null) {
                    interfaceC769000UEo2.lr(C0UD4.LJ);
                }
                multiGuestStickerListView.LLJ.LJIILJJIL(liveEffectLJIIIIZZ);
            }
        } else {
            if (C767250U7v.LIZLLL(((MultiGuestStickerListView) awS448S0200000_12.l0).LJIIIIZZ()) && (interfaceC769000UEo = (InterfaceC769000UEo) awS448S0200000_12.l1) != null) {
                interfaceC769000UEo.lr(C0UD4.LJ);
            }
            ((MultiGuestStickerListView) awS448S0200000_12.l0).LLJ.getClass();
            InterfaceC769000UEo interfaceC769000UEo3 = (InterfaceC769000UEo) awS448S0200000_12.l1;
            if (interfaceC769000UEo3 != null) {
                interfaceC769000UEo3.Gr(C0UD4.LJ, ((MultiGuestStickerListView) awS448S0200000_12.l0).LJIIIIZZ(), liveEffectLIZ);
            }
            ((MultiGuestStickerListView) awS448S0200000_12.l0).LLJ.LJFF(liveEffectLIZ);
        }
        if (LiveEffectStructureOptSetting.INSTANCE.enable() && (dataChannel = ((MultiGuestStickerListView) awS448S0200000_12.l0).LLILZLL) != null) {
            if (liveEffectLIZ == null) {
                liveEffectLIZ = C767250U7v.LIZ();
            }
            dataChannel.zW(StickerSelectChannel.class, liveEffectLIZ);
        }
        ((MultiGuestStickerListView) awS448S0200000_12.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        ((C1454240nwk) awS448S0200000_12.l0).LLLLLJIL().LIZ((C1454380nwy) awS448S0200000_12.l1, (List) obj, (List) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        ((C740100T1k) awS448S0200000_12.l0).getClass();
        Function1 function1 = (Function1) awS448S0200000_12.l1;
        if (function1 != null) {
            function1.invoke(obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasePreviewSettingMainFragmentSheet.initBoard ");
        sbLIZ.append((String) obj2);
        sbLIZ.append(" SMBGoLivePermission");
        C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ));
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) awS448S0200000_12.l0;
        View view = (View) awS448S0200000_12.l1;
        C20337914i1<Long> c20337914i1 = C0KPJ.f123mf;
        Long lLIZIZ = c20337914i1.LIZIZ();
        C0KPJ.nf.LJFF(0L);
        c20337914i1.LJFF(lLIZIZ);
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH;
        RedDotExtensionKt.LJIIJJI(c0ux6, String.valueOf(((BoardInfo) obj).latestGenBoardTimeSec));
        c0ux6.setValid(true);
        RedDotExtensionKt.LJI(view, basePreviewSettingMainFragmentSheetInitializer.LLILZ, null, c0ux6, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        String errorMessage;
        BaseException baseException = (BaseException) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileDownload-onFailed, songId: ");
        sbLIZ.append(((MusicSong) awS448S0200000_12.l0).id);
        sbLIZ.append(", exception: ");
        if (baseException != null) {
            errorMessage = baseException.getErrorMessage();
        } else {
            errorMessage = null;
        }
        sbLIZ.append(errorMessage);
        C20441214yg.LJ("BGMDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
        if (baseException != null && baseException.getErrorCode() == 1006) {
            C766270U4b.LIZLLL(2131842668);
        } else {
            C766270U4b.LIZLLL(2131844638);
        }
        ((C768690UDj) awS448S0200000_12.l1).LIZIZ.remove((MusicSong) awS448S0200000_12.l0);
        ((C768690UDj) awS448S0200000_12.l1).LIZ.LIZIZ((MusicSong) awS448S0200000_12.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        String str;
        C745220TLc c745220TLc = (C745220TLc) obj;
        C745220TLc c745220TLc2 = (C745220TLc) obj2;
        IUserManageService iUserManageService = (IUserManageService) C1161920gLG.LIZJ(IUserManageService.class);
        C750510TcH c750510TcH = (C750510TcH) awS448S0200000_12.l0;
        iUserManageService.B22(c750510TcH.LLILZ.getId(), c750510TcH.LLILZIL, c745220TLc, (C750510TcH) awS448S0200000_12.l0, null);
        C750510TcH c750510TcH2 = (C750510TcH) awS448S0200000_12.l0;
        c750510TcH2.getClass();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && interfaceC500940JkiUser.getCurrentUserId() == c750510TcH2.LLILZ.getOwnerUserId()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mute_set");
        c474500IjALIZ.LJIJJLI(c750510TcH2.LLIZLLLIL);
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(c745220TLc2.LIZ), "default_mute_set");
        c474500IjALIZ.LJJII(Long.valueOf(c745220TLc.LIZ), "mute_duration");
        c474500IjALIZ.LJJII(String.valueOf(c750510TcH2.LLILZIL.getId()), "to_user_id");
        c474500IjALIZ.LJJII("profile_card", "entry_point");
        c474500IjALIZ.LJJII(Long.valueOf(c750510TcH2.LLILZ.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(c750510TcH2.LLILZ.getId()), "room_id");
        c474500IjALIZ.LIZ();
        ((C013C) awS448S0200000_12.l1).element = true;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS448S0200000_12 awS448S0200000_12, Object obj, Object obj2) {
        DataChannel dataChannel = (DataChannel) obj;
        if (Intrinsics.LJFF(obj2, "accept")) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJII(((Long) awS448S0200000_12.l1).longValue(), dataChannel, ((LiveBoardsWidget) awS448S0200000_12.l0).LLJJI);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(C750510TcH c750510TcH, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = c750510TcH;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(C775690Ubn c775690Ubn, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.$t = i;
        this.l0 = c775690Ubn;
        this.l1 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(C1454240nwk c1454240nwk, C1454380nwy c1454380nwy, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1454240nwk;
        this.l1 = c1454380nwy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(View view, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, int i) {
        super(2);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheetInitializer;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(MultiGuestStickerListView multiGuestStickerListView, InterfaceC769000UEo interfaceC769000UEo, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestStickerListView;
        this.l1 = interfaceC769000UEo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(LiveBoardsWidget liveBoardsWidget, Long l, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveBoardsWidget;
        this.l1 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS448S0200000_12(MusicSong musicSong, C768690UDj c768690UDj, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicSong;
        this.l1 = c768690UDj;
    }
}
