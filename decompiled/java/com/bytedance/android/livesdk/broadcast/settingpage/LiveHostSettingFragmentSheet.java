package com.bytedance.android.livesdk.broadcast.settingpage;

import X.C01GW;
import X.C098200Yq;
import X.C0UH7;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1338270kvh;
import X.C13LE;
import X.C13LZ;
import X.C1697810uHb;
import X.C189200o6;
import X.C1954807lC;
import X.C20441214yg;
import X.C20484615Do;
import X.C20736316Cj;
import X.C2107308Nj;
import X.C21578619ce;
import X.C21657819pQ;
import X.C2188811AlT;
import X.C336720DHy;
import X.C385801ei;
import X.C452501pT;
import X.C497740JfY;
import X.C499640Jic;
import X.C500260Jjc;
import X.C531650Kt9;
import X.C754600Tis;
import X.C754610Tit;
import X.C754630Tiv;
import X.C758170Tod;
import X.C776110UcT;
import X.C781770Ulb;
import X.C781790Uld;
import X.C781840Uli;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.EnumC754620Tiu;
import X.EnumC776090UcR;
import X.InterfaceC500690JkJ;
import X.InterfaceC754640Tiw;
import X.InterfaceC781800Ule;
import X.InterfaceC781810Ulf;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import com.bytedance.android.livesdk.broadcast.settingpage.config.LiveHostSettingsConfigBridge;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfigLocalTest;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS120S0101000_12;
import kotlin.jvm.internal.AwS152S0101000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostSettingFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZzHELIOSw2PDElJygjKSIpZwM6PiAEJjwnGyA4PSY9LwM+KCg+LSs4Gic2LTE=";
    public final EnumC754620Tiu LLJLLL;
    public final DataChannel LLJZ;
    public final Integer LLJZIJLIL;
    public LinearLayout LLL;
    public C21578619ce LLLF;
    public LinearLayout LLLFF;
    public InterfaceC781810Ulf LLLFFI;
    public boolean LLLFZ;
    public InterfaceC500690JkJ LLLI;
    public final Set<Integer> LLLII = new LinkedHashSet();
    public final Map<Integer, C21657819pQ> LLLIIII = new LinkedHashMap();
    public final Set<Integer> LLLIIIIL = new LinkedHashSet();
    public final Map<Integer, C21657819pQ> LLLIIIL = new LinkedHashMap();
    public final Map<Integer, LinearLayout> LLLIIL = new LinkedHashMap();
    public final Map<Integer, View> LLLIILIL = new LinkedHashMap();
    public final ViewModelLazy LLLIL;
    public final BPEAHandler LLLILZ;
    public final int LLLILZJ;
    public boolean LLLILZLLLI;
    public final String LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        if (this.LLJLLL == EnumC754620Tiu.LIVE_PREVIEW) {
            return null;
        }
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853493));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodUR = UR();
        if (c758170TodUR != null) {
            arrayList.add(c758170TodUR);
        }
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Iterator it2 = ((LinkedHashMap) this.LLLIIII).values().iterator();
        while (it2.hasNext()) {
            ((C21657819pQ) it2.next()).LIZJ();
        }
        ((LinkedHashMap) this.LLLIIII).clear();
        this.LLLII.clear();
        Iterator it3 = ((LinkedHashMap) this.LLLIIIL).values().iterator();
        while (it3.hasNext()) {
            ((C21657819pQ) it3.next()).LIZJ();
        }
        ((LinkedHashMap) this.LLLIIIL).clear();
        this.LLLIIIIL.clear();
        InterfaceC500690JkJ interfaceC500690JkJ = this.LLLI;
        if (interfaceC500690JkJ != null) {
            interfaceC500690JkJ.release();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLLFFI = null;
        this.LLLILZ.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.isClipChildren = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC781810Ulf previewSettingsConfigBridge;
        super.onCreate(bundle);
        C754630Tiv c754630Tiv = InterfaceC754640Tiw.LJIIIIZZ;
        EnumC754620Tiu enumC754620Tiu = this.LLJLLL;
        DataChannel dataChannel = this.LLJZ;
        C20484615Do c20484615Do = this.LLJJIJIL;
        c754630Tiv.getClass();
        int i = C754600Tis.LIZ[enumC754620Tiu.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new C1954807lC();
            }
            previewSettingsConfigBridge = new LiveHostSettingsConfigBridge(this, dataChannel, c20484615Do, this);
        } else {
            previewSettingsConfigBridge = new PreviewSettingsConfigBridge(this, dataChannel, c20484615Do, this);
        }
        previewSettingsConfigBridge.init();
        getLifecycle().addObserver(previewSettingsConfigBridge);
        this.LLLFFI = previewSettingsConfigBridge;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/settingpage/LiveHostSettingFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+8Dh+RhdxezR2FkdvBVySIXD9RVSV0TtFc2+MX43ngRPu37AWuzesk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        InterfaceC781810Ulf interfaceC781810Ulf = this.LLLFFI;
        if (interfaceC781810Ulf != null) {
            interfaceC781810Ulf.onHiddenChanged(z);
        }
    }

    public final void wS(boolean z) {
        if (z) {
            if (C500260Jjc.LJJJJIZL(this.LLL)) {
                C500260Jjc.LJIILIIL(this.LLL);
                if (this.LLJLLL == EnumC754620Tiu.LIVE_PREVIEW) {
                    C1119170fEJ c1119170fEJ = new C1119170fEJ();
                    c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853493));
                    ArrayList arrayList = new ArrayList();
                    C758170Tod c758170TodUR = UR();
                    if (c758170TodUR != null) {
                        arrayList.add(c758170TodUR);
                    }
                    c1119170fEJ.LJFF = arrayList;
                    c1119170fEJ.LJI = false;
                    RR(c1119170fEJ);
                    return;
                }
                return;
            }
            return;
        }
        if (C500260Jjc.LJJJJIZL(this.LLL)) {
            return;
        }
        C500260Jjc.LLFFF(this.LLL);
    }

    public final void yS(List<C385801ei> list) {
        Pair pair;
        String strName;
        LinearLayout.LayoutParams layoutParams;
        Object c098200Yq;
        String strName2;
        ViewGroup viewGroup;
        View view;
        C499640Jic c499640JicLJJIIZ;
        LinearLayout linearLayout = this.LLL;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getWidth() <= 0) {
            C786410Ut5.LJJZZIII(this.LLLILZ, new ARunnableS81S0200000_12(list, this, 35));
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        boolean z = true;
        if (C754610Tit.LIZ[this.LLJLLL.ordinal()] == 1) {
            linearLayout.setPadding(0, (int) C497740JfY.LIZIZ(20), 0, (int) C497740JfY.LIZIZ(12));
            int iLIZIZ = (int) C497740JfY.LIZIZ(6);
            int width = linearLayout.getWidth();
            int i = this.LLLILZJ;
            pair = new Pair(Integer.valueOf((width - ((i - 1) * iLIZIZ)) / i), Integer.valueOf(iLIZIZ));
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<Pair> arrayList2 = new ArrayList();
        C21578619ce c21578619ce = this.LLLF;
        int i2 = 0;
        for (C385801ei c385801ei : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C385801ei c385801ei2 = c385801ei;
                int i4 = c385801ei2.LIZ;
                linkedHashSet.add(Integer.valueOf(i4));
                if (getContext() != null) {
                    View viewLJJIIJ = (View) ((LinkedHashMap) this.LLLIILIL).get(Integer.valueOf(i4));
                    if (viewLJJIIJ == null) {
                        InterfaceC781800Ule interfaceC781800UleUS = uS(c385801ei2, linearLayout);
                        if (interfaceC781800UleUS != null && (c499640JicLJJIIZ = interfaceC781800UleUS.LJJIIZ()) != null) {
                            view = c499640JicLJJIIZ.LIZ;
                        } else {
                            view = null;
                        }
                        List<? extends View> listSingletonList = Collections.singletonList(view);
                        if (interfaceC781800UleUS != null) {
                            interfaceC781800UleUS.LJJIIJZLJL(listSingletonList, new AwS120S0101000_12(i4, this, 0));
                            viewLJJIIJ = interfaceC781800UleUS.LJJIIJ();
                        } else {
                            viewLJJIIJ = null;
                        }
                    }
                    if (viewLJJIIJ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateHeaderItems itemView failed. tag: ");
                        sbLIZ.append(i4);
                        sbLIZ.append(", name: ");
                        EnumC776090UcR.Companion.getClass();
                        EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i4);
                        if (enumC776090UcRLIZ != null) {
                            strName = enumC776090UcRLIZ.name();
                        } else {
                            strName = null;
                        }
                        sbLIZ.append(strName);
                        C20441214yg.LJ("LiveHostSettingFragmentSheet", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = viewLJJIIJ.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        if (iIntValue > 0) {
                            layoutParams.width = iIntValue;
                        }
                        if (i2 != 0 && iIntValue2 > 0) {
                            layoutParams.setMarginStart(iIntValue2);
                        }
                        layoutParams.gravity = 48;
                    } else {
                        layoutParams = null;
                    }
                    C786410Ut5.W5(viewLJJIIJ, layoutParams);
                    this.LLLIILIL.put(Integer.valueOf(i4), viewLJJIIJ);
                    if (C500260Jjc.LJJJJIZL(viewLJJIIJ)) {
                        z = false;
                    }
                    ViewParent parent = viewLJJIIJ.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(viewLJJIIJ, viewGroup);
                    }
                    try {
                        arrayList.add(viewLJJIIJ);
                        linearLayout.addView(viewLJJIIJ);
                        c098200Yq = Boolean.valueOf(arrayList2.add(new Pair(Integer.valueOf(i4), viewLJJIIJ)));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateHeaderItems generate itemView failed. tag: ");
                        sbLIZ2.append(i4);
                        sbLIZ2.append(", name: ");
                        EnumC776090UcR.Companion.getClass();
                        EnumC776090UcR enumC776090UcRLIZ2 = C0UH7.LIZ(i4);
                        if (enumC776090UcRLIZ2 != null) {
                            strName2 = enumC776090UcRLIZ2.name();
                        } else {
                            strName2 = null;
                        }
                        sbLIZ2.append(strName2);
                        C20441214yg.LJ("LiveHostSettingFragmentSheet", C2188811AlT.LIZIZ(sbLIZ2));
                        Map<String, Object> map = C1338270kvh.LIZ;
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        for (Pair pair2 : arrayList2) {
            int iIntValue3 = ((Number) pair2.getFirst()).intValue();
            View view2 = (View) pair2.getSecond();
            C21657819pQ c21657819pQRemove = this.LLLIIIL.remove(Integer.valueOf(iIntValue3));
            if (c21657819pQRemove != null) {
                c21657819pQRemove.LIZJ();
            }
            if (!this.LLLIIIIL.contains(Integer.valueOf(iIntValue3)) && c21578619ce != null) {
                C21657819pQ c21657819pQ = new C21657819pQ(c21578619ce, view2, new AwS152S0101000_12(iIntValue3, this, 4));
                this.LLLIIIL.put(Integer.valueOf(iIntValue3), c21657819pQ);
                c21657819pQ.LIZIZ();
                c21657819pQ.LIZ();
            }
        }
        Iterator it2 = ((LinkedHashMap) this.LLLIIIL).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue4 = ((Number) entry.getKey()).intValue();
            C21657819pQ c21657819pQ2 = (C21657819pQ) entry.getValue();
            if (!linkedHashSet.contains(Integer.valueOf(iIntValue4))) {
                c21657819pQ2.LIZJ();
                it2.remove();
            }
        }
        wS(z);
        getLifecycle().addObserver(new LifecycleVisibilityWatcher(this, new C781840Uli(arrayList, new AwS556S0100000_12(this, 998), new AwS556S0100000_12(this, 999))));
    }

    public final void zS(LinearLayout linearLayout) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue = 0;
        Iterable iterableLJIILJJIL = C13LZ.LJIILJJIL(0, linearLayout.getChildCount());
        if ((iterableLJIILJJIL instanceof Collection) && ((Collection) iterableLJIILJJIL).isEmpty()) {
            z = false;
        } else {
            C531650Kt9 it2 = iterableLJIILJJIL.iterator();
            while (it2.LLILLL) {
                View childAt = linearLayout.getChildAt(it2.nextInt());
                z = true;
                if (childAt != null && C500260Jjc.LJJJJIZL(childAt)) {
                    break;
                }
            }
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z) {
                iIntValue = ((Number) this.LLLJIL.getValue()).intValue();
            }
            marginLayoutParams.topMargin = iIntValue;
            C786410Ut5.d6(linearLayout, marginLayoutParams);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC781810Ulf interfaceC781810Ulf = this.LLLFFI;
        if (interfaceC781810Ulf != null) {
            interfaceC781810Ulf.onViewCreated(view);
        }
        View viewFindViewById = view.findViewById(R.id.js0);
        if (viewFindViewById != null) {
            viewFindViewById.setClipToOutline(true);
        }
        this.LLL = (LinearLayout) view.findViewById(R.id.jke);
        this.LLLF = (C21578619ce) view.findViewById(R.id.u3o);
        this.LLLFF = (LinearLayout) view.findViewById(R.id.uw2);
        C500260Jjc.LJJJJJ(this, null, new C781770Ulb(this, null), 3);
        C500260Jjc.LJJJJJ(this, C2107308Nj.LIZ, new C781790Uld(this, null), 2);
    }

    public final InterfaceC781800Ule uS(C385801ei c385801ei, ViewGroup viewGroup) {
        InterfaceC781800Ule interfaceC781800Ule;
        int i = c385801ei.LIZ;
        EnumC776090UcR.Companion.getClass();
        final EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
        if (enumC776090UcRLIZ == null) {
            return null;
        }
        InterfaceC781800Ule.LIZ.getClass();
        int i2 = C776110UcT.LIZ[enumC776090UcRLIZ.getType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h6v, viewGroup, false);
                    interfaceC781800Ule = new InterfaceC781800Ule(viewTd, enumC776090UcRLIZ) { // from class: X.0JjQ
                        public static final /* synthetic */ int LJFF = 0;
                        public final View LIZIZ;
                        public final LiveIconView LIZJ;
                        public final C16F5 LIZLLL;
                        public C499640Jic LJ;

                        @Override // X.InterfaceC781800Ule
                        public final C499640Jic LJJIIZ() {
                            C499640Jic c499640Jic = this.LJ;
                            if (c499640Jic != null) {
                                return c499640Jic;
                            }
                            C499640Jic c499640Jic2 = new C499640Jic(this.LIZIZ, this.LIZJ, this.LIZLLL, null, null, null, null, null, null, 504);
                            this.LJ = c499640Jic2;
                            return c499640Jic2;
                        }

                        @Override // X.InterfaceC781800Ule
                        public final View LJJIIJ() {
                            return this.LIZIZ;
                        }

                        {
                            this.LIZIZ = viewTd;
                            LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.lkw);
                            this.LIZJ = liveIconView;
                            C16F5 c16f5 = (C16F5) viewTd.findViewById(R.id.tv_title);
                            this.LIZLLL = c16f5;
                            viewTd.setId(enumC776090UcRLIZ.getTag());
                            if (c16f5 != null) {
                                c16f5.setText(C497740JfY.LJIJI(enumC776090UcRLIZ.getTitleId()));
                            }
                            Integer iconId = enumC776090UcRLIZ.getIconId();
                            if (iconId != null) {
                                int iIntValue = iconId.intValue();
                                if (liveIconView != null) {
                                    liveIconView.setIcon(C20736316Cj.LIZLLL(iIntValue, viewTd.getContext()));
                                }
                            }
                            C500260Jjc.LJIILIIL(viewTd);
                            if (LiveHostSettingsUIConfigLocalTest.localTest()) {
                                C500260Jjc.LLFFF(viewTd);
                            }
                        }

                        @Override // X.InterfaceC781800Ule
                        public final void LJJIIJZLJL(List<? extends View> list, Function1<? super View, Unit> function1) {
                            C480260IsS.LIZ(list, function1);
                        }
                    };
                } else {
                    throw new C1954807lC();
                }
            } else {
                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h6t, viewGroup, false);
                interfaceC781800Ule = new InterfaceC781800Ule(viewTd2, enumC776090UcRLIZ) { // from class: X.0JjT
                    public static final /* synthetic */ int LJIIIIZZ = 0;
                    public final View LIZIZ;
                    public final LiveIconView LIZJ;
                    public final LiveIconView LIZLLL;
                    public final C16F5 LJ;
                    public final C16F5 LJFF;
                    public final C20743716Ff LJI;
                    public C499640Jic LJII;

                    @Override // X.InterfaceC781800Ule
                    public final C499640Jic LJJIIZ() {
                        C499640Jic c499640Jic = this.LJII;
                        if (c499640Jic != null) {
                            return c499640Jic;
                        }
                        C499640Jic c499640Jic2 = new C499640Jic(this.LIZIZ, this.LIZJ, this.LJ, this.LJFF, null, null, this.LJI, this.LIZLLL, null, 304);
                        this.LJII = c499640Jic2;
                        return c499640Jic2;
                    }

                    @Override // X.InterfaceC781800Ule
                    public final View LJJIIJ() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZIZ = viewTd2;
                        LiveIconView liveIconView = (LiveIconView) viewTd2.findViewById(R.id.lkw);
                        this.LIZJ = liveIconView;
                        LiveIconView liveIconView2 = (LiveIconView) viewTd2.findViewById(R.id.lxy);
                        this.LIZLLL = liveIconView2;
                        C16F5 c16f5 = (C16F5) viewTd2.findViewById(R.id.tv_title);
                        this.LJ = c16f5;
                        C16F5 c16f52 = (C16F5) viewTd2.findViewById(R.id.zhz);
                        this.LJFF = c16f52;
                        this.LJI = (C20743716Ff) viewTd2.findViewById(R.id.uvv);
                        viewTd2.setId(enumC776090UcRLIZ.getTag());
                        if (c16f5 != null) {
                            c16f5.setText(C497740JfY.LJIJI(enumC776090UcRLIZ.getTitleId()));
                        }
                        Integer iconId = enumC776090UcRLIZ.getIconId();
                        if (iconId != null) {
                            int iIntValue = iconId.intValue();
                            if (liveIconView != null) {
                                liveIconView.setIcon(C20736316Cj.LIZLLL(iIntValue, viewTd2.getContext()));
                            }
                        }
                        Integer tipsIconId = enumC776090UcRLIZ.getTipsIconId();
                        if (tipsIconId != null) {
                            int iIntValue2 = tipsIconId.intValue();
                            if (liveIconView2 != null) {
                                liveIconView2.setIcon(C20736316Cj.LIZLLL(iIntValue2, viewTd2.getContext()));
                            }
                            C500260Jjc.LLFFF(liveIconView2);
                        }
                        Integer tipsContentDescription = enumC776090UcRLIZ.getTipsContentDescription();
                        if (tipsContentDescription != null) {
                            int iIntValue3 = tipsContentDescription.intValue();
                            if (liveIconView2 != null) {
                                liveIconView2.setContentDescription(C497740JfY.LJIJI(iIntValue3));
                            }
                        }
                        Integer subDescriptionId = enumC776090UcRLIZ.getSubDescriptionId();
                        if (subDescriptionId != null) {
                            int iIntValue4 = subDescriptionId.intValue();
                            if (c16f52 != null) {
                                c16f52.setText(C497740JfY.LJIJI(iIntValue4));
                            }
                            C500260Jjc.LLFFF(c16f52);
                        }
                        C500260Jjc.LJIILIIL(viewTd2);
                        if (LiveHostSettingsUIConfigLocalTest.localTest()) {
                            C500260Jjc.LLFFF(viewTd2);
                        }
                    }

                    @Override // X.InterfaceC781800Ule
                    public final void LJJIIJZLJL(List<? extends View> list, Function1<? super View, Unit> function1) {
                        C480260IsS.LIZ(list, function1);
                    }
                };
            }
        } else {
            final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h6s, viewGroup, false);
            interfaceC781800Ule = new InterfaceC781800Ule(viewTd3, enumC776090UcRLIZ) { // from class: X.0JjS
                public static final /* synthetic */ int LJIIIZ = 0;
                public final View LIZIZ;
                public final LiveIconView LIZJ;
                public final LiveIconView LIZLLL;
                public final C16F5 LJ;
                public final C16F5 LJFF;
                public final C16F5 LJI;
                public final View LJII;
                public C499640Jic LJIIIIZZ;

                @Override // X.InterfaceC781800Ule
                public final C499640Jic LJJIIZ() {
                    C499640Jic c499640Jic = this.LJIIIIZZ;
                    if (c499640Jic != null) {
                        return c499640Jic;
                    }
                    C499640Jic c499640Jic2 = new C499640Jic(this.LIZIZ, this.LIZJ, this.LJ, this.LJFF, this.LJI, this.LJII, null, null, this.LIZLLL, 192);
                    this.LJIIIIZZ = c499640Jic2;
                    return c499640Jic2;
                }

                @Override // X.InterfaceC781800Ule
                public final View LJJIIJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = viewTd3;
                    LiveIconView liveIconView = (LiveIconView) viewTd3.findViewById(R.id.lkw);
                    this.LIZJ = liveIconView;
                    this.LIZLLL = (LiveIconView) viewTd3.findViewById(R.id.lbf);
                    C16F5 c16f5 = (C16F5) viewTd3.findViewById(R.id.tv_title);
                    this.LJ = c16f5;
                    C16F5 c16f52 = (C16F5) viewTd3.findViewById(R.id.zhz);
                    this.LJFF = c16f52;
                    C16F5 c16f53 = (C16F5) viewTd3.findViewById(R.id.tv_status);
                    this.LJI = c16f53;
                    this.LJII = viewTd3.findViewById(R.id.t16);
                    viewTd3.setId(enumC776090UcRLIZ.getTag());
                    if (c16f5 != null) {
                        c16f5.setText(C497740JfY.LJIJI(enumC776090UcRLIZ.getTitleId()));
                    }
                    Integer iconId = enumC776090UcRLIZ.getIconId();
                    if (iconId != null) {
                        int iIntValue = iconId.intValue();
                        if (liveIconView != null) {
                            liveIconView.setIcon(C20736316Cj.LIZLLL(iIntValue, viewTd3.getContext()));
                        }
                    }
                    Integer subDescriptionId = enumC776090UcRLIZ.getSubDescriptionId();
                    if (subDescriptionId != null) {
                        int iIntValue2 = subDescriptionId.intValue();
                        if (c16f52 != null) {
                            c16f52.setText(C497740JfY.LJIJI(iIntValue2));
                        }
                        C500260Jjc.LLFFF(c16f52);
                    }
                    Integer statusId = enumC776090UcRLIZ.getStatusId();
                    if (statusId != null) {
                        int iIntValue3 = statusId.intValue();
                        if (c16f53 != null) {
                            c16f53.setText(C497740JfY.LJIJI(iIntValue3));
                        }
                        C500260Jjc.LLFFF(c16f53);
                    }
                    C500260Jjc.LJIILIIL(viewTd3);
                    if (LiveHostSettingsUIConfigLocalTest.localTest()) {
                        C500260Jjc.LLFFF(viewTd3);
                    }
                }

                @Override // X.InterfaceC781800Ule
                public final void LJJIIJZLJL(List<? extends View> list, Function1<? super View, Unit> function1) {
                    C480260IsS.LIZ(list, function1);
                }
            };
        }
        if (!LiveHostSettingsUIConfigLocalTest.localTest()) {
            c385801ei.LIZIZ.invoke(this, this, interfaceC781800Ule.LJJIIZ());
        }
        return interfaceC781800Ule;
    }

    public LiveHostSettingFragmentSheet(EnumC754620Tiu enumC754620Tiu, DataChannel dataChannel, Integer num) {
        this.LLJLLL = enumC754620Tiu;
        this.LLJZ = dataChannel;
        this.LLJZIJLIL = num;
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS556S0100000_12(new AwS556S0100000_12((Fragment) this, 199), (Function0<Unit>) 200));
        this.LLLIL = C336720DHy.LIZ(this, C13LE.LIZ(SettingsViewModel.class), new AwS556S0100000_12(c01gwLIZ, 201), new AwS413S0200000_12((Function0) null, c01gwLIZ, 11), new AwS413S0200000_12(this, c01gwLIZ, 12));
        this.LLLILZ = new BPEAHandler(Looper.getMainLooper());
        this.LLLILZJ = 4;
        this.LLLILZLLLI = true;
        this.LLLIZZ = "live_take_detail";
        UserService.getInstance().user().getCurrentUserId();
        this.LLLJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(89));
        this.LLLJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(90));
        if (enumC754620Tiu == EnumC754620Tiu.LIVE_PREVIEW) {
            this.LLLIZZ = "live_take_page";
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h6u, viewGroup, false);
    }
}
