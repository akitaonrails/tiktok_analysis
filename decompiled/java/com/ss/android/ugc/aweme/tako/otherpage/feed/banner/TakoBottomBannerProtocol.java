package com.ss.android.ugc.aweme.tako.otherpage.feed.banner;

import X.C01GW;
import X.C04VG;
import X.C0SH0;
import X.C0SH2;
import X.C0SH5;
import X.C1586320rNm;
import X.C20269814Sy;
import X.C452501pT;
import X.C718360SFu;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoBottomBannerProtocol extends FeedCommonBannerProtocol implements C0SH5 {
    public final InterfaceC665370Q7z LLILZIL;
    public final String LLILZLL = "bottom_banner_tako";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(216));

    @Override // X.C0SH5
    public final Float LIZLLL() {
        return null;
    }

    @Override // X.C0SH5
    public final Float LIZ() {
        if (((Boolean) C04VG.LIZ.getValue()).booleanValue()) {
            return Float.valueOf(11.0f);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final C0SH0 LJ() {
        final C718360SFu c718360SFu = this.LL;
        final C1586320rNm c1586320rNm = (C1586320rNm) this.LLIZ.getValue();
        return new C0SH0(c718360SFu, c1586320rNm) { // from class: X.14T0
            public final C718360SFu LIZ;
            public final C1586320rNm LIZIZ;

            @Override // X.C0SH0
            public final void H() {
            }

            @Override // X.C0SH0
            public final void LJJIIJ() {
            }

            @Override // X.C0SH0
            public final void LJJIIJZLJL() {
            }

            @Override // X.C0SH0
            public final void LJJIIZ() {
            }

            @Override // X.C0SH0
            public final void LJJLJLI() {
            }

            @Override // X.C0SH0
            public final void LJL() {
            }

            @Override // X.C0SH0
            public final void LJLLLL() {
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x020a  */
            @Override // X.C0SH0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void I(com.ss.android.ugc.aweme.feed.model.Aweme r42) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 526
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14T0.I(com.ss.android.ugc.aweme.feed.model.Aweme):void");
            }

            {
                this.LIZ = c718360SFu;
                this.LIZIZ = c1586320rNm;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final C0SH2 LJI() {
        return new C20269814Sy(this.LLILZIL, this.LL, (C1586320rNm) this.LLIZ.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final String LIZJ() {
        return this.LLILZLL;
    }

    public TakoBottomBannerProtocol(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILZIL = interfaceC665370Q7z;
    }
}
