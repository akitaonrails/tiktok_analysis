package com.bytedance.android.livesdk.game.broadcast.interruption;

import X.C01GW;
import X.C0IPN;
import X.C0ULC;
import X.C13BV;
import X.C13LP;
import X.C19EG;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C753520Th8;
import X.C776320Uco;
import X.C778190Ufp;
import X.C782110Um9;
import X.C785410UrT;
import X.C930940aKi;
import X.EnumC778210Ufr;
import X.EnumC778250Ufv;
import X.InterfaceC1059280dfi;
import X.InterfaceC772390URp;
import Y.AcS495S0100000_12;
import android.app.ApplicationExitInfo;
import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.game.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.game.ProcessExitGuideData;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewMultiDeviceInterruptGuide implements C0ULC, GenericLifecycleObserver {
    public LiveDialog LL;
    public final C19EG LLILLJJLI;
    public C776320Uco LLILLL;
    public SparkContext LLILZ;
    public final Boolean LLILZIL;
    public final String LLILZLL;
    public final List<ProcessExitGuideData> LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(125));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(126));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume(lifecycleOwner);
        }
    }

    public final long LIZ() {
        if (this.LLIZLLLIL) {
            return ((Number) this.LLJI.getValue()).longValue();
        }
        return 0L;
    }

    @Override // X.C0ULC
    public final boolean LJJLIL() {
        Creator creator;
        Integer numValueOf;
        ApplicationExitInfo applicationExitInfoLIZIZ;
        List<ProcessExitGuideData> list;
        List<Integer> list2;
        if (this.LLILLJJLI != null && !C500260Jjc.LJJIJIIJIL(this.LLILZIL) && !C500260Jjc.LJJIJIIJIL(this.LLILZIL)) {
            if ((InterfaceC772390URp.f128O.LIZIZ().booleanValue() || InterfaceC772390URp.N.LIZIZ().booleanValue()) && C778190Ufp.LIZJ()) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    ProcessExitGuideData processExitGuideData = null;
                    if (room != null && (creator = room.creator) != null && (numValueOf = Integer.valueOf(creator.roomContinue)) != null && numValueOf.intValue() != 0 && (applicationExitInfoLIZIZ = C778190Ufp.LIZIZ(GlobalContext.getApplicationContext())) != null && (list = this.LLIZ) != null) {
                        Iterator<ProcessExitGuideData> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ProcessExitGuideData next = it2.next();
                            ProcessExitGuideData processExitGuideData2 = next;
                            if (Intrinsics.LJFF(processExitGuideData2 != null ? processExitGuideData2.brand : null, C497740JfY.LJ())) {
                                processExitGuideData = next;
                                break;
                            }
                        }
                        ProcessExitGuideData processExitGuideData3 = processExitGuideData;
                        if (processExitGuideData3 != null && (list2 = processExitGuideData3.exitReasonList) != null) {
                            Iterable iterable = processExitGuideData3.exitDescriptionList;
                            if (iterable == null) {
                                iterable = C13BV.INSTANCE;
                            }
                            ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(list2, iterable);
                            if (!arrayList.isEmpty()) {
                                for (Pair pair : arrayList) {
                                    Integer num = (Integer) pair.getFirst();
                                    int reason = applicationExitInfoLIZIZ.getReason();
                                    if (num != null && num.intValue() == reason && Intrinsics.LJFF(pair.getSecond(), applicationExitInfoLIZIZ.getDescription())) {
                                        this.LLIZLLLIL = true;
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    @Override // X.C0ULC
    public final void dismiss() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        LiveDialog liveDialog = this.LL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        SparkContext sparkContext = this.LLILZ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLILLL = null;
    }

    @Override // X.C0ULC
    public final LiveDialog getDialog() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        LiveDialog liveDialog = this.LL;
        if (C500260Jjc.LJJJI(liveDialog != null ? Boolean.valueOf(liveDialog.isShowing()) : null)) {
            return this.LL;
        }
        if (this.LLILLL == null) {
            this.LLILLL = new C776320Uco();
        }
        if (InterfaceC772390URp.f128O.LIZIZ().booleanValue() && C778190Ufp.LIZJ()) {
            num = 2131840700;
            num2 = 2131840697;
            num3 = 2131840698;
            num4 = 2131840699;
        } else {
            num = 2131840708;
            num2 = 2131840705;
            num3 = 2131840706;
            num4 = 2131840707;
        }
        C782110Um9 c782110Um9 = new C782110Um9(this.LLILLJJLI);
        c782110Um9.LJ(new C753520Th8(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"), 2.3f);
        c782110Um9.LJIIZILJ(num.intValue());
        c782110Um9.LJII(num2.intValue());
        c782110Um9.LJIILIIL(num3.intValue(), new AcS495S0100000_12(this, 17));
        c782110Um9.LJIIJ(num4.intValue(), new AcS495S0100000_12(this, 18));
        c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0Ufq
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.LL.getClass();
                C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.N;
                Boolean bool = Boolean.FALSE;
                c20337914i1.LJFF(bool);
                InterfaceC772390URp.f128O.LJFF(bool);
                PreviewMultiDeviceInterruptGuide previewMultiDeviceInterruptGuide = this.LL;
                C776320Uco c776320Uco = previewMultiDeviceInterruptGuide.LLILLL;
                if (c776320Uco != null) {
                    c776320Uco.LJFF(previewMultiDeviceInterruptGuide.LIZ(), EnumC778210Ufr.GO_LIVE_POPUP, EnumC778250Ufv.BEFORE_LIVE);
                }
            }
        };
        c782110Um9.LJIILL = false;
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LL = liveDialogLIZ;
        return liveDialogLIZ;
    }

    public PreviewMultiDeviceInterruptGuide(Fragment fragment) {
        boolean z;
        this.LLILLJJLI = fragment.getActivity();
        MultiDeviceInterruptGuideData data = MultiDeviceInterruptGuideSetting.INSTANCE.getData();
        Integer num = data.enable;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        this.LLILZIL = Boolean.valueOf(z);
        this.LLILZLL = data.guideUrl;
        this.LLIZ = data.processExitGuideList;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Boolean boolValueOf;
        LiveDialog liveDialog = this.LL;
        if (liveDialog != null) {
            boolValueOf = Boolean.valueOf(liveDialog.isShowing());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && !this.LLIZLLLIL && C778190Ufp.LJ()) {
            C776320Uco c776320Uco = this.LLILLL;
            if (c776320Uco != null) {
                c776320Uco.LIZLLL(LIZ(), EnumC778210Ufr.GO_LIVE_POPUP, EnumC778250Ufv.BEFORE_LIVE);
            }
            dismiss();
        }
    }
}
