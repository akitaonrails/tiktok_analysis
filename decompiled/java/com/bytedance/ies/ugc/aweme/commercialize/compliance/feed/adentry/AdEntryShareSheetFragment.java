package com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry;

import X.C098200Yq;
import X.C0MBB;
import X.C0MXE;
import X.C0TOM;
import X.C1017070cZd;
import X.C13D2;
import X.C13FE;
import X.C13ZC;
import X.C1665740tRs;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1669050tXD;
import X.C1669660tYC;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1675980tiO;
import X.C1679930tol;
import X.C1682520tsw;
import X.C1685300txQ;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685910tyP;
import X.C1688130u1z;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20030013Ys;
import X.C20088213iq;
import X.C20684815ws;
import X.C2344009Gk;
import X.C312690CNn;
import X.C746400TPq;
import X.EnumC1427810nG7;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC594300NSq;
import X.InterfaceC908430ZkP;
import X.InterfaceC908440ZkQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.AboutThisAdVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS177S0101000_12;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class AdEntryShareSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSHELIOSM6KSsvLGE1LSAoZy43LSs4OzZ9CSEJJzshMRYkKD02Gy0pLDsVOiQrJCo9PA==";
    public Aweme LL;
    public boolean LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public C19EG LLILZIL;
    public long LLILZLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(this.LL);
        c2344009Gk.LJ(awemeRawAdLJJIJLIJ != null ? awemeRawAdLJJIJLIJ.getAdId() : null, "ad_id");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLILZLL, "stay_time");
        C20684815ws.LJIILLIIL("ads_transparency_center_stay_time", c2344009Gk.LIZ);
    }

    public final void VR(Function0<Unit> function0) {
        C19EG c19eg = this.LLILZIL;
        if (c19eg == null) {
            return;
        }
        INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);
        InterfaceC908430ZkP networkStateForSharePanel = iNetworkStandardUIService.getNetworkStateForSharePanel();
        if (networkStateForSharePanel instanceof InterfaceC908440ZkQ) {
            function0.invoke();
        } else {
            iNetworkStandardUIService.showNetworkToast(c19eg, networkStateForSharePanel, "");
        }
    }

    public static InterfaceC1685750ty9 WR(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-1462244543);
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9, C1670400tZO.LIZIZ(interfaceC1680500tpg).J3(), C1669050tXD.LIZIZ(8));
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x043f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x040b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(X.InterfaceC1680500tpg r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment.MR(X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment.OR(X.0tpg, int):void");
    }

    public final void PR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean zLJFF;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        AdPersonalitySettings adPersonalitySettingsLIZIZ;
        Integer num;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1044750546);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 8;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(C1675980tiO.LIZIZ(c1685760tyA, ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).W3).getValue()).LIZ, C1669050tXD.LIZLLL(f, f, 0.0f, 0.0f, 12)), 12, 0.0f, 2);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    int i4 = i2 & 14;
                    UR(c13zcLJIIJ, i4);
                    OR(c13zcLJIIJ, i4);
                    c13zcLJIIJ.LJJIIJZLJL(1775977178);
                    C0TOM.LIZ.getClass();
                    AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
                    if (adPersonalitySettingsLIZIZ2 != null) {
                        zLJFF = Intrinsics.LJFF(adPersonalitySettingsLIZIZ2.showInterestLabel, Boolean.FALSE);
                    } else {
                        zLJFF = false;
                    }
                    if (!zLJFF && ((adPersonalitySettingsLIZIZ = C0TOM.LIZIZ()) == null || (num = adPersonalitySettingsLIZIZ.showInterestItemType) == null || num.intValue() != 0)) {
                        RR(c13zcLJIIJ, i4);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJIIJZLJL(1775980264);
                    Aweme aweme = this.LL;
                    if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAboutThisAd() != null && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || (aboutThisAd = awemeRawAd2.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 0)) {
                        MR(c13zcLJIIJ, i4);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    SR(c13zcLJIIJ, i4);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(X.InterfaceC1680500tpg r21, int r22) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment.RR(X.0tpg, int):void");
    }

    public final void SR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1804850956);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9WR = WR(C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 0.0f, 0.0f, 25, 7), c13zcLJIIJ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9WR);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                NR(C0MBB.LIZIZ(R.string.t_b, c13zcLJIIJ), C1669660tYC.LJJIFFI, 4, this.LLILZ, C1669660tYC.LJJLIIIJILLIZJL, false, c13zcLJIIJ, ((i2 << 18) & 3670016) | 384, 32);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS177S0101000_12(this, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(X.InterfaceC1680500tpg r31, int r32) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment.UR(X.0tpg, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final AwemeRawAd awemeRawAd;
        Object first;
        String geoId;
        String countryCode;
        super.onViewCreated(view, bundle);
        C19EG c19eg = this.LLILZIL;
        if (c19eg == null) {
            return;
        }
        final AboutThisAdVM aboutThisAdVMLIZ = C746400TPq.LIZ(c19eg);
        Aweme aweme = this.LL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            aboutThisAdVMLIZ.getClass();
            if (!C312690CNn.LIZIZ(C312690CNn.LIZ) && awemeRawAd.getAboutThisAd() != null) {
                String strVQ2 = AboutThisAdVM.vQ2(awemeRawAd);
                Pair pair = (Pair) aboutThisAdVMLIZ.LLILLJJLI.getValue();
                String audienceTags = null;
                if (pair != null) {
                    first = pair.getFirst();
                } else {
                    first = null;
                }
                if (!Intrinsics.LJFF(strVQ2, first)) {
                    aboutThisAdVMLIZ.LLILLJJLI.setValue(null);
                    ICommercializeComplianceApi iCommercializeComplianceApi = aboutThisAdVMLIZ.LL;
                    AboutAdInfo aboutThisAd = awemeRawAd.getAboutThisAd();
                    if (aboutThisAd != null) {
                        geoId = aboutThisAd.getGeoId();
                    } else {
                        geoId = null;
                    }
                    AboutAdInfo aboutThisAd2 = awemeRawAd.getAboutThisAd();
                    if (aboutThisAd2 != null) {
                        countryCode = aboutThisAd2.getCountryCode();
                    } else {
                        countryCode = null;
                    }
                    AboutAdInfo aboutThisAd3 = awemeRawAd.getAboutThisAd();
                    if (aboutThisAd3 != null) {
                        audienceTags = aboutThisAd3.getAudienceTags();
                    }
                    iCommercializeComplianceApi.getATAInfo(geoId, countryCode, audienceTags, awemeRawAd.getAdvId()).enqueue(new InterfaceC594300NSq<InfoModel>() { // from class: X.0TOl
                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<InfoModel> c0x9s, Throwable th) {
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<InfoModel> c0x9s, C0X52<InfoModel> c0x52) {
                            if (c0x52.LIZJ()) {
                                aboutThisAdVMLIZ.LLILLJJLI.setValue(new Pair(AboutThisAdVM.vQ2(awemeRawAd), c0x52.LIZIZ));
                            }
                        }
                    });
                }
            }
            this.LLILZLL = System.currentTimeMillis();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(784902644, new AwS639S0100000_25(this, 12), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(java.lang.String r47, X.C1668880tWw r48, int r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, X.C1668880tWw r51, boolean r52, X.InterfaceC1680500tpg r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment.NR(java.lang.String, X.0tWw, int, kotlin.jvm.functions.Function0, X.0tWw, boolean, X.0tpg, int, int):void");
    }
}
