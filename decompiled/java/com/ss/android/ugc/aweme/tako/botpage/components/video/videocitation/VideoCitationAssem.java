package com.ss.android.ugc.aweme.tako.botpage.components.video.videocitation;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DSB;
import X.C0PHT;
import X.C0Q72;
import X.C0R45;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1857750yRZ;
import X.C1863920ybW;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC689520R2w;
import X.InterfaceC712990Rxx;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
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
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoCitationAssem extends ReusedUISlotAssem<VideoCitationAssem> implements InterfaceC712990Rxx<InterfaceC689520R2w> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public InterfaceC689520R2w LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 872));
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;
    public final AwS624S0100000_10 LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCitationAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fm5;
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
        InterfaceC689520R2w interfaceC689520R2w = this.LLJLIL;
        if (interfaceC689520R2w != null && (videoList = interfaceC689520R2w.getVideoList()) != null) {
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

    public VideoCitationAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 870);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(376);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 871), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLL = assemVMLazy;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 873));
        this.LLJLLL = new AwS624S0100000_10(this, 83);
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
        this.LLJJLIIIJLLLLLLLZ = (SmartImageView) view.findViewById(R.id.ca8);
        this.LLJL = (TuxTextView) view.findViewById(R.id.xo5);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            C1857750yRZ.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewLJJIJL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC689520R2w interfaceC689520R2w) {
        TakoVideoItem takoVideoItem;
        String str;
        SmartImageView smartImageView;
        String string;
        Map<String, String> mapLJ;
        ITakoContextAbility iTakoContextAbility;
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        List<TakoVideoItem> videoList;
        TakoVideoItem takoVideoItem2;
        InterfaceC689520R2w interfaceC689520R2w2 = interfaceC689520R2w;
        if (!Intrinsics.LJFF(interfaceC689520R2w2, this.LLJLIL)) {
            List<TakoVideoItem> videoList2 = interfaceC689520R2w2.getVideoList();
            if (videoList2 != null && (takoVideoItem = (TakoVideoItem) C13LP.LJJJLL(videoList2)) != null) {
                if (Intrinsics.LJFF(takoVideoItem.awemeId, "")) {
                    C0DSB.LIZIZ(LJJIJL());
                    return;
                }
                C0DSB.LIZJ(LJJIJL());
                String str2 = takoVideoItem.awemeId;
                InterfaceC689520R2w interfaceC689520R2w3 = this.LLJLIL;
                if (interfaceC689520R2w3 != null && (videoList = interfaceC689520R2w3.getVideoList()) != null && (takoVideoItem2 = (TakoVideoItem) C13LP.LJJJLL(videoList)) != null) {
                    str = takoVideoItem2.awemeId;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str2, str) && (smartImageView = this.LLJJLIIIJLLLLLLLZ) != null) {
                    BaseImage baseImage = takoVideoItem.cover;
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(baseImage.imageId, baseImage.urlList));
                    c1331670kl3LJIIIIZZ.LIZLLL("TakoAnswerVideoCell");
                    int width = smartImageView.getWidth();
                    int height = smartImageView.getHeight();
                    c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
                    c1331670kl3LJIIIIZZ.LJIIIZ = height;
                    c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                    TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLILLLLZIIL.getValue();
                    if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null) {
                        string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
                    } else {
                        string = null;
                    }
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                    if (interfaceC665370Q7zLJIIL == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ITakoContextAbility.class, null)) == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c1331670kl3LJIIIIZZ.LJJJIL = new C1338340kvo(smartImageView, string, takoVideoItem.cover.imageId, mapLJ);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    C0Q72.LIZ(smartImageView, 10.0f);
                    C786410Ut5.Q8(smartImageView, new ACListenerS145S0100000_10(this, 83));
                    smartImageView.addOnAttachStateChangeListener(new C0R45(this, 40));
                }
                if (takoVideoItem.LIZ == null) {
                    AssemVMLazy assemVMLazy = this.LLJLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
                    TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) assemVMLazy.getValue();
                    List<Pair<String, Long>> listOp = op();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listOp, 10));
                    Iterator it2 = ((ArrayList) listOp).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Pair) it2.next()).getFirst());
                    }
                    takoInnerDetailVM.vQ2(arrayList.toString());
                    AssemVMLazy assemVMLazy2 = this.LLJLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJZ;
                    ((TakoInnerDetailVM) assemVMLazy2.getValue()).xQ2(AFwS196S0000000_10.get$arr$(631), AFwS241S0000000_10.get$arr$(508), new AwS376S0200000_10(this, interfaceC689520R2w2, 124));
                }
            } else {
                C0DSB.LIZIZ(LJJIJL());
            }
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC689520R2w2.LLJILJIL());
                sbLIZ.append(':');
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLJLIL = interfaceC689520R2w2;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689520R2w interfaceC689520R2w) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689520R2w interfaceC689520R2w) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
