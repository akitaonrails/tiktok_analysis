package kotlin.jvm.internal;

import X.C09AY;
import X.C0S7U;
import X.C1009740cNo;
import X.C118400cg;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C719880SLq;
import X.InterfaceC1603360rpG;
import X.InterfaceC469401sC;
import X.InterfaceC691660RBc;
import X.InterfaceC712570RxH;
import X.InterfaceC719500SKe;
import X.ViewOnClickListenerC725830SdZ;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.ui.feed.commerce.VSAMultiPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS137S0201000_11 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S0201000_11 awS137S0201000_11) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS137S0201000_11.l0).hashCode());
        sbLIZ.append(" onPageSelected ");
        sbLIZ.append(awS137S0201000_11.i2);
        sbLIZ.append(" livePhotoHolder ");
        C0S7U c0s7u = (C0S7U) awS137S0201000_11.l1;
        if (c0s7u != null) {
            numValueOf = Integer.valueOf(c0s7u.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS137S0201000_11 awS137S0201000_11) {
        ((InterfaceC691660RBc) awS137S0201000_11.l0).J1(awS137S0201000_11.i2, (Aweme) awS137S0201000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS137S0201000_11 awS137S0201000_11) {
        InterfaceC712570RxH interfaceC712570RxH;
        InterfaceC1603360rpG interfaceC1603360rpGEp = ((StoryImmersiveUserFeedComponent) awS137S0201000_11.l0).Ep();
        if ((interfaceC1603360rpGEp instanceof InterfaceC712570RxH) && (interfaceC712570RxH = (InterfaceC712570RxH) interfaceC1603360rpGEp) != null) {
            interfaceC712570RxH.h21((Aweme) awS137S0201000_11.l1, awS137S0201000_11.i2, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS137S0201000_11 awS137S0201000_11) {
        List<InterfaceC719500SKe> list = ((PostModePhotosComponent) awS137S0201000_11.l0).LLLILZLLLI;
        int i = awS137S0201000_11.i2;
        JSONObject jSONObject = (JSONObject) awS137S0201000_11.l1;
        for (InterfaceC719500SKe interfaceC719500SKe : (ArrayList) list) {
            if (interfaceC719500SKe != null) {
                interfaceC719500SKe.n5(i, jSONObject);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS137S0201000_11 awS137S0201000_11) {
        Aweme aweme;
        List listLIZ;
        InterfaceC469401sC interfaceC469401sCE0;
        Aweme aweme2;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        VideoItemParams videoItemParamsLJJJJIZL = ((C719880SLq) awS137S0201000_11.l0).LJJJJIZL();
        if (videoItemParamsLJJJJIZL != null) {
            aweme = videoItemParamsLJJJJIZL.getAweme();
        } else {
            aweme = null;
        }
        int iLJI = C1009740cNo.LJI(aweme);
        VSAMultiPhotoViewHolder vSAMultiPhotoViewHolder = (VSAMultiPhotoViewHolder) ((PhotosViewHolderV3) awS137S0201000_11.l1);
        int i = awS137S0201000_11.i2;
        List listLIZ2 = C118400cg.LIZ(i * iLJI, (i + 1) * iLJI, ((C719880SLq) awS137S0201000_11.l0).LLJILLL);
        VideoItemParams videoItemParamsLJJJJIZL2 = ((C719880SLq) awS137S0201000_11.l0).LJJJJIZL();
        if (videoItemParamsLJJJJIZL2 != null && (aweme2 = videoItemParamsLJJJJIZL2.getAweme()) != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
            int i2 = awS137S0201000_11.i2;
            listLIZ = C118400cg.LIZ(i2 * iLJI, (i2 + 1) * iLJI, productList);
        } else {
            listLIZ = null;
        }
        vSAMultiPhotoViewHolder.LJJIJLIJ();
        final ArrayList arrayList = new ArrayList();
        if (listLIZ2 != null) {
            int i3 = 0;
            for (Object obj : listLIZ2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) obj;
                    ViewOnClickListenerC725830SdZ viewOnClickListenerC725830SdZ = (ViewOnClickListenerC725830SdZ) VSAMultiPhotoViewHolder.LJJIL(i3, (ArrayList) vSAMultiPhotoViewHolder.LLJJLIIIJLLLLLLLZ.getValue());
                    if (viewOnClickListenerC725830SdZ != null && (interfaceC469401sCE0 = viewOnClickListenerC725830SdZ.e0(i, (i * 4) + i3, photoModeImageUrlModel, (PhotoCarouselProductStruct) VSAMultiPhotoViewHolder.LJJIL(i3, listLIZ))) != null) {
                        arrayList.add(interfaceC469401sCE0);
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return new InterfaceC469401sC() { // from class: X.0SMM
            @Override // X.InterfaceC469401sC
            public final void cancel() {
                Iterator<InterfaceC469401sC> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().cancel();
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0201000_11(InterfaceC691660RBc interfaceC691660RBc, int i, Aweme aweme, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC691660RBc;
        this.i2 = i;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0201000_11(C719880SLq c719880SLq, PhotosViewHolderV3 photosViewHolderV3, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c719880SLq;
        this.l1 = photosViewHolderV3;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0201000_11(PhotoFeedLivePhotoComponent photoFeedLivePhotoComponent, int i, C0S7U c0s7u, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = photoFeedLivePhotoComponent;
        this.i2 = i;
        this.l1 = c0s7u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0201000_11(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent, int i, Aweme aweme, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = storyImmersiveUserFeedComponent;
        this.i2 = i;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0201000_11(PostModePhotosComponent postModePhotosComponent, int i, JSONObject jSONObject, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = postModePhotosComponent;
        this.i2 = i;
        this.l1 = jSONObject;
    }
}
