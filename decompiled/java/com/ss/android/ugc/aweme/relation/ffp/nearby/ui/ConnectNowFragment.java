package com.ss.android.ugc.aweme.relation.ffp.nearby.ui;

import X.AbstractC19994813Le;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C09JN;
import X.C0BHI;
import X.C0BHJ;
import X.C0BHM;
import X.C0HJR;
import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1073630e2r;
import X.C10GR;
import X.C118300cf;
import X.C11JN;
import X.C11S5;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13BV;
import X.C13LE;
import X.C1485060okS;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1685530txn;
import X.C1687590u17;
import X.C1687610u19;
import X.C1687780u1Q;
import X.C1689620u4O;
import X.C1689630u4P;
import X.C1689640u4Q;
import X.C1689650u4R;
import X.C1697830uHd;
import X.C1698300uIO;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C189200o6;
import X.C1910880zpG;
import X.C1910890zpH;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1DFB;
import X.C20277814Wa;
import X.C20498815Ja;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C2344009Gk;
import X.C2505509rp;
import X.C338490DOt;
import X.C446980Hfs;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1687600u18;
import X.EnumC1687770u1P;
import X.EnumC1910860zpE;
import X.InterfaceC1487280oo2;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.InterfaceC876920Yag;
import Y.AfS159S0200000_25;
import Y.AfS194S0100000_25;
import Y.AkS329S0200000_25;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.nearby.INearbyBleAdvertiser;
import com.ss.android.ugc.aweme.nearby.INearbyBleGattServer;
import com.ss.android.ugc.aweme.nearby.INearbyBleScanner;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment;
import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6
public final class ConnectNowFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC876920Yag {
    public static final C1073630e2r LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static boolean LLJJJJ = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiHELIOSZyk1OGsiLC4hKjxiPCZ9CyoiJyowPAsjPgkhKSIhLCEn";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final C1910890zpH LLJ;
    public final String LLJI;
    public C1485060okS LLJIJIL;
    public ComposeView LLJILJIL;
    public ComposeView LLJILJILJ;
    public ComposeView LLJILLL;
    public Long LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C1687780u1Q LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0e2r] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ConnectNowFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/ffp/nearby/vm/ConnectNowMatchVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new Object() { // from class: X.0e2r
        };
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0u1Q] */
    public ConnectNowFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConnectNowMatchVM.class);
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(c19719912DlLIZ, 215);
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(109);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 216), aFwS266S0000000_25, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new AwS569S0100000_25((Fragment) this, 217), aFwS266S0000000_25, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS569S0100000_25, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 218), aFwS266S0000000_25, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(123));
        this.LLJ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        this.LLJI = (String) C2505509rp.LIZ.getValue();
        this.LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 206));
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 207));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 212));
        this.LLJJIJIL = new BroadcastReceiver() { // from class: X.0u1Q
            public final void LIZ(Context context, Intent intent) {
                String action;
                if (intent != null) {
                    action = intent.getAction();
                } else {
                    action = null;
                }
                if (Intrinsics.LJFF(action, "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra != 10) {
                        if (intExtra == 12 && context != null) {
                            ConnectNowFragment connectNowFragment = this.LIZ;
                            C1697830uHd.LIZ.getClass();
                            if (C1697830uHd.LIZ(context)) {
                                connectNowFragment.WR(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LIZ.UR().setState(AFwS266S0000000_25.get$arr$(538));
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(context, intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(context, intent);
                }
            }
        };
    }

    public final ConnectNowMatchVM UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (ConnectNowMatchVM) assemVMLazy.getValue();
    }

    public final void VR() {
        Fragment fragment;
        BluetoothAdapter adapter;
        this.LLJ.LIZ("ConnectNowMatchVM", "proceedAfterFirstTimePrivacyPopupPhase");
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1697830uHd.LIZ.getClass();
        if (!C1697830uHd.LIZ(context)) {
            if (C1689640u4Q.LIZJ.getValue().LIZ.getBoolean("has_seen_permission_popup", false)) {
                WR(false);
                return;
            }
            AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 213);
            AwS569S0100000_25 awS569S0100000_252 = new AwS569S0100000_25(this, 214);
            Context context2 = getContext();
            if (context2 != null) {
                if (C1697830uHd.LIZ(context2)) {
                    awS569S0100000_25.invoke();
                    return;
                }
                Activity activityLIZ = C1388190mED.LIZ(context2);
                if (activityLIZ == null) {
                    throw new IllegalStateException("Activity is null");
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("shoot_way", "connect_now");
                c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
                c2344009Gk.LJIIIIZZ("enter_method", getEnterMethod());
                C20684815ws.LJIILLIIL("show_access_bluetooth", c2344009Gk.LIZ);
                final AwS234S0300000_25 awS234S0300000_25 = new AwS234S0300000_25(activityLIZ, awS569S0100000_252, awS569S0100000_25, 50);
                PopupManager.LJIJI(new C10GR(this, awS234S0300000_25) { // from class: X.0u4M
                    public final Fragment LL;
                    public final Function1<C20656615sK, Unit> LLILLJJLI;

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 0;
                    }

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        Context context3 = this.LL.getContext();
                        if (context3 != null) {
                            return new C688120Qyw(context3, this.LL, null);
                        }
                        return null;
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = awS234S0300000_25;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        C1689640u4Q.LIZJ.getValue().LIZ.storeBoolean("has_seen_permission_popup", true);
                        this.LLILLJJLI.invoke(c20656615sK);
                    }
                }, true);
                return;
            }
            return;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) C446980Hfs.LIZIZ(context, BluetoothManager.class);
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && adapter.isEnabled()) {
            WR(true);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("shoot_way", "connect_now");
        c2344009Gk2.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk2.LJIIIIZZ("enter_method", getEnterMethod());
        C20684815ws.LJIILLIIL("show_turn_on_access_bluetooth", c2344009Gk2.LIZ);
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitb57a1T2PZzwP6Q6Y3MxZC4h0L+J5wJlUDA/ZSTzcso6agyxYU+N5", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 123;
        Object[] objArr = {intent, 123};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/ss/android/ugc/aweme/relation/ffp/nearby/ui/ConnectNowFragment", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/ss/android/ugc/aweme/relation/ffp/nearby/ui/ConnectNowFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            fragment = obj != null ? (Fragment) obj : this;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent = (Intent) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = this;
        }
        fragment.startActivityForResult(intent, iIntValue);
        c0wst.LIZ(11087, "com/ss/android/ugc/aweme/relation/ffp/nearby/ui/ConnectNowFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public final String getEnterFrom() {
        return (String) this.LLJJI.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return LLJJJJ ? Collections.singletonList(13) : C13BV.INSTANCE;
    }

    public final void SR() {
        FragmentManager supportFragmentManager;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        if (supportFragmentManager.LJJLIIIIJ() == 0) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        } else {
            supportFragmentManager.LJLLILLLL();
        }
        LLJJJJ = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        StateOwner.LL.getClass();
        StateOwner.LLJIJIL.remove(new C1689630u4P(this));
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        Context context = getContext();
        if (context != null) {
            C786410Ut5.LJJIFFI(context, this.LLJJIJIL);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LLJJJJ = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((C20498815Ja) this.LLIZLLLIL.getValue()).pause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context == null) {
            return;
        }
        LLJJJJ = true;
        if (C1689640u4Q.LIZJ.getValue().LIZIZ.getBoolean("has_seen_privacy_notice", false)) {
            VR();
            return;
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        C118300cf c118300cf = new C118300cf();
        C1697830uHd c1697830uHd = C1697830uHd.LIZ;
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 210);
        AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25(this, c118300cf, 44);
        AwS569S0100000_25 awS569S0100000_252 = new AwS569S0100000_25(c118300cf, 211);
        c1697830uHd.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131824864);
        c1397580mTM.LIZ(2131824863);
        c1397580mTM.LJII = false;
        c1397580mTM.LJ(new AwS604S0100000_25(awS569S0100000_25, 928));
        c1397580mTM.LIZLLL(new AwS604S0100000_25(awS426S0200000_25, 929));
        C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
        c1397620mTQ.LJFF(2131824862, new AwS604S0100000_25(awS569S0100000_252, 930));
        c1397580mTM.LJIIL = c1397620mTQ;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        Context context = getContext();
        if (context != null) {
            if (UR().getState().LLILLL != EnumC1687770u1P.GRANTED) {
                SR();
                return;
            }
            int i = C1687590u17.LIZ[UR().getState().LLILZ.ordinal()];
            if (i == 1) {
                C1685530txn.LIZ.getClass();
                C1685530txn.LIZIZ("show", "connect_now_wait_page");
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                C1685530txn.LIZ.getClass();
                C1685530txn.LIZIZ("show", "connect_now_friends_page");
            }
            C1697830uHd c1697830uHd = C1697830uHd.LIZ;
            AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 208);
            AwS569S0100000_25 awS569S0100000_252 = new AwS569S0100000_25(this, 209);
            c1697830uHd.getClass();
            C1697830uHd.LIZLLL(context, awS569S0100000_25, awS569S0100000_252);
        }
    }

    public final void WR(boolean z) {
        C1910890zpH c1910890zpH = this.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has permission ");
        sbLIZ.append(z);
        c1910890zpH.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            UR().setState(new AwS604S0100000_25(EnumC1687770u1P.GRANTED, 789));
            final Context context = getContext();
            if (context != null) {
                ConnectNowMatchVM connectNowMatchVMUR = UR();
                C1910880zpG c1910880zpG = C1910890zpH.LIZLLL;
                EnumC1910860zpE enumC1910860zpE = EnumC1910860zpE.CONNECT_NOW;
                c1910880zpG.LIZ(enumC1910860zpE).LIZ("ConnectNowMatchVM", "startScanning");
                C054G c054g = connectNowMatchVMUR.LLILLL;
                final Function1 function1 = null;
                if (c054g != null) {
                    C2296808zG.LIZJ(c054g, null);
                }
                C23119094b c23119094bLIZ = C2296908zH.LIZ();
                C1DFB c1dfb = C0PEM.LIZJ;
                connectNowMatchVMUR.LLILLL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, c1dfb));
                if (!((INearbyBleScanner) connectNowMatchVMUR.vQ2().LJIIJ.getValue()).LIZ()) {
                    final C1689650u4R c1689650u4RVQ2 = connectNowMatchVMUR.vQ2();
                    c1689650u4RVQ2.getClass();
                    c1910880zpG.LIZ(enumC1910860zpE).LIZ("NearbyBleManager", "calling init()");
                    c1689650u4RVQ2.LIZ.LIZ(c1689650u4RVQ2.LJ.LJJJLZIJ(c1689650u4RVQ2.LIZLLL).LJJLJLI(new AfS194S0100000_25(c1689650u4RVQ2, 170)));
                    C11JN c11jnLJJIJIIJIL = c1689650u4RVQ2.LJIIIIZZ.LJJIJIIJIL(new C09JN() { // from class: X.0HJP
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NearbyBleManager@47fb.init$2");
                            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[Connect] connectionSubject onNext received ");
                            sbLIZ2.append(obj);
                            c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ2));
                            C1C7U.LIZIZ("NearbyBleManager@47fb.init$2");
                        }
                    });
                    long jIntValue = ((long) ((Number) C0BHI.LIZ.getValue()).intValue()) + ((long) AbstractC19994813Le.Default.nextInt(-2000, 4000));
                    long j = 3000;
                    if (jIntValue >= 3000) {
                        j = jIntValue;
                    }
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c1689650u4RVQ2.LIZ.LIZ(c11jnLJJIJIIJIL.LJII(j, timeUnit, C11S5.LIZIZ, ((Number) C0BHJ.LIZ.getValue()).intValue()).LJJIJIIJIL(new C09JN() { // from class: X.0HJQ
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NearbyBleManager@47fb.init$3");
                            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[Connect] connectionSubject buffer received list ");
                            sbLIZ2.append(obj);
                            c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ2));
                            C1C7U.LIZIZ("NearbyBleManager@47fb.init$3");
                        }
                    }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIJ(new InterfaceC1487280oo2() { // from class: X.0u4S
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            List<C1689710u4X> list = (List) obj;
                            C1910880zpG c1910880zpG2 = C1910890zpH.LIZLLL;
                            EnumC1910860zpE enumC1910860zpE2 = EnumC1910860zpE.CONNECT_NOW;
                            C1910890zpH c1910890zpHLIZ = c1910880zpG2.LIZ(enumC1910860zpE2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[Connect] invoke ");
                            sbLIZ2.append(list);
                            c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ2));
                            Function1<List<C1689710u4X>, Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(list);
                            }
                            if (list.isEmpty()) {
                                c1910880zpG2.LIZ(enumC1910860zpE2).LIZ("NearbyBleManager", "[Connect] empty list ====");
                                return C11IR.LL;
                            }
                            C1910890zpH c1910890zpHLIZ2 = c1910880zpG2.LIZ(enumC1910860zpE2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[Connect] connecting to items from ");
                            sbLIZ3.append(list);
                            c1910890zpHLIZ2.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ3));
                            return C11NZ.LJJJJIZL(list).LJJJLZIJ(c1689650u4RVQ2.LIZLLL).LJJJIL(new AkS329S0200000_25(c1689650u4RVQ2, context, 1)).LJJLI(C11IR.LL).LJJIJIIJIL(new AfS194S0100000_25(c1689650u4RVQ2, 171)).LJJIJIIJI(new AfS194S0100000_25(c1689650u4RVQ2, 172)).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0u4T
                                @Override // X.InterfaceC781210Ukh
                                public final void run() {
                                    C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBleManager", "[Connect] onComplete, connect phase");
                                }
                            });
                        }
                    }).LJJJLZIJ(c1689650u4RVQ2.LIZLLL).LJJLL(new AfS159S0200000_25(c1689650u4RVQ2, (Object) null, 11), new C09JN() { // from class: X.0HJS
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NearbyBleManager@47fb.init$6");
                            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZJ("NearbyBleManager", "[Connect] Error connect to BLE item", (Throwable) obj);
                            C1C7U.LIZIZ("NearbyBleManager@47fb.init$6");
                        }
                    }));
                    C1689650u4R c1689650u4RVQ22 = connectNowMatchVMUR.vQ2();
                    ((INearbyBleGattServer) c1689650u4RVQ22.LJIIL.getValue()).LIZ(context, c1689650u4RVQ22.LIZIZ);
                    C1689650u4R c1689650u4RVQ23 = connectNowMatchVMUR.vQ2();
                    if (((INearbyBleScanner) c1689650u4RVQ23.LJIIJ.getValue()).LIZJ(c1689650u4RVQ23.LIZIZ)) {
                        c1910880zpG.LIZ(enumC1910860zpE).LIZ("NearbyBleManager", "[Connect] START SCAN");
                        c1689650u4RVQ23.LIZ.LIZ(((INearbyBleScanner) c1689650u4RVQ23.LJIIJ.getValue()).LIZLLL().LJJIJIIJIL(new AfS194S0100000_25(c1689650u4RVQ23, 173)).LJJIL(new C1698300uIO(c1689650u4RVQ23, 3)).LJI(((Number) C0BHM.LIZ.getValue()).intValue(), timeUnit).LJJJLZIJ(c1689650u4RVQ23.LIZLLL).LJJLL(new AfS159S0200000_25(c1689650u4RVQ23, (Object) null, 12), new C09JN() { // from class: X.0HJT
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("NearbyBleManager@47fb.startBleScan$4");
                                C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZJ("NearbyBleManager", "Error get BLE scan results", (Throwable) obj);
                                C1C7U.LIZIZ("NearbyBleManager@47fb.startBleScan$4");
                            }
                        }));
                    }
                    C1689650u4R c1689650u4RVQ24 = connectNowMatchVMUR.vQ2();
                    ((INearbyBleAdvertiser) c1689650u4RVQ24.LJIIJJI.getValue()).LIZIZ(c1689650u4RVQ24.LIZIZ);
                }
                C054G c054g2 = connectNowMatchVMUR.LLILLL;
                if (c054g2 != null) {
                    C23250099c.LIZLLL(c054g2, c1dfb, null, new C0HJR(connectNowMatchVMUR, null), 2);
                }
            }
            if (UR().getState().LLILZ == EnumC1687600u18.WAITING) {
                ZR(true);
                return;
            }
            return;
        }
        UR().setState(new AwS604S0100000_25(EnumC1687770u1P.DENIED, 789));
        ((C20498815Ja) this.LLIZLLLIL.getValue()).pause();
    }

    public final void ZR(boolean z) {
        C1485060okS c1485060okS = this.LLJIJIL;
        if (c1485060okS != null) {
            if (z) {
                ((C20498815Ja) this.LLIZLLLIL.getValue()).LIZIZ(c1485060okS);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1687610u19(this, z, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        NR(AFwS266S0000000_25.get$arr$(108));
        StateOwner.LL.getClass();
        StateOwner.LLJIJIL.add(new C1689620u4O(this));
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Exception {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C786410Ut5.LJIJJ(context, this.LLJJIJIL, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        C1697830uHd.LIZ.getClass();
        C1697830uHd.LJ();
        this.LLJILJIL = (ComposeView) view.findViewById(R.id.waiting_page);
        this.LLJILJILJ = (ComposeView) view.findViewById(R.id.o3a);
        this.LLJILLL = (ComposeView) view.findViewById(R.id.q9c);
        ComposeView composeView = this.LLJILJILJ;
        if (composeView != null) {
            C786410Ut5.LLILZ(composeView, 8);
        }
        ComposeView composeView2 = this.LLJILLL;
        if (composeView2 != null) {
            C786410Ut5.LLILZ(composeView2, 8);
        }
        C723850SaN.LIZ(this, false, null, new AwS610S0100000_31(this, 491), 3);
        AssemViewModel.selectSubscribe$default(UR(), null, new C2217381BqS() { // from class: X.0u4U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1687630u1B) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0u1O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1687630u1B) obj).LLILLL;
            }
        }, null, null, null, new AwS639S0100000_25(new AwS639S0100000_25(this, 36), 144), 56, null);
        ZR(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            if (i2 == -1) {
                WR(true);
            } else {
                SR();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.y0);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_d, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
