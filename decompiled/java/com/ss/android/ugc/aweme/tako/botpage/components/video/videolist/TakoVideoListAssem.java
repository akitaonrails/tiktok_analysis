package com.ss.android.ugc.aweme.tako.botpage.components.video.videolist;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C05PU;
import X.C07QH;
import X.C0B1N;
import X.C0DXR;
import X.C0PHT;
import X.C0Q4Y;
import X.C0R2Z;
import X.C0R45;
import X.C13BV;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1819107An;
import X.C1847380yAq;
import X.C1857280yQo;
import X.C1857750yRZ;
import X.C1858670yT3;
import X.C1863920ybW;
import X.C1909880zne;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C299000Bnm;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452070Ho5;
import X.C452501pT;
import X.C689600R3e;
import X.C689730R3r;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689490R2t;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoVideoListAssem extends ReusedUISlotAssem<TakoVideoListAssem> implements InterfaceC712990Rxx<InterfaceC689490R2t>, ITakoHighLightAnimProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public View LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public InterfaceC689490R2t LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 890));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 891));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 892));
    public final AssemVMLazy LLJLLL;
    public C0DXR LLJZ;
    public final AwS624S0100000_10 LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoVideoListAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final int Lm0() {
        return 100;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fm9;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean isClosed() {
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final List<Pair<String, Long>> op() {
        List<TakoVideoItem> videoList;
        ArrayList arrayList = new ArrayList();
        InterfaceC689490R2t interfaceC689490R2t = this.LLJLIL;
        if (interfaceC689490R2t != null && (videoList = interfaceC689490R2t.getVideoList()) != null) {
            int i = 0;
            for (TakoVideoItem takoVideoItem : videoList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                arrayList.add(new Pair(takoVideoItem.awemeId, Long.valueOf(i)));
                i = i2;
            }
        }
        return arrayList;
    }

    public final TakoCardAbility sp() {
        return (TakoCardAbility) this.LLJLILLLLZIIL.getValue();
    }

    public TakoVideoListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 888);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(378);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 889), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLLL = assemVMLazy;
        this.LLJZIJLIL = new AwS624S0100000_10(this, 84);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final C05PU dz(int i) {
        Integer numValueOf;
        int iIntValue;
        LinearLayoutManager linearLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        View viewFindViewByPosition = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            numValueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
        } else {
            numValueOf = null;
        }
        RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if (layoutManager2 != null) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewByPosition = layoutManager2.findViewByPosition(iIntValue);
        }
        return new C1847380yAq(viewOnAttachStateChangeListenerC20604515jv, i, viewFindViewByPosition, numValueOf, new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2)));
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        String aid;
        InterfaceC689490R2t interfaceC689490R2t;
        List<TakoVideoItem> videoList;
        C13LC<C1863920ybW> c13lcRg1;
        C1863920ybW c1863920ybW;
        C0PHT c0pht;
        RecyclerView.LayoutManager layoutManager;
        if (66 == c737030Svd.LIZ) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (aid = aweme.getAid()) != null && (interfaceC689490R2t = this.LLJLIL) != null && (videoList = interfaceC689490R2t.getVideoList()) != null) {
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
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
                    if (viewOnAttachStateChangeListenerC20604515jv != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) != null) {
                        layoutManager.scrollToPosition(iIntValue);
                    }
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
                    if (iTakoContextAbility != null && (c13lcRg1 = iTakoContextAbility.rg1()) != null && (c1863920ybW = (C1863920ybW) c13lcRg1.LIZIZ()) != null && (c0pht = c1863920ybW.LL) != null) {
                        c0pht.LIZJ = null;
                        c0pht.LIZLLL = null;
                        c0pht.LJ = null;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ITakoContextAbility iTakoContextAbility;
        RecyclerView.RecycledViewPool recycledViewPoolNr;
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.video_title);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.video_list);
        this.LLJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            BtmSDK.INSTANCE.registerBtmPage(viewOnAttachStateChangeListenerC20604515jv, "c71203", null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv2.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(TakoVideoItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv2.setOverScrollMode(2);
            C689730R3r c689730R3r = new C689730R3r(this, 1);
            this.LLJZ = c689730R3r;
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(c689730R3r);
            viewOnAttachStateChangeListenerC20604515jv2.addOnAttachStateChangeListener(new C0R45(this, 28));
            if ((C0B1N.LIZ() & 4) == 4 && (iTakoContextAbility = (ITakoContextAbility) this.LLJLLIL.getValue()) != null && (recycledViewPoolNr = iTakoContextAbility.Nr()) != null) {
                viewOnAttachStateChangeListenerC20604515jv2.setRecycledViewPool(recycledViewPoolNr);
            }
            C07QH.LIZ.getClass();
            if (C07QH.LIZ()) {
                ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(182));
                }
                viewOnAttachStateChangeListenerC20604515jv2.requestLayout();
            }
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ITakoHighLightAnimProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC689490R2t interfaceC689490R2t) {
        List<TakoVideoItem> videoList;
        boolean z;
        Integer numValueOf;
        int i;
        Message messageYy1;
        int i2;
        Message messageYy12;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        Message messageYy13;
        TakoMixFeed takoMixFeedLJIIIZ2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        int i3;
        TakoCardAbility takoCardAbilitySp;
        Message messageYy14;
        TakoMixFeed takoMixFeedLJIIIZ3;
        TakoPassExt takoPassExt;
        C20600815jK<InterfaceC1891350zJl> state;
        boolean z2;
        int size;
        Message messageYy15;
        TakoMixFeed takoMixFeedLJIIIZ4;
        int i4;
        int length;
        String string;
        Message messageYy16;
        TakoMixFeed takoMixFeedLJIIIZ5;
        String str2;
        Message messageYy17;
        TakoMixFeed takoMixFeedLJIIIZ6;
        Message messageYy18;
        InterfaceC689490R2t interfaceC689490R2t2 = interfaceC689490R2t;
        if (C299000Bnm.LIZ()) {
            C1857280yQo.LIZJ(getContentView(), C444960Hcc.LIZIZ());
        } else {
            C1857280yQo.LIZJ(getContentView(), C1857280yQo.LIZ(sp()));
        }
        List<TakoVideoItem> videoList2 = interfaceC689490R2t2.getVideoList();
        int length2 = 0;
        if ((videoList2 == null || videoList2.isEmpty()) && 1 != 0) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        List<TakoVideoItem> videoList3 = interfaceC689490R2t2.getVideoList();
        InterfaceC689490R2t interfaceC689490R2t3 = this.LLJLIL;
        String string2 = null;
        if (interfaceC689490R2t3 == null || (videoList = interfaceC689490R2t3.getVideoList()) == null) {
            videoList = C13BV.INSTANCE;
        }
        if (videoList3 == null) {
            videoList3 = C13BV.INSTANCE;
        }
        if (videoList3.size() == videoList.size()) {
            int size2 = videoList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (Intrinsics.LJFF(((TakoVideoItem) ListProtector.get(videoList3, i5)).awemeId, ((TakoVideoItem) ListProtector.get(videoList, i5)).awemeId)) {
                }
            }
            return;
        }
        TakoCardAbility takoCardAbilitySp2 = sp();
        if (takoCardAbilitySp2 != null && (messageYy18 = takoCardAbilitySp2.Yy1()) != null && C1858670yT3.LJFF(messageYy18)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ExecutorService executorService = C1909880zne.LIZ;
            Pair[] pairArr = new Pair[3];
            TakoCardAbility takoCardAbilitySp3 = sp();
            if (takoCardAbilitySp3 != null && (messageYy17 = takoCardAbilitySp3.Yy1()) != null && (takoMixFeedLJIIIZ6 = messageYy17.LJIIIZ()) != null) {
                i4 = takoMixFeedLJIIIZ6.cardType;
            } else {
                i4 = 0;
            }
            pairArr[0] = new Pair("card_type", String.valueOf(i4));
            TakoCardAbility takoCardAbilitySp4 = sp();
            if (takoCardAbilitySp4 != null && (messageYy16 = takoCardAbilitySp4.Yy1()) != null && (takoMixFeedLJIIIZ5 = messageYy16.LJIIIZ()) != null && (str2 = takoMixFeedLJIIIZ5.text) != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            pairArr[1] = new Pair("text_count", String.valueOf(length));
            TakoCardAbility takoCardAbilitySp5 = sp();
            if (takoCardAbilitySp5 != null) {
                string = Integer.valueOf(takoCardAbilitySp5.t70()).toString();
            } else {
                string = null;
            }
            pairArr[2] = new Pair("is_nimble", string);
            C1909880zne.LIZIZ("", C2097608Jq.LJIIIIZZ(pairArr));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TakoCardAbility takoCardAbilitySp6 = sp();
        if (takoCardAbilitySp6 != null && (messageYy15 = takoCardAbilitySp6.Yy1()) != null && (takoMixFeedLJIIIZ4 = messageYy15.LJIIIZ()) != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ4.cardType);
        } else {
            numValueOf = null;
        }
        boolean zLJJJJ = C13LP.LJJJJ(numValueOf, C1697810uHb.LJIIJJI(3, 201, 203, 13));
        ArrayList arrayList = new ArrayList();
        String strLJIIIIZZ = interfaceC689490R2t2.LJIIIIZZ();
        this.LLJLIL = interfaceC689490R2t2;
        List<TakoVideoItem> videoList4 = interfaceC689490R2t2.getVideoList();
        if (videoList4 != null) {
            int i6 = 0;
            for (TakoVideoItem takoVideoItem : videoList4) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    TakoVideoItem takoVideoItem2 = takoVideoItem;
                    if (zLJJJJ && ((String) C0R2Z.LIZIZ(takoVideoItem2)).length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AwS624S0100000_10 awS624S0100000_10 = this.LLJZIJLIL;
                    List<TakoVideoItem> videoList5 = interfaceC689490R2t2.getVideoList();
                    if (videoList5 != null) {
                        size = videoList5.size();
                    } else {
                        size = 0;
                    }
                    arrayList.add(new C689600R3e(i6, z2, takoVideoItem2, strLJIIIIZZ, awS624S0100000_10, Integer.valueOf(size), interfaceC689490R2t2.LJIILIIL(), interfaceC689490R2t2.LJJIJL()));
                    i6 = i7;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!((Boolean) C1819107An.LIZIZ.getValue()).booleanValue() || (((Number) C1819107An.LIZ.getValue()).intValue() & 1) == 0) {
            AssemVMLazy assemVMLazy = this.LLJLLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
            TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) assemVMLazy.getValue();
            List<Pair<String, Long>> listOp = op();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listOp, 10));
            Iterator it2 = ((ArrayList) listOp).iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Pair) it2.next()).getFirst());
            }
            takoInnerDetailVM.vQ2(arrayList2.toString());
        }
        AssemVMLazy assemVMLazy2 = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLL;
        ((TakoInnerDetailVM) assemVMLazy2.getValue()).xQ2(AFwS196S0000000_10.get$arr$(695), AFwS241S0000000_10.get$arr$(565), new AwS376S0200000_10(this, interfaceC689490R2t2, 147));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            if (!(!arrayList.isEmpty()) || ((takoCardAbilitySp = sp()) != null && (messageYy14 = takoCardAbilitySp.Yy1()) != null && (takoMixFeedLJIIIZ3 = messageYy14.LJIIIZ()) != null && (takoPassExt = takoMixFeedLJIIIZ3.ext) != null && takoPassExt.isBigVideo == 1)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, viewOnAttachStateChangeListenerC20604515jv3);
        }
        View viewLJJIJL = LJJIJL();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null && viewOnAttachStateChangeListenerC20604515jv4.getVisibility() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        final Integer numLLJI = interfaceC689490R2t2.LLJI();
        if (interfaceC689490R2t2.LLJI() != null) {
            C0DXR c0dxr = this.LLJZ;
            if (c0dxr != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJL) != null) {
                viewOnAttachStateChangeListenerC20604515jv.removeItemDecoration(c0dxr);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJL;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                C0DXR c0dxr2 = new C0DXR() { // from class: X.0R3b
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        Pair pair;
                        boolean zLIZ;
                        Object first;
                        Object second;
                        int iIntValue;
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                        if (childAdapterPosition == 0) {
                            Integer num = numLLJI;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(C1857750yRZ.LJ() / 2));
                        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
                            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
                        } else {
                            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
                        }
                        if (C299000Bnm.LIZ()) {
                            zLIZ = C444960Hcc.LIZIZ();
                        } else {
                            zLIZ = C1857280yQo.LIZ(this.sp());
                        }
                        if (zLIZ) {
                            first = pair.getSecond();
                        } else {
                            first = pair.getFirst();
                        }
                        rect.left = ((Number) first).intValue();
                        if (zLIZ) {
                            second = pair.getFirst();
                        } else {
                            second = pair.getSecond();
                        }
                        rect.right = ((Number) second).intValue();
                    }
                };
                this.LLJZ = c0dxr2;
                viewOnAttachStateChangeListenerC20604515jv5.addItemDecoration(c0dxr2);
            }
        }
        TakoCardAbility takoCardAbilitySp7 = sp();
        if (takoCardAbilitySp7 == null || (messageYy1 = takoCardAbilitySp7.Yy1()) == null || !C1858670yT3.LJFF(messageYy1)) {
            return;
        }
        ExecutorService executorService2 = C1909880zne.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Pair[] pairArr2 = new Pair[3];
        TakoCardAbility takoCardAbilitySp8 = sp();
        if (takoCardAbilitySp8 != null && (messageYy13 = takoCardAbilitySp8.Yy1()) != null && (takoMixFeedLJIIIZ2 = messageYy13.LJIIIZ()) != null) {
            i2 = takoMixFeedLJIIIZ2.cardType;
        } else {
            i2 = 0;
        }
        pairArr2[0] = new Pair("card_type", String.valueOf(i2));
        TakoCardAbility takoCardAbilitySp9 = sp();
        if (takoCardAbilitySp9 != null && (messageYy12 = takoCardAbilitySp9.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy12.LJIIIZ()) != null && (str = takoMixFeedLJIIIZ.text) != null) {
            length2 = str.length();
        }
        pairArr2[1] = new Pair("text_count", String.valueOf(length2));
        TakoCardAbility takoCardAbilitySp10 = sp();
        if (takoCardAbilitySp10 != null) {
            string2 = Integer.valueOf(takoCardAbilitySp10.t70()).toString();
        }
        pairArr2[2] = new Pair("is_nimble", string2);
        C1909880zne.LIZ(jCurrentTimeMillis2, "", C2097608Jq.LJIIIIZZ(pairArr2));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689490R2t interfaceC689490R2t) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689490R2t interfaceC689490R2t) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean wv1(Message message, int i) {
        if (message != null) {
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 3) {
                return true;
            }
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 13) {
                return true;
            }
            if (message.msgType == 3 && !message.sender.isSelf) {
                return true;
            }
            return false;
        }
        return false;
    }
}
