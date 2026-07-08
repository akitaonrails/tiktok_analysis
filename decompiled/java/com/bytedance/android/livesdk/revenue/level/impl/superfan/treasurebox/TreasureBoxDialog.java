package com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox;

import X.AbstractC517820KSm;
import X.C098200Yq;
import X.C0IJT;
import X.C0KKP;
import X.C0KS8;
import X.C0KSK;
import X.C0KSU;
import X.C16F5;
import X.C189200o6;
import X.C20337914i1;
import X.C454590Hs9;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517830KSn;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC517800KSk;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS17S0600000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public final class TreasureBoxDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGHELIOSslJD8/ZjY5OSohLiQiZzshLSQ/PD02Kio0ZxshLSQ/PD02Cio0DSYyJCor";
    public String LLJLLL = "";
    public String LLJZ = "";
    public final TreasureBoxViewModel LLJZIJLIL;
    public long LLL;
    public final ArrayList<AbstractC517820KSm> LLLF;
    public boolean LLLFF;
    public long LLLFFI;
    public C0KS8 LLLFZ;
    public C0KS8 LLLI;
    public long LLLII;

    public TreasureBoxDialog() {
        WeakReference<TreasureBoxViewModel> weakReference = C517830KSn.LIZ;
        this.LLJZIJLIL = weakReference != null ? weakReference.get() : null;
        this.LLL = 100L;
        this.LLLF = new ArrayList<>();
    }

    public final void wS() {
        View viewFindViewById;
        View viewFindViewById2;
        View view = getView();
        if (view != null && (viewFindViewById2 = view.findViewById(R.id.grz)) != null) {
            viewFindViewById2.clearFocus();
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(R.id.ccd)) == null) {
            return;
        }
        C500260Jjc.LLFFF(viewFindViewById);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void mS(boolean z) {
        boolean z2;
        long followStatus;
        Room roomLJJLIIIIJ;
        User owner;
        FollowInfo followInfo;
        View viewFindViewById;
        if (z) {
            View view = getView();
            if (view != null && (viewFindViewById = view.findViewById(R.id.ccd)) != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            String str = this.LLJLLL;
            long j = this.LLLFFI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_redpacket_define_click");
            c474500IjALIZ.LJIJJLI(dataChannelLJ);
            c474500IjALIZ.LJJII(str, "entrance");
            c474500IjALIZ.LJJII("super_fan", "page_type");
            c474500IjALIZ.LJJII(Long.valueOf(j), "unclaimed_superfan");
            if (dataChannelLJ != null && C500260Jjc.LJIIZILJ(dataChannelLJ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c474500IjALIZ.LJJII(1, "is_anchor");
            } else {
                c474500IjALIZ.LJJII(0, "is_anchor");
                if (dataChannelLJ != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannelLJ)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                    followStatus = followInfo.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
            }
            c474500IjALIZ.LIZ();
            return;
        }
        wS();
    }

    public final void zS(AbstractC517820KSm abstractC517820KSm) {
        for (AbstractC517820KSm abstractC517820KSm2 : this.LLLF) {
            if (abstractC517820KSm2 != abstractC517820KSm && abstractC517820KSm2.LIZ) {
                abstractC517820KSm2.LIZIZ();
            } else if (abstractC517820KSm2 == abstractC517820KSm && !abstractC517820KSm2.LIZ) {
                abstractC517820KSm2.LIZ();
            }
        }
        this.LLLFF = true;
        this.LLLFZ = null;
    }

    public static void BS(C16F5 c16f5, String str) {
        if (C500260Jjc.LJJIJ(str) && !Intrinsics.LJFF(str, "null0")) {
            C500260Jjc.LLFFF(c16f5);
            c16f5.setText(str);
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    c16f5.setAutoSizeTextTypeUniformWithConfiguration(12, 15, 1, 1);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
            return;
        }
        C500260Jjc.LJIILIIL(c16f5);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.0KSg] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        String secUid;
        long id2;
        Room roomLJJLIIIIJ;
        User userLJIIIIZZ;
        User userLJIIIIZZ2;
        super.onViewCreated(view, bundle);
        final View view2 = getView();
        if (view2 != null) {
            final View viewFindViewById = view2.findViewById(R.id.nnp);
            final View viewFindViewById2 = view2.findViewById(R.id.yjp);
            final View viewFindViewById3 = view2.findViewById(R.id.hc6);
            C500260Jjc.LJIILIIL(viewFindViewById2);
            C500260Jjc.LJIILIIL(viewFindViewById3);
            C500260Jjc.LLFFF(viewFindViewById);
            final TreasureBoxViewModel treasureBoxViewModel = this.LLJZIJLIL;
            if (treasureBoxViewModel != null) {
                String str = this.LLJLLL;
                final ?? r14 = new InterfaceC517800KSk() { // from class: X.0KSg
                    @Override // X.InterfaceC517800KSk
                    public final void onFailure() {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS251S0300000_7(viewFindViewById, viewFindViewById3, this.LIZ, 4));
                    }

                    @Override // X.InterfaceC517800KSk
                    public final void LIZ(C0KSY<GetSuperFansTreasureBoxDataResponse.Data> c0ksy, List<C0KS8> list) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS17S0600000_7(this.LIZ, (TreasureBoxDialog) viewFindViewById, viewFindViewById2, (View) c0ksy, (C0KSY<GetSuperFansTreasureBoxDataResponse.Data>) list, (List<C0KS8>) view2, (View) 0));
                    }
                };
                treasureBoxViewModel.LLILLL = null;
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                DataChannel dataChannel = treasureBoxViewModel.getDataChannel();
                if (dataChannel != null && (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
                    id = userLJIIIIZZ2.getId();
                } else {
                    id = 0;
                }
                DataChannel dataChannel2 = treasureBoxViewModel.getDataChannel();
                if (dataChannel2 == null || (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel2)) == null || (secUid = userLJIIIIZZ.getSecUid()) == null) {
                    secUid = "";
                }
                DataChannel dataChannel3 = treasureBoxViewModel.getDataChannel();
                if (dataChannel3 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null) {
                    id2 = roomLJJLIIIIJ.getId();
                } else {
                    id2 = 0;
                }
                ((C0KKP) treasureBoxViewModel.LLILLJJLI.getValue()).LJ(new C0KSK(currentUserId, id, secUid, id2, "fans_treasure_box", 0L, "treasure_box", str, 0, new C0KSU<GetSuperFansTreasureBoxDataResponse.Data>() { // from class: X.0KSZ
                    @Override // X.C0KSU
                    public final void LIZ() {
                    }

                    @Override // X.C0KSU
                    public final void LIZJ(C517630KRt c517630KRt) {
                    }

                    @Override // X.C0KSU
                    public final void LIZLLL(C0KSY<GetSuperFansTreasureBoxDataResponse.Data> c0ksy) {
                        List<SuperFanPackage> list;
                        IapProductDetail iapProductDetail;
                        InterfaceC517800KSk interfaceC517800KSk = r14;
                        ArrayList arrayList = new ArrayList();
                        GetSuperFansTreasureBoxDataResponse.Data data = c0ksy.LIZ;
                        if (data != null && (list = data.treasureBoxPkgInfo) != null) {
                            int i = 0;
                            for (SuperFanPackage superFanPackage : list) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    SuperFanPackage superFanPackage2 = superFanPackage;
                                    Map<String, IapProductDetail> map = c0ksy.LIZJ;
                                    if (map != null && (iapProductDetail = map.get(superFanPackage2.iapid)) != null) {
                                        arrayList.add(new C0KS8(superFanPackage2, null, iapProductDetail, 1));
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        interfaceC517800KSk.LIZ(c0ksy, arrayList);
                    }

                    @Override // X.C0KSU
                    public final void LJ(C0KQW c0kqw) {
                        GetSuperFansTreasureBoxDataResponse.Data data = treasureBoxViewModel.LLILLL;
                        if (data == null) {
                            r14.onFailure();
                        } else {
                            r14.LIZ(new C0KSY<>(data, null, null), new ArrayList());
                        }
                    }

                    @Override // X.C0KSU
                    public final void LJFF(GetSuperFansTreasureBoxDataResponse.Data data) {
                        treasureBoxViewModel.LLILLL = data;
                    }

                    @Override // X.C0KSU
                    public final void LIZIZ(Integer num, String str2) {
                        treasureBoxViewModel.LLILLL = null;
                        r14.onFailure();
                    }
                }));
            }
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.I9;
        if (c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.FALSE);
            View view3 = getView();
            if (view3 != null) {
                HandlerHook.viewPost(view3, new ARunnableS107S0100000_7(this, 159));
            }
        }
    }

    public final void yS(AbstractC517820KSm abstractC517820KSm, C0KS8 c0ks8) {
        for (AbstractC517820KSm abstractC517820KSm2 : this.LLLF) {
            if (abstractC517820KSm2 != abstractC517820KSm && abstractC517820KSm2.LIZ) {
                abstractC517820KSm2.LIZIZ();
            } else if (abstractC517820KSm2 == abstractC517820KSm && !abstractC517820KSm2.LIZ) {
                abstractC517820KSm2.LIZ();
            }
        }
        this.LLLFF = false;
        this.LLLFZ = c0ks8;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gc2, viewGroup, false);
    }

    public final void uS(C16F5 c16f5, C16F5 c16f52, int i) {
        if (i > 0) {
            c16f5.setWidth(i);
            c16f52.setWidth(i);
        }
        if (C454590Hs9.LIZ(getContext())) {
            c16f5.setGravity(3);
            c16f52.setGravity(3);
        } else {
            c16f5.setGravity(5);
            c16f52.setGravity(5);
        }
    }
}
