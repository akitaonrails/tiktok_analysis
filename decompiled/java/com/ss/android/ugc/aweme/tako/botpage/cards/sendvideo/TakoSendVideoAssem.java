package com.ss.android.ugc.aweme.tako.botpage.cards.sendvideo;

import X.AbstractC738140SxQ;
import X.C0HZQ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LE;
import X.C14J2;
import X.C15438062q;
import X.C1857850yRj;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
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
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSendVideoAssem extends TakoSendBaseAssem<C1857850yRj> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public SmartImageView LLLJIL;
    public TuxTextView LLLJL;
    public View LLLL;
    public C427660Gpo LLLLII;
    public TuxTextView LLLLIIIILLL;
    public View LLLLIIL;
    public final AssemVMLazy LLLLIILL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSendVideoAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnh;
    }

    public TakoSendVideoAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1267);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(215);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 1268), aFwS269S0000000_27, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLLLIILL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] */
    public final void up(C1857850yRj c1857850yRj) {
        String str;
        boolean z;
        int i;
        Map<String, String> mapLJ;
        int i2;
        int i3;
        Map<String, String> mapLJ2;
        super.up(c1857850yRj);
        String str2 = c1857850yRj.LLJI;
        if (str2.length() > 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJ(this.LLLJIL);
            ITakoContextAbility iTakoContextAbilityZp = zp();
            if (iTakoContextAbilityZp == null || (mapLJ2 = iTakoContextAbilityZp.getCommonParams()) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(this.LLLJIL, "tako_send_video_cover", str2, mapLJ2);
            c1331670kl3LJIIIZ.LJIIJJI();
        }
        View view = this.LLLL;
        int i4 = 8;
        if (view != null) {
            if (c1857850yRj.LLJI.length() > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view);
        }
        String str3 = c1857850yRj.LLJILJIL;
        if ((str3 == null || str3.length() == 0) && ((str = c1857850yRj.LLJILJILJ) == null || str.length() == 0)) {
            z = false;
        } else {
            z = true;
        }
        View view2 = this.LLLLIIL;
        if (view2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        if (z) {
            String str4 = c1857850yRj.LLJILJIL;
            if (str4 != null && str4.length() > 0) {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str4);
                c1331670kl3LJIIIZ2.LJJ(this.LLLLII);
                ITakoContextAbility iTakoContextAbilityZp2 = zp();
                if (iTakoContextAbilityZp2 == null || (mapLJ = iTakoContextAbilityZp2.getCommonParams()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                c1331670kl3LJIIIZ2.LJJJIL = new C1338340kvo(this.LLLLII, "tako_send_video_user_avatar", str4, mapLJ);
                c1331670kl3LJIIIZ2.LJIIJJI();
            }
            TuxTextView tuxTextView = this.LLLLIIIILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(c1857850yRj.LLJILJILJ);
            }
        }
        TuxTextView tuxTextView2 = this.LLLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c1857850yRj.LLJIJIL);
        }
        TuxTextView tuxTextView3 = this.LLLJL;
        if (tuxTextView3 != null) {
            String str5 = c1857850yRj.LLJIJIL;
            if (str5 != null && str5.length() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, i);
        }
        C14J2 c14j2 = this.LLLIL;
        if (c14j2 != null) {
            String str6 = c1857850yRj.LLJIJIL;
            if (str6 != null && str6.length() != 0) {
                i4 = 0;
            }
            C786410Ut5.c1(c14j2, i4);
        }
        List<TakoVideoItem> list = c1857850yRj.LLJ;
        List<Pair<String, Long>> listLJ = c1857850yRj.LJ();
        if (list != null && !list.isEmpty()) {
            AssemVMLazy assemVMLazy = this.LLLLIILL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILLL;
            TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) assemVMLazy.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
            Iterator<Pair<String, Long>> it2 = listLJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFirst());
            }
            takoInnerDetailVM.vQ2(arrayList.toString());
            AssemVMLazy assemVMLazy2 = this.LLLLIILL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLLLIILLL;
            ((TakoInnerDetailVM) assemVMLazy2.getValue()).xQ2(AFwS216S0000000_27.get$arr$(175), AFwS269S0000000_27.get$arr$(214), new AwS393S0200000_27(this, (TakoSendVideoAssem) list, (List<TakoVideoItem>) 48));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.eth);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.xlj);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        C14J2 c14j2 = this.LLLIL;
        if (c14j2 != null) {
            c14j2.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        }
        this.LLLJIL = (SmartImageView) view.findViewById(R.id.plb);
        this.LLLL = view.findViewById(R.id.qmf);
        this.LLLLII = (C427660Gpo) view.findViewById(R.id.user_avatar);
        this.LLLLIIIILLL = (TuxTextView) view.findViewById(R.id.user_name);
        this.LLLLIIL = view.findViewById(R.id.user_info_container);
        SmartImageView smartImageView = this.LLLJIL;
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS161S0100000_27(this, 76));
        }
        this.LLLJL = (TuxTextView) view.findViewById(R.id.xlj);
    }
}
