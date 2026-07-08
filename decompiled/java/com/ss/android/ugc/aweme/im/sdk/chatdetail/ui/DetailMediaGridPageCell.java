package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui;

import X.AbstractC345490DgZ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0I0B;
import X.C0ZW7;
import X.C1271204yE;
import X.C13LE;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.EnumC1242510iRF;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
import X.EnumC904370Zdr;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class DetailMediaGridPageCell extends AssemPowerCell<DetailMediaGridPageCellAssem, C1271204yE> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailMediaGridPageCell.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailMediaGridPageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2435);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(178);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2446), awS577S0100000_33, AFwS224S0000000_33.get$arr$(342), new AwS577S0100000_33((C03K6) this, 2421), new AwS577S0100000_33((C03K6) this, 2423), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2425), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2427), null, new AwS577S0100000_33((C03K6) this, 2428));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2422);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2424);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2426);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 93));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2429);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2430);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2431);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2432);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2433);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2434), awS577S0100000_33, AFwS224S0000000_33.get$arr$(344), new AwS577S0100000_33((C03K6) this, 2436), new AwS577S0100000_33((C03K6) this, 2437), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2438), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2439), null, new AwS577S0100000_33((C03K6) this, 2440));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2441), awS577S0100000_33, AFwS224S0000000_33.get$arr$(345), new AwS577S0100000_33((C03K6) this, 2442), new AwS577S0100000_33((C03K6) this, 2443), new AwS577S0100000_33((C03K6) this, 2444), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2445));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(343));
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new DetailMediaGridPageCellAssem();
    }

    public final MediaGridViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (MediaGridViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        EnumC904370Zdr enumC904370Zdr;
        C1271204yE c1271204yE = (C1271204yE) getItem();
        if (c1271204yE == null || (enumC904370Zdr = c1271204yE.LL) == null) {
            return;
        }
        EnumC1381750m3p enumC1381750m3p = enumC904370Zdr == EnumC904370Zdr.SHARED_VIDEOS ? EnumC1381750m3p.SHARED_VIDEO : EnumC1381750m3p.PRIVATE_MEDIA;
        IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridAnalytics.class);
        if (iIMMediaGridAnalytics != null) {
            EnumC1381770m3r enumC1381770m3r = R5().FQ2() ? EnumC1381770m3r.GROUP : EnumC1381770m3r.PRIVATE;
            EnumC1242510iRF enumC1242510iRF = R5().DQ2(enumC904370Zdr) ? EnumC1242510iRF.EMPTY : EnumC1242510iRF.NOT_EMPTY;
            String strXQ2 = R5().xQ2();
            IMUser iMUserCQ2 = R5().CQ2();
            iIMMediaGridAnalytics.LIZ("ttsocial_chat_setting_media_module_exit", iIMMediaGridAnalytics.LIZJ(strXQ2, iMUserCQ2 != null ? iMUserCQ2.getUid() : null, enumC1381770m3r, enumC1381750m3p, enumC1242510iRF), C0I0B.LJFF.LIZIZ());
        }
        String strXQ22 = R5().xQ2();
        if (strXQ22 == null) {
            return;
        }
        List<AbstractC345490DgZ> listZQ2 = R5().zQ2(enumC904370Zdr);
        int i = 0;
        if (!(listZQ2 instanceof Collection) || !listZQ2.isEmpty()) {
            Iterator<AbstractC345490DgZ> it2 = listZQ2.iterator();
            while (it2.hasNext()) {
                if ((it2.next() instanceof C0ZW7) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) this.LLIZLLLIL.getValue();
        if (iIMMediaGridPerformanceAnalytics != null) {
            boolean zFQ2 = R5().FQ2();
            MediaGridViewModel mediaGridViewModelR5 = R5();
            iIMMediaGridPerformanceAnalytics.LJ(strXQ22, enumC904370Zdr, zFQ2, i, !mediaGridViewModelR5.BQ2().LIZIZ(mediaGridViewModelR5.xQ2(), enumC904370Zdr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        EnumC904370Zdr enumC904370Zdr;
        String strXQ2;
        IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics;
        C1271204yE c1271204yE = (C1271204yE) getItem();
        if (c1271204yE != null && (enumC904370Zdr = c1271204yE.LL) != null && (strXQ2 = R5().xQ2()) != null && (iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) this.LLIZLLLIL.getValue()) != null) {
            iIMMediaGridPerformanceAnalytics.LJII(strXQ2, enumC904370Zdr);
        }
    }
}
