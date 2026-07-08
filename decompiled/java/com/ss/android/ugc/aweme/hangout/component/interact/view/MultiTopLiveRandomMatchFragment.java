package com.ss.android.ugc.aweme.hangout.component.interact.view;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09JN;
import X.C1121670fIL;
import X.C1143680frq;
import X.C11NZ;
import X.C11S5;
import X.C1295960jpS;
import X.C13LE;
import X.C15438062q;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2365109On;
import X.C2479209na;
import X.C338490DOt;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C477500Io0;
import X.C477860Ioa;
import X.C478990IqP;
import X.C481410IuJ;
import X.C481440IuM;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C516201zk;
import X.C724750Sbp;
import X.C766270U4b;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1296230jpt;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import Y.AfS41S1100000_3;
import Y.AkS0S0020001_3;
import Y.AkS8S0010000_3;
import Y.AkS9S0010000_7;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRandomMatchStartTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRoomMatchConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopliveMatchDisableBackPressSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.OptimizeEnterRoomPipelineSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentDismissEvent;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentShowEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveRandomMatchFragment;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveRandomMatchFragment extends LiveDialogFragment {
    public static final C478990IqP LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0tJyg8PTFiKiA+OCoiLCEnZiwiHELIOSPSohKSY4Zzk6LTJiBDo/PCwYJj8fITMpGy49LCohBC4nKy0KOy40JSAiPQ==";
    public Bitmap LL;
    public final AssemVMLazy LLILLJJLI;
    public String LLILLL;
    public Long LLILZ;
    public int LLILZIL;
    public C1295960jpS LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public final C01GW LLJ;
    public C481410IuJ LLJI;
    public Function2<? super List<Long>, ? super String, Unit> LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public volatile boolean LLJJI;
    public long LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0IqP] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTopLiveRandomMatchFragment.class, "randomMatchViewModel", "getRandomMatchViewModel()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveRandomMatchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0IqP
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLJJIJIIJIL = true;
        C1295960jpS c1295960jpS = this.LLILZLL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLILZLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllLottieOnCompositionLoadedListener();
        }
        Bitmap bitmap = this.LL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LL = null;
        synchronized (C2479209na.LIZ) {
            Iterator<Map.Entry<String, Bitmap>> it2 = C2479209na.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJJJ(it2.next().getValue());
            }
            C2479209na.LIZIZ.clear();
        }
        NR().xQ2("onDestroy");
        this.LLJIJIL = null;
        this.LLJJI = false;
        this.LLJJ = null;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJI = null;
        super.onDestroy();
    }

    public MultiTopLiveRandomMatchFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveRandomMatchViewModel.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 200);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(75);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 201), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 202), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 203), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILZIL = 3;
        MultiTopLiveRoomMatchConfigSetting.getRoomMatchTimeoutDuration();
        this.LLJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(127));
        this.LLJILJIL = -1L;
    }

    public final MultiTopLiveRandomMatchViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (MultiTopLiveRandomMatchViewModel) assemVMLazy.getValue();
    }

    public final boolean PR() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    public final void ZR() {
        C1295960jpS c1295960jpS;
        try {
            if (!C2479209na.LIZ.LIZ("user_image") || (c1295960jpS = this.LLILZLL) == null) {
                return;
            }
            c1295960jpS.updateBitmap("user_image", C2479209na.LIZIZ.get(C2479209na.LIZIZ("user_image")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLottieGuestAvatar error, msg=");
            sbLIZ.append(th.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c477500Io0.getClass();
            C477500Io0.LJIILLIIL("MultiTopLiveRandomMatchFragment", strLIZIZ, null);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.dim);
        c500980Jkm.LIZJ = R.style.y0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIIIZ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        if (MultiTopliveMatchDisableBackPressSetting.INSTANCE.isEnable()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "onResume enterForeground");
        if (!this.LLJILJILJ) {
            if (MultiTopLiveRandomMatchStartTimeOptSetting.INSTANCE.isEnable()) {
                this.LLJJIII = System.currentTimeMillis();
                return;
            }
            return;
        }
        this.LLJILJILJ = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLJILJIL;
        if (j <= 0) {
            j = 0;
        }
        long j2 = j > 0 ? jCurrentTimeMillis - j : 0L;
        if (j <= 0 || j2 < MultiTopLiveRoomMatchConfigSetting.getRoomMatchTimeoutDuration() * 1000) {
            C481410IuJ c481410IuJ = this.LLJI;
            if (c481410IuJ != null) {
                if (jCurrentTimeMillis - c481410IuJ.LIZLLL <= MultiTopLiveRoomMatchConfigSetting.getMatchSuccessExpireTime() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    OR(c481410IuJ);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("background match success info expired, randomMatchSuccessInfo= ");
                sbLIZ.append(c481410IuJ);
                C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJI = null;
                return;
            }
            return;
        }
        this.LLJILLL = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("background match success info expired, durationInBackground= ");
        sbLIZ2.append(j2);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ2));
        String str = this.LLILLL;
        if (str == null) {
            return;
        }
        long j3 = jCurrentTimeMillis - this.LLJJIII;
        String str2 = this.LLJJIJI;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("backToForeground_");
        C481410IuJ c481410IuJ2 = this.LLJI;
        sbLIZ3.append(c481410IuJ2 != null ? c481410IuJ2.LIZIZ : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        C481410IuJ c481410IuJ3 = this.LLJI;
        int i = (c481410IuJ3 == null || c481410IuJ3.LIZ == null) ? 0 : 1;
        List list = (List) NR().LLILZ.getValue();
        Integer numValueOf = Integer.valueOf(i + (list != null ? list.size() : 0));
        C481410IuJ c481410IuJ4 = this.LLJI;
        C477860Ioa.LJIIJJI("time_out_return", str, "fail", true, j3, str2, strLIZIZ, null, null, numValueOf, c481410IuJ4 != null ? c481410IuJ4.LIZJ : null, -1L, "timeout_background", 384);
        NR().xQ2("expired");
        C766270U4b.LIZLLL(2131854692);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("backToForeground_");
        C481410IuJ c481410IuJ5 = this.LLJI;
        sbLIZ4.append(c481410IuJ5 != null ? c481410IuJ5.LIZIZ : null);
        SR(C2188811AlT.LIZIZ(sbLIZ4), "time_out_return", null, null, null);
        this.LLJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NR().yQ2();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLJILJILJ = true;
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "onStop enterBackground");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    public final String MR(RecommendedRoom recommendedRoom) {
        int i = recommendedRoom.roomType;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "anchor_invite";
                }
                return "normal";
            }
            return "auto_permit";
        }
        return "normal";
    }

    public final void OR(final C481410IuJ c481410IuJ) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (NR().LLILZLL || c481410IuJ.LIZ == null) {
            return;
        }
        if (!isResumed()) {
            this.LLJI = c481410IuJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("in background, so hold on handleRandomMatchSucceed, randomMatchSuccessInfo= ");
            sbLIZ.append(c481410IuJ);
            C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        final RecommendedRoom recommendedRoom = c481410IuJ.LIZ;
        String str = c481410IuJ.LIZIZ;
        final String str2 = c481410IuJ.LIZJ;
        Integer num = null;
        this.LLJI = null;
        C477500Io0 c477500Io0 = C477500Io0.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(", first room is auto permit room");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c477500Io0.getClass();
        C477500Io0.LJIILLIIL("MultiTopLiveRandomMatchFragment", strLIZIZ, null);
        final long j = recommendedRoom.roomId;
        List list = (List) NR().LLILZ.getValue();
        ArrayList arrayList3 = new ArrayList();
        Room room = recommendedRoom.room;
        if (room != null) {
            arrayList3.add(room);
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Room room2 = ((RecommendedRoom) it2.next()).room;
                if (room2 != null) {
                    arrayList.add(room2);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        arrayList3.addAll(arrayList);
        if (list != null) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Long.valueOf(((RecommendedRoom) it3.next()).roomId));
            }
            arrayList2 = new ArrayList(arrayList4);
        } else {
            arrayList2 = new ArrayList();
        }
        arrayList2.remove(Long.valueOf(j));
        int size = arrayList2.size() + 1;
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        Room room3 = recommendedRoom.room;
        if (OptimizeEnterRoomPipelineSetting.INSTANCE.enable() && room3 != null && room3.getId() > 0) {
            C477500Io0 c477500Io02 = C477500Io0.LIZ;
            int i = recommendedRoom.roomType;
            String string = arrayList2.toString();
            String str3 = this.LLILLL;
            if (str3 == null) {
                return;
            }
            Long l = this.LLILZ;
            String str4 = this.LLJJ;
            if (!PR()) {
                arrayList3 = null;
            }
            if (PR()) {
                num = 0;
            }
            C477500Io0.LJIJI(c477500Io02, j, room3, str3, l, str4, false, null, string, Integer.valueOf(i), null, arrayList3, num, null, null, null, 29280);
        } else {
            C477500Io0 c477500Io03 = C477500Io0.LIZ;
            int i2 = recommendedRoom.roomType;
            String string2 = arrayList2.toString();
            String str5 = this.LLILLL;
            if (str5 == null) {
                return;
            }
            Long l2 = this.LLILZ;
            c477500Io03.getClass();
            C477500Io0.LIZJ(i2, j, l2, string2, str5, str2, str);
        }
        RR(j, arrayList2);
        String str6 = this.LLILLL;
        if (str6 == null) {
            return;
        }
        String strMR = MR(recommendedRoom);
        String str7 = c481410IuJ.LIZIZ;
        boolean z = c481410IuJ.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        String str8 = this.LLJJIJI;
        if (str8 == null) {
            str8 = "";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleRandomMatchSucceed_");
        sbLIZ3.append(c481410IuJ.LIZIZ);
        C477860Ioa.LJIIJJI("match_success", str6, "success", z, jCurrentTimeMillis, str8, C2188811AlT.LIZIZ(sbLIZ3), str7, strMR, Integer.valueOf(size), null, null, null, 7168);
        View view = getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.0IuK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiTopLiveRandomMatchFragment@5d7e.handleRandomMatchSucceed$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiTopLiveRandomMatchFragment@5d7e.handleRandomMatchSucceed$3");
                }

                public final void LIZ() {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handleRandomMatchSucceed_");
                    sbLIZ4.append(c481410IuJ.LIZIZ);
                    this.SR(C2188811AlT.LIZIZ(sbLIZ4), "match_success", str2, Long.valueOf(recommendedRoom.anchorId), Long.valueOf(j));
                }
            }, 300L);
        }
    }

    public final void VR(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "updateViewWithMatchState RandoMatchState.FAIL");
                        return;
                    }
                    return;
                }
                C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "updateViewWithMatchState RandoMatchState.SUCCESS");
                return;
            }
            C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "updateViewWithMatchState RandoMatchState.MATCHING");
            return;
        }
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", "updateViewWithMatchState RandoMatchState.IDLE");
    }

    public final void WR(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        try {
            C1295960jpS c1295960jpS = this.LLILZLL;
            if (c1295960jpS != null) {
                c1295960jpS.updateBitmap("color", bitmap);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLottieBgImage error, msg=");
            sbLIZ.append(th.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c477500Io0.getClass();
            C477500Io0.LJIILLIIL("MultiTopLiveRandomMatchFragment", strLIZIZ, null);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Long lValueOf;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("arg_module_name");
            if (string == null) {
                string = "";
            }
            this.LLILLL = string;
            if (arguments.containsKey("arg_mg_agg_id")) {
                lValueOf = Long.valueOf(arguments.getLong("arg_mg_agg_id"));
            } else {
                lValueOf = null;
            }
            this.LLILZ = lValueOf;
            arguments.getDouble("arg_timeout_sec", MultiTopLiveRoomMatchConfigSetting.getRoomMatchTimeoutDuration());
            this.LLILZIL = arguments.getInt("arg_module_type", 3);
        }
    }

    public final void RR(long j, List<Long> list) {
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(Long.valueOf(j));
        listLJIILJJIL.addAll(list);
        Function2<? super List<Long>, ? super String, Unit> function2 = this.LLJIJIL;
        if (function2 != null) {
            function2.invoke(listLJIILJJIL, this.LLILLL);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        String str;
        Long l;
        int i;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = view;
        this.LLILZLL = (C1295960jpS) view.findViewById(R.id.b3j);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.tv_random_match_title);
        C500260Jjc.LJLJL((int) (C497740JfY.LJIILLIIL() * 0.11f), this.LLILZLL);
        View viewFindViewById = view.findViewById(R.id.ctt);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS586S0100000_7(this, 355));
        }
        View viewFindViewById2 = view.findViewById(R.id.i3r);
        if (viewFindViewById2 != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS586S0100000_7(this, 357));
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            HandlerHook.viewPostDelay(tuxTextView, new ARunnableS107S0100000_7(this, 164), Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1792);
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.aeb;
            }
        }
        VR(0);
        Context context = getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            C1295960jpS c1295960jpS = this.LLILZLL;
            if (c1295960jpS != null) {
                C786410Ut5.Wb(c1295960jpS, -1.0f);
            }
        } else {
            C1295960jpS c1295960jpS2 = this.LLILZLL;
            if (c1295960jpS2 != null) {
                C786410Ut5.Wb(c1295960jpS2, 1.0f);
            }
        }
        NR().vQ2();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C481440IuM(this, null), 3);
        C1295960jpS c1295960jpS3 = this.LLILZLL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllLottieOnCompositionLoadedListener();
        }
        C1295960jpS c1295960jpS4 = this.LLILZLL;
        if (c1295960jpS4 != null) {
            c1295960jpS4.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0Iua
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    this.LL.ZR();
                    MultiTopLiveRandomMatchFragment multiTopLiveRandomMatchFragment = this.LL;
                    multiTopLiveRandomMatchFragment.WR(multiTopLiveRandomMatchFragment.LL);
                }
            });
        }
        if (bundle == null) {
            TuxTextView tuxTextView2 = this.LLIZ;
            if (tuxTextView2 != null) {
                int i2 = this.LLILZIL;
                if (i2 != 1) {
                    if (i2 != 3 && i2 == 5) {
                        i = 2131854561;
                    } else {
                        i = 2131854566;
                    }
                } else {
                    i = 2131854560;
                }
                tuxTextView2.setText(i);
            }
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 585);
            int i3 = this.LLILZIL;
            if (i3 != 1) {
                if (i3 != 3 && i3 == 5) {
                    str = "debating_bg.png";
                } else {
                    str = "random_chat_bg.png";
                }
            } else {
                str = "dating_bg.png";
            }
            C11NZ.LJIJJLI(new C2365109On("tiktok_live_interaction_normal_2", str)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS176S0100000_7(this, 149), new C09JN() { // from class: X.0IqT
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiTopLiveRandomMatchFragment@5d7e.loadGeckoLottieAnimator$2");
                    C477500Io0.LIZ.getClass();
                    C477500Io0.LJIILLIIL("MultiTopLiveRandomMatchFragment", "load bg bitmap fail", (Throwable) obj);
                    C1C7U.LIZIZ("MultiTopLiveRandomMatchFragment@5d7e.loadGeckoLottieAnimator$2");
                }
            });
            C1143680frq.LJIILIIL(this.LLILZLL, "tiktok_live_interaction_normal_2", "live_mg_top_live_random_matching_loading.zip", "images", true, null, Boolean.FALSE, null, new WeakReference(new AwS216S0300000_7(this, new C013C(), awS551S0100000_7, 5)));
            C2479209na c2479209na = C2479209na.LIZ;
            ImageModel avatarThumb = UserService.getInstance().user().LJIJJLI().getAvatarThumb();
            boolean zLJJ = C497740JfY.LJJ();
            AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(this, 59);
            if (c2479209na.LIZ("user_image")) {
                awS621S0100000_7.invoke(Boolean.TRUE, null);
            } else {
                C1121670fIL.LJ(avatarThumb).LJJJ(new AkS0S0020001_3(180.0f, zLJJ, false, 1), false).LJJJ(new AkS8S0010000_3(true, 1), false).LJJJ(new AkS9S0010000_7(false, 2), false).LJJLL(new AfS41S1100000_3(awS621S0100000_7, 7), new C516201zk(awS621S0100000_7, 360));
            }
            MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModelNR = NR();
            String str2 = this.LLILLL;
            if (str2 != null && (l = this.LLILZ) != null) {
                multiTopLiveRandomMatchViewModelNR.AQ2(l.longValue(), str2);
            }
        }
        if (!MultiTopLiveRandomMatchStartTimeOptSetting.INSTANCE.isEnable()) {
            this.LLJJIII = System.currentTimeMillis();
        }
        String str3 = this.LLILLL;
        if (str3 == null) {
            str3 = "";
        }
        C477860Ioa.LIZIZ(str3);
        DataChannelGlobal.LLILZ.GQ2(TopLiveRandomMatchFragmentShowEvent.class);
    }

    public final void SR(String str, String str2, String str3, Long l, Long l2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissAndRelease source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!isShowing()) {
            return;
        }
        dismiss();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        String str4 = this.LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        C477860Ioa.LIZLLL(jCurrentTimeMillis, str4, str2, str3, l, l2);
        int iHashCode = str2.hashCode();
        if (iHashCode != 3135262) {
            if (iHashCode != 1013824052) {
                if (iHashCode != 1577551859 || !str2.equals("time_out_return")) {
                    return;
                }
            } else if (!str2.equals("match_cancel")) {
                return;
            }
        } else if (!str2.equals("fail")) {
            return;
        }
        DataChannelGlobal.LLILZ.GQ2(TopLiveRandomMatchFragmentDismissEvent.class);
    }
}
