package kotlin.jvm.internal;

import X.C09AY;
import X.C1260120ite;
import X.C12MX;
import X.C13LE;
import X.C13LP;
import X.C1402840mbq;
import X.C1498600p6I;
import X.C1B4F;
import X.C1B4X;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2213541BkG;
import X.C2213641BkQ;
import X.C2239781ClU;
import X.C2239791ClV;
import X.C2239861Clc;
import X.C2239891Clf;
import X.C2344009Gk;
import X.EnumC1850560yFy;
import X.EnumC1910390zoT;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.share.linkshare.LinkShareViewModel;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public class AwS469S0200000_34 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(C1B4X c1b4x, OpenLinkShareMainActivity openLinkShareMainActivity, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1b4x;
        this.l1 = openLinkShareMainActivity;
    }

    public static final Object invoke$0(AwS469S0200000_34 awS469S0200000_34, Object obj, Object obj2) {
        BPEAHandler bPEAHandler = C1498600p6I.LIZ;
        C1498600p6I.LIZIZ(new ARunnableS67S0300000_34((C2239781ClU) awS469S0200000_34.l0, (C2239791ClV) awS469S0200000_34.l1, (File) obj, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS469S0200000_34 awS469S0200000_34, Object obj, Object obj2) {
        BPEAHandler bPEAHandler = C1498600p6I.LIZ;
        C1498600p6I.LIZIZ(new ARunnableS67S0300000_34((C2239861Clc) awS469S0200000_34.l0, (C2239891Clf) awS469S0200000_34.l1, (File) obj, 8));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS469S0200000_34 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS469S0200000_34.invoke$2(kotlin.jvm.internal.AwS469S0200000_34, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS469S0200000_34 awS469S0200000_34, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        ((Number) obj2).intValue();
        TTMInput tTMInput = new TTMInput();
        tTMInput.ttmContext = ((C2213541BkG) awS469S0200000_34.l0).LJIIJJI;
        tTMInput.machineCodeAddress = jLongValue;
        tTMInput.paramData = (TTMParamData) awS469S0200000_34.l1;
        tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
        TTMOutput tTMOutputRunTTMRuleWithBinData = TTMStrategyCenter.getInstance().runTTMRuleWithBinData(tTMInput);
        if (tTMOutputRunTTMRuleWithBinData.getType() != TTMOutput.ReturnType.ERROR) {
            return new C2213641BkQ(EnumC1910390zoT.CelResult, tTMOutputRunTTMRuleWithBinData.getData(), (C2213541BkG) awS469S0200000_34.l0, (Exception) null, new Object[]{(TTMParamData) awS469S0200000_34.l1}, 32);
        }
        EnumC1910390zoT enumC1910390zoT = EnumC1910390zoT.RunError;
        Object data = tTMOutputRunTTMRuleWithBinData.getData();
        C2213541BkG c2213541BkG = (C2213541BkG) awS469S0200000_34.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error  ");
        sbLIZ.append(tTMOutputRunTTMRuleWithBinData);
        return new C2213641BkQ(enumC1910390zoT, data, c2213541BkG, new Exception(C2188811AlT.LIZIZ(sbLIZ)), new Object[]{(TTMParamData) awS469S0200000_34.l1}, 32);
    }

    public static final Object invoke$4(AwS469S0200000_34 awS469S0200000_34, Object obj, Object obj2) {
        List list = (List) obj;
        if (list.contains(EnumC1850560yFy.PHOTO)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getShareDestinations linkShareDestinations ");
            sbLIZ.append(list);
            C2188811AlT.LIZIZ(sbLIZ);
            final C1B4X c1b4x = (C1B4X) awS469S0200000_34.l0;
            c1b4x.LIZ(true);
            C1260120ite.LIZIZ(new ARunnableS131S0100000_31(c1b4x, 207));
            C1402840mbq c1402840mbq = c1b4x.LIZJ;
            LinkShareIntentModel linkShareIntentModel = c1b4x.LIZIZ;
            c1402840mbq.attributionLinkStoryAnchorStruct = new AttributionLinkStoryAnchorStruct(linkShareIntentModel.title, linkShareIntentModel.link, linkShareIntentModel.textInShareContent);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(String.valueOf(C13LE.LIZ(C1B4X.class).LJI()), new SimpleServiceLoadCallback() { // from class: X.1B4r
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    IUIService iUIServiceUiService = asyncAVService.uiService();
                    Activity activity = c1b4x.LIZ;
                    CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
                    C1B4X c1b4x2 = c1b4x;
                    creationComposerDsl.basic(new AwS613S0100000_34(c1b4x2, 160));
                    creationComposerDsl.externalShareStory(new AwS613S0100000_34(c1b4x2, 161));
                    creationComposerDsl.callback(new AwS613S0100000_34(c1b4x2, 162));
                    creationComposerDsl.setMusic(null);
                    EnumC567790MOr enumC567790MOr = EnumC567790MOr.PHOTO;
                    C1402840mbq c1402840mbq2 = c1b4x2.LIZJ;
                    float scale = c1b4x2.LIZIZ.coverImageSize.getScale();
                    LinkShareIntentModel linkShareIntentModel2 = c1b4x2.LIZIZ;
                    creationComposerDsl.setLinkShare(new LinkShareData(enumC567790MOr, c1402840mbq2, scale, linkShareIntentModel2.backgroundImagePath, linkShareIntentModel2.backgroundColor));
                    iUIServiceUiService.startCreation(activity, creationComposerDsl);
                }
            });
        } else {
            int i2 = C2187451AjH.LIZ;
            OpenLinkShareMainActivity openLinkShareMainActivity = (OpenLinkShareMainActivity) awS469S0200000_34.l1;
            C1B4F c1b4f = C1B4F.LJII;
            openLinkShareMainActivity.getClass();
            openLinkShareMainActivity.LLLLZI(c1b4f);
            ((OpenLinkShareMainActivity) awS469S0200000_34.l1).finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS469S0200000_34 awS469S0200000_34, Object obj, Object obj2) {
        String topColorHex;
        List<? extends EnumC1850560yFy> list = (List) obj;
        if (!list.isEmpty()) {
            String str = (String) C13LP.LJJJLL(((LinkShareIntentModel) awS469S0200000_34.l0).mediaUriPaths);
            if (str != null) {
                LinkShareViewModel linkShareViewModel = (LinkShareViewModel) awS469S0200000_34.l1;
                LinkShareIntentModel linkShareIntentModel = (LinkShareIntentModel) awS469S0200000_34.l0;
                MutableLiveData<C12MX> mutableLiveData = linkShareViewModel.LLILLJJLI;
                String str2 = linkShareIntentModel.backgroundImagePath;
                LinkShareData.BackgroundColor backgroundColor = linkShareIntentModel.backgroundColor;
                String bottomColorHex = null;
                if (backgroundColor != null) {
                    topColorHex = backgroundColor.getTopColorHex();
                } else {
                    topColorHex = null;
                }
                LinkShareData.BackgroundColor backgroundColor2 = linkShareIntentModel.backgroundColor;
                if (backgroundColor2 != null) {
                    bottomColorHex = backgroundColor2.getBottomColorHex();
                }
                mutableLiveData.postValue(new C12MX(list, str, str, str2, topColorHex, bottomColorHex, linkShareIntentModel.creativeInfo, 128));
                linkShareViewModel.LL = list;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("launch_method", "link_share");
                String str3 = linkShareIntentModel.clientKey;
                if (str3 == null) {
                    str3 = "";
                }
                c2344009Gk.LJFF("channel", str3);
                c2344009Gk.LJFF("sharing_channels", C13LP.LJJLIIIJ(linkShareViewModel.LL, ",", null, null, 0, null, AFwS269S0000000_27.get$arr$(487), 30));
                C20684815ws.LJIILLIIL("tiktok_link_share_page_show", c2344009Gk.LIZ);
            }
        } else {
            ((LinkShareViewModel) awS469S0200000_34.l1).LLIZ.postValue(C1B4F.LJII);
        }
        if (obj2 != null) {
            ((LinkShareViewModel) awS469S0200000_34.l1).LLILZ.postValue(Unit.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(C2213541BkG c2213541BkG, TTMParamData tTMParamData, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2213541BkG;
        this.l1 = tTMParamData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(C2239781ClU c2239781ClU, C2239791ClV c2239791ClV, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2239781ClU;
        this.l1 = c2239791ClV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(C2239861Clc c2239861Clc, C2239891Clf c2239891Clf, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2239861Clc;
        this.l1 = c2239891Clf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(OpenLinkShareMainActivity openLinkShareMainActivity, LinkShareIntentModel linkShareIntentModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = openLinkShareMainActivity;
        this.l1 = linkShareIntentModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS469S0200000_34(LinkShareIntentModel linkShareIntentModel, LinkShareViewModel linkShareViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = linkShareIntentModel;
        this.l1 = linkShareViewModel;
    }
}
