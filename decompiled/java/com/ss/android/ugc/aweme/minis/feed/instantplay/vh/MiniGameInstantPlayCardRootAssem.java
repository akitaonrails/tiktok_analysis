package com.ss.android.ugc.aweme.minis.feed.instantplay.vh;

import X.C01GW;
import X.C08S3;
import X.C0PEM;
import X.C1006260cIC;
import X.C1006330cIJ;
import X.C1006340cIK;
import X.C1006350cIL;
import X.C1006360cIM;
import X.C1006440cIU;
import X.C1006540cIe;
import X.C1007120cJa;
import X.C13LE;
import X.C1616440sAM;
import X.C1616470sAP;
import X.C20550115b9;
import X.C20550215bA;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C723830SaL;
import X.C724270Sb3;
import X.C737910Sx3;
import X.EnumC1006320cII;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS31S0010000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniGameInstantPlayCardRootAssem extends BaseCellContentComponent<MiniGameInstantPlayCardRootAssem> {
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(MiniGameInstantPlayViewModel.class), AFwS252S0000000_16.get$arr$(274));
    public Long LLJJL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJJL = null;
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = ep();
        miniGameInstantPlayViewModelEp.LL = false;
        miniGameInstantPlayViewModelEp.setState(AFwS252S0000000_16.get$arr$(582));
    }

    public final MiniGameInstantPlayViewModel ep() {
        return (MiniGameInstantPlayViewModel) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = ep();
        miniGameInstantPlayViewModelEp.getClass();
        miniGameInstantPlayViewModelEp.setState(new AwS31S0010000_16(false, 16));
        Long l = this.LLJJL;
        if (l != null) {
            long jLongValue = l.longValue();
            C1006440cIU c1006440cIU = C1006540cIe.LIZ.get(Long.valueOf(jLongValue));
            if (c1006440cIU != null) {
                c1006440cIU.LJIIIIZZ = false;
                c1006440cIU.LIZ();
            }
            C1006440cIU c1006440cIULIZ = C1006540cIe.LIZ(jLongValue);
            if (c1006440cIULIZ == null || !c1006440cIULIZ.LJII || ep().LL) {
                return;
            }
            C1006340cIK c1006340cIKLIZ = C1006350cIL.LIZ(jLongValue, ep().getState().LL);
            C1006330cIJ c1006330cIJ = C1006330cIJ.LIZ;
            EnumC1006320cII enumC1006320cII = EnumC1006320cII.EXIT_SWIPE;
            c1006330cIJ.getClass();
            C1006330cIJ.LIZJ(c1006340cIKLIZ, enumC1006320cII);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = ep();
        miniGameInstantPlayViewModelEp.getClass();
        miniGameInstantPlayViewModelEp.setState(new AwS31S0010000_16(false, 15));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = ep();
        miniGameInstantPlayViewModelEp.getClass();
        miniGameInstantPlayViewModelEp.setState(new AwS31S0010000_16(true, 15));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS595S0100000_16(this, 119));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayCardRootAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        int cardType;
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp = ep();
        miniGameInstantPlayViewModelEp.getClass();
        miniGameInstantPlayViewModelEp.setState(new AwS31S0010000_16(true, 16));
        MiniGameInstantPlayViewModel miniGameInstantPlayViewModelEp2 = ep();
        miniGameInstantPlayViewModelEp2.getClass();
        Object obj = null;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(miniGameInstantPlayViewModelEp2), C0PEM.LIZJ, null, new C1006260cIC(miniGameInstantPlayViewModelEp2, null), 2);
        Long l = this.LLJJL;
        if (l != null) {
            long jLongValue = l.longValue();
            C1006440cIU c1006440cIU = C1006540cIe.LIZ.get(Long.valueOf(jLongValue));
            if (c1006440cIU != null) {
                c1006440cIU.LJIIIIZZ = true;
                c1006440cIU.LIZ();
            }
            C1006440cIU c1006440cIULIZ = C1006540cIe.LIZ(jLongValue);
            if (c1006440cIULIZ != null && !c1006440cIULIZ.LJII) {
                c1006440cIULIZ.LJII = true;
                c1006440cIULIZ.LJIIIZ = i;
                if (!C1006540cIe.LIZLLL) {
                    C1006540cIe.LIZLLL = true;
                    C1007120cJa.LIZ();
                }
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            Aweme aweme2 = ((VideoItemParams) obj).getAweme();
            C20550115b9 c20550115b9 = C20550115b9.LIZ;
            CardInsertInfo cardInsertInfo = aweme2.getCardInsertInfo();
            if (cardInsertInfo != null) {
                cardType = cardInsertInfo.getCardType();
            } else {
                cardType = 0;
            }
            C20550215bA c20550215bALIZIZ = C1616440sAM.LIZIZ(cardType, C1616470sAP.LIZIZ(aweme2.getRequestId()));
            String aid = aweme2.getAid();
            c20550115b9.getClass();
            C20550115b9.LJIJ(c20550215bALIZIZ, aid);
            C1006340cIK c1006340cIKLIZ = C1006350cIL.LIZ(jLongValue, ep().getState().LL);
            C1006330cIJ.LIZ.getClass();
            long j = c1006340cIKLIZ.LIZ;
            C1006360cIM.LIZIZ.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            boolean zAdd = C1006360cIM.LIZ.add(Long.valueOf(j));
            C1006360cIM.LIZJ.put(Long.valueOf(j), Boolean.valueOf(zAdd));
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str = c1006340cIKLIZ.LIZIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("minis_id", str);
            C1006330cIJ.LIZ(c2344009Gk, c1006340cIKLIZ.LIZJ);
            c2344009Gk.LIZJ(zAdd ? 1 : 0, "is_first_show");
            C1006330cIJ.LIZIZ("tm_playable_card_show", c2344009Gk.LIZ);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_method", "playable_card");
            c2344009Gk2.LJIIIIZZ("minis_type", "mini_game");
            String str3 = c1006340cIKLIZ.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            c2344009Gk2.LJIIIIZZ("client_key", str2);
            C1006330cIJ.LIZ(c2344009Gk2, c1006340cIKLIZ.LIZJ);
            Map<String, String> map = c2344009Gk2.LIZ;
            C08S3.LIZ.getClass();
            C08S3.LIZJ("minis_entrance_show", map);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("entranceShow clientKey=");
            sbLIZ.append(c1006340cIKLIZ.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
        }
    }
}
