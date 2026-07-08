package com.ss.android.ugc.feed.platform.cell.interact.mob;

import X.C01GW;
import X.C087H;
import X.C093Y;
import X.C0H9H;
import X.C13LE;
import X.C13LP;
import X.C14LC;
import X.C1558520qew;
import X.C15O7;
import X.C1697810uHb;
import X.C199596137q;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C692910RFx;
import X.C709340Rs4;
import X.C709410RsB;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC703980RjQ;
import Y.ACallableS95S0101000_11;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS16S1200000_11;
import Y.ARunnableS80S0200000_11;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.mob.ComponentSizeParams;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractAreaSizeMobComponent extends BaseCellContentComponent<InteractAreaSizeMobComponent> implements InteractAreaSizeMobAbility, InteractAreaMobCommonAbility, InterfaceC1554640qYg {
    public static final float LLJLLL = C339190DRl.LIZ(72);
    public static final int LLJZ = C0H9H.LIZIZ(C14LC.LJIILIIL);
    public static final Set<String> LLJZIJLIL = C093Y.LJ("left_container", "left_container_v2", "bottom_container");
    public static final Set<String> LLL = C093Y.LJ("top_container");
    public static final Set<String> LLLF = C093Y.LJ("left_container_cla_caption");
    public volatile boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(575));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(266));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1278));
    public volatile boolean LLJL = true;
    public float LLJLL = C339190DRl.LIZ(40);
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1279));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJLILLLLZIIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility
    public final void X92() {
        this.LLJL = true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -109404956 || iHashCode == 1155187056) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility
    public final void B4() {
        C709340Rs4.LIZIZ(new ARunnableS111S0100000_11(this, 84));
    }

    public final void hp() {
        List listHp0;
        List listHp02;
        ArrayList arrayList = new ArrayList();
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interactAreaCommonAbility != null && (listHp02 = interactAreaCommonAbility.hp0(LLJZIJLIL, true, C093Y.LJ("left_container_cast_play_control", "left_container_social_bubble", "left_container_anole_slot", "bottom_container_download_progress_bar", "bottom_container_plugin_download_progress_bar", "bottom_container_video_progress_bar"))) != null) {
            arrayList.addAll(listHp02);
        }
        InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interactAreaCommonAbility2 != null && (listHp0 = interactAreaCommonAbility2.hp0(LLL, false, LLLF)) != null) {
            arrayList.addAll(listHp0);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ip((ComponentPriorityProtocol) it2.next());
        }
        C15O7.LIZIZ(new ACallableS95S0101000_11(this, LLJZ - C14LC.LJIILLIIL, 0), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility
    public final void ik2() {
        this.LLJLL = C339190DRl.LIZ((int) 40.0d);
    }

    public final void mp() {
        if (this.LLJLILLLLZIIL) {
            C01GW c01gw = C709340Rs4.LIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            final String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
            ((ExecutorService) C709340Rs4.LIZ.getValue()).execute(new Runnable() { // from class: X.0Rs3
                public final void LIZ() {
                    int i;
                    Object key;
                    int i2;
                    C01GW c01gw2 = C709340Rs4.LIZ;
                    boolean z = C14LC.LJIIIZ;
                    C709340Rs4.LJI = C309690CBz.LIZ.LIZJ;
                    C709340Rs4.LJII = C692910RFx.LJFF;
                    String str = aid;
                    C199596137q c199596137q = C709340Rs4.LIZIZ;
                    String json = GsonProtectorUtils.toJson(C08JS.LIZIZ(), new ArrayList(((LinkedHashMap) C709340Rs4.LIZ((ConcurrentHashMap) c199596137q.LIZ(str, new Callable() { // from class: X.05XB
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("InteractAreaMobParamManager@d5cb.getSerializeAreaStringInternal$records$1");
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            C1C7U.LIZIZ("InteractAreaMobParamManager@d5cb.getSerializeAreaStringInternal$records$1");
                            return concurrentHashMap;
                        }
                    }))).values()));
                    json.toString();
                    C709340Rs4.LIZLLL.put(str, json);
                    String str2 = aid;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C709340Rs4.LIZ((ConcurrentHashMap) c199596137q.LIZ(str2, new Callable() { // from class: X.05XA
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("InteractAreaMobParamManager@d5cb.getDescHeightInternal$records$1");
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            C1C7U.LIZIZ("InteractAreaMobParamManager@d5cb.getDescHeightInternal$records$1");
                            return concurrentHashMap;
                        }
                    }));
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    String str3 = "";
                    while (true) {
                        i = 0;
                        if (!it2.hasNext()) {
                            key = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str4 = (String) entry.getKey();
                        if (u.LJJIIJZLJL(str4, "high_tag", false) || u.LJJIIJZLJL(str4, "low_tag", false)) {
                            if (str3.length() == 0) {
                                str3 = (String) entry.getKey();
                            } else if (!u.LJJIIJZLJL(str3, "high_tag", false) || !u.LJJIIJZLJL((String) entry.getKey(), "low_tag", false)) {
                                if (u.LJJIIJZLJL(str3, "low_tag", false) && u.LJJIIJZLJL((String) entry.getKey(), "high_tag", false)) {
                                    key = entry.getKey();
                                    break;
                                }
                            } else {
                                key = entry.getKey();
                                break;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!Intrinsics.LJFF(entry2.getKey(), key)) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Collection collectionValues = linkedHashMap2.values();
                    if (collectionValues != null) {
                        Iterator it3 = new ArrayList(collectionValues).iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            i2 += ((ComponentSizeParams) it3.next()).height;
                        }
                    } else {
                        i2 = 0;
                    }
                    C709340Rs4.LJ.put(str2, Integer.valueOf(i2));
                    String str5 = aid;
                    for (Map.Entry entry3 : ((LinkedHashMap) C709340Rs4.LIZ((ConcurrentHashMap) C709340Rs4.LIZIZ.LIZ(str5, new Callable() { // from class: X.05X9
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("InteractAreaMobParamManager@d5cb.getDescAreaInternal$records$1");
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            C1C7U.LIZIZ("InteractAreaMobParamManager@d5cb.getDescAreaInternal$records$1");
                            return concurrentHashMap;
                        }
                    }))).entrySet()) {
                        i += ((ComponentSizeParams) entry3.getValue()).height * ((ComponentSizeParams) entry3.getValue()).width;
                    }
                    C709340Rs4.LJFF.put(str5, Integer.valueOf(i));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InteractAreaMobParamManager@d5cb.updateParams$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InteractAreaMobParamManager@d5cb.updateParams$1");
                }
            });
        }
    }

    public final void ep() {
        InteractAreaSizeMobAbility interactAreaSizeMobAbility = (InteractAreaSizeMobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractAreaSizeMobAbility.class, null);
        if (interactAreaSizeMobAbility != null) {
            interactAreaSizeMobAbility.X92();
        }
        this.LLJLILLLLZIIL = true;
        C709340Rs4.LIZIZ(new ARunnableS111S0100000_11(this, 83));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        this.LLJLILLLLZIIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        ep();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility
    public final void eh0(ComponentPriorityProtocol componentPriorityProtocol) {
        C709340Rs4.LIZIZ(new ARunnableS80S0200000_11(this, componentPriorityProtocol, 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ip(ComponentPriorityProtocol componentPriorityProtocol) {
        InterfaceC703980RjQ interfaceC703980RjQ;
        String strH3;
        ViewGroup viewGroup;
        KeyEvent.Callback callbackXb = componentPriorityProtocol.xb();
        if ((callbackXb instanceof InterfaceC703980RjQ) && (interfaceC703980RjQ = (InterfaceC703980RjQ) callbackXb) != 0 && (strH3 = componentPriorityProtocol.H3()) != null) {
            if (strH3.length() != 0) {
                interfaceC703980RjQ.LJ(new C709410RsB(this, strH3));
                if (strH3 == null) {
                    return;
                }
            }
            if (strH3.length() != 0 && (interfaceC703980RjQ instanceof ViewGroup) && (viewGroup = (ViewGroup) interfaceC703980RjQ) != null) {
                C709340Rs4.LIZIZ(new ARunnableS16S1200000_11(viewGroup, strH3, this, 6));
            }
        }
    }

    public final boolean kp(View view) {
        View view2;
        if (view.getVisibility() != 8 && view.getVisibility() != 4) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 == null || Intrinsics.LJFF(view2, LJJIJL())) {
                return false;
            }
            return kp(view2);
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0Rs1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(220), 6);
        C14LC.LJIJ.observe(this, new AObserverS215S0100000_11(this, 12));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C709340Rs4.LIZIZ(new ARunnableS111S0100000_11(this, 101));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        Object obj;
        String aid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onHolderSelected] position");
        sbLIZ.append(i);
        sbLIZ.append(", select aweme");
        Object obj2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" aweme");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((VideoItemParams) obj).getAweme().getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            aid2 = aweme.getAid();
        } else {
            aid2 = null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (Intrinsics.LJFF(aid2, ((VideoItemParams) obj2).getAweme().getAid())) {
            ep();
        } else {
            this.LLJLILLLLZIIL = false;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaMobCommonAbility
    public final void gW1(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                this.LLJLIL = true;
            }
        } else {
            if (z) {
                return;
            }
            this.LLJLIL = false;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility
    public final void k42(InterfaceC703980RjQ interfaceC703980RjQ, String str) {
        C709340Rs4.LIZIZ(new ARunnableS16S1200000_11(interfaceC703980RjQ, str, this, 2));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void lp(String str, ViewGroup viewGroup) {
        Object obj;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (str == null || str.length() == 0 || !this.LLJJIJI || C1697810uHb.LJIIJJI(8, 4).contains(Integer.valueOf(LJJIJL().getVisibility()))) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Integer numValueOf = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        CharSequence aid = ((VideoItemParams) obj).getAweme().getAid();
        if (aid == null) {
            return;
        }
        C199596137q c199596137q = C709340Rs4.LIZIZ;
        Object objLIZ = c199596137q.LIZ(aid, C087H.LL);
        c199596137q.LL.put((K) aid, (V) objLIZ);
        Map map = (Map) objLIZ;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        int i2 = i + height;
        int iIntValue = ((Number) this.LLJJL.getValue()).intValue();
        if (TextUtils.equals(str, "left_container_cla_caption")) {
            width -= (int) LLJLLL;
            if (width == iIntValue) {
                width = 0;
                i2 = 0;
            }
        } else if (width == 0) {
            width = 0;
        } else if (TextUtils.equals(str, "left_container_see_translation")) {
            width = (iIntValue + width) - ((int) this.LLJLL);
        } else if (str != null && (u.LJJIIJZLJL(str, "high_tag", false) || u.LJJIIJZLJL(str, "low_tag", false))) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (u.LJJIIJZLJL(str2, "high_tag", false) || u.LJJIIJZLJL(str2, "low_tag", false)) {
                    if (u.LJJIIJZLJL(str, "high_tag", false) && u.LJJIIJZLJL((String) entry.getKey(), "low_tag", false)) {
                        break;
                    }
                }
            }
            width = Math.min(iIntValue + width, C692910RFx.LJFF);
        } else {
            width = Math.min(iIntValue + width, C692910RFx.LJFF);
        }
        if (TextUtils.equals(str, "left_container_description") && this.LLJLIL) {
            return;
        }
        if (TextUtils.equals(str, "left_container_cla_caption") && !this.LLJL) {
            return;
        }
        if (!kp(viewGroup) && i2 != 0) {
            map.put(str, new ComponentSizeParams(str, width, i2));
        } else {
            List listLJIIJJI = C1697810uHb.LJIIJJI(1, 2);
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLJLLIL.getValue();
            if (iViewPagerAbility != null) {
                numValueOf = Integer.valueOf(iViewPagerAbility.LLLIIIL());
            }
            if (C13LP.LJJJJ(numValueOf, listLJIIJJI) && this.LLJLILLLLZIIL) {
                return;
            } else {
                map.remove(str);
            }
        }
        mp();
    }
}
