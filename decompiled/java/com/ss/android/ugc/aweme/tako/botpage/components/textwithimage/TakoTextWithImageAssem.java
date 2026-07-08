package com.ss.android.ugc.aweme.tako.botpage.components.textwithimage;

import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1338340kvo;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1856550yPd;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoTextWithImageAssem extends ReusedUISlotAssem<TakoTextWithImageAssem> implements InterfaceC712990Rxx<InterfaceC1856550yPd> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 807));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, StrategyCenter.ENABLE_SMART_SERVICE));
    public TuxTextView LLJLIL;
    public SmartImageView LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flz;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.zf0);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.ll7);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1856550yPd interfaceC1856550yPd) {
        String str;
        List<String> list;
        String string;
        Map<String, String> mapLJ;
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        InterfaceC1856550yPd interfaceC1856550yPd2 = interfaceC1856550yPd;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(interfaceC1856550yPd2.LLIIIJ());
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            BaseImage image = interfaceC1856550yPd2.getImage();
            String str2 = null;
            if (image != null) {
                str = image.imageId;
            } else {
                str = null;
            }
            BaseImage image2 = interfaceC1856550yPd2.getImage();
            if (image2 != null) {
                list = image2.urlList;
            } else {
                list = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(str, list));
            c1331670kl3LJIIIIZZ.LIZLLL("TakoTextWithImageAssem");
            int width = smartImageView.getWidth();
            int height = smartImageView.getHeight();
            c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
            c1331670kl3LJIIIIZZ.LJIIIZ = height;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(4);
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null) {
                string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
            } else {
                string = null;
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJL.getValue();
            if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            BaseImage image3 = interfaceC1856550yPd2.getImage();
            if (image3 != null) {
                str2 = image3.imageId;
            }
            c1331670kl3LJIIIIZZ.LJJJIL = new C1338340kvo(smartImageView, string, str2, mapLJ);
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1856550yPd interfaceC1856550yPd) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1856550yPd interfaceC1856550yPd) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
