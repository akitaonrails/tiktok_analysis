package com.ss.android.ugc.aweme.nimblecard.tako.component.video;

import X.C01GW;
import X.C01U2;
import X.C0HHT;
import X.C0PEM;
import X.C0Q4Y;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1860930yWh;
import X.C1860940yWi;
import X.C1920407fe;
import X.C1920507ff;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C689500R2u;
import X.C724750Sbp;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C789500Uy4;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1860950yWj;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1620720sHG;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS178S0400000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class NimbleVideoListAssem extends ReusedUISlotAssem<NimbleVideoListAssem> implements InterfaceC712990Rxx<Object> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 613));
    public final InterfaceC1731706qJ LLJL;
    public C789500Uy4 LLJLIL;
    public C1860940yWi LLJLILLLLZIIL;
    public Integer LLJLL;
    public Integer LLJLLIL;
    public Integer LLJLLL;
    public List<String> LLJZ;
    public Boolean LLJZIJLIL;
    public String LLL;
    public InterfaceC1860950yWj LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NimbleVideoListAssem.class, "nimbleVM", "getNimbleVM()Lcom/ss/android/ugc/aweme/nimblecard/tako/vm/NimbleVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NimbleVideoListAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NimbleVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 789), null, AFwS269S0000000_27.get$arr$(133));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dt4;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final INimbleVideoListDependAbility sp() {
        return (INimbleVideoListDependAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        String aid;
        InterfaceC1860950yWj interfaceC1860950yWj;
        List<TakoVideoItem> videoList;
        RecyclerView.LayoutManager layoutManager;
        if (66 == c737030Svd.LIZ) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (aid = aweme.getAid()) != null && (interfaceC1860950yWj = this.LLLF) != null && (videoList = interfaceC1860950yWj.getVideoList()) != null) {
                Iterator<TakoVideoItem> it2 = videoList.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().awemeId, aid)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf.intValue() > 0) {
                    int iIntValue = numValueOf.intValue();
                    C789500Uy4 c789500Uy4 = this.LLJLIL;
                    if (c789500Uy4 != null && (layoutManager = c789500Uy4.getLayoutManager()) != null) {
                        layoutManager.scrollToPosition(iIntValue);
                    }
                    INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp = sp();
                    if (iNimbleVideoListDependAbilitySp != null) {
                        iNimbleVideoListDependAbilitySp.ma1();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RecyclerView.RecycledViewPool recycledViewPoolNr;
        C789500Uy4 c789500Uy4 = (C789500Uy4) view.findViewById(R.id.video_list);
        this.LLJLIL = c789500Uy4;
        if (c789500Uy4 != null) {
            int i = 0;
            c789500Uy4.setLayoutManager(new LinearLayoutManager(c789500Uy4.getContext(), 0, false));
            c789500Uy4.setAnimation(null);
            c789500Uy4.setItemAnimator(null);
            c789500Uy4.setEnableIntercept(true);
            C20600815jK<InterfaceC1891350zJl> state = c789500Uy4.getState();
            if (state != null) {
                state.LIZLLL = C0Q4Y.BUFFER;
            }
            c789500Uy4.LJIILJJIL(NimbleVideoItemCell.class);
            c789500Uy4.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            c789500Uy4.setOverScrollMode(2);
            c789500Uy4.setClipToPadding(false);
            INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp = sp();
            if (iNimbleVideoListDependAbilitySp != null && (recycledViewPoolNr = iNimbleVideoListDependAbilitySp.Nr()) != null) {
                c789500Uy4.setRecycledViewPool(recycledViewPoolNr);
            }
            C1920507ff c1920507ff = C1920507ff.LJ;
            C1920407fe c1920407fe = c1920507ff.LIZ;
            int i2 = c1920407fe.LIZ;
            int i3 = c1920407fe.LIZIZ;
            int i4 = c1920407fe.LIZJ;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 >= 0) {
                i = i4;
            }
            C1860940yWi c1860940yWi = new C1860940yWi(i2, i, i3, this);
            this.LLJLILLLLZIIL = c1860940yWi;
            c789500Uy4.addItemDecoration(c1860940yWi);
            this.LLJLL = Integer.valueOf(c1920507ff.LIZ.LIZ);
            this.LLJLLIL = Integer.valueOf(c1920507ff.LIZ.LIZIZ);
            this.LLJLLL = Integer.valueOf(c1920507ff.LIZ.LIZJ);
            c789500Uy4.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1620720sHG(this, 3));
        }
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp2 = sp();
        if (iNimbleVideoListDependAbilitySp2 != null) {
            iNimbleVideoListDependAbilitySp2.CT0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Runnable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void op(InterfaceC1860950yWj interfaceC1860950yWj) {
        ?? arrayList;
        boolean z;
        int i;
        C789500Uy4 c789500Uy4;
        int i2;
        int i3;
        int i4;
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state;
        boolean zYr1;
        String strZA0;
        Integer num;
        Integer num2;
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp;
        this.LLLF = interfaceC1860950yWj;
        interfaceC1860950yWj.LJJ().invoke(LJJIJL(), C1558520qew.LJIIL(this));
        List<TakoVideoItem> videoList = interfaceC1860950yWj.getVideoList();
        ?? r8 = 0;
        if (videoList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(videoList, 10));
            Iterator<TakoVideoItem> it2 = videoList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().awemeId);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!arrayList.isEmpty() && (iNimbleVideoListDependAbilitySp = sp()) != null && iNimbleVideoListDependAbilitySp.isVisible()) {
            z = false;
        } else {
            z = true;
        }
        View viewLJJIJL = LJJIJL();
        boolean z2 = !z;
        int i5 = 8;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        C789500Uy4 c789500Uy42 = this.LLJLIL;
        if (c789500Uy42 != null) {
            if (z2) {
                i5 = 0;
            }
            C786410Ut5.LJLLLLLL(i5, c789500Uy42);
        }
        if (z) {
            return;
        }
        C1920507ff uiConfig = interfaceC1860950yWj.getUiConfig();
        if (uiConfig == null) {
            uiConfig = C1920507ff.LJ;
        }
        C1920407fe c1920407fe = uiConfig.LIZ;
        int i6 = c1920407fe.LIZ;
        int i7 = c1920407fe.LIZIZ;
        int i8 = c1920407fe.LIZJ;
        Integer num3 = this.LLJLL;
        if ((num3 == null || num3.intValue() != i6 || (num = this.LLJLLIL) == null || num.intValue() != i7 || (num2 = this.LLJLLL) == null || num2.intValue() != i8) && (c789500Uy4 = this.LLJLIL) != null) {
            C1860940yWi c1860940yWi = this.LLJLILLLLZIIL;
            if (c1860940yWi != null) {
                c789500Uy4.removeItemDecoration(c1860940yWi);
            }
            if (i6 < 0) {
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (i7 < 0) {
                i3 = 0;
            } else {
                i3 = i7;
            }
            if (i8 < 0) {
                i4 = 0;
            } else {
                i4 = i8;
            }
            C1860940yWi c1860940yWi2 = new C1860940yWi(i2, i4, i3, this);
            c789500Uy4.addItemDecoration(c1860940yWi2);
            this.LLJLILLLLZIIL = c1860940yWi2;
            this.LLJLL = Integer.valueOf(i6);
            this.LLJLLIL = Integer.valueOf(i7);
            this.LLJLLL = Integer.valueOf(i8);
        }
        boolean zLJIILIIL = interfaceC1860950yWj.LJIILIIL();
        String strLJIIIIZZ = interfaceC1860950yWj.LJIIIIZZ();
        if (Intrinsics.LJFF(arrayList, this.LLJZ) && Intrinsics.LJFF(Boolean.valueOf(zLJIILIIL), this.LLJZIJLIL) && Intrinsics.LJFF(strLJIIIIZZ, this.LLL)) {
            return;
        }
        this.LLJZ = arrayList;
        this.LLJZIJLIL = Boolean.valueOf(zLJIILIIL);
        this.LLL = strLJIIIIZZ;
        NimbleVM nimbleVM = (NimbleVM) this.LLJL.getValue(this, LLLFF[0]);
        String string = arrayList.toString();
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(interfaceC1860950yWj, this, 41);
        nimbleVM.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01U2(nimbleVM, string, awS393S0200000_27, null, null), 3);
        List<TakoVideoItem> videoList2 = interfaceC1860950yWj.getVideoList();
        if (videoList2 == null) {
            videoList2 = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(videoList2, 10));
        int i9 = 0;
        for (TakoVideoItem takoVideoItem : videoList2) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                arrayList2.add(new Pair(takoVideoItem.awemeId, Long.valueOf(i9)));
                i9 = i10;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((CharSequence) ((Pair) obj).getFirst()).length() > 0) {
                arrayList3.add(obj);
            }
        }
        List<TakoVideoItem> videoList3 = interfaceC1860950yWj.getVideoList();
        if (videoList3 != null) {
            numValueOf = Integer.valueOf(videoList3.size());
        } else {
            numValueOf = null;
        }
        C789500Uy4 c789500Uy43 = this.LLJLIL;
        if (c789500Uy43 != null && (state = c789500Uy43.getState()) != null) {
            List<TakoVideoItem> videoList4 = interfaceC1860950yWj.getVideoList();
            if (videoList4 == null) {
                videoList4 = C13BV.INSTANCE;
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(videoList4, 10));
            int i11 = 0;
            for (TakoVideoItem takoVideoItem2 : videoList4) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    TakoVideoItem takoVideoItem3 = takoVideoItem2;
                    String str = takoVideoItem3.awemeId;
                    long j = takoVideoItem3.diggCount;
                    List<String> list = takoVideoItem3.cover.urlList;
                    INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp2 = sp();
                    if (iNimbleVideoListDependAbilitySp2 != null) {
                        zYr1 = iNimbleVideoListDependAbilitySp2.Yr1(takoVideoItem3, numValueOf);
                    } else {
                        zYr1 = false;
                    }
                    INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp3 = sp();
                    if (iNimbleVideoListDependAbilitySp3 != null) {
                        strZA0 = iNimbleVideoListDependAbilitySp3.ZA0(takoVideoItem3);
                    } else {
                        strZA0 = null;
                    }
                    arrayList4.add(new C1860930yWh(i11, str, j, list, zLJIILIIL, strLJIIIIZZ, new AwS178S0400000_27(this, (NimbleVideoListAssem) takoVideoItem3, (TakoVideoItem) arrayList3, (List<Pair<String, Long>>) interfaceC1860950yWj, (InterfaceC1860950yWj) 0), numValueOf, zYr1, strZA0, takoVideoItem3.awemeType, takoVideoItem3, interfaceC1860950yWj.getUiConfig()));
                    i11 = i12;
                    r8 = 0;
                } else {
                    C1697810uHb.LJIJI();
                    throw r8;
                }
            }
            state.LJIILL(arrayList4, r8);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C689500R2u c689500R2uXo2;
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp = sp();
        if (iNimbleVideoListDependAbilitySp != null) {
            iNimbleVideoListDependAbilitySp.JS1(LJJIJL());
        }
        if (obj instanceof InterfaceC1860950yWj) {
            op((InterfaceC1860950yWj) obj);
            return;
        }
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp2 = sp();
        if (iNimbleVideoListDependAbilitySp2 != null && (c689500R2uXo2 = iNimbleVideoListDependAbilitySp2.Xo2(obj)) != null) {
            op(c689500R2uXo2);
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        C789500Uy4 c789500Uy4 = this.LLJLIL;
        if (c789500Uy4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, c789500Uy4);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
