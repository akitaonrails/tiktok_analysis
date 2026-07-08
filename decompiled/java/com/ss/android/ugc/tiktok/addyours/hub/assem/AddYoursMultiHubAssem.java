package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.AbstractC712240Rwk;
import X.C019F;
import X.C01GW;
import X.C0DLD;
import X.C0OB6;
import X.C0OD0;
import X.C0OEI;
import X.C0QSJ;
import X.C1173220gdU;
import X.C13LE;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C20632315oP;
import X.C2217381BqS;
import X.C452501pT;
import X.C615560OCk;
import X.C673150Qan;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C817250W4d;
import X.InterfaceC1146704e9;
import X.InterfaceC1733780vDc;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubScope;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility;
import com.ss.android.ugc.tiktok.addyours.hub.cell.AddYoursHubListCell;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import com.ss.android.ugc.tiktok.addyours.mob.hub.EnterAddYoursTopicListProvider;
import com.ss.android.ugc.tiktok.addyours.mob.hub.IAddYoursHubProtocol;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS52S2100000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursMultiHubAssem extends UISlotAssem implements AddYoursTabAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJI;
    public C1846060y8i LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursMultiHubAssem.class, "hubTabViewModel", "getHubTabViewModel()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursMultiHubAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursHubTabViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 899), AFwS240S0000000_9.get$arr$(694), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1639));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ma;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{AddYoursHubScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursHubScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursHubScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final AddYoursHubTabViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (AddYoursHubTabViewModel) assemVMLazy.getValue();
    }

    public final C1846060y8i ip() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wwq) : null;
            this.LLJJIII = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20631115oD kp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.viewPager) : null;
            this.LLJJI = (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, AddYoursTabAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility
    public final void P41(List<C615560OCk> list) {
        String str;
        C0OD0 c0od0D30;
        C0OEI c0oei;
        ArrayList arrayList = new ArrayList();
        for (C615560OCk c615560OCk : list) {
            C1845940y8W c1845940y8WLJII = ip().LJII(c615560OCk.LIZ);
            if (c1845940y8WLJII != null) {
                Object obj = c1845940y8WLJII.LIZ;
                if ((obj instanceof C0OEI) && (c0oei = (C0OEI) obj) != null) {
                    c0oei.LLILZ.LIZIZ = c615560OCk.LIZIZ;
                    arrayList.add(c615560OCk);
                    c1845940y8WLJII.LIZIZ(ip().getContext().getResources().getString(c0oei.LLILLJJLI, Integer.valueOf(c615560OCk.LIZIZ)));
                }
            }
        }
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), new C0DLD(arrayList), C0DLD.class, "source_default_key");
        if (!this.LLJJIJIL) {
            this.LLJJIJIL = true;
            AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) this.LLJJIJIIJIL.getValue();
            if (addYoursHubAbility == null || (c0od0D30 = addYoursHubAbility.D30()) == null || (str = c0od0D30.LIZLLL) == null) {
                str = "click_add_yours_button";
            }
            C817250W4d.LIZIZ(getContext(), "enter_add_yours_topic_list", new AwS52S2100000_9(this, str, "added", 1), new AwS52S2100000_9(this, str, "added", 0));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        C0OD0 c0od0D30;
        String str;
        String str2;
        super.onViewCreated(view);
        InterfaceC1733780vDc viewItemOperator = kp().getViewItemOperator();
        C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = 1;
        c1173220gdU.LIZJ = false;
        c1173220gdU.LJI = false;
        c1173220gdU.LJFF = "add_yours_hub_tab";
        viewItemOperator.LIZLLL(c1173220gdU);
        viewItemOperator.LIZJ(AddYoursHubListCell.class);
        hp().setListState(kp().getViewItemOperator().getState());
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OEJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0OEF c0oef = (C0OEF) obj;
                c0oef.getClass();
                return C627260Oiy.LIZ(c0oef);
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(58), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OEH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0OEF) obj).LL);
            }
        }, C736820SvI.LIZLLL(), AFwS285S0000000_2.get$arr$(52), 4);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDKp = kp();
        if (viewOnAttachStateChangeListenerC20631115oDKp.getChildCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (viewOnAttachStateChangeListenerC20631115oDKp.getChildAt(0) instanceof C20632315oP)) {
            final C20632315oP c20632315oP = (C20632315oP) viewOnAttachStateChangeListenerC20631115oDKp.getChildAt(0);
            final C1846060y8i c1846060y8iIp = ip();
            c1846060y8iIp.LIZ(new InterfaceC1846110y8n() { // from class: X.0OEK
                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    c20632315oP.setCurrentItem(c1845940y8W.LIZLLL);
                }
            });
            c20632315oP.LIZIZ(new AbstractC712240Rwk(c1846060y8iIp) { // from class: X.0gSB
                public final WeakReference<C1846060y8i> LL;
                public int LLILLJJLI;
                public int LLILLL;

                {
                    this.LL = new WeakReference<>(c1846060y8iIp);
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i) {
                    this.LLILLJJLI = this.LLILLL;
                    this.LLILLL = i;
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                    boolean z2;
                    C1846060y8i c1846060y8i = this.LL.get();
                    if (c1846060y8i != null && c1846060y8i.getSelectedTabPosition() != i && i < c1846060y8i.getTabCount()) {
                        int i2 = this.LLILLL;
                        if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c1846060y8i.LJIILL(c1846060y8i.LJII(i), z2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
                  0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractC712240Rwk
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onPageScrolled(int r7, float r8, int r9) {
                    /*
                        r6 = this;
                        java.lang.ref.WeakReference<X.0y8i> r0 = r6.LL
                        java.lang.Object r5 = r0.get()
                        X.0y8i r5 = (X.C1846060y8i) r5
                        if (r5 == 0) goto L1e
                        int r4 = r6.LLILLL
                        r3 = 0
                        r2 = 2
                        r1 = 1
                        if (r4 != r2) goto L1f
                        int r0 = r6.LLILLJJLI
                        if (r0 == r1) goto L1f
                        r1 = 0
                    L16:
                        int r0 = r6.LLILLJJLI
                        if (r0 == 0) goto L1b
                    L1a:
                        r3 = 1
                    L1b:
                        r5.LJIJ(r7, r8, r1, r3)
                    L1e:
                        return
                    L1f:
                        r1 = 1
                        if (r4 != r2) goto L1a
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1166210gSB.onPageScrolled(int, float, int):void");
                }
            });
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IAddYoursHubProtocol.class, C1697810uHb.LJIILJJIL(new EnterAddYoursTopicListProvider(interfaceC665370Q7zLJIIL)));
        AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) this.LLJJIJIIJIL.getValue();
        if (addYoursHubAbility != null) {
            c0od0D30 = addYoursHubAbility.D30();
        } else {
            c0od0D30 = null;
        }
        if (c0od0D30 != null) {
            str = c0od0D30.LIZJ;
            str2 = c0od0D30.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, new C0OB6(str, null, str2, 10), C0OB6.class, "source_default_key");
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OEG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0OEF) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 194), 4);
    }
}
