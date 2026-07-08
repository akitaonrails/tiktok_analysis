package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C01GW;
import X.C0DXB;
import X.C0DXR;
import X.C0H8A;
import X.C0HHT;
import X.C0Q4Y;
import X.C0QSJ;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C1ELP;
import X.C20634715on;
import X.C20637215pC;
import X.C21674119s3;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452501pT;
import X.C581630MrZ;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.SearchDetailKeyframeBottomVM;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemAbility;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemVScope;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AFwS353S0000000_31;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchDetailKeyFrameBottomAssemAssem extends BaseCellSlotComponent<SearchDetailKeyFrameBottomAssemAssem> implements SearchDetailKeyFrameBottomAssemAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLLIL;
    public final SearchDetailKeyFrameBottomAssemAssem LLJLLL = this;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 296));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS276S0000000_31.get$arr$(167));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS575S0100000_31(this, 998));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS575S0100000_31(this, 997));
    public final InterfaceC1731706qJ LLLFF;
    public final C0DXB LLLFFI;
    public final C0DXB LLLFZ;
    public C20634715on LLLI;
    public String LLLII;
    public SearchDetailKeyFrameBottomAssemAbility LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchDetailKeyFrameBottomAssemAssem.class, "keyframeVM", "getKeyframeVM()Lcom/ss/android/ugc/aweme/search/detail/keyframe/viewmodel/SearchDetailKeyframeBottomVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0DXB] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0DXB] */
    public SearchDetailKeyFrameBottomAssemAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchDetailKeyframeBottomVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 297), null, AFwS276S0000000_31.get$arr$(166));
        final boolean z = false;
        this.LLLFFI = new C0DXR(z) { // from class: X.0DXB
            public final boolean LL;
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));
            public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));

            {
                this.LL = z;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                Pair pair;
                Object first;
                Object second;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLIZIZ = c21673919s1.LIZIZ();
                int measuredWidth = recyclerView.getMeasuredWidth();
                int measuredWidth2 = view.getMeasuredWidth();
                if (measuredWidth2 <= 0) {
                    if (this.LL) {
                        measuredWidth2 = this.LLILZ;
                    } else {
                        measuredWidth2 = this.LLILLL;
                    }
                }
                if (childAdapterPosition == 0) {
                    pair = new Pair(0, Integer.valueOf(this.LLILLJJLI));
                } else if (childAdapterPosition == iLIZIZ - 1) {
                    pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf((measuredWidth - measuredWidth2) - this.LLILLJJLI));
                } else {
                    pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLJJLI));
                }
                if (C426750GoL.LJFF()) {
                    first = pair.getSecond();
                } else {
                    first = pair.getFirst();
                }
                rect.left = ((Number) first).intValue();
                if (C426750GoL.LJFF()) {
                    second = pair.getFirst();
                } else {
                    second = pair.getSecond();
                }
                rect.right = ((Number) second).intValue();
            }
        };
        final boolean z2 = true;
        this.LLLFZ = new C0DXR(z2) { // from class: X.0DXB
            public final boolean LL;
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));
            public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));

            {
                this.LL = z2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                Pair pair;
                Object first;
                Object second;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLIZIZ = c21673919s1.LIZIZ();
                int measuredWidth = recyclerView.getMeasuredWidth();
                int measuredWidth2 = view.getMeasuredWidth();
                if (measuredWidth2 <= 0) {
                    if (this.LL) {
                        measuredWidth2 = this.LLILZ;
                    } else {
                        measuredWidth2 = this.LLILLL;
                    }
                }
                if (childAdapterPosition == 0) {
                    pair = new Pair(0, Integer.valueOf(this.LLILLJJLI));
                } else if (childAdapterPosition == iLIZIZ - 1) {
                    pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf((measuredWidth - measuredWidth2) - this.LLILLJJLI));
                } else {
                    pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLJJLI));
                }
                if (C426750GoL.LJFF()) {
                    first = pair.getSecond();
                } else {
                    first = pair.getFirst();
                }
                rect.left = ((Number) first).intValue();
                if (C426750GoL.LJFF()) {
                    second = pair.getFirst();
                } else {
                    second = pair.getSecond();
                }
                rect.right = ((Number) second).intValue();
            }
        };
        this.LLLII = "";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ew3;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == SearchDetailKeyFrameBottomAssemAbility.class) {
            this.LLLIIII = (SearchDetailKeyFrameBottomAssemAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchDetailKeyFrameBottomTriggerVScope.class, VideoCellScope.class, SearchDetailKeyFrameBottomAssemVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == SearchDetailKeyFrameBottomAssemAbility.class) {
            return this.LLLIIII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailKeyFrameBottomTriggerVScope.class);
        arrayList.add(VideoCellScope.class);
        arrayList.add(SearchDetailKeyFrameBottomAssemVScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailKeyFrameBottomAssemVScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SearchDetailKeyFrameBottomAssemVScope.class, this, SearchDetailKeyFrameBottomAssemAbility.class, null, null);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == SearchDetailKeyFrameBottomAssemAbility.class) {
            this.LLLIIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final SearchDetailKeyframeBottomVM Bp() {
        return (SearchDetailKeyframeBottomVM) this.LLLFF.getValue(this, LLLIIIIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C2211631BhB.LJ(view, new AwS589S0100000_10(this, 147));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailKeyFrameBottomAssemVScope.class}).unbindAbility(this.LLJLLL, SearchDetailKeyFrameBottomAssemAbility.class);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.15on] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.u9q);
        this.LLJLLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContentView().getContext());
            linearLayoutManager.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(linearLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.BUFFER;
        }
        if (this.LLLI == null) {
            final Context context = getContext();
            this.LLLI = new C21674119s3(context) { // from class: X.15on
                public final int LJIILL = 0;

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIILJJIL() {
                    return C426750GoL.LJFF() ? 1 : -1;
                }

                @Override // X.AbstractC21674019s2
                public final PointF LIZ(int i) {
                    LinearLayoutManager linearLayoutManager2;
                    RecyclerView.LayoutManager layoutManager = this.LIZJ;
                    if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager2 = (LinearLayoutManager) layoutManager) == null) {
                        return null;
                    }
                    return linearLayoutManager2.computeScrollVectorForPosition(i);
                }

                @Override // X.C21674119s3, X.AbstractC21674019s2
                public final void LJI(View view2, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
                    int iLJIIIZ = LJIIIZ(LJIILJJIL(), view2) + this.LJIILL;
                    int iLJIIJ = LJIIJ(-1, view2);
                    int iLJIIL = LJIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
                    if (iLJIIL > 0) {
                        c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, this.LJIIIIZZ, iLJIIL);
                    }
                }
            };
        }
        Bp().LLILLJJLI = (IPlayerComponentAbility) this.LLL.getValue();
        SearchDetailKeyframeBottomVM searchDetailKeyframeBottomVMBp = Bp();
        C20637215pC c20637215pC = new C2217381BqS() { // from class: X.15pC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155640gB8) obj).LLILLL;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS319S0000000_31.get$arr$(26);
        C736680Sv4.LJIIIIZZ(this, searchDetailKeyframeBottomVMBp, c20637215pC, c1770850wBP, AFwS319S0000000_31.get$arr$(27), 4);
        C736680Sv4.LJIIIZ(this, Bp(), new C2217381BqS() { // from class: X.15p7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1155640gB8) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.15pD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1155640gB8) obj).LLILLJJLI);
            }
        }, null, AFwS353S0000000_31.get$arr$(0), 12);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.15pB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJ;
            }
        }, null, AFwS319S0000000_31.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0c3n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, null, AFwS319S0000000_31.get$arr$(25), 6);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailKeyFrameBottomAssemVScope.class}).bindAbility(this.LLJLLL, SearchDetailKeyFrameBottomAssemAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r7 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            java.lang.String r0 = X.C436190H8n.LIZ(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = ""
        Le:
            r6.LLLII = r0
            X.01GW r0 = r6.LLJZ
            java.lang.Object r1 = r0.getValue()
            X.15p3 r1 = (X.InterfaceC20636315p3) r1
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.String r0 = r6.LLLII
            java.util.List r3 = r1.LLLLLZ(r0)
        L21:
            boolean r0 = X.C301230BrN.LIZ()
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L63
            if (r3 == 0) goto L99
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4a
            java.util.Iterator r1 = r3.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint r0 = (com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint) r0
            java.lang.String r0 = r0.title
            int r0 = r0.length()
            if (r0 != 0) goto L65
            goto L35
        L4a:
            X.15jv r2 = r6.LLJLLIL
            if (r2 == 0) goto L8d
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellLiteImageStyle> r0 = com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellLiteImageStyle.class
            r1[r5] = r0
            r2.LJIILJJIL(r1)
            int r0 = r2.getItemDecorationCount()
            if (r0 >= r4) goto L8d
            X.0DXB r0 = r6.LLLFFI
            r2.addItemDecoration(r0)
            goto L8d
        L63:
            if (r3 == 0) goto L99
        L65:
            java.lang.Object r1 = X.C13LP.LJJJLL(r3)
            com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint r1 = (com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint) r1
            if (r1 == 0) goto L99
            boolean r0 = r1.fromKeySegmentInfo
            if (r0 != r4) goto L99
            com.ss.android.ugc.aweme.search.model.UrlStruct r0 = r1.LIZ
            if (r0 == 0) goto Laf
        L75:
            X.15jv r2 = r6.LLJLLIL
            if (r2 == 0) goto L8d
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellImageStyle> r0 = com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellImageStyle.class
            r1[r5] = r0
            r2.LJIILJJIL(r1)
            int r0 = r2.getItemDecorationCount()
            if (r0 >= r4) goto L8d
            X.0DXB r0 = r6.LLLFFI
            r2.addItemDecoration(r0)
        L8d:
            com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.SearchDetailKeyframeBottomVM r1 = r6.Bp()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            r1.zQ2(r0, r3)
            return
        L99:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto Laf
            java.util.List r0 = r0.getBigThumbs()
            if (r0 == 0) goto Laf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L75
        Laf:
            X.15jv r2 = r6.LLJLLIL
            if (r2 == 0) goto L8d
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellNoImageStyle> r0 = com.ss.android.ugc.aweme.search.detail.keyframe.ui.KeyframeBottomCellNoImageStyle.class
            r1[r5] = r0
            r2.LJIILJJIL(r1)
            int r0 = r2.getItemDecorationCount()
            if (r0 >= r4) goto L8d
            X.0DXB r0 = r6.LLLFZ
            r2.addItemDecoration(r0)
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyFrameBottomAssemAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemAbility
    public final void ZB(int i, C0H8A c0h8a) {
        IPlayerComponentAbility iPlayerComponentAbility;
        Bp().yQ2(i, c0h8a);
        C581630MrZ c581630MrZ = ((C1ELP) ((AssemViewModel) this.LLJZIJLIL.getValue()).getState()).LLJ;
        if (c581630MrZ != null && c581630MrZ.LIZ == 4 && (iPlayerComponentAbility = Bp().LLILLJJLI) != null) {
            iPlayerComponentAbility.tryResumePlay();
        }
    }
}
