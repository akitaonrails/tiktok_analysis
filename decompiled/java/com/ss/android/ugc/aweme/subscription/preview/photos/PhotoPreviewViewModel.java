package com.ss.android.ugc.aweme.subscription.preview.photos;

import X.AbstractC1675430thV;
import X.AbstractC1868100yiG;
import X.AbstractC19484711Kz;
import X.C01GW;
import X.C0LAB;
import X.C10AO;
import X.C10C1;
import X.C11NJ;
import X.C11S5;
import X.C1413370msp;
import X.C1447940nma;
import X.C15438062q;
import X.C1675380thQ;
import X.C1701940uOG;
import X.C1868080yiE;
import X.C1868090yiF;
import X.C19206510Bz;
import X.C1BNE;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C452501pT;
import X.InterfaceC1664410tPj;
import Y.AfS117S0300000_28;
import Y.AfS197S0100000_28;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.network.models.ImagePost;
import com.ss.android.ugc.aweme.subscription.network.models.ImageStruct;
import com.ss.android.ugc.aweme.subscription.network.models.SubsInfo;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionPhotoPreviewSettingsRequest;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionPhotoPreviewSettingsResponse;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import com.ss.android.ugc.aweme.subscription.utils.SingleLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoPreviewViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final SingleLiveData<AbstractC1675430thV> LLILLL;
    public final SingleLiveData<AbstractC1675430thV> LLILZ;
    public final C11NJ LLILZIL;
    public final C01GW LLILZLL;

    public PhotoPreviewViewModel() {
        this(0);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILZIL.LJ();
        super.onCleared();
    }

    public PhotoPreviewViewModel(int i) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1675380thQ(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        SingleLiveData<AbstractC1675430thV> singleLiveData = new SingleLiveData<>();
        this.LLILLL = singleLiveData;
        this.LLILZ = singleLiveData;
        this.LLILZIL = new C11NJ();
        this.LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(670));
    }

    public final void vQ2(String str) {
        Pair pair;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        AbstractC1868100yiG abstractC1868100yiG = ((C1675380thQ) this.LLILLJJLI.getValue()).LIZ;
        int size = 0;
        if (abstractC1868100yiG instanceof C1868080yiE) {
            C1868080yiE c1868080yiE = (C1868080yiE) abstractC1868100yiG;
            VideoPublishEditModel videoPublishEditModel = c1868080yiE.LIZ;
            if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            }
            pair = new Pair(Integer.valueOf(size), Integer.valueOf(C1447940nma.LIZJ(c1868080yiE.LIZ)));
        } else if (abstractC1868100yiG instanceof C1868090yiF) {
            C1868090yiF c1868090yiF = (C1868090yiF) abstractC1868100yiG;
            pair = new Pair(Integer.valueOf(C1447940nma.LIZ(c1868090yiF.LIZ)), Integer.valueOf(C1447940nma.LIZIZ(c1868090yiF.LIZ)));
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C19206510Bz c19206510Bz = C19206510Bz.LIZ;
        boolean z = C1413370msp.LIZ.getBoolean("IS_PHOTO_PREVIEW_ON", true);
        c19206510Bz.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(z ? 1 : 0, "if_preview_on");
        c0lab.LIZ(iIntValue, "total_photo_cnt");
        c0lab.LIZ(iIntValue2, "preview_photo_cnt");
        c0lab.LJ("click_type", str);
        C20684815ws.LJIILLIIL("click_subonly_photo_preview_setting_popup", c0lab.LIZ);
    }

    public static String wQ2(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void xQ2(C10C1 c10c1, InterfaceC1664410tPj<String> interfaceC1664410tPj) {
        C10AO c10aoLIZIZ;
        PhotoModeImageUrlModel imagePostCover;
        long jLongValue;
        String authorUid;
        Long lLJIILIIL;
        String aid;
        Long lLJIILIIL2;
        String str;
        UrlModel urlModel;
        String uri;
        boolean zLJFF;
        String uri2;
        PhotoModeImageInfo photoModeImageInfo;
        SubscriptionPreviewService subscriptionPreviewService = (SubscriptionPreviewService) this.LLILZLL.getValue();
        if (subscriptionPreviewService != null && (c10aoLIZIZ = subscriptionPreviewService.LIZIZ()) != null) {
            Boolean boolValueOf = Boolean.valueOf(c10c1.LIZ);
            List<PhotoModeImageUrlModel> list = c10c1.LIZIZ;
            Aweme aweme = c10c1.LIZJ;
            ImagePost imagePost = null;
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
                imagePostCover = photoModeImageInfo.getImagePostCover();
            } else {
                imagePostCover = null;
            }
            boolean z = c10c1.LIZ;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<PhotoModeImageUrlModel> it2 = list.iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    PhotoModeImageUrlModel next = it2.next();
                    UrlModel urlModel2 = next.dynamicImage;
                    if (urlModel2 != null && (uri2 = urlModel2.getUri()) != null) {
                        str = uri2;
                    }
                    SubscriptionInfo subscriptionInfo = next.subscriptionInfo;
                    if (subscriptionInfo != null) {
                        zLJFF = Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.TRUE);
                    } else {
                        zLJFF = false;
                    }
                    arrayList.add(new ImageStruct(str, new SubsInfo(Boolean.valueOf(zLJFF))));
                }
                if (imagePostCover != null && (urlModel = imagePostCover.dynamicImage) != null && (uri = urlModel.getUri()) != null) {
                    str = uri;
                }
                imagePost = new ImagePost(arrayList, new ImageStruct(str, new SubsInfo(Boolean.valueOf(z))));
            }
            Aweme aweme2 = c10c1.LIZJ;
            long jLongValue2 = 0;
            if (aweme2 != null && (aid = aweme2.getAid()) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(aid)) != null) {
                jLongValue = lLJIILIIL2.longValue();
            } else {
                jLongValue = 0;
            }
            Long lValueOf = Long.valueOf(jLongValue);
            Aweme aweme3 = c10c1.LIZJ;
            if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(authorUid)) != null) {
                jLongValue2 = lLJIILIIL.longValue();
            }
            AbstractC19484711Kz<SubscriptionPhotoPreviewSettingsResponse> abstractC19484711KzLIZ = c10aoLIZIZ.LIZ(new SubscriptionPhotoPreviewSettingsRequest(boolValueOf, imagePost, lValueOf, Long.valueOf(jLongValue2)));
            if (abstractC19484711KzLIZ != null) {
                this.LLILZIL.LIZ(abstractC19484711KzLIZ.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS117S0300000_28(this, c10c1, interfaceC1664410tPj, 3), new AfS197S0100000_28(this, 24)));
            }
        }
    }
}
