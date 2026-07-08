package detailpage.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0I0B;
import X.C13LE;
import X.C1856290yPD;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
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
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class DetailMediaGridSharedCollectionsPageCell extends AssemPowerCell<DetailMediaGridSharedCollectionsPageCellAssem, C1856290yPD> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailMediaGridSharedCollectionsPageCell.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailMediaGridSharedCollectionsPageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3815);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(296);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3826), awS577S0100000_33, AFwS224S0000000_33.get$arr$(538), new AwS577S0100000_33((C03K6) this, 3801), new AwS577S0100000_33((C03K6) this, 3803), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3805), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3807), null, new AwS577S0100000_33((C03K6) this, 3808));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3802);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3804);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3806);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 148));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3809);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3810);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3811);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3812);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3813);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3814), awS577S0100000_33, AFwS224S0000000_33.get$arr$(536), new AwS577S0100000_33((C03K6) this, 3816), new AwS577S0100000_33((C03K6) this, 3817), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3818), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3819), null, new AwS577S0100000_33((C03K6) this, 3820));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3821), awS577S0100000_33, AFwS224S0000000_33.get$arr$(537), new AwS577S0100000_33((C03K6) this, 3822), new AwS577S0100000_33((C03K6) this, 3823), new AwS577S0100000_33((C03K6) this, 3824), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3825));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new DetailMediaGridSharedCollectionsPageCellAssem();
    }

    public final MediaGridViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (MediaGridViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMediaGridAnalytics.class, false, false, false, 14, null);
        if (iIMMediaGridAnalytics != null) {
            EnumC1381770m3r enumC1381770m3r = R5().FQ2() ? EnumC1381770m3r.GROUP : EnumC1381770m3r.PRIVATE;
            String strXQ2 = R5().xQ2();
            IMUser iMUserCQ2 = R5().CQ2();
            iIMMediaGridAnalytics.LIZ("ttsocial_chat_setting_media_module_exit", iIMMediaGridAnalytics.LIZJ(strXQ2, iMUserCQ2 != null ? iMUserCQ2.getUid() : null, enumC1381770m3r, EnumC1381750m3p.SHARED_COLLECTION, null), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        EnumC1381770m3r enumC1381770m3r;
        IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMediaGridAnalytics.class, false, false, false, 14, null);
        if (iIMMediaGridAnalytics != null) {
            if (R5().FQ2()) {
                enumC1381770m3r = EnumC1381770m3r.GROUP;
            } else {
                enumC1381770m3r = EnumC1381770m3r.PRIVATE;
            }
            iIMMediaGridAnalytics.LIZ("ttsocial_chat_collection_enter", iIMMediaGridAnalytics.LJ(enumC1381770m3r, R5().xQ2()), C0I0B.LJFF.LIZIZ());
        }
    }
}
