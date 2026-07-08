package com.ss.android.ugc.aweme.tako.botpage.components.video.singlevideo;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DSB;
import X.C0PHT;
import X.C0Q72;
import X.C0R45;
import X.C0R46;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1860990yWn;
import X.C1861010yWp;
import X.C1863920ybW;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C298820BnU;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689490R2t;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoListAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoSingleVideoAssem extends ReusedUISlotAssem<TakoVideoListAssem> implements InterfaceC712990Rxx<InterfaceC689490R2t> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public InterfaceC689490R2t LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 868));
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;
    public View LLJLLL;
    public final AwS624S0100000_10 LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSingleVideoAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flw;
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

    public TakoSingleVideoAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 866);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(375);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 867), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLL = assemVMLazy;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 869));
        this.LLJZ = new AwS624S0100000_10(this, 82);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863920ybW> c13lcRg1;
        C1863920ybW c1863920ybW;
        C0PHT c0pht;
        if (66 == c737030Svd.LIZ && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null)) != null && (c13lcRg1 = iTakoContextAbility.rg1()) != null && (c1863920ybW = (C1863920ybW) c13lcRg1.LIZIZ()) != null && (c0pht = c1863920ybW.LL) != null) {
            c0pht.LIZJ = null;
            c0pht.LIZLLL = null;
            c0pht.LJ = null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (SmartImageView) view.findViewById(R.id.ca8);
        this.LLJLLL = view;
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 39), view);
        view.setOnLongClickListener(new C0R46(this, 3));
        view.addOnAttachStateChangeListener(new C0R45(this, 27));
        C0Q72.LIZ(view, 8.0f);
        View view2 = this.LLJLLL;
        if (view2 != null) {
            C2211631BhB.LJ(view2, new AwS589S0100000_10(this, 564));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC689490R2t interfaceC689490R2t) {
        TakoVideoItem takoVideoItem;
        TakoVideoItem takoVideoItem2;
        String str;
        String string;
        Map<String, String> mapLJ;
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        List<TakoVideoItem> videoList;
        InterfaceC689490R2t interfaceC689490R2t2 = interfaceC689490R2t;
        List<TakoVideoItem> videoList2 = interfaceC689490R2t2.getVideoList();
        View viewFindViewById = null;
        if (videoList2 != null && (takoVideoItem = (TakoVideoItem) C13LP.LJJJLL(videoList2)) != null) {
            int i = 0;
            if (takoVideoItem.awemeId.length() != 0) {
                InterfaceC689490R2t interfaceC689490R2t3 = this.LLJLIL;
                if (interfaceC689490R2t3 != null && (videoList = interfaceC689490R2t3.getVideoList()) != null) {
                    takoVideoItem2 = (TakoVideoItem) C13LP.LJJJLL(videoList);
                } else {
                    takoVideoItem2 = null;
                }
                String str2 = takoVideoItem.awemeId;
                if (takoVideoItem2 != null) {
                    str = takoVideoItem2.awemeId;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str2, str)) {
                    this.LLJLIL = interfaceC689490R2t2;
                    C0DSB.LIZJ(LJJIJL());
                    C1861010yWp c1861010yWpLJJLIIIJ = interfaceC689490R2t2.LJJLIIIJ();
                    SmartImageView smartImageView = this.LLJL;
                    if (smartImageView != null) {
                        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLILLLLZIIL.getValue();
                        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString()) == null) {
                            string = "";
                        }
                        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
                        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        C1860990yWn.LIZ(smartImageView, takoVideoItem, string, mapLJ, c1861010yWpLJJLIIIJ, C298820BnU.LIZ);
                    }
                    AssemVMLazy assemVMLazy = this.LLJLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
                    TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) assemVMLazy.getValue();
                    List<Pair<String, Long>> listOp = op();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listOp, 10));
                    Iterator it2 = ((ArrayList) listOp).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Pair) it2.next()).getFirst());
                    }
                    takoInnerDetailVM.vQ2(arrayList.toString());
                    AssemVMLazy assemVMLazy2 = this.LLJLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJZIJLIL;
                    ((TakoInnerDetailVM) assemVMLazy2.getValue()).xQ2(AFwS196S0000000_10.get$arr$(594), AFwS241S0000000_10.get$arr$(502), new AwS376S0200000_10(this, interfaceC689490R2t2, 120));
                    View view = this.LLJJLIIIJLLLLLLLZ;
                    if (view == null) {
                        View viewLJJIJL = LJJIJL();
                        if (viewLJJIJL != null) {
                            viewFindViewById = viewLJJIJL.findViewById(R.id.qcl);
                        }
                        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) viewFindViewById;
                        view = viewFindViewById;
                    }
                    Integer num = takoVideoItem.awemeType;
                    if (num == null || num.intValue() != 150) {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view);
                    View view2 = this.LLJLLL;
                    if (view2 != null) {
                        interfaceC689490R2t2.LJJ().invoke(view2, C1558520qew.LJIIL(this));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C0DSB.LIZIZ(LJJIJL());
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
}
