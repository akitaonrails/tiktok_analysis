package com.ss.android.ugc.aweme.tako.botpage.cards.novel.image;

import X.C01GW;
import X.C0HZQ;
import X.C0R2X;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LC;
import X.C13LP;
import X.C1857000yQM;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C2097608Jq;
import X.C346190Dhh;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC1860810yWV;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNovelImageAssem extends TakoAnswerBaseAssem<C1857000yQM> {
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 258));
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 261));
    public final C01GW LLLZI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 259));
    public final C01GW LLLZIIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 260));
    public final C01GW LLLZIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 262));
    public final C346190Dhh LLLZL = new C346190Dhh(this, 0);
    public final AwS606S0100000_27 LLLZLL = new AwS606S0100000_27(this, 230);

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmg;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final /* bridge */ /* synthetic */ InterfaceC1860810yWV Tp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857000yQM c1857000yQM) {
        List<BaseImage> list;
        BaseImage baseImage;
        Map<String, String> mapLJ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Integer numValueOf;
        String str;
        Integer numValueOf2;
        super.up(c1857000yQM);
        TakoMixFeed takoMixFeed = c1857000yQM.LLILZLL;
        if (takoMixFeed != null && (list = takoMixFeed.images) != null && (baseImage = (BaseImage) C13LP.LJJJLL(list)) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(baseImage.imageId, baseImage.urlList));
            String strValueOf = String.valueOf(c1857000yQM.LLILZLL.cardType);
            ITakoContextAbility iTakoContextAbilityZp = zp();
            if (iTakoContextAbilityZp == null || (mapLJ = iTakoContextAbilityZp.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c1331670kl3LJIIIIZZ.LJJJIL = new C1338340kvo((View) this.LLLLZLLLI.getValue(), strValueOf, baseImage.imageId, mapLJ);
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLLLZLLLI.getValue());
            c1331670kl3LJIIIIZZ.LJIIJ(this.LLLZL);
            String str2 = c1857000yQM.LLILLJJLI;
            String str3 = baseImage.imageId;
            String str4 = (String) C13LP.LJJJLL(baseImage.urlList);
            ITakoContextAbility iTakoContextAbilityZp2 = zp();
            if (iTakoContextAbilityZp2 != null && (c13lcT71 = iTakoContextAbilityZp2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP.LL;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = c1863850ybP.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP.LLILZIL;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = c1863850ybP.LLILZLL;
                if (str9 == null) {
                    str9 = "";
                }
                String strValueOf2 = String.valueOf(c1863850ybP.LLJJ);
                long j = c1863850ybP.LLJILLL;
                String str10 = c1863850ybP.LLJILJILJ;
                if (str10 == null) {
                    str10 = "";
                }
                String str11 = c1863850ybP.LLILLL;
                if (str3 != null) {
                    str6 = str3;
                }
                String strValueOf3 = String.valueOf(0);
                TakoMixFeed takoMixFeedLJIIIZ = Yy1().LJIIIZ();
                if (takoMixFeedLJIIIZ != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                } else {
                    numValueOf = null;
                }
                String strLIZIZ = C0R2X.LIZIZ(numValueOf);
                if (Yy1().isMultiAnswer) {
                    str = "multi_answer";
                } else {
                    str = "default";
                }
                if (Yy1().isMultiAnswer) {
                    numValueOf2 = Integer.valueOf(Yy1().selectedAnswerIndex + 1);
                } else {
                    numValueOf2 = null;
                }
                C1862330yYx.LJJJJJ(c1862330yYx, str5, str7, str2, str8, str9, c1863850ybP.LLIZ, strValueOf2, Long.valueOf(j), str10, str11, "pic", str6, strValueOf3, strLIZIZ, str4, null, null, null, str, numValueOf2, null, null, null, null, null, null, null, null, null, false, 2145878016);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            View view2 = (View) this.LLLLZLLLI.getValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            viewGroup.addView(view2, layoutParams);
            View view3 = (View) this.LLLZ.getValue();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            viewGroup.addView(view3, layoutParams2);
        }
    }
}
