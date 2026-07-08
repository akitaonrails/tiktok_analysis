package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC21673719rz;
import X.C019F;
import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C0AIG;
import X.C0CAU;
import X.C0N14;
import X.C0O2L;
import X.C0SDJ;
import X.C0W17;
import X.C13LE;
import X.C1483410ohn;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1582240rHC;
import X.C1637806bA;
import X.C19719912Dl;
import X.C21697019vk;
import X.C21697219vm;
import X.C21697519vp;
import X.C21697619vq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C278530Avr;
import X.C296380BjY;
import X.C452501pT;
import X.C584200Mvi;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC21696919vj;
import X.InterfaceC1554640qYg;
import X.InterfaceC1582250rHD;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC21676919sV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewOnLayoutChangeListenerC2189561Amg;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS133S0100000_33;
import Y.AsS58S0100000_33;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3PlayerConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.text.FriendsV3TextCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3PageStateComponent;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class FriendsV3PageStateComponent extends BasePanelUIComponent implements IFriendsV3PageStateAbility, InterfaceC1554640qYg {
    public static final C21697519vp LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public InterfaceC1588310rQz LLJJI;
    public Map<FriendsV3ViewStateProtocol, Map<View, Boolean>> LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final ViewOnLayoutChangeListenerC2189561Amg LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public InterfaceC1588310rQz LLJJJJLIIL;
    public Long LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public final AsS58S0100000_33 LLJLILLLLZIIL;
    public final C21697619vq LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3PageStateComponent.class, "friendsV3PageViewModel", "getFriendsV3PageViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = new C21697519vp();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.19vq] */
    public FriendsV3PageStateComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 220), AFwS279S0000000_33.get$arr$(154), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2279));
        this.LLJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 221));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2278));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2277));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2276));
        this.LLJJJ = new ViewOnLayoutChangeListenerC2189561Amg(this, 3);
        this.LLJJL = 0L;
        this.LLJLILLLLZIIL = new AsS58S0100000_33(this, 5);
        this.LLJLL = new InterfaceC1582250rHD() { // from class: X.19vq
            @Override // X.InterfaceC1582250rHD
            public final void LIZ() {
                this.LIZ.So(EnumC21696919vj.VERTICAL_SCROLL);
            }

            @Override // X.InterfaceC1582250rHD
            public final void LIZIZ() {
                this.LIZ.So(EnumC21696919vj.VERTICAL_IDLE);
                this.LIZ.getClass();
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1592459404) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageStateAbility
    public final void s6() {
        this.LLJILJIL = false;
        this.LLJLIL = null;
    }

    public final Long Jo() {
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLJJIJIL.getValue();
        if (friendsV3FeedListAbility != null) {
            return Long.valueOf(friendsV3FeedListAbility.Ha1());
        }
        return null;
    }

    public final C1582240rHC Lo() {
        return (C1582240rHC) this.LLJILLL.getValue();
    }

    public FrameLayout Oo() {
        return (FrameLayout) this.LLJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageStateAbility
    public final FriendsV3PageStateComponent$getQuickChatRoomObserver$1 iV0() {
        return new FriendsV3PageStateComponent$getQuickChatRoomObserver$1(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1582240rHC c1582240rHCLo = Lo();
        if (c1582240rHCLo != null) {
            c1582240rHCLo.removeOnLayoutChangeListener(this.LLJJJ);
        }
        C1582240rHC c1582240rHCLo2 = Lo();
        if (c1582240rHCLo2 != null) {
            c1582240rHCLo2.removeOnScrollListener(this.LLJLILLLLZIIL);
        }
        C1582240rHC c1582240rHCLo3 = Lo();
        if (c1582240rHCLo3 != null) {
            c1582240rHCLo3.setOnFakeScrollListener(null);
        }
        Map<FriendsV3ViewStateProtocol, Map<View, Boolean>> map = this.LLJJIII;
        if (map != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((Map) it2.next()).clear();
            }
            linkedHashMap.clear();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        EnumC21696919vj enumC21696919vj;
        FriendsV3PlayerAbility friendsV3PlayerAbility;
        C1483410ohn c1483410ohnXc;
        super.onPause();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, nodeShow = ");
        sbLIZ.append(this.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJIJIL) {
            this.LLJJJJ = false;
            AssemVMLazy assemVMLazy = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
            Pair<Boolean, C0N14> pair = ((C0O2L) assemVMLazy.getValue().getState()).LLILLL;
            if (pair == null || !pair.getFirst().booleanValue()) {
                enumC21696919vj = EnumC21696919vj.LIFECYCLE_CHANGE;
            } else {
                this.LLJJJIL = true;
                enumC21696919vj = EnumC21696919vj.NAVIGATE_TO_DETAIL;
            }
            if (C296380BjY.LIZ() && enumC21696919vj == EnumC21696919vj.LIFECYCLE_CHANGE && (friendsV3PlayerAbility = (FriendsV3PlayerAbility) this.LLJJIJI.getValue()) != null && (c1483410ohnXc = friendsV3PlayerAbility.xc()) != null) {
                c1483410ohnXc.LJJLI(false);
            }
            So(enumC21696919vj);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, nodeShow = ");
        sbLIZ.append(this.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJIJIL) {
            this.LLJJJIL = false;
            this.LLJJJJ = false;
            So(EnumC21696919vj.LIFECYCLE_CHANGE);
        }
    }

    public final List<C21697019vk> Go(FrameLayout frameLayout) {
        Object childViewHolder;
        InterfaceC1588310rQz interfaceC1588310rQz;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        List listLIZIZ;
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL;
        FrameLayout playViewContainer;
        C1582240rHC c1582240rHCLo;
        if (!((Boolean) C0AIG.LIZ.getValue()).booleanValue() || ((c1582240rHCLo = Lo()) != null && c1582240rHCLo.getVisibility() == 0)) {
            ArrayList arrayList = new ArrayList();
            C1582240rHC c1582240rHCLo2 = Lo();
            if (c1582240rHCLo2 != null) {
                Iterator<View> it2 = new C09RD(c1582240rHCLo2).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    View view = (View) c09re.next();
                    C1582240rHC c1582240rHCLo3 = Lo();
                    Rect rectNo = null;
                    if (c1582240rHCLo3 != null) {
                        childViewHolder = c1582240rHCLo3.getChildViewHolder(view);
                    } else {
                        childViewHolder = null;
                    }
                    if (childViewHolder instanceof InterfaceC1588310rQz) {
                        interfaceC1588310rQz = (InterfaceC1588310rQz) childViewHolder;
                        if (interfaceC1588310rQz != null && (interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz.LLIZLLLIL()) != null && (playViewContainer = interfaceC1582750rI1LLIZLLLIL.getPlayViewContainer()) != null) {
                            rectNo = No(playViewContainer, frameLayout);
                        }
                    } else {
                        interfaceC1588310rQz = null;
                    }
                    Rect rectNo2 = No(view, frameLayout);
                    int measuredWidth = frameLayout.getMeasuredWidth();
                    int measuredHeight = frameLayout.getMeasuredHeight();
                    int i = (int) (measuredHeight * ((FriendsV3PlayerConfig) C584200Mvi.LIZIZ.getValue()).hotZoneRatio);
                    int i2 = (measuredHeight - i) / 2;
                    Rect rect = new Rect(0, i2, measuredWidth, i + i2);
                    Rect rect2 = new Rect(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if ((interfaceC1588310rQz instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) interfaceC1588310rQz) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7zLIZIZ, FriendsV3ViewStateProtocol.class, false)) != null) {
                        for (FriendsV3ViewStateProtocol friendsV3ViewStateProtocol : (ArrayList) listLIZIZ) {
                            for (View view2 : friendsV3ViewStateProtocol.AG0()) {
                                if (!linkedHashMap.containsKey(friendsV3ViewStateProtocol)) {
                                    linkedHashMap.put(friendsV3ViewStateProtocol, new LinkedHashMap());
                                }
                                Map map = (Map) linkedHashMap.get(friendsV3ViewStateProtocol);
                                if (map != null) {
                                    map.put(view2, No(view2, frameLayout));
                                }
                            }
                        }
                    }
                    arrayList.add(new C21697019vk(interfaceC1588310rQz, rect, rectNo2, rectNo, rect2, linkedHashMap));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final void So(final EnumC21696919vj enumC21696919vj) {
        AbstractC21673719rz itemAnimator;
        C1582240rHC c1582240rHCLo;
        RecyclerView.ViewHolder childViewHolder;
        FriendsV3BaseAwemeCell friendsV3BaseAwemeCell;
        C1582240rHC c1582240rHCLo2;
        final FriendsV3BaseAwemeCell friendsV3BaseAwemeCell2;
        String aid;
        boolean z = true;
        if (((Number) C278530Avr.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z && (c1582240rHCLo2 = Lo()) != null && Intrinsics.LJFF(c1582240rHCLo2.getTag(R.id.imr), Boolean.TRUE)) {
            Zo("handleExposedItemDetach", enumC21696919vj);
            C1582240rHC c1582240rHCLo3 = Lo();
            if (c1582240rHCLo3 != null) {
                c1582240rHCLo3.setTag(R.id.imr, Boolean.FALSE);
            }
            FrameLayout frameLayoutOo = Oo();
            if (frameLayoutOo != null) {
                for (C21697219vm c21697219vm : (ArrayList) Ho(enumC21696919vj, Go(frameLayoutOo))) {
                    if (Intrinsics.LJFF(c21697219vm.LIZIZ.LLILLJJLI, Boolean.TRUE)) {
                        InterfaceC1588310rQz interfaceC1588310rQz = c21697219vm.LIZ;
                        if ((interfaceC1588310rQz instanceof FriendsV3BaseAwemeCell) && (friendsV3BaseAwemeCell2 = (FriendsV3BaseAwemeCell) interfaceC1588310rQz) != null) {
                            final View view = friendsV3BaseAwemeCell2.itemView;
                            if (!view.isAttachedToWindow()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("handleExposedItemDetach, item=");
                                Aweme aweme = friendsV3BaseAwemeCell2.getAweme();
                                if (aweme != null) {
                                    aid = aweme.getAid();
                                } else {
                                    aid = null;
                                }
                                sbLIZ.append(aid);
                                Zo(C2188811AlT.LIZIZ(sbLIZ), enumC21696919vj);
                                Boolean bool = Boolean.FALSE;
                                friendsV3BaseAwemeCell2.LLJJ(new C0SDJ(bool, bool, bool, EnumC21696919vj.VERTICAL_IDLE));
                            } else {
                                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.19vi
                                    @Override // android.view.View.OnAttachStateChangeListener
                                    public final void onViewAttachedToWindow(View view2) {
                                    }

                                    @Override // android.view.View.OnAttachStateChangeListener
                                    public final void onViewDetachedFromWindow(View view2) {
                                        String aid2;
                                        view.removeOnAttachStateChangeListener(this);
                                        FriendsV3PageStateComponent friendsV3PageStateComponent = this;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("handleExposedItemDetach, item=");
                                        Aweme aweme2 = friendsV3BaseAwemeCell2.getAweme();
                                        if (aweme2 != null) {
                                            aid2 = aweme2.getAid();
                                        } else {
                                            aid2 = null;
                                        }
                                        sbLIZ2.append(aid2);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        EnumC21696919vj enumC21696919vj2 = enumC21696919vj;
                                        friendsV3PageStateComponent.getClass();
                                        FriendsV3PageStateComponent.Zo(strLIZIZ, enumC21696919vj2);
                                        FriendsV3BaseAwemeCell friendsV3BaseAwemeCell3 = friendsV3BaseAwemeCell2;
                                        Boolean bool2 = Boolean.FALSE;
                                        friendsV3BaseAwemeCell3.LLJJ(new C0SDJ(bool2, bool2, bool2, EnumC21696919vj.VERTICAL_IDLE));
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJJL, Jo()) && (c1582240rHCLo = Lo()) != null) {
            Iterator<View> it2 = new C09RD(c1582240rHCLo).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view2 = (View) c09re.next();
                C1582240rHC c1582240rHCLo4 = Lo();
                if (c1582240rHCLo4 != null) {
                    childViewHolder = c1582240rHCLo4.getChildViewHolder(view2);
                } else {
                    childViewHolder = null;
                }
                if ((childViewHolder instanceof FriendsV3TextCell) && (friendsV3BaseAwemeCell = (FriendsV3BaseAwemeCell) childViewHolder) != null) {
                    Boolean bool2 = Boolean.FALSE;
                    friendsV3BaseAwemeCell.LLJJ(new C0SDJ(bool2, bool2, bool2, EnumC21696919vj.SESSION_CHANGE));
                }
            }
        }
        final AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(this, enumC21696919vj, 84);
        C1582240rHC c1582240rHCLo5 = Lo();
        if (c1582240rHCLo5 != null && (itemAnimator = c1582240rHCLo5.getItemAnimator()) != null) {
            itemAnimator.LJIJ(new InterfaceC21676919sV() { // from class: X.19vo
                @Override // X.InterfaceC21676919sV
                public final void LIZ() {
                    C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS106S0100000_6((Function0) awS434S0200000_33, 64));
                }
            });
        } else {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS133S0100000_33(awS434S0200000_33, 58));
        }
    }

    public final boolean Vo(InterfaceC1588310rQz interfaceC1588310rQz) {
        String aid;
        Aweme aweme;
        Aweme aweme2;
        if (Intrinsics.LJFF(interfaceC1588310rQz, this.LLJJI)) {
            String aid2 = null;
            if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            InterfaceC1588310rQz interfaceC1588310rQz2 = this.LLJJI;
            if (interfaceC1588310rQz2 != null && (aweme = interfaceC1588310rQz2.getAweme()) != null) {
                aid2 = aweme.getAid();
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageStateAbility
    public final void fF1(InterfaceC1588310rQz interfaceC1588310rQz) {
        this.LLJJJJLIIL = interfaceC1588310rQz;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1582240rHC c1582240rHCLo = Lo();
        if (c1582240rHCLo != null) {
            c1582240rHCLo.addOnLayoutChangeListener(this.LLJJJ);
        }
        C1582240rHC c1582240rHCLo2 = Lo();
        if (c1582240rHCLo2 != null) {
            c1582240rHCLo2.addOnScrollListener(this.LLJLILLLLZIIL);
        }
        C1582240rHC c1582240rHCLo3 = Lo();
        if (c1582240rHCLo3 != null) {
            c1582240rHCLo3.setOnFakeScrollListener(this.LLJLL);
        }
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0rH1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LL;
            }
        }, null, new AwS647S0100000_33(this, 11), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0rH2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 12), 4);
    }

    public static Rect No(View view, View view2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        return new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void Zo(String str, EnumC21696919vj enumC21696919vj) {
        if (enumC21696919vj == EnumC21696919vj.VERTICAL_SCROLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", reason = ");
            sbLIZ.append(enumC21696919vj);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(", reason = ");
        sbLIZ2.append(enumC21696919vj);
        C0W17.LIZJ("pageState", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Ho(X.EnumC21696919vj r24, java.util.List r25) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3PageStateComponent.Ho(X.19vj, java.util.List):java.util.List");
    }

    public static int ap(FriendsV3PageStateComponent friendsV3PageStateComponent, Rect rect, Rect rect2) {
        float f = ((FriendsV3PlayerConfig) C584200Mvi.LIZIZ.getValue()).hotZoneCenterRatio;
        friendsV3PageStateComponent.getClass();
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + ((int) (rect2.height() * f))));
    }
}
