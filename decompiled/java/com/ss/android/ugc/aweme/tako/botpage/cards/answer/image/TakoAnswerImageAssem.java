package com.ss.android.ugc.aweme.tako.botpage.cards.answer.image;

import X.C01GW;
import X.C0DSB;
import X.C0HZQ;
import X.C14J2;
import X.C14NH;
import X.C1558520qew;
import X.C1856960yQI;
import X.C1857280yQo;
import X.C1857830yRh;
import X.C1858390ySb;
import X.C1858670yT3;
import X.C1862130yYd;
import X.C1913307eV;
import X.C326880Cre;
import X.C427660Gpo;
import X.C436180H8m;
import X.C452501pT;
import X.C687700QyG;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerImageAssem extends TakoAnswerBaseAssem<C1857830yRh> {
    public View LLLZ;
    public C1857830yRh LLLZI;
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 703));
    public final C01GW LLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 702));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final boolean up() {
        return ((Boolean) this.LLLZIIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Kq() {
        super.Kq();
        C1913307eV.LIZIZ(LJJIJL().findViewById(R.id.es4));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        C14J2 c14j2Pq = pq();
        C1856960yQI.LIZ.getClass();
        if (!C1856960yQI.LIZ()) {
            C1858390ySb.LIZ.getClass();
            if (!C1858390ySb.LIZ()) {
                c14j2Pq.getLayoutParams().width = -2;
                return c14j2Pq;
            }
        }
        c14j2Pq.getLayoutParams().width = -1;
        return c14j2Pq;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wr, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857830yRh c1857830yRh) {
        C1857280yQo.LIZJ(getContentView(), C1857280yQo.LIZ((TakoCardAbility) this.LLLLZLLLI.getValue()));
        super.up(c1857830yRh);
        if (C1858670yT3.LJ(c1857830yRh.LLJJIJI.LLILLL)) {
            C0DSB.LIZIZ(LJJIJL());
        } else {
            C0DSB.LIZJ(LJJIJL());
        }
        this.LLLZI = c1857830yRh;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 383));
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        boolean z;
        C1857830yRh c1857830yRh = (C1857830yRh) interfaceC1587906Jp;
        up(c1857830yRh);
        View view = this.LLLZ;
        if (view != null) {
            String str = c1857830yRh.LLJJIJIIJIL;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            C436180H8m.LIZJ(view, !z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void Ed0(int i, String str, String str2, boolean z) {
        C326880Cre c326880Cre;
        Message message;
        String str3;
        int i2;
        String strLJIIIZ;
        TakoPassExt takoPassExt;
        TakoPassExt takoPassExt2;
        Integer numValueOf = null;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.d11(str);
        }
        C1857830yRh c1857830yRh = this.LLLZI;
        if (c1857830yRh != null && (c326880Cre = c1857830yRh.LL) != null && (message = c326880Cre.LLILLL) != null && Intrinsics.LJFF(str, message.uuid)) {
            C1862130yYd c1862130yYd = C1862130yYd.LIZ;
            c1862130yYd.getClass();
            if (Intrinsics.LJFF(C1862130yYd.LIZJ, str)) {
                if (z) {
                    c1862130yYd.onEventFirstPacketPresented(message.uuid);
                    String str4 = message.uuid;
                    TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ != null && (takoPassExt2 = takoMixFeedLJIIIZ.ext) != null) {
                        str3 = takoPassExt2.userIntent;
                    } else {
                        str3 = null;
                    }
                    TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ2 != null) {
                        i2 = takoMixFeedLJIIIZ2.cardType;
                    } else {
                        i2 = -1;
                    }
                    TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ3 == null || (takoPassExt = takoMixFeedLJIIIZ3.ext) == null || (strLJIIIZ = takoPassExt.pluginType) == null) {
                        C14NH c14nh = C14NH.LIZ;
                        TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
                        if (takoMixFeedLJIIIZ4 != null) {
                            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ4.cardType);
                        }
                        c14nh.getClass();
                        strLJIIIZ = C14NH.LJIIIZ(numValueOf);
                        if (strLJIIIZ == null) {
                            strLJIIIZ = "";
                        }
                    }
                    C1862130yYd.LIZLLL(0, i2, str4, str3, strLJIIIZ, message.ext.imageTemplateId);
                    return;
                }
                c1862130yYd.onEventGetResponse(new TakoBaseResponse(null, i, str2));
            }
        }
    }
}
