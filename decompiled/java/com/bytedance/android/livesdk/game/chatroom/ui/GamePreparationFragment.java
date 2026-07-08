package com.bytedance.android.livesdk.game.chatroom.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0IGR;
import X.C0IJT;
import X.C0UO0;
import X.C11JF;
import X.C11NJ;
import X.C12ES;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19490011Na;
import X.C19EG;
import X.C19GS;
import X.C2162308dZ;
import X.C439101nJ;
import X.C452501pT;
import X.C474500IjA;
import X.C754700Tj2;
import X.C773730UWt;
import X.C782110Um9;
import X.C786170Ush;
import X.C786410Ut5;
import X.InterfaceC420801kM;
import X.InterfaceC773750UWv;
import X.InterfaceC776650UdL;
import Y.AcS495S0100000_12;
import Y.AfS4S0100100_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationDefinitionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedDetectionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedTipsDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.comp.api.game.PrepareCountDown;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameCountDownNum;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreparationFragment extends BaseFragment implements InterfaceC776650UdL, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGEwHELIOSICQ4OyA8JWs5IGEUKSgpGT02OCQ+KDs6JysKOy40JSAiPQ==";
    public LiveIconView LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public LinearLayout LLIZ;
    public LiveIconView LLIZLLLIL;
    public WidgetManager LLJ;
    public ScreenRecordStatusWidget LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public final C11NJ LLJILJILJ;
    public boolean LLJILLL;
    public DataChannel LLJJ;
    public InterfaceC773750UWv LLJJI;
    public C11JF LLJJIII;
    public long LLJJIJI;
    public Room LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    @Override // X.InterfaceC776650UdL
    public final void Cg() {
        PR(false);
        OR(0L);
    }

    @Override // X.InterfaceC776650UdL
    public final Fragment getFragment() {
        return this;
    }

    public final void NR() {
        long j = this.LLJILJIL;
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        Locale locale = Locale.US;
        c16f5.setText(C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
        C16F5 c16f52 = this.LLILZLL;
        (c16f52 != null ? c16f52 : null).setText(C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1)));
    }

    public final String RR() {
        return (String) this.LLJJIJIL.getValue();
    }

    public final WidgetManager SR() {
        WidgetManager widgetManager = this.LLJ;
        if (widgetManager != null) {
            return widgetManager;
        }
        return null;
    }

    public final void ZR() {
        if (this.LLJILLL) {
            return;
        }
        long j = this.LLJILJIL;
        if (j > 0) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LLJILLL = true;
            InterfaceC420801kM interfaceC420801kMLJJLJLI = C19490011Na.LIZLLL(0L, 1 + j, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIIJZLJL(new C786170Ush(this, 3)).LJJLJLI(new AfS4S0100100_12(j, this, 8));
            this.LLJJIII = (C11JF) interfaceC420801kMLJJLJLI;
            this.LLJILJILJ.LIZ(interfaceC420801kMLJJLJLI);
        }
    }

    public final void aS() {
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel == null) {
            dataChannel = null;
        }
        Boolean bool = (Boolean) dataChannel.gg0(GamePreparationDefinitionDialogAlive.class);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        DataChannel dataChannel2 = this.LLJJ;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        Boolean bool2 = (Boolean) dataChannel2.gg0(GamePreparationNetworkSpeedDetectionDialogAlive.class);
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        DataChannel dataChannel3 = this.LLJJ;
        Boolean bool3 = (Boolean) (dataChannel3 != null ? dataChannel3 : null).gg0(GamePreparationNetworkSpeedTipsDialogAlive.class);
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!zBooleanValue && !zBooleanValue2 && !zBooleanValue3) {
            ZR();
        } else if (this.LLJILLL) {
            PR(true);
        }
    }

    @Override // X.InterfaceC776650UdL
    public final void bh() {
        LiveIconView liveIconView = this.LLIZLLLIL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C12ES.LJIILL(0, liveIconView);
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C439101nJ.LJI(linearLayout);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(getString(2131842601));
        C16F5 c16f52 = this.LLILZ;
        (c16f52 != null ? c16f52 : null).setText(getString(2131842600));
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        UR("exit");
        PR(false);
        if (getContext() != null) {
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIIZILJ(2131842594);
            c782110Um9.LJIILIIL(2131842593, new AcS495S0100000_12(this, 65));
            c782110Um9.LJIIJ(2131842592, new AcS495S0100000_12(this, 66));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        Room room = this.LLJJIJIIJIL;
        C773730UWt.LIZIZ(String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.FQ2(GamePreparationPageDestroyEvent.class);
        super.onDestroy();
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LLJILLL = false;
        this.LLJILJILJ.LJ();
    }

    public GamePreparationFragment() {
        Long lValueOf;
        int value = BroadcastGameCountDownNum.INSTANCE.getValue();
        long jLongValue = (value <= 0 || (lValueOf = Long.valueOf((long) value)) == null) ? 90L : lValueOf.longValue();
        this.LLJIJIL = jLongValue;
        this.LLJILJIL = jLongValue;
        this.LLJILJILJ = new C11NJ();
        this.LLJJIJI = -1L;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(132));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLJJIJI = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        VR("background");
    }

    public final void OR(long j) {
        if (j < 0) {
            return;
        }
        this.LLJILJIL = j;
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(PrepareCountDown.class, Long.valueOf(j));
        NR();
    }

    public final void PR(boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LLJILLL = false;
        if (z) {
            OR(this.LLJIJIL);
        }
        C11NJ c11nj = this.LLJILJILJ;
        C11JF c11jf = this.LLJJIII;
        if (c11jf == null) {
            c11jf = null;
        }
        c11nj.LIZJ(c11jf);
    }

    public final void UR(String str) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_prepare_page_leave");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJII(RR());
        c474500IjALIZ.LJJII(str, "position");
        Room room = this.LLJJIJIIJIL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJIJIIJI(lValueOf);
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(str, "confirm")) {
            VR("exit");
        }
    }

    public final void VR(String str) {
        int iValueOf;
        Long lValueOf;
        String str2;
        if (this.LLJJIJI < 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_prepare_page_stay_time");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJII(RR());
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LLJJIJI), "duration");
        c474500IjALIZ.LJJII(str, "reason");
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        if (gameTagLIZIZ != null && (str2 = gameTagLIZIZ.packageName) != null) {
            iValueOf = Integer.valueOf(C2162308dZ.LJFF(getContext(), str2) ? 1 : 0);
        } else {
            iValueOf = 0;
        }
        c474500IjALIZ.LJJII(iValueOf, "if_default_game");
        Room room = this.LLJJIJIIJIL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJIJIIJI(lValueOf);
        c474500IjALIZ.LIZ();
        this.LLJJIJI = -1L;
    }

    public final void WR(DataChannel dataChannel, GameBroadcastFragment gameBroadcastFragment) {
        this.LLJJ = dataChannel;
        this.LLJJIJIIJIL = (Room) dataChannel.gg0(RoomChannel.class);
        this.LLJJI = gameBroadcastFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e0  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GamePreparationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gil, viewGroup, false);
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
