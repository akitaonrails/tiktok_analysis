package com.ss.android.ugc.aweme.business.common.protocol;

import X.AbstractC738140SxQ;
import X.C13LQ;
import X.C1564480qoY;
import X.C1564490qoZ;
import X.C1564500qoa;
import X.C1564510qob;
import X.C1564540qoe;
import X.C1564550qof;
import X.C1564560qog;
import X.C2097908Jt;
import X.C281310B0v;
import X.C305290Bxv;
import X.C619430ORh;
import X.C723850SaN;
import X.InterfaceC1564580qoi;
import X.InterfaceC1566920qsU;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAutoExpandStrategyV2Exp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.protocol.IFollowingFeedSkylightProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingFeedSkylightProtocol implements IFollowingFeedSkylightProtocol {
    @Override // com.ss.android.ugc.aweme.protocol.SkylightProtocol
    public final void PA0(AbstractC738140SxQ abstractC738140SxQ) {
        InterfaceC1566920qsU interfaceC1566920qsU;
        C1564480qoY.LIZJ("homepage_follow");
        C1564480qoY.LIZIZ("homepage_follow");
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", "homepage_follow"));
        C1564510qob c1564510qob = new C1564510qob();
        C1564500qoa c1564500qoa = c1564510qob.LIZ;
        c1564500qoa.LJFF = 2;
        c1564500qoa.LIZLLL = false;
        Integer numValueOf = Integer.valueOf(R.attr.ze);
        C1564500qoa c1564500qoa2 = c1564510qob.LIZ;
        c1564500qoa2.LIZ = numValueOf;
        c1564500qoa2.LJ = C13LQ.LJJLL(new InterfaceC1564580qoi[]{new C1564560qog(), new InterfaceC1564580qoi() { // from class: X.0qod
        }, new C1564540qoe(), new C1564550qof()});
        if (FollowingSkylightAbilityOptConfig.LIZ()) {
            interfaceC1566920qsU = new InterfaceC1566920qsU() { // from class: X.0rbo
                @Override // X.InterfaceC1566920qsU
                public final void LIZ(AbstractC738140SxQ abstractC738140SxQ2) {
                    AbstractC738140SxQ abstractC738140SxQ3;
                    InterfaceC1595030rbp interfaceC1595030rbp;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightListViewModel.class);
                    AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1793);
                    AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(666);
                    AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(abstractC738140SxQ2, 1791);
                    C451610HnL c451610HnL = new C451610HnL(abstractC738140SxQ2, true, true);
                    C723700Sa8 c723700Sa8 = new C723700Sa8(abstractC738140SxQ2);
                    C452070Ho5 c452070Ho5 = new C452070Ho5();
                    C1622206Wu c1622206WuLJII = C724750Sbp.LJII(abstractC738140SxQ2);
                    if (abstractC738140SxQ2 instanceof HasDefaultViewModelProviderFactory) {
                        abstractC738140SxQ3 = abstractC738140SxQ2;
                    } else {
                        abstractC738140SxQ3 = null;
                    }
                    FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(abstractC738140SxQ3), aFwS264S0000000_24, awS568S0100000_242, c451610HnL, c723700Sa8).getValue();
                    FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) C724750Sbp.LIZ(abstractC738140SxQ2, C724750Sbp.LJIIJ(abstractC738140SxQ2, C13LE.LIZ(FeedSkylightContainerViewModel.class)), C01D1.LIZ, C1637806bA.LIZ, new AwS568S0100000_24(this, 1792), AFwS264S0000000_24.get$arr$(665), null, true).getValue();
                    InterfaceC1595130rbz interfaceC1595130rbzFQ2 = feedSkylightListViewModel.FQ2();
                    if ((interfaceC1595130rbzFQ2 instanceof InterfaceC1595030rbp) && (interfaceC1595030rbp = (InterfaceC1595030rbp) interfaceC1595130rbzFQ2) != null) {
                        if (((Number) C259880AGk.LIZ.getValue()).intValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C01GW c01gw = FollowingSkylightAutoExpandStrategyV2Exp.LIZIZ;
                            if (((FollowingSkylightAutoExpandStrategyV2Exp.Config) c01gw.getValue()).enable) {
                                if (feedSkylightContainerViewModel.getState().LLILZLL.LIZ.booleanValue()) {
                                    int i = C2187451AjH.LIZ;
                                    C1720106oR.LJI("FFSAutoUnfoldNewStrategy", "updateSkylightDisplayStatus, host feed is empty, hide bubble");
                                    feedSkylightContainerViewModel.BQ2(false);
                                    return;
                                }
                                if (interfaceC1595030rbp.LJII() > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int iLJ = interfaceC1595030rbp.LJ();
                                long jLJIJJ = C1595060rbs.LIZIZ.LJIJJ();
                                int iIntValue = ((Number) FollowingSkylightAbilityOptConfig.LJFF.getValue()).intValue();
                                if (z3 || (iLJ >= iIntValue && System.currentTimeMillis() - jLJIJJ <= ((FollowingSkylightAutoExpandStrategyV2Exp.Config) c01gw.getValue()).clickThreshold * ((long) LSPassThroughRecordSizeConfig.DEFAULT))) {
                                    feedSkylightContainerViewModel.BQ2(true);
                                    FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", true, false, false, null, 56);
                                    feedSkylightContainerViewModel.zQ2(false, true);
                                    return;
                                } else if (!interfaceC1595030rbp.LJJ().isEmpty()) {
                                    feedSkylightContainerViewModel.BQ2(false);
                                    FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                                    feedSkylightContainerViewModel.zQ2(true, true);
                                    return;
                                } else {
                                    feedSkylightContainerViewModel.BQ2(false);
                                    FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                                    feedSkylightContainerViewModel.zQ2(false, true);
                                    return;
                                }
                            }
                            if (feedSkylightContainerViewModel.getState().LLILZLL.LIZ.booleanValue()) {
                                int i2 = C2187451AjH.LIZ;
                                C1720106oR.LJI("FFSAutoUnfoldNewStrategy", "updateSkylightDisplayStatus, host feed is empty, hide bubble");
                                feedSkylightContainerViewModel.BQ2(false);
                                return;
                            } else if (interfaceC1595030rbp.LJII() > 0) {
                                feedSkylightContainerViewModel.BQ2(true);
                                FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", true, false, false, null, 56);
                                feedSkylightContainerViewModel.zQ2(false, true);
                                return;
                            } else if (!interfaceC1595030rbp.LJJ().isEmpty()) {
                                feedSkylightContainerViewModel.BQ2(false);
                                FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                                feedSkylightContainerViewModel.zQ2(true, true);
                                return;
                            } else {
                                feedSkylightContainerViewModel.BQ2(false);
                                FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                                feedSkylightContainerViewModel.zQ2(false, true);
                                return;
                            }
                        }
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateSkylightDisplayStatus， liveCount: ");
                        sbLIZ.append(interfaceC1595030rbp.LJII());
                        sbLIZ.append(", unreadCount: ");
                        sbLIZ.append(interfaceC1595030rbp.LJ());
                        sbLIZ.append(", userCount: ");
                        sbLIZ.append(interfaceC1595030rbp.LJIIIZ());
                        C1720106oR.LJI("FFSAutoUnfoldNewStrategy", C2188811AlT.LIZIZ(sbLIZ));
                        if (feedSkylightContainerViewModel.getState().LLILZLL.LIZ.booleanValue()) {
                            C1720106oR.LJI("FFSAutoUnfoldNewStrategy", "updateSkylightDisplayStatus, host feed is empty, hide bubble");
                            feedSkylightContainerViewModel.BQ2(false);
                            return;
                        }
                        if (interfaceC1595030rbp.LJII() <= 0 && interfaceC1595030rbp.LJ() <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int iLJIIIZ = interfaceC1595030rbp.LJIIIZ();
                        int iLJIIIIZZ = interfaceC1595030rbp.LJIIIIZZ();
                        int iIntValue2 = ((Number) FollowingSkylightAbilityOptConfig.LJFF.getValue()).intValue();
                        if (z2) {
                            feedSkylightContainerViewModel.BQ2(true);
                            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", true, false, false, null, 56);
                            feedSkylightContainerViewModel.zQ2(false, true);
                        } else if (iLJIIIZ >= iIntValue2) {
                            feedSkylightContainerViewModel.BQ2(true);
                            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, true, "auto", true, false, false, null, 56);
                            feedSkylightContainerViewModel.zQ2(false, true);
                        } else if (iLJIIIZ <= 0 && iLJIIIIZZ <= 0) {
                            feedSkylightContainerViewModel.BQ2(false);
                            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                            feedSkylightContainerViewModel.zQ2(false, true);
                        } else {
                            feedSkylightContainerViewModel.BQ2(false);
                            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
                            feedSkylightContainerViewModel.zQ2(true, true);
                        }
                    }
                }
            };
        } else {
            interfaceC1566920qsU = new InterfaceC1566920qsU() { // from class: X.0rLa
                /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
                /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
                @Override // X.InterfaceC1566920qsU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.AbstractC738140SxQ r23) {
                    /*
                        Method dump skipped, instruction units count: 349
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584960rLa.LIZ(X.0SxQ):void");
                }
            };
        }
        c1564510qob.LIZ.LJI = interfaceC1566920qsU;
        c1564510qob.LIZ(new C619430ORh());
        C1564490qoZ c1564490qoZ = new C1564490qoZ(mapLIZJ, c1564510qob.LIZ);
        if (C305290Bxv.LIZIZ() && C281310B0v.LIZ()) {
            C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, c1564490qoZ, 85));
            if (FollowingSkylightAbilityOptConfig.LIZ()) {
                C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, c1564490qoZ, 84));
                return;
            }
            return;
        }
        C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, c1564490qoZ, 89));
        C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, c1564490qoZ, 87));
        if (!FollowingSkylightAbilityOptConfig.LIZ()) {
            return;
        }
        C723850SaN.LIZJ(abstractC738140SxQ, new AwS390S0200000_24(abstractC738140SxQ, c1564490qoZ, 84));
    }
}
