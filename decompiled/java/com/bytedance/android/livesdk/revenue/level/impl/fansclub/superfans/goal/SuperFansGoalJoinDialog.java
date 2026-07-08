package com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal;

import X.C0KT0;
import X.C0KT2;
import X.C0KVU;
import X.C0UO0;
import X.C1161920gLG;
import X.C13LP;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C1848410yCV;
import X.C20736316Cj;
import X.C2187701Ajg;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C427760Gpy;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import X.InterfaceC517900KSu;
import X.InterfaceC518010KTf;
import Y.ACListenerS142S0100000_7;
import Y.AfS3S0100100_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.SuperFansGoalApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.SuperFansGoalViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS251S0300000_7;
import mf.a;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFansGoalJoinDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/HELIOSZiMtJzwwJDAuZzwmOCA+Ly49O2srJi4/ZhY5OSohDiQiOgg8KSkGJiY9DCwtJSA0";
    public String LLJLLL = "";
    public SuperFansGoalViewModel LLJZ;
    public SuperFanViewModel LLJZIJLIL;
    public DataChannel LLL;
    public C16FZ LLLF;
    public C16FS LLLFF;
    public C16F5 LLLFFI;
    public C427760Gpy LLLFZ;
    public ViewGroup LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public FrameLayout LLLIIIIL;

    public final void yS() {
        if (this.LLLIIII && this.LLLII) {
            C16FZ c16fz = this.LLLF;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 8);
                return;
            }
            return;
        }
        C16FZ c16fz2 = this.LLLF;
        if (c16fz2 != null) {
            C786410Ut5.LLLIZZ(c16fz2, 0);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.fx2, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            sheetOptions.LIZ(4, null);
        } else {
            sheetOptions.LIZ(1, null);
        }
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    public static void uS(View view, final LiveStreamGoal liveStreamGoal) {
        TextView textView;
        TextView textView2;
        final LinearLayout linearLayout;
        final View viewFindViewById;
        final C16F5 c16f5;
        ViewTreeObserver viewTreeObserver;
        String str;
        User owner;
        String strLIZ = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.title);
            textView2 = (TextView) view.findViewById(R.id.fha);
            linearLayout = (LinearLayout) view.findViewById(R.id.s92);
            viewFindViewById = view.findViewById(R.id.s94);
            c16f5 = (C16F5) view.findViewById(R.id.s9w);
        } else {
            textView = null;
            textView2 = null;
            linearLayout = null;
            viewFindViewById = null;
            c16f5 = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null) {
            strLIZ = C0KVU.LIZ(owner);
        }
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131856590, strLIZ));
        }
        if (textView2 != null) {
            if (liveStreamGoal == null || (str = liveStreamGoal.description) == null) {
                str = "";
            }
            textView2.setText(str);
        }
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.01qd
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    LiveStreamSubGoal liveStreamSubGoal;
                    LiveStreamSubGoal liveStreamSubGoal2;
                    LiveStreamSubGoal liveStreamSubGoal3;
                    LiveStreamSubGoal liveStreamSubGoal4;
                    LiveStreamSubGoal liveStreamSubGoal5;
                    LiveStreamGoal liveStreamGoal2 = liveStreamGoal;
                    if (liveStreamGoal2 != null) {
                        LinearLayout linearLayout2 = linearLayout;
                        View view2 = viewFindViewById;
                        C16F5 c16f52 = c16f5;
                        List<LiveStreamSubGoal> list = liveStreamGoal2.subGoals;
                        if (list == null || list.size() <= 0) {
                            return;
                        }
                        List<LiveStreamSubGoal> list2 = liveStreamGoal2.subGoals;
                        long j = 0;
                        if (list2 == null || (liveStreamSubGoal = (LiveStreamSubGoal) ListProtector.get(list2, 0)) == null || liveStreamSubGoal.target <= 0) {
                            return;
                        }
                        List<LiveStreamSubGoal> list3 = liveStreamGoal2.subGoals;
                        float f = (list3 == null || (liveStreamSubGoal5 = (LiveStreamSubGoal) ListProtector.get(list3, 0)) == null) ? 0L : liveStreamSubGoal5.progress;
                        List<LiveStreamSubGoal> list4 = liveStreamGoal2.subGoals;
                        long j2 = 1;
                        int width = (int) ((f / ((list4 == null || (liveStreamSubGoal4 = (LiveStreamSubGoal) ListProtector.get(list4, 0)) == null) ? 1L : liveStreamSubGoal4.target)) * linearLayout2.getWidth());
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                if (width > linearLayout2.getWidth()) {
                                    width = linearLayout2.getWidth();
                                }
                                layoutParams.width = width;
                            } else {
                                layoutParams = null;
                            }
                            C786410Ut5.W5(view2, layoutParams);
                        }
                        List<LiveStreamSubGoal> list5 = liveStreamGoal2.subGoals;
                        if (list5 != null && (liveStreamSubGoal3 = (LiveStreamSubGoal) ListProtector.get(list5, 0)) != null) {
                            j = liveStreamSubGoal3.progress;
                        }
                        List<LiveStreamSubGoal> list6 = liveStreamGoal2.subGoals;
                        if (list6 != null && (liveStreamSubGoal2 = (LiveStreamSubGoal) ListProtector.get(list6, 0)) != null) {
                            j2 = liveStreamSubGoal2.target;
                        }
                        if (c16f52 != null) {
                            c16f52.setText(C497740JfY.LJIIL(2131755993, (int) j, Long.valueOf(j), Long.valueOf(j2)));
                        }
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room roomLJJLIIIIJ;
        User owner;
        String secUid;
        super.onViewCreated(view, bundle);
        this.LLLF = (C16FZ) view.findViewById(R.id.nnp);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 241), view.findViewById(R.id.bvg));
        this.LLLFF = (C16FS) view.findViewById(R.id.si7);
        this.LLLFFI = (C16F5) view.findViewById(R.id.zpi);
        C427760Gpy c427760Gpy = (C427760Gpy) view.findViewById(R.id.exl);
        this.LLLFZ = c427760Gpy;
        if (c427760Gpy != null) {
            View.OnClickListener aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 242);
            if (C1848410yCV.LIZ) {
                aCListenerS142S0100000_7 = new f(aCListenerS142S0100000_7);
            }
            a aVar = new a(aCListenerS142S0100000_7);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c427760Gpy);
            }
            c427760Gpy.setOnClickListener(aVar);
        }
        this.LLLI = (ViewGroup) view.findViewById(R.id.exm);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 243), view.findViewById(R.id.hof));
        this.LLLIIIIL = (FrameLayout) view.findViewById(R.id.hc6);
        yS();
        this.LLLIIII = false;
        this.LLLII = false;
        SuperFansGoalViewModel superFansGoalViewModel = this.LLJZ;
        if (superFansGoalViewModel != null) {
            InterfaceC518010KTf interfaceC518010KTf = new InterfaceC518010KTf() { // from class: X.0KTe
                @Override // X.InterfaceC518010KTf
                public final void onFailure() {
                    FrameLayout frameLayout = this.LIZ.LLLIIIIL;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:5:0x000c, B:7:0x0011, B:9:0x0015, B:10:0x0017, B:12:0x001b, B:13:0x0021, B:15:0x002c, B:16:0x002e), top: B:25:0x000c }] */
                @Override // X.InterfaceC518010KTf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(webcast.api.sub.GetSubGoalResponse.Data r5) {
                    /*
                        r4 = this;
                        com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog r0 = r4.LIZ
                        r0.getClass()
                        boolean r0 = r0.isAdded()
                        if (r0 != 0) goto Lc
                        return
                    Lc:
                        com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog r3 = r4.LIZ     // Catch: java.lang.Exception -> L41
                        r2 = 0
                        if (r5 == 0) goto L3a
                        com.bytedance.android.livesdk.gift.model.LiveStreamGoal r0 = r5.ongoingGoal     // Catch: java.lang.Exception -> L41
                        if (r0 == 0) goto L3a
                        java.util.List<com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor> r1 = r0.contributors     // Catch: java.lang.Exception -> L41
                    L17:
                        com.bytedance.android.livesdk.gift.model.LiveStreamGoal r0 = r5.ongoingGoal     // Catch: java.lang.Exception -> L41
                        if (r0 == 0) goto L3e
                        int r0 = r0.contributorsLength     // Catch: java.lang.Exception -> L41
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L41
                    L21:
                        r3.wS(r0, r1)     // Catch: java.lang.Exception -> L41
                        com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog r0 = r4.LIZ     // Catch: java.lang.Exception -> L41
                        android.view.View r0 = r0.getView()     // Catch: java.lang.Exception -> L41
                        if (r5 == 0) goto L2e
                        com.bytedance.android.livesdk.gift.model.LiveStreamGoal r2 = r5.ongoingGoal     // Catch: java.lang.Exception -> L41
                    L2e:
                        com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog.uS(r0, r2)     // Catch: java.lang.Exception -> L41
                        com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog r1 = r4.LIZ     // Catch: java.lang.Exception -> L41
                        r0 = 1
                        r1.LLLIIII = r0     // Catch: java.lang.Exception -> L41
                        r1.yS()     // Catch: java.lang.Exception -> L41
                        goto L40
                    L3a:
                        r1 = r2
                        if (r5 == 0) goto L3e
                        goto L17
                    L3e:
                        r0 = r2
                        goto L21
                    L40:
                        return
                    L41:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        java.lang.String r0 = "super fans goal join dialog exception"
                        X.C1CC2.LIZ(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C518000KTe.LIZ(webcast.api.sub.GetSubGoalResponse$Data):void");
                }
            };
            long jCurrentTimeMillis = System.currentTimeMillis();
            DataChannel dataChannel = superFansGoalViewModel.getDataChannel();
            if (dataChannel != null) {
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                DataChannel dataChannel2 = superFansGoalViewModel.getDataChannel();
                if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                    C480460Ism.LIZ().getClass();
                    ((SuperFansGoalApi) C480460Ism.LIZLLL(SuperFansGoalApi.class)).getSuperFansGoalInfo(secUid, jLJJLIIIJ, 2).LJFF(new C0UO0()).LJJIIZ(new AfS3S0100100_7(jCurrentTimeMillis, interfaceC518010KTf, 15), new AfS3S0100100_7(jCurrentTimeMillis, interfaceC518010KTf, 16));
                }
            }
        }
        SuperFanViewModel superFanViewModel = this.LLJZIJLIL;
        if (superFanViewModel != null) {
            superFanViewModel.vQ2(new C0KT0(C0KT2.SUPER_FAN_GOAL, this.LLJLLL, 0), FansClubJoinPanelUpgradeSetting.INSTANCE.getValue(), new InterfaceC517900KSu() { // from class: X.0KTc
                @Override // X.InterfaceC517900KSu
                public final void onFailure() {
                    FrameLayout frameLayout = this.LIZ.LLLIIIIL;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                }

                @Override // X.InterfaceC517900KSu
                public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS251S0300000_7(this.LIZ, (SuperFansGoalJoinDialog) c0ksy, (C0KSY<GetNonFansUserDataResponse.Data>) c0ks8, (C0KS8) 17));
                }
            });
        }
    }

    public final void wS(Integer num, List list) {
        int i;
        int iIntValue;
        C427760Gpy c427760Gpy;
        Object objLJJJLZIJ;
        List urls;
        if (list != null && list.isEmpty()) {
            ViewGroup viewGroup = this.LLLI;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLLI;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        if (list != null && list.size() == 4) {
            i = 2;
        } else {
            i = 3;
        }
        C427760Gpy c427760Gpy2 = this.LLLFZ;
        if (c427760Gpy2 == null) {
            return;
        }
        c427760Gpy2.setSize(EnumC428930Grr.MEDIUM);
        c427760Gpy2.setStacking(EnumC429060Gs4.LAST_ON_TOP);
        c427760Gpy2.setMaxImageNum(i);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c427760Gpy2.setTotalCount(iIntValue);
        if (list == null) {
            return;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                LiveStreamGoalContributor liveStreamGoalContributor = (LiveStreamGoalContributor) obj;
                if (i2 < i && (c427760Gpy = this.LLLFZ) != null) {
                    ImageModel imageModel = liveStreamGoalContributor.avatar;
                    if (imageModel == null || (urls = imageModel.getUrls()) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urls)) == null) {
                        objLJJJLZIJ = "";
                    }
                    C427760Gpy.LIZ(c427760Gpy, i2, objLJJJLZIJ, "", null, null, false, null, 2040);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gc4, viewGroup, false);
    }
}
