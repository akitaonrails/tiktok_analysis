package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail;

import X.C011Z;
import X.C01GW;
import X.C098200Yq;
import X.C0TVI;
import X.C1161920gLG;
import X.C14K9;
import X.C1685300txQ;
import X.C16F5;
import X.C1734950vFV;
import X.C1766560w4U;
import X.C1879830z1B;
import X.C1880070z1Z;
import X.C1881590z41;
import X.C1881800z4M;
import X.C1882380z5I;
import X.C1883060z6O;
import X.C1884080z82;
import X.C1884370z8V;
import X.C1884460z8e;
import X.C1884480z8g;
import X.C1884490z8h;
import X.C1884510z8j;
import X.C1884540z8m;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20244914Jj;
import X.C360660ECa;
import X.C419910GdJ;
import X.C452501pT;
import X.C476770Imp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1809520xBm;
import X.InterfaceC1881340z3c;
import X.InterfaceC1883470z73;
import X.InterfaceC1883670z7N;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.ViewOnScrollChangeListenerC1880880z2s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRegionValiditySetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public abstract class GameDetailMixPageBaseFragment extends LiveSheetHostFragment {
    public static final int LLLF;
    public static final int LLLFF;
    public static final int LLLFFI;
    public boolean LLJI;
    public int LLJIJIL;
    public InterfaceC420801kM LLJJ;
    public ViewOnScrollChangeListenerC1880880z2s LLJJI;
    public boolean LLJJIII;
    public int LLJJIJIIJIL;
    public float LLJJJ;
    public View LLJJJIL;
    public C197039127h LLJJJJ;
    public C16F5 LLJJJJJIL;
    public View LLJJJJLIIL;
    public LinearLayout LLJJL;
    public C1884370z8V LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public LiveIconView LLJLIL;
    public int LLJLILLLLZIIL;
    public View LLJLL;
    public C1881590z41 LLJZIJLIL;
    public boolean LLJ = true;
    public long LLJILJIL = -1;
    public int LLJILJILJ = -1;
    public long LLJILLL = SystemClock.elapsedRealtime();
    public int LLJJIJI = -1;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1884510z8j());
    public HashSet<Integer> LLJLLIL = new HashSet<>();
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C1884490z8h(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new C1884480z8g(this));
    public final C1884460z8e LLL = new InterfaceC19562711gH() { // from class: X.0z8e
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            this.LL.LLJILJIL = SystemClock.elapsedRealtime();
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
            if (this.LL.LLJILJIL > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LL;
                long j = jElapsedRealtime - gameDetailMixPageBaseFragment.LLJILJIL;
                C1881590z41 c1881590z41 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                if (c1881590z41 != null) {
                    interfaceC1881340z3cLJIIIZ = c1881590z41.LJIIIZ();
                } else {
                    interfaceC1881340z3cLJIIIZ = null;
                }
                C1880070z1Z.LJFF(j, interfaceC1881340z3cLJIIIZ);
            }
        }
    };

    public abstract int PR();

    public boolean RR() {
        return false;
    }

    public abstract void iS(boolean z);

    static {
        int iLIZIZ = (int) C497740JfY.LIZIZ(38.0f);
        LLLF = iLIZIZ;
        LLLFF = ((int) C497740JfY.LIZIZ(28.0f)) + iLIZIZ;
        LLLFFI = ((int) C497740JfY.LIZIZ(52.0f)) + iLIZIZ;
    }

    public final int OR() {
        return ((Number) this.LLJZ.getValue()).intValue();
    }

    public final boolean SR() {
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (c1881590z41 != null) {
            return C1884080z82.LIZ(Integer.valueOf(c1881590z41.LLJLIL));
        }
        return false;
    }

    public void UR() {
        MutableLiveData<Boolean> mutableLiveData;
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (c1881590z41 == null || (mutableLiveData = c1881590z41.LLJLL) == null) {
            return;
        }
        mutableLiveData.observe(this, new Observer() { // from class: X.0z8i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.VR(((Boolean) obj).booleanValue());
            }
        });
    }

    public void ZR() {
        GameStationGameInfo gameStationGameInfo;
        C1881590z41 c1881590z41;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        this.LLJJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this.LLL);
        C1881590z41 c1881590z412 = this.LLJZIJLIL;
        String str = null;
        if ((c1881590z412 != null && c1881590z412.LLJLIL == 0) && GameLivePartnershipRegionValiditySetting.INSTANCE.isInEuRegion() && (c1881590z41 = this.LLJZIJLIL) != null && (interfaceC1881340z3cLJIIIZ = c1881590z41.LJIIIZ()) != null && C1882380z5I.LJ(interfaceC1881340z3cLJIIIZ, Collections.singletonList("promote_task_info.live_take_permission")).optBoolean("live_take_permission")) {
            LinearLayout linearLayout = this.LLJJL;
            C500260Jjc.LLFFF(linearLayout != null ? linearLayout.findViewById(R.id.he8) : null);
        }
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C476770Imp.LIZJ(view, new Runnable() { // from class: X.0z8f
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.initSetView$1");
                    try {
                        View view2 = this.LL.LLJJJJLIIL;
                        if (view2 != null) {
                            view2.bringToFront();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.initSetView$1");
                }
            });
        }
        C16F5 c16f5 = this.LLJJJJJIL;
        if (c16f5 != null) {
            C1881590z41 c1881590z413 = this.LLJZIJLIL;
            if (c1881590z413 != null && (gameStationGameInfo = c1881590z413.LLJILLL) != null) {
                str = gameStationGameInfo.name;
            }
            c16f5.setText(str);
        }
        C197039127h c197039127h = this.LLJJJJ;
        if (c197039127h != null) {
            C500260Jjc.LJIILLIIL(c197039127h);
        }
        C16F5 c16f52 = this.LLJJJJJIL;
        if (c16f52 != null) {
            C500260Jjc.LJIILLIIL(c16f52);
        }
        View view2 = getView();
        if (view2 != null) {
            C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0v4L
                /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r12 = this;
                        com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment r5 = r12.LL
                        X.0z41 r0 = r5.LLJZIJLIL
                        if (r0 == 0) goto Lc
                        boolean r1 = r0.LLJLLIL
                        r0 = 1
                        if (r1 != r0) goto Lc
                    Lb:
                        return
                    Lc:
                        X.16F5 r1 = r5.LLJJJJJIL
                        if (r1 == 0) goto Lb
                        android.view.ViewParent r4 = r1.getParent()
                        boolean r0 = r4 instanceof android.view.View
                        r3 = 0
                        if (r0 == 0) goto L82
                        android.view.View r4 = (android.view.View) r4
                    L1b:
                        X.19MB r6 = new X.19MB
                        r6.<init>()
                        boolean r2 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
                        if (r2 == 0) goto L80
                        r0 = r4
                        androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
                    L27:
                        r6.LJII(r0)
                        int r7 = r1.getId()
                        r8 = 7
                        r9 = 0
                        r10 = r8
                        r11 = r9
                        r6.LJIIIZ(r7, r8, r9, r10, r11)
                        int r1 = r1.getId()
                        r0 = 1056964608(0x3f000000, float:0.5)
                        r6.LJJII(r0, r1)
                        if (r2 == 0) goto L7e
                        androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                    L42:
                        r6.LIZIZ(r4)
                        X.16F5 r0 = r5.LLJJJJJIL
                        if (r0 == 0) goto L7c
                        android.view.ViewParent r2 = r0.getParent()
                    L4d:
                        boolean r0 = r2 instanceof android.view.View
                        if (r0 == 0) goto L79
                        android.view.View r2 = (android.view.View) r2
                        if (r2 == 0) goto L7a
                        android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
                    L59:
                        boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
                        if (r0 == 0) goto L73
                        r3 = r1
                        android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                        if (r3 == 0) goto L73
                        r0 = 52
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        float r0 = X.C418440Gaw.LIZIZ(r0)
                        int r0 = X.C814420VxA.LIZIZ(r0)
                        r3.setMarginEnd(r0)
                    L73:
                        if (r2 == 0) goto Lb
                        X.C786410Ut5.W5(r2, r3)
                        return
                    L79:
                        r2 = r3
                    L7a:
                        r1 = r3
                        goto L59
                    L7c:
                        r2 = r3
                        goto L4d
                    L7e:
                        r4 = r3
                        goto L42
                    L80:
                        r0 = r3
                        goto L27
                    L82:
                        r4 = r3
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1728030v4L.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.initSetView$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.initSetView$2");
                }
            });
        }
        iS(true);
        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V != null) {
            c1884370z8V.setClickActionListener(new C1884540z8m(this));
        }
        C1884370z8V c1884370z8V2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V2 != null) {
            c1884370z8V2.setScrolledTopListener(new C1734950vFV(this));
        }
        C1884370z8V c1884370z8V3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V3 != null) {
            c1884370z8V3.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0z7T
                @Override // X.InterfaceC1809520xBm
                public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                    InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ2;
                    C1882760z5u eventCenter;
                    C1884370z8V c1884370z8V4 = this.LIZ.LLJJLIIIJLLLLLLLZ;
                    if (c1884370z8V4 != null) {
                        int iLIZJ = c1884370z8V4.LIZJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("scrollY = ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", maxScrollDistance = ");
                        sbLIZ.append(iLIZJ);
                        C20441214yg.LIZIZ("GameDetailMixPageBaseFragment", C2188811AlT.LIZIZ(sbLIZ));
                        if (i2 == iLIZJ) {
                            C20441214yg.LIZIZ("GameDetailMixPageBaseFragment", "scroll bottom footer");
                            C1881590z41 c1881590z414 = this.LIZ.LLJZIJLIL;
                            if (c1881590z414 != null && (interfaceC1881340z3cLJIIIZ2 = c1881590z414.LJIIIZ()) != null && (eventCenter = interfaceC1881340z3cLJIIIZ2.getEventCenter()) != null) {
                                eventCenter.LIZIZ(null, "scroll_to_bottom");
                            }
                        }
                    }
                }
            });
        }
    }

    public final void gS() {
        View view = this.LLJJJIL;
        if ((view != null ? view.getAlpha() : 0.0f) > 0.1f) {
            if (this.LLJLILLLLZIIL == 1) {
                return;
            }
            C500260Jjc.LLFFF(this.LLJLIL);
            View view2 = this.LLJLL;
            if (view2 != null) {
                C500260Jjc.LJIILLIIL(view2);
            }
            dS(OR());
            this.LLJLILLLLZIIL = 1;
            return;
        }
        if (!RR()) {
            View view3 = this.LLJLL;
            if (view3 != null) {
                C500260Jjc.LJIILLIIL(view3);
            }
            C500260Jjc.LJIILLIIL(this.LLJLIL);
            this.LLJLILLLLZIIL = 0;
            return;
        }
        if (this.LLJLILLLLZIIL == 2) {
            return;
        }
        C500260Jjc.LLFFF(this.LLJLIL);
        View view4 = this.LLJLL;
        if (view4 != null) {
            C500260Jjc.LLFFF(view4);
        }
        dS(((Number) this.LLJLLL.getValue()).intValue());
        this.LLJLILLLLZIIL = 2;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isFollowAppTheme() {
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        boolean z = false;
        if (c1881590z41 != null && c1881590z41.LLJLIL == 0) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (c1881590z41 != null) {
            c1881590z41.LJI();
        }
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C1881590z41 c1881590z41;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        C1883060z6O c1883060z6OLJIIJJI;
        super.onDestroyView();
        if (!this.LLJ && this.LLJILJIL > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILJIL;
            C1881590z41 c1881590z412 = this.LLJZIJLIL;
            C1880070z1Z.LJFF(jElapsedRealtime, c1881590z412 != null ? c1881590z412.LJIIIZ() : null);
            this.LLJILJIL = -1L;
        }
        ViewOnScrollChangeListenerC1880880z2s viewOnScrollChangeListenerC1880880z2s = this.LLJJI;
        if (viewOnScrollChangeListenerC1880880z2s != null && (c1881590z41 = this.LLJZIJLIL) != null && (interfaceC1881340z3cLJIIIZ = c1881590z41.LJIIIZ()) != null && (c1883060z6OLJIIJJI = interfaceC1881340z3cLJIIIZ.LJIIJJI()) != null) {
            c1883060z6OLJIIJJI.LJIJ(viewOnScrollChangeListenerC1880880z2s);
        }
        C1881590z41 c1881590z413 = this.LLJZIJLIL;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ2 = c1881590z413 != null ? c1881590z413.LJIIIZ() : null;
        if (C1879830z1B.LJ(interfaceC1881340z3cLJIIIZ2)) {
            Map<String, String> mapLIZIZ = C1879830z1B.LIZIZ(interfaceC1881340z3cLJIIIZ2);
            n nVarLIZJ = C1879830z1B.LIZJ(interfaceC1881340z3cLJIIIZ2);
            if (C1879830z1B.LIZLLL(interfaceC1881340z3cLJIIIZ2)) {
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).reportROI2Event(true, "page_close", mapLIZIZ, nVarLIZJ);
            } else {
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).reportROI2Event(false, "MapPageClose", mapLIZIZ, nVarLIZJ);
            }
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJJ;
        if (interfaceC420801kM != null) {
            C500260Jjc.LJJLIIIJLJLI(interfaceC420801kM);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        C1883060z6O c1883060z6OLJIIJJI;
        C1881800z4M c1881800z4MLJIIIIZZ;
        super.onPause();
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (c1881590z41 == null || (interfaceC1881340z3cLJIIIZ = c1881590z41.LJIIIZ()) == null || (c1883060z6OLJIIJJI = interfaceC1881340z3cLJIIIZ.LJIIJJI()) == null || (c1881800z4MLJIIIIZZ = c1883060z6OLJIIJJI.LJIIIIZZ()) == null) {
            return;
        }
        bS(c1881800z4MLJIIIIZZ.LIZ, this.LLJILLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJILLL = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        super.onStart();
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        Integer numValueOf = c1881590z41 != null ? Integer.valueOf(c1881590z41.LLJLIL) : null;
        if (numValueOf != null && ((numValueOf.intValue() == 0 || numValueOf.intValue() == 2) && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null)) {
            window2.setDimAmount(0.0f);
        }
        setCancelable(true);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0z8l
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        this.LL.dismissAllowingStateLoss();
                        return true;
                    }
                    return false;
                }
            });
        }
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            C14K9.LJIJJ(frameLayout, new C0TVI() { // from class: X.0zAr
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    View viewFindViewById;
                    ViewGroup.LayoutParams layoutParams;
                    int i;
                    Window window3;
                    int iLIZLLL;
                    int i2;
                    int i3;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(135);
                    Dialog dialog3 = this.LL.getDialog();
                    if (dialog3 != null && (window3 = dialog3.getWindow()) != null) {
                        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LL;
                        WindowManager.LayoutParams attributes = window3.getAttributes();
                        if (gameDetailMixPageBaseFragment.SR()) {
                            iLIZLLL = C1884080z82.LIZLLL();
                        } else {
                            iLIZLLL = -1;
                        }
                        if (C497740JfY.LJJ()) {
                            i2 = c20244914JjLIZ.LIZ;
                        } else {
                            i2 = c20244914JjLIZ.LIZJ;
                        }
                        attributes.width = iLIZLLL + i2;
                        WindowManager.LayoutParams attributes2 = window3.getAttributes();
                        if (C497740JfY.LJJ()) {
                            i3 = 3;
                        } else {
                            i3 = 5;
                        }
                        attributes2.gravity = i3;
                        window3.setAttributes(window3.getAttributes());
                    }
                    if (!C497740JfY.LJIL()) {
                        try {
                            View view2 = this.LL.getView();
                            ViewGroup.MarginLayoutParams marginLayoutParams = null;
                            if (view2 != null) {
                                viewFindViewById = view2.findViewById(R.id.iqa);
                            } else {
                                viewFindViewById = null;
                            }
                            if (viewFindViewById == null) {
                                layoutParams = null;
                            } else {
                                layoutParams = viewFindViewById.getLayoutParams();
                            }
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            }
                            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != (i = c20244914JjLIZ.LIZLLL)) {
                                marginLayoutParams.bottomMargin = i;
                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    try {
                        this.LL.hS(c20244914JjLIZ);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    return C20246014Ju.LIZIZ;
                }
            });
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public void NR(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C1884370z8V) view.findViewById(R.id.iqd);
        this.LLJJJJJIL = (C16F5) view.findViewById(R.id.ipo);
        this.LLJJJJ = (C197039127h) view.findViewById(R.id.ir9);
        this.LLJJJJLIIL = view.findViewById(R.id.kl1);
        this.LLJJJIL = view.findViewById(R.id.iq_);
        this.LLJL = (FrameLayout) view.findViewById(R.id.iqc);
        this.LLJLIL = (LiveIconView) view.findViewById(R.id.jv0);
        this.LLJLL = view.findViewById(R.id.jv1);
        cS(0.0f);
        iS(false);
    }

    public void VR(boolean z) {
        View view;
        if (z && (view = getView()) != null) {
            C476770Imp.LIZJ(view, new Runnable() { // from class: X.0z0z
                /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[PHI: r0
                  0x0097: PHI (r0v75 java.lang.String) = (r0v69 java.lang.String), (r0v76 java.lang.String) binds: [B:29:0x0095, B:27:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 556
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1879710z0z.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.onDataPreparedStatusChanged$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.onDataPreparedStatusChanged$1");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[PHI: r4
      0x0063: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:37:0x0061, B:35:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[PHI: r4
      0x00b7: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:37:0x0061, B:39:0x0067, B:41:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void WR(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r1 = r8.getAction()
            if (r1 == 0) goto Lc1
            r2 = 1
            if (r1 == r2) goto L13
            r0 = 2
            if (r1 != r0) goto L12
            int r0 = r7.LLJIJIL
            int r0 = r0 + 1
            r7.LLJIJIL = r0
        L12:
            return
        L13:
            float r1 = r8.getRawY()
            float r0 = r7.LLJJJ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r5 = 0
            if (r0 >= 0) goto Lbe
            r0 = 1
        L1f:
            r3 = 0
            if (r0 != 0) goto L9f
            int r1 = r7.LLJIJIL
            r0 = 3
            if (r1 < r0) goto L9f
            boolean r0 = r7.LLJI
            if (r0 != 0) goto L9f
            r7.LLJI = r2
            X.0z41 r0 = r7.LLJZIJLIL
            if (r0 == 0) goto Lbb
            X.0z3c r6 = r0.LJIIIZ()
        L35:
            X.0z41 r0 = r7.LLJZIJLIL
            if (r0 == 0) goto Lb9
            X.0z7B r0 = r0.LJJ()
            if (r0 == 0) goto Lb9
            int r0 = r0.LJIIL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto Lb9
            int r1 = r0.intValue()
        L4d:
            if (r6 == 0) goto L5f
            X.0z6O r0 = r6.LJIIJJI()
            if (r0 == 0) goto L5f
            X.0z4M r0 = r0.LJIIL(r1)
            if (r0 == 0) goto L5f
            java.lang.String r4 = r0.LIZIZ
            if (r4 != 0) goto L63
        L5f:
            java.lang.String r4 = ""
            if (r6 == 0) goto Lb7
        L63:
            X.0z6O r0 = r6.LJIIJJI()
            if (r0 == 0) goto Lb7
            X.0z4M r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r0.LIZIZ
        L71:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            java.lang.String r0 = "livesdk_gamepad_gamedetail_slide"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_default"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "tab_name"
            r2.LJJII(r4, r0)
            if (r6 == 0) goto Lb5
            X.0z5M r0 = X.C1882380z5I.LIZLLL(r6)
        L8f:
            java.util.Map r0 = X.C1882380z5I.LIZ(r0)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r2.LJJIIZI(r0)
            r2.LIZ()
            r7.LLJIJIL = r5
        L9f:
            X.0z41 r0 = r7.LLJZIJLIL
            if (r0 == 0) goto L12
            X.0z3c r0 = r0.LJIIIZ()
            if (r0 == 0) goto L12
            X.0z5u r1 = r0.getEventCenter()
            if (r1 == 0) goto L12
            java.lang.String r0 = "on_action_up"
            r1.LIZIZ(r3, r0)
            return
        Lb5:
            r0 = r3
            goto L8f
        Lb7:
            r0 = r3
            goto L71
        Lb9:
            r1 = 0
            goto L4d
        Lbb:
            r6 = r3
            goto L35
        Lbe:
            r0 = 0
            goto L1f
        Lc1:
            float r0 = r8.getRawY()
            r7.LLJJJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment.WR(android.view.MotionEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[PHI: r4 r5
      0x0060: PHI (r4v4 X.0z3c) = (r4v1 X.0z3c), (r4v5 X.0z3c) binds: [B:32:0x005e, B:30:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:32:0x005e, B:30:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[PHI: r4 r5
      0x00b5: PHI (r4v2 X.0z3c) = (r4v1 X.0z3c), (r4v4 X.0z3c), (r4v4 X.0z3c) binds: [B:32:0x005e, B:34:0x0064, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:32:0x005e, B:34:0x0064, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(int r8) {
        /*
            r7 = this;
            X.0z41 r0 = r7.LLJZIJLIL
            r2 = 1
            if (r0 == 0) goto Lb9
            X.0z3c r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lb9
            X.0z6O r0 = r0.LJIIJJI()
            if (r0 == 0) goto Lb9
            X.0z4M r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto Lb9
            int r0 = r0.LIZ
            if (r8 != r0) goto Lb9
            java.util.HashSet<java.lang.Integer> r1 = r7.LLJLLIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L28
            return
        L28:
            X.0z41 r0 = r7.LLJZIJLIL
            if (r0 == 0) goto Lb2
            X.0z7B r0 = r0.LJJ()
            if (r0 == 0) goto Lb2
            boolean r0 = r0.LJ(r8)
            if (r0 != r2) goto Lb2
            java.util.HashSet<java.lang.Integer> r1 = r7.LLJLLIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.add(r0)
            X.0z41 r0 = r7.LLJZIJLIL
            r6 = 0
            if (r0 == 0) goto Lb7
            X.0z3c r4 = r0.LJIIIZ()
            if (r4 == 0) goto L5c
            X.0z6O r0 = r4.LJIIJJI()
            if (r0 == 0) goto L5c
            X.0z4M r0 = r0.LJIIL(r8)
            if (r0 == 0) goto L5c
            java.lang.String r5 = r0.LIZIZ
            if (r5 != 0) goto L60
        L5c:
            java.lang.String r5 = ""
            if (r4 == 0) goto Lb5
        L60:
            X.0z6O r0 = r4.LJIIJJI()
            if (r0 == 0) goto Lb5
            X.0z4M r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = r0.LIZIZ
        L6e:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r4 == 0) goto Lb3
            X.0z6O r0 = r4.LJIIJJI()
            if (r0 == 0) goto Lb3
            X.0z4M r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lb3
            java.lang.String r3 = r0.LIZIZ
        L82:
            java.lang.String r0 = "livesdk_gamepad_tab_page_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            X.C1880070z1Z.LIZ(r2, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_default"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "tab_name"
            r2.LJJII(r5, r0)
            java.lang.String r0 = "default_tab"
            r2.LJJII(r3, r0)
            if (r4 == 0) goto La4
            X.0z5M r6 = X.C1882380z5I.LIZLLL(r4)
        La4:
            java.util.Map r0 = X.C1882380z5I.LIZ(r6)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r2.LJJIIZI(r0)
            r2.LIZ()
        Lb2:
            return
        Lb3:
            r3 = r6
            goto L82
        Lb5:
            r0 = r6
            goto L6e
        Lb7:
            r4 = r6
            goto L5c
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment.aS(int):void");
    }

    public final void cS(float f) {
        View view = this.LLJJJIL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void dS(int i) {
        TuxIconDrawable tuxIconDrawableLIZ;
        LiveIconView liveIconView = this.LLJLIL;
        if (liveIconView != null) {
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_x_mark;
                c419910GdJ.LIZLLL = Integer.valueOf(i);
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            } else {
                tuxIconDrawableLIZ = null;
            }
            liveIconView.setIcon(tuxIconDrawableLIZ);
        }
        LiveIconView liveIconView2 = this.LLJLIL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(i);
        }
    }

    public final void hS(C20244914Jj c20244914Jj) {
        int iLJIIZILJ;
        int iLJIILLIIL;
        int i;
        int i2;
        Window window;
        View decorView;
        View viewFindViewById;
        if (SR()) {
            iLJIIZILJ = C1884080z82.LIZLLL();
        } else if (!C497740JfY.LJIL()) {
            iLJIIZILJ = C497740JfY.LJIILLIIL();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null) {
            iLJIILLIIL = viewFindViewById.getMeasuredHeight();
        } else {
            iLJIILLIIL = C497740JfY.LJIILLIIL() + C497740JfY.LJIJ();
        }
        if (SR()) {
            i = LLLFFI - LLLF;
        } else {
            i = LLLFFI;
        }
        int i3 = 0;
        if (c20244914Jj != null) {
            i2 = c20244914Jj.LIZLLL;
        } else {
            i2 = 0;
        }
        int i4 = (iLJIILLIIL - i) - i2;
        if (i4 < 0) {
            i4 = 0;
        }
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (c1881590z41 != null) {
            Size size = new Size(iLJIIZILJ, i4);
            c1881590z41.LLJJJJJIL = size;
            c1881590z41.LJIIIZ().LJIIJJI().LJIJI(size);
            boolean zLIZJ = C1884080z82.LIZJ();
            float fLJJI = C497740JfY.LJJI(c1881590z41.LLJJJJJIL.getWidth());
            if (zLIZJ) {
                if (fLJJI < 834.0f) {
                    i3 = 1;
                } else if (fLJJI < 1194.0f) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
            }
            C1882380z5I.LJI(c1881590z41.LJII(), "screen_layout_type", Integer.valueOf(i3));
        }
    }

    public final void kS(boolean z) {
        if (C011Z.LIZ.LJIJ(getContext()) || getActivity() == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z);
        tuxImmersionBarLIZJ.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[PHI: r3 r4
      0x0042: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:22:0x0040, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r4v4 X.0z3c) = (r4v1 X.0z3c), (r4v5 X.0z3c) binds: [B:22:0x0040, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[PHI: r3 r4
      0x0089: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String), (r3v3 java.lang.String) binds: [B:22:0x0040, B:24:0x0046, B:26:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r4v2 X.0z3c) = (r4v1 X.0z3c), (r4v4 X.0z3c), (r4v4 X.0z3c) binds: [B:22:0x0040, B:24:0x0046, B:26:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS(int r8, long r9) {
        /*
            r7 = this;
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L88
            if (r8 < 0) goto L88
            X.0z41 r0 = r7.LLJZIJLIL
            if (r0 == 0) goto L8d
            X.0z7B r0 = r0.LJJ()
            if (r0 == 0) goto L8d
            boolean r1 = r0.LJ(r8)
            r0 = 1
            if (r1 != r0) goto L8d
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r9
            float r5 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0
            float r5 = r5 / r0
            X.0z41 r0 = r7.LLJZIJLIL
            r6 = 0
            if (r0 == 0) goto L8b
            X.0z3c r4 = r0.LJIIIZ()
            if (r4 == 0) goto L3e
            X.0z6O r0 = r4.LJIIJJI()
            if (r0 == 0) goto L3e
            X.0z4M r0 = r0.LJIIL(r8)
            if (r0 == 0) goto L3e
            java.lang.String r3 = r0.LIZIZ
            if (r3 != 0) goto L42
        L3e:
            java.lang.String r3 = ""
            if (r4 == 0) goto L89
        L42:
            X.0z6O r0 = r4.LJIIJJI()
            if (r0 == 0) goto L89
            X.0z4M r0 = r0.LJIIIZ()
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.LIZIZ
        L50:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            java.lang.String r0 = "livesdk_gamepad_tab_stay_duration"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            X.C1880070z1Z.LIZ(r2, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_default"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "tab_name"
            r2.LJJII(r3, r0)
            java.lang.String r1 = "duration"
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r2.LJJIFFI(r0, r1)
            if (r4 == 0) goto L7a
            X.0z5M r6 = X.C1882380z5I.LIZLLL(r4)
        L7a:
            java.util.Map r0 = X.C1882380z5I.LIZ(r6)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r2.LJJIIZI(r0)
            r2.LIZ()
        L88:
            return
        L89:
            r0 = r6
            goto L50
        L8b:
            r4 = r6
            goto L3e
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment.bS(int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0z70] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0z5Y] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0z2s] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1881590z41 c1881590z41;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        C1883060z6O c1883060z6OLJIIJJI;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ2;
        C1883060z6O c1883060z6OLJIIJJI2;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ3;
        C1883060z6O c1883060z6OLJIIJJI3;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ4;
        C1883060z6O c1883060z6OLJIIJJI4;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ5;
        C1883060z6O c1883060z6OLJIIJJI5;
        ViewStub viewStub;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        LinearLayout linearLayout = null;
        if (view2 != null && (viewStub = (ViewStub) view2.findViewById(R.id.dge)) != null) {
            viewStub.setLayoutResource(R.layout.g6w);
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            if (viewLJLLLL != null) {
                linearLayout = (LinearLayout) viewLJLLLL.findViewById(R.id.rnu);
            }
        }
        this.LLJJL = linearLayout;
        NR(view);
        UR();
        ?? r1 = new InterfaceC1883470z73() { // from class: X.0z70
            @Override // X.InterfaceC1883470z73
            public final void LIZJ(int i) {
            }

            @Override // X.InterfaceC1883470z73
            public final void LIZ(int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tab =");
                sbLIZ.append(i);
                sbLIZ.append(" scrolling scrollY=");
                sbLIZ.append(i2);
                C20441214yg.LIZIZ("MixTabItemNestedScrollView", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1883470z73
            public final void LIZIZ(int i, AbstractC1883160z6Y abstractC1883160z6Y) {
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LIZ;
                gameDetailMixPageBaseFragment.getClass();
                if (Intrinsics.LJFF(abstractC1883160z6Y, C1883260z6i.LIZ)) {
                    C1884370z8V c1884370z8V = gameDetailMixPageBaseFragment.LLJJLIIIJLLLLLLLZ;
                    if (c1884370z8V != null) {
                        c1884370z8V.LIZLLL(true);
                    }
                    gameDetailMixPageBaseFragment.aS(i);
                    return;
                }
                Intrinsics.LJFF(abstractC1883160z6Y, C1883230z6f.LIZ);
            }

            @Override // X.InterfaceC1883470z73
            public final void LIZLLL(int i, int i2) throws JSONException {
                InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ6;
                C1882420z5M c1882420z5MLIZLLL;
                final GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LIZ;
                if (i2 != 1) {
                    gameDetailMixPageBaseFragment.getClass();
                    return;
                }
                C1881590z41 c1881590z412 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                if (c1881590z412 != null) {
                    String strLJFF = C1882380z5I.LJFF(C1882380z5I.LJIIIIZZ(c1881590z412.LJIIIZ()), "video_post_extra");
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    Context context = c1881590z412.LLJILJILJ.LIZIZ;
                    if (strLJFF == null || strLJFF.length() == 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ttg_auto_attach", true);
                        jSONObject.put("ttg_scene", "1");
                        jSONObject.put("ttg_post_from", "1");
                        jSONObject.put("ttg_game_tag_id", C1882380z5I.LJFF(c1881590z412.LJII(), "game_tag_id"));
                        jSONObject.put("ttg_game_id", C1882380z5I.LJFF(c1881590z412.LJII(), "game_id"));
                        strLJFF = C786410Ut5.J3(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("anchor_source_type", "tiktok_game");
                    jSONObject2.put("enter_from", "gamecp_page_poi_videos_tab");
                    jSONObject2.put("enter_method", "game_reward_plan_page");
                    jSONObject2.put("action_type", 1);
                    jSONObject2.put("extra", strLJFF);
                    iHostAction.anchorAutoSelection(context, jSONObject2);
                }
                View view3 = gameDetailMixPageBaseFragment.getView();
                if (view3 != null) {
                    C476770Imp.LIZIZ(view3, new Runnable() { // from class: X.0hkP
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.onPostVideoClickedInVideoTab$1");
                            try {
                                gameDetailMixPageBaseFragment.dismissAllowingStateLoss();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.onPostVideoClickedInVideoTab$1");
                        }
                    }, 1000L);
                }
                C1881590z41 c1881590z413 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                C1882410z5L c1882410z5LLJIIIIZZ = null;
                if (c1881590z413 != null) {
                    interfaceC1881340z3cLJIIIZ6 = c1881590z413.LJIIIZ();
                } else {
                    interfaceC1881340z3cLJIIIZ6 = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_post_video_button_click");
                if (interfaceC1881340z3cLJIIIZ6 != null) {
                    c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3cLJIIIZ6);
                } else {
                    c1882420z5MLIZLLL = null;
                }
                c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                c474500IjALIZ.LJJII("videos", "tab_name");
                if (interfaceC1881340z3cLJIIIZ6 != null) {
                    c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(interfaceC1881340z3cLJIIIZ6);
                }
                String strLJFF2 = C1882380z5I.LJFF(c1882410z5LLJIIIIZZ, "sub_tab_name");
                if (strLJFF2 == null) {
                    strLJFF2 = "";
                }
                c474500IjALIZ.LJJII(strLJFF2, "sub_tab_name");
                c474500IjALIZ.LIZ();
            }
        };
        C1881590z41 c1881590z412 = this.LLJZIJLIL;
        if (c1881590z412 != null && (interfaceC1881340z3cLJIIIZ5 = c1881590z412.LJIIIZ()) != null && (c1883060z6OLJIIJJI5 = interfaceC1881340z3cLJIIIZ5.LJIIJJI()) != 0) {
            c1883060z6OLJIIJJI5.LJFF(r1);
        }
        C360660ECa c360660ECa = new C360660ECa() { // from class: X.0z7E
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                C1883550z7B c1883550z7BLJJ;
                C1883100z6S c1883100z6S;
                C1883550z7B c1883550z7BLJJ2;
                C1883100z6S c1883100z6S2;
                C1884300z8O c1884300z8O;
                C1884370z8V c1884370z8V;
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LL;
                C1881590z41 c1881590z413 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                if (c1881590z413 != null && (c1883550z7BLJJ2 = c1881590z413.LJJ()) != null && (c1883100z6S2 = (C1883100z6S) C13LP.LJJJLZIJ(i, c1883550z7BLJJ2.LLJJJIL)) != null && (c1884300z8O = c1883100z6S2.LLIZLLLIL) != null && (c1884370z8V = gameDetailMixPageBaseFragment.LLJJLIIIJLLLLLLLZ) != null) {
                    c1884370z8V.setCurChildNestScrollView(c1884300z8O);
                }
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment2 = this.LL;
                HashSet<Integer> hashSet = gameDetailMixPageBaseFragment2.LLJLLIL;
                ArrayList arrayList = new ArrayList();
                for (Integer num : hashSet) {
                    if (num.intValue() == i) {
                        arrayList.add(num);
                    }
                }
                gameDetailMixPageBaseFragment2.LLJLLIL = C13LP.LLIFFJFJJ(arrayList);
                C1881590z41 c1881590z414 = this.LL.LLJZIJLIL;
                if (c1881590z414 != null && (c1883550z7BLJJ = c1881590z414.LJJ()) != null && (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, c1883550z7BLJJ.LLJJJIL)) != null) {
                    if (c1883100z6S.LLJJIJI) {
                        this.LL.aS(i);
                    } else {
                        c1883100z6S.LJIIL();
                    }
                }
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment3 = this.LL;
                int i2 = gameDetailMixPageBaseFragment3.LLJILJILJ;
                if (i != i2) {
                    gameDetailMixPageBaseFragment3.bS(i2, gameDetailMixPageBaseFragment3.LLJILLL);
                }
                this.LL.LLJILLL = SystemClock.elapsedRealtime();
                this.LL.LLJILJILJ = i;
            }
        };
        C1881590z41 c1881590z413 = this.LLJZIJLIL;
        if (c1881590z413 != null && (interfaceC1881340z3cLJIIIZ4 = c1881590z413.LJIIIZ()) != null && (c1883060z6OLJIIJJI4 = interfaceC1881340z3cLJIIIZ4.LJIIJJI()) != null) {
            c1883060z6OLJIIJJI4.LIZIZ(c360660ECa);
        }
        ?? r12 = new InterfaceC1883670z7N() { // from class: X.0z5Y
            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                int i;
                ViewParent parent;
                InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ6;
                C1883060z6O c1883060z6OLJIIJJI6;
                String str;
                C19YU c19yu;
                C19YT c19yt;
                ViewParent parent2;
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LIZ;
                if (c1888650zFP != null) {
                    i = c1888650zFP.LIZLLL;
                } else {
                    i = -1;
                }
                gameDetailMixPageBaseFragment.LLJJIJIIJIL = i;
                InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ7 = null;
                if (c1888650zFP != null && (c19yt = c1888650zFP.LJII) != null && (parent2 = c19yt.getParent()) != null) {
                    parent = parent2.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof C19YU) && (c19yu = (C19YU) parent) != null) {
                    GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment2 = this.LIZ;
                    if (((HashSet) gameDetailMixPageBaseFragment2.LLJJIJIL.getValue()).size() != c19yu.getTabCount()) {
                        C476770Imp.LIZJ(c19yu, new RunnableC1880820z2m(gameDetailMixPageBaseFragment2, c19yu));
                    }
                }
                GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment3 = this.LIZ;
                C1881590z41 c1881590z414 = gameDetailMixPageBaseFragment3.LLJZIJLIL;
                if (c1881590z414 != null && (interfaceC1881340z3cLJIIIZ6 = c1881590z414.LJIIIZ()) != null && (c1883060z6OLJIIJJI6 = interfaceC1881340z3cLJIIIZ6.LJIIJJI()) != null && Intrinsics.LJFF(c1883060z6OLJIIJJI6.LLILZLL, Boolean.TRUE)) {
                    if (z) {
                        if (gameDetailMixPageBaseFragment3.LLJJIII) {
                            str = "see_all";
                        } else {
                            str = "draw";
                        }
                    } else {
                        str = "";
                    }
                    String str2 = "click";
                    if (z2) {
                        str = "click";
                    }
                    if (gameDetailMixPageBaseFragment3.LLJJIJI == gameDetailMixPageBaseFragment3.LLJJIJIIJIL) {
                        gameDetailMixPageBaseFragment3.LLJJIJI = -1;
                    } else {
                        str2 = str;
                    }
                    if (str2.length() != 0) {
                        C1881590z41 c1881590z415 = gameDetailMixPageBaseFragment3.LLJZIJLIL;
                        if (c1881590z415 != null) {
                            interfaceC1881340z3cLJIIIZ7 = c1881590z415.LJIIIZ();
                        }
                        C1880070z1Z.LJIIJ(interfaceC1881340z3cLJIIIZ7, gameDetailMixPageBaseFragment3.LLJJIJIIJIL, str2);
                        gameDetailMixPageBaseFragment3.LLJJIII = false;
                    }
                }
            }
        };
        C1881590z41 c1881590z414 = this.LLJZIJLIL;
        if (c1881590z414 != null && (interfaceC1881340z3cLJIIIZ3 = c1881590z414.LJIIIZ()) != null && (c1883060z6OLJIIJJI3 = interfaceC1881340z3cLJIIIZ3.LJIIJJI()) != 0) {
            c1883060z6OLJIIJJI3.LIZLLL(r12);
        }
        ?? r13 = new View.OnScrollChangeListener() { // from class: X.0z2s
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view3, int i, int i2, int i3, int i4) {
                C19YU c19yu;
                if ((view3 instanceof C19YU) && (c19yu = (C19YU) view3) != null) {
                    GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LIZ;
                    if (((HashSet) gameDetailMixPageBaseFragment.LLJJIJIL.getValue()).size() != c19yu.getTabCount()) {
                        C476770Imp.LIZJ(c19yu, new RunnableC1880820z2m(gameDetailMixPageBaseFragment, c19yu));
                    }
                }
            }
        };
        C1881590z41 c1881590z415 = this.LLJZIJLIL;
        if (c1881590z415 != null && (interfaceC1881340z3cLJIIIZ2 = c1881590z415.LJIIIZ()) != null && (c1883060z6OLJIIJJI2 = interfaceC1881340z3cLJIIIZ2.LJIIJJI()) != 0) {
            c1883060z6OLJIIJJI2.LIZJ(r13);
        }
        this.LLJJI = r13;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ohr);
        if (frameLayout != null) {
            C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
            if (c1884370z8V != null && (c1881590z41 = this.LLJZIJLIL) != null && (interfaceC1881340z3cLJIIIZ = c1881590z41.LJIIIZ()) != null && (c1883060z6OLJIIJJI = interfaceC1881340z3cLJIIIZ.LJIIJJI()) != null) {
                c1883060z6OLJIIJJI.LJI(c1884370z8V);
            }
            C1881590z41 c1881590z416 = this.LLJZIJLIL;
            if (c1881590z416 != null) {
                c1881590z416.h(frameLayout);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewTd = C786410Ut5.Td(layoutInflater, PR(), null, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (viewOnCreateView instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewOnCreateView;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(viewTd, layoutParams);
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
